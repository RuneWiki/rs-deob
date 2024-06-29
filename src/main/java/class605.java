import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class605 {

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field8743 = 0;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V")
    public static final void method3451(byte arg0) {
        if (arg0 == -122) {
            field8742++;
            class90.field1380.method3890(arg0 + 121);
        }
    }
}
