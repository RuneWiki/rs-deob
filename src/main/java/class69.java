import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class69 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Leg;")
    public static class37 field1089 = class174.method1167("<col=00ff00>", -81);

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field1093 = 0;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field1104 = 0;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "[Z")
    public static boolean[] field1102 = new boolean[5];

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Leg;")
    public static class37 field1095 = class174.method1167("clignotant3:", 124);

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "Leg;")
    public static class37 field1108 = class174.method1167("<col=00ff80>", -17);

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "Leg;")
    public static class37 field1109 = class174.method1167("details", -54);

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Leg;")
    public static class37 field1097 = class174.method1167("Spieler kann nicht gefunden werden: ", 104);

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "[Lbe;")
    public static class17[] field1103 = new class17[0];

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Ljl;")
    public static class101 field1092;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Ljl;")
    public static class101 field1094;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjl;II)[Lja;")
    public static final class105[] method474(int arg0, class101 arg1, int arg2, int arg3) {
        field1100++;
        if (class131.method941(arg0, arg1, arg3, -55)) {
            if (arg2 != -4) {
                method475(-2, 107, (class101) null, 82);
            }
            return class202.method1408(-5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILjl;I)[Lni;")
    public static final class195[] method475(int arg0, int arg1, class101 arg2, int arg3) {
        field1107++;
        if (class131.method941(arg0, arg2, arg3, -115)) {
            if (arg1 != 1024) {
                method478(127);
            }
            return class100.method647((byte) -87);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([Laf;IIIIIIZ[BII)V")
    public static final void method476(class165[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, byte[] arg8, int arg9, int arg10) {
        field1091++;
        if (arg1 != -27952) {
            return;
        }
        int var11 = -1;
        class187 var12 = new class187(arg8);
        while (true) {
            int var13 = var12.method1267(true);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method1246(true);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = (var14 & 0xFDA) >> 6;
                int var17 = var14 >> 12;
                int var18 = var14 & 0x3F;
                int var19 = var12.method1268(255);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg3 == var17 && arg6 <= var16 && var16 < (arg6 + 8) && var18 >= arg2 && (arg2 + 8) > var18) {
                    class133 var22 = class178.method1186(var11, 0);
                    int var23 = class148.method1019(var20, arg10, var18 & 0x7, var22.field2306, var16 & 0x7, arg1 + 27842, var22.field2272) + arg4;
                    int var24 = class271.method1818(-8082, arg10, var20, var22.field2306, var16 & 0x7, var22.field2272, var18 & 0x7) + arg5;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class165 var25 = null;
                        if (!arg7) {
                            int var26 = arg9;
                            if ((class241.field4312[1][var23][var24] & 0x2) == 2) {
                                var26 = arg9 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg0[var26];
                            }
                        }
                        class71.method485(arg9, arg7, var11, arg10 + var20 & 0x3, !arg7, var25, -32264, var21, arg9, var24, var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
    public abstract void method414(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIII)V")
    public static final void method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1098++;
        long var6 = class23.method141(arg0, arg4, arg2);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = (int) var6 >> 14 & 0x1F;
            int var10 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class133 var11 = class178.method1186(var10, 0);
            if (var11.field2258 == -1) {
                int var12 = arg1;
                if (var6 > 0L) {
                    var12 = arg5;
                }
                int[] var13 = class122.field2050;
                int var14 = arg4 * 4 + (((52736 - arg2 * 512) * 4) + 24624);
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var13[var14] = var12;
                        var13[var14 + 512] = var12;
                        var13[var14 + 1024] = var12;
                        var13[var14 + 1536] = var12;
                    } else if (var8 == 1) {
                        var13[var14] = var12;
                        var13[var14 + 1] = var12;
                        var13[var14 + 2] = var12;
                        var13[var14 + 3] = var12;
                    } else if (var8 == 2) {
                        var13[var14 + 3] = var12;
                        var13[var14 + 515] = var12;
                        var13[var14 + 1024 + 3] = var12;
                        var13[var14 + 1539] = var12;
                    } else if (var8 == 3) {
                        var13[var14 + 1536] = var12;
                        var13[var14 + 1537] = var12;
                        var13[var14 + 2 + 1536] = var12;
                        var13[var14 + 1536 + 3] = var12;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var13[var14] = var12;
                    } else if (var8 == 1) {
                        var13[var14 + 3] = var12;
                    } else if (var8 == 2) {
                        var13[var14 + 1539] = var12;
                    } else if (var8 == 3) {
                        var13[var14 + 1536] = var12;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var13[var14] = var12;
                        var13[var14 + 512] = var12;
                        var13[var14 + 1024] = var12;
                        var13[var14 + 1536] = var12;
                    } else if (var8 == 0) {
                        var13[var14] = var12;
                        var13[var14 + 1] = var12;
                        var13[var14 + 2] = var12;
                        var13[var14 + 3] = var12;
                    } else if (var8 == 1) {
                        var13[var14 + 3] = var12;
                        var13[var14 + 515] = var12;
                        var13[var14 + 3 + 1024] = var12;
                        var13[var14 + 3 + 1536] = var12;
                    } else if (var8 == 2) {
                        var13[var14 + 1536] = var12;
                        var13[var14 + 1536 + 1] = var12;
                        var13[var14 + 1538] = var12;
                        var13[var14 + 1539] = var12;
                    }
                }
            } else {
                int var15 = var11.field2306;
                class14 var16 = null;
                if (!var11.field2262) {
                    var16 = class96.field1497[var11.field2258];
                } else if (var8 == 0) {
                    var16 = class96.field1497[var11.field2258];
                } else if (var8 == 1) {
                    var16 = class288.field5080[var11.field2258];
                    var15 = var11.field2272;
                } else if (var8 == 2) {
                    var16 = class182.field3043[var11.field2258];
                } else if (var8 == 3) {
                    var16 = class104.field1621[var11.field2258];
                    var15 = var11.field2272;
                }
                if (var16 != null) {
                    var16.method109((arg4 * 4) + 48, (-arg2 + 104 - var15) * 4 + 48);
                }
            }
        }
        long var17 = class175.method1170(arg0, arg4, arg2);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x7EC00) >> 14;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class133 var21 = class178.method1186(var20, 0);
            int var22 = (int) var17 >> 20 & 0x3;
            if (var21.field2258 != -1) {
                class14 var23 = null;
                int var24 = var21.field2306;
                if (!var21.field2262) {
                    var23 = class96.field1497[var21.field2258];
                } else if (var22 == 0) {
                    var23 = class96.field1497[var21.field2258];
                } else if (var22 == 1) {
                    var23 = class288.field5080[var21.field2258];
                    var24 = var21.field2272;
                } else if (var22 == 2) {
                    var23 = class182.field3043[var21.field2258];
                } else if (var22 == 3) {
                    var23 = class104.field1621[var21.field2258];
                    var24 = var21.field2272;
                }
                if (var23 != null) {
                    var23.method109((arg4 * 4) + 48, (-arg2 + 104 + -var24) * 4 + 48);
                }
            } else if (var19 == 9) {
                int var25 = 15658734;
                if (var17 > 0L) {
                    var25 = 15597568;
                }
                int[] var26 = class122.field2050;
                int var27 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
                if (var22 == 0 || var22 == 2) {
                    var26[var27 + 1536] = var25;
                    var26[var27 + 1 + 1024] = var25;
                    var26[var27 + 512 + 2] = var25;
                    var26[var27 + 3] = var25;
                } else {
                    var26[var27] = var25;
                    var26[var27 + 1 + 512] = var25;
                    var26[var27 + 1024 + 2] = var25;
                    var26[var27 + 3 + 1536] = var25;
                }
            }
        }
        if (arg3 > -46) {
            return;
        }
        long var28 = class89.method589(arg0, arg4, arg2);
        if (var28 == 0L) {
            return;
        }
        int var30 = ((int) var28 & 0x3599FC) >> 20;
        int var31 = Integer.MAX_VALUE & (int) (var28 >>> 32);
        class133 var32 = class178.method1186(var31, 0);
        if (var32.field2258 == -1) {
            return;
        }
        class14 var33 = null;
        int var34 = var32.field2306;
        if (!var32.field2262) {
            var33 = class96.field1497[var32.field2258];
        } else if (var30 == 0) {
            var33 = class96.field1497[var32.field2258];
        } else if (var30 == 1) {
            var33 = class288.field5080[var32.field2258];
            var34 = var32.field2272;
        } else if (var30 == 2) {
            var33 = class182.field3043[var32.field2258];
        } else if (var30 == 3) {
            var34 = var32.field2272;
            var33 = class104.field1621[var32.field2258];
        }
        if (var33 != null) {
            var33.method109(arg4 * 4 + 48, (-var34 + 104 + -arg2) * 4 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static void method478(int arg0) {
        field1097 = null;
        field1095 = null;
        field1109 = null;
        if (arg0 != -2) {
            field1097 = null;
        }
        field1092 = null;
        field1102 = null;
        field1103 = null;
        field1089 = null;
        field1094 = null;
        field1108 = null;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)V")
    public abstract void method416(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)I")
    public static final int method479(byte arg0) {
        if (arg0 >= -36) {
            method476((class165[]) null, -48, -88, 71, -104, -16, -28, true, (byte[]) null, 100, 103);
        }
        field1105++;
        return class119.field2017.method1399(14077);
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(III)V")
    public abstract void method418(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(III)V")
    public class69(int arg0, int arg1, int arg2) {
        this.field1090 = arg0;
        this.field1110 = arg1;
        this.field1111 = arg2;
    }
}
