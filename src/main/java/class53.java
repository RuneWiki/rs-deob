import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 {

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[I")
    private int[] field1258;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "[I")
    private int[] field1254;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[B")
    private byte[] field1249;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Lna;")
    public static class91 field1253 = new class91(5000);

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Lr;")
    public static class118 field1256 = class153.method1136(123, "Wordpack geladen)3");

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lr;")
    public static class118 field1259 = class153.method1136(74, ")4l");

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lr;")
    public static class118 field1255 = class153.method1136(123, "<col=00ffff>");

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field1262 = 0;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Lr;")
    private static class118 field1267 = class153.method1136(75, "Loading)3)3)3");

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lr;")
    public static class118 field1260 = field1267;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lr;")
    public static class118 field1261 = class153.method1136(76, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lr;")
    private static class118 field1269 = class153.method1136(99, "Choose Option");

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lr;")
    public static class118 field1266 = field1269;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Lpa;")
    public static class105 field1265;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Lda;")
    public static class23 field1264;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Ljf;")
    public static class68 field1263;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[BII[BI)I")
    public final int method479(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1268++;
        int var7 = arg0 + arg2;
        int var8 = 0;
        if (arg5 != 24) {
            return 108;
        }
        int var9 = arg3 << 3;
        while (arg0 < var7) {
            int var10 = arg4[arg0] & 0xFF;
            int var11 = this.field1254[var10];
            byte var12 = this.field1249[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var13 + (var14 + var12 - 1 >> 3);
            var9 += var12;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class19.method178(var16, var11 >>> var17));
            if (var13 < var15) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var15) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var15) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method480(int arg0) {
        field1259 = null;
        if (arg0 >= -14) {
            method480(-31);
        }
        field1256 = null;
        field1263 = null;
        field1267 = null;
        field1264 = null;
        field1265 = null;
        field1260 = null;
        field1261 = null;
        field1266 = null;
        field1253 = null;
        field1269 = null;
        field1255 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lr;ILr;BLr;)V")
    public static final void method481(class118 arg0, int arg1, class118 arg2, byte arg3, class118 arg4) {
        field1248++;
        for (int var5 = 99; var5 > 0; var5--) {
            class142.field3218[var5] = class142.field3218[var5 - 1];
            class23.field564[var5] = class23.field564[var5 - 1];
            class77.field1867[var5] = class77.field1867[var5 - 1];
            class75.field1847[var5] = class75.field1847[var5 - 1];
        }
        class33.field835 = class73.field1691;
        class142.field3218[0] = arg1;
        class23.field564[0] = arg2;
        class4.field73++;
        class77.field1867[0] = arg4;
        class75.field1847[0] = arg0;
        if (arg3 != 1) {
            method481(null, -67, null, (byte) 64, null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[BIIB[B)I")
    public final int method482(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, byte[] arg5) {
        field1257++;
        if (arg3 == 0) {
            return 0;
        }
        if (arg4 >= -82) {
            this.method479(-30, null, 36, -122, null, -65);
        }
        int var7 = arg2 + arg3;
        int var8 = 0;
        int var9 = arg0;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1258[var8];
            }
            int var11;
            if ((var11 = this.field1258[var8]) < 0) {
                arg5[arg2++] = (byte) ~var11;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1258[var8];
            }
            int var12;
            if ((var12 = this.field1258[var8]) < 0) {
                arg5[arg2++] = (byte) ~var12;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1258[var8];
            }
            int var13;
            if ((var13 = this.field1258[var8]) < 0) {
                arg5[arg2++] = (byte) ~var13;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1258[var8];
            }
            int var14;
            if ((var14 = this.field1258[var8]) < 0) {
                arg5[arg2++] = (byte) ~var14;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1258[var8];
            }
            int var15;
            if ((var15 = this.field1258[var8]) < 0) {
                arg5[arg2++] = (byte) ~var15;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1258[var8];
            }
            int var16;
            if ((var16 = this.field1258[var8]) < 0) {
                arg5[arg2++] = (byte) ~var16;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1258[var8];
            }
            int var17;
            if ((var17 = this.field1258[var8]) < 0) {
                arg5[arg2++] = (byte) ~var17;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1258[var8];
            }
            int var18;
            if ((var18 = this.field1258[var8]) < 0) {
                arg5[arg2++] = (byte) ~var18;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIBI)I")
    public static final int method483(int arg0, int arg1, byte arg2, int arg3) {
        if (arg0 > 179) {
            arg3 /= 2;
        }
        if (arg0 > 192) {
            arg3 /= 2;
        }
        field1250++;
        if (arg2 != -27) {
            field1253 = null;
        }
        if (arg0 > 217) {
            arg3 /= 2;
        }
        if (arg0 > 243) {
            arg3 /= 2;
        }
        return (arg1 / 4 << 10) + ((arg3 / 32 << 7) + (arg0 / 2));
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIBII[Lke;II)V")
    public static final void method484(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class74[] arg6, int arg7, int arg8) {
        if (arg3 >= -38) {
            method481(null, 59, null, (byte) -21, null);
        }
        field1251++;
        for (int var9 = 0; var9 < arg6.length; var9++) {
            class74 var10 = arg6[var9];
            if (var10 != null && (!var10.field1805 || var10.field1807 == 0 || var10.field1760 || class46.method384(var10, 0) != 0 || class75.field1859 == var10) && var10.field1828 == arg0 && (!var10.field1805 || !class87.method709(true, var10))) {
                int var11 = var10.field1798 + arg7;
                int var12 = var10.field1791 + arg5;
                if (class95.field2249 == var10) {
                    class134.field3047 = true;
                    class81.field1968 = var11;
                    class2.field38 = var12;
                }
                int var13;
                int var14;
                int var17;
                int var18;
                if (var10.field1807 == 2) {
                    var14 = arg2;
                    var17 = arg1;
                    var13 = arg4;
                    var18 = arg8;
                } else if (var10.field1807 == 9) {
                    int var19 = var11;
                    int var20 = var12;
                    int var21 = var10.field1779 + var11;
                    if (var21 < var11) {
                        var19 = var21;
                        var21 = var11;
                    }
                    var21++;
                    int var23 = var12 + var10.field1748;
                    var18 = var21 < arg8 ? var21 : arg8;
                    var13 = var19 <= arg4 ? arg4 : var19;
                    if (var12 > var23) {
                        var20 = var23;
                        var23 = var12;
                    }
                    var23++;
                    var17 = arg1 <= var23 ? arg1 : var23;
                    var14 = var20 <= arg2 ? arg2 : var20;
                } else {
                    var13 = arg4 >= var11 ? arg4 : var11;
                    var14 = var12 > arg2 ? var12 : arg2;
                    int var15 = var11 + var10.field1779;
                    int var16 = var12 + var10.field1748;
                    var17 = arg1 > var16 ? var16 : arg1;
                    var18 = arg8 <= var15 ? arg8 : var15;
                }
                if (!var10.field1805 || var13 < var18 && var14 < var17) {
                    if (var10.field1731 == 1337) {
                        class26.method232((byte) 96, var10);
                    } else if (var10.field1731 == 1338) {
                        class77.method647(var11, var12, (byte) 55);
                    } else {
                        if (var10.field1807 == 0) {
                            if (!var10.field1805 && class87.method709(true, var10) && class151.field3379 != var10) {
                                continue;
                            }
                            method484(var10.field1703, var17, var14, (byte) -46, var13, var12 - var10.field1789, arg6, var11 - var10.field1757, var18);
                            if (var10.field1729 != null) {
                                method484(var10.field1703, var17, var14, (byte) -85, var13, var12 - var10.field1789, var10.field1729, var11 - var10.field1757, var18);
                            }
                            class87 var25 = (class87) class31.field797.method297((long) var10.field1703, -1);
                            if (var25 != null) {
                                class20.method189(var25.field2114, var11, -20490, var14, var18, var17, var13, var12);
                            }
                        }
                        if (var10.field1805) {
                            boolean var26 = false;
                            boolean var27;
                            if (var13 <= class33.field827 && var14 <= class44.field1049 && class33.field827 < var18 && class44.field1049 < var17) {
                                var27 = true;
                            } else {
                                var27 = false;
                            }
                            if (class9.field197 == 1 && var27) {
                                var26 = true;
                            }
                            boolean var28 = false;
                            if (class82.field1972 == 1 && class29.field701 >= var13 && class14.field317 >= var14 && var18 > class29.field701 && class14.field317 < var17) {
                                var28 = true;
                            }
                            if (var28) {
                                class30.method251(var10, class29.field701 - var11, -var12 + class14.field317, 127);
                            }
                            if (class95.field2249 != null && class95.field2249 != var10 && var27 && class23.method213(class46.method384(var10, 0), 1)) {
                                class4.field71 = var10;
                            }
                            if (class75.field1859 == var10) {
                                class33.field843 = var11;
                                class139.field3170 = var12;
                                class114.field2665 = true;
                            }
                            if (var10.field1760) {
                                if (var27 && class101.field2315 != 0 && var10.field1721 != null) {
                                    class136 var29 = new class136();
                                    var29.field3067 = var10.field1721;
                                    var29.field3066 = class101.field2315;
                                    var29.field3077 = var10;
                                    class1.field9.method883(var29, -26866);
                                }
                                if (class95.field2249 != null || class136.field3086 != null || class138.field3144) {
                                    var26 = false;
                                    var28 = false;
                                    var27 = false;
                                }
                                if (!var10.field1714 && var28) {
                                    var10.field1714 = true;
                                    if (var10.field1733 != null) {
                                        class136 var30 = new class136();
                                        var30.field3072 = class29.field701 - var11;
                                        var30.field3077 = var10;
                                        var30.field3067 = var10.field1733;
                                        var30.field3066 = class14.field317 - var12;
                                        class1.field9.method883(var30, -26866);
                                    }
                                }
                                if (var10.field1714 && var26 && var10.field1730 != null) {
                                    class136 var31 = new class136();
                                    var31.field3077 = var10;
                                    var31.field3067 = var10.field1730;
                                    var31.field3072 = class33.field827 - var11;
                                    var31.field3066 = class44.field1049 - var12;
                                    class1.field9.method883(var31, -26866);
                                }
                                if (var10.field1714 && !var26) {
                                    var10.field1714 = false;
                                    if (var10.field1811 != null) {
                                        class136 var32 = new class136();
                                        var32.field3077 = var10;
                                        var32.field3067 = var10.field1811;
                                        var32.field3072 = class33.field827 - var11;
                                        var32.field3066 = class44.field1049 - var12;
                                        class118.field2734.method883(var32, -26866);
                                    }
                                }
                                if (var26 && var10.field1758 != null) {
                                    class136 var33 = new class136();
                                    var33.field3067 = var10.field1758;
                                    var33.field3077 = var10;
                                    var33.field3072 = class33.field827 - var11;
                                    var33.field3066 = class44.field1049 - var12;
                                    class1.field9.method883(var33, -26866);
                                }
                                if (!var10.field1739 && var27) {
                                    var10.field1739 = true;
                                    if (var10.field1831 != null) {
                                        class136 var34 = new class136();
                                        var34.field3066 = class44.field1049 - var12;
                                        var34.field3077 = var10;
                                        var34.field3067 = var10.field1831;
                                        var34.field3072 = class33.field827 - var11;
                                        class1.field9.method883(var34, -26866);
                                    }
                                }
                                if (var10.field1739 && var27 && var10.field1753 != null) {
                                    class136 var35 = new class136();
                                    var35.field3066 = class44.field1049 - var12;
                                    var35.field3077 = var10;
                                    var35.field3072 = class33.field827 - var11;
                                    var35.field3067 = var10.field1753;
                                    class1.field9.method883(var35, -26866);
                                }
                                if (var10.field1739 && !var27) {
                                    var10.field1739 = false;
                                    if (var10.field1741 != null) {
                                        class136 var36 = new class136();
                                        var36.field3072 = class33.field827 - var11;
                                        var36.field3077 = var10;
                                        var36.field3066 = class44.field1049 - var12;
                                        var36.field3067 = var10.field1741;
                                        class118.field2734.method883(var36, -26866);
                                    }
                                }
                                if (var10.field1775 != null) {
                                    class136 var37 = new class136();
                                    var37.field3067 = var10.field1775;
                                    var37.field3077 = var10;
                                    class88.field2127.method883(var37, -26866);
                                }
                                if (var10.field1719 != null && class100.field2310 > var10.field1720) {
                                    if (var10.field1787 == null || class100.field2310 - var10.field1720 > 32) {
                                        class136 var42 = new class136();
                                        var42.field3067 = var10.field1719;
                                        var42.field3077 = var10;
                                        class1.field9.method883(var42, -26866);
                                    } else {
                                        label378: for (int var38 = var10.field1720; var38 < class100.field2310; var38++) {
                                            int var39 = class72.field1671[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field1787.length; var40++) {
                                                if (var10.field1787[var40] == var39) {
                                                    class136 var41 = new class136();
                                                    var41.field3077 = var10;
                                                    var41.field3067 = var10.field1719;
                                                    class1.field9.method883(var41, -26866);
                                                    break label378;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1720 = class100.field2310;
                                }
                                if (var10.field1732 != null && class26.field635 > var10.field1832) {
                                    if (var10.field1822 == null || class26.field635 - var10.field1832 > 32) {
                                        class136 var47 = new class136();
                                        var47.field3067 = var10.field1732;
                                        var47.field3077 = var10;
                                        class1.field9.method883(var47, -26866);
                                    } else {
                                        label358: for (int var43 = var10.field1832; var43 < class26.field635; var43++) {
                                            int var44 = class15.field387[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field1822.length; var45++) {
                                                if (var10.field1822[var45] == var44) {
                                                    class136 var46 = new class136();
                                                    var46.field3077 = var10;
                                                    var46.field3067 = var10.field1732;
                                                    class1.field9.method883(var46, -26866);
                                                    break label358;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1832 = class26.field635;
                                }
                                if (var10.field1735 != null && var10.field1722 < class118.field2773) {
                                    if (var10.field1790 == null || class118.field2773 - var10.field1722 > 32) {
                                        class136 var52 = new class136();
                                        var52.field3077 = var10;
                                        var52.field3067 = var10.field1735;
                                        class1.field9.method883(var52, -26866);
                                    } else {
                                        label338: for (int var48 = var10.field1722; var48 < class118.field2773; var48++) {
                                            int var49 = class81.field1962[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field1790.length; var50++) {
                                                if (var10.field1790[var50] == var49) {
                                                    class136 var51 = new class136();
                                                    var51.field3077 = var10;
                                                    var51.field3067 = var10.field1735;
                                                    class1.field9.method883(var51, -26866);
                                                    break label338;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1722 = class118.field2773;
                                }
                                if (class33.field835 > var10.field1820 && var10.field1795 != null) {
                                    class136 var53 = new class136();
                                    var53.field3067 = var10.field1795;
                                    var53.field3077 = var10;
                                    class1.field9.method883(var53, -26866);
                                }
                                if (var10.field1820 < class108.field2517 && var10.field1756 != null) {
                                    class136 var54 = new class136();
                                    var54.field3067 = var10.field1756;
                                    var54.field3077 = var10;
                                    class1.field9.method883(var54, -26866);
                                }
                                if (class51.field1213 > var10.field1820 && var10.field1818 != null) {
                                    class136 var55 = new class136();
                                    var55.field3077 = var10;
                                    var55.field3067 = var10.field1818;
                                    class1.field9.method883(var55, -26866);
                                }
                                if (class84.field2015 > var10.field1820 && var10.field1767 != null) {
                                    class136 var56 = new class136();
                                    var56.field3067 = var10.field1767;
                                    var56.field3077 = var10;
                                    class1.field9.method883(var56, -26866);
                                }
                                var10.field1820 = class73.field1691;
                                if (var10.field1745 != null) {
                                    for (int var57 = 0; var57 < class85.field2095; var57++) {
                                        class136 var58 = new class136();
                                        var58.field3077 = var10;
                                        var58.field3065 = class67.field1553[var57];
                                        var58.field3083 = class149.field3348[var57];
                                        var58.field3067 = var10.field1745;
                                        class1.field9.method883(var58, -26866);
                                    }
                                }
                            }
                        }
                        if (!var10.field1805) {
                            if (class95.field2249 != null || class136.field3086 != null || class138.field3144) {
                                return;
                            }
                            if ((var10.field1717 >= 0 || var10.field1763 != 0) && class33.field827 >= var13 && var14 <= class44.field1049 && class33.field827 < var18 && var17 > class44.field1049) {
                                if (var10.field1717 >= 0) {
                                    class151.field3379 = arg6[var10.field1717];
                                } else {
                                    class151.field3379 = var10;
                                }
                            }
                            if (var10.field1807 == 8 && var13 <= class33.field827 && class44.field1049 >= var14 && var18 > class33.field827 && var17 > class44.field1049) {
                                class157.field3611 = var10;
                            }
                            if (var10.field1748 < var10.field1792) {
                                class67.method575(var12, class33.field827, var10.field1792, class44.field1049, var10.field1748, var10.field1779 + var11, 100, var10);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIBZI)Lvd;")
    public static final class150 method485(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field1252++;
        long var6 = ((long) arg2 << 40) + ((long) arg5 << 16) + (long) arg0 + ((long) arg1 << 38);
        if (!arg4) {
            class150 var8 = (class150) class67.field1518.method395((byte) -128, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class85 var9 = class131.method1013(-12582, arg0);
        if (arg5 > 1 && var9.field2037 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field2057[var11] <= arg5 && var9.field2057[var11] != 0) {
                    var10 = var9.field2037[var11];
                }
            }
            if (var10 != -1) {
                var9 = class131.method1013(-12582, var10);
            }
        }
        class155 var12 = var9.method697((byte) -109, 1);
        if (var12 == null) {
            return null;
        }
        class150 var13 = null;
        if (var9.field2036 != -1) {
            var13 = method485(var9.field2067, 1, 0, (byte) -30, true, 10);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class52.field1242;
        int var15 = class52.field1244;
        int[] var16 = new int[4];
        int var17 = class52.field1245;
        class52.method470(var16);
        class150 var18 = new class150(36, 32);
        class52.method475(var18.field3367, 36, 32);
        class52.method466();
        class58.method515();
        class58.method511(16, 16);
        class58.field1353 = false;
        int var19 = var9.field2056;
        if (arg4) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg1 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class58.field1354[var9.field2044] * var19 >> 16;
        int var21 = class58.field1346[var9.field2044] * var19 >> 16;
        var12.method1199();
        if (arg3 != -30) {
            field1264 = null;
        }
        var12.method1200(0, var9.field2066, var9.field2049, var9.field2044, var9.field2055, var20 + var12.field2145 / 2 + var9.field2052, var9.field2052 + var21);
        if (arg1 >= 1) {
            var18.method1107(1);
        }
        if (arg1 >= 2) {
            var18.method1107(16777215);
        }
        if (arg2 != 0) {
            var18.method1098(arg2);
        }
        class52.method475(var18.field3367, 36, 32);
        if (var9.field2036 != -1) {
            var13.method1109(0, 0);
        }
        if (!arg4 && (var9.field2033 == 1 || arg5 != 1) && arg5 != -1) {
            class64.field1468.method47(class59.method533(arg5, (byte) 88), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            class67.field1518.method391(var18, var6, true);
        }
        class52.method475(var14, var17, var15);
        class52.method460(var16);
        class58.method515();
        class58.field1353 = true;
        return var18;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([B)V")
    public class53(byte[] arg0) {
        int var2 = 0;
        int var3 = arg0.length;
        this.field1258 = new int[8];
        this.field1254 = new int[var3];
        int[] var4 = new int[33];
        this.field1249 = arg0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1254[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var4[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var4[var9] = var4[var9 - 1];
                            break;
                        }
                        var4[var9] = class19.method178(var11, var10);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var4[var6 - 1];
                }
                var4[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1258[var14] == 0) {
                            this.field1258[var14] = var2;
                        }
                        var14 = this.field1258[var14];
                    }
                    if (this.field1258.length <= var14) {
                        int[] var17 = new int[this.field1258.length * 2];
                        for (int var18 = 0; var18 < this.field1258.length; var18++) {
                            var17[var18] = this.field1258[var18];
                        }
                        this.field1258 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var2) {
                    var2 = var14 + 1;
                }
                this.field1258[var14] = ~var5;
            }
        }
    }
}
