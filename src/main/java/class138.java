import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class138 extends class113 {

    @OriginalMember(owner = "client!ub", name = "sb", descriptor = "Z")
    private boolean field3462 = false;

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "I")
    private int field3454 = 0;

    @OriginalMember(owner = "client!ub", name = "rb", descriptor = "I")
    private int field3461 = 0;

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "I")
    private int field3453 = 0;

    @OriginalMember(owner = "client!ub", name = "Hb", descriptor = "B")
    private byte field3477 = 0;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "[I")
    private int[] field3448;

    @OriginalMember(owner = "client!ub", name = "Kb", descriptor = "[I")
    private int[] field3480;

    @OriginalMember(owner = "client!ub", name = "lb", descriptor = "[I")
    private int[] field3455;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "[I")
    private int[] field3449;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "[I")
    private int[] field3450;

    @OriginalMember(owner = "client!ub", name = "pb", descriptor = "[I")
    private int[] field3459;

    @OriginalMember(owner = "client!ub", name = "ob", descriptor = "[I")
    private int[] field3458;

    @OriginalMember(owner = "client!ub", name = "Ib", descriptor = "[I")
    private int[] field3478;

    @OriginalMember(owner = "client!ub", name = "qb", descriptor = "[I")
    private int[] field3460;

    @OriginalMember(owner = "client!ub", name = "yb", descriptor = "[I")
    private int[] field3468;

    @OriginalMember(owner = "client!ub", name = "Fb", descriptor = "[B")
    private byte[] field3475;

    @OriginalMember(owner = "client!ub", name = "wb", descriptor = "[B")
    private byte[] field3466;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "[B")
    private byte[] field3445;

    @OriginalMember(owner = "client!ub", name = "Ab", descriptor = "[B")
    private byte[] field3470;

    @OriginalMember(owner = "client!ub", name = "Db", descriptor = "[I")
    private int[] field3473;

    @OriginalMember(owner = "client!ub", name = "Lb", descriptor = "[S")
    private short[] field3481;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "[[I")
    private int[][] field3451;

    @OriginalMember(owner = "client!ub", name = "Bb", descriptor = "[[I")
    private int[][] field3471;

    @OriginalMember(owner = "client!ub", name = "nb", descriptor = "[Li;")
    private class56[] field3457;

    @OriginalMember(owner = "client!ub", name = "mb", descriptor = "[Lqf;")
    private class117[] field3456;

    @OriginalMember(owner = "client!ub", name = "Gb", descriptor = "[Li;")
    private class56[] field3476;

    @OriginalMember(owner = "client!ub", name = "tb", descriptor = "S")
    public short field3463;

    @OriginalMember(owner = "client!ub", name = "ub", descriptor = "S")
    public short field3464;

    @OriginalMember(owner = "client!ub", name = "vb", descriptor = "[I")
    private static int[] field3465 = new int[128];

    @OriginalMember(owner = "client!ub", name = "xb", descriptor = "[I")
    private static int[] field3467 = new int[10000];

    @OriginalMember(owner = "client!ub", name = "Eb", descriptor = "I")
    private static int field3474 = 0;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "[I")
    private static int[] field3447 = new int[10000];

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    private int field3446;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "I")
    private int field3452;

    @OriginalMember(owner = "client!ub", name = "zb", descriptor = "I")
    private int field3469;

    @OriginalMember(owner = "client!ub", name = "Cb", descriptor = "I")
    private int field3472;

    @OriginalMember(owner = "client!ub", name = "Jb", descriptor = "I")
    private int field3479;

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field3465[var0++] = 255;
        }
        while (var0 < 16) {
            field3465[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field3465[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field3465[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field3465[var0++] = var1--;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIZ)Lub;", line = 3)
    public final class138 method1117(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class138 var6;
            if (arg4) {
                var6 = new class138();
                var6.field3454 = this.field3454;
                var6.field3461 = this.field3461;
                var6.field3453 = this.field3453;
                var6.field3448 = this.field3448;
                var6.field3455 = this.field3455;
                var6.field3449 = this.field3449;
                var6.field3450 = this.field3450;
                var6.field3459 = this.field3459;
                var6.field3475 = this.field3475;
                var6.field3445 = this.field3445;
                var6.field3470 = this.field3470;
                var6.field3466 = this.field3466;
                var6.field3481 = this.field3481;
                var6.field3477 = this.field3477;
                var6.field3458 = this.field3458;
                var6.field3478 = this.field3478;
                var6.field3460 = this.field3460;
                var6.field3468 = this.field3468;
                var6.field3473 = this.field3473;
                var6.field3451 = this.field3451;
                var6.field3471 = this.field3471;
                var6.field3463 = this.field3463;
                var6.field3464 = this.field3464;
                var6.field3480 = new int[var6.field3454];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field3454; ++var8) {
                int var9 = this.field3448[var8];
                int var10 = this.field3480[var8];
                int var11 = this.field3455[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field3480[var8] = var10 + var14 - var7;
            }
            var6.method1135();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V", line = 77)
    private final void method1118() {
        if (!this.field3462) {
            super.field2966 = 0;
            this.field3479 = 0;
            this.field3446 = 999999;
            this.field3469 = -999999;
            this.field3452 = -99999;
            this.field3472 = 99999;
            for (int var1 = 0; var1 < this.field3454; ++var1) {
                int var2 = this.field3448[var1];
                int var3 = this.field3480[var1];
                int var4 = this.field3455[var1];
                if (var2 < this.field3446) {
                    this.field3446 = var2;
                }
                if (var2 > this.field3469) {
                    this.field3469 = var2;
                }
                if (var4 < this.field3472) {
                    this.field3472 = var4;
                }
                if (var4 > this.field3452) {
                    this.field3452 = var4;
                }
                if (-var3 > super.field2966) {
                    super.field2966 = -var3;
                }
                if (var3 > this.field3479) {
                    this.field3479 = var3;
                }
            }
            this.field3462 = true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()V", line = 122)
    private final void method1119() {
        int var10002;
        if (this.field3468 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3454; ++var3) {
                int var7 = this.field3468[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3451 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field3451[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3454) {
                int var6 = this.field3468[var5];
                this.field3451[var6][var1[var6]++] = var5++;
            }
            this.field3468 = null;
        }
        if (this.field3473 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field3461; ++var10) {
                int var14 = this.field3473[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field3471 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field3471[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field3461) {
                int var13 = this.field3473[var12];
                this.field3471[var13][var8[var13]++] = var12++;
            }
            this.field3473 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lub;I)I", line = 216)
    private final int method1120(class138 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3448[arg1];
        int var5 = arg0.field3480[arg1];
        int var6 = arg0.field3455[arg1];
        for (int var7 = 0; var7 < this.field3454; ++var7) {
            if (this.field3448[var7] == var4 && this.field3480[var7] == var5 && this.field3455[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3448[this.field3454] = var4;
            this.field3480[this.field3454] = var5;
            this.field3455[this.field3454] = var6;
            if (arg0.field3468 != null) {
                this.field3468[this.field3454] = arg0.field3468[arg1];
            }
            var3 = this.field3454++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()V", line = 256)
    public final void method1121() {
        for (int var1 = 0; var1 < this.field3454; ++var1) {
            int var2 = this.field3455[var1];
            this.field3455[var1] = this.field3448[var1];
            this.field3448[var1] = -var2;
        }
        this.method1135();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Loc;II)Lub;", line = 270)
    public static final class138 method1122(class100 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method839(5, arg1, arg2);
        return var3 == null ? null : new class138(var3);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I", line = 285)
    private static final int method1123(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(SS)V", line = 299)
    public final void method1124(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3461; ++var3) {
            if (this.field3481[var3] == arg0) {
                this.field3481[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "()Lub;", line = 318)
    public final class138 method1125() {
        class138 var1 = new class138();
        if (this.field3475 != null) {
            var1.field3475 = new byte[this.field3461];
            for (int var2 = 0; var2 < this.field3461; ++var2) {
                var1.field3475[var2] = this.field3475[var2];
            }
        }
        var1.field3454 = this.field3454;
        var1.field3461 = this.field3461;
        var1.field3453 = this.field3453;
        var1.field3448 = this.field3448;
        var1.field3480 = this.field3480;
        var1.field3455 = this.field3455;
        var1.field3449 = this.field3449;
        var1.field3450 = this.field3450;
        var1.field3459 = this.field3459;
        var1.field3445 = this.field3445;
        var1.field3470 = this.field3470;
        var1.field3466 = this.field3466;
        var1.field3481 = this.field3481;
        var1.field3477 = this.field3477;
        var1.field3458 = this.field3458;
        var1.field3478 = this.field3478;
        var1.field3460 = this.field3460;
        var1.field3468 = this.field3468;
        var1.field3473 = this.field3473;
        var1.field3451 = this.field3451;
        var1.field3471 = this.field3471;
        var1.field3457 = this.field3457;
        var1.field3456 = this.field3456;
        var1.field3463 = this.field3463;
        var1.field3464 = this.field3464;
        return var1;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 908)
    private class138() {
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V", line = 910)
    private class138(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class25 var4 = new class25(arg0);
        class25 var5 = new class25(arg0);
        class25 var6 = new class25(arg0);
        class25 var7 = new class25(arg0);
        class25 var8 = new class25(arg0);
        var4.field710 = arg0.length - 18;
        int var9 = var4.method301(-4853);
        int var10 = var4.method301(-4853);
        int var11 = var4.method322((byte) -50);
        int var12 = var4.method322((byte) -50);
        int var13 = var4.method322((byte) -50);
        int var14 = var4.method322((byte) -50);
        int var15 = var4.method322((byte) -50);
        int var16 = var4.method322((byte) -50);
        int var17 = var4.method301(-4853);
        int var18 = var4.method301(-4853);
        int var19 = var4.method301(-4853);
        int var20 = var4.method301(-4853);
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
        this.field3454 = var9;
        this.field3461 = var10;
        this.field3453 = var11;
        this.field3448 = new int[var9];
        this.field3480 = new int[var9];
        this.field3455 = new int[var9];
        this.field3449 = new int[var10];
        this.field3450 = new int[var10];
        this.field3459 = new int[var10];
        if (var11 > 0) {
            this.field3458 = new int[var11];
            this.field3478 = new int[var11];
            this.field3460 = new int[var11];
        }
        if (var16 == 1) {
            this.field3468 = new int[var9];
        }
        if (var12 == 1) {
            this.field3475 = new byte[var10];
            this.field3466 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3445 = new byte[var10];
        } else {
            this.field3477 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3470 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3473 = new int[var10];
        }
        this.field3481 = new short[var10];
        var4.field710 = var21;
        var5.field710 = var36;
        var6.field710 = var38;
        var7.field710 = var40;
        var8.field710 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method322((byte) -50);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method286((byte) -101);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method286((byte) -101);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method286((byte) -101);
            }
            this.field3448[var46] = var43 + var60;
            this.field3480[var46] = var44 + var61;
            this.field3455[var46] = var45 + var62;
            var43 = this.field3448[var46];
            var44 = this.field3480[var46];
            var45 = this.field3455[var46];
            if (var16 == 1) {
                this.field3468[var46] = var8.method322((byte) -50);
            }
        }
        var4.field710 = var32;
        var5.field710 = var28;
        var6.field710 = var26;
        var7.field710 = var30;
        var8.field710 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field3481[var47] = (short) var4.method301(-4853);
            if (var12 == 1) {
                int var58 = var5.method322((byte) -50);
                if ((var58 & 1) == 1) {
                    this.field3475[var47] = 1;
                    var3 = true;
                } else {
                    this.field3475[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field3466[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field3466[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3445[var47] = var6.method293(-122);
            }
            if (var14 == 1) {
                this.field3470[var47] = var7.method293(-126);
            }
            if (var15 == 1) {
                this.field3473[var47] = var8.method322((byte) -50);
            }
        }
        var4.field710 = var25;
        var5.field710 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method322((byte) -50);
            if (var54 == 1) {
                var48 = var4.method286((byte) -101) + var51;
                var49 = var4.method286((byte) -101) + var48;
                var50 = var4.method286((byte) -101) + var49;
                var51 = var50;
                this.field3449[var52] = var48;
                this.field3450[var52] = var49;
                this.field3459[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method286((byte) -101) + var51;
                var51 = var50;
                this.field3449[var52] = var48;
                this.field3450[var52] = var49;
                this.field3459[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method286((byte) -101) + var51;
                var51 = var50;
                this.field3449[var52] = var48;
                this.field3450[var52] = var49;
                this.field3459[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method286((byte) -101) + var51;
                var51 = var50;
                this.field3449[var52] = var48;
                this.field3450[var52] = var57;
                this.field3459[var52] = var50;
            }
        }
        var4.field710 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field3458[var53] = var4.method301(-4853);
            this.field3478[var53] = var4.method301(-4853);
            this.field3460[var53] = var4.method301(-4853);
        }
        if (!var2) {
            this.field3466 = null;
        }
        if (!var3) {
            this.field3475 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([Lub;I)V", line = 1214)
    public class138(class138[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field3454 = 0;
        this.field3461 = 0;
        this.field3453 = 0;
        this.field3477 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class138 var14 = arg0[var8];
            if (var14 != null) {
                this.field3454 += var14.field3454;
                this.field3461 += var14.field3461;
                this.field3453 += var14.field3453;
                if (var14.field3445 != null) {
                    var4 = true;
                } else {
                    if (this.field3477 == -1) {
                        this.field3477 = var14.field3477;
                    }
                    if (this.field3477 != var14.field3477) {
                        var4 = true;
                    }
                }
                var3 |= var14.field3475 != null;
                var5 |= var14.field3470 != null;
                var6 |= var14.field3473 != null;
                var7 |= var14.field3466 != null;
            }
        }
        this.field3448 = new int[this.field3454];
        this.field3480 = new int[this.field3454];
        this.field3455 = new int[this.field3454];
        this.field3468 = new int[this.field3454];
        this.field3449 = new int[this.field3461];
        this.field3450 = new int[this.field3461];
        this.field3459 = new int[this.field3461];
        if (this.field3453 > 0) {
            this.field3458 = new int[this.field3453];
            this.field3478 = new int[this.field3453];
            this.field3460 = new int[this.field3453];
        }
        if (var3) {
            this.field3475 = new byte[this.field3461];
        }
        if (var4) {
            this.field3445 = new byte[this.field3461];
        }
        if (var5) {
            this.field3470 = new byte[this.field3461];
        }
        if (var7) {
            this.field3466 = new byte[this.field3461];
        }
        if (var6) {
            this.field3473 = new int[this.field3461];
        }
        this.field3481 = new short[this.field3461];
        this.field3454 = 0;
        this.field3461 = 0;
        this.field3453 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class138 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3461; ++var12) {
                    if (var3 && var11.field3475 != null) {
                        this.field3475[this.field3461] = var11.field3475[var12];
                    }
                    if (var4) {
                        if (var11.field3445 != null) {
                            this.field3445[this.field3461] = var11.field3445[var12];
                        } else {
                            this.field3445[this.field3461] = var11.field3477;
                        }
                    }
                    if (var5 && var11.field3470 != null) {
                        this.field3470[this.field3461] = var11.field3470[var12];
                    }
                    if (var7) {
                        if (var11.field3466 != null && var11.field3466[var12] != -1) {
                            this.field3466[this.field3461] = (byte) (var11.field3466[var12] + var9);
                        } else {
                            this.field3466[this.field3461] = -1;
                        }
                    }
                    if (var6 && var11.field3473 != null) {
                        this.field3473[this.field3461] = var11.field3473[var12];
                    }
                    this.field3481[this.field3461] = var11.field3481[var12];
                    this.field3449[this.field3461] = this.method1120(var11, var11.field3449[var12]);
                    this.field3450[this.field3461] = this.method1120(var11, var11.field3450[var12]);
                    this.field3459[this.field3461] = this.method1120(var11, var11.field3459[var12]);
                    ++this.field3461;
                }
                for (int var13 = 0; var13 < var11.field3453; ++var13) {
                    this.field3458[this.field3453] = this.method1120(var11, var11.field3458[var13]);
                    this.field3478[this.field3453] = this.method1120(var11, var11.field3478[var13]);
                    this.field3460[this.field3453] = this.method1120(var11, var11.field3460[var13]);
                    ++this.field3453;
                }
                var9 += var11.field3453;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lub;ZZZ)V", line = 1377)
    public class138(class138 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field3454 = arg0.field3454;
        this.field3461 = arg0.field3461;
        this.field3453 = arg0.field3453;
        if (arg1) {
            this.field3448 = arg0.field3448;
            this.field3480 = arg0.field3480;
            this.field3455 = arg0.field3455;
        } else {
            this.field3448 = new int[this.field3454];
            this.field3480 = new int[this.field3454];
            this.field3455 = new int[this.field3454];
            for (int var5 = 0; var5 < this.field3454; ++var5) {
                this.field3448[var5] = arg0.field3448[var5];
                this.field3480[var5] = arg0.field3480[var5];
                this.field3455[var5] = arg0.field3455[var5];
            }
        }
        if (arg2) {
            this.field3481 = arg0.field3481;
        } else {
            this.field3481 = new short[this.field3461];
            for (int var6 = 0; var6 < this.field3461; ++var6) {
                this.field3481[var6] = arg0.field3481[var6];
            }
        }
        if (arg3) {
            this.field3470 = arg0.field3470;
        } else {
            this.field3470 = new byte[this.field3461];
            if (arg0.field3470 == null) {
                for (int var7 = 0; var7 < this.field3461; ++var7) {
                    this.field3470[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field3461; ++var8) {
                    this.field3470[var8] = arg0.field3470[var8];
                }
            }
        }
        this.field3449 = arg0.field3449;
        this.field3450 = arg0.field3450;
        this.field3459 = arg0.field3459;
        this.field3475 = arg0.field3475;
        this.field3445 = arg0.field3445;
        this.field3466 = arg0.field3466;
        this.field3477 = arg0.field3477;
        this.field3458 = arg0.field3458;
        this.field3478 = arg0.field3478;
        this.field3460 = arg0.field3460;
        this.field3468 = arg0.field3468;
        this.field3473 = arg0.field3473;
        this.field3451 = arg0.field3451;
        this.field3471 = arg0.field3471;
        this.field3457 = arg0.field3457;
        this.field3456 = arg0.field3456;
        this.field3476 = arg0.field3476;
        this.field3463 = arg0.field3463;
        this.field3464 = arg0.field3464;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lub;Lub;IIIZ)V", line = 363)
    public static final void method1126(class138 arg0, class138 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1118();
        arg0.method1134();
        arg1.method1118();
        arg1.method1134();
        ++field3474;
        int var6 = 0;
        int[] var7 = arg1.field3448;
        int var8 = arg1.field3454;
        for (int var9 = 0; var9 < arg0.field3454; ++var9) {
            class56 var12 = arg0.field3457[var9];
            if (var12.field1393 != 0) {
                int var13 = arg0.field3480[var9] - arg3;
                if (var13 <= arg1.field3479) {
                    int var14 = arg0.field3448[var9] - arg2;
                    if (var14 >= arg1.field3446 && var14 <= arg1.field3469) {
                        int var15 = arg0.field3455[var9] - arg4;
                        if (var15 >= arg1.field3472 && var15 <= arg1.field3452) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class56 var17 = arg1.field3457[var16];
                                if (var7[var16] == var14 && arg1.field3455[var16] == var15 && arg1.field3480[var16] == var13 && var17.field1393 != 0) {
                                    if (arg0.field3476 == null) {
                                        arg0.field3476 = new class56[arg0.field3454];
                                    }
                                    if (arg1.field3476 == null) {
                                        arg1.field3476 = new class56[var8];
                                    }
                                    class56 var18 = arg0.field3476[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field3476[var9] = new class56(var12);
                                    }
                                    class56 var19 = arg1.field3476[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field3476[var16] = new class56(var17);
                                    }
                                    var18.field1395 += var17.field1395;
                                    var18.field1399 += var17.field1399;
                                    var18.field1398 += var17.field1398;
                                    var18.field1393 += var17.field1393;
                                    var19.field1395 += var12.field1395;
                                    var19.field1399 += var12.field1399;
                                    var19.field1398 += var12.field1398;
                                    var19.field1393 += var12.field1393;
                                    ++var6;
                                    field3467[var9] = field3474;
                                    field3447[var16] = field3474;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field3461; ++var10) {
                if (field3467[arg0.field3449[var10]] == field3474 && field3467[arg0.field3450[var10]] == field3474 && field3467[arg0.field3459[var10]] == field3474) {
                    if (arg0.field3475 == null) {
                        arg0.field3475 = new byte[arg0.field3461];
                    }
                    arg0.field3475[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field3461; ++var11) {
                if (field3447[arg1.field3449[var11]] == field3474 && field3447[arg1.field3450[var11]] == field3474 && field3447[arg1.field3459[var11]] == field3474) {
                    if (arg1.field3475 == null) {
                        arg1.field3475 = new byte[arg1.field3461];
                    }
                    arg1.field3475[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "()V", line = 490)
    public static void method1127() {
        field3467 = null;
        field3447 = null;
        field3465 = null;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "()V", line = 502)
    public final void method1128() {
        for (int var1 = 0; var1 < this.field3454; ++var1) {
            this.field3448[var1] = -this.field3448[var1];
            this.field3455[var1] = -this.field3455[var1];
        }
        this.method1135();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)Lda;", line = 513)
    public final class23 method1129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1134();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class23 var8 = new class23();
        var8.field602 = new int[this.field3461];
        var8.field586 = new int[this.field3461];
        var8.field583 = new int[this.field3461];
        for (int var9 = 0; var9 < this.field3461; ++var9) {
            byte var10;
            if (this.field3475 == null) {
                var10 = 0;
            } else {
                var10 = this.field3475[var9];
            }
            if (this.field3466 != null && this.field3466[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class117 var17 = this.field3456[var9];
                        int var18 = (var17.field3073 * arg4 + var17.field3082 * arg3 + var17.field3071 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field602[var9] = method1131(var18);
                        var8.field583[var9] = -1;
                    } else {
                        var8.field583[var9] = -2;
                    }
                } else {
                    class56 var11;
                    if (this.field3476 != null && this.field3476[this.field3449[var9]] != null) {
                        var11 = this.field3476[this.field3449[var9]];
                    } else {
                        var11 = this.field3457[this.field3449[var9]];
                    }
                    int var12 = (var11.field1398 * arg4 + var11.field1399 * arg3 + var11.field1395 * arg2) / (var11.field1393 * var7) + arg0;
                    var8.field602[var9] = method1131(var12);
                    class56 var13;
                    if (this.field3476 != null && this.field3476[this.field3450[var9]] != null) {
                        var13 = this.field3476[this.field3450[var9]];
                    } else {
                        var13 = this.field3457[this.field3450[var9]];
                    }
                    int var14 = (var13.field1398 * arg4 + var13.field1399 * arg3 + var13.field1395 * arg2) / (var13.field1393 * var7) + arg0;
                    var8.field586[var9] = method1131(var14);
                    class56 var15;
                    if (this.field3476 != null && this.field3476[this.field3459[var9]] != null) {
                        var15 = this.field3476[this.field3459[var9]];
                    } else {
                        var15 = this.field3457[this.field3459[var9]];
                    }
                    int var16 = (var15.field1398 * arg4 + var15.field1399 * arg3 + var15.field1395 * arg2) / (var15.field1393 * var7) + arg0;
                    var8.field583[var9] = method1131(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class117 var26 = this.field3456[var9];
                    int var27 = (var26.field3073 * arg4 + var26.field3082 * arg3 + var26.field3071 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field602[var9] = method1123(this.field3481[var9] & 65535, var27);
                    var8.field583[var9] = -1;
                } else {
                    var8.field583[var9] = -2;
                }
            } else {
                int var19 = this.field3481[var9] & 65535;
                class56 var20;
                if (this.field3476 != null && this.field3476[this.field3449[var9]] != null) {
                    var20 = this.field3476[this.field3449[var9]];
                } else {
                    var20 = this.field3457[this.field3449[var9]];
                }
                int var21 = (var20.field1398 * arg4 + var20.field1399 * arg3 + var20.field1395 * arg2) / (var20.field1393 * var7) + arg0;
                var8.field602[var9] = method1123(var19, var21);
                class56 var22;
                if (this.field3476 != null && this.field3476[this.field3450[var9]] != null) {
                    var22 = this.field3476[this.field3450[var9]];
                } else {
                    var22 = this.field3457[this.field3450[var9]];
                }
                int var23 = (var22.field1398 * arg4 + var22.field1399 * arg3 + var22.field1395 * arg2) / (var22.field1393 * var7) + arg0;
                var8.field586[var9] = method1123(var19, var23);
                class56 var24;
                if (this.field3476 != null && this.field3476[this.field3459[var9]] != null) {
                    var24 = this.field3476[this.field3459[var9]];
                } else {
                    var24 = this.field3457[this.field3459[var9]];
                }
                int var25 = (var24.field1398 * arg4 + var24.field1399 * arg3 + var24.field1395 * arg2) / (var24.field1393 * var7) + arg0;
                var8.field583[var9] = method1123(var19, var25);
            }
        }
        this.method1119();
        var8.field598 = this.field3454;
        var8.field603 = this.field3448;
        var8.field599 = this.field3480;
        var8.field605 = this.field3455;
        var8.field610 = this.field3461;
        var8.field635 = this.field3449;
        var8.field587 = this.field3450;
        var8.field604 = this.field3459;
        var8.field584 = this.field3445;
        var8.field596 = this.field3470;
        var8.field593 = this.field3466;
        if (var8.field593 != null) {
            var8.field601 = this.field3481;
        } else {
            var8.field601 = null;
        }
        var8.field582 = this.field3477;
        var8.field607 = this.field3453;
        var8.field600 = this.field3458;
        var8.field592 = this.field3478;
        var8.field585 = this.field3460;
        var8.field591 = this.field3451;
        var8.field588 = this.field3471;
        return var8;
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "()V", line = 663)
    public final void method1130() {
        for (int var1 = 0; var1 < this.field3454; ++var1) {
            int var2 = this.field3448[var1];
            this.field3448[var1] = this.field3455[var1];
            this.field3455[var1] = -var2;
        }
        this.method1135();
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)I", line = 679)
    private static final int method1131(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field3465[arg0];
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V", line = 700)
    public final void method1132(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3454; ++var4) {
            this.field3448[var4] += arg0;
            this.field3480[var4] += arg1;
            this.field3455[var4] += arg2;
        }
        this.method1135();
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V", line = 725)
    public final void method1133(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3454; ++var4) {
            this.field3448[var4] = this.field3448[var4] * arg0 / 128;
            this.field3480[var4] = this.field3480[var4] * arg1 / 128;
            this.field3455[var4] = this.field3455[var4] * arg2 / 128;
        }
        this.method1135();
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "()V", line = 742)
    public final void method1134() {
        if (this.field3457 == null) {
            this.field3457 = new class56[this.field3454];
            for (int var1 = 0; var1 < this.field3454; ++var1) {
                this.field3457[var1] = new class56();
            }
            for (int var2 = 0; var2 < this.field3461; ++var2) {
                int var3 = this.field3449[var2];
                int var4 = this.field3450[var2];
                int var5 = this.field3459[var2];
                int var6 = this.field3448[var4] - this.field3448[var3];
                int var7 = this.field3480[var4] - this.field3480[var3];
                int var8 = this.field3455[var4] - this.field3455[var3];
                int var9 = this.field3448[var5] - this.field3448[var3];
                int var10 = this.field3480[var5] - this.field3480[var3];
                int var11 = this.field3455[var5] - this.field3455[var3];
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
                if (this.field3475 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field3475[var2];
                }
                if (var19 == 0) {
                    class56 var20 = this.field3457[var3];
                    var20.field1395 += var16;
                    var20.field1399 += var17;
                    var20.field1398 += var18;
                    ++var20.field1393;
                    class56 var21 = this.field3457[var4];
                    var21.field1395 += var16;
                    var21.field1399 += var17;
                    var21.field1398 += var18;
                    ++var21.field1393;
                    class56 var22 = this.field3457[var5];
                    var22.field1395 += var16;
                    var22.field1399 += var17;
                    var22.field1398 += var18;
                    ++var22.field1393;
                } else if (var19 == 1) {
                    if (this.field3456 == null) {
                        this.field3456 = new class117[this.field3461];
                    }
                    class117 var23 = this.field3456[var2] = new class117();
                    var23.field3071 = var16;
                    var23.field3082 = var17;
                    var23.field3073 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "()V", line = 845)
    private final void method1135() {
        this.field3457 = null;
        this.field3476 = null;
        this.field3456 = null;
        this.field3462 = false;
    }

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "()V", line = 857)
    public final void method1136() {
        for (int var1 = 0; var1 < this.field3454; ++var1) {
            this.field3455[var1] = -this.field3455[var1];
        }
        for (int var2 = 0; var2 < this.field3461; ++var2) {
            int var3 = this.field3449[var2];
            this.field3449[var2] = this.field3459[var2];
            this.field3459[var2] = var3;
        }
        this.method1135();
    }
}
