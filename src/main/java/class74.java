import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class74 {

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field952 = 0;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field954 = 0;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Ldh;")
    public static class179 field951 = new class179(64);

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Lan;")
    public static class337 field955 = new class337();

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "[S")
    public static short[] field959 = new short[256];

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "[Z")
    public static boolean[] field958 = new boolean[5];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Lbh;")
    public static class288 field956;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Ljava/lang/String;")
    public String field946;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "[Z")
    public static boolean[] field960;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "[[[I")
    public static int[][][] field957;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method448(int arg0, byte arg1) {
        field948++;
        if (arg1 <= 61) {
            return -55;
        } else if (arg0 == 16711935) {
            return -1;
        } else {
            return class301.method2121(arg0, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 19)
    public static void method449(byte arg0) {
        field955 = null;
        field958 = null;
        field960 = null;
        field959 = null;
        if (arg0 != -3) {
            method452((byte) -27, 122, 84, -26, 28);
        }
        field957 = (int[][][]) null;
        field951 = null;
        field956 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;IILjava/awt/Color;Z)V", line = 41)
    public static final void method450(String arg0, int arg1, int arg2, Color arg3, boolean arg4) {
        if (arg2 != 20825) {
            method448(127, (byte) -31);
        }
        try {
            Graphics var5 = class260.field3941.getGraphics();
            if (class299.field4669 == null) {
                class299.field4669 = new Font("Helvetica", 1, 13);
                class305.field4734 = class260.field3941.getFontMetrics(class299.field4669);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class188.field2712, class314.field4847);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class58.field705 == null) {
                    class58.field705 = class260.field3941.createImage(304, 34);
                }
                Graphics var6 = class58.field705.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var6.setFont(class299.field4669);
                var6.setColor(Color.white);
                var6.drawString(arg0, (304 - class305.field4734.stringWidth(arg0)) / 2, 22);
                var5.drawImage(class58.field705, class188.field2712 / 2 - 152, class314.field4847 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class188.field2712 / 2 - 152;
                int var9 = class314.field4847 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 - -1, 301, 31);
                var5.fillRect(arg1 * 3 + var8 + 2, var9 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class299.field4669);
                var5.setColor(Color.white);
                var5.drawString(arg0, var8 + (304 - class305.field4734.stringWidth(arg0)) / 2, var9 + 22);
            }
            if (class44.field528 != null) {
                var5.setFont(class299.field4669);
                var5.setColor(Color.white);
                var5.drawString(class44.field528, class188.field2712 / 2 - (class305.field4734.stringWidth(class44.field528) / 2), class314.field4847 / 2 + -26);
            }
        } catch (Exception var12) {
            class260.field3941.repaint();
        }
        field947++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIZI)V", line = 116)
    public static final void method451(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class332.field5072 = arg2;
        class221.field3122 = arg0;
        field944++;
        class312.field4824 = arg6;
        class329.field5021 = arg1;
        class216.field3028 = arg4;
        if (arg5 && class221.field3122 >= 100) {
            class109.field1506 = class329.field5021 * 128 + 64;
            class130.field1792 = class332.field5072 * 128 + 64;
            class301.field4704 = class184.method1278(class138.field1940, -13660, class109.field1506, class130.field1792) - class312.field4824;
        }
        class118.field1671 = 2;
        if (arg3 < 115) {
            method448(-28, (byte) 99);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIIII)V", line = 151)
    public static final void method452(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class259.field3934 != 0 && arg2 != 0 && class1.field6 < 50 && arg1 != -1) {
            class308.field4762[class1.field6] = arg1;
            class168.field2337[class1.field6] = arg2;
            class120.field1682[class1.field6] = arg4;
            class109.field1514[class1.field6] = null;
            class85.field1094[class1.field6] = 0;
            class269.field4246[class1.field6] = arg3;
            class1.field6++;
        }
        if (arg0 == -29) {
            field950++;
        }
    }
}
