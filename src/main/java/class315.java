import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class315 extends class51 {

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "Z")
    private boolean field5426 = false;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    public int field5414 = 0;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    public int field5429 = 0;

    @OriginalMember(owner = "client!fm", name = "eb", descriptor = "B")
    public byte field5442 = 0;

    @OriginalMember(owner = "client!fm", name = "cb", descriptor = "[I")
    public int[] field5440;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "[I")
    public int[] field5419;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "[I")
    public int[] field5408;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "[I")
    public int[] field5403;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "[I")
    public int[] field5415;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "[I")
    public int[] field5399;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "[I")
    public int[] field5404;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "[B")
    public byte[] field5407;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "[B")
    public byte[] field5398;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "[B")
    public byte[] field5411;

    @OriginalMember(owner = "client!fm", name = "ab", descriptor = "[S")
    public short[] field5438;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "[S")
    public short[] field5418;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "[B")
    public byte[] field5420;

    @OriginalMember(owner = "client!fm", name = "ib", descriptor = "[I")
    public int[] field5446;

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "[B")
    public byte[] field5434;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "[S")
    public short[] field5422;

    @OriginalMember(owner = "client!fm", name = "X", descriptor = "[S")
    public short[] field5435;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "[S")
    public short[] field5409;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "[S")
    public short[] field5431;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "[S")
    public short[] field5410;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "[S")
    public short[] field5405;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "[B")
    public byte[] field5427;

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "[B")
    public byte[] field5433;

    @OriginalMember(owner = "client!fm", name = "Y", descriptor = "[B")
    public byte[] field5436;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "[B")
    public byte[] field5417;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "[B")
    public byte[] field5421;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public int field5432;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "[[I")
    public int[][] field5413;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "[[I")
    public int[][] field5428;

    @OriginalMember(owner = "client!fm", name = "bb", descriptor = "[Lcc;")
    public class313[] field5439;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "[Lva;")
    public class205[] field5425;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "[Lcc;")
    public class313[] field5424;

    @OriginalMember(owner = "client!fm", name = "fb", descriptor = "S")
    public short field5443;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "S")
    public short field5412;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    private static int field5406 = 0;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "[I")
    private static int[] field5401 = new int[10000];

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "[I")
    private static int[] field5430 = class136.field2372;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "[I")
    private static int[] field5416 = new int[10000];

    @OriginalMember(owner = "client!fm", name = "hb", descriptor = "[I")
    private static int[] field5445 = class136.field2366;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "S")
    private short field5400;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "S")
    private short field5402;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "S")
    private short field5423;

    @OriginalMember(owner = "client!fm", name = "Z", descriptor = "S")
    private short field5437;

    @OriginalMember(owner = "client!fm", name = "db", descriptor = "S")
    private short field5441;

    @OriginalMember(owner = "client!fm", name = "gb", descriptor = "S")
    private short field5444;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II[[I[[IIIIZZ)Lfm;", line = 4)
    public final class315 method2170(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method2185();
        int var10 = this.field5441 + arg4;
        int var11 = this.field5423 + arg4;
        int var12 = this.field5402 + arg6;
        int var13 = this.field5400 + arg6;
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
        class315 var18;
        if (arg7) {
            var18 = new class315();
            var18.field5414 = this.field5414;
            var18.field5429 = this.field5429;
            var18.field5432 = this.field5432;
            var18.field5415 = this.field5415;
            var18.field5399 = this.field5399;
            var18.field5404 = this.field5404;
            var18.field5407 = this.field5407;
            var18.field5398 = this.field5398;
            var18.field5411 = this.field5411;
            var18.field5420 = this.field5420;
            var18.field5438 = this.field5438;
            var18.field5418 = this.field5418;
            var18.field5442 = this.field5442;
            var18.field5434 = this.field5434;
            var18.field5422 = this.field5422;
            var18.field5435 = this.field5435;
            var18.field5409 = this.field5409;
            var18.field5431 = this.field5431;
            var18.field5410 = this.field5410;
            var18.field5405 = this.field5405;
            var18.field5427 = this.field5427;
            var18.field5433 = this.field5433;
            var18.field5436 = this.field5436;
            var18.field5417 = this.field5417;
            var18.field5421 = this.field5421;
            var18.field5403 = this.field5403;
            var18.field5446 = this.field5446;
            var18.field5413 = this.field5413;
            var18.field5428 = this.field5428;
            var18.field5443 = this.field5443;
            var18.field5412 = this.field5412;
            var18.field5439 = this.field5439;
            var18.field5425 = this.field5425;
            var18.field5424 = this.field5424;
            if (arg0 == 3) {
                var18.field5440 = class246.method1665(this.field5440, 1);
                var18.field5419 = class246.method1665(this.field5419, 1);
                var18.field5408 = class246.method1665(this.field5408, 1);
            } else {
                var18.field5440 = this.field5440;
                var18.field5419 = new int[var18.field5414];
                var18.field5408 = this.field5408;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field5414; var19++) {
                int var20 = this.field5440[var19] + arg4;
                int var21 = this.field5408[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field5419[var19] = this.field5419[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field5414; var29++) {
                int var30 = (this.field5419[var29] << 16) / this.field5437;
                if (var30 < arg1) {
                    int var31 = this.field5440[var29] + arg4;
                    int var32 = this.field5408[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field5419[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field5419[var29];
                } else {
                    var18.field5419[var29] = this.field5419[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method2178(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field5444 - this.field5437;
            for (int var43 = 0; var43 < this.field5414; var43++) {
                int var44 = this.field5440[var43] + arg4;
                int var45 = this.field5408[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field5419[var43] = var52 + this.field5419[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field5444 - this.field5437;
            for (int var54 = 0; var54 < this.field5414; var54++) {
                int var55 = this.field5440[var54] + arg4;
                int var56 = this.field5408[var54] + arg6;
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
                var18.field5419[var54] = ((this.field5419[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method2190();
        } else {
            this.field5426 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "()I", line = 264)
    public final int method154() {
        if (!this.field5426) {
            this.method2185();
        }
        return this.field5437;
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "()Lfm;", line = 276)
    public final class315 method2171() {
        class315 var1 = new class315();
        if (this.field5407 != null) {
            var1.field5407 = new byte[this.field5429];
            for (int var2 = 0; var2 < this.field5429; var2++) {
                var1.field5407[var2] = this.field5407[var2];
            }
        }
        var1.field5414 = this.field5414;
        var1.field5429 = this.field5429;
        var1.field5432 = this.field5432;
        var1.field5440 = this.field5440;
        var1.field5419 = this.field5419;
        var1.field5408 = this.field5408;
        var1.field5415 = this.field5415;
        var1.field5399 = this.field5399;
        var1.field5404 = this.field5404;
        var1.field5398 = this.field5398;
        var1.field5411 = this.field5411;
        var1.field5420 = this.field5420;
        var1.field5438 = this.field5438;
        var1.field5418 = this.field5418;
        var1.field5442 = this.field5442;
        var1.field5434 = this.field5434;
        var1.field5422 = this.field5422;
        var1.field5435 = this.field5435;
        var1.field5409 = this.field5409;
        var1.field5431 = this.field5431;
        var1.field5410 = this.field5410;
        var1.field5405 = this.field5405;
        var1.field5427 = this.field5427;
        var1.field5433 = this.field5433;
        var1.field5436 = this.field5436;
        var1.field5417 = this.field5417;
        var1.field5421 = this.field5421;
        var1.field5403 = this.field5403;
        var1.field5446 = this.field5446;
        var1.field5413 = this.field5413;
        var1.field5428 = this.field5428;
        var1.field5439 = this.field5439;
        var1.field5425 = this.field5425;
        var1.field5443 = this.field5443;
        var1.field5412 = this.field5412;
        return var1;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)V", line = 334)
    public final void method2172(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5414; var4++) {
            this.field5440[var4] += arg0;
            this.field5419[var4] += arg1;
            this.field5408[var4] += arg2;
        }
        this.method2190();
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([B)V", line = 347)
    private final void method2173(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class41 var4 = new class41(arg0);
        class41 var5 = new class41(arg0);
        class41 var6 = new class41(arg0);
        class41 var7 = new class41(arg0);
        class41 var8 = new class41(arg0);
        var4.field738 = arg0.length - 18;
        int var9 = var4.method346(-16);
        int var10 = var4.method346(-16);
        int var11 = var4.method357(false);
        int var12 = var4.method357(false);
        int var13 = var4.method357(false);
        int var14 = var4.method357(false);
        int var15 = var4.method357(false);
        int var16 = var4.method357(false);
        int var17 = var4.method346(-16);
        int var18 = var4.method346(-16);
        int var19 = var4.method346(-16);
        int var20 = var4.method346(-16);
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
        this.field5414 = var9;
        this.field5429 = var10;
        this.field5432 = var11;
        this.field5440 = new int[var9];
        this.field5419 = new int[var9];
        this.field5408 = new int[var9];
        this.field5415 = new int[var10];
        this.field5399 = new int[var10];
        this.field5404 = new int[var10];
        if (var11 > 0) {
            this.field5434 = new byte[var11];
            this.field5422 = new short[var11];
            this.field5435 = new short[var11];
            this.field5409 = new short[var11];
        }
        if (var16 == 1) {
            this.field5403 = new int[var9];
        }
        if (var12 == 1) {
            this.field5407 = new byte[var10];
            this.field5420 = new byte[var10];
            this.field5418 = new short[var10];
        }
        if (var13 == 255) {
            this.field5398 = new byte[var10];
        } else {
            this.field5442 = (byte) var13;
        }
        if (var14 == 1) {
            this.field5411 = new byte[var10];
        }
        if (var15 == 1) {
            this.field5446 = new int[var10];
        }
        this.field5438 = new short[var10];
        var4.field738 = var21;
        var5.field738 = var36;
        var6.field738 = var38;
        var7.field738 = var40;
        var8.field738 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method357(false);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method364(-49152);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method364(-49152);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method364(-49152);
            }
            this.field5440[var46] = var43 + var48;
            this.field5419[var46] = var44 + var49;
            this.field5408[var46] = var45 + var50;
            var43 = this.field5440[var46];
            var44 = this.field5419[var46];
            var45 = this.field5408[var46];
            if (var16 == 1) {
                this.field5403[var46] = var8.method357(false);
            }
        }
        var4.field738 = var32;
        var5.field738 = var28;
        var6.field738 = var26;
        var7.field738 = var30;
        var8.field738 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field5438[var51] = (short) var4.method346(-16);
            if (var12 == 1) {
                int var52 = var5.method357(false);
                if ((var52 & 0x1) == 1) {
                    this.field5407[var51] = 1;
                    var2 = true;
                } else {
                    this.field5407[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field5420[var51] = (byte) (var52 >> 2);
                    this.field5418[var51] = this.field5438[var51];
                    this.field5438[var51] = 127;
                    if (this.field5418[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field5420[var51] = -1;
                    this.field5418[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field5398[var51] = var6.method323(9092);
            }
            if (var14 == 1) {
                this.field5411[var51] = var7.method323(9092);
            }
            if (var15 == 1) {
                this.field5446[var51] = var8.method357(false);
            }
        }
        var4.field738 = var25;
        var5.field738 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method357(false);
            if (var58 == 1) {
                var53 = var4.method364(-49152) + var56;
                var54 = var4.method364(-49152) + var53;
                var55 = var4.method364(-49152) + var54;
                var56 = var55;
                this.field5415[var57] = var53;
                this.field5399[var57] = var54;
                this.field5404[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method364(-49152) + var56;
                var56 = var55;
                this.field5415[var57] = var53;
                this.field5399[var57] = var54;
                this.field5404[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method364(-49152) + var56;
                var56 = var55;
                this.field5415[var57] = var53;
                this.field5399[var57] = var54;
                this.field5404[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method364(-49152) + var56;
                var56 = var55;
                this.field5415[var57] = var53;
                this.field5399[var57] = var61;
                this.field5404[var57] = var55;
            }
        }
        var4.field738 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field5434[var62] = 0;
            this.field5422[var62] = (short) var4.method346(-16);
            this.field5435[var62] = (short) var4.method346(-16);
            this.field5409[var62] = (short) var4.method346(-16);
        }
        if (this.field5420 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field5420[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field5422[var65] & 0xFFFF) == this.field5415[var64] && (this.field5435[var65] & 0xFFFF) == this.field5399[var64] && (this.field5409[var65] & 0xFFFF) == this.field5404[var64]) {
                        this.field5420[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field5420 = null;
            }
        }
        if (!var3) {
            this.field5418 = null;
        }
        if (!var2) {
            this.field5407 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "([B)V", line = 693)
    private final void method2174(byte[] arg0) {
        class41 var2 = new class41(arg0);
        class41 var3 = new class41(arg0);
        class41 var4 = new class41(arg0);
        class41 var5 = new class41(arg0);
        class41 var6 = new class41(arg0);
        class41 var7 = new class41(arg0);
        class41 var8 = new class41(arg0);
        var2.field738 = arg0.length - 23;
        int var9 = var2.method346(-16);
        int var10 = var2.method346(-16);
        int var11 = var2.method357(false);
        int var12 = var2.method357(false);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method357(false);
        int var16 = var2.method357(false);
        int var17 = var2.method357(false);
        int var18 = var2.method357(false);
        int var19 = var2.method357(false);
        int var20 = var2.method346(-16);
        int var21 = var2.method346(-16);
        int var22 = var2.method346(-16);
        int var23 = var2.method346(-16);
        int var24 = var2.method346(-16);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field5434 = new byte[var11];
            var2.field738 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field5434[var28] = var2.method323(9092);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field5414 = var9;
        this.field5429 = var10;
        this.field5432 = var11;
        this.field5440 = new int[var9];
        this.field5419 = new int[var9];
        this.field5408 = new int[var9];
        this.field5415 = new int[var10];
        this.field5399 = new int[var10];
        this.field5404 = new int[var10];
        if (var19 == 1) {
            this.field5403 = new int[var9];
        }
        if (var13) {
            this.field5407 = new byte[var10];
        }
        if (var15 == 255) {
            this.field5398 = new byte[var10];
        } else {
            this.field5442 = (byte) var15;
        }
        if (var16 == 1) {
            this.field5411 = new byte[var10];
        }
        if (var17 == 1) {
            this.field5446 = new int[var10];
        }
        if (var18 == 1) {
            this.field5418 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field5420 = new byte[var10];
        }
        this.field5438 = new short[var10];
        if (var11 > 0) {
            this.field5422 = new short[var11];
            this.field5435 = new short[var11];
            this.field5409 = new short[var11];
            if (var26 > 0) {
                this.field5431 = new short[var26];
                this.field5410 = new short[var26];
                this.field5405 = new short[var26];
                this.field5427 = new byte[var26];
                this.field5433 = new byte[var26];
                this.field5436 = new byte[var26];
            }
            if (var27 > 0) {
                this.field5417 = new byte[var27];
                this.field5421 = new byte[var27];
            }
        }
        var2.field738 = var11;
        var3.field738 = var46;
        var4.field738 = var48;
        var5.field738 = var50;
        var6.field738 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var70 = var2.method357(false);
            int var71 = 0;
            if ((var70 & 0x1) != 0) {
                var71 = var3.method364(-49152);
            }
            int var72 = 0;
            if ((var70 & 0x2) != 0) {
                var72 = var4.method364(-49152);
            }
            int var73 = 0;
            if ((var70 & 0x4) != 0) {
                var73 = var5.method364(-49152);
            }
            this.field5440[var69] = var66 + var71;
            this.field5419[var69] = var67 + var72;
            this.field5408[var69] = var68 + var73;
            var66 = this.field5440[var69];
            var67 = this.field5419[var69];
            var68 = this.field5408[var69];
            if (var19 == 1) {
                this.field5403[var69] = var6.method357(false);
            }
        }
        var2.field738 = var44;
        var3.field738 = var33;
        var4.field738 = var36;
        var5.field738 = var39;
        var6.field738 = var37;
        var7.field738 = var42;
        var8.field738 = var41;
        for (int var74 = 0; var74 < var10; var74++) {
            this.field5438[var74] = (short) var2.method346(-16);
            if (var13) {
                this.field5407[var74] = var3.method323(9092);
            }
            if (var15 == 255) {
                this.field5398[var74] = var4.method323(9092);
            }
            if (var16 == 1) {
                this.field5411[var74] = var5.method323(9092);
            }
            if (var17 == 1) {
                this.field5446[var74] = var6.method357(false);
            }
            if (var18 == 1) {
                this.field5418[var74] = (short) (var7.method346(-16) - 1);
            }
            if (this.field5420 != null) {
                if (this.field5418[var74] == -1) {
                    this.field5420[var74] = -1;
                } else {
                    this.field5420[var74] = (byte) (var8.method357(false) - 1);
                }
            }
        }
        var2.field738 = var35;
        var3.field738 = var32;
        int var75 = 0;
        int var76 = 0;
        int var77 = 0;
        int var78 = 0;
        for (int var79 = 0; var79 < var10; var79++) {
            int var80 = var3.method357(false);
            if (var80 == 1) {
                var75 = var2.method364(-49152) + var78;
                var76 = var2.method364(-49152) + var75;
                var77 = var2.method364(-49152) + var76;
                var78 = var77;
                this.field5415[var79] = var75;
                this.field5399[var79] = var76;
                this.field5404[var79] = var77;
            }
            if (var80 == 2) {
                var76 = var77;
                var77 = var2.method364(-49152) + var78;
                var78 = var77;
                this.field5415[var79] = var75;
                this.field5399[var79] = var76;
                this.field5404[var79] = var77;
            }
            if (var80 == 3) {
                var75 = var77;
                var77 = var2.method364(-49152) + var78;
                var78 = var77;
                this.field5415[var79] = var75;
                this.field5399[var79] = var76;
                this.field5404[var79] = var77;
            }
            if (var80 == 4) {
                int var83 = var75;
                var75 = var76;
                var76 = var83;
                var77 = var2.method364(-49152) + var78;
                var78 = var77;
                this.field5415[var79] = var75;
                this.field5399[var79] = var83;
                this.field5404[var79] = var77;
            }
        }
        var2.field738 = var52;
        var3.field738 = var54;
        var4.field738 = var56;
        var5.field738 = var58;
        var6.field738 = var60;
        var7.field738 = var62;
        for (int var84 = 0; var84 < var11; var84++) {
            int var85 = this.field5434[var84] & 0xFF;
            if (var85 == 0) {
                this.field5422[var84] = (short) var2.method346(-16);
                this.field5435[var84] = (short) var2.method346(-16);
                this.field5409[var84] = (short) var2.method346(-16);
            }
            if (var85 == 1) {
                this.field5422[var84] = (short) var3.method346(-16);
                this.field5435[var84] = (short) var3.method346(-16);
                this.field5409[var84] = (short) var3.method346(-16);
                this.field5431[var84] = (short) var4.method346(-16);
                this.field5410[var84] = (short) var4.method346(-16);
                this.field5405[var84] = (short) var4.method346(-16);
                this.field5427[var84] = var5.method323(9092);
                this.field5433[var84] = var6.method323(9092);
                this.field5436[var84] = var7.method323(9092);
            }
            if (var85 == 2) {
                this.field5422[var84] = (short) var3.method346(-16);
                this.field5435[var84] = (short) var3.method346(-16);
                this.field5409[var84] = (short) var3.method346(-16);
                this.field5431[var84] = (short) var4.method346(-16);
                this.field5410[var84] = (short) var4.method346(-16);
                this.field5405[var84] = (short) var4.method346(-16);
                this.field5427[var84] = var5.method323(9092);
                this.field5433[var84] = var6.method323(9092);
                this.field5436[var84] = var7.method323(9092);
                this.field5417[var84] = var7.method323(9092);
                this.field5421[var84] = var7.method323(9092);
            }
            if (var85 == 3) {
                this.field5422[var84] = (short) var3.method346(-16);
                this.field5435[var84] = (short) var3.method346(-16);
                this.field5409[var84] = (short) var3.method346(-16);
                this.field5431[var84] = (short) var4.method346(-16);
                this.field5410[var84] = (short) var4.method346(-16);
                this.field5405[var84] = (short) var4.method346(-16);
                this.field5427[var84] = var5.method323(9092);
                this.field5433[var84] = var6.method323(9092);
                this.field5436[var84] = var7.method323(9092);
            }
        }
        if (!var14) {
            return;
        }
        var2.field738 = var64;
        int var86 = var2.method357(false);
        if (var86 > 0) {
            var2.field738 += var86 * 4;
        }
        int var87 = var2.method357(false);
        if (var87 > 0) {
            var2.field738 += var87 * 4;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(SS)V", line = 1146)
    public final void method2175(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5429; var3++) {
            if (this.field5438[var3] == arg0) {
                this.field5438[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIII)V", line = 1157)
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "()V", line = 1162)
    public final void method2176() {
        for (int var1 = 0; var1 < this.field5414; var1++) {
            int var2 = this.field5440[var1];
            this.field5440[var1] = this.field5408[var1];
            this.field5408[var1] = -var2;
        }
        this.method2190();
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(III)V", line = 1180)
    public final void method2177(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5414; var4++) {
            this.field5440[var4] = this.field5440[var4] * arg0 / 128;
            this.field5419[var4] = this.field5419[var4] * arg1 / 128;
            this.field5408[var4] = this.field5408[var4] * arg2 / 128;
        }
        this.method2190();
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([[IIIIII)V", line = 1193)
    private final void method2178(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method2183(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method2183(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method2183(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method2183(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method2189(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method2192(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method2172(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 1261)
    public final void method2179(int arg0) {
        int var2 = field5445[arg0];
        int var3 = field5430[arg0];
        for (int var4 = 0; var4 < this.field5414; var4++) {
            int var5 = this.field5440[var4] * var3 + this.field5408[var4] * var2 >> 16;
            this.field5408[var4] = this.field5408[var4] * var3 - this.field5440[var4] * var2 >> 16;
            this.field5440[var4] = var5;
        }
        this.method2190();
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "()Z", line = 1281)
    public final boolean method408() {
        return true;
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "()V", line = 1293)
    public final void method2180() {
        int var10002;
        if (this.field5403 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field5414; var3++) {
                int var4 = this.field5403[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field5413 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field5413[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field5414) {
                int var7 = this.field5403[var6];
                this.field5413[var7][var1[var7]++] = var6++;
            }
            this.field5403 = null;
        }
        if (this.field5446 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5429; var10++) {
            int var11 = this.field5446[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field5428 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field5428[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field5429) {
            int var14 = this.field5446[var13];
            this.field5428[var14][var8[var14]++] = var13++;
        }
        this.field5446 = null;
    }

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "()V", line = 1388)
    public final void method2181() {
        for (int var1 = 0; var1 < this.field5414; var1++) {
            this.field5408[var1] = -this.field5408[var1];
        }
        for (int var2 = 0; var2 < this.field5429; var2++) {
            int var3 = this.field5415[var2];
            this.field5415[var2] = this.field5404[var2];
            this.field5404[var2] = var3;
        }
        this.method2190();
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(III)I", line = 1418)
    public final int method2182(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5414; var4++) {
            if (this.field5440[var4] == arg0 && this.field5419[var4] == arg1 && this.field5408[var4] == arg2) {
                return var4;
            }
        }
        this.field5440[this.field5414] = arg0;
        this.field5419[this.field5414] = arg1;
        this.field5408[this.field5414] = arg2;
        return this.field5414++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([[III)I", line = 1436)
    private static final int method2183(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "()V", line = 1457)
    public final void method2184() {
        for (int var1 = 0; var1 < this.field5414; var1++) {
            this.field5440[var1] = -this.field5440[var1];
            this.field5408[var1] = -this.field5408[var1];
        }
        this.method2190();
    }

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "()V", line = 1469)
    private final void method2185() {
        if (this.field5426) {
            return;
        }
        this.field5426 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field5414; var7++) {
            int var8 = this.field5440[var7];
            int var9 = this.field5419[var7];
            int var10 = this.field5408[var7];
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
        this.field5441 = (short) var1;
        this.field5423 = (short) var4;
        this.field5437 = (short) var2;
        this.field5444 = (short) var5;
        this.field5402 = (short) var3;
        this.field5400 = (short) var6;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Lmc;", line = 1529)
    public final class51 method411(int arg0, int arg1, int arg2) {
        return this.method2195(this.field5443, this.field5412, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIIIJILfk;)V", line = 1532)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class283 arg10) {
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lfm;IS)I", line = 1535)
    private final int method2186(class315 arg0, int arg1, short arg2) {
        int var4 = arg0.field5440[arg1];
        int var5 = arg0.field5419[arg1];
        int var6 = arg0.field5408[arg1];
        for (int var7 = 0; var7 < this.field5414; var7++) {
            if (this.field5440[var7] == var4 && this.field5419[var7] == var5 && this.field5408[var7] == var6) {
                return var7;
            }
        }
        this.field5440[this.field5414] = var4;
        this.field5419[this.field5414] = var5;
        this.field5408[this.field5414] = var6;
        if (arg0.field5403 != null) {
            this.field5403[this.field5414] = arg0.field5403[arg1];
        }
        return this.field5414++;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(IIIII)Lui;", line = 1562)
    public final class89 method2187(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class89(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "()V", line = 1570)
    public final void method2188() {
        for (int var1 = 0; var1 < this.field5414; var1++) {
            int var2 = this.field5408[var1];
            this.field5408[var1] = this.field5440[var1];
            this.field5440[var1] = -var2;
        }
        this.method2190();
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V", line = 1587)
    private final void method2189(int arg0) {
        int var2 = field5445[arg0];
        int var3 = field5430[arg0];
        for (int var4 = 0; var4 < this.field5414; var4++) {
            int var5 = this.field5419[var4] * var3 - this.field5408[var4] * var2 >> 16;
            this.field5408[var4] = this.field5419[var4] * var2 + this.field5408[var4] * var3 >> 16;
            this.field5419[var4] = var5;
        }
        this.method2190();
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 1830)
    private class315() {
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "([B)V", line = 1832)
    private class315(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2174(arg0);
        } else {
            this.method2173(arg0);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(III)V", line = 1956)
    public class315(int arg0, int arg1, int arg2) {
        this.field5440 = new int[arg0];
        this.field5419 = new int[arg0];
        this.field5408 = new int[arg0];
        this.field5403 = new int[arg0];
        this.field5415 = new int[arg1];
        this.field5399 = new int[arg1];
        this.field5404 = new int[arg1];
        this.field5407 = new byte[arg1];
        this.field5398 = new byte[arg1];
        this.field5411 = new byte[arg1];
        this.field5438 = new short[arg1];
        this.field5418 = new short[arg1];
        this.field5420 = new byte[arg1];
        this.field5446 = new int[arg1];
        if (arg2 > 0) {
            this.field5434 = new byte[arg2];
            this.field5422 = new short[arg2];
            this.field5435 = new short[arg2];
            this.field5409 = new short[arg2];
            this.field5431 = new short[arg2];
            this.field5410 = new short[arg2];
            this.field5405 = new short[arg2];
            this.field5427 = new byte[arg2];
            this.field5433 = new byte[arg2];
            this.field5436 = new byte[arg2];
            this.field5417 = new byte[arg2];
            this.field5421 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "([Lfm;I)V", line = 1989)
    public class315(class315[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field5414 = 0;
        this.field5429 = 0;
        this.field5432 = 0;
        byte var9 = 0;
        byte var10 = 0;
        this.field5442 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class315 var12 = arg0[var11];
            if (var12 != null) {
                this.field5414 += var12.field5414;
                this.field5429 += var12.field5429;
                this.field5432 += var12.field5432;
                if (var12.field5398 == null) {
                    if (this.field5442 == -1) {
                        this.field5442 = var12.field5442;
                    }
                    if (this.field5442 != var12.field5442) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var12.field5407 != null;
                var5 |= var12.field5411 != null;
                var6 |= var12.field5446 != null;
                var7 |= var12.field5418 != null;
                var8 |= var12.field5420 != null;
            }
        }
        this.field5440 = new int[this.field5414];
        this.field5419 = new int[this.field5414];
        this.field5408 = new int[this.field5414];
        this.field5403 = new int[this.field5414];
        this.field5415 = new int[this.field5429];
        this.field5399 = new int[this.field5429];
        this.field5404 = new int[this.field5429];
        if (var3) {
            this.field5407 = new byte[this.field5429];
        }
        if (var4) {
            this.field5398 = new byte[this.field5429];
        }
        if (var5) {
            this.field5411 = new byte[this.field5429];
        }
        if (var6) {
            this.field5446 = new int[this.field5429];
        }
        if (var7) {
            this.field5418 = new short[this.field5429];
        }
        if (var8) {
            this.field5420 = new byte[this.field5429];
        }
        if (var9 > 0) {
        }
        if (var10 > 0) {
        }
        this.field5438 = new short[this.field5429];
        if (this.field5432 > 0) {
            this.field5434 = new byte[this.field5432];
            this.field5422 = new short[this.field5432];
            this.field5435 = new short[this.field5432];
            this.field5409 = new short[this.field5432];
            this.field5431 = new short[this.field5432];
            this.field5410 = new short[this.field5432];
            this.field5405 = new short[this.field5432];
            this.field5427 = new byte[this.field5432];
            this.field5433 = new byte[this.field5432];
            this.field5436 = new byte[this.field5432];
            this.field5417 = new byte[this.field5432];
            this.field5421 = new byte[this.field5432];
        }
        this.field5414 = 0;
        this.field5429 = 0;
        this.field5432 = 0;
        boolean var13 = false;
        boolean var14 = false;
        for (int var15 = 0; var15 < arg1; var15++) {
            short var16 = (short) (0x1 << var15);
            class315 var17 = arg0[var15];
            if (var17 != null) {
                for (int var18 = 0; var18 < var17.field5429; var18++) {
                    if (var3 && var17.field5407 != null) {
                        this.field5407[this.field5429] = var17.field5407[var18];
                    }
                    if (var4) {
                        if (var17.field5398 == null) {
                            this.field5398[this.field5429] = var17.field5442;
                        } else {
                            this.field5398[this.field5429] = var17.field5398[var18];
                        }
                    }
                    if (var5 && var17.field5411 != null) {
                        this.field5411[this.field5429] = var17.field5411[var18];
                    }
                    if (var6 && var17.field5446 != null) {
                        this.field5446[this.field5429] = var17.field5446[var18];
                    }
                    if (var7) {
                        if (var17.field5418 == null) {
                            this.field5418[this.field5429] = -1;
                        } else {
                            this.field5418[this.field5429] = var17.field5418[var18];
                        }
                    }
                    if (var8) {
                        if (var17.field5420 == null || var17.field5420[var18] == -1) {
                            this.field5420[this.field5429] = -1;
                        } else {
                            this.field5420[this.field5429] = (byte) (var17.field5420[var18] + this.field5432);
                        }
                    }
                    this.field5438[this.field5429] = var17.field5438[var18];
                    this.field5415[this.field5429] = this.method2186(var17, var17.field5415[var18], var16);
                    this.field5399[this.field5429] = this.method2186(var17, var17.field5399[var18], var16);
                    this.field5404[this.field5429] = this.method2186(var17, var17.field5404[var18], var16);
                    this.field5429++;
                }
                for (int var19 = 0; var19 < var17.field5432; var19++) {
                    byte var20 = this.field5434[this.field5432] = var17.field5434[var19];
                    if (var20 == 0) {
                        this.field5422[this.field5432] = (short) this.method2186(var17, var17.field5422[var19], var16);
                        this.field5435[this.field5432] = (short) this.method2186(var17, var17.field5435[var19], var16);
                        this.field5409[this.field5432] = (short) this.method2186(var17, var17.field5409[var19], var16);
                    }
                    if (var20 >= 1 && var20 <= 3) {
                        this.field5422[this.field5432] = var17.field5422[var19];
                        this.field5435[this.field5432] = var17.field5435[var19];
                        this.field5409[this.field5432] = var17.field5409[var19];
                        this.field5431[this.field5432] = var17.field5431[var19];
                        this.field5410[this.field5432] = var17.field5410[var19];
                        this.field5405[this.field5432] = var17.field5405[var19];
                        this.field5427[this.field5432] = var17.field5427[var19];
                        this.field5433[this.field5432] = var17.field5433[var19];
                        this.field5436[this.field5432] = var17.field5436[var19];
                    }
                    if (var20 == 2) {
                        this.field5417[this.field5432] = var17.field5417[var19];
                        this.field5421[this.field5432] = var17.field5421[var19];
                    }
                    this.field5432++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lfm;ZZZZ)V", line = 2218)
    public class315(class315 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field5414 = arg0.field5414;
        this.field5429 = arg0.field5429;
        this.field5432 = arg0.field5432;
        if (arg1) {
            this.field5440 = arg0.field5440;
            this.field5419 = arg0.field5419;
            this.field5408 = arg0.field5408;
        } else {
            this.field5440 = new int[this.field5414];
            this.field5419 = new int[this.field5414];
            this.field5408 = new int[this.field5414];
            for (int var6 = 0; var6 < this.field5414; var6++) {
                this.field5440[var6] = arg0.field5440[var6];
                this.field5419[var6] = arg0.field5419[var6];
                this.field5408[var6] = arg0.field5408[var6];
            }
        }
        if (arg2) {
            this.field5438 = arg0.field5438;
        } else {
            this.field5438 = new short[this.field5429];
            for (int var7 = 0; var7 < this.field5429; var7++) {
                this.field5438[var7] = arg0.field5438[var7];
            }
        }
        if (arg3 || arg0.field5418 == null) {
            this.field5418 = arg0.field5418;
        } else {
            this.field5418 = new short[this.field5429];
            for (int var8 = 0; var8 < this.field5429; var8++) {
                this.field5418[var8] = arg0.field5418[var8];
            }
        }
        if (arg4) {
            this.field5411 = arg0.field5411;
        } else {
            this.field5411 = new byte[this.field5429];
            if (arg0.field5411 == null) {
                for (int var9 = 0; var9 < this.field5429; var9++) {
                    this.field5411[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field5429; var10++) {
                    this.field5411[var10] = arg0.field5411[var10];
                }
            }
        }
        this.field5415 = arg0.field5415;
        this.field5399 = arg0.field5399;
        this.field5404 = arg0.field5404;
        this.field5407 = arg0.field5407;
        this.field5398 = arg0.field5398;
        this.field5420 = arg0.field5420;
        this.field5442 = arg0.field5442;
        this.field5434 = arg0.field5434;
        this.field5422 = arg0.field5422;
        this.field5435 = arg0.field5435;
        this.field5409 = arg0.field5409;
        this.field5431 = arg0.field5431;
        this.field5410 = arg0.field5410;
        this.field5405 = arg0.field5405;
        this.field5427 = arg0.field5427;
        this.field5433 = arg0.field5433;
        this.field5436 = arg0.field5436;
        this.field5417 = arg0.field5417;
        this.field5421 = arg0.field5421;
        this.field5403 = arg0.field5403;
        this.field5446 = arg0.field5446;
        this.field5413 = arg0.field5413;
        this.field5428 = arg0.field5428;
        this.field5439 = arg0.field5439;
        this.field5425 = arg0.field5425;
        this.field5424 = arg0.field5424;
        this.field5443 = arg0.field5443;
        this.field5412 = arg0.field5412;
    }

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "()V", line = 1616)
    private final void method2190() {
        this.field5439 = null;
        this.field5424 = null;
        this.field5425 = null;
        this.field5426 = false;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lng;II)Lfm;", line = 1625)
    public static final class315 method2191(class138 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1016(arg1, 100, arg2);
        return var3 == null ? null : new class315(var3);
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V", line = 1636)
    private final void method2192(int arg0) {
        int var2 = field5445[arg0];
        int var3 = field5430[arg0];
        for (int var4 = 0; var4 < this.field5414; var4++) {
            int var5 = this.field5440[var4] * var3 + this.field5419[var4] * var2 >> 16;
            this.field5419[var4] = this.field5419[var4] * var3 - this.field5440[var4] * var2 >> 16;
            this.field5440[var4] = var5;
        }
        this.method2190();
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(SS)V", line = 1654)
    public final void method2193(short arg0, short arg1) {
        if (this.field5418 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field5429; var3++) {
            if (this.field5418[var3] == arg0) {
                this.field5418[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIBSB)I", line = 1671)
    public final int method2194(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field5415[this.field5429] = arg0;
        this.field5399[this.field5429] = arg1;
        this.field5404[this.field5429] = arg2;
        this.field5407[this.field5429] = arg3;
        this.field5420[this.field5429] = -1;
        this.field5438[this.field5429] = arg4;
        this.field5418[this.field5429] = -1;
        this.field5411[this.field5429] = arg5;
        return this.field5429++;
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(IIIII)Lha;", line = 1688)
    public final class26 method2195(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class253.field4323) {
            class149 var6 = new class149(this, arg0, arg1, true);
            var6.method1097();
            return var6;
        } else {
            return new class89(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "()V", line = 1703)
    public static void method2196() {
        field5401 = null;
        field5416 = null;
        field5445 = null;
        field5430 = null;
    }

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "()V", line = 1713)
    public final void method2197() {
        this.field5403 = null;
        this.field5446 = null;
        this.field5413 = (int[][]) null;
        this.field5428 = (int[][]) null;
    }

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "()V", line = 1719)
    public final void method2198() {
        if (this.field5439 != null) {
            return;
        }
        this.field5439 = new class313[this.field5414];
        for (int var1 = 0; var1 < this.field5414; var1++) {
            this.field5439[var1] = new class313();
        }
        for (int var2 = 0; var2 < this.field5429; var2++) {
            int var3 = this.field5415[var2];
            int var4 = this.field5399[var2];
            int var5 = this.field5404[var2];
            int var6 = this.field5440[var4] - this.field5440[var3];
            int var7 = this.field5419[var4] - this.field5419[var3];
            int var8 = this.field5408[var4] - this.field5408[var3];
            int var9 = this.field5440[var5] - this.field5440[var3];
            int var10 = this.field5419[var5] - this.field5419[var3];
            int var11 = this.field5408[var5] - this.field5408[var3];
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
            if (this.field5407 == null) {
                var19 = 0;
            } else {
                var19 = this.field5407[var2];
            }
            if (var19 == 0) {
                class313 var20 = this.field5439[var3];
                var20.field5384 += var16;
                var20.field5388 += var17;
                var20.field5387 += var18;
                var20.field5385++;
                class313 var21 = this.field5439[var4];
                var21.field5384 += var16;
                var21.field5388 += var17;
                var21.field5387 += var18;
                var21.field5385++;
                class313 var22 = this.field5439[var5];
                var22.field5384 += var16;
                var22.field5388 += var17;
                var22.field5387 += var18;
                var22.field5385++;
            } else if (var19 == 1) {
                if (this.field5425 == null) {
                    this.field5425 = new class205[this.field5429];
                }
                class205 var23 = this.field5425[var2] = new class205();
                var23.field3721 = var16;
                var23.field3723 = var17;
                var23.field3715 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lmc;IIIZ)V", line = 1841)
    public final void method410(class51 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class315 var6 = (class315) arg0;
        var6.method2185();
        var6.method2198();
        field5406++;
        int var7 = 0;
        int[] var8 = var6.field5440;
        int var9 = var6.field5414;
        for (int var10 = 0; var10 < this.field5414; var10++) {
            class313 var11 = this.field5439[var10];
            if (var11.field5385 != 0) {
                int var12 = this.field5419[var10] - arg2;
                if (var12 >= var6.field5437 && var12 <= var6.field5444) {
                    int var13 = this.field5440[var10] - arg1;
                    if (var13 >= var6.field5441 && var13 <= var6.field5423) {
                        int var14 = this.field5408[var10] - arg3;
                        if (var14 >= var6.field5402 && var14 <= var6.field5400) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class313 var16 = var6.field5439[var15];
                                if (var8[var15] == var13 && var6.field5408[var15] == var14 && var6.field5419[var15] == var12 && var16.field5385 != 0) {
                                    if (this.field5424 == null) {
                                        this.field5424 = new class313[this.field5414];
                                    }
                                    if (var6.field5424 == null) {
                                        var6.field5424 = new class313[var9];
                                    }
                                    class313 var17 = this.field5424[var10];
                                    if (var17 == null) {
                                        var17 = this.field5424[var10] = new class313(var11);
                                    }
                                    class313 var18 = var6.field5424[var15];
                                    if (var18 == null) {
                                        var18 = var6.field5424[var15] = new class313(var16);
                                    }
                                    var17.field5384 += var16.field5384;
                                    var17.field5388 += var16.field5388;
                                    var17.field5387 += var16.field5387;
                                    var17.field5385 += var16.field5385;
                                    var18.field5384 += var11.field5384;
                                    var18.field5388 += var11.field5388;
                                    var18.field5387 += var11.field5387;
                                    var18.field5385 += var11.field5385;
                                    var7++;
                                    field5401[var10] = field5406;
                                    field5416[var15] = field5406;
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
        for (int var19 = 0; var19 < this.field5429; var19++) {
            if (field5401[this.field5415[var19]] == field5406 && field5401[this.field5399[var19]] == field5406 && field5401[this.field5404[var19]] == field5406) {
                if (this.field5407 == null) {
                    this.field5407 = new byte[this.field5429];
                }
                this.field5407[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field5429; var20++) {
            if (field5416[var6.field5415[var20]] == field5406 && field5416[var6.field5399[var20]] == field5406 && field5416[var6.field5404[var20]] == field5406) {
                if (var6.field5407 == null) {
                    var6.field5407 = new byte[var6.field5429];
                }
                var6.field5407[var20] = 2;
            }
        }
    }
}
