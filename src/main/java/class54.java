import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class54 extends class164 {

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field870 = 0;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "[[Z")
    public static boolean[][] field872 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZZ)V", line = 3)
    public static final void method567(boolean arg0, boolean arg1, boolean arg2) {
        if (!arg0) {
            method569(-18);
        }
        if (arg1) {
            class58.field904--;
            if (class58.field904 == 0) {
                class119.field1524 = null;
            }
        }
        field867++;
        if (!arg2) {
            return;
        }
        class315.field4167--;
        if (class315.field4167 == 0) {
            class285.field3868 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V", line = 30)
    public static final void method568(int arg0) {
        for (int var1 = 0; var1 < class244.field3334; var1++) {
            class68 var2 = class465.field6487[var1];
            if (var2.field1047 == 3) {
                if (var2.field1046 == null) {
                    var2.field1041 = Integer.MIN_VALUE;
                } else {
                    class399.field5624.method1805(var2.field1046);
                }
            }
        }
        field866++;
        if (arg0 < 61) {
            method569(74);
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 60)
    public static void method569(int arg0) {
        field872 = null;
        if (arg0 > -21) {
            method569(-15);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIB)I", line = 70)
    public static final int method570(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field871++;
        if (arg4 != 39) {
            method570(-11, 127, -111, -15, (byte) -42);
        }
        int var5 = 65536 - class395.field5582[arg0 * 8192 / arg3] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
    }
}
