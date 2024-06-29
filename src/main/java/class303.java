import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class303 extends class151 {

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "[I")
    private int[] field5109;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "[S")
    public short[] field5111;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "[Lnf;")
    public class137[] field5113;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "[Ls;")
    public class310[] field5108;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "[B")
    public byte[] field5118;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "[B")
    public byte[] field5104;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "[B")
    public byte[] field5116;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public int field5117;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field5106 = 0;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field5107 = 0;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "Lle;")
    public static class91 field5119 = new class91(0, 0);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "Lbd;")
    private static class162 field5120 = class17.method142(0, "flash3:");

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "Lbd;")
    public static class162 field5121 = field5120;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Lbd;")
    public static class162 field5122 = field5120;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)Z", line = 4)
    public static final boolean method2062(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class223.field3734 * arg0 + class156.field2750 * arg3 >> 16;
        int var6 = class223.field3734 * arg3 - class156.field2750 * arg0 >> 16;
        int var7 = class308.field5177 * arg1 + class251.field4195 * var6 >> 16;
        int var8 = class251.field4195 * arg1 - class308.field5177 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class308.field5177 * arg2 + class251.field4195 * var6 >> 16;
        int var12 = class251.field4195 * arg2 - class308.field5177 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class90.field1606 && var13 < class90.field1606) {
            return false;
        } else if (var9 > class198.field3367 && var13 > class198.field3367) {
            return false;
        } else if (var10 < class23.field403 && var14 < class23.field403) {
            return false;
        } else {
            return var10 <= class80.field1402 || var14 <= class80.field1402;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([B[IILoa;)Z", line = 53)
    public final boolean method2063(byte[] arg0, int[] arg1, int arg2, class141 arg3) {
        boolean var5 = true;
        field5123++;
        class310 var6 = null;
        int var7 = 0;
        if (arg2 >= -7) {
            this.field5104 = (byte[]) null;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field5109[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg3.method1103(1, var9 >> 2, arg1);
                        } else {
                            var6 = arg3.method1096(var9 >> 2, arg1, (byte) 19);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field5108[var8] = var6;
                        this.field5109[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([BB)[B", line = 119)
    public static final byte[] method2064(byte[] arg0, byte arg1) {
        field5103++;
        int var2 = arg0.length;
        if (arg1 < 15) {
            field5121 = (class162) null;
        }
        byte[] var3 = new byte[var2];
        class161.method1231(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 138)
    public static void method2065(int arg0) {
        field5119 = null;
        field5122 = null;
        if (arg0 != 0) {
            method2068((byte) -91);
        }
        field5121 = null;
        field5120 = null;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V", line = 152)
    public final void method2066(byte arg0) {
        field5105++;
        this.field5109 = null;
        if (arg0 != -27) {
            this.field5118 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLb;)V", line = 166)
    public static final void method2067(byte arg0, class94 arg1) {
        int var2 = arg1.method755((byte) -101);
        field5112++;
        class58.field899 = new class59[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class58.field899[var3] = new class59();
            class58.field899[var3].field924 = arg1.method755((byte) -101);
            class58.field899[var3].field920 = arg1.method712((byte) -121);
        }
        if (arg0 != -109) {
            method2067((byte) 33, (class94) null);
        }
        class40.field657 = arg1.method755((byte) -101);
        class114.field2040 = arg1.method755((byte) -101);
        class317.field5351 = arg1.method755((byte) -101);
        class220.field3661 = new class223[class114.field2040 + 1 - class40.field657];
        for (int var4 = 0; var4 < class317.field5351; var4++) {
            int var5 = arg1.method755((byte) -101);
            class223 var6 = class220.field3661[var5] = new class223();
            var6.field12 = arg1.method756(915905888);
            var6.field7 = arg1.method747(false);
            var6.field3721 = var5 + class40.field657;
            var6.field3731 = arg1.method712((byte) -123);
            var6.field3730 = arg1.method712((byte) 123);
        }
        class293.field4935 = arg1.method747(false);
        class245.field4081 = true;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V", line = 223)
    public static final void method2068(byte arg0) {
        field5115++;
        class112.field2022.method1533(true);
        if (arg0 >= -126) {
            method2062(20, 17, -21, -69, -55);
        }
        class27.field459.method1533(true);
        class93.field1647.method1533(true);
        class284.field4806.method1533(true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBI)I", line = 243)
    public static final int method2069(int arg0, byte arg1, int arg2) {
        int var3 = 66 % ((arg1 - 91) / 33);
        class101 var4 = (class101) class40.field651.method1672((long) arg2, 19760);
        field5110++;
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && var4.field1849.length > arg0) {
            return var4.field1849[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 291)
    public class303() {
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V", line = 293)
    public class303(byte[] arg0) {
        this.field5109 = new int[128];
        this.field5111 = new short[128];
        this.field5113 = new class137[128];
        this.field5108 = new class310[128];
        this.field5118 = new byte[128];
        this.field5104 = new byte[128];
        int var2 = 0;
        this.field5116 = new byte[128];
        class94 var3 = new class94(arg0);
        while (var3.field1681[var3.field1653 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method719((byte) -42);
        }
        var3.field1653++;
        int var6 = var3.field1653;
        var2++;
        var3.field1653 += var2;
        int var7;
        for (var7 = 0; var3.field1681[var3.field1653 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method719((byte) -42);
        }
        var7++;
        var3.field1653++;
        int var10 = 0;
        int var11 = var3.field1653;
        var3.field1653 += var7;
        while (var3.field1681[var3.field1653 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method719((byte) -42);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var3.field1653++;
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method756(915905888);
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
        class137[] var19 = new class137[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class137 var21 = var19[var20] = new class137();
            int var22 = var3.method756(915905888);
            if (var22 > 0) {
                var21.field2438 = new byte[var22 * 2];
            }
            int var23 = var3.method756(915905888);
            if (var23 > 0) {
                var21.field2450 = new byte[var23 * 2 + 2];
                var21.field2450[1] = 64;
            }
        }
        int var24 = var3.method756(915905888);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = 0;
        int var27 = var3.method756(915905888);
        while (var3.field1681[var3.field1653 + var26] != 0) {
            var26++;
        }
        byte[] var28 = new byte[var26];
        for (int var29 = 0; var29 < var26; var29++) {
            var28[var29] = var3.method719((byte) -42);
        }
        int var30 = 0;
        var26++;
        byte[] var31 = var27 > 0 ? new byte[var27 * 2] : null;
        var3.field1653++;
        for (int var32 = 0; var32 < 128; var32++) {
            var30 += var3.method756(915905888);
            this.field5111[var32] = (short) var30;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method756(915905888);
            this.field5111[var34] = (short) (this.field5111[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var36 == 0) {
                if (var28.length <= var37) {
                    var36 = -1;
                } else {
                    var36 = var28[var37++];
                }
                var35 = var3.method743(-96);
            }
            this.field5111[var38] = (short) (this.field5111[var38] + (class92.method695(2, var35 - 1) << 14));
            this.field5109[var38] = var35;
            var36--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field5109[var42] != 0) {
                if (var39 == 0) {
                    if (var40 < var4.length) {
                        var39 = var4[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var3.field1681[var6++] - 1;
                }
                this.field5116[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field5109[var46] != 0) {
                if (var44 == 0) {
                    var45 = var3.field1681[var11++] + 16 << 2;
                    if (var8.length > var43) {
                        var44 = var8[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field5118[var46] = (byte) var45;
                var44--;
            }
        }
        int var47 = 0;
        class137 var48 = null;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field5109[var50] != 0) {
                if (var49 == 0) {
                    var48 = var19[var14[var47]];
                    if (var47 >= var12.length) {
                        var49 = -1;
                    } else {
                        var49 = var12[var47++];
                    }
                }
                this.field5113[var50] = var48;
                var49--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var51 >= var28.length) {
                    var52 = -1;
                } else {
                    var52 = var28[var51++];
                }
                if (this.field5109[var54] > 0) {
                    var53 = var3.method756(915905888) + 1;
                }
            }
            this.field5104[var54] = (byte) var53;
            var52--;
        }
        this.field5117 = var3.method756(915905888) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class137 var56 = var19[var55];
            if (var56.field2438 != null) {
                for (int var57 = 1; var57 < var56.field2438.length; var57 += 2) {
                    var56.field2438[var57] = var3.method719((byte) -42);
                }
            }
            if (var56.field2450 != null) {
                for (int var58 = 3; var58 < var56.field2450.length - 2; var58 += 2) {
                    var56.field2450[var58] = var3.method719((byte) -42);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method719((byte) -42);
            }
        }
        if (var31 != null) {
            for (int var60 = 1; var60 < var31.length; var60 += 2) {
                var31[var60] = var3.method719((byte) -42);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class137 var62 = var19[var61];
            if (var62.field2450 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field2450.length; var64 += 2) {
                    var63 = var63 + var3.method756(915905888) + 1;
                    var62.field2450[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class137 var66 = var19[var65];
            if (var66.field2438 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field2438.length; var68 += 2) {
                    var67 = var67 + var3.method756(915905888) + 1;
                    var66.field2438[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method756(915905888);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method756(915905888) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field5104[var73] = (byte) (this.field5104[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                int var77 = (var75 - var71) * var72 + ((var75 - var71) / 2);
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class144.method1160((byte) -122, var75 - var71, var77);
                    this.field5104[var78] = (byte) (this.field5104[var78] * var79 + 32 >> 6);
                    var77 += var76 - var72;
                }
                var74 += 2;
                var72 = var76;
                var71 = var75;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field5104[var80] = (byte) (this.field5104[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var31 != null) {
            int var82 = var3.method756(915905888);
            var31[0] = (byte) var82;
            for (int var83 = 2; var83 < var31.length; var83 += 2) {
                var82 = var82 + var3.method756(915905888) + 1;
                var31[var83] = (byte) var82;
            }
            byte var84 = var31[0];
            int var85 = var31[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field5118[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field5118[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var31.length > var88) {
                byte var89 = var31[var88];
                int var90 = var31[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class144.method1160((byte) -124, var89 - var84, var91);
                    var91 += var90 - var85;
                    int var94 = (this.field5118[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field5118[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field5118[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field5118[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field2439 = var3.method756(915905888);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class137 var100 = var19[var99];
            if (var100.field2438 != null) {
                var100.field2443 = var3.method756(915905888);
            }
            if (var100.field2450 != null) {
                var100.field2449 = var3.method756(915905888);
            }
            if (var100.field2439 > 0) {
                var100.field2451 = var3.method756(915905888);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field2454 = var3.method756(915905888);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class137 var103 = var19[var102];
            if (var103.field2454 > 0) {
                var103.field2442 = var3.method756(915905888);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class137 var105 = var19[var104];
            if (var105.field2442 > 0) {
                var105.field2445 = var3.method756(915905888);
            }
        }
    }
}
