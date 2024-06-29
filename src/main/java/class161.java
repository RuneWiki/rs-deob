import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class161 extends class157 {

    @OriginalMember(owner = "client!il", name = "U", descriptor = "[I")
    public static int[] field2918 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!il", name = "T", descriptor = "Z")
    public static boolean field2917 = true;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public static volatile int field2915 = 0;

    @OriginalMember(owner = "client!il", name = "W", descriptor = "Lcc;")
    public static class209 field2920 = class95.method669(125, "(U4");

    @OriginalMember(owner = "client!il", name = "O", descriptor = "Lcc;")
    private static class209 field2912 = class95.method669(95, "Loading title screen )2 ");

    @OriginalMember(owner = "client!il", name = "X", descriptor = "Z")
    public static boolean field2921 = false;

    @OriginalMember(owner = "client!il", name = "cb", descriptor = "Lcc;")
    public static class209 field2926 = field2912;

    @OriginalMember(owner = "client!il", name = "Z", descriptor = "F")
    public static float field2923;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!il", name = "Y", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!il", name = "ab", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!il", name = "bb", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!il", name = "db", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILde;)V")
    public static final void method1109(int arg0, class108 arg1) {
        if (arg0 != 11172) {
            method1114(67, (class49) null, (byte) 59);
        }
        ++field2927;
        class92 var2 = (class92) class210.field3823.method1755(arg1.field2140.method1448(true), (byte) -82);
        if (var2 != null) {
            if (var2.field1830 != null) {
                class47.field906.method1519(var2.field1830);
                var2.field1830 = null;
            }
            var2.method269(-214950896);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IIIIIIII)Z")
    public static final boolean method1110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 < -29) {
            ++field2922;
            if (~arg0 == -1) {
                super.field2877 = ~arg2.method774((byte) 81) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class161() {
        super(1, false);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        if (arg0 != 1) {
            field2918 = null;
        }
        ++field2914;
        int[][] var3 = super.field2872.method533(arg1, 3);
        if (super.field2872.field1434) {
            int[][] var4 = this.method1093(arg1, 0, arg0 + 63);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class226.field4124 > var11; ++var11) {
                var7[var11] = 4096 - var8[var11];
                var9[var11] = -var5[var11] + 4096;
                var10[var11] = -var6[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(BI)Z")
    public static final boolean method1111(byte arg0, int arg1) {
        ++field2916;
        if (class59.field1189[arg1]) {
            return true;
        } else if (!class142.field2625.method348(-8844, arg1)) {
            return false;
        } else {
            int var2 = class142.field2625.method360(arg1, 0);
            if (~var2 == -1) {
                class59.field1189[arg1] = true;
                return true;
            } else {
                if (class50.field984[arg1] == null) {
                    class50.field984[arg1] = new class42[var2];
                }
                if (arg0 < 8) {
                    field2920 = null;
                }
                for (int var3 = 0; ~var2 < ~var3; ++var3) {
                    if (class50.field984[arg1][var3] == null) {
                        byte[] var4 = class142.field2625.method353(var3, -16, arg1);
                        if (var4 != null) {
                            class50.field984[arg1][var3] = new class42();
                            class50.field984[arg1][var3].field779 = (arg1 << 16) + var3;
                            if (var4[0] != -1) {
                                class50.field984[arg1][var3].method317(new class106(var4), 1);
                            } else {
                                class50.field984[arg1][var3].method315((byte) 54, new class106(var4));
                            }
                        }
                    }
                }
                class59.field1189[arg1] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field2919;
        int[] var3 = super.field2879.method1269(arg1, arg0 ^ -17853);
        if (arg0 != -98) {
            field2926 = null;
        }
        if (super.field2879.field3363) {
            int[] var4 = this.method1097((byte) 75, 0, arg1);
            for (int var5 = 0; ~var5 > ~class226.field4124; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V")
    public static void method1112(byte arg0) {
        field2920 = null;
        field2926 = null;
        int var1 = 4 % ((arg0 - 22) / 54);
        field2918 = null;
        field2912 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1113(String arg0, int arg1) {
        ++field2913;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg1);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILsj;B)Ljb;")
    public static final class269 method1114(int arg0, class49 arg1, byte arg2) {
        if (arg2 != -5) {
            method1113((String) null, -59);
        }
        ++field2925;
        return !class280.method1891(false, arg1, arg0) ? null : class88.method632((byte) 55);
    }
}
