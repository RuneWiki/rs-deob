import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class220 extends class86 {

    @OriginalMember(owner = "client!on", name = "P", descriptor = "Z")
    private boolean field3159 = false;

    @OriginalMember(owner = "client!on", name = "S", descriptor = "I")
    private int field3162;

    @OriginalMember(owner = "client!on", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field3164;

    @OriginalMember(owner = "client!on", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3161;

    @OriginalMember(owner = "client!on", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3160;

    @OriginalMember(owner = "client!on", name = "T", descriptor = "[B")
    private byte[] field3163;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(I)V")
    public final void method674(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3164 == null ? (field3164 = method1467("javax.sound.sampled.SourceDataLine")) : field3164, this.field3161, arg0 << (class320.field4899 ? 2 : 1));
            this.field3160 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3160.open();
            this.field3160.start();
            this.field3162 = arg0;
        } catch (LineUnavailableException var4) {
            if (class207.method1404((byte) 120, arg0) == 1) {
                this.field3160 = null;
                throw var4;
            } else {
                this.method674(class51.method464(1905326856, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method671(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3159 = true;
                    }
                }
            }
        }
        this.field3161 = new AudioFormat((float) class256.field3725, 16, class320.field4899 ? 2 : 1, true, false);
        this.field3163 = new byte[0x100 << (class320.field4899 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "()V")
    public final void method676() {
        int var1 = 256;
        if (class320.field4899) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1489[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3163[var2 * 2] = (byte) (var3 >> 8);
            this.field3163[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3160.write(this.field3163, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
    public final void method672() {
        if (this.field3160 != null) {
            this.field3160.close();
            this.field3160 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "()V")
    public final void method680() throws LineUnavailableException {
        this.field3160.flush();
        if (!this.field3159) {
            return;
        }
        this.field3160.close();
        this.field3160 = null;
        Info var1 = new Info(field3164 == null ? (field3164 = method1467("javax.sound.sampled.SourceDataLine")) : field3164, this.field3161, this.field3162 << (class320.field4899 ? 2 : 1));
        this.field3160 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3160.open();
        this.field3160.start();
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "()I")
    public final int method677() {
        return this.field3162 - (this.field3160.available() >> (class320.field4899 ? 2 : 1));
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1467(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
