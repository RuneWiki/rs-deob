import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class74 {

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field929 = -2;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field933 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBI)V")
    public static final void method416(int arg0, byte arg1, int arg2) {
        class233 var3 = class114.method746(arg2, arg1 + 1228126332, 6);
        field928++;
        var3.method1651((byte) 121);
        if (arg1 == 100) {
            var3.field3855 = arg0;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Lvd;")
    public static final class19 method417(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4044; var4++) {
            class19 var5 = var3.field4038[var4];
            if ((var5.field244 >> 29 & 0x3L) == 2L && var5.field240 == arg1 && var5.field235 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIZII)V")
    public static final void method418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field931++;
        if (!arg7) {
            field933 = -58;
        }
        if (arg1 == arg6 && arg4 == arg8 && arg3 == arg5 && arg0 == arg2) {
            class184.method1285(arg6, arg4, -28062, arg3, arg0, arg9);
            return;
        }
        int var10 = arg6;
        int var11 = arg4;
        int var12 = arg6 * 3;
        int var13 = arg4 * 3;
        int var14 = arg8 * 3;
        int var15 = arg1 * 3;
        int var16 = arg5 * 3;
        int var17 = arg2 * 3;
        int var18 = arg0 + var14 - var17 - arg4;
        int var19 = arg3 + var15 - var16 - arg6;
        int var20 = var12 + var16 - var15 - var15;
        int var21 = var15 - var12;
        int var22 = var14 - var13;
        int var23 = var17 - var14 - (-var13 + var14);
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var19 * var26;
            int var28 = var18 * var26;
            int var29 = var20 * var25;
            int var30 = var23 * var25;
            int var31 = var21 * var24;
            int var32 = var22 * var24;
            int var33 = (var28 + var32 + var30 >> 12) + arg4;
            int var34 = (var27 + var29 + var31 >> 12) + arg6;
            class184.method1285(var10, var11, -28062, var34, var33, arg9);
            var11 = var33;
            var10 = var34;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Leh;B[Lnf;)V")
    public static final void method419(class137 arg0, byte arg1, class227[] arg2) {
        field930++;
        if (arg1 != -45) {
            field933 = -107;
        }
        class245.field4021 = arg0;
        class143.field2255 = arg2;
        class297.field4698 = new boolean[class143.field2255.length];
        class170.field2693.method711(true);
        int var3 = class245.field4021.method929((byte) 124, "details");
        int[] var4 = class245.field4021.method942(var3, true);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class170.field2693.method707((long) var4[var5], class226.method1598((byte) -111, new class96(class245.field4021.method928(var3, (byte) 126, var4[var5])), var4[var5]), (byte) 120);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIBZ)I")
    public static final int method420(int arg0, int arg1, byte arg2, boolean arg3) {
        class54 var4 = (class54) class39.field483.method708((long) arg1, 2);
        field926++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        int var6 = -55 / ((-arg2 - 88) / 38);
        for (int var7 = 0; var7 < var4.field689.length; var7++) {
            if (var4.field689[var7] >= 0 && class144.field2288 > var4.field689[var7]) {
                class108 var8 = class256.method1753(-2, var4.field689[var7]);
                if (var8.field1473 != null) {
                    class122 var9 = (class122) var8.field1473.method708((long) arg0, -96);
                    if (var9 != null) {
                        if (arg3) {
                            var5 += var4.field694[var7] * var9.field1733;
                        } else {
                            var5 += var9.field1733;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field927++;
        class266 var13 = new class266();
        var13.field4277 = arg9;
        if (arg8 != 1903) {
            field929 = 72;
        }
        var13.field4283 = arg3;
        var13.field4275 = arg0;
        var13.field4285 = arg7;
        var13.field4293 = arg6;
        var13.field4294 = arg5;
        var13.field4290 = arg11;
        var13.field4292 = arg4;
        var13.field4286 = arg12;
        var13.field4281 = arg1;
        var13.field4291 = arg2;
        var13.field4289 = arg10;
        class221.field3554.method1803(var13, -1);
    }
}
