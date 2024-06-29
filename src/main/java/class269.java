import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class269 {

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public int field4745 = -1;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "J")
    public static long field4741 = 0L;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "Loh;")
    private static class263 field4749 = class253.method1681(-126, "Loaded wordpack");

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Loh;")
    public static class263 field4742 = field4749;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lm;")
    public class113 field4743;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Lue;")
    public static class86 field4739;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Lue;")
    public static class86 field4751;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "[I")
    public int[] field4740;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[Lfd;")
    public static class119[] field4738;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "[Loh;")
    public class263[] field4748;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static final void method1816(byte arg0) {
        for (int var1 = 0; var1 < class112.field2101; var1++) {
            class185 var2 = class107.method720(var1, (byte) -122);
            if (var2 != null && var2.field3349 == 0) {
                class154.field2787[var1] = 0;
                class48.field1038[var1] = 0;
            }
        }
        client.field2765 = new class5(16);
        if (arg0 < 86) {
            method1818(-95, 118, 112);
        }
        field4747++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
    public static final int method1817(int arg0, int arg1) {
        field4753++;
        if (arg1 > -55) {
            field4739 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V")
    public static final void method1818(int arg0, int arg1, int arg2) {
        field4752++;
        int var3 = arg1--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class212.field3789[arg1];
        int var5 = class251.field4364[arg1];
        if (arg2 == 0) {
            class180.field3282++;
            class154.field2792.method1516(-95, 35);
            class154.field2792.method1288((byte) -30, var3 + var3 + 3);
        }
        if (arg2 == 1) {
            class154.field2792.method1516(-36, 75);
            class103.field1959++;
            class154.field2792.method1288((byte) -80, var3 + 3 - (-var3 + -14));
        }
        if (arg2 == 2) {
            class154.field2792.method1516(120, 134);
            class154.field2792.method1288((byte) -107, var3 + var3 + 3);
            class233.field4072++;
        }
        class154.field2792.method1299(var4 + class142.field2596, 4929);
        class154.field2792.method1276(class93.field1844 + var5, -102);
        if (arg0 > -91) {
            field4751 = null;
        }
        class194.field3465 = class212.field3789[0];
        class105.field1988 = class251.field4364[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class154.field2792.method1287((byte) 114, class251.field4364[arg1] - var5);
            class154.field2792.method1284(class212.field3789[arg1] - var4, 0);
        }
        class154.field2792.method1321(class248.field4342[82] ? 1 : 0, (byte) 115);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static final void method1819(int arg0) {
        class101.field1932.method825(0);
        class46.field989.method825(0);
        if (arg0 > 23) {
            field4746++;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 2998) {
            return;
        }
        field4754++;
        int var9 = arg3 - arg6;
        int var10 = arg4 - arg8;
        int var11 = (arg0 - arg5 << 16) / var9;
        int var12 = (arg1 - arg7 << 16) / var10;
        class2.method10(arg3, var12, 0, arg4, var11, arg5, arg2 ^ 0xFFF449, arg7, arg6, arg8, 0);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public static void method1821(byte arg0) {
        field4738 = null;
        field4751 = null;
        field4749 = null;
        field4742 = null;
        field4739 = null;
        if (arg0 != 39) {
            field4739 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)V")
    public static final void method1822(boolean arg0, int arg1) {
        field4750++;
        class108.field2038.method829(arg1, (byte) 15);
        if (!arg0) {
            field4742 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILpc;)I")
    public static final int method1823(int arg0, int arg1, class21 arg2) {
        field4736++;
        if (arg2.field579 == null || arg0 >= arg2.field579.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg2.field579[arg0];
            byte var5 = 0;
            int var6 = 0;
            if (arg1 != 23836) {
                field4738 = null;
            }
            while (true) {
                int var7 = 0;
                byte var8 = 0;
                int var9 = var4[var6++];
                if (var9 == 0) {
                    return var3;
                }
                if (var9 == 1) {
                    var7 = class251.field4369[var4[var6++]];
                }
                if (var9 == 15) {
                    var8 = 1;
                }
                if (var9 == 16) {
                    var8 = 2;
                }
                if (var9 == 2) {
                    var7 = class73.field1541[var4[var6++]];
                }
                if (var9 == 17) {
                    var8 = 3;
                }
                if (var9 == 3) {
                    var7 = class276.field4829[var4[var6++]];
                }
                if (var9 == 4) {
                    int var10 = var4[var6++] << 16;
                    int var11 = var10 + var4[var6++];
                    class21 var12 = class8.method55(65535, var11);
                    int var13 = var4[var6++];
                    if (var13 != -1 && (!class92.method649(-32508, var13).field1500 || class86.field1698)) {
                        for (int var14 = 0; var14 < var12.field469.length; var14++) {
                            if ((var13 + 1) == var12.field469[var14]) {
                                var7 += var12.field618[var14];
                            }
                        }
                    }
                }
                if (var9 == 5) {
                    var7 = class48.field1038[var4[var6++]];
                }
                if (var9 == 6) {
                    var7 = client.field2767[class73.field1541[var4[var6++]] - 1];
                }
                if (var9 == 7) {
                    var7 = class48.field1038[var4[var6++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var7 = class229.field4018.field2522;
                }
                if (var9 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class77.field1581[var15]) {
                            var7 += class73.field1541[var15];
                        }
                    }
                }
                if (var9 == 10) {
                    int var16 = var4[var6++] << 16;
                    int var17 = var16 + var4[var6++];
                    class21 var18 = class8.method55(65535, var17);
                    int var19 = var4[var6++];
                    if (var19 != -1 && (!class92.method649(-32508, var19).field1500 || class86.field1698)) {
                        for (int var20 = 0; var20 < var18.field469.length; var20++) {
                            if ((var19 + 1) == var18.field469[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var7 = class86.field1724;
                }
                if (var9 == 12) {
                    var7 = class120.field2224;
                }
                if (var9 == 13) {
                    int var21 = class48.field1038[var4[var6++]];
                    int var22 = var4[var6++];
                    var7 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var23 = var4[var6++];
                    var7 = class196.method1338(var23, (byte) 37);
                }
                if (var9 == 18) {
                    var7 = (class229.field4018.field4688 >> 7) + class93.field1844;
                }
                if (var9 == 19) {
                    var7 = (class229.field4018.field4705 >> 7) + class142.field2596;
                }
                if (var9 == 20) {
                    var7 = var4[var6++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var3 += var7;
                    }
                    if (var5 == 1) {
                        var3 -= var7;
                    }
                    if (var5 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var5 == 3) {
                        var3 *= var7;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }
}
