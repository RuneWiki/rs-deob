import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class168 {

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public int field2344 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    private int field2368 = -1;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    private int field2345 = -1;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public int field2357 = -1;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    private int field2358 = -1;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "Z")
    public boolean field2369 = true;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public int field2374 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    private int field2349 = -1;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    public int field2370 = 0;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Z")
    public boolean field2340 = false;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public int field2355 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public int field2373 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "[Ljava/lang/String;")
    public String[] field2375 = new String[5];

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    private int field2350 = -1;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "Z")
    public boolean field2378 = true;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public int field2363 = -1;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public int field2379 = -1;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public int field2380 = -1;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "Z")
    public boolean field2381 = true;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    private int field2347;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    private int field2352;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    private int field2359;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public int field2360;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public int field2365;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lefa;")
    private class322 field2354;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "Lwf;")
    public class481 field2367;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "Ljava/lang/String;")
    public String field2362;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "Ljava/lang/String;")
    public String field2372;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "[I")
    public int[] field2361;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLr;)Lf;")
    public final class256 method1167(boolean arg0, class98 arg1) {
        field2366++;
        class256 var3 = (class256) this.field2367.field6887.method3901((long) (arg1.field1500 << 29 | 0x20000 | this.field2358), -125);
        if (var3 != null) {
            return var3;
        }
        this.field2367.field6874.method1818(this.field2358, 4);
        if (!arg0) {
            this.method1176(108, -44, null);
        }
        class616 var4 = class616.method3509(this.field2367.field6874, this.field2358, 0);
        if (var4 != null) {
            var3 = arg1.method660(var4, true);
            this.field2367.field6887.method3894(var3, (byte) 60, (long) (this.field2358 | 0x20000 | arg1.field1500 << 29));
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLgk;)V")
    public final void method1168(byte arg0, class540 arg1) {
        if (arg0 != 0) {
            return;
        }
        field2353++;
        while (true) {
            int var3 = arg1.method3115(29871);
            if (var3 == 0) {
                return;
            }
            this.method1176(var3, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public final void method1169(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field2377++;
        if (this.field2361 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2361.length; var2 += 2) {
            if (this.field2361[var2] < this.field2373) {
                this.field2373 = this.field2361[var2];
            } else if (this.field2361[var2] > this.field2344) {
                this.field2344 = this.field2361[var2];
            }
            if (this.field2374 > this.field2361[var2 + 1]) {
                this.field2374 = this.field2361[var2 + 1];
            } else if (this.field2355 < this.field2361[var2 + 1]) {
                this.field2355 = this.field2361[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static final void method1170(int arg0) {
        field2376++;
        for (int var1 = 0; var1 < class264.field3450; var1++) {
            class405.field6060[var1] = null;
        }
        class264.field3450 = 0;
        for (int var2 = 0; var2 < class555.field8157; var2++) {
            for (int var42 = 0; var42 < class91.field1390; var42++) {
                for (int var43 = 0; var43 < class575.field8372; var43++) {
                    class44 var44 = class603.field8695[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field676 > 0) {
                            var44.field676 = (short) (var44.field676 * -1);
                        }
                        if (var44.field665 > 0) {
                            var44.field665 = (short) (var44.field665 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class555.field8157; var3++) {
            for (int var4 = 0; var4 < class91.field1390; var4++) {
                for (int var5 = 0; var5 < class575.field8372; var5++) {
                    class44 var6 = class603.field8695[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class603.field8695[0][var5][var4] != null && class603.field8695[0][var5][var4].field666 != null;
                        if (var6.field665 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class44 var12 = class603.field8695[var3][var5][var4 - 1];
                            int var13 = class262.field3404[var3].method3822(var4, var5, 0);
                            while (var8 > 0 && var12 != null && var12.field665 < 0 && var6.field665 == var12.field665 && var6.field674 == var12.field674 && var13 == class262.field3404[var3].method3822(var8 - 1, var5, 0) && (var8 - 1 <= 0 || class262.field3404[var3].method3822(var8 - 2, var5, 0) == var13)) {
                                var8--;
                                var12 = class603.field8695[var3][var5][var8 - 1];
                            }
                            for (class44 var14 = class603.field8695[var3][var5][var4 + 1]; var9 < class575.field8372 && var14 != null && var14.field665 < 0 && var6.field665 == var14.field665 && var6.field674 == var14.field674 && class262.field3404[var3].method3822(var9 + 1, var5, 0) == var13 && (var9 + 1 >= class575.field8372 || class262.field3404[var3].method3822(var9 + 2, var5, 0) == var13); var14 = class603.field8695[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class262.field3404[var7 ? var3 + 1 : var3].method3822(var8, var5, 0);
                            int var17 = var6.field665 * var15 + var16;
                            int var18 = class262.field3404[var7 ? var3 + 1 : var3].method3822(var9 + 1, var5, 0);
                            int var19 = var6.field665 * var15 + var18;
                            int var20 = var5 << class125.field1831;
                            int var21 = var8 << class125.field1831;
                            int var22 = (var9 << class125.field1831) + class263.field3412;
                            class405.field6060[class264.field3450++] = new class203(1, var3, var6.field674 + var20, var6.field674 + var20, var6.field674 + var20, var20 - -var6.field674, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class603.field8695[var23][var5][var24].field665 = (short) (class603.field8695[var23][var5][var24].field665 * -1);
                                }
                            }
                        }
                        if (var6.field676 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class44 var29 = class603.field8695[var3][var5 - 1][var4];
                            int var30 = class262.field3404[var3].method3822(var4, var5, 0);
                            while (var25 > 0 && var29 != null && var29.field676 < 0 && var6.field676 == var29.field676 && var6.field671 == var29.field671 && class262.field3404[var3].method3822(var4, var25 - 1, 0) == var30 && (var25 - 1 <= 0 || class262.field3404[var3].method3822(var4, var25 - 2, 0) == var30)) {
                                var25--;
                                var29 = class603.field8695[var3][var25 - 1][var4];
                            }
                            for (class44 var31 = class603.field8695[var3][var5 + 1][var4]; class91.field1390 > var26 && var31 != null && var31.field676 < 0 && var6.field676 == var31.field676 && var6.field671 == var31.field671 && var30 == class262.field3404[var3].method3822(var4, var26 + 1, 0) && ((var26 + 1) >= class91.field1390 || class262.field3404[var3].method3822(var4, var26 + 2, 0) == var30); var31 = class603.field8695[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class262.field3404[var7 ? var3 + 1 : var3].method3822(var4, var25, 0);
                            int var34 = var6.field676 * var32 + var33;
                            int var35 = class262.field3404[var7 ? var3 + 1 : var3].method3822(var4, var26 + 1, 0);
                            int var36 = var6.field676 * var32 + var35;
                            int var37 = var25 << class125.field1831;
                            int var38 = (var26 << class125.field1831) + class263.field3412;
                            int var39 = var4 << class125.field1831;
                            class405.field6060[class264.field3450++] = new class203(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var39 + var6.field671, var6.field671 + var39, var6.field671 + var39, var39 - -var6.field671);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class603.field8695[var40][var41][var4].field676 = (short) (class603.field8695[var40][var41][var4].field676 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= 6) {
            class142.field2060 = true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
    public static final void method1171() {
        class10.method74(1, class555.field8157);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method1172(int arg0, int arg1, String arg2) {
        field2356++;
        if (this.field2354 == null) {
            return arg2;
        }
        if (arg0 >= -107) {
            this.method1167(true, null);
        }
        class180 var4 = (class180) this.field2354.method2002((byte) -121, (long) arg1);
        return var4 == null ? arg2 : var4.field2490;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Luaa;I)Z")
    public final boolean method1173(class404 arg0, int arg1) {
        field2351++;
        int var3;
        if (this.field2350 == -1) {
            if (this.field2345 == -1) {
                return true;
            }
            var3 = arg0.method2492(this.field2345, (byte) 53);
        } else {
            var3 = arg0.method2491(this.field2350, (byte) 108);
        }
        if (this.field2347 > var3 || var3 > this.field2371) {
            return false;
        } else if (arg1 <= 17) {
            return false;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field2349 == -1) {
                if (this.field2368 == -1) {
                    return true;
                }
                var5 = arg0.method2492(this.field2368, (byte) 53);
            } else {
                var5 = arg0.method2491(this.field2349, (byte) 65);
            }
            return this.field2359 <= var5 && this.field2352 >= var5;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)I")
    public final int method1174(int arg0, byte arg1, int arg2) {
        field2339++;
        if (this.field2354 == null) {
            return arg0;
        } else if (arg1 == -85) {
            class258 var4 = (class258) this.field2354.method2002((byte) -108, (long) arg2);
            return var4 == null ? arg0 : var4.field3352;
        } else {
            return 23;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZILr;)Lf;")
    public final class256 method1175(boolean arg0, int arg1, class98 arg2) {
        field2342++;
        if (arg1 >= -103) {
            return null;
        }
        int var4 = arg0 ? this.field2357 : this.field2379;
        int var5 = var4 | arg2.field1500 << 29;
        class256 var6 = (class256) this.field2367.field6887.method3901((long) var5, -49);
        if (var6 != null) {
            return var6;
        } else if (this.field2367.field6874.method1818(var4, 4)) {
            class616 var7 = class616.method3509(this.field2367.field6874, var4, 0);
            if (var7 != null) {
                var6 = arg2.method660(var7, true);
                this.field2367.field6887.method3894(var6, (byte) 60, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILgk;)V")
    private final void method1176(int arg0, int arg1, class540 arg2) {
        if (arg0 == 1) {
            this.field2379 = arg2.method3169(26488);
        } else if (arg0 == 2) {
            this.field2357 = arg2.method3169(26488);
        } else if (arg0 == 3) {
            this.field2372 = arg2.method3145((byte) -121);
        } else if (arg0 == 4) {
            this.field2360 = arg2.method3154((byte) -94);
        } else if (arg0 == 5) {
            this.field2363 = arg2.method3154((byte) -65);
        } else if (arg0 == 6) {
            this.field2370 = arg2.method3115(29871);
        } else if (arg0 == 7) {
            int var12 = arg2.method3115(29871);
            if ((var12 & 0x2) == 2) {
                this.field2340 = true;
            }
            if ((var12 & 0x1) == 0) {
                this.field2369 = false;
            }
        } else if (arg0 == 8) {
            this.field2381 = arg2.method3115(29871) == 1;
        } else if (arg0 == 9) {
            this.field2345 = arg2.method3169(26488);
            if (this.field2345 == 65535) {
                this.field2345 = -1;
            }
            this.field2350 = arg2.method3169(26488);
            if (this.field2350 == 65535) {
                this.field2350 = -1;
            }
            this.field2347 = arg2.method3160(false);
            this.field2371 = arg2.method3160(false);
        } else if (arg0 >= 10 && arg0 <= 14) {
            this.field2375[arg0 - 10] = arg2.method3145((byte) -121);
        } else if (arg0 == 15) {
            int var4 = arg2.method3115(29871);
            this.field2361 = new int[var4 * 2];
            for (int var5 = 0; var5 < (var4 * 2); var5++) {
                this.field2361[var5] = arg2.method3129(89);
            }
            this.field2365 = arg2.method3160(false);
            this.field2364 = arg2.method3160(false);
        } else if (arg0 == 16) {
            this.field2378 = false;
        } else if (arg0 == 17) {
            this.field2362 = arg2.method3145((byte) -121);
        } else if (arg0 == 18) {
            this.field2358 = arg2.method3169(26488);
        } else if (arg0 == 19) {
            this.field2380 = arg2.method3169(26488);
        } else if (arg0 == 20) {
            this.field2368 = arg2.method3169(26488);
            if (this.field2368 == 65535) {
                this.field2368 = -1;
            }
            this.field2349 = arg2.method3169(arg1 + 26489);
            if (this.field2349 == 65535) {
                this.field2349 = -1;
            }
            this.field2359 = arg2.method3160(false);
            this.field2352 = arg2.method3160(false);
        } else if (arg0 == 21) {
            this.field2341 = arg2.method3160(false);
        } else if (arg0 == 22) {
            this.field2346 = arg2.method3160(false);
        } else if (arg0 == 249) {
            int var6 = arg2.method3115(29871);
            if (this.field2354 == null) {
                int var7 = class240.method1478(arg1 ^ 0x6EA4, var6);
                this.field2354 = new class322(var7);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                boolean var9 = arg2.method3115(29871) == 1;
                int var10 = arg2.method3154((byte) -55);
                class381 var11;
                if (var9) {
                    var11 = new class180(arg2.method3145((byte) -121));
                } else {
                    var11 = new class258(arg2.method3160(false));
                }
                this.field2354.method2001(arg1 + 96, var11, (long) var10);
            }
        }
        field2348++;
        if (arg1 != -1) {
            this.field2370 = -120;
        }
    }
}
