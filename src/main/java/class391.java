import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class391 extends class476 {

    @OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
    public static int[] field5645 = new int[25];

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lmg;")
    public static class530 field5638 = new class530();

    @OriginalMember(owner = "client!n", name = "n", descriptor = "F")
    public static float field5641;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field5642;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2317(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field5639 = -87;
        }
        field5636++;
        if (class151.method1091((byte) -96, arg2, arg1)) {
            return class348.method2088(arg2, (byte) -103, arg1) | (arg1 & 0xB000) != 0 | class4.method28(arg1, -20179, arg2) ? true : (arg2 & 0x37) == 0 & (class463.method2689((byte) -120, arg2, arg1) | class265.method1558(arg2, arg1, true));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)V")
    public static final void method2318(int arg0, boolean arg1) {
        field5644++;
        if (arg0 != 45056) {
            return;
        }
        while (class508.field7414.method198((byte) 79, class399.field5722) >= 15) {
            int var2 = class508.field7414.method194(15, arg0 - 60942);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            class326 var4 = (class326) class281.field3826.method1592((byte) -25, (long) var2);
            if (var4 == null) {
                class209 var5 = new class209();
                var5.field179 = var2;
                var4 = new class326(var5);
                class281.field3826.method1586(var4, (long) var2, 1);
                var3 = true;
                class496.field7261[class534.field7854++] = var4;
            }
            class209 var6 = var4.field4455;
            class159.field2416[class273.field3692++] = var2;
            var6.field208 = class28.field417;
            if (var6.field2976 != null && var6.field2976.method654(arg0 ^ 0xFFFF4FFF)) {
                class134.method971(var6, true);
            }
            int var7 = class508.field7414.method194(1, -15886);
            int var8 = class508.field7414.method194(2, -15886);
            int var9 = class508.field7414.method194(1, -15886);
            if (var9 == 1) {
                class311.field4227[class496.field7242++] = var2;
            }
            int var10;
            if (arg1) {
                var10 = class508.field7414.method194(8, arg0 - 60942);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = class508.field7414.method194(5, -15886);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }
            int var11;
            if (arg1) {
                var11 = class508.field7414.method194(8, -15886);
                if (var11 > 127) {
                    var11 -= 256;
                }
            } else {
                var11 = class508.field7414.method194(5, arg0 ^ 0xFFFF71F2);
                if (var11 > 15) {
                    var11 -= 32;
                }
            }
            int var12 = (class508.field7414.method194(3, -15886) + 4 & 0xB8400007) << 11;
            var6.method1330(class233.field3248.method2222((byte) 76, class508.field7414.method194(14, -15886)), false);
            var6.method115(var6.field2976.field1228, (byte) 75);
            var6.field220 = var6.field2976.field1230 << 3;
            if (var3) {
                var6.method106(1113158831, true, var12);
            }
            var6.method1327(30, var8, class81.field1158.field257[0] + var10, var6.method116(arg0 ^ 0x9179), class81.field1158.field263[0] + var11, var7 == 1);
            if (var6.field2976.method654(arg0 - 45057)) {
                class461.method2683(var6.field257[0], var6.field263[0], null, 0, var6, null, var6.field6279, arg0 - 50002);
            }
        }
        class508.field7414.method196(arg0 - 14691);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lti;Lza;ILvu;IILfk;Z)V")
    public static final void method2319(class237 arg0, class295 arg1, int arg2, class155 arg3, int arg4, int arg5, class92 arg6, boolean arg7) {
        field5643++;
        int var8 = arg0.field3279 - arg2 / 2 - 5;
        int var9 = arg4 + 2;
        if (arg6.field1473 != 0) {
            arg1.method1712(arg4 + arg3.method1115() * arg5 + 1 - var9, 0, arg6.field1473, arg2 + 10, var9, var8);
        }
        if (arg6.field1488 != 0) {
            arg1.method1707((byte) 55, arg6.field1488, arg2 + 10, var9, arg3.method1115() * arg5 + arg4 + 1 - var9, var8);
        }
        int var10 = arg6.field1510;
        if (arg0.field3282 && arg6.field1481 != -1) {
            var10 = arg6.field1481;
        }
        if (arg7) {
            return;
        }
        for (int var11 = 0; var11 < arg5; var11++) {
            String var12 = class312.field4241[var11];
            if (var11 < (arg5 - 1)) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg3.method1119(arg1, var12, arg0.field3279, arg4, var10, true);
            arg4 += arg3.method1115();
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static void method2320(int arg0) {
        field5638 = null;
        field5642 = null;
        field5645 = null;
        if (arg0 != 2) {
            method2322((byte) 51, -120, 36);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)Ldq;")
    public static final class129 method2321(int arg0) {
        field5640++;
        if (arg0 != -21344) {
            field5641 = -0.5626579F;
        }
        try {
            return (class129) Class.forName("oe").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BII)I")
    public static final int method2322(byte arg0, int arg1, int arg2) {
        if (arg0 > -45) {
            field5645 = null;
        }
        field5637++;
        int var3 = class256.method1528(arg1 + 45365, 4, false, arg2 + 91923) + (class256.method1528(arg1 + 10294, 2, false, arg2 + 37821) - 128 >> 1) + (class256.method1528(arg1, 1, false, arg2) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
