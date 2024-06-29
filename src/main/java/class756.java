import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class756 {

    @OriginalMember(owner = "client!lga", name = "t", descriptor = "I")
    public int field10312 = -1;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
    public static int field10293;

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "I")
    public static int field10296;

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
    public static int field10297;

    @OriginalMember(owner = "client!lga", name = "g", descriptor = "I")
    public static int field10299;

    @OriginalMember(owner = "client!lga", name = "i", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "I")
    public static int field10302;

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "I")
    private int field10303;

    @OriginalMember(owner = "client!lga", name = "m", descriptor = "I")
    public static int field10305;

    @OriginalMember(owner = "client!lga", name = "n", descriptor = "I")
    public static int field10306;

    @OriginalMember(owner = "client!lga", name = "q", descriptor = "I")
    public static int field10309;

    @OriginalMember(owner = "client!lga", name = "r", descriptor = "I")
    public static int field10310;

    @OriginalMember(owner = "client!lga", name = "s", descriptor = "I")
    public static int field10311;

    @OriginalMember(owner = "client!lga", name = "u", descriptor = "I")
    public static int field10313;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "J")
    private long field10294;

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "J")
    private long field10298;

    @OriginalMember(owner = "client!lga", name = "p", descriptor = "Lmc;")
    public static class234 field10308;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "Z")
    public boolean field10295;

    @OriginalMember(owner = "client!lga", name = "h", descriptor = "[I")
    private int[] field10300;

    @OriginalMember(owner = "client!lga", name = "o", descriptor = "[I")
    public int[] field10307;

    @OriginalMember(owner = "client!lga", name = "l", descriptor = "[Lht;")
    private class413[] field10304;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
    private final void method4102(byte arg0) {
        field10311++;
        long[] var2 = class693.field8897;
        this.field10298 = -1L;
        this.field10298 = this.field10298 >>> 8 ^ var2[(int) (((long) (this.field10303 >> 8) ^ this.field10298) & 0xFFL)];
        this.field10298 = var2[(int) (((long) this.field10303 ^ this.field10298) & 0xFFL)] ^ this.field10298 >>> 8;
        for (int var3 = 0; var3 < this.field10300.length; var3++) {
            this.field10298 = this.field10298 >>> 8 ^ var2[(int) (((long) (this.field10300[var3] >> 24) ^ this.field10298) & 0xFFL)];
            this.field10298 = this.field10298 >>> 8 ^ var2[(int) ((this.field10298 ^ (long) (this.field10300[var3] >> 16)) & 0xFFL)];
            this.field10298 = var2[(int) ((this.field10298 ^ (long) (this.field10300[var3] >> 8)) & 0xFFL)] ^ this.field10298 >>> 8;
            this.field10298 = this.field10298 >>> 8 ^ var2[(int) (((long) this.field10300[var3] ^ this.field10298) & 0xFFL)];
        }
        if (this.field10304 != null) {
            for (int var4 = 0; var4 < this.field10304.length; var4++) {
                if (this.field10304[var4] != null) {
                    int[] var5;
                    int[] var6;
                    if (this.field10295) {
                        var5 = this.field10304[var4].field5477;
                        var6 = this.field10304[var4].field5475;
                    } else {
                        var5 = this.field10304[var4].field5473;
                        var6 = this.field10304[var4].field5474;
                    }
                    if (var5 != null) {
                        for (int var7 = 0; var7 < var5.length; var7++) {
                            this.field10298 = var2[(int) (((long) (var5[var7] >> 8) ^ this.field10298) & 0xFFL)] ^ this.field10298 >>> 8;
                            this.field10298 = this.field10298 >>> 8 ^ var2[(int) ((this.field10298 ^ (long) var5[var7]) & 0xFFL)];
                        }
                    }
                    if (var6 != null) {
                        for (int var8 = 0; var8 < var6.length; var8++) {
                            this.field10298 = this.field10298 >>> 8 ^ var2[(int) (((long) (var6[var8] >> 8) ^ this.field10298) & 0xFFL)];
                            this.field10298 = var2[(int) ((this.field10298 ^ (long) var6[var8]) & 0xFFL)] ^ this.field10298 >>> 8;
                        }
                    }
                    if (this.field10304[var4].field5471 != null) {
                        for (int var9 = 0; var9 < this.field10304[var4].field5471.length; var9++) {
                            this.field10298 = var2[(int) ((this.field10298 ^ (long) (this.field10304[var4].field5471[var9] >> 8)) & 0xFFL)] ^ this.field10298 >>> 8;
                            this.field10298 = var2[(int) (((long) this.field10304[var4].field5471[var9] ^ this.field10298) & 0xFFL)] ^ this.field10298 >>> 8;
                        }
                    }
                    if (this.field10304[var4].field5469 != null) {
                        for (int var10 = 0; var10 < this.field10304[var4].field5469.length; var10++) {
                            this.field10298 = var2[(int) ((this.field10298 ^ (long) (this.field10304[var4].field5469[var10] >> 8)) & 0xFFL)] ^ this.field10298 >>> 8;
                            this.field10298 = this.field10298 >>> 8 ^ var2[(int) ((this.field10298 ^ (long) this.field10304[var4].field5469[var10]) & 0xFFL)];
                        }
                    }
                }
            }
        }
        if (arg0 > 96) {
            for (int var11 = 0; var11 < 5; var11++) {
                this.field10298 = this.field10298 >>> 8 ^ var2[(int) ((this.field10298 ^ (long) this.field10307[var11]) & 0xFFL)];
            }
            this.field10298 = this.field10298 >>> 8 ^ var2[(int) ((this.field10298 ^ (long) (this.field10295 ? 1 : 0)) & 0xFFL)];
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)V")
    public static void method4103(byte arg0) {
        field10308 = null;
        int var1 = 7 % ((arg0 - 22) / 50);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILcl;ILjba;IIIIILha;Leba;I)Lka;")
    public final class299 method4104(int arg0, class778 arg1, int arg2, class11 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class570 arg9, class691 arg10, int arg11) {
        field10305++;
        int var13 = arg2;
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg3.field109[arg7];
            var13 = arg2 | 0x20;
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class350 var25 = arg1.method4264(26510, var23);
            if (var25 != null) {
                var15 |= var25.method2021(var24, 122);
                var14 |= var25.method2025(var24, -2);
                var17 |= var25.method2020(var24, 1);
                var16 |= arg3.field98;
            }
            if ((arg3.field108 || class449.field5850) && arg5 != -1 && arg5 < arg3.field109.length) {
                int var26 = arg3.field109[arg5];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class350 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg1.method4264(26510, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method2021(var28, 124);
                    var14 |= var29.method2025(var28, arg4 ^ 0x747F471E);
                    var17 |= var29.method2020(var28, 1);
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
            if (var17) {
                var13 |= 0x400;
            }
        }
        if (arg4 != -1954498336) {
            this.field10300 = null;
        }
        long var30 = (long) arg6 | (long) arg0 << 32 | (long) (arg11 << 16);
        class536 var32 = class155.field1979;
        class299 var33;
        synchronized (class155.field1979) {
            var33 = (class299) class155.field1979.method2931(var30, (byte) -124);
        }
        if (var33 == null || arg9.method941(var33.method1239(), var13) != 0) {
            if (var33 != null) {
                var13 = arg9.method886(var13, var33.method1239());
            }
            class615[] var35 = new class615[3];
            int var36 = 0;
            if (!arg10.method3699(arg6, (byte) -56).method3040((byte) -19) || !arg10.method3699(arg11, (byte) -56).method3040((byte) -19) || !arg10.method3699(arg0, (byte) -56).method3040((byte) -19)) {
                return null;
            }
            class615 var37 = arg10.method3699(arg6, (byte) -56).method3045(true);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class615 var38 = arg10.method3699(arg11, (byte) -56).method3045(true);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class615 var39 = arg10.method3699(arg0, (byte) -56).method3045(true);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class615 var40 = new class615(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg9.method930(var40, var41, class212.field2917, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class493.field6321.length; var43++) {
                    if (class493.field6321[var43][var42].length > this.field10307[var42]) {
                        var33.method1265(class45.field513[var43][var42], class493.field6321[var43][var42][this.field10307[var42]]);
                    }
                }
            }
            var33.method1252(var13);
            class536 var44 = class155.field1979;
            synchronized (class155.field1979) {
                class155.field1979.method2918(var30, var33, 96);
            }
        }
        if (arg3 == null) {
            return var33;
        } else {
            class299 var45 = var33.method1284((byte) 4, var13, true);
            return arg3.method43(1024, arg2, arg8, arg5, var45, arg7);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I[Lht;ZII[I[I)V")
    public final void method4105(int arg0, class413[] arg1, boolean arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int var8 = -24 / ((arg4 + 58) / 39);
        this.field10300 = arg5;
        this.field10295 = arg2;
        field10313++;
        this.field10307 = arg6;
        if (this.field10303 != arg0) {
            this.field10303 = arg0;
        }
        this.field10304 = arg1;
        this.field10312 = arg3;
        this.method4102((byte) 97);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lek;B)Z")
    public static final boolean method4106(class624 arg0, byte arg1) {
        field10296++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field7952) {
            return false;
        } else if (!arg0.method3344(-26373, class402.field5325)) {
            return false;
        } else if (class206.field2838.method2616((long) arg0.field7954, (byte) -90) == null) {
            if (arg1 >= -75) {
                field10308 = null;
            }
            return class611.field7716.method2616((long) arg0.field7931, (byte) 85) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILen;Lbd;IILha;ILeba;Ljba;BLal;Lcl;)Lka;")
    public final class299 method4107(int arg0, class117 arg1, class577 arg2, int arg3, int arg4, class570 arg5, int arg6, class691 arg7, class11 arg8, byte arg9, class131 arg10, class778 arg11) {
        field10302++;
        if (this.field10312 != -1) {
            return arg10.method765((byte) -53, this.field10312).method1584(arg3, arg4, arg8, arg11, 64, arg5, arg6, null, arg0, arg2);
        }
        int var13 = arg4;
        if (arg8 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg8.field109[arg0];
            var13 = arg4 | 0x20;
            int var23 = var22 >>> 16;
            class350 var24 = arg11.method4264(26510, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2021(var25, 122);
                var14 |= var24.method2025(var25, -2);
                var17 |= var24.method2020(var25, 1);
                var16 |= arg8.field98;
            }
            if ((arg8.field108 || class449.field5850) && arg3 != -1 && arg3 < arg8.field109.length) {
                int var26 = arg8.field109[arg3];
                int var27 = var26 >>> 16;
                class350 var28 = var23 == var27 ? var24 : arg11.method4264(26510, var27);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method2021(var29, 124);
                    var14 |= var28.method2025(var29, -2);
                    var17 |= var28.method2020(var29, arg9 + 53);
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
            if (var17) {
                var13 |= 0x400;
            }
        }
        class536 var30 = class155.field1979;
        class299 var31;
        synchronized (class155.field1979) {
            var31 = (class299) class155.field1979.method2931(this.field10298, (byte) -90);
        }
        if (var31 == null || arg5.method941(var31.method1239(), var13) != 0) {
            if (var31 != null) {
                var13 = arg5.method886(var13, var31.method1239());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < this.field10300.length; var34++) {
                int var35 = this.field10300[var34];
                class413 var36 = null;
                if ((var35 & 0x40000000) != 0) {
                    if (this.field10304 != null && this.field10304[var34] != null) {
                        var36 = this.field10304[var34];
                    }
                    if (!arg1.method705(var35 & 0x3FFFFFFF, arg9 ^ 0x2CF9).method301(this.field10295, -1, var36)) {
                        var33 = true;
                    }
                } else if ((Integer.MIN_VALUE & var35) != 0 && !arg7.method3699(var35 & 0x3FFFFFFF, (byte) -56).method3040((byte) -19)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class615[] var37 = new class615[this.field10300.length];
            int var38 = 0;
            for (int var39 = 0; var39 < this.field10300.length; var39++) {
                int var40 = this.field10300[var39];
                class413 var41 = null;
                if ((var40 & 0x40000000) != 0) {
                    if (this.field10304 != null && this.field10304[var39] != null) {
                        var41 = this.field10304[var39];
                    }
                    class615 var43 = arg1.method705(var40 & 0x3FFFFFFF, arg9 - 11415).method312(var41, this.field10295, 88);
                    if (var43 != null) {
                        var37[var38++] = var43;
                    }
                } else if ((Integer.MIN_VALUE & var40) != 0) {
                    class615 var42 = arg7.method3699(var40 & 0x3FFFFFFF, (byte) -56).method3045(true);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                }
            }
            class615 var44 = new class615(var37, var38);
            int var45 = var13 | 0x4000;
            var31 = arg5.method930(var44, var45, class212.field2917, 64, 768);
            for (int var46 = 0; var46 < 5; var46++) {
                for (int var47 = 0; var47 < class493.field6321.length; var47++) {
                    if (class493.field6321[var47][var46].length > this.field10307[var46]) {
                        var31.method1265(class45.field513[var47][var46], class493.field6321[var47][var46][this.field10307[var46]]);
                    }
                }
            }
            var31.method1252(var13);
            class536 var48 = class155.field1979;
            synchronized (class155.field1979) {
                class155.field1979.method2918(this.field10298, var31, 106);
            }
        }
        if (arg8 == null) {
            return var31;
        }
        if (arg9 != -52) {
            field10306 = -29;
        }
        var31.method1284((byte) 4, var13, true);
        return arg8.method43(arg9 ^ 0xFFFFFBCC, arg4, arg6, arg3, var31, arg0);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(ZZ)V")
    public final void method4108(boolean arg0, boolean arg1) {
        this.field10295 = arg0;
        if (!arg1) {
            field10299++;
            this.method4102((byte) 113);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljba;I[ILjba;Lal;ILha;Lbd;BLeba;II[Lsk;Len;IZLqea;IIILcl;)Lka;")
    public final class299 method4109(class11 arg0, int arg1, int[] arg2, class11 arg3, class131 arg4, int arg5, class570 arg6, class577 arg7, byte arg8, class691 arg9, int arg10, int arg11, class129[] arg12, class117 arg13, int arg14, boolean arg15, class356 arg16, int arg17, int arg18, int arg19, class778 arg20) {
        field10309++;
        if (this.field10312 != -1) {
            return arg4.method765((byte) -53, this.field10312).method1581(arg5, arg6, arg1, -106, arg16, arg12, arg11, arg2, arg20, arg17, arg18, null, arg7, arg10, arg0, arg14, arg3, arg19);
        }
        int var22 = arg10;
        long var23 = this.field10298;
        int[] var25 = this.field10300;
        boolean var26 = false;
        boolean var27 = false;
        if (arg3 != null && (arg3.field123 >= 0 || arg3.field119 >= 0)) {
            var25 = new int[this.field10300.length];
            for (int var28 = 0; var28 < var25.length; var28++) {
                var25[var28] = this.field10300[var28];
            }
            if (arg3.field123 >= 0) {
                if (arg3.field123 == 65535) {
                    var23 ^= 0xFFFFFFFF00000000L;
                    var25[5] = 0;
                    var26 = true;
                } else {
                    var25[5] = class77.method473(1073741824, arg3.field123);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg3.field119 >= 0) {
                if (arg3.field119 == 65535) {
                    var23 ^= 0xFFFFFFFFL;
                    var25[3] = 0;
                } else {
                    var25[3] = class77.method473(1073741824, arg3.field119);
                    var23 ^= var25[3];
                }
                var27 = true;
            }
        }
        boolean var29 = false;
        boolean var30 = false;
        boolean var31 = false;
        boolean var32 = arg3 != null || arg0 != null;
        int var33 = arg12 == null ? 0 : arg12.length;
        for (int var34 = 0; var34 < var33; var34++) {
            class510.field6510[var34] = null;
            if (arg12[var34] != null) {
                class11 var35 = arg20.method4265(true, arg12[var34].field1726);
                if (var35.field109 != null) {
                    var32 = true;
                    class167.field2224[var34] = var35;
                    int var36 = arg12[var34].field1727;
                    int var37 = arg12[var34].field1722;
                    int var38 = var35.field109[var36];
                    class510.field6510[var34] = arg20.method4264(26510, var38 >>> 16);
                    int var39 = var38 & 0xFFFF;
                    class186.field2609[var34] = var39;
                    if (class510.field6510[var34] != null) {
                        var30 |= class510.field6510[var34].method2021(var39, 127);
                        var29 |= class510.field6510[var34].method2025(var39, -2);
                        var31 |= class510.field6510[var34].method2020(var39, 1);
                    }
                    if ((var35.field108 || class449.field5850) && var37 != -1 && var35.field109.length > var37) {
                        class164.field2171[var34] = var35.field121[var36];
                        class357.field4351[var34] = arg12[var34].field1728;
                        int var40 = var35.field109[var37];
                        class212.field2908[var34] = arg20.method4264(arg8 + 26573, var40 >>> 16);
                        int var41 = var40 & 0xFFFF;
                        class484.field6251[var34] = var41;
                        if (class212.field2908[var34] != null) {
                            var30 |= class212.field2908[var34].method2021(var41, 123);
                            var29 |= class212.field2908[var34].method2025(var41, -2);
                            var31 |= class212.field2908[var34].method2020(var41, 1);
                        }
                    } else {
                        class164.field2171[var34] = 0;
                        class357.field4351[var34] = 0;
                        class212.field2908[var34] = null;
                        class484.field6251[var34] = -1;
                    }
                }
            }
        }
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        if (arg8 != -63) {
            return null;
        }
        class350 var45 = null;
        class350 var46 = null;
        int var47 = -1;
        int var48 = -1;
        int var49 = 0;
        class350 var50 = null;
        class350 var51 = null;
        if (var32) {
            var22 = arg10 | 0x20;
            if (arg3 != null) {
                int var52 = arg3.field109[arg5];
                int var53 = var52 >>> 16;
                var45 = arg20.method4264(26510, var53);
                var42 = var52 & 0xFFFF;
                if (var45 != null) {
                    var30 |= var45.method2021(var42, arg8 ^ 0xFFFFFFB9);
                    var29 |= var45.method2025(var42, -2);
                    var31 |= var45.method2020(var42, 1);
                }
                if ((arg3.field108 || class449.field5850) && arg17 != -1 && arg3.field109.length > arg17) {
                    var44 = arg3.field121[arg5];
                    int var54 = arg3.field109[arg17];
                    int var55 = var54 >>> 16;
                    var43 = var54 & 0xFFFF;
                    var46 = var53 == var55 ? var45 : arg20.method4264(arg8 + 26573, var55);
                    if (var46 != null) {
                        var30 |= var46.method2021(var43, 127);
                        var29 |= var46.method2025(var43, arg8 + 61);
                        var31 |= var46.method2020(var43, 1);
                    }
                }
            }
            if (arg0 != null) {
                int var56 = arg0.field109[arg19];
                int var57 = var56 >>> 16;
                var47 = var56 & 0xFFFF;
                var50 = arg20.method4264(26510, var57);
                if (var50 != null) {
                    var30 |= var50.method2021(var47, 120);
                    var29 |= var50.method2025(var47, -2);
                    var31 |= var50.method2020(var47, 1);
                }
                if ((arg0.field108 || class449.field5850) && arg11 != -1 && arg11 < arg0.field109.length) {
                    int var58 = arg0.field109[arg11];
                    var49 = arg0.field121[arg19];
                    int var59 = var58 >>> 16;
                    var48 = var58 & 0xFFFF;
                    var51 = var57 == var59 ? var50 : arg20.method4264(arg8 + 26573, var59);
                    if (var51 != null) {
                        var30 |= var51.method2021(var48, 121);
                        var29 |= var51.method2025(var48, -2);
                        var31 |= var51.method2020(var48, 1);
                    }
                }
            }
            if (var30) {
                var22 |= 0x80;
            }
            if (var29) {
                var22 |= 0x100;
            }
            if (var31) {
                var22 |= 0x400;
            }
        }
        class536 var60 = class240.field3253;
        class299 var61;
        synchronized (class240.field3253) {
            var61 = (class299) class240.field3253.method2931(var23, (byte) -99);
        }
        class68 var62 = null;
        if (this.field10303 != -1) {
            var62 = arg16.method2048(this.field10303, (byte) 114);
        }
        if (var61 == null || arg6.method941(var61.method1239(), var22) != 0) {
            if (var61 != null) {
                var22 = arg6.method886(var22, var61.method1239());
            }
            boolean var64 = false;
            int var65 = 0;
            while (true) {
                if (var65 >= var25.length) {
                    if (!var64) {
                        class615[] var69 = new class615[var25.length];
                        for (int var70 = 0; var70 < var25.length; var70++) {
                            int var71 = var25[var70];
                            class413 var72 = null;
                            boolean var73 = var70 == 5 && var26 || var70 == 3 && var27;
                            if ((var71 & 0x40000000) != 0) {
                                if (!var73 && this.field10304 != null && this.field10304[var70] != null) {
                                    var72 = this.field10304[var70];
                                }
                                class615 var74 = arg13.method705(var71 & 0x3FFFFFFF, -11467).method315(0, var72, this.field10295);
                                if (var74 != null) {
                                    var69[var70] = var74;
                                }
                            } else if ((var71 & Integer.MIN_VALUE) != 0) {
                                class615 var75 = arg9.method3699(var71 & 0x3FFFFFFF, (byte) -56).method3042((byte) 116);
                                if (var75 != null) {
                                    var69[var70] = var75;
                                }
                            }
                        }
                        if (var62 != null && var62.field920 != null) {
                            for (int var76 = 0; var76 < var62.field920.length; var76++) {
                                if (var69[var76] != null) {
                                    int var77 = 0;
                                    int var78 = 0;
                                    int var79 = 0;
                                    int var80 = 0;
                                    int var81 = 0;
                                    int var82 = 0;
                                    if (var62.field920[var76] != null) {
                                        var81 = var62.field920[var76][4] << 3;
                                        var80 = var62.field920[var76][3] << 3;
                                        var79 = var62.field920[var76][2];
                                        var78 = var62.field920[var76][1];
                                        var82 = var62.field920[var76][5] << 3;
                                        var77 = var62.field920[var76][0];
                                    }
                                    if (var80 != 0 || var81 != 0 || var82 != 0) {
                                        var69[var76].method3300(var80, var82, var81, (byte) -118);
                                    }
                                    if (var77 != 0 || var78 != 0 || var79 != 0) {
                                        var69[var76].method3290(var77, true, var79, var78);
                                    }
                                }
                            }
                        }
                        int var83 = var22 | 0x4000;
                        class615 var84 = new class615(var69, var69.length);
                        var61 = arg6.method930(var84, var83, class212.field2917, 64, 850);
                        for (int var85 = 0; var85 < 5; var85++) {
                            for (int var86 = 0; var86 < class493.field6321.length; var86++) {
                                if (class493.field6321[var86][var85].length > this.field10307[var85]) {
                                    var61.method1265(class45.field513[var86][var85], class493.field6321[var86][var85][this.field10307[var85]]);
                                }
                            }
                        }
                        if (arg15) {
                            var61.method1252(var22);
                            class536 var87 = class240.field3253;
                            synchronized (class240.field3253) {
                                class240.field3253.method2918(var23, var61, 123);
                            }
                            this.field10294 = var23;
                        }
                        break;
                    }
                    if (this.field10294 != -1L) {
                        class536 var88 = class240.field3253;
                        synchronized (class240.field3253) {
                            var61 = (class299) class240.field3253.method2931(this.field10294, (byte) -83);
                        }
                    }
                    if (var61 != null && arg6.method941(var61.method1239(), var22) == 0) {
                        break;
                    }
                    return null;
                }
                int var66 = var25[var65];
                class413 var67 = null;
                boolean var68 = var65 == 5 && var26 || var65 == 3 && var27;
                if ((var66 & 0x40000000) != 0) {
                    if (!var68 && this.field10304 != null && this.field10304[var65] != null) {
                        var67 = this.field10304[var65];
                    }
                    if (!arg13.method705(var66 & 0x3FFFFFFF, -11467).method311(var67, (byte) 98, this.field10295)) {
                        var64 = true;
                    }
                } else if ((Integer.MIN_VALUE & var66) != 0 && !arg9.method3699(var66 & 0x3FFFFFFF, (byte) -56).method3046(arg8 + 63)) {
                    var64 = true;
                }
                var65++;
            }
        }
        class299 var89 = var61.method1284((byte) 4, var22, true);
        boolean var90 = false;
        if (arg2 != null) {
            for (int var91 = 0; var91 < arg2.length; var91++) {
                if (arg2[var91] != -1) {
                    var90 = true;
                }
            }
        }
        if (!var32 && !var90) {
            return var89;
        }
        class465[] var92 = null;
        if (var62 != null) {
            var92 = var62.method396(60, arg6);
        }
        if (var90 && var92 != null) {
            for (int var93 = 0; var93 < arg2.length; var93++) {
                if (var92[var93] != null) {
                    var89.method1258(var92[var93], 0x1 << var93, true);
                }
            }
        }
        int var94 = 0;
        int var95 = 1;
        while (var33 > var94) {
            if (class510.field6510[var94] != null) {
                var89.method1778(0, class164.field2171[var94], class484.field6251[var94], var95, class212.field2908[var94], class186.field2609[var94], null, class357.field4351[var94] - 1, true, false, class510.field6510[var94]);
            }
            var94++;
            var95 <<= 0x1;
        }
        if (var90) {
            for (int var96 = 0; var96 < arg2.length; var96++) {
                if (arg2[var96] != -1) {
                    int var97 = arg2[var96] - arg18;
                    int var98 = var97 & 0x3FFF;
                    class465 var99 = arg6.method994();
                    var99.method454(var98);
                    var89.method1258(var99, 0x1 << var96, false);
                }
            }
        }
        if (var90 && var92 != null) {
            for (int var100 = 0; var100 < arg2.length; var100++) {
                if (var92[var100] != null) {
                    var89.method1258(var92[var100], 0x1 << var100, false);
                }
            }
        }
        if (var45 != null && var50 != null) {
            var89.method1784(var45, var51, var50, arg14 - 1, var43, var42, var49, false, var46, (byte) 56, arg3.field94, arg1 - 1, var47, var44, var48);
        } else if (var45 != null) {
            var89.method1787(arg1 - 1, var44, var46, 0, var42, var43, 0, false, var45);
        } else if (var50 != null) {
            var89.method1787(arg14 - 1, var49, var51, 0, var47, var48, arg8 ^ 0xFFFFFFC1, false, var50);
        }
        for (int var101 = 0; var101 < var33; var101++) {
            class510.field6510[var101] = null;
            class212.field2908[var101] = null;
            class167.field2224[var101] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Z)V")
    public static final void method4110(boolean arg0) {
        if (!arg0) {
            method4106(null, (byte) 60);
        }
        for (int var1 = 0; var1 < class410.field5439.length; var1++) {
            for (int var2 = 0; var2 < class410.field5439[0].length; var2++) {
                for (int var3 = 0; var3 < class410.field5439[0][0].length; var3++) {
                    class410.field5439[var1][var2][var3] = 0;
                }
            }
        }
        field10301++;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIBLen;)V")
    public final void method4111(int arg0, int arg1, byte arg2, class117 arg3) {
        field10293++;
        if (arg1 == -1) {
            this.field10300[arg0] = 0;
        } else if (arg3.method705(arg1, -11467) == null) {
            return;
        } else {
            this.field10300[arg0] = class77.method473(arg1, 1073741824);
            this.method4102((byte) 124);
        }
        if (arg2 > -59) {
            this.field10300 = null;
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IBI)V")
    public final void method4112(int arg0, byte arg1, int arg2) {
        this.field10307[arg2] = arg0;
        if (arg1 >= 6) {
            field10297++;
            this.method4102((byte) 105);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILeba;II)V")
    public final void method4113(int arg0, class691 arg1, int arg2, int arg3) {
        field10310++;
        int var5 = class229.field3092[arg2];
        if (arg1.method3699(arg0, (byte) -56) == null) {
            return;
        }
        this.field10300[var5] = class77.method473(Integer.MIN_VALUE, arg0);
        if (arg3 >= -112) {
            this.method4113(-106, null, -10, 7);
        }
        this.method4102((byte) 126);
    }
}
