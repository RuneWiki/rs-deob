import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class85 extends class168 {

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "Z")
    private boolean field1644 = false;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field1645;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1643;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1640;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "[B")
    private byte[] field1641;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "()V")
    public final void method633() throws LineUnavailableException {
        this.field1640.flush();
        if (!this.field1644) {
            return;
        }
        this.field1640.close();
        this.field1640 = null;
        Info var1 = new Info(field1645 == null ? (field1645 = method639("javax.sound.sampled.SourceDataLine")) : field1645, this.field1643, this.field1642 << (class158.field2748 ? 2 : 1));
        this.field1640 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1640.open();
        this.field1640.start();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method634(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var4.length > var3) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1644 = true;
                    }
                }
                var3++;
            }
        }
        this.field1643 = new AudioFormat((float) class170.field2935, 16, class158.field2748 ? 2 : 1, true, false);
        this.field1641 = new byte[0x100 << (class158.field2748 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    public final void method635(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1645 == null ? (field1645 = method639("javax.sound.sampled.SourceDataLine")) : field1645, this.field1643, arg0 << (class158.field2748 ? 2 : 1));
            this.field1640 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1640.open();
            this.field1640.start();
            this.field1642 = arg0;
        } catch (LineUnavailableException var4) {
            if (class2.method14(arg0, (byte) -73) == 1) {
                this.field1640 = null;
                throw var4;
            } else {
                this.method635(class235.method1532(-106, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
    public final void method636() {
        int var1 = 256;
        if (class158.field2748) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2889[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1641[var2 * 2] = (byte) (var3 >> 8);
            this.field1641[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1640.write(this.field1641, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()V")
    public final void method637() {
        if (this.field1640 != null) {
            this.field1640.close();
            this.field1640 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "()I")
    public final int method638() {
        return this.field1642 - (this.field1640.available() >> (class158.field2748 ? 2 : 1));
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method639(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
