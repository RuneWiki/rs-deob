import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class104 extends class747 {

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    private int field1425 = 409;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "[I")
    private int[] field1424 = new int[3];

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    private int field1427 = 4096;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    private int field1423 = 4096;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    private int field1426 = 4096;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "[B")
    public static byte[] field1430 = new byte[2048];

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V", line = 5)
    public static void method687(byte arg0) {
        field1430 = null;
        int var1 = -17 % ((arg0 - 76) / 38);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 25)
    public class104() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[[I", line = 29)
    public final int[][] method688(int arg0, int arg1) {
        ++field1429;
        int var3 = -127 / ((arg0 - 35) / 58);
        int[][] var4 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int[][] var5 = this.method4158(0, arg1, 2);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~class73.field1095 < ~var12; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field1424[0] + var13;
                if (~var14 > -1) {
                    var14 = -var14;
                }
                if (~this.field1425 > ~var14) {
                    var9[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = -this.field1424[1] + var15;
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (this.field1425 < var16) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field1424[2] + var17;
                        if (~var18 > -1) {
                            var18 = -var18;
                        }
                        if (~this.field1425 > ~var18) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field1423 * var13 >> 12;
                            var10[var12] = this.field1426 * var15 >> 12;
                            var11[var12] = this.field1427 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ldc;II)V", line = 121)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 != 11608) {
            method687((byte) -59);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var5 = arg0.method476((byte) 122);
                            this.field1424[1] = class665.method3759(4080, var5 >> 4);
                            this.field1424[0] = class665.method3759(267386880, var5 << 4);
                            this.field1424[2] = class665.method3759(var5, 255) >> 12;
                        }
                    } else {
                        this.field1423 = arg0.method482(arg1 ^ -772603248);
                    }
                } else {
                    this.field1426 = arg0.method482(-772591672);
                }
            } else {
                this.field1427 = arg0.method482(-772591672);
            }
        } else {
            this.field1425 = arg0.method482(-772591672);
        }
        ++field1428;
    }
}
