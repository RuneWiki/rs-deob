import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class71 extends class17 {

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "[B")
    public byte[] field1751;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "[I")
    private int[] field1743;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "[Le;")
    public class29[] field1756;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "[B")
    public byte[] field1744;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "[B")
    public byte[] field1736;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "[S")
    public short[] field1755;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "[Ld;")
    public class22[] field1750;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field1738 = 2301979;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
    public static int[] field1741 = new int[200];

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "Lmb;")
    public static class84 field1740 = class79.method672(true, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field1748 = -1;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lmb;")
    private static class84 field1752 = class79.method672(true, "wishes to duel with you)3");

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "[J")
    public static long[] field1747 = new long[100];

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Lmb;")
    public static class84 field1735 = field1752;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field1746 = 0;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field1753 = 0;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "Ljd;")
    public static class66 field1742;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "[I")
    public static int[] field1734;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "[I")
    public static int[] field1739;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method624(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1757++;
        class144 var10 = null;
        for (class144 var11 = (class144) class91.field2281.method104((byte) 101); var11 != null; var11 = (class144) class91.field2281.method107(-2)) {
            if (var11.field3457 == arg2 && var11.field3461 == arg9 && var11.field3470 == arg3 && var11.field3473 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class144();
            var10.field3461 = arg9;
            var10.field3473 = arg4;
            var10.field3457 = arg2;
            var10.field3470 = arg3;
            class77.method663(var10, 117);
            class91.field2281.method108(var10, -119);
        }
        var10.field3478 = arg5;
        if (arg0 < -37) {
            var10.field3468 = arg1;
            var10.field3477 = arg6;
            var10.field3458 = arg8;
            var10.field3474 = arg7;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
    public static void method625(byte arg0) {
        field1740 = null;
        field1742 = null;
        field1752 = null;
        if (arg0 >= -20) {
            method626(-43);
        }
        field1735 = null;
        field1741 = null;
        field1747 = null;
        field1739 = null;
        field1734 = null;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
    public static final void method626(int arg0) {
        field1737++;
        int var1 = class87.field2148.method759(arg0 ^ 0xFFFFE811, 8);
        if (field1746 > var1) {
            for (int var2 = var1; var2 < field1746; var2++) {
                class96.field2379[class6.field119++] = class80.field1990[var2];
            }
        }
        if (field1746 < var1) {
            throw new RuntimeException("gppov1");
        }
        field1746 = 0;
        int var3 = 0;
        if (arg0 != -29255) {
            method624((byte) -21, 110, 49, -112, 44, 111, -25, 100, -82, -41);
        }
        while (var1 > var3) {
            int var4 = class80.field1990[var3];
            class62 var5 = class44.field978[var4];
            int var6 = class87.field2148.method759(26024, 1);
            if (var6 == 0) {
                class80.field1990[field1746++] = var4;
                var5.field3519 = class5.field100;
            } else {
                int var7 = class87.field2148.method759(26024, 2);
                if (var7 == 0) {
                    class80.field1990[field1746++] = var4;
                    var5.field3519 = class5.field100;
                    class125.field3033[class96.field2385++] = var4;
                } else if (var7 == 1) {
                    class80.field1990[field1746++] = var4;
                    var5.field3519 = class5.field100;
                    int var8 = class87.field2148.method759(26024, 3);
                    var5.method1181(false, 20789, var8);
                    int var9 = class87.field2148.method759(26024, 1);
                    if (var9 == 1) {
                        class125.field3033[class96.field2385++] = var4;
                    }
                } else if (var7 == 2) {
                    class80.field1990[field1746++] = var4;
                    var5.field3519 = class5.field100;
                    int var10 = class87.field2148.method759(26024, 3);
                    var5.method1181(true, 20789, var10);
                    int var11 = class87.field2148.method759(26024, 3);
                    var5.method1181(true, 20789, var11);
                    int var12 = class87.field2148.method759(26024, 1);
                    if (var12 == 1) {
                        class125.field3033[class96.field2385++] = var4;
                    }
                } else if (var7 == 3) {
                    class96.field2379[class6.field119++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)V")
    public final void method627(boolean arg0) {
        field1758++;
        if (!arg0) {
            this.method627(false);
        }
        this.field1743 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I")
    public static final int method628(int arg0, int arg1) {
        field1754++;
        return arg1 == 2 ? arg0 >> 17 & 0x7 : -6;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lfb;[II[B)Z")
    public final boolean method629(class38 arg0, int[] arg1, int arg2, byte[] arg3) {
        if (arg2 >= -72) {
            this.field1750 = null;
        }
        field1745++;
        int var5 = 0;
        boolean var6 = true;
        class29 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field1743[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method282(var9 >> 2, 13, arg1);
                        } else {
                            var7 = arg0.method286(-25798, arg1, var9 >> 2);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1756[var8] = var7;
                        this.field1743[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class71() {
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V")
    public class71(byte[] arg0) {
        this.field1751 = new byte[128];
        this.field1743 = new int[128];
        this.field1756 = new class29[128];
        this.field1744 = new byte[128];
        this.field1736 = new byte[128];
        this.field1755 = new short[128];
        this.field1750 = new class22[128];
        class51 var2 = new class51(arg0);
        int var3;
        for (var3 = 0; var2.field1084[var2.field1128 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method412((byte) -84);
        }
        var3++;
        var2.field1128++;
        int var6 = var2.field1128;
        var2.field1128 += var3;
        int var7;
        for (var7 = 0; var2.field1084[var2.field1128 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method412((byte) -84);
        }
        var7++;
        var2.field1128++;
        int var10 = 0;
        int var11 = var2.field1128;
        var2.field1128 += var7;
        while (var2.field1084[var2.field1128 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method412((byte) -84);
        }
        var10++;
        var2.field1128++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var2.method373(25094);
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
        } else {
            var15 = var10;
        }
        class22[] var19 = new class22[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class22 var103 = var19[var20] = new class22();
            int var104 = var2.method373(25094);
            if (var104 > 0) {
                var103.field521 = new byte[var104 * 2];
            }
            int var105 = var2.method373(25094);
            if (var105 > 0) {
                var103.field505 = new byte[var105 * 2 + 2];
                var103.field505[1] = 64;
            }
        }
        int var21 = var2.method373(25094);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = 0;
        int var24 = var2.method373(25094);
        while (var2.field1084[var2.field1128 + var23] != 0) {
            var23++;
        }
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        byte[] var26 = new byte[var23];
        for (int var27 = 0; var27 < var23; var27++) {
            var26[var27] = var2.method412((byte) -84);
        }
        var23++;
        int var28 = 0;
        var2.field1128++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method373(25094);
            this.field1755[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method373(25094);
            this.field1755[var31] = (short) (this.field1755[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var34 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var34++];
                }
                var33 = var2.method371(82);
            }
            var32--;
            this.field1755[var35] = (short) (this.field1755[var35] + client.method144(var33 - 1 << 14, 32768));
            this.field1743[var35] = var33;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1743[var39] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var38) {
                        var36 = -1;
                    } else {
                        var36 = var4[var38++];
                    }
                    var37 = var2.field1084[var6++] - 1;
                }
                var36--;
                this.field1744[var39] = (byte) var37;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1743[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field1084[var11++] + 16 << 2;
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field1751[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class22 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1743[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field1750[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var26.length <= var49) {
                    var48 = -1;
                } else {
                    var48 = var26[var49++];
                }
                if (this.field1743[var51] > 0) {
                    var50 = var2.method373(25094) + 1;
                }
            }
            this.field1736[var51] = (byte) var50;
            var48--;
        }
        this.field1749 = var2.method373(25094) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class22 var100 = var19[var52];
            if (var100.field521 != null) {
                for (int var101 = 1; var101 < var100.field521.length; var101 += 2) {
                    var100.field521[var101] = var2.method412((byte) -84);
                }
            }
            if (var100.field505 != null) {
                for (int var102 = 3; var102 < var100.field505.length - 2; var102 += 2) {
                    var100.field505[var102] = var2.method412((byte) -84);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method412((byte) -84);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var2.method412((byte) -84);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class22 var97 = var19[var55];
            if (var97.field505 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field505.length; var99 += 2) {
                    var98 = var98 + var2.method373(25094) + 1;
                    var97.field505[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class22 var94 = var19[var56];
            if (var94.field521 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field521.length; var96 += 2) {
                    var95 -= -var2.method373(25094) - 1;
                    var94.field521[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method373(25094);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method373(25094) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[1];
            byte var60 = var22[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field1736[var61] = (byte) (this.field1736[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62 + 1];
                byte var66 = var22[var62];
                int var67 = (var66 - var60) * var59 + (var66 - var60) / 2;
                for (int var68 = var60; var68 < var66; var68++) {
                    int var69 = class88.method757(var66 - var60, var67, -128);
                    this.field1736[var68] = (byte) (this.field1736[var68] * var69 + 32 >> 6);
                    var67 += var65 - var59;
                }
                var60 = var66;
                var62 += 2;
                var59 = var65;
            }
            for (int var63 = var60; var63 < 128; var63++) {
                this.field1736[var63] = (byte) (this.field1736[var63] * var59 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var2.method373(25094);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var70 + var2.method373(25094) + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field1751[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1751[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                var75 += 2;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class88.method757(var79 - var72, var81, -128);
                    var81 += var80 - var73;
                    int var84 = (this.field1751[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field1751[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field1751[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1751[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field520 = var2.method373(25094);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class22 var93 = var19[var87];
            if (var93.field521 != null) {
                var93.field514 = var2.method373(25094);
            }
            if (var93.field505 != null) {
                var93.field519 = var2.method373(25094);
            }
            if (var93.field520 > 0) {
                var93.field511 = var2.method373(25094);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field509 = var2.method373(25094);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class22 var92 = var19[var89];
            if (var92.field509 > 0) {
                var92.field517 = var2.method373(25094);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class22 var91 = var19[var90];
            if (var91.field517 > 0) {
                var91.field518 = var2.method373(25094);
            }
        }
    }
}
