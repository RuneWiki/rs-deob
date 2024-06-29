import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class475 extends class362 {

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    private int field6426 = 4096;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "Lmo;")
    public static class780 field6428 = new class780("", 12);

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public static int field6431 = 0;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "Lgj;")
    public static class662 field6432;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method156(int arg0, int arg1) {
        if (arg0 != -2026769311) {
            this.method156(-6, -86);
        }
        ++field6427;
        int[] var3 = super.field4927.method808(-124, arg1);
        if (super.field4927.field1471) {
            int[] var4 = this.method2221(0, arg1 - 1 & class606.field8463, -124);
            int[] var5 = this.method2221(0, arg1, arg0 ^ -2026769345);
            int[] var6 = this.method2221(0, class606.field8463 & arg1 + 1, 16);
            for (int var7 = 0; ~var7 > ~class769.field10597; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field6426;
                int var9 = (var5[var7 + 1 & class522.field7083] + -var5[class522.field7083 & var7 + -1]) * this.field6426;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 92)
    public class475() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 65)
    public static void method2726(int arg0) {
        field6428 = null;
        field6432 = null;
        if (arg0 != 3) {
            field6432 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lfca;II)V", line = 78)
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field6425;
        if (arg1 == 0) {
            this.field6426 = arg0.method763(76);
        }
        if (arg2 != -1) {
            method2726(-88);
        }
    }
}
