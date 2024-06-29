import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class164 extends class387 {

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public int field2127;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2128 = new String[200];

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Z")
    public static boolean field2139 = false;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Z")
    public static boolean field2130;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Z")
    public static boolean field2134;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V", line = 9)
    public static final void method1016(byte arg0, int arg1) {
        class347.field5148 = null;
        class158.field2073 = arg1;
        class419.field6236 = -1;
        class269.field3931 = false;
        field2136++;
        if (arg0 == 34) {
            class35.field576 = 0;
            class24.field428 = 1;
            class128.field1699 = -1;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLnr;IIZLcb;I)V", line = 28)
    public final void method153(byte arg0, class437 arg1, int arg2, int arg3, boolean arg4, class387 arg5, int arg6) {
        if (arg0 > -116) {
            field2130 = true;
        }
        field2137++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(B)Z", line = 42)
    public final boolean method151(byte arg0) {
        if (arg0 != -115) {
            this.method151((byte) -52);
        }
        field2138++;
        return false;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 55)
    public final void method163(int arg0) {
        field2131++;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V", line = 68)
    public static void method1017(int arg0) {
        field2128 = null;
        if (arg0 != 10191) {
            method1016((byte) 127, 41);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIIIIII)V", line = 84)
    public class164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2126 = arg3;
        this.field2135 = arg2;
        this.field2125 = arg6;
        this.field2133 = arg4;
        this.field2132 = arg0;
        this.field2129 = arg1;
        this.field2127 = arg5;
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)I")
    public abstract int method293(int arg0);
}
