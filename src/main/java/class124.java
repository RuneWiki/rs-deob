import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class124 implements class257 {

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public int field1497;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "[S")
    private static short[] field1495 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "Z")
    public static boolean field1491 = false;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "[S")
    private static short[] field1494 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "[S")
    private static short[] field1499 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "[S")
    private static short[] field1493 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "[[S")
    public static short[][] field1502 = new short[][] { field1493, field1495, field1494, field1499 };

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "[I")
    public static int[] field1504 = new int[120];

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public static int field1500 = -1;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "[I")
    public static int[] field1505;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "Lvd;")
    public static class38 field1501;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "[I")
    public static int[] field1496;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)Lg;")
    public final class153 method769(boolean arg0) {
        field1492++;
        if (arg0) {
            field1493 = null;
        }
        return class219.field2852;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static final void method841(int arg0) {
        if (!class436.field6192) {
            class600.field8427 = class533.field7509 != -1 && class533.field7509 <= class25.field341 || class172.field2348 < (class25.field341 * 16 + (class273.field3903 ? 26 : 22));
        }
        field1490++;
        class747.field10386.method2767((byte) -19);
        class119.field1440.method2767((byte) -19);
        for (class37 var1 = (class37) class215.field2820.method2765(-12261); var1 != null; var1 = (class37) class215.field2820.method2759(-15361)) {
            int var39 = var1.field463;
            if (var39 < 1000) {
                var1.method1185(-93);
                if (var39 == 5 || var39 == 51 || var39 == 50 || var39 == 9 || var39 == 2 || var39 == 19 || var39 == 30) {
                    class119.field1440.method2770((byte) -13, var1);
                } else {
                    class747.field10386.method2770((byte) -13, var1);
                }
            }
        }
        if (arg0 != -30726) {
            method841(-112);
        }
        class747.field10386.method2761(82, class215.field2820);
        class119.field1440.method2761(83, class215.field2820);
        if (class25.field341 > 1) {
            if (class713.field9914 && class589.field8306.method1517(0, 81) && class25.field341 > 2) {
                class231.field3108 = (class37) class215.field2820.field6565.field2545.field2545;
            } else {
                class231.field3108 = (class37) class215.field2820.field6565.field2545;
            }
            class367.field5202 = (class37) class215.field2820.field6565.field2545;
        } else {
            class231.field3108 = null;
            class367.field5202 = null;
        }
        int var2 = -1;
        class382 var3 = (class382) class43.field528.method2765(-12261);
        if (var3 != null) {
            var2 = var3.method778(arg0 + 30726);
        }
        if (!class436.field6192) {
            if (var2 == 0 && (class499.field7167 == 1 && class25.field341 > 2 || class349.method2251(1002))) {
                var2 = 2;
            }
            if (var2 == 2 && class25.field341 > 0 && var3 != null) {
                if (class643.field8813 == null && class242.field3233 == 0) {
                    class3.method14(var3.method776(-127), 111, var3.method779((byte) -96));
                } else {
                    class117.field1421 = 2;
                }
            }
            if (var2 == 0) {
                if (class231.field3108 != null) {
                    class518.method3037((byte) 85);
                } else if (field1491) {
                    class37.method210(arg0 + 30725);
                }
            }
            if (class643.field8813 == null && class242.field3233 == 0) {
                class38.field482 = null;
                class117.field1421 = 0;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class530.field7470.method1094(-108);
            int var5 = class530.field7470.method1089((byte) -63);
            boolean var6 = false;
            if (class430.field6135 != null) {
                if (var4 >= (class326.field4512 - 10) && var4 <= (class326.field4512 + class426.field5986 + 10) && var5 >= (class373.field5236 - 10) && var5 <= (class505.field7238 + class373.field5236 + 10)) {
                    var6 = true;
                } else {
                    class492.method2929(arg0 + 30727);
                }
            }
            if (!var6) {
                if (class208.field2732 - 10 > var4 || var4 > class470.field6668 + class208.field2732 + 10 || (class652.field8959 - 10) > var5 || (class225.field3039 + class652.field8959 + 10) < var5) {
                    class405.method2516((byte) 127);
                } else if (class600.field8427) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class350.field4958; var9++) {
                        if (class273.field3903) {
                            int var10 = class652.field8959 - (-(var9 * 16) - 33);
                            if (var10 - 13 < var5 && var10 + 4 > var5) {
                                var7 = var9;
                                var8 = var10 - 13;
                                break;
                            }
                        } else {
                            int var11 = var9 * 16 + class652.field8959 + 31;
                            if (var5 > var11 - 13 && var5 < var11 + 3) {
                                var7 = var9;
                                var8 = var11 - 13;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class674 var13 = new class674(class455.field6429);
                        for (class508 var14 = (class508) var13.method3685(true); var14 != null; var14 = (class508) var13.method3684((byte) 106)) {
                            if (var7 == var12) {
                                if (var14.field7268 > 1) {
                                    class213.method1311((byte) -82, var5, var14, var8);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method779((byte) 72);
        int var16 = var3.method776(-120);
        if (class430.field6135 != null && var15 >= class326.field4512 && (class326.field4512 + class426.field5986) >= var15 && var16 >= class373.field5236 && class505.field7238 + class373.field5236 >= var16) {
            int var17 = -1;
            for (int var18 = 0; var18 < class430.field6135.field7268; var18++) {
                if (class273.field3903) {
                    int var22 = var18 * 16 + class373.field5236 + 33;
                    if (var16 > (var22 - 13) && var16 < (var22 + 4)) {
                        var17 = var18;
                    }
                } else {
                    int var23 = (var18 * 16) + class373.field5236 + 31;
                    if (var23 - 13 < var16 && var16 < (var23 + 3)) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class674 var20 = new class674(class430.field6135.field7267);
                for (class37 var21 = (class37) var20.method3685(true); var21 != null; var21 = (class37) var20.method3684((byte) 106)) {
                    if (var17 == var19) {
                        class209.method1277((byte) -81, var15, var21, var16);
                        break;
                    }
                    var19++;
                }
            }
            class405.method2516((byte) 88);
            return;
        }
        if (class208.field2732 > var15 || (class470.field6668 + class208.field2732) < var15 || class652.field8959 > var16 || class652.field8959 + class225.field3039 < var16) {
            return;
        }
        if (class600.field8427) {
            int var24 = -1;
            int var25 = -1;
            for (int var26 = 0; var26 < class350.field4958; var26++) {
                if (class273.field3903) {
                    int var27 = var26 * 16 + class652.field8959 + 33;
                    if (var16 > var27 - 13 && var16 < (var27 + 4)) {
                        var24 = var26;
                        var25 = var27 - 13;
                        break;
                    }
                } else {
                    int var28 = var26 * 16 + class652.field8959 + 31;
                    if ((var28 - 13) < var16 && (var28 + 3) > var16) {
                        var25 = var28 - 13;
                        var24 = var26;
                        break;
                    }
                }
            }
            if (var24 != -1) {
                int var29 = 0;
                class674 var30 = new class674(class455.field6429);
                for (class508 var31 = (class508) var30.method3685(true); var31 != null; var31 = (class508) var30.method3684((byte) 106)) {
                    if (var24 == var29) {
                        if (var31.field7268 == 1) {
                            class209.method1277((byte) -12, var15, (class37) var31.field7267.field9891.field8206, var16);
                            class405.method2516((byte) 82);
                            return;
                        }
                        class213.method1311((byte) -82, var16, var31, var25);
                        return;
                    }
                    var29++;
                }
                return;
            }
        } else {
            int var32 = -1;
            for (int var33 = 0; var33 < class25.field341; var33++) {
                if (class273.field3903) {
                    int var38 = (class25.field341 - var33 - 1) * 16 + class652.field8959 + 33;
                    if (var38 - 13 < var16 && (var38 + 4) > var16) {
                        var32 = var33;
                    }
                } else {
                    int var37 = (class25.field341 - var33 - 1) * 16 + class652.field8959 + 31;
                    if ((var37 - 13) < var16 && (var37 + 3) > var16) {
                        var32 = var33;
                    }
                }
            }
            if (var32 != -1) {
                int var34 = 0;
                class383 var35 = new class383(class215.field2820);
                for (class37 var36 = (class37) var35.method2430(arg0 ^ 0xFFFFACE0); var36 != null; var36 = (class37) var35.method2434(arg0 + 146831366)) {
                    if (var32 == var34) {
                        class209.method1277((byte) -95, var15, var36, var16);
                        break;
                    }
                    var34++;
                }
            }
            class405.method2516((byte) 89);
        }
        return;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
    public static final void method842(byte arg0) throws class76 {
        if (class221.field2883 == 1) {
            class263.field3799.method435(class143.field2043, class155.field2166);
        } else {
            class263.field3799.method435(0, 0);
        }
        if (arg0 <= 91) {
            method843(62);
        }
        field1498++;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(I)V")
    public class124(int arg0) {
        this.field1497 = arg0;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V")
    public static void method843(int arg0) {
        field1493 = null;
        field1504 = null;
        field1496 = null;
        field1495 = null;
        field1494 = null;
        field1502 = null;
        field1501 = null;
        field1499 = null;
        field1505 = null;
        if (arg0 <= 24) {
            method841(-64);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1504[var1] = var0 / 4;
        }
        field1505 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        field1506 = 0;
    }
}
