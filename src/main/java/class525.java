import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class525 extends class34 {

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    private int field7671 = 4096;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "[I")
    public static int[] field7669 = new int[14];

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field7672 = 0;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field7674 = 1405;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V")
    public static void method3117(byte arg0) {
        field7669 = null;
        if (arg0 > -34) {
            field7672 = -2;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field7670;
        if (arg1 < 16) {
            this.method64(91, (byte) 123);
        }
        if (~arg2 == -1) {
            this.field7671 = arg0.method1844(-127);
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
    public class525() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field7673;
        int[] var3 = super.field537.method1780(arg0, (byte) 119);
        int var4 = 29 / (arg1 / 50);
        if (super.field537.field4191) {
            int[] var5 = this.method252(false, class343.field4968 & arg0 + -1, 0);
            int[] var6 = this.method252(false, arg0, 0);
            int[] var7 = this.method252(false, class343.field4968 & arg0 + 1, 0);
            for (int var8 = 0; ~class383.field5502 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field7671;
                int var10 = (var6[class120.field1872 & var8 - -1] - var6[var8 - 1 & class120.field1872]) * this.field7671;
                int var11 = var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var14 + 4096 + var13) / 4096.0F)) * 4096.0D);
                int var16 = var15 != 0 ? 16777216 / var15 : 0;
                var3[var8] = 4096 - var16;
            }
        }
        return var3;
    }
}
