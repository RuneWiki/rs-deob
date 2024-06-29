import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class281 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field4014;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "[I")
    public int[] field4016;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    public int[] field4013;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Li;")
    public static class30 field4015 = new class30();

    @OriginalMember(owner = "client!q", name = "j", descriptor = "[[Z")
    public static boolean[][] field4022 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4019 = new String[200];

    @OriginalMember(owner = "client!q", name = "i", descriptor = "[I")
    public static int[] field4021 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lgn;")
    public static class475 field4020 = new class475(16, 15);

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Lhp;")
    public static class205 field4023;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lhe;")
    public static class239 field4018;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Z")
    public static boolean field4017;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1714(boolean arg0) {
        field4019 = null;
        field4023 = null;
        field4015 = null;
        field4018 = null;
        field4020 = null;
        field4022 = null;
        if (arg0) {
            method1714(true);
        }
        field4021 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V", line = 28)
    public class281(int arg0) {
        this.field4014 = arg0;
        this.field4016 = new int[this.field4014];
        this.field4013 = new int[this.field4014];
    }
}
