import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class154 extends class222 {

    @OriginalMember(owner = "client!uf", name = "nb", descriptor = "Z")
    private boolean field2822 = true;

    @OriginalMember(owner = "client!uf", name = "gb", descriptor = "Z")
    private boolean field2815 = true;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "Lsb;")
    public static class98 field2809 = null;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!uf", name = "ib", descriptor = "Lsb;")
    private static class98 field2817 = class47.method368("scroll:", 0);

    @OriginalMember(owner = "client!uf", name = "kb", descriptor = "[I")
    public static int[] field2819 = new int[128];

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "Lsb;")
    public static class98 field2807 = field2817;

    @OriginalMember(owner = "client!uf", name = "mb", descriptor = "[S")
    public static short[] field2821 = new short[256];

    @OriginalMember(owner = "client!uf", name = "fb", descriptor = "Z")
    public static boolean field2814 = false;

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "Lsb;")
    public static class98 field2811 = field2817;

    @OriginalMember(owner = "client!uf", name = "ob", descriptor = "Lsb;")
    public static class98 field2823 = class47.method368("Mem:", 0);

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!uf", name = "eb", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!uf", name = "hb", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!uf", name = "jb", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!uf", name = "lb", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class154() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lsb;I)Lsb;")
    public static final class98 method1120(class98 arg0, int arg1) {
        ++field2818;
        int var2 = class18.method170(arg0, 13247);
        return ~var2 == arg1 ? class174.field3047 : class31.field552.field4413[var2].method739(class243.field4216, 9975, class143.field2519);
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V")
    public static final void method1121(byte arg0) {
        ++field2808;
        if (arg0 <= 23) {
            method1123(-33, (byte) -40);
        }
        for (int var1 = -1; ~class97.field1671 < ~var1; ++var1) {
            int var5;
            if (~var1 != 0) {
                var5 = class51.field831[var1];
            } else {
                var5 = 2047;
            }
            class192 var6 = class141.field2499[var5];
            if (var6 != null && ~var6.field4504 < -1) {
                --var6.field4504;
                if (~var6.field4504 == -1) {
                    var6.field4526 = null;
                }
            }
        }
        for (int var2 = 0; class222.field3837 > var2; ++var2) {
            int var3 = class87.field1546[var2];
            class108 var4 = class180.field3109[var3];
            if (var4 != null && ~var4.field4504 < -1) {
                --var4.field4504;
                if (~var4.field4504 == -1) {
                    var4.field4526 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
    public static void method1122(int arg0) {
        field2819 = null;
        field2807 = null;
        field2811 = null;
        field2817 = null;
        field2821 = null;
        if (arg0 != 2) {
            method1123(-45, (byte) 21);
        }
        field2823 = null;
        field2809 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)V")
    public static final void method1123(int arg0, byte arg1) {
        class237.field4092 = new int[arg0];
        class166.field2967 = new int[arg0];
        ++field2820;
        class103.field1824 = new int[arg0];
        if (arg1 >= -58) {
            field2811 = null;
        }
        class194.field3371 = new int[arg0];
        class23.field472 = new int[arg0];
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 < 35) {
            method1120((class98) null, 116);
        }
        int[] var3 = super.field3844.method22(0, arg1);
        ++field2812;
        if (super.field3844.field61) {
            int[] var4 = this.method1537((byte) 100, 0, !this.field2815 ? arg1 : -arg1 + class191.field3299);
            if (!this.field2822) {
                class66.method466(var4, 0, var3, 0, class13.field253);
            } else {
                for (int var5 = 0; var5 < class13.field253; ++var5) {
                    var3[var5] = var4[-var5 + class162.field2924];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        ++field2813;
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field3834.method627(4103, arg0);
            if (super.field3834.field1486) {
                int[][] var4 = this.method1531(this.field2815 ? -arg0 + class191.field3299 : arg0, 0, 127);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var3[0];
                int[] var8 = var4[2];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (!this.field2822) {
                    for (int var11 = 0; var11 < class13.field253; ++var11) {
                        var7[var11] = var5[var11];
                        var9[var11] = var6[var11];
                        var10[var11] = var8[var11];
                    }
                } else {
                    for (int var12 = 0; ~class13.field253 < ~var12; ++var12) {
                        var7[var12] = var5[-var12 + class162.field2924];
                        var9[var12] = var6[-var12 + class162.field2924];
                        var10[var12] = var8[-var12 + class162.field2924];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        ++field2816;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3842 = ~arg0.method1446(5350) == -2;
                }
            } else {
                this.field2815 = ~arg0.method1446(5350) == -2;
            }
        } else {
            this.field2822 = ~arg0.method1446(5350) == -2;
        }
        if (arg1) {
            field2805 = -3;
        }
    }
}
