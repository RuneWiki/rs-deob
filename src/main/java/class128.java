import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class128 implements class181 {

    @OriginalMember(owner = "client!om", name = "b", descriptor = "[I")
    public static int[] field1930 = new int[14];

    @OriginalMember(owner = "client!om", name = "f", descriptor = "[C")
    public static char[] field1934 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!om", name = "m", descriptor = "F")
    public static float field1941;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public int field1935;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public int field1946;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "Z")
    public boolean field1933;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "[I")
    public static int[] field1936;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/awt/Component;IBLne;)Ldh;", line = 5)
    public static final class192 method964(int arg0, Component arg1, int arg2, byte arg3, class76 arg4) {
        field1942++;
        if (class231.field3248 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class192 var5 = (class192) Class.forName("ks").getDeclaredConstructor().newInstance();
                var5.field2778 = new int[(class105.field1478 ? 2 : 1) * 256];
                var5.field2784 = arg0;
                var5.method1187(arg1);
                var5.field2782 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field2782 > 16384) {
                    var5.field2782 = 16384;
                }
                var5.method1189(var5.field2782);
                if (class52.field671 > 0 && class274.field3750 == null) {
                    class274.field3750 = new class142();
                    class274.field3750.field2073 = arg4;
                    arg4.method586(class274.field3750, (byte) 103, class52.field671);
                }
                if (class274.field3750 != null) {
                    if (class274.field3750.field2081[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class274.field3750.field2081[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class292 var6 = new class292(arg4, arg2);
                    var6.field2778 = new int[(class105.field1478 ? 2 : 1) * 256];
                    var6.field2784 = arg0;
                    var6.method1187(arg1);
                    if (arg3 != -113) {
                        field1941 = -0.98916566F;
                    }
                    var6.field2782 = 16384;
                    var6.method1189(var6.field2782);
                    if (class52.field671 > 0 && class274.field3750 == null) {
                        class274.field3750 = new class142();
                        class274.field3750.field2073 = arg4;
                        arg4.method586(class274.field3750, (byte) 103, class52.field671);
                    }
                    if (class274.field3750 != null) {
                        if (class274.field3750.field2081[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class274.field3750.field2081[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class192();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lm;I)Z", line = 90)
    public final boolean method965(class181 arg0, int arg1) {
        field1931++;
        if (!(arg0 instanceof class128)) {
            return false;
        }
        class128 var3 = (class128) arg0;
        if (arg1 < 63) {
            field1930 = null;
        }
        if (this.field1946 != var3.field1946) {
            return false;
        } else if (this.field1937 != var3.field1937) {
            return false;
        } else if (this.field1938 != var3.field1938) {
            return false;
        } else if (this.field1939 != var3.field1939) {
            return false;
        } else if (this.field1932 != var3.field1932) {
            return false;
        } else if (this.field1935 == var3.field1935) {
            return this.field1933 == var3.field1933;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)J", line = 134)
    public final long method966(int arg0) {
        field1929++;
        long[] var2 = class451.field6494;
        long var3 = -1L;
        if (arg0 >= -82) {
            method969(false, (class185) null, (byte) 108);
        }
        long var5 = var2[(int) (((long) this.field1946 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field1937 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field1937) & 0xFFL)];
        long var11 = var2[(int) ((var9 ^ (long) (this.field1938 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field1938 >> 16)) & 0xFFL)];
        long var15 = var2[(int) (((long) (this.field1938 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field1938) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field1939) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field1932 >> 24)) & 0xFFL)];
        long var23 = var2[(int) ((var21 ^ (long) (this.field1932 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) (((long) (this.field1932 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) ((var25 ^ (long) this.field1932) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field1935) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) (((long) (this.field1933 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Ltd;", line = 163)
    public static final class107 method967(int arg0, int arg1) {
        if (arg1 != -1979350136) {
            method967(-88, 33);
        }
        field1943++;
        class107 var2 = (class107) class316.field4285.method515(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class30.field412.method1926(arg1 ^ 0x8A058388, arg0 & 0x7FFF, 1);
        } else {
            var3 = class56.field735.method1926(0, arg0, 1);
        }
        class107 var4 = new class107();
        if (var3 != null) {
            var4.method813(new class366(var3), (byte) -111);
        }
        if (arg0 >= 32768) {
            var4.method814((byte) 127);
        }
        class316.field4285.method519((long) arg0, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BIILea;ILgf;I)V", line = 195)
    public static final void method968(byte arg0, int arg1, int arg2, class58 arg3, int arg4, class202 arg5, int arg6) {
        if (class273.field3726 < 100) {
            class354.method2128(70, arg5, arg3);
        }
        field1944++;
        arg3.method227(arg4, arg2, arg4 + arg1, arg2 - -arg6);
        if (class273.field3726 < 100) {
            byte var7 = 20;
            int var8 = arg1 / 2 + arg4;
            int var9 = arg6 / 2 + arg2 - var7 - 18;
            arg3.method245(arg4, arg2, arg1, arg6, -16777216, 0);
            arg3.method190(var8 - 152, var9, 304, 34, class304.field4142[class139.field2038].getRGB(), 0);
            arg3.method245(var8 - 150, var9 + 2, class273.field3726 * 3, 30, class380.field5244[class139.field2038].getRGB(), 0);
            class269.field3685.method484(-1, class429.field5979.method2313((byte) -84, class445.field6241), class427.field5942[class139.field2038].getRGB(), var8, var7 + var9, -87);
            return;
        }
        int var10 = class350.field4719 - ((int) ((float) arg1 / class333.field4493));
        int var11 = (int) ((float) arg6 / class333.field4493) + class274.field3747;
        if (arg0 < 81) {
            method968((byte) 78, -11, 54, (class58) null, -79, (class202) null, -32);
        }
        int var12 = class350.field4719 + ((int) ((float) arg1 / class333.field4493));
        class87.field1224 = class274.field3747 - ((int) ((float) arg6 / class333.field4493));
        class92.field1290 = (int) ((float) (arg1 * 2) / class333.field4493);
        class442.field6222 = class350.field4719 - ((int) ((float) arg1 / class333.field4493));
        class278.field3788 = (int) ((float) (arg6 * 2) / class333.field4493);
        int var13 = class274.field3747 - ((int) ((float) arg6 / class333.field4493));
        class333.method2030(var10 + class333.field4518, class333.field4514 + var11, class333.field4518 + var12, class333.field4514 + var13, arg4, arg2, arg1 + arg4, arg2 - -arg6 + 1);
        class333.method2020(arg3);
        class162 var14 = class333.method2024(arg3);
        class200.method1374(var14, 124, arg3, 0, 0);
        if (class318.field4336 > 0) {
            class432.field6098--;
            if (class432.field6098 == 0) {
                class318.field4336--;
                class432.field6098 = 20;
            }
        }
        if (!class132.field1977) {
            return;
        }
        int var15 = arg1 + arg4 - 5;
        int var16 = arg2 + arg6 - 8;
        class31.field432.method495(var16, "Fps:" + class84.field1181, var15, -1, 350, 16776960);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class31.field432.method495(var20, "Mem:" + var18 + "k", var15, -1, 350, var19);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLjq;B)V", line = 278)
    public static final void method969(boolean arg0, class185 arg1, byte arg2) {
        field1940++;
        class60 var3 = arg1.method1283((byte) -34);
        if (arg1.field2654 == 0) {
            class341.field4616 = -1;
            arg1.field2664 = 0;
            class391.field5429 = 0;
            return;
        }
        if (arg1.field2619 != -1 && arg1.field2617 == 0) {
            class83 var4 = class408.method2521((byte) -115, arg1.field2619);
            if (arg1.field2666 > 0 && var4.field1147 == 0) {
                class341.field4616 = -1;
                class391.field5429 = 0;
                arg1.field2664++;
                return;
            }
            if (arg1.field2666 <= 0 && var4.field1149 == 0) {
                class341.field4616 = -1;
                arg1.field2664++;
                class391.field5429 = 0;
                return;
            }
        }
        if (arg1.field2636 != -1 && class246.field3467 >= arg1.field2633) {
            class344 var5 = class186.method1296(arg1.field2636, false);
            if (var5.field4650 && var5.field4648 != -1) {
                class83 var6 = class408.method2521((byte) -125, var5.field4648);
                if (arg1.field2666 > 0 && var6.field1147 == 0) {
                    class391.field5429 = 0;
                    arg1.field2664++;
                    class341.field4616 = -1;
                    return;
                }
                if (arg1.field2666 <= 0 && var6.field1149 == 0) {
                    arg1.field2664++;
                    class391.field5429 = 0;
                    class341.field4616 = -1;
                    return;
                }
            }
        }
        int var7 = arg1.field40;
        int var8 = arg1.field44;
        int var9 = arg1.field2662[arg1.field2654 - 1] * 128 + arg1.method1285(-122) * 64;
        int var10 = arg1.field2659[arg1.field2654 - 1] * 128 + (arg1.method1285(-114) * 64);
        if (!arg0 && var9 - var7 > 256 || var9 - var7 < -256 || var10 - var8 > 256 || (var10 - var8) < -256) {
            class391.field5429 = 0;
            class341.field4616 = -1;
            arg1.field40 = var9;
            arg1.field44 = var10;
            return;
        }
        if (var9 <= var7) {
            if (var9 >= var7) {
                if (var8 < var10) {
                    arg1.method1289(8192, true);
                } else if (var10 < var8) {
                    arg1.method1289(0, true);
                }
            } else if (var8 < var10) {
                arg1.method1289(6144, true);
            } else if (var10 < var8) {
                arg1.method1289(2048, true);
            } else {
                arg1.method1289(4096, true);
            }
        } else if (var10 > var8) {
            arg1.method1289(10240, true);
        } else if (var8 > var10) {
            arg1.method1289(14336, true);
        } else {
            arg1.method1289(12288, true);
        }
        int var11 = 4;
        boolean var12 = true;
        if (arg1 instanceof class419) {
            var12 = ((class419) arg1).field5807.field3303;
        }
        if (var12) {
            int var13 = arg1.field2574 - arg1.field2609.field276;
            if (var13 != 0 && arg1.field2590 == -1 && arg1.field2629 != 0) {
                var11 = 2;
            }
            if (!arg0 && arg1.field2654 > 2) {
                var11 = 6;
            }
            if (!arg0 && arg1.field2654 > 3) {
                var11 = 8;
            }
        } else {
            if (!arg0 && arg1.field2654 > 1) {
                var11 = 6;
            }
            if (!arg0 && arg1.field2654 > 2) {
                var11 = 8;
            }
        }
        if (arg1.field2664 > 0 && arg1.field2654 > 1) {
            var11 = 8;
            arg1.field2664--;
        }
        byte var14 = arg1.field2663[arg1.field2654 - 1];
        if (var14 == 2) {
            var11 <<= 0x1;
        } else if (var14 == 0) {
            var11 >>= 0x1;
        }
        if (var3.field800 != -1) {
            int var15 = var11 << 7;
            if (arg1.field2654 == 1) {
                int var16 = arg1.field2661 * arg1.field2661;
                int var17 = (var9 < arg1.field40 ? arg1.field40 - var9 : var9 - arg1.field40) << 7;
                int var18 = (arg1.field44 <= var10 ? var10 - arg1.field44 : -var10 + arg1.field44) << 7;
                int var19 = var18 >= var17 ? var18 : var17;
                int var20 = var3.field800 * var19 * 2;
                if (var16 > var20) {
                    arg1.field2661 /= 2;
                } else if (var19 < var16 / 2) {
                    arg1.field2661 -= var3.field800;
                    if (arg1.field2661 < 0) {
                        arg1.field2661 = 0;
                    }
                } else if (var15 > arg1.field2661) {
                    arg1.field2661 += var3.field800;
                    if (arg1.field2661 > var15) {
                        arg1.field2661 = var15;
                    }
                }
            } else if (arg1.field2661 < var15) {
                arg1.field2661 += var3.field800;
                if (var15 < arg1.field2661) {
                    arg1.field2661 = var15;
                }
            } else if (arg1.field2661 > 0) {
                arg1.field2661 -= var3.field800;
                if (arg1.field2661 < 0) {
                    arg1.field2661 = 0;
                }
            }
            var11 = arg1.field2661 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        class391.field5429 = 0;
        if (var9 > var7) {
            class391.field5429 |= 0x4;
            arg1.field40 += var11;
            if (arg1.field40 > var9) {
                arg1.field40 = var9;
            }
        } else if (var7 > var9) {
            class391.field5429 |= 0x8;
            arg1.field40 -= var11;
            if (var9 > arg1.field40) {
                arg1.field40 = var9;
            }
        }
        if (var8 < var10) {
            class391.field5429 |= 0x1;
            arg1.field44 += var11;
            if (var10 < arg1.field44) {
                arg1.field44 = var10;
            }
        } else if (var8 > var10) {
            arg1.field44 -= var11;
            class391.field5429 |= 0x2;
            if (var10 > arg1.field44) {
                arg1.field44 = var10;
            }
        }
        int var21 = -24 % ((50 - arg2) / 55);
        if (arg1.field40 == var9 && arg1.field44 == var10) {
            if (arg1.field2666 > 0) {
                arg1.field2666--;
            }
            arg1.field2654--;
        }
        if (var11 >= 8) {
            class341.field4616 = 2;
        } else {
            class341.field4616 = var14;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 579)
    public static void method970(int arg0) {
        if (arg0 == -159121528) {
            field1934 = null;
            field1930 = null;
            field1936 = null;
        }
    }
}
