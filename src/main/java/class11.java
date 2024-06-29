import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class11 extends class23 {

    @OriginalMember(owner = "client!aj", name = "cb", descriptor = "I")
    private int field163 = 4;

    @OriginalMember(owner = "client!aj", name = "gb", descriptor = "I")
    private int field167 = 4;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "Li;")
    private static class88 field153 = class208.method1425(105, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "Li;")
    public static class88 field155 = class208.method1425(105, "lila:");

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "Li;")
    public static class88 field151 = field153;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "Li;")
    private static class88 field160 = class208.method1425(105, "Connection timed out)3");

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "Li;")
    public static class88 field156 = class208.method1425(105, "::clientdrop");

    @OriginalMember(owner = "client!aj", name = "fb", descriptor = "Z")
    public static boolean field166 = false;

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "Li;")
    public static class88 field162 = field160;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!aj", name = "db", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!aj", name = "eb", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field167 = arg0.method347(26119);
            }
        } else {
            this.field163 = arg0.method347(26119);
        }
        if (arg1 != -3) {
            field166 = true;
        }
        ++field164;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIB)V")
    public static final void method53(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -9) {
            method55(-96, 27L);
        }
        if (class157.field3019 == 1) {
            class154.field2984[class45.field796 / 100].method1157(class147.field2759 - 8, class155.field2999 + -8);
        }
        if (class157.field3019 == 2) {
            class154.field2984[class45.field796 / 100 + 4].method1157(class147.field2759 - 8, class155.field2999 + -8);
        }
        ++field165;
        class202.method1387(0);
        if (class148.field2770) {
            int var5 = arg0 - 5 + 512;
            int var6 = arg2 - -20;
            class3.field30.method150(class166.method1142(new class88[] { class180.field3571, class170.method1214(class13.field192, -93) }, -3), var5, var6, 16776960, -1);
            int var10 = var6 + 15;
            int var7 = 16776960;
            Runtime var8 = Runtime.getRuntime();
            int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
            if (var9 > 32768 && class245.field4499) {
                var7 = 16711680;
            }
            if (var9 > 65536 && !class245.field4499) {
                var7 = 16711680;
            }
            class3.field30.method150(class166.method1142(new class88[] { class206.field3923, class170.method1214(var9, -127), class110.field2009 }, -3), var5, var10, var7, -1);
            var6 = var10 + 15;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        if (arg1 < 19) {
            this.method54(81, (byte) -69);
        }
        ++field154;
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int var4 = class70.field1276 / this.field163;
            int var5 = class27.field460 / this.field167;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method120(class27.field460 * var6 / var5, false, 0);
            } else {
                var7 = this.method120(0, false, 0);
            }
            for (int var8 = 0; ~var8 > ~class70.field1276; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class70.field1276 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        ++field157;
        int[][] var3 = super.field364.method1541(true, arg0);
        if (super.field364.field4312) {
            int var4 = class27.field460 / this.field167;
            int var5 = class70.field1276 / this.field163;
            int[][] var7;
            if (var4 > 0) {
                int var6 = arg0 % var4;
                var7 = this.method121(0, (byte) 25, class27.field460 * var6 / var4);
            } else {
                var7 = this.method121(0, (byte) 9, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; var14 < class70.field1276; ++var14) {
                int var16;
                if (~var5 < -1) {
                    int var15 = var14 % var5;
                    var16 = class70.field1276 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var13[var14] = var9[var16];
                var12[var14] = var10[var16];
            }
        }
        if (arg1 != 13) {
            field151 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class11() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IJ)V")
    public static final void method55(int arg0, long arg1) {
        ++field158;
        if (arg1 != 0L) {
            if (class67.field1221 >= 100) {
                class223.method1501(class118.field2144, 12, 0, class174.field3455);
            } else {
                class88 var3 = class200.method1377(arg1, (byte) 123).method614((byte) 83);
                for (int var4 = 0; ~class67.field1221 < ~var4; ++var4) {
                    if (~class95.field1765[var4] == ~arg1) {
                        class223.method1501(class166.method1142(new class88[] { var3, class155.field3001 }, -3), arg0 ^ -12, 0, class174.field3455);
                        return;
                    }
                }
                for (int var5 = 0; class146.field2731 > var5; ++var5) {
                    if (class115.field2088[var5] == arg1) {
                        class223.method1501(class166.method1142(new class88[] { class109.field1973, var3, class115.field2087 }, -3), arg0 + 20, 0, class174.field3455);
                        return;
                    }
                }
                if (var3.method597(-125, class240.field4458.field766)) {
                    class223.method1501(field151, 12, 0, class174.field3455);
                } else {
                    ++class159.field3060;
                    class95.field1765[class67.field1221] = arg1;
                    class146.field2743[class67.field1221++] = class200.method1377(arg1, (byte) 104);
                    class20.field313 = class67.field1211;
                    class146.field2749.method30((byte) -48, 28);
                    if (arg0 == -8) {
                        class146.field2749.method328(arg1, (byte) -123);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
    public static final void method56(int arg0, int arg1, int arg2) {
        class52 var3 = class29.field489[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field959 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V")
    public static void method57(byte arg0) {
        if (arg0 != 81) {
            field153 = null;
        }
        field156 = null;
        field155 = null;
        field162 = null;
        field160 = null;
        field153 = null;
        field151 = null;
    }
}
