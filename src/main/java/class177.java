import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class177 extends class79 {

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "[B")
    public byte[] field2820;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "[B")
    public byte[] field2835;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "[S")
    public short[] field2828;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "[B")
    public byte[] field2829;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "[I")
    private int[] field2824;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "[Lph;")
    public class34[] field2827;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "[Lbl;")
    public class202[] field2826;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "Lck;")
    private static class119 field2825 = class298.method1987((byte) 127, " has logged out)3");

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "Lck;")
    public static class119 field2823 = field2825;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "Lck;")
    public static class119 field2821 = class298.method1987((byte) 124, "<col=ff0000>");

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "Lck;")
    private static class119 field2831 = class298.method1987((byte) 53, "Loading textures )2 ");

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "Lck;")
    public static class119 field2830 = class298.method1987((byte) 73, "(R");

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "Lck;")
    public static class119 field2817 = field2831;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "Lck;")
    public static class119 field2834 = class298.method1987((byte) 23, ")3runescape)3com");

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Lnl;", line = 7)
    public static final class196 method1127(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1596; var4++) {
            class196 var5 = var3.field1610[var4];
            if ((var5.field3130 >> 29 & 0x3L) == 2L && var5.field3131 == arg1 && var5.field3146 == arg2) {
                class142.method935(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V", line = 37)
    public final void method1128(byte arg0) {
        int var2 = 92 % ((-arg0 - 8) / 46);
        field2815++;
        this.field2824 = null;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V", line = 52)
    public static final void method1129(byte arg0) {
        if (arg0 <= 49) {
            method1131(24);
        }
        if (class285.field4707 < class108.field1651) {
            class285.field4707 += class285.field4707 / 30.0D;
            if (class285.field4707 > class108.field1651) {
                class285.field4707 = class108.field1651;
            }
            class212.method1337((byte) 112);
        } else if (class108.field1651 < class285.field4707) {
            class285.field4707 -= class285.field4707 / 30.0D;
            if (class108.field1651 > class285.field4707) {
                class285.field4707 = class108.field1651;
            }
            class212.method1337((byte) 80);
        }
        field2818++;
        if (class19.field242 == -1 || class11.field195 == -1) {
            return;
        }
        int var1 = class11.field195 - class162.field2561;
        int var2 = class19.field242 - class257.field4133;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class257.field4133 += var2;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        if (var2 == 0 && var1 == 0) {
            class19.field242 = -1;
            class11.field195 = -1;
        }
        class162.field2561 -= -var1;
        class212.method1337((byte) 81);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V", line = 120)
    public static final void method1130(int arg0, byte arg1) {
        field2836++;
        class43 var2 = new class43(512, 512);
        int[] var3 = var2.field652;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (103 - var6) * 512 * 4 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class111.field1707[arg0][var8][var6] & 0x18) == 0) {
                    class54.method399(var3, var7, 512, arg0, var8, var6);
                }
                if (arg0 < 3 && (class111.field1707[arg0 + 1][var8][var6] & 0x8) != 0) {
                    class54.method399(var3, var7, 512, arg0 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method327();
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class111.field1707[arg0][var12][var11] & 0x18) == 0) {
                    class254.method1637(var12, arg0, var11, var9, arg1 ^ 0x41, var10);
                }
                if (arg0 < 3 && (class111.field1707[arg0 + 1][var12][var11] & 0x8) != 0) {
                    class254.method1637(var12, arg0 + 1, var11, var9, arg1 + 83, var10);
                }
            }
        }
        class153.field2441 = 0;
        int var13 = 0;
        if (arg1 != 41) {
            return;
        }
        while (var13 < 104) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class259.method1658(class10.field189, var13, var14);
                if (var15 != 0L) {
                    class291 var17 = class291.method1939(0, Integer.MAX_VALUE & (int) (var15 >>> 32));
                    int var18 = var17.field4794;
                    if (var17.field4817 != null) {
                        for (int var19 = 0; var19 < var17.field4817.length; var19++) {
                            if (var17.field4817[var19] != -1) {
                                class291 var20 = class291.method1939(0, var17.field4817[var19]);
                                if (var20.field4794 >= 0) {
                                    var18 = var20.field4794;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var14;
                        int var22 = var13;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class217.field3510[class10.field189].field4356;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var22 > 0 && (var13 - 3) < var22 && (var23[var22 - 1][var21] & 0x12C0108) == 0) {
                                    var22--;
                                }
                                if (var25 == 1 && var22 < 103 && var22 < (var13 + 3) && (var23[var22 + 1][var21] & 0x12C0180) == 0) {
                                    var22++;
                                }
                                if (var25 == 2 && var21 > 0 && var21 > (var14 - 3) && (var23[var22][var21 - 1] & 0x12C0102) == 0) {
                                    var21--;
                                }
                                if (var25 == 3 && var21 < 103 && var21 < var14 + 3 && (var23[var22][var21 + 1] & 0x12C0120) == 0) {
                                    var21++;
                                }
                            }
                        }
                        class243.field3913[class153.field2441] = var17.field4822;
                        class93.field1432[class153.field2441] = var22;
                        class200.field3188[class153.field2441] = var21;
                        class153.field2441++;
                    }
                }
            }
            var13++;
        }
        for (int var26 = 0; var26 < var4; var26++) {
            if (var3[var26] == 0) {
                var3[var26] = 1;
            }
        }
        class57.field928 = new class160(var2);
        class286.field4718 = null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)I", line = 323)
    public static final int method1131(int arg0) {
        if (arg0 <= 5) {
            method1129((byte) 87);
        }
        field2833++;
        return class132.field2008 == 0 ? 0 : class171.field2719[class132.field2008].method296();
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 341)
    public static void method1132(int arg0) {
        field2821 = null;
        if (arg0 >= -112) {
            field2831 = (class119) null;
        }
        field2823 = null;
        field2834 = null;
        field2830 = null;
        field2831 = null;
        field2817 = null;
        field2825 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lcg;[I[BB)Z", line = 360)
    public final boolean method1133(class131 arg0, int[] arg1, byte[] arg2, byte arg3) {
        int var5 = 0;
        field2822++;
        if (arg3 < 48) {
            method1129((byte) 16);
        }
        boolean var6 = true;
        class34 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field2824[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method868(arg1, 1, var9 >> 2);
                        } else {
                            var7 = arg0.method866(arg1, var9 >> 2, 14);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2827[var8] = var7;
                        this.field2824[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 445)
    public class177() {
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([B)V", line = 451)
    public class177(byte[] arg0) {
        this.field2820 = new byte[128];
        this.field2835 = new byte[128];
        this.field2828 = new short[128];
        this.field2829 = new byte[128];
        this.field2824 = new int[128];
        this.field2827 = new class34[128];
        this.field2826 = new class202[128];
        class3 var2 = new class3(arg0);
        int var3;
        for (var3 = 0; var2.field101[var2.field44 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method24(false);
        }
        var3++;
        var2.field44++;
        int var6 = 0;
        int var7 = var2.field44;
        var2.field44 += var3;
        while (var2.field101[var2.field44 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method24(false);
        }
        var2.field44++;
        var6++;
        int var10 = 0;
        int var11 = var2.field44;
        var2.field44 += var6;
        while (var2.field101[var2.field44 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method24(false);
        }
        var2.field44++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var2.method64((byte) -116);
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
        class202[] var19 = new class202[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class202 var21 = var19[var20] = new class202();
            int var22 = var2.method64((byte) -101);
            if (var22 > 0) {
                var21.field3211 = new byte[var22 * 2];
            }
            int var23 = var2.method64((byte) 4);
            if (var23 > 0) {
                var21.field3201 = new byte[var23 * 2 + 2];
                var21.field3201[1] = 64;
            }
        }
        int var24 = var2.method64((byte) 68);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var2.method64((byte) 94);
        byte[] var27 = var26 > 0 ? new byte[var26 * 2] : null;
        int var28;
        for (var28 = 0; var2.field101[var2.field44 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var2.method24(false);
        }
        int var31 = 0;
        var2.field44++;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method64((byte) -85);
            this.field2828[var32] = (short) var31;
        }
        int var33 = 0;
        var28++;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method64((byte) 65);
            this.field2828[var34] = (short) (this.field2828[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var36 >= var29.length) {
                    var35 = -1;
                } else {
                    var35 = var29[var36++];
                }
                var37 = var2.method52(-89);
            }
            var35--;
            this.field2828[var38] = (short) (this.field2828[var38] + (class19.method151(var37 - 1, 2) << 14));
            this.field2824[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2824[var42] != 0) {
                if (var39 == 0) {
                    var40 = var2.field101[var7++] - 1;
                    if (var4.length <= var41) {
                        var39 = -1;
                    } else {
                        var39 = var4[var41++];
                    }
                }
                var39--;
                this.field2829[var42] = (byte) var40;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2824[var46] != 0) {
                if (var44 == 0) {
                    var43 = var2.field101[var11++] + 16 << 2;
                    if (var45 < var8.length) {
                        var44 = var8[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field2835[var46] = (byte) var43;
                var44--;
            }
        }
        class202 var47 = null;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field2824[var50] != 0) {
                if (var49 == 0) {
                    var47 = var19[var14[var48]];
                    if (var48 >= var12.length) {
                        var49 = -1;
                    } else {
                        var49 = var12[var48++];
                    }
                }
                var49--;
                this.field2826[var50] = var47;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var29.length > var51) {
                    var52 = var29[var51++];
                } else {
                    var52 = -1;
                }
                if (this.field2824[var54] > 0) {
                    var53 = var2.method64((byte) 99) + 1;
                }
            }
            var52--;
            this.field2820[var54] = (byte) var53;
        }
        this.field2819 = var2.method64((byte) -126) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class202 var56 = var19[var55];
            if (var56.field3211 != null) {
                for (int var57 = 1; var57 < var56.field3211.length; var57 += 2) {
                    var56.field3211[var57] = var2.method24(false);
                }
            }
            if (var56.field3201 != null) {
                for (int var58 = 3; var58 < (var56.field3201.length - 2); var58 += 2) {
                    var56.field3201[var58] = var2.method24(false);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method24(false);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var2.method24(false);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class202 var62 = var19[var61];
            if (var62.field3201 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field3201.length; var64 += 2) {
                    var63 = var2.method64((byte) 86) + var63 + 1;
                    var62.field3201[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class202 var66 = var19[var65];
            if (var66.field3211 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field3211.length; var68 += 2) {
                    var67 = var67 + var2.method64((byte) -87) + 1;
                    var66.field3211[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method64((byte) -113);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var2.method64((byte) -113) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[1];
            byte var72 = var25[0];
            for (int var73 = 0; var73 < var72; var73++) {
                this.field2820[var73] = (byte) (this.field2820[var73] * var71 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                int var77 = (var75 - var72) * var71 + ((var75 - var72) / 2);
                var74 += 2;
                for (int var78 = var72; var78 < var75; var78++) {
                    int var79 = class20.method156(var77, (byte) 123, var75 - var72);
                    this.field2820[var78] = (byte) (this.field2820[var78] * var79 + 32 >> 6);
                    var77 += var76 - var71;
                }
                var72 = var75;
                var71 = var76;
            }
            for (int var80 = var72; var80 < 128; var80++) {
                this.field2820[var80] = (byte) (this.field2820[var80] * var71 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var27 != null) {
            int var82 = var2.method64((byte) 100);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var2.method64((byte) -85) + (var82 + 1);
                var27[var83] = (byte) var82;
            }
            int var84 = var27[1] << 1;
            byte var85 = var27[0];
            for (int var86 = 0; var86 < var85; var86++) {
                int var87 = (this.field2835[var86] & 0xFF) + var84;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field2835[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var27.length > var88) {
                byte var89 = var27[var88];
                int var90 = var27[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var85) / 2 + (var89 - var85) * var84;
                for (int var92 = var85; var92 < var89; var92++) {
                    int var93 = class20.method156(var91, (byte) 123, var89 - var85);
                    var91 += var90 - var84;
                    int var94 = (this.field2835[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field2835[var92] = (byte) var94;
                }
                var85 = var89;
                var84 = var90;
            }
            Object var95 = null;
            for (int var96 = var85; var96 < 128; var96++) {
                int var97 = (this.field2835[var96] & 0xFF) + var84;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field2835[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field3203 = var2.method64((byte) -86);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class202 var100 = var19[var99];
            if (var100.field3211 != null) {
                var100.field3204 = var2.method64((byte) -112);
            }
            if (var100.field3201 != null) {
                var100.field3207 = var2.method64((byte) -95);
            }
            if (var100.field3203 > 0) {
                var100.field3206 = var2.method64((byte) 123);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field3210 = var2.method64((byte) -95);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class202 var103 = var19[var102];
            if (var103.field3210 > 0) {
                var103.field3205 = var2.method64((byte) 45);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class202 var105 = var19[var104];
            if (var105.field3205 > 0) {
                var105.field3202 = var2.method64((byte) -115);
            }
        }
    }
}
