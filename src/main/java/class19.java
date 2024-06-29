import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class19 {

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[Lfc;")
    public static class196[] field266 = new class196[14];

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "[Z")
    public static boolean[] field267 = new boolean[112];

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Z")
    public static boolean field271 = false;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
    public static int[] field265;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[Z")
    public static boolean[] field270;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[[Lha;")
    public static class267[][] field268;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class93.field1412 <= arg7 && class142.field2061 >= arg2 && class93.field1418 <= arg4 && class254.field3857 >= arg5) {
            class68.method465(arg2, arg6, arg0, arg7, 5000, arg3, arg5, arg4);
        } else {
            class166.method1107(arg6, arg4, arg5, -32301, arg7, arg3, arg0, arg2);
        }
        if (arg1 != -192) {
            field271 = false;
        }
        field269++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method153(int arg0) {
        field270 = null;
        field267 = null;
        field265 = null;
        field266 = null;
        if (arg0 > -53) {
            field266 = null;
        }
        field268 = null;
    }
}
