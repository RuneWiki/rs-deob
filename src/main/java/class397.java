import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class397 extends class148 {

    @OriginalMember(owner = "client!af", name = "ub", descriptor = "Z")
    public boolean field5292 = true;

    @OriginalMember(owner = "client!af", name = "yb", descriptor = "[I")
    public static int[] field5296 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!af", name = "tb", descriptor = "J")
    public static long field5291 = 0L;

    @OriginalMember(owner = "client!af", name = "Rb", descriptor = "Lfv;")
    public static class108 field5315 = new class108(13, 0, 1, 0);

    @OriginalMember(owner = "client!af", name = "Tb", descriptor = "Lpca;")
    public static class653 field5317 = new class653(8);

    @OriginalMember(owner = "client!af", name = "Wb", descriptor = "I")
    public static int field5320 = -1;

    @OriginalMember(owner = "client!af", name = "nb", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!af", name = "ob", descriptor = "I")
    private int field5286;

    @OriginalMember(owner = "client!af", name = "pb", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!af", name = "qb", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!af", name = "rb", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!af", name = "sb", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!af", name = "vb", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!af", name = "wb", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!af", name = "xb", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!af", name = "zb", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!af", name = "Bb", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!af", name = "Cb", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!af", name = "Db", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!af", name = "Eb", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!af", name = "Fb", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!af", name = "Gb", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!af", name = "Hb", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!af", name = "Ib", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!af", name = "Jb", descriptor = "I")
    private int field5307;

    @OriginalMember(owner = "client!af", name = "Kb", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!af", name = "Lb", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!af", name = "Mb", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!af", name = "Nb", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!af", name = "Ob", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!af", name = "Pb", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!af", name = "Sb", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!af", name = "Ub", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!af", name = "Qb", descriptor = "Lhh;")
    public static class116 field5314;

    @OriginalMember(owner = "client!af", name = "Vb", descriptor = "Z")
    public static boolean field5319;

    @OriginalMember(owner = "client!af", name = "Ab", descriptor = "[I")
    public int[] field5298;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([Lba;Lq;[Lmr;I)V")
    public final void method381(class350[] arg0, class389 arg1, class130[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method904(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field5294;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIIIII)V")
    public static final void method2169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5313;
        class116.field1344 = arg1;
        class348.field4539 = arg3;
        class178.field2199 = arg0;
        class559.field7961 = arg4;
        class134.field1510 = arg5;
        class566.field8024 = arg2;
        if (arg6 >= -8) {
            method2169(111, -88, -75, -108, 70, -62, 34);
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(Z)V")
    public final void method329(boolean arg0) {
        this.field5292 = arg0;
        ++field5300;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(IIIIIII)V")
    private final void method2170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5304;
        if (~arg4 > -1) {
            arg4 = -arg4;
        }
        int var8 = arg1 << 8;
        int var9 = -arg4 + arg3;
        if (super.field1669 > var9) {
            var9 = super.field1669;
        }
        int var10 = arg4 - -1 + arg3;
        if (~super.field1692 > ~var10) {
            var10 = super.field1692;
        }
        if (arg6 != 16711935) {
            this.field5298 = null;
        }
        int var11 = var9;
        int var12 = arg4 * arg4;
        int var13 = 0;
        int var14 = arg3 - var9;
        int var15 = var14 * var14;
        if (arg3 > var10) {
            arg3 = var10;
        }
        int var16 = var15 - var14;
        int var17 = arg2 >>> 24;
        if (~arg5 == -1 || arg5 == 1 && ~var17 == -256) {
            while (~var11 > ~arg3) {
                while (~var16 >= ~var12 || var12 >= var15) {
                    var15 += var13 + var13;
                    var16 += var13++ + var13;
                }
                int var67 = arg0 - var13 - -1;
                if (super.field1667 > var67) {
                    var67 = super.field1667;
                }
                int var68 = arg0 + var13;
                if (super.field1676 < var68) {
                    var68 = super.field1676;
                }
                int var69 = var67 - -(super.field1694 * var11);
                for (int var70 = var67; ~var70 > ~var68; ++var70) {
                    if (~var8 > ~this.field5298[var69]) {
                        super.field1686[var69] = arg2;
                    }
                    ++var69;
                }
                ++var11;
                var15 -= var14-- - -var14;
                var16 -= var14 + var14;
            }
            int var58 = arg4;
            int var59 = var11 - arg3;
            int var60 = var59 * var59 + var12;
            int var61 = -arg4 + var60;
            int var62 = var60 - var59;
            while (~var10 < ~var11) {
                while (~var62 < ~var12 && ~var12 > ~var61) {
                    var62 -= var58-- - -var58;
                    var61 -= var58 - -var58;
                }
                int var63 = arg0 - var58;
                if (~var63 > ~super.field1667) {
                    var63 = super.field1667;
                }
                int var64 = arg0 + var58;
                if (super.field1676 - 1 < var64) {
                    var64 = super.field1676 + -1;
                }
                int var65 = var63 - -(super.field1694 * var11);
                ++var11;
                var62 += var59 + var59;
                for (int var66 = var63; var64 >= var66; ++var66) {
                    if (~this.field5298[var65] < ~var8) {
                        super.field1686[var65] = arg2;
                    }
                    ++var65;
                }
                var61 += var59++ - -var59;
            }
        } else if (~arg5 == -2) {
            int var18 = (16711935 & (16711935 & arg2) * var17 >> 8) + (var17 << 24) + ((16711792 & (arg2 & 65280) * var17) >> 8);
            int var19 = -var17 + 256;
            while (var11 < arg3) {
                while (var16 <= var12 || var12 >= var15) {
                    var15 += var13 + var13;
                    var16 += var13++ + var13;
                }
                int var31 = arg0 - var13 - -1;
                if (~var31 > ~super.field1667) {
                    var31 = super.field1667;
                }
                int var32 = arg0 + var13;
                if (~var32 < ~super.field1676) {
                    var32 = super.field1676;
                }
                int var33 = var31 - -(super.field1694 * var11);
                ++var11;
                var15 -= var14-- + var14;
                for (int var34 = var31; var32 > var34; ++var34) {
                    if (~this.field5298[var33] < ~var8) {
                        int var35 = super.field1686[var33];
                        int var36 = ((65280 & var35) * var19 >> 8 & 65280) + ((16711935 & var35) * var19 >> 8 & 16711935);
                        super.field1686[var33] = var18 + var36;
                    }
                    ++var33;
                }
                var16 -= var14 + var14;
            }
            int var20 = arg4;
            int var21 = -var14;
            int var22 = var21 * var21 + var12;
            int var23 = -arg4 + var22;
            int var24 = var22 - var21;
            while (~var11 > ~var10) {
                while (~var12 > ~var24 && ~var23 < ~var12) {
                    var24 -= var20-- + var20;
                    var23 -= var20 - -var20;
                }
                int var25 = -var20 + arg0;
                if (var25 < super.field1667) {
                    var25 = super.field1667;
                }
                int var26 = arg0 + var20;
                if (~var26 < ~(super.field1676 - 1)) {
                    var26 = super.field1676 - 1;
                }
                int var27 = var25 - -(super.field1694 * var11);
                var24 += var21 + var21;
                for (int var28 = var25; ~var28 >= ~var26; ++var28) {
                    if (var8 < this.field5298[var27]) {
                        int var29 = super.field1686[var27];
                        int var30 = (65280 & (var29 & 65280) * var19 >> 8) + ((var29 & 16711935) * var19 >> 8 & 16711935);
                        super.field1686[var27] = var18 + var30;
                    }
                    ++var27;
                }
                ++var11;
                var23 += var21++ + var21;
            }
        } else if (~arg5 != -3) {
            throw new IllegalArgumentException();
        } else {
            while (arg3 > var11) {
                while (~var16 >= ~var12 || var15 <= var12) {
                    var15 += var13 - -var13;
                    var16 += var13++ + var13;
                }
                int var50 = arg0 - var13 - -1;
                if (~super.field1667 < ~var50) {
                    var50 = super.field1667;
                }
                int var51 = arg0 + var13;
                if (~var51 < ~super.field1676) {
                    var51 = super.field1676;
                }
                int var52 = super.field1694 * var11 + var50;
                for (int var53 = var50; var51 > var53; ++var53) {
                    if (~var8 > ~this.field5298[var52]) {
                        int var54 = super.field1686[var52];
                        int var55 = arg2 + var54;
                        int var56 = (arg2 & 16711935) - -(var54 & 16711935);
                        int var57 = (-var56 + var55 & 65536) + (var56 & 16777472);
                        super.field1686[var52] = class139.method776(var57 - (var57 >>> 8), -var57 + var55);
                    }
                    ++var52;
                }
                var15 -= var14-- - -var14;
                ++var11;
                var16 -= var14 - -var14;
            }
            int var37 = -var14;
            int var38 = arg4;
            int var39 = var37 * var37 + var12;
            int var40 = var39 - arg4;
            int var41 = var39 - var37;
            while (~var11 > ~var10) {
                while (var41 > var12 && ~var40 < ~var12) {
                    var41 -= var38-- - -var38;
                    var40 -= var38 - -var38;
                }
                int var42 = -var38 + arg0;
                if (super.field1667 > var42) {
                    var42 = super.field1667;
                }
                int var43 = arg0 + var38;
                if (var43 > super.field1676 + -1) {
                    var43 = super.field1676 + -1;
                }
                int var44 = super.field1694 * var11 + var42;
                for (int var45 = var42; var43 >= var45; ++var45) {
                    if (~var8 > ~this.field5298[var44]) {
                        int var46 = super.field1686[var44];
                        int var47 = arg2 + var46;
                        int var48 = (arg2 & 16711935) + (var46 & 16711935);
                        int var49 = (-var48 + var47 & 65536) + (var48 & 16777472);
                        super.field1686[var44] = class139.method776(-var49 + var47, var49 - (var49 >>> 8));
                    }
                    ++var44;
                }
                ++var11;
                var41 += var37 + var37;
                var40 += var37++ + var37;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "H", descriptor = "()V")
    public final void method815() {
        super.field1690 = -super.field1666 + super.field1667;
        super.field1661 = super.field1669 - super.field1680;
        super.field1693 = -super.field1680 + super.field1692;
        ++field5311;
        super.field1659 = super.field1676 - super.field1666;
        for (int var1 = 0; var1 < super.field1658; ++var1) {
            class78 var5 = ((class217) super.field1657[var1]).field2620;
            var5.field799 = -super.field1669 + super.field1680;
            var5.field810 = super.field1676 - super.field1667;
            var5.field802 = super.field1692 - super.field1669;
            var5.field797 = -super.field1667 + super.field1666;
        }
        int var2 = super.field1694 * super.field1669 + super.field1667;
        for (int var3 = super.field1669; ~var3 > ~super.field1692; ++var3) {
            for (int var4 = 0; ~var4 > ~super.field1658; ++var4) {
                ((class217) super.field1657[var4]).field2620.field800[var3 - super.field1669] = var2;
            }
            var2 += super.field1694;
        }
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
    public final void method288(int arg0) {
        super.field1657[arg0].method1617(8191, Thread.currentThread());
        ++field5299;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILoa;)V")
    public static final void method2171(int arg0, class635 arg1) {
        ++field5287;
        if (!class215.field2615) {
            class536.method3046(arg0 ^ 51, arg1);
        } else {
            class325.method1845(arg1, 0);
        }
        if (arg0 != 2) {
            field5296 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V")
    public class397(Canvas arg0, class486 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method284(Canvas arg0) {
        if (arg0 != null) {
            class309 var2 = (class309) super.field1650.method3234((byte) -122, (long) arg0.hashCode());
            if (var2 != null) {
                super.field1652 = arg0;
                super.field1653 = var2;
                if (super.field1684 == null) {
                    super.field1694 = var2.field4012;
                    super.field1670 = var2.field4013;
                    super.field1686 = var2.field4007;
                    if (this.field5307 != super.field1694 || ~this.field5286 != ~super.field1670) {
                        this.field5286 = super.field1670;
                        this.field5307 = super.field1694;
                        this.field5298 = new int[this.field5307 * this.field5286];
                    }
                    this.method810();
                }
            }
        } else {
            super.field1652 = null;
            super.field1653 = null;
            if (super.field1684 == null) {
                this.field5307 = this.field5286 = 1;
                super.field1694 = super.field1670 = 1;
                super.field1686 = null;
                this.method810();
            }
        }
        ++field5318;
    }

    @OriginalMember(owner = "client!af", name = "I", descriptor = "()V")
    public static final void method2172() {
        if (class678.field9612 != null) {
            for (int var0 = 0; var0 < class678.field9612.length; ++var0) {
                for (int var1 = 0; var1 < class181.field2222; ++var1) {
                    for (int var2 = 0; var2 < class272.field3451; ++var2) {
                        if (class678.field9612[var0][var1][var2] != null) {
                            class678.field9612[var0][var1][var2].method1625((byte) 0);
                        }
                        class678.field9612[var0][var1][var2] = null;
                    }
                }
            }
        }
        class678.field9612 = null;
        class275.field3477 = null;
        if (class631.field8958 != null) {
            for (int var3 = 0; var3 < class631.field8958.length; ++var3) {
                for (int var4 = 0; var4 < class181.field2222; ++var4) {
                    for (int var5 = 0; var5 < class272.field3451; ++var5) {
                        if (class631.field8958[var3][var4][var5] != null) {
                            class631.field8958[var3][var4][var5].method1625((byte) 0);
                        }
                        class631.field8958[var3][var4][var5] = null;
                    }
                }
            }
        }
        class631.field8958 = null;
        class591.field8415 = null;
        class97.field1074 = null;
        class628.field8912 = null;
        class80.field849 = 0;
        if (class295.field3873 != null) {
            for (int var6 = 0; var6 < class80.field849; ++var6) {
                class295.field3873[var6] = null;
            }
        }
        if (class304.field3979 != null) {
            for (int var7 = 0; var7 < class474.field6910; ++var7) {
                class304.field3979[var7] = null;
            }
            class474.field6910 = 0;
        }
        if (class256.field3279 != null) {
            for (int var8 = 0; var8 < class112.field1296; ++var8) {
                class256.field3279[var8] = null;
            }
            for (int var9 = 0; var9 < class337.field4416; ++var9) {
                for (int var10 = 0; var10 < class181.field2222; ++var10) {
                    for (int var11 = 0; var11 < class272.field3451; ++var11) {
                        class2.field17[var9][var10][var11] = 0L;
                    }
                }
            }
            class112.field1296 = 0;
        }
        class110.field1270 = null;
        class351.method1945(0);
        class435.field5854.method85(25042);
        class217.field2625 = null;
        class398.field5323 = null;
        class425.field5651 = null;
        class81.field859 = null;
        class112.field1307 = null;
        class618.field8703 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIILwk;I)V")
    private final void method2173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class129 arg8, int arg9) {
        ++field5305;
        if (~arg4 < -1 && ~arg0 < -1) {
            int var11 = arg9 << 8;
            int var12 = 0;
            int var13 = 0;
            int var14 = arg8.field2652 + arg8.field2633 + arg8.field2648;
            int var15 = arg8.field2644 + arg8.field2631 - -arg8.field2639;
            int var16 = (var14 << 16) / arg4;
            int var17 = (var15 << 16) / arg0;
            if (~arg8.field2633 < -1) {
                int var18 = ((arg8.field2633 << 16) - -var16 - 1) / var16;
                arg7 += var18;
                var12 += var16 * var18 - (arg8.field2633 << 16);
            }
            if (~arg8.field2652 > ~var14) {
                arg4 = ((arg8.field2652 << 16) + var16 + -var12 + -1) / var16;
            }
            if (arg3 != -2937) {
                this.method300(58, -57, -27, 83, 61, -53, -27, 116, -75, -120);
            }
            if (arg8.field2644 > 0) {
                int var19 = ((arg8.field2644 << 16) + var17 + -1) / var17;
                arg6 += var19;
                var13 += var17 * var19 + -(arg8.field2644 << 16);
            }
            if (~arg8.field2631 > ~var15) {
                arg0 = ((arg8.field2631 << 16) - var13 + -1 - -var17) / var17;
            }
            int var20 = super.field1694 * arg6 + arg7;
            int var21 = super.field1694 - arg4;
            if (~super.field1692 > ~(arg0 + arg6)) {
                arg0 -= arg0 + arg6 + -super.field1692;
            }
            if (~arg6 > ~super.field1669) {
                int var22 = -arg6 + super.field1669;
                arg0 -= var22;
                var20 += super.field1694 * var22;
                var13 += var17 * var22;
            }
            if (arg4 + arg7 > super.field1676) {
                int var23 = arg7 - (-arg4 - -super.field1676);
                var21 += var23;
                arg4 -= var23;
            }
            if (super.field1667 > arg7) {
                int var24 = -arg7 + super.field1667;
                var20 += var24;
                arg4 -= var24;
                var21 += var24;
                var12 += var16 * var24;
            }
            if (arg5 == 0) {
                if (arg2 != 1) {
                    if (~arg2 == -1) {
                        int var25 = (16711680 & arg1) >> 16;
                        int var26 = (65280 & arg1) >> 8;
                        int var27 = 255 & arg1;
                        int var28 = var12;
                        for (int var29 = -arg0; var29 < 0; ++var29) {
                            int var30 = (var13 >> 16) * arg8.field2652;
                            for (int var31 = -arg4; var31 < 0; ++var31) {
                                if (~this.field5298[var20] < ~var11) {
                                    int var32 = arg8.field1456[(var12 >> 16) + var30];
                                    int var33 = -16777216 & (var32 & 16711680) * var25;
                                    int var34 = 16711680 & (65280 & var32) * var26;
                                    int var35 = (var32 & 255) * var27 & 65280;
                                    super.field1686[var20] = class139.method776(var35, class139.method776(var33, var34)) >>> 8;
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var13 += var17;
                            var12 = var28;
                            var20 += var21;
                        }
                    } else if (arg2 == 3) {
                        int var36 = var12;
                        for (int var37 = -arg0; var37 < 0; ++var37) {
                            int var38 = (var13 >> 16) * arg8.field2652;
                            for (int var39 = -arg4; var39 < 0; ++var39) {
                                if (this.field5298[var20] > var11) {
                                    int var40 = arg8.field1456[(var12 >> 16) + var38];
                                    int var41 = arg1 + var40;
                                    int var42 = (var40 & 16711935) - -(arg1 & 16711935);
                                    int var43 = (var42 & 16777472) - -(65536 & var41 - var42);
                                    super.field1686[var20] = class139.method776(var43 - (var43 >>> 8), -var43 + var41);
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var13 += var17;
                            var20 += var21;
                            var12 = var36;
                        }
                    } else if (~arg2 != -3) {
                        throw new IllegalArgumentException();
                    } else {
                        int var44 = arg1 >>> 24;
                        int var45 = -var44 + 256;
                        int var46 = (16711935 & arg1) * var45 & -16711936;
                        int var47 = 16711680 & (65280 & arg1) * var45;
                        int var48 = (var46 | var47) >>> 8;
                        int var49 = var12;
                        for (int var50 = -arg0; var50 < 0; ++var50) {
                            int var51 = (var13 >> 16) * arg8.field2652;
                            for (int var52 = -arg4; ~var52 > -1; ++var52) {
                                if (~this.field5298[var20] < ~var11) {
                                    int var53 = arg8.field1456[(var12 >> 16) + var51];
                                    int var54 = (var53 & 16711935) * var44 & -16711936;
                                    int var55 = 16711680 & (var53 & 65280) * var44;
                                    super.field1686[var20] = (class139.method776(var55, var54) >>> 8) + var48;
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var13 += var17;
                            var12 = var49;
                            var20 += var21;
                        }
                    }
                } else {
                    int var56 = var12;
                    for (int var57 = -arg0; var57 < 0; ++var57) {
                        int var58 = (var13 >> 16) * arg8.field2652;
                        var13 += var17;
                        for (int var59 = -arg4; var59 < 0; ++var59) {
                            if (var11 < this.field5298[var20]) {
                                super.field1686[var20] = arg8.field1456[(var12 >> 16) + var58];
                            }
                            var12 += var16;
                            ++var20;
                        }
                        var12 = var56;
                        var20 += var21;
                    }
                }
            } else if (~arg5 == -2) {
                if (~arg2 == -2) {
                    int var60 = var12;
                    for (int var61 = -arg0; ~var61 > -1; ++var61) {
                        int var62 = (var13 >> 16) * arg8.field2652;
                        for (int var63 = -arg4; ~var63 > -1; ++var63) {
                            if (this.field5298[var20] > var11) {
                                int var64 = arg8.field1456[(var12 >> 16) + var62];
                                int var65 = var64 >>> 24;
                                int var66 = 256 - var65;
                                int var67 = super.field1686[var20];
                                super.field1686[var20] = class203.method1246(var65 * class203.method1246(var64, 16711935) - -(class203.method1246(16711935, var67) * var66) >> 8, -65281) + class203.method1246(-16711936, var65 * (class203.method1246(-16711936, var64) >>> 8) + var66 * class203.method1246(var67 >>> 8, 16711935));
                            }
                            ++var20;
                            var12 += var16;
                        }
                        var13 += var17;
                        var12 = var60;
                        var20 += var21;
                    }
                } else if (arg2 == 0) {
                    int var68 = var12;
                    if ((arg1 & 16777215) == 16777215) {
                        for (int var69 = -arg0; var69 < 0; ++var69) {
                            int var70 = (var13 >> 16) * arg8.field2652;
                            for (int var71 = -arg4; ~var71 > -1; ++var71) {
                                if (this.field5298[var20] > var11) {
                                    int var72 = arg8.field1456[(var12 >> 16) + var70];
                                    int var73 = (arg1 >>> 24) * (var72 >>> 24) >> 8;
                                    int var74 = -var73 + 256;
                                    int var75 = super.field1686[var20];
                                    super.field1686[var20] = class203.method1246(16711680, var74 * class203.method1246(65280, var75) + class203.method1246(var72, 65280) * var73) + class203.method1246(var74 * class203.method1246(var75, 16711935) + var73 * class203.method1246(16711935, var72), -16711936) >> 8;
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var13 += var17;
                            var12 = var68;
                            var20 += var21;
                        }
                    } else {
                        int var76 = (16711680 & arg1) >> 16;
                        int var77 = arg1 >> 8 & 255;
                        int var78 = arg1 & 255;
                        for (int var79 = -arg0; var79 < 0; ++var79) {
                            int var80 = (var13 >> 16) * arg8.field2652;
                            var13 += var17;
                            for (int var81 = -arg4; var81 < 0; ++var81) {
                                if (~var11 > ~this.field5298[var20]) {
                                    int var82 = arg8.field1456[(var12 >> 16) - -var80];
                                    int var83 = (arg1 >>> 24) * (var82 >>> 24) >> 8;
                                    int var84 = -var83 + 256;
                                    if (~var83 == -256) {
                                        int var85 = (16711680 & var82) * var76 & -16777216;
                                        int var86 = 16711680 & (65280 & var82) * var77;
                                        int var87 = 65280 & (var82 & 255) * var78;
                                        super.field1686[var20] = class139.method776(class139.method776(var85, var86), var87) >>> 8;
                                    } else {
                                        int var88 = (16711680 & var82) * var76 & -16777216;
                                        int var89 = 16711680 & (var82 & 65280) * var77;
                                        int var90 = (var82 & 255) * var78 & 65280;
                                        int var91 = (var89 | var88 | var90) >>> 8;
                                        int var92 = super.field1686[var20];
                                        super.field1686[var20] = class203.method1246(-16711936, var84 * class203.method1246(16711935, var92) + class203.method1246(var91, 16711935) * var83) + class203.method1246(class203.method1246(var91, 65280) * var83 + class203.method1246(65280, var92) * var84, 16711680) >> 8;
                                    }
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var12 = var68;
                            var20 += var21;
                        }
                    }
                } else if (arg2 != 3) {
                    if (arg2 != 2) {
                        throw new IllegalArgumentException();
                    } else {
                        int var93 = arg1 >>> 24;
                        int var94 = -var93 + 256;
                        int var95 = (arg1 & 16711935) * var94 & -16711936;
                        int var96 = 16711680 & (65280 & arg1) * var94;
                        int var97 = (var95 | var96) >>> 8;
                        int var98 = var12;
                        for (int var99 = -arg0; ~var99 > -1; ++var99) {
                            int var100 = (var13 >> 16) * arg8.field2652;
                            for (int var101 = -arg4; ~var101 > -1; ++var101) {
                                if (this.field5298[var20] > var11) {
                                    int var102 = arg8.field1456[(var12 >> 16) + var100];
                                    int var103 = var102 >>> 24;
                                    int var104 = 16711680 & (65280 & var102) * var93;
                                    int var105 = -var103 + 256;
                                    int var106 = (var102 & 16711935) * var93 & -16711936;
                                    int var107 = ((var106 | var104) >>> 8) + var97;
                                    int var108 = super.field1686[var20];
                                    super.field1686[var20] = class203.method1246(-16711936, class203.method1246(16711935, var108) * var105 + class203.method1246(var107, 16711935) * var103) + class203.method1246(var105 * class203.method1246(65280, var108) + class203.method1246(var107, 65280) * var103, 16711680) >> 8;
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var13 += var17;
                            var12 = var98;
                            var20 += var21;
                        }
                    }
                } else {
                    int var109 = var12;
                    for (int var110 = -arg0; var110 < 0; ++var110) {
                        int var111 = (var13 >> 16) * arg8.field2652;
                        var13 += var17;
                        for (int var112 = -arg4; ~var112 > -1; ++var112) {
                            if (~this.field5298[var20] < ~var11) {
                                int var113 = arg8.field1456[(var12 >> 16) + var111];
                                int var114 = arg1 + var113;
                                int var115 = (arg1 & 16711935) + (var113 & 16711935);
                                int var116 = (var115 & 16777472) - -(var114 - var115 & 65536);
                                int var117 = var116 - (var116 >>> 8) | var114 - var116;
                                int var118 = (arg1 >>> 24) * (var117 >>> 24) >> 8;
                                int var119 = -var118 + 256;
                                if (var118 != 255) {
                                    int var121 = super.field1686[var20];
                                    var117 = ((var117 & 65280) * var118 + (var121 & 65280) * var119 & 16711680) + (-16711936 & (16711935 & var117) * var118 + (var121 & 16711935) * var119) >> 8;
                                }
                                super.field1686[var20] = var117;
                            }
                            ++var20;
                            var12 += var16;
                        }
                        var20 += var21;
                        var12 = var109;
                    }
                }
            } else if (~arg5 != -3) {
                throw new IllegalArgumentException();
            } else if (~arg2 != -2) {
                if (arg2 != 0) {
                    if (arg2 == 3) {
                        int var122 = var12;
                        for (int var123 = -arg0; var123 < 0; ++var123) {
                            int var124 = (var13 >> 16) * arg8.field2652;
                            var13 += var17;
                            for (int var125 = -arg4; var125 < 0; ++var125) {
                                if (this.field5298[var20] > var11) {
                                    int var126 = arg8.field1456[(var12 >> 16) - -var124];
                                    int var127 = arg1 + var126;
                                    int var128 = (arg1 & 16711935) + (16711935 & var126);
                                    int var129 = (16777472 & var128) - -(-var128 + var127 & 65536);
                                    int var130 = -(var129 >>> 8) + var129 | -var129 + var127;
                                    int var131 = super.field1686[var20];
                                    int var132 = (var130 & 16711935) - -(16711935 & var131);
                                    int var133 = var130 - -var131;
                                    int var134 = (65536 & var133 - var132) + (16777472 & var132);
                                    super.field1686[var20] = class139.method776(var133 - var134, -(var134 >>> 8) + var134);
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var20 += var21;
                            var12 = var122;
                        }
                    } else if (arg2 != 2) {
                        throw new IllegalArgumentException();
                    } else {
                        int var135 = arg1 >>> 24;
                        int var136 = 256 - var135;
                        int var137 = -16711936 & (16711935 & arg1) * var136;
                        int var138 = (arg1 & 65280) * var136 & 16711680;
                        int var139 = (var138 | var137) >>> 8;
                        int var140 = var12;
                        for (int var141 = -arg0; ~var141 > -1; ++var141) {
                            int var142 = (var13 >> 16) * arg8.field2652;
                            for (int var143 = -arg4; ~var143 > -1; ++var143) {
                                if (~var11 > ~this.field5298[var20]) {
                                    int var144 = arg8.field1456[(var12 >> 16) + var142];
                                    if (~var144 != -1) {
                                        int var145 = (var144 & 65280) * var135 & 16711680;
                                        int var146 = -16711936 & (16711935 & var144) * var135;
                                        int var147 = ((var146 | var145) >>> 8) + var139;
                                        int var148 = super.field1686[var20];
                                        int var149 = var147 + var148;
                                        int var150 = (var147 & 16711935) + (var148 & 16711935);
                                        int var151 = (-var150 + var149 & 65536) + (16777472 & var150);
                                        super.field1686[var20] = class139.method776(-var151 + var149, var151 - (var151 >>> 8));
                                    }
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var13 += var17;
                            var12 = var140;
                            var20 += var21;
                        }
                    }
                } else {
                    int var152 = var12;
                    int var153 = arg1 >> 16 & 255;
                    int var154 = 255 & arg1 >> 8;
                    int var155 = arg1 & 255;
                    for (int var156 = -arg0; ~var156 > -1; ++var156) {
                        int var157 = (var13 >> 16) * arg8.field2652;
                        for (int var158 = -arg4; ~var158 > -1; ++var158) {
                            if (var11 < this.field5298[var20]) {
                                int var159 = arg8.field1456[(var12 >> 16) - -var157];
                                if (~var159 != -1) {
                                    int var160 = (16711680 & var159) * var153 & -16777216;
                                    int var161 = 16711680 & (var159 & 65280) * var154;
                                    int var162 = (var159 & 255) * var155 & 65280;
                                    int var163 = (var162 | var160 | var161) >>> 8;
                                    int var164 = super.field1686[var20];
                                    int var165 = var163 - -var164;
                                    int var166 = (var163 & 16711935) - -(16711935 & var164);
                                    int var167 = (-var166 + var165 & 65536) + (var166 & 16777472);
                                    super.field1686[var20] = class139.method776(var167 - (var167 >>> 8), -var167 + var165);
                                }
                            }
                            var12 += var16;
                            ++var20;
                        }
                        var13 += var17;
                        var20 += var21;
                        var12 = var152;
                    }
                }
            } else {
                int var168 = var12;
                for (int var169 = -arg0; ~var169 > -1; ++var169) {
                    int var170 = (var13 >> 16) * arg8.field2652;
                    var13 += var17;
                    for (int var171 = -arg4; var171 < 0; ++var171) {
                        if (this.field5298[var20] > var11) {
                            int var172 = arg8.field1456[(var12 >> 16) + var170];
                            if (~var172 != -1) {
                                int var173 = super.field1686[var20];
                                int var174 = var172 - -var173;
                                int var175 = (var172 & 16711935) + (16711935 & var173);
                                int var176 = (var174 - var175 & 65536) + (var175 & 16777472);
                                super.field1686[var20] = class139.method776(-(var176 >>> 8) + var176, -var176 + var174);
                            }
                        }
                        ++var20;
                        var12 += var16;
                    }
                    var20 += var21;
                    var12 = var168;
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lqda;IIII)Lba;")
    public final class350 method375(class90 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5297;
        return new class96(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5290;
        class217 var11 = (class217) this.method814(Thread.currentThread());
        class78 var12 = var11.field2620;
        var12.field801 = arg0 < 0 || ~var12.field810 > ~arg0 || ~arg2 > -1 || ~arg2 < ~var12.field810 || arg4 < 0 || arg4 > var12.field810;
        var12.field811 = false;
        int var13 = arg2 - super.field1690;
        int var14 = arg3 - super.field1661;
        int var15 = arg5 - super.field1661;
        int var16 = arg4 - super.field1690;
        int var17 = arg1 - super.field1661;
        int var18 = arg0 - super.field1690;
        int var19 = arg6 >>> 24;
        if (~arg9 != -1 && (~arg9 != -2 || ~var19 != -256)) {
            if (~arg9 != -2) {
                if (~arg9 != -3) {
                    throw new IllegalArgumentException();
                }
                var12.field798 = 128;
                var12.field807 = true;
                var12.method486(var17, var14, var15, var18, var13, var16, 100, 100, 100, arg6, arg7, arg8);
            } else {
                var12.field798 = 255 - var19;
                var12.field807 = false;
                var12.method486(var17, var14, var15, var18, var13, var16, 100, 100, 100, arg6, arg7, arg8);
            }
        } else {
            var12.field807 = false;
            var12.field798 = 0;
            var12.method486(var17, var14, var15, var18, var13, var16, 100, 100, 100, arg6, arg7, arg8);
        }
        var12.field811 = true;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIIIIIIII)V")
    public final void method809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5310;
        if (arg3 != 0 && arg4 != 0) {
            if (~arg6 != -65536 && !super.field8990.method846((byte) -123, arg6).field5492) {
                if (super.field1698 != arg6) {
                    class458 var11 = (class458) super.field1691.method3690((byte) 126, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method811(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method804(arg6) ? 64 : 128;
                        var11 = this.method326(var12, 0, var13, var13, var13);
                        super.field1691.method3683(var11, (byte) 97, (long) arg6);
                    }
                    super.field1699 = var11;
                    super.field1698 = arg6;
                }
                this.method2173(arg4 << 1, arg7, arg8, -2937, arg3 << 1, arg9, arg1 - arg4, arg0 - arg3, (class129) super.field1699, arg2);
            } else {
                this.method2170(arg0, arg2, arg7, arg1, arg3, arg9, 16711935);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([Lba;Ltg;Lq;[Lmr;I)V")
    public final void method373(class350[] arg0, class211 arg1, class389 arg2, class130[] arg3, int arg4) {
        ++field5301;
        for (int var6 = 0; arg0.length > var6; ++var6) {
            if (arg0[var6] != null) {
                ((class158) arg0[var6]).method907(arg2, arg3 == null ? null : arg3[var6], arg1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)V")
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5309;
        class217 var8 = (class217) this.method814(Thread.currentThread());
        class78 var9 = var8.field2620;
        int var10 = -arg0 + arg2;
        int var11 = -arg1 + arg3;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = ~var11 <= -1 ? var11 : -var11;
        int var14 = var12;
        if (var13 > var12) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var15 >> 16) + var10;
            int var17 = (var11 << 16) / var14;
            int var18 = (var17 >> 16) + var11;
            if (~var17 >= ~var15) {
                var15 = -var15;
            } else {
                var17 = -var17;
            }
            int var19 = arg5 * var17 >> 17;
            int var20 = arg5 * var17 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg0 - var9.method494();
            int var23 = arg5 * var15 + 1 >> 17;
            int var24 = arg1 - var9.method502();
            int var25 = var19 + var22;
            int var26 = var22 - var20;
            int var27 = var16 + var22 + -var20;
            int var28 = var22 - -var16 + var19;
            int var29 = var24 - -var21;
            int var30 = -var23 + var24;
            int var31 = var18 + var24 + -var23;
            int var32 = var21 + var24 + var18;
            if (arg6 == 0) {
                var9.field798 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field798 = -(arg4 >>> 24) + 255;
            }
            var9.field801 = ~var25 > -1 || ~var25 < ~var9.field810 || var26 < 0 || var26 > var9.field810 || ~var27 > -1 || ~var9.field810 > ~var27;
            var9.method505(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field801 = ~var25 > -1 || ~var25 < ~var9.field810 || ~var27 > -1 || var27 > var9.field810 || ~var28 > -1 || var9.field810 < var28;
            var9.method505(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
    public final void method322(int arg0) {
        ++field5303;
        super.field1657[arg0].method1617(8191, (Runnable) null);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static void method2174(byte arg0) {
        field5296 = null;
        field5317 = null;
        field5314 = null;
        field5315 = null;
        if (arg0 != 86) {
            field5315 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lvp;Lne;)V")
    public static final void method2175(class172 arg0, class287 arg1) {
        if (arg1.field3695) {
            short var2 = arg1.field3676;
            short var3 = arg1.field3675;
            byte var4 = arg1.field3684;
            byte var5 = arg1.field3685;
            int var6 = (var2 << class8.field70) + class389.field5194;
            int var7 = (var3 << class8.field70) + class389.field5194;
            class287[][] var8 = class97.field1074[var4];
            if (class628.field8912 == class591.field8415) {
                class618.field8703.method299(class275.field3477[0].method242(var6, var7), class577.method3264(var2, var3), class172.method1017(var2, var3), class535.method3044(var2, var3));
            }
            if (arg1.field3682) {
                if (class526.field7524) {
                    if (var4 > 0) {
                        class287 var9 = class97.field1074[var4 - 1][var2][var3];
                        if (var9 != null && var9.field3695) {
                            return;
                        }
                    }
                    if (var2 <= class325.field4238 && var2 > class650.field9307) {
                        class287 var10 = var8[var2 - 1][var3];
                        if (var10 != null && var10.field3695 && (var10.field3682 || (arg1.field3679 & 1) == 0)) {
                            return;
                        }
                    }
                    if (var2 >= class325.field4238 && var2 < class648.field9178 - 1) {
                        class287 var11 = var8[var2 + 1][var3];
                        if (var11 != null && var11.field3695 && (var11.field3682 || (arg1.field3679 & 4) == 0)) {
                            return;
                        }
                    }
                    if (var3 <= class75.field789 && var3 > class147.field1649) {
                        class287 var12 = var8[var2][var3 - 1];
                        if (var12 != null && var12.field3695 && (var12.field3682 || (arg1.field3679 & 8) == 0)) {
                            return;
                        }
                    }
                    if (var3 >= class75.field789 && var3 < class585.field8323 - 1) {
                        class287 var13 = var8[var2][var3 + 1];
                        if (var13 != null && var13.field3695 && (var13.field3682 || (arg1.field3679 & 2) == 0)) {
                            return;
                        }
                    }
                } else {
                    class526.field7524 = true;
                }
                arg1.field3682 = false;
                if (arg1.field3688 != null) {
                    class287 var14 = arg1.field3688;
                    if (!class601.method3362(var14.field3685, var2, var3)) {
                        class628.field8912[var14.field3685].method252(var2, var3);
                    }
                    class244 var15 = var14.field3697;
                    if (var15 != null) {
                        if (class603.field8547) {
                            if ((var15.field3158 & arg1.field3694) != 0) {
                                class157.method857(arg0, var15.field3158, var5, var2, var3);
                            } else {
                                class66.method434(arg0, var4, var2, var3);
                            }
                            class618.field8703.method355(arg0.field2054, arg0.field2056);
                        }
                        var15.method442(class618.field8703, 0);
                    }
                    for (class60 var16 = var14.field3680; var16 != null; var16 = var16.field623) {
                        class354 var17 = var16.field625;
                        if (var17 != null) {
                            if (class603.field8547) {
                                class66.method434(arg0, var4, var2, var3);
                                class618.field8703.method355(arg0.field2054, arg0.field2056);
                            }
                            var17.method442(class618.field8703, 0);
                        }
                    }
                }
                boolean var18 = !class601.method3362(var5, var2, var3);
                if (var18) {
                    class628.field8912[var5].method252(var2, var3);
                    class344 var19 = arg1.field3686;
                    if (var19 != null && var19.field4473) {
                        if (class603.field8547) {
                            class66.method434(arg0, var4, var2, var3);
                            class618.field8703.method355(arg0.field2054, arg0.field2056);
                        }
                        class231 var20 = var19.method442(class618.field8703, 0);
                        if (var20 != null) {
                            var20.field2949 = var19;
                            var20.field2943 = var4;
                            var20.field2950 = var2;
                            var20.field2948 = var3;
                            class435.field5854.method87(123, var20);
                        }
                    }
                }
                int var21 = 0;
                int var22 = 0;
                class244 var23 = arg1.field3697;
                class599 var24 = arg1.field3678;
                if (var23 != null || var24 != null) {
                    if (class325.field4238 == var2) {
                        ++var21;
                    } else if (class325.field4238 < var2) {
                        var21 += 2;
                    }
                    if (class75.field789 == var3) {
                        var21 += 3;
                    } else if (class75.field789 > var3) {
                        var21 += 6;
                    }
                    var22 = class377.field4907[var21];
                    arg1.field3694 = class508.field7312[var21];
                }
                if (var23 != null) {
                    if ((var23.field3158 & class90.field1040[var21]) != 0) {
                        if (var23.field3158 == 16) {
                            arg1.field3691 = 3;
                            arg1.field3692 = class112.field1308[var21];
                            arg1.field3689 = (byte) (3 - arg1.field3692);
                        } else if (var23.field3158 == 32) {
                            arg1.field3691 = 6;
                            arg1.field3692 = class27.field332[var21];
                            arg1.field3689 = (byte) (6 - arg1.field3692);
                        } else if (var23.field3158 == 64) {
                            arg1.field3691 = 12;
                            arg1.field3692 = class151.field1723[var21];
                            arg1.field3689 = (byte) (12 - arg1.field3692);
                        } else {
                            arg1.field3691 = 9;
                            arg1.field3692 = class545.field7800[var21];
                            arg1.field3689 = (byte) (9 - arg1.field3692);
                        }
                    } else {
                        arg1.field3691 = 0;
                    }
                    if ((var23.field3158 & var22) != 0 && !class542.method3078(var5, var2, var3, var23.field3158)) {
                        if (class603.field8547) {
                            class66.method434(arg0, var4, var2, var3);
                            class618.field8703.method355(arg0.field2054, arg0.field2056);
                        }
                        class231 var25 = var23.method442(class618.field8703, 0);
                        if (var25 != null) {
                            var25.field2949 = var23;
                            var25.field2943 = var4;
                            var25.field2950 = var2;
                            var25.field2948 = var3;
                            class435.field5854.method87(88, var25);
                        }
                    }
                    class244 var26 = arg1.field3690;
                    if (var26 != null && (var26.field3158 & var22) != 0 && !class542.method3078(var5, var2, var3, var26.field3158)) {
                        if (class603.field8547) {
                            class66.method434(arg0, var4, var2, var3);
                            class618.field8703.method355(arg0.field2054, arg0.field2056);
                        }
                        class231 var27 = var26.method442(class618.field8703, 0);
                        if (var27 != null) {
                            var27.field2949 = var26;
                            var27.field2943 = var4;
                            var27.field2950 = var2;
                            var27.field2948 = var3;
                            class435.field5854.method87(120, var27);
                        }
                    }
                }
                if (var24 != null && !class666.method3736(var5, var2, var3, var24.method1923(true))) {
                    class599 var28 = arg1.field3677;
                    if ((var24.field8512 & var22) != 0) {
                        if (class603.field8547) {
                            class66.method434(arg0, var4, var2, var3);
                            class618.field8703.method355(arg0.field2054, arg0.field2056);
                        }
                        class231 var29 = var24.method442(class618.field8703, 0);
                        if (var29 != null) {
                            var29.field2949 = var24;
                            var29.field2943 = var4;
                            var29.field2950 = var2;
                            var29.field2948 = var3;
                            class435.field5854.method87(94, var29);
                        }
                    } else if (var24.field8512 == 256) {
                        int var30 = var24.field8515 - class461.field6410;
                        int var31 = var24.field8506 - class351.field4599;
                        int var32 = var24.field8511;
                        int var33;
                        if (var32 != 1 && var32 != 2) {
                            var33 = var30;
                        } else {
                            var33 = -var30;
                        }
                        int var34;
                        if (var32 != 2 && var32 != 3) {
                            var34 = var31;
                        } else {
                            var34 = -var31;
                        }
                        if (class603.field8547) {
                            class66.method434(arg0, var4, var2, var3);
                            class618.field8703.method355(arg0.field2054, arg0.field2056);
                        }
                        if (var34 < var33) {
                            class231 var35 = var24.method442(class618.field8703, 0);
                            if (var35 != null) {
                                var35.field2949 = var24;
                                var35.field2943 = var4;
                                var35.field2950 = var2;
                                var35.field2948 = var3;
                                class435.field5854.method87(125, var35);
                            }
                        } else if (var28 != null) {
                            class231 var36 = var28.method442(class618.field8703, 0);
                            if (var36 != null) {
                                var36.field2949 = var28;
                                var36.field2943 = var4;
                                var36.field2950 = var2;
                                var36.field2948 = var3;
                                class435.field5854.method87(85, var36);
                            }
                        }
                    }
                }
                if (var18) {
                    class344 var37 = arg1.field3686;
                    if (var37 != null && !var37.field4473) {
                        if (class603.field8547) {
                            class66.method434(arg0, var4, var2, var3);
                            class618.field8703.method355(arg0.field2054, arg0.field2056);
                        }
                        class231 var38 = var37.method442(class618.field8703, 0);
                        if (var38 != null) {
                            var38.field2949 = var37;
                            var38.field2943 = var4;
                            var38.field2950 = var2;
                            var38.field2948 = var3;
                            class435.field5854.method87(120, var38);
                        }
                    }
                    class139 var39 = arg1.field3687;
                    if (var39 != null && !var39.field1591) {
                        if (class603.field8547) {
                            class66.method434(arg0, var4, var2, var3);
                            class618.field8703.method355(arg0.field2054, arg0.field2056);
                        }
                        class231 var40 = var39.method442(class618.field8703, 0);
                        if (var40 != null) {
                            var40.field2949 = var39;
                            var40.field2943 = var4;
                            var40.field2950 = var2;
                            var40.field2948 = var3;
                            class435.field5854.method87(93, var40);
                        }
                    }
                }
                byte var41 = arg1.field3679;
                if (var41 != 0) {
                    if (var2 < class325.field4238 && (var41 & 4) != 0) {
                        class287 var42 = var8[var2 + 1][var3];
                        if (var42 != null && var42.field3695) {
                            class81.field859.method1409(0, var42);
                        }
                    }
                    if (var3 < class75.field789 && (var41 & 2) != 0) {
                        class287 var43 = var8[var2][var3 + 1];
                        if (var43 != null && var43.field3695) {
                            class81.field859.method1409(0, var43);
                        }
                    }
                    if (var2 > class325.field4238 && (var41 & 1) != 0) {
                        class287 var44 = var8[var2 - 1][var3];
                        if (var44 != null && var44.field3695) {
                            class81.field859.method1409(0, var44);
                        }
                    }
                    if (var3 > class75.field789 && (var41 & 8) != 0) {
                        class287 var45 = var8[var2][var3 - 1];
                        if (var45 != null && var45.field3695) {
                            class81.field859.method1409(0, var45);
                        }
                    }
                }
            }
            if (arg1.field3691 != 0) {
                boolean var46 = true;
                for (class60 var47 = arg1.field3680; var47 != null; var47 = var47.field623) {
                    if (class419.field5577 != var47.field625.field4643 && (var47.field624 & arg1.field3691) == arg1.field3692) {
                        var46 = false;
                        break;
                    }
                }
                if (var46) {
                    class244 var48 = arg1.field3697;
                    if (!class542.method3078(var5, var2, var3, var48.field3158)) {
                        if (class603.field8547) {
                            label663: {
                                if (var48.field3158 >= 16) {
                                    int var49 = var2 - class325.field4238;
                                    int var50 = var3 - class75.field789;
                                    if (var48.field3158 == 16) {
                                        int var51 = var49 - class389.field5194;
                                        int var52 = class389.field5194 + var50;
                                        if (var52 < var51 && var2 > 0 && var3 <= class272.field3451) {
                                            class66.method434(arg0, var4, var2 - 1, var3 + 1);
                                            break label663;
                                        }
                                    } else if (var48.field3158 == 32) {
                                        int var53 = class389.field5194 + var49;
                                        int var54 = class389.field5194 + var50;
                                        if (var54 < -var53 && var2 < class181.field2222 && var3 < class272.field3451) {
                                            class66.method434(arg0, var4, var2 + 1, var3 + 1);
                                            break label663;
                                        }
                                    } else if (var48.field3158 == 64) {
                                        int var55 = class389.field5194 + var49;
                                        int var56 = var50 - class389.field5194;
                                        if (var56 > var55 && var2 < class181.field2222 && var3 > 0) {
                                            class66.method434(arg0, var4, var2 + 1, var3 - 1);
                                            break label663;
                                        }
                                    } else if (var48.field3158 == 128) {
                                        int var57 = var49 - class389.field5194;
                                        int var58 = var50 - class389.field5194;
                                        if (var58 > -var57 && var2 > 0 && var3 > 0) {
                                            class66.method434(arg0, var4, var2 - 1, var3 - 1);
                                            break label663;
                                        }
                                    }
                                }
                                class66.method434(arg0, var4, var2, var3);
                            }
                            class618.field8703.method355(arg0.field2054, arg0.field2056);
                        }
                        class231 var59 = var48.method442(class618.field8703, 0);
                        if (var59 != null) {
                            var59.field2949 = var48;
                            var59.field2943 = var4;
                            var59.field2950 = var2;
                            var59.field2948 = var3;
                            class435.field5854.method87(100, var59);
                        }
                    }
                    arg1.field3691 = 0;
                }
            }
            if (arg1.field3693) {
                try {
                    arg1.field3693 = false;
                    int var60 = 0;
                    label606: for (class60 var61 = arg1.field3680; var61 != null; var61 = var61.field623) {
                        class354 var62 = var61.field625;
                        if (class419.field5577 != var62.field4643) {
                            for (int var63 = var62.field4642; var63 <= var62.field4645; ++var63) {
                                for (int var64 = var62.field4648; var64 <= var62.field4639; ++var64) {
                                    class287 var65 = var8[var63][var64];
                                    if (var65.field3682) {
                                        arg1.field3693 = true;
                                        continue label606;
                                    }
                                    if (var65.field3691 != 0) {
                                        int var66 = 0;
                                        if (var63 > var62.field4642) {
                                            ++var66;
                                        }
                                        if (var63 < var62.field4645) {
                                            var66 += 4;
                                        }
                                        if (var64 > var62.field4648) {
                                            var66 += 8;
                                        }
                                        if (var64 < var62.field4639) {
                                            var66 += 2;
                                        }
                                        if ((var66 & var65.field3691) == arg1.field3689) {
                                            arg1.field3693 = true;
                                            continue label606;
                                        }
                                    }
                                }
                            }
                            int var67 = class325.field4238 - var62.field4642;
                            int var68 = var62.field4645 - class325.field4238;
                            if (var68 > var67) {
                                var67 = var68;
                            }
                            int var69 = class75.field789 - var62.field4648;
                            int var70 = var62.field4639 - class75.field789;
                            if (var70 > var69) {
                                var69 = var70;
                            }
                            arg0.field2051[var60] = var62;
                            arg0.field2057[var60++] = var67 + var69;
                        }
                    }
                    while (var60 > 0) {
                        int var71 = -50;
                        int var72 = -1;
                        for (int var73 = 0; var73 < var60; ++var73) {
                            class354 var74 = arg0.field2051[var73];
                            if (class419.field5577 != var74.field4643) {
                                int var75 = arg0.field2057[var73];
                                if (var75 > var71) {
                                    var71 = var75;
                                    var72 = var73;
                                } else if (var71 == var75) {
                                    int var76 = var74.field4641 - class461.field6410;
                                    int var77 = var74.field4647 - class351.field4599;
                                    int var78 = arg0.field2051[var72].field4641 - class461.field6410;
                                    int var79 = arg0.field2051[var72].field4647 - class351.field4599;
                                    if (var76 * var76 + var77 * var77 > var78 * var78 + var79 * var79) {
                                        var72 = var73;
                                    }
                                }
                            }
                        }
                        if (var72 == -1) {
                            break;
                        }
                        class354 var80 = arg0.field2051[var72];
                        var80.field4643 = class419.field5577;
                        if (!class259.method1472(var5, var80.field4642, var80.field4645, var80.field4648, var80.field4639, var80.method740(-85))) {
                            if (class603.field8547) {
                                if (var80.field4650 != 0) {
                                    class66.method434(arg0, var4, var2, var3);
                                    int var81 = var2 - class325.field4238;
                                    int var82 = var3 - class75.field789;
                                    if (var80.field4650 == 2) {
                                        if (var82 > -var81) {
                                            class574.method3248(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                        } else {
                                            class574.method3248(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                        }
                                    } else if (var82 > var81) {
                                        class574.method3248(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                    } else {
                                        class574.method3248(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                    }
                                } else {
                                    class375.method2060(arg0, var4, var80.field4642, var80.field4648, var80.field4645, var80.field4639);
                                }
                                class618.field8703.method355(arg0.field2054, arg0.field2056);
                            }
                            class231 var83 = var80.method442(class618.field8703, 0);
                            if (var83 != null) {
                                var83.field2949 = var80;
                                var83.field2943 = var4;
                                var83.field2950 = var80.field4642;
                                var83.field2948 = var80.field4648;
                                class435.field5854.method87(81, var83);
                            }
                        }
                        for (int var84 = var80.field4642; var84 <= var80.field4645; ++var84) {
                            for (int var85 = var80.field4648; var85 <= var80.field4639; ++var85) {
                                class287 var86 = var8[var84][var85];
                                if (var86.field3691 != 0) {
                                    class81.field859.method1409(0, var86);
                                } else if ((var2 != var84 || var3 != var85) && var86.field3695) {
                                    class81.field859.method1409(0, var86);
                                }
                            }
                        }
                    }
                    if (arg1.field3693) {
                        return;
                    }
                } catch (Exception var121) {
                    arg1.field3693 = false;
                }
            }
            if (arg1.field3681 != null && (byte) (class555.field7906 & 255) == arg1.field3683) {
                class211 var87 = arg1.field3681;
                int var88 = class628.field8912[var4].method253(var2, var3);
                int var89;
                if (var4 < class337.field4416 - 1) {
                    var89 = class628.field8912[var4].method253(var2, var3) - class628.field8912[var4 + 1].method253(var2, var3);
                } else {
                    var89 = 8 << class8.field70;
                }
                class112.field1307.method236(var6, var88, var7, arg0.field2059);
                int var90 = arg0.field2059[2];
                class112.field1307.method236(var6, var88 - var89, var7, arg0.field2059);
                int var91 = arg0.field2059[2];
                int var92 = var90;
                int var93 = var91;
                if (var90 > var91) {
                    var92 = var91;
                    var93 = var90;
                }
                int var94 = var92 - class536.field7662;
                int var95 = class536.field7662 + var93;
                var87.field2563 = var94;
                var87.field2560 = var95;
                var87.field2562 = true;
                class618.field8703.method283(var87);
            }
            if (arg1.field3695) {
                if (arg1.field3691 != 0) {
                    return;
                }
                if (var2 <= class325.field4238 && var2 > class650.field9307) {
                    class287 var96 = var8[var2 - 1][var3];
                    if (var96 != null && var96.field3695) {
                        return;
                    }
                }
                if (var2 >= class325.field4238 && var2 < class648.field9178 - 1) {
                    class287 var97 = var8[var2 + 1][var3];
                    if (var97 != null && var97.field3695) {
                        return;
                    }
                }
                if (var3 <= class75.field789 && var3 > class147.field1649) {
                    class287 var98 = var8[var2][var3 - 1];
                    if (var98 != null && var98.field3695) {
                        return;
                    }
                }
                if (var3 >= class75.field789 && var3 < class585.field8323 - 1) {
                    class287 var99 = var8[var2][var3 + 1];
                    if (var99 != null && var99.field3695) {
                        return;
                    }
                }
                arg1.field3695 = false;
                --class195.field2336;
                class139 var100 = arg1.field3687;
                if (var100 != null && var100.field1591) {
                    if (class603.field8547) {
                        class66.method434(arg0, var4, var2, var3);
                        class618.field8703.method355(arg0.field2054, arg0.field2056);
                    }
                    class231 var101 = var100.method442(class618.field8703, 0);
                    if (var101 != null) {
                        var101.field2949 = var100;
                        var101.field2943 = var4;
                        var101.field2950 = var2;
                        var101.field2948 = var3;
                        class435.field5854.method87(74, var101);
                    }
                }
                if (arg1.field3694 != 0) {
                    class599 var102 = arg1.field3678;
                    if (var102 != null && !class666.method3736(var5, var2, var3, var102.method1923(true))) {
                        if ((var102.field8512 & arg1.field3694) != 0) {
                            if (class603.field8547) {
                                class66.method434(arg0, var4, var2, var3);
                                class618.field8703.method355(arg0.field2054, arg0.field2056);
                            }
                            class231 var103 = var102.method442(class618.field8703, 0);
                            if (var103 != null) {
                                var103.field2949 = var102;
                                var103.field2943 = var4;
                                var103.field2950 = var2;
                                var103.field2948 = var3;
                                class435.field5854.method87(96, var103);
                            }
                        } else if (var102.field8512 == 256) {
                            int var104 = var102.field8515 - class461.field6410;
                            int var105 = var102.field8506 - class351.field4599;
                            int var106 = var102.field8511;
                            int var107;
                            if (var106 != 1 && var106 != 2) {
                                var107 = var104;
                            } else {
                                var107 = -var104;
                            }
                            int var108;
                            if (var106 != 2 && var106 != 3) {
                                var108 = var105;
                            } else {
                                var108 = -var105;
                            }
                            if (class603.field8547) {
                                class66.method434(arg0, var4, var2, var3);
                                class618.field8703.method355(arg0.field2054, arg0.field2056);
                            }
                            class599 var109 = arg1.field3677;
                            if (var108 > var107) {
                                class231 var110 = var102.method442(class618.field8703, 0);
                                if (var110 != null) {
                                    var110.field2949 = var102;
                                    var110.field2943 = var4;
                                    var110.field2950 = var2;
                                    var110.field2948 = var3;
                                    class435.field5854.method87(103, var110);
                                }
                            } else if (var109 != null) {
                                class231 var111 = var109.method442(class618.field8703, 0);
                                if (var111 != null) {
                                    var111.field2949 = var109;
                                    var111.field2943 = var4;
                                    var111.field2950 = var2;
                                    var111.field2948 = var3;
                                    class435.field5854.method87(79, var111);
                                }
                            }
                        }
                    }
                    class244 var112 = arg1.field3697;
                    class244 var113 = arg1.field3690;
                    if (var113 != null && (var113.field3158 & arg1.field3694) != 0 && !class542.method3078(var5, var2, var3, var113.field3158)) {
                        if (class603.field8547) {
                            class157.method857(arg0, var113.field3158, var4, var2, var3);
                            class618.field8703.method355(arg0.field2054, arg0.field2056);
                        }
                        class231 var114 = var113.method442(class618.field8703, 0);
                        if (var114 != null) {
                            var114.field2949 = var113;
                            var114.field2943 = var4;
                            var114.field2950 = var2;
                            var114.field2948 = var3;
                            class435.field5854.method87(122, var114);
                        }
                    }
                    if (var112 != null && (var112.field3158 & arg1.field3694) != 0 && !class542.method3078(var5, var2, var3, var112.field3158)) {
                        if (class603.field8547) {
                            class157.method857(arg0, var112.field3158, var4, var2, var3);
                            class618.field8703.method355(arg0.field2054, arg0.field2056);
                        }
                        class231 var115 = var112.method442(class618.field8703, 0);
                        if (var115 != null) {
                            var115.field2949 = var112;
                            var115.field2943 = var4;
                            var115.field2950 = var2;
                            var115.field2948 = var3;
                            class435.field5854.method87(93, var115);
                        }
                    }
                }
                if (var4 < class337.field4416 - 1) {
                    class287 var116 = class97.field1074[var4 + 1][var2][var3];
                    if (var116 != null && var116.field3695) {
                        class81.field859.method1406(true, var116);
                    }
                }
                if (var2 < class325.field4238) {
                    class287 var117 = var8[var2 + 1][var3];
                    if (var117 != null && var117.field3695) {
                        class81.field859.method1409(0, var117);
                    }
                }
                if (var3 < class75.field789) {
                    class287 var118 = var8[var2][var3 + 1];
                    if (var118 != null && var118.field3695) {
                        class81.field859.method1409(0, var118);
                    }
                }
                if (var2 > class325.field4238) {
                    class287 var119 = var8[var2 - 1][var3];
                    if (var119 != null && var119.field3695) {
                        class81.field859.method1409(0, var119);
                    }
                }
                if (var3 > class75.field789) {
                    class287 var120 = var8[var2][var3 - 1];
                    if (var120 != null && var120.field3695) {
                        class81.field859.method1409(0, var120);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILbca;BI)Lnk;")
    public static final class654 method2176(int arg0, class604 arg1, byte arg2, int arg3) {
        ++field5312;
        int var4 = arg3 << 8 | arg1.field8552;
        class654 var5 = (class654) class599.field8517.method2134(-719, (long) var4 << 16);
        if (arg2 != 112) {
            method2178(-49, (class382) null, -4);
        }
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class178.field2179.method1722(class178.field2179.method1736(var4, 0), arg2 ^ 112);
            if (var6 != null) {
                if (var6.length <= 1) {
                    return null;
                } else {
                    class654 var7 = class285.method1618(100, var6);
                    var7.field9346 = arg1;
                    class599.field8517.method2129((byte) 112, var7, (long) var4 << 16);
                    return var7;
                }
            } else {
                int var8 = arg0 + 65536 << 8 | arg1.field8552;
                class654 var9 = (class654) class599.field8517.method2134(-719, (long) var8 << 16);
                if (var9 != null) {
                    return var9;
                } else {
                    byte[] var10 = class178.field2179.method1722(class178.field2179.method1736(var8, 0), 0);
                    if (var10 != null) {
                        if (var10.length <= 1) {
                            return null;
                        } else {
                            class654 var11 = class285.method1618(100, var10);
                            var11.field9346 = arg1;
                            class599.field8517.method2129((byte) 96, var11, (long) var8 << 16);
                            return var11;
                        }
                    } else {
                        int var12 = 16776960 | arg1.field8552;
                        class654 var13 = (class654) class599.field8517.method2134(-719, (long) var12 << 16);
                        if (var13 != null) {
                            return var13;
                        } else {
                            byte[] var14 = class178.field2179.method1722(class178.field2179.method1736(var12, 0), 0);
                            if (var14 != null) {
                                if (~var14.length >= -2) {
                                    return null;
                                } else {
                                    class654 var15 = class285.method1618(arg2 ^ 20, var14);
                                    var15.field9346 = arg1;
                                    class599.field8517.method2129((byte) 80, var15, (long) var12 << 16);
                                    return var15;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class137 method282(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5293;
        return new class416(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!af", name = "A", descriptor = "()Z")
    public final boolean method315() {
        ++field5306;
        return true;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;ZII)V")
    public static final void method2177(boolean arg0, int arg1, String arg2, String arg3, boolean arg4, int arg5, int arg6) {
        ++field5308;
        class147.field1648.field3945 = 1;
        String var7 = arg2.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg5 != -1) {
            class450 var11 = class80.field854.method687(false, arg5);
            if (var11 == null || !arg0 != !var11.method2500(true)) {
                return;
            }
            if (!var11.method2500(true)) {
                var9 = var11.field6198;
            } else {
                var10 = var11.field6197;
            }
        }
        int var12 = 0;
        for (int var13 = 0; ~var13 > ~class472.field6588.field4463; ++var13) {
            class537 var16 = class472.field6588.method1903(var13, (byte) 109);
            if ((!arg4 || var16.field7687) && ~var16.field7703 == 0 && ~var16.field7729 == 0 && ~var16.field7726 == -1 && ~var16.field7677.toLowerCase().indexOf(var7) != 0) {
                if (~arg5 != 0) {
                    if (arg0) {
                        if (!arg3.equals(var16.method3052(true, var10, arg5))) {
                            continue;
                        }
                    } else if (arg1 != var16.method3061(var9, arg5, 850)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class382.field5121 = null;
                    class67.field726 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; ~var18 > ~var12; ++var18) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        if (arg6 != 64) {
            field5291 = -47L;
        }
        class67.field726 = var12;
        class255.field3262 = 0;
        class382.field5121 = var8;
        String[] var14 = new String[class67.field726];
        for (int var15 = 0; ~class67.field726 < ~var15; ++var15) {
            var14[var15] = class472.field6588.method1903(var8[var15], (byte) 126).field7677;
        }
        class9.method47(class382.field5121, var14, (byte) -57);
        class147.field1648.method1732(false);
        class147.field1648.field3945 = 2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/Runnable;)Luea;")
    public final class285 method814(Runnable arg0) {
        ++field5289;
        for (int var2 = 0; ~var2 > ~super.field1658; ++var2) {
            if (super.field1657[var2].field3606 == arg0) {
                return super.field1657[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!af", name = "n", descriptor = "()V")
    public final void method358() {
        if (~super.field1667 == -1 && ~super.field1694 == ~super.field1676 && ~super.field1669 == -1 && ~super.field1692 == ~super.field1670) {
            int var1 = this.field5298.length;
            int var2 = 7 & var1 - var1;
            int var3 = 0;
            while (var3 < var2) {
                this.field5298[var3++] = Integer.MAX_VALUE;
                this.field5298[var3++] = Integer.MAX_VALUE;
                this.field5298[var3++] = Integer.MAX_VALUE;
                this.field5298[var3++] = Integer.MAX_VALUE;
                this.field5298[var3++] = Integer.MAX_VALUE;
                this.field5298[var3++] = Integer.MAX_VALUE;
                this.field5298[var3++] = Integer.MAX_VALUE;
                this.field5298[var3++] = Integer.MAX_VALUE;
            }
            while (~var1 < ~var3) {
                this.field5298[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = -super.field1667 + super.field1676;
            int var5 = -super.field1669 + super.field1692;
            int var6 = -var4 + super.field1694;
            int var7 = super.field1667 - -(super.field1694 * super.field1669);
            int var8 = var4 >> 3;
            int var9 = 7 & var4;
            int var10 = var7 + -1;
            for (int var11 = -var5; ~var11 > -1; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field5298[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5298[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5298[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5298[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5298[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5298[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5298[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5298[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (~var9 < -1) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field5298[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
        ++field5302;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method325(Canvas arg0) {
        ++field5316;
        class309 var2 = (class309) super.field1650.method3234((byte) -86, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1519((byte) 121);
            class309 var3 = class292.method1647(arg0, (byte) 81);
            super.field1650.method3235((long) arg0.hashCode(), -1, var3);
            if (super.field1652 == arg0 && super.field1684 == null) {
                super.field1694 = var3.field4012;
                super.field1653 = var3;
                super.field1686 = var3.field4007;
                super.field1670 = var3.field4013;
                if (~this.field5307 != ~super.field1694 || ~this.field5286 != ~super.field1670) {
                    this.field5286 = super.field1670;
                    this.field5307 = super.field1694;
                    this.field5298 = new int[this.field5307 * this.field5286];
                }
                this.method810();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public final void method333(int arg0) {
        super.field1658 = arg0;
        ++field5295;
        super.field1657 = new class217[super.field1658];
        for (int var2 = 0; var2 < super.field1658; ++var2) {
            super.field1657[var2] = new class217(this);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILep;I)Ljava/lang/String;")
    public static final String method2178(int arg0, class382 arg1, int arg2) {
        ++field5285;
        if (arg2 != 0) {
            field5314 = null;
        }
        if (!client.method1530(arg1).method1496(arg0, -1) && arg1.field4966 == null) {
            return null;
        } else if (arg1.field5054 != null && arg1.field5054.length > arg0 && arg1.field5054[arg0] != null && arg1.field5054[arg0].trim().length() != 0) {
            return arg1.field5054[arg0];
        } else {
            return class87.field933 ? "Hidden-" + arg0 : null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Laca;IIII)V")
    public final void method806(class663 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5288;
        int var6 = arg0.field9425;
        int var8 = arg4 << 1;
        if (~var6 == 0) {
            this.method2170(arg1, arg3, arg0.field9427, arg2, arg4, 1, 16711935);
        } else {
            if (~super.field1698 != ~var6) {
                class458 var9 = (class458) super.field1691.method3690((byte) 113, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method811(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method804(var6) ? 64 : 128;
                    var9 = this.method326(var10, 0, var11, var11, var11);
                    super.field1691.method3683(var9, (byte) -86, (long) var6);
                }
                super.field1699 = var9;
                super.field1698 = var6;
            }
            ++var8;
            this.method2173(var8, arg0.field9427, 0, -2937, var8, 1, -arg4 + arg2, -arg4 + arg1, (class129) super.field1699, arg3);
        }
    }
}
