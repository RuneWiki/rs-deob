import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class50 extends class157 {

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "Z")
    private boolean field986 = true;

    @OriginalMember(owner = "client!ej", name = "db", descriptor = "Z")
    private boolean field995 = true;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
    public static int field989 = 0;

    @OriginalMember(owner = "client!ej", name = "fb", descriptor = "[[I")
    public static int[][] field997 = new int[104][104];

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ej", name = "cb", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!ej", name = "eb", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "[I")
    public static int[] field987;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "[[Lji;")
    public static class42[][] field984;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "(I)V")
    public static final void method379(int arg0) {
        if (arg0 >= -118) {
            method382(-18, -86);
        }
        ++field990;
        class1.field20.method664(122);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field985;
        if (arg4 >= 128 && ~arg3 <= -129 && arg4 <= 13056 && arg3 <= 13056) {
            int var8 = -arg6 + class94.method661(arg3, 19452, class99.field1937, arg4);
            int var9 = arg3 - class103.field1990;
            int var10 = arg4 - class60.field1213;
            int var11 = var8 - class183.field3312;
            int var12 = class15.field280[class182.field3304];
            int var13 = class15.field278[class182.field3304];
            int var14 = class15.field278[class179.field3256];
            if (arg0 > -13) {
                field996 = 42;
            }
            int var15 = class15.field280[class179.field3256];
            int var16 = var9 * var14 + var10 * var15 >> 16;
            int var17 = var9 * var15 + -(var10 * var14) >> 16;
            int var19 = var11 * var12 + -(var13 * var17) >> 16;
            int var20 = var11 * var13 - -(var12 * var17) >> 16;
            if (var20 < 50) {
                class97.field1891 = -1;
                class241.field4372 = -1;
            } else {
                class241.field4372 = (var19 << 9) / var20 + arg1;
                class97.field1891 = (var16 << 9) / var20 + arg7;
            }
        } else {
            class241.field4372 = -1;
            class97.field1891 = -1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method381(Component arg0, int arg1) {
        arg0.removeKeyListener(class226.field4117);
        arg0.removeFocusListener(class226.field4117);
        ++field980;
        if (arg1 != 0) {
            field989 = -56;
        }
        class60.field1202 = -1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        ++field988;
        int[][] var3 = super.field2872.method533(arg1, arg0 + 2);
        if (arg0 != 1) {
            method381((Component) null, 31);
        }
        if (super.field2872.field1434) {
            int[][] var4 = this.method1093(!this.field995 ? arg1 : -arg1 + class42.field859, 0, 64);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var4[2];
            int[] var9 = var4[0];
            int[] var10 = var3[1];
            if (this.field986) {
                for (int var11 = 0; ~class226.field4124 < ~var11; ++var11) {
                    var6[var11] = var9[class249.field4490 - var11];
                    var10[var11] = var5[-var11 + class249.field4490];
                    var7[var11] = var8[-var11 + class249.field4490];
                }
            } else {
                for (int var12 = 0; var12 < class226.field4124; ++var12) {
                    var6[var12] = var9[var12];
                    var10[var12] = var5[var12];
                    var7[var12] = var8[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)V")
    public static final void method382(int arg0, int arg1) {
        ++field992;
        class195 var2 = class178.method1229(arg1, 1, 8);
        var2.method1340(true);
        int var3 = 17 / ((arg0 - 84) / 42);
    }

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "(I)Ltf;")
    public static final class106 method383(int arg0) {
        ++field993;
        class106 var1 = new class106(31);
        var1.method773(arg0 + -13955, 8);
        var1.method773(arg0 ^ -1379, class128.field2469);
        var1.method773(arg0 + -13955, !class234.field4212 ? 0 : 1);
        var1.method773(-6385, !class129.field2484 ? 0 : 1);
        var1.method773(-6385, class52.field1022 ? 1 : 0);
        var1.method773(-6385, !class84.field1681 ? 0 : 1);
        var1.method773(arg0 ^ -1379, !class161.field2917 ? 0 : 1);
        if (arg0 != 7570) {
            field983 = 50;
        }
        var1.method773(arg0 + -13955, class9.field185 ? 1 : 0);
        var1.method773(-6385, !class39.field662 ? 0 : 1);
        var1.method773(arg0 ^ -1379, class234.field4209 ? 1 : 0);
        var1.method773(-6385, class254.field4587);
        var1.method773(arg0 ^ -1379, !class163.field2961 ? 0 : 1);
        var1.method773(-6385, !class145.field2671 ? 0 : 1);
        var1.method773(arg0 ^ -1379, class281.field4940 ? 1 : 0);
        var1.method773(-6385, class202.field3639);
        var1.method773(-6385, class71.field1343 ? 1 : 0);
        var1.method773(-6385, class75.field1406);
        var1.method773(-6385, class258.field4662);
        var1.method773(arg0 ^ -1379, class176.field3202);
        var1.method740(255, class262.field4714);
        var1.method740(255, class150.field2741);
        var1.method773(arg0 + -13955, class221.method1561());
        var1.method758(class70.field1338, 1469334200);
        var1.method773(-6385, class54.field1063);
        var1.method773(-6385, class68.field1309 ? 1 : 0);
        var1.method773(-6385, class69.field1319 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        if (arg0 != -98) {
            return null;
        } else {
            int[] var3 = super.field2879.method1269(arg1, arg0 ^ -17853);
            ++field994;
            if (super.field2879.field3363) {
                int[] var4 = this.method1097((byte) 75, 0, !this.field995 ? arg1 : -arg1 + class42.field859);
                if (this.field986) {
                    for (int var5 = 0; ~class226.field4124 < ~var5; ++var5) {
                        var3[var5] = var4[-var5 + class249.field4490];
                    }
                } else {
                    class270.method1843(var4, 0, var3, 0, class226.field4124);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class50() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        ++field991;
        if (arg1 <= -29) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        super.field2877 = ~arg2.method774((byte) 96) == -2;
                    }
                } else {
                    this.field995 = ~arg2.method774((byte) 89) == -2;
                }
            } else {
                this.field986 = ~arg2.method774((byte) 96) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "(I)V")
    public static void method384(int arg0) {
        field987 = null;
        if (arg0 != 2909) {
            method381((Component) null, 71);
        }
        field997 = null;
        field984 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IJ)V")
    public static final void method385(int arg0, long arg1) {
        ++field982;
        if (arg1 != 0L) {
            for (int var3 = 0; class3.field38 > var3; ++var3) {
                if (class179.field3253[var3] == arg1) {
                    --class3.field38;
                    ++class185.field3330;
                    for (int var4 = var3; ~class3.field38 < ~var4; ++var4) {
                        class286.field5049[var4] = class286.field5049[var4 + 1];
                        class198.field3541[var4] = class198.field3541[var4 + 1];
                        class258.field4666[var4] = class258.field4666[var4 + 1];
                        class179.field3253[var4] = class179.field3253[var4 - -1];
                        class84.field1678[var4] = class84.field1678[var4 - -1];
                        class8.field156[var4] = class8.field156[var4 + 1];
                    }
                    class264.field4744 = class54.field1069;
                    class84.field1677.method287((byte) 118, 48);
                    class84.field1677.method756(arg1, (byte) 112);
                    break;
                }
            }
            if (arg0 != 20637) {
                field989 = 66;
            }
        }
    }
}
