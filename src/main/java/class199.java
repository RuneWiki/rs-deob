import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class199 extends class436 {

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2744 = "Connection lost.";

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field2747 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!jp", name = "O", descriptor = "I")
    public static int field2752 = 0;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!jp", name = "M", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!jp", name = "N", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!jp", name = "P", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!jp", name = "Q", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "Lpr;")
    public static class258 field2749;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "[Lak;")
    private class194[] field2746;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)[[I", line = 5)
    public final int[][] method85(int arg0, int arg1) {
        ++field2748;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (arg0 != -13348) {
            this.field2746 = null;
        }
        if (super.field6259.field3950) {
            int var4 = class43.field653;
            int var5 = class123.field1728;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field6259.method1850((byte) -72);
            this.method1327(var6, (byte) 73);
            for (int var8 = 0; ~class123.field1728 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class43.field653; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class318.method2028(var15, 255) << 4;
                    var12[var14] = class318.method2028(4080, var15 >> 4);
                    var11[var14] = class318.method2028(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIB)Z", line = 77)
    public static final boolean method1326(int arg0, int arg1, byte arg2) {
        if (arg2 != 74) {
            method1329(false);
        }
        ++field2751;
        return ~(class221.field2910[1][arg1][arg0] & 2) != -1;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V", line = 91)
    public class199() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([[IB)V", line = 97)
    private final void method1327(int[][] arg0, byte arg1) {
        ++field2754;
        if (arg1 == 73) {
            int var3 = class43.field653;
            int var4 = class123.field1728;
            class364.method2338(arg0, (byte) -62);
            class438.method2749(0, class190.field2634, class278.field3758, arg1 ^ 137, 0);
            if (this.field2746 != null) {
                for (int var5 = 0; ~this.field2746.length < ~var5; ++var5) {
                    class194 var6 = this.field2746[var5];
                    int var7 = var6.field2691;
                    int var8 = var6.field2686;
                    if (var7 < 0) {
                        if (~var8 <= -1) {
                            var6.method1042(0, var4, var3);
                        }
                    } else if (var8 >= 0) {
                        var6.method1039((byte) -76, var3, var4);
                    } else {
                        var6.method1041(var4, var3, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIIIII)V", line = 148)
    public static final void method1328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2745;
        int var8 = arg2 + -334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class21.field279 - -((-class21.field279 + class216.field2868) * var8 / arg6);
        int var10 = arg5 * var9 >> 8;
        int var11 = 16383 & -arg0 + 16384;
        int var12 = 16383 & -arg3 + 16384;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class362.field5083[var11] * -var10 >> 15;
            var15 = class362.field5082[var11] * var10 >> 15;
        }
        if (~var12 != -1) {
            var13 = class362.field5083[var12] * var15 >> 15;
            var15 = class362.field5082[var12] * var15 >> 15;
        }
        class336.field4561 = -var15 + arg4;
        class368.field5158 = -var13 + arg7;
        class244.field3377 = arg3;
        class356.field5020 = arg0;
        class34.field528 = -var14 + arg1;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)[I", line = 195)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != 18338) {
            this.method14(32, 53);
        }
        ++field2750;
        int[] var3 = super.field6258.method2688((byte) -102, arg0);
        if (super.field6258.field6138) {
            this.method1327(super.field6258.method2687(0), (byte) 73);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V", line = 218)
    public static void method1329(boolean arg0) {
        field2744 = null;
        field2749 = null;
        field2747 = null;
        if (!arg0) {
            method1329(true);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILeb;)V", line = 234)
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field6256 = ~arg2.method2429(0) == -2;
            }
        } else {
            this.field2746 = new class194[arg2.method2429(0)];
            for (int var4 = 0; this.field2746.length > var4; ++var4) {
                int var5 = arg2.method2429(0);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field2746[var4] = class411.method2630(arg2, 1);
                            }
                        } else {
                            this.field2746[var4] = class84.method592(arg2, (byte) 119);
                        }
                    } else {
                        this.field2746[var4] = class364.method2341((byte) 65, arg2);
                    }
                } else {
                    this.field2746[var4] = class35.method258(-1, arg2);
                }
            }
        }
        if (arg0 == 34) {
            ++field2753;
        }
    }
}
