import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class102 extends class122 {

    @OriginalMember(owner = "client!qca", name = "I", descriptor = "Z")
    private boolean field1110 = false;

    @OriginalMember(owner = "client!qca", name = "K", descriptor = "I")
    private int field1111;

    @OriginalMember(owner = "client!qca", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field1114;

    @OriginalMember(owner = "client!qca", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1113;

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1109;

    @OriginalMember(owner = "client!qca", name = "L", descriptor = "[B")
    private byte[] field1112;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)V", line = 13)
    public final void method616(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1114 == null ? (field1114 = method622("javax.sound.sampled.SourceDataLine")) : field1114, this.field1113, arg0 << (class81.field856 ? 2 : 1));
            this.field1109 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1109.open();
            this.field1109.start();
            this.field1111 = arg0;
        } catch (LineUnavailableException var4) {
            if (class677.method3781(5953, arg0) == 1) {
                this.field1109 = null;
                throw var4;
            } else {
                this.method616(class146.method799(arg0, -122));
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 13)
    public static Class method622(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "()I", line = 35)
    public final int method617() {
        return this.field1111 - (this.field1109.available() >> (class81.field856 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "()V", line = 50)
    public final void method618() {
        int var1 = 256;
        if (class81.field856) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1388[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1112[var2 * 2] = (byte) (var3 >> 8);
            this.field1112[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1109.write(this.field1112, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "()V", line = 83)
    public final void method619() throws LineUnavailableException {
        this.field1109.flush();
        if (!this.field1110) {
            return;
        }
        this.field1109.close();
        this.field1109 = null;
        Info var1 = new Info(field1114 == null ? (field1114 = method622("javax.sound.sampled.SourceDataLine")) : field1114, this.field1113, this.field1111 << (class81.field856 ? 2 : 1));
        this.field1109 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1109.open();
        this.field1109.start();
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 103)
    public final void method620(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1110 = true;
                    }
                }
            }
        }
        this.field1113 = new AudioFormat((float) class519.field7413, 16, class81.field856 ? 2 : 1, true, false);
        this.field1112 = new byte[0x100 << (class81.field856 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "()V", line = 140)
    public final void method621() {
        if (this.field1109 != null) {
            this.field1109.close();
            this.field1109 = null;
        }
    }
}
