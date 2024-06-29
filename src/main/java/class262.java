import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class262 extends class252 {

    @OriginalMember(owner = "client!g", name = "V", descriptor = "Ljd;")
    private static class85 field4629 = class221.method1499("Feb", (byte) -63);

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "Ljd;")
    private static class85 field4632 = class221.method1499("Nov", (byte) 119);

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "Ljd;")
    private static class85 field4633 = class221.method1499("Apr", (byte) -58);

    @OriginalMember(owner = "client!g", name = "T", descriptor = "Ljd;")
    private static class85 field4627 = class221.method1499("May", (byte) -103);

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "Ljd;")
    private static class85 field4636 = class221.method1499("Jan", (byte) 89);

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "Ljd;")
    private static class85 field4642 = class221.method1499("Dec", (byte) 90);

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "Ljd;")
    private static class85 field4635 = class221.method1499("Aug", (byte) -100);

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "Ljd;")
    private static class85 field4646 = class221.method1499("Jun", (byte) 88);

    @OriginalMember(owner = "client!g", name = "nb", descriptor = "Ljd;")
    private static class85 field4647 = class221.method1499("Jul", (byte) 119);

    @OriginalMember(owner = "client!g", name = "U", descriptor = "Ljd;")
    private static class85 field4628 = class221.method1499("Mar", (byte) -100);

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "Ljd;")
    private static class85 field4643 = class221.method1499("Oct", (byte) 98);

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "Ljd;")
    private static class85 field4640 = class221.method1499("Sep", (byte) -69);

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "[Ljd;")
    public static class85[] field4634 = new class85[] { field4636, field4629, field4628, field4633, field4627, field4646, field4647, field4635, field4640, field4643, field4632, field4642 };

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    private int field4637;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
    private int field4639;

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
    private int field4645;

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "Lge;")
    public static class68 field4644;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field4641;
        if (arg1 != -123) {
            method1792(-121);
        }
        int[][] var3 = super.field4350.method155(arg0, false);
        if (super.field4350.field338) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class5.field63; ++var7) {
                var4[var7] = this.field4645;
                var5[var7] = this.field4637;
                var6[var7] = this.field4639;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V")
    private class262(int arg0) {
        super(0, false);
        this.method1793(-91, arg0);
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
    public static void method1792(int arg0) {
        field4643 = null;
        field4633 = null;
        field4634 = null;
        field4640 = null;
        field4636 = null;
        field4644 = null;
        field4635 = null;
        field4628 = null;
        if (arg0 != -882400948) {
            method1792(52);
        }
        field4627 = null;
        field4632 = null;
        field4647 = null;
        field4646 = null;
        field4629 = null;
        field4642 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field4630;
        if (arg2 != -99) {
            this.method1793(87, 25);
        }
        if (~arg1 == -1) {
            this.method1793(arg2 + 218, arg0.method1691(19388));
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V")
    private final void method1793(int arg0, int arg1) {
        int var3 = -95 % ((arg0 - 30) / 59);
        this.field4639 = (arg1 & 255) << 4;
        this.field4637 = arg1 >> 4 & 4080;
        this.field4645 = (16711680 & arg1) >> 12;
        ++field4638;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class262() {
        this(0);
    }
}
