import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class239 extends class111 {

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "Z")
    private boolean field4082 = false;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    private int field4079;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field4084;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4080;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4083;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "[B")
    private byte[] field4081;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "()V", line = 10)
    public final void method858() {
        if (this.field4083 != null) {
            this.field4083.close();
            this.field4083 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 27)
    public final void method866(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4082 = true;
                    }
                }
            }
        }
        this.field4080 = new AudioFormat((float) class151.field2393, 16, class75.field1219 ? 2 : 1, true, false);
        this.field4081 = new byte[0x100 << (class75.field1219 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "()I", line = 64)
    public final int method864() {
        return this.field4079 - (this.field4083.available() >> (class75.field1219 ? 2 : 1));
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V", line = 75)
    public final void method862(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field4084 == null ? (field4084 = method1679("javax.sound.sampled.SourceDataLine")) : field4084, this.field4080, arg0 << (class75.field1219 ? 2 : 1));
            this.field4083 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4083.open();
            this.field4083.start();
            this.field4079 = arg0;
        } catch (LineUnavailableException var4) {
            if (class162.method1175(arg0, true) == 1) {
                this.field4083 = null;
                throw var4;
            } else {
                this.method862(class229.method1622(true, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 75)
    public static Class method1679(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()V", line = 96)
    public final void method855() throws LineUnavailableException {
        this.field4083.flush();
        if (!this.field4082) {
            return;
        }
        this.field4083.close();
        this.field4083 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field4084 == null ? (field4084 = method1679("javax.sound.sampled.SourceDataLine")) : field4084, this.field4080, this.field4079 << (class75.field1219 ? 2 : 1));
        this.field4083 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4083.open();
        this.field4083.start();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 121)
    public final void method851() {
        int var1 = 256;
        if (class75.field1219) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1804[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4081[var2 * 2] = (byte) (var3 >> 8);
            this.field4081[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4083.write(this.field4081, 0, var1 << 1);
    }
}
