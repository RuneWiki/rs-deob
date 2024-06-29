import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class100 {

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Lsl;")
    private class18 field1681 = new class18();

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Llc;")
    private class86 field1686 = new class86();

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    private int field1690;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "Luc;")
    private class39 field1687;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "Z")
    public static boolean field1672 = false;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "[I")
    public static int[] field1689 = new int[1000];

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "[I")
    public static int[] field1675;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(JB)Lsl;")
    public final class18 method728(long arg0, byte arg1) {
        if (arg1 > -44) {
            return null;
        }
        class18 var4 = (class18) this.field1687.method285(arg0, 13821);
        field1682++;
        if (var4 != null) {
            this.field1686.method604(var4, -105);
        }
        return var4;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)I")
    private static final int method729(int arg0, int arg1, int arg2, int arg3) {
        field1676++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        }
        if (arg0 != 0) {
            method732((byte[]) null, 61, 0, -102, 74, -112, 75, 15, false, 32, (class47[]) null);
        }
        if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method730(int arg0, String[] arg1) {
        field1678++;
        String[] var2 = new String[5];
        for (int var3 = arg0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Lek;")
    public final class166 method731(byte arg0) {
        field1680++;
        if (arg0 > -121) {
            this.field1681 = null;
        }
        return this.field1687.method287(-123);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([BIIIIIIIZI[Lrh;)[I")
    public static final int[] method732(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, class47[] arg10) {
        field1683++;
        int var11 = (arg4 & 0x7) * 8;
        int var12 = -83 / ((arg6 - 1) / 55);
        int var13 = (arg3 & 0x7) * 8;
        byte var14;
        if (arg8) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        if (!arg8) {
            for (int var15 = 0; var15 < 8; var15++) {
                for (int var16 = 0; var16 < 8; var16++) {
                    int var17 = class192.method1294((byte) -127, var16 & 0x7, arg9, var15 & 0x7) + arg7;
                    int var18 = arg5 + method729(0, arg9, var15 & 0x7, var16 & 0x7);
                    if (var17 > 0 && var17 < 103 && var18 > 0 && var18 < 103) {
                        arg10[arg2].field673[var17][var18] = class55.method420(arg10[arg2].field673[var17][var18], -2097153);
                    }
                }
            }
        }
        class88 var19 = new class88(arg0);
        int var20 = arg3 & 0x1FFFFFF8 << 3;
        int var21 = arg4 & 0x1FFFFFF8 << 3;
        for (int var22 = 0; var22 < var14; var22++) {
            for (int var43 = 0; var43 < 64; var43++) {
                for (int var44 = 0; var44 < 64; var44++) {
                    if (arg1 != var22 || var43 < var13 || var43 > (var13 + 8) || var44 < var11 || var11 + 8 < var44) {
                        class186.method1255(0, arg8, -108, 0, -1, -1, 0, false, 0, var19);
                    } else if ((var13 + 8) == var43 || var11 + 8 == var44) {
                        int var51;
                        int var52;
                        if (arg9 == 0) {
                            var51 = var44 + arg5 - var11;
                            var52 = arg7 + var43 - var13;
                        } else if (arg9 == 1) {
                            var52 = arg7 - (var11 - var44);
                            var51 = arg5 + var13 + 8 - var43;
                        } else if (arg9 == 2) {
                            var51 = arg5 + var11 + 8 - var44;
                            var52 = var13 + arg7 + 8 - var43;
                        } else {
                            var51 = var43 + arg5 - var13;
                            var52 = var11 + arg7 + 8 - var44;
                        }
                        class186.method1255(0, arg8, -124, var21 + var44, var51, var52, var20 + var43, true, arg2, var19);
                    } else {
                        int var45 = arg7 + class192.method1294((byte) -127, var44 & 0x7, arg9, var43 & 0x7);
                        int var46 = arg5 + method729(0, arg9, var43 & 0x7, var44 & 0x7);
                        class186.method1255(arg9, arg8, -104, var21 + var44, var46, var45, var20 + var43, false, arg2, var19);
                        if (var43 == 63 || var44 == 63) {
                            int var47 = var43 == 63 ? 64 : var43;
                            int var48 = var44 == 63 ? 64 : var44;
                            int var49;
                            int var50;
                            if (arg9 == 0) {
                                var49 = arg5 - (var11 - var48);
                                var50 = arg7 + var47 - var13;
                            } else if (arg9 == 1) {
                                var49 = arg5 + 8 - (var47 - var13);
                                var50 = arg7 - (var11 - var48);
                            } else if (arg9 == 2) {
                                var50 = arg7 + 8 - (var47 - var13);
                                var49 = var11 + arg5 + 8 - var48;
                            } else {
                                var50 = var11 + arg7 + 8 - var48;
                                var49 = arg5 - (var13 - var47);
                            }
                            if (var50 >= 0 && var50 < 104 && var49 >= 0 && var49 < 104) {
                                class66.field1107[var22][var50][var49] = class66.field1107[var22][var45][var46];
                            }
                        }
                    }
                }
            }
        }
        boolean var23 = false;
        while (var19.field1471.length > var19.field1535) {
            int var24 = var19.method633(53);
            if (var24 == 128) {
                var23 = true;
                class264.field4193[0] = var19.method645(11596);
                class264.field4193[1] = var19.method649(-2);
                class264.field4193[2] = var19.method649(-2);
                class264.field4193[3] = var19.method649(-2);
                class264.field4193[4] = var19.method645(11596);
            } else {
                if (var24 != 129) {
                    var19.field1535--;
                    break;
                }
                for (int var25 = 0; var25 < 4; var25++) {
                    byte var26 = var19.method656(-252);
                    if (var26 == 0) {
                        if (var25 <= arg1) {
                            int var34 = arg7;
                            int var35 = arg5 + 7;
                            int var36 = arg7 + 7;
                            if (var36 < 0) {
                                var36 = 0;
                            } else if (var36 >= 104) {
                                var36 = 104;
                            }
                            if (var35 < 0) {
                                var35 = 0;
                            } else if (var35 >= 104) {
                                var35 = 104;
                            }
                            if (arg7 < 0) {
                                var34 = 0;
                            } else if (arg7 >= 104) {
                                var34 = 104;
                            }
                            int var37 = arg5;
                            if (arg5 < 0) {
                                var37 = 0;
                            } else if (arg5 >= 104) {
                                var37 = 104;
                            }
                            while (var34 < var36) {
                                while (var35 > var37) {
                                    class160.field2502[arg2][var34][var37] = 0;
                                    var37++;
                                }
                                var34++;
                            }
                        }
                    } else if (var26 == 1) {
                        for (int var27 = 0; var27 < 64; var27 += 4) {
                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                byte var29 = var19.method656(-252);
                                if (arg1 >= var25) {
                                    for (int var30 = var27; var30 < var27 + 4; var30++) {
                                        for (int var31 = var28; var31 < var28 + 4; var31++) {
                                            if (var30 >= var13 && var30 < var13 + 8 && var31 >= var11 && var11 + 8 > var11) {
                                                int var32 = arg7 + class192.method1294((byte) -128, var31 & 0x7, arg9, var30 & 0x7);
                                                int var33 = method729(0, arg9, var30 & 0x7, var31 & 0x7) + arg5;
                                                if (var32 >= 0 && var32 < 104 && var33 >= 0 && var33 < 104) {
                                                    class160.field2502[arg2][var32][var33] = var29;
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
        boolean var38 = false;
        if (!var38) {
            int var39 = arg5 + 7;
            int var40 = arg7 + 7;
            for (int var41 = arg7; var41 < var40; var41++) {
                for (int var42 = arg5; var42 < var39; var42++) {
                    class160.field2502[arg2][var41][var42] = 0;
                }
            }
        }
        if (var23) {
            return class264.field4193;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static final void method733(int arg0) {
        field1674++;
        class126.field1986 = null;
        class186.method1256(23419, 0, class29.field409, -1, 0, 0, 0, class79.field1310, class75.field1236);
        if (arg0 != -10890) {
            field1673 = -63;
        }
        if (class126.field1986 != null) {
            class185.method1250(class126.field1986, class78.field1293.field3617, -1412584499, class79.field1310, 0, class39.field564, 0, class28.field394, (byte) 51, class29.field409);
            class126.field1986 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static final void method734(int arg0) {
        if (arg0 > 75) {
            class244.field3971.method1898((byte) -5);
            field1688++;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
    public static void method735(byte arg0) {
        field1689 = null;
        field1675 = null;
        int var1 = -122 / ((-arg0 - 28) / 39);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)Lek;")
    public final class166 method736(boolean arg0) {
        if (!arg0) {
            method732((byte[]) null, 71, 37, -56, 117, -94, -68, -110, false, -9, (class47[]) null);
        }
        field1679++;
        return this.field1687.method291((byte) -116);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(JILsl;)V")
    public final void method737(long arg0, int arg1, class18 arg2) {
        if (this.field1690 == arg1) {
            class18 var5 = this.field1686.method605(arg1);
            var5.method1123(0);
            var5.method174(31388);
            if (this.field1681 == var5) {
                class18 var6 = this.field1686.method605(0);
                var6.method1123(0);
                var6.method174(31388);
            }
        } else {
            this.field1690--;
        }
        field1677++;
        this.field1687.method281(1, arg0, arg2);
        this.field1686.method604(arg2, arg1 ^ 0xFFFFFF97);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)V")
    public final void method738(byte arg0) {
        field1684++;
        this.field1686.method603((byte) 111);
        this.field1687.method290(-7981);
        this.field1681 = new class18();
        if (arg0 < -121) {
            this.field1690 = this.field1685;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V")
    public class100(int arg0) {
        this.field1690 = arg0;
        this.field1685 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1687 = new class39(var2);
    }
}
