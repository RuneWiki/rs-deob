import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class181 {

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2839 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "J")
    public static long field2836 = 0L;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field2843 = 0;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "[I")
    public static int[] field2842 = new int[50];

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "S")
    public short field2849;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Z")
    public boolean field2832;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Z")
    public boolean field2835;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Z")
    public boolean field2838;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Z")
    public boolean field2841;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1291(byte arg0) {
        field2839 = null;
        if (arg0 > -29) {
            method1294(99, -98, 90, 25, -87, (byte) 116, -102, 9);
        }
        field2842 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Lig;")
    public static final class9 method1292(int arg0) {
        field2847++;
        if (arg0 == 1) {
            class13 var1 = new class13(class214.field3278, class234.field3705, class196.field3069[0], class125.field1877[0], class104.field1621[0], class170.field2583[0], class301.field4847[0], class102.field1585);
            class30.method254(arg0 ^ 0x3);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V")
    public static final void method1293(boolean arg0, int arg1) {
        field2846++;
        class135.field2027 = arg0;
        if (arg1 != 26) {
            return;
        }
        if (!class135.field2027) {
            int var2 = class183.field2900.method256(arg1 - 27);
            int var3 = class183.field2900.method282((byte) 108);
            boolean var4 = class59.method487(class183.field2900.method277((byte) -103), 0);
            int var5 = class183.field2900.method315((byte) 68);
            int var6 = (class95.field1528 - class183.field2900.field541) / 16;
            class27.field464 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class27.field464[var7][var15] = class183.field2900.method294((byte) 90);
                }
            }
            boolean var8 = false;
            int var9 = class183.field2900.method256(-1);
            int var10 = class183.field2900.method256(arg1 ^ 0xFFFFFFE5);
            class234.field3693 = null;
            class7.field124 = new int[var6];
            class268.field4248 = new byte[var6][];
            class174.field2691 = new int[var6];
            class274.field4370 = new int[var6];
            if (((var2 / 8) == 48 || (var2 / 8) == 49) && (var9 / 8) == 48) {
                var8 = true;
            }
            class82.field1243 = new byte[var6][];
            class121.field1833 = new int[var6];
            class130.field1942 = null;
            class61.field960 = new int[var6];
            if ((var2 / 8) == 48 && (var9 / 8) == 148) {
                var8 = true;
            }
            int var11 = 0;
            for (int var12 = (var2 - 6) / 8; var12 <= ((var2 + 6) / 8); var12++) {
                for (int var13 = (var9 - 6) / 8; var13 <= (var9 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var8 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class174.field2691[var11] = var14;
                        class274.field4370[var11] = -1;
                        class61.field960[var11] = -1;
                        class121.field1833[var11] = -1;
                        class7.field124[var11] = -1;
                    } else {
                        class174.field2691[var11] = var14;
                        class274.field4370[var11] = class274.field4369.method717(104, "m" + var12 + "_" + var13);
                        class61.field960[var11] = class274.field4369.method717(104, "l" + var12 + "_" + var13);
                        class121.field1833[var11] = class274.field4369.method717(104, "um" + var12 + "_" + var13);
                        class7.field124[var11] = class274.field4369.method717(104, "ul" + var12 + "_" + var13);
                    }
                    var11++;
                }
            }
            class207.method1450(var4, var5, var2, false, var10, var9, var3, true);
            return;
        }
        int var16 = class183.field2900.method277((byte) -103);
        class183.field2900.method1763(arg1 ^ 0xFFFFFFE5);
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = class183.field2900.method1765(1, (byte) -27);
                    if (var39 == 1) {
                        class203.field3133[var17][var37][var38] = class183.field2900.method1765(26, (byte) -127);
                    } else {
                        class203.field3133[var17][var37][var38] = -1;
                    }
                }
            }
        }
        class183.field2900.method1769(-7);
        int var18 = (class95.field1528 - class183.field2900.field541) / 16;
        class27.field464 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var36 = 0; var36 < 4; var36++) {
                class27.field464[var19][var36] = class183.field2900.method300((byte) -30);
            }
        }
        int var20 = class183.field2900.method282((byte) 119);
        boolean var21 = class59.method487(class183.field2900.method277((byte) -103), 0);
        int var22 = class183.field2900.method267(-7803);
        int var23 = class183.field2900.method282((byte) 105);
        int var24 = class183.field2900.method260((byte) -67);
        class61.field960 = new int[var18];
        class7.field124 = new int[var18];
        class82.field1243 = new byte[var18][];
        class234.field3693 = null;
        class174.field2691 = new int[var18];
        class130.field1942 = null;
        class274.field4370 = new int[var18];
        class121.field1833 = new int[var18];
        class268.field4248 = new byte[var18][];
        int var25 = 0;
        for (int var26 = 0; var26 < 4; var26++) {
            for (int var27 = 0; var27 < 13; var27++) {
                for (int var28 = 0; var28 < 13; var28++) {
                    int var29 = class203.field3133[var26][var27][var28];
                    if (var29 != -1) {
                        int var30 = (var29 & 0xFFF9F5) >> 14;
                        int var31 = (var29 & 0x3FFE) >> 3;
                        int var32 = (var30 / 8 << 8) + (var31 / 8);
                        for (int var33 = 0; var33 < var25; var33++) {
                            if (class174.field2691[var33] == var32) {
                                var32 = -1;
                                break;
                            }
                        }
                        if (var32 != -1) {
                            class174.field2691[var25] = var32;
                            int var34 = var32 & 0xFF;
                            int var35 = (var32 & 0xFFA2) >> 8;
                            class274.field4370[var25] = class274.field4369.method717(104, "m" + var35 + "_" + var34);
                            class61.field960[var25] = class274.field4369.method717(104, "l" + var35 + "_" + var34);
                            class121.field1833[var25] = class274.field4369.method717(104, "um" + var35 + "_" + var34);
                            class7.field124[var25] = class274.field4369.method717(104, "ul" + var35 + "_" + var34);
                            var25++;
                        }
                    }
                }
            }
        }
        class207.method1450(var21, var16, var23, false, var22, var20, var24, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1294(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field2848++;
        if (arg5 < 102) {
            return;
        }
        if (arg4 >= class184.field2914 && arg7 <= class2.field42 && arg6 >= class112.field1727 && arg3 <= class278.field4410) {
            class69.method555(arg4, arg3, arg7, 119, arg2, arg0, arg6, arg1);
        } else {
            class164.method1187(arg7, arg6, arg3, arg0, arg4, arg2, (byte) 91, arg1);
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public static final void method1295(int arg0) {
        for (int var1 = -1; var1 < class259.field4112; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class26.field455[var1];
            }
            class136 var6 = class233.field3682[var5];
            if (var6 != null && var6.field4758 > 0) {
                var6.field4758--;
                if (var6.field4758 == 0) {
                    var6.field4695 = null;
                }
            }
        }
        field2840++;
        if (arg0 != -26069) {
            method1292(-116);
        }
        for (int var2 = 0; var2 < class117.field1782; var2++) {
            int var3 = class255.field4084[var2];
            class161 var4 = class116.field1781[var3];
            if (var4 != null && var4.field4758 > 0) {
                var4.field4758--;
                if (var4.field4758 == 0) {
                    var4.field4695 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)Lha;")
    public static final class31 method1296(int arg0) {
        field2834++;
        class31 var1 = new class31(34);
        var1.method305(11, true);
        var1.method305(class150.field2228, true);
        var1.method305(class122.field1835 ? 1 : 0, true);
        var1.method305(class109.field1685 ? 1 : 0, true);
        var1.method305(class292.field4536 ? 1 : 0, true);
        var1.method305(class201.field3105 ? 1 : 0, true);
        var1.method305(class140.field2089 ? 1 : 0, true);
        var1.method305(class178.field2730 ? 1 : 0, true);
        var1.method305(class106.field1665 ? 1 : 0, true);
        if (arg0 <= 98) {
            method1294(-104, 78, 114, 1, -16, (byte) 53, -127, 101);
        }
        var1.method305(class216.field3309 ? 1 : 0, true);
        var1.method305(client.field2386, true);
        var1.method305(class142.field2111 ? 1 : 0, true);
        var1.method305(class218.field3335 ? 1 : 0, true);
        var1.method305(class40.field678 ? 1 : 0, true);
        var1.method305(class94.field1483, true);
        var1.method305(class189.field2971 ? 1 : 0, true);
        var1.method305(class174.field2684, true);
        var1.method305(class85.field1274, true);
        var1.method305(class70.field1106, true);
        var1.method281((byte) -109, class296.field4688);
        var1.method281((byte) -126, class164.field2472);
        var1.method305(class249.method1685(), true);
        var1.method258(class48.field793, -1527329320);
        var1.method305(class42.field709, true);
        var1.method305(class57.field897 ? 1 : 0, true);
        var1.method305(class189.field2972 ? 1 : 0, true);
        var1.method305(class84.field1259, true);
        var1.method305(class58.field904 ? 1 : 0, true);
        var1.method305(class230.field3648 ? 1 : 0, true);
        return var1;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
    public static final void method1297(int arg0) {
        field2833++;
        class240.field3826.method1762(228, true);
        class276.field4395++;
        class240.field3826.method313(-6968, 0L);
        int var1 = -35 % ((arg0 - 6) / 58);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLub;Lub;)V")
    public static final void method1298(byte arg0, class92 arg1, class92 arg2) {
        field2845++;
        class117.field1786 = class300.method2013(0, 106, arg2, arg1, class172.field2639);
        class168.field2528 = (class12) class117.field1786;
        class276.field4391 = class300.method2013(0, 101, arg2, arg1, field2831);
        if (arg0 > -83) {
            field2836 = 70L;
        }
        class73.field1118 = class300.method2013(0, 110, arg2, arg1, class297.field4779);
    }
}
