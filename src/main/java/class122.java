import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class122 {

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Z")
    private boolean field2363 = false;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public int field2368 = -1;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public int field2360 = 2;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public int field2373 = 5;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field2355 = -1;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public int field2354 = -1;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public int field2385 = 99;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "Z")
    public boolean field2386 = false;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public int field2371 = -1;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public int field2383 = -1;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2369 = 0;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Z")
    public static boolean field2376 = false;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "[Ljd;")
    public static class86[] field2367 = new class86[100];

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Luk;")
    public static class96 field2375 = new class96(64);

    @OriginalMember(owner = "client!q", name = "H", descriptor = "Ljd;")
    private static class86 field2387 = method868("", true);

    @OriginalMember(owner = "client!q", name = "I", descriptor = "[Lig;")
    public static class9[] field2388 = new class9[4];

    @OriginalMember(owner = "client!q", name = "J", descriptor = "Ljd;")
    public static class86 field2389 = field2387;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "[I")
    public int[] field2357;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[I")
    private int[] field2358;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[I")
    public int[] field2361;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "[I")
    private int[] field2370;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "[[I")
    public int[][] field2378;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static final void method858(int arg0) {
        if (arg0 >= -85) {
            return;
        }
        class61.method436();
        for (int var1 = 0; var1 < 4; var1++) {
            field2388[var1].method76(false);
        }
        field2362++;
        System.gc();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)V")
    public static final void method859(byte arg0, int arg1) {
        field2379++;
        class140.field2665.method693(6, arg1);
        class233.field4212.method693(6, arg1);
        if (arg0 > -78) {
            method860(50, true, -90, 101, -65, -62, (class151) null);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZIIIILbj;)V")
    public static final void method860(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class151 arg6) {
        class135.field2592 = arg2;
        if (arg0 != 0) {
            field2389 = null;
        }
        class272.field4766 = arg5;
        class171.field3143 = arg4;
        class45.field1007 = 1;
        class177.field3208 = arg1;
        class187.field3315 = arg6;
        class83.field1622 = arg3;
        field2366++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZLie;I)Lie;")
    public final class32 method861(int arg0, boolean arg1, class32 arg2, int arg3) {
        field2364++;
        int var5 = this.field2361[arg0];
        class193 var6 = class57.method417(var5 >> 16, 106);
        if (!arg1) {
            this.field2358 = null;
        }
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method211(true, true);
        }
        int var8 = arg3 & 0x3;
        class32 var9 = arg2.method211(!var6.method1344(-122, var7), !this.field2363);
        if (var8 == 1) {
            var9.method232();
        } else if (var8 == 2) {
            var9.method221();
        } else if (var8 == 3) {
            var9.method220();
        }
        var9.method227(var6, var7, this.field2363);
        if (var8 == 1) {
            var9.method220();
        } else if (var8 == 2) {
            var9.method221();
        } else if (var8 == 3) {
            var9.method232();
        }
        return var9;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILqk;)V")
    private final void method862(int arg0, int arg1, class200 arg2) {
        int var4 = -72 % ((arg0 - 57) / 54);
        if (arg1 == 1) {
            int var14 = arg2.method1410(-112);
            this.field2357 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field2357[var15] = arg2.method1410(-94);
            }
            this.field2361 = new int[var14];
            for (int var16 = 0; var16 < var14; var16++) {
                this.field2361[var16] = arg2.method1410(-77);
            }
            for (int var17 = 0; var17 < var14; var17++) {
                this.field2361[var17] = (arg2.method1410(-93) << 16) + this.field2361[var17];
            }
        } else if (arg1 == 2) {
            this.field2368 = arg2.method1410(-68);
        } else if (arg1 == 3) {
            int var12 = arg2.method1408((byte) -54);
            this.field2370 = new int[var12 + 1];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2370[var13] = arg2.method1408((byte) -35);
            }
            this.field2370[var12] = 9999999;
        } else if (arg1 == 4) {
            this.field2386 = true;
        } else if (arg1 == 5) {
            this.field2373 = arg2.method1408((byte) -60);
        } else if (arg1 == 6) {
            this.field2383 = arg2.method1410(-113);
        } else if (arg1 == 7) {
            this.field2355 = arg2.method1410(-57);
        } else if (arg1 == 8) {
            this.field2385 = arg2.method1408((byte) -77);
        } else if (arg1 == 9) {
            this.field2354 = arg2.method1408((byte) -82);
        } else if (arg1 == 10) {
            this.field2371 = arg2.method1408((byte) -67);
        } else if (arg1 == 11) {
            this.field2360 = arg2.method1408((byte) -93);
        } else if (arg1 == 12) {
            int var9 = arg2.method1408((byte) -23);
            this.field2358 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2358[var10] = arg2.method1410(-78);
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2358[var11] += arg2.method1410(-66) << 16;
            }
        } else if (arg1 == 13) {
            int var5 = arg2.method1410(-116);
            this.field2378 = new int[var5][];
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg2.method1408((byte) -20);
                if (var7 > 0) {
                    this.field2378[var6] = new int[var7];
                    this.field2378[var6][0] = arg2.method1405(-3);
                    for (int var8 = 1; var8 < var7; var8++) {
                        this.field2378[var6][var8] = arg2.method1410(-91);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2363 = true;
        }
        field2377++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lqk;I)V")
    public final void method863(class200 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1408((byte) -119);
            if (var3 == 0) {
                if (arg1 != 773) {
                    this.field2385 = 102;
                }
                field2372++;
                return;
            }
            this.method862(123, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public final void method864(boolean arg0) {
        if (!arg0) {
            this.field2368 = 40;
        }
        field2374++;
        if (this.field2371 == -1) {
            if (this.field2370 == null) {
                this.field2371 = 0;
            } else {
                this.field2371 = 2;
            }
        }
        if (this.field2354 != -1) {
            return;
        }
        if (this.field2370 == null) {
            this.field2354 = 0;
        } else {
            this.field2354 = 2;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILie;Lq;)Lie;")
    public final class32 method865(int arg0, int arg1, int arg2, class32 arg3, class122 arg4) {
        field2380++;
        int var6 = this.field2361[arg2];
        class193 var7 = class57.method417(var6 >> 16, arg0 + 110);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method867(false, arg3, arg1);
        }
        int var9 = arg4.field2361[arg1];
        class193 var10 = class57.method417(var9 >> 16, 119);
        int var11 = var9 & 0xFFFF;
        if (arg0 != -5) {
            return null;
        } else if (var10 == null) {
            class32 var12 = arg3.method211(!var7.method1344(arg0 + 72, var8), !this.field2363);
            var12.method227(var7, var8, this.field2363);
            return var12;
        } else {
            class32 var13 = arg3.method211(!var7.method1344(-118, var8) & !var10.method1344(arg0 ^ 0xFFFFFFEF, var11), !this.field2363 & !arg4.field2363);
            var13.method229(var7, var8, var10, var11, this.field2370, this.field2363 | arg4.field2363);
            return var13;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILie;)Lie;")
    public final class32 method866(int arg0, int arg1, class32 arg2) {
        field2381++;
        int var4 = this.field2361[arg0];
        class193 var5 = class57.method417(var4 >> 16, 106);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method211(true, true);
        }
        class193 var7 = null;
        int var8 = arg1;
        if (this.field2358 != null && this.field2358.length > arg0) {
            int var9 = this.field2358[arg0];
            var7 = class57.method417(var9 >> 16, 108);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class32 var11 = arg2.method211(!var5.method1344(-112, var6), !this.field2363);
            var11.method227(var5, var6, this.field2363);
            return var11;
        } else {
            class32 var10 = arg2.method211(!var5.method1344(arg1 ^ 0x46, var6) & !var7.method1344(arg1 ^ 0xFFFFFF8E, var8), !this.field2363);
            var10.method227(var5, var6, this.field2363);
            var10.method227(var7, var8, this.field2363);
            return var10;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLie;I)Lie;")
    public final class32 method867(boolean arg0, class32 arg1, int arg2) {
        field2382++;
        int var4 = this.field2361[arg2];
        class193 var5 = class57.method417(var4 >> 16, 124);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method211(true, true);
        }
        if (arg0) {
            method870(-4, -125, -65, 110, 120, -121, -18, -47);
        }
        class32 var7 = arg1.method211(!var5.method1344(-94, var6), !this.field2363);
        var7.method227(var5, var6, this.field2363);
        return var7;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;Z)Ljd;")
    public static final class86 method868(String arg0, boolean arg1) {
        field2365++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class86 var4 = new class86();
        var4.field1670 = new byte[var3];
        if (!arg1) {
            field2387 = null;
        }
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field1670[var4.field1704++] = (byte) (var6 * 43 + var7 - 48 - 1720);
            } else if (var6 != 0) {
                var4.field1670[var4.field1704++] = (byte) var6;
            }
        }
        var4.method628(-2836);
        return var4.method596(true);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static void method869(int arg0) {
        field2367 = null;
        field2375 = null;
        field2388 = null;
        if (arg0 >= 16) {
            field2389 = null;
            field2387 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= 0 && arg3 >= 0 && arg1 < 103 && arg3 < 103) {
            if (arg4 == 0) {
                class221 var8 = class34.method255(arg2, arg1, arg3);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field3978 >>> 32);
                    if (arg5 == 2) {
                        var8.field3966 = new class215(var9, 2, arg0 + 4, arg2, arg1, arg3, arg6, false, var8.field3966);
                        var8.field3976 = new class215(var9, 2, arg0 + 1 & 0x3, arg2, arg1, arg3, arg6, false, var8.field3976);
                    } else {
                        var8.field3966 = new class215(var9, arg5, arg0, arg2, arg1, arg3, arg6, false, var8.field3966);
                    }
                }
            }
            if (arg4 == 1) {
                class258 var10 = class116.method818(arg2, arg1, arg3);
                if (var10 != null) {
                    int var11 = (int) (var10.field4576 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 4 || arg5 == 5) {
                        var10.field4590 = new class215(var11, 4, arg0, arg2, arg1, arg3, arg6, false, var10.field4590);
                    } else if (arg5 == 6) {
                        var10.field4590 = new class215(var11, 4, arg0 + 4, arg2, arg1, arg3, arg6, false, var10.field4590);
                    } else if (arg5 == 7) {
                        var10.field4590 = new class215(var11, 4, (arg0 + 2 & 0x3) + 4, arg2, arg1, arg3, arg6, false, var10.field4590);
                    } else if (arg5 == 8) {
                        var10.field4590 = new class215(var11, 4, arg0 + 4, arg2, arg1, arg3, arg6, false, var10.field4590);
                        var10.field4583 = new class215(var11, 4, (arg0 + 2 & 0x3) + 4, arg2, arg1, arg3, arg6, false, var10.field4583);
                    }
                }
            }
            if (arg4 == 2) {
                if (arg5 == 11) {
                    arg5 = 10;
                }
                class228 var12 = class208.method1478(arg2, arg1, arg3);
                if (var12 != null) {
                    var12.field4134 = new class215((int) (var12.field4122 >>> 32) & Integer.MAX_VALUE, arg5, arg0, arg2, arg1, arg3, arg6, false, var12.field4134);
                }
            }
            if (arg4 == 3) {
                class107 var13 = class37.method284(arg2, arg1, arg3);
                if (var13 != null) {
                    var13.field2051 = new class215(Integer.MAX_VALUE & (int) (var13.field2065 >>> 32), 22, arg0, arg2, arg1, arg3, arg6, false, var13.field2051);
                }
            }
        }
        field2356++;
        if (arg7 != -11433) {
            method858(107);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLie;I)Lie;")
    public final class32 method871(byte arg0, class32 arg1, int arg2) {
        int var4 = this.field2361[arg2];
        if (arg0 >= -108) {
            this.field2354 = -24;
        }
        class193 var5 = class57.method417(var4 >> 16, 122);
        field2384++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method219(true, true);
        } else {
            class32 var7 = arg1.method219(!var5.method1344(31, var6), !this.field2363);
            var7.method227(var5, var6, this.field2363);
            return var7;
        }
    }
}
