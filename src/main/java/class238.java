import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class238 extends class102 {

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "Z")
    private boolean field4384 = true;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "Z")
    private boolean field4386 = true;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "[J")
    public static long[] field4389 = new long[500];

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "Lqe;")
    public static class179 field4391 = class206.method1380("Ein kostenloses Spielkonto erstellen)3", (byte) -5);

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class238() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field4385;
        if (arg2) {
            field4389 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field1957 = arg0.method1243(3) == 1;
                }
            } else {
                this.field4386 = arg0.method1243(3) == 1;
            }
        } else {
            this.field4384 = arg0.method1243(3) == 1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field1950.method598((byte) -55, arg0);
        if (super.field1950.field1724) {
            int[][] var4 = this.method677(58, this.field4386 ? class233.field4296 - arg0 : arg0, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var4[0];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            if (this.field4384) {
                for (int var11 = 0; ~class155.field2796 < ~var11; ++var11) {
                    var9[var11] = var8[-var11 + class227.field4193];
                    var7[var11] = var6[-var11 + class227.field4193];
                    var10[var11] = var5[-var11 + class227.field4193];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class155.field2796; ++var12) {
                    var9[var12] = var8[var12];
                    var7[var12] = var6[var12];
                    var10[var12] = var5[var12];
                }
            }
        }
        if (arg1 != 64) {
            this.method14(-89, 52);
        }
        ++field4395;
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Lma;")
    public static final class131 method1543(int arg0, int arg1) {
        if (arg0 <= 33) {
            field4391 = null;
        }
        ++field4383;
        class131 var2 = (class131) class5.field63.method1299((byte) -128, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class74.field1445.method342(arg1, 27, (byte) 71);
            class131 var4 = new class131();
            if (var3 != null) {
                var4.method833((byte) -54, new class185(var3));
            }
            class5.field63.method1303(var4, (long) arg1, (byte) -92);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
    public static void method1544(int arg0) {
        field4391 = null;
        if (arg0 != 0) {
            field4392 = -47;
        }
        field4389 = null;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)Lgg;")
    public static final class72 method1545(byte arg0) {
        ++field4388;
        class72 var1 = new class72(class22.field544, class9.field257, class31.field674[0], class143.field2611[0], class187.field3493[0], class150.field2703[0], class173.field3102[0], class175.field3185);
        if (arg0 < 62) {
            method1545((byte) 51);
        }
        class17.method129((byte) -121);
        return var1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4394;
        int var8 = 2047 & -arg1 + 2048;
        if (arg3 >= -29) {
            field4389 = null;
        }
        int var9 = 0;
        int var10 = 2048 - arg5 & 2047;
        int var11 = 0;
        int var12 = arg6;
        if (var8 != 0) {
            int var13 = class27.field612[var8];
            int var14 = class27.field600[var8];
            int var15 = var11 * var14 + -(arg6 * var13) >> 16;
            var12 = var11 * var13 + arg6 * var14 >> 16;
            var11 = var15;
        }
        if (var10 != 0) {
            int var16 = class27.field600[var10];
            int var17 = class27.field612[var10];
            int var18 = var9 * var16 + var12 * var17 >> 16;
            var12 = var12 * var16 + -(var9 * var17) >> 16;
            var9 = var18;
        }
        class22.field538 = arg7 - var9;
        class198.field3700 = -var12 + arg0;
        class18.field480 = arg1;
        class61.field1300 = arg5;
        class225.field4177 = -var11 + arg2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        ++field4393;
        if (!arg0) {
            field4389 = null;
        }
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int[] var4 = this.method679(!this.field4386 ? arg1 : -arg1 + class233.field4296, 0, (byte) -109);
            if (!this.field4384) {
                class154.method990(var4, 0, var3, 0, class155.field2796);
            } else {
                for (int var5 = 0; ~var5 > ~class155.field2796; ++var5) {
                    var3[var5] = var4[-var5 + class227.field4193];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Leh;Leh;B)I")
    public static final int method1547(class52 arg0, class52 arg1, byte arg2) {
        ++field4387;
        if (arg2 != 101) {
            return -44;
        } else {
            int var3 = 0;
            if (arg1.method351((byte) 80, class116.field2184)) {
                ++var3;
            }
            if (arg0.method351((byte) 49, class78.field1518)) {
                ++var3;
            }
            if (arg0.method351((byte) 102, class234.field4324)) {
                ++var3;
            }
            if (arg0.method351((byte) 109, class139.field2564)) {
                ++var3;
            }
            if (arg0.method351((byte) 96, class80.field1537)) {
                ++var3;
            }
            if (arg0.method351((byte) 119, class212.field3954)) {
                ++var3;
            }
            arg0.method351((byte) 86, class182.field3361);
            arg0.method351((byte) 78, class55.field1226);
            arg0.method351((byte) 79, class11.field303);
            arg0.method351((byte) 123, class84.field1632);
            arg0.method351((byte) 125, class4.field59);
            return var3;
        }
    }
}
