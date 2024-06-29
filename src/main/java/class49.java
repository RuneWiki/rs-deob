import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class49 extends class175 {

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "Z")
    private boolean field859 = true;

    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "Z")
    private boolean field869 = true;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "Lmb;")
    public static class96 field862 = class243.method1708("blinken2:", (byte) 105);

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "Lmb;")
    private static class96 field868 = class243.method1708("Attack", (byte) 127);

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "Lmb;")
    public static class96 field864 = field868;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!wh", name = "bb", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "Lff;")
    public static class3 field867;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZZIIIZII)Lmj;")
    public static final class246 method374(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        class159 var8 = class269.method1845(arg2, (byte) 61);
        if (~arg3 < -2 && var8.field2831 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; ++var10) {
                if (~var8.field2815[var10] >= ~arg3 && var8.field2815[var10] != 0) {
                    var9 = var8.field2831[var10];
                }
            }
            if (var9 != -1) {
                var8 = class269.method1845(var9, (byte) 61);
            }
        }
        class255 var11 = var8.method1154(-129);
        ++field863;
        if (var11 == null) {
            return null;
        } else {
            class174 var12 = null;
            if (var8.field2811 != -1) {
                var12 = (class174) method374(false, true, var8.field2772, 10, 2, true, 1, 0);
                if (var12 == null) {
                    return null;
                }
            } else if (var8.field2813 != -1) {
                var12 = (class174) method374(false, true, var8.field2794, arg3, arg4, false, arg6, arg7);
                if (var12 == null) {
                    return null;
                }
            }
            int[] var13 = class84.field1427;
            int var14 = class84.field1429;
            int[] var15 = new int[4];
            int var16 = class84.field1428;
            class84.method601(var15);
            class174 var17 = new class174(36, 32);
            class84.method590(var17.field3026, 36, 32);
            class240.method1679();
            class240.method1684(16, 16);
            class240.field4169 = false;
            int var18 = var8.field2820;
            if (arg5) {
                var18 = (int) ((double) var18 * 1.5D);
            } else if (arg6 == 2) {
                var18 = (int) ((double) var18 * 1.04D);
            }
            int var19 = class240.field4176[var8.field2829] * var18 >> 16;
            int var20 = class240.field4162[var8.field2829] * var18 >> 16;
            var11.method266(0, var8.field2757, var8.field2827, var8.field2829, var8.field2805, var20 + -(var11.method50() / arg4) + var8.field2783, var8.field2783 + var19);
            if (~arg6 <= -2) {
                var17.method1237(1);
                if (~arg6 <= -3) {
                    var17.method1237(16777215);
                }
                class84.method590(var17.field3026, 36, 32);
            }
            if (arg7 != 0) {
                var17.method1242(arg7);
            }
            if (var8.field2811 == -1) {
                if (var8.field2813 != -1) {
                    class84.method590(var12.field3026, 36, 32);
                    var17.method1057(0, 0);
                    var17 = var12;
                }
            } else {
                var12.method1057(0, 0);
            }
            if (arg0 && (~var8.field2796 == -2 || ~arg3 != -2) && arg3 != -1) {
                class157.field2731.method128(class235.method1592(arg3, false), 0, 9, 16776960, 1);
            }
            class84.method590(var13, var14, var16);
            class84.method597(var15);
            class240.method1679();
            class240.field4169 = true;
            return var17;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lff;IB)[Lrf;")
    public static final class30[] method375(class3 arg0, int arg1, byte arg2) {
        int var3 = 94 / ((-35 - arg2) / 47);
        ++field870;
        return !class153.method1119(arg0, arg1, 4) ? null : class44.method341((byte) -119);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        int[][] var3 = super.field3035.method637(arg0, false);
        if (super.field3035.field1493) {
            int[][] var4 = this.method1253(this.field859 ? -arg0 + class92.field1520 : arg0, -2880, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field869) {
                for (int var11 = 0; class1.field11 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class1.field11 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class194.field3343];
                    var9[var12] = var6[class194.field3343 - var12];
                    var10[var12] = var7[class194.field3343 - var12];
                }
            }
        }
        if (arg1 != 64) {
            this.method1((byte) -50, -55);
        }
        ++field866;
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
    public static void method376(int arg0) {
        if (arg0 >= -54) {
            field868 = null;
        }
        field864 = null;
        field862 = null;
        field867 = null;
        field868 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lri;Lri;IZIIZ)I")
    public static final int method377(class36 arg0, class36 arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        int var7 = class107.method802(arg0, (byte) 14, arg3, arg4, arg1);
        ++field861;
        if (var7 != 0) {
            return !arg3 ? var7 : -var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            if (arg5 >= -21) {
                field865 = -94;
            }
            int var8 = class107.method802(arg0, (byte) 57, arg6, arg2, arg1);
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field3034 = arg2.method1651(4139) == 1;
                }
            } else {
                this.field859 = ~arg2.method1651(4139) == -2;
            }
        } else {
            this.field869 = arg2.method1651(4139) == 1;
        }
        int var5 = -32 % ((-22 - arg0) / 58);
        ++field858;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class49() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int var3 = 21 / ((arg0 - 62) / 54);
        ++field860;
        int[] var4 = super.field3044.method904((byte) 116, arg1);
        if (super.field3044.field2150) {
            int[] var5 = this.method1255(0, this.field859 ? -arg1 + class92.field1520 : arg1, 128);
            if (!this.field869) {
                class102.method776(var5, 0, var4, 0, class1.field11);
            } else {
                for (int var6 = 0; ~var6 > ~class1.field11; ++var6) {
                    var4[var6] = var5[-var6 + class194.field3343];
                }
            }
        }
        return var4;
    }
}
