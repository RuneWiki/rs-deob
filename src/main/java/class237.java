import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class237 extends class246 {

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "Z")
    private boolean field4071 = false;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    private int field4069;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field4072;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4067;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4068;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "[B")
    private byte[] field4070;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public final void method1154(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4071 = true;
                    }
                }
            }
        }
        this.field4067 = new AudioFormat((float) class10.field356, 16, class195.field3424 ? 2 : 1, true, false);
        this.field4070 = new byte[0x100 << (class195.field3424 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "()V", line = 48)
    public final void method1153() throws LineUnavailableException {
        this.field4068.flush();
        if (!this.field4071) {
            return;
        }
        this.field4068.close();
        this.field4068 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field4072 == null ? (field4072 = method1621("javax.sound.sampled.SourceDataLine")) : field4072, this.field4067, this.field4069 << (class195.field3424 ? 2 : 1));
        this.field4068 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4068.open();
        this.field4068.start();
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 55)
    public static Class method1621(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()I", line = 67)
    public final int method1152() {
        return this.field4069 - (this.field4068.available() >> (class195.field3424 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V", line = 77)
    public final void method1155(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field4072 == null ? (field4072 = method1621("javax.sound.sampled.SourceDataLine")) : field4072, this.field4067, arg0 << (class195.field3424 ? 2 : 1));
            this.field4068 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4068.open();
            this.field4068.start();
            this.field4069 = arg0;
        } catch (LineUnavailableException var4) {
            if (class228.method1564((byte) -40, arg0) == 1) {
                this.field4068 = null;
                throw var4;
            } else {
                this.method1155(class58.method383((byte) -38, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "()V", line = 101)
    public final void method1150() {
        if (this.field4068 != null) {
            this.field4068.close();
            this.field4068 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()V", line = 117)
    public final void method1156() {
        int var1 = 256;
        if (class195.field3424) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4202[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4070[var2 * 2] = (byte) (var3 >> 8);
            this.field4070[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4068.write(this.field4070, 0, var1 << 1);
    }
}
