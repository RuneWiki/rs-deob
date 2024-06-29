import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class85 extends class245 {

    @OriginalMember(owner = "client!eda", name = "K", descriptor = "Z")
    private boolean field1204 = false;

    @OriginalMember(owner = "client!eda", name = "J", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client!eda", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field1206;

    @OriginalMember(owner = "client!eda", name = "H", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1201;

    @OriginalMember(owner = "client!eda", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1205;

    @OriginalMember(owner = "client!eda", name = "I", descriptor = "[B")
    private byte[] field1202;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "()I")
    public final int method677() {
        return this.field1203 - (this.field1205.available() >> (class658.field9343 ? 2 : 1));
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method678(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1204 = true;
                    }
                }
            }
        }
        this.field1201 = new AudioFormat((float) class73.field1105, 16, class658.field9343 ? 2 : 1, true, false);
        this.field1202 = new byte[0x100 << (class658.field9343 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "()V")
    public final void method679() {
        if (this.field1205 != null) {
            this.field1205.close();
            this.field1205 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
    public final void method680(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field1206 == null ? (field1206 = method683("javax.sound.sampled.SourceDataLine")) : field1206, this.field1201, arg0 << (class658.field9343 ? 2 : 1));
            this.field1205 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1205.open();
            this.field1205.start();
            this.field1203 = arg0;
        } catch (LineUnavailableException var4) {
            if (class613.method3519(arg0, 2) == 1) {
                this.field1205 = null;
                throw var4;
            } else {
                this.method680(class698.method3915(arg0, (byte) 93));
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "()V")
    public final void method681() {
        int var1 = 256;
        if (class658.field9343) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3363[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1202[var2 * 2] = (byte) (var3 >> 8);
            this.field1202[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1205.write(this.field1202, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "()V")
    public final void method682() throws LineUnavailableException {
        this.field1205.flush();
        if (!this.field1204) {
            return;
        }
        this.field1205.close();
        this.field1205 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field1206 == null ? (field1206 = method683("javax.sound.sampled.SourceDataLine")) : field1206, this.field1201, this.field1203 << (class658.field9343 ? 2 : 1));
        this.field1205 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1205.open();
        this.field1205.start();
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method683(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
