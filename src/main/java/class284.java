import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class284 {

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public int field4321 = 16777215;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public int field4322 = 8;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4319 = null;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Lwl;")
    public static class452 field4326 = new class452(96, 7);

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field4337 = -1;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Llp;")
    public static class137 field4334;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Z")
    public boolean field4317;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lef;III)V")
    private final void method1742(class385 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field4322 = arg0.method2323(-14);
        } else if (arg1 == 2) {
            this.field4317 = true;
        } else if (arg1 == 3) {
            this.field4323 = arg0.method2327((byte) -116);
            this.field4329 = arg0.method2327((byte) -116);
            this.field4331 = arg0.method2327((byte) -116);
        } else if (arg1 == 4) {
            this.field4333 = arg0.method2343(255);
        } else if (arg1 == 5) {
            this.field4318 = arg0.method2323(-89);
        } else if (arg1 == 6) {
            this.field4321 = arg0.method2382((byte) -105);
        }
        if (arg2 <= 72) {
            method1750(false);
        }
        field4330++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILgr;IIIIILdr;IILwp;ZII)Lwp;")
    public static final class292 method1743(int arg0, int arg1, class379 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class261 arg8, int arg9, int arg10, class292 arg11, boolean arg12, int arg13, int arg14) {
        field4328++;
        if (arg11 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg2 != null) {
            int var16 = var15 | arg2.method2283(28432, -1, false, arg7);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg13 << 32) + ((long) arg6 << 48) + (long) ((arg5 << 16) + (arg9 << 24) + arg3);
        class241 var19 = class136.field1828;
        class292 var20;
        synchronized (class136.field1828) {
            var20 = (class292) class136.field1828.method1491(var17, 0);
        }
        if (var20 == null || arg8.method372(var20.method1274(), var15) != 0) {
            if (var20 != null) {
                var15 = arg8.method407(var15, var20.method1274());
            }
            byte var21;
            if (arg3 == 1) {
                var21 = 9;
            } else if (arg3 == 2) {
                var21 = 12;
            } else if (arg3 == 3) {
                var21 = 15;
            } else if (arg3 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class49 var24 = new class49(var21 * var22 + 1, var22 * 2 * var21 + -var21, 0);
            int var25 = var24.method277(0, -128, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class110.field1450[var31] * var28 >> 15;
                    int var33 = class110.field1452[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method277(var33, -128, 0, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg5 * var36 + arg9 * var35 >> 8);
                short var38 = (short) (((arg6 & 0x7F) * var35 + (arg13 & 0x7F) * var36 & 0x7F00) + ((arg6 & 0xFC00) * var35 + (arg13 & 0xFC00) * var36 & 0xFC0000) + ((arg6 & 0x380) * var35 + (arg13 & 0x380) * var36 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method279(var38, var26[0][(var39 + 1) % var21], var25, (short) -1, var37, (byte) 1, (byte) -1, var26[0][var39], (byte) -74);
                    } else {
                        var24.method279(var38, var26[var34 - 1][(var39 + 1) % var21], var26[var34 - 1][var39], (short) -1, var37, (byte) 1, (byte) -1, var26[var34][(var39 + 1) % var21], (byte) -74);
                        var24.method279(var38, var26[var34][(var39 + 1) % var21], var26[var34 - 1][var39], (short) -1, var37, (byte) 1, (byte) -1, var26[var34][var39], (byte) -74);
                    }
                }
            }
            var20 = arg8.method390(var24, var15, class19.field262, 64, 768);
            class241 var40 = class136.field1828;
            synchronized (class136.field1828) {
                class136.field1828.method1488(128, var17, var20);
            }
        }
        int var41 = arg3 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg12) {
            if (arg0 > 5120 && arg0 < 11264) {
                var45 = var41 + 128;
            }
            if (arg0 > 9216 && arg0 < 15360) {
                var44 = var41 + 128;
            }
            if (arg0 > 1024 && arg0 < 7168) {
                var42 -= 128;
            }
            if (arg0 > 13312 || arg0 < 3072) {
                var43 -= 128;
            }
        }
        int var46 = arg11.method1301();
        int var47 = arg11.method1270();
        int var48 = arg11.method1289();
        if (var48 < var43) {
            var48 = var43;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        int var49 = arg11.method1304();
        if (var45 < var49) {
            var49 = var45;
        }
        class265 var50 = null;
        if (arg2 != null) {
            int var51 = arg2.field5539[arg7];
            var50 = class374.method2243(false, var51 >> 16);
            arg7 = var51 & 0xFFFF;
        }
        class292 var52;
        if (var50 == null) {
            var52 = var20.method1264((byte) 3, var15, true);
            var52.method1268((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1266((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method1264((byte) 3, var15, true);
            var52.method1268((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1266((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method1816(arg7, 116, var50);
        }
        if (arg4 != 0) {
            var52.method1254(arg4);
        }
        if (arg10 != 0) {
            var52.method1291(arg10);
        }
        if (arg14 == -1) {
            if (arg1 != 0) {
                var52.method1266(0, arg1, 0);
            }
            return var52;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method1744(byte arg0) {
        field4325++;
        class375.field5461.method367(class412.field6130, class169.field2458, class227.field3438);
        int var1 = 26 / ((-arg0 - 47) / 34);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method1745(int arg0) {
        field4326 = null;
        if (arg0 != -151) {
            method1745(114);
        }
        field4334 = null;
        field4319 = null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static final void method1746(int arg0) {
        field4332++;
        if (arg0 != -1) {
            method1745(123);
        }
        if (!class132.field1692) {
            return;
        }
        class170 var1 = class455.method2827(class54.field729, false, class186.field2795);
        if (var1 != null && var1.field2579 != null) {
            class327 var2 = new class327();
            var2.field4908 = var1.field2579;
            var2.field4909 = var1;
            class384.method2316(var2);
        }
        class132.field1692 = false;
        class390.field5763 = -1;
        class1.field5 = -1;
        if (var1 != null) {
            class405.method2543(var1, 127);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILef;)V")
    public final void method1747(int arg0, int arg1, class385 arg2) {
        while (true) {
            int var4 = arg2.method2343(arg1 - 12610);
            if (var4 == 0) {
                field4327++;
                if (arg1 != 12865) {
                    method1748(true, -73, (class137) null, 73, -112, (class261) null, -125);
                    return;
                }
                return;
            }
            this.method1742(arg2, var4, 107, arg0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZILlp;IILdr;I)V")
    public static final void method1748(boolean arg0, int arg1, class137 arg2, int arg3, int arg4, class261 arg5, int arg6) {
        field4320++;
        if (arg0) {
            class298.field4515.method1408((class221.field3368 - class298.field4515.method1226()) / 2, (class161.field2232 - class298.field4515.method1219()) / 2);
            class409.field6100.method1408((class221.field3368 - class409.field6100.method1226()) / 2, 18);
        }
        arg2.method858(-3700, arg4, -1, class161.field2232 / 2 - 26, class221.field3368 / 2, (class88.field1254 == class466.field6855 ? class255.field3874 : class426.field6252).method937((byte) -49, class27.field356));
        int var7 = class161.field2232 / 2 - 18;
        arg5.method422(class221.field3368 / 2 - 152, var7, 304, 34, arg1, 0);
        arg5.method422(class221.field3368 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg5.method358(class221.field3368 / 2 - 150, var7 + 2, class71.field934 * arg3, 30, arg6, 0);
        arg5.method358(class71.field934 * 3 + class221.field3368 / 2 - 150, var7 - -2, 300 - (class71.field934 * 3), 30, 0, 0);
        arg2.method858(-3700, arg4, -1, class161.field2232 / 2 + 4, class221.field3368 / 2, class303.field4586);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(JZ)V")
    public static final void method1749(long arg0, boolean arg1) {
        field4324++;
        int var3 = class113.field1500.field1900 + class324.field4872;
        int var4 = class97.field1341 + class113.field1500.field1892;
        if (class136.field1804 - var3 < -500 || class136.field1804 - var3 > 500 || (class103.field1401 - var4) < -500 || (class103.field1401 - var4) > 500) {
            class103.field1401 = var4;
            class136.field1804 = var3;
        }
        if (class136.field1804 != var3) {
            int var5 = var3 - class136.field1804;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class136.field1804 += var6;
        }
        if (class103.field1401 != var4) {
            int var7 = var4 - class103.field1401;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class103.field1401 += var8;
        }
        if (!class212.field3193) {
            class188.field2811 += (float) arg0 * class228.field3472 / 6.0F;
            class462.field6810 += (float) arg0 * class1.field16 / 6.0F;
        }
        class43.method250(-109);
        if (arg1) {
            field4319 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)Lbg;")
    public static final class246 method1750(boolean arg0) {
        field4335++;
        try {
            if (!arg0) {
                method1750(false);
            }
            return (class246) Class.forName("kk").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V")
    public static final void method1751(int arg0, int arg1, int arg2, int arg3) {
        if (class246.field3684 != null) {
            class246.field3684[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
        }
    }
}
