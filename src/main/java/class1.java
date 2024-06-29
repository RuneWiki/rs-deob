import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 extends class82 {

    @OriginalMember(owner = "client!a", name = "S", descriptor = "Ldj;")
    public static class44 field4 = class89.method650(255, "Nehmen");

    @OriginalMember(owner = "client!a", name = "W", descriptor = "Ldj;")
    private static class44 field8 = class89.method650(255, "Click to switch");

    @OriginalMember(owner = "client!a", name = "X", descriptor = "I")
    public static int field9 = 0;

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "Ldj;")
    public static class44 field13 = field8;

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "Ldj;")
    public static class44 field11 = class89.method650(255, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!a", name = "V", descriptor = "Lri;")
    public static class189 field7 = new class189(128);

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "Ldj;")
    public static class44 field14 = class89.method650(255, "welle:");

    @OriginalMember(owner = "client!a", name = "R", descriptor = "B")
    public static byte field3;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class1() {
        super(3, false);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBII)V")
    public static final void method1(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class93 var5 = (class93) class54.field990.method828((long) arg4, (byte) -40);
        if (var5 == null) {
            var5 = new class93();
            class54.field990.method830(var5, (long) arg4, 1);
        }
        if (arg0 >= var5.field1729.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 - -1];
            for (int var8 = 0; ~var5.field1729.length < ~var8; ++var8) {
                var6[var8] = var5.field1729[var8];
                var7[var8] = var5.field1734[var8];
            }
            for (int var9 = var5.field1729.length; var9 < arg0; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1729 = var6;
            var5.field1734 = var7;
        }
        var5.field1729[arg0] = arg1;
        ++field10;
        var5.field1734[arg0] = arg3;
        if (arg2 != -21) {
            field3 = 17;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field2;
        if (~arg1 == -1) {
            super.field1599 = ~arg0.method506(255) == -2;
        }
        if (arg2 != 68) {
            method4(52, 102);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        if (arg0 != 25238) {
            return null;
        } else {
            ++field12;
            int[] var3 = super.field1595.method603(true, arg1);
            if (super.field1595.field1538) {
                int[] var4 = this.method620(arg0 + -22586, arg1, 0);
                int[] var5 = this.method620(2652, arg1, 1);
                int[] var6 = this.method620(2652, arg1, 2);
                for (int var7 = 0; var7 < class129.field2287; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 != -4097) {
                        if (var8 == 0) {
                            var3[var7] = var5[var7];
                        } else {
                            var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(II)V")
    public static final void method4(int arg0, int arg1) {
        ++field1;
        if (class122.method835(arg1, 31)) {
            class15.method127(class4.field52[arg1], 113, -1);
            if (arg0 >= -92) {
                field14 = null;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V")
    public static void method5(int arg0) {
        field13 = null;
        field4 = null;
        if (arg0 != 1) {
            field13 = null;
        }
        field8 = null;
        field14 = null;
        field7 = null;
        field11 = null;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        ++field6;
        if (arg0 > -59) {
            field4 = null;
        }
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343) {
            int[] var4 = this.method620(2652, arg1, 2);
            int[][] var5 = this.method619(arg1, true, 0);
            int[][] var6 = this.method619(arg1, true, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var5[2];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class129.field2287 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (var17 != 0) {
                        int var18 = 4096 - var17;
                        var7[var16] = var10[var16] * var17 + var12[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var13[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var12[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var13[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(JB)V")
    public static final void method7(long arg0, byte arg1) {
        ++field5;
        if (~arg0 != -1L) {
            if ((~class117.field2085 > -101 || ~class28.field492 == -2) && ~class117.field2085 > -201) {
                class44 var3 = class38.method263((byte) 3, arg0).method320(false);
                for (int var4 = 0; ~class117.field2085 < ~var4; ++var4) {
                    if (class166.field2848[var4] == arg0) {
                        class226.method1484(class70.method555(new class44[] { var3, class160.field2768 }, -3), arg1 ^ 8, 0, class94.field1752);
                        return;
                    }
                }
                for (int var5 = 0; var5 < class37.field664; ++var5) {
                    if (class154.field2686[var5] == arg0) {
                        class226.method1484(class70.method555(new class44[] { class72.field1376, var3, class39.field750 }, -3), 0, 0, class94.field1752);
                        return;
                    }
                }
                if (var3.method314(class96.field1774.field395, -95)) {
                    class226.method1484(class186.field3213, 0, 0, class94.field1752);
                } else {
                    class174.field3026[class117.field2085] = var3;
                    ++class156.field2722;
                    if (arg1 == 8) {
                        class166.field2848[class117.field2085] = arg0;
                        class37.field657[class117.field2085] = 0;
                        class122.field2161[class117.field2085] = class94.field1752;
                        class60.field1131[class117.field2085] = 0;
                        class143.field2531 = class66.field1251;
                        ++class117.field2085;
                        class200.field3542.method1170(129, (byte) -95);
                        class200.field3542.method536(arg0, 74);
                    }
                }
            } else {
                class226.method1484(class193.field3387, 0, 0, class94.field1752);
            }
        }
    }
}
