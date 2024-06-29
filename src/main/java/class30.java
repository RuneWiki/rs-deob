import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class30 extends class70 {

    @OriginalMember(owner = "client!od", name = "w", descriptor = "[B")
    public byte[] field705;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "[Llb;")
    public class236[] field695;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[S")
    public short[] field693;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "[Lwc;")
    public class120[] field708;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "[B")
    public byte[] field704;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "[I")
    private int[] field701;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "[B")
    public byte[] field697;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field706 = 127;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Lma;")
    public static class318 field698;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([I[BBLnb;)Z", line = 6)
    public final boolean method229(int[] arg0, byte[] arg1, byte arg2, class348 arg3) {
        field700++;
        boolean var5 = true;
        int var6 = -120 % ((arg2 + 23) / 62);
        class236 var7 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg1 == null || arg1[var9] != 0) {
                int var10 = this.field701[var9];
                if (var10 != 0) {
                    if (var8 != var10) {
                        var8 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg3.method2487((byte) -83, var10 >> 2, arg0);
                        } else {
                            var7 = arg3.method2491(var10 >> 2, 11794, arg0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field695[var9] = var7;
                        this.field701[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lek;I)V", line = 62)
    public static final void method230(class206 arg0, int arg1) {
        if (arg1 != -28449) {
            field706 = -25;
        }
        field699++;
        class119.field2116 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V", line = 76)
    public static void method231(int arg0) {
        field698 = null;
        if (arg0 != 1) {
            field698 = (class318) null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lbn;Lg;IIIII)V", line = 88)
    public static final void method232(class75 arg0, class181 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field694++;
        if (arg0 == null) {
            return;
        }
        int var7;
        if (class69.field1280 == 4) {
            var7 = (int) class354.field5652 & 0x7FF;
        } else {
            var7 = (int) class354.field5652 + class192.field3253 & 0x7FF;
        }
        if (arg4 != 1) {
            method233((byte) -128, 91);
        }
        int var8 = arg2 * arg2 + arg5 * arg5;
        int var9 = Math.max(arg1.field3024 / 2, arg1.field2972 / 2) + 10;
        if (var8 > (var9 * var9)) {
            return;
        }
        int var10 = class305.field4959[var7];
        int var11 = class305.field4957[var7];
        if (class69.field1280 != 4) {
            var10 = var10 * 256 / (class292.field4726 + 256);
            var11 = var11 * 256 / (class292.field4726 + 256);
        }
        int var12 = arg5 * var10 + (arg2 * var11) >> 16;
        int var13 = arg5 * var11 - (arg2 * var10) >> 16;
        if (class241.field4016) {
            ((class265) arg0).method1863(arg1.field3024 / 2 + arg3 + var12 - arg0.field1359 / 2, arg6 - -(arg1.field2972 / 2) - (var13 - -(arg0.field1355 / 2)), (class265) arg1.method1266(102, false));
        } else {
            ((class288) arg0).method2042(arg3 + var12 - (arg0.field1359 / 2 + -(arg1.field3024 / 2)), arg1.field2972 / 2 + (arg6 - var13) + -(arg0.field1355 / 2), arg1.field3015, arg1.field2973);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V", line = 141)
    public static final void method233(byte arg0, int arg1) {
        if (arg0 != 3) {
            return;
        }
        class339 var2 = class317.field5164;
        synchronized (class317.field5164) {
            class220.field3654 = arg1;
        }
        field707++;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V", line = 160)
    public final void method234(byte arg0) {
        this.field701 = null;
        int var2 = 30 / ((-arg0 - 26) / 51);
        field702++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V", line = 171)
    public static final void method235(int arg0, int arg1) {
        field703++;
        if (arg1 < -51) {
            class199 var2 = class173.method1231(false, 1, arg0);
            var2.method1358(-1);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 192)
    public class30() {
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B)V", line = 194)
    public class30(byte[] arg0) {
        this.field705 = new byte[128];
        this.field695 = new class236[128];
        this.field693 = new short[128];
        this.field708 = new class120[128];
        this.field704 = new byte[128];
        this.field701 = new int[128];
        int var2 = 0;
        this.field697 = new byte[128];
        class146 var3 = new class146(arg0);
        while (var3.field2496[var3.field2435 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1029(-2);
        }
        var3.field2435++;
        var2++;
        int var6 = 0;
        int var7 = var3.field2435;
        var3.field2435 += var2;
        while (var3.field2496[var3.field2435 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1029(-2);
        }
        var6++;
        var3.field2435++;
        int var10 = var3.field2435;
        int var11 = 0;
        var3.field2435 += var6;
        while (var3.field2496[var3.field2435 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1029(-2);
        }
        var11++;
        byte[] var14 = new byte[var11];
        var3.field2435++;
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1005((byte) 122);
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
        } else {
            var15 = var11;
        }
        class120[] var19 = new class120[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class120 var21 = var19[var20] = new class120();
            int var22 = var3.method1005((byte) 122);
            if (var22 > 0) {
                var21.field2139 = new byte[var22 * 2];
            }
            int var23 = var3.method1005((byte) 122);
            if (var23 > 0) {
                var21.field2132 = new byte[var23 * 2 + 2];
                var21.field2132[1] = 64;
            }
        }
        int var24 = var3.method1005((byte) 122);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = 0;
        int var27 = var3.method1005((byte) 122);
        while (var3.field2496[var3.field2435 + var26] != 0) {
            var26++;
        }
        byte[] var28 = var27 > 0 ? new byte[var27 * 2] : null;
        byte[] var29 = new byte[var26];
        for (int var30 = 0; var30 < var26; var30++) {
            var29[var30] = var3.method1029(-2);
        }
        var3.field2435++;
        var26++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1005((byte) 122);
            this.field693[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1005((byte) 122);
            this.field693[var34] = (short) (this.field693[var34] + (var33 << 8));
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
                var36 = var3.method997((byte) -98);
            }
            this.field693[var38] = (short) (this.field693[var38] + (class83.method613(var36 - 1, 2) << 14));
            var35--;
            this.field701[var38] = var36;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field701[var42] != 0) {
                if (var41 == 0) {
                    var40 = var3.field2496[var7++] - 1;
                    if (var4.length > var39) {
                        var41 = var4[var39++];
                    } else {
                        var41 = -1;
                    }
                }
                this.field697[var42] = (byte) var40;
                var41--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field701[var46] != 0) {
                if (var43 == 0) {
                    var45 = var3.field2496[var10++] + 16 << 2;
                    if (var44 >= var8.length) {
                        var43 = -1;
                    } else {
                        var43 = var8[var44++];
                    }
                }
                this.field705[var46] = (byte) var45;
                var43--;
            }
        }
        int var47 = 0;
        class120 var48 = null;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field701[var50] != 0) {
                if (var47 == 0) {
                    var48 = var19[var14[var49]];
                    if (var12.length > var49) {
                        var47 = var12[var49++];
                    } else {
                        var47 = -1;
                    }
                }
                var47--;
                this.field708[var50] = var48;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var29.length > var53) {
                    var51 = var29[var53++];
                } else {
                    var51 = -1;
                }
                if (this.field701[var54] > 0) {
                    var52 = var3.method1005((byte) 122) + 1;
                }
            }
            var51--;
            this.field704[var54] = (byte) var52;
        }
        this.field696 = var3.method1005((byte) 122) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class120 var56 = var19[var55];
            if (var56.field2139 != null) {
                for (int var57 = 1; var57 < var56.field2139.length; var57 += 2) {
                    var56.field2139[var57] = var3.method1029(-2);
                }
            }
            if (var56.field2132 != null) {
                for (int var58 = 3; var58 < (var56.field2132.length - 2); var58 += 2) {
                    var56.field2132[var58] = var3.method1029(-2);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1029(-2);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method1029(-2);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class120 var62 = var19[var61];
            if (var62.field2132 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field2132.length; var64 += 2) {
                    var63 = var3.method1005((byte) 122) + (var63 + 1);
                    var62.field2132[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class120 var66 = var19[var65];
            if (var66.field2139 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field2139.length; var68 += 2) {
                    var67 = var67 + var3.method1005((byte) 122) + 1;
                    var66.field2139[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method1005((byte) 122);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method1005((byte) 122) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field704[var73] = (byte) (this.field704[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74 + 1];
                byte var76 = var25[var74];
                int var77 = (var76 - var71) / 2 + (var76 - var71) * var72;
                var74 += 2;
                for (int var78 = var71; var78 < var76; var78++) {
                    int var79 = class189.method1308(var77, 1009703871, var76 - var71);
                    this.field704[var78] = (byte) (this.field704[var78] * var79 + 32 >> 6);
                    var77 += var75 - var72;
                }
                var71 = var76;
                var72 = var75;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field704[var81] = (byte) (this.field704[var81] * var72 + 32 >> 6);
            }
        }
        if (var28 != null) {
            int var82 = var3.method1005((byte) 122);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 = var82 + var3.method1005((byte) 122) + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field705[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field705[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var28.length) {
                int var89 = var28[var88 + 1] << 1;
                byte var90 = var28[var88];
                var88 += 2;
                int var91 = (var90 - var84) * var85 + ((var90 - var84) / 2);
                for (int var92 = var84; var92 < var90; var92++) {
                    int var93 = class189.method1308(var91, 1009703871, var90 - var84);
                    var91 += var89 - var85;
                    int var94 = (this.field705[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field705[var92] = (byte) var94;
                }
                var84 = var90;
                var85 = var89;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field705[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field705[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field2128 = var3.method1005((byte) 122);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class120 var100 = var19[var99];
            if (var100.field2139 != null) {
                var100.field2141 = var3.method1005((byte) 122);
            }
            if (var100.field2132 != null) {
                var100.field2130 = var3.method1005((byte) 122);
            }
            if (var100.field2128 > 0) {
                var100.field2133 = var3.method1005((byte) 122);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field2129 = var3.method1005((byte) 122);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class120 var103 = var19[var102];
            if (var103.field2129 > 0) {
                var103.field2134 = var3.method1005((byte) 122);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class120 var105 = var19[var104];
            if (var105.field2134 > 0) {
                var105.field2138 = var3.method1005((byte) 122);
            }
        }
    }
}
