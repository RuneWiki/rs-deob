import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class140 extends class272 {

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    private int field2623 = 10;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    private int field2627 = 0;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
    private int field2631 = 2048;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "[[B")
    public static byte[][] field2618 = new byte[250][];

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "Lli;")
    public static class185 field2621 = class245.method1649("<)4col> x", 127);

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field2624 = 0;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "Z")
    public static boolean field2634 = true;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "Luh;")
    public static class235 field2625;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "[I")
    private int[] field2619;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "[I")
    private int[] field2635;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        if (arg0 == 0) {
            ++field2622;
            this.method1006((byte) 38);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != 4421) {
            field2621 = null;
        }
        ++field2626;
        int[] var3 = super.field4819.method1632(0, arg0);
        if (super.field4819.field4294) {
            int var4 = class232.field4177[arg0];
            if (this.field2627 != 0) {
                for (int var5 = 0; class246.field4385 > var5; ++var5) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class38.field598[var5];
                    int var9 = this.field2627;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var7 = (var8 - var4 >> 1) + 2048;
                            }
                        } else {
                            var7 = (var4 + var8 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var7 = var8;
                    }
                    for (int var10 = 0; ~var10 > ~this.field2623; ++var10) {
                        if (var7 >= this.field2635[var10] && this.field2635[var10 + 1] > var7) {
                            if (~this.field2619[var10] < ~var7) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field2623 < ~var12; ++var12) {
                    if (var4 >= this.field2635[var12] && ~this.field2635[var12 - -1] < ~var4) {
                        if (~this.field2619[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class190.method1367(var3, 0, class246.field4385, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
    public static void method1002(int arg0) {
        if (arg0 != 100) {
            method1004(100, 13, -67, 32, 71, -80);
        }
        field2625 = null;
        field2618 = null;
        field2621 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
    public static final void method1003(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2633;
        if (~client.field3929 > -101) {
            class267.method1816((byte) -84);
        }
        class159.method1148(arg3, arg1, arg2 + arg3, arg1 - -arg4);
        if (client.field3929 < 100) {
            byte var5 = 20;
            int var6 = arg3 - -(arg2 / 2);
            int var7 = arg1 - -(arg4 / 2) + -18 - var5;
            class159.method1130(arg3, arg1, arg2, arg4, 0);
            class159.method1126(var6 + -152, var7, 304, 34, 9179409);
            class159.method1126(var6 + -151, var7 + 1, 302, 32, 0);
            class159.method1130(var6 - 150, var7 - -2, client.field3929 * 3, 30, 9179409);
            class159.method1130(var6 + -150 - -(client.field3929 * 3), var7 + 2, -(client.field3929 * 3) + 300, 30, 0);
            class82.field1608.method1833(class65.field1125, var6, var5 + var7, 16777215, -1);
        } else {
            class169.field3138 = (int) ((float) (arg4 * 2) / class274.field4859);
            int var8 = -((int) ((float) arg2 / class274.field4859)) + class66.field1146;
            class54.field931 = -((int) ((float) arg2 / class274.field4859)) + class66.field1146;
            class267.field4730 = (int) ((float) (arg2 * 2) / class274.field4859);
            int var9 = (int) ((float) arg4 / class274.field4859) + class212.field3884;
            int var10 = -((int) ((float) arg4 / class274.field4859)) + class212.field3884;
            int var11 = (int) ((float) arg2 / class274.field4859) + class66.field1146;
            class117.field2087 = -((int) ((float) arg4 / class274.field4859)) + class212.field3884;
            if (arg0 != 3) {
                method1005(-52);
            }
            class93.method604(var11, arg1 + arg4, arg1, arg3, arg3 - -arg2, var8, 115, var9, var10);
            class178.method1262(arg3, arg1, var8, var9, var10, arg1 + arg4, var11, 315584518, arg2 + arg3);
            class49.method313(var8, arg3, var10, arg1, arg2 + arg3, var11, var9, arg1 - -arg4, (byte) 69);
            if (~class242.field4323 < -1) {
                --class242.field4323;
            }
            if (class173.field3177) {
                int var12 = arg3 + -5 + arg2;
                int var13 = arg1 + -8 - -arg4;
                class205.field3743.method1852(class87.method567(-11039, new class185[] { class151.field2867, class90.method591(class163.field3057, arg0 + -3) }), var12, var13, 16776960, -1);
                int var17 = var13 - 15;
                Runtime var14 = Runtime.getRuntime();
                int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
                int var16 = 16776960;
                if (~var15 < -65537) {
                    var16 = 16711680;
                }
                class205.field3743.method1852(class87.method567(-11039, new class185[] { class267.field4731, class90.method591(var15, arg0 ^ 3), class132.field2364 }), var12, var17, var16, -1);
                var13 = var17 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2632;
        if (arg5 != -22180) {
            method1005(-26);
        }
        for (int var6 = arg1; arg3 >= var6; ++var6) {
            class157.method1116(arg2, arg4, arg0, class145.field2757[var6], -29);
        }
    }

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)V")
    public static final void method1005(int arg0) {
        class157.field2981 = null;
        class185.field3450 = null;
        class106.field1919 = null;
        class239.field4267 = null;
        class269.field4758 = null;
        class220.field4009 = null;
        class36.field565 = null;
        class235.field4216 = null;
        if (arg0 != -1) {
            field2634 = false;
        }
        class38.field611 = null;
        ++field2620;
        class260.field4615 = null;
        class178.field3253 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field2627 = arg0.method867(false);
                }
            } else {
                this.field2631 = arg0.method827(255);
            }
        } else {
            this.field2623 = arg0.method867(false);
        }
        int var5 = -44 / ((arg1 - -21) / 55);
        ++field2616;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    private final void method1006(byte arg0) {
        this.field2635 = new int[this.field2623 - -1];
        ++field2628;
        int var2 = 0;
        this.field2619 = new int[this.field2623 + 1];
        int var3 = 4096 / this.field2623;
        int var4 = this.field2631 * var3 >> 12;
        int var5 = 0;
        if (arg0 == 38) {
            while (this.field2623 > var5) {
                this.field2635[var5] = var2;
                this.field2619[var5] = var2 + var4;
                var2 += var3;
                ++var5;
            }
            this.field2635[this.field2623] = 4096;
            this.field2619[this.field2623] = 4096 - -this.field2619[0];
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(III)V")
    public static final void method1007(int arg0, int arg1, int arg2) {
        if (arg1 == 9179409) {
            ++field2629;
            class209 var3 = class111.method775(arg2, -119);
            int var4 = var3.field3819;
            int var5 = var3.field3820;
            int var6 = var3.field3823;
            int var7 = class73.field1275[var6 - var5];
            if (~arg0 > -1 || var7 < arg0) {
                arg0 = 0;
            }
            int var8 = var7 << var5;
            class171.method1218(class59.field1059[var4] & ~var8 | arg0 << var5 & var8, 82, var4);
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class140() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V")
    public static final void method1008(int arg0) {
        class109.field1964.method86(0);
        if (arg0 <= -125) {
            class242.field4325.method86(0);
            ++field2630;
        }
    }
}
