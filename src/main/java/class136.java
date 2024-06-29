import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class136 extends class51 {

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "Z")
    private boolean field2285 = false;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field2289;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2287;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2288;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "[B")
    private byte[] field2284;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2289 == null ? (field2289 = method910("javax.sound.sampled.SourceDataLine")) : field2289, this.field2287, arg0 << (class85.field1399 ? 2 : 1));
            this.field2288 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2288.open();
            this.field2288.start();
            this.field2286 = arg0;
        } catch (LineUnavailableException var4) {
            if (class152.method1029((byte) -72, arg0) == 1) {
                this.field2288 = null;
                throw var4;
            } else {
                this.method342(class10.method71(arg0, -480947516));
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "()V")
    public final void method344() {
        int var1 = 256;
        if (class85.field1399) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field937[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2284[var2 * 2] = (byte) (var3 >> 8);
            this.field2284[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2288.write(this.field2284, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "()V")
    public final void method343() {
        if (this.field2288 != null) {
            this.field2288.close();
            this.field2288 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method339(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var3 < var4.length) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2285 = true;
                    }
                }
                var3++;
            }
        }
        this.field2287 = new AudioFormat((float) class75.field1284, 16, class85.field1399 ? 2 : 1, true, false);
        this.field2284 = new byte[0x100 << (class85.field1399 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "()V")
    public final void method345() throws LineUnavailableException {
        this.field2288.flush();
        if (!this.field2285) {
            return;
        }
        this.field2288.close();
        this.field2288 = null;
        Info var1 = new Info(field2289 == null ? (field2289 = method910("javax.sound.sampled.SourceDataLine")) : field2289, this.field2287, this.field2286 << (class85.field1399 ? 2 : 1));
        this.field2288 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2288.open();
        this.field2288.start();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "()I")
    public final int method338() {
        return this.field2286 - (this.field2288.available() >> (class85.field1399 ? 2 : 1));
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method910(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
