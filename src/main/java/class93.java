import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class93 {

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "B")
    public byte field943;

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!ow", name = "x", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "client!ow", name = "r", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!ow", name = "p", descriptor = "I")
    public static int field950 = -50;

    @OriginalMember(owner = "client!ow", name = "o", descriptor = "I")
    public static int field949 = 0;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!ow", name = "q", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "client!ow", name = "s", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ow", name = "t", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "client!ow", name = "v", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!ow", name = "w", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!ow", name = "y", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "Lfa;")
    public static class524 field939;

    @OriginalMember(owner = "client!ow", name = "u", descriptor = "Low;")
    public class93 field955;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ow", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field960;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method477(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V", line = 4)
    public static void method469(int arg0) {
        int var1 = 107 % ((-arg0 - 20) / 34);
        field939 = null;
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)Lld;", line = 23)
    public final class610 method470(int arg0) {
        field959++;
        if (arg0 != 5) {
            method476(127, null, true);
        }
        return class412.method2308(-13, this.field958);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)V", line = 35)
    public static final void method471(byte arg0) {
        class386.field5208.method369((byte) 97);
        field946++;
        if (arg0 != -36) {
            return;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class173.field1937[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class221.field2712[var2] = 0L;
        }
        class395.field5352 = 0;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)[[[B", line = 62)
    public static final byte[][][] method472(int arg0, int arg1) {
        field940++;
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
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 >= var16) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var128 <= var19 >> 1) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        if (arg1 != -25675) {
            method473((byte) -14);
        }
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var21 >= 0 && var21 < var20.length) {
                    if (var127 >= var22 << 1) {
                        var20[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var20;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var25 >> 1 >= var126) {
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
                if (var125 >= var28 << 1) {
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
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= (var34 << 1)) {
                    var32[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var32;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var122 <= (var37 >> 1)) {
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
                if (var121 >= var40 << 1) {
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
                if (var120 >= (var43 >> 1)) {
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
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var49 >> 1 <= var118) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        int var50 = 0;
        byte[] var51 = new byte[var3 * var4];
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var52 << 1) >= var117) {
                    var51[var50] = -1;
                }
                var50++;
            }
        }
        var2[3][3] = var51;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var55 >> 1 <= var116) {
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
                if (var115 <= (var58 << 1)) {
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
                if (var61 >> 1 <= var114) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if ((var64 << 1) >= var113) {
                    var63[var62] = -1;
                }
                var62++;
            }
        }
        var2[4][3] = var63;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var112 <= (var3 / 2)) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var4 / 2 >= var70) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
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
                if (var76 >= (var4 / 2)) {
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
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if ((var82 - var4 / 2) >= var107) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var85 - (var4 / 2) >= var106) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
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
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var91 - var4 / 2 <= var104) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if ((var94 - var4 / 2) <= var103) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var97 - (var4 / 2) <= var102) {
                    var96[var95] = -1;
                }
                var95++;
            }
        }
        var2[7][2] = var96;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= (var100 - (var4 / 2))) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)V", line = 839)
    public static final void method473(byte arg0) {
        class184.field2065 = -1;
        if (arg0 != 27) {
            method472(-31, -72);
        }
        class248.field3078 = -1;
        field944++;
        class16.field130 = 0;
        class421.field5610 = -1;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZIII)V", line = 860)
    public static final void method474(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            method473((byte) 62);
        }
        field953++;
        class76 var4 = class3.method28(9, (byte) 42, arg2);
        var4.method403((byte) 94);
        var4.field789 = arg3;
        var4.field785 = arg1;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIII)Low;", line = 883)
    public final class93 method475(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -59 / ((-arg3 - 40) / 54);
        field941++;
        return new class93(this.field958, arg0, arg2, arg1, this.field943);
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(IIIIB)V", line = 897)
    public class93(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field943 = arg4;
        this.field945 = arg2;
        this.field936 = arg1;
        this.field958 = arg0;
        this.field952 = arg3;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILjava/awt/Component;Z)Lek;", line = 909)
    public static final class566 method476(int arg0, Component arg1, boolean arg2) {
        field937++;
        try {
            Constructor var3 = Class.forName("fea").getDeclaredConstructor(field960 == null ? (field960 = method477("java.awt.Component")) : field960, Boolean.TYPE);
            return (class566) var3.newInstance(arg1, Boolean.valueOf(arg2));
        } catch (Throwable var4) {
            if (arg0 <= 44) {
                method476(-126, null, true);
            }
            return new class249(arg1, arg2);
        }
    }
}
