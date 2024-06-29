import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class419 extends IOException {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field5956 = 0;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field5958 = -2;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field5957 = 0;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
    public static boolean field5959 = false;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field5960 = 0;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lvj;)V", line = 11)
    public static final void method2480(class204 arg0) {
        class490.field7029.method787(arg0.field3155, arg0.field3160 + (arg0.method626(-32768) >> 1), arg0.field3154, class433.field6236);
        arg0.field3157 = class433.field6236[0];
        arg0.field3162 = class433.field6236[1];
        arg0.field3164 = class433.field6236[2];
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 17)
    public class419(String arg0) {
        super(arg0);
    }
}
