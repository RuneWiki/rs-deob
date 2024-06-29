import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class105 extends class334 {

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "Ldd;")
    public class480 field1536;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field1533 = 1;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static final void method710(int arg0) {
        field1535++;
        if (!class299.field4712) {
            return;
        }
        class307.field4820 = null;
        if (arg0 <= -119) {
            class299.field4712 = false;
            class62.field973 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method226(int arg0);

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ldd;I)V")
    public class105(class480 arg0, int arg1) {
        this.field1534 = arg1;
        this.field1536 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)Z")
    public abstract boolean method227(int arg0);
}
