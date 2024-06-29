import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class130 extends class359 {

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "[B")
    public byte[] field1797;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field1803 = 0;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field1804 = -11713997;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Lgp;")
    public static class31 field1801;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIBII)V")
    public static final void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        int var10 = -39 % ((-arg7 - 86) / 38);
        field1799++;
        if (arg0 == arg1 && arg3 == arg4 && arg6 == arg9 && arg5 == arg8) {
            class20.method138(-80, arg0, arg6, arg4, arg5, arg2);
            return;
        }
        int var11 = arg0;
        int var12 = arg4;
        int var13 = arg0 * 3;
        int var14 = arg4 * 3;
        int var15 = arg1 * 3;
        int var16 = arg3 * 3;
        int var17 = arg9 * 3;
        int var18 = arg8 * 3;
        int var19 = arg6 + var15 - arg0 - var17;
        int var20 = arg5 + var16 - var18 - arg4;
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 + var18 - var16 - var16;
        int var23 = var15 - var13;
        int var24 = var16 - var14;
        for (int var25 = 128; var25 <= 4096; var25 += 128) {
            int var26 = var25 * var25 >> 12;
            int var27 = var25 * var26 >> 12;
            int var28 = var19 * var27;
            int var29 = var20 * var27;
            int var30 = var21 * var26;
            int var31 = var22 * var26;
            int var32 = var23 * var25;
            int var33 = var24 * var25;
            int var34 = (var28 + var30 + var32 >> 12) + arg0;
            int var35 = arg4 + (var31 + var33 + var29 >> 12);
            class20.method138(-65, var11, var34, var12, var35, arg2);
            var12 = var35;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static void method780(int arg0) {
        field1801 = null;
        if (arg0 != 24783) {
            field1803 = -51;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static final void method781(boolean arg0) {
        if (arg0) {
            method781(true);
        }
        field1802++;
        if (class180.field2475 == null) {
            return;
        }
        while (true) {
            while (class153.field2148 < class426.field6192.length) {
                class175 var1 = class426.field6192[class153.field2148];
                if (var1 != null && var1.field2439 == -1) {
                    if (class413.field5964 == null) {
                        class413.field5964 = class180.field2475.method1264((byte) -125, var1.field2436);
                    }
                    int var2 = class413.field5964.field2351;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field2439 = var2;
                    class413.field5964 = null;
                    class153.field2148++;
                } else {
                    class153.field2148++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
    public class130(byte[] arg0) {
        this.field1797 = arg0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V")
    public static final void method782(boolean arg0, int arg1) {
        field1798++;
        byte[][] var2;
        if (arg0) {
            var2 = class98.field1109;
        } else {
            var2 = class239.field3252;
        }
        int var3 = class349.field5097.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class71.field805[var4] >> 8) * 64 - class40.field427;
                int var7 = (class71.field805[var4] & 0xFF) * 64 - class217.field2975;
                class58.method365(arg1 - 230093538);
                class366.method2313(class54.field613, arg0, var7, class218.field2991, var6, var5, false);
            }
        }
        if (arg1 != 230066952) {
            method782(true, -14);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method783(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1800++;
        class420.method2609(arg4, (byte) -113);
        int var7 = 0;
        int var8 = arg4 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class318.field4522[arg0];
        if (arg5 != 3) {
            return;
        }
        int var16 = arg2 - var8;
        int var17 = arg2 + var8;
        class105.method564(arg1, arg2 - arg4, arg5 + -3, var15, var16);
        class105.method564(arg6, var16, 0, var15, var17);
        class105.method564(arg1, var17, 0, var15, arg2 + arg4);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class299.field4267[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 >= var8) {
                    int[] var18 = class318.field4522[arg0 + var9];
                    int[] var19 = class318.field4522[arg0 - var9];
                    int var20 = arg2 + var7;
                    int var21 = arg2 - var7;
                    class105.method564(arg1, var21, 0, var18, var20);
                    class105.method564(arg1, var21, 0, var19, var20);
                } else {
                    int[] var22 = class318.field4522[arg0 + var9];
                    int[] var23 = class318.field4522[arg0 - var9];
                    int var24 = class299.field4267[var9];
                    int var25 = arg2 + var7;
                    int var26 = arg2 - var7;
                    int var27 = arg2 + var24;
                    int var28 = arg2 - var24;
                    class105.method564(arg1, var26, arg5 ^ 0x3, var22, var28);
                    class105.method564(arg6, var28, 0, var22, var27);
                    class105.method564(arg1, var27, arg5 - 3, var22, var25);
                    class105.method564(arg1, var26, 0, var23, var28);
                    class105.method564(arg6, var28, 0, var23, var27);
                    class105.method564(arg1, var27, arg5 - 3, var23, var25);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class318.field4522[arg0 + var7];
            int[] var30 = class318.field4522[arg0 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var7 >= var8) {
                class105.method564(arg1, var32, 0, var29, var31);
                class105.method564(arg1, var32, 0, var30, var31);
            } else {
                int var33 = var7 > var11 ? class299.field4267[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class105.method564(arg1, var32, 0, var29, var35);
                class105.method564(arg6, var35, 0, var29, var34);
                class105.method564(arg1, var34, 0, var29, var31);
                class105.method564(arg1, var32, arg5 ^ 0x3, var30, var35);
                class105.method564(arg6, var35, 0, var30, var34);
                class105.method564(arg1, var34, arg5 - 3, var30, var31);
            }
        }
    }
}
