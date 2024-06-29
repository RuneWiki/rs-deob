import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class103 extends class172 {

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Lsk;")
    public class230 field1672;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "Lci;")
    public static class327 field1673 = new class327();

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V", line = 7)
    public static void method795(byte arg0) {
        field1673 = null;
        if (arg0 != 119) {
            method795((byte) 50);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V", line = 19)
    public static final void method796(byte arg0, int arg1) {
        if (arg0 > -11) {
            field1675 = 62;
        }
        field1671++;
        for (class45 var2 = class344.field5473.method1265(108); var2 != null; var2 = class344.field5473.method1277((byte) -105)) {
            if ((long) arg1 == (var2.field698 >> 48 & 0xFFFFL)) {
                var2.method330(15);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V", line = 43)
    public static final void method797(int arg0) {
        field1670++;
        if (arg0 != 15365) {
            method795((byte) -125);
        }
        class193.field3082.method2327(1);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lsk;)V", line = 54)
    public class103(class230 arg0) {
        this.field1672 = arg0;
    }
}
