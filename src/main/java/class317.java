import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class317 {

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public int field4467 = -1;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "Z")
    public boolean field4477 = false;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "Z")
    public boolean field4474 = false;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "Z")
    public boolean field4479 = false;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public int field4473 = 99;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "Z")
    public boolean field4471 = false;

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
    public int field4481 = -1;

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
    public int field4487 = 2;

    @OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
    public int field4489 = -1;

    @OriginalMember(owner = "client!mu", name = "H", descriptor = "I")
    public int field4492 = -1;

    @OriginalMember(owner = "client!mu", name = "y", descriptor = "I")
    public int field4484 = -1;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public int field4466 = 5;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field4468 = 0;

    @OriginalMember(owner = "client!mu", name = "F", descriptor = "Z")
    public static volatile boolean field4490 = true;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    public int field4476;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "Lll;")
    public class384 field4472;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "[I")
    public int[] field4480;

    @OriginalMember(owner = "client!mu", name = "x", descriptor = "[I")
    public int[] field4483;

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "[I")
    public int[] field4485;

    @OriginalMember(owner = "client!mu", name = "G", descriptor = "[I")
    public int[] field4491;

    @OriginalMember(owner = "client!mu", name = "I", descriptor = "[I")
    public int[] field4493;

    @OriginalMember(owner = "client!mu", name = "J", descriptor = "[I")
    private int[] field4494;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "[Z")
    public boolean[] field4469;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "[[I")
    public int[][] field4463;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lnh;")
    public static final class777 method2020(Throwable arg0, String arg1) {
        field4461++;
        class777 var2;
        if (arg0 instanceof class777) {
            var2 = (class777) arg0;
            var2.field10678 = var2.field10678 + ' ' + arg1;
        } else {
            var2 = new class777(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILka;IBIBII)Lka;")
    public final class497 method2021(int arg0, class497 arg1, int arg2, byte arg3, int arg4, byte arg5, int arg6, int arg7) {
        field4462++;
        int var9 = this.field4485[arg0];
        int var10 = this.field4493[arg0];
        class236 var11 = this.field4472.method2381((byte) 61, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method271(arg5, arg4, true);
        }
        class236 var13 = null;
        if ((this.field4474 || class779.field10699) && arg6 != -1 && this.field4493.length > arg6) {
            int var14 = this.field4493[arg6];
            var13 = this.field4472.method2381((byte) 96, var14 >> 16);
            arg6 = var14 & 0xFFFF;
        }
        if (this.field4477) {
            arg4 |= 0x200;
        }
        if (var11.method1496(var12, -3)) {
            arg4 |= 0x80;
        }
        if (var11.method1500(var12, -3)) {
            arg4 |= 0x100;
        }
        if (var11.method1497(var12, (byte) 100)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1496(arg6, -3)) {
                arg4 |= 0x80;
            }
            if (var13.method1500(arg6, -3)) {
                arg4 |= 0x100;
            }
            if (var13.method1497(arg6, (byte) -86)) {
                arg4 |= 0x400;
            }
        }
        int var15 = arg4 | 0x20;
        class497 var16 = arg1.method271(arg5, var15, true);
        var16.method2919(arg7, var12, var9, arg6, var13, this.field4477, arg2 - 1, var11, 10);
        if (arg3 >= -83) {
            this.field4467 = -7;
        }
        return var16;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILdt;I)V")
    private final void method2022(int arg0, class254 arg1, int arg2) {
        if (arg0 != -3602) {
            return;
        }
        field4470++;
        if (arg2 == 1) {
            int var16 = arg1.method1728((byte) 78);
            this.field4485 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field4485[var17] = arg1.method1728((byte) 19);
            }
            this.field4493 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field4493[var18] = arg1.method1728((byte) 7);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field4493[var19] += arg1.method1728((byte) 46) << 16;
            }
        } else if (arg2 == 2) {
            this.field4484 = arg1.method1728((byte) 114);
        } else if (arg2 == 3) {
            this.field4469 = new boolean[256];
            int var4 = arg1.method1731((byte) 64);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4469[arg1.method1731((byte) 64)] = true;
            }
        } else if (arg2 == 5) {
            this.field4466 = arg1.method1731((byte) 64);
        } else if (arg2 == 6) {
            this.field4467 = arg1.method1728((byte) 33);
        } else if (arg2 == 7) {
            this.field4492 = arg1.method1728((byte) 49);
        } else if (arg2 == 8) {
            this.field4473 = arg1.method1731((byte) 64);
        } else if (arg2 == 9) {
            this.field4481 = arg1.method1731((byte) 64);
        } else if (arg2 == 10) {
            this.field4489 = arg1.method1731((byte) 64);
        } else if (arg2 == 11) {
            this.field4487 = arg1.method1731((byte) 64);
        } else if (arg2 == 12) {
            int var13 = arg1.method1731((byte) 64);
            this.field4494 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4494[var14] = arg1.method1728((byte) 111);
            }
            for (int var15 = 0; var15 < var13; var15++) {
                this.field4494[var15] += arg1.method1728((byte) 28) << 16;
            }
        } else if (arg2 == 13) {
            int var6 = arg1.method1728((byte) 4);
            this.field4463 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1731((byte) 64);
                if (var8 > 0) {
                    this.field4463[var7] = new int[var8];
                    this.field4463[var7][0] = arg1.method1722(false);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field4463[var7][var9] = arg1.method1728((byte) 94);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field4477 = true;
        } else if (arg2 == 15) {
            this.field4474 = true;
        } else if (arg2 == 16) {
            this.field4471 = true;
        } else if (arg2 == 18) {
            this.field4479 = true;
        } else if (arg2 == 19) {
            if (this.field4480 == null) {
                this.field4480 = new int[this.field4463.length];
                for (int var12 = 0; var12 < this.field4463.length; var12++) {
                    this.field4480[var12] = 255;
                }
            }
            this.field4480[arg1.method1731((byte) 64)] = arg1.method1731((byte) 64);
        } else if (arg2 == 20) {
            if (this.field4483 == null || this.field4491 == null) {
                this.field4483 = new int[this.field4463.length];
                this.field4491 = new int[this.field4463.length];
                for (int var10 = 0; var10 < this.field4463.length; var10++) {
                    this.field4483[var10] = 256;
                    this.field4491[var10] = 256;
                }
            }
            int var11 = arg1.method1731((byte) 64);
            this.field4483[var11] = arg1.method1728((byte) 116);
            this.field4491[var11] = arg1.method1728((byte) 116);
            return;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIILka;)Lka;")
    public final class497 method2023(int arg0, int arg1, int arg2, int arg3, int arg4, class497 arg5) {
        field4486++;
        int var7 = this.field4485[arg2];
        int var8 = this.field4493[arg2];
        class236 var9 = this.field4472.method2381((byte) 96, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method271((byte) 1, arg0, true);
        } else if (arg3 == -65536) {
            class236 var11 = null;
            if ((this.field4474 || class779.field10699) && arg4 != -1 && this.field4493.length > arg4) {
                int var12 = this.field4493[arg4];
                var11 = this.field4472.method2381((byte) 120, var12 >> 16);
                arg4 = var12 & 0xFFFF;
            }
            class236 var13 = null;
            class236 var14 = null;
            int var15 = 0;
            int var16 = 0;
            if (this.field4494 != null) {
                if (arg2 < this.field4494.length) {
                    var15 = this.field4494[arg2];
                    if (var15 != 65535) {
                        var13 = this.field4472.method2381((byte) 103, var15 >> 16);
                        var15 &= 0xFFFF;
                    }
                }
                if ((this.field4474 || class779.field10699) && arg4 != -1 && arg4 < this.field4494.length) {
                    var16 = this.field4494[arg4];
                    if (var16 != 65535) {
                        var14 = this.field4472.method2381((byte) 116, var16 >> 16);
                        var16 &= 0xFFFF;
                    }
                }
            }
            if (this.field4477) {
                arg0 |= 0x200;
            }
            if (var9.method1496(var10, -3)) {
                arg0 |= 0x80;
            }
            if (var9.method1500(var10, -3)) {
                arg0 |= 0x100;
            }
            if (var9.method1497(var10, (byte) -108)) {
                arg0 |= 0x400;
            }
            if (var13 != null) {
                if (var13.method1496(var15, -3)) {
                    arg0 |= 0x80;
                }
                if (var13.method1500(var15, arg3 + 65533)) {
                    arg0 |= 0x100;
                }
                if (var13.method1497(var15, (byte) -113)) {
                    arg0 |= 0x400;
                }
            }
            if (var11 != null) {
                if (var11.method1496(arg4, -3)) {
                    arg0 |= 0x80;
                }
                if (var11.method1500(arg4, -3)) {
                    arg0 |= 0x100;
                }
                if (var11.method1497(arg4, (byte) -99)) {
                    arg0 |= 0x400;
                }
            }
            if (var14 != null) {
                if (var14.method1496(var16, -3)) {
                    arg0 |= 0x80;
                }
                if (var14.method1500(var16, -3)) {
                    arg0 |= 0x100;
                }
                if (var14.method1497(var16, (byte) 81)) {
                    arg0 |= 0x400;
                }
            }
            int var17 = arg0 | 0x20;
            class497 var18 = arg5.method271((byte) 1, var17, true);
            var18.method2919(0, var10, var7, arg4, var11, this.field4477, arg1 - 1, var9, 10);
            if (var13 != null) {
                var18.method2919(0, var15, var7, var16, var14, this.field4477, arg1 - 1, var13, 10);
            }
            return var18;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZII)I")
    public final int method2024(int arg0, boolean arg1, int arg2, int arg3) {
        field4488++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field4493[arg3];
        class236 var8 = null;
        class236 var9 = this.field4472.method2381((byte) 98, var7 >> 16);
        int var10 = var7 & arg0;
        if (var9 == null) {
            return var5;
        }
        if ((this.field4474 || class779.field10699) && arg2 != -1 && arg2 < this.field4493.length) {
            int var11 = this.field4493[arg2];
            var8 = this.field4472.method2381((byte) 95, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field4477) {
            var5 |= 0x200;
        }
        if (var9.method1496(var10, -3)) {
            var5 |= 0x80;
        }
        if (var9.method1500(var10, -3)) {
            var5 |= 0x100;
        }
        if (var9.method1497(var10, (byte) 11)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method1496(var6, -3)) {
                var5 |= 0x80;
            }
            if (var8.method1500(var6, arg0 - 65538)) {
                var5 |= 0x100;
            }
            if (var8.method1497(var6, (byte) -126)) {
                var5 |= 0x400;
            }
        }
        if (this.field4494 != null && arg1) {
            if (arg3 < this.field4494.length) {
                int var12 = this.field4494[arg3];
                if (var12 != 65535) {
                    class236 var13 = this.field4472.method2381((byte) 120, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1496(var14, -3)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1500(var14, -3)) {
                            var5 |= 0x100;
                        }
                        if (var13.method1497(var14, (byte) 40)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field4474 || class779.field10699) && arg2 != -1 && arg2 < this.field4494.length) {
                int var15 = this.field4494[arg2];
                if (var15 != 65535) {
                    class236 var16 = this.field4472.method2381((byte) 55, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1496(var17, -3)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1500(var17, -3)) {
                            var5 |= 0x100;
                        }
                        if (var16.method1497(var17, (byte) 56)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZIZ[I[IIII[III[IIB[II[[[BI)V")
    public static final void method2025(boolean arg0, int arg1, boolean arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, int[] arg11, int arg12, byte arg13, int[] arg14, int arg15, byte[][][] arg16, int arg17) {
        field4475++;
        if (class206.field2664 == -1) {
            return;
        }
        int[] var18 = class685.field9171.method532();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class206.field2664 == 1) {
            var23 = (int) ((double) class220.field2858 * (double) var21 / (double) class776.field10671);
            var24 = (int) ((double) class220.field2858 * (double) var22 / (double) class776.field10671);
        }
        if (!class132.field1818) {
            if (class206.field2664 == 1) {
                class676.method3726(arg9 - 10);
            }
            int var25 = arg5 - class37.field392;
            int var26 = arg17 - class75.field1019;
            int var27 = arg15 - class763.field10475;
            int var28 = (int) (((double) var27 * class27.field269 + (double) var25 * class191.field2480 + (double) var26 * class364.field5255) * (double) var23 / (double) arg1);
            int var29 = (int) (((double) var27 * class703.field9475 + (double) var25 * class492.field6926 + (double) var26 * class282.field4077) * (double) var24 / (double) arg1);
            double var30 = (double) var27 * class299.field4225 + (double) var25 * class344.field4807 + (double) var26 * class297.field4198;
            int var32 = class279.field4038 + var28 - class430.field6227;
            int var33 = class719.field9783 + var29 - class50.field566;
            int var34 = class265.field3899 + var32;
            int var35 = class220.field2858 + var33;
            if (!(var32 < 0 || var33 < 0 || var34 > class169.field2222 || class776.field10671 < var35) || class206.field2664 == 2) {
                if (class206.field2664 == 2) {
                    class412.field5879 = -var30;
                }
                class16.field155 = var32;
                class90.field1281 = var33;
            } else if (var34 > 0 && var35 > 0 && class169.field2222 > var32 && var33 < class776.field10671) {
                int var36 = var32 - class279.field4038;
                int var37 = var33 - class719.field9783;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class206.field2664 == 0) {
                    var39 = var37;
                    var38 = var36;
                    var42 = class412.field5879 + var30;
                } else if (class206.field2664 == 1) {
                    var40 = var36 / class533.field7397;
                    var41 = var37 / class607.field8210;
                    var38 = class533.field7397 * var40;
                    var39 = class607.field8210 * var41;
                    var42 = (class412.field5879 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                }
                double var44 = -var42;
                int var46 = 0;
                int var47 = 0;
                int var48 = 0;
                int var49 = 0;
                int var50 = 0;
                int var51 = 0;
                int var52;
                int var53;
                int var54;
                int var55;
                if (var38 < 0) {
                    var52 = 0;
                    var53 = class169.field2222 + var38;
                    var54 = -var38;
                    if (class206.field2664 == 1) {
                        var48 = 0;
                        var50 = -var40;
                    }
                    var55 = var54;
                } else {
                    var53 = class169.field2222 - var38;
                    var54 = 0;
                    if (class206.field2664 == 1) {
                        var48 = class1.field2 - var40;
                        var50 = var40;
                    }
                    var52 = var53;
                    var55 = var38;
                }
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 < 0) {
                    var56 = 0;
                    var57 = -var39;
                    var58 = class776.field10671 + var39;
                    var59 = var57;
                    var60 = var57;
                    if (class206.field2664 == 1) {
                        var46 = 0;
                        var47 = -var41;
                        var49 = var47;
                        var51 = class441.field6352 + var41;
                    }
                    var61 = var58;
                } else {
                    var58 = class776.field10671 - var39;
                    var57 = 0;
                    var59 = var39;
                    if (class206.field2664 == 1) {
                        var47 = var41;
                        var49 = 0;
                        var46 = class441.field6352 - var41;
                        var51 = var46;
                    }
                    var56 = var58;
                    var61 = var58;
                    var60 = 0;
                }
                class345 var62 = class422.field6071.field6769;
                for (class104 var63 = (class104) var62.method2189((byte) 64); var63 != null; var63 = (class104) var62.method2192(0)) {
                    class136[] var69 = var63.field1479;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class136 var72 = var69[var71];
                        int var73 = var72.field1842;
                        int var74 = var72.field1841;
                        int var75 = var72.field1843;
                        int var76 = var72.field1844;
                        int var77;
                        var72.field1841 = var77 = var74 - var39;
                        int var78 = var72.field1845;
                        int var79;
                        var72.field1843 = var79 = var75 - var38;
                        int var80;
                        var72.field1844 = var80 = var76 - var39;
                        int var81;
                        var72.field1842 = var81 = var73 - var38;
                        if (var70) {
                            int var82 = (var81 < var79 ? var81 : var79) - var78;
                            if (var82 <= class169.field2222) {
                                int var83 = (var80 > var77 ? var77 : var80) - var78;
                                if (var83 <= class776.field10671) {
                                    int var84 = var78 + (var81 < var79 ? var79 : var81);
                                    if (var84 >= 0) {
                                        int var85 = var78 + (var77 >= var80 ? var77 : var80);
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method3310(30305);
                        class207.method1354(var63, (byte) -11);
                    }
                }
                if (class206.field2664 == 0) {
                    class685.field9171.method554(class593.field8101);
                }
                class685.field9171.method497(-var38, -var39);
                class685.field9171.method499(var54, var57, var53, var58, var44);
                class127.method900(class412.field5879 + var44, false);
                class107.field1504 = class412.field5879 + var44;
                if (class206.field2664 == 1) {
                    class305.field4347 = var20 - class50.field566 - var39;
                    class303.field4254 = var23;
                    class427.field6211 = var19 - var38 - class430.field6227;
                    class619.field8375 = var24;
                    class685.field9171.method436(class427.field6211, class305.field4347, class303.field4254, class619.field8375);
                } else {
                    class427.field6211 = var19 + class279.field4038 - class430.field6227 - var38;
                    class305.field4347 = var20 + class719.field9783 - (class50.field566 + var39);
                    class619.field8375 = var24;
                    class303.field4254 = var23;
                    class685.field9171.method436(class427.field6211, class305.field4347, class303.field4254, class619.field8375);
                }
                class239.method1514(class422.field6071);
                if (var59 > 0) {
                    class685.field9171.method453(0, var56, class169.field2222, var56 + var59);
                    class685.field9171.method547();
                    class685.field9171.method493(class440.field6332);
                    class290.method1863(arg12, arg5, arg17, arg15, arg16, arg11, arg3, arg14, arg8, arg4, arg10, arg13, arg7, arg6, arg0, arg2, arg1, 1, false);
                }
                if (var55 > 0) {
                    class685.field9171.method453(var52, var60, var52 + var55, var60 + var61);
                    class685.field9171.method547();
                    class685.field9171.method493(class440.field6332);
                    class290.method1863(arg12, arg5, arg17, arg15, arg16, arg11, arg3, arg14, arg8, arg4, arg10, arg13, arg7, arg6, arg0, arg2, arg1, 1, false);
                }
                class685.field9171.method526();
                class137.method954();
                if (class206.field2664 == 0) {
                    class685.field9171.method514();
                }
                class430.field6227 += var38;
                class50.field566 += var39;
                class412.field5879 += var44;
                class90.field1281 = class719.field9783 + var29 - class50.field566;
                class16.field155 = class279.field4038 + var28 - class430.field6227;
                if (class206.field2664 == 1) {
                    class743.field10049 += var40;
                    class279.field4047 += var41;
                    for (int var64 = 0; var64 < class441.field6352; var64++) {
                        int var65 = class693.method3780(class279.field4047 + var64, class441.field6352, -441893025) * class1.field2;
                        for (int var66 = 0; var66 < class1.field2; var66++) {
                            int var67 = var65 + class693.method3780(class743.field10049 + var66, class1.field2, arg9 ^ 0xE5A93F5F);
                            boolean var68 = var46 <= var64 && (var46 + var47) > var64 || var64 >= var49 && var64 < var49 + var51 && var66 >= var48 && var48 + var50 > var66;
                            class204.field2635[var67].method3507(class533.field7397 * var66, class607.field8210 * var64, class533.field7397, class607.field8210, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class132.field1818 = true;
            }
        }
        if (class132.field1818) {
            class50.field566 = 0;
            class412.field5879 = 0.0D;
            class37.field392 = arg5;
            class16.field155 = class279.field4038;
            class75.field1019 = arg17;
            class763.field10475 = arg15;
            class430.field6227 = 0;
            class90.field1281 = class719.field9783;
            if (class206.field2664 == 0) {
                class685.field9171.method554(class593.field8101);
            }
            class685.field9171.method526();
            class685.field9171.method547();
            class685.field9171.method493(class440.field6332);
            class312.field4419.method823(class37.field392, class75.field1019, class763.field10475, class90.field1269, class325.field4611, class228.field2953);
            class685.field9171.method509(class312.field4419);
            if (class206.field2664 == 1) {
                class427.field6211 = var19;
                class619.field8375 = var24;
                class305.field4347 = var20;
                class303.field4254 = var23;
                class685.field9171.method436(class427.field6211, class305.field4347, class303.field4254, class619.field8375);
            } else {
                class427.field6211 = var19 + class279.field4038;
                class619.field8375 = var24;
                class303.field4254 = var23;
                class305.field4347 = var20 + class719.field9783;
                class685.field9171.method436(class427.field6211, class305.field4347, class303.field4254, class619.field8375);
            }
            class107.field1504 = 0.0D;
            class422.field6071.method2843(-127);
            class239.method1514(class422.field6071);
            class290.method1863(arg12, arg5, arg17, arg15, arg16, arg11, arg3, arg14, arg8, arg4, arg10, arg13, arg7, arg6, arg0, arg2, arg1, 1, false);
            class137.method954();
            class132.field1818 = false;
            if (class206.field2664 == 0) {
                class685.field9171.method514();
            }
            if (class206.field2664 == 1) {
                class379.method2367(-5073);
            }
        }
        if (class206.field2664 == arg9) {
            class593.field8101.method3505(class16.field155, class90.field1281, class265.field3899, class220.field2858, 0, 0, true, true);
        }
        class600.field8184++;
        class127.method900(class412.field5879, false);
        class212.field2762 = class412.field5879;
        if (class206.field2664 == 0 || class206.field2664 == 2) {
            if (class206.field2664 == 2) {
                class685.field9171.method493(class440.field6332);
                class685.field9171.method547();
            }
            class294.field4167 = var23;
            class148.field1998 = class279.field4038 + var19 - class16.field155 - class430.field6227;
            class701.field9275 = var24;
            class93.field1310 = var20 + class719.field9783 - class90.field1281 - class50.field566;
            class685.field9171.method436(class148.field1998, class93.field1310, class294.field4167, class701.field9275);
        } else if (class206.field2664 == 1) {
            class148.field1998 = var19 - class430.field6227;
            class93.field1310 = var20 - class50.field566;
            class294.field4167 = var23;
            class701.field9275 = var24;
            class685.field9171.method436(class148.field1998, class93.field1310, class294.field4167, class701.field9275);
            class685.field9171.method453(class16.field155, class90.field1281, class16.field155 + class265.field3899, class90.field1281 + class220.field2858);
        }
        class290.method1863(arg12, arg5, arg17, arg15, arg16, arg11, arg3, arg14, arg8, arg4, arg10, arg13, arg7, arg6, arg0, arg2, arg1, class206.field2664 == 2 ? 0 : 2, class206.field2664 == 1);
        class685.field9171.method526();
        class685.field9171.method436(var19, var20, var21, var22);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public final void method2026(int arg0) {
        if (this.field4481 == -1) {
            if (this.field4469 == null) {
                this.field4481 = 0;
            } else {
                this.field4481 = 2;
            }
        }
        field4460++;
        if (~this.field4489 != arg0) {
            return;
        }
        if (this.field4469 == null) {
            this.field4489 = 0;
        } else {
            this.field4489 = 2;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ldt;I)V")
    public final void method2027(class254 arg0, int arg1) {
        field4478++;
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var3 = arg0.method1731((byte) 64);
            if (var3 == 0) {
                return;
            }
            this.method2022(-3602, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)Lrd;")
    public static final class355 method2028(int arg0) {
        field4464++;
        class2 var1 = null;
        if (arg0 < 19) {
            return null;
        }
        class355 var2 = new class355(class426.field6204, 0);
        try {
            class621 var3 = class786.field10800.method1547((byte) 25, "", true);
            while (var3.field8405 == 0) {
                class171.method1152(1L, false);
            }
            if (var3.field8405 == 1) {
                var1 = (class2) var3.field8403;
                byte[] var4 = new byte[(int) var1.method12(-10565)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method7(var4.length - var5, var5, var4, 0);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class355(new class254(var4), class426.field6204, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method6(58);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIB)I")
    public static final int method2029(int arg0, int arg1, int arg2, byte arg3) {
        field4465++;
        if (class286.field4101 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg2 - class752.field10177;
        int var7 = arg0 - class752.field10178;
        for (class223 var8 = (class223) class752.field10168.method679((byte) -86); var8 != null; var8 = (class223) class752.field10168.method681(-60)) {
            if (var8.field2885 == arg1) {
                int var9 = var8.field2889;
                int var10 = var8.field2893;
                int var11 = class752.field10177 + var9 << 14 | var10 + class752.field10178;
                int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                if (var4 < 0 || var12 < var5) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        if (arg3 <= 85) {
            field4468 = -77;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Llf;Ljava/lang/String;II)Lie;")
    public static final class6 method2030(class250 arg0, String arg1, int arg2, int arg3) {
        field4482++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class607.field8214, 0);
        if (class607.field8214[0] != -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        } else if (arg3 == -15801) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class6(arg0, arg2, var4);
        } else {
            return null;
        }
    }
}
