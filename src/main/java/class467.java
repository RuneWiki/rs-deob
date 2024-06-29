import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class467 extends class134 {

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "Lnga;")
    public static class514 field6467 = new class514();

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(II)I", line = 3)
    public final int method57(int arg0, int arg1) {
        if (arg1 != 29053) {
            field6467 = null;
        }
        ++field6465;
        return 1;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)I", line = 15)
    public final int method58(int arg0) {
        ++field6468;
        if (arg0 != 0) {
            field6467 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(ILkda;)V", line = 26)
    public class467(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V", line = 29)
    public final void method55(int arg0, int arg1) {
        super.field1708 = arg1;
        int var3 = 26 / ((arg0 - -26) / 41);
        ++field6466;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V", line = 41)
    public static void method2632(byte arg0) {
        field6467 = null;
        if (arg0 != 81) {
            method2632((byte) 73);
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)I", line = 51)
    public final int method2633(byte arg0) {
        if (arg0 < 119) {
            field6467 = null;
        }
        ++field6463;
        return super.field1708;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V", line = 63)
    public final void method60(byte arg0) {
        if (arg0 >= 118) {
            ++field6464;
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lkda;)V", line = 77)
    public class467(class391 arg0) {
        super(arg0);
    }
}
