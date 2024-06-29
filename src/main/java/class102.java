import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class102 extends RuntimeException {

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1608;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "Ljava/lang/String;")
    public String field1603;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public static int field1604 = 0;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "Lhga;")
    public static class157 field1605 = new class157(128);

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public static int field1607 = -1;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "Lpu;")
    public static class522 field1606;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V", line = 7)
    public static void method828(int arg0) {
        field1606 = null;
        field1605 = null;
        if (arg0 != 30903) {
            method828(-120);
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 31)
    public class102(Throwable arg0, String arg1) {
        this.field1608 = arg0;
        this.field1603 = arg1;
    }
}
