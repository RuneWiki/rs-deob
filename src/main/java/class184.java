import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class184 extends class267 implements class305 {

    @OriginalMember(owner = "client!mja", name = "l", descriptor = "I")
    private int field2791;

    @OriginalMember(owner = "client!mja", name = "o", descriptor = "Z")
    public static boolean field2794 = false;

    @OriginalMember(owner = "client!mja", name = "r", descriptor = "I")
    public static int field2797 = 0;

    @OriginalMember(owner = "client!mja", name = "m", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!mja", name = "n", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!mja", name = "p", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!mja", name = "q", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!mja", name = "s", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!mja", name = "t", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!mja", name = "v", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!mja", name = "u", descriptor = "Lvr;")
    public static class458 field2800;

    @OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Llea;ILjaclib/memory/Buffer;IZ)V", line = 3)
    public class184(class573 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2791 = arg1;
    }

    @OriginalMember(owner = "client!mja", name = "e", descriptor = "(I)V", line = 12)
    public static void method1328(int arg0) {
        field2800 = null;
        if (arg0 != 34962) {
            field2794 = true;
        }
    }

    @OriginalMember(owner = "client!mja", name = "c", descriptor = "(I)V", line = 25)
    public final void method1329(int arg0) {
        super.field3780.method3379(this, (byte) -15);
        if (arg0 == 0) {
            ++field2798;
        }
    }

    @OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Llea;I[BIZ)V", line = 36)
    public class184(class573 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2791 = arg1;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(I)I", line = 44)
    public final int method1330(int arg0) {
        ++field2796;
        if (arg0 != 22302) {
            field2797 = 13;
        }
        return super.field3781;
    }

    @OriginalMember(owner = "client!mja", name = "f", descriptor = "(I)V", line = 57)
    public static final void method1331(int arg0) {
        if (arg0 >= -83) {
            method1331(91);
        }
        ++field2792;
        for (int var1 = 0; var1 < class336.field4782.length; ++var1) {
            for (int var2 = 0; var2 < class336.field4782[0].length; ++var2) {
                for (int var3 = 0; class336.field4782[0][0].length > var3; ++var3) {
                    class336.field4782[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "([BIII)V", line = 97)
    public final void method1332(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field2799;
        this.method1715(arg1, arg0, (byte) 121);
        this.field2791 = arg2;
        if (arg3 != 30192) {
            field2794 = true;
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(B)J", line = 114)
    public final long method1333(byte arg0) {
        ++field2795;
        if (arg0 <= 13) {
            this.method1335(80);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IZI)V", line = 125)
    public static final void method1334(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field2794 = false;
        }
        ++field2793;
        class341 var3 = class548.field7629[arg2][arg0];
        if (var3 != null) {
            class775.field10666 = var3.field4840;
            class703.field9855 = var3.field4852;
            class78.field1171 = var3.field4851;
        }
        class302.method1881(-24878);
    }

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "(I)I", line = 146)
    public final int method1335(int arg0) {
        ++field2801;
        if (arg0 != 6729) {
            method1331(-98);
        }
        return this.field2791;
    }
}
