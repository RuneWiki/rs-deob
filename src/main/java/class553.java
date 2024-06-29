import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class553 {

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public int field7463 = -1;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "Ltm;")
    public static class412 field7471 = new class412();

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public int field7460;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public int field7461;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public int field7464;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public int field7465;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public int field7467;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public int field7468;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public int field7469;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public int field7470;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public static void method3124(byte arg0) {
        if (arg0 != -88) {
            method3125(null, 89, 89, (byte) -4, 35, -107, 27, 102, -46, null);
        }
        field7471 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lbba;IIBIIIIILbba;)V")
    public static final void method3125(class124 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class124 arg9) {
        field7462++;
        int var10 = arg9.method652(-1);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class147 var12 = (class147) class167.field2247.method1541(-10, (long) var10);
        if (var12 == null) {
            class508[] var13 = class508.method2946(class643.field8927, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class379.field5542.method477(var13[0], true);
            class167.field2247.method1544(true, var12, (long) var10);
        }
        class3.method11(arg0.field2259, 0, arg0.field2257, arg8, arg4, true, arg7 >> 1, arg0.field2250, arg0.method655(-126) * 256, arg6 >> 1);
        int var14 = class744.field10277[0] + arg2 - 18;
        int var15 = class744.field10277[1] + arg1 - 70;
        int var16 = arg5 / 4 * 18 + var14;
        int var17 = arg5 % 4 * 18 + var15;
        int var18 = 112 / ((arg3 - 66) / 36);
        var12.method1102(var16, var17);
        if (arg0 == arg9) {
            class379.field5542.method471(var17 - 1, (byte) 40, 18, -256, var16 - 1, 18);
        }
        class716.method4001(var16 + 18, (byte) -102, var17 + 18, var17 + -1, var16 - 1);
        class381 var19 = class51.method376((byte) -18);
        var19.field5561 = var16;
        var19.field5560 = var17 + 16;
        var19.field5567 = var17;
        var19.field5562 = arg9;
        var19.field5559 = var16 + 16;
        class735.field10181.method106(var19, (byte) 119);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lwp;[IIZ)V")
    public static final void method3126(class192 arg0, int[] arg1, int arg2, boolean arg3) {
        if (arg0.field1799 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field1799.length; var5++) {
                if (arg0.field1799[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field1827 != -1) {
                class489 var6 = class6.field65.method1034(arg0.field1827, 0);
                int var7 = var6.field6786;
                if (var7 == 1) {
                    arg0.field1806 = 0;
                    arg0.field1829 = arg2;
                    arg0.field1795 = 0;
                    arg0.field1817 = 0;
                    arg0.field1870 = 1;
                    if (!arg0.field1823) {
                        class586.method3259(arg0, 0, var6, arg0.field1795);
                    }
                }
                if (var7 == 2) {
                    arg0.field1817 = 0;
                }
            }
        }
        if (arg3) {
            method3126(null, null, 102, true);
        }
        field7466++;
        boolean var8 = true;
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg0.field1799 == null || arg0.field1799[var9] == -1 || class6.field65.method1034(arg1[var9], 0).field6778 >= class6.field65.method1034(arg0.field1799[var9], 0).field6778) {
                arg0.field1799 = arg1;
                arg0.field1888 = arg0.field1883;
                arg0.field1829 = arg2;
            }
        }
        if (var8) {
            arg0.field1829 = arg2;
            arg0.field1799 = arg1;
            arg0.field1888 = arg0.field1883;
        }
    }
}
