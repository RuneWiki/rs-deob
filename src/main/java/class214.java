import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class214 {

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public int field3645 = -1;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lsb;")
    public static class98 field3638 = class47.method368("hitbar_default", 0);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lsb;")
    private static class98 field3641 = class47.method368("Cancel", 0);

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lsb;")
    public static class98 field3640 = field3641;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3642 = 0;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lsb;")
    public static class98 field3647 = class47.method368("(U0a )2 via: ", 0);

    @OriginalMember(owner = "client!re", name = "k", descriptor = "[Lsb;")
    public static class98[] field3648 = new class98[8];

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lsb;")
    public static class98 field3650 = class47.method368(": ", 0);

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lsf;")
    public class180 field3644;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "[I")
    public static int[] field3639;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "[I")
    public int[] field3643;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "[Lsb;")
    public class98[] field3651;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "[[S")
    public static short[][] field3646;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I")
    public static int method1427(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZILtg;)Lve;")
    public static final class174 method1428(boolean arg0, int arg1, class75 arg2) {
        if (!arg0) {
            field3642 = 45;
        }
        field3649++;
        return class164.method1184(arg1, arg2, (byte) -120) ? class204.method1379((byte) -124) : null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method1429(byte arg0) {
        field3648 = null;
        if (arg0 != -32) {
            return;
        }
        field3640 = null;
        field3639 = null;
        field3641 = null;
        field3638 = null;
        field3646 = null;
        field3650 = null;
        field3647 = null;
    }
}
