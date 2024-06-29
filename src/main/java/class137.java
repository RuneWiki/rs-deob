import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class137 extends class254 {

    @OriginalMember(owner = "client!e", name = "y", descriptor = "[I")
    private int[] field1983;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "[S")
    public short[] field1988;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "[Ljd;")
    public class122[] field1981;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "[B")
    public byte[] field1975;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "[B")
    public byte[] field1980;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "[B")
    public byte[] field1984;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "[Lml;")
    public class116[] field1977;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public int field1979;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "[I")
    public static int[] field1985 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field1987 = 0;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "S")
    public static short field1990 = 1;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "S")
    public static short field1986 = 256;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "Llg;")
    public static class106 field1989;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static final void method921(byte arg0) {
        int var1 = 59 % ((-arg0 - 73) / 39);
        field1974++;
        class178.field2541.method257(false);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILde;III)V")
    public static final void method922(int arg0, class53 arg1, int arg2, int arg3, int arg4) {
        field1982++;
        if (class55.field847 == arg1 || class283.field4508 >= 400) {
            return;
        }
        if (arg3 != 255) {
            method923(66);
        }
        String var5;
        if (arg1.field790 == 0) {
            boolean var6 = true;
            if (class55.field847.field784 != -1 && arg1.field784 != -1) {
                int var7 = arg1.field764 >= class55.field847.field764 ? arg1.field764 : class55.field847.field764;
                int var8 = arg1.field784 <= class55.field847.field784 ? arg1.field784 : class55.field847.field784;
                int var9 = var7 * 10 / 100 + (var8 + 5);
                int var10 = class55.field847.field764 - arg1.field764;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var9 < var10) {
                    var6 = false;
                }
            }
            String var11 = class69.field1076 == 1 ? class75.field1169 : class182.field2603;
            if (arg1.field773 > arg1.field764) {
                var5 = arg1.method348(-1) + (var6 ? class155.method1048(class55.field847.field764, arg1.field764, -84) : "<col=ffffff>") + " (" + var11 + arg1.field764 + "+" + (arg1.field773 - arg1.field764) + ")";
            } else {
                var5 = arg1.method348(-1) + (var6 ? class155.method1048(class55.field847.field764, arg1.field764, -91) : "<col=ffffff>") + " (" + var11 + arg1.field764 + ")";
            }
        } else {
            var5 = arg1.method348(arg3 - 256) + " (" + class40.field594 + arg1.field790 + ")";
        }
        if (class204.field2963 == 1) {
            class180.method1167(class240.field3609, class207.field3002 + " -> <col=ffffff>" + var5, class269.field4217, arg4, (short) 42, (long) arg2, -54, arg0);
            class242.field3612++;
        } else if (!class275.field4406) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class209.field3010[var12] != null) {
                    class39.field575++;
                    boolean var13 = false;
                    short var14 = 0;
                    if (class69.field1076 == 0 && class209.field3010[var12].equalsIgnoreCase(class1.field16)) {
                        if (class55.field847.field764 < arg1.field764) {
                            var14 = 2000;
                        }
                        if (class55.field847.field788 != 0 && arg1.field788 != 0) {
                            if (class55.field847.field788 == arg1.field788) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class168.field2434[var12]) {
                        var14 = 2000;
                    }
                    short var15 = class276.field4424[var12];
                    short var16 = (short) (var14 + var15);
                    class180.method1167(class209.field3010[var12], "<col=ffffff>" + var5, class171.field2460[var12], arg4, var16, (long) arg2, 125, arg0);
                }
            }
        } else if ((class136.field1970 & 0x8) != 0) {
            class180.method1167(class214.field3087, class14.field214 + " -> <col=ffffff>" + var5, class255.field3866, arg4, (short) 15, (long) arg2, -92, arg0);
            class175.field2491++;
        }
        for (int var17 = 0; var17 < class283.field4508; var17++) {
            if (class280.field4475[var17] == 17) {
                class69.field1087[var17] = "<col=ffffff>" + var5;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public static void method923(int arg0) {
        if (arg0 == 0) {
            field1989 = null;
            field1985 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lmc;[I[BB)Z")
    public final boolean method924(class158 arg0, int[] arg1, byte[] arg2, byte arg3) {
        field1991++;
        if (arg3 <= 11) {
            return true;
        }
        boolean var5 = true;
        class116 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field1983[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg0.method1062(arg1, var9 >> 2, (byte) -95);
                        } else {
                            var6 = arg0.method1058(var9 >> 2, 0, arg1);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field1977[var8] = var6;
                        this.field1983[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
    public final void method925(int arg0) {
        int var2 = -71 % ((arg0 - 13) / 44);
        field1978++;
        this.field1983 = null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class137() {
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "([B)V")
    public class137(byte[] arg0) {
        this.field1983 = new int[128];
        this.field1988 = new short[128];
        this.field1981 = new class122[128];
        this.field1975 = new byte[128];
        this.field1980 = new byte[128];
        this.field1984 = new byte[128];
        this.field1977 = new class116[128];
        class114 var2 = new class114(arg0);
        int var3;
        for (var3 = 0; var2.field1629[var2.field1673 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method741(3083);
        }
        var3++;
        var2.field1673++;
        int var6 = var2.field1673;
        int var7 = 0;
        var2.field1673 += var3;
        while (var2.field1629[var2.field1673 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method741(3083);
        }
        var7++;
        var2.field1673++;
        int var10 = var2.field1673;
        var2.field1673 += var7;
        int var11;
        for (var11 = 0; var2.field1629[var2.field1673 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method741(3083);
        }
        var11++;
        var2.field1673++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method760(false);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class122[] var18 = new class122[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class122 var102 = var18[var19] = new class122();
            int var103 = var2.method760(false);
            if (var103 > 0) {
                var102.field1779 = new byte[var103 * 2];
            }
            int var104 = var2.method760(false);
            if (var104 > 0) {
                var102.field1771 = new byte[var104 * 2 + 2];
                var102.field1771[1] = 64;
            }
        }
        int var20 = var2.method760(false);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method760(false);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field1629[var2.field1673 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method741(3083);
        }
        var24++;
        var2.field1673++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method760(false);
            this.field1988[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method760(false);
            this.field1988[var30] = (short) (this.field1988[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var32) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method780((byte) -75);
            }
            this.field1988[var34] = (short) (this.field1988[var34] + class184.method1188(var33 - 1 << 14, 32768));
            var31--;
            this.field1983[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1983[var38] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var35 = var2.field1629[var6++] - 1;
                }
                var36--;
                this.field1975[var38] = (byte) var35;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1983[var42] != 0) {
                if (var39 == 0) {
                    if (var40 >= var8.length) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                    var41 = var2.field1629[var10++] + 16 << 2;
                }
                this.field1980[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        class122 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1983[var46] != 0) {
                if (var43 == 0) {
                    var44 = var18[var14[var45]];
                    if (var12.length > var45) {
                        var43 = var12[var45++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field1981[var46] = var44;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length > var47) {
                    var48 = var25[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field1983[var50] > 0) {
                    var49 = var2.method760(false) + 1;
                }
            }
            var48--;
            this.field1984[var50] = (byte) var49;
        }
        this.field1979 = var2.method760(false) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class122 var99 = var18[var51];
            if (var99.field1779 != null) {
                for (int var100 = 1; var100 < var99.field1779.length; var100 += 2) {
                    var99.field1779[var100] = var2.method741(3083);
                }
            }
            if (var99.field1771 != null) {
                for (int var101 = 3; var101 < var99.field1771.length - 2; var101 += 2) {
                    var99.field1771[var101] = var2.method741(3083);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method741(3083);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method741(3083);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class122 var96 = var18[var54];
            if (var96.field1771 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1771.length; var98 += 2) {
                    var97 -= -var2.method760(false) - 1;
                    var96.field1771[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class122 var93 = var18[var55];
            if (var93.field1779 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1779.length; var95 += 2) {
                    var94 = var2.method760(false) + var94 + 1;
                    var93.field1779[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method760(false);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = (var56 + var2.method760(false)) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field1984[var60] = (byte) (this.field1984[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                var61 += 2;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class101.method675((byte) -120, var66, var64 - var58);
                    this.field1984[var67] = (byte) (this.field1984[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var58 = var64;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field1984[var63] = (byte) (this.field1984[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method760(false);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method760(false) + (var69 + 1);
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1980[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1980[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class101.method675((byte) -110, var80, var78 - var71);
                    var80 += var79 - var72;
                    int var83 = (this.field1980[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1980[var81] = (byte) var83;
                }
                var74 += 2;
                var71 = var78;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field1980[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1980[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1775 = var2.method760(false);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class122 var92 = var18[var86];
            if (var92.field1779 != null) {
                var92.field1774 = var2.method760(false);
            }
            if (var92.field1771 != null) {
                var92.field1767 = var2.method760(false);
            }
            if (var92.field1775 > 0) {
                var92.field1773 = var2.method760(false);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1769 = var2.method760(false);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class122 var91 = var18[var88];
            if (var91.field1769 > 0) {
                var91.field1780 = var2.method760(false);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class122 var90 = var18[var89];
            if (var90.field1780 > 0) {
                var90.field1776 = var2.method760(false);
            }
        }
    }
}
