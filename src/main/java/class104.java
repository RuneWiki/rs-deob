import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class104 {

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Z")
    private boolean field1737 = false;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    private int field1753 = 32;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "J")
    private long field1744 = class182.method1253(20215);

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "[Lok;")
    private class135[] field1755 = new class135[8];

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    private int field1759 = 0;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    private int field1760 = 0;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "[Lok;")
    private class135[] field1761 = new class135[8];

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "J")
    private long field1762 = 0L;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "J")
    private long field1758 = 0L;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    private int field1756 = 0;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "Z")
    private boolean field1763 = true;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    private int field1765 = 0;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1730 = " is already on your friend list.";

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field1736 = -2;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1732 = " has logged out.";

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field1750 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    private int field1754;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "Ljj;")
    public static class134 field1751;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Lok;")
    private class135 field1742;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[I")
    public int[] field1731;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    private final void method733(int arg0, int arg1) {
        this.field1759 -= arg0;
        field1733++;
        if (this.field1759 < 0) {
            this.field1759 = 0;
        }
        if (arg1 == 1 && this.field1742 != null) {
            this.field1742.method265(arg0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIBIIIIII)V")
    public static final void method734(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1727++;
        int var11 = arg2 - arg6;
        if (arg2 < class183.field2927) {
            var11++;
        }
        int var12 = arg10 - arg7;
        if (arg4 > -127) {
            method740((byte) -28);
        }
        if (class225.field3569 > arg10) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var41 = (var13 + 1) * arg3 + arg0 >> 16;
            int var42 = arg3 * var13 + arg0 >> 16;
            int var43 = var41 - var42;
            if (var43 > 0) {
                int var44 = arg6 + var13 >> 6;
                if (var44 >= 0 && var44 <= (class96.field1453.length - 1)) {
                    int[][] var45 = class96.field1453[var44];
                    int var46 = arg1 + var42;
                    byte[][] var47 = class19.field219[var44];
                    byte[][] var48 = class259.field4128[var44];
                    int var49 = arg1 + var41;
                    byte[][] var50 = class189.field3022[var44];
                    byte[][] var51 = class25.field308[var44];
                    byte[][] var52 = class233.field3701[var44];
                    for (int var53 = 0; var53 < var12; var53++) {
                        int var54 = arg8 * var53 + arg5 >> 16;
                        int var55 = arg5 + ((var53 + 1) * arg8) >> 16;
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = arg9 + var54;
                            int var58 = arg9 + var55;
                            int var59 = var53 + arg7 & 0x3F;
                            int var60 = arg7 + var53 >> 6;
                            int var61 = arg6 + var13 & 0x3F;
                            int var62 = (var59 << 6) + var61;
                            int var63;
                            if (var60 < 0 || (var45.length - 1) < var60 || var45[var60] == null) {
                                if (class247.field3968.field2082 != -1) {
                                    var63 = class247.field3968.field2082;
                                } else if ((arg6 + var13 & 0x4) == (arg7 + var53 & 0x4)) {
                                    var63 = class280.field4479[class224.field3552 + 1];
                                } else {
                                    var63 = 4936552;
                                }
                                if (var60 < 0 || (var45.length - 1) < var60) {
                                    if (var63 == 0) {
                                        var63 = 1;
                                    }
                                    class63.method507(var46, var57, var43, var56, var63);
                                    continue;
                                }
                            } else {
                                var63 = var45[var60][var62];
                            }
                            if (var63 == 0) {
                                var63 = 1;
                            }
                            int var64 = var47[var60] == null ? 0 : class280.field4479[var47[var60][var62] & 0xFF];
                            int var65 = var51[var60] == null ? 0 : class280.field4479[var51[var60][var62] & 0xFF];
                            if (var64 == 0 && var65 == 0) {
                                class63.method507(var46, var57, var43, var56, var63);
                            } else {
                                if (var64 != 0) {
                                    byte var66 = var48[var60] == null ? 0 : var48[var60][var62];
                                    int var67 = var66 & 0xFC;
                                    if (var64 == -1) {
                                        var64 = 1;
                                    }
                                    if (var67 == 0 || var43 <= 1 || var56 <= 1) {
                                        class63.method507(var46, var57, var43, var56, var64);
                                    } else {
                                        class45.method350(var66 & 0x3, var56, var64, var57, 124, var46, var43, var63, class63.field894, true, var67 >> 2);
                                    }
                                }
                                if (var65 != 0) {
                                    if (var65 == -1) {
                                        var65 = var63;
                                    }
                                    byte var68 = var50[var60][var62];
                                    int var69 = var68 & 0xFC;
                                    if (var69 == 0 || var43 <= 1 || var56 <= 1) {
                                        class63.method507(var46, var57, var43, var56, var65);
                                    }
                                    class45.method350(var68 & 0x3, var56, var65, var57, 82, var46, var43, 0, class63.field894, var64 == 0, var69 >> 2);
                                }
                            }
                            if (var52[var60] != null) {
                                int var70 = var52[var60][var62] & 0xFF;
                                if (var70 != 0) {
                                    int var71;
                                    if (var43 == 1) {
                                        var71 = var46;
                                    } else {
                                        var71 = var49 - 1;
                                    }
                                    int var72 = 13421772;
                                    int var73;
                                    if (var56 == 1) {
                                        var73 = var57;
                                    } else {
                                        var73 = var58 - 1;
                                    }
                                    if (var70 >= 5 && var70 <= 8 || var70 >= 13 && var70 <= 16 || var70 >= 21 && var70 <= 24 || var70 == 27 || var70 == 28) {
                                        var70 -= 4;
                                        var72 = 13369344;
                                    }
                                    if (var70 == 1) {
                                        class63.method489(var46, var57, var56, var72);
                                    } else if (var70 == 2) {
                                        class63.method501(var46, var57, var43, var72);
                                    } else if (var70 == 3) {
                                        class63.method489(var71, var57, var56, var72);
                                    } else if (var70 == 4) {
                                        class63.method501(var46, var73, var43, var72);
                                    } else if (var70 == 9) {
                                        class63.method489(var46, var57, var56, 16777215);
                                        class63.method501(var46, var57, var43, var72);
                                    } else if (var70 == 10) {
                                        class63.method489(var71, var57, var56, 16777215);
                                        class63.method501(var46, var57, var43, var72);
                                    } else if (var70 == 11) {
                                        class63.method489(var71, var57, var56, 16777215);
                                        class63.method501(var46, var73, var43, var72);
                                    } else if (var70 == 12) {
                                        class63.method489(var46, var57, var56, 16777215);
                                        class63.method501(var46, var73, var43, var72);
                                    } else if (var70 == 17) {
                                        class63.method501(var46, var57, 1, var72);
                                    } else if (var70 == 18) {
                                        class63.method501(var71, var57, 1, var72);
                                    } else if (var70 == 19) {
                                        class63.method501(var71, var73, 1, var72);
                                    } else if (var70 == 20) {
                                        class63.method501(var46, var73, 1, var72);
                                    } else if (var70 == 25) {
                                        for (int var74 = 0; var74 < var56; var74++) {
                                            class63.method501(var46 + var74, var73 - var74, 1, var72);
                                        }
                                    } else if (var70 == 26) {
                                        for (int var75 = 0; var75 < var56; var75++) {
                                            class63.method501(var46 + var75, var57 + var75, 1, var72);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var76 = arg1 + var42;
                    for (int var77 = 0; var77 < var12; var77++) {
                        int var79;
                        if (class247.field3968.field2082 != -1) {
                            var79 = class247.field3968.field2082;
                        } else if ((var77 + arg7 & 0x4) == (arg6 + var13 & 0x4)) {
                            var79 = class280.field4479[class224.field3552 + 1];
                        } else {
                            var79 = 4936552;
                        }
                        if (var79 == 0) {
                            var79 = 1;
                        }
                        int var80 = (arg8 * var77 + arg5 >> 16) + arg9;
                        int var81 = (arg5 + ((var77 + 1) * arg8) >> 16) + arg9;
                        int var82 = var81 - var80;
                        class63.method507(var76, var80, var43, var82, var79);
                    }
                    var10000 = arg1 + var41;
                }
            }
        }
        for (int var14 = -2; var14 < (var11 + 2); var14++) {
            int var15 = arg3 * var14 + arg0 >> 16;
            int var16 = (var14 + 1) * arg3 + arg0 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                var10000 = arg1 + var16;
                int var19 = arg1 + var15;
                int var20 = arg6 + var14 >> 6;
                if (var20 >= 0 && var20 <= class46.field559.length - 1) {
                    int[][] var21 = class46.field559[var20];
                    for (int var22 = -2; var22 < (var12 + 2); var22++) {
                        int var23 = (var22 + 1) * arg8 + arg5 >> 16;
                        int var24 = arg5 + (arg8 * var22) >> 16;
                        int var25 = var23 - var24;
                        if (var25 > 0) {
                            int var26 = arg9 + var24;
                            var10000 = arg9 + var23;
                            int var28 = arg7 + var22 >> 6;
                            if (var28 >= 0 && (var21.length - 1) >= var28) {
                                int var29 = (arg7 + var22 & 0x3F << 6) + (var14 + arg6 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29];
                                    int var31 = var30 & 0x1FFF;
                                    if (var31 != 0) {
                                        int var32 = (var30 & 0x62AD) >> 13;
                                        boolean var33 = (var30 & 0xE991) >> 15 == 1;
                                        class230 var34 = class284.method1911(var31 - 1, 126);
                                        class68 var35 = var34.method1529(var32, -95, var33);
                                        if (var35 != null) {
                                            int var36 = var35.field3434 * var17 / 4;
                                            int var37 = var35.field3437 * var25 / 4;
                                            if (var34.field3647) {
                                                int var38 = (var30 & 0xF80BB) >> 16;
                                                int var39 = (var30 & 0xFD8CA5) >> 20;
                                                if ((var32 & 0x1) == 1) {
                                                    int var40 = var38;
                                                    var38 = var39;
                                                    var39 = var40;
                                                }
                                                var37 = var25 * var39;
                                                var36 = var17 * var38;
                                            }
                                            if (var36 != 0 && var37 != 0) {
                                                if (var34.field3652 == 0) {
                                                    var35.method541(var19, var26 + var25 - var37, var36, var37);
                                                } else {
                                                    var35.method532(var19, var26 + var25 - var37, var36, var37, var34.field3652);
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
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public final void method735(int arg0) {
        field1747++;
        this.field1763 = true;
        if (arg0 != 0) {
            method741((byte) -71, -36);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
    public void method413() throws Exception {
        field1748++;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()V")
    public void method416() throws Exception {
        field1738++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lok;I)V")
    public final synchronized void method736(class135 arg0, int arg1) {
        field1739++;
        if (arg1 < 70) {
            this.method738((int[]) null, -56);
        }
        this.field1742 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method414(Component arg0) throws Exception {
        field1741++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILok;I)V")
    private final void method737(int arg0, class135 arg1, int arg2) {
        field1745++;
        int var4 = arg0 >> 5;
        class135 var5 = this.field1761[var4];
        if (arg2 != 10596) {
            return;
        }
        if (var5 == null) {
            this.field1755[var4] = arg1;
        } else {
            var5.field2256 = arg1;
        }
        this.field1761[var4] = arg1;
        arg1.field2255 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([II)V")
    private final void method738(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class278.field4456) {
            var3 = arg1 << 1;
        }
        class56.method435(arg0, 0, var3);
        this.field1759 -= arg1;
        if (this.field1742 != null && this.field1759 <= 0) {
            this.field1759 += class29.field343 >> 4;
            class150.method1020(this.field1742, 110);
            this.method737(this.field1742.method273(), this.field1742, 10596);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class135 var10 = null;
                        class135 var11 = this.field1755[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class31 var12 = var11.field2254;
                                if (var12 == null || var12.field375 <= var8) {
                                    var11.field2257 = true;
                                    int var13 = var11.method263();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field375 += var13;
                                    }
                                    if (var4 >= this.field1753) {
                                        break label107;
                                    }
                                    class135 var14 = var11.method262();
                                    if (var14 != null) {
                                        int var15 = var11.field2255;
                                        while (var14 != null) {
                                            this.method737(var15 * var14.method273() >> 8, var14, 10596);
                                            var14 = var11.method245();
                                        }
                                    }
                                    class135 var16 = var11.field2256;
                                    var11.field2256 = null;
                                    if (var10 == null) {
                                        this.field1755[var7] = var16;
                                    } else {
                                        var10.field2256 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1761[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2256;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class135 var18 = this.field1755[var17];
                this.field1755[var17] = this.field1761[var17] = null;
                while (var18 != null) {
                    class135 var19 = var18.field2256;
                    var18.field2256 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1759 < 0) {
            this.field1759 = 0;
        }
        if (this.field1742 != null) {
            this.field1742.method284(arg0, 0, arg1);
        }
        this.field1744 = class182.method1253(20215);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method739(byte arg0, int arg1, String arg2) {
        field1749++;
        class283 var3 = class46.method360(3, -71, arg1);
        var3.method1893(0);
        if (arg0 >= -62) {
            method739((byte) 124, -101, (String) null);
        }
        var3.field4510 = arg2;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()V")
    public void method415() {
        field1740++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method740(byte arg0) {
        if (arg0 != -99) {
            method734(53, -12, 8, -103, (byte) -59, 37, 79, -120, -23, 122, -8);
        }
        field1730 = null;
        field1751 = null;
        field1732 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)Lte;")
    public static final class265 method741(byte arg0, int arg1) {
        class265 var2 = (class265) class246.field3947.method1839((byte) 29, (long) arg1);
        field1725++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class46.field555.method940((byte) 101, class263.method1725(arg1, -126), class50.method393(arg1, -22825));
        class265 var4 = new class265();
        var4.field4277 = arg1;
        if (var3 != null) {
            var4.method1801(-1, new class264(var3));
        }
        var4.method1804(-106);
        if (arg0 > -48) {
            return null;
        } else {
            class246.field3947.method1830((long) arg1, -86, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public void method412(int arg0) throws Exception {
        field1743++;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public final synchronized void method742(int arg0) {
        if (class178.field2894 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class178.field2894.field2383[var3] == this) {
                    class178.field2894.field2383[var3] = null;
                }
                if (class178.field2894.field2383[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class178.field2894.field2393 = true;
                while (class178.field2894.field2387) {
                    class208.method1408(-127, 50L);
                }
                class178.field2894 = null;
            }
        }
        field1726++;
        this.method415();
        this.field1737 = true;
        this.field1731 = null;
        if (arg0 != -1738) {
            this.method744((byte) -51);
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    public final synchronized void method743(int arg0) {
        field1728++;
        if (this.field1737) {
            return;
        }
        long var2 = class182.method1253(20215);
        try {
            if ((this.field1744 + 500000L) < var2) {
                this.field1744 = var2 - 500000L;
            }
            while ((this.field1744 + 5000L) < var2) {
                this.method733(256, 1);
                this.field1744 += (long) (256000 / class29.field343);
            }
        } catch (Exception var7) {
            this.field1744 = var2;
        }
        if (this.field1731 == null) {
            return;
        }
        try {
            if (this.field1762 != 0L) {
                if (var2 < this.field1762) {
                    return;
                }
                this.method412(this.field1764);
                this.field1762 = 0L;
                this.field1763 = true;
            }
            int var4 = this.method417();
            if (this.field1765 < (this.field1756 - var4)) {
                this.field1765 = this.field1756 - var4;
            }
            int var5 = this.field1757 + this.field1754;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field1764) {
                this.field1764 += 1024;
                if (this.field1764 > 16384) {
                    this.field1764 = 16384;
                }
                this.method415();
                this.method412(this.field1764);
                this.field1763 = true;
                if (this.field1764 < (var5 + 256)) {
                    var5 = this.field1764 - 256;
                    this.field1754 = var5 - this.field1757;
                }
                var4 = 0;
            }
            while (var5 > var4) {
                this.method738(this.field1731, 256);
                var4 += 256;
                this.method416();
            }
            if (arg0 != 5034) {
                this.method738((int[]) null, -61);
            }
            if (this.field1758 < var2) {
                if (this.field1763) {
                    this.field1763 = false;
                } else if (this.field1765 == 0 && this.field1760 == 0) {
                    this.method415();
                    this.field1762 = var2 + 2000L;
                    return;
                } else {
                    this.field1754 = Math.min(this.field1760, this.field1765);
                    this.field1760 = this.field1765;
                }
                this.field1758 = var2 + 2000L;
                this.field1765 = 0;
            }
            this.field1756 = var4;
        } catch (Exception var6) {
            this.method415();
            this.field1762 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public final synchronized void method744(byte arg0) {
        field1729++;
        this.field1763 = true;
        try {
            this.method413();
        } catch (Exception var3) {
            this.method415();
            this.field1762 = class182.method1253(20215) + 2000L;
        }
        int var2 = -93 % ((76 - arg0) / 38);
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "()I")
    public int method417() throws Exception {
        field1735++;
        return this.field1764;
    }
}
