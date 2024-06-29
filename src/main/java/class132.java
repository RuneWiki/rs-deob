import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class132 {

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2500 = 0;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Ljd;")
    public static class86 field2502 = class122.method868("Lade Schrifts-=tze )2 ", true);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2497 = 0;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "[I")
    public static int[] field2504 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Ljd;")
    public static class86 field2498 = class122.method868(")3)3)3", true);

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "Ljd;")
    private static class86 field2507 = class122.method868("Opened title screen", true);

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Ljd;")
    public static class86 field2506 = field2507;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2499 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method941(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 0;
        field2503++;
        int var10 = arg7 - arg3;
        int var11 = arg2;
        if (arg4) {
            field2506 = null;
        }
        int var12 = arg2 - arg3;
        int var13 = arg7 * arg7;
        int var14 = arg2 * arg2;
        int var15 = var10 * var10;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var16 << 1;
        int var19 = var13 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var16 - (var22 - 1) * var20;
        int var25 = var14 - (var21 - 1) * var19;
        int var26 = (1 - var22) * var15 + var18;
        int var27 = var14 << 2;
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = (var21 - 3) * var19;
        int var31 = var16 << 2;
        int var32 = var17 * 3;
        int var33 = var27;
        int var34 = (var22 - 3) * var20;
        int var35 = var18 * 3;
        int var36 = var31;
        int var37 = (arg2 - 1) * var28;
        if (arg5 >= class50.field1050 && arg5 <= class56.field1143) {
            int[] var38 = class249.field4420[arg5];
            int var39 = class171.method1221(class129.field2473, class49.field1044, 21419, arg6 - arg7);
            int var40 = class171.method1221(class129.field2473, class49.field1044, 21419, arg6 + arg7);
            int var41 = class171.method1221(class129.field2473, class49.field1044, 21419, arg6 - var10);
            int var42 = class171.method1221(class129.field2473, class49.field1044, 21419, arg6 + var10);
            class56.method412(arg0, (byte) -115, var41, var38, var39);
            class56.method412(arg1, (byte) -97, var42, var38, var41);
            class56.method412(arg0, (byte) -117, var40, var38, var42);
        }
        int var43 = (var12 - 1) * var29;
        while (var11 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var25 += var33;
                    var8++;
                    var33 += var27;
                    var23 += var32;
                    var32 += var27;
                }
            }
            boolean var44 = var11 <= var12;
            if (var25 < 0) {
                var23 += var32;
                var8++;
                var32 += var27;
                var25 += var33;
                var33 += var27;
            }
            if (var44) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var24 += var36;
                        var26 += var35;
                        var35 += var31;
                        var36 += var31;
                        var9++;
                    }
                }
                if (var24 < 0) {
                    var24 += var36;
                    var36 += var31;
                    var9++;
                    var26 += var35;
                    var35 += var31;
                }
                var26 += -var43;
                var24 += -var34;
                var34 -= var29;
                var43 -= var29;
            }
            var11--;
            int var45 = arg5 + var11;
            var23 += -var37;
            var37 -= var28;
            int var46 = arg5 - var11;
            var25 += -var30;
            if (var45 >= class50.field1050 && class56.field1143 >= var46) {
                int var47 = class171.method1221(class129.field2473, class49.field1044, 21419, arg6 + var8);
                int var48 = class171.method1221(class129.field2473, class49.field1044, 21419, arg6 - var8);
                if (var44) {
                    int var49 = class171.method1221(class129.field2473, class49.field1044, 21419, arg6 + var9);
                    int var50 = class171.method1221(class129.field2473, class49.field1044, 21419, arg6 - var9);
                    if (var46 >= class50.field1050) {
                        int[] var51 = class249.field4420[var46];
                        class56.method412(arg0, (byte) -124, var50, var51, var48);
                        class56.method412(arg1, (byte) -117, var49, var51, var50);
                        class56.method412(arg0, (byte) -111, var47, var51, var49);
                    }
                    if (var45 <= class56.field1143) {
                        int[] var52 = class249.field4420[var45];
                        class56.method412(arg0, (byte) -99, var50, var52, var48);
                        class56.method412(arg1, (byte) -126, var49, var52, var50);
                        class56.method412(arg0, (byte) -98, var47, var52, var49);
                    }
                } else {
                    if (class50.field1050 <= var46) {
                        class56.method412(arg0, (byte) -110, var47, class249.field4420[var46], var48);
                    }
                    if (var45 <= class56.field1143) {
                        class56.method412(arg0, (byte) -95, var47, class249.field4420[var45], var48);
                    }
                }
            }
            var30 -= var28;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method942(int arg0) {
        field2498 = null;
        field2502 = null;
        field2499 = null;
        field2506 = null;
        field2504 = null;
        field2507 = null;
        if (arg0 > -22) {
            field2497 = -124;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZ[IJ)Ljd;")
    public static final class86 method943(int arg0, boolean arg1, int[] arg2, long arg3) {
        field2508++;
        if (class151.field2826 != null) {
            class86 var5 = class151.field2826.method1051(arg3, arg0, false, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        if (!arg1) {
            field2500 = -6;
        }
        return arg0 == 5 ? class202.method1440(arg3, (byte) 101).method608((byte) 41) : class14.method106(arg3, (byte) -54);
    }
}
