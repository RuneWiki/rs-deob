import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class133 extends class487 {

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "Ljs;")
    public class334 field1705;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "Llga;")
    public static class712 field1706 = new class712(13, 8);

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "[I")
    public static int[] field1707;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
    public static void method836(int arg0) {
        if (arg0 != 13) {
            field1704 = -35;
        }
        field1706 = null;
        field1707 = null;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Luv;II[B)V")
    public class133(class367 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1705 = arg0.method2176(arg1, class695.field9710, (byte) 87, arg3, false, arg2);
        this.field1705.method1694(false, false, 76);
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Luv;II[I)V")
    public class133(class367 arg0, int arg1, int arg2, int[] arg3) {
        this.field1705 = arg0.method2150(arg1, arg2, (byte) 31, arg3, false);
        this.field1705.method1694(false, false, 77);
    }
}
