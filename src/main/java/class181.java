import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class181 extends class50 {

    @OriginalMember(owner = "client!h", name = "O", descriptor = "Z")
    private boolean field3338 = false;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field3343;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3340;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3342;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "[B")
    private byte[] field3339;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()V")
    public final void method496() throws LineUnavailableException {
        this.field3342.flush();
        if (!this.field3338) {
            return;
        }
        this.field3342.close();
        this.field3342 = null;
        Info var1 = new Info(field3343 == null ? (field3343 = method1312("javax.sound.sampled.SourceDataLine")) : field3343, this.field3340, this.field3341 << (class134.field2618 ? 2 : 1));
        this.field3342 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3342.open();
        this.field3342.start();
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    public final void method497(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3343 == null ? (field3343 = method1312("javax.sound.sampled.SourceDataLine")) : field3343, this.field3340, arg0 << (class134.field2618 ? 2 : 1));
            this.field3342 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3342.open();
            this.field3342.start();
            this.field3341 = arg0;
        } catch (LineUnavailableException var4) {
            if (class259.method1797(arg0, (byte) -25) == 1) {
                this.field3342 = null;
                throw var4;
            } else {
                this.method497(class177.method1294(arg0, (byte) -39));
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()I")
    public final int method488() {
        return this.field3341 - (this.field3342.available() >> (class134.field2618 ? 2 : 1));
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method489(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3338 = true;
                    }
                }
            }
        }
        this.field3340 = new AudioFormat((float) class121.field2389, 16, class134.field2618 ? 2 : 1, true, false);
        this.field3339 = new byte[0x100 << (class134.field2618 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()V")
    public final void method492() {
        if (this.field3342 != null) {
            this.field3342.close();
            this.field3342 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()V")
    public final void method491() {
        int var1 = 256;
        if (class134.field2618) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1130[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3339[var2 * 2] = (byte) (var3 >> 8);
            this.field3339[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3342.write(this.field3339, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1312(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
