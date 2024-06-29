import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class412 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public int field5969 = -1;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field5970 = -50;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Lng;")
    public static class190 field5982 = new class190(64);

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "[I")
    public static int[] field5985 = new int[5];

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field5992 = new String[100];

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    private int field5976;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "J")
    private long field5975;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "J")
    private long field5987;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "Llf;")
    public static class130 field5986;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Z")
    public static boolean field5977;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Z")
    public boolean field5981;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[I")
    public int[] field5974;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "[I")
    private int[] field5990;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "[[I")
    private int[][] field5983;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZII)V")
    public final void method2633(boolean arg0, int arg1, int arg2) {
        field5989++;
        int var4 = class364.field5100[arg2];
        if (this.field5990[var4] == 0 || class194.method1287(arg1, 11093) == null) {
            return;
        }
        this.field5990[var4] = class311.method1970(arg1, Integer.MIN_VALUE);
        this.method2635(true);
        if (arg0) {
            field5992 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
    public final void method2634(int arg0, int arg1, int arg2) {
        if (arg1 != 5397) {
            this.method2641((class449) null, -106, (class281) null, 41, 80, -76, 114);
        }
        field5993++;
        this.field5974[arg2] = arg0;
        this.method2635(true);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    private final void method2635(boolean arg0) {
        field5988++;
        long[] var2 = class32.field493;
        this.field5987 = -1L;
        this.field5987 = this.field5987 >>> 8 ^ var2[(int) ((this.field5987 ^ (long) (this.field5976 >> 8)) & 0xFFL)];
        this.field5987 = var2[(int) ((this.field5987 ^ (long) this.field5976) & 0xFFL)] ^ this.field5987 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field5987 = this.field5987 >>> 8 ^ var2[(int) ((this.field5987 ^ (long) (this.field5990[var3] >> 24)) & 0xFFL)];
            this.field5987 = var2[(int) ((this.field5987 ^ (long) (this.field5990[var3] >> 16)) & 0xFFL)] ^ this.field5987 >>> 8;
            this.field5987 = var2[(int) ((this.field5987 ^ (long) (this.field5990[var3] >> 8)) & 0xFFL)] ^ this.field5987 >>> 8;
            this.field5987 = var2[(int) ((this.field5987 ^ (long) this.field5990[var3]) & 0xFFL)] ^ this.field5987 >>> 8;
        }
        if (arg0) {
            for (int var4 = 0; var4 < 5; var4++) {
                this.field5987 = this.field5987 >>> 8 ^ var2[(int) (((long) this.field5974[var4] ^ this.field5987) & 0xFFL)];
            }
            this.field5987 = this.field5987 >>> 8 ^ var2[(int) (((long) (this.field5981 ? 1 : 0) ^ this.field5987) & 0xFFL)];
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V")
    public static final void method2636(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5978++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        if (arg0 != 2) {
            method2638((byte) -7);
        }
        int var8 = -1;
        class73.method486(arg2 - arg1, class84.field1286[arg4], arg3, -118, arg2 + arg1);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class84.field1286[arg4 + var6];
                int[] var10 = class84.field1286[arg4 - var6];
                int var11 = arg2 + var5;
                int var12 = arg2 - var5;
                class73.method486(var12, var9, arg3, 88, var11);
                class73.method486(var12, var10, arg3, -111, var11);
            }
            int var13 = arg2 + var6;
            int var14 = arg2 - var6;
            int[] var15 = class84.field1286[arg4 + var5];
            int[] var16 = class84.field1286[arg4 - var5];
            class73.method486(var14, var15, arg3, -112, var13);
            class73.method486(var14, var16, arg3, -101, var13);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static final void method2637(int arg0) {
        field5971++;
        class253 var1 = null;
        try {
            class295 var2 = class204.field2772.method2238(113);
            while (var2.field4068 == 0) {
                class4.method28(1L, arg0 ^ 0xFFFFFF9E);
            }
            if (var2.field4068 == 1) {
                var1 = (class253) var2.field4070;
                class371 var3 = new class371(class247.field3428 * 6 + 3);
                var3.method2396(1, 12450);
                var3.method2416(22064, class247.field3428);
                for (int var4 = 0; var4 < class220.field2890.length; var4++) {
                    if (class137.field1958[var4]) {
                        var3.method2416(22064, var4);
                        var3.method2386(class220.field2890[var4], 19324);
                    }
                }
                var1.method1560(0, var3.field5273, var3.field5258, (byte) 123);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method1562(-8060);
            }
            if (arg0 != 0) {
                method2637(71);
            }
        } catch (Exception var5) {
        }
        class371.field5253 = class224.method1425(-26805);
        class27.field435 = false;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static void method2638(byte arg0) {
        field5986 = null;
        field5982 = null;
        field5985 = null;
        int var1 = -82 / ((55 - arg0) / 53);
        field5992 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[I[IIIZ)V")
    public final void method2639(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5976 != arg0) {
            this.field5976 = arg0;
            this.field5983 = null;
        }
        field5984++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class381.field5401; var8++) {
                    class91 var9 = class194.method1287(var8, 11093);
                    if (var9 != null && !var9.field1382 && (arg5 ? class48.field744[var7] : class53.field782[var7]) == var9.field1388) {
                        arg2[class364.field5100[var7]] = class311.method1970(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field5981 = arg5;
        if (arg4 < 69) {
            this.field5983 = null;
        }
        this.field5969 = arg3;
        this.field5974 = arg1;
        this.field5990 = arg2;
        this.method2635(true);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILaa;IIIIIILlo;I)Lhc;")
    public final class75 method2640(int arg0, class281 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class449 arg8, int arg9) {
        field5973++;
        int var11 = arg0;
        if (arg8 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            var11 = arg0 | 0x20;
            int var18 = arg8.field6521[arg3];
            Object var19 = null;
            int var20 = var18 >>> 16;
            class387 var21 = class326.method2051(122, var20);
            int var22 = var18 & 0xFFFF;
            if (var21 != null) {
                var13 |= var21.method2527(false, var22);
                var12 |= var21.method2533(var22, arg6 + 252);
                var14 |= arg8.field6495;
            }
            if ((arg8.field6520 || class169.field2408) && arg9 != -1 && arg9 < arg8.field6521.length) {
                int var23 = arg8.field6521[arg9];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class387 var26;
                if (var20 == var24) {
                    var26 = var21;
                } else {
                    var26 = class326.method2051(88, var25 >>> 16);
                }
                if (var26 != null) {
                    var13 |= var26.method2527(false, var25);
                    var12 |= var26.method2533(var25, 255);
                }
            }
            if (var13) {
                var11 |= 0x80;
            }
            if (var12) {
                var11 |= 0x100;
            }
            if (var14) {
                var11 |= 0x200;
            }
        }
        long var27 = (long) arg5 << 32 | (long) (arg7 << 16) | (long) arg2;
        class190 var29 = class188.field2607;
        class75 var30;
        synchronized (class188.field2607) {
            var30 = (class75) class188.field2607.method1246((byte) -21, var27);
        }
        if (var30 == null || arg1.method1732(var30.method533(), var11) != 0) {
            if (var30 != null) {
                var11 = arg1.method1777(var11, var30.method533());
            }
            class279[] var32 = new class279[3];
            int var33 = 0;
            if (!class194.method1287(arg2, 11093).method622(arg6 + 59) || !class194.method1287(arg7, arg6 ^ 0x2B56).method622(121) || !class194.method1287(arg5, 11093).method622(103)) {
                return null;
            }
            class279 var34 = class194.method1287(arg2, 11093).method619(-116);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class279 var35 = class194.method1287(arg7, 11093).method619(-124);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class279 var36 = class194.method1287(arg5, 11093).method619(arg6 ^ 0xFFFFFF8A);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            class279 var37 = new class279(var32, var33);
            int var38 = var11 | 0x2000;
            var30 = arg1.method1736(var37, var38, class406.field5898, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (class262.field3579[var39].length > this.field5974[var39]) {
                    var30.method509(class173.field2465[var39], class262.field3579[var39][this.field5974[var39]]);
                }
                if (this.field5974[var39] < class450.field6535[var39].length) {
                    var30.method509(class333.field4512[var39], class450.field6535[var39][this.field5974[var39]]);
                }
            }
            var30.method508(var11);
            class190 var40 = class188.field2607;
            synchronized (class188.field2607) {
                class188.field2607.method1247(var27, (byte) -85, var30);
            }
        }
        if (arg8 == null) {
            return var30;
        } else if (arg6 == 3) {
            class75 var41 = var30.method529((byte) 1, var11, true);
            return arg8.method2806(var41, arg0, arg9, arg4, (byte) 108, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Llo;ILaa;IIII)Lhc;")
    public final class75 method2641(class449 arg0, int arg1, class281 arg2, int arg3, int arg4, int arg5, int arg6) {
        field5979++;
        if (this.field5969 != -1) {
            return class393.method2556(this.field5969, arg6 ^ 0x27DAEE14).method1402(arg0, arg5, arg1, (byte) 73, arg3, arg4, arg2);
        }
        int var8 = arg1;
        if (arg0 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            Object var15 = null;
            var8 = arg1 | 0x20;
            int var16 = arg0.field6521[arg5];
            int var17 = var16 >>> 16;
            int var18 = var16 & 0xFFFF;
            class387 var19 = class326.method2051(arg6 ^ 0x27DAEE77, var17);
            if (var19 != null) {
                var10 |= var19.method2527(false, var18);
                var9 |= var19.method2533(var18, 255);
                var11 |= arg0.field6495;
            }
            if ((arg0.field6520 || class169.field2408) && arg3 != -1 && arg0.field6521.length > arg3) {
                int var20 = arg0.field6521[arg3];
                int var21 = var20 >>> 16;
                class387 var22 = var17 == var21 ? var19 : class326.method2051(arg6 ^ 0x27DAEE5E, var21);
                int var23 = var20 & 0xFFFF;
                if (var22 != null) {
                    var10 |= var22.method2527(false, var23);
                    var9 |= var22.method2533(var23, arg6 ^ 0x27DAEEEF);
                }
            }
            if (var10) {
                var8 |= 0x80;
            }
            if (var9) {
                var8 |= 0x100;
            }
            if (var11) {
                var8 |= 0x200;
            }
        }
        class190 var24 = class188.field2607;
        class75 var25;
        synchronized (class188.field2607) {
            var25 = (class75) class188.field2607.method1246((byte) -107, this.field5987);
        }
        if (var25 == null || arg2.method1732(var25.method533(), var8) != 0) {
            if (var25 != null) {
                var8 = arg2.method1777(var8, var25.method533());
            }
            boolean var27 = false;
            for (int var28 = 0; var28 < 12; var28++) {
                int var29 = this.field5990[var28];
                if ((var29 & 0x40000000) == 0) {
                    if ((var29 & Integer.MIN_VALUE) != 0 && !class194.method1287(var29 & 0x3FFFFFFF, 11093).method622(102)) {
                        var27 = true;
                    }
                } else if (!class347.method2222(var29 & 0x3FFFFFFF, 18682).method2551(0, this.field5981)) {
                    var27 = true;
                }
            }
            if (var27) {
                return null;
            }
            class279[] var30 = new class279[12];
            int var31 = 0;
            for (int var32 = 0; var32 < 12; var32++) {
                int var33 = this.field5990[var32];
                if ((var33 & 0x40000000) != 0) {
                    class279 var34 = class347.method2222(var33 & 0x3FFFFFFF, 18682).method2536(this.field5981, 23703);
                    if (var34 != null) {
                        var30[var31++] = var34;
                    }
                } else if ((var33 & Integer.MIN_VALUE) != 0) {
                    class279 var35 = class194.method1287(var33 & 0x3FFFFFFF, arg6 ^ 0x27DAC545).method619(arg6 - 668659329);
                    if (var35 != null) {
                        var30[var31++] = var35;
                    }
                }
            }
            int var36 = var8 | 0x2000;
            class279 var37 = new class279(var30, var31);
            var25 = arg2.method1736(var37, var36, class406.field5898, 64, 768);
            for (int var38 = 0; var38 < 5; var38++) {
                if (this.field5974[var38] < class262.field3579[var38].length) {
                    var25.method509(class173.field2465[var38], class262.field3579[var38][this.field5974[var38]]);
                }
                if (this.field5974[var38] < class450.field6535[var38].length) {
                    var25.method509(class333.field4512[var38], class450.field6535[var38][this.field5974[var38]]);
                }
            }
            var25.method508(var8);
            class190 var39 = class188.field2607;
            synchronized (class188.field2607) {
                class188.field2607.method1247(this.field5987, (byte) 68, var25);
            }
        }
        if (arg6 != 668659216) {
            this.method2643(-11, (class7[]) null, 39, -49, -54, (class281) null, -29, 74, -57, -78, true, (class449) null, (class449) null);
        }
        if (arg0 == null) {
            return var25;
        } else {
            var25.method529((byte) 1, var8, true);
            return arg0.method2806(var25, arg1, arg3, arg4, (byte) 108, arg5);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
    public final void method2642(boolean arg0, int arg1) {
        this.field5981 = arg0;
        field5972++;
        if (arg1 != -21790) {
            this.method2643(-69, (class7[]) null, 73, 109, 122, (class281) null, 55, 40, -120, 4, false, (class449) null, (class449) null);
        }
        this.method2635(true);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[Lff;IIILaa;IIIIZLlo;Llo;)Lhc;")
    public final class75 method2643(int arg0, class7[] arg1, int arg2, int arg3, int arg4, class281 arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, class449 arg11, class449 arg12) {
        field5991++;
        if (this.field5969 != -1) {
            return class393.method2556(this.field5969, 4).method1406(arg4, arg2, arg12, arg1, arg5, arg0, arg7, arg3, arg8, arg9, arg11, (byte) -9);
        }
        int var14 = arg3;
        long var15 = this.field5987;
        int[] var17 = this.field5990;
        if (arg12 != null && (arg12.field6512 >= 0 || arg12.field6507 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field5990[var18];
            }
            if (arg12.field6512 >= 0) {
                if (arg12.field6512 == 65535) {
                    var15 ^= 0xFFFFFFFF00000000L;
                    var17[5] = 0;
                } else {
                    var17[5] = class311.method1970(1073741824, arg12.field6512);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg12.field6507 >= 0) {
                if (arg12.field6507 == 65535) {
                    var15 ^= 0xFFFFFFFFL;
                    var17[3] = 0;
                } else {
                    var17[3] = class311.method1970(arg12.field6507, 1073741824);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg12 != null || arg11 != null;
        int var22 = arg1 == null ? 0 : arg1.length;
        int var23 = 0;
        if (arg6 != -31379) {
            this.method2642(false, 64);
        }
        while (var22 > var23) {
            class438.field6299[var23] = null;
            if (arg1[var23] != null) {
                class449 var24 = class86.method599(false, arg1[var23].field116);
                if (var24.field6521 != null) {
                    class208.field2811[var23] = var24;
                    var21 = true;
                    int var25 = arg1[var23].field114;
                    int var26 = arg1[var23].field108;
                    int var27 = var24.field6521[var25];
                    class438.field6299[var23] = class326.method2051(101, var27 >>> 16);
                    int var28 = var27 & 0xFFFF;
                    class280.field3838[var23] = var28;
                    if (class438.field6299[var23] != null) {
                        var20 |= class438.field6299[var23].method2527(false, var28);
                        var19 |= class438.field6299[var23].method2533(var28, 255);
                    }
                    if ((var24.field6520 || class169.field2408) && var26 != -1 && var24.field6521.length > var26) {
                        class97.field1487[var23] = var24.field6506[var25];
                        class374.field5341[var23] = arg1[var23].field113;
                        int var29 = var24.field6521[var26];
                        class305.field4187[var23] = class326.method2051(100, var29 >>> 16);
                        int var30 = var29 & 0xFFFF;
                        class60.field847[var23] = var30;
                        if (class305.field4187[var23] != null) {
                            var20 |= class305.field4187[var23].method2527(false, var30);
                            var19 |= class305.field4187[var23].method2533(var30, 255);
                        }
                    } else {
                        class97.field1487[var23] = 0;
                        class374.field5341[var23] = 0;
                        class305.field4187[var23] = null;
                        class60.field847[var23] = -1;
                    }
                }
            }
            var23++;
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class387 var34 = null;
        class387 var35 = null;
        int var36 = -1;
        int var37 = -1;
        int var38 = 0;
        class387 var39 = null;
        class387 var40 = null;
        if (var21) {
            if (arg12 != null) {
                int var41 = arg12.field6521[arg2];
                int var42 = var41 >>> 16;
                var31 = var41 & 0xFFFF;
                var34 = class326.method2051(88, var42);
                if (var34 != null) {
                    var20 |= var34.method2527(false, var31);
                    var19 |= var34.method2533(var31, 255);
                }
                if ((arg12.field6520 || class169.field2408) && arg4 != -1 && arg4 < arg12.field6521.length) {
                    var33 = arg12.field6506[arg2];
                    int var43 = arg12.field6521[arg4];
                    int var44 = var43 >>> 16;
                    var35 = var42 == var44 ? var34 : class326.method2051(114, var44);
                    var32 = var43 & 0xFFFF;
                    if (var35 != null) {
                        var20 |= var35.method2527(false, var32);
                        var19 |= var35.method2533(var32, 255);
                    }
                }
            }
            var14 = arg3 | 0x20;
            if (arg11 != null) {
                int var45 = arg11.field6521[arg8];
                int var46 = var45 >>> 16;
                var36 = var45 & 0xFFFF;
                var39 = class326.method2051(104, var46);
                if (var39 != null) {
                    var20 |= var39.method2527(false, var36);
                    var19 |= var39.method2533(var36, 255);
                }
                if ((arg11.field6520 || class169.field2408) && arg7 != -1 && arg7 < arg11.field6521.length) {
                    int var47 = arg11.field6521[arg7];
                    var38 = arg11.field6506[arg8];
                    int var48 = var47 >>> 16;
                    var40 = var46 == var48 ? var39 : class326.method2051(122, var48);
                    var37 = var47 & 0xFFFF;
                    if (var40 != null) {
                        var20 |= var40.method2527(false, var37);
                        var19 |= var40.method2533(var37, 255);
                    }
                }
            }
            if (var20) {
                var14 |= 0x80;
            }
            if (var19) {
                var14 |= 0x100;
            }
        }
        class190 var49 = class414.field6007;
        class75 var50;
        synchronized (class414.field6007) {
            var50 = (class75) class414.field6007.method1246((byte) -90, var15);
        }
        class312 var51 = null;
        if (this.field5976 != -1) {
            var51 = class310.method1964((byte) 119, this.field5976);
        }
        if (var50 == null || arg5.method1732(var50.method533(), var14) != 0 || var51 != null && var51.field4289 != null && this.field5983 == null) {
            if (var50 != null) {
                var14 = arg5.method1777(var14, var50.method533());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field5975 != -1L) {
                            class190 var81 = class414.field6007;
                            synchronized (class414.field6007) {
                                var50 = (class75) class414.field6007.method1246((byte) -102, this.field5975);
                            }
                        }
                        if (var50 == null || arg5.method1732(var50.method533(), var14) != 0 || var51 != null && var51.field4289 != null && this.field5983 == null) {
                            return null;
                        }
                    } else {
                        class279[] var56 = new class279[12];
                        for (int var57 = 0; var57 < 12; var57++) {
                            int var58 = var17[var57];
                            if ((var58 & 0x40000000) != 0) {
                                class279 var60 = class347.method2222(var58 & 0x3FFFFFFF, arg6 + 50061).method2539(this.field5981, false);
                                if (var60 != null) {
                                    var56[var57] = var60;
                                }
                            } else if ((var58 & Integer.MIN_VALUE) != 0) {
                                class279 var59 = class194.method1287(var58 & 0x3FFFFFFF, arg6 ^ 0xFFFFAE38).method626(arg6 ^ 0xFFFF8519);
                                if (var59 != null) {
                                    var56[var57] = var59;
                                }
                            }
                        }
                        if (var51 != null && var51.field4289 != null) {
                            for (int var61 = 0; var61 < var51.field4289.length; var61++) {
                                if (var51.field4289[var61] != null && var56[var61] != null) {
                                    int var62 = var51.field4289[var61][0];
                                    int var63 = var51.field4289[var61][1];
                                    int var64 = var51.field4289[var61][2];
                                    int var65 = var51.field4289[var61][3] << 3;
                                    int var66 = var51.field4289[var61][4] << 3;
                                    int var67 = var51.field4289[var61][5] << 3;
                                    if (this.field5983 == null) {
                                        this.field5983 = new int[var51.field4289.length][];
                                    }
                                    if (this.field5983[var61] == null) {
                                        int[] var68 = this.field5983[var61] = new int[15];
                                        if (var65 == 0 && var66 == 0 && var67 == 0) {
                                            var68[14] = -var64;
                                            var68[0] = var68[4] = var68[8] = 32768;
                                            var68[13] = -var63;
                                            var68[12] = -var62;
                                        } else {
                                            int var69 = class362.field5082[var65];
                                            int var70 = class362.field5083[var65];
                                            int var71 = class362.field5082[var66];
                                            int var72 = class362.field5083[var66];
                                            int var73 = class362.field5082[var67];
                                            int var74 = class362.field5083[var67];
                                            int var75 = var70 * var73 + 16384 >> 15;
                                            int var76 = var70 * var74 + 16384 >> 15;
                                            var68[6] = -var72 * var73 + var71 * var76 + 16384 >> 15;
                                            var68[4] = var69 * var73 + 16384 >> 15;
                                            var68[7] = -var72 * -var74 + var71 * var75 + 16384 >> 15;
                                            var68[2] = var69 * var72 + 16384 >> 15;
                                            var68[8] = var69 * var71 + 16384 >> 15;
                                            var68[5] = -var70;
                                            var68[3] = var69 * var74 + 16384 >> 15;
                                            var68[1] = -var74 * var71 + var72 * var75 + 16384 >> 15;
                                            var68[0] = var71 * var73 + var72 * var76 + 16384 >> 15;
                                            var68[13] = var68[1] * -var62 + (var68[4] * -var63) + (var68[7] * -var64 - -16384) >> 15;
                                            var68[14] = var68[2] * -var62 + (var68[5] * -var63) - (-(var68[8] * -var64) - 16384) >> 15;
                                            var68[12] = var68[6] * -var64 + var68[0] * -var62 + (var68[3] * -var63) + 16384 >> 15;
                                        }
                                        var68[10] = var63;
                                        var68[11] = var64;
                                        var68[9] = var62;
                                    }
                                    if (var65 != 0 || var66 != 0 || var67 != 0) {
                                        var56[var61].method1715(var67, var66, (byte) 81, var65);
                                    }
                                    if (var62 != 0 || var63 != 0 || var64 != 0) {
                                        var56[var61].method1707(var63, (byte) -61, var62, var64);
                                    }
                                }
                            }
                        }
                        int var77 = var14 | 0x2000;
                        class279 var78 = new class279(var56, var56.length);
                        var50 = arg5.method1736(var78, var77, class406.field5898, 64, 850);
                        for (int var79 = 0; var79 < 5; var79++) {
                            if (this.field5974[var79] < class262.field3579[var79].length) {
                                var50.method509(class173.field2465[var79], class262.field3579[var79][this.field5974[var79]]);
                            }
                            if (this.field5974[var79] < class450.field6535[var79].length) {
                                var50.method509(class333.field4512[var79], class450.field6535[var79][this.field5974[var79]]);
                            }
                        }
                        if (arg10) {
                            var50.method508(var14);
                            class190 var80 = class414.field6007;
                            synchronized (class414.field6007) {
                                class414.field6007.method1247(var15, (byte) -114, var50);
                            }
                            this.field5975 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var55) != 0 && !class194.method1287(var55 & 0x3FFFFFFF, 11093).method627(false)) {
                        var53 = true;
                    }
                } else if (!class347.method2222(var55 & 0x3FFFFFFF, 18682).method2550((byte) -11, this.field5981)) {
                    var53 = true;
                }
                var54++;
            }
        }
        class75 var82 = var50.method529((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = 1;
        while (var83 < var22) {
            if (class438.field6299[var83] != null) {
                var82.method532(false, class438.field6299[var83], this.field5983 == null ? null : this.field5983[var83], 0, class305.field4187[var83], class280.field3838[var83], class374.field5341[var83] - 1, class60.field847[var83], -2, class97.field1487[var83], var84);
            }
            var83++;
            var84 <<= 0x1;
        }
        if (var34 != null && var39 != null) {
            var82.method536(arg9 - 1, var35, var31, false, var34, 0, var40, var39, var32, var33, var38, arg12.field6498, var36, arg0 - 1, var37);
        } else if (var34 != null) {
            var82.method517(var32, var31, var33, false, var34, 0, arg0 - 1, var35, (byte) -57);
        } else if (var39 != null) {
            var82.method517(var37, var36, var38, false, var39, 0, arg9 - 1, var40, (byte) -108);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class438.field6299[var85] = null;
            class305.field4187[var85] = null;
            class208.field2811[var85] = null;
        }
        return var82;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILvk;)V")
    public static final void method2644(int arg0, class207 arg1) {
        if (arg0 >= -85) {
            field5986 = null;
        }
        field5980++;
        if (!class349.field4882) {
            arg1.method2459(198);
            class390.field5740--;
        }
    }
}
