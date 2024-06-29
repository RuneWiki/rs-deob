import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class91 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "[Laa;")
    public static class275[] field1348 = new class275[16];

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1349 = "wave2:";

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
    public static int[] field1353 = new int[128];

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lpe;")
    public static class391 field1347;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lrk;")
    public static class427 field1350;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[Lsa;")
    public static class411[] field1351;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([Loa;IZ[BZIIIIIILpe;)V")
    public static final void method800(class151[] arg0, int arg1, boolean arg2, byte[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class391 arg11) {
        field1352++;
        if (arg4) {
            return;
        }
        class289 var12 = new class289(arg3);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1881(32767);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1821(-80);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = (var15 & 0xFE1) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1861((byte) -72);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg5 == var19 && var18 >= arg6 && var18 < (arg6 + 8) && arg10 <= var17 && var17 < arg10 + 8) {
                    class372 var23 = class10.method53(var13, !arg4);
                    int var24 = arg1 + class422.method2598((byte) -27, var23.field5147, var18 & 0x7, var22, arg8, var23.field5206, var17 & 0x7);
                    int var25 = class413.method2555(arg8, var22, var18 & 0x7, -88, var17 & 0x7, var23.field5147, var23.field5206) + arg9;
                    if (var24 > 0 && var25 > 0 && (class116.field1621 - 1) > var24 && class385.field5425 - 1 > var25) {
                        class151 var26 = null;
                        if (!arg2) {
                            int var27 = arg7;
                            if ((class7.field57[1][var24][var25] & 0x2) == 2) {
                                var27 = arg7 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg0[var27];
                            }
                        }
                        class42.method401(88, arg7, var26, arg7, arg2, arg11, arg8 + var22 & 0x3, var25, var21, var13, -1, true, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method801(int arg0) {
        field1349 = null;
        field1350 = null;
        field1348 = null;
        if (arg0 != 7) {
            method801(42);
        }
        field1347 = null;
        field1353 = null;
        field1351 = null;
    }
}
