import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class318 {

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public int field5068 = 0;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public int field5073 = 2048;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public int field5074 = 2048;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public int field5069 = 0;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5067 = "Close";

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 6)
    public static void method2246(int arg0) {
        if (arg0 != 11895) {
            field5070 = -118;
        }
        field5067 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 16)
    public static final void method2247(byte arg0) {
        field5063++;
        if (arg0 >= -41) {
            method2249((class29) null, -112, 62, true, 91, 61, 21, 9, -33);
        }
        int var1 = class24.field295.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class24.field295[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class65.field1162; var4++) {
                    if (class55.field906[var4] == class121.field2079[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class55.field906[class65.field1162] = class121.field2079[var2];
                    var3 = class65.field1162++;
                }
                class227 var5 = new class227(class24.field295[var2]);
                int var6 = 0;
                while (class24.field295[var2].length > var5.field3760 && var6 < 511 && class35.field508 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1765(true);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class121.field2079[var2] >> 8) * 64 + var10 - class93.field1562;
                    int var13 = (class121.field2079[var2] & 0xFF) * 64 + var11 - class275.field4546;
                    class121 var14 = class222.method1683(25, var5.method1765(true));
                    if (class165.field2621[var7] == null && (var14.field2055 & 0x1) > 0 && class344.field5468 == var9 && var12 >= 0 && var14.field2025 + var12 < 104 && var13 >= 0 && (var14.field2025 + var13) < 104) {
                        class165.field2621[var7] = new class288();
                        class288 var15 = class165.field2621[var7];
                        class330.field5253[class35.field508++] = var7;
                        var15.field3550 = class332.field5261;
                        var15.method2092(-1, var14);
                        var15.method1635(var15.field4692.field2025, -1);
                        var15.field3549 = var15.field3477 = class279.field4584[var15.field4692.field2020];
                        var15.field3514 = var15.field4692.field2050;
                        if (var15.field3514 == 0) {
                            var15.field3477 = 0;
                        }
                        var15.field3561 = var15.field4692.field2065;
                        var15.method1633(true, var12, var15.method1634(-1), var13, 127);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V", line = 111)
    public static final void method2248(byte arg0, int arg1) {
        if (arg0 <= 21) {
            field5065 = 72;
        }
        class321 var2 = class46.method370(3, (byte) -106, arg1);
        var2.method2261(-129);
        field5072++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lkc;IIZIIIII)V", line = 125)
    public static final void method2249(class29 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5071++;
        int var9 = arg7 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg0.field414;
            var11 = arg0.field342;
        } else {
            var10 = arg0.field342;
            var11 = arg0.field414;
        }
        int var12;
        int var13;
        if ((arg4 + var11) <= 104) {
            var12 = (var11 >> 1) + arg4;
            var13 = (var11 + 1 >> 1) + arg4;
        } else {
            var13 = arg4 + 1;
            var12 = arg4;
        }
        int var14;
        int var15;
        if ((arg1 + var10) > 104) {
            var14 = arg1;
            var15 = arg1 + 1;
        } else {
            var15 = (var10 + 1 >> 1) + arg1;
            var14 = (var10 >> 1) + arg1;
        }
        int[][] var16 = class101.field1656[arg6];
        int var17 = (arg1 << 7) + (var10 << 6);
        int var18 = 0;
        int var19 = (arg4 << 7) + (var11 << 6);
        int var20 = var16[var12][var15] + var16[var13][var15] + var16[var13][var14] + var16[var12][var14] >> 2;
        if (arg6 != 0) {
            int[][] var21 = class101.field1656[0];
            var18 = var20 - (var21[var12][var14] - (-var21[var13][var14] - (var21[var12][var15] + var21[var13][var15])) >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg6 < 3) {
            var22 = class101.field1656[arg6 + 1];
        }
        class296 var23 = arg0.method179((class341) null, var16, false, var22, arg5, arg3, var19, arg7, var17, var20, 32227);
        class249.method1915(var23.field4762, var19 - arg2, var18, var17 - arg8);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZIIIILqm;ZIII)V", line = 208)
    public static final void method2250(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class227 arg7, boolean arg8, int arg9, int arg10, int arg11) {
        if (arg4 >= 0 && arg4 < 104 && arg3 >= 0 && arg3 < 104) {
            if (!arg2 && !arg8) {
                class178.field2856[arg0][arg4][arg3] = 0;
            }
            while (true) {
                int var12 = arg7.method1720((byte) -72);
                if (var12 == 0) {
                    if (arg2) {
                        class101.field1656[0][arg4 + arg11][arg1 + arg3] = class208.field3270[0][arg4 + arg11][arg1 + arg3];
                    } else if (arg0 == 0) {
                        class101.field1656[0][arg4 + arg11][arg1 + arg3] = -class24.method159(arg6 + 932731, (byte) -57, arg5 + 556238) * 8;
                    } else {
                        class101.field1656[arg0][arg4 + arg11][arg1 + arg3] = class101.field1656[arg0 - 1][arg4 + arg11][arg1 + arg3] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg7.method1720((byte) -9);
                    if (arg2) {
                        class101.field1656[0][arg4 + arg11][arg3 + arg1] = var13 * 8 + class208.field3270[0][arg4 + arg11][arg1 + arg3];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg0 == 0) {
                            class101.field1656[0][arg4 + arg11][arg1 + arg3] = -var13 * 8;
                        } else {
                            class101.field1656[arg0][arg4 + arg11][arg1 + arg3] = class101.field1656[arg0 - 1][arg4 + arg11][arg1 + arg3] - var13 * 8;
                        }
                    }
                    break;
                }
                if (var12 > 49) {
                    if (var12 <= 81) {
                        if (!arg2 && !arg8) {
                            class178.field2856[arg0][arg4][arg3] = (byte) (var12 - 49);
                        }
                    } else if (!arg8) {
                        class40.field590[arg0][arg4][arg3] = (byte) (var12 - 81);
                    }
                } else if (arg8) {
                    arg7.method1720((byte) -86);
                } else {
                    class127.field2162[arg0][arg4][arg3] = arg7.method1733(0);
                    class319.field5081[arg0][arg4][arg3] = (byte) ((var12 - 2) / 4);
                    class329.field5232[arg0][arg4][arg3] = (byte) class343.method2418(var12 + arg9 - 2, 3);
                }
            }
        } else {
            while (true) {
                int var14 = arg7.method1720((byte) -120);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg7.method1720((byte) -105);
                    break;
                }
                if (var14 <= 49) {
                    arg7.method1720((byte) -128);
                }
            }
        }
        field5075++;
        if (arg10 != 3) {
            field5065 = -101;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBLqm;)V", line = 335)
    public final void method2251(int arg0, byte arg1, class227 arg2) {
        if (arg1 != 99) {
            return;
        }
        while (true) {
            int var4 = arg2.method1720((byte) -87);
            if (var4 == 0) {
                field5064++;
                return;
            }
            this.method2252(arg0, 1, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIILqm;)V", line = 358)
    private final void method2252(int arg0, int arg1, int arg2, class227 arg3) {
        field5066++;
        if (arg1 == arg2) {
            this.field5069 = arg3.method1720((byte) -11);
        } else if (arg2 == 2) {
            this.field5074 = arg3.method1765(true);
        } else if (arg2 == 3) {
            this.field5073 = arg3.method1765(true);
        } else if (arg2 == 4) {
            this.field5068 = arg3.method1769(-30726);
        }
    }
}
