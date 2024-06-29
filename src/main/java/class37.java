import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class37 extends class334 {

    @OriginalMember(owner = "client!rca", name = "I", descriptor = "Lsi;")
    public static class769 field437 = new class769(8);

    @OriginalMember(owner = "client!rca", name = "M", descriptor = "Low;")
    public static class665 field441 = new class665();

    @OriginalMember(owner = "client!rca", name = "N", descriptor = "I")
    public static int field442 = -2;

    @OriginalMember(owner = "client!rca", name = "E", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!rca", name = "F", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!rca", name = "H", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!rca", name = "J", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!rca", name = "K", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!rca", name = "L", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!rca", name = "O", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(I)V", line = 6)
    private class37(int arg0) {
        super(0, false);
        this.method285(92, arg0);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZI)[[I", line = 16)
    public final int[][] method283(boolean arg0, int arg1) {
        if (!arg0) {
            this.method283(true, 17);
        }
        ++field440;
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (super.field4734.field425) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class439.field6099 < ~var7; ++var7) {
                var4[var7] = this.field439;
                var5[var7] = this.field435;
                var6[var7] = this.field434;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "()V", line = 55)
    public class37() {
        this(0);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZLol;)V", line = 59)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (~arg0 == -1) {
            this.method285(-75, arg2.method2515(115));
        }
        ++field436;
        if (arg1) {
            field437 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)V", line = 86)
    public static void method284(boolean arg0) {
        field441 = null;
        field437 = null;
        if (!arg0) {
            field442 = -96;
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(II)V", line = 99)
    private final void method285(int arg0, int arg1) {
        ++field438;
        this.field434 = (arg1 & 255) << 4;
        int var3 = -126 % ((arg0 - 54) / 33);
        this.field439 = (arg1 & 16711680) >> 12;
        this.field435 = arg1 >> 4 & 4080;
    }
}
