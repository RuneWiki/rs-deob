import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class114 extends class140 {

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "Z")
    private boolean field1944 = false;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    private int field1945;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field1949;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1946;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1947;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "[B")
    private byte[] field1948;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()I")
    public final int method361() {
        return this.field1945 - (this.field1947.available() >> (class17.field256 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public final void method359(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1949 == null ? (field1949 = method796("javax.sound.sampled.SourceDataLine")) : field1949, this.field1946, arg0 << (class17.field256 ? 2 : 1));
            this.field1947 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1947.open();
            this.field1947.start();
            this.field1945 = arg0;
        } catch (LineUnavailableException var4) {
            if (class62.method393(0, arg0) == 1) {
                this.field1947 = null;
                throw var4;
            } else {
                this.method359(class5.method30(115, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method357(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var4.length > var3) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1944 = true;
                    }
                }
                var3++;
            }
        }
        this.field1946 = new AudioFormat((float) class113.field1937, 16, class17.field256 ? 2 : 1, true, false);
        this.field1948 = new byte[0x100 << (class17.field256 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "()V")
    public final void method360() {
        if (this.field1947 != null) {
            this.field1947.close();
            this.field1947 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()V")
    public final void method358() throws LineUnavailableException {
        this.field1947.flush();
        if (!this.field1944) {
            return;
        }
        this.field1947.close();
        this.field1947 = null;
        Info var1 = new Info(field1949 == null ? (field1949 = method796("javax.sound.sampled.SourceDataLine")) : field1949, this.field1946, this.field1945 << (class17.field256 ? 2 : 1));
        this.field1947 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1947.open();
        this.field1947.start();
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()V")
    public final void method362() {
        int var1 = 256;
        if (class17.field256) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2557[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1948[var2 * 2] = (byte) (var3 >> 8);
            this.field1948[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1947.write(this.field1948, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method796(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
