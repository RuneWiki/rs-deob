import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class232 extends class184 {

    @OriginalMember(owner = "client!tu", name = "I", descriptor = "I")
    private int field2959 = 0;

    @OriginalMember(owner = "client!tu", name = "Q", descriptor = "[S")
    private short[] field2967 = new short[257];

    @OriginalMember(owner = "client!tu", name = "O", descriptor = "I")
    public static int field2965 = 0;

    @OriginalMember(owner = "client!tu", name = "L", descriptor = "Lap;")
    public static class335 field2962 = new class335("K", "T", "K", "K");

    @OriginalMember(owner = "client!tu", name = "E", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!tu", name = "G", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!tu", name = "H", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!tu", name = "J", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!tu", name = "M", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!tu", name = "N", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!tu", name = "P", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!tu", name = "D", descriptor = "[I")
    private int[] field2954;

    @OriginalMember(owner = "client!tu", name = "K", descriptor = "[I")
    private int[] field2961;

    @OriginalMember(owner = "client!tu", name = "F", descriptor = "[[I")
    private int[][] field2956;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(II)[I", line = 4)
    private final int[] method1406(int arg0, int arg1) {
        ++field2958;
        if (arg0 < 0) {
            return this.field2954;
        } else if (arg0 >= this.field2956.length) {
            return this.field2961;
        } else {
            int var3 = -77 % ((arg1 - -32) / 63);
            return this.field2956[arg0];
        }
    }

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "(Z)V", line = 26)
    public static void method1407(boolean arg0) {
        if (!arg0) {
            method1407(true);
        }
        field2962 = null;
    }

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "(Z)V", line = 38)
    private final void method1408(boolean arg0) {
        ++field2964;
        if (arg0) {
            this.method1409(127);
        }
        int var2 = this.field2959;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field2956.length - 1 > var5 && var4 >= this.field2956[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field2956[var5 + -1];
                    int[] var7 = this.field2956[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = 4096 - class108.field1360[(8160 & var8) >> 5] >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field2967[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field2956.length + -1 && this.field2956[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field2956[var14 + -1];
                    int[] var16 = this.field2956[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field2967[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field2956.length + -1 > var22 && this.field2956[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field2956[var22 + -1];
                int[] var24 = this.field2956[var22];
                int var25 = this.method1406(var22 + -2, -126)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1406(var22 - -1, 72)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + var26 - var25;
                int var32 = -var26 + -var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 - -var26 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2967[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V", line = 222)
    public class232() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)[I", line = 225)
    public final int[] method6(int arg0, int arg1) {
        ++field2966;
        if (arg1 != 578) {
            method1407(false);
        }
        int[] var3 = super.field2409.method248(arg0, arg1 + 16776382);
        if (super.field2409.field436) {
            int[] var4 = this.method1159(123, arg0, 0);
            for (int var5 = 0; ~var5 > ~class245.field3167; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2967[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BILfh;)V", line = 266)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        if (~arg1 == -1) {
            this.field2959 = arg2.method2737(false);
            this.field2956 = new int[arg2.method2737(false)][2];
            for (int var4 = 0; this.field2956.length > var4; ++var4) {
                this.field2956[var4][0] = arg2.method2758((byte) 110);
                this.field2956[var4][1] = arg2.method2758((byte) 119);
            }
        }
        int var5 = 120 / ((arg0 - -13) / 51);
        ++field2955;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)V", line = 293)
    public final void method109(boolean arg0) {
        ++field2957;
        if (this.field2956 == null) {
            this.field2956 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field2956.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field2959 == 2) {
                this.method1409(-6995);
            }
            class93.method721(4096);
            this.method1408(arg0);
        }
    }

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "(I)V", line = 314)
    private final void method1409(int arg0) {
        ++field2960;
        int[] var2 = this.field2956[0];
        int[] var3 = this.field2956[1];
        int[] var4 = this.field2956[this.field2956.length + -2];
        int[] var5 = this.field2956[this.field2956.length + -1];
        this.field2961 = new int[] { var4[0] - (var5[0] + -var4[0]), var4[1] - -var4[1] + -var5[1] };
        if (arg0 != -6995) {
            method1407(true);
        }
        this.field2954 = new int[] { var2[0] + -var3[0] + var2[0], -var3[1] - (-var2[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIZ)Z", line = 335)
    public static final boolean method1410(int arg0, int arg1, boolean arg2) {
        ++field2963;
        if (arg2) {
            return false;
        } else {
            return (arg0 & 32768) != 0;
        }
    }
}
