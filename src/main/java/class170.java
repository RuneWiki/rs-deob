import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class170 extends class107 {

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "Ljava/util/Random;")
    public static Random field2783 = new Random();

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "Lrg;")
    public static class248 field2790 = null;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field2789 = 0;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "Lad;")
    public static class275 field2791 = new class275(64);

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "Lad;")
    public static class275 field2793 = new class275(64);

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2794 = "wave2:";

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "I")
    public static int field2795 = -1;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "Lge;")
    public static class73 field2792;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int var3 = -80 % ((-34 - arg0) / 49);
        ++field2787;
        int[] var4 = super.field1661.method894(116, arg1);
        if (super.field1661.field2115) {
            int[][] var5 = this.method759(0, -128, arg1);
            int[] var6 = var5[2];
            int[] var7 = var5[0];
            int[] var8 = var5[1];
            for (int var9 = 0; class24.field443 > var9; ++var9) {
                var4[var9] = (var7[var9] + var8[var9] + var6[var9]) / 3;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBIILkb;II)V")
    public static final void method1203(int arg0, byte arg1, int arg2, int arg3, class55 arg4, int arg5, int arg6) {
        ++field2784;
        long var7 = 0L;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                var7 = class183.method1293(arg3, arg6, arg5);
            } else if (arg0 == 2) {
                var7 = class195.method1361(arg3, arg6, arg5);
            } else if (arg0 == 3) {
                var7 = class275.method1874(arg3, arg6, arg5);
            }
        } else {
            var7 = class180.method1266(arg3, arg6, arg5);
        }
        boolean var9 = true;
        if (arg1 < 100) {
            field2791 = null;
        }
        boolean var10 = false;
        int var11 = (520490 & (int) var7) >> 14;
        boolean var12 = false;
        int var13 = (int) var7 >> 20 & 3;
        int var14 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class172 var15 = class49.method319(var14, 0);
        if (var15.method1225(0)) {
            class150.method1018((byte) -128, arg5, arg3, var15, arg6);
        }
        if (var7 != 0L) {
            if (arg0 == 0) {
                class46.method303(arg3, arg6, arg5);
                if (~var15.field2861 != -1) {
                    arg4.method345(var11, true, arg6, var13, var15.field2828, !var15.field2867, arg5);
                }
            } else if (arg0 == 1) {
                class197.method1365(arg3, arg6, arg5);
            } else if (~arg0 != -3) {
                if (~arg0 == -4) {
                    class111.method779(arg3, arg6, arg5);
                    if (var15.field2861 == 1) {
                        arg4.method346(false, arg6, arg5);
                    }
                }
            } else {
                class117.method805(arg3, arg6, arg5);
                if (var15.field2861 != 0 && ~(var15.field2821 + arg6) > -105 && var15.field2821 + arg5 < 104 && ~(var15.field2809 + arg6) > -105 && ~(var15.field2809 + arg5) > -105) {
                    arg4.method355(var15.field2821, var15.field2809, !var15.field2867, var15.field2828, false, var13, arg6, arg5);
                }
            }
            if (var15.field2846 != null) {
                class172 var20 = var15.method1214(-67);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(B)V")
    public static void method1204(byte arg0) {
        int var1 = -90 % ((arg0 - 1) / 42);
        field2790 = null;
        field2783 = null;
        field2792 = null;
        field2791 = null;
        field2794 = null;
        field2793 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
    public static final String method1205(boolean arg0, byte arg1, int arg2, int arg3) {
        ++field2788;
        if (arg2 >= 2 && ~arg2 >= -37) {
            if (arg0 && ~arg3 <= -1) {
                if (arg1 > -114) {
                    field2790 = null;
                }
                int var4 = 2;
                int var5 = arg3 / arg2;
                while (var5 != 0) {
                    var5 /= arg2;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                for (int var7 = var4 + -1; ~var7 < -1; --var7) {
                    int var8 = arg3;
                    arg3 /= arg2;
                    int var9 = -(arg2 * arg3) + var8;
                    if (var9 >= 10) {
                        var6[var7] = (char) (var9 + 87);
                    } else {
                        var6[var7] = (char) (var9 + 48);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg3, arg2);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
    public class170() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(III)I")
    public static final int method1206(int arg0, int arg1, int arg2) {
        ++field2782;
        int var3 = arg0 >> 31 & arg2 + -1;
        if (arg1 != 25179) {
            field2794 = null;
        }
        return ((arg0 >>> 31) + arg0) % arg2 - -var3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V")
    public static final void method1207(byte arg0, int arg1) {
        ++field2785;
        class66.field1081 = arg1;
        class4.field104 = -1;
        client.field2660 = 100;
        if (arg0 != -84) {
            method1206(105, 79, -122);
        }
        class108.field1685 = 3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(CI)Z")
    public static final boolean method1208(char arg0, int arg1) {
        ++field2786;
        if ((arg0 <= 0 || ~arg0 <= -129) && (arg0 < 160 || arg0 > 255)) {
            if (~arg0 != -1) {
                int var2 = 0;
                char[] var3 = class311.field5033;
                while (~var2 > ~var3.length) {
                    char var4 = var3[var2];
                    if (arg0 == var4) {
                        return true;
                    }
                    ++var2;
                }
            }
            if (arg1 != -129) {
                method1205(false, (byte) -104, -35, -15);
            }
            return false;
        } else {
            return true;
        }
    }
}
