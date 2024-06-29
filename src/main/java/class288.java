import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class288 extends class96 {

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lql;")
    public static class87 field4483 = new class87();

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field4489 = -1;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field4491 = 0;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4495 = "shake:";

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "F")
    public static float field4485;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Ll;")
    public static class133 field4494;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[I")
    public static int[] field4490;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "[Lwj;")
    public static class270[] field4493;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Ljava/lang/String;", line = 4)
    public static final String method1979(int arg0, int arg1) {
        field4492++;
        if (arg1 > -28) {
            return (String) null;
        } else if (class275.field4252[arg0].length() > 0) {
            return class32.field468[arg0] + class317.field4955 + class275.field4252[arg0];
        } else {
            return class32.field468[arg0];
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLl;)V", line = 20)
    public static final void method1980(byte arg0, class133 arg1) {
        field4488++;
        if (class341.field5322) {
            return;
        }
        if (class94.field1516) {
            class167.method1185();
        } else {
            class109.method818();
        }
        class186.field2785 = class189.method1346((byte) -85, arg1, class53.field900);
        int var2 = class322.field5024;
        int var3 = var2 * 956 / 503;
        class186.field2785.method624((class188.field2816 - var3) / 2, 0, var3, var2);
        if (arg0 < 75) {
            field4490 = (int[]) null;
        }
        class335.field5251 = class50.method426(class189.field2846, (byte) 85, arg1);
        class335.field5251.method1210(class188.field2816 / 2 - (class335.field5251.field3972 / 2), 18);
        class341.field5322 = true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)V", line = 54)
    public static final void method1981(int arg0, byte arg1) {
        field4486++;
        class338 var2 = class195.method1391(9, (byte) -92, arg0);
        if (arg1 > 60) {
            var2.method2347(true);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 71)
    public static void method1982(int arg0) {
        field4490 = null;
        field4494 = null;
        field4493 = null;
        field4495 = null;
        if (arg0 == 0) {
            field4483 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIBI)V", line = 95)
    public static final void method1983(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 >= 0) {
            return;
        }
        field4487++;
        if (class119.field1817 <= arg0 && arg0 <= class141.field2187) {
            int var5 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg2);
            int var6 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1);
            class103.method745(-53, var6, var5, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIBIIIIII)V", line = 115)
    public static final void method1984(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4484++;
        int var9 = -18 / ((arg2 + 61) / 62);
        for (int var10 = 0; var10 < class162.field2445.field4696; var10++) {
            if (class162.field2445.method2050(var10, (byte) 42)) {
                int[] var11 = class214.field3256.method8(class162.field2445.field4698[var10] & 0x3FFF, (byte) 118, (class162.field2445.field4698[var10] & 0x386CD11E) >> 28, (class162.field2445.field4698[var10] & 0xFFFFCD4) >> 14);
                if (var11 != null) {
                    int var12 = var11[1] - class84.field1311;
                    int var13 = class333.field5202 - (var11[2] - (class233.field3706 - 1));
                    int var14 = arg5 + ((arg4 - arg5) * (var12 - arg8) / (arg7 - arg8));
                    int var15 = class162.field2445.method2047(var10, (byte) -121);
                    int var16 = 16777215;
                    int var17 = arg1 + ((var13 - arg0) * (arg3 - arg1) / (arg6 - arg0));
                    class126 var18 = null;
                    if (var15 == 0) {
                        if ((double) class165.field2472 == 3.0D) {
                            var18 = class253.field3987;
                        }
                        if ((double) class165.field2472 == 4.0D) {
                            var18 = class295.field4565;
                        }
                        if ((double) class165.field2472 == 6.0D) {
                            var18 = class337.field5273;
                        }
                        if ((double) class165.field2472 >= 8.0D) {
                            var18 = class51.field827;
                        }
                    }
                    if (var15 == 1) {
                        if ((double) class165.field2472 == 3.0D) {
                            var18 = class337.field5273;
                        }
                        if ((double) class165.field2472 == 4.0D) {
                            var18 = class51.field827;
                        }
                        if ((double) class165.field2472 == 6.0D) {
                            var18 = class278.field4286;
                        }
                        if ((double) class165.field2472 >= 8.0D) {
                            var18 = class41.field614;
                        }
                    }
                    if (var15 == 2) {
                        var16 = 16755200;
                        if ((double) class165.field2472 == 3.0D) {
                            var18 = class278.field4286;
                        }
                        if ((double) class165.field2472 == 4.0D) {
                            var18 = class41.field614;
                        }
                        if ((double) class165.field2472 == 6.0D) {
                            var18 = class290.field4513;
                        }
                        if ((double) class165.field2472 >= 8.0D) {
                            var18 = class265.field4132;
                        }
                    }
                    if (class162.field2445.field4690[var10] != -1) {
                        var16 = class162.field2445.field4690[var10];
                    }
                    if (var18 != null) {
                        int var19 = class112.field1736.method2252(class162.field2445.field4693[var10], (int[]) null, class65.field1020);
                        int var20 = var17 - var18.method916() * (var19 - 1) / 2;
                        int var21 = var20 + var18.method908() / 2;
                        for (int var22 = 0; var22 < var19; var22++) {
                            String var23 = class65.field1020[var22];
                            if (var19 - 1 > var22) {
                                var23 = var23.substring(0, var23.length() - 4);
                            }
                            var18.method913(var23, var14, var21, var16, true);
                            var21 += var18.method916();
                        }
                    }
                }
            }
        }
    }
}
