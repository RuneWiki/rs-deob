import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class88 {

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public int field1805 = 0;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lsg;")
    public static class30 field1798 = class167.method1221((byte) 33, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lsg;")
    private static class30 field1796 = class167.method1221((byte) 33, " from your ignore list first)3");

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lsg;")
    public static class30 field1801 = field1796;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lsg;")
    public static class30 field1803 = class167.method1221((byte) 33, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1800 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "J")
    public static long field1799;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILaa;)V")
    public final void method732(int arg0, class8 arg1) {
        if (arg0 != 12986) {
            field1796 = null;
        }
        while (true) {
            int var3 = arg1.method63((byte) 117);
            if (var3 == 0) {
                field1795++;
                return;
            }
            this.method734(var3, arg1, 112);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1802++;
        int var11 = arg8 - arg7;
        int var12 = arg3 - arg0;
        if (arg8 < class53.field1179) {
            var11++;
        }
        if (arg3 < class98.field1979) {
            var12++;
        }
        if (arg10 <= 32) {
            method733(-64, -50, -126, 37, -64, 50, -30, -87, -55, -96, -37);
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var44 = arg6 + (arg1 * var13) >> 16;
            int var45 = (var13 + 1) * arg1 + arg6 >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = var13 + arg0 >> 6;
                if (var47 >= 0 && (class47.field1076.length - 1) >= var47) {
                    int var48 = arg4 + var45;
                    int[][] var49 = class47.field1076[var47];
                    int var50 = arg4 + var44;
                    byte[][] var51 = class262.field4630[var47];
                    byte[][] var52 = class138.field2708[var47];
                    byte[][] var53 = class148.field2833[var47];
                    byte[][] var54 = class246.field4386[var47];
                    byte[][] var55 = class14.field272[var47];
                    for (int var56 = 0; var56 < var11; var56++) {
                        int var57 = (var56 + 1) * arg9 + arg2 >> 16;
                        int var58 = arg9 * var56 + arg2 >> 16;
                        int var59 = var57 - var58;
                        if (var59 > 0) {
                            int var60 = arg5 + var57;
                            int var61 = arg7 + var56 >> 6;
                            int var62 = arg5 + var58;
                            int var63 = arg0 + var13 & 0x3F;
                            int var64 = var56 + arg7 & 0x3F;
                            int var65 = (var64 << 6) + var63;
                            int var66;
                            if (var61 < 0 || var61 > var49.length - 1 || var49[var61] == null) {
                                if (class101.field2061.field3326 != -1) {
                                    var66 = class101.field2061.field3326;
                                } else if ((var13 + arg0 & 0x4) == (arg7 + var56 & 0x4)) {
                                    var66 = class97.field1974[class125.field2444 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var61 < 0 || var61 > var49.length - 1) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class188.method1361(var50, var62, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var49[var61][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var51[var61] == null ? 0 : class97.field1974[var51[var61][var65] & 0xFF];
                            int var68 = var54[var61] == null ? 0 : class97.field1974[var54[var61][var65] & 0xFF];
                            if (var67 == 0 && var68 == 0) {
                                class188.method1361(var50, var62, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    byte var69 = var53[var61] == null ? 0 : var53[var61][var65];
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class188.method1361(var50, var62, var46, var59, var67);
                                    } else {
                                        class3.method19(var62, var66, var70 >> 2, var46, var50, true, var69 & 0x3, var59, true, var67, class188.field3437);
                                    }
                                }
                                if (var68 != 0) {
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    byte var71 = var52[var61][var65];
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class188.method1361(var50, var62, var46, var59, var68);
                                    }
                                    class3.method19(var62, 0, var72 >> 2, var46, var50, var67 == 0, var71 & 0x3, var59, true, var68, class188.field3437);
                                }
                            }
                            if (var55[var61] != null) {
                                int var73 = var55[var61][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var50;
                                    } else {
                                        var74 = var48 - 1;
                                    }
                                    int var75;
                                    if (var59 == 1) {
                                        var75 = var62;
                                    } else {
                                        var75 = var60 - 1;
                                    }
                                    int var76 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var76 = 13369344;
                                        var73 -= 4;
                                    }
                                    if (var73 == 1) {
                                        class188.method1367(var50, var62, var59, var76);
                                    } else if (var73 == 2) {
                                        class188.method1364(var50, var62, var46, var76);
                                    } else if (var73 == 3) {
                                        class188.method1367(var74, var62, var59, var76);
                                    } else if (var73 == 4) {
                                        class188.method1364(var50, var75, var46, var76);
                                    } else if (var73 == 9) {
                                        class188.method1367(var50, var62, var59, 16777215);
                                        class188.method1364(var50, var62, var46, var76);
                                    } else if (var73 == 10) {
                                        class188.method1367(var74, var62, var59, 16777215);
                                        class188.method1364(var50, var62, var46, var76);
                                    } else if (var73 == 11) {
                                        class188.method1367(var74, var62, var59, 16777215);
                                        class188.method1364(var50, var75, var46, var76);
                                    } else if (var73 == 12) {
                                        class188.method1367(var50, var62, var59, 16777215);
                                        class188.method1364(var50, var75, var46, var76);
                                    } else if (var73 == 17) {
                                        class188.method1364(var50, var62, 1, var76);
                                    } else if (var73 == 18) {
                                        class188.method1364(var74, var62, 1, var76);
                                    } else if (var73 == 19) {
                                        class188.method1364(var74, var75, 1, var76);
                                    } else if (var73 == 20) {
                                        class188.method1364(var50, var75, 1, var76);
                                    } else if (var73 == 25) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class188.method1364(var50 + var77, var75 - var77, 1, var76);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class188.method1364(var50 + var78, var62 - -var78, 1, var76);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg4 + var45;
                    int var80 = arg4 + var44;
                    for (int var81 = 0; var81 < var11; var81++) {
                        int var82;
                        if (class101.field2061.field3326 != -1) {
                            var82 = class101.field2061.field3326;
                        } else if ((var13 + arg0 & 0x4) == (arg7 + var81 & 0x4)) {
                            var82 = class97.field1974[class125.field2444 + 1];
                        } else {
                            var82 = 4936552;
                        }
                        int var83 = (arg9 * var81 + arg2 >> 16) + arg5;
                        if (var82 == 0) {
                            var82 = 1;
                        }
                        int var84 = (arg2 + ((var81 + 1) * arg9) >> 16) + arg5;
                        int var85 = var84 - var83;
                        class188.method1361(var80, var83, var46, var85, var82);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < var12 + 2; var14++) {
            int var15 = arg1 * var14 + arg6 >> 16;
            int var16 = (var14 + 1) * arg1 + arg6 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg4 + var15;
                var10000 = arg4 + var16;
                int var20 = var14 + arg0 >> 6;
                if (var20 >= 0 && var20 <= (class223.field3996.length - 1)) {
                    short[][] var21 = class223.field3996[var20];
                    for (int var22 = -2; var22 < (var11 + 2); var22++) {
                        int var23 = arg9 * var22 + arg2 >> 16;
                        int var24 = (var22 + 1) * arg9 + arg2 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            var10000 = arg5 + var24;
                            int var27 = arg5 + var23;
                            int var28 = var22 + arg7 >> 6;
                            if (var28 >= 0 && var28 <= var21.length - 1) {
                                int var29 = ((arg7 + var22 & 0x3F) << 6) + (arg0 + var14 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29] & 0x3FFF;
                                    int var31 = (var21[var28][var29] & 0xDC77) >> 14;
                                    if (var30 != 0) {
                                        if (var31 == 0) {
                                            int var32 = class141.field2732[var30 - 1].field4673 * var25 / 4;
                                            int var33 = class141.field2732[var30 - 1].field4675 * var17 / 4;
                                            int var34 = class141.field2732[var30 - 1].field4672 * var25 / 4;
                                            class141.field2732[var30 - 1].method1392(var18, var27 - var32, var33, var34);
                                        } else if (var31 == 1) {
                                            int var35 = class58.field1269[var30 - 1].field4675 * var17 / 4;
                                            int var36 = class58.field1269[var30 - 1].field4672 * var25 / 4;
                                            int var37 = class58.field1269[var30 - 1].field4673 * var25 / 4;
                                            class58.field1269[var30 - 1].method1392(var18, var27 - var37, var35, var36);
                                        } else if (var31 == 2) {
                                            int var38 = class119.field2329[var30 - 1].field4675 * var17 / 4;
                                            int var39 = class119.field2329[var30 - 1].field4672 * var25 / 4;
                                            int var40 = class119.field2329[var30 - 1].field4673 * var25 / 4;
                                            class119.field2329[var30 - 1].method1392(var18, var27 - var40, var38, var39);
                                        } else if (var31 == 3) {
                                            int var41 = class86.field1774[var30 - 1].field4675 * var17 / 4;
                                            int var42 = class86.field1774[var30 - 1].field4672 * var25 / 4;
                                            int var43 = class86.field1774[var30 - 1].field4673 * var25 / 4;
                                            class86.field1774[var30 - 1].method1392(var18, var27 - var43, var41, var42);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILaa;I)V")
    private final void method734(int arg0, class8 arg1, int arg2) {
        int var4 = -94 / ((arg2 + 13) / 47);
        if (arg0 == 5) {
            this.field1805 = arg1.method65((byte) 111);
        }
        field1797++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method735(int arg0) {
        field1803 = null;
        field1798 = null;
        if (arg0 < 99) {
            field1801 = null;
        }
        field1800 = null;
        field1801 = null;
        field1796 = null;
    }
}
