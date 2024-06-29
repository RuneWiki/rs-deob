import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class265 extends class154 {

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "[S")
    public short[] field4620;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "[Lbd;")
    public class198[] field4610;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "[B")
    public byte[] field4619;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "[Lwl;")
    public class63[] field4618;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "[I")
    private int[] field4613;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "[B")
    public byte[] field4605;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "[B")
    public byte[] field4607;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field4614 = 20;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "[Z")
    public static boolean[] field4616 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field4608 = -2;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "Loh;")
    private static class258 field4621 = class153.method1046("glow1:", 106);

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Loh;")
    public static class258 field4612 = field4621;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "Loh;")
    public static class258 field4617 = field4621;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Lmb;")
    public static class172 field4609 = new class172(20);

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "[I")
    public static int[] field4625 = new int[4096];

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "Lu;")
    public static class24 field4627;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1851(int arg0) {
        field4622++;
        if (class140.field2386 == 5) {
            if (arg0 != -10700) {
                method1857((class171) null, -51, 71, (byte) 8);
            }
            class140.field2386 = 6;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 23)
    public final void method1852(int arg0) {
        field4604++;
        this.field4613 = null;
        int var2 = 73 / ((arg0 + 69) / 32);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([B[IILdk;)Z", line = 46)
    public final boolean method1853(byte[] arg0, int[] arg1, int arg2, class281 arg3) {
        if (arg2 != -1) {
            return false;
        }
        field4611++;
        int var5 = 0;
        class198 var6 = null;
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field4613[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg3.method1971(var9 >> 2, (byte) -122, arg1);
                        } else {
                            var6 = arg3.method1975(var9 >> 2, 0, arg1);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field4610[var8] = var6;
                        this.field4613[var8] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)I", line = 106)
    public static final int method1854(byte arg0) {
        field4623++;
        int var1 = 10 % ((arg0 + 68) / 33);
        return class246.field4267;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4625[var0] = class246.method1682(-119354228, var0);
        }
        field4626 = 0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Log;", line = 133)
    public static final class210 method1855(int arg0, int arg1) {
        class210 var2 = (class210) class261.field4539.method701((long) arg0, 1);
        field4603++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 < 13) {
            method1857((class171) null, -23, 54, (byte) 18);
        }
        byte[] var3 = class310.field5255.method1453(class204.method1358(arg0, 7097), (byte) -94, class146.method1010(-123, arg0));
        class210 var4 = new class210();
        if (var3 != null) {
            var4.method1386(-1, new class235(var3));
        }
        class261.field4539.method698((long) arg0, (byte) 86, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)V", line = 157)
    public static void method1856(byte arg0) {
        field4609 = null;
        field4621 = null;
        if (arg0 != 121) {
            field4614 = 122;
        }
        field4612 = null;
        field4627 = null;
        field4617 = null;
        field4616 = null;
        field4625 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ls;IIB)V", line = 182)
    public static final void method1857(class171 arg0, int arg1, int arg2, byte arg3) {
        field4606++;
        if (class91.field1610 != 0 && class91.field1610 != 3 || !arg0.method1154(false)) {
            return;
        }
        int var4 = arg0.field2952[arg2];
        if (var4 > arg1 || arg1 > (arg0.field2972[arg2] + var4)) {
            return;
        }
        int var5 = arg1 - arg0.field3002 / 2;
        int var6 = arg2 - arg0.field3054 / 2;
        int var7 = class68.field1177 + class271.field4702 & 0x7FF;
        int var8 = class266.field4642[var7];
        int var9 = (class239.field4169 + 256) * var8 >> 8;
        int var10 = class266.field4636[var7];
        if (arg3 != -43) {
            method1856((byte) 14);
        }
        int var11 = (class239.field4169 + 256) * var10 >> 8;
        int var12 = var5 * var11 + var6 * var9 >> 11;
        int var13 = var6 * var11 - var5 * var9 >> 11;
        int var14 = class152.field2606.field912 + var12 >> 7;
        int var15 = class152.field2606.field934 - var13 >> 7;
        if (class70.field1212 > 0 && client.field610[82] && client.field610[81]) {
            class291.method2047(class272.field4704, class229.field3955 + var14, arg3 + -652159049, class311.field5271 + var15);
            return;
        }
        boolean var16 = class208.method1373(0, class152.field2606.field959[0], true, 0, 1, 0, var14, (byte) 32, var15, 0, 0, class152.field2606.field975[0]);
        if (!var16) {
            return;
        }
        class159.field2710.method1598(var5, 27052);
        class159.field2710.method1598(var6, 27052);
        class159.field2710.method1605(class68.field1177, (byte) 61);
        class159.field2710.method1598(57, arg3 + 27095);
        class159.field2710.method1598(class271.field4702, 27052);
        class159.field2710.method1598(class239.field4169, 27052);
        class159.field2710.method1598(89, 27052);
        class159.field2710.method1605(class152.field2606.field912, (byte) 73);
        class159.field2710.method1605(class152.field2606.field934, (byte) 123);
        class159.field2710.method1598(class301.field5156, 27052);
        class159.field2710.method1598(63, 27052);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 255)
    public class265() {
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([B)V", line = 258)
    public class265(byte[] arg0) {
        this.field4620 = new short[128];
        this.field4610 = new class198[128];
        this.field4619 = new byte[128];
        this.field4618 = new class63[128];
        this.field4613 = new int[128];
        this.field4605 = new byte[128];
        this.field4607 = new byte[128];
        class235 var2 = new class235(arg0);
        int var3;
        for (var3 = 0; var2.field4066[var2.field4051 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1617((byte) -117);
        }
        var2.field4051++;
        var3++;
        int var6 = var2.field4051;
        var2.field4051 += var3;
        int var7;
        for (var7 = 0; var2.field4066[var2.field4051 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1617((byte) -117);
        }
        var7++;
        var2.field4051++;
        int var10 = var2.field4051;
        var2.field4051 += var7;
        int var11;
        for (var11 = 0; var2.field4066[var2.field4051 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1617((byte) -117);
        }
        var2.field4051++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            int var16 = 1;
            var14[1] = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1589(68);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        }
        class63[] var19 = new class63[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class63 var21 = var19[var20] = new class63();
            int var22 = var2.method1589(58);
            if (var22 > 0) {
                var21.field1109 = new byte[var22 * 2];
            }
            int var23 = var2.method1589(119);
            if (var23 > 0) {
                var21.field1102 = new byte[var23 * 2 + 2];
                var21.field1102[1] = 64;
            }
        }
        int var24 = var2.method1589(111);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var2.method1589(73);
        int var27;
        for (var27 = 0; var2.field4066[var2.field4051 + var27] != 0; var27++) {
        }
        byte[] var28 = var26 <= 0 ? null : new byte[var26 * 2];
        byte[] var29 = new byte[var27];
        for (int var30 = 0; var30 < var27; var30++) {
            var29[var30] = var2.method1617((byte) -117);
        }
        var27++;
        var2.field4051++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method1589(122);
            this.field4620[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method1589(64);
            this.field4620[var34] = (short) (this.field4620[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var36 < var29.length) {
                    var35 = var29[var36++];
                } else {
                    var35 = -1;
                }
                var37 = var2.method1595(0);
            }
            this.field4620[var38] = (short) (this.field4620[var38] + (class2.method15(var37 - 1, 2) << 14));
            var35--;
            this.field4613[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4613[var42] != 0) {
                if (var39 == 0) {
                    if (var4.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var4[var40++];
                    }
                    var41 = var2.field4066[var6++] - 1;
                }
                this.field4619[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4613[var46] != 0) {
                if (var43 == 0) {
                    var45 = var2.field4066[var10++] + 16 << 2;
                    if (var8.length > var44) {
                        var43 = var8[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field4607[var46] = (byte) var45;
            }
        }
        int var47 = 0;
        class63 var48 = null;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field4613[var50] != 0) {
                if (var49 == 0) {
                    var48 = var19[var14[var47]];
                    if (var12.length <= var47) {
                        var49 = -1;
                    } else {
                        var49 = var12[var47++];
                    }
                }
                this.field4618[var50] = var48;
                var49--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var29.length > var52) {
                    var51 = var29[var52++];
                } else {
                    var51 = -1;
                }
                if (this.field4613[var54] > 0) {
                    var53 = var2.method1589(71) + 1;
                }
            }
            this.field4605[var54] = (byte) var53;
            var51--;
        }
        this.field4615 = var2.method1589(125) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class63 var56 = var19[var55];
            if (var56.field1109 != null) {
                for (int var57 = 1; var57 < var56.field1109.length; var57 += 2) {
                    var56.field1109[var57] = var2.method1617((byte) -117);
                }
            }
            if (var56.field1102 != null) {
                for (int var58 = 3; var58 < var56.field1102.length - 2; var58 += 2) {
                    var56.field1102[var58] = var2.method1617((byte) -117);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method1617((byte) -117);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var2.method1617((byte) -117);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class63 var62 = var19[var61];
            if (var62.field1102 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field1102.length; var64 += 2) {
                    var63 += var2.method1589(54) + 1;
                    var62.field1102[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class63 var66 = var19[var65];
            if (var66.field1109 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field1109.length; var68 += 2) {
                    var67 -= -var2.method1589(84) - 1;
                    var66.field1109[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method1589(51);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 -= -var2.method1589(69) - 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field4605[var73] = (byte) (this.field4605[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                var74 += 2;
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class68.method512(var75 - var71, (byte) 39, var77);
                    var77 += var76 - var72;
                    this.field4605[var78] = (byte) (this.field4605[var78] * var79 + 32 >> 6);
                }
                var71 = var75;
                var72 = var76;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field4605[var80] = (byte) (this.field4605[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var28 != null) {
            int var82 = var2.method1589(51);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 += var2.method1589(51) + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field4607[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field4607[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var28.length) {
                int var89 = var28[var88 + 1] << 1;
                byte var90 = var28[var88];
                var88 += 2;
                int var91 = (var90 - var84) / 2 + (var90 - var84) * var85;
                for (int var92 = var84; var92 < var90; var92++) {
                    int var93 = class68.method512(var90 - var84, (byte) 48, var91);
                    int var94 = (this.field4607[var92] & 0xFF) + var93;
                    var91 += var89 - var85;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field4607[var92] = (byte) var94;
                }
                var85 = var89;
                var84 = var90;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field4607[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field4607[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field1103 = var2.method1589(90);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class63 var100 = var19[var99];
            if (var100.field1109 != null) {
                var100.field1105 = var2.method1589(118);
            }
            if (var100.field1102 != null) {
                var100.field1111 = var2.method1589(91);
            }
            if (var100.field1103 > 0) {
                var100.field1110 = var2.method1589(89);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field1101 = var2.method1589(110);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class63 var103 = var19[var102];
            if (var103.field1101 > 0) {
                var103.field1114 = var2.method1589(83);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class63 var105 = var19[var104];
            if (var105.field1114 > 0) {
                var105.field1113 = var2.method1589(58);
            }
        }
    }
}
