import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class253 extends class446 {

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
    public static int field3563 = 0;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "Lrn;")
    public static class146 field3560 = null;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
    public int field3566;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "Ljava/lang/String;")
    public String field3562;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "[I")
    public int[] field3557;

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "[I")
    public int[] field3571;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "[Lec;")
    public class129[] field3567;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field3565;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Luo;Lrr;IIIII)V", line = 20)
    public static final void method1689(class345 arg0, class203 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class392.field5617 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class200.field2772) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class264.field3687 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class125 var15 = class328.field4549[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class375.field5354[var12].method737(var13, var14) + class375.field5354[var12].method737(var13 + 1, var14) + class375.field5354[var12].method737(var13, var14 + 1) + class375.field5354[var12].method737(var13 + 1, var14 + 1)) / 4 - (class375.field5354[arg2].method737(arg3, arg4) + class375.field5354[arg2].method737(arg3 + 1, arg4) + class375.field5354[arg2].method737(arg3, arg4 + 1) + class375.field5354[arg2].method737(arg3 + 1, arg4 + 1)) / 4;
                                    class34 var17 = var15.field1756;
                                    class34 var18 = var15.field1761;
                                    if (var17 != null && var17.method683((byte) -116)) {
                                        arg1.method679((var14 - arg4) * 128 + (1 - arg6) * 64, (byte) -126, var16, (var13 - arg3) * 128 + (1 - arg5) * 64, var17, arg0, var7);
                                    }
                                    if (var18 != null && var18.method683((byte) -110)) {
                                        arg1.method679((var14 - arg4) * 128 + (1 - arg6) * 64, (byte) -126, var16, (var13 - arg3) * 128 + (1 - arg5) * 64, var18, arg0, var7);
                                    }
                                    for (class123 var19 = var15.field1749; var19 != null; var19 = var19.field1711) {
                                        class447 var20 = var19.field1709;
                                        if (var20 != null && var20.method683((byte) 118) && (var20.field6261 == var13 || var8 == var13) && (var20.field6258 == var14 || var10 == var14)) {
                                            int var21 = var20.field6272 + 1 - var20.field6261;
                                            int var22 = var20.field6264 + 1 - var20.field6258;
                                            arg1.method679((var20.field6258 - arg4) * 128 + (var22 - arg6) * 64, (byte) -126, var16, (var20.field6261 - arg3) * 128 + (var21 - arg5) * 64, var20, arg0, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Luo;B)V", line = 113)
    public static final void method1690(class345 arg0, byte arg1) {
        field3561++;
        if (class73.field1047 == class142.field2034 || class328.field4549 == null) {
            return;
        }
        if (class376.method2403(arg0, (byte) -71, class142.field2034)) {
            class73.field1047 = class142.field2034;
        }
        if (arg1 != -103) {
            field3560 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V", line = 133)
    public static void method1691(int arg0) {
        field3560 = null;
        if (arg0 != 1) {
            method1692((byte) 89, -12, false, 84, true);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BIZIZ)Lnq;", line = 143)
    public static final class268 method1692(byte arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg0 > -97) {
            field3559 = -8;
        }
        field3568++;
        class99 var5 = null;
        if (class151.field2147 != null) {
            var5 = new class99(arg1, class151.field2147, class155.field2187[arg1], 1000000);
        }
        class273.field3788[arg1] = class75.field1070.method2122(var5, (byte) 120, arg1, class98.field1359);
        if (arg2) {
            class273.field3788[arg1].method1141(-1280662168);
        }
        return new class268(class273.field3788[arg1], arg4, arg3);
    }
}
