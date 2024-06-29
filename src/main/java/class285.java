import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class285 extends class163 {

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "[S")
    public short[] field4943;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "[B")
    public byte[] field4938;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "[Lof;")
    public class268[] field4942;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "[B")
    public byte[] field4940;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "[I")
    private int[] field4937;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "[Lah;")
    public class157[] field4953;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "[B")
    public byte[] field4949;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public int field4951;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "[I")
    public static int[] field4939 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "Lke;")
    public static class256 field4947 = class316.method2202("Fermer", 27626);

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "[I")
    public static int[] field4948 = new int[500];

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "Lke;")
    public static class256 field4955 = class316.method2202("::shiftclick", 27626);

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "Lke;")
    public static class256 field4954 = class316.method2202("Hidden)2use", 27626);

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "Lng;")
    public static class138 field4956;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BZ)V", line = 8)
    public static final void method1993(byte arg0, boolean arg1) {
        field4946++;
        int var2 = class51.field939.length;
        byte[][] var3;
        if (class253.field4323 && arg1) {
            var3 = class77.field1460;
        } else {
            var3 = class115.field2021;
        }
        int var4 = 0;
        if (arg0 >= -79) {
            method1998(-49, -124);
        }
        while (var2 > var4) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class44.field829[var4] & 0xFF) * 64 - class10.field147;
                int var7 = (class44.field829[var4] >> 8) * 64 - class134.field2336;
                class65.method506(true);
                class143.method1047(var6, arg1, class124.field2201, var7, (byte) 69, var5);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)Lc;", line = 55)
    public static final class70 method1994(int arg0, int arg1, int arg2) {
        field4950++;
        class70 var3 = new class70();
        for (class31 var4 = (class31) class234.field4003.method1270((byte) -121); var4 != null; var4 = (class31) class234.field4003.method1277(1)) {
            if (var4.field493 && var4.method220((byte) 116, arg2, arg1)) {
                var3.method537(var4, -1);
            }
        }
        int var5 = 65 % ((arg0 - 26) / 45);
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[BLjc;[I)Z", line = 79)
    public final boolean method1995(int arg0, byte[] arg1, class181 arg2, int[] arg3) {
        if (arg0 != -11392) {
            method1999(-31);
        }
        int var5 = 0;
        class268 var6 = null;
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field4937[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg2.method1328(arg3, (byte) 107, var9 >> 2);
                        } else {
                            var6 = arg2.method1325(arg3, var9 >> 2, -2753);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field4942[var8] = var6;
                        this.field4937[var8] = 0;
                    }
                }
            }
        }
        field4952++;
        return var7;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZII)I", line = 137)
    public static final int method1996(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return -105;
        }
        class185 var3 = (class185) class254.field4355.method1744((byte) 126, (long) arg1);
        field4944++;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field3256.length > arg2) {
            return var3.field3256[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 158)
    public final void method1997(boolean arg0) {
        if (arg0) {
            this.field4937 = null;
            field4941++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I", line = 171)
    public static final int method1998(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V", line = 185)
    public static void method1999(int arg0) {
        field4947 = null;
        field4956 = null;
        field4939 = null;
        field4954 = null;
        field4955 = null;
        if (arg0 >= -121) {
            field4955 = (class256) null;
        }
        field4948 = null;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 215)
    public class285() {
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "([B)V", line = 220)
    public class285(byte[] arg0) {
        this.field4943 = new short[128];
        this.field4938 = new byte[128];
        this.field4942 = new class268[128];
        this.field4940 = new byte[128];
        this.field4937 = new int[128];
        int var2 = 0;
        this.field4953 = new class157[128];
        this.field4949 = new byte[128];
        class41 var3 = new class41(arg0);
        while (var3.field772[var3.field738 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method323(9092);
        }
        var3.field738++;
        var2++;
        int var6 = var3.field738;
        var3.field738 += var2;
        int var7;
        for (var7 = 0; var3.field772[var3.field738 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method323(9092);
        }
        var7++;
        var3.field738++;
        int var10 = var3.field738;
        int var11 = 0;
        var3.field738 += var7;
        while (var3.field772[var3.field738 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method323(9092);
        }
        var3.field738++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method357(false);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        }
        class157[] var19 = new class157[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class157 var21 = var19[var20] = new class157();
            int var22 = var3.method357(false);
            if (var22 > 0) {
                var21.field2797 = new byte[var22 * 2];
            }
            int var23 = var3.method357(false);
            if (var23 > 0) {
                var21.field2790 = new byte[var23 * 2 + 2];
                var21.field2790[1] = 64;
            }
        }
        int var24 = var3.method357(false);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var3.method357(false);
        byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
        int var28;
        for (var28 = 0; var3.field772[var3.field738 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method323(9092);
        }
        var28++;
        var3.field738++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method357(false);
            this.field4943[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method357(false);
            this.field4943[var34] = (short) (this.field4943[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length > var37) {
                    var35 = var29[var37++];
                } else {
                    var35 = -1;
                }
                var36 = var3.method333(-66);
            }
            this.field4943[var38] = (short) (this.field4943[var38] + (class150.method1123(var36 - 1, 2) << 14));
            this.field4937[var38] = var36;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4937[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field772[var6++] - 1;
                    if (var39 < var4.length) {
                        var40 = var4[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field4940[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4937[var46] != 0) {
                if (var43 == 0) {
                    if (var8.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var8[var44++];
                    }
                    var45 = var3.field772[var10++] + 16 << 2;
                }
                this.field4938[var46] = (byte) var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class157 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field4937[var50] != 0) {
                if (var47 == 0) {
                    var49 = var19[var14[var48]];
                    if (var12.length > var48) {
                        var47 = var12[var48++];
                    } else {
                        var47 = -1;
                    }
                }
                var47--;
                this.field4953[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var29.length <= var51) {
                    var52 = -1;
                } else {
                    var52 = var29[var51++];
                }
                if (this.field4937[var54] > 0) {
                    var53 = var3.method357(false) + 1;
                }
            }
            var52--;
            this.field4949[var54] = (byte) var53;
        }
        this.field4951 = var3.method357(false) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class157 var56 = var19[var55];
            if (var56.field2797 != null) {
                for (int var57 = 1; var57 < var56.field2797.length; var57 += 2) {
                    var56.field2797[var57] = var3.method323(9092);
                }
            }
            if (var56.field2790 != null) {
                for (int var58 = 3; var58 < (var56.field2790.length - 2); var58 += 2) {
                    var56.field2790[var58] = var3.method323(9092);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method323(9092);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method323(9092);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class157 var62 = var19[var61];
            if (var62.field2790 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field2790.length; var64 += 2) {
                    var63 = var3.method357(false) + var63 + 1;
                    var62.field2790[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class157 var66 = var19[var65];
            if (var66.field2797 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field2797.length; var68 += 2) {
                    var67 = var3.method357(false) + var67 + 1;
                    var66.field2797[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method357(false);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 += var3.method357(false) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field4949[var73] = (byte) (this.field4949[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74];
                int var76 = (var75 - var71) / 2 + (var75 - var71) * var72;
                byte var77 = var25[var74 + 1];
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class301.method2100((byte) 117, var75 - var71, var76);
                    var76 += var77 - var72;
                    this.field4949[var78] = (byte) (this.field4949[var78] * var79 + 32 >> 6);
                }
                var71 = var75;
                var74 += 2;
                var72 = var77;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field4949[var81] = (byte) (this.field4949[var81] * var72 + 32 >> 6);
            }
        }
        if (var27 != null) {
            int var82 = var3.method357(false);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var3.method357(false) + var82 + 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field4938[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field4938[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var27.length > var88) {
                byte var89 = var27[var88];
                int var90 = var27[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class301.method2100((byte) 79, var89 - var84, var91);
                    var91 += var90 - var85;
                    int var94 = (this.field4938[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field4938[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var90;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field4938[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field4938[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field2794 = var3.method357(false);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class157 var100 = var19[var99];
            if (var100.field2797 != null) {
                var100.field2789 = var3.method357(false);
            }
            if (var100.field2790 != null) {
                var100.field2807 = var3.method357(false);
            }
            if (var100.field2794 > 0) {
                var100.field2809 = var3.method357(false);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field2808 = var3.method357(false);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class157 var103 = var19[var102];
            if (var103.field2808 > 0) {
                var103.field2806 = var3.method357(false);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class157 var105 = var19[var104];
            if (var105.field2806 > 0) {
                var105.field2791 = var3.method357(false);
            }
        }
        if (class124.field2207) {
        }
    }
}
