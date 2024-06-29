import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class566 extends class251 {

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "Loja;")
    public static class124 field7986 = new class124();

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "Lv;")
    public static class165 field7987 = new class165();

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IIII)V", line = 10)
    public final void method55(int arg0, int arg1, int arg2, int arg3) {
        super.field3729 = arg3;
        ++field7984;
        super.field3735 = arg0;
        super.field3730 = arg2;
        if (arg1 != 26119132) {
            method3338(true);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V", line = 27)
    public static void method3338(boolean arg0) {
        field7987 = null;
        if (arg0) {
            field7986 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IF)V", line = 42)
    public final void method54(int arg0, float arg1) {
        super.field3737 = arg1;
        int var3 = -93 % ((arg0 - 19) / 55);
        ++field7985;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIIF)V", line = 53)
    public class566(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
