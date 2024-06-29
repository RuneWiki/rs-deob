import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class186 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lcf;")
    public static class93 field3429 = class147.method1066("Clientscript error )2 check log for details", -48);

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lcf;")
    public static class93 field3433 = class147.method1066("Fichiers config charg-Bs", -48);

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field3434 = 0;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[I")
    public static int[] field3436 = new int[14];

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Lcf;")
    public static class93 field3439 = class147.method1066(":trade:", -48);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Lth;")
    public static class111 field3438;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Ldh;")
    public static class120 field3437;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method1353(int arg0) {
        if (arg0 != 14) {
            return;
        }
        field3439 = null;
        field3429 = null;
        field3438 = null;
        field3436 = null;
        field3437 = null;
        field3433 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static final void method1354(byte arg0) {
        while (true) {
            class241 var1 = (class241) class118.field2095.method1158(1375765729);
            if (var1 == null) {
                field3431++;
                if (arg0 >= -103) {
                    field3436 = null;
                    return;
                }
                return;
            }
            class210 var3;
            if (var1.field4356 >= 0) {
                int var2 = var1.field4356 - 1;
                var3 = class155.field2709[var2];
            } else {
                int var4 = -var1.field4356 - 1;
                if (class141.field2446 == var4) {
                    var3 = class166.field2927;
                } else {
                    var3 = class224.field4031[var4];
                }
            }
            if (var3 != null) {
                class240 var5 = class34.method197(-114, var1.field4346);
                int var6;
                int var7;
                if (var1.field4350 == 1 || var1.field4350 == 3) {
                    var7 = var5.field4285;
                    var6 = var5.field4288;
                } else {
                    var6 = var5.field4285;
                    var7 = var5.field4288;
                }
                int var8 = (var7 >> 1) + var1.field4357;
                int var9 = var1.field4357 + (var7 + 1 >> 1);
                int var10 = (var6 >> 1) + var1.field4353;
                int var11 = (var6 + 1 >> 1) + var1.field4353;
                int[][] var12 = class233.field4151[class138.field2405];
                class211 var13 = null;
                int var14 = var12[var8][var10] + var12[var9][var11] + var12[var9][var10] + var12[var8][var11] >> 2;
                int var15 = class80.field1490[var1.field4358];
                if (var15 == 0) {
                    class70 var16 = class128.method935(class138.field2405, var1.field4357, var1.field4353);
                    if (var16 != null) {
                        var13 = var16.field1269;
                    }
                } else if (var15 == 1) {
                    class24 var17 = class136.method999(class138.field2405, var1.field4357, var1.field4353);
                    if (var17 != null) {
                        var13 = var17.field295;
                    }
                } else if (var15 == 2) {
                    class229 var18 = class112.method803(class138.field2405, var1.field4357, var1.field4353);
                    if (var18 != null) {
                        var13 = var18.field4104;
                    }
                } else if (var15 == 3) {
                    class30 var19 = class136.method997(class138.field2405, var1.field4357, var1.field4353);
                    if (var19 != null) {
                        var13 = var19.field459;
                    }
                }
                if (var13 != null) {
                    class159.method1150(var1.field4353, var15, (byte) 7, var1.field4354 + 1, 0, class138.field2405, var1.field4352 + 1, var1.field4357, -1, 0);
                    int var20 = var1.field4343;
                    var3.field3790 = var13;
                    var3.field3831 = var1.field4357 * 128 + var7 * 64;
                    var3.field3813 = class275.field4921 + var1.field4354;
                    var3.field3853 = var14;
                    var3.field3839 = class275.field4921 + var1.field4352;
                    int var21 = var1.field4351;
                    int var22 = var1.field4355;
                    var3.field3788 = var1.field4353 * 128 + (var6 * 64);
                    int var23 = var1.field4344;
                    if (var21 > var22) {
                        int var24 = var21;
                        var21 = var22;
                        var22 = var24;
                    }
                    if (var23 < var20) {
                        int var25 = var20;
                        var20 = var23;
                        var23 = var25;
                    }
                    var3.field3822 = var1.field4357 + var21;
                    var3.field3850 = var1.field4353 + var23;
                    var3.field3849 = var1.field4357 + var22;
                    var3.field3838 = var1.field4353 + var20;
                }
            }
        }
    }
}
