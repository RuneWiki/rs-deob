import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class337 extends class14 {

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
    private int field4407 = 4096;

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
    private int field4410 = 4096;

    @OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
    private int field4413 = 409;

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "[I")
    private int[] field4411 = new int[3];

    @OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
    private int field4412 = 4096;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "Lff;")
    public static class9 field4408 = new class9(45, 7);

    @OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
    public static int field4415 = -1;

    @OriginalMember(owner = "client!kp", name = "R", descriptor = "I")
    public static int field4414 = 1;

    @OriginalMember(owner = "client!kp", name = "T", descriptor = "[[I")
    public static int[][] field4416 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "I")
    public static int field4409;

    static {
        new class304("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IBLmd;)V", line = 5)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method2249((byte) 76);
                            this.field4411[2] = class494.method2839(var5 >> 12, 0);
                            this.field4411[0] = class494.method2839(var5, 16711680) << 4;
                            this.field4411[1] = class494.method2839(65280, var5) >> 4;
                        }
                    } else {
                        this.field4407 = arg2.method2212((byte) 83);
                    }
                } else {
                    this.field4410 = arg2.method2212((byte) 83);
                }
            } else {
                this.field4412 = arg2.method2212((byte) 83);
            }
        } else {
            this.field4413 = arg2.method2212((byte) 83);
        }
        int var6 = -112 / ((-51 - arg1) / 37);
        ++field4409;
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)V", line = 66)
    public static void method1925(int arg0) {
        field4416 = null;
        if (arg0 != 65280) {
            field4414 = 115;
        }
        field4408 = null;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V", line = 178)
    public class337() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)[[I", line = 81)
    public final int[][] method141(int arg0, int arg1) {
        if (arg0 != -30909) {
            return null;
        } else {
            ++field4406;
            int[][] var3 = super.field268.method2561(arg1, 0);
            if (super.field268.field6091) {
                int[][] var4 = this.method139(0, 2, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class115.field1637; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field4411[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (var13 > this.field4413) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = var14 - this.field4411[1];
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (this.field4413 < var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field4411[2] + var16;
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (~this.field4413 > ~var17) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field4407 * var12 >> 12;
                                var9[var11] = this.field4410 * var14 >> 12;
                                var10[var11] = this.field4412 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }
}
