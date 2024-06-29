import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class245 extends class529 {

    @OriginalMember(owner = "client!dga", name = "F", descriptor = "I")
    private int field3150 = 4096;

    @OriginalMember(owner = "client!dga", name = "G", descriptor = "I")
    private int field3151 = 4096;

    @OriginalMember(owner = "client!dga", name = "K", descriptor = "[I")
    private int[] field3155 = new int[3];

    @OriginalMember(owner = "client!dga", name = "I", descriptor = "I")
    private int field3153 = 409;

    @OriginalMember(owner = "client!dga", name = "E", descriptor = "I")
    private int field3149 = 4096;

    @OriginalMember(owner = "client!dga", name = "H", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!dga", name = "J", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!dga", name = "L", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!dga", name = "D", descriptor = "Z")
    public static boolean field3148;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg1 < 45) {
            this.field3155 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            int var5 = arg2.method1114(127);
                            this.field3155[2] = class272.method1629(var5 >> 12, 0);
                            this.field3155[0] = class272.method1629(var5, 16711680) << 4;
                            this.field3155[1] = class272.method1629(65280, var5) >> 4;
                        }
                    } else {
                        this.field3151 = arg2.method1107(false);
                    }
                } else {
                    this.field3150 = arg2.method1107(false);
                }
            } else {
                this.field3149 = arg2.method1107(false);
            }
        } else {
            this.field3153 = arg2.method1107(false);
        }
        ++field3154;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "()V")
    public class245() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "(I)V")
    public static final void method1515(int arg0) {
        class595.field8271 = 0;
        class658.field9043 = 0;
        class310.field3966 = 0;
        class649.field8918 = 0;
        ++field3152;
        if (arg0 != -6300) {
            method1515(-75);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)[[I")
    public final int[][] method592(int arg0, int arg1) {
        ++field3156;
        if (arg1 != 2) {
            return null;
        } else {
            int[][] var3 = super.field7450.method2241(-1, arg0);
            if (super.field7450.field5165) {
                int[][] var4 = this.method3026(0, arg0, 18464);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class304.field3909 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field3155[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (~this.field3153 > ~var13) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field3155[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~this.field3153 > ~var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field3155[2] + var16;
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (this.field3153 < var17) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field3151 * var12 >> 12;
                                var9[var11] = this.field3150 * var14 >> 12;
                                var10[var11] = this.field3149 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }
}
