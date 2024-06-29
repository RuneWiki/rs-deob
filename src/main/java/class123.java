import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class123 extends class212 {

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    private int field2034 = -1;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    private int field2040 = 0;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static volatile int field2026 = 0;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field2033 = -1;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "[I")
    public static int[] field2030 = new int[100];

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public int field2025;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public int field2029;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "Lnc;")
    public static class136 field2028;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V")
    public static void method832(int arg0) {
        field2030 = null;
        int var1 = -97 / ((arg0 + 78) / 47);
        field2028 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZZZIZII)Lgd;")
    public static final class65 method833(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2038++;
        class242 var8 = class151.method1005(520, arg4);
        if (arg0 > 1 && var8.field4176 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg0 >= var8.field4194[var10] && var8.field4194[var10] != 0) {
                    var9 = var8.field4176[var10];
                }
            }
            if (var9 != -1) {
                var8 = class151.method1005(520, var9);
            }
        }
        class37 var11 = var8.method1589(-88);
        if (var11 == null) {
            return null;
        }
        class15 var12 = null;
        if (var8.field4165 != -1) {
            var12 = (class15) method833(10, false, true, true, var8.field4140, true, 0, 1);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4184 != -1) {
            var12 = (class15) method833(arg0, false, true, false, var8.field4210, true, arg6, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class216.field3731;
        int var14 = class216.field3729;
        int var15 = class216.field3730;
        int[] var16 = new int[4];
        class216.method1399(var16);
        class15 var17 = new class15(36, 32);
        class216.method1409(var17.field136, 36, 32);
        class248.method1634();
        class248.method1629(16, 16);
        int var18 = var8.field4193;
        class248.field4289 = false;
        if (arg3) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg7 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class248.field4297[var8.field4149] * var18 >> 16;
        int var20 = class248.field4301[var8.field4149] * var18 >> 16;
        var11.method236(0, var8.field4161, var8.field4189, var8.field4149, var8.field4185, var19 + var8.field4163 - var11.method43() / 2, var8.field4163 + var20);
        if (arg7 >= 1) {
            var17.method72(1);
            if (arg7 >= 2) {
                var17.method72(16777215);
            }
            class216.method1409(var17.field136, 36, 32);
        }
        if (arg6 != 0) {
            var17.method64(arg6);
        }
        if (var8.field4165 != -1) {
            var12.method73(0, 0);
        } else if (var8.field4184 != -1) {
            class216.method1409(var12.field136, 36, 32);
            var17.method73(0, 0);
            var17 = var12;
        }
        if (arg1 && (var8.field4178 == 1 || arg0 != 1) && arg0 != -1) {
            class44.field580.method941(class45.method296(100000, arg0), 0, 9, 16776960, 1);
        }
        class216.method1409(var13, var14, var15);
        class216.method1396(var16);
        class248.method1634();
        class248.field4289 = arg2;
        return var17;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)Lvd;")
    public static final class17 method834(int arg0, int arg1, int arg2) {
        class177 var3 = class254.field4395[arg0][arg1][arg2];
        return var3 == null || var3.field3101 == null ? null : var3.field3101;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)Z")
    public static final boolean method835(int arg0, int arg1) {
        if (arg0 != -1) {
            field2026 = -88;
        }
        field2036++;
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIILqf;IJIIII)Z")
    public static final boolean method836(int arg0, int arg1, int arg2, int arg3, class13 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class146.method983(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lnh;ZII)V")
    private final void method837(class112 arg0, boolean arg1, int arg2, int arg3) {
        field2035++;
        if (arg1) {
            return;
        }
        if (arg3 == 1) {
            this.field2040 = arg0.method727(-27619);
            this.method838((byte) 60, this.field2040);
        } else if (arg3 == 2) {
            this.field2034 = arg0.method731(false);
            if (this.field2034 == 65535) {
                this.field2034 = -1;
                return;
            }
        } else if (arg3 == 3) {
            arg0.method731(false);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
    private final void method838(byte arg0, int arg1) {
        field2027++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        double var11 = var3;
        int var13 = -22 % ((-arg0 - 19) / 37);
        if (var5 > var3) {
            var11 = var5;
        }
        double var14 = 0.0D;
        if (var7 < var9) {
            var9 = var7;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var16 = (var9 + var11) / 2.0D;
        this.field2025 = (int) (var16 * 256.0D);
        double var18 = 0.0D;
        if (var9 != var11) {
            if (var16 < 0.5D) {
                var18 = (var11 - var9) / (var9 + var11);
            }
            if (var16 >= 0.5D) {
                var18 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var14 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var14 = (var7 - var3) / (-var9 + var11) + 2.0D;
            } else if (var7 == var11) {
                var14 = (var3 - var5) / (-var9 + var11) + 4.0D;
            }
        }
        this.field2039 = (int) (var18 * 256.0D);
        double var20 = var14 / 6.0D;
        if (var16 > 0.5D) {
            this.field2029 = (int) ((1.0D - var16) * var18 * 512.0D);
        } else {
            this.field2029 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field2039 < 0) {
            this.field2039 = 0;
        } else if (this.field2039 > 255) {
            this.field2039 = 255;
        }
        if (this.field2029 < 1) {
            this.field2029 = 1;
        }
        this.field2037 = (int) ((double) this.field2029 * var20);
        if (this.field2025 < 0) {
            this.field2025 = 0;
        } else if (this.field2025 > 255) {
            this.field2025 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lnh;BI)V")
    public final void method839(class112 arg0, byte arg1, int arg2) {
        field2031++;
        while (true) {
            int var4 = arg0.method758(true);
            if (var4 == 0) {
                if (arg1 == -81) {
                    return;
                } else {
                    field2033 = 77;
                    return;
                }
            }
            this.method837(arg0, false, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V")
    public static final void method840(int arg0) {
        int var1 = field2028.method922(class97.field1526);
        field2032++;
        for (int var2 = 0; var2 < class109.field1748; var2++) {
            int var6 = field2028.method922(class14.method53(arg0 - 18643, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        class169.field2956 = true;
        var1 += 8;
        class139.field2462 = var1;
        int var3 = class109.field1748 * 15 + 21;
        class16.field144 = class109.field1748 * 15 + 22;
        int var4 = class198.field3422 - var1 / 2;
        if (class223.field3837 < var1 + var4) {
            var4 = class223.field3837 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class9.field97;
        if (class42.field551 < var3 + var5) {
            var5 = class42.field551 - var3;
        }
        class150.field2620 = var4;
        if (var5 < 0) {
            var5 = 0;
        }
        class36.field443 = var5;
        if (arg0 != 11340) {
            field2033 = -57;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lbk;IIIIIIZ)V")
    public static final void method841(class141 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2480.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2480[var9] - class108.field1739;
            int var23 = arg0.field2486[var9] - class45.field588;
            int var24 = arg0.field2469[var9] - class102.field1648;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2470 != null) {
                class141.field2484[var9] = var25;
                class141.field2473[var9] = var28;
                class141.field2476[var9] = var29;
            }
            class141.field2479[var9] = (var25 << 9) / var29 + class248.field4302;
            class141.field2474[var9] = (var28 << 9) / var29 + class248.field4298;
        }
        class248.field4295 = 0;
        int var10 = arg0.field2488.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2488[var11];
            int var13 = arg0.field2483[var11];
            int var14 = arg0.field2478[var11];
            int var15 = class141.field2479[var12];
            int var16 = class141.field2479[var13];
            int var17 = class141.field2479[var14];
            int var18 = class141.field2474[var12];
            int var19 = class141.field2474[var13];
            int var20 = class141.field2474[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class187.field3292 && class81.method537(class85.field1334 + class248.field4302, class248.field4298 + class155.field2702, var18, var19, var20, var15, var16, var17)) {
                    class4.field43 = arg5;
                    class255.field4430 = arg6;
                }
                if (!arg7) {
                    class248.field4300 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class248.field4285 || var16 > class248.field4285 || var17 > class248.field4285) {
                        class248.field4300 = true;
                    }
                    if (arg0.field2470 == null || arg0.field2470[var11] == -1) {
                        if (arg0.field2472[var11] != 12345678) {
                            class248.method1633(var18, var19, var20, var15, var16, var17, arg0.field2472[var11], arg0.field2475[var11], arg0.field2485[var11]);
                        }
                    } else if (!class207.field3593) {
                        int var21 = class248.field4299.method681(arg0.field2470[var11], 1);
                        class248.method1633(var18, var19, var20, var15, var16, var17, class94.method617(var21, arg0.field2472[var11]), class94.method617(var21, arg0.field2475[var11]), class94.method617(var21, arg0.field2485[var11]));
                    } else if (arg0.field2489) {
                        class248.method1637(var18, var19, var20, var15, var16, var17, arg0.field2472[var11], arg0.field2475[var11], arg0.field2485[var11], class141.field2484[0], class141.field2484[1], class141.field2484[3], class141.field2473[0], class141.field2473[1], class141.field2473[3], class141.field2476[0], class141.field2476[1], class141.field2476[3], arg0.field2470[var11]);
                    } else {
                        class248.method1637(var18, var19, var20, var15, var16, var17, arg0.field2472[var11], arg0.field2475[var11], arg0.field2485[var11], class141.field2484[var12], class141.field2484[var13], class141.field2484[var14], class141.field2473[var12], class141.field2473[var13], class141.field2473[var14], class141.field2476[var12], class141.field2476[var13], class141.field2476[var14], arg0.field2470[var11]);
                    }
                }
            }
        }
    }
}
