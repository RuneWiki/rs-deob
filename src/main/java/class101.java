import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class101 extends class160 {

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    private int field1696;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1692 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "[I")
    public static int[] field1695;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field1693;
        if (arg1 != 57) {
            field1697 = 8;
        }
        int[] var3 = super.field2488.method15((byte) 125, arg0);
        if (super.field2488.field42) {
            class175.method1191(var3, 0, class240.field3896, this.field1696);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class101() {
        this(4096);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg1 <= 11) {
            field1697 = 91;
        }
        if (~arg2 == -1) {
            this.field1696 = (arg0.method633(107) << 12) / 255;
        }
        ++field1694;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V")
    public class101(int arg0) {
        super(0, true);
        this.field1696 = 4096;
        this.field1696 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public static void method739(int arg0) {
        field1695 = null;
        field1692 = null;
        if (arg0 != 32739) {
            field1692 = null;
        }
    }
}
