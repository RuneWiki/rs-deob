import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class182 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public int field3071 = 128;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public int field3081 = 128;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public int field3078;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Lbea;")
    public static class539 field3072 = new class539();

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "Lla;")
    public static class422 field3079;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "[Lit;")
    public static class34[] field3076;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)Ljk;", line = 8)
    public final class182 method1402(boolean arg0) {
        if (arg0) {
            field3082++;
            return new class182(this.field3078, this.field3081, this.field3071, this.field3075, this.field3074, this.field3073);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V", line = 54)
    public class182(int arg0) {
        this.field3078 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIIIII)V", line = 61)
    private class182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3074 = arg4;
        this.field3075 = arg3;
        this.field3073 = arg5;
        this.field3078 = arg0;
        this.field3071 = arg2;
        this.field3081 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjk;)V", line = 31)
    public final void method1403(int arg0, class182 arg1) {
        this.field3071 = arg1.field3071;
        this.field3075 = arg1.field3075;
        this.field3081 = arg1.field3081;
        field3077++;
        this.field3073 = arg1.field3073;
        this.field3074 = arg1.field3074;
        this.field3078 = arg1.field3078;
        if (arg0 != -15709) {
            method1404(false);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(Z)V", line = 74)
    public static void method1404(boolean arg0) {
        field3079 = null;
        field3076 = null;
        field3072 = null;
        if (!arg0) {
            field3076 = null;
        }
    }
}
