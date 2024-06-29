import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class96 extends class55 {

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "Z")
    private boolean field1778 = false;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
    private int field1780;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field1781;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1777;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1776;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "[B")
    private byte[] field1779;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()I")
    public final int method398() {
        return this.field1780 - (this.field1776.available() >> (class7.field99 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()V")
    public final void method400() {
        int var1 = 256;
        if (class7.field99) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1025[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1779[var2 * 2] = (byte) (var3 >> 8);
            this.field1779[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1776.write(this.field1779, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()V")
    public final void method413() throws LineUnavailableException {
        this.field1776.flush();
        if (!this.field1778) {
            return;
        }
        this.field1776.close();
        this.field1776 = null;
        Info var1 = new Info(field1781 == null ? (field1781 = method680("javax.sound.sampled.SourceDataLine")) : field1781, this.field1777, this.field1780 << (class7.field99 ? 2 : 1));
        this.field1776 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1776.open();
        this.field1776.start();
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
    public final void method409(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1781 == null ? (field1781 = method680("javax.sound.sampled.SourceDataLine")) : field1781, this.field1777, arg0 << (class7.field99 ? 2 : 1));
            this.field1776 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1776.open();
            this.field1776.start();
            this.field1780 = arg0;
        } catch (LineUnavailableException var4) {
            if (class155.method1059((byte) -86, arg0) == 1) {
                this.field1776 = null;
                throw var4;
            } else {
                this.method409(class184.method1298(true, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method412(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1778 = true;
                    }
                }
            }
        }
        this.field1777 = new AudioFormat((float) class11.field161, 16, class7.field99 ? 2 : 1, true, false);
        this.field1779 = new byte[0x100 << (class7.field99 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()V")
    public final void method408() {
        if (this.field1776 != null) {
            this.field1776.close();
            this.field1776 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method680(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
