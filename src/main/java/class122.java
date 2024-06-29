import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class122 extends class311 {

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "[Lem;")
    public class143[] field1836;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "[S")
    public short[] field1843;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "[B")
    public byte[] field1832;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "[I")
    private int[] field1848;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "[Ldg;")
    public class224[] field1840;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "[B")
    public byte[] field1841;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "[B")
    public byte[] field1847;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "Lgf;")
    public static class202 field1846;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "Lne;")
    public static class76 field1839;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "[Lcg;")
    public static class271[] field1838;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field1844;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "[[I")
    public static int[][] field1833;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)V", line = 18)
    public static void method938(boolean arg0) {
        field1833 = null;
        field1839 = null;
        field1846 = null;
        field1844 = null;
        field1838 = null;
        if (!arg0) {
            method940((byte) -88);
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V", line = 32)
    public final void method939(int arg0) {
        field1845++;
        if (arg0 == -1531) {
            this.field1848 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V", line = 45)
    public static final void method940(byte arg0) {
        if (arg0 != 1) {
            field1838 = null;
        }
        field1837++;
        class107.field1516.method2530((byte) -112);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIBZ)V", line = 65)
    public static final void method941(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        if (arg4 <= 125) {
            method938(false);
        }
        field1834++;
        long var6 = (long) ((arg5 ? Integer.MIN_VALUE : 0) | arg2);
        class57 var8 = (class57) class30.field419.method837((byte) -72, var6);
        if (var8 == null) {
            var8 = new class57();
            class30.field419.method835(4, var8, var6);
        }
        if (var8.field741.length <= arg3) {
            int[] var9 = new int[arg3 + 1];
            int[] var10 = new int[arg3 + 1];
            for (int var11 = 0; var11 < var8.field741.length; var11++) {
                var9[var11] = var8.field741[var11];
                var10[var11] = var8.field739[var11];
            }
            for (int var12 = var8.field741.length; var12 < arg3; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field739 = var10;
            var8.field741 = var9;
        }
        var8.field741[arg3] = arg1;
        var8.field739[arg3] = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 121)
    public class122() {
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lwo;B[B[I)Z", line = 124)
    public final boolean method942(class52 arg0, byte arg1, byte[] arg2, int[] arg3) {
        field1842++;
        boolean var5 = true;
        if (arg1 >= -107) {
            this.field1843 = null;
        }
        int var6 = 0;
        class224 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field1848[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method419(77, var9 >> 2, arg3);
                        } else {
                            var7 = arg0.method418(115, var9 >> 2, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1840[var8] = var7;
                        this.field1848[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "([B)V", line = 182)
    public class122(byte[] arg0) {
        this.field1836 = new class143[128];
        this.field1843 = new short[128];
        this.field1832 = new byte[128];
        this.field1848 = new int[128];
        this.field1840 = new class224[128];
        this.field1841 = new byte[128];
        this.field1847 = new byte[128];
        class366 var2 = new class366(arg0);
        int var3;
        for (var3 = 0; var2.field5076[var2.field5048 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2289((byte) -77);
        }
        var2.field5048++;
        var3++;
        int var6 = var2.field5048;
        var2.field5048 += var3;
        int var7;
        for (var7 = 0; var2.field5076[var2.field5048 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2289((byte) -77);
        }
        var7++;
        var2.field5048++;
        int var10 = var2.field5048;
        var2.field5048 += var7;
        int var11;
        for (var11 = 0; var2.field5076[var2.field5048 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2289((byte) -77);
        }
        var11++;
        var2.field5048++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2306((byte) 103);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class143[] var19 = new class143[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class143 var103 = var19[var20] = new class143();
            int var104 = var2.method2306((byte) 77);
            if (var104 > 0) {
                var103.field2096 = new byte[var104 * 2];
            }
            int var105 = var2.method2306((byte) 44);
            if (var105 > 0) {
                var103.field2093 = new byte[var105 * 2 + 2];
                var103.field2093[1] = 64;
            }
        }
        int var21 = var2.method2306((byte) 68);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method2306((byte) 45);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field5076[var2.field5048 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method2289((byte) -77);
        }
        var25++;
        var2.field5048++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method2306((byte) 69);
            this.field1843[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method2306((byte) 73);
            this.field1843[var31] = (short) (this.field1843[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var33) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method2253(2081600583);
            }
            this.field1843[var35] = (short) (this.field1843[var35] + (class187.method1301(2, var34 - 1) << 14));
            this.field1848[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1848[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field5076[var6++] - 1;
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                var36--;
                this.field1832[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1848[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field5076[var10++] + 16 << 2;
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field1841[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class143 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1848[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field1836[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length > var48) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field1848[var51] > 0) {
                    var50 = var2.method2306((byte) 106) + 1;
                }
            }
            var49--;
            this.field1847[var51] = (byte) var50;
        }
        this.field1835 = var2.method2306((byte) 98) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class143 var100 = var19[var52];
            if (var100.field2096 != null) {
                for (int var101 = 1; var101 < var100.field2096.length; var101 += 2) {
                    var100.field2096[var101] = var2.method2289((byte) -77);
                }
            }
            if (var100.field2093 != null) {
                for (int var102 = 3; var102 < (var100.field2093.length - 2); var102 += 2) {
                    var100.field2093[var102] = var2.method2289((byte) -77);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method2289((byte) -77);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method2289((byte) -77);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class143 var97 = var19[var55];
            if (var97.field2093 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2093.length; var99 += 2) {
                    var98 = var2.method2306((byte) 44) + var98 + 1;
                    var97.field2093[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class143 var94 = var19[var56];
            if (var94.field2096 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2096.length; var96 += 2) {
                    var95 = var2.method2306((byte) 26) + var95 + 1;
                    var94.field2096[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method2306((byte) 89);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method2306((byte) 126) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field1847[var61] = (byte) (this.field1847[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class159.method1152(8, var65 - var59, var67);
                    var67 += var66 - var60;
                    this.field1847[var68] = (byte) (this.field1847[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var62 += 2;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field1847[var64] = (byte) (this.field1847[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method2306((byte) 33);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method2306((byte) 85) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field1841[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1841[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class159.method1152(8, var79 - var72, var81);
                    int var84 = (this.field1841[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field1841[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var72 = var79;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field1841[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1841[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field2091 = var2.method2306((byte) 62);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class143 var93 = var19[var87];
            if (var93.field2096 != null) {
                var93.field2085 = var2.method2306((byte) 123);
            }
            if (var93.field2093 != null) {
                var93.field2097 = var2.method2306((byte) 62);
            }
            if (var93.field2091 > 0) {
                var93.field2095 = var2.method2306((byte) 33);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field2098 = var2.method2306((byte) 110);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class143 var92 = var19[var89];
            if (var92.field2098 > 0) {
                var92.field2084 = var2.method2306((byte) 90);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class143 var91 = var19[var90];
            if (var91.field2084 > 0) {
                var91.field2089 = var2.method2306((byte) 89);
            }
        }
    }
}
