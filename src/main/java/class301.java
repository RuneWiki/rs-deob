import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class301 {

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Luf;")
    public static class168 field5094 = class148.method1019(-1720, ")4a=");

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIII)V", line = 6)
    public static final void method2055(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5092++;
        int var9 = arg4 - arg8;
        int var10 = (arg1 - arg0 << 16) / var9;
        int var11 = arg3 - arg2;
        if (arg7 != -1312002864) {
            method2055(-19, 70, 29, -43, 26, -112, -57, 104, 15);
        }
        int var12 = (arg5 - arg6 << 16) / var11;
        class113.method828(arg4, var12, arg3, arg6, 0, arg2, arg0, var10, false, 0, arg8);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 48)
    public static void method2056(int arg0) {
        field5094 = null;
        int var1 = -8 / ((arg0 - 37) / 59);
    }
}
