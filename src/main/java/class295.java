import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class295 extends class130 {

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "Z")
    public static boolean field4544 = false;

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "[I")
    public static int[] field4547 = new int[1000];

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "F")
    public static float field4545;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public int field4542;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "I")
    public int field4546;

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "[[I")
    public static int[][] field4548;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V", line = 12)
    public static final void method1967(boolean arg0) {
        field4540++;
        class326.field4937.method1637((byte) 13);
        if (arg0) {
            field4545 = -1.4168435F;
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)V", line = 35)
    public static void method1968(boolean arg0) {
        if (arg0) {
            method1967(true);
        }
        field4547 = null;
        field4548 = null;
    }
}
