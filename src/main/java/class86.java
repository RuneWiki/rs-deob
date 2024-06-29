import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class86 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Ljava/lang/String;")
    public String field1050;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Ljava/lang/String;")
    public String field1052;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Ljava/lang/String;")
    public String field1054;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lhga;")
    public static class158 field1049 = new class158(18, 2);

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Lhga;")
    public static class158 field1053 = new class158(88, 8);

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Los;")
    public static class408 field1055 = new class408(4);

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 8)
    public static final void method797(int arg0) {
        field1051++;
        class326.method2199(2, 22050, 2520, class17.field282.field4862);
        class78.field996 = class638.method3703(-1024, class271.field4377, 22050, class402.field6207, 0);
        class258.method1828(true, -97, class333.method2306((byte) -105, null));
        class253.field4040 = class638.method3703(-1024, class271.field4377, 2048, class402.field6207, 1);
        class505.field7381 = new class278();
        class253.field4040.method1754(class505.field7381, (byte) 28);
        class694.field9729 = new class678(22050, class41.field581);
        class560.field8076 = class663.field9232.method928(false, "scape main");
        class87.method800((byte) 7);
        if (arg0 < 32) {
            method798((byte) -84);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 35)
    public static void method798(byte arg0) {
        if (arg0 <= 57) {
            method797(-126);
        }
        field1049 = null;
        field1055 = null;
        field1053 = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 47)
    public class86(String arg0, String arg1, String arg2) {
        this.field1050 = arg0;
        this.field1052 = arg1;
        this.field1054 = arg2;
    }
}
