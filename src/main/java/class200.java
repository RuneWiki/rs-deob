import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class200 extends class139 {

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "[I")
    private int[] field2914 = new int[3];

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    private int field2912 = 4096;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    private int field2919 = 4096;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    private int field2913 = 409;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    private int field2917 = 4096;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "[I")
    public static int[] field2911 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field2922 = -1;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "[I")
    public static int[] field2920 = new int[5];

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public static int field2921 = -50;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "[I")
    public static int[] field2916 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field2915;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (arg0 >= -67) {
            return null;
        } else {
            if (super.field1835.field2395) {
                int[][] var4 = this.method882(0, arg1, 1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class356.field5147 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field2914[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (this.field2913 < var13) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field2914[1] + var14;
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (~var15 < ~this.field2913) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = var16 - this.field2914[2];
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (var17 > this.field2913) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field2917 * var12 >> 12;
                                var9[var11] = this.field2912 * var14 >> 12;
                                var10[var11] = this.field2919 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public static void method1226(int arg0) {
        field2911 = null;
        field2916 = null;
        if (arg0 != 10913) {
            method1226(-74);
        }
        field2920 = null;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class200() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field2910;
        if (arg1 != -45) {
            method1226(103);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg0.method1748(false);
                            this.field2914[1] = class367.method2256(4080, var5 >> 4);
                            this.field2914[2] = class367.method2256(var5, 255) >> 12;
                            this.field2914[0] = class367.method2256(var5 << 4, 267386880);
                        }
                    } else {
                        this.field2917 = arg0.method1729(65280);
                    }
                } else {
                    this.field2912 = arg0.method1729(65280);
                }
            } else {
                this.field2919 = arg0.method1729(65280);
            }
        } else {
            this.field2913 = arg0.method1729(65280);
        }
    }
}
