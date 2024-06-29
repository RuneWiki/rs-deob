import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class103 {

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Ljg;")
    public static class42 field1648 = new class42(64);

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "[[S")
    public static short[][] field1650 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1649 = null;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)I")
    public static final int method743(int arg0, byte arg1) {
        if (arg1 > -79) {
            return 122;
        } else {
            field1643++;
            return arg0 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILaj;Laj;Laj;)V")
    public static final void method744(int arg0, class151 arg1, class151 arg2, class151 arg3) {
        class91.field1511 = arg1;
        field1647++;
        class154.field2564 = arg2;
        class85.field1416 = arg3;
        if (arg0 >= -69) {
            field1651 = -69;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method745(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 == arg7 && arg4 == arg6 && arg1 == arg2 && arg8 == arg9) {
            class64.method438(arg1, arg6, arg5, arg9, arg3, -115);
        } else {
            int var10 = arg5;
            int var11 = arg5 * 3;
            int var12 = arg6;
            int var13 = arg6 * 3;
            int var14 = arg4 * 3;
            int var15 = arg2 * 3;
            int var16 = arg8 * 3;
            int var17 = arg7 * 3;
            int var18 = arg9 + var14 - var16 - arg6;
            int var19 = var15 + var11 - var17 - var17;
            int var20 = arg1 + var17 - (var15 - -arg5);
            int var21 = var16 + var13 - var14 - var14;
            int var22 = var17 - var11;
            int var23 = var14 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var21 * var25;
                int var28 = var19 * var25;
                int var29 = var20 * var26;
                int var30 = var18 * var26;
                int var31 = var23 * var24;
                int var32 = var22 * var24;
                int var33 = (var29 + var32 + var28 >> 12) + arg5;
                int var34 = (var27 + var30 + var31 >> 12) + arg6;
                class64.method438(var33, var12, var10, var34, arg3, -46);
                var10 = var33;
                var12 = var34;
            }
        }
        field1645++;
        if (arg0 != 77) {
            field1648 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static void method746(byte arg0) {
        if (arg0 != -43) {
            field1648 = null;
        }
        field1650 = null;
        field1649 = null;
        field1648 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method747(int arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        int var4 = 0;
        short[] var5 = new short[16];
        int var6 = arg1 ? 32768 : 0;
        field1646++;
        int var7 = var6 + (arg1 ? class151.field2489 : class15.field308);
        for (int var8 = var6; var8 < var7; var8++) {
            class270 var11 = class263.method1865((byte) -79, var8);
            if (var11.field4485 && var11.method1895(0).toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 50) {
                    class246.field4127 = null;
                    class45.field706 = -1;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var12 = new short[var5.length * 2];
                    for (int var13 = 0; var13 < var4; var13++) {
                        var12[var13] = var5[var13];
                    }
                    var5 = var12;
                }
                var5[var4++] = (short) var8;
            }
        }
        class246.field4127 = var5;
        class80.field1344 = 0;
        class45.field706 = var4;
        String[] var9 = new String[class45.field706];
        int var10 = 0;
        if (arg0 >= -114) {
            method746((byte) 56);
        }
        while (var10 < class45.field706) {
            var9[var10] = class263.method1865((byte) -79, var5[var10]).method1895(0);
            var10++;
        }
        class213.method1512(0, var9, class246.field4127);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class41 var7 = new class41();
        var7.field616 = arg1 / 128;
        var7.field625 = arg2 / 128;
        var7.field628 = arg3 / 128;
        var7.field624 = arg4 / 128;
        var7.field631 = arg0;
        var7.field614 = arg1;
        var7.field610 = arg2;
        var7.field620 = arg3;
        var7.field609 = arg4;
        var7.field617 = arg5;
        var7.field627 = arg6;
        class241.field4063[class216.field3653++] = var7;
    }
}
