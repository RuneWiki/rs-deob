import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class536 extends class553 {

    @OriginalMember(owner = "client!im", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field7093;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "[F")
    public static float[] field7097 = new float[4];

    @OriginalMember(owner = "client!im", name = "y", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)V", line = 3)
    public static final void method2972(int arg0) {
        class300.method1830(18171);
        field7096++;
        if (arg0 <= 16) {
            method2973(76);
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 14)
    public final Object method117(int arg0) {
        if (arg0 == 6390) {
            field7094++;
            return this.field7093;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Z", line = 25)
    public final boolean method118(int arg0) {
        field7095++;
        return arg0 != 2396;
    }

    @OriginalMember(owner = "client!im", name = "g", descriptor = "(I)V", line = 36)
    public static void method2973(int arg0) {
        field7097 = null;
        if (arg0 != 4) {
            method2972(15);
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lhg;Ljava/lang/Object;I)V", line = 46)
    public class536(class648 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7093 = arg1;
    }
}
