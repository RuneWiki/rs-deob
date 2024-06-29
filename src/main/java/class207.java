import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class207 extends class101 {

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "[Lll;")
    public class151[] field3132;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "[S")
    public short[] field3131;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "[B")
    public byte[] field3136;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "[Lsf;")
    public class220[] field3142;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "[B")
    public byte[] field3134;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "[B")
    public byte[] field3128;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "[I")
    private int[] field3129;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field3135 = 0;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "Lkh;")
    public static class7 field3137 = new class7(5000);

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field3140 = 0;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field3139 = 0;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[ILvb;[B)Z", line = 5)
    public final boolean method1422(int arg0, int[] arg1, class76 arg2, byte[] arg3) {
        field3127++;
        boolean var5 = true;
        int var6 = 0;
        class220 var7 = null;
        int var8 = -69 / ((arg0) / 45);
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg3 == null || arg3[var9] != 0) {
                int var10 = this.field3129[var9];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg2.method487(0, arg1, var10 >> 2);
                        } else {
                            var7 = arg2.method488(arg1, var10 >> 2, (byte) 107);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3142[var9] = var7;
                        this.field3129[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V", line = 74)
    public final void method1423(int arg0) {
        field3133++;
        if (arg0 != 3) {
            field3135 = -37;
        }
        this.field3129 = null;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)V", line = 91)
    public static final void method1424(int arg0, int arg1, int arg2) {
        field3141++;
        class169 var3 = class101.method712(arg2, arg0, 2089666400);
        var3.method1183(false);
        var3.field2542 = arg1;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V", line = 111)
    public static void method1425(int arg0) {
        field3137 = null;
        if (arg0 != -1) {
            field3140 = -96;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 126)
    public class207() {
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "([B)V", line = 131)
    public class207(byte[] arg0) {
        this.field3132 = new class151[128];
        this.field3131 = new short[128];
        this.field3136 = new byte[128];
        this.field3142 = new class220[128];
        this.field3134 = new byte[128];
        this.field3128 = new byte[128];
        this.field3129 = new int[128];
        int var2 = 0;
        class263 var3 = new class263(arg0);
        while (var3.field3986[var3.field4025 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1810((byte) 102);
        }
        var2++;
        var3.field4025++;
        int var6 = var3.field4025;
        var3.field4025 += var2;
        int var7;
        for (var7 = 0; var3.field3986[var3.field4025 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1810((byte) 100);
        }
        var7++;
        var3.field4025++;
        int var10 = 0;
        int var11 = var3.field4025;
        var3.field4025 += var7;
        while (var3.field3986[var3.field4025 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1810((byte) 104);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var3.field4025++;
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            int var16 = 1;
            var15 = 2;
            var14[1] = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method1787(false);
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
        class151[] var19 = new class151[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class151 var21 = var19[var20] = new class151();
            int var22 = var3.method1787(false);
            if (var22 > 0) {
                var21.field2269 = new byte[var22 * 2];
            }
            int var23 = var3.method1787(false);
            if (var23 > 0) {
                var21.field2272 = new byte[var23 * 2 + 2];
                var21.field2272[1] = 64;
            }
        }
        int var24 = var3.method1787(false);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = 0;
        int var27 = var3.method1787(false);
        while (var3.field3986[var3.field4025 + var26] != 0) {
            var26++;
        }
        byte[] var28 = new byte[var26];
        byte[] var29 = var27 > 0 ? new byte[var27 * 2] : null;
        for (int var30 = 0; var30 < var26; var30++) {
            var28[var30] = var3.method1810((byte) 97);
        }
        var3.field4025++;
        var26++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1787(false);
            this.field3131[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1787(false);
            this.field3131[var34] = (short) (this.field3131[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var36 >= var28.length) {
                    var35 = -1;
                } else {
                    var35 = var28[var36++];
                }
                var37 = var3.method1828(-3732);
            }
            this.field3131[var38] = (short) (this.field3131[var38] + (class124.method893(var37 - 1, 2) << 14));
            var35--;
            this.field3129[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3129[var42] != 0) {
                if (var39 == 0) {
                    var41 = var3.field3986[var6++] - 1;
                    if (var40 < var4.length) {
                        var39 = var4[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                var39--;
                this.field3136[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3129[var46] != 0) {
                if (var44 == 0) {
                    var45 = var3.field3986[var11++] + 16 << 2;
                    if (var43 >= var8.length) {
                        var44 = -1;
                    } else {
                        var44 = var8[var43++];
                    }
                }
                this.field3128[var46] = (byte) var45;
                var44--;
            }
        }
        class151 var47 = null;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3129[var50] != 0) {
                if (var49 == 0) {
                    var47 = var19[var14[var48]];
                    if (var48 < var12.length) {
                        var49 = var12[var48++];
                    } else {
                        var49 = -1;
                    }
                }
                var49--;
                this.field3132[var50] = var47;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var28.length <= var53) {
                    var51 = -1;
                } else {
                    var51 = var28[var53++];
                }
                if (this.field3129[var54] > 0) {
                    var52 = var3.method1787(false) + 1;
                }
            }
            var51--;
            this.field3134[var54] = (byte) var52;
        }
        this.field3138 = var3.method1787(false) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class151 var56 = var19[var55];
            if (var56.field2269 != null) {
                for (int var57 = 1; var57 < var56.field2269.length; var57 += 2) {
                    var56.field2269[var57] = var3.method1810((byte) 122);
                }
            }
            if (var56.field2272 != null) {
                for (int var58 = 3; var58 < var56.field2272.length - 2; var58 += 2) {
                    var56.field2272[var58] = var3.method1810((byte) 111);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1810((byte) 103);
            }
        }
        if (var29 != null) {
            for (int var60 = 1; var60 < var29.length; var60 += 2) {
                var29[var60] = var3.method1810((byte) 100);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class151 var62 = var19[var61];
            if (var62.field2272 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field2272.length; var64 += 2) {
                    var63 += var3.method1787(false) + 1;
                    var62.field2272[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class151 var66 = var19[var65];
            if (var66.field2269 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field2269.length; var68 += 2) {
                    var67 = var67 + var3.method1787(false) + 1;
                    var66.field2269[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method1787(false);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 -= -var3.method1787(false) - 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field3134[var73] = (byte) (this.field3134[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74 + 1];
                byte var76 = var25[var74];
                var74 += 2;
                int var77 = (var76 - var71) / 2 + (var76 - var71) * var72;
                for (int var78 = var71; var78 < var76; var78++) {
                    int var79 = class141.method1014(var76 - var71, var77, 46);
                    var77 += var75 - var72;
                    this.field3134[var78] = (byte) (this.field3134[var78] * var79 + 32 >> 6);
                }
                var72 = var75;
                var71 = var76;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field3134[var81] = (byte) (this.field3134[var81] * var72 + 32 >> 6);
            }
        }
        if (var29 != null) {
            int var82 = var3.method1787(false);
            var29[0] = (byte) var82;
            for (int var83 = 2; var83 < var29.length; var83 += 2) {
                var82 = var82 + var3.method1787(false) + 1;
                var29[var83] = (byte) var82;
            }
            byte var84 = var29[0];
            int var85 = var29[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field3128[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3128[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var29.length) {
                int var89 = var29[var88 + 1] << 1;
                byte var90 = var29[var88];
                var88 += 2;
                int var91 = (var90 - var84) * var85 + ((var90 - var84) / 2);
                for (int var92 = var84; var92 < var90; var92++) {
                    int var93 = class141.method1014(var90 - var84, var91, 22);
                    var91 += var89 - var85;
                    int var94 = (this.field3128[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3128[var92] = (byte) var94;
                }
                var85 = var89;
                var84 = var90;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field3128[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field3128[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field2266 = var3.method1787(false);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class151 var100 = var19[var99];
            if (var100.field2269 != null) {
                var100.field2262 = var3.method1787(false);
            }
            if (var100.field2272 != null) {
                var100.field2271 = var3.method1787(false);
            }
            if (var100.field2266 > 0) {
                var100.field2273 = var3.method1787(false);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field2264 = var3.method1787(false);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class151 var103 = var19[var102];
            if (var103.field2264 > 0) {
                var103.field2277 = var3.method1787(false);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class151 var105 = var19[var104];
            if (var105.field2277 > 0) {
                var105.field2267 = var3.method1787(false);
            }
        }
    }
}
