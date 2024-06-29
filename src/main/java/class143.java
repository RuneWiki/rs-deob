import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class143 {

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "[I")
    private int[] field1832 = new int[1600];

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "[[Ltha;")
    private class295[][] field1835 = new class295[64][768];

    @OriginalMember(owner = "client!fea", name = "n", descriptor = "[I")
    private int[] field1844 = new int[64];

    @OriginalMember(owner = "client!fea", name = "l", descriptor = "I")
    private int field1842 = 0;

    @OriginalMember(owner = "client!fea", name = "q", descriptor = "[I")
    private int[] field1847 = new int[8191];

    @OriginalMember(owner = "client!fea", name = "r", descriptor = "[[Ltha;")
    private class295[][] field1848 = new class295[1600][64];

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "Lqa;")
    private class251 field1836;

    @OriginalMember(owner = "client!fea", name = "y", descriptor = "Ltea;")
    private class241 field1855;

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "Ltea;")
    private class241 field1839;

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "Lug;")
    private class562 field1834;

    @OriginalMember(owner = "client!fea", name = "s", descriptor = "Lgea;")
    public static class76 field1849 = new class76(16);

    @OriginalMember(owner = "client!fea", name = "w", descriptor = "Z")
    public static boolean field1853 = false;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!fea", name = "m", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!fea", name = "o", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!fea", name = "p", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!fea", name = "u", descriptor = "Lla;")
    public static class454 field1851;

    @OriginalMember(owner = "client!fea", name = "x", descriptor = "Lni;")
    public static class522 field1854;

    @OriginalMember(owner = "client!fea", name = "v", descriptor = "Lcf;")
    public static class605 field1852;

    @OriginalMember(owner = "client!fea", name = "t", descriptor = "[Ls;")
    public static class281[] field1850;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Luv;BI)V", line = 3)
    private final void method887(class367 arg0, byte arg1, int arg2) {
        field1846++;
        int var4 = 0;
        class648 var5 = arg0.method2161(0);
        float var6 = var5.field9047;
        float var7 = var5.field9045;
        float var8 = var5.field9021;
        float var9 = var5.field9058;
        float var10 = var5.field9022;
        float var11 = var5.field9039;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        if (arg1 != -14) {
            field1856 = -5;
        }
        Buffer var21 = this.field1855.method1451(true, (byte) 27);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method2170(arg1 + 24036, var21);
        if (Stream.method3786()) {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field1832[var23] > 64 ? 64 : this.field1832[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class295 var38 = this.field1848[var23][var25];
                        int var39 = var38.field3966;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field3964 >> 12);
                        float var45 = (float) (var38.field3965 >> 12);
                        float var46 = (float) (var38.field3963 >> 12);
                        int var47 = var38.field3967 >> 12;
                        var22.method3784((float) (-var47) * var12 + var44);
                        var22.method3784((float) (-var47) * var13 + var45);
                        var22.method3784((float) (-var47) * var14 + var46);
                        if (arg0.field5072 == 0) {
                            var22.method3785(var40, var41, var42, var43);
                        } else {
                            var22.method3788(var40, var41, var42, var43);
                        }
                        var22.method3784(0.0F);
                        var22.method3784(0.0F);
                        var22.method3784((float) var47 * var15 + var44);
                        var22.method3784((float) var47 * var16 + var45);
                        var22.method3784((float) var47 * var17 + var46);
                        if (arg0.field5072 == 0) {
                            var22.method3785(var40, var41, var42, var43);
                        } else {
                            var22.method3788(var40, var41, var42, var43);
                        }
                        var22.method3784(1.0F);
                        var22.method3784(0.0F);
                        var22.method3784((float) var47 * var12 + var44);
                        var22.method3784((float) var47 * var13 + var45);
                        var22.method3784((float) var47 * var14 + var46);
                        if (arg0.field5072 == 0) {
                            var22.method3785(var40, var41, var42, var43);
                        } else {
                            var22.method3788(var40, var41, var42, var43);
                        }
                        var22.method3784(1.0F);
                        var22.method3784(1.0F);
                        var22.method3784((float) var47 * var18 + var44);
                        var22.method3784((float) var47 * var19 + var45);
                        var22.method3784((float) var47 * var20 + var46);
                        if (arg0.field5072 == 0) {
                            var22.method3785(var40, var41, var42, var43);
                        } else {
                            var22.method3788(var40, var41, var42, var43);
                        }
                        var22.method3784(0.0F);
                        var4++;
                        var22.method3784(1.0F);
                    }
                    if (this.field1832[var23] > 64) {
                        int var26 = this.field1832[var23] - 64 - 1;
                        for (int var27 = this.field1844[var26] - 1; var27 >= 0; var27--) {
                            class295 var28 = this.field1835[var26][var27];
                            int var29 = var28.field3966;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field3964 >> 12);
                            float var35 = (float) (var28.field3965 >> 12);
                            float var36 = (float) (var28.field3963 >> 12);
                            int var37 = var28.field3967 >> 12;
                            var22.method3784((float) (-var37) * var12 + var34);
                            var22.method3784((float) (-var37) * var13 + var35);
                            var22.method3784((float) (-var37) * var14 + var36);
                            if (arg0.field5072 == 0) {
                                var22.method3785(var30, var31, var32, var33);
                            } else {
                                var22.method3788(var30, var31, var32, var33);
                            }
                            var22.method3784(0.0F);
                            var22.method3784(0.0F);
                            var22.method3784((float) var37 * var15 + var34);
                            var22.method3784((float) var37 * var16 + var35);
                            var22.method3784((float) var37 * var17 + var36);
                            if (arg0.field5072 == 0) {
                                var22.method3785(var30, var31, var32, var33);
                            } else {
                                var22.method3788(var30, var31, var32, var33);
                            }
                            var22.method3784(1.0F);
                            var22.method3784(0.0F);
                            var22.method3784((float) var37 * var12 + var34);
                            var22.method3784((float) var37 * var13 + var35);
                            var22.method3784((float) var37 * var14 + var36);
                            if (arg0.field5072 == 0) {
                                var22.method3785(var30, var31, var32, var33);
                            } else {
                                var22.method3788(var30, var31, var32, var33);
                            }
                            var22.method3784(1.0F);
                            var22.method3784(1.0F);
                            var22.method3784((float) var37 * var18 + var34);
                            var22.method3784((float) var37 * var19 + var35);
                            var22.method3784((float) var37 * var20 + var36);
                            if (arg0.field5072 == 0) {
                                var22.method3785(var30, var31, var32, var33);
                            } else {
                                var22.method3788(var30, var31, var32, var33);
                            }
                            var22.method3784(0.0F);
                            var4++;
                            var22.method3784(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field1832[var48] > 64 ? 64 : this.field1832[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class295 var63 = this.field1848[var48][var50];
                        int var64 = var63.field3966;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field3964 >> 12);
                        float var70 = (float) (var63.field3965 >> 12);
                        float var71 = (float) (var63.field3963 >> 12);
                        int var72 = var63.field3967 >> 12;
                        var22.method3781((float) (-var72) * var12 + var69);
                        var22.method3781((float) (-var72) * var13 + var70);
                        var22.method3781((float) (-var72) * var14 + var71);
                        if (arg0.field5072 == 0) {
                            var22.method3785(var65, var66, var67, var68);
                        } else {
                            var22.method3788(var65, var66, var67, var68);
                        }
                        var22.method3781(0.0F);
                        var22.method3781(0.0F);
                        var22.method3781((float) var72 * var15 + var69);
                        var22.method3781((float) var72 * var16 + var70);
                        var22.method3781((float) var72 * var17 + var71);
                        if (arg0.field5072 == 0) {
                            var22.method3785(var65, var66, var67, var68);
                        } else {
                            var22.method3788(var65, var66, var67, var68);
                        }
                        var22.method3781(1.0F);
                        var22.method3781(0.0F);
                        var22.method3781((float) var72 * var12 + var69);
                        var22.method3781((float) var72 * var13 + var70);
                        var22.method3781((float) var72 * var14 + var71);
                        if (arg0.field5072 == 0) {
                            var22.method3785(var65, var66, var67, var68);
                        } else {
                            var22.method3788(var65, var66, var67, var68);
                        }
                        var22.method3781(1.0F);
                        var22.method3781(1.0F);
                        var22.method3781((float) var72 * var18 + var69);
                        var22.method3781((float) var72 * var19 + var70);
                        var22.method3781((float) var72 * var20 + var71);
                        if (arg0.field5072 == 0) {
                            var22.method3785(var65, var66, var67, var68);
                        } else {
                            var22.method3788(var65, var66, var67, var68);
                        }
                        var22.method3781(0.0F);
                        var4++;
                        var22.method3781(1.0F);
                    }
                    if (this.field1832[var48] > 64) {
                        int var51 = this.field1832[var48] - 64 - 1;
                        for (int var52 = this.field1844[var51] - 1; var52 >= 0; var52--) {
                            class295 var53 = this.field1835[var51][var52];
                            int var54 = var53.field3966;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field3964 >> 12);
                            float var60 = (float) (var53.field3965 >> 12);
                            float var61 = (float) (var53.field3963 >> 12);
                            int var62 = var53.field3967 >> 12;
                            var22.method3781((float) (-var62) * var12 + var59);
                            var22.method3781((float) (-var62) * var13 + var60);
                            var22.method3781((float) (-var62) * var14 + var61);
                            if (arg0.field5072 == 0) {
                                var22.method3785(var55, var56, var57, var58);
                            } else {
                                var22.method3788(var55, var56, var57, var58);
                            }
                            var22.method3781(0.0F);
                            var22.method3781(0.0F);
                            var22.method3781((float) var62 * var15 + var59);
                            var22.method3781((float) var62 * var16 + var60);
                            var22.method3781((float) var62 * var17 + var61);
                            if (arg0.field5072 == 0) {
                                var22.method3785(var55, var56, var57, var58);
                            } else {
                                var22.method3788(var55, var56, var57, var58);
                            }
                            var22.method3781(1.0F);
                            var22.method3781(0.0F);
                            var22.method3781((float) var62 * var12 + var59);
                            var22.method3781((float) var62 * var13 + var60);
                            var22.method3781((float) var62 * var14 + var61);
                            if (arg0.field5072 == 0) {
                                var22.method3785(var55, var56, var57, var58);
                            } else {
                                var22.method3788(var55, var56, var57, var58);
                            }
                            var22.method3781(1.0F);
                            var22.method3781(1.0F);
                            var22.method3781((float) var62 * var18 + var59);
                            var22.method3781((float) var62 * var19 + var60);
                            var22.method3781((float) var62 * var20 + var61);
                            if (arg0.field5072 == 0) {
                                var22.method3785(var55, var56, var57, var58);
                            } else {
                                var22.method3788(var55, var56, var57, var58);
                            }
                            var22.method3781(0.0F);
                            var22.method3781(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3795();
        if (this.field1855.method1448(arg1 + 13637)) {
            arg0.method1325(0, true, this.field1855);
            arg0.method1325(1, true, this.field1839);
            arg0.method1330(this.field1836, (byte) 101);
            arg0.method1304(class387.field5460, var4 * 4, 0, arg1 + 26824, this.field1834, 0, var4 * 2);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Luv;B)V", line = 392)
    public final void method888(class367 arg0, byte arg1) {
        if (arg1 != 36) {
            this.field1848 = null;
        }
        field1838++;
        this.field1855.method1450(-20279, 24, 786336);
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Luv;)V", line = 696)
    public class143(class367 arg0) {
        this.field1836 = arg0.method1316(new class235[] { new class235(new class239[] { class239.field3118, class239.field3124, class239.field3127 }), new class235(class239.field3123) }, 6);
        this.field1855 = arg0.method1292(true, 107);
        this.field1839 = arg0.method1292(false, 119);
        this.field1839.method1450(-20279, 12, 393168);
        this.field1834 = arg0.method1281((byte) 84, false);
        this.field1834.method180(49146, 20779);
        Buffer var2 = this.field1834.method179(true, -87);
        if (var2 != null) {
            Stream var3 = arg0.method2170(24022, var2);
            if (Stream.method3786()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3791(var7);
                    var3.method3791(var7 + 1);
                    var3.method3791(var7 + 2);
                    var3.method3791(var7 + 2);
                    var3.method3791(var7 + 3);
                    var3.method3791(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3792(var5);
                    var3.method3792(var5 + 1);
                    var3.method3792(var5 + 2);
                    var3.method3792(var5 + 2);
                    var3.method3792(var5 + 3);
                    var3.method3792(var5);
                }
            }
            var3.method3795();
            this.field1834.method178((byte) -117);
        }
        Buffer var8 = this.field1839.method1451(true, (byte) 27);
        if (var8 != null) {
            Stream var9 = arg0.method2170(24022, var8);
            if (Stream.method3786()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3784(0.0F);
                    var9.method3784(-1.0F);
                    var9.method3784(0.0F);
                    var9.method3784(0.0F);
                    var9.method3784(-1.0F);
                    var9.method3784(0.0F);
                    var9.method3784(0.0F);
                    var9.method3784(-1.0F);
                    var9.method3784(0.0F);
                    var9.method3784(0.0F);
                    var9.method3784(-1.0F);
                    var9.method3784(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3781(0.0F);
                    var9.method3781(-1.0F);
                    var9.method3781(0.0F);
                    var9.method3781(0.0F);
                    var9.method3781(-1.0F);
                    var9.method3781(0.0F);
                    var9.method3781(0.0F);
                    var9.method3781(-1.0F);
                    var9.method3781(0.0F);
                    var9.method3781(0.0F);
                    var9.method3781(-1.0F);
                    var9.method3781(0.0F);
                }
            }
            var9.method3795();
            this.field1839.method1448(13623);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Luv;I)V", line = 407)
    private final void method889(class367 arg0, int arg1) {
        class393.field5568 = arg0.field5068;
        field1843++;
        if (arg1 != -64) {
            this.field1834 = null;
        }
        arg0.method2129(arg1 ^ 0x4E);
        arg0.method2136(false, (byte) -119);
        arg0.method2142(0, false);
        arg0.method2120(13951);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V", line = 422)
    public final void method890(byte arg0) {
        if (arg0 != 4) {
            this.field1847 = null;
        }
        field1840++;
        this.field1855.method176(false);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)Z", line = 437)
    public static final boolean method891(int arg0, int arg1) {
        if (arg1 != 0) {
            method893(true);
        }
        field1833++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILuv;)V", line = 453)
    private final void method892(int arg0, class367 arg1) {
        arg1.method2142(0, true);
        field1845++;
        arg1.method2136(true, (byte) -7);
        if (class393.field5568 != arg1.field5068) {
            arg1.method434(class393.field5568);
        }
        if (arg0 > -97) {
            this.field1844 = null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V", line = 469)
    public static final void method893(boolean arg0) {
        class440.method2489();
        field1837++;
        for (int var1 = 0; var1 < 4; var1++) {
            class171.field2130[var1].method1788((byte) -99);
        }
        class456.method2548(52);
        class586.method3266((byte) 125);
        class728.method4088(50);
        System.gc();
        class21.field142.method370();
        if (arg0) {
            field1853 = true;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BLpf;ILuv;)V", line = 508)
    public final void method894(byte arg0, class583 arg1, int arg2, class367 arg3) {
        field1831++;
        if (arg3.field5035 == null) {
            return;
        }
        if (arg2 < 0) {
            this.method889(arg3, -64);
        } else {
            this.method895(-11402, arg2, arg3);
        }
        float var5 = arg3.field5035.field9027;
        float var6 = arg3.field5035.field9048;
        float var7 = arg3.field5035.field9016;
        float var8 = arg3.field5035.field9015;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class329 var12 = arg1.field8165.field4247;
            for (class329 var13 = var12.field4446; var13 != var12; var13 = var13.field4446) {
                class295 var14 = (class295) var13;
                int var15 = (int) ((float) (var14.field3963 >> 12) * var7 + (float) (var14.field3965 >> 12) * var6 + (float) (var14.field3964 >> 12) * var5 + var8);
                if (var11 < var15) {
                    var11 = var15;
                }
                if (var15 < var10) {
                    var10 = var15;
                }
                this.field1847[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class185.method1043(var16, (byte) 31) + 1 - class411.field5794;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class329 var19 = var12.field4446;
            int var20 = -2;
            if (arg0 != -108) {
                this.field1855 = null;
            }
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field1842 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field1832[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field1844[var24] = 0;
                }
                while (var12 != var19) {
                    class295 var25 = (class295) var19;
                    if (var22) {
                        var22 = false;
                        var21 = var25.field3962;
                        var20 = var25.field3968;
                    }
                    if (var18 > 0 && (var25.field3968 != var20 || var25.field3962 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field1847[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field1832[var26] < 64) {
                            this.field1848[var26][this.field1832[var26]++] = var25;
                        } else {
                            label106: {
                                if (this.field1832[var26] == 64) {
                                    if (this.field1842 == 64) {
                                        break label106;
                                    }
                                    this.field1832[var26] += this.field1842++ + 1;
                                }
                                this.field1835[this.field1832[var26] - 64 - 1][this.field1844[this.field1832[var26] - 1 - 64]++] = var25;
                            }
                        }
                    }
                    var19 = var19.field4446;
                }
                arg3.method2167(false, arg0 ^ 0xFFFFFF94, var20 < 0 ? -1 : var20, false);
                if (var21 && class393.field5568 != arg3.field5068) {
                    arg3.method434(class393.field5568);
                } else if (arg3.field5068 != 1.0F) {
                    arg3.method434(1.0F);
                }
                this.method887(arg3, (byte) -14, var16);
            }
        } catch (Exception var27) {
        }
        this.method892(-103, arg3);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IILuv;)V", line = 667)
    private final void method895(int arg0, int arg1, class367 arg2) {
        class393.field5568 = arg2.field5068;
        field1841++;
        arg2.method2179(arg0 ^ 0xFFFFD342, (float) arg1);
        if (arg0 != -11402) {
            this.field1844 = null;
        }
        arg2.method2104(4);
        arg2.method2136(false, (byte) -126);
        arg2.method2142(0, false);
        arg2.method2120(13951);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V", line = 818)
    public static void method896(int arg0) {
        field1850 = null;
        field1849 = null;
        field1851 = null;
        if (arg0 != 1) {
            field1853 = true;
        }
        field1852 = null;
        field1854 = null;
    }
}
