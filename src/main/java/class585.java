import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class585 {

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Lom;")
    private class344 field8447;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Lom;")
    private class344 field8449;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Lju;")
    public static class111 field8446 = new class111("WTRC", 1);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "Lrea;")
    private class192 field8451;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILkd;)Lcca;")
    public final class226 method3348(int arg0, class258 arg1) {
        field8445++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 >= -27) {
            this.method3348(56, null);
        }
        class598 var3 = arg1.method474(6686);
        if (class157.field2681 == var3) {
            return new class324((class99) arg1);
        } else if (class699.field9833 == var3) {
            return new class330(this.method3350((byte) -98), (class129) arg1);
        } else if (class147.field2548 == var3) {
            return new class596(this.field8449, (class673) arg1);
        } else if (class624.field9022 == var3) {
            return new class203(this.field8449, (class24) arg1);
        } else if (class654.field9411 == var3) {
            return new class43(this.field8449, this.field8447, (class705) arg1);
        } else if (class82.field1599 == var3) {
            return new class592(this.field8449, this.field8447, (class66) arg1);
        } else if (class343.field5107 == var3) {
            return new class194(this.field8449, this.field8447, (class496) arg1);
        } else if (class230.field3462 == var3) {
            return new class260(this.field8449, this.field8447, (class409) arg1);
        } else if (class536.field7507 == var3) {
            return new class572(this.field8449, (class403) arg1);
        } else if (class165.field2754 == var3) {
            return new class236(this.field8449, this.field8447, (class653) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method3349(int arg0) {
        field8446 = null;
        if (arg0 != -10557) {
            field8450 = -57;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)Lrea;")
    private final class192 method3350(byte arg0) {
        field8448++;
        if (arg0 != -98) {
            method3349(118);
        }
        if (this.field8451 == null) {
            this.field8451 = new class192();
        }
        return this.field8451;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lom;Lom;)V")
    public class585(class344 arg0, class344 arg1) {
        this.field8447 = arg1;
        this.field8449 = arg0;
    }
}
