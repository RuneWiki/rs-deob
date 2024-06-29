import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class397 extends class428 {

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field5935 = 0;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field5940 = 0;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[I")
    public static int[] field5937 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 12)
    public static final void method2497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field5941++;
        class63 var13 = new class63();
        var13.field820 = arg12;
        var13.field829 = arg7;
        var13.field831 = arg10;
        var13.field819 = arg6;
        var13.field830 = arg5;
        var13.field834 = arg3;
        var13.field825 = arg8;
        var13.field826 = arg9;
        var13.field818 = arg1;
        var13.field824 = arg11;
        var13.field832 = arg2;
        if (arg4 == 0) {
            var13.field821 = arg0;
            class126.field1940.method245(arg4 + 500, var13);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 38)
    public static void method2498(int arg0) {
        if (arg0 != 0) {
            method2498(-67);
        }
        field5937 = null;
    }
}
