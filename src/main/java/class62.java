import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class62 extends RuntimeException {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1036;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Ljava/lang/String;")
    public String field1039;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Z")
    public static boolean field1040 = false;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field1041 = 0;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[I")
    public static int[] field1044 = new int[50];

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Lmb;")
    public static class132 field1045 = class166.method1092("null", 114);

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Loc;")
    public static class155 field1043;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lbf;")
    public static class18 field1038;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method398(byte arg0) {
        field1043 = null;
        field1044 = null;
        if (arg0 < -93) {
            field1045 = null;
            field1038 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method399(Component arg0, boolean arg1) {
        arg0.addMouseListener(class69.field1147);
        if (!arg1) {
            field1045 = null;
        }
        arg0.addMouseMotionListener(class69.field1147);
        field1037++;
        arg0.addFocusListener(class69.field1147);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class62(Throwable arg0, String arg1) {
        this.field1036 = arg0;
        this.field1039 = arg1;
    }
}
