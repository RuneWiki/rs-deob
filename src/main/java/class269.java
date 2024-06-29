import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class269 {

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "B")
    private byte field3915;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public int field3913;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public int field3904;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public int field3910;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Lad;")
    public static class446 field3905 = new class446();

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lda;")
    public static class66 field3907;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method1743(int arg0) {
        field3905 = null;
        field3907 = null;
        if (arg0 != 2) {
            field3907 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)I")
    public final int method1744(byte arg0) {
        field3912++;
        if (arg0 >= -35) {
            method1747(110, (byte) 53, -105, null, -39, null);
        }
        return this.field3915 & 0x7;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/lang/String;ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V")
    public static final void method1745(int arg0, String arg1, int arg2, Color arg3, Color arg4, Color arg5) {
        try {
            Graphics var6 = class629.field8819.getGraphics();
            if (class210.field3253 == null) {
                class210.field3253 = new Font("Helvetica", 1, 13);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(255, 255, 255);
            }
            try {
                if (class687.field9549 == null) {
                    class687.field9549 = class629.field8819.createImage(class428.field5825, class714.field9895);
                }
                Graphics var7 = class687.field9549.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class428.field5825, class714.field9895);
                int var8 = class428.field5825 / 2 - 152;
                int var9 = class714.field9895 / 2 - 18;
                var7.setColor(arg4);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var8 + 2, var9 + 2, arg2 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, arg0, 31);
                var7.fillRect(arg2 * 3 + var8 + 2, var9 + 2, 300 - arg2 * 3, 30);
                var7.setFont(class210.field3253);
                var7.setColor(arg5);
                var7.drawString(arg1, var8 + ((304 - (arg1.length() * 6)) / 2), var9 + 22);
                if (class411.field5576 != null) {
                    var7.setFont(class210.field3253);
                    var7.setColor(arg5);
                    var7.drawString(class411.field5576, class428.field5825 / 2 - class411.field5576.length() * 6 / 2, class714.field9895 / 2 - 26);
                }
                var6.drawImage(class687.field9549, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class428.field5825, class714.field9895);
                int var10 = class428.field5825 / 2 - 152;
                int var11 = class714.field9895 / 2 - 18;
                var6.setColor(arg4);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg3);
                var6.fillRect(var10 + 2, var11 + 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg2 * 3 + var10 + 2, var11 - -2, 300 - (arg2 * 3), 30);
                var6.setFont(class210.field3253);
                var6.setColor(arg5);
                if (class411.field5576 != null) {
                    var6.setFont(class210.field3253);
                    var6.setColor(arg5);
                    var6.drawString(class411.field5576, class428.field5825 / 2 - class411.field5576.length() * 6 / 2, class714.field9895 / 2 + -26);
                }
                var6.drawString(arg1, (304 - (arg1.length() * 6)) / 2 + var10, var11 - -22);
            }
        } catch (Exception var13) {
            class629.field8819.repaint();
        }
        field3911++;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)I")
    public final int method1746(int arg0) {
        field3914++;
        if (arg0 > -58) {
            this.field3909 = 67;
        }
        return (this.field3915 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class269() {
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBILmea;ILha;)V")
    public static final void method1747(int arg0, byte arg1, int arg2, class451 arg3, int arg4, class65 arg5) {
        field3908++;
        for (int var6 = 7; var6 >= 0; var6--) {
            for (int var7 = 127; var7 >= 0; var7--) {
                int var8 = (arg2 & 0x3F) << 10 | (var6 & 0x7) << 7 | var7 & 0x7F;
                class486.method2895(true, false, (byte) 121);
                int var9 = class779.field10694[var8];
                class467.method2791(true, false, (byte) -67);
                arg5.method495((arg3.field6290 * var7 >> 7) + arg0, ((7 - var6) * arg3.field6288 >> 3) + arg4, (arg3.field6290 >> 7) + 1, (arg3.field6288 >> 3) + 1, var9, 0);
            }
        }
        if (arg1 != -20) {
            method1747(-76, (byte) -60, -128, null, -90, null);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lso;)V")
    public class269(class494 arg0) {
        this.field3915 = arg0.method2943((byte) 16);
        this.field3913 = arg0.method2998(true);
        this.field3906 = arg0.method2976(-128);
        this.field3909 = arg0.method2976(-127);
        this.field3904 = arg0.method2976(-128);
        this.field3910 = arg0.method2976(-125);
    }
}
