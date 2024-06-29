import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class514 extends class345 {

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Z")
    public static boolean field7516 = false;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "[I")
    public static int[] field7519 = new int[5];

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Ltg;")
    public class514 field7518;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "Ltg;")
    public class514 field7523;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public final void method3021(int arg0) {
        if (arg0 != -2886) {
            return;
        }
        field7521++;
        if (this.field7518 != null) {
            this.field7518.field7523 = this.field7523;
            this.field7523.field7518 = this.field7518;
            this.field7518 = null;
            this.field7523 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static void method3022(boolean arg0) {
        if (arg0) {
            field7516 = false;
        }
        field7519 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lns;")
    public static final class62 method3023(int arg0, int arg1) {
        field7517++;
        class62[] var2 = class194.method1285((byte) -113);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class62 var4 = var2[var3];
            if (var4.field836 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIILnu;)V")
    public static final void method3024(int arg0, int arg1, int arg2, class259 arg3) {
        class306 var4 = class461.method2673(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field4577 = arg3;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IFIIIII[FIFIFI)V")
    public static final void method3025(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, int arg10, float arg11, int arg12) {
        field7522++;
        if (arg2 != -4) {
            field7516 = false;
        }
        int var13 = arg3 - arg4;
        int var14 = arg0 - arg10;
        int var15 = arg6 - arg5;
        float var16 = arg7[2] * (float) var13 + arg7[0] * (float) var14 + arg7[1] * (float) var15;
        float var17 = arg7[5] * (float) var13 + arg7[3] * (float) var14 + arg7[4] * (float) var15;
        float var18 = arg7[8] * (float) var13 + arg7[6] * (float) var14 + arg7[7] * (float) var15;
        float var19;
        float var20;
        if (arg12 == 0) {
            var19 = arg11 + var16 + 0.5F;
            var20 = arg9 + 0.5F - var18;
        } else if (arg12 == 1) {
            var20 = arg9 + var18 + 0.5F;
            var19 = arg11 + var16 + 0.5F;
        } else if (arg12 == 2) {
            var20 = arg1 + 0.5F - var17;
            var19 = arg11 + 0.5F - var16;
        } else if (arg12 == 3) {
            var20 = arg1 + 0.5F - var17;
            var19 = arg11 + var16 + 0.5F;
        } else if (arg12 == 4) {
            var20 = arg1 + 0.5F - var17;
            var19 = arg9 + var18 + 0.5F;
        } else {
            var20 = arg1 + 0.5F - var17;
            var19 = arg9 + 0.5F - var18;
        }
        if (arg8 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg8 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        class110.field1660 = var19;
        class454.field6660 = var20;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static final void method3026(int arg0) {
        field7515++;
        if (arg0 != 0) {
            method3025(96, -2.9831638F, -117, -21, 85, -24, -104, null, 77, -0.64319223F, 73, 0.059754103F, -100);
        }
        class50.field634.method3056(true);
        class349.field5376.method1709((byte) 125);
        class513.field7514.method1709((byte) 114);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLkh;)V")
    public static final void method3027(byte arg0, class400 arg1) {
        field7520++;
        boolean var2 = false;
        if (class86.field1350 == arg1.field6051 || arg1.field5973 == -1 || arg1.field6002 != 0) {
            var2 = true;
        } else {
            class520 var3 = class510.field7490.method575(arg1.field5973, -108);
            if (var3.field7647 || (arg1.field5977 + 1) > var3.field7645[arg1.field5992]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field6051 - arg1.field6054;
            int var5 = class86.field1350 - arg1.field6054;
            int var6 = arg1.field6045 * 128 + arg1.method2419((byte) 107) * 64;
            int var7 = arg1.field5975 * 128 + arg1.method2419((byte) 107) * 64;
            int var8 = arg1.field5990 * 128 + arg1.method2419((byte) 105) * 64;
            int var9 = arg1.field6025 * 128 + (arg1.method2419((byte) 102) * 64);
            arg1.field7681 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field7671 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field6059 = 0;
        if (arg1.field6032 == 0) {
            arg1.method2413(8192, 16383);
        }
        if (arg0 > -30) {
            method3025(107, 1.5444111F, 112, 61, -69, 47, 29, null, -6, -0.10227561F, 68, -1.8914468F, 49);
        }
        if (arg1.field6032 == 1) {
            arg1.method2413(12288, 16383);
        }
        if (arg1.field6032 == 2) {
            arg1.method2413(0, 16383);
        }
        if (arg1.field6032 == 3) {
            arg1.method2413(4096, 16383);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3028(int arg0, int arg1, int arg2, int arg3) {
        if (!class98.method760(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class9.field75;
        int var5 = arg2 << class9.field75;
        int var6 = class249.field3405[arg0].method707(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class9.field75 - 7);
        int var8 = var6 - (0xE6 << class9.field75 - 7);
        int var9 = var6 - (0xEE << class9.field75 - 7);
        if (arg3 == 1) {
            if (var4 > class259.field3860) {
                if (!class486.method2891(var4, var6, var5)) {
                    return false;
                }
                if (!class486.method2891(var4, var6, class280.field4230 + var5)) {
                    return false;
                }
                if (!class486.method2891(var4, var6, class324.field5060 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class486.method2891(var4, var7, var5)) {
                    return false;
                }
                if (!class486.method2891(var4, var7, class280.field4230 + var5)) {
                    return false;
                }
                if (!class486.method2891(var4, var7, class324.field5060 + var5)) {
                    return false;
                }
            }
            if (!class486.method2891(var4, var8, var5)) {
                return false;
            } else if (class486.method2891(var4, var8, class280.field4230 + var5)) {
                return class486.method2891(var4, var8, class324.field5060 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class263.field3924) {
                if (!class486.method2891(var4, var6, class324.field5060 + var5)) {
                    return false;
                }
                if (!class486.method2891(class280.field4230 + var4, var6, class324.field5060 + var5)) {
                    return false;
                }
                if (!class486.method2891(class324.field5060 + var4, var6, class324.field5060 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class486.method2891(var4, var7, class324.field5060 + var5)) {
                    return false;
                }
                if (!class486.method2891(class280.field4230 + var4, var7, class324.field5060 + var5)) {
                    return false;
                }
                if (!class486.method2891(class324.field5060 + var4, var7, class324.field5060 + var5)) {
                    return false;
                }
            }
            if (!class486.method2891(var4, var8, class324.field5060 + var5)) {
                return false;
            } else if (class486.method2891(class280.field4230 + var4, var8, class324.field5060 + var5)) {
                return class486.method2891(class324.field5060 + var4, var8, class324.field5060 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class259.field3860) {
                if (!class486.method2891(class324.field5060 + var4, var6, var5)) {
                    return false;
                }
                if (!class486.method2891(class324.field5060 + var4, var6, class280.field4230 + var5)) {
                    return false;
                }
                if (!class486.method2891(class324.field5060 + var4, var6, class324.field5060 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class486.method2891(class324.field5060 + var4, var7, var5)) {
                    return false;
                }
                if (!class486.method2891(class324.field5060 + var4, var7, class280.field4230 + var5)) {
                    return false;
                }
                if (!class486.method2891(class324.field5060 + var4, var7, class324.field5060 + var5)) {
                    return false;
                }
            }
            if (!class486.method2891(class324.field5060 + var4, var8, var5)) {
                return false;
            } else if (class486.method2891(class324.field5060 + var4, var8, class280.field4230 + var5)) {
                return class486.method2891(class324.field5060 + var4, var8, class324.field5060 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class263.field3924) {
                if (!class486.method2891(var4, var6, var5)) {
                    return false;
                }
                if (!class486.method2891(class280.field4230 + var4, var6, var5)) {
                    return false;
                }
                if (!class486.method2891(class324.field5060 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class486.method2891(var4, var7, var5)) {
                    return false;
                }
                if (!class486.method2891(class280.field4230 + var4, var7, var5)) {
                    return false;
                }
                if (!class486.method2891(class324.field5060 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class486.method2891(var4, var8, var5)) {
                return false;
            } else if (class486.method2891(class280.field4230 + var4, var8, var5)) {
                return class486.method2891(class324.field5060 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class486.method2891(class280.field4230 + var4, var9, class280.field4230 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class486.method2891(var4, var8, class324.field5060 + var5);
        } else if (arg3 == 32) {
            return class486.method2891(class324.field5060 + var4, var8, class324.field5060 + var5);
        } else if (arg3 == 64) {
            return class486.method2891(class324.field5060 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class486.method2891(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[I[IZI)V")
    public static final void method3029(int arg0, int[] arg1, int[] arg2, boolean arg3, int arg4) {
        if (arg3) {
            return;
        }
        if (arg4 < arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg0; var10++) {
                if (arg1[var10] < ((var9 & var10) + var7)) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method3029(var6 - 1, arg1, arg2, false, arg4);
            method3029(arg0, arg1, arg2, arg3, var6 + 1);
        }
        field7524++;
    }
}
