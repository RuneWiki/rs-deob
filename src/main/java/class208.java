import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class208 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public int field3330 = -1;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field3333 = 0;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3329 = "K";

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field3345 = 0;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "[I")
    public static int[] field3349 = new int[250];

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Z")
    public static volatile boolean field3353 = true;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    private int field3331;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "J")
    private long field3336;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "J")
    private long field3337;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Z")
    public boolean field3343;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "[I")
    public int[] field3342;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "[I")
    private int[] field3351;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "[[I")
    private int[][] field3341;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II[II[IZ)V", line = 8)
    public final void method1461(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, boolean arg5) {
        if (this.field3331 != arg3) {
            this.field3331 = arg3;
            this.field3341 = null;
        }
        if (arg1 != 3) {
            return;
        }
        field3352++;
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class303.field4796; var8++) {
                    class73 var9 = class29.method192(arg1 - 20795, var8);
                    if (var9 != null && !var9.field927 && (arg5 ? class309.field4891[var7] : class433.field6399[var7]) == var9.field922) {
                        arg4[class288.field4610[var7]] = class35.method227(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field3342 = arg2;
        this.field3351 = arg4;
        this.field3330 = arg0;
        this.field3343 = arg5;
        this.method1469(117);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 62)
    public static final void method1462(String arg0, byte arg1) {
        System.out.println("Error: " + class230.method1634("\n", arg0, 0, "%0a"));
        if (arg1 != 40) {
            method1462((String) null, (byte) -99);
        }
        field3332++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIIBILmo;)V", line = 73)
    public static final void method1463(boolean arg0, int arg1, int arg2, byte arg3, int arg4, class447 arg5) {
        class150.field2350 = arg0;
        class417.field6178 = 1;
        class390.field5860 = arg5;
        class263.field4241 = arg1;
        class220.field3625 = 10000;
        field3339++;
        class277.field4419 = arg4;
        if (arg3 >= -118) {
            method1462((String) null, (byte) 78);
        }
        class358.field5471 = arg2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)V", line = 95)
    public final void method1464(int arg0, boolean arg1, int arg2) {
        field3340++;
        int var4 = class288.field4610[arg2];
        if (this.field3351[var4] == 0 || class29.method192(-20792, arg0) == null) {
            return;
        }
        this.field3351[var4] = class35.method227(Integer.MIN_VALUE, arg0);
        if (!arg1) {
            this.method1468(17, 57, 36, -32, -33, (class417) null, 4, (class312) null, -61, -105);
        }
        this.method1469(121);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILgn;Le;ZII)Lid;", line = 125)
    public final class348 method1465(int arg0, int arg1, class417 arg2, class312 arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            this.field3337 = 71L;
        }
        field3346++;
        if (this.field3330 != -1) {
            return class395.method2493(false, this.field3330).method1617(arg2, arg1, arg0, 7310, arg3, arg5, arg6);
        }
        int var8 = arg0;
        if (arg2 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            int var15 = arg2.field6177[arg6];
            var8 = arg0 | 0x20;
            Object var16 = null;
            int var17 = var15 >>> 16;
            class209 var18 = class452.method2825(var17, -30741);
            int var19 = var15 & 0xFFFF;
            if (var18 != null) {
                var10 |= var18.method1481(var19, 35);
                var9 |= var18.method1477(var19, 0);
                var11 |= arg2.field6179;
            }
            if ((arg2.field6156 || class191.field3120) && arg5 != -1 && arg2.field6177.length > arg5) {
                int var20 = arg2.field6177[arg5];
                int var21 = var20 >>> 16;
                class209 var22 = var17 == var21 ? var18 : class452.method2825(var21, -30741);
                int var23 = var20 & 0xFFFF;
                if (var22 != null) {
                    var10 |= var22.method1481(var23, 35);
                    var9 |= var22.method1477(var23, 0);
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
        class52 var24 = class121.field1695;
        class348 var25;
        synchronized (class121.field1695) {
            var25 = (class348) class121.field1695.method331((byte) 69, this.field3337);
        }
        if (var25 == null || arg3.method579(var25.method44(), var8) != 0) {
            if (var25 != null) {
                var8 = arg3.method720(var8, var25.method44());
            }
            boolean var27 = false;
            for (int var28 = 0; var28 < 12; var28++) {
                int var29 = this.field3351[var28];
                if ((var29 & 0x40000000) == 0) {
                    if ((var29 & Integer.MIN_VALUE) != 0 && !class29.method192(-20792, var29 & 0x3FFFFFFF).method469((byte) -76)) {
                        var27 = true;
                    }
                } else if (!class155.method1092(true, var29 & 0x3FFFFFFF).method737(1185653636, this.field3343)) {
                    var27 = true;
                }
            }
            if (var27) {
                return null;
            }
            class86[] var30 = new class86[12];
            int var31 = 0;
            for (int var32 = 0; var32 < 12; var32++) {
                int var33 = this.field3351[var32];
                if ((var33 & 0x40000000) != 0) {
                    class86 var34 = class155.method1092(true, var33 & 0x3FFFFFFF).method739(this.field3343, true);
                    if (var34 != null) {
                        var30[var31++] = var34;
                    }
                } else if ((var33 & Integer.MIN_VALUE) != 0) {
                    class86 var35 = class29.method192(-20792, var33 & 0x3FFFFFFF).method466(0);
                    if (var35 != null) {
                        var30[var31++] = var35;
                    }
                }
            }
            int var36 = var8 | 0x2000;
            class86 var37 = new class86(var30, var31);
            var25 = arg3.method639(var37, var36, class98.field1372, 64, 768);
            for (int var38 = 0; var38 < 5; var38++) {
                if (this.field3342[var38] < class343.field5287[var38].length) {
                    var25.method38(class128.field2030[var38], class343.field5287[var38][this.field3342[var38]]);
                }
                if (class245.field4028[var38].length > this.field3342[var38]) {
                    var25.method38(class140.field2179[var38], class245.field4028[var38][this.field3342[var38]]);
                }
            }
            var25.method9(var8);
            class52 var39 = class121.field1695;
            synchronized (class121.field1695) {
                class121.field1695.method341(57, this.field3337, var25);
            }
        }
        if (arg2 == null) {
            return var25;
        } else {
            var25.method15((byte) 1, var8, true);
            return arg2.method2608(arg1, (byte) -124, arg6, arg0, arg5, var25);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V", line = 315)
    public final void method1466(boolean arg0, int arg1) {
        field3334++;
        this.field3343 = arg0;
        if (arg1 == -1953084273) {
            this.method1469(115);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V", line = 327)
    public final void method1467(int arg0, int arg1, int arg2) {
        if (arg0 >= -105) {
            field3349 = null;
        }
        this.field3342[arg1] = arg2;
        field3350++;
        this.method1469(121);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIILgn;ILe;II)Lid;", line = 340)
    public final class348 method1468(int arg0, int arg1, int arg2, int arg3, int arg4, class417 arg5, int arg6, class312 arg7, int arg8, int arg9) {
        field3348++;
        int var11 = arg9;
        if (arg5 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            var11 = arg9 | 0x20;
            int var18 = arg5.field6177[arg0];
            Object var19 = null;
            int var20 = var18 >>> 16;
            class209 var21 = class452.method2825(var20, -30741);
            int var22 = var18 & 0xFFFF;
            if (var21 != null) {
                var13 |= var21.method1481(var22, 35);
                var12 |= var21.method1477(var22, 0);
                var14 |= arg5.field6179;
            }
            if ((arg5.field6156 || class191.field3120) && arg3 != -1 && arg3 < arg5.field6177.length) {
                int var23 = arg5.field6177[arg3];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class209 var26;
                if (var20 == var24) {
                    var26 = var21;
                } else {
                    var26 = class452.method2825(var25 >>> 16, arg8 + 1944345115);
                }
                if (var26 != null) {
                    var13 |= var26.method1481(var25, 35);
                    var12 |= var26.method1477(var25, 0);
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
        long var27 = (long) arg1 | (long) arg6 << 32 | (long) (arg2 << 16);
        class52 var29 = class121.field1695;
        class348 var30;
        synchronized (class121.field1695) {
            if (arg8 != -1944375856) {
                this.field3330 = 18;
            }
            var30 = (class348) class121.field1695.method331((byte) 69, var27);
        }
        if (var30 == null || arg7.method579(var30.method44(), var11) != 0) {
            if (var30 != null) {
                var11 = arg7.method720(var11, var30.method44());
            }
            class86[] var32 = new class86[3];
            int var33 = 0;
            if (!class29.method192(-20792, arg1).method469((byte) -76) || !class29.method192(arg8 ^ 0x73E48318, arg2).method469((byte) -76) || !class29.method192(-20792, arg6).method469((byte) -76)) {
                return null;
            }
            class86 var34 = class29.method192(-20792, arg1).method466(0);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class86 var35 = class29.method192(-20792, arg2).method466(0);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class86 var36 = class29.method192(arg8 ^ 0x73E48318, arg6).method466(0);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            class86 var37 = new class86(var32, var33);
            int var38 = var11 | 0x2000;
            var30 = arg7.method639(var37, var38, class98.field1372, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (class343.field5287[var39].length > this.field3342[var39]) {
                    var30.method38(class128.field2030[var39], class343.field5287[var39][this.field3342[var39]]);
                }
                if (class245.field4028[var39].length > this.field3342[var39]) {
                    var30.method38(class140.field2179[var39], class245.field4028[var39][this.field3342[var39]]);
                }
            }
            var30.method9(var11);
            class52 var40 = class121.field1695;
            synchronized (class121.field1695) {
                class121.field1695.method341(105, var27, var30);
            }
        }
        if (arg5 == null) {
            return var30;
        } else {
            class348 var41 = var30.method15((byte) 1, var11, true);
            return arg5.method2608(arg4, (byte) -115, arg0, arg9, arg3, var41);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 495)
    private final void method1469(int arg0) {
        field3347++;
        long[] var2 = class84.field1045;
        this.field3337 = -1L;
        this.field3337 = this.field3337 >>> 8 ^ var2[(int) (((long) (this.field3331 >> 8) ^ this.field3337) & 0xFFL)];
        this.field3337 = var2[(int) ((this.field3337 ^ (long) this.field3331) & 0xFFL)] ^ this.field3337 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field3337 = this.field3337 >>> 8 ^ var2[(int) ((this.field3337 ^ (long) (this.field3351[var3] >> 24)) & 0xFFL)];
            this.field3337 = this.field3337 >>> 8 ^ var2[(int) (((long) (this.field3351[var3] >> 16) ^ this.field3337) & 0xFFL)];
            this.field3337 = var2[(int) (((long) (this.field3351[var3] >> 8) ^ this.field3337) & 0xFFL)] ^ this.field3337 >>> 8;
            this.field3337 = this.field3337 >>> 8 ^ var2[(int) ((this.field3337 ^ (long) this.field3351[var3]) & 0xFFL)];
        }
        if (arg0 <= 111) {
            field3353 = true;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field3337 = this.field3337 >>> 8 ^ var2[(int) (((long) this.field3342[var4] ^ this.field3337) & 0xFFL)];
        }
        this.field3337 = var2[(int) ((this.field3337 ^ (long) (this.field3343 ? 1 : 0)) & 0xFFL)] ^ this.field3337 >>> 8;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([Lac;IIIILgn;IIILe;ILgn;Z)Lid;", line = 539)
    public final class348 method1470(class318[] arg0, int arg1, int arg2, int arg3, int arg4, class417 arg5, int arg6, int arg7, int arg8, class312 arg9, int arg10, class417 arg11, boolean arg12) {
        field3335++;
        if (this.field3330 != -1) {
            return class395.method2493(false, this.field3330).method1623(false, arg2, arg9, arg7, arg3, arg10, arg4, arg0, arg1, arg5, arg11, arg8);
        }
        int var14 = arg8;
        long var15 = this.field3337;
        int[] var17 = this.field3351;
        if (arg11 != null && (arg11.field6169 >= 0 || arg11.field6157 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field3351[var18];
            }
            if (arg11.field6169 >= 0) {
                if (arg11.field6169 == 65535) {
                    var15 ^= 0xFFFFFFFF00000000L;
                    var17[5] = 0;
                } else {
                    var17[5] = class35.method227(1073741824, arg11.field6169);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg11.field6157 >= 0) {
                if (arg11.field6157 == 65535) {
                    var17[3] = 0;
                    var15 ^= 0xFFFFFFFFL;
                } else {
                    var17[3] = class35.method227(arg11.field6157, 1073741824);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg11 != null || arg5 != null;
        int var22 = arg0 == null ? 0 : arg0.length;
        for (int var23 = 0; var23 < var22; var23++) {
            class97.field1343[var23] = null;
            if (arg0[var23] != null) {
                class417 var24 = class156.method1099(arg0[var23].field4982, arg6 ^ 0x6C);
                if (var24.field6177 != null) {
                    class402.field6000[var23] = var24;
                    var21 = true;
                    int var25 = arg0[var23].field4976;
                    int var26 = arg0[var23].field4981;
                    int var27 = var24.field6177[var25];
                    class97.field1343[var23] = class452.method2825(var27 >>> 16, -30741);
                    int var28 = var27 & 0xFFFF;
                    class433.field6400[var23] = var28;
                    if (class97.field1343[var23] != null) {
                        var20 |= class97.field1343[var23].method1481(var28, 35);
                        var19 |= class97.field1343[var23].method1477(var28, arg6 - 5);
                    }
                    if ((var24.field6156 || class191.field3120) && var26 != -1 && var24.field6177.length > var26) {
                        class181.field2955[var23] = var24.field6171[var25];
                        class316.field4956[var23] = arg0[var23].field4977;
                        int var29 = var24.field6177[var26];
                        class9.field108[var23] = class452.method2825(var29 >>> 16, -30741);
                        int var30 = var29 & 0xFFFF;
                        class201.field3225[var23] = var30;
                        if (class9.field108[var23] != null) {
                            var20 |= class9.field108[var23].method1481(var30, 35);
                            var19 |= class9.field108[var23].method1477(var30, 0);
                        }
                    } else {
                        class181.field2955[var23] = 0;
                        class316.field4956[var23] = 0;
                        class9.field108[var23] = null;
                        class201.field3225[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class209 var34 = null;
        class209 var35 = null;
        int var36 = -1;
        int var37 = -1;
        int var38 = 0;
        class209 var39 = null;
        class209 var40 = null;
        if (var21) {
            if (arg11 != null) {
                int var41 = arg11.field6177[arg10];
                int var42 = var41 >>> 16;
                var34 = class452.method2825(var42, -30741);
                var31 = var41 & 0xFFFF;
                if (var34 != null) {
                    var20 |= var34.method1481(var31, 35);
                    var19 |= var34.method1477(var31, 0);
                }
                if ((arg11.field6156 || class191.field3120) && arg1 != -1 && arg11.field6177.length > arg1) {
                    var33 = arg11.field6171[arg10];
                    int var43 = arg11.field6177[arg1];
                    int var44 = var43 >>> 16;
                    var32 = var43 & 0xFFFF;
                    var35 = var42 == var44 ? var34 : class452.method2825(var44, arg6 ^ 0xFFFF87EE);
                    if (var35 != null) {
                        var20 |= var35.method1481(var32, 35);
                        var19 |= var35.method1477(var32, arg6 - 5);
                    }
                }
            }
            var14 = arg8 | 0x20;
            if (arg5 != null) {
                int var45 = arg5.field6177[arg3];
                int var46 = var45 >>> 16;
                var39 = class452.method2825(var46, arg6 - 30746);
                var36 = var45 & 0xFFFF;
                if (var39 != null) {
                    var20 |= var39.method1481(var36, 35);
                    var19 |= var39.method1477(var36, 0);
                }
                if ((arg5.field6156 || class191.field3120) && arg4 != -1 && arg4 < arg5.field6177.length) {
                    int var47 = arg5.field6177[arg4];
                    var38 = arg5.field6171[arg3];
                    int var48 = var47 >>> 16;
                    var37 = var47 & 0xFFFF;
                    var40 = var46 == var48 ? var39 : class452.method2825(var48, arg6 - 30746);
                    if (var40 != null) {
                        var20 |= var40.method1481(var37, 35);
                        var19 |= var40.method1477(var37, 0);
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
        class52 var49 = class235.field3940;
        class348 var50;
        synchronized (class235.field3940) {
            var50 = (class348) class235.field3940.method331((byte) 69, var15);
        }
        class349 var51 = null;
        if (this.field3331 != -1) {
            var51 = class436.method2686(57, this.field3331);
        }
        if (var50 == null || arg9.method579(var50.method44(), var14) != 0 || var51 != null && var51.field5392 != null && this.field3341 == null) {
            if (var50 != null) {
                var14 = arg9.method720(var14, var50.method44());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field3336 != -1L) {
                            class52 var81 = class235.field3940;
                            synchronized (class235.field3940) {
                                var50 = (class348) class235.field3940.method331((byte) 69, this.field3336);
                            }
                        }
                        if (var50 == null || arg9.method579(var50.method44(), var14) != 0 || var51 != null && var51.field5392 != null && this.field3341 == null) {
                            return null;
                        }
                    } else {
                        class86[] var56 = new class86[12];
                        for (int var57 = 0; var57 < 12; var57++) {
                            int var58 = var17[var57];
                            if ((var58 & 0x40000000) != 0) {
                                class86 var59 = class155.method1092(true, var58 & 0x3FFFFFFF).method734(27251, this.field3343);
                                if (var59 != null) {
                                    var56[var57] = var59;
                                }
                            } else if ((Integer.MIN_VALUE & var58) != 0) {
                                class86 var60 = class29.method192(-20792, var58 & 0x3FFFFFFF).method473(true);
                                if (var60 != null) {
                                    var56[var57] = var60;
                                }
                            }
                        }
                        if (var51 != null && var51.field5392 != null) {
                            for (int var61 = 0; var61 < var51.field5392.length; var61++) {
                                if (var51.field5392[var61] != null && var56[var61] != null) {
                                    int var62 = var51.field5392[var61][0];
                                    int var63 = var51.field5392[var61][1];
                                    int var64 = var51.field5392[var61][2];
                                    int var65 = var51.field5392[var61][3] << 3;
                                    int var66 = var51.field5392[var61][4] << 3;
                                    int var67 = var51.field5392[var61][5] << 3;
                                    if (this.field3341 == null) {
                                        this.field3341 = new int[var51.field5392.length][];
                                    }
                                    if (this.field3341[var61] == null) {
                                        int[] var68 = this.field3341[var61] = new int[15];
                                        if (var65 == 0 && var66 == 0 && var67 == 0) {
                                            var68[0] = var68[4] = var68[8] = 32768;
                                            var68[14] = -var64;
                                            var68[13] = -var63;
                                            var68[12] = -var62;
                                        } else {
                                            int var69 = class258.field4173[var65];
                                            int var70 = class258.field4177[var65];
                                            int var71 = class258.field4173[var66];
                                            int var72 = class258.field4177[var66];
                                            int var73 = class258.field4173[var67];
                                            int var74 = class258.field4177[var67];
                                            int var75 = var70 * var73 + 16384 >> 15;
                                            int var76 = var70 * var74 + 16384 >> 15;
                                            var68[2] = var69 * var72 + 16384 >> 15;
                                            var68[0] = var71 * var73 + var72 * var76 + 16384 >> 15;
                                            var68[1] = -var74 * var71 + var72 * var75 + 16384 >> 15;
                                            var68[8] = var69 * var71 + 16384 >> 15;
                                            var68[7] = -var72 * -var74 + var71 * var75 + 16384 >> 15;
                                            var68[4] = var69 * var73 + 16384 >> 15;
                                            var68[6] = -var72 * var73 - (-(var71 * var76) - 16384) >> 15;
                                            var68[5] = -var70;
                                            var68[3] = var69 * var74 + 16384 >> 15;
                                            var68[13] = var68[4] * -var63 + (var68[1] * -var62 - (-(var68[7] * -var64) - 16384)) >> 15;
                                            var68[14] = var68[8] * -var64 + var68[2] * -var62 + var68[5] * -var63 + 16384 >> 15;
                                            var68[12] = var68[6] * -var64 + var68[3] * -var63 + var68[0] * -var62 + 16384 >> 15;
                                        }
                                        var68[9] = var62;
                                        var68[10] = var63;
                                        var68[11] = var64;
                                    }
                                    if (var65 != 0 || var66 != 0 || var67 != 0) {
                                        var56[var61].method531(var66, var67, -24205, var65);
                                    }
                                    if (var62 != 0 || var63 != 0 || var64 != 0) {
                                        var56[var61].method530(var62, (byte) 118, var64, var63);
                                    }
                                }
                            }
                        }
                        class86 var77 = new class86(var56, var56.length);
                        int var78 = var14 | 0x2000;
                        var50 = arg9.method639(var77, var78, class98.field1372, 64, 850);
                        for (int var79 = 0; var79 < 5; var79++) {
                            if (class343.field5287[var79].length > this.field3342[var79]) {
                                var50.method38(class128.field2030[var79], class343.field5287[var79][this.field3342[var79]]);
                            }
                            if (this.field3342[var79] < class245.field4028[var79].length) {
                                var50.method38(class140.field2179[var79], class245.field4028[var79][this.field3342[var79]]);
                            }
                        }
                        if (arg12) {
                            var50.method9(var14);
                            class52 var80 = class235.field3940;
                            synchronized (class235.field3940) {
                                class235.field3940.method341(79, var15, var50);
                            }
                            this.field3336 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var55) != 0 && !class29.method192(-20792, var55 & 0x3FFFFFFF).method467(arg6 ^ 0x5)) {
                        var53 = true;
                    }
                } else if (!class155.method1092(true, var55 & 0x3FFFFFFF).method732(this.field3343, 19745)) {
                    var53 = true;
                }
                var54++;
            }
        }
        if (arg6 != 5) {
            this.field3343 = false;
        }
        class348 var82 = var50.method15((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = 1;
        while (var83 < var22) {
            if (class97.field1343[var83] != null) {
                var82.method2271(class181.field2955[var83], arg6 ^ 0x5, class433.field6400[var83], this.field3341 == null ? null : this.field3341[var83], var84, 0, class9.field108[var83], false, class97.field1343[var83], class201.field3225[var83], class316.field4956[var83] - 1);
            }
            var83++;
            var84 <<= 0x1;
        }
        if (var34 != null && var39 != null) {
            var82.method2275(false, var32, var36, var37, -93, var35, var39, var34, var40, arg11.field6158, var31, arg2 - 1, var33, var38, arg7 - 1);
        } else if (var34 != null) {
            var82.method2274(0, var34, var33, false, var35, (byte) -110, var31, var32, arg2 - 1);
        } else if (var39 != null) {
            var82.method2274(0, var39, var38, false, var40, (byte) -104, var36, var37, arg7 - 1);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class97.field1343[var85] = null;
            class9.field108[var85] = null;
            class402.field6000[var85] = null;
        }
        return var82;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BIIIIII)V", line = 1033)
    public static final void method1471(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 37) {
            return;
        }
        class136[] var7 = class256.field4144;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class136 var9 = var7[var8];
            if (var9 != null && var9.field2124 == 2) {
                class58.method384(arg2 >> 1, (var9.field2126 - class409.field6048 << 7) + var9.field2136, arg4 >> 1, arg5, arg6, var9.field2138 * 2, 122, (var9.field2131 - class444.field6481 << 7) + var9.field2122);
                if (class126.field1938[0] > -1 && class183.field2987 % 20 < 10) {
                    class245.field4021[var9.field2132].method2327(class126.field1938[0] + arg3 - 12, class126.field1938[1] + -28 + arg1);
                }
            }
        }
        field3344++;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 1064)
    public static void method1472(int arg0) {
        field3349 = null;
        if (arg0 != -1) {
            method1462((String) null, (byte) -34);
        }
        field3329 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBIILe;)V", line = 1075)
    public static final void method1473(int arg0, int arg1, byte arg2, int arg3, int arg4, class312 arg5) {
        field3338++;
        arg5.method671(arg4, arg1, arg0 + arg4, arg1 + arg3);
        arg5.method2086(arg0, arg4, arg3, -16777216, -765, arg1);
        if (class397.field5935 < 100) {
            return;
        }
        float var6 = (float) class400.field5967 / (float) class400.field5981;
        if (arg2 != 55) {
            return;
        }
        int var7 = arg0;
        int var8 = arg3;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg3 / var6);
        }
        int var9 = (arg3 - var8) / 2 + arg1;
        int var10 = (arg0 - var7) / 2 + arg4;
        if (class402.field6003 == null || arg0 != class402.field6003.method2324() || class402.field6003.method2325() != arg3) {
            class400.method2525(class400.field5973, class400.field5974 + class400.field5967, class400.field5981 + class400.field5973, class400.field5974, var10, var9, var7 + var10, var8 + var9);
            class400.method2513(arg5);
            class402.field6003 = arg5.method686(var10, var9, var7, var8, false);
        }
        class402.field6003.method2327(var10, var9);
        int var11 = class133.field2078 * var7 / class400.field5981;
        int var12 = class291.field4650 * var8 / class400.field5967;
        int var13 = var10 + (class171.field2684 * var7 / class400.field5981);
        int var14 = var8 + var9 - (class373.field5638 * var8 / class400.field5967 - -var12);
        int var15 = -1996554240;
        if (class61.field787 == 1) {
            var15 = -1996488705;
        }
        arg5.method563(var13, var14, var11, var12, var15, 1);
        arg5.method647(var13, var14, var11, var12, var15, 0);
        if (class433.field6401 <= 0) {
            return;
        }
        int var16;
        if (class291.field4646 <= 50) {
            var16 = class291.field4646 * 5;
        } else {
            var16 = 500 - (class291.field4646 * 5);
        }
        for (class222 var17 = (class222) class400.field5952.method253((byte) -6); var17 != null; var17 = (class222) class400.field5952.method247((byte) 48)) {
            class324 var18 = class288.method1944(36, var17.field3684);
            if (class99.method746(var18, (byte) -90)) {
                if (class411.field6088 == var17.field3684) {
                    int var21 = var10 + (var17.field3699 * var7 / class400.field5981);
                    int var22 = (class400.field5967 - var17.field3691) * var8 / class400.field5967 + var9;
                    arg5.method2086(4, var21 - 2, 4, var16 << 24 | 0xFFFF00, arg2 - 820, var22 + -2);
                } else if (class217.field3552 != -1 && class217.field3552 == var18.field5091) {
                    int var19 = var17.field3699 * var7 / class400.field5981 + var10;
                    int var20 = (class400.field5967 - var17.field3691) * var8 / class400.field5967 + var9;
                    arg5.method2086(4, var19 - 2, 4, var16 << 24 | 0xFFFF00, -765, var20 - 2);
                }
            }
        }
    }
}
