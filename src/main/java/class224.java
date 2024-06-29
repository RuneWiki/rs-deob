import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class224 extends class646 {

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
    private int field3355 = 4096;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "I")
    private int field3357 = 4096;

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "[I")
    private int[] field3356 = new int[3];

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    private int field3361 = 409;

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
    private int field3365 = 4096;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "[I")
    public static int[] field3362 = new int[2];

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "Z")
    public static boolean field3359 = false;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "J")
    public static long field3358;

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V", line = 32)
    public class224() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)V", line = 15)
    public static void method1485(boolean arg0) {
        field3362 = null;
        if (!arg0) {
            method1486((class329) null, -124);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)[[I", line = 38)
    public final int[][] method298(int arg0, int arg1) {
        ++field3360;
        int[][] var3 = super.field9164.method1002(69, arg1);
        if (super.field9164.field2082) {
            int[][] var4 = this.method3626(arg0 ^ -12532, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class89.field1330 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field3356[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field3361 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3356[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field3361) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3356[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field3361) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field3355 * var12 >> 12;
                            var9[var11] = this.field3357 * var14 >> 12;
                            var10[var11] = this.field3365 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg0 != -12424) {
            this.field3361 = -127;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lek;IB)V", line = 131)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg2 <= 7) {
            this.method298(-37, -19);
        }
        ++field3364;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method2714(true);
                            this.field3356[0] = class248.method1593(16711680, var5) << 4;
                            this.field3356[1] = class248.method1593(var5 >> 4, 4080);
                            this.field3356[2] = class248.method1593(255, var5) >> 12;
                        }
                    } else {
                        this.field3355 = arg0.method2755((byte) -85);
                    }
                } else {
                    this.field3357 = arg0.method2755((byte) -126);
                }
            } else {
                this.field3365 = arg0.method2755((byte) -63);
            }
        } else {
            this.field3361 = arg0.method2755((byte) -62);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lhp;I)I", line = 201)
    public static final int method1486(class329 arg0, int arg1) {
        ++field3363;
        if (class696.field9881 == arg0) {
            return 9216;
        } else if (class689.field9778 != arg0) {
            if (class66.field955 == arg0) {
                return 34066;
            } else if (arg1 != 11613) {
                return -70;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 34065;
        }
    }
}
