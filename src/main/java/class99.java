import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class99 {

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "Lrd;")
    public final class266 field1938;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public final int field1925;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "D")
    public static double field1926 = -1.0D;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lcc;")
    public static class209 field1924 = class95.method669(107, "::errortest");

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Lcc;")
    public static class209 field1933 = class95.method669(89, " )2> ");

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Lcc;")
    public static class209 field1931 = class95.method669(103, "(U(Y");

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "Lcc;")
    public static class209 field1935 = class95.method669(89, "V-Brification des mises -9 jour )2 ");

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Lcc;")
    public static class209 field1932 = class95.method669(86, ":");

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)Lcc;")
    public static final class209 method690(int arg0, int arg1) {
        field1923++;
        if (arg0 >= -72) {
            return null;
        } else if (class20.field391[arg1].method1486(5) <= 0) {
            return class219.field3993[arg1];
        } else {
            return class229.method1604(new class209[] { class219.field3993[arg1], class187.field3375, class20.field391[arg1] }, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)V")
    public static final void method691(int arg0, boolean arg1) {
        if (arg1) {
            if (class149.field2727 != -1) {
                class66.method484(class149.field2727, 54);
            }
            for (class97 var2 = (class97) class114.field2288.method1759((byte) 43); var2 != null; var2 = (class97) class114.field2288.method1767((byte) 41)) {
                class122.method893(var2, 95, true);
            }
            class149.field2727 = -1;
            class114.field2288 = new class255(8);
            class3.method13(arg0 + 3457795);
            class149.field2727 = class260.field4686;
            class141.method980(108, false);
            class285.method1917((byte) 121);
            class273.method1860(class149.field2727, arg0 ^ 0xFFFFFF80);
        }
        field1928++;
        class223.field4069 = new class108();
        if (arg0 != 0) {
            method693(-93, 4);
        }
        class223.field4069.field1571 = 3000;
        class223.field4069.field1534 = 3000;
        class192.method1318(class53.field1056, arg0 ^ 0x76);
        class155.method1088(10, -3280);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static void method692(int arg0) {
        field1931 = null;
        field1932 = null;
        field1935 = null;
        field1924 = null;
        if (arg0 != 14486) {
            method691(-121, false);
        }
        field1933 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)Z")
    public static final boolean method693(int arg0, int arg1) {
        field1936++;
        if (arg1 < 89) {
            return true;
        } else {
            return (arg0 >> 28 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(IZ)V")
    public static final void method694(int arg0, boolean arg1) {
        class254.field4574 = arg1;
        if (arg0 != 26441) {
            field1937 = 36;
        }
        field1929++;
        if (!class254.field4574) {
            int var2 = client.field2818.method766(-49);
            int var3 = client.field2818.method766(-93);
            int var4 = client.field2818.method724((byte) 79);
            int var5 = (class112.field2253 - client.field2818.field2085) / 16;
            class158.field2886 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class158.field2886[var6][var14] = client.field2818.method770(-122);
                }
            }
            int var7 = client.field2818.method769(false);
            boolean var8 = false;
            if (((var2 / 8) == 48 || var2 / 8 == 49) && var4 / 8 == 48) {
                var8 = true;
            }
            if ((var2 / 8) == 48 && (var4 / 8) == 148) {
                var8 = true;
            }
            int var9 = client.field2818.method736(121);
            class209.field3791 = new int[var5];
            class111.field2246 = null;
            class47.field913 = new int[var5];
            class134.field2540 = new int[var5];
            class169.field3077 = null;
            class247.field4475 = new byte[var5][];
            class10.field202 = new byte[var5][];
            class90.field1794 = new int[var5];
            class18.field370 = new int[var5];
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var4 - 6) / 8; var12 <= ((var4 + 6) / 8); var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (var8 && var12 == 49 || var12 == 149 || var12 == 147 || var11 == 50 || !(var11 != 49 || var12 != 47)) {
                        class47.field913[var10] = var13;
                        class18.field370[var10] = -1;
                        class134.field2540[var10] = -1;
                        class90.field1794[var10] = -1;
                        class209.field3791[var10] = -1;
                    } else {
                        class47.field913[var10] = var13;
                        class18.field370[var10] = class149.field2729.method364(-1, class229.method1604(new class209[] { class150.field2742, class66.method485(var11, (byte) 41), class237.field4267, class66.method485(var12, (byte) 44) }, (byte) 64));
                        class134.field2540[var10] = class149.field2729.method364(-1, class229.method1604(new class209[] { class251.field4522, class66.method485(var11, (byte) 87), class237.field4267, class66.method485(var12, (byte) 109) }, (byte) 65));
                        class90.field1794[var10] = class149.field2729.method364(class3.method15(arg0, -26442), class229.method1604(new class209[] { class64.field1253, class66.method485(var11, (byte) 32), class237.field4267, class66.method485(var12, (byte) 112) }, (byte) 96));
                        class209.field3791[var10] = class149.field2729.method364(-1, class229.method1604(new class209[] { class167.field3016, class66.method485(var11, (byte) 41), class237.field4267, class66.method485(var12, (byte) 53) }, (byte) 115));
                    }
                    var10++;
                }
            }
            class44.method331(var3, var9, var2, var4, (byte) -123, var7, false);
            return;
        }
        int var15 = client.field2818.method766(-29);
        client.field2818.method294(79);
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = client.field2818.method289(8, 1);
                    if (var37 == 1) {
                        class34.field604[var16][var35][var36] = client.field2818.method289(8, 26);
                    } else {
                        class34.field604[var16][var35][var36] = -1;
                    }
                }
            }
        }
        client.field2818.method297(true);
        int var17 = (class112.field2253 - client.field2818.field2085) / 16;
        class158.field2886 = new int[var17][4];
        for (int var18 = 0; var18 < var17; var18++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class158.field2886[var18][var34] = client.field2818.method770(-128);
            }
        }
        int var19 = client.field2818.method741(-253);
        int var20 = client.field2818.method736(121);
        int var21 = client.field2818.method774((byte) 91);
        int var22 = client.field2818.method736(124);
        class90.field1794 = new int[var17];
        class247.field4475 = new byte[var17][];
        class111.field2246 = null;
        class134.field2540 = new int[var17];
        class47.field913 = new int[var17];
        class209.field3791 = new int[var17];
        class10.field202 = new byte[var17][];
        class18.field370 = new int[var17];
        int var23 = 0;
        class169.field3077 = null;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class34.field604[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = (var27 & 0xFFEE20) >> 14;
                        int var29 = (var27 & 0x3FFE) >> 3;
                        int var30 = (var28 / 8 << 8) + var29 / 8;
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class47.field913[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            class47.field913[var23] = var30;
                            int var32 = var30 >> 8 & 0xFF;
                            int var33 = var30 & 0xFF;
                            class18.field370[var23] = class149.field2729.method364(-1, class229.method1604(new class209[] { class150.field2742, class66.method485(var32, (byte) 114), class237.field4267, class66.method485(var33, (byte) 3) }, (byte) 48));
                            class134.field2540[var23] = class149.field2729.method364(-1, class229.method1604(new class209[] { class251.field4522, class66.method485(var32, (byte) 90), class237.field4267, class66.method485(var33, (byte) 118) }, (byte) 64));
                            class90.field1794[var23] = class149.field2729.method364(-1, class229.method1604(new class209[] { class64.field1253, class66.method485(var32, (byte) 85), class237.field4267, class66.method485(var33, (byte) 33) }, (byte) 111));
                            class209.field3791[var23] = class149.field2729.method364(arg0 - 26442, class229.method1604(new class209[] { class167.field3016, class66.method485(var32, (byte) 83), class237.field4267, class66.method485(var33, (byte) 50) }, (byte) 101));
                            var23++;
                        }
                    }
                }
            }
        }
        class44.method331(var19, var15, var22, var20, (byte) -123, var21, false);
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(II)V")
    public class99(int arg0, int arg1) {
        this.field1938 = class168.method1157((byte) -97, arg0);
        this.field1925 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lrd;I)V")
    public class99(class266 arg0, int arg1) {
        this.field1925 = arg1;
        this.field1938 = arg0;
    }
}
