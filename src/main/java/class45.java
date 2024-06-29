import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class45 {

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "[I")
    private int[] field1066 = new int[256];

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "[I")
    private int[] field1052 = new int[256];

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lva;")
    private static class121 field1040 = class107.method797("To play on this world move to a free area first", -10983);

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Lva;")
    public static class121 field1044 = class107.method797(")3", -10983);

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lva;")
    public static class121 field1038 = class107.method797("backvmid1", -10983);

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Lva;")
    private static class121 field1046 = class107.method797("Attack", -10983);

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field1056 = 0;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lva;")
    private static class121 field1043 = class107.method797("Loading ignore list", -10983);

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lva;")
    public static class121 field1045 = field1040;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Lva;")
    private static class121 field1048 = class107.method797("Trade)4compete", -10983);

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "Lva;")
    public static class121 field1054 = null;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1041 = 0;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Lva;")
    public static class121 field1053 = field1048;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "[[[I")
    public static int[][][] field1058 = new int[4][105][105];

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "Lva;")
    private static class121 field1061 = class107.method797("M", -10983);

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Lva;")
    public static class121 field1051 = field1061;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "Lva;")
    public static class121 field1063 = field1043;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lva;")
    private static class121 field1036 = class107.method797("No matching objects found)1 please shorten search", -10983);

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lva;")
    public static class121 field1042 = field1036;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lva;")
    public static class121 field1039 = field1046;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field1065 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lub;")
    public static class117 field1035;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "[I")
    public static int[] field1062;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I", line = 14)
    public final int method297(byte arg0) {
        if (this.field1049-- == 0) {
            this.method303(81);
            this.field1049 = 255;
        }
        if (arg0 < 67) {
            field1065 = -118;
        }
        field1059++;
        return this.field1066[this.field1049];
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 37)
    public static void method298(byte arg0) {
        field1058 = null;
        field1036 = null;
        field1044 = null;
        field1061 = null;
        field1048 = null;
        field1035 = null;
        field1051 = null;
        field1040 = null;
        field1045 = null;
        field1053 = null;
        field1043 = null;
        field1063 = null;
        field1038 = null;
        field1042 = null;
        field1054 = null;
        if (arg0 > -15) {
            method300(-64);
        }
        field1062 = null;
        field1039 = null;
        field1046 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 67)
    private final void method299(int arg0) {
        field1047++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 != -448449206) {
            method298((byte) 41);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var6 + var61;
            int var65 = var7 + var64;
            int var66 = var65 ^ var64 << 8;
            int var67 = var5 + var63;
            int var68 = var4 + var66;
            int var69 = var64 + var67;
            var6 = var69 ^ var67 >>> 16;
            int var70 = var3 + var6;
            int var71 = var67 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            var4 = var72 ^ var70 >>> 4;
            int var73 = var4 + var61;
            int var74 = var2 + var5;
            int var75 = var70 + var74;
            var3 = var75 ^ var74 << 8;
            int var76 = var73 + var74;
            var2 = var76 ^ var73 >>> 9;
            var7 = var2 + var66;
            var8 = var3 + var63;
            var9 = var8 + var73;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1066[var11 + 4] + var5;
            int var38 = this.field1066[var11 + 6] + var3;
            int var39 = this.field1066[var11 + 5] + var4;
            int var40 = this.field1066[var11] + var9;
            int var41 = this.field1066[var11 + 3] + var6;
            int var42 = this.field1066[var11 + 1] + var8;
            int var43 = var40 ^ var42 << 11;
            int var44 = this.field1066[var11 + 7] + var2;
            int var45 = this.field1066[var11 + 2] + var7;
            int var46 = var41 + var43;
            int var47 = var42 + var45;
            int var48 = var47 ^ var45 >>> 2;
            int var49 = var37 + var48;
            int var50 = var45 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            var6 = var52 ^ var49 >>> 16;
            int var53 = var39 + var51;
            int var54 = var6 + var38;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var44;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var43;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var8 = var3 + var48;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field1052[var11] = var9;
            this.field1052[var11 + 1] = var8;
            this.field1052[var11 + 2] = var7;
            this.field1052[var11 + 3] = var6;
            this.field1052[var11 + 4] = var5;
            this.field1052[var11 + 5] = var4;
            this.field1052[var11 + 6] = var3;
            this.field1052[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1052[var12 + 1] + var8;
            int var14 = this.field1052[var12 + 3] + var6;
            int var15 = this.field1052[var12 + 4] + var5;
            int var16 = this.field1052[var12 + 2] + var7;
            int var17 = this.field1052[var12 + 6] + var3;
            int var18 = this.field1052[var12] + var9;
            int var19 = this.field1052[var12 + 5] + var4;
            int var20 = this.field1052[var12 + 7] + var2;
            int var21 = var18 ^ var13 << 11;
            int var22 = var13 + var16;
            int var23 = var22 ^ var16 >>> 2;
            int var24 = var14 + var21;
            int var25 = var15 + var23;
            int var26 = var16 + var24;
            int var27 = var26 ^ var24 << 8;
            int var28 = var19 + var27;
            int var29 = var24 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var17;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var20;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var23;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            this.field1052[var12] = var9;
            this.field1052[var12 + 1] = var8;
            var7 = var2 + var27;
            this.field1052[var12 + 2] = var7;
            this.field1052[var12 + 3] = var6;
            this.field1052[var12 + 4] = var5;
            this.field1052[var12 + 5] = var4;
            this.field1052[var12 + 6] = var3;
            this.field1052[var12 + 7] = var2;
        }
        this.method303(92);
        this.field1049 = 256;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 222)
    public static final void method300(int arg0) {
        if (arg0 != -12937) {
            field1058 = null;
        }
        for (int var1 = 0; var1 < class92.field2087; var1++) {
            int var2 = class15.field274[var1];
            class50 var3 = class8.field110[var2];
            int var4 = class66.field1578.method821(true);
            if ((var4 & 0x8) != 0) {
                int var5 = class66.field1578.method821(true);
                int var6 = class66.field1578.method821(true);
                var3.method228(class115.field2614, arg0 ^ 0xFFFFCD77, var5, var6);
                var3.field735 = class115.field2614 + 300;
                var3.field770 = class66.field1578.method821(true);
                var3.field757 = class66.field1578.method819(-762);
            }
            if ((var4 & 0x40) != 0) {
                int var7 = class66.field1578.method851(-12543);
                int var8 = class66.field1578.method821(true);
                if (var7 == 65535) {
                    var7 = -1;
                }
                if (var3.field793 == var7 && var7 != -1) {
                    int var9 = class5.method33(arg0 ^ 0xFFFFCD7E, var7).field937;
                    if (var9 == 1) {
                        var3.field778 = var8;
                        var3.field785 = 0;
                        var3.field734 = 0;
                        var3.field746 = 0;
                    }
                    if (var9 == 2) {
                        var3.field734 = 0;
                    }
                } else if (var7 == -1 || var3.field793 == -1 || class5.method33(9, var7).field918 >= class5.method33(9, var3.field793).field918) {
                    var3.field746 = 0;
                    var3.field778 = var8;
                    var3.field734 = 0;
                    var3.field785 = 0;
                    var3.field793 = var7;
                    var3.field773 = var3.field724;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field753 = class66.field1578.method829(512);
                if (var3.field753 == 65535) {
                    var3.field753 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1183 = class63.method456((byte) -75, class66.field1578.method842((byte) 109));
                var3.field786 = var3.field1183.field345;
                var3.field769 = var3.field1183.field348;
                var3.field721 = var3.field1183.field306;
                var3.field765 = var3.field1183.field340;
                var3.field759 = var3.field1183.field328;
                var3.field740 = var3.field1183.field325;
                var3.field728 = var3.field1183.field316;
            }
            if ((var4 & 0x80) != 0) {
                var3.field737 = class66.field1578.method861(arg0 + 33293);
                var3.field760 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var10 = class66.field1578.method821(true);
                int var11 = class66.field1578.method821(true);
                var3.method228(class115.field2614, 0, var10, var11);
                var3.field735 = class115.field2614 + 300;
                var3.field770 = class66.field1578.method853(true);
                var3.field757 = class66.field1578.method819(-762);
            }
            if ((var4 & 0x2) != 0) {
                var3.field751 = class66.field1578.method829(512);
                int var12 = class66.field1578.method825((byte) -6);
                var3.field772 = var12 >> 16;
                var3.field727 = class115.field2614 + (var12 & 0xFFFF);
                var3.field732 = 0;
                if (var3.field751 == 65535) {
                    var3.field751 = -1;
                }
                var3.field783 = 0;
                if (class115.field2614 < var3.field727) {
                    var3.field732 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field749 = class66.field1578.method851(arg0 + 394);
                var3.field731 = class66.field1578.method870(arg0 ^ 0x3288);
            }
        }
        field1064++;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V", line = 381)
    public static final void method301(int arg0) {
        class58.field1355.method347(true);
        if (arg0 != 26551) {
            field1038 = null;
        }
        class129.field2975.method347(true);
        field1060++;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V", line = 411)
    public static final void method302(int arg0) {
        if (arg0 > -23) {
            return;
        }
        try {
            Graphics var1 = class46.field1079.getGraphics();
            class12.field205.method196(-5917, 357, 17, var1);
        } catch (Exception var2) {
            class46.field1079.repaint();
        }
        field1050++;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V", line = 447)
    private final void method303(int arg0) {
        int var2 = -10 / ((38 - arg0) / 35);
        this.field1033 += ++this.field1034;
        field1055++;
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field1052[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field1057 ^= this.field1057 << 13;
                } else {
                    this.field1057 ^= this.field1057 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field1057 ^= this.field1057 << 2;
            } else {
                this.field1057 ^= this.field1057 >>> 16;
            }
            this.field1057 += this.field1052[var3 + 128 & 0xFF];
            int var5;
            this.field1052[var3] = var5 = this.field1052[class90.method614(255, var4 >> 2)] + this.field1057 + this.field1033;
            this.field1066[var3] = this.field1033 = this.field1052[class90.method614(var5, 261160) >> 8 >> 2] + var4;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([I)V", line = 533)
    public class45(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1066[var2] = arg0[var2];
        }
        this.method299(-448449206);
    }
}
