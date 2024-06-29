import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class133 extends class351 {

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "Z")
    private boolean field1711 = false;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
    private int field1715;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field1716;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1714;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1712;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "[B")
    private byte[] field1713;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "()V")
    public final void method717() {
        if (this.field1712 != null) {
            this.field1712.close();
            this.field1712 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method718(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1711 = true;
                    }
                }
            }
        }
        this.field1714 = new AudioFormat((float) class432.field6338, 16, class67.field689 ? 2 : 1, true, false);
        this.field1713 = new byte[0x100 << (class67.field689 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "()I")
    public final int method719() {
        return this.field1715 - (this.field1712.available() >> (class67.field689 ? 2 : 1));
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "()V")
    public final void method720() throws LineUnavailableException {
        this.field1712.flush();
        if (!this.field1711) {
            return;
        }
        this.field1712.close();
        this.field1712 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field1716 == null ? (field1716 = method723("javax.sound.sampled.SourceDataLine")) : field1716, this.field1714, this.field1715 << (class67.field689 ? 2 : 1));
        this.field1712 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1712.open();
        this.field1712.start();
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "()V")
    public final void method721() {
        int var1 = 256;
        if (class67.field689) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4904[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1713[var2 * 2] = (byte) (var3 >> 8);
            this.field1713[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1712.write(this.field1713, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public final void method722(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field1716 == null ? (field1716 = method723("javax.sound.sampled.SourceDataLine")) : field1716, this.field1714, arg0 << (class67.field689 ? 2 : 1));
            this.field1712 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1712.open();
            this.field1712.start();
            this.field1715 = arg0;
        } catch (LineUnavailableException var4) {
            if (class213.method1156(0, arg0) == 1) {
                this.field1712 = null;
                throw var4;
            } else {
                this.method722(class322.method1853(118, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method723(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
