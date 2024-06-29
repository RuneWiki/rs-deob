import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class374 {

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Ll;")
    public class262 field5256 = new class262();

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Z")
    public boolean field5265 = false;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field5255 = 50;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[I")
    public static int[] field5249 = new int[field5255];

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[I")
    public static int[] field5257 = new int[field5255];

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
    public static int[] field5251 = new int[field5255];

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "[I")
    public static int[] field5262 = new int[field5255];

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[I")
    public static int[] field5250 = new int[field5255];

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field5260 = new String[field5255];

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[I")
    public static int[] field5252 = new int[field5255];

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public int field5263;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLjava/lang/String;I)I")
    public static final int method2336(byte arg0, String arg1, int arg2) {
        if (arg0 >= -77) {
            field5250 = null;
        }
        field5264++;
        return class6.method36(122, arg2, arg1, true);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[B)Ldd;")
    public static final class213 method2337(int arg0, byte[] arg1) {
        field5253++;
        class213 var2 = new class213();
        class289 var3 = new class289(arg1);
        var3.field3938 = var3.field3882.length - 2;
        int var4 = var3.method1853(arg0 ^ 0xFFFFFF9C);
        if (arg0 != 38) {
            return null;
        }
        int var5 = var3.field3882.length - var4 - 12 - 2;
        var3.field3938 = var5;
        int var6 = var3.method1856((byte) 54);
        var2.field2948 = var3.method1853(-52);
        var2.field2946 = var3.method1853(-124);
        var2.field2955 = var3.method1853(91);
        var2.field2951 = var3.method1853(-37);
        int var7 = var3.method1861((byte) -72);
        if (var7 > 0) {
            var2.field2947 = new class71[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1853(-86);
                class71 var10 = new class71(class443.method2751(true, var9));
                var2.field2947[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1856((byte) 67);
                    int var12 = var3.method1856((byte) 112);
                    var10.method612((long) var11, -1, new class193(var12));
                }
            }
        }
        var3.field3938 = 0;
        var2.field2960 = var3.method1845((byte) 107);
        var2.field2959 = new int[var6];
        var2.field2957 = new int[var6];
        var2.field2953 = new String[var6];
        int var13 = 0;
        while (var3.field3938 < var5) {
            int var14 = var3.method1853(124);
            if (var14 == 3) {
                var2.field2953[var13] = var3.method1871(-1).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field2959[var13] = var3.method1861((byte) -72);
            } else {
                var2.field2959[var13] = var3.method1856((byte) 108);
            }
            var2.field2957[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([Loa;Lpe;IIZLsa;)V")
    public static final void method2338(class151[] arg0, class391 arg1, int arg2, int arg3, boolean arg4, class411 arg5) {
        if (arg2 >= -79) {
            method2340((byte) 67, (class63) null);
        }
        if (!arg4) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class116.field1621; var7++) {
                    for (int var8 = 0; var8 < class385.field5425; var8++) {
                        if ((class7.field57[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class7.field57[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg0[var9].method1160(var8, -23407, var7);
                            }
                        }
                    }
                }
            }
        }
        field5258++;
        int[][] var10 = new int[class116.field1621][class385.field5425];
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var13 = 0; var13 < class385.field5425; var13++) {
                class399.field5586[var13] = 0;
                class134.field1913[var13] = 0;
                class1.field4[var13] = 0;
                class90.field1346[var13] = 0;
                class236.field3273[var13] = 0;
            }
            for (int var14 = -5; var14 < class116.field1621; var14++) {
                for (int var15 = 0; var15 < class385.field5425; var15++) {
                    int var24 = var14 + 5;
                    int var10002;
                    if (var24 < class116.field1621) {
                        int var25 = class422.field5901[var11][var24][var15] & 0xFF;
                        if (var25 > 0) {
                            class101 var26 = class447.method2790(var25 - 1, -68);
                            class399.field5586[var15] += var26.field1492;
                            class134.field1913[var15] += var26.field1501;
                            class1.field4[var15] += var26.field1489;
                            class90.field1346[var15] += var26.field1502;
                            var10002 = class236.field3273[var15]++;
                        }
                    }
                    int var27 = var14 - 5;
                    if (var27 >= 0) {
                        int var28 = class422.field5901[var11][var27][var15] & 0xFF;
                        if (var28 > 0) {
                            class101 var29 = class447.method2790(var28 - 1, -58);
                            class399.field5586[var15] -= var29.field1492;
                            class134.field1913[var15] -= var29.field1501;
                            class1.field4[var15] -= var29.field1489;
                            class90.field1346[var15] -= var29.field1502;
                            var10002 = class236.field3273[var15]--;
                        }
                    }
                }
                if (var14 >= 0) {
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < class385.field5425; var21++) {
                        int var22 = var21 + 5;
                        if (class385.field5425 > var22) {
                            var20 += class236.field3273[var22];
                            var17 += class134.field1913[var22];
                            var19 += class90.field1346[var22];
                            var16 += class399.field5586[var22];
                            var18 += class1.field4[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var16 -= class399.field5586[var23];
                            var19 -= class90.field1346[var23];
                            var17 -= class134.field1913[var23];
                            var18 -= class1.field4[var23];
                            var20 -= class236.field3273[var23];
                        }
                        if (var21 >= 0 && var19 > 0 && var20 > 0) {
                            var10[var14][var21] = class263.method1696(var17 / var20, 92, var16 * 256 / var19, var18 / var20);
                        }
                    }
                }
            }
            class190.method1365(class116.field1621, var11, arg5, class385.field5425, (byte) 0, arg1, class91.field1351[var11], arg4, var10, class77.field1152[var11], class236.field3283[var11], class422.field5901[var11], class236.field3287[var11]);
            class422.field5901[var11] = null;
            class236.field3283[var11] = null;
            class236.field3287[var11] = null;
            class77.field1152[var11] = null;
        }
        if (!arg4) {
            if (class385.field5429) {
                class150.method1149();
            }
            if (class179.field2633 != 0) {
                class435.method2698();
            }
        }
        for (int var12 = 0; var12 < arg3; var12++) {
            class91.field1351[var12].method1513();
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method2339(int arg0) {
        field5250 = null;
        int var1 = -120 % ((arg0 + 24) / 52);
        field5249 = null;
        field5252 = null;
        field5262 = null;
        field5257 = null;
        field5251 = null;
        field5260 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLr;)Ljava/lang/String;")
    public static final String method2340(byte arg0, class63 arg1) {
        field5254++;
        if (arg0 != -116) {
            field5250 = null;
        }
        return arg1.field959 == null || arg1.field959.length() <= 0 ? arg1.field960 : arg1.field960 + class273.field3665 + arg1.field959;
    }
}
