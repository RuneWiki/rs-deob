import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class330 {

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public int field4932 = -1;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
    public static int field4947 = -1;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "Z")
    public static boolean field4938 = false;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
    public static int field4951 = 0;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
    public static int field4952 = 0;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    private int field4940;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "J")
    private long field4936;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "J")
    private long field4948;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "Lje;")
    public static class178 field4954;

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "Z")
    public boolean field4953;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "[I")
    private int[] field4931;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "[I")
    public int[] field4941;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "[[I")
    private int[][] field4937;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)V")
    public final void method2018(boolean arg0, int arg1) {
        field4946++;
        if (arg1 <= 13) {
            field4938 = true;
        }
        this.field4953 = arg0;
        this.method2023(-95);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIII)V")
    public static final void method2019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4950++;
        if (class293.field4420 <= arg2 && class119.field1643 >= arg4 && arg3 >= class176.field2503 && arg5 <= class296.field4443) {
            class182.method1253(arg4, false, arg2, arg3, arg1, arg5);
        } else {
            class141.method975(arg1, arg5, arg3, (byte) 91, arg2, arg4);
        }
        if (arg0 != -1) {
            method2025(-57);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBIIII)V")
    public static final void method2020(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg3 + 1;
        class345.method2125(false, class49.field723[arg3], arg5, arg2, arg0);
        field4933++;
        int var9 = arg4 - 1;
        class345.method2125(false, class49.field723[arg4], arg5, arg2, arg0);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class49.field723[var6];
            var7[arg5] = var7[arg2] = arg0;
        }
        if (arg1 < 37) {
            method2019(62, 119, -48, 57, 42, 125);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2021(byte arg0, String arg1) {
        if (arg0 < 104) {
            field4938 = true;
        }
        field4942++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZILll;)V")
    public final void method2022(int arg0, boolean arg1, int arg2, class203 arg3) {
        field4955++;
        int var5 = class355.field5383[arg0];
        if (this.field4931[var5] == 0) {
            return;
        }
        if (!arg1) {
            this.method2022(13, true, -8, (class203) null);
        }
        if (arg3.method1384(68, arg2) != null) {
            this.field4931[var5] = class347.method2139(arg2, Integer.MIN_VALUE);
            this.method2023(104);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    private final void method2023(int arg0) {
        field4945++;
        long[] var2 = class82.field1154;
        this.field4936 = -1L;
        this.field4936 = this.field4936 >>> 8 ^ var2[(int) (((long) (this.field4940 >> 8) ^ this.field4936) & 0xFFL)];
        this.field4936 = this.field4936 >>> 8 ^ var2[(int) ((this.field4936 ^ (long) this.field4940) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field4936 = this.field4936 >>> 8 ^ var2[(int) (((long) (this.field4931[var3] >> 24) ^ this.field4936) & 0xFFL)];
            this.field4936 = var2[(int) ((this.field4936 ^ (long) (this.field4931[var3] >> 16)) & 0xFFL)] ^ this.field4936 >>> 8;
            this.field4936 = this.field4936 >>> 8 ^ var2[(int) (((long) (this.field4931[var3] >> 8) ^ this.field4936) & 0xFFL)];
            this.field4936 = var2[(int) ((this.field4936 ^ (long) this.field4931[var3]) & 0xFFL)] ^ this.field4936 >>> 8;
        }
        int var4 = 0;
        int var5 = 19 / ((-arg0 - 57) / 38);
        while (var4 < 5) {
            this.field4936 = var2[(int) (((long) this.field4941[var4] ^ this.field4936) & 0xFFL)] ^ this.field4936 >>> 8;
            var4++;
        }
        this.field4936 = var2[(int) (((long) (this.field4953 ? 1 : 0) ^ this.field4936) & 0xFFL)] ^ this.field4936 >>> 8;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
    public static final void method2024(int arg0, int arg1, int arg2) {
        field4956++;
        if (arg0 != -29060) {
            method2019(-61, 58, -43, -104, 2, 90);
        }
        class378.method2320(class130.field1816, (byte) 119);
        class129.field1791++;
        class230.field3390.method2593(-42, arg2);
        class230.field3390.method2610(arg1, (byte) 19);
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
    public static void method2025(int arg0) {
        field4954 = null;
        if (arg0 != 2128933135) {
            method2024(23, 48, 84);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lpp;ILg;IIILhq;Lqs;Ltq;ILll;Lei;)Lns;")
    public final class57 method2026(class356 arg0, int arg1, class393 arg2, int arg3, int arg4, int arg5, class392 arg6, class45 arg7, class63 arg8, int arg9, class203 arg10, class247 arg11) {
        field4943++;
        if (this.field4932 != -1) {
            return arg7.method334(this.field4932, (byte) 104).method1776(arg3, 14285, arg5, arg9, arg0, arg11, arg2, arg8, arg4);
        } else if (arg1 == -1) {
            int var13 = arg9;
            if (arg0 != null) {
                boolean var14 = false;
                boolean var15 = false;
                boolean var16 = false;
                boolean var17 = true;
                boolean var18 = true;
                Object var19 = null;
                int var20 = arg0.field5389[arg5];
                var13 = arg9 | 0x20;
                Object var21 = null;
                int var22 = var20 >>> 16;
                class110 var23 = arg11.method1580(arg1 ^ 0xFFFFFFFE, var22);
                int var24 = var20 & 0xFFFF;
                if (var23 != null) {
                    var15 |= var23.method808(-87, var24);
                    var14 |= var23.method807(true, var24);
                    var16 |= arg0.field5398;
                }
                if ((arg0.field5396 || class155.field2162) && arg3 != -1 && arg0.field5389.length > arg3) {
                    int var25 = arg0.field5389[arg3];
                    int var26 = var25 >>> 16;
                    class110 var27 = var22 == var26 ? var23 : arg11.method1580(1, var26);
                    int var28 = var25 & 0xFFFF;
                    if (var27 != null) {
                        var15 |= var27.method808(-106, var28);
                        var14 |= var27.method807(true, var28);
                    }
                }
                if (var15) {
                    var13 |= 0x80;
                }
                if (var14) {
                    var13 |= 0x100;
                }
                if (var16) {
                    var13 |= 0x200;
                }
            }
            class400 var29 = class452.field6417;
            class57 var30;
            synchronized (class452.field6417) {
                var30 = (class57) class452.field6417.method2393(-121, this.field4936);
            }
            if (var30 == null || arg8.method583(var30.method402(), var13) != 0) {
                if (var30 != null) {
                    var13 = arg8.method578(var13, var30.method402());
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < 12; var33++) {
                    int var34 = this.field4931[var33];
                    if ((var34 & 0x40000000) == 0) {
                        if ((var34 & Integer.MIN_VALUE) != 0 && !arg10.method1384(42, var34 & 0x3FFFFFFF).method877(82)) {
                            var32 = true;
                        }
                    } else if (!arg6.method2364((byte) 118, var34 & 0x3FFFFFFF).method1263((byte) 114, this.field4953)) {
                        var32 = true;
                    }
                }
                if (var32) {
                    return null;
                }
                class246[] var35 = new class246[12];
                int var36 = 0;
                for (int var37 = 0; var37 < 12; var37++) {
                    int var38 = this.field4931[var37];
                    if ((var38 & 0x40000000) != 0) {
                        class246 var40 = arg6.method2364((byte) 118, var38 & 0x3FFFFFFF).method1273(0, this.field4953);
                        if (var40 != null) {
                            var35[var36++] = var40;
                        }
                    } else if ((Integer.MIN_VALUE & var38) != 0) {
                        class246 var39 = arg10.method1384(49, var38 & 0x3FFFFFFF).method876(25);
                        if (var39 != null) {
                            var35[var36++] = var39;
                        }
                    }
                }
                class246 var41 = new class246(var35, var36);
                int var42 = var13 | 0x2000;
                var30 = arg8.method555(var41, var42, class329.field4930, 64, 768);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (class87.field1233[var43].length > this.field4941[var43]) {
                        var30.method420(class76.field1071[var43], class87.field1233[var43][this.field4941[var43]]);
                    }
                    if (class314.field4733[var43].length > this.field4941[var43]) {
                        var30.method420(class73.field989[var43], class314.field4733[var43][this.field4941[var43]]);
                    }
                }
                var30.method441(var13);
                class400 var44 = class452.field6417;
                synchronized (class452.field6417) {
                    class452.field6417.method2395(0, var30, this.field4936);
                }
            }
            if (arg0 == null) {
                return var30;
            } else {
                var30.method437((byte) 4, var13, true);
                return arg0.method2191(arg9, arg5, arg4, arg3, var30, -65536);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBILpp;Ltq;Lll;IIILei;II)Lns;")
    public final class57 method2027(int arg0, byte arg1, int arg2, class356 arg3, class63 arg4, class203 arg5, int arg6, int arg7, int arg8, class247 arg9, int arg10, int arg11) {
        field4944++;
        int var13 = arg8;
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = true;
            boolean var18 = true;
            Object var19 = null;
            int var20 = arg3.field5389[arg6];
            var13 = arg8 | 0x20;
            Object var21 = null;
            int var22 = var20 >>> 16;
            int var23 = var20 & 0xFFFF;
            class110 var24 = arg9.method1580(1, var22);
            if (var24 != null) {
                var15 |= var24.method808(-48, var23);
                var14 |= var24.method807(true, var23);
                var16 |= arg3.field5398;
            }
            if ((arg3.field5396 || class155.field2162) && arg2 != -1 && arg3.field5389.length > arg2) {
                int var25 = arg3.field5389[arg2];
                int var26 = var25 >>> 16;
                int var27 = var25 & 0xFFFF;
                class110 var28;
                if (var22 == var26) {
                    var28 = var24;
                } else {
                    var28 = arg9.method1580(1, var27 >>> 16);
                }
                if (var28 != null) {
                    var15 |= var28.method808(-105, var27);
                    var14 |= var28.method807(true, var27);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
        }
        long var29 = (long) arg7 << 32 | (long) (arg10 << 16) | (long) arg11;
        class400 var31 = class452.field6417;
        class57 var32;
        synchronized (class452.field6417) {
            var32 = (class57) class452.field6417.method2393(arg1 ^ 0xFFFFFF98, var29);
        }
        if (var32 == null || arg4.method583(var32.method402(), var13) != 0) {
            if (var32 != null) {
                var13 = arg4.method578(var13, var32.method402());
            }
            class246[] var34 = new class246[3];
            int var35 = 0;
            if (!arg5.method1384(arg1 + 10, arg11).method877(9) || !arg5.method1384(68, arg10).method877(109) || !arg5.method1384(88, arg7).method877(76)) {
                return null;
            }
            class246 var36 = arg5.method1384(arg1 ^ 0x3E, arg11).method876(25);
            if (var36 != null) {
                var34[var35++] = var36;
            }
            class246 var37 = arg5.method1384(arg1 + 36, arg10).method876(arg1 ^ 0x2);
            if (var37 != null) {
                var34[var35++] = var37;
            }
            class246 var38 = arg5.method1384(42, arg7).method876(25);
            if (var38 != null) {
                var34[var35++] = var38;
            }
            int var39 = var13 | 0x2000;
            class246 var40 = new class246(var34, var35);
            var32 = arg4.method555(var40, var39, class329.field4930, 64, 768);
            for (int var41 = 0; var41 < 5; var41++) {
                if (this.field4941[var41] < class87.field1233[var41].length) {
                    var32.method420(class76.field1071[var41], class87.field1233[var41][this.field4941[var41]]);
                }
                if (class314.field4733[var41].length > this.field4941[var41]) {
                    var32.method420(class73.field989[var41], class314.field4733[var41][this.field4941[var41]]);
                }
            }
            var32.method441(var13);
            class400 var42 = class452.field6417;
            synchronized (class452.field6417) {
                class452.field6417.method2395(0, var32, var29);
            }
        }
        if (arg3 == null) {
            return var32;
        }
        if (arg1 != 27) {
            this.field4931 = null;
        }
        class57 var43 = var32.method437((byte) 4, var13, true);
        return arg3.method2191(arg8, arg6, arg0, arg2, var43, -65536);
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(III)V")
    public final void method2028(int arg0, int arg1, int arg2) {
        this.field4941[arg0] = arg1;
        field4939++;
        this.method2023(-128);
        int var4 = -39 / ((arg2 - 51) / 49);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZILei;Lpp;Lg;Lpp;IIIILqs;Ltq;Lll;Z[Lhs;Lnk;Lhq;I)Lns;")
    public final class57 method2029(int arg0, boolean arg1, int arg2, class247 arg3, class356 arg4, class393 arg5, class356 arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, class63 arg12, class203 arg13, boolean arg14, class414[] arg15, class286 arg16, class392 arg17, int arg18) {
        field4934++;
        if (this.field4932 != -1) {
            return arg11.method334(this.field4932, (byte) 104).method1778(arg12, arg3, arg7, arg0, arg8, arg5, arg10, arg15, arg6, arg2, 16384, arg4, arg18, arg9, arg16);
        }
        int var20 = arg9;
        long var21 = this.field4936;
        int[] var23 = this.field4931;
        if (arg6 != null && (arg6.field5397 >= 0 || arg6.field5403 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field4931[var24];
            }
            if (arg6.field5397 >= 0) {
                if (arg6.field5397 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class347.method2139(arg6.field5397, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg6.field5403 >= 0) {
                if (arg6.field5403 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class347.method2139(1073741824, arg6.field5403);
                    var21 ^= (long) var23[3];
                }
            }
        }
        boolean var25 = arg14;
        boolean var26 = false;
        boolean var27 = arg6 != null || arg4 != null;
        int var28 = arg15 == null ? 0 : arg15.length;
        for (int var29 = 0; var29 < var28; var29++) {
            class95.field1355[var29] = null;
            if (arg15[var29] != null) {
                class356 var30 = arg3.method1586(arg15[var29].field5974, (byte) 36);
                if (var30.field5389 != null) {
                    var27 = true;
                    class345.field5255[var29] = var30;
                    int var31 = arg15[var29].field5973;
                    int var32 = arg15[var29].field5966;
                    int var33 = var30.field5389[var31];
                    class95.field1355[var29] = arg3.method1580(1, var33 >>> 16);
                    int var34 = var33 & 0xFFFF;
                    class389.field5720[var29] = var34;
                    if (class95.field1355[var29] != null) {
                        var26 |= class95.field1355[var29].method808(101, var34);
                        var25 |= class95.field1355[var29].method807(true, var34);
                    }
                    if ((var30.field5396 || class155.field2162) && var32 != -1 && var30.field5389.length > var32) {
                        class258.field3849[var29] = var30.field5421[var31];
                        class155.field2161[var29] = arg15[var29].field5969;
                        int var35 = var30.field5389[var32];
                        class266.field3956[var29] = arg3.method1580(1, var35 >>> 16);
                        int var36 = var35 & 0xFFFF;
                        class199.field2999[var29] = var36;
                        if (class266.field3956[var29] != null) {
                            var26 |= class266.field3956[var29].method808(106, var36);
                            var25 |= class266.field3956[var29].method807(!arg14, var36);
                        }
                    } else {
                        class258.field3849[var29] = 0;
                        class155.field2161[var29] = 0;
                        class266.field3956[var29] = null;
                        class199.field2999[var29] = -1;
                    }
                }
            }
        }
        int var37 = -1;
        int var38 = -1;
        int var39 = 0;
        class110 var40 = null;
        class110 var41 = null;
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        class110 var45 = null;
        class110 var46 = null;
        if (var27) {
            if (arg6 != null) {
                int var47 = arg6.field5389[arg8];
                int var48 = var47 >>> 16;
                var37 = var47 & 0xFFFF;
                var40 = arg3.method1580(1, var48);
                if (var40 != null) {
                    var26 |= var40.method808(-40, var37);
                    var25 |= var40.method807(!arg14, var37);
                }
                if ((arg6.field5396 || class155.field2162) && arg18 != -1 && arg18 < arg6.field5389.length) {
                    int var49 = arg6.field5389[arg18];
                    var39 = arg6.field5421[arg8];
                    int var50 = var49 >>> 16;
                    var38 = var49 & 0xFFFF;
                    var41 = var48 == var50 ? var40 : arg3.method1580(1, var50);
                    if (var41 != null) {
                        var26 |= var41.method808(-64, var38);
                        var25 |= var41.method807(true, var38);
                    }
                }
            }
            var20 = arg9 | 0x20;
            if (arg4 != null) {
                int var51 = arg4.field5389[arg2];
                int var52 = var51 >>> 16;
                var42 = var51 & 0xFFFF;
                var45 = arg3.method1580(1, var52);
                if (var45 != null) {
                    var26 |= var45.method808(96, var42);
                    var25 |= var45.method807(true, var42);
                }
                if ((arg4.field5396 || class155.field2162) && arg10 != -1 && arg4.field5389.length > arg10) {
                    var44 = arg4.field5421[arg2];
                    int var53 = arg4.field5389[arg10];
                    int var54 = var53 >>> 16;
                    var46 = var52 == var54 ? var45 : arg3.method1580(1, var54);
                    var43 = var53 & 0xFFFF;
                    if (var46 != null) {
                        var26 |= var46.method808(-120, var43);
                        var25 |= var46.method807(true, var43);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
        }
        class400 var55 = class269.field3975;
        class57 var56;
        synchronized (class269.field3975) {
            var56 = (class57) class269.field3975.method2393(-118, var21);
        }
        class322 var57 = null;
        if (this.field4940 != -1) {
            var57 = arg16.method1829(this.field4940, (byte) -125);
        }
        if (var56 == null || arg12.method583(var56.method402(), var20) != 0 || var57 != null && var57.field4818 != null && this.field4937 == null) {
            if (var56 != null) {
                var20 = arg12.method578(var20, var56.method402());
            }
            boolean var59 = false;
            for (int var60 = 0; var60 < 12; var60++) {
                int var61 = var23[var60];
                if ((var61 & 0x40000000) == 0) {
                    if ((var61 & Integer.MIN_VALUE) != 0 && !arg13.method1384(50, var61 & 0x3FFFFFFF).method873(0)) {
                        var59 = true;
                    }
                } else if (!arg17.method2364((byte) 118, var61 & 0x3FFFFFFF).method1262(this.field4953, (byte) 111)) {
                    var59 = true;
                }
            }
            if (var59) {
                if (this.field4948 != -1L) {
                    class400 var87 = class269.field3975;
                    synchronized (class269.field3975) {
                        var56 = (class57) class269.field3975.method2393(-119, this.field4948);
                    }
                }
                if (var56 == null || arg12.method583(var56.method402(), var20) != 0 || var57 != null && var57.field4818 != null && this.field4937 == null) {
                    return null;
                }
            } else {
                class246[] var62 = new class246[12];
                for (int var63 = 0; var63 < 12; var63++) {
                    int var64 = var23[var63];
                    if ((var64 & 0x40000000) != 0) {
                        class246 var66 = arg17.method2364((byte) 118, var64 & 0x3FFFFFFF).method1272(-116, this.field4953);
                        if (var66 != null) {
                            var62[var63] = var66;
                        }
                    } else if ((Integer.MIN_VALUE & var64) != 0) {
                        class246 var65 = arg13.method1384(78, var64 & 0x3FFFFFFF).method872((byte) -101);
                        if (var65 != null) {
                            var62[var63] = var65;
                        }
                    }
                }
                if (var57 != null && var57.field4818 != null) {
                    for (int var67 = 0; var67 < var57.field4818.length; var67++) {
                        if (var57.field4818[var67] != null && var62[var67] != null) {
                            int var68 = var57.field4818[var67][0];
                            int var69 = var57.field4818[var67][1];
                            int var70 = var57.field4818[var67][2];
                            int var71 = var57.field4818[var67][3] << 3;
                            int var72 = var57.field4818[var67][4] << 3;
                            int var73 = var57.field4818[var67][5] << 3;
                            if (this.field4937 == null) {
                                this.field4937 = new int[var57.field4818.length][];
                            }
                            if (this.field4937[var67] == null) {
                                int[] var74 = this.field4937[var67] = new int[15];
                                if (var71 == 0 && var72 == 0 && var73 == 0) {
                                    var74[14] = -var70;
                                    var74[13] = -var69;
                                    var74[12] = -var68;
                                    var74[0] = var74[4] = var74[8] = 32768;
                                } else {
                                    int var75 = class172.field2456[var71];
                                    int var76 = class172.field2450[var71];
                                    int var77 = class172.field2456[var72];
                                    int var78 = class172.field2450[var72];
                                    int var79 = class172.field2456[var73];
                                    int var80 = class172.field2450[var73];
                                    int var81 = var76 * var79 + 16384 >> 15;
                                    int var82 = var76 * var80 + 16384 >> 15;
                                    var74[7] = -var78 * -var80 + var77 * var81 + 16384 >> 15;
                                    var74[5] = -var76;
                                    var74[4] = var75 * var79 + 16384 >> 15;
                                    var74[1] = -var80 * var77 + var78 * var81 + 16384 >> 15;
                                    var74[6] = -var78 * var79 + var77 * var82 + 16384 >> 15;
                                    var74[2] = var75 * var78 + 16384 >> 15;
                                    var74[0] = var77 * var79 + var78 * var82 + 16384 >> 15;
                                    var74[3] = var75 * var80 + 16384 >> 15;
                                    var74[8] = var75 * var77 + 16384 >> 15;
                                    var74[13] = var74[1] * -var68 + (var74[4] * -var69 + (var74[7] * -var70) + 16384) >> 15;
                                    var74[14] = var74[2] * -var68 + var74[5] * -var69 + var74[8] * -var70 + 16384 >> 15;
                                    var74[12] = var74[0] * -var68 + var74[3] * -var69 + var74[6] * -var70 + 16384 >> 15;
                                }
                                var74[11] = var70;
                                var74[9] = var68;
                                var74[10] = var69;
                            }
                            if (var71 != 0 || var72 != 0 || var73 != 0) {
                                var62[var67].method1571(-15354, var72, var71, var73);
                            }
                            if (var68 != 0 || var69 != 0 || var70 != 0) {
                                var62[var67].method1569(0, var69, var68, var70);
                            }
                        }
                    }
                }
                class246 var83 = new class246(var62, var62.length);
                int var84 = var20 | 0x2000;
                var56 = arg12.method555(var83, var84, class329.field4930, 64, 850);
                for (int var85 = 0; var85 < 5; var85++) {
                    if (this.field4941[var85] < class87.field1233[var85].length) {
                        var56.method420(class76.field1071[var85], class87.field1233[var85][this.field4941[var85]]);
                    }
                    if (this.field4941[var85] < class314.field4733[var85].length) {
                        var56.method420(class73.field989[var85], class314.field4733[var85][this.field4941[var85]]);
                    }
                }
                if (arg1) {
                    var56.method441(var20);
                    class400 var86 = class269.field3975;
                    synchronized (class269.field3975) {
                        class269.field3975.method2395(0, var56, var21);
                    }
                    this.field4948 = var21;
                }
            }
        }
        class57 var88 = var56.method437((byte) 4, var20, true);
        if (!var27) {
            return var88;
        }
        int var89 = 0;
        int var90 = 1;
        while (var28 > var89) {
            if (class95.field1355[var89] != null) {
                var88.method427(class266.field3956[var89], class389.field5720[var89], this.field4937 == null ? null : this.field4937[var89], false, var90, 0, (byte) 86, class199.field2999[var89], class155.field2161[var89] - 1, class258.field3849[var89], class95.field1355[var89]);
            }
            var89++;
            var90 <<= 0x1;
        }
        if (var40 != null && var45 != null) {
            var88.method440(var40, arg6.field5393, var37, var46, var39, var44, var43, var42, var45, false, var38, var41, arg7 - 1, arg0 + -1, 65535);
        } else if (var40 != null) {
            var88.method410(var40, 0, var41, var38, -4222, false, var37, var39, arg0 - 1);
        } else if (var45 != null) {
            var88.method410(var45, 0, var46, var43, -4222, false, var42, var44, arg7 - 1);
        }
        for (int var91 = 0; var91 < var28; var91++) {
            class95.field1355[var91] = null;
            class266.field3956[var91] = null;
            class345.field5255[var91] = null;
        }
        return var88;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "([IIIIZ[I)V")
    public final void method2030(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        this.field4953 = arg4;
        if (this.field4940 != arg2) {
            this.field4940 = arg2;
            this.field4937 = null;
        }
        if (arg1 != -8909) {
            return;
        }
        field4949++;
        this.field4932 = arg3;
        this.field4931 = arg0;
        this.field4941 = arg5;
        this.method2023(-108);
    }
}
