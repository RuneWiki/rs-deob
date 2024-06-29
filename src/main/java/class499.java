import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class499 {

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "B")
    public byte field7211;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "[I")
    public static int[] field7210 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "Z")
    public static boolean field7219 = false;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "Z")
    public static boolean field7226 = true;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "Lbo;")
    public class245 field7215;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "Lhfa;")
    public class465 field7218;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "Lhfa;")
    public class465 field7223;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "Lq;")
    public static class490 field7213;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "Liba;")
    public class498 field7217;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "Lru;")
    public class499 field7225;

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "Ltn;")
    public class570 field7230;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "Ltq;")
    public class94 field7228;

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "Ltq;")
    public class94 field7231;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "S")
    public short field7214;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "S")
    public short field7216;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "S")
    public short field7224;

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "S")
    public short field7232;

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(I)V")
    public class499(int arg0) {
        this.field7211 = (byte) arg0;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V")
    public static void method2875(boolean arg0) {
        field7213 = null;
        if (!arg0) {
            method2875(false);
        }
        field7210 = null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BLnp;)Laea;")
    public static final class39 method2876(byte arg0, class115 arg1) {
        field7212++;
        int var2 = arg1.method643((byte) -77);
        class240 var3 = class579.method3275(0)[arg1.method620((byte) -128)];
        class648 var4 = class564.method3198(25624)[arg1.method620((byte) -127)];
        if (arg0 <= 15) {
            return null;
        } else {
            int var5 = arg1.method676(-5);
            int var6 = arg1.method676(-5);
            return new class39(var2, var3, var4, var5, var6);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method2877(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class101.method549(arg0, 16);
        field7222++;
        int var7 = 0;
        int var8 = arg0 - arg3;
        int var9 = 73 % ((arg5 + 25) / 58);
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = arg0;
        int var11 = -arg0;
        int var12 = var8;
        int var13 = -var8;
        int var14 = -1;
        if (arg4 >= class93.field949 && class360.field4834 >= arg4) {
            int[] var15 = class557.field7954[arg4];
            int var16 = class266.method1567(class412.field5526, true, class72.field740, arg1 - arg0);
            int var17 = class266.method1567(class412.field5526, true, class72.field740, arg0 + arg1);
            int var18 = class266.method1567(class412.field5526, true, class72.field740, arg1 - var8);
            int var19 = class266.method1567(class412.field5526, true, class72.field740, arg1 + var8);
            class315.method1809(var15, arg2, -128, var16, var18);
            class315.method1809(var15, arg6, -128, var18, var19);
            class315.method1809(var15, arg2, -128, var19, var17);
        }
        int var20 = -1;
        while (var7 < var10) {
            var14 += 2;
            var20 += 2;
            var11 += var14;
            var13 += var20;
            if (var13 >= 0 && var12 >= 1) {
                var12--;
                class537.field7559[var12] = var7;
                var13 -= var12 << 1;
            }
            var7++;
            if (var11 >= 0) {
                var10--;
                var11 -= var10 << 1;
                int var21 = arg4 - var10;
                int var22 = arg4 + var10;
                if (var22 >= class93.field949 && var21 <= class360.field4834) {
                    if (var8 <= var10) {
                        int var23 = class266.method1567(class412.field5526, true, class72.field740, arg1 + var7);
                        int var24 = class266.method1567(class412.field5526, true, class72.field740, arg1 - var7);
                        if (class360.field4834 >= var22) {
                            class315.method1809(class557.field7954[var22], arg2, -128, var24, var23);
                        }
                        if (class93.field949 <= var21) {
                            class315.method1809(class557.field7954[var21], arg2, -128, var24, var23);
                        }
                    } else {
                        int var25 = class537.field7559[var10];
                        int var26 = class266.method1567(class412.field5526, true, class72.field740, arg1 + var7);
                        int var27 = class266.method1567(class412.field5526, true, class72.field740, arg1 - var7);
                        int var28 = class266.method1567(class412.field5526, true, class72.field740, arg1 + var25);
                        int var29 = class266.method1567(class412.field5526, true, class72.field740, arg1 - var25);
                        if (var22 <= class360.field4834) {
                            int[] var30 = class557.field7954[var22];
                            class315.method1809(var30, arg2, -128, var27, var29);
                            class315.method1809(var30, arg6, -128, var29, var28);
                            class315.method1809(var30, arg2, -128, var28, var26);
                        }
                        if (var21 >= class93.field949) {
                            int[] var31 = class557.field7954[var21];
                            class315.method1809(var31, arg2, -128, var27, var29);
                            class315.method1809(var31, arg6, -128, var29, var28);
                            class315.method1809(var31, arg2, -128, var28, var26);
                        }
                    }
                }
            }
            int var32 = arg4 - var7;
            int var33 = arg4 + var7;
            if (var33 >= class93.field949 && class360.field4834 >= var32) {
                int var34 = arg1 + var10;
                int var35 = arg1 - var10;
                if (class412.field5526 <= var34 && var35 <= class72.field740) {
                    int var36 = class266.method1567(class412.field5526, true, class72.field740, var34);
                    int var37 = class266.method1567(class412.field5526, true, class72.field740, var35);
                    if (var7 >= var8) {
                        if (var33 <= class360.field4834) {
                            class315.method1809(class557.field7954[var33], arg2, -128, var37, var36);
                        }
                        if (var32 >= class93.field949) {
                            class315.method1809(class557.field7954[var32], arg2, -128, var37, var36);
                        }
                    } else {
                        int var38 = var12 < var7 ? class537.field7559[var7] : var12;
                        int var39 = class266.method1567(class412.field5526, true, class72.field740, arg1 + var38);
                        int var40 = class266.method1567(class412.field5526, true, class72.field740, arg1 - var38);
                        if (var33 <= class360.field4834) {
                            int[] var41 = class557.field7954[var33];
                            class315.method1809(var41, arg2, -128, var37, var40);
                            class315.method1809(var41, arg6, -128, var40, var39);
                            class315.method1809(var41, arg2, -128, var39, var36);
                        }
                        if (class93.field949 <= var32) {
                            int[] var42 = class557.field7954[var32];
                            class315.method1809(var42, arg2, -128, var37, var40);
                            class315.method1809(var42, arg6, -128, var40, var39);
                            class315.method1809(var42, arg2, -128, var39, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
    public final void method2878(byte arg0) {
        field7220++;
        if (arg0 != 6) {
            this.field7231 = null;
        }
        while (this.field7215 != null) {
            class245 var2 = this.field7215.field3027;
            this.field7215.method1445(-1);
            this.field7215 = var2;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IILjava/lang/String;IIIILho;Lwp;Lla;Lua;I)V")
    public static final void method2879(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, class463 arg7, class452 arg8, class413 arg9, class598 arg10, int arg11) {
        field7229++;
        int var12;
        if (class538.field7572 == 4) {
            var12 = (int) class508.field7300 & 0x3FFF;
        } else {
            var12 = (int) class508.field7300 + class302.field3748 & 0x3FFF;
        }
        int var13 = Math.max(arg8.field6483 / 2, arg8.field6443 / 2) + 10;
        int var14 = 41 / ((-arg0 - 74) / 37);
        int var15 = arg3 * arg3 + arg4 * arg4;
        if (var15 > var13 * var13) {
            return;
        }
        int var16 = class435.field6134[var12];
        int var17 = class435.field6135[var12];
        if (class538.field7572 != 4) {
            var17 = var17 * 256 / (class373.field5085 + 256);
            var16 = var16 * 256 / (class373.field5085 + 256);
        }
        int var18 = arg3 * var16 + arg4 * var17 >> 14;
        int var19 = arg3 * var17 - (arg4 * var16) >> 14;
        int var20 = arg7.method2664(arg2, null, 100, (byte) 21);
        int var21 = arg7.method2660(100, false, 0, arg2, null);
        int var22 = var18 - var20 / 2;
        if (var22 >= (-arg8.field6483) && arg8.field6483 >= var22 && (-arg8.field6443) <= var19 && arg8.field6443 >= var19) {
            arg9.method2313(null, arg10, arg6, -90, 1, 0, var20, arg8.field6443 / 2 + arg6 - var21 - (arg1 + var19), 50, 0, 0, arg5, var22 + arg11 + (arg8.field6483 / 2), arg2, arg11, null);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public static final void method2880(int arg0) {
        if (class39.field394 != null) {
            class39.field394.method3552(56);
        }
        field7221++;
        if (class637.field8964 != null) {
            class637.field8964.method3552(49);
        }
        if (arg0 != -882) {
            field7227 = -100;
        }
    }
}
