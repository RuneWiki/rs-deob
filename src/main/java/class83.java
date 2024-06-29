import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class83 extends class270 {

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    private int field1157 = 0;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "Lue;")
    private class222 field1155 = new class222(16);

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    private int field1176 = 0;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "Llh;")
    private class58 field1172 = new class58();

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "J")
    private long field1178 = 0L;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Lki;")
    private class142 field1147;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "Z")
    private boolean field1175;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "Llh;")
    private class58 field1173;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    private int field1169;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "Lki;")
    private class142 field1166;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "Llj;")
    private class25 field1149;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "Z")
    private boolean field1177;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "Le;")
    private class177 field1146;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Lkj;")
    private class120 field1151;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field1143 = 0;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "Llm;")
    public static class150 field1154 = new class150(8);

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1158 = "Unable to find ";

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "Ln;")
    private class232 field1161;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "Z")
    private boolean field1174;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "[B")
    private byte[] field1153;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public final void method529(byte arg0) {
        if (arg0 <= 14) {
            this.method533(-87);
        }
        field1162++;
        if (this.field1147 != null) {
            this.field1174 = true;
            if (this.field1173 == null) {
                this.field1173 = new class58();
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)I")
    public final int method530(byte arg0, int arg1) {
        field1163++;
        if (arg0 == 113) {
            class120 var3 = (class120) this.field1155.method1453(true, (long) arg1);
            return var3 == null ? 0 : var3.method348(arg0 ^ 0xFFFFFFC2);
        } else {
            return 109;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static void method531(byte arg0) {
        if (arg0 <= 28) {
            field1154 = null;
        }
        field1154 = null;
        field1158 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLim;)Z")
    public static final boolean method532(byte arg0, class178 arg1) {
        field1160++;
        int var2 = -102 / ((arg0 + 36) / 46);
        if (arg1.field2694 == 205) {
            class157.field2167 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public final void method533(int arg0) {
        field1144++;
        if (this.field1173 == null || this.method536(114) == null) {
            return;
        }
        if (arg0 >= -124) {
            this.method536(-76);
        }
        for (class154 var2 = this.field1172.method369((byte) -109); var2 != null; var2 = this.field1172.method362(false)) {
            int var3 = (int) var2.field2141;
            if (var3 < 0 || this.field1161.field3615 <= var3 || this.field1161.field3617[var3] == 0) {
                var2.method962(128);
            } else {
                if (this.field1153[var3] == 0) {
                    this.method537(-22151, var3, 1);
                }
                if (this.field1153[var3] == -1) {
                    this.method537(-22151, var3, 2);
                }
                if (this.field1153[var3] == 1) {
                    var2.method962(128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lej;IIIZBIIZII)V")
    public static final void method534(class213 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field1165++;
        if (arg4 && !class294.method1973(2) && (class164.field2333[0][arg1][arg6] & 0x2) == 0) {
            if ((class164.field2333[arg3][arg1][arg6] & 0x10) != 0) {
                return;
            }
            if (class110.method704(arg6, arg3, -1, arg1) != class249.field3890) {
                return;
            }
        }
        if (arg3 < class137.field1873) {
            class137.field1873 = arg3;
        }
        class240 var11 = class265.method1717(8, arg10);
        int var12;
        int var13;
        if (arg9 == 1 || arg9 == 3) {
            var12 = var11.field3760;
            var13 = var11.field3713;
        } else {
            var12 = var11.field3713;
            var13 = var11.field3760;
        }
        int var14;
        int var15;
        if (arg1 + var12 > 104) {
            var14 = arg1;
            var15 = arg1 + 1;
        } else {
            var15 = arg1 + (var12 + 1 >> 1);
            var14 = (var12 >> 1) + arg1;
        }
        int var16;
        int var17;
        if ((arg6 + var13) > 104) {
            var16 = arg6 + 1;
            var17 = arg6;
        } else {
            var17 = arg6 + (var13 >> 1);
            var16 = (var13 + 1 >> 1) + arg6;
        }
        int var18 = (arg1 << 7) + (var12 << 6);
        int[][] var19 = class185.field2812[arg2];
        int var20 = var19[var14][var16] + var19[var15][var17] + var19[var14][var17] + var19[var15][var16] >> 2;
        int[][] var21 = null;
        if (arg5 >= -86) {
            method532((byte) -124, (class178) null);
        }
        long var22 = (long) (arg9 << 20 | arg1 | arg6 << 7 | arg7 << 14 | 0x40000000);
        if (var11.field3736 == 0 || arg8) {
            var22 |= Long.MIN_VALUE;
        }
        if (var11.field3725 == 1) {
            var22 |= 0x400000L;
        }
        if (var11.field3711) {
            var22 |= 0x80000000L;
        }
        int var24 = (arg6 << 7) + (var13 << 6);
        long var25 = var22 | (long) arg10 << 32;
        if (arg8) {
            var21 = class2.field7[0];
        } else if (arg2 < 3) {
            var21 = class185.field2812[arg2 + 1];
        }
        if (var11.method1579(true)) {
            class284.method1869(arg9, 0, 28549, (class310) null, arg6, var11, arg1, (class314) null, arg3);
        }
        boolean var27 = var11.field3761 & !arg8;
        if (arg7 == 22) {
            if (class38.field583 || var11.field3736 != 0 || var11.field3779 == 1 || var11.field3732) {
                class202 var29;
                if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                    class16 var28 = var11.method1571(arg9, var20, arg4, (class74) null, var21, var24, var19, 22, (byte) 18, var18, var27);
                    var29 = var28.field289;
                } else {
                    var29 = new class158(arg10, 22, arg9, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
                }
                class50.method309(arg3, arg1, arg6, var20, var29, var25, var11.field3755);
                if (var11.field3779 == 1 && arg0 != null) {
                    arg0.method1325(arg6, arg1, 262144);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class202 var69;
            if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                class16 var68 = var11.method1571(arg7 == 11 ? arg9 + 4 : arg9, var20, arg4, (class74) null, var21, var24, var19, 10, (byte) 52, var18, var27);
                var69 = var68.field289;
            } else {
                var69 = new class158(arg10, 10, arg7 == 11 ? arg9 + 4 : arg9, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
            }
            if (var69 != null) {
                boolean var70 = class240.method1565(arg3, arg1, arg6, var20, var12, var13, var69, 0, var25);
                if (var11.field3717 && var70 && arg4) {
                    int var71 = 15;
                    if (var69 instanceof class94) {
                        var71 = ((class94) var69).method410() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var12; var72++) {
                        for (int var73 = 0; var73 <= var13; var73++) {
                            if (class184.field2796[arg3][arg1 + var72][arg6 + var73] < var71) {
                                class184.field2796[arg3][arg1 + var72][arg6 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field3779 != 0 && arg0 != null) {
                arg0.method1338(var12, arg1, !var11.field3723, var13, -1, var11.field3715, arg6);
            }
        } else if (arg7 >= 12) {
            class202 var31;
            if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                class16 var30 = var11.method1571(arg9, var20, arg4, (class74) null, var21, var24, var19, arg7, (byte) -85, var18, var27);
                var31 = var30.field289;
            } else {
                var31 = new class158(arg10, arg7, arg9, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
            }
            class240.method1565(arg3, arg1, arg6, var20, 1, 1, var31, 0, var25);
            if (arg4 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg3 > 0 && var11.field3762 != 0) {
                class257.field4161[arg3][arg1][arg6] = class161.method1003(class257.field4161[arg3][arg1][arg6], 4);
            }
            if (var11.field3779 != 0 && arg0 != null) {
                arg0.method1338(var12, arg1, !var11.field3723, var13, -1, var11.field3715, arg6);
            }
        } else if (arg7 == 0) {
            class202 var33;
            if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                class16 var32 = var11.method1571(arg9, var20, arg4, (class74) null, var21, var24, var19, 0, (byte) 6, var18, var27);
                var33 = var32.field289;
            } else {
                var33 = new class158(arg10, 0, arg9, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
            }
            class25.method160(arg3, arg1, arg6, var20, var33, (class202) null, class161.field2253[arg9], 0, var25);
            if (arg4) {
                if (arg9 == 0) {
                    if (var11.field3717) {
                        class184.field2796[arg3][arg1][arg6] = 50;
                        class184.field2796[arg3][arg1][arg6 + 1] = 50;
                    }
                    if (var11.field3762 == 1) {
                        class257.field4161[arg3][arg1][arg6] = class161.method1003(class257.field4161[arg3][arg1][arg6], 1);
                    }
                } else if (arg9 == 1) {
                    if (var11.field3717) {
                        class184.field2796[arg3][arg1][arg6 + 1] = 50;
                        class184.field2796[arg3][arg1 + 1][arg6 + 1] = 50;
                    }
                    if (var11.field3762 == 1) {
                        class257.field4161[arg3][arg1][arg6 + 1] = class161.method1003(class257.field4161[arg3][arg1][arg6 + 1], 2);
                    }
                } else if (arg9 == 2) {
                    if (var11.field3717) {
                        class184.field2796[arg3][arg1 + 1][arg6] = 50;
                        class184.field2796[arg3][arg1 + 1][arg6 + 1] = 50;
                    }
                    if (var11.field3762 == 1) {
                        class257.field4161[arg3][arg1 + 1][arg6] = class161.method1003(class257.field4161[arg3][arg1 + 1][arg6], 1);
                    }
                } else if (arg9 == 3) {
                    if (var11.field3717) {
                        class184.field2796[arg3][arg1][arg6] = 50;
                        class184.field2796[arg3][arg1 + 1][arg6] = 50;
                    }
                    if (var11.field3762 == 1) {
                        class257.field4161[arg3][arg1][arg6] = class161.method1003(class257.field4161[arg3][arg1][arg6], 2);
                    }
                }
            }
            if (var11.field3779 != 0 && arg0 != null) {
                arg0.method1342(arg9, var11.field3715, arg6, true, arg7, !var11.field3723, arg1);
            }
            if (var11.field3701 != 16) {
                class188.method1192(arg3, arg1, arg6, var11.field3701);
            }
        } else if (arg7 == 1) {
            class202 var35;
            if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                class16 var34 = var11.method1571(arg9, var20, arg4, (class74) null, var21, var24, var19, 1, (byte) 51, var18, var27);
                var35 = var34.field289;
            } else {
                var35 = new class158(arg10, 1, arg9, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
            }
            class25.method160(arg3, arg1, arg6, var20, var35, (class202) null, class199.field3031[arg9], 0, var25);
            if (var11.field3717 && arg4) {
                if (arg9 == 0) {
                    class184.field2796[arg3][arg1][arg6 + 1] = 50;
                } else if (arg9 == 1) {
                    class184.field2796[arg3][arg1 + 1][arg6 + 1] = 50;
                } else if (arg9 == 2) {
                    class184.field2796[arg3][arg1 + 1][arg6] = 50;
                } else if (arg9 == 3) {
                    class184.field2796[arg3][arg1][arg6] = 50;
                }
            }
            if (var11.field3779 != 0 && arg0 != null) {
                arg0.method1342(arg9, var11.field3715, arg6, true, arg7, !var11.field3723, arg1);
            }
        } else if (arg7 == 2) {
            int var36 = arg9 + 1 & 0x3;
            class202 var38;
            class202 var40;
            if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                class16 var37 = var11.method1571(arg9 + 4, var20, arg4, (class74) null, var21, var24, var19, 2, (byte) -101, var18, var27);
                var38 = var37.field289;
                class16 var39 = var11.method1571(var36, var20, arg4, (class74) null, var21, var24, var19, 2, (byte) -101, var18, var27);
                var40 = var39.field289;
            } else {
                var38 = new class158(arg10, 2, arg9 + 4, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
                var40 = new class158(arg10, 2, var36, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
            }
            class25.method160(arg3, arg1, arg6, var20, var38, var40, class161.field2253[arg9], class161.field2253[var36], var25);
            if (var11.field3762 == 1 && arg4) {
                if (arg9 == 0) {
                    class257.field4161[arg3][arg1][arg6] = class161.method1003(class257.field4161[arg3][arg1][arg6], 1);
                    class257.field4161[arg3][arg1][arg6 + 1] = class161.method1003(class257.field4161[arg3][arg1][arg6 + 1], 2);
                } else if (arg9 == 1) {
                    class257.field4161[arg3][arg1][arg6 + 1] = class161.method1003(class257.field4161[arg3][arg1][arg6 + 1], 2);
                    class257.field4161[arg3][arg1 + 1][arg6] = class161.method1003(class257.field4161[arg3][arg1 + 1][arg6], 1);
                } else if (arg9 == 2) {
                    class257.field4161[arg3][arg1 + 1][arg6] = class161.method1003(class257.field4161[arg3][arg1 + 1][arg6], 1);
                    class257.field4161[arg3][arg1][arg6] = class161.method1003(class257.field4161[arg3][arg1][arg6], 2);
                } else if (arg9 == 3) {
                    class257.field4161[arg3][arg1][arg6] = class161.method1003(class257.field4161[arg3][arg1][arg6], 2);
                    class257.field4161[arg3][arg1][arg6] = class161.method1003(class257.field4161[arg3][arg1][arg6], 1);
                }
            }
            if (var11.field3779 != 0 && arg0 != null) {
                arg0.method1342(arg9, var11.field3715, arg6, true, arg7, !var11.field3723, arg1);
            }
            if (var11.field3701 != 16) {
                class188.method1192(arg3, arg1, arg6, var11.field3701);
            }
        } else if (arg7 == 3) {
            class202 var42;
            if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                class16 var41 = var11.method1571(arg9, var20, arg4, (class74) null, var21, var24, var19, 3, (byte) -90, var18, var27);
                var42 = var41.field289;
            } else {
                var42 = new class158(arg10, 3, arg9, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
            }
            class25.method160(arg3, arg1, arg6, var20, var42, (class202) null, class199.field3031[arg9], 0, var25);
            if (var11.field3717 && arg4) {
                if (arg9 == 0) {
                    class184.field2796[arg3][arg1][arg6 + 1] = 50;
                } else if (arg9 == 1) {
                    class184.field2796[arg3][arg1 + 1][arg6 + 1] = 50;
                } else if (arg9 == 2) {
                    class184.field2796[arg3][arg1 + 1][arg6] = 50;
                } else if (arg9 == 3) {
                    class184.field2796[arg3][arg1][arg6] = 50;
                }
            }
            if (var11.field3779 != 0 && arg0 != null) {
                arg0.method1342(arg9, var11.field3715, arg6, true, arg7, !var11.field3723, arg1);
            }
        } else if (arg7 == 9) {
            class202 var44;
            if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                class16 var43 = var11.method1571(arg9, var20, arg4, (class74) null, var21, var24, var19, arg7, (byte) -123, var18, var27);
                var44 = var43.field289;
            } else {
                var44 = new class158(arg10, arg7, arg9, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
            }
            class240.method1565(arg3, arg1, arg6, var20, 1, 1, var44, 0, var25);
            if (var11.field3779 != 0 && arg0 != null) {
                arg0.method1338(var12, arg1, !var11.field3723, var13, -1, var11.field3715, arg6);
            }
            if (var11.field3701 != 16) {
                class188.method1192(arg3, arg1, arg6, var11.field3701);
            }
        } else if (arg7 == 4) {
            class202 var46;
            if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                class16 var45 = var11.method1571(arg9, var20, arg4, (class74) null, var21, var24, var19, 4, (byte) -96, var18, var27);
                var46 = var45.field289;
            } else {
                var46 = new class158(arg10, 4, arg9, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
            }
            class226.method1498(arg3, arg1, arg6, var20, var46, (class202) null, class161.field2253[arg9], 0, 0, 0, var25);
        } else if (arg7 == 5) {
            int var47 = 16;
            long var48 = class51.method312(arg3, arg1, arg6);
            if (var48 != 0L) {
                var47 = class265.method1717(-89, Integer.MAX_VALUE & (int) (var48 >>> 32)).field3701;
            }
            class202 var51;
            if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                class16 var50 = var11.method1571(arg9, var20, arg4, (class74) null, var21, var24, var19, 4, (byte) 124, var18, var27);
                var51 = var50.field289;
            } else {
                var51 = new class158(arg10, 4, arg9, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
            }
            class226.method1498(arg3, arg1, arg6, var20, var51, (class202) null, class161.field2253[arg9], 0, class261.field4198[arg9] * var47, class222.field3462[arg9] * var47, var25);
        } else if (arg7 == 6) {
            int var52 = 8;
            long var53 = class51.method312(arg3, arg1, arg6);
            if (var53 != 0L) {
                var52 = class265.method1717(-118, Integer.MAX_VALUE & (int) (var53 >>> 32)).field3701 / 2;
            }
            class202 var56;
            if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                class16 var55 = var11.method1571(arg9 + 4, var20, arg4, (class74) null, var21, var24, var19, 4, (byte) -96, var18, var27);
                var56 = var55.field289;
            } else {
                var56 = new class158(arg10, 4, arg9 + 4, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
            }
            class226.method1498(arg3, arg1, arg6, var20, var56, (class202) null, 256, arg9, class302.field4803[arg9] * var52, class181.field2747[arg9] * var52, var25);
        } else if (arg7 == 7) {
            int var57 = arg9 + 2 & 0x3;
            class202 var59;
            if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                class16 var58 = var11.method1571(var57 + 4, var20, arg4, (class74) null, var21, var24, var19, 4, (byte) 7, var18, var27);
                var59 = var58.field289;
            } else {
                var59 = new class158(arg10, 4, var57 + 4, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
            }
            class226.method1498(arg3, arg1, arg6, var20, var59, (class202) null, 256, var57, 0, 0, var25);
        } else if (arg7 == 8) {
            int var60 = 8;
            long var61 = class51.method312(arg3, arg1, arg6);
            if (var61 != 0L) {
                var60 = class265.method1717(115, (int) (var61 >>> 32) & Integer.MAX_VALUE).field3701 / 2;
            }
            int var63 = arg9 + 2 & 0x3;
            class202 var65;
            class202 var67;
            if (var11.field3747 == -1 && var11.field3738 == null && var11.field3766 == null && !var11.field3750) {
                class16 var64 = var11.method1571(arg9 + 4, var20, arg4, (class74) null, var21, var24, var19, 4, (byte) 93, var18, var27);
                var65 = var64.field289;
                class16 var66 = var11.method1571(var63 + 4, var20, arg4, (class74) null, var21, var24, var19, 4, (byte) 33, var18, var27);
                var67 = var66.field289;
            } else {
                var65 = new class158(arg10, 4, arg9 + 4, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
                var67 = new class158(arg10, 4, var63 + 4, arg2, arg1, arg6, -1, var11.field3729, (class202) null);
            }
            class226.method1498(arg3, arg1, arg6, var20, var65, var67, 256, arg9, class302.field4803[arg9] * var60, class181.field2747[arg9] * var60, var25);
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)I")
    public final int method535(int arg0) {
        field1164++;
        if (arg0 < 31) {
            this.field1169 = 1;
        }
        return this.field1157;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Ln;")
    public final class232 method536(int arg0) {
        field1156++;
        if (this.field1161 != null) {
            return this.field1161;
        }
        if (this.field1151 == null) {
            if (this.field1146.method1122((byte) -30)) {
                return null;
            }
            this.field1151 = this.field1146.method1121(9, this.field1167, true, (byte) 0, 255);
        }
        if (this.field1151.field1712) {
            return null;
        }
        if (arg0 <= 102) {
            this.method530((byte) -65, 22);
        }
        byte[] var2 = this.field1151.method345(84);
        if (this.field1151 instanceof class251) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1161 = new class232(var2, this.field1169);
                if (this.field1161.field3631 != this.field1170) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field1161 = null;
                if (this.field1146.method1122((byte) 123)) {
                    this.field1151 = null;
                } else {
                    this.field1151 = this.field1146.method1121(93, this.field1167, true, (byte) 0, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1161 = new class232(var2, this.field1169);
            } catch (RuntimeException var4) {
                this.field1146.method1108(2);
                this.field1161 = null;
                if (this.field1146.method1122((byte) -105)) {
                    this.field1151 = null;
                } else {
                    this.field1151 = this.field1146.method1121(103, this.field1167, true, (byte) 0, 255);
                }
                return null;
            }
            if (this.field1166 != null) {
                this.field1149.method164(var2, this.field1167, 0, this.field1166);
            }
        }
        this.field1151 = null;
        if (this.field1147 != null) {
            this.field1157 = 0;
            this.field1153 = new byte[this.field1161.field3615];
        }
        return this.field1161;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)Lkj;")
    private final class120 method537(int arg0, int arg1, int arg2) {
        field1148++;
        class120 var4 = (class120) this.field1155.method1453(true, (long) arg1);
        if (arg0 != -22151) {
            return null;
        }
        if (var4 != null && arg2 == 0 && !var4.field1719 && var4.field1712) {
            var4.method962(128);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field1147 == null || this.field1153[arg1] == -1) {
                    if (this.field1146.method1122((byte) 127)) {
                        return null;
                    }
                    var4 = this.field1146.method1121(120, arg1, true, (byte) 2, this.field1167);
                } else {
                    var4 = this.field1149.method162(arg1, this.field1147, false);
                }
            } else if (arg2 == 1) {
                if (this.field1147 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1149.method163(arg1, this.field1147, -128);
            } else if (arg2 == 2) {
                if (this.field1147 == null) {
                    throw new RuntimeException();
                }
                if (this.field1153[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1146.method1107(arg0 + 22265)) {
                    return null;
                }
                var4 = this.field1146.method1121(-128, arg1, false, (byte) 2, this.field1167);
            } else {
                throw new RuntimeException();
            }
            this.field1155.method1452((long) arg1, var4, 0);
        }
        if (var4.field1712) {
            return null;
        }
        byte[] var5 = var4.method345(68);
        if (!var4 instanceof class251) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class222.field3447.reset();
                class222.field3447.update(var5, 0, var5.length - 2);
                int var9 = (int) class222.field3447.getValue();
                if (this.field1161.field3637[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field1146.field2522 = 0;
                this.field1146.field2520 = 0;
            } catch (RuntimeException var12) {
                this.field1146.method1108(arg0 ^ 0xFFFFA936);
                var4.method962(arg0 ^ 0xFFFFA9F9);
                if (var4.field1719 && !this.field1146.method1122((byte) 121)) {
                    class54 var10 = this.field1146.method1121(arg0 ^ 0xFFFFA91B, arg1, true, (byte) 2, this.field1167);
                    this.field1155.method1452((long) arg1, var10, 0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1161.field3632[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field1161.field3632[arg1];
            if (this.field1147 != null) {
                this.field1149.method164(var5, arg1, 0, this.field1147);
                if (this.field1153[arg1] != 1) {
                    this.field1157++;
                    this.field1153[arg1] = 1;
                }
            }
            if (!var4.field1719) {
                var4.method962(128);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class222.field3447.reset();
            class222.field3447.update(var5, 0, var5.length - 2);
            int var6 = (int) class222.field3447.getValue();
            if (this.field1161.field3637[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1161.field3632[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field1153[arg1] != 1) {
                this.field1157++;
                this.field1153[arg1] = 1;
            }
            if (!var4.field1719) {
                var4.method962(128);
            }
            return var4;
        } catch (Exception var11) {
            this.field1153[arg1] = -1;
            var4.method962(128);
            if (var4.field1719 && !this.field1146.method1122((byte) 117)) {
                class54 var8 = this.field1146.method1121(111, arg1, true, (byte) 2, this.field1167);
                this.field1155.method1452((long) arg1, var8, 0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[B")
    public final byte[] method538(int arg0, int arg1) {
        if (arg0 != -20587) {
            field1158 = null;
        }
        field1168++;
        class120 var3 = this.method537(-22151, arg1, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method345(101);
            var3.method962(128);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)I")
    public final int method539(int arg0) {
        if (arg0 > -98) {
            return -73;
        } else {
            field1141++;
            return this.field1161 == null ? 0 : this.field1161.field3638;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)I")
    public final int method540(byte arg0) {
        field1152++;
        if (arg0 > -80) {
            this.method536(-44);
        }
        if (this.method536(109) == null) {
            return this.field1151 == null ? 0 : this.field1151.method348(-82);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
    public final void method541(int arg0, int arg1) {
        if (arg1 != 128) {
            return;
        }
        field1145++;
        if (this.field1147 == null) {
            return;
        }
        for (class154 var3 = this.field1172.method369((byte) -108); var3 != null; var3 = this.field1172.method362(false)) {
            if (((long) arg0) == var3.field2141) {
                return;
            }
        }
        class154 var4 = new class154();
        var4.field2141 = (long) arg0;
        this.field1172.method370((byte) -22, var4);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class207.field3086 * 128) {
            arg0 = class207.field3086 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class265.field4271 * 128) {
            arg2 = class265.field4271 * 128 - 1;
        }
        class276.field4383 = class118.field1697[arg3];
        class78.field1089 = class118.field1690[arg3];
        class26.field419 = class118.field1697[arg4];
        class248.field3885 = class118.field1690[arg4];
        class272.field4343 = arg0;
        class191.field2892 = arg1;
        class107.field1525 = arg2;
        class231.field3613 = arg0 / 128;
        class216.field3312 = arg2 / 128;
        class79.field1095 = class231.field3613 - class307.field4936;
        if (class79.field1095 < 0) {
            class79.field1095 = 0;
        }
        class85.field1207 = class216.field3312 - class307.field4936;
        if (class85.field1207 < 0) {
            class85.field1207 = 0;
        }
        class312.field5018 = class307.field4936 + class231.field3613;
        if (class312.field5018 > class207.field3086) {
            class312.field5018 = class207.field3086;
        }
        class248.field3884 = class307.field4936 + class216.field3312;
        if (class248.field3884 > class265.field4271) {
            class248.field3884 = class265.field4271;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class307.field4936 + class307.field4936 + 2; var16++) {
            for (int var19 = 0; var19 < class307.field4936 + class307.field4936 + 2; var19++) {
                int var20 = (var16 - class307.field4936 << 7) - (class272.field4343 & 0x7F);
                int var21 = (var19 - class307.field4936 << 7) - (class107.field1525 & 0x7F);
                int var22 = class231.field3613 + var16 - class307.field4936;
                int var23 = class216.field3312 + var19 - class307.field4936;
                if (var22 >= 0 && var23 >= 0 && var22 < class207.field3086 && var23 < class265.field4271) {
                    int var24;
                    if (class228.field3576 == null) {
                        var24 = class2.field7[0][var22][var23] + 128 - class191.field2892;
                    } else {
                        var24 = class228.field3576[0][var22][var23] + 128 - class191.field2892;
                    }
                    int var25 = class2.field7[3][var22][var23] - class191.field2892 - 1000;
                    class163.field2312[var16][var19] = class254.method1656(var20, var25, var24, var21, var15);
                } else {
                    class163.field2312[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class307.field4936 + class307.field4936 + 1; var17++) {
            for (int var18 = 0; var18 < class307.field4936 + class307.field4936 + 1; var18++) {
                class267.field4284[var17][var18] = class163.field2312[var17][var18] || class163.field2312[var17 + 1][var18] || class163.field2312[var17][var18 + 1] || class163.field2312[var17 + 1][var18 + 1];
            }
        }
        class271.field4324 = arg6;
        class278.field4420 = arg7;
        class85.field1233 = arg8;
        class59.field823 = arg9;
        class15.field270 = arg10;
        class160.method995();
        if (class184.field2793 != null) {
            class199.method1252(true);
            class54.method343(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class199.method1252(false);
        }
        class54.method343(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)I")
    public final int method543(int arg0) {
        field1171++;
        if (this.field1161 == null) {
            return 0;
        }
        int var2 = -103 % ((arg0 + 59) / 61);
        if (this.field1175) {
            class154 var3 = this.field1173.method369((byte) -118);
            return var3 == null ? 0 : (int) var3.field2141;
        } else {
            return this.field1161.field3638;
        }
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
    public final void method544(int arg0) {
        if (arg0 <= 12) {
            return;
        }
        field1159++;
        if (this.field1173 != null) {
            if (this.method536(127) == null) {
                return;
            }
            if (this.field1175) {
                boolean var6 = true;
                for (class154 var7 = this.field1173.method369((byte) -87); var7 != null; var7 = this.field1173.method362(false)) {
                    int var9 = (int) var7.field2141;
                    if (this.field1153[var9] == 0) {
                        this.method537(-22151, var9, 1);
                    }
                    if (this.field1153[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method962(128);
                    }
                }
                while (this.field1176 < this.field1161.field3617.length) {
                    if (this.field1161.field3617[this.field1176] == 0) {
                        this.field1176++;
                    } else {
                        if (this.field1149.field401 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field1153[this.field1176] == 0) {
                            this.method537(-22151, this.field1176, 1);
                        }
                        if (this.field1153[this.field1176] == 0) {
                            var6 = false;
                            class154 var8 = new class154();
                            var8.field2141 = (long) this.field1176;
                            this.field1173.method370((byte) -22, var8);
                        }
                        this.field1176++;
                    }
                }
                if (var6) {
                    this.field1175 = false;
                    this.field1176 = 0;
                }
            } else if (this.field1174) {
                boolean var2 = true;
                for (class154 var3 = this.field1173.method369((byte) -88); var3 != null; var3 = this.field1173.method362(false)) {
                    int var5 = (int) var3.field2141;
                    if (this.field1153[var5] != 1) {
                        this.method537(-22151, var5, 2);
                    }
                    if (this.field1153[var5] == 1) {
                        var3.method962(128);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field1161.field3617.length > this.field1176) {
                    if (this.field1161.field3617[this.field1176] == 0) {
                        this.field1176++;
                    } else {
                        if (this.field1146.method1107(121)) {
                            var2 = false;
                            break;
                        }
                        if (this.field1153[this.field1176] != 1) {
                            this.method537(-22151, this.field1176, 2);
                        }
                        if (this.field1153[this.field1176] != 1) {
                            var2 = false;
                            class154 var4 = new class154();
                            var4.field2141 = (long) this.field1176;
                            this.field1173.method370((byte) -22, var4);
                        }
                        this.field1176++;
                    }
                }
                if (var2) {
                    this.field1176 = 0;
                    this.field1174 = false;
                }
            } else {
                this.field1173 = null;
            }
        }
        if (!this.field1177 || class299.method2006(9594) < this.field1178) {
            return;
        }
        for (class120 var10 = (class120) this.field1155.method1458(0); var10 != null; var10 = (class120) this.field1155.method1462(-10000001)) {
            if (!var10.field1712) {
                if (var10.field1716) {
                    if (!var10.field1719) {
                        throw new RuntimeException();
                    }
                    var10.method962(128);
                } else {
                    var10.field1716 = true;
                }
            }
        }
        this.field1178 = class299.method2006(9594) + 1000L;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(ILki;Lki;Le;Llj;IIZ)V")
    public class83(int arg0, class142 arg1, class142 arg2, class177 arg3, class25 arg4, int arg5, int arg6, boolean arg7) {
        this.field1167 = arg0;
        this.field1147 = arg1;
        if (this.field1147 == null) {
            this.field1175 = false;
        } else {
            this.field1175 = true;
            this.field1173 = new class58();
        }
        this.field1169 = arg5;
        this.field1166 = arg2;
        this.field1149 = arg4;
        this.field1177 = arg7;
        this.field1146 = arg3;
        this.field1170 = arg6;
        if (this.field1166 != null) {
            this.field1151 = this.field1149.method162(this.field1167, this.field1166, false);
        }
    }
}
