import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class177 extends class18 {

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field3500 = 0;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Lob;")
    public static class141 field3499 = class175.method1195(40, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lmd;")
    public static class123 field3498 = new class123(4096);

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field3505 = -1;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "J")
    public static long field3502;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "Lca;")
    public static class22 field3501;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "[I")
    public static int[] field3503;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "[Lkc;")
    public static class102[] field3506;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)J")
    public static final long method1206(int arg0, int arg1, int arg2) {
        class153 var3 = class131.field2506[arg0][arg1][arg2];
        return var3 == null || var3.field2926 == null ? 0L : var3.field2926.field2391;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method1207(int arg0) {
        field3506 = null;
        field3498 = null;
        field3503 = null;
        field3501 = null;
        if (arg0 != -25070) {
            field3499 = null;
        }
        field3499 = null;
    }
}
