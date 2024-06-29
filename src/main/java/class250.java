import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class250 {

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public int field3725 = 0;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public int field3724 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "Z")
    public boolean field3720 = false;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "[Lij;")
    public static class178[] field3729 = new class178[0];

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "[[I")
    public static int[][] field3728 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Z")
    public static boolean field3726 = true;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Z")
    public static boolean field3733 = false;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "Lmc;")
    public class52 field3735;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3723;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "[S")
    public static short[] field3731;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "[[[B")
    public static byte[][][] field3730;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIBIIIIIIII)V", line = 7)
    public static final void method1686(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3736++;
        int var11 = arg7 - arg5;
        if (arg2 < 37) {
            return;
        }
        if (class41.field497 > arg7) {
            var11++;
        }
        int var12 = arg6 - arg1;
        if (class111.field1719 > arg6) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg9 + (arg8 * var13) >> 16;
            int var15 = (var13 + 1) * arg8 + arg9 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg5 + var13 >> 6;
                if (var17 >= 0 && var17 <= (class135.field2058.length - 1)) {
                    int var18 = arg4 + var15;
                    int var19 = arg4 + var14;
                    int[][] var20 = class135.field2058[var17];
                    byte[][] var21 = class205.field3099[var17];
                    byte[][] var22 = class317.field4780[var17];
                    byte[][] var23 = class142.field2157[var17];
                    byte[][] var24 = client.field1952[var17];
                    byte[][] var25 = class123.field1930[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = (var26 + 1) * arg0 + arg3 >> 16;
                        int var28 = arg0 * var26 + arg3 >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            int var30 = arg10 + var27;
                            int var31 = arg10 + var28;
                            int var32 = arg1 + var26 >> 6;
                            int var33 = arg1 + var26 & 0x3F;
                            int var34 = arg5 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var32 < 0 || var32 > var20.length - 1 || var20[var32] == null) {
                                if (class9.field71.field807 != -1) {
                                    var36 = class9.field71.field807;
                                } else if ((arg1 + var26 & 0x4) == (arg5 + var13 & 0x4)) {
                                    var36 = class241.field3595[class298.field4551 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || var32 > (var20.length - 1)) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class46.method312(var19, var31, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var20[var32][var35];
                            }
                            int var37 = var23[var32] == null ? 0 : class241.field3595[var23[var32][var35] & 0xFF];
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var38 = var24[var32] == null ? 0 : class241.field3595[var24[var32][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class46.method312(var19, var31, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var21[var32] == null ? 0 : var21[var32][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class46.method312(var19, var31, var16, var29, var37);
                                    } else {
                                        class288.method1997(true, var40 >> 2, var31, var37, var16, var29, var39 & 0x3, var19, true, class46.field577, var36);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var22[var32][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class46.method312(var19, var31, var16, var29, var38);
                                    }
                                    class288.method1997(true, var42 >> 2, var31, var38, var16, var29, var41 & 0x3, var19, var37 == 0, class46.field577, 0);
                                }
                            }
                            if (var25[var32] != null) {
                                int var43 = var25[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var29 == 1) {
                                        var44 = var31;
                                    } else {
                                        var44 = var30 - 1;
                                    }
                                    int var45 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var45 = 13369344;
                                        var43 -= 4;
                                    }
                                    int var46;
                                    if (var16 == 1) {
                                        var46 = var19;
                                    } else {
                                        var46 = var18 - 1;
                                    }
                                    if (var43 == 1) {
                                        class46.method316(var19, var31, var29, var45);
                                    } else if (var43 == 2) {
                                        class46.method313(var19, var31, var16, var45);
                                    } else if (var43 == 3) {
                                        class46.method316(var46, var31, var29, var45);
                                    } else if (var43 == 4) {
                                        class46.method313(var19, var44, var16, var45);
                                    } else if (var43 == 9) {
                                        class46.method316(var19, var31, var29, 16777215);
                                        class46.method313(var19, var31, var16, var45);
                                    } else if (var43 == 10) {
                                        class46.method316(var46, var31, var29, 16777215);
                                        class46.method313(var19, var31, var16, var45);
                                    } else if (var43 == 11) {
                                        class46.method316(var46, var31, var29, 16777215);
                                        class46.method313(var19, var44, var16, var45);
                                    } else if (var43 == 12) {
                                        class46.method316(var19, var31, var29, 16777215);
                                        class46.method313(var19, var44, var16, var45);
                                    } else if (var43 == 17) {
                                        class46.method313(var19, var31, 1, var45);
                                    } else if (var43 == 18) {
                                        class46.method313(var46, var31, 1, var45);
                                    } else if (var43 == 19) {
                                        class46.method313(var46, var44, 1, var45);
                                    } else if (var43 == 20) {
                                        class46.method313(var19, var44, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class46.method313(var19 + var48, var44 - var48, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class46.method313(var19 + var47, var31 + var47, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var49 = arg4 + var14;
                    var10000 = arg4 + var15;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52;
                        if (class9.field71.field807 != -1) {
                            var52 = class9.field71.field807;
                        } else if ((var51 + arg1 & 0x4) == (var13 + arg5 & 0x4)) {
                            var52 = class241.field3595[class298.field4551 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var53 = ((var51 + 1) * arg0 + arg3 >> 16) + arg10;
                        int var54 = (arg0 * var51 + arg3 >> 16) + arg10;
                        int var55 = var53 - var54;
                        class46.method312(var49, var54, var16, var55, var52);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < (var11 + 2); var56++) {
            int var57 = arg8 * var56 + arg9 >> 16;
            int var58 = (var56 + 1) * arg8 + arg9 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg5 + var56 >> 6;
                var10000 = arg4 + var58;
                int var62 = arg4 + var57;
                if (var60 >= 0 && var60 <= class203.field3034.length - 1) {
                    int[][] var63 = class203.field3034[var60];
                    for (int var64 = -2; var64 < (var12 + 2); var64++) {
                        int var65 = arg3 + (arg0 * var64) >> 16;
                        int var66 = arg3 + ((var64 + 1) * arg0) >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg10 + var66;
                            int var69 = arg1 + var64 >> 6;
                            int var70 = arg10 + var65;
                            if (var69 >= 0 && var69 <= var63.length - 1) {
                                int var71 = ((arg1 + var64 & 0x3F) << 6) + (var56 + arg5 & 0x3F);
                                if (var63[var69] != null) {
                                    int var72 = var63[var69][var71];
                                    int var73 = var72 & 0x3FFF;
                                    if (var73 != 0) {
                                        class45 var74 = class197.method1356((byte) -105, var73 - 1);
                                        int var75 = var72 >> 14 & 0x3;
                                        class59 var76 = var74.method292(var75, (byte) -128);
                                        if (var76 != null) {
                                            int var77 = var76.field2350 * var59 / 4;
                                            int var78 = var76.field2358 * var67 / 4;
                                            if (var74.field564) {
                                                int var79 = var72 >> 16 & 0xF;
                                                int var80 = var72 >> 20 & 0xF;
                                                if ((var75 & 0x1) == 1) {
                                                    int var81 = var79;
                                                    var79 = var80;
                                                    var80 = var81;
                                                }
                                                var78 = var67 * var80;
                                                var77 = var59 * var79;
                                            }
                                            if (var77 != 0 && var78 != 0) {
                                                if (var74.field574 == 0) {
                                                    var76.method398(var62, var70 + var67 - var78, var77, var78);
                                                } else {
                                                    var76.method400(var62, var70 + var67 - var78, var77, var78, var74.field574);
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

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 429)
    public static void method1687(boolean arg0) {
        if (!arg0) {
            field3729 = (class178[]) null;
        }
        field3731 = null;
        field3730 = (byte[][][]) null;
        field3728 = (int[][]) null;
        field3729 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)V", line = 445)
    public static final void method1688(boolean arg0, int arg1) {
        field3734++;
        if (arg1 >= -80) {
            method1689(-50, 73, -23, (class210) null);
        }
        if (class225.field3425 != arg0) {
            class225.field3425 = arg0;
            class161.method1144((byte) -118);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIILlm;)[Lpj;", line = 468)
    public static final class59[] method1689(int arg0, int arg1, int arg2, class210 arg3) {
        if (arg1 == -7789) {
            field3722++;
            return class249.method1680(arg2, arg3, arg0, (byte) -102) ? class153.method1095(arg1 + 7756) : null;
        } else {
            return (class59[]) null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;", line = 517)
    public static final Class method1690(String arg0, byte arg1) throws ClassNotFoundException {
        field3721++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg1 > -84) {
            return (Class) null;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }
}
