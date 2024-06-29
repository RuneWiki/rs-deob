import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class218 {

    @OriginalMember(owner = "client!oba", name = "q", descriptor = "I")
    private int field2680 = 32;

    @OriginalMember(owner = "client!oba", name = "r", descriptor = "Z")
    private boolean field2681 = false;

    @OriginalMember(owner = "client!oba", name = "t", descriptor = "J")
    private long field2683 = class190.method1030(false);

    @OriginalMember(owner = "client!oba", name = "A", descriptor = "[Lvv;")
    private class270[] field2690 = new class270[8];

    @OriginalMember(owner = "client!oba", name = "x", descriptor = "Z")
    private boolean field2687 = true;

    @OriginalMember(owner = "client!oba", name = "D", descriptor = "[Lvv;")
    private class270[] field2693 = new class270[8];

    @OriginalMember(owner = "client!oba", name = "E", descriptor = "I")
    private int field2694 = 0;

    @OriginalMember(owner = "client!oba", name = "y", descriptor = "J")
    private long field2688 = 0L;

    @OriginalMember(owner = "client!oba", name = "w", descriptor = "I")
    private int field2686 = 0;

    @OriginalMember(owner = "client!oba", name = "F", descriptor = "I")
    private int field2695 = 0;

    @OriginalMember(owner = "client!oba", name = "I", descriptor = "J")
    private long field2698 = 0L;

    @OriginalMember(owner = "client!oba", name = "G", descriptor = "I")
    private int field2696 = 0;

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "Lvj;")
    public static class373 field2672 = new class373(41, 6);

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!oba", name = "k", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!oba", name = "n", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!oba", name = "s", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!oba", name = "u", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!oba", name = "v", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "I")
    private int field2689;

    @OriginalMember(owner = "client!oba", name = "B", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!oba", name = "C", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!oba", name = "H", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "Lvv;")
    private class270 field2678;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "[I")
    public int[] field2669;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "[Lha;")
    public static class52[] field2665;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "()V", line = 3)
    public void method775() {
        field2682++;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V", line = 11)
    public final synchronized void method1249(byte arg0) {
        field2679++;
        this.field2687 = true;
        try {
            int var2 = 99 / ((38 - arg0) / 38);
            this.method776();
        } catch (Exception var3) {
            this.method775();
            this.field2698 = class190.method1030(false) + 2000L;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "([II)V", line = 34)
    private final void method1250(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class197.field2383) {
            var3 = arg1 << 1;
        }
        class345.method1927(arg0, 0, var3);
        this.field2694 -= arg1;
        if (this.field2678 != null && this.field2694 <= 0) {
            this.field2694 += class90.field1101 >> 4;
            class433.method2503(-119, this.field2678);
            this.method1251(this.field2678, this.field2678.method1509(), 1);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class270 var10 = null;
                        class270 var11 = this.field2693[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class508 var12 = var11.field3505;
                                if (var12 == null || var12.field7037 <= var8) {
                                    var11.field3508 = true;
                                    int var13 = var11.method800();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field7037 += var13;
                                    }
                                    if (var4 >= this.field2680) {
                                        break label107;
                                    }
                                    class270 var14 = var11.method806();
                                    if (var14 != null) {
                                        int var15 = var11.field3507;
                                        while (var14 != null) {
                                            this.method1251(var14, var15 * var14.method1509() >> 8, 1);
                                            var14 = var11.method801();
                                        }
                                    }
                                    class270 var16 = var11.field3506;
                                    var11.field3506 = null;
                                    if (var10 == null) {
                                        this.field2693[var7] = var16;
                                    } else {
                                        var10.field3506 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2690[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3506;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class270 var18 = this.field2693[var17];
                this.field2693[var17] = this.field2690[var17] = null;
                while (var18 != null) {
                    class270 var19 = var18.field3506;
                    var18.field3506 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2694 < 0) {
            this.field2694 = 0;
        }
        if (this.field2678 != null) {
            this.field2678.method799(arg0, 0, arg1);
        }
        this.field2683 = class190.method1030(false);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 195)
    public void method777(Component arg0) throws Exception {
        field2684++;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lvv;II)V", line = 203)
    private final void method1251(class270 arg0, int arg1, int arg2) {
        field2692++;
        int var4 = arg1 >> 5;
        if (arg2 != 1) {
            return;
        }
        class270 var5 = this.field2690[var4];
        if (var5 == null) {
            this.field2693[var4] = arg0;
        } else {
            var5.field3506 = arg0;
        }
        this.field2690[var4] = arg0;
        arg0.field3507 = arg1;
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "()I", line = 224)
    public int method772() throws Exception {
        field2675++;
        return this.field2691;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V", line = 235)
    public final synchronized void method1252(int arg0) {
        field2664++;
        if (class162.field1966 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class162.field1966.field1788[var3] == this) {
                    class162.field1966.field1788[var3] = null;
                }
                if (class162.field1966.field1788[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class162.field1966.field1786 = true;
                while (class162.field1966.field1785) {
                    class462.method2688(50L, (byte) 110);
                }
                class162.field1966 = null;
            }
        }
        if (arg0 == 286331153) {
            this.method775();
            this.field2669 = null;
            this.field2681 = true;
        }
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V", line = 284)
    public final synchronized void method1253(int arg0) {
        field2667++;
        if (this.field2681) {
            return;
        }
        long var2 = class190.method1030(false);
        try {
            if ((this.field2683 + 500000L) < var2) {
                this.field2683 = var2 - 500000L;
            }
            while (var2 > (this.field2683 + 5000L)) {
                this.method1259(256, (byte) 118);
                this.field2683 += (256000 / class90.field1101);
            }
        } catch (Exception var7) {
            this.field2683 = var2;
        }
        if (this.field2669 == null) {
            return;
        }
        try {
            if (this.field2698 != 0L) {
                if (var2 < this.field2698) {
                    return;
                }
                this.method773(this.field2691);
                this.field2698 = 0L;
                this.field2687 = true;
            }
            if (arg0 != 1) {
                method1258((byte) -69, 71, 73);
            }
            int var4 = this.method772();
            if (this.field2696 < this.field2686 - var4) {
                this.field2696 = this.field2686 - var4;
            }
            int var5 = this.field2697 + this.field2689;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field2691 < var5 + 256) {
                this.field2691 += 1024;
                if (this.field2691 > 16384) {
                    this.field2691 = 16384;
                }
                this.method775();
                var4 = 0;
                this.method773(this.field2691);
                this.field2687 = true;
                if ((var5 + 256) > this.field2691) {
                    var5 = this.field2691 - 256;
                    this.field2689 = var5 - this.field2697;
                }
            }
            while (var5 > var4) {
                this.method1250(this.field2669, 256);
                var4 += 256;
                this.method774();
            }
            if (var2 > this.field2688) {
                if (this.field2687) {
                    this.field2687 = false;
                } else if (this.field2696 == 0 && this.field2695 == 0) {
                    this.method775();
                    this.field2698 = var2 + 2000L;
                    return;
                } else {
                    this.field2689 = Math.min(this.field2695, this.field2696);
                    this.field2695 = this.field2696;
                }
                this.field2696 = 0;
                this.field2688 = var2 + 2000L;
            }
            this.field2686 = var4;
        } catch (Exception var6) {
            this.method775();
            this.field2698 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(B)V", line = 399)
    public static void method1254(byte arg0) {
        field2672 = null;
        if (arg0 >= -70) {
            method1256(-7, (byte) -102);
        }
        field2665 = null;
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)V", line = 413)
    public void method773(int arg0) throws Exception {
        field2668++;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZLvv;)V", line = 424)
    public final synchronized void method1255(boolean arg0, class270 arg1) {
        this.field2678 = arg1;
        if (arg0) {
            method1258((byte) -5, 56, 59);
        }
        field2674++;
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "()V", line = 436)
    public void method774() throws Exception {
        field2666++;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)[[[B", line = 450)
    public static final byte[][][] method1256(int arg0, byte arg1) {
        field2670++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var7 >= var132) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var130 >= var13) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 >= var16) {
                    var14[var15] = -1;
                }
                var15++;
            }
        }
        var2[0][3] = var14;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var128 <= (var19 >> 1)) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var21.length > var20) {
                    if (var127 >= (var22 << 1)) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= (var25 >> 1)) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if ((var28 << 1) <= var125) {
                    var26[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var26;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var124 <= var31 >> 1) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= var34 << 1) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if ((var37 >> 1) >= var122) {
                    var36[var35] = -1;
                }
                var35++;
            }
        }
        var2[2][2] = var36;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if ((var40 << 1) <= var121) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 >= var43 >> 1) {
                    var41[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var41;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var119 <= var46 << 1) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        int var47 = 0;
        byte[] var48 = new byte[var3 * var4];
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var49 >> 1 <= var118) {
                    var48[var47] = -1;
                }
                var47++;
            }
        }
        var2[3][2] = var48;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 <= (var52 << 1)) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if ((var55 >> 1) <= var116) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var53;
        int var56 = 0;
        byte[] var57 = new byte[var3 * var4];
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var58 << 1 >= var115) {
                    var57[var56] = -1;
                }
                var56++;
            }
        }
        var2[4][1] = var57;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if ((var61 >> 1) <= var114) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if ((var64 << 1) >= var113) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var3 / 2) >= var112) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        int var70 = 0;
        if (arg1 != -102) {
            return null;
        }
        while (var4 > var70) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var4 / 2 >= var70) {
                    var69[var68] = -1;
                }
                var68++;
            }
            var70++;
        }
        var2[5][1] = var69;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if ((var3 / 2) <= var110) {
                    var72[var71] = -1;
                }
                var71++;
            }
        }
        var2[5][2] = var72;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= var4 / 2) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= var79 - (var4 / 2)) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var107 <= (var82 - (var4 / 2))) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= (var85 - (var4 / 2))) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var105 <= var88 - (var4 / 2)) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var91 - (var4 / 2) <= var104) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var94 - var4 / 2 <= var103) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= var97 - var4 / 2) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var100 - var4 / 2 <= var101) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BII)V", line = 1231)
    public static final void method1257(byte arg0, int arg1, int arg2) {
        field2676++;
        if (class629.field9033 != arg1) {
            class366.field4817 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class366.field4817[var3] = (var3 << 12) / arg1;
            }
            class129.field1590 = arg1 - 1;
            class323.field4096 = arg1 * 32;
            class629.field9033 = arg1;
        }
        if (arg0 != -5 || class347.field4469 == arg2) {
            return;
        }
        if (class629.field9033 == arg2) {
            class85.field1036 = class366.field4817;
        } else {
            class85.field1036 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class85.field1036[var4] = (var4 << 12) / arg2;
            }
        }
        class347.field4469 = arg2;
        class466.field6523 = arg2 - 1;
    }

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "()V", line = 1279)
    public void method776() throws Exception {
        field2685++;
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(BII)Ljava/lang/String;", line = 1286)
    public static final String method1258(byte arg0, int arg1, int arg2) {
        field2677++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else {
            if (arg0 < 97) {
                field2671 = -51;
            }
            if (var3 < -3) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(IB)V", line = 1324)
    private final void method1259(int arg0, byte arg1) {
        this.field2694 -= arg0;
        field2673++;
        if (this.field2694 < 0) {
            this.field2694 = 0;
        }
        int var3 = -32 % ((10 - arg1) / 33);
        if (this.field2678 != null) {
            this.field2678.method804(arg0);
        }
    }
}
