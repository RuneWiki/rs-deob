import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class17 extends class145 {

    @OriginalMember(owner = "client!l", name = "F", descriptor = "[I")
    private int[] field166 = new int[3];

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    private int field167 = 4096;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    private int field169 = 4096;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    private int field176 = 409;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    private int field165 = 4096;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "Lig;")
    public static class206 field171 = new class206(53, -1);

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public static int field172 = 0;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field173 = 0;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "[I")
    public static int[] field175 = new int[1];

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Z)V", line = 7)
    public static void method113(boolean arg0) {
        field171 = null;
        if (!arg0) {
            method113(false);
        }
        field175 = null;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 180)
    public class17() {
        super(1, false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)[[I", line = 23)
    public final int[][] method75(byte arg0, int arg1) {
        ++field168;
        if (arg0 >= -28) {
            return null;
        } else {
            int[][] var3 = super.field1792.method1826(arg1, -16486);
            if (super.field1792.field3917) {
                int[][] var4 = this.method866(0, arg1, (byte) -81);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class647.field9368; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var12 - this.field166[0];
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (this.field176 < var13) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field166[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (this.field176 < var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field166[2] + var16;
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (~var17 < ~this.field176) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field167 * var12 >> 12;
                                var9[var11] = this.field165 * var14 >> 12;
                                var10[var11] = this.field169 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILrt;)V", line = 114)
    public final void method28(int arg0, int arg1, class194 arg2) {
        ++field170;
        if (arg1 <= -67) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (arg0 != 3) {
                            if (arg0 == 4) {
                                int var5 = arg2.method1180(-832631516);
                                this.field166[0] = class643.method3659(var5, 16711680) << 4;
                                this.field166[2] = class643.method3659(255, var5) >> 12;
                                this.field166[1] = class643.method3659(var5, 65280) >> 4;
                            }
                        } else {
                            this.field167 = arg2.method1220(123);
                        }
                    } else {
                        this.field165 = arg2.method1220(121);
                    }
                } else {
                    this.field169 = arg2.method1220(125);
                }
            } else {
                this.field176 = arg2.method1220(113);
            }
        }
    }
}
