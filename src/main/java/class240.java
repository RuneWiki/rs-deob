import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class240 {

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public int field3727;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[I")
    public int[] field3733;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "[Ljava/lang/String;")
    public String[] field3731;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "[I")
    public int[] field3738;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "[B")
    public byte[] field3734;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field3725 = -1;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field3724 = 0;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3728 = " has logged in.";

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "[[[I")
    public static int[][][] field3735 = new int[2][][];

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3737 = "Cancel";

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "[I")
    public static int[] field3736 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)I")
    public final int method1642(int arg0, byte arg1) {
        if (arg1 != -31) {
            field3728 = null;
        }
        field3726++;
        return this.field3734[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Z")
    public final boolean method1643(int arg0, int arg1) {
        field3723++;
        if (arg0 != 8) {
            this.field3733 = null;
        }
        return (this.field3734[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1644(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3722++;
        int var11 = arg9 - arg8;
        int var12 = arg1 - arg10;
        if (class133.field1956 > arg1) {
            var12++;
        }
        if (class235.field3619 > arg9) {
            var11++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var41 = arg7 * var13 + arg4 >> 16;
            int var42 = (var13 + 1) * arg7 + arg4 >> 16;
            int var43 = var42 - var41;
            if (var43 > 0) {
                int var44 = var13 + arg10 >> 6;
                if (var44 >= 0 && var44 <= class77.field1218.length - 1) {
                    int var45 = arg5 + var41;
                    int var46 = arg5 + var42;
                    int[][] var47 = class77.field1218[var44];
                    byte[][] var48 = class243.field3765[var44];
                    byte[][] var49 = class226.field3528[var44];
                    byte[][] var50 = class164.field2403[var44];
                    byte[][] var51 = class63.field1059[var44];
                    byte[][] var52 = class218.field3344[var44];
                    for (int var53 = 0; var53 < var11; var53++) {
                        int var54 = arg0 * var53 + arg3 >> 16;
                        int var55 = arg3 + ((var53 + 1) * arg0) >> 16;
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = arg6 + var55;
                            int var58 = arg6 + var54;
                            int var59 = arg8 + var53 >> 6;
                            int var60 = arg8 + var53 & 0x3F;
                            int var61 = arg10 + var13 & 0x3F;
                            int var62 = (var60 << 6) + var61;
                            int var63;
                            if (var59 < 0 || (var47.length - 1) < var59 || var47[var59] == null) {
                                if (class90.field1362.field4347 != -1) {
                                    var63 = class90.field1362.field4347;
                                } else if ((arg8 + var53 & 0x4) == (arg10 + var13 & 0x4)) {
                                    var63 = class148.field2150[class251.field3890 + 1];
                                } else {
                                    var63 = 4936552;
                                }
                                if (var59 < 0 || var47.length - 1 < var59) {
                                    if (var63 == 0) {
                                        var63 = 1;
                                    }
                                    class72.method576(var45, var58, var43, var56, var63);
                                    continue;
                                }
                            } else {
                                var63 = var47[var59][var62];
                            }
                            if (var63 == 0) {
                                var63 = 1;
                            }
                            int var64 = var48[var59] == null ? 0 : class148.field2150[var48[var59][var62] & 0xFF];
                            int var65 = var49[var59] == null ? 0 : class148.field2150[var49[var59][var62] & 0xFF];
                            if (var64 == 0 && var65 == 0) {
                                class72.method576(var45, var58, var43, var56, var63);
                            } else {
                                if (var64 != 0) {
                                    if (var64 == -1) {
                                        var64 = 1;
                                    }
                                    byte var66 = var50[var59] == null ? 0 : var50[var59][var62];
                                    int var67 = var66 & 0xFC;
                                    if (var67 == 0 || var43 <= 1 || var56 <= 1) {
                                        class72.method576(var45, var58, var43, var56, var64);
                                    } else {
                                        class296.method1962(var45, var66 & 0x3, var43, true, var67 >> 2, var64, var63, class72.field1174, (byte) -120, var58, var56);
                                    }
                                }
                                if (var65 != 0) {
                                    byte var68 = var51[var59][var62];
                                    int var69 = var68 & 0xFC;
                                    if (var65 == -1) {
                                        var65 = var63;
                                    }
                                    if (var69 == 0 || var43 <= 1 || var56 <= 1) {
                                        class72.method576(var45, var58, var43, var56, var65);
                                    }
                                    class296.method1962(var45, var68 & 0x3, var43, var64 == 0, var69 >> 2, var65, 0, class72.field1174, (byte) -114, var58, var56);
                                }
                            }
                            if (var52[var59] != null) {
                                int var70 = var52[var59][var62] & 0xFF;
                                if (var70 != 0) {
                                    int var71;
                                    if (var43 == 1) {
                                        var71 = var45;
                                    } else {
                                        var71 = var46 - 1;
                                    }
                                    int var72;
                                    if (var56 == 1) {
                                        var72 = var58;
                                    } else {
                                        var72 = var57 - 1;
                                    }
                                    int var73 = 13421772;
                                    if (var70 >= 5 && var70 <= 8 || var70 >= 13 && var70 <= 16 || var70 >= 21 && var70 <= 24 || var70 == 27 || var70 == 28) {
                                        var70 -= 4;
                                        var73 = 13369344;
                                    }
                                    if (var70 == 1) {
                                        class72.method579(var45, var58, var56, var73);
                                    } else if (var70 == 2) {
                                        class72.method572(var45, var58, var43, var73);
                                    } else if (var70 == 3) {
                                        class72.method579(var71, var58, var56, var73);
                                    } else if (var70 == 4) {
                                        class72.method572(var45, var72, var43, var73);
                                    } else if (var70 == 9) {
                                        class72.method579(var45, var58, var56, 16777215);
                                        class72.method572(var45, var58, var43, var73);
                                    } else if (var70 == 10) {
                                        class72.method579(var71, var58, var56, 16777215);
                                        class72.method572(var45, var58, var43, var73);
                                    } else if (var70 == 11) {
                                        class72.method579(var71, var58, var56, 16777215);
                                        class72.method572(var45, var72, var43, var73);
                                    } else if (var70 == 12) {
                                        class72.method579(var45, var58, var56, 16777215);
                                        class72.method572(var45, var72, var43, var73);
                                    } else if (var70 == 17) {
                                        class72.method572(var45, var58, 1, var73);
                                    } else if (var70 == 18) {
                                        class72.method572(var71, var58, 1, var73);
                                    } else if (var70 == 19) {
                                        class72.method572(var71, var72, 1, var73);
                                    } else if (var70 == 20) {
                                        class72.method572(var45, var72, 1, var73);
                                    } else if (var70 == 25) {
                                        for (int var75 = 0; var75 < var56; var75++) {
                                            class72.method572(var45 + var75, -var75 + var72, 1, var73);
                                        }
                                    } else if (var70 == 26) {
                                        for (int var74 = 0; var74 < var56; var74++) {
                                            class72.method572(var45 + var74, var58 + var74, 1, var73);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg5 + var42;
                    int var77 = arg5 + var41;
                    for (int var78 = 0; var78 < var11; var78++) {
                        int var79;
                        if (class90.field1362.field4347 != -1) {
                            var79 = class90.field1362.field4347;
                        } else if ((var78 + arg8 & 0x4) == (var13 + arg10 & 0x4)) {
                            var79 = class148.field2150[class251.field3890 + 1];
                        } else {
                            var79 = 4936552;
                        }
                        int var80 = (arg0 * var78 + arg3 >> 16) + arg6;
                        if (var79 == 0) {
                            var79 = 1;
                        }
                        int var81 = ((var78 + 1) * arg0 + arg3 >> 16) + arg6;
                        int var82 = var81 - var80;
                        class72.method576(var77, var80, var43, var82, var79);
                    }
                }
            }
        }
        int var14 = -2;
        if (arg2 != -7076) {
            field3728 = null;
        }
        while ((var12 + 2) > var14) {
            int var15 = arg7 * var14 + arg4 >> 16;
            int var16 = arg4 + ((var14 + 1) * arg7) >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                var10000 = arg5 + var16;
                int var19 = arg5 + var15;
                int var20 = arg10 + var14 >> 6;
                if (var20 >= 0 && class208.field3119.length - 1 >= var20) {
                    int[][] var21 = class208.field3119[var20];
                    for (int var22 = -2; var22 < (var11 + 2); var22++) {
                        int var23 = arg0 * var22 + arg3 >> 16;
                        int var24 = arg3 + ((var22 + 1) * arg0) >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            int var26 = arg6 + var23;
                            int var27 = arg8 + var22 >> 6;
                            var10000 = arg6 + var24;
                            if (var27 >= 0 && (var21.length - 1) >= var27) {
                                int var29 = (arg8 + var22 & 0x3F << 6) + (arg10 + var14 & 0x3F);
                                if (var21[var27] != null) {
                                    int var30 = var21[var27][var29];
                                    int var31 = var30 & 0x1FFF;
                                    if (var31 != 0) {
                                        class232 var32 = class167.method1134(-1, var31 - 1);
                                        int var33 = var30 >> 13 & 0x3;
                                        boolean var34 = (var30 >> 15 & 0x1) == 1;
                                        class46 var35 = var32.method1577(77, var34, var33);
                                        if (var35 != null) {
                                            int var36 = var35.field3546 * var17 / 4;
                                            int var37 = var35.field3545 * var25 / 4;
                                            if (var32.field3587) {
                                                int var38 = (var30 & 0xF3ED8) >> 16;
                                                int var39 = var30 >> 20 & 0xF;
                                                if ((var33 & 0x1) == 1) {
                                                    int var40 = var38;
                                                    var38 = var39;
                                                    var39 = var40;
                                                }
                                                var36 = var17 * var38;
                                                var37 = var25 * var39;
                                            }
                                            if (var36 != 0 && var37 != 0) {
                                                if (var32.field3588 == 0) {
                                                    var35.method359(var19, var25 + var26 - var37, var36, var37);
                                                } else {
                                                    var35.method367(var19, var26 + var25 - var37, var36, var37, var32.field3588);
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
            var14++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1645(int arg0) {
        field3735 = null;
        field3728 = null;
        field3736 = null;
        if (arg0 > -10) {
            field3737 = null;
        }
        field3737 = null;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)Z")
    public final boolean method1646(int arg0, int arg1) {
        if (arg0 != 1821211216) {
            field3728 = null;
        }
        field3730++;
        return (this.field3734[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)Z")
    public final boolean method1647(int arg0, byte arg1) {
        field3729++;
        int var3 = 36 / ((arg1 - 65) / 42);
        return (this.field3734[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V")
    public class240(int arg0) {
        this.field3727 = arg0;
        this.field3733 = new int[this.field3727];
        this.field3731 = new String[this.field3727];
        this.field3738 = new int[this.field3727];
        this.field3734 = new byte[this.field3727];
    }
}
