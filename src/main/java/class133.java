import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class133 extends class23 {

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "[I")
    public static int[] field2485 = new int[100];

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field2489 = -1;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field2486 = 0;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "[I")
    public static int[] field2487 = new int[100];

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field2491 = 0;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "Lbj;")
    public static class22 field2488;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "[Lee;")
    private class50[] field2492;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field2492 = new class50[arg0.method347(26119)];
            for (int var4 = 0; ~var4 > ~this.field2492.length; ++var4) {
                int var5 = arg0.method347(arg1 ^ -26118);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field2492[var4] = class85.method577(arg0, 255);
                            }
                        } else {
                            this.field2492[var4] = class12.method62(arg0, -127);
                        }
                    } else {
                        this.field2492[var4] = class143.method938((byte) -104, arg0);
                    }
                } else {
                    this.field2492[var4] = class81.method538(arg0, -42);
                }
            }
        } else if (~arg2 == -2) {
            super.field369 = arg0.method347(26119) == 1;
        }
        ++field2482;
        if (arg1 != -3) {
            method893(true);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        int[] var3 = super.field379.method1080(false, arg0);
        ++field2483;
        if (arg1 <= 19) {
            this.method892((int[][]) null, (byte) 75);
        }
        if (super.field379.field3100) {
            this.method892(super.field379.method1077(-80), (byte) 105);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Li;")
    public static final class88 method891(int arg0, int arg1) {
        ++field2484;
        if (arg1 > arg0) {
            return class166.method1142(new class88[] { class25.field399, class170.method1214(arg0, 25), class67.field1214 }, -3);
        } else {
            return arg0 < 10000000 ? class166.method1142(new class88[] { class16.field241, class170.method1214(arg0 / 1000, arg1 ^ 100023), class159.field3071, class67.field1214 }, -3) : class166.method1142(new class88[] { class132.field2464, class170.method1214(arg0 / 1000000, 103), class132.field2466, class67.field1214 }, arg1 + -100003);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        ++field2490;
        int[][] var3 = super.field364.method1541(true, arg0);
        if (super.field364.field4312) {
            int var4 = class70.field1276;
            int var5 = class27.field460;
            int[][][] var6 = super.field364.method1539(true);
            int[][] var7 = new int[var5][var4];
            this.method892(var7, (byte) 105);
            for (int var8 = 0; var8 < class27.field460; ++var8) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[2];
                int[] var13 = var10[0];
                for (int var14 = 0; ~var14 > ~class70.field1276; ++var14) {
                    int var15 = var9[var14];
                    var12[var14] = class70.method470(var15, 255) << 4;
                    var11[var14] = class70.method470(65280, var15) >> 4;
                    var13[var14] = class70.method470(var15, 16711680) >> 12;
                }
            }
        }
        return arg1 != 13 ? null : var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([[IB)V")
    private final void method892(int[][] arg0, byte arg1) {
        ++field2493;
        int var3 = class70.field1276;
        int var4 = class27.field460;
        class22.method114(arg0, (byte) 74);
        class238.method1577(0, (byte) 60, class220.field4160, class45.field789, 0);
        if (arg1 == 105) {
            if (this.field2492 != null) {
                for (int var5 = 0; var5 < this.field2492.length; ++var5) {
                    class50 var6 = this.field2492[var5];
                    int var7 = var6.field925;
                    int var8 = var6.field927;
                    if (var7 < 0) {
                        if (~var8 <= -1) {
                            var6.method377(var3, var4, (byte) -128);
                        }
                    } else if (~var8 > -1) {
                        var6.method373(var4, var3, false);
                    } else {
                        var6.method371(var3, var4, 75);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class133() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)V")
    public static void method893(boolean arg0) {
        field2485 = null;
        field2488 = null;
        if (!arg0) {
            method891(1, 50);
        }
        field2487 = null;
    }
}
