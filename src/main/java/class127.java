import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class127 extends class175 {

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "Ljava/lang/String;")
    private String field2132 = "null";

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2111 = "Hidden";

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "Lsj;")
    public static class48 field2122 = new class48();

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "[J")
    public static long[] field2124 = new long[32];

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "[I")
    public static int[] field2130 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    public static int field2131 = 0;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "[Z")
    public static boolean[] field2133 = new boolean[200];

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "S")
    public static short field2134 = 320;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "C")
    public char field2116;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "C")
    public char field2125;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    private int field2121;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "Ljj;")
    public static class134 field2123;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "Lgg;")
    public class61 field2112;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "Lgg;")
    private class61 field2129;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lhi;I)V")
    public final void method880(class264 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method1779(-99);
            if (var3 == 0) {
                field2119++;
                return;
            }
            this.method890(-7, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)Z")
    public final boolean method881(boolean arg0, int arg1) {
        if (!arg0) {
            return false;
        }
        field2110++;
        if (this.field2112 == null) {
            return false;
        }
        if (this.field2129 == null) {
            this.method892(1023);
        }
        class119 var3 = (class119) this.field2129.method457((long) arg1, (byte) -115);
        return var3 != null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)I")
    public final int method882(int arg0, byte arg1) {
        field2126++;
        if (arg1 <= 12) {
            field2133 = null;
        }
        if (this.field2112 == null) {
            return this.field2121;
        } else {
            class119 var3 = (class119) this.field2112.method457((long) arg0, (byte) -115);
            return var3 == null ? this.field2121 : var3.field2011;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method883(String arg0, byte arg1) {
        class236.field3762 = arg0;
        field2113++;
        if (class250.field4006.field4090 == null) {
            return;
        }
        try {
            int var2 = 51 % ((9 - arg1) / 61);
            String var3 = class250.field4006.field4090.getParameter("cookieprefix");
            String var4 = class250.field4006.field4090.getParameter("cookiehost");
            String var5 = var3 + "settings=" + arg0 + "; version=1; path=/; domain=" + var4;
            String var6;
            if (arg0.length() == 0) {
                var6 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var6 = var5 + "; Expires=" + class147.method1005(class182.method1253(20215) + 94608000000L, (byte) 53) + "; Max-Age=" + 94608000L;
            }
            class27.method185((byte) 71, "document.cookie=\"" + var6 + "\"", class250.field4006.field4090);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(Z)V")
    private final void method884(boolean arg0) {
        this.field2129 = new class61(this.field2112.method459(17822));
        field2114++;
        for (class196 var2 = (class196) this.field2112.method465((byte) -92); var2 != null; var2 = (class196) this.field2112.method461((byte) -13)) {
            class217 var3 = new class217(var2.field3164, (int) var2.field962);
            this.field2129.method466(class95.method672(0, var2.field3164), var3, (byte) 93);
        }
        if (!arg0) {
            field2134 = -126;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IB)Ljava/lang/String;")
    public final String method885(int arg0, byte arg1) {
        field2118++;
        if (arg1 < 124) {
            this.method892(-65);
        }
        if (this.field2112 == null) {
            return this.field2132;
        } else {
            class196 var3 = (class196) this.field2112.method457((long) arg0, (byte) -115);
            return var3 == null ? this.field2132 : var3.field3164;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)V")
    public static final void method886(int arg0, boolean arg1) {
        class160.field2609 = arg1;
        if (class160.field2609) {
            boolean var2 = class115.method822((byte) 78, class166.field2709.method1731(-79));
            int var3 = class166.field2709.method1730((byte) -117);
            int var4 = class166.field2709.method1786(1233508208);
            int var5 = class166.field2709.method1779(-59);
            class166.field2709.method1234(8);
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class166.field2709.method1239(105, 1);
                        if (var25 == 1) {
                            class140.field2298[var6][var23][var24] = class166.field2709.method1239(126, 26);
                        } else {
                            class140.field2298[var6][var23][var24] = -1;
                        }
                    }
                }
            }
            class166.field2709.method1241((byte) 0);
            int var7 = (class73.field1001 - class166.field2709.field4195) / 16;
            class39.field473 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var22 = 0; var22 < 4; var22++) {
                    class39.field473[var8][var22] = class166.field2709.method1765((byte) 95);
                }
            }
            int var9 = class166.field2709.method1777(-50);
            int var10 = class166.field2709.method1730((byte) -126);
            class81.field1122 = new byte[var7][];
            class221.field3527 = new int[var7];
            class67.field948 = new byte[var7][];
            class265.field4264 = null;
            class206.field3307 = null;
            class173.field2790 = new int[var7];
            class69.field958 = new int[var7];
            class116.field1981 = new int[var7];
            class216.field3471 = new int[var7];
            int var11 = 0;
            for (int var12 = 0; var12 < 4; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    for (int var14 = 0; var14 < 13; var14++) {
                        int var15 = class140.field2298[var12][var13][var14];
                        if (var15 != -1) {
                            int var16 = (var15 & 0x3FFB) >> 3;
                            int var17 = var15 >> 14 & 0x3FF;
                            int var18 = (var17 / 8 << 8) + var16 / 8;
                            for (int var19 = 0; var19 < var11; var19++) {
                                if (class69.field958[var19] == var18) {
                                    var18 = -1;
                                    break;
                                }
                            }
                            if (var18 != -1) {
                                class69.field958[var11] = var18;
                                int var20 = var18 & 0xFF;
                                int var21 = var18 >> 8 & 0xFF;
                                class216.field3471[var11] = class250.field4004.method947(-24925, "m" + var21 + "_" + var20);
                                class116.field1981[var11] = class250.field4004.method947(-24925, "l" + var21 + "_" + var20);
                                class221.field3527[var11] = class250.field4004.method947(-24925, "um" + var21 + "_" + var20);
                                class173.field2790[var11] = class250.field4004.method947(-24925, "ul" + var21 + "_" + var20);
                                var11++;
                            }
                        }
                    }
                }
            }
            class149.method1014((byte) 67, var5, var4, var9, var10, var3, var2, false);
        } else {
            int var26 = (class73.field1001 - class166.field2709.field4195) / 16;
            class39.field473 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var39 = 0; var39 < 4; var39++) {
                    class39.field473[var27][var39] = class166.field2709.method1784(74);
                }
            }
            boolean var28 = class115.method822((byte) 78, class166.field2709.method1731(-108));
            int var29 = class166.field2709.method1774(124);
            int var30 = class166.field2709.method1786(1233508208);
            boolean var31 = false;
            int var32 = class166.field2709.method1777(-64);
            int var33 = class166.field2709.method1749((byte) -111);
            int var34 = class166.field2709.method1786(1233508208);
            class69.field958 = new int[var26];
            class81.field1122 = new byte[var26][];
            class67.field948 = new byte[var26][];
            if ((var32 / 8 == 48 || var32 / 8 == 49) && (var34 / 8) == 48) {
                var31 = true;
            }
            class206.field3307 = null;
            class116.field1981 = new int[var26];
            if ((var32 / 8) == 48 && (var34 / 8) == 148) {
                var31 = true;
            }
            class265.field4264 = null;
            class221.field3527 = new int[var26];
            class173.field2790 = new int[var26];
            class216.field3471 = new int[var26];
            int var35 = 0;
            for (int var36 = (var32 - 6) / 8; var36 <= ((var32 + 6) / 8); var36++) {
                for (int var37 = (var34 - 6) / 8; var37 <= (var34 + 6) / 8; var37++) {
                    int var38 = (var36 << 8) + var37;
                    if (var31 && var37 == 49 || var37 == 149 || var37 == 147 || var36 == 50 || !(var36 != 49 || var37 != 47)) {
                        class69.field958[var35] = var38;
                        class216.field3471[var35] = -1;
                        class116.field1981[var35] = -1;
                        class221.field3527[var35] = -1;
                        class173.field2790[var35] = -1;
                    } else {
                        class69.field958[var35] = var38;
                        class216.field3471[var35] = class250.field4004.method947(-24925, "m" + var36 + "_" + var37);
                        class116.field1981[var35] = class250.field4004.method947(-24925, "l" + var36 + "_" + var37);
                        class221.field3527[var35] = class250.field4004.method947(-24925, "um" + var36 + "_" + var37);
                        class173.field2790[var35] = class250.field4004.method947(-24925, "ul" + var36 + "_" + var37);
                    }
                    var35++;
                }
            }
            class149.method1014((byte) 105, var29, var30, var33, var34, var32, var28, false);
        }
        if (arg0 >= -50) {
            method889(83);
        }
        field2109++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method887(int arg0, String arg1) {
        field2128++;
        if (this.field2112 == null) {
            return false;
        }
        if (this.field2129 == null) {
            this.method884(true);
        }
        if (arg0 < 21) {
            this.method880((class264) null, 1);
        }
        for (class217 var3 = (class217) this.field2129.method457(class95.method672(0, arg1), (byte) -115); var3 != null; var3 = (class217) this.field2129.method462(65)) {
            if (var3.field3477.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "(I)V")
    public static final void method888(int arg0) {
        class257.field4100.method1831(-98);
        field2120++;
        class198.field3191.method1831(-103);
        class193.field3100.method1831(-107);
        if (arg0 != 12634) {
            field2122 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "(I)V")
    public static void method889(int arg0) {
        field2124 = null;
        field2123 = null;
        field2133 = null;
        field2122 = null;
        field2130 = null;
        field2111 = null;
        if (arg0 < 80) {
            field2111 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILhi;)V")
    private final void method890(int arg0, int arg1, class264 arg2) {
        if (arg1 == 1) {
            this.field2116 = class234.method1543(arg2.method1767(16711680), true);
        } else if (arg1 == 2) {
            this.field2125 = class234.method1543(arg2.method1767(16711680), true);
        } else if (arg1 == 3) {
            this.field2132 = arg2.method1750((byte) -110);
        } else if (arg1 == 4) {
            this.field2121 = arg2.method1765((byte) 91);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method1777(-84);
            this.field2112 = new class61(class290.method1941(var4, arg0 - 1675860433));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1765((byte) 115);
                class69 var7;
                if (arg1 == 5) {
                    var7 = new class196(arg2.method1750((byte) 73));
                } else {
                    var7 = new class119(arg2.method1765((byte) 123));
                }
                this.field2112.method466((long) var6, var7, (byte) 93);
            }
        }
        field2127++;
        if (arg0 != -7) {
            this.method892(-37);
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public static final void method891(byte arg0) {
        field2115++;
        class178.field2880.method12(6);
        if (arg0 <= 64) {
            return;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class144.field2329[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            field2124[var2] = 0L;
        }
        class248.field3983 = 0;
    }

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "(I)V")
    private final void method892(int arg0) {
        this.field2129 = new class61(this.field2112.method459(17822));
        for (class119 var2 = (class119) this.field2112.method465((byte) -116); var2 != null; var2 = (class119) this.field2112.method461((byte) -13)) {
            class119 var3 = new class119((int) var2.field962);
            this.field2129.method466((long) var2.field2011, var3, (byte) 93);
        }
        if (arg0 != 1023) {
            field2124 = null;
        }
        field2117++;
    }
}
