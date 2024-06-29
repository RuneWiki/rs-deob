import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class371 extends class234 {

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Z")
    private boolean field5134 = false;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    private int field5133;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field5138;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5135;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5137;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "[B")
    private byte[] field5136;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()V")
    public final void method1564() throws LineUnavailableException {
        this.field5137.flush();
        if (!this.field5134) {
            return;
        }
        this.field5137.close();
        this.field5137 = null;
        Info var1 = new Info(field5138 == null ? (field5138 = method2312("javax.sound.sampled.SourceDataLine")) : field5138, this.field5135, this.field5133 << (class373.field5246 ? 2 : 1));
        this.field5137 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5137.open();
        this.field5137.start();
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public final void method1567(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field5138 == null ? (field5138 = method2312("javax.sound.sampled.SourceDataLine")) : field5138, this.field5135, arg0 << (class373.field5246 ? 2 : 1));
            this.field5137 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5137.open();
            this.field5137.start();
            this.field5133 = arg0;
        } catch (LineUnavailableException var4) {
            if (class24.method304(arg0, 0) == 1) {
                this.field5137 = null;
                throw var4;
            } else {
                this.method1567(class443.method2751(true, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "()I")
    public final int method1557() {
        return this.field5133 - (this.field5137.available() >> (class373.field5246 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()V")
    public final void method1555() {
        int var1 = 256;
        if (class373.field5246) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3231[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5136[var2 * 2] = (byte) (var3 >> 8);
            this.field5136[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5137.write(this.field5136, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
    public final void method1554() {
        if (this.field5137 != null) {
            this.field5137.close();
            this.field5137 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1566(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5134 = true;
                    }
                }
            }
        }
        this.field5135 = new AudioFormat((float) class413.field5774, 16, class373.field5246 ? 2 : 1, true, false);
        this.field5136 = new byte[0x100 << (class373.field5246 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2312(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
