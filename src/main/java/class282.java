import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class282 extends class87 {

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "[I")
    public static int[] field4547 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "[I")
    public static int[] field4548 = new int[5];

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4550 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "Llc;")
    public static class270 field4546;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "[Lnl;")
    private class227[] field4549;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "[Llf;")
    public static class94[] field4552;

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class282() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
    public static final void method1948(int arg0) {
        class129.field2155 = arg0;
        for (int var1 = 0; var1 < class159.field2481; ++var1) {
            for (int var2 = 0; var2 < class7.field67; ++var2) {
                if (class223.field3286[arg0][var1][var2] == null) {
                    class223.field3286[arg0][var1][var2] = new class313(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBILmg;III)Lmg;")
    public static final class58 method1949(int arg0, byte arg1, int arg2, class58 arg3, int arg4, int arg5, int arg6) {
        long var7 = (long) arg0;
        ++field4551;
        class58 var9 = (class58) class135.field2209.method1418(var7, arg1 + 15);
        if (var9 == null) {
            class96 var10 = class96.method760(class193.field2855, arg0, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method759(64, 768, -50, -10, -50);
            class135.field2209.method1421(var7, var9, (byte) -95);
        }
        int var11 = arg3.method427();
        if (arg1 != -15) {
            field4547 = null;
        }
        int var12 = arg3.method425();
        int var13 = arg3.method415();
        int var14 = arg3.method417();
        class58 var15 = var9.method419(true, true, true);
        if (~arg2 != -1) {
            var15.method430(arg2);
        }
        class257 var16 = (class257) var15;
        if (arg6 != class113.method851(class37.field474, -25, arg5 + var13, arg4 + var11) || arg6 != class113.method851(class37.field474, 115, arg5 + var14, arg4 - -var12)) {
            for (int var17 = 0; var17 < var16.field3886; ++var17) {
                var16.field3888[var17] += -arg6 + class113.method851(class37.field474, 93, var16.field3899[var17] + arg5, var16.field3896[var17] + arg4);
            }
            var16.field3892 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
    public static final void method1950(int arg0) {
        class17.method117(5, 0);
        ++field4545;
        class268.method1849((byte) 76, 5);
        class52.method312(5, 255);
        class232.method1605(255, 5);
        class260.method1787(1005, 5);
        class267.method1833(5, (byte) 55);
        class78.method584(1023, 5);
        class110.method838(5, 904);
        class199.method1402(-5072, 5);
        class284.method1958(arg0, -64);
        class255.method1754(false, 5);
        class57.method402(false, 5);
        class242.method1655(-56, 5);
        class169.method1205(1, 5);
        class253.method1740(5, (byte) -2);
        class217.method1515(121, 5);
        class55.method392(5, arg0 + 21934);
        class286.method1961(256, 5);
        class313.method2106(arg0 + -5, 50);
        class246.method1693(5, 0);
        class55.method391(5, arg0 + -4102);
        class38.field494.method1416(5, arg0 ^ 5);
        class71.field1131.method1416(5, 0);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field1381 = arg0.method366(arg2 + -42150) == 1;
            }
        } else {
            this.field4549 = new class227[arg0.method366(arg2 ^ -9302)];
            for (int var4 = 0; var4 < this.field4549.length; ++var4) {
                int var5 = arg0.method366(arg2 ^ -9302);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field4549[var4] = class245.method1691(arg0, (byte) -28);
                            }
                        } else {
                            this.field4549[var4] = class155.method1133(1, arg0);
                        }
                    } else {
                        this.field4549[var4] = class180.method1277(arg0, 0);
                    }
                } else {
                    this.field4549[var4] = class181.method1278(arg0, 0);
                }
            }
        }
        if (arg2 == 25645) {
            ++field4542;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[[I)V")
    private final void method1951(int arg0, int[][] arg1) {
        int var3 = class206.field3032;
        int var4 = class123.field2045;
        ++field4553;
        class20.method144(arg1, 255);
        class103.method810(class32.field406, class181.field2722, -101, 0, 0);
        if (this.field4549 != null) {
            for (int var5 = 0; ~this.field4549.length < ~var5; ++var5) {
                class227 var6 = this.field4549[var5];
                int var7 = var6.field3330;
                int var8 = var6.field3331;
                if (~var7 <= -1) {
                    if (~var8 > -1) {
                        var6.method486(var4, var3, 769);
                    } else {
                        var6.method485(var4, var3, (byte) 124);
                    }
                } else if (var8 >= 0) {
                    var6.method487(var3, 8199, var4);
                }
            }
        }
        if (arg0 >= -48) {
            this.method37(107, false);
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(III)Lug;")
    public static final class231 method1952(int arg0, int arg1, int arg2) {
        class313 var3 = class223.field3286[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class231 var4 = var3.field5012;
            var3.field5012 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)V")
    public static void method1953(byte arg0) {
        field4548 = null;
        field4550 = null;
        field4546 = null;
        if (arg0 < 37) {
            field4543 = 101;
        }
        field4552 = null;
        field4547 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        ++field4541;
        if (arg1 != 6) {
            field4546 = null;
        }
        int[][] var3 = super.field1390.method1902(arg1 ^ -118, arg0);
        if (super.field1390.field4428) {
            int var4 = class206.field3032;
            int var5 = class123.field2045;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field1390.method1901(false);
            this.method1951(-99, var6);
            for (int var8 = 0; var8 < class123.field2045; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class206.field3032 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class301.method2056(255, var15) << 4;
                    var12[var14] = class301.method2056(65280, var15) >> 4;
                    var11[var14] = class301.method2056(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field4544;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            this.method1951(-107, super.field1378.method318(false));
        }
        return var3;
    }
}
