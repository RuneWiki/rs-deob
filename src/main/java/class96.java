import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class96 extends class253 {

    @OriginalMember(owner = "client!la", name = "I", descriptor = "Z")
    private boolean field1721 = false;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    private int field1723;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field1726;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1724;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1722;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "[B")
    private byte[] field1725;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public final void method701(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1726 == null ? (field1726 = method707("javax.sound.sampled.SourceDataLine")) : field1726, this.field1724, arg0 << (class204.field3687 ? 2 : 1));
            this.field1722 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1722.open();
            this.field1722.start();
            this.field1723 = arg0;
        } catch (LineUnavailableException var4) {
            if (class149.method1078(arg0, 30502) == 1) {
                this.field1722 = null;
                throw var4;
            } else {
                this.method701(class152.method1094(-2085166256, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "()V")
    public final void method702() {
        int var1 = 256;
        if (class204.field3687) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4571[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1725[var2 * 2] = (byte) (var3 >> 8);
            this.field1725[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1722.write(this.field1725, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
    public final void method703() {
        if (this.field1722 != null) {
            this.field1722.close();
            this.field1722 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "()I")
    public final int method704() {
        return this.field1723 - (this.field1722.available() >> (class204.field3687 ? 2 : 1));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method705(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var4.length > var3) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1721 = true;
                    }
                }
                var3++;
            }
        }
        this.field1724 = new AudioFormat((float) class140.field2443, 16, class204.field3687 ? 2 : 1, true, false);
        this.field1725 = new byte[0x100 << (class204.field3687 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()V")
    public final void method706() throws LineUnavailableException {
        this.field1722.flush();
        if (!this.field1721) {
            return;
        }
        this.field1722.close();
        this.field1722 = null;
        Info var1 = new Info(field1726 == null ? (field1726 = method707("javax.sound.sampled.SourceDataLine")) : field1726, this.field1724, this.field1723 << (class204.field3687 ? 2 : 1));
        this.field1722 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1722.open();
        this.field1722.start();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method707(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
