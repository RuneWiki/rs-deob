import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class268 extends class184 {

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "Lap;")
    public static class335 field3394 = new class335("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "Lap;")
    public static class335 field3396 = new class335("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "F")
    public static float field3395;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "[[I")
    public static int[][] field3391;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(II)Z")
    public static final boolean method1594(int arg0, int arg1) {
        if (arg0 != 3) {
            field3394 = null;
        }
        ++field3393;
        return arg1 == 3 || ~arg1 == -8 || arg1 == 10;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
    public class268() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)V")
    public static void method1595(int arg0) {
        field3396 = null;
        field3394 = null;
        field3391 = null;
        if (arg0 > -53) {
            field3391 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        if (arg1 != 578) {
            method1594(-18, -44);
        }
        ++field3392;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (super.field2409.field436) {
            class318.method1876(var3, 0, class245.field3167, class334.field4218[arg0]);
        }
        return var3;
    }
}
