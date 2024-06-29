import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class208 extends class231 {

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "Z")
    private boolean field3427 = false;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
    public int field3445 = 0;

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "B")
    private byte field3443 = 0;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public int field3438 = 0;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "[I")
    public int[] field3404;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "[I")
    public int[] field3421;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "[I")
    public int[] field3428;

    @OriginalMember(owner = "client!ke", name = "mb", descriptor = "[I")
    public int[] field3451;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "[I")
    public int[] field3434;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "[I")
    public int[] field3417;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "[I")
    public int[] field3430;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "[B")
    public byte[] field3426;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "[B")
    public byte[] field3403;

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "[B")
    public byte[] field3444;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "[S")
    public short[] field3425;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "[S")
    public short[] field3410;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "[B")
    public byte[] field3437;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "[I")
    public int[] field3412;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "[B")
    public byte[] field3433;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "[S")
    public short[] field3446;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "[S")
    public short[] field3411;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "[S")
    public short[] field3406;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "[S")
    public short[] field3405;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "[S")
    public short[] field3432;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "[S")
    public short[] field3413;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "[B")
    public byte[] field3441;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "[B")
    public byte[] field3436;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "[B")
    public byte[] field3416;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "[B")
    public byte[] field3424;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "[B")
    public byte[] field3442;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public int field3435;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "[I")
    private static int[] field3409 = class173.field2818;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "[I")
    private static int[] field3420 = new int[10000];

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "[I")
    private static int[] field3422 = class173.field2812;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "[I")
    private static int[] field3429 = new int[10000];

    @OriginalMember(owner = "client!ke", name = "lb", descriptor = "I")
    private static int field3450 = 0;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "S")
    private short field3408;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "S")
    private short field3414;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "S")
    private short field3415;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "S")
    private short field3423;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "S")
    private short field3440;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "S")
    private short field3447;

    @OriginalMember(owner = "client!ke", name = "jb", descriptor = "S")
    private short field3448;

    @OriginalMember(owner = "client!ke", name = "kb", descriptor = "S")
    private short field3449;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "[Lod;")
    public class266[] field3407;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "[Lod;")
    public class266[] field3419;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "[Lpk;")
    public class43[] field3418;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "[[I")
    public int[][] field3431;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "[[I")
    public int[][] field3439;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIIII)Lfc;", line = 6)
    public final class152 method1446(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class93 var6 = new class93(this, arg0, arg1, true);
        var6.method700();
        return var6;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "()V", line = 13)
    public final void method1447() {
        int var10002;
        if (this.field3451 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3438; var3++) {
                int var4 = this.field3451[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3431 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3431[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3438) {
                int var7 = this.field3451[var6];
                this.field3431[var7][var1[var7]++] = var6++;
            }
            this.field3451 = null;
        }
        if (this.field3412 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3445; var10++) {
            int var11 = this.field3412[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3439 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3439[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3445) {
            int var14 = this.field3412[var13];
            this.field3439[var14][var8[var14]++] = var13++;
        }
        this.field3412 = null;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "()V", line = 107)
    public final void method1448() {
        if (this.field3407 != null) {
            return;
        }
        this.field3407 = new class266[this.field3438];
        for (int var1 = 0; var1 < this.field3438; var1++) {
            this.field3407[var1] = new class266();
        }
        for (int var2 = 0; var2 < this.field3445; var2++) {
            int var3 = this.field3434[var2];
            int var4 = this.field3417[var2];
            int var5 = this.field3430[var2];
            int var6 = this.field3404[var4] - this.field3404[var3];
            int var7 = this.field3421[var4] - this.field3421[var3];
            int var8 = this.field3428[var4] - this.field3428[var3];
            int var9 = this.field3404[var5] - this.field3404[var3];
            int var10 = this.field3421[var5] - this.field3421[var3];
            int var11 = this.field3428[var5] - this.field3428[var3];
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
            if (this.field3426 == null) {
                var19 = 0;
            } else {
                var19 = this.field3426[var2];
            }
            if (var19 == 0) {
                class266 var20 = this.field3407[var3];
                var20.field4488 += var16;
                var20.field4475 += var17;
                var20.field4486 += var18;
                var20.field4485++;
                class266 var21 = this.field3407[var4];
                var21.field4488 += var16;
                var21.field4475 += var17;
                var21.field4486 += var18;
                var21.field4485++;
                class266 var22 = this.field3407[var5];
                var22.field4488 += var16;
                var22.field4475 += var17;
                var22.field4486 += var18;
                var22.field4485++;
            } else if (var19 == 1) {
                if (this.field3418 == null) {
                    this.field3418 = new class43[this.field3445];
                }
                class43 var23 = this.field3418[var2] = new class43();
                var23.field524 = var16;
                var23.field523 = var17;
                var23.field528 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "()V", line = 216)
    public static void method1449() {
        field3420 = null;
        field3429 = null;
        field3422 = null;
        field3409 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([B)V", line = 224)
    private final void method1450(byte[] arg0) {
        class153 var2 = new class153(arg0);
        class153 var3 = new class153(arg0);
        class153 var4 = new class153(arg0);
        class153 var5 = new class153(arg0);
        class153 var6 = new class153(arg0);
        class153 var7 = new class153(arg0);
        class153 var8 = new class153(arg0);
        var2.field2367 = arg0.length - 23;
        int var9 = var2.method1069(43);
        int var10 = var2.method1069(69);
        int var11 = var2.method1042((byte) -22);
        int var12 = var2.method1042((byte) -72);
        int var13 = var2.method1042((byte) -45);
        int var14 = var2.method1042((byte) -64);
        int var15 = var2.method1042((byte) -97);
        int var16 = var2.method1042((byte) 84);
        int var17 = var2.method1042((byte) 109);
        int var18 = var2.method1069(53);
        int var19 = var2.method1069(117);
        int var20 = var2.method1069(43);
        int var21 = var2.method1069(117);
        int var22 = var2.method1069(126);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3433 = new byte[var11];
            var2.field2367 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field3433[var26] = var2.method1078(-6338);
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
        this.field3438 = var9;
        this.field3445 = var10;
        this.field3435 = var11;
        this.field3404 = new int[var9];
        this.field3421 = new int[var9];
        this.field3428 = new int[var9];
        this.field3434 = new int[var10];
        this.field3417 = new int[var10];
        this.field3430 = new int[var10];
        if (var17 == 1) {
            this.field3451 = new int[var9];
        }
        if (var12 == 1) {
            this.field3426 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3403 = new byte[var10];
        } else {
            this.field3443 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3444 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3412 = new int[var10];
        }
        if (var16 == 1) {
            this.field3410 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3437 = new byte[var10];
        }
        this.field3425 = new short[var10];
        if (var11 > 0) {
            this.field3446 = new short[var11];
            this.field3411 = new short[var11];
            this.field3406 = new short[var11];
            if (var24 > 0) {
                this.field3405 = new short[var24];
                this.field3432 = new short[var24];
                this.field3413 = new short[var24];
                this.field3441 = new byte[var24];
                this.field3436 = new byte[var24];
                this.field3416 = new byte[var24];
            }
            if (var25 > 0) {
                this.field3424 = new byte[var25];
                this.field3442 = new byte[var25];
            }
        }
        var2.field2367 = var11;
        var3.field2367 = var44;
        var4.field2367 = var46;
        var5.field2367 = var48;
        var6.field2367 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var67 = var2.method1042((byte) -37);
            int var68 = 0;
            if ((var67 & 0x1) != 0) {
                var68 = var3.method1065(0);
            }
            int var69 = 0;
            if ((var67 & 0x2) != 0) {
                var69 = var4.method1065(0);
            }
            int var70 = 0;
            if ((var67 & 0x4) != 0) {
                var70 = var5.method1065(0);
            }
            this.field3404[var66] = var63 + var68;
            this.field3421[var66] = var64 + var69;
            this.field3428[var66] = var65 + var70;
            var63 = this.field3404[var66];
            var64 = this.field3421[var66];
            var65 = this.field3428[var66];
            if (var17 == 1) {
                this.field3451[var66] = var6.method1042((byte) 95);
            }
        }
        var2.field2367 = var42;
        var3.field2367 = var31;
        var4.field2367 = var34;
        var5.field2367 = var37;
        var6.field2367 = var35;
        var7.field2367 = var40;
        var8.field2367 = var39;
        for (int var71 = 0; var71 < var10; var71++) {
            this.field3425[var71] = (short) var2.method1069(115);
            if (var12 == 1) {
                this.field3426[var71] = var3.method1078(-6338);
            }
            if (var13 == 255) {
                this.field3403[var71] = var4.method1078(-6338);
            }
            if (var14 == 1) {
                this.field3444[var71] = var5.method1078(-6338);
            }
            if (var15 == 1) {
                this.field3412[var71] = var6.method1042((byte) 110);
            }
            if (var16 == 1) {
                this.field3410[var71] = (short) (var7.method1069(66) - 1);
            }
            if (this.field3437 != null) {
                if (this.field3410[var71] == -1) {
                    this.field3437[var71] = -1;
                } else {
                    this.field3437[var71] = (byte) (var8.method1042((byte) -110) - 1);
                }
            }
        }
        var2.field2367 = var33;
        var3.field2367 = var30;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        for (int var76 = 0; var76 < var10; var76++) {
            int var77 = var3.method1042((byte) 82);
            if (var77 == 1) {
                var72 = var2.method1065(0) + var75;
                var73 = var2.method1065(0) + var72;
                var74 = var2.method1065(0) + var73;
                var75 = var74;
                this.field3434[var76] = var72;
                this.field3417[var76] = var73;
                this.field3430[var76] = var74;
            }
            if (var77 == 2) {
                var73 = var74;
                var74 = var2.method1065(0) + var75;
                var75 = var74;
                this.field3434[var76] = var72;
                this.field3417[var76] = var73;
                this.field3430[var76] = var74;
            }
            if (var77 == 3) {
                var72 = var74;
                var74 = var2.method1065(0) + var75;
                var75 = var74;
                this.field3434[var76] = var72;
                this.field3417[var76] = var73;
                this.field3430[var76] = var74;
            }
            if (var77 == 4) {
                int var80 = var72;
                var72 = var73;
                var73 = var80;
                var74 = var2.method1065(0) + var75;
                var75 = var74;
                this.field3434[var76] = var72;
                this.field3417[var76] = var80;
                this.field3430[var76] = var74;
            }
        }
        var2.field2367 = var50;
        var3.field2367 = var52;
        var4.field2367 = var54;
        var5.field2367 = var56;
        var6.field2367 = var58;
        var7.field2367 = var60;
        for (int var81 = 0; var81 < var11; var81++) {
            int var82 = this.field3433[var81] & 0xFF;
            if (var82 == 0) {
                this.field3446[var81] = (short) var2.method1069(83);
                this.field3411[var81] = (short) var2.method1069(41);
                this.field3406[var81] = (short) var2.method1069(64);
            }
            if (var82 == 1) {
                this.field3446[var81] = (short) var3.method1069(85);
                this.field3411[var81] = (short) var3.method1069(87);
                this.field3406[var81] = (short) var3.method1069(92);
                this.field3405[var81] = (short) var4.method1069(96);
                this.field3432[var81] = (short) var4.method1069(100);
                this.field3413[var81] = (short) var4.method1069(113);
                this.field3441[var81] = var5.method1078(-6338);
                this.field3436[var81] = var6.method1078(-6338);
                this.field3416[var81] = var7.method1078(-6338);
            }
            if (var82 == 2) {
                this.field3446[var81] = (short) var3.method1069(35);
                this.field3411[var81] = (short) var3.method1069(65);
                this.field3406[var81] = (short) var3.method1069(46);
                this.field3405[var81] = (short) var4.method1069(63);
                this.field3432[var81] = (short) var4.method1069(114);
                this.field3413[var81] = (short) var4.method1069(95);
                this.field3441[var81] = var5.method1078(-6338);
                this.field3436[var81] = var6.method1078(-6338);
                this.field3416[var81] = var7.method1078(-6338);
                this.field3424[var81] = var7.method1078(-6338);
                this.field3442[var81] = var7.method1078(-6338);
            }
            if (var82 == 3) {
                this.field3446[var81] = (short) var3.method1069(43);
                this.field3411[var81] = (short) var3.method1069(108);
                this.field3406[var81] = (short) var3.method1069(119);
                this.field3405[var81] = (short) var4.method1069(71);
                this.field3432[var81] = (short) var4.method1069(106);
                this.field3413[var81] = (short) var4.method1069(37);
                this.field3441[var81] = var5.method1078(-6338);
                this.field3436[var81] = var6.method1078(-6338);
                this.field3416[var81] = var7.method1078(-6338);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()Z", line = 651)
    public final boolean method670() {
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)I", line = 661)
    public final int method1451(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3438; var4++) {
            if (this.field3404[var4] == arg0 && this.field3421[var4] == arg1 && this.field3428[var4] == arg2) {
                return var4;
            }
        }
        this.field3404[this.field3438] = arg0;
        this.field3421[this.field3438] = arg1;
        this.field3428[this.field3438] = arg2;
        return this.field3438++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lf;IIIZ)V", line = 676)
    public final void method702(class231 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class208 var6 = (class208) arg0;
        var6.method1453();
        var6.method1448();
        field3450++;
        int var7 = 0;
        int[] var8 = var6.field3404;
        int var9 = var6.field3438;
        for (int var10 = 0; var10 < this.field3438; var10++) {
            class266 var11 = this.field3407[var10];
            if (var11.field4485 != 0) {
                int var12 = this.field3421[var10] - arg2;
                if (var12 >= var6.field3447 && var12 <= var6.field3423) {
                    int var13 = this.field3404[var10] - arg1;
                    if (var13 >= var6.field3408 && var13 <= var6.field3414) {
                        int var14 = this.field3428[var10] - arg3;
                        if (var14 >= var6.field3448 && var14 <= var6.field3440) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class266 var16 = var6.field3407[var15];
                                if (var8[var15] == var13 && var6.field3428[var15] == var14 && var6.field3421[var15] == var12 && var16.field4485 != 0) {
                                    if (this.field3419 == null) {
                                        this.field3419 = new class266[this.field3438];
                                    }
                                    if (var6.field3419 == null) {
                                        var6.field3419 = new class266[var9];
                                    }
                                    class266 var17 = this.field3419[var10];
                                    if (var17 == null) {
                                        var17 = this.field3419[var10] = new class266(var11);
                                    }
                                    class266 var18 = var6.field3419[var15];
                                    if (var18 == null) {
                                        var18 = var6.field3419[var15] = new class266(var16);
                                    }
                                    var17.field4488 += var16.field4488;
                                    var17.field4475 += var16.field4475;
                                    var17.field4486 += var16.field4486;
                                    var17.field4485 += var16.field4485;
                                    var18.field4488 += var11.field4488;
                                    var18.field4475 += var11.field4475;
                                    var18.field4486 += var11.field4486;
                                    var18.field4485 += var11.field4485;
                                    var7++;
                                    field3420[var10] = field3450;
                                    field3429[var15] = field3450;
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
        for (int var19 = 0; var19 < this.field3445; var19++) {
            if (field3420[this.field3434[var19]] == field3450 && field3420[this.field3417[var19]] == field3450 && field3420[this.field3430[var19]] == field3450) {
                if (this.field3426 == null) {
                    this.field3426 = new byte[this.field3445];
                }
                this.field3426[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field3445; var20++) {
            if (field3429[var6.field3434[var20]] == field3450 && field3429[var6.field3417[var20]] == field3450 && field3429[var6.field3430[var20]] == field3450) {
                if (var6.field3426 == null) {
                    var6.field3426 = new byte[var6.field3445];
                }
                var6.field3426[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(IIIII)Lcm;", line = 792)
    public final class246 method1452(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class246(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "()V", line = 808)
    private final void method1453() {
        if (this.field3427) {
            return;
        }
        this.field3427 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3438; var7++) {
            int var8 = this.field3404[var7];
            int var9 = this.field3421[var7];
            int var10 = this.field3428[var7];
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
        this.field3408 = (short) var1;
        this.field3414 = (short) var4;
        this.field3447 = (short) var2;
        this.field3423 = (short) var5;
        this.field3448 = (short) var3;
        this.field3440 = (short) var6;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIBSB)I", line = 864)
    public final int method1454(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3434[this.field3445] = arg0;
        this.field3417[this.field3445] = arg1;
        this.field3430[this.field3445] = arg2;
        this.field3426[this.field3445] = arg3;
        this.field3437[this.field3445] = -1;
        this.field3425[this.field3445] = arg4;
        this.field3410[this.field3445] = -1;
        this.field3444[this.field3445] = arg5;
        return this.field3445++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Lf;", line = 878)
    public final class231 method667(int arg0, int arg1, int arg2) {
        return this.method1446(this.field3449, this.field3415, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)V", line = 892)
    public final void method1455(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3422[arg2];
            int var5 = field3409[arg2];
            for (int var6 = 0; var6 < this.field3438; var6++) {
                int var7 = this.field3421[var6] * var4 + this.field3404[var6] * var5 >> 16;
                this.field3421[var6] = this.field3421[var6] * var5 - this.field3404[var6] * var4 >> 16;
                this.field3404[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3422[arg0];
            int var9 = field3409[arg0];
            for (int var10 = 0; var10 < this.field3438; var10++) {
                int var11 = this.field3421[var10] * var9 - this.field3428[var10] * var8 >> 16;
                this.field3428[var10] = this.field3428[var10] * var9 + this.field3421[var10] * var8 >> 16;
                this.field3421[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3422[arg1];
        int var13 = field3409[arg1];
        for (int var14 = 0; var14 < this.field3438; var14++) {
            int var15 = this.field3428[var14] * var12 + this.field3404[var14] * var13 >> 16;
            this.field3428[var14] = this.field3428[var14] * var13 - this.field3404[var14] * var12 >> 16;
            this.field3404[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "()V", line = 972)
    private final void method1456() {
        this.field3407 = null;
        this.field3419 = null;
        this.field3418 = null;
        this.field3427 = false;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(SS)V", line = 984)
    public final void method1457(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3445; var3++) {
            if (this.field3425[var3] == arg0) {
                this.field3425[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "([B)V", line = 996)
    private final void method1458(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class153 var4 = new class153(arg0);
        class153 var5 = new class153(arg0);
        class153 var6 = new class153(arg0);
        class153 var7 = new class153(arg0);
        class153 var8 = new class153(arg0);
        var4.field2367 = arg0.length - 18;
        int var9 = var4.method1069(29);
        int var10 = var4.method1069(29);
        int var11 = var4.method1042((byte) -59);
        int var12 = var4.method1042((byte) 112);
        int var13 = var4.method1042((byte) -108);
        int var14 = var4.method1042((byte) 108);
        int var15 = var4.method1042((byte) 127);
        int var16 = var4.method1042((byte) 85);
        int var17 = var4.method1069(65);
        int var18 = var4.method1069(41);
        int var19 = var4.method1069(99);
        int var20 = var4.method1069(77);
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
        this.field3438 = var9;
        this.field3445 = var10;
        this.field3435 = var11;
        this.field3404 = new int[var9];
        this.field3421 = new int[var9];
        this.field3428 = new int[var9];
        this.field3434 = new int[var10];
        this.field3417 = new int[var10];
        this.field3430 = new int[var10];
        if (var11 > 0) {
            this.field3433 = new byte[var11];
            this.field3446 = new short[var11];
            this.field3411 = new short[var11];
            this.field3406 = new short[var11];
        }
        if (var16 == 1) {
            this.field3451 = new int[var9];
        }
        if (var12 == 1) {
            this.field3426 = new byte[var10];
            this.field3437 = new byte[var10];
            this.field3410 = new short[var10];
        }
        if (var13 == 255) {
            this.field3403 = new byte[var10];
        } else {
            this.field3443 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3444 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3412 = new int[var10];
        }
        this.field3425 = new short[var10];
        var4.field2367 = var21;
        var5.field2367 = var36;
        var6.field2367 = var38;
        var7.field2367 = var40;
        var8.field2367 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method1042((byte) -47);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method1065(0);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method1065(0);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method1065(0);
            }
            this.field3404[var46] = var43 + var48;
            this.field3421[var46] = var44 + var49;
            this.field3428[var46] = var45 + var50;
            var43 = this.field3404[var46];
            var44 = this.field3421[var46];
            var45 = this.field3428[var46];
            if (var16 == 1) {
                this.field3451[var46] = var8.method1042((byte) -105);
            }
        }
        var4.field2367 = var32;
        var5.field2367 = var28;
        var6.field2367 = var26;
        var7.field2367 = var30;
        var8.field2367 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field3425[var51] = (short) var4.method1069(68);
            if (var12 == 1) {
                int var52 = var5.method1042((byte) -62);
                if ((var52 & 0x1) == 1) {
                    this.field3426[var51] = 1;
                    var2 = true;
                } else {
                    this.field3426[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field3437[var51] = (byte) (var52 >> 2);
                    this.field3410[var51] = this.field3425[var51];
                    this.field3425[var51] = 127;
                    if (this.field3410[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3437[var51] = -1;
                    this.field3410[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field3403[var51] = var6.method1078(-6338);
            }
            if (var14 == 1) {
                this.field3444[var51] = var7.method1078(-6338);
            }
            if (var15 == 1) {
                this.field3412[var51] = var8.method1042((byte) 97);
            }
        }
        var4.field2367 = var25;
        var5.field2367 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method1042((byte) -119);
            if (var58 == 1) {
                var53 = var4.method1065(0) + var56;
                var54 = var4.method1065(0) + var53;
                var55 = var4.method1065(0) + var54;
                var56 = var55;
                this.field3434[var57] = var53;
                this.field3417[var57] = var54;
                this.field3430[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method1065(0) + var56;
                var56 = var55;
                this.field3434[var57] = var53;
                this.field3417[var57] = var54;
                this.field3430[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method1065(0) + var56;
                var56 = var55;
                this.field3434[var57] = var53;
                this.field3417[var57] = var54;
                this.field3430[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method1065(0) + var56;
                var56 = var55;
                this.field3434[var57] = var53;
                this.field3417[var57] = var61;
                this.field3430[var57] = var55;
            }
        }
        var4.field2367 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field3433[var62] = 0;
            this.field3446[var62] = (short) var4.method1069(125);
            this.field3411[var62] = (short) var4.method1069(119);
            this.field3406[var62] = (short) var4.method1069(67);
        }
        if (this.field3437 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field3437[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field3446[var65] & 0xFFFF) == this.field3434[var64] && (this.field3411[var65] & 0xFFFF) == this.field3417[var64] && (this.field3406[var65] & 0xFFFF) == this.field3430[var64]) {
                        this.field3437[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field3437 = null;
            }
        }
        if (!var3) {
            this.field3410 = null;
        }
        if (!var2) {
            this.field3426 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 1453)
    private class208() {
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([B)V", line = 1455)
    private class208(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1450(arg0);
        } else {
            this.method1458(arg0);
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(III)V", line = 1462)
    public class208(int arg0, int arg1, int arg2) {
        this.field3404 = new int[arg0];
        this.field3421 = new int[arg0];
        this.field3428 = new int[arg0];
        this.field3451 = new int[arg0];
        this.field3434 = new int[arg1];
        this.field3417 = new int[arg1];
        this.field3430 = new int[arg1];
        this.field3426 = new byte[arg1];
        this.field3403 = new byte[arg1];
        this.field3444 = new byte[arg1];
        this.field3425 = new short[arg1];
        this.field3410 = new short[arg1];
        this.field3437 = new byte[arg1];
        this.field3412 = new int[arg1];
        if (arg2 > 0) {
            this.field3433 = new byte[arg2];
            this.field3446 = new short[arg2];
            this.field3411 = new short[arg2];
            this.field3406 = new short[arg2];
            this.field3405 = new short[arg2];
            this.field3432 = new short[arg2];
            this.field3413 = new short[arg2];
            this.field3441 = new byte[arg2];
            this.field3436 = new byte[arg2];
            this.field3416 = new byte[arg2];
            this.field3424 = new byte[arg2];
            this.field3442 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([Lke;I)V", line = 1494)
    public class208(class208[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3438 = 0;
        this.field3445 = 0;
        this.field3435 = 0;
        this.field3443 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class208 var10 = arg0[var9];
            if (var10 != null) {
                this.field3438 += var10.field3438;
                this.field3445 += var10.field3445;
                this.field3435 += var10.field3435;
                if (var10.field3403 == null) {
                    if (this.field3443 == -1) {
                        this.field3443 = var10.field3443;
                    }
                    if (this.field3443 != var10.field3443) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field3426 != null;
                var5 |= var10.field3444 != null;
                var6 |= var10.field3412 != null;
                var7 |= var10.field3410 != null;
                var8 |= var10.field3437 != null;
            }
        }
        this.field3404 = new int[this.field3438];
        this.field3421 = new int[this.field3438];
        this.field3428 = new int[this.field3438];
        this.field3451 = new int[this.field3438];
        this.field3434 = new int[this.field3445];
        this.field3417 = new int[this.field3445];
        this.field3430 = new int[this.field3445];
        if (var3) {
            this.field3426 = new byte[this.field3445];
        }
        if (var4) {
            this.field3403 = new byte[this.field3445];
        }
        if (var5) {
            this.field3444 = new byte[this.field3445];
        }
        if (var6) {
            this.field3412 = new int[this.field3445];
        }
        if (var7) {
            this.field3410 = new short[this.field3445];
        }
        if (var8) {
            this.field3437 = new byte[this.field3445];
        }
        this.field3425 = new short[this.field3445];
        if (this.field3435 > 0) {
            this.field3433 = new byte[this.field3435];
            this.field3446 = new short[this.field3435];
            this.field3411 = new short[this.field3435];
            this.field3406 = new short[this.field3435];
            this.field3405 = new short[this.field3435];
            this.field3432 = new short[this.field3435];
            this.field3413 = new short[this.field3435];
            this.field3441 = new byte[this.field3435];
            this.field3436 = new byte[this.field3435];
            this.field3416 = new byte[this.field3435];
            this.field3424 = new byte[this.field3435];
            this.field3442 = new byte[this.field3435];
        }
        this.field3438 = 0;
        this.field3445 = 0;
        this.field3435 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class208 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field3445; var13++) {
                    if (var3 && var12.field3426 != null) {
                        this.field3426[this.field3445] = var12.field3426[var13];
                    }
                    if (var4) {
                        if (var12.field3403 == null) {
                            this.field3403[this.field3445] = var12.field3443;
                        } else {
                            this.field3403[this.field3445] = var12.field3403[var13];
                        }
                    }
                    if (var5 && var12.field3444 != null) {
                        this.field3444[this.field3445] = var12.field3444[var13];
                    }
                    if (var6 && var12.field3412 != null) {
                        this.field3412[this.field3445] = var12.field3412[var13];
                    }
                    if (var7) {
                        if (var12.field3410 == null) {
                            this.field3410[this.field3445] = -1;
                        } else {
                            this.field3410[this.field3445] = var12.field3410[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field3437 == null || var12.field3437[var13] == -1) {
                            this.field3437[this.field3445] = -1;
                        } else {
                            this.field3437[this.field3445] = (byte) (var12.field3437[var13] + this.field3435);
                        }
                    }
                    this.field3425[this.field3445] = var12.field3425[var13];
                    this.field3434[this.field3445] = this.method1461(var12, var12.field3434[var13]);
                    this.field3417[this.field3445] = this.method1461(var12, var12.field3417[var13]);
                    this.field3430[this.field3445] = this.method1461(var12, var12.field3430[var13]);
                    this.field3445++;
                }
                for (int var14 = 0; var14 < var12.field3435; var14++) {
                    byte var15 = this.field3433[this.field3435] = var12.field3433[var14];
                    if (var15 == 0) {
                        this.field3446[this.field3435] = (short) this.method1461(var12, var12.field3446[var14]);
                        this.field3411[this.field3435] = (short) this.method1461(var12, var12.field3411[var14]);
                        this.field3406[this.field3435] = (short) this.method1461(var12, var12.field3406[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field3446[this.field3435] = var12.field3446[var14];
                        this.field3411[this.field3435] = var12.field3411[var14];
                        this.field3406[this.field3435] = var12.field3406[var14];
                        this.field3405[this.field3435] = var12.field3405[var14];
                        this.field3432[this.field3435] = var12.field3432[var14];
                        this.field3413[this.field3435] = var12.field3413[var14];
                        this.field3441[this.field3435] = var12.field3441[var14];
                        this.field3436[this.field3435] = var12.field3436[var14];
                        this.field3416[this.field3435] = var12.field3416[var14];
                    }
                    if (var15 == 2) {
                        this.field3424[this.field3435] = var12.field3424[var14];
                        this.field3442[this.field3435] = var12.field3442[var14];
                    }
                    this.field3435++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(SS)V", line = 1359)
    public final void method1459(short arg0, short arg1) {
        if (this.field3410 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3445; var3++) {
            if (this.field3410[var3] == arg0) {
                this.field3410[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(III)V", line = 1378)
    public final void method1460(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3438; var4++) {
            this.field3404[var4] += arg0;
            this.field3421[var4] += arg1;
            this.field3428[var4] += arg2;
        }
        this.method1456();
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lke;I)I", line = 1391)
    private final int method1461(class208 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3404[arg1];
        int var5 = arg0.field3421[arg1];
        int var6 = arg0.field3428[arg1];
        for (int var7 = 0; var7 < this.field3438; var7++) {
            if (this.field3404[var7] == var4 && this.field3421[var7] == var5 && this.field3428[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3404[this.field3438] = var4;
            this.field3421[this.field3438] = var5;
            this.field3428[this.field3438] = var6;
            if (arg0.field3451 != null) {
                this.field3451[this.field3438] = arg0.field3451[arg1];
            }
            var3 = this.field3438++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()I", line = 1427)
    public final int method116() {
        if (!this.field3427) {
            this.method1453();
        }
        return this.field3447;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ldk;II)Lke;", line = 1434)
    public static final class208 method1462(class241 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1647(arg1, (byte) 122, arg2);
        return var3 == null ? null : new class208(var3);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIIJ)V", line = 1443)
    public final void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }
}
