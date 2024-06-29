import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class471 extends class349 {

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "Z")
    private boolean field6686 = false;

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "I")
    private int field6685;

    @OriginalMember(owner = "client!sp", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field6690;

    @OriginalMember(owner = "client!sp", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field6689;

    @OriginalMember(owner = "client!sp", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field6688;

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "[B")
    private byte[] field6687;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "()V")
    public final void method2234() throws LineUnavailableException {
        this.field6688.flush();
        if (!this.field6686) {
            return;
        }
        this.field6688.close();
        this.field6688 = null;
        Info var1 = new Info(field6690 == null ? (field6690 = method2839("javax.sound.sampled.SourceDataLine")) : field6690, this.field6689, this.field6685 << (class147.field2155 ? 2 : 1));
        this.field6688 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field6688.open();
        this.field6688.start();
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "()I")
    public final int method2233() {
        return this.field6685 - (this.field6688.available() >> (class147.field2155 ? 2 : 1));
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "()V")
    public final void method2236() {
        int var1 = 256;
        if (class147.field2155) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5159[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field6687[var2 * 2] = (byte) (var3 >> 8);
            this.field6687[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field6688.write(this.field6687, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2232(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field6686 = true;
                    }
                }
            }
        }
        this.field6689 = new AudioFormat((float) class132.field1821, 16, class147.field2155 ? 2 : 1, true, false);
        this.field6687 = new byte[0x100 << (class147.field2155 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
    public final void method2222(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field6690 == null ? (field6690 = method2839("javax.sound.sampled.SourceDataLine")) : field6690, this.field6689, arg0 << (class147.field2155 ? 2 : 1));
            this.field6688 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field6688.open();
            this.field6688.start();
            this.field6685 = arg0;
        } catch (LineUnavailableException var4) {
            if (class322.method1999(arg0, 858993459) == 1) {
                this.field6688 = null;
                throw var4;
            } else {
                this.method2222(class68.method609(arg0, (byte) 77));
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "()V")
    public final void method2223() {
        if (this.field6688 != null) {
            this.field6688.close();
            this.field6688 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2839(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
