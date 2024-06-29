import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class183 extends class36 {

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    private int field3020;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    private int field3018;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    private int field3015;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field3022 = 0;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "[I")
    public static int[] field3024 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "[I")
    public static int[] field3013;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBIII)V")
    public static final void method1277(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class194 var5 = (class194) class139.field2322.method1063((byte) -109, (long) arg2);
        ++field3012;
        if (var5 == null) {
            var5 = new class194();
            class139.field2322.method1064(var5, (long) arg2, (byte) -125);
        }
        if (~var5.field3179.length >= ~arg4) {
            int[] var6 = new int[arg4 - -1];
            int[] var7 = new int[arg4 - -1];
            for (int var8 = 0; ~var5.field3179.length < ~var8; ++var8) {
                var6[var8] = var5.field3179[var8];
                var7[var8] = var5.field3173[var8];
            }
            for (int var9 = var5.field3179.length; arg4 > var9; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3179 = var6;
            var5.field3173 = var7;
        }
        var5.field3179[arg4] = arg0;
        var5.field3173[arg4] = arg3;
        if (arg1 != -46) {
            method1282('\u0012', 62, (String) null);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)I")
    public static final int method1278(String arg0, byte arg1, String arg2, int arg3) {
        int var4 = arg0.length();
        int var5 = arg2.length();
        char var6 = 0;
        ++field3026;
        int var7 = 0;
        char var8 = 0;
        int var9 = 0;
        while (~(-var6 + var9) > ~var4 || ~var5 < ~(-var8 + var7)) {
            if (~(var9 - var6) <= ~var4) {
                return -1;
            }
            if (-var8 + var7 >= var5) {
                return 1;
            }
            char var22;
            if (var6 != 0) {
                var22 = var6;
                boolean var23 = false;
            } else {
                var22 = arg0.charAt(var9++);
            }
            char var24;
            if (~var8 == -1) {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var8;
                boolean var25 = false;
            }
            var6 = class241.method1588(false, var22);
            var8 = class241.method1588(false, var24);
            char var26 = class87.method682(arg3, var22, true);
            char var27 = class87.method682(arg3, var24, true);
            if (~var26 != ~var27 && ~Character.toUpperCase(var26) != ~Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (~var28 != ~var29) {
                    return class252.method1678(var28, arg3, (byte) 71) + -class252.method1678(var29, arg3, (byte) 71);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var10 > var11; ++var11) {
            int var16;
            int var17;
            if (~arg3 == -3) {
                var16 = var4 + -1 + -var11;
                var17 = var5 - 1 + -var11;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg0.charAt(var16);
            char var19 = arg2.charAt(var17);
            if (var18 != var19 && ~Character.toUpperCase(var18) != ~Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class252.method1678(var20, arg3, (byte) 71) + -class252.method1678(var21, arg3, (byte) 71);
                }
            }
        }
        if (arg1 >= -54) {
            method1283(-74);
        }
        int var12 = -var5 + var4;
        if (var12 != 0) {
            return var12;
        } else {
            for (int var13 = 0; ~var10 < ~var13; ++var13) {
                char var14 = arg0.charAt(var13);
                char var15 = arg2.charAt(var13);
                if (~var14 != ~var15) {
                    return class252.method1678(var14, arg3, (byte) 71) - class252.method1678(var15, arg3, (byte) 71);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB)V")
    public final void method309(int arg0, int arg1, byte arg2) {
        if (arg2 != -17) {
            this.method310(-41, -84, (byte) -42);
        }
        ++field3025;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1279(byte arg0, String arg1) throws ClassNotFoundException {
        ++field3019;
        if (arg0 >= -67) {
            method1278((String) null, (byte) -58, (String) null, 56);
        }
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method1280(boolean arg0) {
        field3013 = null;
        field3024 = null;
        if (!arg0) {
            field3022 = -111;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Laj;IIIIIIZ)V")
    public static final void method1281(class117 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1981.length;
        for (int var9 = 0; var9 < var8; ++var9) {
            int var22 = arg0.field1981[var9] - class282.field4477;
            int var23 = arg0.field1978[var9] - class89.field1421;
            int var24 = arg0.field1975[var9] - class271.field4346;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field1964 != null) {
                class117.field1967[var9] = var25;
                class117.field1973[var9] = var28;
                class117.field1960[var9] = var29;
            }
            class117.field1972[var9] = (var25 << 9) / var29 + class95.field1479;
            class117.field1963[var9] = (var28 << 9) / var29 + class95.field1478;
        }
        class95.field1489 = 0;
        int var10 = arg0.field1969.length;
        for (int var11 = 0; var11 < var10; ++var11) {
            int var12 = arg0.field1969[var11];
            int var13 = arg0.field1977[var11];
            int var14 = arg0.field1965[var11];
            int var15 = class117.field1972[var12];
            int var16 = class117.field1972[var13];
            int var17 = class117.field1972[var14];
            int var18 = class117.field1963[var12];
            int var19 = class117.field1963[var13];
            int var20 = class117.field1963[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class285.field4537 && class22.method176(class95.field1479 + class211.field3382, class95.field1478 + class114.field1748, var18, var19, var20, var15, var16, var17)) {
                    class279.field4421 = arg5;
                    class287.field4586 = arg6;
                }
                if (!arg7) {
                    class95.field1476 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class95.field1480 || var16 > class95.field1480 || var17 > class95.field1480) {
                        class95.field1476 = true;
                    }
                    if (arg0.field1964 != null && arg0.field1964[var11] != -1) {
                        if (class150.field2463) {
                            if (arg0.field1970) {
                                class95.method723(var18, var19, var20, var15, var16, var17, arg0.field1974[var11], arg0.field1979[var11], arg0.field1961[var11], class117.field1967[0], class117.field1967[1], class117.field1967[3], class117.field1973[0], class117.field1973[1], class117.field1973[3], class117.field1960[0], class117.field1960[1], class117.field1960[3], arg0.field1964[var11]);
                            } else {
                                class95.method723(var18, var19, var20, var15, var16, var17, arg0.field1974[var11], arg0.field1979[var11], arg0.field1961[var11], class117.field1967[var12], class117.field1967[var13], class117.field1967[var14], class117.field1973[var12], class117.field1973[var13], class117.field1973[var14], class117.field1960[var12], class117.field1960[var13], class117.field1960[var14], arg0.field1964[var11]);
                            }
                        } else {
                            int var21 = class95.field1483.method1612(-100, arg0.field1964[var11]);
                            class95.method728(var18, var19, var20, var15, var16, var17, class52.method436(var21, arg0.field1974[var11]), class52.method436(var21, arg0.field1979[var11]), class52.method436(var21, arg0.field1961[var11]));
                        }
                    } else if (arg0.field1974[var11] != 12345678) {
                        class95.method728(var18, var19, var20, var15, var16, var17, arg0.field1974[var11], arg0.field1979[var11], arg0.field1961[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1282(char arg0, int arg1, String arg2) {
        ++field3021;
        int var3 = class235.method1561(arg0, arg2, (byte) 127);
        String[] var4 = new String[var3 - -1];
        int var5 = arg1;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; ++var7) {
            int var8;
            for (var8 = var6; ~arg2.charAt(var8) != ~arg0; ++var8) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIII)V")
    public class183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3020 = arg3;
        this.field3018 = arg2;
        this.field3015 = arg0;
        this.field3017 = arg1;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static final void method1283(int arg0) {
        ++field3011;
        int var1 = class11.field147 * 128 + 64;
        int var2 = class67.field1146 * 128 + 64;
        int var3 = class218.method1450(var2, var1, true, class92.field1448) - class171.field2845;
        if (class23.field364 < 100) {
            if (~var1 < ~class31.field527) {
                class31.field527 += (var1 - class31.field527) * class23.field364 / 1000 + class291.field4632;
                if (class31.field527 > var1) {
                    class31.field527 = var1;
                }
            }
            if (class148.field2434 < var2) {
                class148.field2434 += (-class148.field2434 + var2) * class23.field364 / 1000 + class291.field4632;
                if (~var2 > ~class148.field2434) {
                    class148.field2434 = var2;
                }
            }
            if (class150.field2457 < var3) {
                class150.field2457 += class291.field4632 - -((-class150.field2457 + var3) * class23.field364 / 1000);
                if (class150.field2457 > var3) {
                    class150.field2457 = var3;
                }
            }
            if (var2 < class148.field2434) {
                class148.field2434 -= class291.field4632 - -((-var2 + class148.field2434) * class23.field364 / 1000);
                if (~class148.field2434 > ~var2) {
                    class148.field2434 = var2;
                }
            }
            if (class150.field2457 > var3) {
                class150.field2457 -= (-var3 + class150.field2457) * class23.field364 / 1000 + class291.field4632;
                if (class150.field2457 < var3) {
                    class150.field2457 = var3;
                }
            }
            if (var1 < class31.field527) {
                class31.field527 -= (-var1 + class31.field527) * class23.field364 / 1000 + class291.field4632;
                if (~var1 < ~class31.field527) {
                    class31.field527 = var1;
                }
            }
        } else {
            class31.field527 = class11.field147 * 128 + 64;
            class148.field2434 = class67.field1146 * 128 + 64;
            class150.field2457 = class218.method1450(class148.field2434, class31.field527, true, class92.field1448) - class171.field2845;
        }
        int var4 = class76.field1240 * 128 + 64;
        int var5 = class141.field2345 * 128 + 64;
        int var6 = class218.method1450(var5, var4, true, class92.field1448) + -class186.field3053;
        int var7 = -class31.field527 + var4;
        int var8 = var5 - class148.field2434;
        int var9 = -class150.field2457 + var6;
        if (arg0 == 2059) {
            int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
            int var11 = (int) (325.949D * Math.atan2((double) var9, (double) var10)) & 2047;
            int var12 = 2047 & (int) (-325.949D * Math.atan2((double) var7, (double) var8));
            int var13 = -class212.field3400 + var12;
            if (var11 < 128) {
                var11 = 128;
            }
            if (var11 > 383) {
                var11 = 383;
            }
            if (var13 > 1024) {
                var13 -= 2048;
            }
            if (~class146.field2408 > ~var11) {
                class146.field2408 += (-class146.field2408 + var11) * class108.field1651 / 1000 + class260.field4131;
                if (class146.field2408 > var11) {
                    class146.field2408 = var11;
                }
            }
            if (~var13 > 1023) {
                var13 += 2048;
            }
            if (var13 > 0) {
                class212.field3400 += class108.field1651 * var13 / 1000 + class260.field4131;
                class212.field3400 &= 2047;
            }
            if (class146.field2408 > var11) {
                class146.field2408 -= (-var11 + class146.field2408) * class108.field1651 / 1000 + class260.field4131;
                if (var11 > class146.field2408) {
                    class146.field2408 = var11;
                }
            }
            if (var13 < 0) {
                class212.field3400 -= -var13 * class108.field1651 / 1000 + class260.field4131;
                class212.field3400 &= 2047;
            }
            int var14 = -class212.field3400 + var12;
            if (~var14 < -1025) {
                var14 -= 2048;
            }
            if (~var14 > 1023) {
                var14 += 2048;
            }
            if (~var14 > -1 && ~var13 < -1 || var14 > 0 && var13 < 0) {
                class212.field3400 = var12;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIB)V")
    public final void method310(int arg0, int arg1, byte arg2) {
        ++field3027;
        int var4 = this.field3015 * arg1 >> 12;
        int var5 = this.field3018 * arg1 >> 12;
        int var6 = this.field3017 * arg0 >> 12;
        int var7 = -64 / ((-65 - arg2) / 34);
        int var8 = this.field3020 * arg0 >> 12;
        class192.method1317(var6, var8, var5, super.field611, 3, var4);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
    public final void method307(int arg0, int arg1, int arg2) {
        ++field3014;
        if (arg0 != 0) {
            field3016 = -24;
        }
    }
}
