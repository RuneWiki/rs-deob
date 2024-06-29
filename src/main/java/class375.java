import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class375 {

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "[I")
    public static int[] field5471 = new int[500];

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "Lpf;")
    public static class425 field5473 = new class425(10, -1);

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "[C")
    public static char[] field5475 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "Lpf;")
    public static class425 field5477;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "Lwl;")
    public static class452 field5478;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public int field5452;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    private int field5454;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public int field5456;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    private int field5472;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Ldr;")
    public static class261 field5461;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5460;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "[[I")
    public int[][] field5455;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBIIIIII)Z")
    public final boolean method2246(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5468++;
        if (arg6 > 1) {
            return class71.method474(128, arg3, arg1, arg6, arg7, arg6, arg4, arg0, arg8) ? true : this.method2251(arg3, arg8, arg6, arg6, arg5, arg1, arg4, arg0, -29128, arg7);
        }
        int var10 = arg0 + arg3 - 1;
        int var11 = arg7 + arg8 - 1;
        if (arg2 != 66) {
            this.field5454 = -53;
        }
        if (arg4 >= arg0 && arg4 <= var10 && arg1 >= arg7 && var11 >= arg1) {
            return true;
        } else if (arg0 - 1 == arg4 && arg1 >= arg7 && var11 >= arg1 && (this.field5455[arg4 - this.field5452][arg1 - this.field5456] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg7 <= arg1 && var11 >= arg1 && (this.field5455[arg4 - this.field5452][arg1 - this.field5456] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if ((arg7 - 1) == arg1 && arg4 >= arg0 && var10 >= arg4 && (this.field5455[arg4 - this.field5452][arg1 - this.field5456] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg1 && arg4 >= arg0 && var10 >= arg4 && (this.field5455[arg4 - this.field5452][arg1 - this.field5456] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
    public final void method2247(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field5452;
        if (arg1 != -1) {
            this.method2246(14, -47, (byte) 52, -9, 24, -94, -31, 13, 92);
        }
        int var5 = arg2 - this.field5456;
        field5462++;
        this.field5455[var4][var5] = class406.method2552(this.field5455[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)V")
    private final void method2248(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -3) {
            this.method2246(-27, 43, (byte) 30, 84, 75, 127, -36, -97, -77);
        }
        field5463++;
        this.field5455[arg0][arg1] = class406.method2552(this.field5455[arg0][arg1], ~arg3);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBI)V")
    public final void method2249(int arg0, byte arg1, int arg2) {
        field5474++;
        if (arg1 != 42) {
            this.method2254(-102, -89, -86, 60, -66, -32, 29, -48);
        }
        int var4 = arg2 - this.field5452;
        int var5 = arg0 - this.field5456;
        this.field5455[var4][var5] = class276.method1712(this.field5455[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V")
    public static final void method2250() {
        if (class17.field251 != null) {
            for (int var0 = 0; var0 < class17.field251.length; var0++) {
                for (int var1 = 0; var1 < class275.field4206; var1++) {
                    for (int var2 = 0; var2 < class265.field4044; var2++) {
                        if (class17.field251[var0][var1][var2] != null) {
                            class17.field251[var0][var1][var2].method80((byte) 0);
                        }
                        class17.field251[var0][var1][var2] = null;
                    }
                }
            }
        }
        class17.field251 = null;
        class85.field1201 = null;
        if (class103.field1393 != null) {
            for (int var3 = 0; var3 < class103.field1393.length; var3++) {
                for (int var4 = 0; var4 < class275.field4206; var4++) {
                    for (int var5 = 0; var5 < class265.field4044; var5++) {
                        if (class103.field1393[var3][var4][var5] != null) {
                            class103.field1393[var3][var4][var5].method80((byte) 0);
                        }
                        class103.field1393[var3][var4][var5] = null;
                    }
                }
            }
        }
        class103.field1393 = null;
        class154.field2118 = null;
        class277.field4216 = null;
        class307.field4638 = null;
        class377.field5496 = 0;
        if (class176.field2676 != null) {
            for (int var6 = 0; var6 < class377.field5496; var6++) {
                class176.field2676[var6] = null;
            }
        }
        if (class360.field5318 != null) {
            for (int var7 = 0; var7 < class15.field190; var7++) {
                class360.field5318[var7] = null;
            }
            class15.field190 = 0;
        }
        if (class281.field4303 != null) {
            for (int var8 = 0; var8 < class358.field5278; var8++) {
                class281.field4303[var8] = null;
            }
            for (int var9 = 0; var9 < class56.field750; var9++) {
                for (int var10 = 0; var10 < class275.field4206; var10++) {
                    for (int var11 = 0; var11 < class265.field4044; var11++) {
                        class452.field6688[var9][var10][var11] = 0L;
                    }
                }
            }
            class358.field5278 = 0;
        }
        client.field6665 = null;
        class38.method221(-100);
        class47.field577.method2121((byte) 63);
        class426.field6271 = null;
        class246.field3684 = null;
        class183.field2740 = null;
        class1.field14 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method2251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 != -29128) {
            return true;
        }
        field5457++;
        int var11 = arg3 + arg6;
        int var12 = arg2 + arg5;
        int var13 = arg0 + arg7;
        int var14 = arg1 + arg9;
        if (arg6 == var13 && (arg4 & 0x2) == 0) {
            int var15 = arg9 >= arg5 ? arg9 : arg5;
            int var16 = var14 > var12 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field5455[var13 - this.field5452 - 1][var15 - this.field5456] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg7 == var11 && (arg4 & 0x8) == 0) {
            int var17 = arg5 > arg9 ? arg5 : arg9;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field5455[arg7 - this.field5452][var17 - this.field5456] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg5 == var14 && (arg4 & 0x1) == 0) {
            int var19 = arg7 < arg6 ? arg6 : arg7;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field5455[var19 - this.field5452][var14 - this.field5456 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg9 == var12 && (arg4 & 0x4) == 0) {
            int var21 = arg6 <= arg7 ? arg7 : arg6;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field5455[var21 - this.field5452][arg9 - this.field5456] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIZIIZII)V")
    public final void method2252(byte arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field5465++;
        int var9 = 256;
        if (arg2) {
            var9 |= 0x20000;
        }
        if (arg6 == 1 || arg6 == 3) {
            int var10 = arg1;
            arg1 = arg4;
            arg4 = var10;
        }
        int var11 = arg3 - this.field5452;
        if (arg0 != -126) {
            this.method2246(-114, 24, (byte) 81, 116, 44, 55, 83, -21, 96);
        }
        int var12 = arg7 - this.field5456;
        if (arg5) {
            var9 |= 0x40000000;
        }
        for (int var13 = var11; var13 < (arg1 + var11); var13++) {
            if (var13 >= 0 && var13 < this.field5472) {
                for (int var14 = var12; var14 < arg4 + var12; var14++) {
                    if (var14 >= 0 && this.field5454 > var14) {
                        this.method2248(var13, var14, arg0 ^ 0x7F, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIII)V")
    private final void method2253(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 91) {
            field5477 = null;
        }
        field5451++;
        this.field5455[arg2][arg3] = class276.method1712(this.field5455[arg2][arg3], arg1);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method2254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5450++;
        if (arg4 == 1) {
            if (arg2 == arg6 && arg5 == arg7) {
                return true;
            }
        } else if (arg6 <= arg2 && arg2 <= (arg4 + arg6 - 1) && arg7 <= arg7 && arg7 <= arg4 + arg7 - 1) {
            return true;
        }
        int var9 = arg2 - this.field5452;
        int var10 = arg5 - this.field5456;
        int var11 = arg7 - this.field5456;
        int var12 = arg6 - this.field5452;
        if (arg4 == 1) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field5455[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field5455[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field5455[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field5455[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field5455[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field5455[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field5455[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field5455[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field5455[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field5455[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field5455[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field5455[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field5455[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field5455[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field5455[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field5455[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 == var12 && var11 + 1 == var10 && (this.field5455[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var11 - 1) == var10 && (this.field5455[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var12 && var10 == var11 && (this.field5455[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var11 && (this.field5455[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg4 - 1;
            int var14 = arg4 + var10 - 1;
            if (arg3 == 0) {
                if (arg1 == 0) {
                    if (var9 - arg4 == var12 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var11 + 1) == var10 && (this.field5455[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var11 - arg4) == var10 && (this.field5455[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 >= var12 && var13 >= var9 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var9 - arg4 == var12 && var10 <= var11 && var14 >= var11 && (this.field5455[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 >= var10 && var14 >= var11 && (this.field5455[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 + 1 == var12 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var11 + 1 == var10 && (this.field5455[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var11 - arg4 == var10 && (this.field5455[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 <= var9 && var13 >= var9 && (var11 - arg4) == var10) {
                        return true;
                    }
                    if ((var9 - arg4) == var12 && var11 >= var10 && var14 >= var11 && (this.field5455[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 >= var10 && var11 <= var14 && (this.field5455[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    if (var9 - arg4 == var12 && var10 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 >= var10 && var11 <= var14 && (this.field5455[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 - arg4 == var10 && (this.field5455[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 - arg4 == var12 && var10 <= var11 && var11 <= var14 && (this.field5455[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var11 - arg4) == var10 && (this.field5455[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 - arg4 == var12 && var10 <= var11 && var14 >= var11 && (this.field5455[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var11 + 1 == var10 && (this.field5455[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var11 - arg4) == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var9 - arg4) == var12 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 + 1 == var10 && (this.field5455[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 >= var10 && var14 >= var11 && (this.field5455[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var11 - arg4) == var10) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var12 <= var9 && var9 <= var13 && var11 + 1 == var10 && (this.field5455[var9][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 >= var12 && var13 >= var9 && var11 - arg4 == var10 && (this.field5455[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var9 - arg4) == var12 && var10 <= var11 && var14 >= var11 && (this.field5455[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var11 >= var10 && var11 <= var14 && (this.field5455[var12][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        int var15 = -66 % ((arg0 - 58) / 36);
        return false;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIZZBI)V")
    public final void method2255(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, byte arg5, int arg6) {
        int var8 = arg6 - this.field5456;
        if (arg5 < 100) {
            return;
        }
        int var9 = arg1 - this.field5452;
        field5464++;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method2253((byte) 112, 128, var9, var8);
                this.method2253((byte) 94, 8, var9 - 1, var8);
            }
            if (arg0 == 1) {
                this.method2253((byte) 94, 2, var9, var8);
                this.method2253((byte) 102, 32, var9, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2253((byte) 120, 8, var9, var8);
                this.method2253((byte) 106, 128, var9 + 1, var8);
            }
            if (arg0 == 3) {
                this.method2253((byte) 101, 32, var9, var8);
                this.method2253((byte) 127, 2, var9, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method2253((byte) 105, 1, var9, var8);
                this.method2253((byte) 102, 16, var9 - 1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method2253((byte) 125, 4, var9, var8);
                this.method2253((byte) 94, 64, var9 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2253((byte) 106, 16, var9, var8);
                this.method2253((byte) 117, 1, var9 + 1, var8 - 1);
            }
            if (arg0 == 3) {
                this.method2253((byte) 124, 64, var9, var8);
                this.method2253((byte) 94, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method2253((byte) 121, 130, var9, var8);
                this.method2253((byte) 113, 8, var9 - 1, var8);
                this.method2253((byte) 114, 32, var9, var8 + 1);
            }
            if (arg0 == 1) {
                this.method2253((byte) 113, 10, var9, var8);
                this.method2253((byte) 97, 32, var9, var8 + 1);
                this.method2253((byte) 92, 128, var9 + 1, var8);
            }
            if (arg0 == 2) {
                this.method2253((byte) 112, 40, var9, var8);
                this.method2253((byte) 97, 128, var9 + 1, var8);
                this.method2253((byte) 108, 2, var9, var8 - 1);
            }
            if (arg0 == 3) {
                this.method2253((byte) 116, 160, var9, var8);
                this.method2253((byte) 95, 2, var9, var8 - 1);
                this.method2253((byte) 127, 8, var9 - 1, var8);
            }
        }
        if (arg4) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    this.method2253((byte) 115, 65536, var9, var8);
                    this.method2253((byte) 92, 4096, var9 - 1, var8);
                }
                if (arg0 == 1) {
                    this.method2253((byte) 93, 1024, var9, var8);
                    this.method2253((byte) 122, 16384, var9, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method2253((byte) 123, 4096, var9, var8);
                    this.method2253((byte) 104, 65536, var9 + 1, var8);
                }
                if (arg0 == 3) {
                    this.method2253((byte) 127, 16384, var9, var8);
                    this.method2253((byte) 94, 1024, var9, var8 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg0 == 0) {
                    this.method2253((byte) 122, 512, var9, var8);
                    this.method2253((byte) 99, 8192, var9 - 1, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method2253((byte) 98, 2048, var9, var8);
                    this.method2253((byte) 124, 32768, var9 + 1, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method2253((byte) 94, 8192, var9, var8);
                    this.method2253((byte) 96, 512, var9 + 1, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method2253((byte) 100, 32768, var9, var8);
                    this.method2253((byte) 113, 2048, var9 - 1, var8 + -1);
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    this.method2253((byte) 116, 66560, var9, var8);
                    this.method2253((byte) 94, 4096, var9 - 1, var8);
                    this.method2253((byte) 103, 16384, var9, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method2253((byte) 106, 5120, var9, var8);
                    this.method2253((byte) 120, 16384, var9, var8 + 1);
                    this.method2253((byte) 121, 65536, var9 + 1, var8);
                }
                if (arg0 == 2) {
                    this.method2253((byte) 108, 20480, var9, var8);
                    this.method2253((byte) 99, 65536, var9 + 1, var8);
                    this.method2253((byte) 119, 1024, var9, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method2253((byte) 121, 81920, var9, var8);
                    this.method2253((byte) 110, 1024, var9, var8 - 1);
                    this.method2253((byte) 125, 4096, var9 - 1, var8);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method2253((byte) 118, 536870912, var9, var8);
                this.method2253((byte) 124, 33554432, var9 - 1, var8);
            }
            if (arg0 == 1) {
                this.method2253((byte) 119, 8388608, var9, var8);
                this.method2253((byte) 126, 134217728, var9, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2253((byte) 102, 33554432, var9, var8);
                this.method2253((byte) 106, 536870912, var9 + 1, var8);
            }
            if (arg0 == 3) {
                this.method2253((byte) 98, 134217728, var9, var8);
                this.method2253((byte) 127, 8388608, var9, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method2253((byte) 111, 4194304, var9, var8);
                this.method2253((byte) 115, 67108864, var9 - 1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method2253((byte) 98, 16777216, var9, var8);
                this.method2253((byte) 120, 268435456, var9 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2253((byte) 106, 67108864, var9, var8);
                this.method2253((byte) 118, 4194304, var9 + 1, var8 + -1);
            }
            if (arg0 == 3) {
                this.method2253((byte) 100, 268435456, var9, var8);
                this.method2253((byte) 95, 16777216, var9 - 1, var8 + -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2253((byte) 125, 545259520, var9, var8);
            this.method2253((byte) 97, 33554432, var9 - 1, var8);
            this.method2253((byte) 124, 134217728, var9, var8 + 1);
        }
        if (arg0 == 1) {
            this.method2253((byte) 97, 41943040, var9, var8);
            this.method2253((byte) 109, 134217728, var9, var8 + 1);
            this.method2253((byte) 104, 536870912, var9 + 1, var8);
        }
        if (arg0 == 2) {
            this.method2253((byte) 92, 167772160, var9, var8);
            this.method2253((byte) 122, 536870912, var9 + 1, var8);
            this.method2253((byte) 95, 8388608, var9, var8 - 1);
        }
        if (arg0 == 3) {
            this.method2253((byte) 97, 671088640, var9, var8);
            this.method2253((byte) 112, 8388608, var9, var8 - 1);
            this.method2253((byte) 103, 33554432, var9 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIZZIIZ)V")
    public final void method2256(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg4 - this.field5452;
        int var9 = arg0 - this.field5456;
        field5459++;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method2248(var8, var9, -3, 128);
                this.method2248(var8 - 1, var9, -3, 8);
            }
            if (arg5 == 1) {
                this.method2248(var8, var9, -3, 2);
                this.method2248(var8, var9 + 1, -3, 32);
            }
            if (arg5 == 2) {
                this.method2248(var8, var9, -3, 8);
                this.method2248(var8 + 1, var9, -3, 128);
            }
            if (arg5 == 3) {
                this.method2248(var8, var9, -3, 32);
                this.method2248(var8, var9 - 1, -3, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method2248(var8, var9, -3, 1);
                this.method2248(var8 - 1, var9 + 1, -3, 16);
            }
            if (arg5 == 1) {
                this.method2248(var8, var9, -3, 4);
                this.method2248(var8 + 1, var9 + 1, -3, 64);
            }
            if (arg5 == 2) {
                this.method2248(var8, var9, -3, 16);
                this.method2248(var8 + 1, var9 + -1, -3, 1);
            }
            if (arg5 == 3) {
                this.method2248(var8, var9, -3, 64);
                this.method2248(var8 - 1, var9 + -1, -3, 4);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method2248(var8, var9, -3, 130);
                this.method2248(var8 - 1, var9, -3, 8);
                this.method2248(var8, var9 + 1, -3, 32);
            }
            if (arg5 == 1) {
                this.method2248(var8, var9, -3, 10);
                this.method2248(var8, var9 + 1, -3, 32);
                this.method2248(var8 + 1, var9, -3, 128);
            }
            if (arg5 == 2) {
                this.method2248(var8, var9, -3, 40);
                this.method2248(var8 + 1, var9, -3, 128);
                this.method2248(var8, var9 - 1, -3, 2);
            }
            if (arg5 == 3) {
                this.method2248(var8, var9, -3, 160);
                this.method2248(var8, var9 - 1, -3, 2);
                this.method2248(var8 - 1, var9, -3, 8);
            }
        }
        if (arg3) {
            method2250();
        }
        if (arg6) {
            if (arg1 == 0) {
                if (arg5 == 0) {
                    this.method2248(var8, var9, -3, 65536);
                    this.method2248(var8 - 1, var9, -3, 4096);
                }
                if (arg5 == 1) {
                    this.method2248(var8, var9, -3, 1024);
                    this.method2248(var8, var9 + 1, -3, 16384);
                }
                if (arg5 == 2) {
                    this.method2248(var8, var9, -3, 4096);
                    this.method2248(var8 + 1, var9, -3, 65536);
                }
                if (arg5 == 3) {
                    this.method2248(var8, var9, -3, 16384);
                    this.method2248(var8, var9 - 1, -3, 1024);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg5 == 0) {
                    this.method2248(var8, var9, -3, 512);
                    this.method2248(var8 - 1, var9 + 1, -3, 8192);
                }
                if (arg5 == 1) {
                    this.method2248(var8, var9, -3, 2048);
                    this.method2248(var8 + 1, var9 + 1, -3, 32768);
                }
                if (arg5 == 2) {
                    this.method2248(var8, var9, -3, 8192);
                    this.method2248(var8 + 1, var9 + -1, -3, 512);
                }
                if (arg5 == 3) {
                    this.method2248(var8, var9, -3, 32768);
                    this.method2248(var8 - 1, var9 + -1, -3, 2048);
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    this.method2248(var8, var9, -3, 66560);
                    this.method2248(var8 - 1, var9, -3, 4096);
                    this.method2248(var8, var9 + 1, -3, 16384);
                }
                if (arg5 == 1) {
                    this.method2248(var8, var9, -3, 5120);
                    this.method2248(var8, var9 + 1, -3, 16384);
                    this.method2248(var8 + 1, var9, -3, 65536);
                }
                if (arg5 == 2) {
                    this.method2248(var8, var9, -3, 20480);
                    this.method2248(var8 + 1, var9, -3, 65536);
                    this.method2248(var8, var9 - 1, -3, 1024);
                }
                if (arg5 == 3) {
                    this.method2248(var8, var9, -3, 81920);
                    this.method2248(var8, var9 - 1, -3, 1024);
                    this.method2248(var8 - 1, var9, -3, 4096);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method2248(var8, var9, -3, 536870912);
                this.method2248(var8 - 1, var9, -3, 33554432);
            }
            if (arg5 == 1) {
                this.method2248(var8, var9, -3, 8388608);
                this.method2248(var8, var9 + 1, -3, 134217728);
            }
            if (arg5 == 2) {
                this.method2248(var8, var9, -3, 33554432);
                this.method2248(var8 + 1, var9, -3, 536870912);
            }
            if (arg5 == 3) {
                this.method2248(var8, var9, -3, 134217728);
                this.method2248(var8, var9 - 1, -3, 8388608);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method2248(var8, var9, -3, 4194304);
                this.method2248(var8 - 1, var9 - -1, -3, 67108864);
            }
            if (arg5 == 1) {
                this.method2248(var8, var9, -3, 16777216);
                this.method2248(var8 + 1, var9 + 1, -3, 268435456);
            }
            if (arg5 == 2) {
                this.method2248(var8, var9, -3, 67108864);
                this.method2248(var8 + 1, var9 + -1, -3, 4194304);
            }
            if (arg5 == 3) {
                this.method2248(var8, var9, -3, 268435456);
                this.method2248(var8 - 1, var9 + -1, -3, 16777216);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method2248(var8, var9, -3, 545259520);
            this.method2248(var8 - 1, var9, -3, 33554432);
            this.method2248(var8, var9 + 1, -3, 134217728);
        }
        if (arg5 == 1) {
            this.method2248(var8, var9, -3, 41943040);
            this.method2248(var8, var9 + 1, -3, 134217728);
            this.method2248(var8 + 1, var9, -3, 536870912);
        }
        if (arg5 == 2) {
            this.method2248(var8, var9, -3, 167772160);
            this.method2248(var8 + 1, var9, -3, 536870912);
            this.method2248(var8, var9 - 1, -3, 8388608);
        }
        if (arg5 == 3) {
            this.method2248(var8, var9, -3, 671088640);
            this.method2248(var8, var9 - 1, -3, 8388608);
            this.method2248(var8 - 1, var9, -3, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public final void method2257(int arg0) {
        field5466++;
        if (arg0 != 9116) {
            this.field5456 = -21;
        }
        for (int var2 = 0; var2 < this.field5472; var2++) {
            for (int var3 = 0; var3 < this.field5454; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field5472 - 5) <= var2 || var3 >= this.field5454 - 5) {
                    this.field5455[var2][var3] = -1;
                } else {
                    this.field5455[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)V")
    public final void method2258(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field5452;
        int var5 = arg1 - this.field5456;
        field5470++;
        this.field5455[var4][var5] = class276.method1712(this.field5455[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method2259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5469++;
        if (arg4 == 1) {
            if (arg3 == arg5 && arg0 == arg7) {
                return true;
            }
        } else if (arg3 >= arg5 && arg3 <= arg4 + arg5 - 1 && arg0 <= arg0 && (arg0 + arg4 - 1) >= arg0) {
            return true;
        }
        if (arg6 != 0) {
            return false;
        }
        int var9 = arg5 - this.field5452;
        int var10 = arg0 - this.field5456;
        int var11 = arg3 - this.field5452;
        int var12 = arg7 - this.field5456;
        if (arg4 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field5455[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field5455[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field5455[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field5455[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field5455[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field5455[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field5455[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field5455[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field5455[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field5455[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field5455[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field5455[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 - (1 - arg4);
            int var14 = arg4 + var12 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var11 + 1 == var9 && var12 <= var10 && var10 <= var14 && (this.field5455[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 - arg4 == var12 && (this.field5455[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - arg4 == var9 && var10 >= var12 && var14 >= var10 && (this.field5455[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 - arg4) == var12 && (this.field5455[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 - arg4) == var9 && var10 >= var12 && var10 <= var14 && (this.field5455[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var10 + 1 == var12 && (this.field5455[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var11 + 1) == var9 && var10 >= var12 && var10 <= var14 && (this.field5455[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 + 1 == var12 && (this.field5455[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var11 >= var9 && var13 >= var11 && (var10 + 1) == var12 && (this.field5455[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var9 && var11 <= var13 && (var10 - arg4) == var12 && (this.field5455[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg4) == var9 && var10 >= var12 && var10 <= var14 && (this.field5455[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 >= var12 && var10 <= var14 && (this.field5455[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public static void method2260(int arg0) {
        field5471 = null;
        field5461 = null;
        field5473 = null;
        field5477 = null;
        field5460 = null;
        field5478 = null;
        if (arg0 != -27960) {
            method2250();
        }
        field5475 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZIIIZI)V")
    public final void method2261(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field5476++;
        int var8 = 256;
        if (arg1) {
            var8 |= 0x20000;
        }
        int var9 = arg6 - this.field5456;
        int var10 = arg4 - this.field5452;
        int var11 = -92 % ((arg2 + 34) / 56);
        if (arg5) {
            var8 |= 0x40000000;
        }
        for (int var12 = var10; var12 < (arg3 + var10); var12++) {
            if (var12 >= 0 && var12 < this.field5472) {
                for (int var13 = var9; var13 < (arg0 + var9); var13++) {
                    if (var13 >= 0 && this.field5454 > var13) {
                        this.method2253((byte) 96, var8, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BII)Lek;")
    public static final class375 method2262(byte arg0, int arg1, int arg2) {
        field5458++;
        class375 var3 = new class375();
        var3.field5472 = arg2 + 1 + 5;
        var3.field5456 = -1;
        var3.field5452 = -1;
        var3.field5454 = arg1 + 1 + 5;
        var3.field5455 = new int[var3.field5472][var3.field5454];
        if (arg0 != -33) {
            field5473 = null;
        }
        var3.method2257(arg0 + 9149);
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    private class375() {
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(III)V")
    public final void method2263(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field5452;
        int var5 = arg1 - this.field5456;
        if (arg2 != 21310) {
            this.method2249(40, (byte) 69, -21);
        }
        field5453++;
        this.field5455[var4][var5] = class406.method2552(this.field5455[var4][var5], -262145);
    }

    static {
        new class151(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field5477 = new class425(13, 7);
        field5478 = new class452(91, 7);
    }
}
