import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class288 extends class15 {

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "Lug;")
    public class238 field4780;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "Lce;")
    public static class126 field4781 = class206.method1445(-7923, "D-Bmarrage de la librairie 3D");

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "Lce;")
    public static class126 field4779 = class206.method1445(-7923, "ondulation:");

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field4782 = 1;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field4783 = 0;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "Lce;")
    public static class126 field4788 = class206.method1445(-7923, "cyan:");

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "Lcc;")
    public static class313 field4786;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "Z")
    public static boolean field4785;

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lug;)V", line = 21)
    public class288(class238 arg0) {
        this.field4780 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(B)V", line = 37)
    public static void method1915(byte arg0) {
        field4781 = null;
        field4788 = null;
        field4786 = null;
        field4779 = null;
        if (arg0 != -114) {
            field4783 = -56;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IZ)I", line = 61)
    public static final int method1916(int arg0, boolean arg1) {
        field4787++;
        if (!arg1) {
            method1916(49, true);
        }
        return arg0 >>> 7;
    }
}
