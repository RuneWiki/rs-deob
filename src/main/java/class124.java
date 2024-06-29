import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class124 extends class381 {

    @OriginalMember(owner = "client!op", name = "m", descriptor = "Lls;")
    public class92 field1919;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "Z")
    public static boolean field1918 = false;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "Lbh;")
    public static class28 field1920;

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lqg;II[B)V", line = 10)
    public class124(class321 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1919 = class168.method1192(62, arg0, 6406, arg2, false, 6406, arg1, arg3);
        this.field1919.method1534(false, 115, false);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 21)
    public static void method930(int arg0) {
        if (arg0 <= -125) {
            field1920 = null;
        }
    }
}
