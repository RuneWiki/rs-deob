import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class245 {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Ljn;")
    public static class409 field3621 = new class409("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lvq;")
    public static class24 field3624 = new class24(92, -1);

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Lbn;")
    public static class160 field3625 = new class160(17, 7);

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Z")
    public static boolean field3627 = false;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lct;")
    public static class104 field3623;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "[I")
    public static int[] field3626;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1633(int arg0) {
        field3622++;
        int var1 = arg0;
        for (int var2 = 0; var2 < class195.field2745; var2++) {
            for (int var3 = 0; var3 < class78.field984; var3++) {
                if (class10.method172(1, var2, var3, var1, true, class178.field2530)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V", line = 39)
    public static void method1634(int arg0) {
        int var1 = -123 % ((arg0 - 63) / 42);
        field3623 = null;
        field3626 = null;
        field3621 = null;
        field3625 = null;
        field3624 = null;
    }
}
