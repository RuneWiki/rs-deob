import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class686 extends class22 {

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "Z")
    private boolean field9689 = false;

    @OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
    private int field9691;

    @OriginalMember(owner = "client!sp", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field9693;

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field9690;

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field9688;

    @OriginalMember(owner = "client!sp", name = "N", descriptor = "[B")
    private byte[] field9692;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
    public final void method149(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field9693 == null ? (field9693 = method3844("javax.sound.sampled.SourceDataLine")) : field9693, this.field9690, arg0 << (class550.field8108 ? 2 : 1));
            this.field9688 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field9688.open();
            this.field9688.start();
            this.field9691 = arg0;
        } catch (LineUnavailableException var4) {
            if (class391.method2423(arg0, (byte) 89) == 1) {
                this.field9688 = null;
                throw var4;
            } else {
                this.method149(class240.method1478(-28325, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "()I")
    public final int method148() {
        return this.field9691 - (this.field9688.available() >> (class550.field8108 ? 2 : 1));
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "()V")
    public final void method147() throws LineUnavailableException {
        this.field9688.flush();
        if (!this.field9689) {
            return;
        }
        this.field9688.close();
        this.field9688 = null;
        Info var1 = new Info(field9693 == null ? (field9693 = method3844("javax.sound.sampled.SourceDataLine")) : field9693, this.field9690, this.field9691 << (class550.field8108 ? 2 : 1));
        this.field9688 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field9688.open();
        this.field9688.start();
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "()V")
    public final void method146() {
        if (this.field9688 != null) {
            this.field9688.close();
            this.field9688 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method150(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field9689 = true;
                    }
                }
            }
        }
        this.field9690 = new AudioFormat((float) class82.field1321, 16, class550.field8108 ? 2 : 1, true, false);
        this.field9692 = new byte[0x100 << (class550.field8108 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "()V")
    public final void method145() {
        int var1 = 256;
        if (class550.field8108) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field412[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field9692[var2 * 2] = (byte) (var3 >> 8);
            this.field9692[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field9688.write(this.field9692, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3844(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
