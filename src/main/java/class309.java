import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class class309 extends class270 {

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "Lbn;")
    public static class404 field4008;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "[I")
    public int[] field4007;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "[[B")
    public static byte[][] field4014;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method711(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIBZII)V")
    public static final void method1758(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        field4010++;
        if (class97.field1074 == null) {
            class453.field6284.method3552(arg0, arg1, 7, -16777216, arg4, arg5);
        } else if (class377.field4914.field4641 >= 0 && class377.field4914.field4641 < class399.field5338 * 512 && class377.field4914.field4647 >= 0 && class377.field4914.field4647 < class349.field4567 * 512) {
            class273.field3463++;
            if (class377.field4914 != null && (class377.field4914.field4641 - (class377.field4914.method1656(true) - 1) * 256 >> 9) == class377.field4897 && (class377.field4914.field4647 + 256 - (class377.field4914.method1656(true) * 256) >> 9) == class319.field4130) {
                class319.field4130 = -1;
                class377.field4897 = -1;
                class215.method1284(arg2 - 42);
            }
            class103.method623((byte) -113);
            if (!arg3) {
                class215.method1283(10208);
            }
            class393.method2144(121);
            class400.method2188(arg0, true, arg4, arg1, (byte) -128, arg5);
            int var6 = class549.field7839;
            int var7 = class613.field8657;
            int var8 = class435.field5887;
            int var9 = class285.field3658;
            if (class5.field41 == 1) {
                int var12 = (int) class89.field958;
                if (var12 < (class631.field8957 >> 8)) {
                    var12 = class631.field8957 >> 8;
                }
                if (class347.field4528[4] && var12 < (class306.field3999[4] + 128)) {
                    var12 = class306.field3999[4] + 128;
                }
                int var13 = (int) class90.field1041 + class422.field5626 & 0x3FFF;
                class195.method1130(class656.field9368, class363.method1995(class353.field4625, class377.field4914.field4647, arg2 ^ 0x4F211650, class377.field4914.field4641) - 200, -25130, var8, class534.field7634, (var12 >> 3) * 3 + 600 << 2, var13, var12);
            } else if (class5.field41 == 4) {
                int var10 = (int) class89.field958;
                if (var10 < (class631.field8957 >> 8)) {
                    var10 = class631.field8957 >> 8;
                }
                if (class347.field4528[4] && var10 < (class306.field3999[4] + 128)) {
                    var10 = class306.field3999[4] + 128;
                }
                int var11 = (int) class90.field1041 & 0x3FFF;
                class195.method1130(class656.field9368, class363.method1995(class353.field4625, class437.field6085, -1327568407, class638.field9053) - 200, arg2 + -25059, var8, class534.field7634, (var10 >> 3) * 3 + 600 << 2, var11, var10);
            } else if (class5.field41 == 5) {
                class205.method1248(var8, 1);
            }
            int var14 = class345.field4493;
            int var15 = class150.field1707;
            int var16 = class662.field9411;
            int var17 = class654.field9344;
            int var18 = class587.field8342;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class347.field4528[var19]) {
                    int var22 = (int) ((double) (-class145.field1626[var19]) + (double) (class145.field1626[var19] * 2 + 1) * Math.random() + Math.sin((double) class445.field6124[var19] / 100.0D * (double) class381.field4953[var19]) * (double) class306.field3999[var19]);
                    if (var19 == 1) {
                        class150.field1707 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class587.field8342 = class587.field8342 + var22 & 0x3FFF;
                    }
                    if (var19 == 0) {
                        class345.field4493 += var22 << 2;
                    }
                    if (var19 == 2) {
                        class662.field9411 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class654.field9344 += var22;
                        if (class654.field9344 < 1024) {
                            class654.field9344 = 1024;
                        } else if (class654.field9344 > 3072) {
                            class654.field9344 = 3072;
                        }
                    }
                }
            }
            if (class345.field4493 < 0) {
                class345.field4493 = 0;
            }
            if (class662.field9411 < 0) {
                class662.field9411 = 0;
            }
            if (class345.field4493 > (class181.field2222 << 9) - 1) {
                class345.field4493 = (class181.field2222 << 9) - 1;
            }
            if (((class272.field3451 << 9) - 1) < class662.field9411) {
                class662.field9411 = (class272.field3451 << 9) - 1;
            }
            class390.method2131(-54);
            class126.method726((byte) -12);
            class453.field6284.method314(var9, var7, var9 + var6, var7 + var8);
            class453.field6284.method358();
            int var20 = class631.field8956;
            if (field4008 == null) {
                class453.field6284.method343(var20);
            } else {
                field4008.method2198(var7, var9, class554.field7898 << 3, class654.field9344, -16, var6, var20, class453.field6284, var8, class587.field8342);
            }
            class73.method470((byte) 84);
            class139.field1593.method227(class345.field4493, class150.field1707, class662.field9411, -class654.field9344 & 0x3FFF, -class587.field8342 & 0x3FFF, -class352.field4616 & 0x3FFF);
            class453.field6284.method311(class139.field1593);
            class453.field6284.method306(var9 + (var6 / 2), var7 - -(var8 / 2), class304.field3978 << 1, class304.field3978 << 1);
            class84.method534(class304.field3978 << 1, var8 / 2 + var7, class304.field3978 << 1, (byte) 22, var9 + (var6 / 2));
            class397.method2169(class345.field4493, class150.field1707, -class654.field9344 & 0x3FFF, -class352.field4616 & 0x3FFF, class662.field9411, -class587.field8342 & 0x3FFF, -51);
            if (arg2 != -71) {
                method1759(117);
            }
            byte var21 = class601.field8530.method1830(class150.field1711, 0) == 2 ? (byte) class273.field3463 : 1;
            class517.method2948(class453.field6284, class469.field6549, class665.field9458, class139.field1593, class345.field4493, class150.field1707, class662.field9411, class242.field3146, class319.field4129, class247.field3181, class406.field5417, class353.field4629, class609.field8603, class377.field4914.field4638 + 1, var21, class377.field4914.field4641 >> 9, class377.field4914.field4647 >> 9, !class601.field8530.field2861);
            class73.method470((byte) 84);
            if (class351.field4601 == 10) {
                class59.method397(var7, var9, var8, 256, var6, 63, 256);
                class656.method3702(var9, 256, 256, true, var8, var6, var7);
                class224.method1314(var7, 256, var9, arg2 + 73, var8, var6, 256);
                class246.method1423(var7, var9, arg2 + 171, var6, var8);
            }
            class626.method3512();
            class662.field9411 = var16;
            class654.field9344 = var17;
            class345.field4493 = var14;
            class150.field1707 = var15;
            class587.field8342 = var18;
            if (class163.field1940 && class448.field6156.method2478(false) == 0) {
                class163.field1940 = false;
            }
            if (class163.field1940) {
                class453.field6284.method3552(var8, var6, arg2 ^ 0xFFFFFFBE, -16777216, var7, var9);
                class1.method1(arg2 + 183, class221.field2684.method1296(class226.field2899, (byte) -111), false, class404.field5386);
            }
        } else {
            class453.field6284.method3552(arg0, arg1, 7, -16777216, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static final void method1759(int arg0) {
        int var1 = 101 / ((-arg0 - 40) / 59);
        class574.field8156 = 0;
        class593.field8430 = 0;
        class140.field1606 = 0;
        class491.field7120 = 0;
        field4015++;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
    public static void method1760(int arg0) {
        if (arg0 > 11) {
            field4008 = null;
            field4014 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
    public abstract void method709(int arg0, Graphics arg1, int arg2, int arg3, int arg4, byte arg5);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method710(int arg0, Graphics arg1, int arg2, int arg3);
}
