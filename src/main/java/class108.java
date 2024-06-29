import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class108 extends class151 {

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "Z")
    private boolean field1542 = false;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field1546;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1544;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1541;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "[B")
    private byte[] field1543;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public final void method705(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1542 = true;
                    }
                }
            }
        }
        this.field1544 = new AudioFormat((float) class322.field5294, 16, class228.field3587 ? 2 : 1, true, false);
        this.field1543 = new byte[0x100 << (class228.field3587 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()I", line = 55)
    public final int method706() {
        return this.field1545 - (this.field1541.available() >> (class228.field3587 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()V", line = 64)
    public final void method707() {
        int var1 = 256;
        if (class228.field3587) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2438[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1543[var2 * 2] = (byte) (var3 >> 8);
            this.field1543[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1541.write(this.field1543, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 98)
    public final void method708() throws LineUnavailableException {
        this.field1541.flush();
        if (!this.field1542) {
            return;
        }
        this.field1541.close();
        this.field1541 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field1546 == null ? (field1546 = method711("javax.sound.sampled.SourceDataLine")) : field1546, this.field1544, this.field1545 << (class228.field3587 ? 2 : 1));
        this.field1541 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1541.open();
        this.field1541.start();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 105)
    public static Class method711(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V", line = 122)
    public final void method709(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field1546 == null ? (field1546 = method711("javax.sound.sampled.SourceDataLine")) : field1546, this.field1544, arg0 << (class228.field3587 ? 2 : 1));
            this.field1541 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1541.open();
            this.field1541.start();
            this.field1545 = arg0;
        } catch (LineUnavailableException var4) {
            if (class15.method108(-101, arg0) == 1) {
                this.field1541 = null;
                throw var4;
            } else {
                this.method709(class329.method2347(arg0, (byte) -96));
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 143)
    public final void method710() {
        if (this.field1541 != null) {
            this.field1541.close();
            this.field1541 = null;
        }
    }
}
