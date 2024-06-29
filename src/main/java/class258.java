import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class258 extends class429 {

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
    public static int field3941 = -50;

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "[Lf;")
    public static class702[] field3939;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIBLvq;I)V")
    public static final void method1710(int arg0, int arg1, int arg2, int arg3, byte arg4, class425 arg5, int arg6) {
        class201.method1336(arg2, arg5.field3029, arg1, arg6, arg0, arg3, -513, arg5.field3024, arg5.field3019, 0);
        field3940++;
        if (arg4 != 33) {
            field3939 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
    public static void method1711(int arg0) {
        if (arg0 != -50) {
            method1710(-117, 19, -93, -13, (byte) -107, null, -72);
        }
        field3939 = null;
    }
}
