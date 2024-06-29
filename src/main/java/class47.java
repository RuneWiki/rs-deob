import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class47 {

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method538(boolean arg0) {
        class271.field3704 = 0;
        if (arg0) {
            field812++;
            class34.field679.method1131((byte) -70);
            class34.field679.method1129(class261.field3588, 262144);
            class271.field3704++;
        }
    }
}
