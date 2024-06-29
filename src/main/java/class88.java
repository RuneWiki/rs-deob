import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class88 {

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "Lon;")
    public static class35 field1300 = new class35(128);

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "[S")
    public static short[] field1304 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Laj;")
    public static class71 field1303 = new class71(16);

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field1307 = -1;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field1305 = 0;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "[I")
    public static int[] field1309 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Lrk;")
    public static class427 field1308;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "[I")
    public static int[] field1306;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public static void method782(byte arg0) {
        field1303 = null;
        field1300 = null;
        field1308 = null;
        field1304 = null;
        field1309 = null;
        if (arg0 <= -57) {
            field1306 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IBIIIII)V")
    public static final void method783(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class436.method2701(arg5, -5955);
        field1301++;
        int var7 = 0;
        int var8 = arg5 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class186.field2697[arg3];
        if (arg1 < 88) {
            method783(94, (byte) 90, -79, -93, -107, 36, 78);
        }
        int var16 = arg6 - var8;
        int var17 = arg6 + var8;
        class396.method2436(-1070, arg0, arg6 - arg5, var15, var16);
        class396.method2436(-1070, arg2, var16, var15, var17);
        class396.method2436(-1070, arg0, var17, var15, arg5 + arg6);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class375.field5283[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 > var9) {
                    int[] var18 = class186.field2697[arg3 + var9];
                    int[] var19 = class186.field2697[arg3 - var9];
                    int var20 = class375.field5283[var9];
                    int var21 = arg6 + var7;
                    int var22 = arg6 - var7;
                    int var23 = arg6 + var20;
                    int var24 = arg6 - var20;
                    class396.method2436(-1070, arg0, var22, var18, var24);
                    class396.method2436(-1070, arg2, var24, var18, var23);
                    class396.method2436(-1070, arg0, var23, var18, var21);
                    class396.method2436(-1070, arg0, var22, var19, var24);
                    class396.method2436(-1070, arg2, var24, var19, var23);
                    class396.method2436(-1070, arg0, var23, var19, var21);
                } else {
                    int[] var25 = class186.field2697[arg3 + var9];
                    int[] var26 = class186.field2697[arg3 - var9];
                    int var27 = arg6 + var7;
                    int var28 = arg6 - var7;
                    class396.method2436(-1070, arg0, var28, var25, var27);
                    class396.method2436(-1070, arg0, var28, var26, var27);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class186.field2697[arg3 + var7];
            int[] var30 = class186.field2697[arg3 - var7];
            int var31 = arg6 + var9;
            int var32 = arg6 - var9;
            if (var8 <= var7) {
                class396.method2436(-1070, arg0, var32, var29, var31);
                class396.method2436(-1070, arg0, var32, var30, var31);
            } else {
                int var33 = var7 <= var11 ? var11 : class375.field5283[var7];
                int var34 = arg6 + var33;
                int var35 = arg6 - var33;
                class396.method2436(-1070, arg0, var32, var29, var35);
                class396.method2436(-1070, arg2, var35, var29, var34);
                class396.method2436(-1070, arg0, var34, var29, var31);
                class396.method2436(-1070, arg0, var32, var30, var35);
                class396.method2436(-1070, arg2, var35, var30, var34);
                class396.method2436(-1070, arg0, var34, var30, var31);
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public static final void method784(int arg0) {
        field1302++;
        if (arg0 != 8) {
            field1305 = 122;
        }
        for (class128 var1 = (class128) class399.field5584.method1240((byte) -80); var1 != null; var1 = (class128) class399.field5584.method1245(1)) {
            if (var1.field1812 > 0) {
                var1.field1812--;
            }
            if (var1.field1812 != 0) {
                if (var1.field1822 > 0) {
                    var1.field1822--;
                }
                if (var1.field1822 == 0 && var1.field1827 >= 1 && var1.field1816 >= 1 && var1.field1827 <= class116.field1621 - 2 && var1.field1816 <= class385.field5425 - 2 && (var1.field1806 < 0 || class76.method655(5, var1.field1806, var1.field1818))) {
                    class298.method1915(var1.field1827, var1.field1816, var1.field1806, var1.field1818, false, -1, var1.field1819, var1.field1804, var1.field1808);
                    var1.field1822 = -1;
                    if (var1.field1823 == var1.field1806 && var1.field1823 == -1) {
                        var1.method2367(arg0 ^ 0xD);
                    } else if (var1.field1823 == var1.field1806 && var1.field1809 == var1.field1804 && var1.field1818 == var1.field1803) {
                        var1.method2367(arg0 - 3);
                    }
                }
            } else if (var1.field1823 < 0 || class76.method655(5, var1.field1823, var1.field1803)) {
                class298.method1915(var1.field1827, var1.field1816, var1.field1823, var1.field1803, false, -1, var1.field1819, var1.field1809, var1.field1808);
                var1.method2367(5);
            }
        }
    }
}
