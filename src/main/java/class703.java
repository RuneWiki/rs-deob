import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class703 {

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public int field9913;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public int field9909;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public int field9917;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public int field9915;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field9918 = 0;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Lcu;")
    public static class201 field9912;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "[I")
    public static int[] field9910;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[Ltd;")
    public static class515[] field9911;

    @OriginalMember(owner = "client!dj", name = "toString", descriptor = "()Ljava/lang/String;", line = 10)
    public final String toString() {
        field9914++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V", line = 23)
    public static void method3949(boolean arg0) {
        field9912 = null;
        if (!arg0) {
            method3949(false);
        }
        field9910 = null;
        field9911 = null;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(IIII)V", line = 40)
    public class703(int arg0, int arg1, int arg2, int arg3) {
        this.field9913 = arg2;
        this.field9909 = arg0;
        this.field9917 = arg1;
        this.field9915 = arg3;
    }
}
