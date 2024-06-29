import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class117 {

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Ljo;")
    private static class353 field1787 = new class353(16);

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1797 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "[S")
    private static short[] field1794 = new short[1];

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "[B")
    private static byte[] field1800 = new byte[1];

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field1799 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lok;")
    public static class266 field1801 = new class266();

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "F")
    public static float field1796;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "F")
    public static float field1802;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lg;")
    public static class165 field1786;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Ljo;")
    private static class353 field1805;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lraa;")
    public static class632 field1798;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Laga;")
    public static class694 field1785;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lgba;")
    private static class695 field1792;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lufa;")
    private static class708 field1790;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lsha;")
    public static class758 field1791;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lob;")
    public static class769 field1789;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Leca;")
    public static class790 field1788;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lwia;")
    public static class791 field1784;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "[B")
    private static byte[] field1807;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "[B")
    private static byte[] field1809;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "[B")
    private static byte[] field1812;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "[B")
    private static byte[] field1815;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "[B")
    private static byte[] field1821;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "[I")
    private static int[] field1824;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "[S")
    private static short[] field1810;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "[S")
    private static short[] field1817;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "[[[B")
    public static byte[][][] field1795;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "[[[Lvv;")
    private static class343[][][] field1818;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;Lso;IIII[I[I)V")
    private static final void method872(class65 arg0, class494 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2964((byte) 88);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2964((byte) 40);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field1807[field1816 * arg5 + arg4] = (byte) var11;
                    field1815[field1816 * arg5 + arg4] = 0;
                } else {
                    field1815[field1816 * arg5 + arg4] = (byte) var11;
                    field1821[field1816 * arg5 + arg4] = 0;
                    field1807[field1816 * arg5 + arg4] = arg1.method2943((byte) 16);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2964((byte) 50);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2964((byte) 104);
                var18 = arg1.method2964((byte) 112);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2964((byte) 78);
            }
            if (var15 == 0) {
                field1807[field1816 * arg5 + arg4] = (byte) var16;
                field1815[field1816 * arg5 + arg4] = (byte) var17;
                field1821[field1816 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field1810[field1816 * arg5 + arg4] = (short) (arg1.method2998(true) + 1);
                    field1812[field1816 * arg5 + arg4] = arg1.method2943((byte) 16);
                } else if (var19 > 1) {
                    field1810[field1816 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2998(true);
                        var21[var22] = arg1.method2943((byte) 16);
                    }
                    field1805.method2241(-75, (long) (arg4 << 16 | arg5), new class43(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2998(true);
                        var24[var25] = arg1.method2943((byte) 16);
                    }
                }
                if (field1818[var15 - 1][arg2 - (field1804 >> 6)][arg3 - (field1806 >> 6)] == null) {
                    field1818[var15 - 1][arg2 - (field1804 >> 6)][arg3 - (field1806 >> 6)] = new class343();
                }
                class667 var26 = new class667(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field1818[var15 - 1][arg2 - (field1804 >> 6)][arg3 - (field1806 >> 6)].method2173(113, var26);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;IIII)V")
    private static final void method873(class65 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field1808 - field1814;
        int var6 = field1811 - field1813;
        if (field1808 < field1816) {
            var5++;
        }
        if (field1811 < field1803) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field1819;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field1819;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field1814 + var7;
                if (var52 >= 0 && var52 < field1816) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field1822 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field1822 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field1813 + var53;
                            int var58 = field1816 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field1803) {
                                var59 = (field1809[var58] & 0xFF) << 16 | field1817[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field1815[var58] & 0xFF;
                                var61 = field1810[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field1791.field10444 != -1) {
                                    var62 = field1791.field10444 | 0xFF000000;
                                } else if ((field1814 + var7 & 0x4) == (field1811 + var53 & 0x4)) {
                                    var62 = field1824[field1790.field9853 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method495(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method884(arg0, var49, var54, var51, var56, var59, var60, field1821[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class43 var63 = (class43) field1805.method2242((long) (var52 << 16 | var57), -1);
                                if (var63 != null) {
                                    method884(arg0, var49, var54, var51, var56, var59, var60, field1821[var58], var63.field553, var63.field552, true);
                                }
                            } else {
                                field1794[0] = (short) (var61 - 1);
                                field1800[0] = field1812[var58];
                                method884(arg0, var49, var54, var51, var56, var59, var60, field1821[var58], field1794, field1800, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field1822 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field1822 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field1791.field10444 != -1) {
                            var68 = field1791.field10444 | 0xFF000000;
                        } else if ((field1814 + var7 & 0x4) == (field1811 + var64 & 0x4)) {
                            var68 = field1824[field1790.field9853 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method495(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field1819;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field1819;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field1814 + var8;
                if (var41 >= 0 && var41 < field1816) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field1822 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field1822 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field1813 + var42;
                            if (var46 >= 0 && var46 < field1803) {
                                int var47 = field1810[field1816 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method879(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class43 var48 = (class43) field1805.method2242((long) (var41 << 16 | var46), -1);
                                    if (var48 != null) {
                                        method879(arg0, var38, var43, var40, var45, var48.field553, var48.field552);
                                    }
                                } else {
                                    field1794[0] = (short) (var47 - 1);
                                    field1800[0] = field1812[field1816 * var46 + var41];
                                    method879(arg0, var38, var43, var40, var45, field1794, field1800);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field1814 >> 6;
        int var10 = field1813 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field1808 >> 6;
        int var12 = field1811 >> 6;
        if (var11 >= field1818[0].length) {
            var11 = field1818[0].length - 1;
        }
        if (var12 >= field1818[0][0].length) {
            var12 = field1818[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class343 var28 = field1818[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field1804 >> 6) + var14) * 64;
                        int var30 = ((field1806 >> 6) + var27) * 64;
                        for (class667 var31 = (class667) var28.method2170(false); var31 != null; var31 = (class667) var28.method2176(-17754)) {
                            int var32 = var31.field9283 + var29 - field1804 - field1814;
                            int var33 = var31.field9282 + var30 - field1806 - field1813;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field1819;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field1819;
                            int var36 = field1822 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field1822 - (arg2 * var33 + arg4 >> 16);
                            method884(arg0, var34, var36, var35 - var34, var37 - var36, var31.field9284, var31.field9288 & 0xFF, var31.field9286, var31.field9287, var31.field9285, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class343 var17 = field1818[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field1804 >> 6) + var15) * 64;
                        int var19 = ((field1806 >> 6) + var16) * 64;
                        for (class667 var20 = (class667) var17.method2170(false); var20 != null; var20 = (class667) var17.method2176(-17754)) {
                            int var21 = var20.field9283 + var18 - field1804 - field1814;
                            int var22 = var20.field9282 + var19 - field1806 - field1813;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field1819;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field1819;
                            int var25 = field1822 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field1822 - (arg2 * var22 + arg4 >> 16);
                            method879(arg0, var23, var25, var24 - var23, var26 - var25, var20.field9287, var20.field9285);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lwia;Lufa;Lgba;Laga;Lg;Leca;Lob;)V")
    public static final void method874(class791 arg0, class708 arg1, class695 arg2, class694 arg3, class165 arg4, class790 arg5, class769 arg6) {
        field1784 = arg0;
        field1790 = arg1;
        field1792 = arg2;
        field1785 = arg3;
        field1786 = arg4;
        field1788 = arg5;
        field1789 = arg6;
        field1787.method2240(97);
        int var7 = field1784.method4356(70, "details");
        int[] var8 = field1784.method4348((byte) -71, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class758 var10 = class531.method3206(var8[var9], var7, 100, field1784);
                field1787.method2241(98, (long) var10.field10442, var10);
            }
        }
        class486.method2895(false, true, (byte) 121);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;II)V")
    public static final void method875(class65 arg0, int arg1, int arg2) {
        class494 var3 = new class494(field1784.method4362("area", field1791.field10445, (byte) 61));
        int var4 = var3.method2964((byte) 57);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2964((byte) 127);
        }
        int var7 = var3.method2964((byte) 45);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2964((byte) 85);
        }
        while (true) {
            while (var3.field7042 < var3.field7050.length) {
                if (var3.method2964((byte) 83) == 0) {
                    int var22 = var3.method2964((byte) 60);
                    int var23 = var3.method2964((byte) 67);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field1804;
                            int var27 = var23 * 64 + var25 - field1806;
                            method872(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2964((byte) 114);
                    int var29 = var3.method2964((byte) 68);
                    int var30 = var3.method2964((byte) 108);
                    int var31 = var3.method2964((byte) 86);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field1804;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field1806;
                            method872(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field1809 = new byte[field1816 * field1803];
            field1817 = new short[field1816 * field1803];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field1816 * field1803];
                for (int var13 = 0; var13 < field1818[var11].length; var13++) {
                    for (int var19 = 0; var19 < field1818[var11][0].length; var19++) {
                        class343 var20 = field1818[var11][var13][var19];
                        if (var20 != null) {
                            for (class667 var21 = (class667) var20.method2170(false); var21 != null; var21 = (class667) var20.method2176(-17754)) {
                                var12[(var19 * 64 + var21.field9282) * field1816 + var13 * 64 + var21.field9283] = (byte) var21.field9284;
                            }
                        }
                    }
                }
                method891(var12, field1809, field1817, arg1, arg2);
                for (int var14 = 0; var14 < field1818[var11].length; var14++) {
                    for (int var15 = 0; var15 < field1818[var11][0].length; var15++) {
                        class343 var16 = field1818[var11][var14][var15];
                        if (var16 != null) {
                            for (class667 var17 = (class667) var16.method2170(false); var17 != null; var17 = (class667) var16.method2176(-17754)) {
                                int var18 = (var15 * 64 + var17.field9282) * field1816 + var14 * 64 + var17.field9283;
                                var17.field9284 = (field1809[var18] & 0xFF) << 16 | field1817[var18] & 0xFFFF;
                                if (var17.field9284 != 0) {
                                    var17.field9284 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method891(field1807, field1809, field1817, arg1, arg2);
            field1807 = null;
            method893();
            return;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1814 = arg0 - field1804;
        field1811 = arg1 - field1806;
        field1808 = arg2 - field1804;
        field1813 = arg3 - field1806;
        field1819 = arg4;
        field1823 = arg5;
        field1820 = arg6;
        field1822 = arg7;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Lsha;")
    public static final class758 method877(int arg0, int arg1) {
        for (class758 var2 = (class758) field1787.method2243((byte) 100); var2 != null; var2 = (class758) field1787.method2248(-15690)) {
            if (var2.field10458 && var2.method4207(false, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Lsha;")
    public static final class758 method878(int arg0) {
        return (class758) field1787.method2242((long) arg0, -1);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;IIII[S[B)V")
    private static final void method879(class65 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class282 var8 = field1785.method3919(true, arg5[var7] & 0xFFFF);
            int var9 = var8.field4108;
            if (var9 != -1) {
                class784 var10 = field1788.method4326(34, var9);
                class241 var11 = var10.method4298((byte) -64, var8.field4101 ? var8.field4162 : false, var8.field4187 ? arg6[var7] >> 6 & 0x3 : 0, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1507() >> 2;
                    int var13 = arg4 * var11.method1505() >> 2;
                    if (var10.field10765) {
                        int var14 = var8.field4188;
                        int var15 = var8.field4125;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field10762 == 0) {
                            var11.method1607(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method1603(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field10762 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
    public static final void method880() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field1798.field8878; var1++) {
            boolean var2 = field1791.method4210(var0, true, field1798.field8880[var1] >> 14 & 0x3FFF, field1798.field8880[var1] >> 28 & 0x3, field1798.field8880[var1] & 0x3FFF);
            if (var2) {
                class492 var3 = new class492(field1798.field8883[var1]);
                var3.field6970 = var0[1] - field1804;
                var3.field6969 = var0[2] - field1806;
                field1801.method1727(var3, (byte) 63);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;)Lok;")
    public static final class266 method881(class65 arg0) {
        int var1 = field1808 - field1814;
        int var2 = field1811 - field1813;
        int var3 = (field1820 - field1819 << 16) / var1;
        int var4 = (field1822 - field1823 << 16) / var2;
        return method882(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lha;IIII)Lok;")
    private static final class266 method882(class65 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class492 var5 = (class492) field1801.method1731((byte) -114); var5 != null; var5 = (class492) field1801.method1724(0)) {
            method886(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field1801;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)Ldha;")
    public static final class83 method883(int arg0, int arg1) {
        class83 var2 = new class83();
        for (class758 var3 = (class758) field1787.method2243((byte) 100); var3 != null; var3 = (class758) field1787.method2248(-15690)) {
            if (var3.field10458 && var3.method4207(false, arg1, arg0)) {
                var2.method626((byte) -115, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V")
    private static final void method884(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method495(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field1824[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method495(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class538.method3230(arg0, var11, (byte) 79, arg7 >> 6 & 0x3, field1824[arg6], arg4, field1795, arg2, field1793, arg5, var12, arg3, arg1);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class282 var18 = field1785.method3919(true, arg8[var16] & 0xFFFF);
                if (var18.field4108 == -1) {
                    int var19 = -3355444;
                    if (var18.field4149 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method478(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method529(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method478(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method529(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method478(arg1, arg2, arg4, -1, 0);
                            arg0.method529(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method478(var14, arg2, arg4, -1, 0);
                            arg0.method529(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method478(var14, arg2, arg4, -1, 0);
                            arg0.method529(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method478(arg1, arg2, arg4, -1, 0);
                            arg0.method529(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method529(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method529(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method529(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method529(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method529(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method529(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public static final void method885(int arg0) {
        field1791 = (class758) field1787.method2242((long) arg0, -1);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;Lqe;IIII)V")
    private static final void method886(class65 arg0, class492 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field6972 = ((arg1.field6970 - field1814) * arg2 + arg4 >> 16) + field1819;
        arg1.field6976 = field1822 - ((arg1.field6969 - field1813) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()V")
    public static final void method887() {
        field1807 = null;
        field1809 = null;
        field1817 = null;
        field1815 = null;
        field1821 = null;
        field1810 = null;
        field1812 = null;
        field1805 = null;
        field1818 = null;
        field1824 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ld;II)V")
    public static final void method888(class160 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field1790.field9848; var3++) {
            field1824[var3 + 1] = method890(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "()V")
    public static void method889() {
        field1790 = null;
        field1792 = null;
        field1785 = null;
        field1786 = null;
        field1788 = null;
        field1789 = null;
        field1791 = null;
        field1784 = null;
        field1787 = null;
        field1795 = null;
        field1794 = null;
        field1800 = null;
        field1798 = null;
        field1801 = null;
        field1824 = null;
        field1807 = null;
        field1809 = null;
        field1817 = null;
        field1815 = null;
        field1821 = null;
        field1810 = null;
        field1812 = null;
        field1805 = null;
        field1818 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ld;III)I")
    private static final int method890(class160 arg0, int arg1, int arg2, int arg3) {
        class374 var4 = field1790.method3998(64, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field5164;
        if (var5 >= 0 && arg0.method1208((byte) 47, var5).field6570) {
            var5 = -1;
        }
        int var9;
        if (var4.field5167 >= 0) {
            int var6 = var4.field5167;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class2.field14[class22.method226(-1, class396.method2446(78, 96, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class2.field14[class22.method226(-1, class396.method2446(-121, 96, arg0.method1208((byte) 47, var5).field6571)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field5158 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field5158;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class2.field14[class22.method226(-1, class396.method2446(-125, 96, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([B[B[SII)V")
    private static final void method891(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field1803];
        int[] var6 = new int[field1803];
        int[] var7 = new int[field1803];
        int[] var8 = new int[field1803];
        int[] var9 = new int[field1803];
        for (int var10 = -5; var10 < field1816; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field1803; var13++) {
                int var10002;
                if (var11 < field1816) {
                    int var28 = arg0[field1816 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class510 var29 = field1792.method3925(true, var28 - 1);
                        var5[var13] += var29.field7219;
                        var6[var13] += var29.field7223;
                        var7[var13] += var29.field7220;
                        var8[var13] += var29.field7217;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field1816 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class510 var31 = field1792.method3925(true, var30 - 1);
                        var5[var13] -= var31.field7219;
                        var6[var13] -= var31.field7223;
                        var7[var13] -= var31.field7220;
                        var8[var13] -= var31.field7217;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field1803; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field1803) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field1816 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field1816 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class438.method2615(-1208546591, var14 * 256 / var17, var16 / var18, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field1816 * var19 + var10;
                            int var27 = class2.field14[class22.method226(-1, class407.method2488(4, 96, var25)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lha;)V")
    public static final void method892(class65 arg0) {
        int var1 = field1808 - field1814;
        int var2 = field1811 - field1813;
        int var3 = (field1820 - field1819 << 16) / var1;
        int var4 = (field1822 - field1823 << 16) / var2;
        method873(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()V")
    private static final void method893() {
        for (int var0 = 0; var0 < field1816; var0++) {
            for (int var11 = 0; var11 < field1803; var11++) {
                int var12 = field1810[field1816 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class43 var13 = (class43) field1805.method2242((long) (var0 << 16 | var11), -1);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field553.length; var14++) {
                                class282 var15 = field1785.method3919(true, var13.field553[var14] & 0xFFFF);
                                int var16 = var15.field4093;
                                if (var15.field4117 != null) {
                                    class282 var17 = var15.method1826(field1789, 55);
                                    if (var17 != null) {
                                        var16 = var17.field4093;
                                    }
                                }
                                if (var16 != -1) {
                                    class492 var18 = new class492(var16);
                                    var18.field6970 = var0;
                                    var18.field6969 = var11;
                                    field1801.method1727(var18, (byte) 100);
                                }
                            }
                        }
                    } else {
                        class282 var19 = field1785.method3919(true, var12 - 1);
                        int var20 = var19.field4093;
                        if (var19.field4117 != null) {
                            class282 var21 = var19.method1826(field1789, 13);
                            if (var21 != null) {
                                var20 = var21.field4093;
                            }
                        }
                        if (var20 != -1) {
                            class492 var22 = new class492(var20);
                            var22.field6970 = var0;
                            var22.field6969 = var11;
                            field1801.method1727(var22, (byte) 114);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field1818[0].length; var2++) {
                for (int var3 = 0; var3 < field1818[0][0].length; var3++) {
                    class343 var4 = field1818[var1][var2][var3];
                    if (var4 != null) {
                        for (class667 var5 = (class667) var4.method2170(false); var5 != null; var5 = (class667) var4.method2176(-17754)) {
                            if (var5.field9287 != null) {
                                for (int var6 = 0; var6 < var5.field9287.length; var6++) {
                                    class282 var7 = field1785.method3919(true, var5.field9287[var6] & 0xFFFF);
                                    int var8 = var7.field4093;
                                    if (var7.field4117 != null) {
                                        class282 var9 = var7.method1826(field1789, -124);
                                        if (var9 != null) {
                                            var8 = var9.field4093;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class492 var10 = new class492(var8);
                                        var10.field6970 = ((field1804 >> 6) + var2) * 64 + var5.field9283 - field1804;
                                        var10.field6969 = ((field1806 >> 6) + var3) * 64 + var5.field9282 - field1806;
                                        field1801.method1727(var10, (byte) 76);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;Lqe;Lbr;)V")
    public static final void method894(class65 arg0, class492 arg1, class413 arg2) {
        if (arg2.field5629 == null) {
            return;
        }
        int[] var3 = new int[arg2.field5629.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field5629[var4 * 2] + arg1.field6970;
            int var22 = arg2.field5629[var4 * 2 + 1] + arg1.field6969;
            var3[var4 * 2] = (field1820 - field1819) * (var21 - field1814) / (field1808 - field1814) + field1819;
            var3[var4 * 2 + 1] = field1822 - (field1822 - field1823) * (var22 - field1813) / (field1811 - field1813);
        }
        class322.method2074(arg0, var3, arg2.field5639);
        if (arg2.field5643 > 0) {
            for (int var5 = 0; var5 < var3.length / 2 - 1; var5++) {
                int var13 = var3[var5 * 2];
                int var14 = var3[var5 * 2 + 1];
                int var15 = var3[(var5 + 1) * 2];
                int var16 = var3[(var5 + 1) * 2 + 1];
                if (var15 < var13) {
                    int var17 = var13;
                    int var18 = var14;
                    var13 = var15;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var16 < var14) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg0.method527(var13, var14, var15, var16, arg2.field5652[arg2.field5627[var5] & 0xFF], 1, arg2.field5643, arg2.field5619, arg2.field5634);
            }
            int var6 = var3[var3.length - 2];
            int var7 = var3[var3.length - 1];
            int var8 = var3[0];
            int var9 = var3[1];
            if (var8 < var6) {
                int var10 = var6;
                int var11 = var7;
                var6 = var8;
                var7 = var9;
                var8 = var10;
                var9 = var11;
            } else if (var6 == var8 && var9 < var7) {
                int var12 = var7;
                var7 = var9;
                var9 = var12;
            }
            arg0.method527(var6, var7, var8, var9, arg2.field5652[arg2.field5627[arg2.field5627.length - 1] & 0xFF], 1, arg2.field5643, arg2.field5619, arg2.field5634);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method446(arg2.field5652[arg2.field5627[var20] & 0xFF], var3[(var20 + 1) * 2 + 1], -120, var3[var20 * 2 + 1], var3[(var20 + 1) * 2], var3[var20 * 2]);
        }
        arg0.method446(arg2.field5652[arg2.field5627[arg2.field5627.length - 1] & 0xFF], var3[1], -119, var3[var3.length - 1], var3[0], var3[var3.length - 2]);
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "()V")
    public static final void method895() {
        field1807 = new byte[field1816 * field1803];
        field1815 = new byte[field1816 * field1803];
        field1821 = new byte[field1816 * field1803];
        field1810 = new short[field1816 * field1803];
        field1812 = new byte[field1816 * field1803];
        field1805 = new class353(1024);
        field1818 = new class343[3][field1816 >> 6][field1803 >> 6];
        field1824 = new int[field1790.field9848 + 1];
    }
}
