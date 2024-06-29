import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class207 extends class98 {

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    private int field2942 = 4096;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    private int field2944 = 4096;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "I")
    private int field2952 = 409;

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "[I")
    private int[] field2953 = new int[3];

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
    private int field2949 = 4096;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "[I")
    public static int[] field2951 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
    public static int field2954 = 50;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "[I")
    public static int[] field2946 = new int[field2954];

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field2945 = new String[field2954];

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "[I")
    public static int[] field2950 = new int[field2954];

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "[I")
    public static int[] field2948 = new int[field2954];

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "[I")
    public static int[] field2943 = new int[field2954];

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "[I")
    public static int[] field2941 = new int[field2954];

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "[I")
    public static int[] field2938 = new int[field2954];

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "[I")
    public static int[] field2955 = new int[3];

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 8)
    public class207() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)I", line = 12)
    public static final int method1356(boolean arg0, int arg1) {
        if (arg0) {
            method1356(false, -49);
        }
        ++field2939;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(B)V", line = 36)
    public static void method1357(byte arg0) {
        field2946 = null;
        field2941 = null;
        field2938 = null;
        field2943 = null;
        field2945 = null;
        field2950 = null;
        field2955 = null;
        field2948 = null;
        field2951 = null;
        int var1 = -30 % ((arg0 - -75) / 49);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[[I", line = 54)
    public final int[][] method194(int arg0, int arg1) {
        ++field2937;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        int var4 = -63 % ((60 - arg1) / 43);
        if (super.field1184.field332) {
            int[][] var5 = this.method546(arg0, (byte) 33, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~class268.field3811 < ~var12; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field2953[0] + var13;
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (this.field2952 < var14) {
                    var9[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = -this.field2953[1] + var15;
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (~var16 < ~this.field2952) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field2953[2] + var17;
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (this.field2952 < var18) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field2942 * var13 >> 12;
                            var10[var12] = this.field2944 * var15 >> 12;
                            var11[var12] = this.field2949 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILdg;I)V", line = 151)
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field2936;
        if (arg2 != 0) {
            method1357((byte) -63);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            int var5 = arg1.method1616(false);
                            this.field2953[0] = class33.method210(16711680, var5) << 4;
                            this.field2953[1] = class33.method210(var5 >> 4, 4080);
                            this.field2953[2] = class33.method210(0, var5 >> 12);
                        }
                    } else {
                        this.field2942 = arg1.method1617((byte) 48);
                    }
                } else {
                    this.field2944 = arg1.method1617((byte) 48);
                }
            } else {
                this.field2949 = arg1.method1617((byte) 48);
            }
        } else {
            this.field2952 = arg1.method1617((byte) 48);
        }
    }
}
