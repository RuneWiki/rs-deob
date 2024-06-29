import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class162 extends class5 {

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "Z")
    private boolean field2473 = false;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    private int field2475;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field2478;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2474;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2476;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "[B")
    private byte[] field2477;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method72(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2473 = true;
                    }
                }
            }
        }
        this.field2474 = new AudioFormat((float) class234.field3622, 16, class230.field3589 ? 2 : 1, true, false);
        this.field2477 = new byte[0x100 << (class230.field3589 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()V")
    public final void method60() {
        if (this.field2476 != null) {
            this.field2476.close();
            this.field2476 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
    public final void method54() {
        int var1 = 256;
        if (class230.field3589) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field67[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2477[var2 * 2] = (byte) (var3 >> 8);
            this.field2477[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2476.write(this.field2477, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
    public final void method67(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field2478 == null ? (field2478 = method1086("javax.sound.sampled.SourceDataLine")) : field2478, this.field2474, arg0 << (class230.field3589 ? 2 : 1));
            this.field2476 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2476.open();
            this.field2476.start();
            this.field2475 = arg0;
        } catch (LineUnavailableException var4) {
            if (class72.method564(255, arg0) == 1) {
                this.field2476 = null;
                throw var4;
            } else {
                this.method67(class208.method1388((byte) 89, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()V")
    public final void method63() throws LineUnavailableException {
        this.field2476.flush();
        if (!this.field2473) {
            return;
        }
        this.field2476.close();
        this.field2476 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field2478 == null ? (field2478 = method1086("javax.sound.sampled.SourceDataLine")) : field2478, this.field2474, this.field2475 << (class230.field3589 ? 2 : 1));
        this.field2476 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2476.open();
        this.field2476.start();
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()I")
    public final int method69() {
        return this.field2475 - (this.field2476.available() >> (class230.field3589 ? 2 : 1));
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1086(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
