import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class143 {

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field2087 = 0;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field2090 = 0;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public int field2084;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public int field2085;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public int field2089;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Lne;")
    public static class76 field2086;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "[B")
    public byte[] field2093;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "[B")
    public byte[] field2096;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "[[B")
    public static byte[][] field2083;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([[BILea;[[BZI[[B[[I[[BLdn;IILdn;)V")
    public static final void method1038(byte[][] arg0, int arg1, class58 arg2, byte[][] arg3, boolean arg4, int arg5, byte[][] arg6, int[][] arg7, byte[][] arg8, class323 arg9, int arg10, int arg11, class323 arg12) {
        int var13 = 0;
        if (arg10 != 23312) {
            return;
        }
        while (var13 < arg5) {
            for (int var14 = 0; var14 < arg1; var14++) {
                if (class397.method2461(-51) || class227.method1483(arg10 ^ 0xFFFFF1C7, arg11, var13, class367.field5096, var14)) {
                    byte var15 = arg3[var13][var14];
                    byte var16 = arg8[var13][var14];
                    int var17 = arg6[var13][var14] & 0xFF;
                    int var18 = arg0[var13][var14] & 0xFF;
                    class71 var19 = var17 == 0 ? null : class52.method422(var17 - 1, 7513);
                    class290 var20 = var18 == 0 ? null : class415.method2565(arg10 - 25042, var18 + -1);
                    int var21 = 0;
                    int var22 = 0;
                    if (var15 != 0) {
                        var22 = var19 == null ? 0 : class284.field3858[var15];
                        var21 = var20 == null ? 0 : class258.field3584[var15];
                    } else if (var19 != null) {
                        var22 = class284.field3858[var15];
                    } else if (var20 != null) {
                        var21 = class284.field3858[var15];
                    }
                    int var23 = var21 + var22;
                    int var24 = 0;
                    if (var23 != 0) {
                        int[] var25 = new int[var23];
                        int[] var26 = new int[var23];
                        int[] var27 = new int[var23];
                        int[] var28 = new int[var23];
                        boolean var29 = false;
                        if (var19 != null && (var19.field995 != -1 || var19.field1000 != -1 || var19.field997 != -1)) {
                            int var30 = arg2.method166() ? var19.field997 : var19.field984;
                            if (!class107.field1521) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var22; var31++) {
                                var27[var24] = var30;
                                var28[var24] = var19.field992;
                                if (var19.field995 == -1) {
                                    var25[var24] = -1;
                                } else {
                                    var25[var24] = var19.field995;
                                }
                                if (var19.field1000 == -1) {
                                    var26[var24] = -1;
                                } else {
                                    var29 = true;
                                    var26[var24] = var19.field1000;
                                }
                                var24++;
                            }
                            if (!arg4 && arg11 == 0) {
                                class17.method104(var13, var14, var19.field987, var19.field985 * 8);
                            }
                        } else {
                            for (int var32 = 0; var32 < var22; var32++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        }
                        if (!var29) {
                            var26 = null;
                        }
                        if (var20 == null) {
                            for (int var35 = 0; var35 < var21; var35++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var33 = var20.field3941;
                            if (!class107.field1521) {
                                var33 = -1;
                            }
                            for (int var34 = 0; var34 < var21; var34++) {
                                var27[var24] = var33;
                                var28[var24] = var20.field3942;
                                var25[var24] = arg7[var13][var14];
                                if (var26 != null) {
                                    var26[var24] = -1;
                                }
                                var24++;
                            }
                        }
                        int var36 = class246.field3468.length;
                        int[] var37 = arg4 ? new int[var36] : null;
                        int[] var38 = new int[var36];
                        int[] var39 = new int[var36];
                        for (int var40 = 0; var40 < var36; var40++) {
                            int var48 = class246.field3468[var40];
                            int var49 = class418.field5781[var40];
                            if (var16 == 0) {
                                var38[var40] = var48;
                                var39[var40] = var49;
                            } else if (var16 == 1) {
                                var38[var40] = var49;
                                var39[var40] = 128 - var48;
                            } else if (var16 == 2) {
                                var38[var40] = 128 - var48;
                                var39[var40] = 128 - var49;
                            } else if (var16 == 3) {
                                var38[var40] = 128 - var49;
                                var39[var40] = var48;
                            }
                            if (arg4 && class111.field1720[var15][var40]) {
                                int var52 = (var13 << 7) + var38[var40];
                                int var53 = (var14 << 7) + var39[var40];
                                var37[var40] = arg12.method331(var52, var53) - arg9.method331(var52, var53);
                            }
                        }
                        int var41 = arg9.method329(var13, var14);
                        int var42 = arg9.method329(var13 + 1, var14);
                        int var43 = arg9.method329(var13 + 1, var14 + 1);
                        int var44 = arg9.method329(var13, var14 + 1);
                        if (arg11 > 0) {
                            boolean var45 = true;
                            if (var18 == 0 && var15 != 0) {
                                var45 = false;
                            }
                            if (var17 > 0 && var19 != null && !var19.field982) {
                                var45 = false;
                            }
                            if (var45 && var41 == var42 && var41 == var43 && var41 == var44) {
                                class436.field6155[arg11][var13][var14] = (byte) class431.method2655(class436.field6155[arg11][var13][var14], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        if (arg4) {
                            var46 = class375.method2348(var13, var14);
                            var47 = class431.method2658(var13, var14);
                        }
                        arg9.method333(var13, var14, var38, var37, var39, class196.field2850[var15], class279.field3805[var15], class134.field2007[var15], var25, var26, var27, var28, var46, var47, false);
                        class72.method567(arg11, var13, var14);
                    }
                }
            }
            var13++;
        }
        field2088++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static final void method1039(int arg0) {
        field2094++;
        if (arg0 != 0) {
            return;
        }
        if (class432.field6121 <= 0) {
            class80.field1116 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class178.field2543.length; var2++) {
            if (class178.field2543[var2].startsWith("--> ")) {
                var1++;
                if (class432.field6121 == var1) {
                    class80.field1116 = class178.field2543[var2].substring(4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
    public static void method1040(boolean arg0) {
        if (!arg0) {
            method1039(-119);
        }
        field2083 = null;
        field2086 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)V")
    public static final void method1041(int arg0, byte arg1) {
        field2092++;
        class26 var2 = class217.method1445(true, arg0, 4);
        var2.method164(12);
        if (arg1 != -61) {
            method1041(-9, (byte) 104);
        }
    }
}
