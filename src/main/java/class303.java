import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class303 extends class5 {

    @OriginalMember(owner = "client!h", name = "G", descriptor = "[B")
    public byte[] field4644;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "[B")
    public byte[] field4635;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "[I")
    private int[] field4639;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "[S")
    public short[] field4637;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "[Lid;")
    public class266[] field4641;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "[Luf;")
    public class200[] field4638;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[B")
    public byte[] field4640;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "J")
    public static long field4636 = 0L;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field4645 = 0;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Ljd;")
    public static class95 field4634;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 8)
    public final void method2078(int arg0) {
        field4646++;
        this.field4639 = null;
        if (arg0 <= 7) {
            this.field4637 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([BLed;[II)Z", line = 24)
    public final boolean method2079(byte[] arg0, class323 arg1, int[] arg2, int arg3) {
        field4643++;
        if (arg3 != 9697) {
            field4632 = 6;
        }
        boolean var5 = true;
        int var6 = 0;
        class266 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field4639[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method2239(arg2, (byte) -25, var9 >> 2);
                        } else {
                            var7 = arg1.method2242(var9 >> 2, -108, arg2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4641[var8] = var7;
                        this.field4639[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 89)
    public static void method2080(boolean arg0) {
        field4634 = null;
        if (!arg0) {
            field4632 = -71;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 101)
    public class303() {
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "([B)V", line = 103)
    public class303(byte[] arg0) {
        this.field4644 = new byte[128];
        this.field4635 = new byte[128];
        this.field4639 = new int[128];
        this.field4637 = new short[128];
        this.field4641 = new class266[128];
        this.field4638 = new class200[128];
        int var2 = 0;
        this.field4640 = new byte[128];
        class254 var3 = new class254(arg0);
        while (var3.field3840[var3.field3866 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1733(2023893896);
        }
        var3.field3866++;
        var2++;
        int var6 = var3.field3866;
        var3.field3866 += var2;
        int var7;
        for (var7 = 0; var3.field3840[var3.field3866 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1733(2023893896);
        }
        int var10 = 0;
        var7++;
        var3.field3866++;
        int var11 = var3.field3866;
        var3.field3866 += var7;
        while (var3.field3840[var3.field3866 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1733(2023893896);
        }
        var10++;
        var3.field3866++;
        byte[] var14 = new byte[var10];
        int var16;
        if (var10 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method1774((byte) -111);
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
            var16 = var10;
        }
        class200[] var19 = new class200[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class200 var21 = var19[var20] = new class200();
            int var22 = var3.method1774((byte) 73);
            if (var22 > 0) {
                var21.field3049 = new byte[var22 * 2];
            }
            int var23 = var3.method1774((byte) 35);
            if (var23 > 0) {
                var21.field3052 = new byte[var23 * 2 + 2];
                var21.field3052[1] = 64;
            }
        }
        int var24 = var3.method1774((byte) 75);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = 0;
        int var27 = var3.method1774((byte) -99);
        while (var3.field3840[var3.field3866 + var26] != 0) {
            var26++;
        }
        byte[] var28 = var27 <= 0 ? null : new byte[var27 * 2];
        byte[] var29 = new byte[var26];
        for (int var30 = 0; var30 < var26; var30++) {
            var29[var30] = var3.method1733(2023893896);
        }
        var3.field3866++;
        var26++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1774((byte) 97);
            this.field4637[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1774((byte) -105);
            this.field4637[var34] = (short) (this.field4637[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var37 == 0) {
                if (var35 < var29.length) {
                    var37 = var29[var35++];
                } else {
                    var37 = -1;
                }
                var36 = var3.method1764((byte) -55);
            }
            this.field4637[var38] = (short) (this.field4637[var38] + class149.method1117(var36 - 1 << 14, 32768));
            var37--;
            this.field4639[var38] = var36;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4639[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field3840[var6++] - 1;
                    if (var4.length <= var39) {
                        var40 = -1;
                    } else {
                        var40 = var4[var39++];
                    }
                }
                var40--;
                this.field4640[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4639[var46] != 0) {
                if (var43 == 0) {
                    if (var8.length <= var45) {
                        var43 = -1;
                    } else {
                        var43 = var8[var45++];
                    }
                    var44 = var3.field3840[var11++] + 16 << 2;
                }
                this.field4635[var46] = (byte) var44;
                var43--;
            }
        }
        int var47 = 0;
        class200 var48 = null;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field4639[var50] != 0) {
                if (var49 == 0) {
                    var48 = var19[var14[var47]];
                    if (var47 >= var12.length) {
                        var49 = -1;
                    } else {
                        var49 = var12[var47++];
                    }
                }
                var49--;
                this.field4638[var50] = var48;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var52 < var29.length) {
                    var51 = var29[var52++];
                } else {
                    var51 = -1;
                }
                if (this.field4639[var54] > 0) {
                    var53 = var3.method1774((byte) 62) + 1;
                }
            }
            var51--;
            this.field4644[var54] = (byte) var53;
        }
        this.field4633 = var3.method1774((byte) -117) + 1;
        for (int var55 = 0; var55 < var16; var55++) {
            class200 var56 = var19[var55];
            if (var56.field3049 != null) {
                for (int var57 = 1; var57 < var56.field3049.length; var57 += 2) {
                    var56.field3049[var57] = var3.method1733(2023893896);
                }
            }
            if (var56.field3052 != null) {
                for (int var58 = 3; var58 < (var56.field3052.length - 2); var58 += 2) {
                    var56.field3052[var58] = var3.method1733(2023893896);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1733(2023893896);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method1733(2023893896);
            }
        }
        for (int var61 = 0; var61 < var16; var61++) {
            class200 var62 = var19[var61];
            if (var62.field3052 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field3052.length; var64 += 2) {
                    var63 = var3.method1774((byte) 68) + var63 + 1;
                    var62.field3052[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var16; var65++) {
            class200 var66 = var19[var65];
            if (var66.field3049 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field3049.length; var68 += 2) {
                    var67 = var3.method1774((byte) -126) + var67 + 1;
                    var66.field3049[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method1774((byte) -122);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 -= -var3.method1774((byte) 19) - 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field4644[var73] = (byte) (this.field4644[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74];
                int var76 = (var75 - var71) / 2 + (var75 - var71) * var72;
                byte var77 = var25[var74 + 1];
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class153.method1157(var76, false, var75 - var71);
                    this.field4644[var78] = (byte) (this.field4644[var78] * var79 + 32 >> 6);
                    var76 += var77 - var72;
                }
                var71 = var75;
                var74 += 2;
                var72 = var77;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field4644[var80] = (byte) (this.field4644[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var28 != null) {
            int var82 = var3.method1774((byte) -105);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 = var82 + var3.method1774((byte) 70) + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field4635[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field4635[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var28.length) {
                int var89 = var28[var88 + 1] << 1;
                byte var90 = var28[var88];
                var88 += 2;
                int var91 = (var90 - var84) / 2 + (var90 - var84) * var85;
                for (int var92 = var84; var92 < var90; var92++) {
                    int var93 = class153.method1157(var91, false, var90 - var84);
                    int var94 = (this.field4635[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    var91 += var89 - var85;
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field4635[var92] = (byte) var94;
                }
                var85 = var89;
                var84 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field4635[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field4635[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var16; var98++) {
            var19[var98].field3043 = var3.method1774((byte) -118);
        }
        for (int var99 = 0; var99 < var16; var99++) {
            class200 var100 = var19[var99];
            if (var100.field3049 != null) {
                var100.field3039 = var3.method1774((byte) -110);
            }
            if (var100.field3052 != null) {
                var100.field3041 = var3.method1774((byte) 79);
            }
            if (var100.field3043 > 0) {
                var100.field3046 = var3.method1774((byte) -101);
            }
        }
        for (int var101 = 0; var101 < var16; var101++) {
            var19[var101].field3053 = var3.method1774((byte) 91);
        }
        for (int var102 = 0; var102 < var16; var102++) {
            class200 var103 = var19[var102];
            if (var103.field3053 > 0) {
                var103.field3044 = var3.method1774((byte) -100);
            }
        }
        for (int var104 = 0; var104 < var16; var104++) {
            class200 var105 = var19[var104];
            if (var105.field3044 > 0) {
                var105.field3048 = var3.method1774((byte) 110);
            }
        }
    }
}
