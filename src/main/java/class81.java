import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class81 {

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "Z")
    public boolean field901;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public static int field908 = -1;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "Ljava/lang/String;")
    public static String field907 = null;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "Lnq;")
    public class396 field900;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "Lnq;")
    public class396 field902;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "Lsw;")
    public static class652 field904;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "Z")
    public boolean field903;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Z", line = 4)
    public static final boolean method532(int arg0) {
        field898++;
        if (class636.method3630(122, "jaclib")) {
            return arg0 > -93 ? false : class636.method3630(121, "hw3d");
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BII)Z", line = 24)
    public static final boolean method533(byte arg0, int arg1, int arg2) {
        field905++;
        return arg0 > -122 ? false : class585.method3405(1, arg1, arg2) & class519.method3071(arg1, -8926, arg2);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V", line = 35)
    public static void method534(byte arg0) {
        field907 = null;
        int var1 = 113 % ((8 - arg0) / 51);
        field904 = null;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V", line = 46)
    public final void method535(int arg0) {
        if (this.field900 != null) {
            this.field900.method650(true);
        }
        if (arg0 == -1) {
            field899++;
            this.field903 = false;
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)Z", line = 65)
    public final boolean method536(int arg0) {
        if (arg0 >= -103) {
            field907 = null;
        }
        field906++;
        return this.field903 && !this.field901;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Z)V", line = 79)
    public class81(boolean arg0) {
        this.field901 = arg0;
    }
}
