import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class59 {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public int field907 = 128;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public int field911 = 128;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "[C")
    public static char[] field912 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Lcu;")
    public static class206 field910 = new class206(23, 3);

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[I")
    public static int[] field917 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field916 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 4)
    public static void method487(int arg0) {
        field910 = null;
        if (arg0 == 2345) {
            field917 = null;
            field912 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ldl;Z)V", line = 22)
    public final void method488(class59 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        this.field915 = arg0.field915;
        this.field913 = arg0.field913;
        this.field907 = arg0.field907;
        this.field908 = arg0.field908;
        this.field909 = arg0.field909;
        this.field911 = arg0.field911;
        field914++;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V", line = 76)
    public class59(int arg0) {
        this.field908 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIIII)V", line = 83)
    private class59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field909 = arg3;
        this.field915 = arg4;
        this.field907 = arg1;
        this.field913 = arg5;
        this.field911 = arg2;
        this.field908 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Ldl;", line = 41)
    public final class59 method489(boolean arg0) {
        if (arg0) {
            field906++;
            return new class59(this.field908, this.field907, this.field911, this.field909, this.field915, this.field913);
        } else {
            return null;
        }
    }
}
