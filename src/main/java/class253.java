import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class253 {

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public int field4014;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public int field4010;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field4006 = 0;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Z")
    public static boolean field4019 = false;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field4020 = 50;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4018 = new String[field4020];

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "[I")
    public static int[] field4017 = new int[field4020];

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "[I")
    public static int[] field4009 = new int[field4020];

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "[I")
    public static int[] field4016 = new int[field4020];

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "[I")
    public static int[] field4012 = new int[field4020];

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "[I")
    public static int[] field4015 = new int[field4020];

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
    public static int[] field4007 = new int[field4020];

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "[I")
    public static int[] field4013 = new int[field4020];

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method1749(int arg0) {
        field4013 = null;
        if (arg0 != 7489) {
            return;
        }
        field4016 = null;
        field4017 = null;
        field4018 = null;
        field4012 = null;
        field4009 = null;
        field4007 = null;
        field4015 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4008++;
        int var8 = arg7;
        int var9 = 0;
        int var10 = arg7 - arg0;
        int var11 = arg4 * arg4;
        int var12 = 0;
        int var13 = arg4 - arg0;
        int var14 = var13 * var13;
        int var15 = arg7 * arg7;
        int var16 = var10 * var10;
        int var17 = var15 << 1;
        int var18 = var11 << 1;
        int var19 = var16 << 1;
        int var20 = var14 << 1;
        int var21 = var10 << 1;
        int var22 = arg7 << 1;
        int var23 = var15 - ((var22 - 1) * var18);
        int var24 = (1 - var22) * var11 + var17;
        int var25 = var11 << 2;
        int var26 = var16 - ((var21 - 1) * var20);
        int var27 = (1 - var21) * var14 + var19;
        int var28 = var14 << 2;
        int var29 = var17 * 3;
        int var30 = (var22 - 3) * var18;
        int var31 = var16 << 2;
        if (arg1 != -10488) {
            method1751(87, false, 109, -67);
        }
        int var32 = (var21 - 3) * var20;
        int var33 = var15 << 2;
        int var34 = var19 * 3;
        int var35 = (arg7 - 1) * var25;
        int var36 = var33;
        int var37 = var31;
        int var38 = (var10 - 1) * var28;
        int[] var39 = class130.field2005[arg6];
        class71.method451(arg3, true, arg5 - var13, -arg4 + arg5, var39);
        class71.method451(arg2, true, arg5 + var13, -var13 + arg5, var39);
        class71.method451(arg3, true, arg5 + arg4, arg5 - -var13, var39);
        while (var8 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var23 += var36;
                    var9++;
                    var24 += var29;
                    var29 += var33;
                    var36 += var33;
                }
            }
            if (var23 < 0) {
                var9++;
                var24 += var29;
                var23 += var36;
                var29 += var33;
                var36 += var33;
            }
            boolean var40 = var8 <= var10;
            var24 += -var35;
            if (var40) {
                if (var27 < 0) {
                    while (var27 < 0) {
                        var26 += var37;
                        var37 += var31;
                        var27 += var34;
                        var12++;
                        var34 += var31;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var27 += var34;
                    var37 += var31;
                    var34 += var31;
                    var12++;
                }
                var27 += -var38;
                var26 += -var32;
                var32 -= var28;
                var38 -= var28;
            }
            var35 -= var25;
            var23 += -var30;
            int var41 = arg5 + var9;
            var8--;
            var30 -= var25;
            int var42 = arg6 - var8;
            int var43 = arg6 + var8;
            int var44 = arg5 - var9;
            if (var40) {
                int var45 = arg5 + var12;
                int var46 = arg5 - var12;
                class71.method451(arg3, true, var46, var44, class130.field2005[var42]);
                class71.method451(arg2, true, var45, var46, class130.field2005[var42]);
                class71.method451(arg3, true, var41, var45, class130.field2005[var42]);
                class71.method451(arg3, true, var46, var44, class130.field2005[var43]);
                class71.method451(arg2, true, var45, var46, class130.field2005[var43]);
                class71.method451(arg3, true, var41, var45, class130.field2005[var43]);
            } else {
                class71.method451(arg3, true, var41, var44, class130.field2005[var42]);
                class71.method451(arg3, true, var41, var44, class130.field2005[var43]);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBI)V")
    public abstract void method40(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZII)Ljava/lang/String;")
    public static final String method1751(int arg0, boolean arg1, int arg2, int arg3) {
        field4011++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg1 && arg3 >= 0) {
            int var4 = 2;
            int var5 = arg3 / arg0;
            while (var5 != 0) {
                var5 /= arg0;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[arg2] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg0;
                int var9 = var8 - arg0 * arg3;
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
    public abstract void method47(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZI)V")
    public abstract void method44(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(III)V")
    public class253(int arg0, int arg1, int arg2) {
        this.field4014 = arg1;
        this.field4005 = arg2;
        this.field4010 = arg0;
    }
}
