import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class249 extends class170 {

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    private int field4508 = 4096;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "Lbf;")
    public static class199 field4511 = new class199(500);

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "I")
    public static int field4514 = 0;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "I")
    public static int field4515 = 0;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "Lqk;")
    public static class207 field4513 = class24.method212(255, ")1");

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "[I")
    public static int[] field4516 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "[Lbl;")
    public static class33[] field4512;

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class249() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(Z)V")
    public static void method1752(boolean arg0) {
        field4511 = null;
        if (arg0) {
            field4516 = null;
            field4513 = null;
            field4512 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 != 5877) {
            this.method31((byte) -33, -106);
        }
        ++field4509;
        if (~arg2 == -1) {
            this.field4508 = arg0.method1050(1272006568);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IZ)Z")
    public static final boolean method1753(int arg0, boolean arg1) {
        ++field4510;
        if (arg0 >= 97 && ~arg0 >= -123) {
            return true;
        } else if (~arg0 <= -66 && ~arg0 >= -91) {
            return true;
        } else if (arg0 >= 48 && ~arg0 >= -58) {
            return true;
        } else {
            if (arg1) {
                field4513 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field4507;
        int[] var3 = super.field3001.method1538(108, arg1);
        if (arg0 != -30) {
            method1752(true);
        }
        if (super.field3001.field3835) {
            int[] var4 = this.method1226(0, class233.field4294 & arg1 + -1, -66);
            int[] var5 = this.method1226(0, arg1, 105);
            int[] var6 = this.method1226(0, class233.field4294 & arg1 + 1, 95);
            for (int var7 = 0; ~class88.field1595 < ~var7; ++var7) {
                int var8 = (var5[var7 + 1 & class94.field1684] + -var5[var7 - 1 & class94.field1684]) * this.field4508;
                int var9 = (var6[var7] + -var4[var7]) * this.field4508;
                int var10 = var8 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var11 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }
}
