import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class168 implements class379 {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "[F")
    public float[] field2104;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public int field2103;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field2101 = 0;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field2106 = 0;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[IIIB)V", line = 6)
    public static final void method980(int arg0, int[] arg1, int arg2, int arg3, byte arg4) {
        field2099++;
        int var5 = -97 % ((-arg4 - 66) / 57);
        arg2--;
        int var9 = arg3 - 1;
        int var6 = var9 - 7;
        while (var6 > arg2) {
            int var7 = arg2 + 1;
            arg1[var7] = arg0;
            int var8 = var7 + 1;
            arg1[var8] = arg0;
            int var10 = var8 + 1;
            arg1[var10] = arg0;
            int var11 = var10 + 1;
            arg1[var11] = arg0;
            int var12 = var11 + 1;
            arg1[var12] = arg0;
            int var13 = var12 + 1;
            arg1[var13] = arg0;
            int var14 = var13 + 1;
            arg1[var14] = arg0;
            arg2 = var14 + 1;
            arg1[arg2] = arg0;
        }
        while (arg2 < var9) {
            arg2++;
            arg1[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BZLoi;)V", line = 36)
    public static final void method981(byte arg0, boolean arg1, class74 arg2) {
        field2105++;
        class351 var3 = arg2.method548(1);
        if (arg2.field895 == 0) {
            class330.field4458 = -1;
            class68.field754 = 0;
            arg2.field894 = 0;
            return;
        }
        if (arg2.field871 != -1 && arg2.field855 == 0) {
            class300 var4 = class460.field6365.method1090(arg2.field871, 16383);
            if (arg2.field897 > 0 && var4.field4045 == 0) {
                arg2.field894++;
                class330.field4458 = -1;
                class68.field754 = 0;
                return;
            }
            if (arg2.field897 <= 0 && var4.field4039 == 0) {
                class68.field754 = 0;
                arg2.field894++;
                class330.field4458 = -1;
                return;
            }
        }
        if (arg2.field829 != -1 && arg2.field844 <= class406.field5732) {
            class49 var5 = class303.field4090.method3521(2, arg2.field829);
            if (var5.field496 && var5.field497 != -1) {
                class300 var6 = class460.field6365.method1090(var5.field497, 16383);
                if (arg2.field897 > 0 && var6.field4045 == 0) {
                    arg2.field894++;
                    class68.field754 = 0;
                    class330.field4458 = -1;
                    return;
                }
                if (arg2.field897 <= 0 && var6.field4039 == 0) {
                    arg2.field894++;
                    class330.field4458 = -1;
                    class68.field754 = 0;
                    return;
                }
            }
        }
        int var7 = -69 / ((-arg0 - 55) / 50);
        if (arg2.field829 != -1 && class406.field5732 >= arg2.field844) {
            class49 var8 = class303.field4090.method3521(2, arg2.field829);
            if (var8.field496 && var8.field497 != -1) {
                class300 var9 = class460.field6365.method1090(var8.field497, 16383);
                if (arg2.field897 > 0 && var9.field4045 == 0) {
                    class68.field754 = 0;
                    arg2.field894++;
                    class330.field4458 = -1;
                    return;
                }
                if (arg2.field897 <= 0 && var9.field4039 == 0) {
                    arg2.field894++;
                    class330.field4458 = -1;
                    class68.field754 = 0;
                    return;
                }
            }
        }
        int var10 = arg2.field2170;
        int var11 = arg2.field2165;
        int var12 = arg2.field898[arg2.field895 - 1] * 512 + arg2.method543(0) * 256;
        int var13 = arg2.field899[arg2.field895 - 1] * 512 + (arg2.method543(0) * 256);
        if (var10 < var12) {
            if (var11 < var13) {
                arg2.method551(10240, -8193);
            } else if (var11 > var13) {
                arg2.method551(14336, -8193);
            } else {
                arg2.method551(12288, -8193);
            }
        } else if (var12 < var10) {
            if (var11 < var13) {
                arg2.method551(6144, -8193);
            } else if (var11 <= var13) {
                arg2.method551(4096, -8193);
            } else {
                arg2.method551(2048, -8193);
            }
        } else if (var13 > var11) {
            arg2.method551(8192, -8193);
        } else if (var11 > var13) {
            arg2.method551(0, -8193);
        }
        byte var14 = arg2.field904[arg2.field895 - 1];
        if (!arg1 && var12 - var10 > 1024 || (var12 - var10) < -1024 || (var13 - var11) > 1024 || var13 - var11 < -1024) {
            arg2.field2170 = var12;
            arg2.field2165 = var13;
            arg2.method556(arg2.field873, false, 75);
            class330.field4458 = -1;
            if (arg2.field897 > 0) {
                arg2.field897--;
            }
            arg2.field895--;
            class68.field754 = 0;
            return;
        }
        int var15 = 16;
        boolean var16 = true;
        if (arg2 instanceof class215) {
            var16 = ((class215) arg2).field2589.field3638;
        }
        if (var16) {
            int var17 = arg2.field873 - arg2.field854.field9270;
            if (var17 != 0 && arg2.field809 == -1 && arg2.field872 != 0) {
                var15 = 8;
            }
            if (!arg1 && arg2.field895 > 2) {
                var15 = 24;
            }
            if (!arg1 && arg2.field895 > 3) {
                var15 = 32;
            }
        } else {
            if (!arg1 && arg2.field895 > 1) {
                var15 = 24;
            }
            if (!arg1 && arg2.field895 > 2) {
                var15 = 32;
            }
        }
        if (arg2.field894 > 0 && arg2.field895 > 1) {
            var15 = 32;
            arg2.field894--;
        }
        if (var14 == 2) {
            var15 <<= 0x1;
        } else if (var14 == 0) {
            var15 >>= 0x1;
        }
        if (var3.field4696 != -1) {
            int var18 = var15 << 9;
            if (arg2.field895 == 1) {
                int var19 = arg2.field896 * arg2.field896;
                int var20 = (arg2.field2170 <= var12 ? var12 - arg2.field2170 : arg2.field2170 - var12) << 9;
                int var21 = (var13 < arg2.field2165 ? arg2.field2165 - var13 : -arg2.field2165 + var13) << 9;
                int var22 = var20 > var21 ? var20 : var21;
                int var23 = var3.field4696 * 2 * var22;
                if (var23 < var19) {
                    arg2.field896 /= 2;
                } else if ((var19 / 2) > var22) {
                    arg2.field896 -= var3.field4696;
                    if (arg2.field896 < 0) {
                        arg2.field896 = 0;
                    }
                } else if (arg2.field896 < var18) {
                    arg2.field896 += var3.field4696;
                    if (var18 < arg2.field896) {
                        arg2.field896 = var18;
                    }
                }
            } else if (arg2.field896 < var18) {
                arg2.field896 += var3.field4696;
                if (arg2.field896 > var18) {
                    arg2.field896 = var18;
                }
            } else if (arg2.field896 > 0) {
                arg2.field896 -= var3.field4696;
                if (arg2.field896 < 0) {
                    arg2.field896 = 0;
                }
            }
            var15 = arg2.field896 >> 9;
            if (var15 < 1) {
                var15 = 1;
            }
        }
        class68.field754 = 0;
        if (var10 == var12 && var11 == var13) {
            class330.field4458 = -1;
        } else {
            if (var12 > var10) {
                arg2.field2170 += var15;
                class68.field754 |= 0x4;
                if (var12 < arg2.field2170) {
                    arg2.field2170 = var12;
                }
            } else if (var12 < var10) {
                class68.field754 |= 0x8;
                arg2.field2170 -= var15;
                if (arg2.field2170 < var12) {
                    arg2.field2170 = var12;
                }
            }
            if (var15 < 32) {
                class330.field4458 = var14;
            } else {
                class330.field4458 = 2;
            }
            if (var11 < var13) {
                class68.field754 |= 0x1;
                arg2.field2165 += var15;
                if (var13 < arg2.field2165) {
                    arg2.field2165 = var13;
                }
            } else if (var13 < var11) {
                class68.field754 |= 0x2;
                arg2.field2165 -= var15;
                if (arg2.field2165 < var13) {
                    arg2.field2165 = var13;
                }
            }
        }
        if (arg2.field2170 == var12 && arg2.field2165 == var13) {
            if (arg2.field897 > 0) {
                arg2.field897--;
            }
            arg2.field895--;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(II)V", line = 388)
    public class168(int arg0, int arg1) {
        this.field2102 = arg1;
        this.field2104 = new float[arg0 * arg1];
        this.field2103 = arg0;
    }
}
