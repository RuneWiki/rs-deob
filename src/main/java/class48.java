import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class48 {

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Z")
    public boolean field858 = true;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field859 = 0;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Ljava/lang/String;")
    public static String field861 = "level: ";

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field866 = 0;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lqg;")
    public static class104 field865;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lqh;")
    public static class201 field854;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lf;")
    public static class36 field852;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "[Lph;")
    public static class78[] field863;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static void method382(byte arg0) {
        field861 = null;
        field852 = null;
        field854 = null;
        field863 = null;
        if (arg0 < 17) {
            field852 = null;
        }
        field865 = null;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field857 = arg2;
        this.field858 = arg6;
        this.field851 = arg0;
        this.field864 = arg4;
        this.field862 = arg3;
        this.field853 = arg5;
        this.field855 = arg1;
    }
}
