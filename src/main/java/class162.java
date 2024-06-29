import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class162 extends class261 {

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "[S")
    private short[] field2721 = new short[257];

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    private int field2727 = 0;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "Lve;")
    public static class255 field2720 = class87.method607(75, "ul");

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "Ltl;")
    public static class197 field2730 = null;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    public static int field2728 = 0;

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "Lve;")
    public static class255 field2729 = class87.method607(24, ")2");

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "[I")
    private int[] field2719;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "[I")
    private int[] field2732;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "[[I")
    private int[][] field2715;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 6)
    public class162() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZZLrg;Lrg;)V", line = 12)
    public static final void method1166(boolean arg0, boolean arg1, class88 arg2, class88 arg3) {
        field2725++;
        class253.field4266 = arg3;
        if (!arg0) {
            class33.field537 = arg1;
            class59.field895 = arg2;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lpb;BI)V", line = 31)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 >= -115) {
            return;
        }
        if (arg2 == 0) {
            this.field2727 = arg0.method481(0);
            this.field2715 = new int[arg0.method481(0)][2];
            for (int var4 = 0; var4 < this.field2715.length; var4++) {
                this.field2715[var4][0] = arg0.method423(255);
                this.field2715[var4][1] = arg0.method423(255);
            }
        }
        field2731++;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V", line = 59)
    public static void method1167(int arg0) {
        field2730 = null;
        field2720 = null;
        field2729 = null;
        if (arg0 != 1697479500) {
            method1170(-95, 49);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)[I", line = 76)
    public final int[] method21(byte arg0, int arg1) {
        field2726++;
        int var3 = 104 / ((arg0 + 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int[] var5 = this.method1822(0, 107, arg1);
            for (int var6 = 0; var6 < class92.field1576; var6++) {
                int var7 = var5[var6] >> 4;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var4[var6] = this.field2721[var7];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V", line = 129)
    private final void method1168(int arg0) {
        int var2 = this.field2727;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; this.field2715.length - 1 > var5 && var4 >= this.field2715[var5][0]; var5++) {
                }
                int[] var6 = this.field2715[var5];
                int[] var7 = this.field2715[var5 - 1];
                int var8 = this.method1173(var5 - 2, (byte) 0)[1];
                int var9 = var7[1];
                int var10 = var6[1];
                int var11 = var10 - var8;
                int var12 = this.method1173(var5 + 1, (byte) 0)[1];
                int var13 = var12 + var9 - var8 - var10;
                int var15 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var16 = var8 - var9 - var13;
                int var17 = var15 * var15 >> 12;
                int var18 = (var13 * var15 >> 12) * var17 >> 12;
                int var19 = var11 * var15 >> 12;
                int var20 = var16 * var17 >> 12;
                int var21 = var9 + var18 + var20 + var19;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field2721[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; (this.field2715.length - 1) > var24 && this.field2715[var24][0] <= var23; var24++) {
                }
                int[] var25 = this.field2715[var24 - 1];
                int[] var26 = this.field2715[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - class72.field1188[(var27 & 0x1FEE) >> 5] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var29 + (var26[1] * var28) >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field2721[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; var33 < (this.field2715.length - 1) && var32 >= this.field2715[var33][0]; var33++) {
                }
                int[] var34 = this.field2715[var33 - 1];
                int[] var35 = this.field2715[var33];
                int var36 = (var32 - var34[0] << 12) / (var35[0] - var34[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var37 + (var35[1] * var36) >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2721[var31] = (short) var38;
            }
        }
        if (arg0 != -32769) {
            this.field2727 = 122;
        }
        field2723++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILve;)Lve;", line = 308)
    public static final class255 method1169(int arg0, class255 arg1) {
        field2713++;
        int var2 = class187.method1304(arg1, false);
        if (var2 == -1) {
            return class85.field1377;
        } else {
            if (arg0 != 0) {
                method1167(-96);
            }
            return class266.field4506.field854[var2].method1775(class279.field4782, class148.field2506, ~arg0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V", line = 325)
    public static final void method1170(int arg0, int arg1) {
        field2714++;
        class168.field2819.method562((byte) 45, arg0);
        class259.field4392.method562((byte) 44, arg0);
        if (arg1 <= 97) {
            field2729 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lpb;IIIIIZII)V", line = 345)
    public static final void method1171(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (arg7 != -50) {
            field2730 = (class197) null;
        }
        field2718++;
        if (arg4 < 0 || arg4 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var11 = arg0.method481(arg7 ^ 0xFFFFFFCE);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg0.method481(0);
                    break;
                }
                if (var11 <= 49) {
                    arg0.method481(0);
                }
            }
            return;
        }
        if (!arg6) {
            class166.field2800[arg2][arg4][arg3] = 0;
        }
        while (true) {
            int var9 = arg0.method481(0);
            if (var9 == 0) {
                if (arg6) {
                    class106.field1783[0][arg4][arg3] = class43.field677[0][arg4][arg3];
                } else if (arg2 == 0) {
                    class106.field1783[0][arg4][arg3] = -class185.method1295(arg3 + arg5 + 556238, -58, arg4 + arg8 + 932731) * 8;
                } else {
                    class106.field1783[arg2][arg4][arg3] = class106.field1783[arg2 - 1][arg4][arg3] - 240;
                }
                break;
            }
            if (var9 == 1) {
                int var10 = arg0.method481(0);
                if (arg6) {
                    class106.field1783[0][arg4][arg3] = var10 * 8 + class43.field677[0][arg4][arg3];
                } else {
                    if (var10 == 1) {
                        var10 = 0;
                    }
                    if (arg2 == 0) {
                        class106.field1783[0][arg4][arg3] = -var10 * 8;
                    } else {
                        class106.field1783[arg2][arg4][arg3] = class106.field1783[arg2 - 1][arg4][arg3] - (var10 * 8);
                    }
                }
                break;
            }
            if (var9 <= 49) {
                class159.field2685[arg2][arg4][arg3] = arg0.method466((byte) -100);
                class220.field3704[arg2][arg4][arg3] = (byte) ((var9 - 2) / 4);
                class248.field4156[arg2][arg4][arg3] = (byte) class154.method1134(3, var9 + arg1 - 2);
            } else if (var9 > 81) {
                class282.field4847[arg2][arg4][arg3] = (byte) (var9 - 81);
            } else if (!arg6) {
                class166.field2800[arg2][arg4][arg3] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V", line = 448)
    private final void method1172(int arg0) {
        field2722++;
        int[] var2 = this.field2715[0];
        int[] var3 = this.field2715[1];
        int[] var4 = this.field2715[this.field2715.length - 2];
        int[] var5 = this.field2715[this.field2715.length - 1];
        this.field2719 = new int[] { var4[0] + var4[0] - var5[0], var4[1] - var5[1] - -var4[1] };
        this.field2732 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
        if (arg0 != -15192) {
            field2720 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(B)V", line = 476)
    public final void method111(byte arg0) {
        field2733++;
        if (this.field2715 == null) {
            this.field2715 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field2715.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (arg0 != -57) {
            field2728 = -65;
        }
        if (this.field2727 == 2) {
            this.method1172(-15192);
        }
        class254.method1735(arg0 + 129);
        this.method1168(-32769);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)[I", line = 509)
    private final int[] method1173(int arg0, byte arg1) {
        field2717++;
        if (arg0 < 0) {
            return this.field2732;
        } else if (arg1 == 0) {
            return this.field2715.length <= arg0 ? this.field2719 : this.field2715[arg0];
        } else {
            return (int[]) null;
        }
    }
}
