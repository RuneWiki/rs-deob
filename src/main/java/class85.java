import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class85 {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1154 = "K";

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BZ)V")
    public static final void method530(byte arg0, boolean arg1) {
        class125.field1755 = arg1;
        field1157++;
        if (arg0 < 82) {
            return;
        }
        if (!class125.field1755) {
            int var26 = class233.field3518.method1474((byte) -128);
            int var27 = class233.field3518.method1474((byte) -104);
            boolean var28 = class200.method1273(class233.field3518.method1495((byte) -88), 104);
            int var29 = (class105.field1460 - class233.field3518.field3402) / 16;
            class83.field1132 = new int[var29][4];
            for (int var30 = 0; var30 < var29; var30++) {
                for (int var39 = 0; var39 < 4; var39++) {
                    class83.field1132[var30][var39] = class233.field3518.method1434((byte) -82);
                }
            }
            int var31 = class233.field3518.method1442(255);
            int var32 = class233.field3518.method1442(255);
            int var33 = class233.field3518.method1453((byte) -128);
            class82.field1114 = null;
            class274.field4242 = new int[var29];
            class146.field2029 = new byte[var29][];
            class19.field268 = new int[var29];
            class287.field4548 = new byte[var29][];
            class135.field1897 = null;
            class202.field2808 = new int[var29];
            class251.field3839 = new int[var29];
            class180.field2519 = new int[var29];
            int var34 = 0;
            boolean var35 = false;
            if ((var32 / 8 == 48 || (var32 / 8) == 49) && (var26 / 8) == 48) {
                var35 = true;
            }
            if (var32 / 8 == 48 && var26 / 8 == 148) {
                var35 = true;
            }
            for (int var36 = (var32 - 6) / 8; var36 <= ((var32 + 6) / 8); var36++) {
                for (int var37 = (var26 - 6) / 8; var37 <= (var26 + 6) / 8; var37++) {
                    int var38 = (var36 << 8) + var37;
                    if (var35 && var37 == 49 || var37 == 149 || var37 == 147 || var36 == 50 || !(var36 != 49 || var37 != 47)) {
                        class274.field4242[var34] = var38;
                        class202.field2808[var34] = -1;
                        class180.field2519[var34] = -1;
                        class251.field3839[var34] = -1;
                        class19.field268[var34] = -1;
                    } else {
                        class274.field4242[var34] = var38;
                        class202.field2808[var34] = class197.field2726.method1568("m" + var36 + "_" + var37, -7551);
                        class180.field2519[var34] = class197.field2726.method1568("l" + var36 + "_" + var37, -7551);
                        class251.field3839[var34] = class197.field2726.method1568("um" + var36 + "_" + var37, -7551);
                        class19.field268[var34] = class197.field2726.method1568("ul" + var36 + "_" + var37, -7551);
                    }
                    var34++;
                }
            }
            class142.method954(var32, var27, 1464, var31, var33, var26, var28, false);
            return;
        }
        int var2 = class233.field3518.method1474((byte) -102);
        int var3 = class233.field3518.method1442(255);
        int var4 = class233.field3518.method1474((byte) -115);
        class233.field3518.method1856((byte) -45);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = class233.field3518.method1865(1, 8);
                    if (var25 == 1) {
                        class239.field3652[var5][var23][var24] = class233.field3518.method1865(26, 8);
                    } else {
                        class239.field3652[var5][var23][var24] = -1;
                    }
                }
            }
        }
        class233.field3518.method1860(-16973);
        int var6 = (class105.field1460 - class233.field3518.field3402) / 16;
        class83.field1132 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var22 = 0; var22 < 4; var22++) {
                class83.field1132[var7][var22] = class233.field3518.method1467(4);
            }
        }
        int var8 = class233.field3518.method1465(-1691509480);
        int var9 = class233.field3518.method1453((byte) -128);
        boolean var10 = class200.method1273(class233.field3518.method1453((byte) -128), 104);
        class202.field2808 = new int[var6];
        class82.field1114 = null;
        class146.field2029 = new byte[var6][];
        class19.field268 = new int[var6];
        class180.field2519 = new int[var6];
        class251.field3839 = new int[var6];
        class287.field4548 = new byte[var6][];
        class274.field4242 = new int[var6];
        class135.field1897 = null;
        int var11 = 0;
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 13; var13++) {
                for (int var14 = 0; var14 < 13; var14++) {
                    int var15 = class239.field3652[var12][var13][var14];
                    if (var15 != -1) {
                        int var16 = var15 >> 14 & 0x3FF;
                        int var17 = var15 >> 3 & 0x7FF;
                        int var18 = (var16 / 8 << 8) + var17 / 8;
                        for (int var19 = 0; var19 < var11; var19++) {
                            if (class274.field4242[var19] == var18) {
                                var18 = -1;
                                break;
                            }
                        }
                        if (var18 != -1) {
                            class274.field4242[var11] = var18;
                            int var20 = var18 & 0xFF;
                            int var21 = var18 >> 8 & 0xFF;
                            class202.field2808[var11] = class197.field2726.method1568("m" + var21 + "_" + var20, -7551);
                            class180.field2519[var11] = class197.field2726.method1568("l" + var21 + "_" + var20, -7551);
                            class251.field3839[var11] = class197.field2726.method1568("um" + var21 + "_" + var20, -7551);
                            class19.field268[var11] = class197.field2726.method1568("ul" + var21 + "_" + var20, -7551);
                            var11++;
                        }
                    }
                }
            }
        }
        class142.method954(var3, var4, 1464, var2, var9, var8, var10, false);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(CII)I")
    public static final int method531(char arg0, int arg1, int arg2) {
        field1159++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg1 == 1620420900) {
            if (arg0 == 'ñ' && arg2 == 0) {
                var3 = 1762;
            }
            return var3;
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZILql;)V")
    public final void method532(boolean arg0, int arg1, class224 arg2) {
        field1160++;
        if (!arg0) {
            return;
        }
        while (true) {
            int var4 = arg2.method1453((byte) -128);
            if (var4 == 0) {
                return;
            }
            this.method533(arg1, var4, (byte) -38, arg2);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBLql;)V")
    private final void method533(int arg0, int arg1, byte arg2, class224 arg3) {
        field1152++;
        if (arg2 != -38) {
            method531((char) 65470, 88, 60);
        }
        if (arg1 == 1) {
            this.field1156 = arg3.method1445(false);
        } else if (arg1 == 2) {
            this.field1153 = arg3.method1453((byte) -127);
            this.field1155 = arg3.method1453((byte) -128);
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Lq;")
    public final class128 method534(int arg0) {
        class128 var2 = (class128) class236.field3594.method540((byte) -117, (long) this.field1156);
        field1158++;
        if (var2 != null) {
            return var2;
        }
        class128 var3 = class280.method1873(this.field1156, false, 0, class159.field2223);
        if (var3 != null) {
            class236.field3594.method543(var3, (long) this.field1156, 858993459);
        }
        if (arg0 != 4703) {
            this.field1156 = -26;
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static void method535(int arg0) {
        field1154 = null;
        if (arg0 != 8) {
            field1154 = null;
        }
    }
}
