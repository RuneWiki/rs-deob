import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class277 extends class105 {

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "Z")
    private boolean field4089 = false;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
    private int field4090;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field4093;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4088;

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4092;

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "[B")
    private byte[] field4091;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method747(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4089 = true;
                    }
                }
            }
        }
        this.field4088 = new AudioFormat((float) class298.field4331, 16, class263.field3896 ? 2 : 1, true, false);
        this.field4091 = new byte[0x100 << (class263.field3896 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "()I")
    public final int method742() {
        return this.field4090 - (this.field4092.available() >> (class263.field3896 ? 2 : 1));
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "()V")
    public final void method749() {
        int var1 = 256;
        if (class263.field3896) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1410[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4091[var2 * 2] = (byte) (var3 >> 8);
            this.field4091[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4092.write(this.field4091, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "()V")
    public final void method740() throws LineUnavailableException {
        this.field4092.flush();
        if (!this.field4089) {
            return;
        }
        this.field4092.close();
        this.field4092 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field4093 == null ? (field4093 = method1884("javax.sound.sampled.SourceDataLine")) : field4093, this.field4088, this.field4090 << (class263.field3896 ? 2 : 1));
        this.field4092 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4092.open();
        this.field4092.start();
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
    public final void method753(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field4093 == null ? (field4093 = method1884("javax.sound.sampled.SourceDataLine")) : field4093, this.field4088, arg0 << (class263.field3896 ? 2 : 1));
            this.field4092 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4092.open();
            this.field4092.start();
            this.field4090 = arg0;
        } catch (LineUnavailableException var4) {
            if (class13.method203((byte) -100, arg0) == 1) {
                this.field4092 = null;
                throw var4;
            } else {
                this.method753(class289.method1938((byte) 106, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "()V")
    public final void method741() {
        if (this.field4092 != null) {
            this.field4092.close();
            this.field4092 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1884(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
