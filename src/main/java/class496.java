import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class496 {

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public int field6750;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field6752 = -1;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field6751 = 0;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(II)V")
    public class496(int arg0, int arg1) {
        this.field6750 = arg0;
    }

    @OriginalMember(owner = "client!ts", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6753++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static final void method2793(int arg0) {
        int var1 = 48 % ((-arg0 - 33) / 32);
        field6749++;
        if (class486.field6678) {
            return;
        }
        class498.field6773 = true;
        if (class366.field4875.field9367) {
            class705.field9964 = ((int) class705.field9964 + 191 & 0xFFFFFF80);
        } else {
            class367.field4942 += (24.0F - class367.field4942) / 2.0F;
        }
        class486.field6678 = true;
    }
}
