import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class42 {

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field671 = 0;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field664 = 0;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Z")
    public static boolean field668 = false;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "F")
    public static float field666;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lrn;")
    public static class18 field669;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Lrn;")
    public static class18 field677;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Loc;")
    public static class304 field665;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 6)
    public static void method429(int arg0) {
        field665 = null;
        field677 = null;
        field669 = null;
        if (arg0 < 49) {
            field665 = (class304) null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V", line = 18)
    public static final void method430(String arg0, int arg1, int arg2, String arg3) {
        class37.field571 = arg3;
        class134.field2238 = arg0;
        class74.field1101 = arg2;
        field662++;
        if (class134.field2238.equals("") || class37.field571.equals("")) {
            class248.field3849 = 3;
        } else if (class207.field3196 == -1) {
            class301.field4669 = 0;
            class114.field1757 = arg1;
            class248.field3849 = -3;
            class87.field1246 = 1;
            class25 var4 = new class25(128);
            var4.method273(0, 10);
            var4.method310(118, (int) (Math.random() * 9.9999999E7D));
            var4.method279(12086, client.method1025(768, class134.field2238));
            var4.method310(arg1 ^ 0x41, (int) (Math.random() * 9.9999999E7D));
            var4.method280(arg1 ^ 0xFFFFB857, class37.field571);
            var4.method310(43, (int) (Math.random() * 9.9999999E7D));
            var4.method268(arg1 ^ 0xFFFFFF83, class165.field2616, class140.field2325);
            class99.field1491.field397 = 0;
            class99.field1491.method273(0, 24);
            class99.field1491.method273(0, var4.field397 + 2);
            class99.field1491.method304(false, 554);
            class99.field1491.method311(1, var4.field397, 0, var4.field448);
        } else {
            class317.method2235((byte) 109);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V", line = 69)
    public static final void method431(int arg0) {
        if (arg0 != 11303) {
            method435(false, 36);
        }
        class112.field1715.method655(-1);
        field675++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lrn;ILrn;Llc;)V", line = 83)
    public static final void method432(class18 arg0, int arg1, class18 arg2, class218 arg3) {
        class314.field4861 = arg2;
        field661++;
        class232.field3621 = arg0;
        if (arg1 >= -9) {
            method433(-22, -2, 113, 83);
        }
        class83.field1194 = arg3;
        if (class232.field3621 != null) {
            class104.field1575 = class232.field3621.method197((byte) 127, 1);
        }
        if (class314.field4861 != null) {
            class61.field939 = class314.field4861.method197((byte) 19, 1);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)I", line = 102)
    public static final int method433(int arg0, int arg1, int arg2, int arg3) {
        field673++;
        int var4 = 3 / ((-arg1 - 49) / 61);
        int var5 = class107.field1603[class124.method1071(arg3, arg0)];
        if (arg2 > 0) {
            int var6 = class107.field1619.method752(arg2 & 0xFFFF, (byte) -21);
            if (var6 != 0) {
                int var7;
                if (arg0 < 0) {
                    var7 = 0;
                } else if (arg0 > 127) {
                    var7 = 16777215;
                } else {
                    var7 = arg0 * 131586;
                }
                if (var6 == 256) {
                    var5 = var7;
                } else {
                    int var9 = 256 - var6;
                    var5 = ((var7 & 0xFF00) * var6 + ((var5 & 0xFF00) * var9) & 0xFF0000) + ((var7 & 0xFF00FF) * var6 + ((var5 & 0xFF00FF) * var9) & 0xFF00FF00) >> 8;
                }
            }
            int var10 = class107.field1619.method762(6, arg2 & 0xFFFF);
            if (var10 != 0) {
                var10 += 256;
                int var11 = ((var5 & 0xFF0000) >> 16) * var10;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = ((var5 & 0xFF00) >> 8) * var10;
                int var13 = (var5 & 0xFF) * var10;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var5 = (var13 >> 8) + ((var11 & 0xFC00FF00) << 8) + (var12 & 0xFF00);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 171)
    public static final void method434(boolean arg0) {
        class332.field5095.method656(0);
        field678++;
        class280.field4315.method656(0);
        if (arg0) {
            method434(false);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V", line = 184)
    public static final void method435(boolean arg0, int arg1) {
        field672++;
        class293.field4555 = arg0;
        if (arg1 != 1) {
            field669 = (class18) null;
        }
        if (!class293.field4555) {
            int var26 = class244.field3803.method314((byte) 118);
            int var27 = class244.field3803.method281(arg1 - 125);
            int var28 = (class122.field1945 - class244.field3803.field397) / 16;
            class320.field4938 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var30 = 0; var30 < 4; var30++) {
                    class320.field4938[var29][var30] = class244.field3803.method257((byte) -101);
                }
            }
            int var31 = class244.field3803.method275(2);
            boolean var32 = false;
            if ((var26 / 8 == 48 || (var26 / 8) == 49) && var31 / 8 == 48) {
                var32 = true;
            }
            if ((var26 / 8) == 48 && (var31 / 8) == 148) {
                var32 = true;
            }
            boolean var33 = class210.method1555(0, class244.field3803.method287(128));
            int var34 = class244.field3803.method274((byte) -11);
            int var35 = class244.field3803.method261((byte) -120);
            class135.field2254 = new int[var28];
            class348.field5528 = new int[var28];
            class109.field1671 = null;
            class244.field3797 = new byte[var28][];
            class46.field738 = new byte[var28][];
            class292.field4540 = new int[var28];
            class360.field5714 = new int[var28];
            class252.field3884 = (byte[][]) null;
            class37.field570 = new byte[var28][];
            class22.field336 = new byte[var28][];
            class101.field1526 = new int[var28];
            int var36 = 0;
            for (int var37 = (var26 - 6) / 8; var37 <= (var26 + 6) / 8; var37++) {
                for (int var38 = (var31 - 6) / 8; var38 <= ((var31 + 6) / 8); var38++) {
                    int var39 = (var37 << 8) + var38;
                    if (var32 && var38 == 49 || var38 == 149 || var38 == 147 || var37 == 50 || !(var37 != 49 || var38 != 47)) {
                        class292.field4540[var36] = var39;
                        class360.field5714[var36] = -1;
                        class135.field2254[var36] = -1;
                        class101.field1526[var36] = -1;
                        class348.field5528[var36] = -1;
                    } else {
                        class292.field4540[var36] = var39;
                        class360.field5714[var36] = class181.field2856.method186(false, "m" + var37 + "_" + var38);
                        class135.field2254[var36] = class181.field2856.method186(false, "l" + var37 + "_" + var38);
                        class101.field1526[var36] = class181.field2856.method186(false, "um" + var37 + "_" + var38);
                        class348.field5528[var36] = class181.field2856.method186(false, "ul" + var37 + "_" + var38);
                    }
                    var36++;
                }
            }
            class91.method823(var35, var27, var26, var31, true, false, var34, var33);
            return;
        }
        int var2 = class244.field3803.method307((byte) -106);
        class244.field3803.method1630((byte) 35);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 13; var4++) {
                for (int var5 = 0; var5 < 13; var5++) {
                    int var6 = class244.field3803.method1632(14538, 1);
                    if (var6 == 1) {
                        class74.field1090[var3][var4][var5] = class244.field3803.method1632(arg1 + 14537, 26);
                    } else {
                        class74.field1090[var3][var4][var5] = -1;
                    }
                }
            }
        }
        class244.field3803.method1631((byte) 0);
        int var7 = (class122.field1945 - class244.field3803.field397) / 16;
        class320.field4938 = new int[var7][4];
        for (int var8 = 0; var8 < var7; var8++) {
            for (int var9 = 0; var9 < 4; var9++) {
                class320.field4938[var8][var9] = class244.field3803.method262((byte) 58);
            }
        }
        int var10 = class244.field3803.method274((byte) -11);
        boolean var11 = class210.method1555(arg1 ^ 0x1, class244.field3803.method287(128));
        int var12 = class244.field3803.method274((byte) -11);
        int var13 = class244.field3803.method274((byte) -11);
        int var14 = class244.field3803.method314((byte) 117);
        class252.field3884 = (byte[][]) null;
        class292.field4540 = new int[var7];
        class244.field3797 = new byte[var7][];
        class360.field5714 = new int[var7];
        class135.field2254 = new int[var7];
        class37.field570 = new byte[var7][];
        class22.field336 = new byte[var7][];
        class46.field738 = new byte[var7][];
        class348.field5528 = new int[var7];
        class109.field1671 = null;
        class101.field1526 = new int[var7];
        int var15 = 0;
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = class74.field1090[var16][var17][var18];
                    if (var19 != -1) {
                        int var20 = (var19 & 0xFFF854) >> 14;
                        int var21 = (var19 & 0x3FFC) >> 3;
                        int var22 = (var20 / 8 << 8) + var21 / 8;
                        for (int var23 = 0; var23 < var15; var23++) {
                            if (class292.field4540[var23] == var22) {
                                var22 = -1;
                                break;
                            }
                        }
                        if (var22 != -1) {
                            class292.field4540[var15] = var22;
                            int var24 = (var22 & 0xFF8D) >> 8;
                            int var25 = var22 & 0xFF;
                            class360.field5714[var15] = class181.field2856.method186(false, "m" + var24 + "_" + var25);
                            class135.field2254[var15] = class181.field2856.method186(false, "l" + var24 + "_" + var25);
                            class101.field1526[var15] = class181.field2856.method186(false, "um" + var24 + "_" + var25);
                            class348.field5528[var15] = class181.field2856.method186(false, "ul" + var24 + "_" + var25);
                            var15++;
                        }
                    }
                }
            }
        }
        class91.method823(var14, var2, var10, var13, true, false, var12, var11);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 435)
    public static final void method436(byte arg0) {
        class43.field699.method656(0);
        class343.field5453.method656(0);
        field674++;
        int var1 = 111 / ((53 - arg0) / 57);
    }
}
