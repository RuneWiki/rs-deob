import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class589 extends class626 {

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "Ljava/lang/String;")
    public String field8279;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
    public static int field8278 = 0;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
    public static final void method3384(int arg0) {
        field8277++;
        if (arg0 != 0) {
            method3384(79);
        }
        class416.field5830.method4204((byte) 68);
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
    public class589() {
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class589(String arg0) {
        this.field8279 = arg0;
    }
}
