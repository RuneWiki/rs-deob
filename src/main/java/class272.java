import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class272 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3781 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static final void method1739(boolean arg0) {
        field3780++;
        class109.field1536.method1118(class197.field2783, class96.field1399.field5220 ? class327.field5014 + 256 << 0 : -1, 256);
        if (arg0) {
            method1739(false);
        }
    }
}
