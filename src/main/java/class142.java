import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class142 extends class176 {

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public int field3040;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field3038 = 0;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Lgg;")
    private static class63 field3043 = class116.method911(43, "M");

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "[I")
    public static int[] field3045 = new int[32768];

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Lgg;")
    public static class63 field3042 = field3043;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "Lgg;")
    public static class63 field3050 = field3043;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "Lgg;")
    public static class63 field3046 = class116.method911(43, "gr-Un:");

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "Lgg;")
    public static class63 field3053 = class116.method911(43, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field3048 = -2;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "Z")
    public static boolean field3051 = false;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Lgg;")
    public static class63 field3041 = class116.method911(43, ":assist:");

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "Lgg;")
    public static class63 field3052 = class116.method911(43, ":clanreq:");

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)V")
    public static void method1018(boolean arg0) {
        field3053 = null;
        field3045 = null;
        field3050 = null;
        field3052 = null;
        if (arg0) {
            method1021(null, 41);
        }
        field3041 = null;
        field3043 = null;
        field3046 = null;
        field3042 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(II)V")
    public class142(int arg0, int arg1) {
        this.field3047 = arg0;
        this.field3040 = arg1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static final void method1019(byte arg0) {
        class32.field781.method1((byte) -13);
        field3049++;
        for (int var1 = 0; var1 < 32; var1++) {
            class99.field2343[var1] = 0L;
        }
        if (arg0 == 41) {
            for (int var2 = 0; var2 < 32; var2++) {
                class78.field1889[var2] = 0L;
            }
            class21.field509 = 0;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIILd;IZJ)Z")
    public static final boolean method1020(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class30 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                if (var13 < 0 || var20 < 0 || var13 >= class199.field3979 || var20 >= class13.field298) {
                    return false;
                }
                class96 var21 = class148.field3117[arg0][var13][var20];
                if (var21 != null && var21.field2272 >= 5) {
                    return false;
                }
            }
        }
        class98 var14 = new class98();
        var14.field2319 = arg11;
        var14.field2315 = arg0;
        var14.field2318 = arg5;
        var14.field2331 = arg6;
        var14.field2328 = arg7;
        var14.field2316 = arg8;
        var14.field2326 = arg9;
        var14.field2330 = arg1;
        var14.field2325 = arg2;
        var14.field2324 = arg1 + arg3 - 1;
        var14.field2321 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                int var17 = 0;
                if (var15 > arg1) {
                    var17++;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; var18--) {
                    if (class148.field3117[var18][var15][var16] == null) {
                        class148.field3117[var18][var15][var16] = new class96(var18, var15, var16);
                    }
                }
                class96 var19 = class148.field3117[arg0][var15][var16];
                var19.field2284[var19.field2272] = var14;
                var19.field2290[var19.field2272] = var17;
                var19.field2288 |= var17;
                var19.field2272++;
            }
        }
        if (arg10) {
            class59.field1515[class90.field2116++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([BI)Lth;")
    public static final class179 method1021(byte[] arg0, int arg1) {
        field3044++;
        if (arg1 <= 5) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            class179 var2 = new class179(arg0, class163.field3366, class60.field1521, class190.field3875, class190.field3868, class110.field2486, class85.field2014);
            class12.method151((byte) 61);
            return var2;
        }
    }
}
