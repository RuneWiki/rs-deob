import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class255 {

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "I")
    public int field3780;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "Lat;")
    public class255 field3779;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "Lia;")
    public class414 field3774;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "Z")
    public static boolean field3778 = true;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3784;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public int field3773;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public int field3776;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public static int field3783;

    static {
        new class475("From", "Von:", "De", "De");
        field3784 = new Color[] { new Color(9179409), new Color(16777215) };
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V", line = 14)
    public static void method1704(byte arg0) {
        if (arg0 < 124) {
            field3784 = null;
        }
        field3784 = null;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)Lrp;", line = 26)
    public final class299 method1705(byte arg0) {
        field3783++;
        int var2 = 19 / ((36 - arg0) / 61);
        return class335.method2045(true, this.field3780);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Z", line = 36)
    public static final boolean method1706(int arg0) {
        field3775++;
        if (arg0 == 0) {
            return class450.field6706 > 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)Lat;", line = 50)
    public final class255 method1707(int arg0, int arg1) {
        if (arg1 != 16777215) {
            field3778 = true;
        }
        field3781++;
        return new class255(this.field3780, arg0);
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(II)V", line = 60)
    public class255(int arg0, int arg1) {
        this.field3777 = arg1;
        this.field3780 = arg0;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lat;I)V", line = 78)
    public class255(class255 arg0, int arg1) {
        this.field3779 = arg0;
        this.field3777 = this.field3779.field3777 + arg1;
        this.field3774 = this.field3779.field3774;
        this.field3780 = this.field3779.field3780;
    }
}
