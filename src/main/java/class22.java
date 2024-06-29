import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class22 extends class243 {

    @OriginalMember(owner = "client!qo", name = "G", descriptor = "I")
    private int field160 = 0;

    @OriginalMember(owner = "client!qo", name = "K", descriptor = "I")
    private int field164 = 1;

    @OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
    private int field161 = 0;

    @OriginalMember(owner = "client!qo", name = "I", descriptor = "Z")
    public static boolean field162 = false;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!qo", name = "F", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!qo", name = "J", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!qo", name = "L", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "Lha;")
    public static class60 field158;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(B)V", line = 7)
    public final void method85(byte arg0) {
        class333.method1982(0);
        ++field163;
        if (arg0 != 66) {
            method87(51);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)[I", line = 19)
    public final int[] method5(int arg0, int arg1) {
        ++field157;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int var4 = class685.field9613[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class687.field9628 > var6; ++var6) {
                int var7 = class666.field9279[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field161 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field164 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field164;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field160 != 0) {
                    if (this.field160 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class133.field1707[(4088 & var12) >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 != 255) {
            method87(-79);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILji;B)V", line = 87)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 3) {
                    this.field164 = arg1.method3428((byte) 76);
                }
            } else {
                this.field160 = arg1.method3428((byte) -112);
            }
        } else {
            this.field161 = arg1.method3428((byte) -117);
        }
        ++field165;
        if (arg2 > -92) {
            this.field161 = 61;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZI)V", line = 131)
    public static final void method86(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 != -29680) {
            field162 = false;
        }
        ++field159;
        if (class604.field8417.method2552((long) arg3, -1) == null) {
            if (!class397.field5637) {
                class757.method4213(-1, arg2, arg3);
            } else {
                class585 var4 = new class585(arg3, new class79(4096, class704.field9882, arg3), arg1, arg2);
                var4.field8189.method3704(true, class68.field744[class723.field10095]);
                class604.field8417.method2558(var4, (long) arg3, arg0 + 29679);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V", line = 166)
    public class22() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V", line = 176)
    public static void method87(int arg0) {
        field158 = null;
        if (arg0 != 615) {
            method87(96);
        }
    }
}
