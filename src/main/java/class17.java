import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 extends class89 {

    @OriginalMember(owner = "client!cb", name = "mb", descriptor = "I")
    private int field426 = 0;

    @OriginalMember(owner = "client!cb", name = "yb", descriptor = "B")
    private byte field438 = 0;

    @OriginalMember(owner = "client!cb", name = "zb", descriptor = "Z")
    private boolean field439 = false;

    @OriginalMember(owner = "client!cb", name = "Sb", descriptor = "I")
    private int field458 = 0;

    @OriginalMember(owner = "client!cb", name = "Hb", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!cb", name = "Mb", descriptor = "[I")
    private int[] field452;

    @OriginalMember(owner = "client!cb", name = "Gb", descriptor = "[I")
    private int[] field446;

    @OriginalMember(owner = "client!cb", name = "ob", descriptor = "[I")
    private int[] field428;

    @OriginalMember(owner = "client!cb", name = "kb", descriptor = "[I")
    private int[] field424;

    @OriginalMember(owner = "client!cb", name = "Ob", descriptor = "[I")
    private int[] field454;

    @OriginalMember(owner = "client!cb", name = "Fb", descriptor = "[I")
    private int[] field445;

    @OriginalMember(owner = "client!cb", name = "xb", descriptor = "[I")
    private int[] field437;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "[B")
    private byte[] field421;

    @OriginalMember(owner = "client!cb", name = "wb", descriptor = "[B")
    private byte[] field436;

    @OriginalMember(owner = "client!cb", name = "nb", descriptor = "[B")
    private byte[] field427;

    @OriginalMember(owner = "client!cb", name = "Nb", descriptor = "[I")
    private int[] field453;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "[S")
    private short[] field413;

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "[B")
    private byte[] field422;

    @OriginalMember(owner = "client!cb", name = "lb", descriptor = "[S")
    private short[] field425;

    @OriginalMember(owner = "client!cb", name = "pb", descriptor = "[B")
    private byte[] field429;

    @OriginalMember(owner = "client!cb", name = "Pb", descriptor = "[S")
    private short[] field455;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "[S")
    private short[] field415;

    @OriginalMember(owner = "client!cb", name = "jb", descriptor = "[S")
    private short[] field423;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "[S")
    private short[] field417;

    @OriginalMember(owner = "client!cb", name = "Eb", descriptor = "[S")
    private short[] field444;

    @OriginalMember(owner = "client!cb", name = "sb", descriptor = "[S")
    private short[] field432;

    @OriginalMember(owner = "client!cb", name = "qb", descriptor = "[S")
    private short[] field430;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "[B")
    private byte[] field420;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "[S")
    private short[] field416;

    @OriginalMember(owner = "client!cb", name = "Tb", descriptor = "[S")
    private short[] field459;

    @OriginalMember(owner = "client!cb", name = "Jb", descriptor = "[[I")
    private int[][] field449;

    @OriginalMember(owner = "client!cb", name = "tb", descriptor = "[[I")
    private int[][] field433;

    @OriginalMember(owner = "client!cb", name = "Kb", descriptor = "[Lsf;")
    private class131[] field450;

    @OriginalMember(owner = "client!cb", name = "Rb", descriptor = "[Lja;")
    private class63[] field457;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "[Lsf;")
    private class131[] field419;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "S")
    public short field418;

    @OriginalMember(owner = "client!cb", name = "Ab", descriptor = "S")
    public short field440;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "[I")
    private static int[] field414 = new int[10000];

    @OriginalMember(owner = "client!cb", name = "Db", descriptor = "[I")
    private static int[] field443 = class58.field1346;

    @OriginalMember(owner = "client!cb", name = "Cb", descriptor = "I")
    private static int field442 = 0;

    @OriginalMember(owner = "client!cb", name = "ub", descriptor = "[I")
    private static int[] field434 = new int[10000];

    @OriginalMember(owner = "client!cb", name = "Qb", descriptor = "[I")
    private static int[] field456 = class58.field1354;

    @OriginalMember(owner = "client!cb", name = "rb", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!cb", name = "vb", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!cb", name = "Bb", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!cb", name = "Ib", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!cb", name = "Lb", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
    private final void method146() {
        int var10002;
        if (this.field424 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field458; ++var3) {
                int var7 = this.field424[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field449 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field449[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field458) {
                int var6 = this.field424[var5];
                this.field449[var6][var1[var6]++] = var5++;
            }
            this.field424 = null;
        }
        if (this.field453 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field426; ++var10) {
                int var14 = this.field453[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field433 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field433[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field426) {
                int var13 = this.field453[var12];
                this.field433[var13][var8[var13]++] = var12++;
            }
            this.field453 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
    public final void method147() {
        for (int var1 = 0; var1 < this.field458; ++var1) {
            int var2 = this.field428[var1];
            this.field428[var1] = this.field452[var1];
            this.field452[var1] = -var2;
        }
        this.method156();
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()V")
    private final void method148() {
        if (!this.field439) {
            super.field2145 = 0;
            this.field435 = 0;
            this.field431 = 999999;
            this.field448 = -999999;
            this.field441 = -99999;
            this.field451 = 99999;
            for (int var1 = 0; var1 < this.field458; ++var1) {
                int var2 = this.field452[var1];
                int var3 = this.field446[var1];
                int var4 = this.field428[var1];
                if (var2 < this.field431) {
                    this.field431 = var2;
                }
                if (var2 > this.field448) {
                    this.field448 = var2;
                }
                if (var4 < this.field451) {
                    this.field451 = var4;
                }
                if (var4 > this.field441) {
                    this.field441 = var4;
                }
                if (-var3 > super.field2145) {
                    super.field2145 = -var3;
                }
                if (var3 > this.field435) {
                    this.field435 = var3;
                }
            }
            this.field439 = true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
    public final void method149(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field458; ++var4) {
            this.field452[var4] = this.field452[var4] * arg0 / 128;
            this.field446[var4] = this.field446[var4] * arg1 / 128;
            this.field428[var4] = this.field428[var4] * arg2 / 128;
        }
        this.method156();
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()V")
    public final void method150() {
        for (int var1 = 0; var1 < this.field458; ++var1) {
            this.field428[var1] = -this.field428[var1];
        }
        for (int var2 = 0; var2 < this.field426; ++var2) {
            int var3 = this.field454[var2];
            this.field454[var2] = this.field437[var2];
            this.field437[var2] = var3;
        }
        this.method156();
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "()V")
    public final void method151() {
        if (this.field450 == null) {
            this.field450 = new class131[this.field458];
            for (int var1 = 0; var1 < this.field458; ++var1) {
                this.field450[var1] = new class131();
            }
            for (int var2 = 0; var2 < this.field426; ++var2) {
                int var3 = this.field454[var2];
                int var4 = this.field445[var2];
                int var5 = this.field437[var2];
                int var6 = this.field452[var4] - this.field452[var3];
                int var7 = this.field446[var4] - this.field446[var3];
                int var8 = this.field428[var4] - this.field428[var3];
                int var9 = this.field452[var5] - this.field452[var3];
                int var10 = this.field446[var5] - this.field446[var3];
                int var11 = this.field428[var5] - this.field428[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field421 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field421[var2];
                }
                if (var19 == 0) {
                    class131 var20 = this.field450[var3];
                    var20.field2989 += var16;
                    var20.field2985 += var17;
                    var20.field2984 += var18;
                    ++var20.field2992;
                    class131 var21 = this.field450[var4];
                    var21.field2989 += var16;
                    var21.field2985 += var17;
                    var21.field2984 += var18;
                    ++var21.field2992;
                    class131 var22 = this.field450[var5];
                    var22.field2989 += var16;
                    var22.field2985 += var17;
                    var22.field2984 += var18;
                    ++var22.field2992;
                } else if (var19 == 1) {
                    if (this.field457 == null) {
                        this.field457 = new class63[this.field426];
                    }
                    class63 var23 = this.field457[var2] = new class63();
                    var23.field1451 = var16;
                    var23.field1450 = var17;
                    var23.field1445 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)I")
    private static final int method152(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([B)V")
    private final void method153(byte[] arg0) {
        class105 var2 = new class105(arg0);
        class105 var3 = new class105(arg0);
        class105 var4 = new class105(arg0);
        class105 var5 = new class105(arg0);
        class105 var6 = new class105(arg0);
        class105 var7 = new class105(arg0);
        class105 var8 = new class105(arg0);
        var2.field2404 = arg0.length - 23;
        int var9 = var2.method838((byte) 5);
        int var10 = var2.method838((byte) 5);
        int var11 = var2.method831((byte) 76);
        int var12 = var2.method831((byte) 76);
        int var13 = var2.method831((byte) 76);
        int var14 = var2.method831((byte) 76);
        int var15 = var2.method831((byte) 76);
        int var16 = var2.method831((byte) 76);
        int var17 = var2.method831((byte) 76);
        int var18 = var2.method838((byte) 5);
        int var19 = var2.method838((byte) 5);
        int var20 = var2.method838((byte) 5);
        int var21 = var2.method838((byte) 5);
        int var22 = var2.method838((byte) 5);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field429 = new byte[var11];
            var2.field2404 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field429[var26] = var2.method807(false);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
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
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field458 = var9;
        this.field426 = var10;
        this.field447 = var11;
        this.field452 = new int[var9];
        this.field446 = new int[var9];
        this.field428 = new int[var9];
        this.field454 = new int[var10];
        this.field445 = new int[var10];
        this.field437 = new int[var10];
        if (var17 == 1) {
            this.field424 = new int[var9];
        }
        if (var12 == 1) {
            this.field421 = new byte[var10];
        }
        if (var13 == 255) {
            this.field436 = new byte[var10];
        } else {
            this.field438 = (byte) var13;
        }
        if (var14 == 1) {
            this.field427 = new byte[var10];
        }
        if (var15 == 1) {
            this.field453 = new int[var10];
        }
        if (var16 == 1) {
            this.field413 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field422 = new byte[var10];
        }
        this.field425 = new short[var10];
        if (var11 > 0) {
            this.field455 = new short[var11];
            this.field415 = new short[var11];
            this.field423 = new short[var11];
            if (var24 > 0) {
                this.field417 = new short[var24];
                this.field444 = new short[var24];
                this.field432 = new short[var24];
                this.field430 = new short[var24];
                this.field420 = new byte[var24];
                this.field416 = new short[var24];
            }
            if (var25 > 0) {
                this.field459 = new short[var25];
            }
        }
        var2.field2404 = var11;
        var3.field2404 = var44;
        var4.field2404 = var46;
        var5.field2404 = var48;
        var6.field2404 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method831((byte) 76);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method788(-64);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method788(-64);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method788(-64);
            }
            this.field452[var67] = var64 + var82;
            this.field446[var67] = var65 + var83;
            this.field428[var67] = var66 + var84;
            var64 = this.field452[var67];
            var65 = this.field446[var67];
            var66 = this.field428[var67];
            if (var17 == 1) {
                this.field424[var67] = var6.method831((byte) 76);
            }
        }
        var2.field2404 = var42;
        var3.field2404 = var31;
        var4.field2404 = var34;
        var5.field2404 = var37;
        var6.field2404 = var35;
        var7.field2404 = var40;
        var8.field2404 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field425[var68] = (short) var2.method838((byte) 5);
            if (var12 == 1) {
                this.field421[var68] = var3.method807(false);
            }
            if (var13 == 255) {
                this.field436[var68] = var4.method807(false);
            }
            if (var14 == 1) {
                this.field427[var68] = var5.method807(false);
            }
            if (var15 == 1) {
                this.field453[var68] = var6.method831((byte) 76);
            }
            if (var16 == 1) {
                this.field413[var68] = (short) (var7.method838((byte) 5) - 1);
            }
            if (this.field422 != null) {
                if (this.field413[var68] != -1) {
                    this.field422[var68] = (byte) (var8.method831((byte) 76) - 1);
                } else {
                    this.field422[var68] = -1;
                }
            }
        }
        var2.field2404 = var33;
        var3.field2404 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method831((byte) 76);
            if (var77 == 1) {
                var69 = var2.method788(-64) + var72;
                var70 = var2.method788(-64) + var69;
                var71 = var2.method788(-64) + var70;
                var72 = var71;
                this.field454[var73] = var69;
                this.field445[var73] = var70;
                this.field437[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method788(-64) + var72;
                var72 = var71;
                this.field454[var73] = var69;
                this.field445[var73] = var70;
                this.field437[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method788(-64) + var72;
                var72 = var71;
                this.field454[var73] = var69;
                this.field445[var73] = var70;
                this.field437[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method788(-64) + var72;
                var72 = var71;
                this.field454[var73] = var69;
                this.field445[var73] = var80;
                this.field437[var73] = var71;
            }
        }
        var2.field2404 = var50;
        var3.field2404 = var52;
        var4.field2404 = var54;
        var5.field2404 = var56;
        var6.field2404 = var58;
        var7.field2404 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field429[var74] & 255;
            if (var76 == 0) {
                this.field455[var74] = (short) var2.method838((byte) 5);
                this.field415[var74] = (short) var2.method838((byte) 5);
                this.field423[var74] = (short) var2.method838((byte) 5);
            }
            if (var76 == 1) {
                this.field455[var74] = (short) var3.method838((byte) 5);
                this.field415[var74] = (short) var3.method838((byte) 5);
                this.field423[var74] = (short) var3.method838((byte) 5);
                this.field417[var74] = (short) var4.method838((byte) 5);
                this.field444[var74] = (short) var4.method838((byte) 5);
                this.field432[var74] = (short) var4.method838((byte) 5);
                this.field430[var74] = (short) var5.method838((byte) 5);
                this.field420[var74] = var6.method807(false);
                this.field416[var74] = (short) var7.method838((byte) 5);
            }
            if (var76 == 2) {
                this.field455[var74] = (short) var3.method838((byte) 5);
                this.field415[var74] = (short) var3.method838((byte) 5);
                this.field423[var74] = (short) var3.method838((byte) 5);
                this.field417[var74] = (short) var4.method838((byte) 5);
                this.field444[var74] = (short) var4.method838((byte) 5);
                this.field432[var74] = (short) var4.method838((byte) 5);
                this.field430[var74] = (short) var5.method838((byte) 5);
                this.field420[var74] = var6.method807(false);
                this.field416[var74] = (short) var7.method838((byte) 5);
                this.field459[var74] = (short) var7.method838((byte) 5);
            }
            if (var76 == 3) {
                this.field455[var74] = (short) var3.method838((byte) 5);
                this.field415[var74] = (short) var3.method838((byte) 5);
                this.field423[var74] = (short) var3.method838((byte) 5);
                this.field417[var74] = (short) var4.method838((byte) 5);
                this.field444[var74] = (short) var4.method838((byte) 5);
                this.field432[var74] = (short) var4.method838((byte) 5);
                this.field430[var74] = (short) var5.method838((byte) 5);
                this.field420[var74] = var6.method807(false);
                this.field416[var74] = (short) var7.method838((byte) 5);
            }
        }
        var2.field2404 = var62;
        int var75 = var2.method831((byte) 76);
        if (var75 != 0) {
            new class151();
            var2.method838((byte) 5);
            var2.method838((byte) 5);
            var2.method838((byte) 5);
            var2.method821((byte) 96);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
    public final void method154(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field458; ++var4) {
            this.field452[var4] += arg0;
            this.field446[var4] += arg1;
            this.field428[var4] += arg2;
        }
        this.method156();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(SS)V")
    public final void method155(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field426; ++var3) {
            if (this.field425[var3] == arg0) {
                this.field425[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "()V")
    private final void method156() {
        this.field450 = null;
        this.field419 = null;
        this.field457 = null;
        this.field439 = false;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lcb;Lcb;IIIZ)V")
    public static final void method157(class17 arg0, class17 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method148();
        arg0.method151();
        arg1.method148();
        arg1.method151();
        ++field442;
        int var6 = 0;
        int[] var7 = arg1.field452;
        int var8 = arg1.field458;
        for (int var9 = 0; var9 < arg0.field458; ++var9) {
            class131 var12 = arg0.field450[var9];
            if (var12.field2992 != 0) {
                int var13 = arg0.field446[var9] - arg3;
                if (var13 <= arg1.field435) {
                    int var14 = arg0.field452[var9] - arg2;
                    if (var14 >= arg1.field431 && var14 <= arg1.field448) {
                        int var15 = arg0.field428[var9] - arg4;
                        if (var15 >= arg1.field451 && var15 <= arg1.field441) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class131 var17 = arg1.field450[var16];
                                if (var7[var16] == var14 && arg1.field428[var16] == var15 && arg1.field446[var16] == var13 && var17.field2992 != 0) {
                                    if (arg0.field419 == null) {
                                        arg0.field419 = new class131[arg0.field458];
                                    }
                                    if (arg1.field419 == null) {
                                        arg1.field419 = new class131[var8];
                                    }
                                    class131 var18 = arg0.field419[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field419[var9] = new class131(var12);
                                    }
                                    class131 var19 = arg1.field419[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field419[var16] = new class131(var17);
                                    }
                                    var18.field2989 += var17.field2989;
                                    var18.field2985 += var17.field2985;
                                    var18.field2984 += var17.field2984;
                                    var18.field2992 += var17.field2992;
                                    var19.field2989 += var12.field2989;
                                    var19.field2985 += var12.field2985;
                                    var19.field2984 += var12.field2984;
                                    var19.field2992 += var12.field2992;
                                    ++var6;
                                    field414[var9] = field442;
                                    field434[var16] = field442;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field426; ++var10) {
                if (field414[arg0.field454[var10]] == field442 && field414[arg0.field445[var10]] == field442 && field414[arg0.field437[var10]] == field442) {
                    if (arg0.field421 == null) {
                        arg0.field421 = new byte[arg0.field426];
                    }
                    arg0.field421[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field426; ++var11) {
                if (field434[arg1.field454[var11]] == field442 && field434[arg1.field445[var11]] == field442 && field434[arg1.field437[var11]] == field442) {
                    if (arg1.field421 == null) {
                        arg1.field421 = new byte[arg1.field426];
                    }
                    arg1.field421[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "()V")
    public final void method158() {
        for (int var1 = 0; var1 < this.field458; ++var1) {
            this.field452[var1] = -this.field452[var1];
            this.field428[var1] = -this.field428[var1];
        }
        this.method156();
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "()V")
    public final void method159() {
        for (int var1 = 0; var1 < this.field458; ++var1) {
            int var2 = this.field452[var1];
            this.field452[var1] = this.field428[var1];
            this.field428[var1] = -var2;
        }
        this.method156();
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "([B)V")
    private final void method160(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class105 var4 = new class105(arg0);
        class105 var5 = new class105(arg0);
        class105 var6 = new class105(arg0);
        class105 var7 = new class105(arg0);
        class105 var8 = new class105(arg0);
        var4.field2404 = arg0.length - 18;
        int var9 = var4.method838((byte) 5);
        int var10 = var4.method838((byte) 5);
        int var11 = var4.method831((byte) 76);
        int var12 = var4.method831((byte) 76);
        int var13 = var4.method831((byte) 76);
        int var14 = var4.method831((byte) 76);
        int var15 = var4.method831((byte) 76);
        int var16 = var4.method831((byte) 76);
        int var17 = var4.method838((byte) 5);
        int var18 = var4.method838((byte) 5);
        int var19 = var4.method838((byte) 5);
        int var20 = var4.method838((byte) 5);
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
        this.field458 = var9;
        this.field426 = var10;
        this.field447 = var11;
        this.field452 = new int[var9];
        this.field446 = new int[var9];
        this.field428 = new int[var9];
        this.field454 = new int[var10];
        this.field445 = new int[var10];
        this.field437 = new int[var10];
        if (var11 > 0) {
            this.field429 = new byte[var11];
            this.field455 = new short[var11];
            this.field415 = new short[var11];
            this.field423 = new short[var11];
        }
        if (var16 == 1) {
            this.field424 = new int[var9];
        }
        if (var12 == 1) {
            this.field421 = new byte[var10];
            this.field422 = new byte[var10];
            this.field413 = new short[var10];
        }
        if (var13 == 255) {
            this.field436 = new byte[var10];
        } else {
            this.field438 = (byte) var13;
        }
        if (var14 == 1) {
            this.field427 = new byte[var10];
        }
        if (var15 == 1) {
            this.field453 = new int[var10];
        }
        this.field425 = new short[var10];
        var4.field2404 = var21;
        var5.field2404 = var36;
        var6.field2404 = var38;
        var7.field2404 = var40;
        var8.field2404 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method831((byte) 76);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method788(-64);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method788(-64);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method788(-64);
            }
            this.field452[var46] = var43 + var63;
            this.field446[var46] = var44 + var64;
            this.field428[var46] = var45 + var65;
            var43 = this.field452[var46];
            var44 = this.field446[var46];
            var45 = this.field428[var46];
            if (var16 == 1) {
                this.field424[var46] = var8.method831((byte) 76);
            }
        }
        var4.field2404 = var32;
        var5.field2404 = var28;
        var6.field2404 = var26;
        var7.field2404 = var30;
        var8.field2404 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field425[var47] = (short) var4.method838((byte) 5);
            if (var12 == 1) {
                int var61 = var5.method831((byte) 76);
                if ((var61 & 1) == 1) {
                    this.field421[var47] = 1;
                    var2 = true;
                } else {
                    this.field421[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field422[var47] = (byte) (var61 >> 2);
                    this.field413[var47] = this.field425[var47];
                    this.field425[var47] = 127;
                    if (this.field413[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field422[var47] = -1;
                    this.field413[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field436[var47] = var6.method807(false);
            }
            if (var14 == 1) {
                this.field427[var47] = var7.method807(false);
            }
            if (var15 == 1) {
                this.field453[var47] = var8.method831((byte) 76);
            }
        }
        var4.field2404 = var25;
        var5.field2404 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method831((byte) 76);
            if (var57 == 1) {
                var48 = var4.method788(-64) + var51;
                var49 = var4.method788(-64) + var48;
                var50 = var4.method788(-64) + var49;
                var51 = var50;
                this.field454[var52] = var48;
                this.field445[var52] = var49;
                this.field437[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method788(-64) + var51;
                var51 = var50;
                this.field454[var52] = var48;
                this.field445[var52] = var49;
                this.field437[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method788(-64) + var51;
                var51 = var50;
                this.field454[var52] = var48;
                this.field445[var52] = var49;
                this.field437[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method788(-64) + var51;
                var51 = var50;
                this.field454[var52] = var48;
                this.field445[var52] = var60;
                this.field437[var52] = var50;
            }
        }
        var4.field2404 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field429[var53] = 0;
            this.field455[var53] = (short) var4.method838((byte) 5);
            this.field415[var53] = (short) var4.method838((byte) 5);
            this.field423[var53] = (short) var4.method838((byte) 5);
        }
        if (this.field422 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field422[var55] & 255;
                if (var56 != 255) {
                    if ((this.field455[var56] & 65535) == this.field454[var55] && (this.field415[var56] & 65535) == this.field445[var55] && (this.field423[var56] & 65535) == this.field437[var55]) {
                        this.field422[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field422 = null;
            }
        }
        if (!var3) {
            this.field413 = null;
        }
        if (!var2) {
            this.field421 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lcb;I)I")
    private final int method161(class17 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field452[arg1];
        int var5 = arg0.field446[arg1];
        int var6 = arg0.field428[arg1];
        for (int var7 = 0; var7 < this.field458; ++var7) {
            if (this.field452[var7] == var4 && this.field446[var7] == var5 && this.field428[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field452[this.field458] = var4;
            this.field446[this.field458] = var5;
            this.field428[this.field458] = var6;
            if (arg0.field424 != null) {
                this.field424[this.field458] = arg0.field424[arg1];
            }
            var3 = this.field458++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([[IIIIZI)Lcb;")
    public final class17 method162(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method148();
        int var7 = this.field431 + arg1;
        int var8 = this.field448 + arg1;
        int var9 = this.field451 + arg3;
        int var10 = this.field441 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class17 var15;
                if (arg4) {
                    var15 = new class17();
                    var15.field458 = this.field458;
                    var15.field426 = this.field426;
                    var15.field447 = this.field447;
                    var15.field452 = this.field452;
                    var15.field428 = this.field428;
                    var15.field454 = this.field454;
                    var15.field445 = this.field445;
                    var15.field437 = this.field437;
                    var15.field421 = this.field421;
                    var15.field436 = this.field436;
                    var15.field427 = this.field427;
                    var15.field422 = this.field422;
                    var15.field425 = this.field425;
                    var15.field413 = this.field413;
                    var15.field438 = this.field438;
                    var15.field429 = this.field429;
                    var15.field455 = this.field455;
                    var15.field415 = this.field415;
                    var15.field423 = this.field423;
                    var15.field417 = this.field417;
                    var15.field444 = this.field444;
                    var15.field432 = this.field432;
                    var15.field430 = this.field430;
                    var15.field420 = this.field420;
                    var15.field416 = this.field416;
                    var15.field459 = this.field459;
                    var15.field424 = this.field424;
                    var15.field453 = this.field453;
                    var15.field449 = this.field449;
                    var15.field433 = this.field433;
                    var15.field418 = this.field418;
                    var15.field440 = this.field440;
                    var15.field446 = new int[var15.field458];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field458; ++var16) {
                        int var17 = this.field452[var16] + arg1;
                        int var18 = this.field428[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field446[var16] = this.field446[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field458; ++var26) {
                        int var27 = (-this.field446[var26] << 16) / super.field2145;
                        if (var27 < arg5) {
                            int var28 = this.field452[var26] + arg1;
                            int var29 = this.field428[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field446[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field446[var26];
                        }
                    }
                }
                var15.method156();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "()V")
    public static void method163() {
        field414 = null;
        field434 = null;
        field456 = null;
        field443 = null;
    }

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "()Lcb;")
    public final class17 method164() {
        class17 var1 = new class17();
        if (this.field421 != null) {
            var1.field421 = new byte[this.field426];
            for (int var2 = 0; var2 < this.field426; ++var2) {
                var1.field421[var2] = this.field421[var2];
            }
        }
        var1.field458 = this.field458;
        var1.field426 = this.field426;
        var1.field447 = this.field447;
        var1.field452 = this.field452;
        var1.field446 = this.field446;
        var1.field428 = this.field428;
        var1.field454 = this.field454;
        var1.field445 = this.field445;
        var1.field437 = this.field437;
        var1.field436 = this.field436;
        var1.field427 = this.field427;
        var1.field422 = this.field422;
        var1.field425 = this.field425;
        var1.field413 = this.field413;
        var1.field438 = this.field438;
        var1.field429 = this.field429;
        var1.field455 = this.field455;
        var1.field415 = this.field415;
        var1.field423 = this.field423;
        var1.field417 = this.field417;
        var1.field444 = this.field444;
        var1.field432 = this.field432;
        var1.field430 = this.field430;
        var1.field420 = this.field420;
        var1.field416 = this.field416;
        var1.field459 = this.field459;
        var1.field424 = this.field424;
        var1.field453 = this.field453;
        var1.field449 = this.field449;
        var1.field433 = this.field433;
        var1.field450 = this.field450;
        var1.field457 = this.field457;
        var1.field418 = this.field418;
        var1.field440 = this.field440;
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)I")
    private static final int method165(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V")
    public final void method166(int arg0) {
        int var2 = field456[arg0];
        int var3 = field443[arg0];
        for (int var4 = 0; var4 < this.field458; ++var4) {
            int var5 = this.field452[var4] * var3 + this.field428[var4] * var2 >> 16;
            this.field428[var4] = this.field428[var4] * var3 - this.field452[var4] * var2 >> 16;
            this.field452[var4] = var5;
        }
        this.method156();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lff;II)Lcb;")
    public static final class17 method167(class42 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method350(arg1, -127, arg2);
        return var3 == null ? null : new class17(var3);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)Lwb;")
    public final class155 method168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method151();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class155 var8 = new class155();
        var8.field3543 = new int[this.field426];
        var8.field3554 = new int[this.field426];
        var8.field3557 = new int[this.field426];
        if (this.field413 != null) {
            var8.field3545 = new short[this.field426];
            for (int var9 = 0; var9 < this.field426; ++var9) {
                short var10 = this.field413[var9];
                if (var10 != -1 && class58.field1351.method657(var10, 127)) {
                    var8.field3545[var9] = var10;
                } else {
                    var8.field3545[var9] = -1;
                }
            }
        } else {
            var8.field3545 = null;
        }
        if (this.field447 > 0 && this.field422 != null) {
            int[] var11 = new int[this.field447];
            for (int var12 = 0; var12 < this.field426; ++var12) {
                if (this.field422[var12] != -1) {
                    ++var11[this.field422[var12] & 255];
                }
            }
            var8.field3552 = 0;
            for (int var13 = 0; var13 < this.field447; ++var13) {
                if (var11[var13] > 0 && this.field429[var13] == 0) {
                    ++var8.field3552;
                }
            }
            var8.field3553 = new int[var8.field3552];
            var8.field3549 = new int[var8.field3552];
            var8.field3570 = new int[var8.field3552];
            int var14 = 0;
            for (int var15 = 0; var15 < this.field447; ++var15) {
                if (var11[var15] > 0 && this.field429[var15] == 0) {
                    var8.field3553[var14] = this.field455[var15] & 65535;
                    var8.field3549[var14] = this.field415[var15] & 65535;
                    var8.field3570[var14] = this.field423[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            var8.field3558 = new byte[this.field426];
            for (int var16 = 0; var16 < this.field426; ++var16) {
                if (this.field422[var16] != -1) {
                    var8.field3558[var16] = (byte) var11[this.field422[var16] & 255];
                    if (var8.field3558[var16] == -1 && var8.field3545 != null) {
                        var8.field3545[var16] = -1;
                    }
                } else {
                    var8.field3558[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field426; ++var17) {
            byte var18;
            if (this.field421 == null) {
                var18 = 0;
            } else {
                var18 = this.field421[var17];
            }
            byte var19;
            if (this.field427 == null) {
                var19 = 0;
            } else {
                var19 = this.field427[var17];
            }
            short var20;
            if (var8.field3545 == null) {
                var20 = -1;
            } else {
                var20 = var8.field3545[var17];
            }
            if (var19 == -2) {
                var18 = 3;
            }
            if (var19 == -1) {
                var18 = 2;
            }
            if (var20 == -1) {
                if (var18 != 0) {
                    if (var18 == 1) {
                        class63 var28 = this.field457[var17];
                        int var29 = (var28.field1445 * arg4 + var28.field1451 * arg2 + var28.field1450 * arg3) / (var7 / 2 + var7) + arg0;
                        var8.field3543[var17] = method165(this.field425[var17] & 65535, var29);
                        var8.field3557[var17] = -1;
                    } else if (var18 == 3) {
                        var8.field3543[var17] = 128;
                        var8.field3557[var17] = -1;
                    } else {
                        var8.field3557[var17] = -2;
                    }
                } else {
                    int var21 = this.field425[var17] & 65535;
                    class131 var22;
                    if (this.field419 != null && this.field419[this.field454[var17]] != null) {
                        var22 = this.field419[this.field454[var17]];
                    } else {
                        var22 = this.field450[this.field454[var17]];
                    }
                    int var23 = (var22.field2984 * arg4 + var22.field2989 * arg2 + var22.field2985 * arg3) / (var22.field2992 * var7) + arg0;
                    var8.field3543[var17] = method165(var21, var23);
                    class131 var24;
                    if (this.field419 != null && this.field419[this.field445[var17]] != null) {
                        var24 = this.field419[this.field445[var17]];
                    } else {
                        var24 = this.field450[this.field445[var17]];
                    }
                    int var25 = (var24.field2984 * arg4 + var24.field2989 * arg2 + var24.field2985 * arg3) / (var24.field2992 * var7) + arg0;
                    var8.field3554[var17] = method165(var21, var25);
                    class131 var26;
                    if (this.field419 != null && this.field419[this.field437[var17]] != null) {
                        var26 = this.field419[this.field437[var17]];
                    } else {
                        var26 = this.field450[this.field437[var17]];
                    }
                    int var27 = (var26.field2984 * arg4 + var26.field2989 * arg2 + var26.field2985 * arg3) / (var26.field2992 * var7) + arg0;
                    var8.field3557[var17] = method165(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class63 var36 = this.field457[var17];
                    int var37 = (var36.field1445 * arg4 + var36.field1451 * arg2 + var36.field1450 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field3543[var17] = method152(var37);
                    var8.field3557[var17] = -1;
                } else {
                    var8.field3557[var17] = -2;
                }
            } else {
                class131 var30;
                if (this.field419 != null && this.field419[this.field454[var17]] != null) {
                    var30 = this.field419[this.field454[var17]];
                } else {
                    var30 = this.field450[this.field454[var17]];
                }
                int var31 = (var30.field2984 * arg4 + var30.field2989 * arg2 + var30.field2985 * arg3) / (var30.field2992 * var7) + arg0;
                var8.field3543[var17] = method152(var31);
                class131 var32;
                if (this.field419 != null && this.field419[this.field445[var17]] != null) {
                    var32 = this.field419[this.field445[var17]];
                } else {
                    var32 = this.field450[this.field445[var17]];
                }
                int var33 = (var32.field2984 * arg4 + var32.field2989 * arg2 + var32.field2985 * arg3) / (var32.field2992 * var7) + arg0;
                var8.field3554[var17] = method152(var33);
                class131 var34;
                if (this.field419 != null && this.field419[this.field437[var17]] != null) {
                    var34 = this.field419[this.field437[var17]];
                } else {
                    var34 = this.field450[this.field437[var17]];
                }
                int var35 = (var34.field2984 * arg4 + var34.field2989 * arg2 + var34.field2985 * arg3) / (var34.field2992 * var7) + arg0;
                var8.field3557[var17] = method152(var35);
            }
        }
        this.method146();
        var8.field3556 = this.field458;
        var8.field3564 = this.field452;
        var8.field3560 = this.field446;
        var8.field3551 = this.field428;
        var8.field3561 = this.field426;
        var8.field3563 = this.field454;
        var8.field3548 = this.field445;
        var8.field3566 = this.field437;
        var8.field3541 = this.field436;
        var8.field3550 = this.field427;
        var8.field3562 = this.field438;
        var8.field3542 = this.field449;
        var8.field3571 = this.field433;
        return var8;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(SS)V")
    public final void method169(short arg0, short arg1) {
        if (this.field413 != null) {
            for (int var3 = 0; var3 < this.field426; ++var3) {
                if (this.field413[var3] == arg0) {
                    this.field413[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    private class17() {
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([B)V")
    private class17(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method153(arg0);
        } else {
            this.method160(arg0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([Lcb;I)V")
    public class17(class17[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field458 = 0;
        this.field426 = 0;
        this.field447 = 0;
        this.field438 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class17 var15 = arg0[var9];
            if (var15 != null) {
                this.field458 += var15.field458;
                this.field426 += var15.field426;
                this.field447 += var15.field447;
                if (var15.field436 != null) {
                    var4 = true;
                } else {
                    if (this.field438 == -1) {
                        this.field438 = var15.field438;
                    }
                    if (this.field438 != var15.field438) {
                        var4 = true;
                    }
                }
                var3 |= var15.field421 != null;
                var5 |= var15.field427 != null;
                var6 |= var15.field453 != null;
                var7 |= var15.field413 != null;
                var8 |= var15.field422 != null;
            }
        }
        this.field452 = new int[this.field458];
        this.field446 = new int[this.field458];
        this.field428 = new int[this.field458];
        this.field424 = new int[this.field458];
        this.field454 = new int[this.field426];
        this.field445 = new int[this.field426];
        this.field437 = new int[this.field426];
        if (var3) {
            this.field421 = new byte[this.field426];
        }
        if (var4) {
            this.field436 = new byte[this.field426];
        }
        if (var5) {
            this.field427 = new byte[this.field426];
        }
        if (var6) {
            this.field453 = new int[this.field426];
        }
        if (var7) {
            this.field413 = new short[this.field426];
        }
        if (var8) {
            this.field422 = new byte[this.field426];
        }
        this.field425 = new short[this.field426];
        if (this.field447 > 0) {
            this.field429 = new byte[this.field447];
            this.field455 = new short[this.field447];
            this.field415 = new short[this.field447];
            this.field423 = new short[this.field447];
            this.field417 = new short[this.field447];
            this.field444 = new short[this.field447];
            this.field432 = new short[this.field447];
            this.field430 = new short[this.field447];
            this.field420 = new byte[this.field447];
            this.field416 = new short[this.field447];
            this.field459 = new short[this.field447];
        }
        this.field458 = 0;
        this.field426 = 0;
        this.field447 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class17 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field426; ++var12) {
                    if (var3 && var11.field421 != null) {
                        this.field421[this.field426] = var11.field421[var12];
                    }
                    if (var4) {
                        if (var11.field436 != null) {
                            this.field436[this.field426] = var11.field436[var12];
                        } else {
                            this.field436[this.field426] = var11.field438;
                        }
                    }
                    if (var5 && var11.field427 != null) {
                        this.field427[this.field426] = var11.field427[var12];
                    }
                    if (var6 && var11.field453 != null) {
                        this.field453[this.field426] = var11.field453[var12];
                    }
                    if (var7) {
                        if (var11.field413 != null) {
                            this.field413[this.field426] = var11.field413[var12];
                        } else {
                            this.field413[this.field426] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field422 != null && var11.field422[var12] != -1) {
                            this.field422[this.field426] = (byte) (var11.field422[var12] + this.field447);
                        } else {
                            this.field422[this.field426] = -1;
                        }
                    }
                    this.field425[this.field426] = var11.field425[var12];
                    this.field454[this.field426] = this.method161(var11, var11.field454[var12]);
                    this.field445[this.field426] = this.method161(var11, var11.field445[var12]);
                    this.field437[this.field426] = this.method161(var11, var11.field437[var12]);
                    ++this.field426;
                }
                for (int var13 = 0; var13 < var11.field447; ++var13) {
                    byte var14 = this.field429[this.field447] = var11.field429[var13];
                    if (var14 == 0) {
                        this.field455[this.field447] = (short) this.method161(var11, var11.field455[var13]);
                        this.field415[this.field447] = (short) this.method161(var11, var11.field415[var13]);
                        this.field423[this.field447] = (short) this.method161(var11, var11.field423[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field455[this.field447] = var11.field455[var13];
                        this.field415[this.field447] = var11.field415[var13];
                        this.field423[this.field447] = var11.field423[var13];
                        this.field417[this.field447] = var11.field417[var13];
                        this.field444[this.field447] = var11.field444[var13];
                        this.field432[this.field447] = var11.field432[var13];
                        this.field430[this.field447] = var11.field430[var13];
                        this.field420[this.field447] = var11.field420[var13];
                        this.field416[this.field447] = var11.field416[var13];
                    }
                    if (var14 == 2) {
                        this.field459[this.field447] = var11.field459[var13];
                    }
                    ++this.field447;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lcb;ZZZZ)V")
    public class17(class17 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field458 = arg0.field458;
        this.field426 = arg0.field426;
        this.field447 = arg0.field447;
        if (arg1) {
            this.field452 = arg0.field452;
            this.field446 = arg0.field446;
            this.field428 = arg0.field428;
        } else {
            this.field452 = new int[this.field458];
            this.field446 = new int[this.field458];
            this.field428 = new int[this.field458];
            for (int var6 = 0; var6 < this.field458; ++var6) {
                this.field452[var6] = arg0.field452[var6];
                this.field446[var6] = arg0.field446[var6];
                this.field428[var6] = arg0.field428[var6];
            }
        }
        if (arg2) {
            this.field425 = arg0.field425;
        } else {
            this.field425 = new short[this.field426];
            for (int var7 = 0; var7 < this.field426; ++var7) {
                this.field425[var7] = arg0.field425[var7];
            }
        }
        if (!arg3 && arg0.field413 != null) {
            this.field413 = new short[this.field426];
            for (int var8 = 0; var8 < this.field426; ++var8) {
                this.field413[var8] = arg0.field413[var8];
            }
        } else {
            this.field413 = arg0.field413;
        }
        if (arg4) {
            this.field427 = arg0.field427;
        } else {
            this.field427 = new byte[this.field426];
            if (arg0.field427 == null) {
                for (int var9 = 0; var9 < this.field426; ++var9) {
                    this.field427[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field426; ++var10) {
                    this.field427[var10] = arg0.field427[var10];
                }
            }
        }
        this.field454 = arg0.field454;
        this.field445 = arg0.field445;
        this.field437 = arg0.field437;
        this.field421 = arg0.field421;
        this.field436 = arg0.field436;
        this.field422 = arg0.field422;
        this.field438 = arg0.field438;
        this.field429 = arg0.field429;
        this.field455 = arg0.field455;
        this.field415 = arg0.field415;
        this.field423 = arg0.field423;
        this.field417 = arg0.field417;
        this.field444 = arg0.field444;
        this.field432 = arg0.field432;
        this.field430 = arg0.field430;
        this.field420 = arg0.field420;
        this.field416 = arg0.field416;
        this.field459 = arg0.field459;
        this.field424 = arg0.field424;
        this.field453 = arg0.field453;
        this.field449 = arg0.field449;
        this.field433 = arg0.field433;
        this.field450 = arg0.field450;
        this.field457 = arg0.field457;
        this.field419 = arg0.field419;
        this.field418 = arg0.field418;
        this.field440 = arg0.field440;
    }
}
