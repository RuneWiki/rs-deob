import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class112 extends class41 {

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "Z")
    private boolean field1802 = false;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    private int field1804;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field1806;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1805;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1801;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "[B")
    private byte[] field1803;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V", line = 13)
    public final void method372(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1806 == null ? (field1806 = method939("javax.sound.sampled.SourceDataLine")) : field1806, this.field1805, arg0 << (class390.field5446 ? 2 : 1));
            this.field1801 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1801.open();
            this.field1801.start();
            this.field1804 = arg0;
        } catch (LineUnavailableException var4) {
            if (class654.method3691(858993459, arg0) == 1) {
                this.field1801 = null;
                throw var4;
            } else {
                this.method372(class613.method3530(false, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 13)
    public static Class method939(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()V", line = 34)
    public final void method364() {
        if (this.field1801 != null) {
            this.field1801.close();
            this.field1801 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "()V", line = 49)
    public final void method370() {
        int var1 = 256;
        if (class390.field5446) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field609[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1803[var2 * 2] = (byte) (var3 >> 8);
            this.field1803[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1801.write(this.field1803, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 84)
    public final void method367(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1802 = true;
                    }
                }
            }
        }
        this.field1805 = new AudioFormat((float) class215.field3077, 16, class390.field5446 ? 2 : 1, true, false);
        this.field1803 = new byte[0x100 << (class390.field5446 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()I", line = 125)
    public final int method366() {
        return this.field1804 - (this.field1801.available() >> (class390.field5446 ? 2 : 1));
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "()V", line = 136)
    public final void method380() throws LineUnavailableException {
        this.field1801.flush();
        if (!this.field1802) {
            return;
        }
        this.field1801.close();
        this.field1801 = null;
        Info var1 = new Info(field1806 == null ? (field1806 = method939("javax.sound.sampled.SourceDataLine")) : field1806, this.field1805, this.field1804 << (class390.field5446 ? 2 : 1));
        this.field1801 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1801.open();
        this.field1801.start();
    }
}
