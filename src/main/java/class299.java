import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class299 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field4459 = 1338;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field4461 = -1;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static final void method1863(byte arg0) {
        if (arg0 != -102) {
            field4461 = -84;
        }
        if (class306.field4504 < 0) {
            class675.field9543 = -1;
            class623.field8692 = -1;
            class306.field4504 = 0;
        }
        field4460++;
        if (class306.field4504 > class148.field2209) {
            class623.field8692 = -1;
            class675.field9543 = -1;
            class306.field4504 = class148.field2209;
        }
        if (class480.field6695 < 0) {
            class623.field8692 = -1;
            class480.field6695 = 0;
            class675.field9543 = -1;
        }
        if (class480.field6695 > class148.field2213) {
            class480.field6695 = class148.field2213;
            class675.field9543 = -1;
            class623.field8692 = -1;
        }
    }
}
