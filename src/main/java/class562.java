import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class562 {

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "B")
    public byte field8340;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field8335;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public int field8338;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Ljava/lang/String;")
    public String field8332;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "Ljava/lang/String;")
    public String field8333;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "Ljava/lang/String;")
    public String field8336;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "Ljava/lang/String;")
    public String field8339;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "[Lsa;")
    public static class543[] field8337;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BIIII)V")
    public static final void method3286(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < arg3) {
            class69.method418(arg1, class47.field558[arg4], arg3, (byte) 117, arg2);
        } else {
            class69.method418(arg1, class47.field558[arg4], arg2, (byte) 117, arg3);
        }
        int var5 = 59 % ((arg0 + 45) / 44);
        field8334++;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BI)V")
    public static final void method3287(byte arg0, int arg1) {
        field8331++;
        class621 var2 = class442.method2691(arg1, 10, true);
        if (arg0 < 86) {
            method3289(28, 52, 72, 121, 54, -1, 110, 124);
        }
        var2.method3598(255);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
    public static void method3288(byte arg0) {
        if (arg0 <= -35) {
            field8337 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8335++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg6 - arg7;
        int var12 = arg1 - arg7;
        int var13 = arg6 * arg6;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        if (arg0 < 106) {
            return;
        }
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class483.field7334 <= arg5 && class202.field3021 >= arg5) {
            int[] var39 = class47.field558[arg5];
            int var40 = class406.method2430(class130.field1712, arg3 - arg6, class401.field5755, 64);
            int var41 = class406.method2430(class130.field1712, arg3 + arg6, class401.field5755, 64);
            int var42 = class406.method2430(class130.field1712, arg3 - var11, class401.field5755, 64);
            int var43 = class406.method2430(class130.field1712, arg3 + var11, class401.field5755, 64);
            class69.method418(arg2, var39, var42, (byte) 117, var40);
            class69.method418(arg4, var39, var43, (byte) 117, var42);
            class69.method418(arg2, var39, var41, (byte) 117, var43);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (var46 >= class483.field7334 && class202.field3021 >= var45) {
                int var47 = class406.method2430(class130.field1712, arg3 + var8, class401.field5755, 64);
                int var48 = class406.method2430(class130.field1712, arg3 - var8, class401.field5755, 64);
                if (var44) {
                    int var49 = class406.method2430(class130.field1712, arg3 + var10, class401.field5755, 64);
                    int var50 = class406.method2430(class130.field1712, arg3 - var10, class401.field5755, 64);
                    if (class483.field7334 <= var45) {
                        int[] var51 = class47.field558[var45];
                        class69.method418(arg2, var51, var50, (byte) 117, var48);
                        class69.method418(arg4, var51, var49, (byte) 117, var50);
                        class69.method418(arg2, var51, var47, (byte) 117, var49);
                    }
                    if (class202.field3021 >= var46) {
                        int[] var52 = class47.field558[var46];
                        class69.method418(arg2, var52, var50, (byte) 117, var48);
                        class69.method418(arg4, var52, var49, (byte) 117, var50);
                        class69.method418(arg2, var52, var47, (byte) 117, var49);
                    }
                } else {
                    if (var45 >= class483.field7334) {
                        class69.method418(arg2, class47.field558[var45], var47, (byte) 117, var48);
                    }
                    if (var46 <= class202.field3021) {
                        class69.method418(arg2, class47.field558[var46], var47, (byte) 117, var48);
                    }
                }
            }
        }
    }
}
