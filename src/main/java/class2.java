import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class2 extends class395 {

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "Z")
    private boolean field23 = false;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    private int field20;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field25;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field24;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field21;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "[B")
    private byte[] field22;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "()V", line = 14)
    public final void method6() {
        int var1 = 256;
        if (class25.field449) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5749[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field22[var2 * 2] = (byte) (var3 >> 8);
            this.field22[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field21.write(this.field22, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()I", line = 47)
    public final int method7() {
        return this.field20 - (this.field21.available() >> (class25.field449 ? 2 : 1));
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 56)
    public final void method8(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field25 == null ? (field25 = method12("javax.sound.sampled.SourceDataLine")) : field25, this.field24, arg0 << (class25.field449 ? 2 : 1));
            this.field21 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field21.open();
            this.field21.start();
            this.field20 = arg0;
        } catch (LineUnavailableException var4) {
            if (class195.method1295(arg0, 16021) == 1) {
                this.field21 = null;
                throw var4;
            } else {
                this.method8(class41.method299(2, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 56)
    public static Class method12(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "()V", line = 78)
    public final void method9() throws LineUnavailableException {
        this.field21.flush();
        if (!this.field23) {
            return;
        }
        this.field21.close();
        this.field21 = null;
        Info var1 = new Info(field25 == null ? (field25 = method12("javax.sound.sampled.SourceDataLine")) : field25, this.field24, this.field20 << (class25.field449 ? 2 : 1));
        this.field21 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field21.open();
        this.field21.start();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 98)
    public final void method10(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field23 = true;
                    }
                }
            }
        }
        this.field24 = new AudioFormat((float) class388.field5673, 16, class25.field449 ? 2 : 1, true, false);
        this.field22 = new byte[0x100 << (class25.field449 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()V", line = 134)
    public final void method11() {
        if (this.field21 != null) {
            this.field21.close();
            this.field21 = null;
        }
    }
}
