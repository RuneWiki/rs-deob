import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class156 extends class222 {

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "Lgj;")
    public static class226 field2843 = new class226(50);

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "I")
    public static int field2846 = 0;

    @OriginalMember(owner = "client!ci", name = "fb", descriptor = "[I")
    public static int[] field2852 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "[[[I")
    public static int[][][] field2847 = new int[4][13][13];

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ci", name = "cb", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ci", name = "eb", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!ci", name = "gb", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ci", name = "db", descriptor = "[Lnj;")
    public static class82[] field2850;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V")
    public static final void method1130(int arg0) {
        if (arg0 >= 92) {
            for (int var1 = 0; var1 < 100; ++var1) {
                class208.field3563[var1] = true;
            }
            ++field2849;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class156() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V")
    public static final void method1131(int arg0) {
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        System.exit(arg0);
        ++field2845;
    }

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)V")
    public static void method1132(int arg0) {
        field2847 = null;
        field2850 = null;
        if (arg0 != 20508) {
            field2848 = 11;
        }
        field2852 = null;
        field2843 = null;
    }

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "(I)V")
    public static final void method1133(int arg0) {
        ++field2851;
        Object var1 = class265.field4634;
        synchronized (class265.field4634) {
            if (~class134.field2368 == -1) {
                class119.field2145.method32(new class198(), 5, (byte) -121);
            }
            class134.field2368 = 600;
            if (arg0 != 1) {
                field2846 = -63;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 <= 35) {
            method1130(-89);
        }
        ++field2853;
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            class66.method465(var3, 0, class13.field253, class214.field3639[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "(I)V")
    public static final void method1134(int arg0) {
        class117.field2101 = null;
        class108.field1940 = null;
        class157.field2854 = null;
        if (arg0 != 28517) {
            field2843 = null;
        }
        ++field2844;
        class153.field2801 = null;
    }
}
