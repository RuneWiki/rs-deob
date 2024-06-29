import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class113 {

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public static int field2112 = 0;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
    public static final void method1026(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class727.field9991[var1] = false;
        }
        field2115++;
        class657.field9101 = 0;
        class289.field3991 = -1;
        class100.field1626 = -1;
        class577.field8185 = -1;
        class536.field7291 = 1;
        class281.field3906 = -1;
        class355.field4849 = 0;
        if (arg0 != -21651) {
            field2112 = -79;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)Z")
    public static final boolean method1027(int arg0, int arg1) {
        field2113++;
        if (arg0 == 7) {
            return arg1 == 3 || arg1 == 7 || arg1 == 10;
        } else {
            return true;
        }
    }
}
