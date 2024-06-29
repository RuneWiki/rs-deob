import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class87 extends class469 {

    @OriginalMember(owner = "client!kba", name = "G", descriptor = "I")
    public static int field1047 = 0;

    @OriginalMember(owner = "client!kba", name = "I", descriptor = "I")
    public static int field1049 = 0;

    @OriginalMember(owner = "client!kba", name = "H", descriptor = "Z")
    public static boolean field1048 = false;

    @OriginalMember(owner = "client!kba", name = "D", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!kba", name = "E", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!kba", name = "F", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!kba", name = "J", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!kba", name = "K", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IF)V", line = 17)
    public final void method506(int arg0, float arg1) {
        if (arg0 == -1) {
            super.field6557 = arg1;
            ++field1045;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 28)
    public static final void method507(String arg0, boolean arg1) {
        if (!arg1) {
            ++field1046;
            System.out.println("Error: " + class565.method3296(31363, "%0a", "\n", arg0));
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILet;)V", line = 43)
    public static final void method508(int arg0, class509 arg1) {
        if (class636.field9146 == arg1.field7099) {
            class371.field4888[arg1.field7161] = true;
        }
        ++field1050;
        if (arg0 <= 123) {
            field1049 = 127;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIII)V", line = 59)
    public final void method509(int arg0, int arg1, int arg2, int arg3) {
        super.field6554 = arg3;
        super.field6558 = arg2;
        if (arg1 == -1) {
            ++field1051;
            super.field6556 = arg0;
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(IIIIIF)V", line = 72)
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIBIII)V", line = 77)
    public static final void method510(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field1044;
        if (arg2 > -57) {
            field1049 = -13;
        }
        for (int var6 = arg3; var6 <= arg0; ++var6) {
            class62.method363(arg4, -128, arg1, class328.field4287[var6], arg5);
        }
    }
}
