import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class85 extends class674 {

    @OriginalMember(owner = "client!qfa", name = "N", descriptor = "Ljn;")
    public static class669 field1046 = class134.method1164((byte) 86);

    @OriginalMember(owner = "client!qfa", name = "O", descriptor = "Lhga;")
    public static class158 field1047 = new class158(33, -2);

    @OriginalMember(owner = "client!qfa", name = "P", descriptor = "Lrl;")
    public static class672 field1048 = new class672(58, 2);

    @OriginalMember(owner = "client!qfa", name = "F", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!qfa", name = "H", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!qfa", name = "K", descriptor = "Lri;")
    public static class97 field1045;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IF)V", line = 3)
    public final void method188(int arg0, float arg1) {
        super.field9504 = arg1;
        if (arg0 >= 71) {
            ++field1044;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIII)V", line = 17)
    public final void method187(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field1048 = null;
        }
        super.field9502 = arg1;
        super.field9498 = arg3;
        ++field1043;
        super.field9506 = arg0;
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(IIIIIF)V", line = 33)
    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V", line = 39)
    public static void method796(int arg0) {
        if (arg0 == -2) {
            field1046 = null;
            field1048 = null;
            field1047 = null;
            field1045 = null;
        }
    }
}
