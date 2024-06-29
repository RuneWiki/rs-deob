import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class254 extends class259 {

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "[B")
    public byte[] field3921;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public static int field3924 = 0;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BIIII)V")
    public static final void method1727(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3920++;
        if (arg0 != -101) {
            return;
        }
        class105 var5 = class9.method72(10, -1, arg2);
        var5.method763(false);
        var5.field1553 = arg4;
        var5.field1540 = arg1;
        var5.field1545 = arg3;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "([B)V")
    public class254(byte[] arg0) {
        this.field3921 = arg0;
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(II)V")
    public static final void method1728(int arg0, int arg1) {
        class81.field1261.method938(arg0, (byte) -123);
        class15.field219.method938(arg0, (byte) -123);
        if (arg1 != 10) {
            field3919 = -28;
        }
        field3923++;
    }
}
