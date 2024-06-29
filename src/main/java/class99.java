import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class99 extends class120 {

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "[B")
    public byte[] field1537;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Llf;")
    public static class211 field1545 = new class211(4);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([B)V")
    public class99(byte[] arg0) {
        this.field1537 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public static final void method656(int arg0) {
        field1544++;
        Container var1;
        if (class154.field2291 != null) {
            var1 = class154.field2291;
        } else if (class215.field3519 == null) {
            var1 = class2.field23.field237;
        } else {
            var1 = class215.field3519;
        }
        field1542 = var1.getSize().width;
        class19.field223 = var1.getSize().height;
        if (class215.field3519 == var1) {
            Insets var2 = class215.field3519.getInsets();
            field1542 -= var2.left + var2.right;
            class19.field223 -= var2.top + var2.bottom;
        }
        if (class277.method1859(-122) < 2) {
            class135.field1960 = 765;
            class216.field3533 = 0;
            class98.field1510 = 503;
            class82.field1234 = (field1542 - 765) / 2;
        } else {
            class216.field3533 = 0;
            class135.field1960 = field1542;
            class98.field1510 = class19.field223;
            class82.field1234 = 0;
        }
        class86.field1364.setSize(class135.field1960, class98.field1510);
        if (class215.field3519 == var1) {
            Insets var3 = class215.field3519.getInsets();
            class86.field1364.setLocation(var3.left + class82.field1234, class216.field3533 + var3.top);
        } else {
            class86.field1364.setLocation(class82.field1234, class216.field3533);
        }
        if (arg0 == -21335) {
            if (class242.field3880 != -1) {
                class146.method969((byte) -125, true);
            }
            class261.method1790(false);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    public static void method657(int arg0) {
        if (arg0 != -461681754) {
            field1545 = null;
        }
        field1545 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)I")
    public static final int method658(int arg0, int arg1, int arg2, int arg3) {
        field1541++;
        if (class200.field3128 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg1;
        if (arg3 != -7185) {
            method657(28);
        }
        if (arg1 < 3 && (class35.field449[1][var4][var5] & 0x2) == 2) {
            var7 = arg1 + 1;
        }
        int var8 = (128 - var6) * class200.field3128[var7][var4][var5] + (class200.field3128[var7][var4 + 1][var5] * var6) >> 7;
        int var9 = arg0 & 0x7F;
        int var10 = (128 - var6) * class200.field3128[var7][var4][var5 + 1] + class200.field3128[var7][var4 + 1][var5 + 1] * var6 >> 7;
        return (128 - var9) * var8 + var9 * var10 >> 7;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
    public static final void method659(int arg0, int arg1) {
        class142.field2085.method1425(arg0, -118);
        if (arg1 > -90) {
            field1545 = null;
        }
        field1543++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIBIIII)V")
    public static final void method660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8 - arg3;
        field1540++;
        if (class165.field2565 > arg8) {
            var11++;
        }
        int var12 = arg10 - arg0;
        if (arg10 < class104.field1611) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var40 = (var13 + 1) * arg4 + arg2 >> 16;
            int var41 = arg4 * var13 + arg2 >> 16;
            int var42 = var40 - var41;
            if (var42 > 0) {
                int var43 = arg3 + var13 >> 6;
                if (var43 >= 0 && (class177.field2759.length - 1) >= var43) {
                    int var44 = arg9 + var40;
                    int var45 = arg9 + var41;
                    int[][] var46 = class177.field2759[var43];
                    byte[][] var47 = class173.field2711[var43];
                    byte[][] var48 = class126.field1868[var43];
                    byte[][] var49 = class178.field2787[var43];
                    byte[][] var50 = class232.field3735[var43];
                    byte[][] var51 = class92.field1435[var43];
                    for (int var52 = 0; var52 < var12; var52++) {
                        int var53 = arg1 * var52 + arg7 >> 16;
                        int var54 = (var52 + 1) * arg1 + arg7 >> 16;
                        int var55 = var54 - var53;
                        if (var55 > 0) {
                            int var56 = arg5 + var53;
                            int var57 = arg5 + var54;
                            int var58 = arg0 + var52 >> 6;
                            int var59 = var52 + arg0 & 0x3F;
                            int var60 = var13 + arg3 & 0x3F;
                            int var61 = (var59 << 6) + var60;
                            int var62;
                            if (var58 < 0 || var46.length - 1 < var58 || var46[var58] == null) {
                                if (class176.field2755.field2520 != -1) {
                                    var62 = class176.field2755.field2520;
                                } else if ((arg0 + var52 & 0x4) == (arg3 + var13 & 0x4)) {
                                    var62 = class1.field13[class5.field67 + 1];
                                } else {
                                    var62 = 4936552;
                                }
                                if (var58 < 0 || var58 > var46.length - 1) {
                                    if (var62 == 0) {
                                        var62 = 1;
                                    }
                                    class127.method876(var45, var56, var42, var55, var62);
                                    continue;
                                }
                            } else {
                                var62 = var46[var58][var61];
                            }
                            if (var62 == 0) {
                                var62 = 1;
                            }
                            int var63 = var47[var58] == null ? 0 : class1.field13[var47[var58][var61] & 0xFF];
                            int var64 = var50[var58] == null ? 0 : class1.field13[var50[var58][var61] & 0xFF];
                            if (var63 == 0 && var64 == 0) {
                                class127.method876(var45, var56, var42, var55, var62);
                            } else {
                                if (var63 != 0) {
                                    if (var63 == -1) {
                                        var63 = 1;
                                    }
                                    byte var65 = var48[var58] == null ? 0 : var48[var58][var61];
                                    int var66 = var65 & 0xFC;
                                    if (var66 == 0 || var42 <= 1 || var55 <= 1) {
                                        class127.method876(var45, var56, var42, var55, var63);
                                    } else {
                                        class145.method968(class127.field1875, -2301, var63, var65 & 0x3, var66 >> 2, var42, var45, var56, var55, var62, true);
                                    }
                                }
                                if (var64 != 0) {
                                    if (var64 == -1) {
                                        var64 = var62;
                                    }
                                    byte var67 = var49[var58][var61];
                                    int var68 = var67 & 0xFC;
                                    if (var68 == 0 || var42 <= 1 || var55 <= 1) {
                                        class127.method876(var45, var56, var42, var55, var64);
                                    }
                                    class145.method968(class127.field1875, -2301, var64, var67 & 0x3, var68 >> 2, var42, var45, var56, var55, 0, var63 == 0);
                                }
                            }
                            if (var51[var58] != null) {
                                int var69 = var51[var58][var61] & 0xFF;
                                if (var69 != 0) {
                                    int var70;
                                    if (var55 == 1) {
                                        var70 = var56;
                                    } else {
                                        var70 = var57 - 1;
                                    }
                                    int var71 = 13421772;
                                    if (var69 >= 5 && var69 <= 8 || var69 >= 13 && var69 <= 16 || var69 >= 21 && var69 <= 24 || var69 == 27 || var69 == 28) {
                                        var69 -= 4;
                                        var71 = 13369344;
                                    }
                                    int var72;
                                    if (var42 == 1) {
                                        var72 = var45;
                                    } else {
                                        var72 = var44 - 1;
                                    }
                                    if (var69 == 1) {
                                        class127.method874(var45, var56, var55, var71);
                                    } else if (var69 == 2) {
                                        class127.method862(var45, var56, var42, var71);
                                    } else if (var69 == 3) {
                                        class127.method874(var72, var56, var55, var71);
                                    } else if (var69 == 4) {
                                        class127.method862(var45, var70, var42, var71);
                                    } else if (var69 == 9) {
                                        class127.method874(var45, var56, var55, 16777215);
                                        class127.method862(var45, var56, var42, var71);
                                    } else if (var69 == 10) {
                                        class127.method874(var72, var56, var55, 16777215);
                                        class127.method862(var45, var56, var42, var71);
                                    } else if (var69 == 11) {
                                        class127.method874(var72, var56, var55, 16777215);
                                        class127.method862(var45, var70, var42, var71);
                                    } else if (var69 == 12) {
                                        class127.method874(var45, var56, var55, 16777215);
                                        class127.method862(var45, var70, var42, var71);
                                    } else if (var69 == 17) {
                                        class127.method862(var45, var56, 1, var71);
                                    } else if (var69 == 18) {
                                        class127.method862(var72, var56, 1, var71);
                                    } else if (var69 == 19) {
                                        class127.method862(var72, var70, 1, var71);
                                    } else if (var69 == 20) {
                                        class127.method862(var45, var70, 1, var71);
                                    } else if (var69 == 25) {
                                        for (int var73 = 0; var73 < var55; var73++) {
                                            class127.method862(var45 + var73, -var73 + var70, 1, var71);
                                        }
                                    } else if (var69 == 26) {
                                        for (int var74 = 0; var74 < var55; var74++) {
                                            class127.method862(var45 + var74, var56 + var74, 1, var71);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg9 + var40;
                    int var76 = arg9 + var41;
                    for (int var77 = 0; var77 < var12; var77++) {
                        int var78;
                        if (class176.field2755.field2520 != -1) {
                            var78 = class176.field2755.field2520;
                        } else if ((arg0 + var77 & 0x4) == (arg3 + var13 & 0x4)) {
                            var78 = class1.field13[class5.field67 + 1];
                        } else {
                            var78 = 4936552;
                        }
                        if (var78 == 0) {
                            var78 = 1;
                        }
                        int var79 = (arg7 + ((var77 + 1) * arg1) >> 16) + arg5;
                        int var80 = (arg1 * var77 + arg7 >> 16) + arg5;
                        int var81 = var79 - var80;
                        class127.method876(var76, var80, var42, var81, var78);
                    }
                }
            }
        }
        if (arg6 < 52) {
            field1545 = null;
        }
        for (int var14 = -2; var14 < var11 + 2; var14++) {
            int var15 = arg4 * var14 + arg2 >> 16;
            int var16 = (var14 + 1) * arg4 + arg2 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg9 + var15;
                int var19 = arg3 + var14 >> 6;
                var10000 = arg9 + var16;
                if (var19 >= 0 && (class181.field2833.length - 1) >= var19) {
                    int[][] var21 = class181.field2833[var19];
                    for (int var22 = -2; var22 < var12 + 2; var22++) {
                        int var23 = arg1 * var22 + arg7 >> 16;
                        int var24 = (var22 + 1) * arg1 + arg7 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            int var26 = arg5 + var23;
                            var10000 = arg5 + var24;
                            int var28 = arg0 + var22 >> 6;
                            if (var28 >= 0 && (var21.length - 1) >= var28) {
                                int var29 = (arg0 + var22 & 0x3F << 6) + (arg3 + var14 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29];
                                    int var31 = var30 & 0x3FFF;
                                    if (var31 != 0) {
                                        class276 var32 = class271.method1834((byte) 74, var31 - 1);
                                        int var33 = var30 >> 14 & 0x3;
                                        class15 var34 = var32.method1851(var33, (byte) -119);
                                        if (var34 != null) {
                                            int var35 = var34.field2142 * var25 / 4;
                                            int var36 = var34.field2148 * var17 / 4;
                                            if (var32.field4397) {
                                                int var37 = (var30 & 0xFF857) >> 16;
                                                int var38 = (var30 & 0xFEC672) >> 20;
                                                if ((var33 & 0x1) == 1) {
                                                    int var39 = var37;
                                                    var37 = var38;
                                                    var38 = var39;
                                                }
                                                var36 = var17 * var37;
                                                var35 = var25 * var38;
                                            }
                                            if (var36 != 0 && var35 != 0) {
                                                if (var32.field4405 == 0) {
                                                    var34.method103(var18, var26 + var25 - var35, var36, var35);
                                                } else {
                                                    var34.method110(var18, var25 + var26 - var35, var36, var35, var32.field4405);
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

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
    public static final void method661(int arg0, int arg1) {
        field1538++;
        for (class120 var2 = class34.field436.method671(arg1 + 262318352); var2 != null; var2 = class34.field436.method666(-126)) {
            if (((long) arg0) == (var2.field1750 >> 48 & 0xFFFFL)) {
                var2.method784(false);
            }
        }
        if (arg1 != -262318352) {
            field1542 = 83;
        }
    }
}
