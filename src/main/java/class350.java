import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class350 extends class453 implements class254 {

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
    private int field4846;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "[I")
    public static int[] field4847;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "[S")
    public static short[] field4850;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "[[Z")
    public static boolean[][] field4844;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "(B)V", line = 5)
    public static final void method2108(byte arg0) {
        ++field4851;
        class120.field1679.method924((byte) 68);
        for (int var1 = 0; var1 < 32; ++var1) {
            class281.field4103[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; ++var2) {
            class520.field7645[var2] = 0L;
        }
        int var3 = 49 / ((70 - arg0) / 37);
        class373.field5540 = 0;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)J", line = 31)
    public final long method1363(byte arg0) {
        ++field4848;
        if (arg0 > -59) {
            field4847 = null;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)I", line = 45)
    public final int method1358(int arg0) {
        ++field4845;
        if (arg0 != -2584) {
            this.method1358(46);
        }
        return super.field6664;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lfd;I[BIZ)V", line = 57)
    public class350(class365 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field4846 = arg1;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)I", line = 65)
    public final int method1360(byte arg0) {
        ++field4843;
        if (arg0 >= -20) {
            this.method1360((byte) 31);
        }
        return this.field4846;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V", line = 76)
    public static void method2109(int arg0) {
        if (arg0 != -11836) {
            field4847 = null;
        }
        field4847 = null;
        field4850 = null;
        field4844 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([BZII)V", line = 90)
    public final void method1361(byte[] arg0, boolean arg1, int arg2, int arg3) {
        this.method2731(45, arg3, arg0);
        ++field4852;
        if (!arg1) {
            this.method1358(-54);
        }
        this.field4846 = arg2;
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)V", line = 103)
    public final void method1102(byte arg0) {
        if (arg0 >= 113) {
            ++field4849;
            super.field6661.method2253(-63, this);
        }
    }
}
