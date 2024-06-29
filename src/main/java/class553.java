import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class553 extends class321 implements class345 {

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    private int field7281;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "J")
    public static long field7283;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIZ)I", line = 5)
    public static final int method3081(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg1 & 3;
        ++field7287;
        if (~var4 == -1) {
            return arg0;
        } else if (var4 == 1) {
            return -arg2 + 7;
        } else if (var4 == 2) {
            return -arg0 + 7;
        } else {
            if (!arg3) {
                field7283 = -55L;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)J", line = 33)
    public final long method2066(int arg0) {
        if (arg0 != 9889) {
            this.field7281 = -70;
        }
        ++field7288;
        return super.field4582.getAddress();
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBIIIIIII)V", line = 45)
    public static final void method3082(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != -121) {
            method3083(-2, -105, (byte) -68);
        }
        class332.field4730[class356.field4995++] = new class177(arg2, arg0, arg4, arg3, arg3, arg4, arg8, arg6, arg6, arg8, arg5, arg5, arg7, arg7);
        ++field7282;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BII[B)V", line = 56)
    public final void method2063(byte arg0, int arg1, int arg2, byte[] arg3) {
        ++field7286;
        this.method1951(arg3, arg1);
        if (arg0 != 77) {
            this.field7281 = 55;
        }
        this.field7281 = arg2;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)I", line = 68)
    public final int method2064(byte arg0) {
        int var2 = -41 % ((arg0 - 61) / 42);
        ++field7285;
        return 0;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lrda;I[BI)V", line = 78)
    public class553(class663 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field7281 = arg1;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I", line = 88)
    public final int method2065(int arg0) {
        if (arg0 != 26249) {
            return -93;
        } else {
            ++field7280;
            return this.field7281;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIB)V", line = 102)
    public static final void method3083(int arg0, int arg1, byte arg2) {
        ++field7284;
        if (class683.field9532 == class12.field187) {
            if (class126.method1000(0, arg1, 0, 1, -2, 1, false, arg0, -1)) {
                return;
            }
            class126.method1000(0, arg1, 0, 1, -3, 1, false, arg0, arg2 ^ -41);
        } else {
            if (class126.method1000(0, arg1, 0, 1, -3, 1, false, arg0, arg2 ^ -41)) {
                return;
            }
            class126.method1000(0, arg1, 0, 1, -2, 1, false, arg0, -1);
        }
        if (arg2 != 40) {
            method3081(-48, -59, -77, true);
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lrda;ILjaclib/memory/Buffer;)V", line = 128)
    public class553(class663 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field7281 = arg1;
    }
}
