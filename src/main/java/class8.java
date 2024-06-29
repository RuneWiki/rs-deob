import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 extends class32 {

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Lv;")
    public static class146 field152 = class159.method1226((byte) -37, "runes");

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Lv;")
    public static class146 field154 = class159.method1226((byte) -37, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Lua;")
    public static class140 field155 = new class140(64);

    @OriginalMember(owner = "client!b", name = "B", descriptor = "[I")
    public static int[] field160 = new int[2000];

    @OriginalMember(owner = "client!b", name = "C", descriptor = "Z")
    public static boolean field161 = false;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "Lv;")
    public static class146 field164 = class159.method1226((byte) -37, "welle2:");

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "Lv;")
    public class146 field158;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "Ldc;")
    public static class25 field163;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V")
    public static final void method58(boolean arg0, int arg1) {
        field156++;
        if (arg0) {
            class110.field2604 = arg1;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    public static void method59(boolean arg0) {
        field152 = null;
        field160 = null;
        field163 = null;
        field154 = null;
        if (!arg0) {
            field164 = null;
            field155 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BZLla;Lla;)V")
    public static final void method60(byte arg0, boolean arg1, class77 arg2, class77 arg3) {
        class151.field3480 = arg3;
        field153++;
        class153.field3518 = arg2;
        class138.field3131 = arg1;
        if (arg0 != -50) {
            field155 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILla;)V")
    public static final void method61(int arg0, class77 arg1) {
        field159++;
        if (arg0 != 1) {
            field161 = false;
        }
        class38.field861 = arg1;
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
    public static final void method62(int arg0) {
        field157++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
        if (arg0 >= -39) {
            field155 = null;
        }
    }
}
