import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class246 extends class186 {

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field3951;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public static int field3952 = -1;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "J")
    public static long field3953 = 0L;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Leq;Ljava/lang/Object;I)V")
    public class246(class137 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3951 = arg1;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)Z")
    public final boolean method1422(int arg0) {
        field3950++;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1420(byte arg0) {
        field3949++;
        if (arg0 != 122) {
            field3953 = -30L;
        }
        return this.field3951;
    }
}
