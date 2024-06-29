import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class214 extends class162 {

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Loh;")
    private static class263 field3799 = class253.method1681(-127, "shake:");

    @OriginalMember(owner = "client!re", name = "u", descriptor = "Loh;")
    public static class263 field3802 = null;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Loh;")
    public static class263 field3803 = field3799;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field3798 = 127;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "Loh;")
    public static class263 field3808 = field3799;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "[Ldd;")
    public static class130[] field3810 = new class130[0];

    @OriginalMember(owner = "client!re", name = "z", descriptor = "Lli;")
    public static class277 field3807 = new class277();

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "[[[B")
    public static byte[][][] field3812;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIILfa;IIILph;BZI)Lph;")
    public static final class76 method1450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class240 arg6, int arg7, int arg8, int arg9, class76 arg10, byte arg11, boolean arg12, int arg13) {
        field3804++;
        long var14 = ((long) arg8 << 48) + ((long) arg0 << 32) + (long) ((arg2 << 16) + (arg9 << 24) + arg4);
        class76 var16 = (class76) class108.field2038.method828(0, var14);
        if (var16 == null) {
            byte var17;
            if (arg4 == 1) {
                var17 = 9;
            } else if (arg4 == 2) {
                var17 = 12;
            } else if (arg4 == 3) {
                var17 = 15;
            } else if (arg4 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class242 var20 = new class242(var17 * var18 + 1, var17 * 2 * var18 + -var17, 0);
            int[][] var21 = new int[var18][var17];
            int var22 = var20.method1639(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg7 + (class270.field4769[var33] * var30) >> 16;
                    int var35 = class270.field4762[var33] * var31 + arg3 >> 16;
                    var21[var23][var32] = var20.method1639(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                short var27 = (short) (((arg0 & 0x7F) * var26 + (arg8 & 0x7F) * var25 & 0x7F00) + ((arg0 & 0x380) * var26 + (arg8 & 0x380) * var25 & 0x38000) + ((arg0 & 0xFC00) * var26 + (arg8 & 0xFC00) * var25 & 0xFC0000) >> 8);
                byte var28 = (byte) (arg2 * var26 + arg9 * var25 >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method1646(var22, var21[0][(var29 + 1) % var17], var21[0][var29], (byte) 1, var27, var28);
                    } else {
                        var20.method1646(var21[var24 - 1][var29], var21[var24 - 1][(var29 + 1) % var17], var21[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var20.method1646(var21[var24 - 1][var29], var21[var24][(var29 + 1) % var17], var21[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var20.method1621(64, 768, -50, -10, -50);
            class108.field2038.method826(var14, 9815, var16);
        }
        int var36 = arg4 * 64 - 1;
        int var37 = -var36;
        if (arg11 != 118) {
            return null;
        }
        int var38 = var36;
        int var39 = var36;
        int var40 = arg10.method509();
        int var41 = -var36;
        if (arg12) {
            if (arg13 > 640 && arg13 < 1408) {
                var39 = var36 + 128;
            }
            if (arg13 > 1664 || arg13 < 384) {
                var37 -= 128;
            }
            if (arg13 > 1152 && arg13 < 1920) {
                var38 = var36 + 128;
            }
            if (arg13 > 128 && arg13 < 896) {
                var41 -= 128;
            }
        }
        if (var41 > var40) {
            var40 = var41;
        }
        int var42 = arg10.method511();
        if (var42 > var38) {
            var42 = var38;
        }
        int var43 = arg10.method518();
        if (var43 < var37) {
            var43 = var37;
        }
        class1 var44 = null;
        int var45 = arg10.method503();
        if (var39 < var45) {
            var45 = var39;
        }
        if (arg6 != null) {
            int var46 = arg6.field4211[arg5];
            var44 = class32.method210((byte) -48, var46 >> 16);
            arg5 = var46 & 0xFFFF;
        }
        class76 var47;
        if (var44 == null) {
            var47 = var16.method510(true, true);
            var47.method504((var42 - var40) / 2, 128, (var45 - var43) / 2);
            var47.method513((var40 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method510(!var44.method6(arg5, arg11 - 119), true);
            var47.method504((var42 - var40) / 2, 128, (var45 - var43) / 2);
            var47.method513((var40 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method506(var44, arg5);
        }
        if (arg13 != 0) {
            var47.method521(arg13);
        }
        class167 var48 = (class167) var47;
        if (class120.method781(class12.field321, arg7 + var40, false, arg3 + var43) != arg1 || class120.method781(class12.field321, arg7 + var42, false, arg3 + var45) != arg1) {
            for (int var49 = 0; var49 < var48.field3033; var49++) {
                var48.field3054[var49] += class120.method781(class12.field321, var48.field3076[var49] + arg7, false, var48.field3032[var49] + arg3) - arg1;
            }
            var48.field3037 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILue;II)Lbb;")
    public static final class88 method1451(int arg0, class86 arg1, int arg2, int arg3) {
        if (arg2 == -13324) {
            field3806++;
            return class254.method1687(arg0, (byte) 52, arg1, arg3) ? class248.method1665(false) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method1452(int arg0) {
        if (arg0 > -71) {
            field3802 = null;
        }
        field3812 = null;
        field3807 = null;
        field3803 = null;
        field3799 = null;
        field3808 = null;
        field3802 = null;
        field3810 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1453(String arg0, int arg1) throws ClassNotFoundException {
        field3809++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else {
            int var2 = -70 % ((-arg1 - 81) / 36);
            if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ltj;B)V")
    public static final void method1454(class262 arg0, byte arg1) {
        field3800++;
        class206 var2 = null;
        try {
            class235 var3 = arg0.method1730(0, "runescape");
            while (var3.field4114 == 0) {
                class215.method1457(1L, (byte) 113);
            }
            if (var3.field4114 == 1) {
                var2 = (class206) var3.field4117;
                class194 var4 = class38.method244(-6939);
                var2.method1422(var4.field3497, var4.field3469, -12996, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1426(-10272);
            }
            if (arg1 >= -115) {
                method1451(-117, (class86) null, -108, -67);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIIBIIZI)Z")
    public static final boolean method1455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, boolean arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var32 = 0; var32 < 104; var32++) {
                class176.field3173[var12][var32] = 0;
                class178.field3266[var12][var32] = 99999999;
            }
        }
        class176.field3173[arg6][arg3] = 99;
        field3805++;
        class178.field3266[arg6][arg3] = 0;
        int var13 = arg3;
        int var14 = arg6;
        byte var15 = 0;
        class251.field4364[var15] = arg6;
        int var16 = 0;
        boolean var17 = false;
        int var33 = var15 + 1;
        class212.field3789[var15] = arg3;
        int[][] var18 = class103.field1954[class12.field321].field1527;
        while (var33 != var16) {
            var13 = class212.field3789[var16];
            var14 = class251.field4364[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg9 == var14 && arg4 == var13) {
                var17 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class103.field1954[class12.field321].method483(arg9, 2, var14, arg4, arg0, 65536, arg8 - 1, var13)) {
                    var17 = true;
                    break;
                }
                if (arg8 < 10 && class103.field1954[class12.field321].method485(var14, 2, arg9, arg8 - 1, arg0, arg4, -118, var13)) {
                    var17 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg5 != 0 && class103.field1954[class12.field321].method486(var13, 2, arg2, arg5, arg4, arg11, var14, arg9, (byte) 34)) {
                var17 = true;
                break;
            }
            int var31 = class178.field3266[var14][var13] + 1;
            if (var14 > 0 && class176.field3173[var14 - 1][var13] == 0 && (var18[var14 - 1][var13] & 0x12C010E) == 0 && (var18[var14 - 1][var13 + 1] & 0x12C0138) == 0) {
                class251.field4364[var33] = var14 - 1;
                class212.field3789[var33] = var13;
                var33 = var33 + 1 & 0xFFF;
                class176.field3173[var14 - 1][var13] = 2;
                class178.field3266[var14 - 1][var13] = var31;
            }
            if (var14 < 102 && class176.field3173[var14 + 1][var13] == 0 && (var18[var14 + 2][var13] & 0x12C0183) == 0 && (var18[var14 + 2][var13 + 1] & 0x12C01E0) == 0) {
                class251.field4364[var33] = var14 + 1;
                class212.field3789[var33] = var13;
                var33 = var33 + 1 & 0xFFF;
                class176.field3173[var14 + 1][var13] = 8;
                class178.field3266[var14 + 1][var13] = var31;
            }
            if (var13 > 0 && class176.field3173[var14][var13 - 1] == 0 && (var18[var14][var13 - 1] & 0x12C010E) == 0 && (var18[var14 + 1][var13 - 1] & 0x12C0183) == 0) {
                class251.field4364[var33] = var14;
                class212.field3789[var33] = var13 - 1;
                class176.field3173[var14][var13 - 1] = 1;
                class178.field3266[var14][var13 - 1] = var31;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var13 < 102 && class176.field3173[var14][var13 + 1] == 0 && (var18[var14][var13 + 2] & 0x12C0138) == 0 && (var18[var14 + 1][var13 + 2] & 0x12C01E0) == 0) {
                class251.field4364[var33] = var14;
                class212.field3789[var33] = var13 + 1;
                var33 = var33 + 1 & 0xFFF;
                class176.field3173[var14][var13 + 1] = 4;
                class178.field3266[var14][var13 + 1] = var31;
            }
            if (var14 > 0 && var13 > 0 && class176.field3173[var14 - 1][var13 - 1] == 0 && (var18[var14 - 1][var13] & 0x12C0138) == 0 && (var18[var14 - 1][var13 - 1] & 0x12C010E) == 0 && (var18[var14][var13 - 1] & 0x12C0183) == 0) {
                class251.field4364[var33] = var14 - 1;
                class212.field3789[var33] = var13 - 1;
                class176.field3173[var14 - 1][var13 - 1] = 3;
                var33 = var33 + 1 & 0xFFF;
                class178.field3266[var14 - 1][var13 - 1] = var31;
            }
            if (var14 < 102 && var13 > 0 && class176.field3173[var14 + 1][var13 - 1] == 0 && (var18[var14 + 1][var13 - 1] & 0x12C010E) == 0 && (var18[var14 + 2][var13 - 1] & 0x12C0183) == 0 && (var18[var14 + 2][var13] & 0x12C01E0) == 0) {
                class251.field4364[var33] = var14 + 1;
                class212.field3789[var33] = var13 - 1;
                var33 = var33 + 1 & 0xFFF;
                class176.field3173[var14 + 1][var13 - 1] = 9;
                class178.field3266[var14 + 1][var13 - 1] = var31;
            }
            if (var14 > 0 && var13 < 102 && class176.field3173[var14 - 1][var13 + 1] == 0 && (var18[var14 - 1][var13 + 1] & 0x12C010E) == 0 && (var18[var14 - 1][var13 + 2] & 0x12C0138) == 0 && (var18[var14][var13 + 2] & 0x12C01E0) == 0) {
                class251.field4364[var33] = var14 - 1;
                class212.field3789[var33] = var13 + 1;
                class176.field3173[var14 - 1][var13 + 1] = 6;
                var33 = var33 + 1 & 0xFFF;
                class178.field3266[var14 - 1][var13 + 1] = var31;
            }
            if (var14 < 102 && var13 < 102 && class176.field3173[var14 + 1][var13 + 1] == 0 && (var18[var14 + 1][var13 + 2] & 0x12C0138) == 0 && (var18[var14 + 2][var13 + 2] & 0x12C01E0) == 0 && (var18[var14 + 2][var13 + 1] & 0x12C0183) == 0) {
                class251.field4364[var33] = var14 + 1;
                class212.field3789[var33] = var13 + 1;
                class176.field3173[var14 + 1][var13 + 1] = 12;
                class178.field3266[var14 + 1][var13 + 1] = var31;
                var33 = var33 + 1 & 0xFFF;
            }
        }
        int var19 = -69 / ((63 - arg7) / 40);
        class209.field3774 = 0;
        if (!var17) {
            if (!arg10) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg9 - var22; var23 <= (arg9 + var22); var23++) {
                for (int var24 = arg4 - var22; var24 <= (arg4 + var22); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class178.field3266[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg9 > var23) {
                            var25 = arg9 - var23;
                        } else if ((arg2 + arg9 - 1) < var23) {
                            var25 = 1 - arg2 - (arg9 - var23);
                        }
                        int var26 = 0;
                        if (arg4 > var24) {
                            var26 = arg4 - var24;
                        } else if (var24 > (arg4 + arg5 - 1)) {
                            var26 = var24 - (arg4 - (1 - arg5));
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class178.field3266[var23][var24] < var21) {
                            var13 = var24;
                            var20 = var27;
                            var21 = class178.field3266[var23][var24];
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg6 == var14 && arg3 == var13) {
                return false;
            }
            class209.field3774 = 1;
        }
        byte var28 = 0;
        class251.field4364[var28] = var14;
        int var34 = var28 + 1;
        class212.field3789[var28] = var13;
        int var29;
        int var30 = var29 = class176.field3173[var14][var13];
        while (arg6 != var14 || arg3 != var13) {
            if (var29 != var30) {
                var29 = var30;
                class251.field4364[var34] = var14;
                class212.field3789[var34++] = var13;
            }
            if ((var30 & 0x1) != 0) {
                var13++;
            } else if ((var30 & 0x4) != 0) {
                var13--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class176.field3173[var14][var13];
        }
        if (var34 > 0) {
            class269.method1818(-93, var34, arg1);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
