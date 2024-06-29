import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class290 extends class35 {

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Z")
    public boolean field4403 = false;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public int field4401 = -1;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Z")
    public static boolean field4405 = false;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field4400;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public int field4402;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public int field4406;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public int field4408;

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
    public class290(int arg0) {
        this.field4401 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
    public static final void method1837(int arg0) {
        if (class385.field5695 != -1) {
            class391.method2361(true, -1, -1, false, class385.field5695);
            class385.field5695 = -1;
        }
        if (arg0 == 4004) {
            field4407++;
        }
    }
}
