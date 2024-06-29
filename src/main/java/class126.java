import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class126 extends class88 {

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "B")
    public byte field2306 = 0;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public int field2296 = 0;

    @OriginalMember(owner = "client!lg", name = "lb", descriptor = "I")
    public int field2339 = 0;

    @OriginalMember(owner = "client!lg", name = "mb", descriptor = "Z")
    private boolean field2340 = false;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "[I")
    public int[] field2326;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "[I")
    public int[] field2318;

    @OriginalMember(owner = "client!lg", name = "gb", descriptor = "[I")
    public int[] field2334;

    @OriginalMember(owner = "client!lg", name = "ib", descriptor = "[I")
    private int[] field2336;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "[I")
    public int[] field2300;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "[I")
    public int[] field2325;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "[I")
    public int[] field2295;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "[B")
    public byte[] field2312;

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "[B")
    public byte[] field2332;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "[B")
    public byte[] field2301;

    @OriginalMember(owner = "client!lg", name = "fb", descriptor = "[I")
    private int[] field2333;

    @OriginalMember(owner = "client!lg", name = "hb", descriptor = "[S")
    public short[] field2335;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "[B")
    public byte[] field2309;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "[S")
    public short[] field2305;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "[B")
    public byte[] field2330;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "[S")
    public short[] field2302;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "[S")
    public short[] field2313;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "[S")
    public short[] field2324;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "[S")
    private short[] field2308;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "[S")
    private short[] field2299;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "[S")
    private short[] field2316;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "[B")
    private byte[] field2304;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "[B")
    private byte[] field2292;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "[B")
    private byte[] field2303;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "[B")
    private byte[] field2298;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "[B")
    private byte[] field2320;

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "[[I")
    public int[][] field2331;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "[[I")
    public int[][] field2319;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "[Lte;")
    public class212[] field2314;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "[Lij;")
    public class96[] field2323;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "[Lte;")
    public class212[] field2322;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "S")
    public short field2328;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "S")
    public short field2297;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "[I")
    private static int[] field2293 = class169.field3211;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "[I")
    private static int[] field2315 = new int[10000];

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    private static int field2321 = 0;

    @OriginalMember(owner = "client!lg", name = "kb", descriptor = "[I")
    private static int[] field2338 = class169.field3220;

    @OriginalMember(owner = "client!lg", name = "jb", descriptor = "[I")
    private static int[] field2337 = new int[10000];

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "S")
    private short field2307;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "S")
    private short field2310;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "S")
    private short field2311;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "S")
    private short field2317;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "S")
    private short field2327;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "S")
    private short field2329;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[[I[[IIIIZZ)Llg;")
    public final class126 method863(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method876();
        int var10 = this.field2329 + arg4;
        int var11 = this.field2307 + arg4;
        int var12 = this.field2311 + arg6;
        int var13 = this.field2327 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class126 var18;
        if (arg7) {
            var18 = new class126();
            var18.field2339 = this.field2339;
            var18.field2296 = this.field2296;
            var18.field2294 = this.field2294;
            var18.field2300 = this.field2300;
            var18.field2325 = this.field2325;
            var18.field2295 = this.field2295;
            var18.field2312 = this.field2312;
            var18.field2332 = this.field2332;
            var18.field2301 = this.field2301;
            var18.field2309 = this.field2309;
            var18.field2305 = this.field2305;
            var18.field2335 = this.field2335;
            var18.field2306 = this.field2306;
            var18.field2330 = this.field2330;
            var18.field2302 = this.field2302;
            var18.field2313 = this.field2313;
            var18.field2324 = this.field2324;
            var18.field2308 = this.field2308;
            var18.field2299 = this.field2299;
            var18.field2316 = this.field2316;
            var18.field2304 = this.field2304;
            var18.field2292 = this.field2292;
            var18.field2303 = this.field2303;
            var18.field2298 = this.field2298;
            var18.field2320 = this.field2320;
            var18.field2336 = this.field2336;
            var18.field2333 = this.field2333;
            var18.field2331 = this.field2331;
            var18.field2319 = this.field2319;
            var18.field2328 = this.field2328;
            var18.field2297 = this.field2297;
            var18.field2314 = this.field2314;
            var18.field2323 = this.field2323;
            var18.field2322 = this.field2322;
            if (arg0 == 3) {
                var18.field2326 = class163.method1089(0, this.field2326);
                var18.field2318 = class163.method1089(0, this.field2318);
                var18.field2334 = class163.method1089(0, this.field2334);
            } else {
                var18.field2326 = this.field2326;
                var18.field2318 = new int[var18.field2339];
                var18.field2334 = this.field2334;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2339; var19++) {
                int var20 = this.field2326[var19] + arg4;
                int var21 = this.field2334[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field2318[var19] = this.field2318[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field2339; var29++) {
                int var30 = (this.field2318[var29] << 16) / this.field2310;
                if (var30 < arg1) {
                    int var31 = this.field2326[var29] + arg4;
                    int var32 = this.field2334[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field2318[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field2318[var29];
                } else {
                    var18.field2318[var29] = this.field2318[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method877(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field2317 - this.field2310;
            for (int var43 = 0; var43 < this.field2339; var43++) {
                int var44 = this.field2326[var43] + arg4;
                int var45 = this.field2334[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field2318[var43] = var52 + this.field2318[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field2317 - this.field2310;
            for (int var54 = 0; var54 < this.field2339; var54++) {
                int var55 = this.field2326[var54] + arg4;
                int var56 = this.field2334[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field2318[var54] = ((this.field2318[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method870();
        } else {
            this.field2340 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()I")
    public final int method5() {
        if (!this.field2340) {
            this.method876();
        }
        return this.field2310;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([B)V")
    private final void method864(byte[] arg0) {
        class28 var2 = new class28(arg0);
        class28 var3 = new class28(arg0);
        class28 var4 = new class28(arg0);
        class28 var5 = new class28(arg0);
        class28 var6 = new class28(arg0);
        class28 var7 = new class28(arg0);
        class28 var8 = new class28(arg0);
        var2.field526 = arg0.length - 23;
        int var9 = var2.method230((byte) -110);
        int var10 = var2.method230((byte) -124);
        int var11 = var2.method215(-1797813752);
        int var12 = var2.method215(-1797813752);
        int var13 = var2.method215(-1797813752);
        int var14 = var2.method215(-1797813752);
        int var15 = var2.method215(-1797813752);
        int var16 = var2.method215(-1797813752);
        int var17 = var2.method215(-1797813752);
        int var18 = var2.method230((byte) -107);
        int var19 = var2.method230((byte) -108);
        int var20 = var2.method230((byte) -116);
        int var21 = var2.method230((byte) -101);
        int var22 = var2.method230((byte) -98);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2330 = new byte[var11];
            var2.field526 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2330[var26] = var2.method206(-16933672);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field2339 = var9;
        this.field2296 = var10;
        this.field2294 = var11;
        this.field2326 = new int[var9];
        this.field2318 = new int[var9];
        this.field2334 = new int[var9];
        this.field2300 = new int[var10];
        this.field2325 = new int[var10];
        this.field2295 = new int[var10];
        if (var17 == 1) {
            this.field2336 = new int[var9];
        }
        if (var12 == 1) {
            this.field2312 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2332 = new byte[var10];
        } else {
            this.field2306 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2301 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2333 = new int[var10];
        }
        if (var16 == 1) {
            this.field2335 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2309 = new byte[var10];
        }
        this.field2305 = new short[var10];
        if (var11 > 0) {
            this.field2302 = new short[var11];
            this.field2313 = new short[var11];
            this.field2324 = new short[var11];
            if (var24 > 0) {
                this.field2308 = new short[var24];
                this.field2299 = new short[var24];
                this.field2316 = new short[var24];
                this.field2304 = new byte[var24];
                this.field2292 = new byte[var24];
                this.field2303 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2298 = new byte[var25];
                this.field2320 = new byte[var25];
            }
        }
        var2.field526 = var11;
        var3.field526 = var44;
        var4.field526 = var46;
        var5.field526 = var48;
        var6.field526 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method215(-1797813752);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method213(true);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method213(true);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method213(true);
            }
            this.field2326[var66] = var63 + var80;
            this.field2318[var66] = var64 + var81;
            this.field2334[var66] = var65 + var82;
            var63 = this.field2326[var66];
            var64 = this.field2318[var66];
            var65 = this.field2334[var66];
            if (var17 == 1) {
                this.field2336[var66] = var6.method215(-1797813752);
            }
        }
        var2.field526 = var42;
        var3.field526 = var31;
        var4.field526 = var34;
        var5.field526 = var37;
        var6.field526 = var35;
        var7.field526 = var40;
        var8.field526 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field2305[var67] = (short) var2.method230((byte) -107);
            if (var12 == 1) {
                this.field2312[var67] = var3.method206(-16933672);
            }
            if (var13 == 255) {
                this.field2332[var67] = var4.method206(-16933672);
            }
            if (var14 == 1) {
                this.field2301[var67] = var5.method206(-16933672);
            }
            if (var15 == 1) {
                this.field2333[var67] = var6.method215(-1797813752);
            }
            if (var16 == 1) {
                this.field2335[var67] = (short) (var7.method230((byte) -115) - 1);
            }
            if (this.field2309 != null) {
                if (this.field2335[var67] == -1) {
                    this.field2309[var67] = -1;
                } else {
                    this.field2309[var67] = (byte) (var8.method215(-1797813752) - 1);
                }
            }
        }
        var2.field526 = var33;
        var3.field526 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method215(-1797813752);
            if (var75 == 1) {
                var68 = var2.method213(true) + var71;
                var69 = var2.method213(true) + var68;
                var70 = var2.method213(true) + var69;
                var71 = var70;
                this.field2300[var72] = var68;
                this.field2325[var72] = var69;
                this.field2295[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method213(true) + var71;
                var71 = var70;
                this.field2300[var72] = var68;
                this.field2325[var72] = var69;
                this.field2295[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method213(true) + var71;
                var71 = var70;
                this.field2300[var72] = var68;
                this.field2325[var72] = var69;
                this.field2295[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method213(true) + var71;
                var71 = var70;
                this.field2300[var72] = var68;
                this.field2325[var72] = var78;
                this.field2295[var72] = var70;
            }
        }
        var2.field526 = var50;
        var3.field526 = var52;
        var4.field526 = var54;
        var5.field526 = var56;
        var6.field526 = var58;
        var7.field526 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field2330[var73] & 0xFF;
            if (var74 == 0) {
                this.field2302[var73] = (short) var2.method230((byte) -119);
                this.field2313[var73] = (short) var2.method230((byte) -112);
                this.field2324[var73] = (short) var2.method230((byte) -118);
            }
            if (var74 == 1) {
                this.field2302[var73] = (short) var3.method230((byte) -115);
                this.field2313[var73] = (short) var3.method230((byte) -122);
                this.field2324[var73] = (short) var3.method230((byte) -128);
                this.field2308[var73] = (short) var4.method230((byte) -119);
                this.field2299[var73] = (short) var4.method230((byte) -113);
                this.field2316[var73] = (short) var4.method230((byte) -126);
                this.field2304[var73] = var5.method206(-16933672);
                this.field2292[var73] = var6.method206(-16933672);
                this.field2303[var73] = var7.method206(-16933672);
            }
            if (var74 == 2) {
                this.field2302[var73] = (short) var3.method230((byte) -128);
                this.field2313[var73] = (short) var3.method230((byte) -115);
                this.field2324[var73] = (short) var3.method230((byte) -100);
                this.field2308[var73] = (short) var4.method230((byte) -128);
                this.field2299[var73] = (short) var4.method230((byte) -120);
                this.field2316[var73] = (short) var4.method230((byte) -110);
                this.field2304[var73] = var5.method206(-16933672);
                this.field2292[var73] = var6.method206(-16933672);
                this.field2303[var73] = var7.method206(-16933672);
                this.field2298[var73] = var7.method206(-16933672);
                this.field2320[var73] = var7.method206(-16933672);
            }
            if (var74 == 3) {
                this.field2302[var73] = (short) var3.method230((byte) -120);
                this.field2313[var73] = (short) var3.method230((byte) -125);
                this.field2324[var73] = (short) var3.method230((byte) -128);
                this.field2308[var73] = (short) var4.method230((byte) -105);
                this.field2299[var73] = (short) var4.method230((byte) -114);
                this.field2316[var73] = (short) var4.method230((byte) -120);
                this.field2304[var73] = var5.method206(-16933672);
                this.field2292[var73] = var6.method206(-16933672);
                this.field2303[var73] = var7.method206(-16933672);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)V")
    public final void method865(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2339; var4++) {
            this.field2326[var4] += arg0;
            this.field2318[var4] += arg1;
            this.field2334[var4] += arg2;
        }
        this.method870();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(SS)V")
    public final void method866(short arg0, short arg1) {
        if (this.field2335 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2296; var3++) {
            if (this.field2335[var3] == arg0) {
                this.field2335[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "()V")
    public static void method867() {
        field2315 = null;
        field2337 = null;
        field2293 = null;
        field2338 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)Lia;")
    public final class88 method587(int arg0, int arg1, int arg2) {
        return this.method887(this.field2328, this.field2297, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "()V")
    public final void method868() {
        for (int var1 = 0; var1 < this.field2339; var1++) {
            int var2 = this.field2334[var1];
            this.field2334[var1] = this.field2326[var1];
            this.field2326[var1] = -var2;
        }
        this.method870();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)Ldh;")
    public final class42 method869(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class42(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "()V")
    private final void method870() {
        this.field2314 = null;
        this.field2322 = null;
        this.field2323 = null;
        this.field2340 = false;
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "()V")
    public final void method871() {
        int var10002;
        if (this.field2336 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2339; var3++) {
                int var7 = this.field2336[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2331 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field2331[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2339) {
                int var6 = this.field2336[var5];
                this.field2331[var6][var1[var6]++] = var5++;
            }
            this.field2336 = null;
        }
        if (this.field2333 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2296; var10++) {
            int var14 = this.field2333[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field2319 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field2319[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field2296) {
            int var13 = this.field2333[var12];
            this.field2319[var13][var8[var13]++] = var12++;
        }
        this.field2333 = null;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public final void method872(int arg0) {
        int var2 = field2293[arg0];
        int var3 = field2338[arg0];
        for (int var4 = 0; var4 < this.field2339; var4++) {
            int var5 = this.field2334[var4] * var2 + this.field2326[var4] * var3 >> 16;
            this.field2334[var4] = this.field2334[var4] * var3 - this.field2326[var4] * var2 >> 16;
            this.field2326[var4] = var5;
        }
        this.method870();
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    private final void method873(int arg0) {
        int var2 = field2293[arg0];
        int var3 = field2338[arg0];
        for (int var4 = 0; var4 < this.field2339; var4++) {
            int var5 = this.field2326[var4] * var3 + this.field2318[var4] * var2 >> 16;
            this.field2318[var4] = this.field2318[var4] * var3 - this.field2326[var4] * var2 >> 16;
            this.field2326[var4] = var5;
        }
        this.method870();
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "()Llg;")
    public final class126 method874() {
        class126 var1 = new class126();
        if (this.field2312 != null) {
            var1.field2312 = new byte[this.field2296];
            for (int var2 = 0; var2 < this.field2296; var2++) {
                var1.field2312[var2] = this.field2312[var2];
            }
        }
        var1.field2339 = this.field2339;
        var1.field2296 = this.field2296;
        var1.field2294 = this.field2294;
        var1.field2326 = this.field2326;
        var1.field2318 = this.field2318;
        var1.field2334 = this.field2334;
        var1.field2300 = this.field2300;
        var1.field2325 = this.field2325;
        var1.field2295 = this.field2295;
        var1.field2332 = this.field2332;
        var1.field2301 = this.field2301;
        var1.field2309 = this.field2309;
        var1.field2305 = this.field2305;
        var1.field2335 = this.field2335;
        var1.field2306 = this.field2306;
        var1.field2330 = this.field2330;
        var1.field2302 = this.field2302;
        var1.field2313 = this.field2313;
        var1.field2324 = this.field2324;
        var1.field2308 = this.field2308;
        var1.field2299 = this.field2299;
        var1.field2316 = this.field2316;
        var1.field2304 = this.field2304;
        var1.field2292 = this.field2292;
        var1.field2303 = this.field2303;
        var1.field2298 = this.field2298;
        var1.field2320 = this.field2320;
        var1.field2336 = this.field2336;
        var1.field2333 = this.field2333;
        var1.field2331 = this.field2331;
        var1.field2319 = this.field2319;
        var1.field2314 = this.field2314;
        var1.field2323 = this.field2323;
        var1.field2328 = this.field2328;
        var1.field2297 = this.field2297;
        return var1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([[III)I")
    private static final int method875(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "()V")
    private final void method876() {
        if (this.field2340) {
            return;
        }
        this.field2340 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2339; var7++) {
            int var8 = this.field2326[var7];
            int var9 = this.field2318[var7];
            int var10 = this.field2334[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field2329 = (short) var1;
        this.field2307 = (short) var4;
        this.field2310 = (short) var2;
        this.field2317 = (short) var5;
        this.field2311 = (short) var3;
        this.field2327 = (short) var6;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([[IIIIII)V")
    private final void method877(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method875(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method875(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method875(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method875(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
        if (var26 != 0) {
            this.method882(var26);
        }
        int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
        if (var27 != 0) {
            this.method873(var27);
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method865(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(III)V")
    public final void method878(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2293[arg2];
            int var5 = field2338[arg2];
            for (int var6 = 0; var6 < this.field2339; var6++) {
                int var7 = this.field2326[var6] * var5 + this.field2318[var6] * var4 >> 16;
                this.field2318[var6] = this.field2318[var6] * var5 - this.field2326[var6] * var4 >> 16;
                this.field2326[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2293[arg0];
            int var9 = field2338[arg0];
            for (int var10 = 0; var10 < this.field2339; var10++) {
                int var11 = this.field2318[var10] * var9 - this.field2334[var10] * var8 >> 16;
                this.field2334[var10] = this.field2334[var10] * var9 + this.field2318[var10] * var8 >> 16;
                this.field2318[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2293[arg1];
        int var13 = field2338[arg1];
        for (int var14 = 0; var14 < this.field2339; var14++) {
            int var15 = this.field2334[var14] * var12 + this.field2326[var14] * var13 >> 16;
            this.field2334[var14] = this.field2334[var14] * var13 - this.field2326[var14] * var12 >> 16;
            this.field2326[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(III)V")
    public final void method879(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2339; var4++) {
            this.field2326[var4] = this.field2326[var4] * arg0 / 128;
            this.field2318[var4] = this.field2318[var4] * arg1 / 128;
            this.field2334[var4] = this.field2334[var4] * arg2 / 128;
        }
        this.method870();
    }

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "()V")
    public final void method880() {
        for (int var1 = 0; var1 < this.field2339; var1++) {
            this.field2334[var1] = -this.field2334[var1];
        }
        for (int var2 = 0; var2 < this.field2296; var2++) {
            int var3 = this.field2300[var2];
            this.field2300[var2] = this.field2295[var2];
            this.field2295[var2] = var3;
        }
        this.method870();
    }

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "()V")
    public final void method881() {
        for (int var1 = 0; var1 < this.field2339; var1++) {
            int var2 = this.field2326[var1];
            this.field2326[var1] = this.field2334[var1];
            this.field2334[var1] = -var2;
        }
        this.method870();
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
    private final void method882(int arg0) {
        int var2 = field2293[arg0];
        int var3 = field2338[arg0];
        for (int var4 = 0; var4 < this.field2339; var4++) {
            int var5 = this.field2318[var4] * var3 - this.field2334[var4] * var2 >> 16;
            this.field2334[var4] = this.field2334[var4] * var3 + this.field2318[var4] * var2 >> 16;
            this.field2318[var4] = var5;
        }
        this.method870();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lwa;II)Llg;")
    public static final class126 method883(class238 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1547(arg2, 0, arg1);
        return var3 == null ? null : new class126(var3);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()Z")
    public final boolean method590() {
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "()V")
    public final void method884() {
        for (int var1 = 0; var1 < this.field2339; var1++) {
            this.field2326[var1] = -this.field2326[var1];
            this.field2334[var1] = -this.field2334[var1];
        }
        this.method870();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Llg;I)I")
    private final int method885(class126 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2326[arg1];
        int var5 = arg0.field2318[arg1];
        int var6 = arg0.field2334[arg1];
        for (int var7 = 0; var7 < this.field2339; var7++) {
            if (this.field2326[var7] == var4 && this.field2318[var7] == var5 && this.field2334[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2326[this.field2339] = var4;
            this.field2318[this.field2339] = var5;
            this.field2334[this.field2339] = var6;
            if (arg0.field2336 != null) {
                this.field2336[this.field2339] = arg0.field2336[arg1];
            }
            var3 = this.field2339++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lia;IIIZ)V")
    public final void method585(class88 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class126 var6 = (class126) arg0;
        var6.method876();
        var6.method889();
        field2321++;
        int var7 = 0;
        int[] var8 = var6.field2326;
        int var9 = var6.field2339;
        for (int var10 = 0; var10 < this.field2339; var10++) {
            class212 var13 = this.field2314[var10];
            if (var13.field3965 != 0) {
                int var14 = this.field2318[var10] - arg2;
                if (var14 >= var6.field2310 && var14 <= var6.field2317) {
                    int var15 = this.field2326[var10] - arg1;
                    if (var15 >= var6.field2329 && var15 <= var6.field2307) {
                        int var16 = this.field2334[var10] - arg3;
                        if (var16 >= var6.field2311 && var16 <= var6.field2327) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class212 var18 = var6.field2314[var17];
                                if (var8[var17] == var15 && var6.field2334[var17] == var16 && var6.field2318[var17] == var14 && var18.field3965 != 0) {
                                    if (this.field2322 == null) {
                                        this.field2322 = new class212[this.field2339];
                                    }
                                    if (var6.field2322 == null) {
                                        var6.field2322 = new class212[var9];
                                    }
                                    class212 var19 = this.field2322[var10];
                                    if (var19 == null) {
                                        var19 = this.field2322[var10] = new class212(var13);
                                    }
                                    class212 var20 = var6.field2322[var17];
                                    if (var20 == null) {
                                        var20 = var6.field2322[var17] = new class212(var18);
                                    }
                                    var19.field3959 += var18.field3959;
                                    var19.field3962 += var18.field3962;
                                    var19.field3969 += var18.field3969;
                                    var19.field3965 += var18.field3965;
                                    var20.field3959 += var13.field3959;
                                    var20.field3962 += var13.field3962;
                                    var20.field3969 += var13.field3969;
                                    var20.field3965 += var13.field3965;
                                    var7++;
                                    field2315[var10] = field2321;
                                    field2337[var17] = field2321;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field2296; var11++) {
            if (field2315[this.field2300[var11]] == field2321 && field2315[this.field2325[var11]] == field2321 && field2315[this.field2295[var11]] == field2321) {
                if (this.field2312 == null) {
                    this.field2312 = new byte[this.field2296];
                }
                this.field2312[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field2296; var12++) {
            if (field2337[var6.field2300[var12]] == field2321 && field2337[var6.field2325[var12]] == field2321 && field2337[var6.field2295[var12]] == field2321) {
                if (var6.field2312 == null) {
                    var6.field2312 = new byte[var6.field2296];
                }
                var6.field2312[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "()V")
    public final void method886() {
        this.field2336 = null;
        this.field2333 = null;
        this.field2331 = null;
        this.field2319 = null;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIII)La;")
    public final class1 method887(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class42(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(SS)V")
    public final void method888(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2296; var3++) {
            if (this.field2305[var3] == arg0) {
                this.field2305[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "()V")
    public final void method889() {
        if (this.field2314 != null) {
            return;
        }
        this.field2314 = new class212[this.field2339];
        for (int var1 = 0; var1 < this.field2339; var1++) {
            this.field2314[var1] = new class212();
        }
        for (int var2 = 0; var2 < this.field2296; var2++) {
            int var3 = this.field2300[var2];
            int var4 = this.field2325[var2];
            int var5 = this.field2295[var2];
            int var6 = this.field2326[var4] - this.field2326[var3];
            int var7 = this.field2318[var4] - this.field2318[var3];
            int var8 = this.field2334[var4] - this.field2334[var3];
            int var9 = this.field2326[var5] - this.field2326[var3];
            int var10 = this.field2318[var5] - this.field2318[var3];
            int var11 = this.field2334[var5] - this.field2334[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2312 == null) {
                var19 = 0;
            } else {
                var19 = this.field2312[var2];
            }
            if (var19 == 0) {
                class212 var20 = this.field2314[var3];
                var20.field3959 += var16;
                var20.field3962 += var17;
                var20.field3969 += var18;
                var20.field3965++;
                class212 var21 = this.field2314[var4];
                var21.field3959 += var16;
                var21.field3962 += var17;
                var21.field3969 += var18;
                var21.field3965++;
                class212 var22 = this.field2314[var5];
                var22.field3959 += var16;
                var22.field3962 += var17;
                var22.field3969 += var18;
                var22.field3965++;
            } else if (var19 == 1) {
                if (this.field2323 == null) {
                    this.field2323 = new class96[this.field2296];
                }
                class96 var23 = this.field2323[var2] = new class96();
                var23.field1684 = var16;
                var23.field1678 = var17;
                var23.field1679 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    private class126() {
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "([B)V")
    private class126(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method864(arg0);
        } else {
            this.method890(arg0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "([Llg;I)V")
    public class126(class126[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2339 = 0;
        this.field2296 = 0;
        this.field2294 = 0;
        this.field2306 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class126 var15 = arg0[var9];
            if (var15 != null) {
                this.field2339 += var15.field2339;
                this.field2296 += var15.field2296;
                this.field2294 += var15.field2294;
                if (var15.field2332 == null) {
                    if (this.field2306 == -1) {
                        this.field2306 = var15.field2306;
                    }
                    if (this.field2306 != var15.field2306) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field2312 != null;
                var5 |= var15.field2301 != null;
                var6 |= var15.field2333 != null;
                var7 |= var15.field2335 != null;
                var8 |= var15.field2309 != null;
            }
        }
        this.field2326 = new int[this.field2339];
        this.field2318 = new int[this.field2339];
        this.field2334 = new int[this.field2339];
        this.field2336 = new int[this.field2339];
        this.field2300 = new int[this.field2296];
        this.field2325 = new int[this.field2296];
        this.field2295 = new int[this.field2296];
        if (var3) {
            this.field2312 = new byte[this.field2296];
        }
        if (var4) {
            this.field2332 = new byte[this.field2296];
        }
        if (var5) {
            this.field2301 = new byte[this.field2296];
        }
        if (var6) {
            this.field2333 = new int[this.field2296];
        }
        if (var7) {
            this.field2335 = new short[this.field2296];
        }
        if (var8) {
            this.field2309 = new byte[this.field2296];
        }
        this.field2305 = new short[this.field2296];
        if (this.field2294 > 0) {
            this.field2330 = new byte[this.field2294];
            this.field2302 = new short[this.field2294];
            this.field2313 = new short[this.field2294];
            this.field2324 = new short[this.field2294];
            this.field2308 = new short[this.field2294];
            this.field2299 = new short[this.field2294];
            this.field2316 = new short[this.field2294];
            this.field2304 = new byte[this.field2294];
            this.field2292 = new byte[this.field2294];
            this.field2303 = new byte[this.field2294];
            this.field2298 = new byte[this.field2294];
            this.field2320 = new byte[this.field2294];
        }
        this.field2339 = 0;
        this.field2296 = 0;
        this.field2294 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class126 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2296; var12++) {
                    if (var3 && var11.field2312 != null) {
                        this.field2312[this.field2296] = var11.field2312[var12];
                    }
                    if (var4) {
                        if (var11.field2332 == null) {
                            this.field2332[this.field2296] = var11.field2306;
                        } else {
                            this.field2332[this.field2296] = var11.field2332[var12];
                        }
                    }
                    if (var5 && var11.field2301 != null) {
                        this.field2301[this.field2296] = var11.field2301[var12];
                    }
                    if (var6 && var11.field2333 != null) {
                        this.field2333[this.field2296] = var11.field2333[var12];
                    }
                    if (var7) {
                        if (var11.field2335 == null) {
                            this.field2335[this.field2296] = -1;
                        } else {
                            this.field2335[this.field2296] = var11.field2335[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field2309 == null || var11.field2309[var12] == -1) {
                            this.field2309[this.field2296] = -1;
                        } else {
                            this.field2309[this.field2296] = (byte) (var11.field2309[var12] + this.field2294);
                        }
                    }
                    this.field2305[this.field2296] = var11.field2305[var12];
                    this.field2300[this.field2296] = this.method885(var11, var11.field2300[var12]);
                    this.field2325[this.field2296] = this.method885(var11, var11.field2325[var12]);
                    this.field2295[this.field2296] = this.method885(var11, var11.field2295[var12]);
                    this.field2296++;
                }
                for (int var13 = 0; var13 < var11.field2294; var13++) {
                    byte var14 = this.field2330[this.field2294] = var11.field2330[var13];
                    if (var14 == 0) {
                        this.field2302[this.field2294] = (short) this.method885(var11, var11.field2302[var13]);
                        this.field2313[this.field2294] = (short) this.method885(var11, var11.field2313[var13]);
                        this.field2324[this.field2294] = (short) this.method885(var11, var11.field2324[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2302[this.field2294] = var11.field2302[var13];
                        this.field2313[this.field2294] = var11.field2313[var13];
                        this.field2324[this.field2294] = var11.field2324[var13];
                        this.field2308[this.field2294] = var11.field2308[var13];
                        this.field2299[this.field2294] = var11.field2299[var13];
                        this.field2316[this.field2294] = var11.field2316[var13];
                        this.field2304[this.field2294] = var11.field2304[var13];
                        this.field2292[this.field2294] = var11.field2292[var13];
                        this.field2303[this.field2294] = var11.field2303[var13];
                    }
                    if (var14 == 2) {
                        this.field2298[this.field2294] = var11.field2298[var13];
                        this.field2320[this.field2294] = var11.field2320[var13];
                    }
                    this.field2294++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Llg;ZZZZ)V")
    public class126(class126 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2339 = arg0.field2339;
        this.field2296 = arg0.field2296;
        this.field2294 = arg0.field2294;
        if (arg1) {
            this.field2326 = arg0.field2326;
            this.field2318 = arg0.field2318;
            this.field2334 = arg0.field2334;
        } else {
            this.field2326 = new int[this.field2339];
            this.field2318 = new int[this.field2339];
            this.field2334 = new int[this.field2339];
            for (int var6 = 0; var6 < this.field2339; var6++) {
                this.field2326[var6] = arg0.field2326[var6];
                this.field2318[var6] = arg0.field2318[var6];
                this.field2334[var6] = arg0.field2334[var6];
            }
        }
        if (arg2) {
            this.field2305 = arg0.field2305;
        } else {
            this.field2305 = new short[this.field2296];
            for (int var7 = 0; var7 < this.field2296; var7++) {
                this.field2305[var7] = arg0.field2305[var7];
            }
        }
        if (arg3 || arg0.field2335 == null) {
            this.field2335 = arg0.field2335;
        } else {
            this.field2335 = new short[this.field2296];
            for (int var8 = 0; var8 < this.field2296; var8++) {
                this.field2335[var8] = arg0.field2335[var8];
            }
        }
        if (arg4) {
            this.field2301 = arg0.field2301;
        } else {
            this.field2301 = new byte[this.field2296];
            if (arg0.field2301 == null) {
                for (int var9 = 0; var9 < this.field2296; var9++) {
                    this.field2301[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2296; var10++) {
                    this.field2301[var10] = arg0.field2301[var10];
                }
            }
        }
        this.field2300 = arg0.field2300;
        this.field2325 = arg0.field2325;
        this.field2295 = arg0.field2295;
        this.field2312 = arg0.field2312;
        this.field2332 = arg0.field2332;
        this.field2309 = arg0.field2309;
        this.field2306 = arg0.field2306;
        this.field2330 = arg0.field2330;
        this.field2302 = arg0.field2302;
        this.field2313 = arg0.field2313;
        this.field2324 = arg0.field2324;
        this.field2308 = arg0.field2308;
        this.field2299 = arg0.field2299;
        this.field2316 = arg0.field2316;
        this.field2304 = arg0.field2304;
        this.field2292 = arg0.field2292;
        this.field2303 = arg0.field2303;
        this.field2298 = arg0.field2298;
        this.field2320 = arg0.field2320;
        this.field2336 = arg0.field2336;
        this.field2333 = arg0.field2333;
        this.field2331 = arg0.field2331;
        this.field2319 = arg0.field2319;
        this.field2314 = arg0.field2314;
        this.field2323 = arg0.field2323;
        this.field2322 = arg0.field2322;
        this.field2328 = arg0.field2328;
        this.field2297 = arg0.field2297;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "([B)V")
    private final void method890(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class28 var4 = new class28(arg0);
        class28 var5 = new class28(arg0);
        class28 var6 = new class28(arg0);
        class28 var7 = new class28(arg0);
        class28 var8 = new class28(arg0);
        var4.field526 = arg0.length - 18;
        int var9 = var4.method230((byte) -121);
        int var10 = var4.method230((byte) -120);
        int var11 = var4.method215(-1797813752);
        int var12 = var4.method215(-1797813752);
        int var13 = var4.method215(-1797813752);
        int var14 = var4.method215(-1797813752);
        int var15 = var4.method215(-1797813752);
        int var16 = var4.method215(-1797813752);
        int var17 = var4.method230((byte) -110);
        int var18 = var4.method230((byte) -119);
        int var19 = var4.method230((byte) -117);
        int var20 = var4.method230((byte) -99);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2339 = var9;
        this.field2296 = var10;
        this.field2294 = var11;
        this.field2326 = new int[var9];
        this.field2318 = new int[var9];
        this.field2334 = new int[var9];
        this.field2300 = new int[var10];
        this.field2325 = new int[var10];
        this.field2295 = new int[var10];
        if (var11 > 0) {
            this.field2330 = new byte[var11];
            this.field2302 = new short[var11];
            this.field2313 = new short[var11];
            this.field2324 = new short[var11];
        }
        if (var16 == 1) {
            this.field2336 = new int[var9];
        }
        if (var12 == 1) {
            this.field2312 = new byte[var10];
            this.field2309 = new byte[var10];
            this.field2335 = new short[var10];
        }
        if (var13 == 255) {
            this.field2332 = new byte[var10];
        } else {
            this.field2306 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2301 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2333 = new int[var10];
        }
        this.field2305 = new short[var10];
        var4.field526 = var21;
        var5.field526 = var36;
        var6.field526 = var38;
        var7.field526 = var40;
        var8.field526 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method215(-1797813752);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method213(true);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method213(true);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method213(true);
            }
            this.field2326[var46] = var43 + var63;
            this.field2318[var46] = var44 + var64;
            this.field2334[var46] = var45 + var65;
            var43 = this.field2326[var46];
            var44 = this.field2318[var46];
            var45 = this.field2334[var46];
            if (var16 == 1) {
                this.field2336[var46] = var8.method215(-1797813752);
            }
        }
        var4.field526 = var32;
        var5.field526 = var28;
        var6.field526 = var26;
        var7.field526 = var30;
        var8.field526 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field2305[var47] = (short) var4.method230((byte) -100);
            if (var12 == 1) {
                int var61 = var5.method215(-1797813752);
                if ((var61 & 0x1) == 1) {
                    this.field2312[var47] = 1;
                    var2 = true;
                } else {
                    this.field2312[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field2309[var47] = (byte) (var61 >> 2);
                    this.field2335[var47] = this.field2305[var47];
                    this.field2305[var47] = 127;
                    if (this.field2335[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2309[var47] = -1;
                    this.field2335[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2332[var47] = var6.method206(-16933672);
            }
            if (var14 == 1) {
                this.field2301[var47] = var7.method206(-16933672);
            }
            if (var15 == 1) {
                this.field2333[var47] = var8.method215(-1797813752);
            }
        }
        var4.field526 = var25;
        var5.field526 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method215(-1797813752);
            if (var57 == 1) {
                var48 = var4.method213(true) + var51;
                var49 = var4.method213(true) + var48;
                var50 = var4.method213(true) + var49;
                var51 = var50;
                this.field2300[var52] = var48;
                this.field2325[var52] = var49;
                this.field2295[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method213(true) + var51;
                var51 = var50;
                this.field2300[var52] = var48;
                this.field2325[var52] = var49;
                this.field2295[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method213(true) + var51;
                var51 = var50;
                this.field2300[var52] = var48;
                this.field2325[var52] = var49;
                this.field2295[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method213(true) + var51;
                var51 = var50;
                this.field2300[var52] = var48;
                this.field2325[var52] = var60;
                this.field2295[var52] = var50;
            }
        }
        var4.field526 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field2330[var53] = 0;
            this.field2302[var53] = (short) var4.method230((byte) -111);
            this.field2313[var53] = (short) var4.method230((byte) -124);
            this.field2324[var53] = (short) var4.method230((byte) -108);
        }
        if (this.field2309 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field2309[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field2302[var56] & 0xFFFF) == this.field2300[var55] && (this.field2313[var56] & 0xFFFF) == this.field2325[var55] && (this.field2324[var56] & 0xFFFF) == this.field2295[var55]) {
                        this.field2309[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2309 = null;
            }
        }
        if (!var3) {
            this.field2335 = null;
        }
        if (!var2) {
            this.field2312 = null;
        }
    }
}
