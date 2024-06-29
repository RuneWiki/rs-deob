import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class172 extends class9 {

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "Z")
    private boolean field3005 = false;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    private int field3008;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field3009;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3006;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3007;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "[B")
    private byte[] field3004;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
    public final void method83() {
        if (this.field3007 != null) {
            this.field3007.close();
            this.field3007 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()I")
    public final int method84() {
        return this.field3008 - (this.field3007.available() >> (class283.field4981 ? 2 : 1));
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method91(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3005 = true;
                    }
                }
            }
        }
        this.field3006 = new AudioFormat((float) class204.field3549, 16, class283.field4981 ? 2 : 1, true, false);
        this.field3004 = new byte[0x100 << (class283.field4981 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "()V")
    public final void method90() throws LineUnavailableException {
        this.field3007.flush();
        if (!this.field3005) {
            return;
        }
        this.field3007.close();
        this.field3007 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field3009 == null ? (field3009 = method1192("javax.sound.sampled.SourceDataLine")) : field3009, this.field3006, this.field3008 << (class283.field4981 ? 2 : 1));
        this.field3007 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3007.open();
        this.field3007.start();
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
    public final void method95(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field3009 == null ? (field3009 = method1192("javax.sound.sampled.SourceDataLine")) : field3009, this.field3006, arg0 << (class283.field4981 ? 2 : 1));
            this.field3007 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3007.open();
            this.field3007.start();
            this.field3008 = arg0;
        } catch (LineUnavailableException var4) {
            if (class201.method1380(arg0, (byte) -124) == 1) {
                this.field3007 = null;
                throw var4;
            } else {
                this.method95(class79.method585(arg0, -805756542));
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "()V")
    public final void method97() {
        int var1 = 256;
        if (class283.field4981) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field214[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3004[var2 * 2] = (byte) (var3 >> 8);
            this.field3004[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3007.write(this.field3004, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1192(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
