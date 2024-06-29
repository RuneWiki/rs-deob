import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 implements class126 {

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "Lvd;")
    private class39 field180;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Ljava/lang/String;")
    private String field179;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field178 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Lgj;", line = 5)
    public final class637 method27(int arg0) {
        if (arg0 >= -40) {
            return null;
        } else {
            field182++;
            return class637.field8944;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)I", line = 16)
    public final int method31(byte arg0) {
        field176++;
        if (arg0 > -16) {
            return 85;
        } else if (this.field180.method204(this.field179, 88)) {
            return 100;
        } else {
            return this.field180.method225(65, this.field179);
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lvd;Ljava/lang/String;)V", line = 36)
    public class13(class39 arg0, String arg1) {
        this.field180 = arg0;
        this.field179 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V", line = 46)
    public static void method86(byte arg0) {
        if (arg0 > 47) {
            field178 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILjava/lang/String;)V", line = 61)
    public static final void method87(int arg0, int arg1, String arg2) {
        field181++;
        if (arg0 >= -30) {
            field177 = 120;
        }
        class150 var3 = class676.method3885(1000, 2, arg1);
        var3.method1116(95);
        var3.field2344 = arg2;
    }
}
