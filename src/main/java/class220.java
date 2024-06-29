import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class220 {

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Z")
    public static boolean field3076;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "[I")
    public static int[] field3079;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "[B")
    public static byte[] field3078;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public static final void method1228(int arg0) {
        class438.field6286 = 0;
        field3075++;
        for (int var1 = 0; var1 < 2048; var1++) {
            class360.field5176[var1] = null;
            class188.field2556[var1] = 1;
        }
        if (arg0 != 2) {
            field3076 = false;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
    public static void method1229(byte arg0) {
        field3079 = null;
        field3078 = null;
        int var1 = 122 / ((arg0 + 19) / 44);
    }

    static {
        new class40(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field3076 = false;
        field3079 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
        field3078 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
    }
}
