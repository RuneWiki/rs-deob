import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class403 extends class223 {

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public int field5974;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public int field5976;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "Z")
    public static boolean field5973 = false;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "Lsb;")
    public static class191 field5975;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static void method2474(int arg0) {
        field5975 = null;
        if (arg0 != 31469) {
            field5973 = true;
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(II)V")
    public class403(int arg0, int arg1) {
        this.field5974 = arg0;
        this.field5976 = arg1;
    }
}
