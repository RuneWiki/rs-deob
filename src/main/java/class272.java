import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class272 extends class154 {

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "Ljava/util/Random;")
    public static Random field4341 = new Random();

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field4344 = 50;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public int field4334;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Lim;")
    public class178 field4337;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Lim;")
    public class178 field4345;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lul;")
    public static class191 field4332;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Ljava/lang/String;")
    public String field4333;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Z")
    public boolean field4331;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "[Ljava/lang/Object;")
    public Object[] field4340;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)Lqc;")
    public static final class159 method1771(int arg0, int arg1) {
        class159 var2 = (class159) class277.field4401.method950((long) arg1, (byte) -45);
        field4339++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class271.field4323.method2050(arg0 ^ 0x72, arg0, arg1);
        class159 var4 = new class159();
        if (var3 != null) {
            var4.method989(new class215(var3), arg1, arg0 ^ 0x56E9);
        }
        class277.field4401.method942((long) arg1, (byte) 102, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)Z")
    public static final boolean method1772(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class17.field302; var3++) {
            class185 var4 = class156.field2155[var3];
            if (var4.field2815 == 1) {
                int var5 = var4.field2801 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2800 * var5 >> 8) + var4.field2811;
                    int var7 = (var4.field2814 * var5 >> 8) + var4.field2816;
                    int var8 = (var4.field2818 * var5 >> 8) + var4.field2817;
                    int var9 = (var4.field2807 * var5 >> 8) + var4.field2804;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2815 == 2) {
                int var10 = arg0 - var4.field2801;
                if (var10 > 0) {
                    int var11 = (var4.field2800 * var10 >> 8) + var4.field2811;
                    int var12 = (var4.field2814 * var10 >> 8) + var4.field2816;
                    int var13 = (var4.field2818 * var10 >> 8) + var4.field2817;
                    int var14 = (var4.field2807 * var10 >> 8) + var4.field2804;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2815 == 3) {
                int var15 = var4.field2811 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2819 * var15 >> 8) + var4.field2801;
                    int var17 = (var4.field2809 * var15 >> 8) + var4.field2797;
                    int var18 = (var4.field2818 * var15 >> 8) + var4.field2817;
                    int var19 = (var4.field2807 * var15 >> 8) + var4.field2804;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2815 == 4) {
                int var20 = arg2 - var4.field2811;
                if (var20 > 0) {
                    int var21 = (var4.field2819 * var20 >> 8) + var4.field2801;
                    int var22 = (var4.field2809 * var20 >> 8) + var4.field2797;
                    int var23 = (var4.field2818 * var20 >> 8) + var4.field2817;
                    int var24 = (var4.field2807 * var20 >> 8) + var4.field2804;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2815 == 5) {
                int var25 = arg1 - var4.field2817;
                if (var25 > 0) {
                    int var26 = (var4.field2819 * var25 >> 8) + var4.field2801;
                    int var27 = (var4.field2809 * var25 >> 8) + var4.field2797;
                    int var28 = (var4.field2800 * var25 >> 8) + var4.field2811;
                    int var29 = (var4.field2814 * var25 >> 8) + var4.field2816;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
    public static void method1773(int arg0) {
        if (arg0 <= 28) {
            field4332 = null;
        }
        field4332 = null;
        field4341 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static final void method1774(byte arg0) {
        int var1 = 23 % ((15 - arg0) / 47);
        class182.field2764.method948((byte) 58);
        field4342++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lej;IIIIII)V")
    public static final void method1775(class213 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4335++;
        long var7 = 0L;
        if (arg1 == 0) {
            var7 = class51.method312(arg4, arg5, arg6);
        } else if (arg1 == 1) {
            var7 = class5.method27(arg4, arg5, arg6);
        } else if (arg1 == 2) {
            var7 = class156.method970(arg4, arg5, arg6);
        } else if (arg1 == 3) {
            var7 = class169.method1079(arg4, arg5, arg6);
        }
        boolean var9 = true;
        boolean var10 = false;
        int var11 = arg3 & (int) (var7 >>> 32);
        int var12 = ((int) var7 & 0x3E87D1) >> 20;
        class240 var13 = class265.method1717(-96, var11);
        boolean var14 = false;
        int var15 = ((int) var7 & 0x7D0ED) >> 14;
        if (var13.method1579(true)) {
            class19.method129(arg4, arg6, arg5, var13, arg3 - 2147483590);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg1 == 0) {
            class169.method1077(arg4, arg5, arg6);
            if (var13.field3779 != 0) {
                arg0.method1341(17607, arg6, var15, !var13.field3723, var12, arg5, var13.field3715);
            }
        } else if (arg1 == 1) {
            class92.method599(arg4, arg5, arg6);
        } else if (arg1 == 2) {
            class208.method1295(arg4, arg5, arg6);
            if (var13.field3779 != 0 && var13.field3713 + arg5 < 104 && var13.field3713 + arg6 < 104 && var13.field3760 + arg5 < 104 && var13.field3760 + arg6 < 104) {
                arg0.method1333(!var13.field3723, arg6, (byte) -98, var13.field3715, var13.field3713, var13.field3760, arg5, var12);
            }
        } else if (arg1 == 3) {
            class5.method24(arg4, arg5, arg6);
            if (var13.field3779 == 1) {
                arg0.method1335(arg5, -262145, arg6);
            }
        }
        if (var13.field3766 != null) {
            class240 var20 = var13.method1567(-1);
            return;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)I")
    public static final int method1776(int arg0, byte arg1) {
        if (arg1 >= -74) {
            method1773(-16);
        }
        field4347++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1777(byte[] arg0, int arg1) {
        field4338++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class285.method1880(arg0, arg1, var3, 0, var2);
        return var3;
    }
}
