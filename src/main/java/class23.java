import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class23 {

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "[I")
    public static int[] field310 = new int[14];

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Leh;")
    public static class137 field309;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Lwa;")
    public static class243 field302;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)[Lnf;")
    public static final class227[] method131(int arg0) {
        field305++;
        class227[] var1 = new class227[class154.field2407];
        for (int var2 = arg0; var2 < class154.field2407; var2++) {
            byte[] var3 = class293.field4645[var2];
            int var4 = class172.field2726[var2] * class103.field1387[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class172.field2729[class173.method1186(255, var3[var6])];
            }
            var1[var2] = new class227(class286.field4562, class245.field4018, class40.field493[var2], class129.field2072[var2], class103.field1387[var2], class172.field2726[var2], var5);
        }
        class24.method135(arg0 - 103);
        return var1;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field308++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg4 - arg3;
        int var12 = arg4 * arg4;
        int var13 = arg1 * arg1;
        int var14 = var11 * var11;
        int var15 = var12 << 1;
        int var16 = var13 << 1;
        int var17 = arg1 - arg3;
        int var18 = var17 * var17;
        int var19 = var18 << 1;
        int var20 = var14 << 1;
        int var21 = var17 << 1;
        if (arg7 != 69615681) {
            method131(121);
        }
        int var22 = arg1 << 1;
        int var23 = (1 - var22) * var12 + var16;
        int var24 = (1 - var21) * var14 + var19;
        int var25 = var18 - ((var21 - 1) * var20);
        int var26 = var12 << 2;
        int var27 = var13 << 2;
        int var28 = var13 - ((var22 - 1) * var15);
        int var29 = var14 << 2;
        int var30 = var18 << 2;
        int var31 = var16 * 3;
        int var32 = (var22 - 3) * var15;
        int var33 = var19 * 3;
        int var34 = (var21 - 3) * var20;
        int var35 = (arg1 - 1) * var26;
        int var36 = var27;
        int var37 = var30;
        int var38 = (var17 - 1) * var29;
        if (class117.field1656 <= arg2 && class132.field2105 >= arg2) {
            int[] var39 = class14.field186[arg2];
            int var40 = class256.method1750(107, arg6 - arg4, class116.field1653, class114.field1634);
            int var41 = class256.method1750(111, arg4 + arg6, class116.field1653, class114.field1634);
            int var42 = class256.method1750(68, arg6 - var11, class116.field1653, class114.field1634);
            int var43 = class256.method1750(106, arg6 + var11, class116.field1653, class114.field1634);
            class78.method433(var42, var40, var39, arg0, (byte) 123);
            class78.method433(var43, var42, var39, arg5, (byte) 123);
            class78.method433(var41, var43, var39, arg0, (byte) 123);
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var28 += var36;
                    var8++;
                    var36 += var27;
                    var23 += var31;
                    var31 += var27;
                }
            }
            if (var28 < 0) {
                var8++;
                var28 += var36;
                var36 += var27;
                var23 += var31;
                var31 += var27;
            }
            var23 += -var35;
            var35 -= var26;
            boolean var44 = var17 >= var9;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var24 += var33;
                        var33 += var30;
                        var10++;
                        var25 += var37;
                        var37 += var30;
                    }
                }
                if (var25 < 0) {
                    var24 += var33;
                    var25 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var25 += -var34;
                var24 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            var28 += -var32;
            var32 -= var26;
            var9--;
            int var45 = arg2 + var9;
            int var46 = arg2 - var9;
            if (var45 >= class117.field1656 && var46 <= class132.field2105) {
                int var47 = class256.method1750(52, arg6 + var8, class116.field1653, class114.field1634);
                int var48 = class256.method1750(101, arg6 - var8, class116.field1653, class114.field1634);
                if (var44) {
                    int var49 = class256.method1750(116, arg6 + var10, class116.field1653, class114.field1634);
                    int var50 = class256.method1750(arg7 ^ 0x4264028, arg6 - var10, class116.field1653, class114.field1634);
                    if (class117.field1656 <= var46) {
                        int[] var51 = class14.field186[var46];
                        class78.method433(var50, var48, var51, arg0, (byte) 123);
                        class78.method433(var49, var50, var51, arg5, (byte) 123);
                        class78.method433(var47, var49, var51, arg0, (byte) 123);
                    }
                    if (class132.field2105 >= var45) {
                        int[] var52 = class14.field186[var45];
                        class78.method433(var50, var48, var52, arg0, (byte) 123);
                        class78.method433(var49, var50, var52, arg5, (byte) 123);
                        class78.method433(var47, var49, var52, arg0, (byte) 123);
                    }
                } else {
                    if (class117.field1656 <= var46) {
                        class78.method433(var47, var48, class14.field186[var46], arg0, (byte) 123);
                    }
                    if (class132.field2105 >= var45) {
                        class78.method433(var47, var48, class14.field186[var45], arg0, (byte) 123);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Lrb;")
    public static final class135 method133(byte arg0) {
        class149 var1 = new class149(class286.field4562, class245.field4018, class40.field493[0], class129.field2072[0], class103.field1387[0], class172.field2726[0], class293.field4645[0], class172.field2729);
        class24.method135(arg0);
        field307++;
        if (arg0 != -112) {
            method134(74);
        }
        return var1;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static void method134(int arg0) {
        if (arg0 != 5079) {
            field303 = 66;
        }
        field310 = null;
        field302 = null;
        field309 = null;
    }
}
