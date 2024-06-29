import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public abstract class class237 extends class6 {

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
    public int field3348;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "Lsl;")
    public class319 field3349;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLad;)V", line = 9)
    public static final void method1456(byte arg0, class293 arg1) {
        if (arg0 >= -102) {
            return;
        }
        arg1.field4048 = false;
        field3350++;
        if (arg1.field4046 != null) {
            arg1.field4046.field7239 = 0;
        }
        for (class293 var2 = arg1.method550(); var2 != null; var2 = arg1.method521()) {
            method1456((byte) -112, var2);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lsl;I)V", line = 29)
    public class237(class319 arg0, int arg1) {
        this.field3348 = arg1;
        this.field3349 = arg0;
    }

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "(I)Z")
    public abstract boolean method1035(int arg0);

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1032(int arg0);
}
