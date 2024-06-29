import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class42 extends class35 {

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field636 = "red:";

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "[I")
    public static int[] field644 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lof;")
    public class421 field639;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field647;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Z")
    public boolean field638;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "[I")
    public static int[] field640;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
    public static void method343(byte arg0) {
        field640 = null;
        field644 = null;
        int var1 = -119 % ((arg0 - 32) / 36);
        field636 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BILrc;ILja;Lbq;IIIIIZIII)Lrc;")
    public static final class100 method344(byte arg0, int arg1, class100 arg2, int arg3, class90 arg4, class51 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12, int arg13, int arg14) {
        field642++;
        if (arg2 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg5 != null) {
            int var16 = var15 | arg5.method410(-1, false, arg12, false);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg13 << 32) + (long) ((arg7 << 24) + (arg1 << 16) + arg6) + ((long) arg8 << 48);
        int var19 = 43 % ((arg0 + 54) / 52);
        class18 var20 = class439.field6386;
        class100 var21;
        synchronized (class439.field6386) {
            var21 = (class100) class439.field6386.method103(0, var17);
        }
        if (var21 == null || arg4.method677(var21.method560(), var15) != 0) {
            if (var21 != null) {
                var15 = arg4.method713(var15, var21.method560());
            }
            byte var22;
            if (arg6 == 1) {
                var22 = 9;
            } else if (arg6 == 2) {
                var22 = 12;
            } else if (arg6 == 3) {
                var22 = 15;
            } else if (arg6 == 4) {
                var22 = 18;
            } else {
                var22 = 21;
            }
            byte var23 = 3;
            int[] var24 = new int[] { 64, 96, 128 };
            class382 var25 = new class382((var22 * var23) + 1, var22 * var23 * 2 + -var22, 0);
            int var26 = var25.method2421(0, 0, 0, (byte) -123);
            int[][] var27 = new int[var23][var22];
            for (int var28 = 0; var28 < var23; var28++) {
                int var29 = var24[var28];
                int var30 = var24[var28];
                for (int var31 = 0; var31 < var22; var31++) {
                    int var32 = (var31 << 14) / var22;
                    int var33 = class56.field897[var32] * var29 >> 15;
                    int var34 = class56.field898[var32] * var30 >> 15;
                    var27[var28][var31] = var25.method2421(var34, var33, 0, (byte) -63);
                }
            }
            for (int var35 = 0; var35 < var23; var35++) {
                int var36 = (var35 * 256 + 128) / var23;
                int var37 = 256 - var36;
                byte var38 = (byte) (arg1 * var37 + arg7 * var36 >> 8);
                short var39 = (short) (((arg8 & 0xFC00) * var36 + (arg13 & 0xFC00) * var37 & 0xFC0000) + ((arg8 & 0x380) * var36 + (arg13 & 0x380) * var37 & 0x38000) + ((arg8 & 0x7F) * var36 + (arg13 & 0x7F) * var37 & 0x7F00) >> 8);
                for (int var40 = 0; var40 < var22; var40++) {
                    if (var35 == 0) {
                        var25.method2424((byte) 1, -95, var27[0][var40], var38, var27[0][(var40 + 1) % var22], var26, (byte) -1, var39, (short) -1);
                    } else {
                        var25.method2424((byte) 1, 80, var27[var35][(var40 + 1) % var22], var38, var27[var35 - 1][(var40 + 1) % var22], var27[var35 - 1][var40], (byte) -1, var39, (short) -1);
                        var25.method2424((byte) 1, -94, var27[var35][var40], var38, var27[var35][(var40 + 1) % var22], var27[var35 - 1][var40], (byte) -1, var39, (short) -1);
                    }
                }
            }
            var21 = arg4.method735(var25, var15, class265.field3977, 64, 768);
            class18 var41 = class439.field6386;
            synchronized (class439.field6386) {
                class439.field6386.method113(var21, 0, var17);
            }
        }
        int var42 = arg6 * 64 - 1;
        int var43 = -var42;
        int var44 = -var42;
        int var45 = var42;
        int var46 = var42;
        if (arg11) {
            if (arg9 > 9216 && arg9 < 15360) {
                var45 = var42 + 128;
            }
            if (arg9 > 1024 && arg9 < 7168) {
                var43 -= 128;
            }
            if (arg9 > 13312 || arg9 < 3072) {
                var44 -= 128;
            }
            if (arg9 > 5120 && arg9 < 11264) {
                var46 = var42 + 128;
            }
        }
        int var47 = arg2.method561();
        int var48 = arg2.method546();
        int var49 = arg2.method521();
        if (var48 > var45) {
            var48 = var45;
        }
        int var50 = arg2.method565();
        if (var49 < var44) {
            var49 = var44;
        }
        if (var47 < var43) {
            var47 = var43;
        }
        if (var50 > var46) {
            var50 = var46;
        }
        class293 var51 = null;
        if (arg5 != null) {
            int var52 = arg5.field835[arg12];
            var51 = class132.method1099(false, var52 >> 16);
            arg12 = var52 & 0xFFFF;
        }
        class100 var53;
        if (var51 == null) {
            var53 = var21.method518((byte) 3, var15, true);
            var53.method539((var48 - var47) / 2, 128, (var50 - var49) / 2);
            var53.method523((var47 + var48) / 2, 0, (var49 + var50) / 2);
        } else {
            var53 = var21.method518((byte) 3, var15, true);
            var53.method539((var48 - var47) / 2, 128, (var50 - var49) / 2);
            var53.method523((var47 + var48) / 2, 0, (var49 + var50) / 2);
            var53.method832(false, var51, arg12);
        }
        if (arg10 != 0) {
            var53.method543(arg10);
        }
        if (arg14 != 0) {
            var53.method519(arg14);
        }
        if (arg3 != 0) {
            var53.method523(0, arg3, 0);
        }
        return var53;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILja;IIIIIII)V")
    public static final void method345(int arg0, class90 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field643++;
        class395 var9 = (class395) class219.method1656(arg8, arg0, arg6);
        if (var9 != null) {
            class45 var10 = class451.method2812(48, var9.method1013(false));
            int var11 = var9.method1020(15829) & 0x3;
            int var12 = var9.method1024(arg2 ^ 0x50AC);
            if (var10.field699 == -1) {
                int var13 = arg4;
                if (var10.field697 > 0) {
                    var13 = arg7;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg1.method692(arg3, arg5, 1, 4, var13);
                    } else if (var11 == 1) {
                        arg1.method718(4, arg2 ^ 0x79, arg3, arg5, var13);
                    } else if (var11 == 2) {
                        arg1.method692(arg3, arg5 + 3, 1, 4, var13);
                    } else if (var11 == 3) {
                        arg1.method718(4, 6, arg3 + 3, arg5, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg1.method736(1, (byte) -40, var13, 1, arg5, arg3);
                    } else if (var11 == 1) {
                        arg1.method736(1, (byte) -40, var13, 1, arg5 + 3, arg3);
                    } else if (var11 == 2) {
                        arg1.method736(1, (byte) -40, var13, 1, arg5 + 3, arg3 + 3);
                    } else if (var11 == 3) {
                        arg1.method736(1, (byte) -40, var13, 1, arg5, arg3 + 3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg1.method718(4, 6, arg3, arg5, var13);
                    } else if (var11 == 1) {
                        arg1.method692(arg3, arg5 + 3, 1, 4, var13);
                    } else if (var11 == 2) {
                        arg1.method718(4, 6, arg3 + 3, arg5, var13);
                    } else if (var11 == 3) {
                        arg1.method692(arg3, arg5, arg2 ^ 0x7E, 4, var13);
                    }
                }
            } else {
                class192.method1479(arg3, (byte) -10, arg5, arg1, var10, var11);
            }
        }
        class395 var14 = (class395) class371.method2358(arg8, arg0, arg6, field647 == null ? (field647 = method348("sc")) : field647);
        if (var14 != null) {
            class45 var15 = class451.method2812(117, var14.method1013(false));
            int var16 = var14.method1020(15829) & 0x3;
            int var17 = var14.method1024(20691);
            if (var15.field699 != -1) {
                class192.method1479(arg3, (byte) -10, arg5, arg1, var15, var16);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field697 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg1.method723(15281, arg3, arg3 + 3, arg5, arg5 + 3, var18);
                } else {
                    arg1.method723(arg2 ^ 0x3BCE, arg3 + 3, arg3, arg5, arg5 + 3, var18);
                }
            }
        }
        if (arg2 != 127) {
            field640 = null;
        }
        class395 var19 = (class395) class37.method311(arg8, arg0, arg6);
        if (var19 == null) {
            return;
        }
        class45 var20 = class451.method2812(63, var19.method1013(false));
        int var21 = var19.method1020(15829) & 0x3;
        if (var20.field699 != -1) {
            class192.method1479(arg3, (byte) -10, arg5, arg1, var20, var21);
            return;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZZIIIII)V")
    public static final void method346(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg0) {
            method347(23, 107, false, -36);
        }
        class336.field4815 = arg6;
        class198.field2889 = arg2;
        class372.field5277 = arg4;
        class423.field6165 = arg5;
        field645++;
        class347.field4911 = arg3;
        if (arg1 && class372.field5277 >= 100) {
            class265.field3985 = class347.field4911 * 128 + 64;
            class286.field4288 = class423.field6165 * 128 + 64;
            class437.field6364 = class109.method957(class286.field4288, class265.field3985, class367.field5213, 20663) - class336.field4815;
        }
        class322.field4643 = 2;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZI)I")
    public static final int method347(int arg0, int arg1, boolean arg2, int arg3) {
        field641++;
        class188 var4 = (class188) class319.field4606.method1219((long) arg3, -88);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        int var6 = 0;
        if (arg0 >= -55) {
            method343((byte) -121);
        }
        while (var4.field2781.length > var6) {
            if (var4.field2781[var6] >= 0 && var4.field2781[var6] < class100.field1555) {
                class124 var7 = class206.method1561(-69, var4.field2781[var6]);
                int var8 = var7.method1049(arg1, class392.method2497(arg1, 0).field5993, false);
                if (arg2) {
                    var5 += var4.field2780[var6] * var8;
                } else {
                    var5 += var8;
                }
            }
            var6++;
        }
        return var5;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method348(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
