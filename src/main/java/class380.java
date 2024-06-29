import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class380 {

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4873 = new Rectangle[100];

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[I")
    public static int[] field4875 = new int[14];

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 4)
    public static void method2185(int arg0) {
        field4873 = null;
        field4875 = null;
        if (arg0 != -7563) {
            method2187(-58, 53, 97, 6, 116);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lji;B)Lbk;", line = 15)
    public static final class349 method2186(class572 arg0, byte arg1) {
        field4872++;
        if (arg1 != 27) {
            method2187(26, 90, -117, -122, 124);
        }
        int var2 = arg0.method3064(-2031091464);
        return new class349(var2);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIII)V", line = 30)
    public static final void method2187(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4874++;
        if (arg3 < arg4) {
            class390.method2223(arg3, arg1, class30.field364[arg0], (byte) -122, arg4);
        } else {
            class390.method2223(arg4, arg1, class30.field364[arg0], (byte) -62, arg3);
        }
        if (arg2 != 468) {
            field4875 = null;
        }
    }
}
