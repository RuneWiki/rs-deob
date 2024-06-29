import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class115 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
    public static int[] field1652 = new int[5];

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Z")
    public static boolean field1653 = true;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Llm;")
    public static class150 field1657 = new class150(50);

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public int field1658;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "J")
    public long field1659;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Lsk;")
    public class202 field1651;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lsk;")
    public class202 field1654;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Lsk;")
    public class202 field1665;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "[Lee;")
    public static class74[] field1667;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z[B)V")
    public static final void method734(boolean arg0, byte[] arg1) {
        field1662++;
        class215 var2 = new class215(arg1);
        var2.field3280 = arg1.length - 2;
        class56.field784 = var2.method1379(-76);
        class252.field3945 = new byte[class56.field784][];
        class112.field1613 = new int[class56.field784];
        class180.field2728 = new boolean[class56.field784];
        class96.field1381 = new int[class56.field784];
        class134.field1847 = new byte[class56.field784][];
        class137.field1869 = new int[class56.field784];
        class275.field4376 = new int[class56.field784];
        var2.field3280 = arg1.length - (class56.field784 * 8) - 7;
        class242.field3805 = var2.method1379(-72);
        class70.field1021 = var2.method1379(-85);
        int var3 = (var2.method1374((byte) -60) & 0xFF) + 1;
        for (int var4 = 0; var4 < class56.field784; var4++) {
            class275.field4376[var4] = var2.method1379(-102);
        }
        for (int var5 = 0; var5 < class56.field784; var5++) {
            class96.field1381[var5] = var2.method1379(-111);
        }
        for (int var6 = 0; var6 < class56.field784; var6++) {
            class137.field1869[var6] = var2.method1379(-94);
        }
        for (int var7 = 0; var7 < class56.field784; var7++) {
            class112.field1613[var7] = var2.method1379(-103);
        }
        if (arg0) {
            method740(-25, (short[]) null, -52, (String[]) null, -60);
        }
        var2.field3280 = arg1.length - (var3 - 1) * 3 - (class56.field784 * 8) - 7;
        class298.field4748 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class298.field4748[var8] = var2.method1403(6591);
            if (class298.field4748[var8] == 0) {
                class298.field4748[var8] = 1;
            }
        }
        var2.field3280 = 0;
        for (int var9 = 0; var9 < class56.field784; var9++) {
            int var10 = class112.field1613[var9];
            int var11 = class137.field1869[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class134.field1847[var9] = var13;
            byte[] var14 = new byte[var12];
            class252.field3945[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method1374((byte) -60);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method1350((byte) -105);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var14[var23] = var2.method1350((byte) -126);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var11 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var11 <= var18) {
                                break label92;
                            }
                            for (int var19 = 0; var19 < var10; var19++) {
                                byte var20 = var14[var11 * var19 + var18] = var2.method1350((byte) 78);
                                var15 |= var20 != -1;
                            }
                            var18++;
                        }
                    }
                    for (int var21 = 0; var21 < var10; var21++) {
                        var13[var11 * var21 + var17] = var2.method1350((byte) -21);
                    }
                    var17++;
                }
            }
            class180.field2728[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public static void method735(boolean arg0) {
        field1667 = null;
        if (arg0) {
            field1652 = null;
        }
        field1657 = null;
        field1652 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLim;)Ljava/lang/String;")
    public static final String method736(byte arg0, class178 arg1) {
        field1663++;
        if (client.method2028(arg1).method1996(-11) == 0) {
            return null;
        } else if (arg0 != 34) {
            return null;
        } else if (arg1.field2685 == null || arg1.field2685.trim().length() == 0) {
            return class16.field288 ? "Hidden-use" : null;
        } else {
            return arg1.field2685;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILqj;ILqj;Z)I")
    public static final int method737(int arg0, class248 arg1, int arg2, class248 arg3, boolean arg4) {
        field1666++;
        if (arg2 == 1) {
            int var5 = arg1.field3931;
            int var6 = arg3.field3931;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg2 == 2) {
            return class39.method263(class129.field1799, (byte) 93, arg1.method1619((byte) -121).field3902, arg3.method1619((byte) -126).field3902);
        } else if (arg2 == 3) {
            if (arg3.field3881.equals("-")) {
                if (arg1.field3881.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field3881.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class39.method263(class129.field1799, (byte) 93, arg1.field3881, arg3.field3881);
            }
        } else if (arg2 == 4) {
            if (arg3.method1643(0)) {
                return arg1.method1643(arg0 ^ 0xFFFFB85D) ? 0 : 1;
            } else if (arg1.method1643(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg3.method1641(-86)) {
                return arg1.method1641(arg0 + 18233) ? 0 : 1;
            } else if (arg1.method1641(-29)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg3.method1637(118)) {
                return arg1.method1637(91) ? 0 : 1;
            } else if (arg1.method1637(127)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 != 7) {
            if (arg0 != -18339) {
                field1652 = null;
            }
            return arg3.field3878 - arg1.field3878;
        } else if (arg3.method1636((byte) 109)) {
            return arg1.method1636((byte) 119) ? 0 : 1;
        } else if (arg1.method1636((byte) 103)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static final void method738(int arg0) {
        field1655++;
        class151.field2094.method948((byte) 58);
        class9.field101.method948((byte) 58);
        if (arg0 != 1) {
            field1652 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class185 var7 = new class185();
        var7.field2803 = arg1 / 128;
        var7.field2799 = arg2 / 128;
        var7.field2798 = arg3 / 128;
        var7.field2810 = arg4 / 128;
        var7.field2806 = arg0;
        var7.field2801 = arg1;
        var7.field2797 = arg2;
        var7.field2811 = arg3;
        var7.field2816 = arg4;
        var7.field2817 = arg5;
        var7.field2804 = arg6;
        class288.field4590[class195.field2991++] = var7;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
    public static final void method740(int arg0, short[] arg1, int arg2, String[] arg3, int arg4) {
        if (arg4 < arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg4; var9 < arg2; var9++) {
                if (var7 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].compareTo(var7)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method740(0, arg1, var6 - 1, arg3, arg4);
            method740(0, arg1, arg2, arg3, var6 + 1);
        }
        field1660++;
        if (arg0 != 0) {
            method739(103, -116, 45, 95, 34, 27, 87);
        }
    }
}
