import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class196 extends class241 {

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Loh;")
    public static class263 field3544 = class253.method1681(-125, "runes");

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field3568 = 0;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field3574 = -1;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field3566 = 0;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public int field3549;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public int field3554;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public int field3555;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public int field3571;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "Ldb;")
    public class17 field3575;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "Lkd;")
    public class199 field3567;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "Lik;")
    public class250 field3569;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "Lue;")
    public static class86 field3547;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Luh;")
    public class98 field3548;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)I")
    public static final int method1338(int arg0, byte arg1) {
        field3551++;
        class59 var2 = class6.method41((byte) 124, arg0);
        int var3 = var2.field1224;
        int var4 = var2.field1228;
        int var5 = var2.field1230;
        if (arg1 == 37) {
            int var6 = class277.field4852[var3 - var4];
            return class48.field1038[var5] >> var4 & var6;
        } else {
            return 123;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)I")
    public static final int method1339(int arg0) {
        field3552++;
        return arg0 < 68 ? 71 : class244.field4300;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZLqk;Lqk;)V")
    public static final void method1340(boolean arg0, class202 arg1, class202 arg2) {
        field3570++;
        if (arg2.field3652 != null) {
            arg2.method1401((byte) 27);
        }
        if (!arg0) {
            method1338(114, (byte) -62);
        }
        arg2.field3644 = arg1.field3644;
        arg2.field3652 = arg1;
        arg2.field3652.field3644 = arg2;
        arg2.field3644.field3652 = arg2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZIIII)V")
    public static final void method1341(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        class178.method1199(arg6, -113);
        field3563++;
        if (arg2) {
            return;
        }
        int var8 = arg6;
        int var9 = -arg6;
        int var10 = arg6 - arg4;
        if (var10 < 0) {
            var10 = 0;
        }
        int[] var11 = class38.field870[arg1];
        int var12 = var10;
        int var13 = -var10;
        int var14 = arg0 - var10;
        int var15 = -1;
        class191.method1255(arg0 - arg6, arg5, var14, 118, var11);
        int var16 = -1;
        int var17 = arg0 + var10;
        class191.method1255(var14, arg3, var17, 124, var11);
        class191.method1255(var17, arg5, arg0 + arg6, 82, var11);
        while (var8 > var7) {
            var15 += 2;
            var16 += 2;
            var13 += var15;
            var9 += var16;
            if (var13 >= 0 && var12 >= 1) {
                class94.field1857[var12] = var7;
                var12--;
                var13 -= var12 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var8--;
                if (var8 < var10) {
                    int[] var18 = class38.field870[arg1 + var8];
                    int[] var19 = class38.field870[arg1 - var8];
                    int var20 = arg0 - var7;
                    int var21 = class94.field1857[var8];
                    int var22 = arg0 + var21;
                    int var23 = arg0 - var21;
                    int var24 = arg0 + var7;
                    class191.method1255(var20, arg5, var23, 81, var18);
                    class191.method1255(var23, arg3, var22, 98, var18);
                    class191.method1255(var22, arg5, var24, 107, var18);
                    class191.method1255(var20, arg5, var23, 107, var19);
                    class191.method1255(var23, arg3, var22, 97, var19);
                    class191.method1255(var22, arg5, var24, 64, var19);
                } else {
                    int[] var25 = class38.field870[arg1 + var8];
                    int[] var26 = class38.field870[arg1 - var8];
                    int var27 = arg0 - var7;
                    int var28 = arg0 + var7;
                    class191.method1255(var27, arg5, var28, 87, var25);
                    class191.method1255(var27, arg5, var28, 100, var26);
                }
                var9 -= var8 << 1;
            }
            int[] var29 = class38.field870[arg1 - var7];
            int[] var30 = class38.field870[arg1 + var7];
            int var31 = arg0 + var8;
            int var32 = arg0 - var8;
            if (var10 <= var7) {
                class191.method1255(var32, arg5, var31, 112, var30);
                class191.method1255(var32, arg5, var31, 105, var29);
            } else {
                int var33 = var12 < var7 ? class94.field1857[var7] : var12;
                int var34 = arg0 - var33;
                class191.method1255(var32, arg5, var34, 122, var30);
                int var35 = arg0 + var33;
                class191.method1255(var34, arg3, var35, 100, var30);
                class191.method1255(var35, arg5, var31, 109, var30);
                class191.method1255(var32, arg5, var34, 98, var29);
                class191.method1255(var34, arg3, var35, 122, var29);
                class191.method1255(var35, arg5, var31, 93, var29);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    public static void method1342(int arg0) {
        field3547 = null;
        if (arg0 == -959597599) {
            field3544 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public final void method1343(byte arg0) {
        this.field3548 = null;
        this.field3575 = null;
        this.field3569 = null;
        this.field3567 = null;
        if (arg0 != 68) {
            method1340(true, (class202) null, (class202) null);
        }
        field3557++;
    }
}
