import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class295 extends class615 {

    @OriginalMember(owner = "client!en", name = "G", descriptor = "I")
    private int field4167 = 409;

    @OriginalMember(owner = "client!en", name = "N", descriptor = "I")
    private int field4173 = 4096;

    @OriginalMember(owner = "client!en", name = "Q", descriptor = "[I")
    private int[] field4176 = new int[3];

    @OriginalMember(owner = "client!en", name = "I", descriptor = "I")
    private int field4169 = 4096;

    @OriginalMember(owner = "client!en", name = "S", descriptor = "I")
    private int field4178 = 4096;

    @OriginalMember(owner = "client!en", name = "O", descriptor = "I")
    public static int field4174 = 0;

    @OriginalMember(owner = "client!en", name = "K", descriptor = "Z")
    public static boolean field4171 = false;

    @OriginalMember(owner = "client!en", name = "L", descriptor = "[I")
    public static int[] field4172 = new int[1];

    @OriginalMember(owner = "client!en", name = "F", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!en", name = "J", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!en", name = "P", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!en", name = "R", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4168;
        if (arg3 < 117) {
            method1813(-43, 122, 85, 3, 41, 10, -88, 0);
        }
        int var8 = arg4 + -334;
        if (~var8 > -1) {
            var8 = 0;
        } else if (~var8 < -101) {
            var8 = 100;
        }
        int var9 = class338.field4679 - -((-class338.field4679 + class193.field2830) * var8 / 100);
        int var10 = arg2 * var9 >> 8;
        int var11 = -arg1 + 16384 & 16383;
        int var12 = 16383 & -arg0 + 16384;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (~var11 != -1) {
            var14 = class126.field2116[var11] * -var10 >> 14;
            var15 = class126.field2105[var11] * var10 >> 14;
        }
        if (~var12 != -1) {
            var13 = class126.field2116[var12] * var15 >> 14;
            var15 = class126.field2105[var12] * var15 >> 14;
        }
        class643.field8632 = -var15 + arg5;
        class370.field4993 = 0;
        class553.field7350 = -var14 + arg7;
        class259.field3563 = arg6 - var13;
        class331.field4539 = arg0;
        class510.field6806 = arg1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)[[I")
    public final int[][] method223(int arg0, int arg1) {
        ++field4175;
        if (arg0 != 2) {
            method1815(94, 36, -113);
        }
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (super.field8129.field6315) {
            int[][] var4 = this.method3368(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class505.field6740; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field4176[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field4167 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field4176[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field4167 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4176[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field4167) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4173 * var12 >> 12;
                            var9[var11] = this.field4178 * var14 >> 12;
                            var10[var11] = this.field4169 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V")
    public static void method1814(int arg0) {
        field4172 = null;
        if (arg0 > -29) {
            method1814(-71);
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(III)Z")
    public static final boolean method1815(int arg0, int arg1, int arg2) {
        ++field4177;
        if (arg1 != -1188787538) {
            field4174 = -60;
        }
        return class449.method2542(arg0, arg2, 34) | ~(arg2 & 458752) != -1 || class74.method563(arg2, (byte) 108, arg0);
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
    public class295() {
        super(1, false);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        ++field4170;
        if (arg0 >= 44) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (~arg1 == -5) {
                                int var5 = arg2.method2042((byte) 53);
                                this.field4176[0] = class571.method3139(var5, 16711680) << 4;
                                this.field4176[1] = class571.method3139(4080, var5 >> 4);
                                this.field4176[2] = class571.method3139(var5, 255) >> 12;
                            }
                        } else {
                            this.field4173 = arg2.method2001((byte) -83);
                        }
                    } else {
                        this.field4178 = arg2.method2001((byte) -83);
                    }
                } else {
                    this.field4169 = arg2.method2001((byte) -83);
                }
            } else {
                this.field4167 = arg2.method2001((byte) -83);
            }
        }
    }
}
