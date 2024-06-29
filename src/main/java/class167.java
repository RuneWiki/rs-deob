import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class167 extends class192 {

    @OriginalMember(owner = "client!ks", name = "N", descriptor = "Z")
    private boolean field2348 = false;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!ks", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field2350;

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2346;

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2347;

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "[B")
    private byte[] field2349;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "()I")
    public final int method1186() {
        return this.field2345 - (this.field2347.available() >> (class105.field1478 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1187(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2348 = true;
                    }
                }
            }
        }
        this.field2346 = new AudioFormat((float) class231.field3248, 16, class105.field1478 ? 2 : 1, true, false);
        this.field2349 = new byte[0x100 << (class105.field1478 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "()V")
    public final void method1188() throws LineUnavailableException {
        this.field2347.flush();
        if (!this.field2348) {
            return;
        }
        this.field2347.close();
        this.field2347 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field2350 == null ? (field2350 = method1192("javax.sound.sampled.SourceDataLine")) : field2350, this.field2346, this.field2345 << (class105.field1478 ? 2 : 1));
        this.field2347 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2347.open();
        this.field2347.start();
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)V")
    public final void method1189(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field2350 == null ? (field2350 = method1192("javax.sound.sampled.SourceDataLine")) : field2350, this.field2346, arg0 << (class105.field1478 ? 2 : 1));
            this.field2347 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2347.open();
            this.field2347.start();
            this.field2345 = arg0;
        } catch (LineUnavailableException var4) {
            if (class132.method990(-1, arg0) == 1) {
                this.field2347 = null;
                throw var4;
            } else {
                this.method1189(class177.method1249((byte) -125, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "()V")
    public final void method1190() {
        int var1 = 256;
        if (class105.field1478) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2778[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2349[var2 * 2] = (byte) (var3 >> 8);
            this.field2349[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2347.write(this.field2349, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "()V")
    public final void method1191() {
        if (this.field2347 != null) {
            this.field2347.close();
            this.field2347 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1192(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
