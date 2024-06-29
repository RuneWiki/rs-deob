import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class767 extends class316 {

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public static int field10555 = 0;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "[Lfb;")
    public static class702[] field10560 = new class702[2048];

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field10553;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    private int field10556;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    private int field10557;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field10558;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public static int field10559;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    private int field10561;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    private int field10563;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "Ltd;")
    public static class477 field10554;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "[[[Lcja;")
    public static class46[][][] field10562;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V", line = 3)
    public static final void method4237(byte arg0) {
        class186.method1307(class37.field491, -77, (long) class192.field2961);
        field10553++;
        if (class371.field5137 != -1) {
            class250.method1649(125, class371.field5137);
        }
        int var1 = -109 % ((-arg0 - 71) / 39);
        for (int var2 = 0; var2 < class470.field6596; var2++) {
            if (class698.field9719[var2]) {
                class744.field10313[var2] = true;
            }
            class466.field6553[var2] = class698.field9719[var2];
            class698.field9719[var2] = false;
        }
        class42.field542 = class192.field2961;
        if (class371.field5137 != -1) {
            class470.field6596 = 0;
            class286.method1851(20906);
        }
        class37.field491.method511();
        class326.method2088(121, class37.field491);
        int var3 = class7.method50(-3569);
        if (var3 == -1) {
            var3 = class275.field3980;
        }
        if (var3 == -1) {
            var3 = class572.field8073;
        }
        class758.method4211(var3, false);
        class471.field6608 = 0;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 58)
    public static void method4238(int arg0) {
        field10554 = null;
        field10562 = null;
        if (arg0 != -22794) {
            method4237((byte) 11);
        }
        field10560 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLmda;)V", line = 71)
    public final void method152(byte arg0, class276 arg1) {
        field10559++;
        if (arg0 >= 80) {
            arg1.method1791(this.field10563, this.field10556, -4930, this.field10557, this.field10561);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILso;)V", line = 82)
    public final void method148(int arg0, class494 arg1) {
        field10558++;
        this.field10556 = arg1.method2976(-124);
        if (arg0 == -1001) {
            this.field10563 = arg1.method2976(arg0 ^ 0x394);
            this.field10557 = arg1.method2964((byte) 94);
            this.field10561 = arg1.method2964((byte) 124);
        }
    }
}
