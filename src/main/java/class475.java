import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class475 extends class38 {

    @OriginalMember(owner = "client!oga", name = "I", descriptor = "Leia;")
    public static class243 field6903 = new class243();

    @OriginalMember(owner = "client!oga", name = "L", descriptor = "Z")
    public static boolean field6906 = false;

    @OriginalMember(owner = "client!oga", name = "D", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!oga", name = "E", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!oga", name = "F", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!oga", name = "G", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!oga", name = "H", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!oga", name = "K", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!oga", name = "J", descriptor = "[Luha;")
    private class245[] field6904;

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "()V", line = 5)
    public class475() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "([[IZ)V", line = 10)
    private final void method2863(int[][] arg0, boolean arg1) {
        ++field6902;
        int var3 = class729.field10216;
        if (arg1) {
            field6906 = false;
        }
        int var4 = class632.field8852;
        class245.method1636(arg0, -126);
        class521.method3069(arg1, 0, 0, class554.field7909, class619.field8708);
        if (this.field6904 != null) {
            for (int var5 = 0; ~this.field6904.length < ~var5; ++var5) {
                class245 var6 = this.field6904[var5];
                int var7 = var6.field3567;
                int var8 = var6.field3574;
                if (~var7 > -1) {
                    if (~var8 <= -1) {
                        var6.method159(521, var3, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method158(var3, 0, var4);
                } else {
                    var6.method161(var3, 47, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)V", line = 60)
    public static void method2864(int arg0) {
        field6903 = null;
        if (arg0 > -60) {
            field6903 = null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(III)Z", line = 70)
    public static final boolean method2865(int arg0, int arg1, int arg2) {
        if (arg0 != 255) {
            return true;
        } else {
            ++field6899;
            return class423.method2653(arg2, arg1, false) | ~(262144 & arg2) != -1 || class348.method2206(arg2, arg1, arg0 ^ 200);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)[[I", line = 81)
    public final int[][] method196(int arg0, int arg1) {
        ++field6901;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (arg0 != -18210) {
            this.field6904 = null;
        }
        if (super.field387.field6792) {
            int var4 = class729.field10216;
            int var5 = class632.field8852;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field387.method2808(0);
            this.method2863(var6, false);
            for (int var8 = 0; ~var8 > ~class632.field8852; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class729.field10216; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class493.method2943(var15, 255) << 4;
                    var12[var14] = class493.method2943(var15 >> 4, 4080);
                    var11[var14] = class493.method2943(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BI)[I", line = 152)
    public final int[] method199(byte arg0, int arg1) {
        ++field6905;
        int[] var3 = super.field397.method1376(arg1, (byte) 121);
        if (arg0 > -43) {
            field6903 = null;
        }
        if (super.field397.field3005) {
            this.method2863(super.field397.method1375((byte) 98), false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IILrg;)V", line = 175)
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg0 > 34) {
            ++field6898;
            if (arg1 != 0) {
                if (arg1 == 1) {
                    super.field388 = arg2.method3745(-6314) == 1;
                    return;
                }
            } else {
                this.field6904 = new class245[arg2.method3745(-6314)];
                for (int var4 = 0; ~var4 > ~this.field6904.length; ++var4) {
                    int var5 = arg2.method3745(-6314);
                    if (~var5 != -1) {
                        if (var5 != 1) {
                            if (~var5 != -3) {
                                if (var5 == 3) {
                                    this.field6904[var4] = class418.method2638(1024, arg2);
                                }
                            } else {
                                this.field6904[var4] = class510.method3028(arg2, 2);
                            }
                        } else {
                            this.field6904[var4] = class499.method2967(arg2, 32294);
                        }
                    } else {
                        this.field6904[var4] = class430.method2675(-25648, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)V", line = 250)
    public static final void method2866(int arg0) {
        ++field6900;
        class195.field2969 = new class164();
        if (arg0 != 0) {
            field6906 = false;
        }
    }
}
