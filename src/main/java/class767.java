import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class767 extends class260 {

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field10580;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field10582;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field10583;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field10584;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field10585;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field10586;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field10587;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field10588;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "[[S")
    public static short[][] field10581;

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(ILfca;)V", line = 9)
    public class767(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 12)
    public static void method4249(int arg0) {
        field10581 = null;
        if (arg0 != 320) {
            method4249(-72);
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lfca;)V", line = 22)
    public class767(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)I", line = 25)
    public final int method4(int arg0, byte arg1) {
        int var3 = 10 / ((-53 - arg1) / 50);
        ++field10583;
        return 3;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V", line = 35)
    public final void method2(boolean arg0) {
        if (!arg0) {
            super.field3868 = this.method8((byte) 4);
            ++field10582;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V", line = 46)
    public static final void method4250(String arg0, byte arg1, String arg2) {
        ++field10580;
        if (arg2.length() <= 320) {
            if (class302.method1905((byte) -48)) {
                if (class457.field6340 != null) {
                    class457.field6340.method3027(2);
                    class457.field6340 = null;
                }
                class159.method1167((byte) 83);
                class537.field7310 = arg0;
                class83.field1175 = arg2;
                if (arg1 <= 115) {
                    field10587 = 16;
                }
                class300.method1901(5, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IB)V", line = 76)
    public final void method9(int arg0, byte arg1) {
        if (arg1 == -107) {
            ++field10584;
            super.field3868 = arg0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)I", line = 91)
    public final int method4251(int arg0) {
        if (arg0 < 3) {
            return -103;
        } else {
            ++field10586;
            return super.field3868;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)I", line = 102)
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            field10581 = null;
        }
        ++field10588;
        return super.field3867.method737(false) == class380.field5545 && super.field3867.method740((byte) -112) ? 0 : 1;
    }
}
