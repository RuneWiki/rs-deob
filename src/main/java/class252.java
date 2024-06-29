import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class252 extends class453 {

    @OriginalMember(owner = "client!uq", name = "M", descriptor = "Z")
    private boolean field3531 = false;

    @OriginalMember(owner = "client!uq", name = "L", descriptor = "I")
    private int field3530;

    @OriginalMember(owner = "client!uq", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field3534;

    @OriginalMember(owner = "client!uq", name = "C", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3529;

    @OriginalMember(owner = "client!uq", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3533;

    @OriginalMember(owner = "client!uq", name = "N", descriptor = "[B")
    private byte[] field3532;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "()V", line = 10)
    public final void method1559() throws LineUnavailableException {
        this.field3533.flush();
        if (!this.field3531) {
            return;
        }
        this.field3533.close();
        this.field3533 = null;
        Info var1 = new Info(field3534 == null ? (field3534 = method1565("javax.sound.sampled.SourceDataLine")) : field3534, this.field3529, this.field3530 << (class137.field1664 ? 2 : 1));
        this.field3533 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3533.open();
        this.field3533.start();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 16)
    public static Class method1565(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "()V", line = 28)
    public final void method1560() {
        if (this.field3533 != null) {
            this.field3533.close();
            this.field3533 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "()V", line = 45)
    public final void method1561() {
        int var1 = 256;
        if (class137.field1664) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field6400[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3532[var2 * 2] = (byte) (var3 >> 8);
            this.field3532[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3533.write(this.field3532, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 79)
    public final void method1562(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3531 = true;
                    }
                }
            }
        }
        this.field3529 = new AudioFormat((float) class345.field4936, 16, class137.field1664 ? 2 : 1, true, false);
        this.field3532 = new byte[0x100 << (class137.field1664 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)V", line = 118)
    public final void method1563(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3534 == null ? (field3534 = method1565("javax.sound.sampled.SourceDataLine")) : field3534, this.field3529, arg0 << (class137.field1664 ? 2 : 1));
            this.field3533 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3533.open();
            this.field3533.start();
            this.field3530 = arg0;
        } catch (LineUnavailableException var4) {
            if (class412.method2443(arg0, 1374359425) == 1) {
                this.field3533 = null;
                throw var4;
            } else {
                this.method1563(class93.method459(-719824240, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "()I", line = 141)
    public final int method1564() {
        return this.field3530 - (this.field3533.available() >> (class137.field1664 ? 2 : 1));
    }
}
