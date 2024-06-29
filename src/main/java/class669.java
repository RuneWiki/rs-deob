import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class669 extends class577 {

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public int field9304;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public int field9305;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILti;IIIIIIILin;II)V")
    public static final void method3802(int arg0, class463 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class97 arg9, int arg10, int arg11) {
        class5.field46 = arg6;
        class625.field8758 = arg8;
        class516.field7301 = arg3;
        class202.field3154 = arg7;
        class409.field5557 = null;
        class356.field5014 = arg5;
        class653.field9126 = arg1;
        class228.field3496 = null;
        class115.field1755 = arg2;
        class562.field7983 = arg9;
        class166.field2618 = arg10;
        class229.field3499 = null;
        class458.field6416 = arg4;
        if (arg11 != -14250) {
            method3802(48, null, -58, 66, -32, -111, -56, 109, -44, null, 58, 3);
        }
        class163.field2589 = arg0;
        field9306++;
        class646.method3704((byte) -81);
        class163.field2588 = true;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(II)V")
    public class669(int arg0, int arg1) {
        this.field9304 = arg1;
        this.field9305 = arg0;
    }
}
