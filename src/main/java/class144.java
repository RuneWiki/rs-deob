import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class144 extends class86 {

    @OriginalMember(owner = "client!um", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2215 = "purple:";

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    public static int field2219 = -1;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "C")
    private char field2214;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "Ljava/lang/String;")
    public String field2216;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lhb;I)V", line = 6)
    public final void method1081(class35 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field2217++;
        while (true) {
            int var3 = arg0.method273(65280);
            if (var3 == 0) {
                return;
            }
            this.method1086(-89, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(IB)V", line = 27)
    public static final void method1082(int arg0, byte arg1) {
        class121.field1916 = arg0;
        field2218++;
        class14.method109(true, 3);
        class14.method109(true, 4);
        if (arg1 != 32) {
            field2219 = 55;
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(B)V", line = 47)
    public static void method1083(byte arg0) {
        if (arg0 == -43) {
            field2215 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IBII)I", line = 58)
    public static final int method1084(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field2221++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            if (arg1 != -88) {
                field2215 = (String) null;
            }
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)Z", line = 82)
    public final boolean method1085(int arg0) {
        if (arg0 != -16536) {
            field2219 = -45;
        }
        field2220++;
        return this.field2214 == 's';
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IILhb;)V", line = 97)
    private final void method1086(int arg0, int arg1, class35 arg2) {
        int var4 = 108 % ((38 - arg0) / 62);
        if (arg1 == 1) {
            this.field2214 = class253.method1759(-1, arg2.method242((byte) -93));
        } else if (arg1 == 2) {
            this.field2222 = arg2.method299(-80);
        } else if (arg1 == 5) {
            this.field2216 = arg2.method279(29);
        }
        field2213++;
    }
}
