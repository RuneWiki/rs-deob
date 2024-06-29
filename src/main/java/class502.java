import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class502 {

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "[[Z")
    public static boolean[][] field7114 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "Lpha;")
    public static class174 field7115 = new class174("", 15);

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!lia", name = "e", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V", line = 4)
    public static void method3033(int arg0) {
        field7115 = null;
        field7114 = null;
        if (arg0 != 15) {
            method3034(false, 3, 17, -120);
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(ZIII)V", line = 19)
    public static final void method3034(boolean arg0, int arg1, int arg2, int arg3) {
        field7112++;
        if (!arg0) {
            method3034(false, 49, -14, -28);
        }
        class190.field2932 = new byte[arg1][arg2][arg3];
    }
}
