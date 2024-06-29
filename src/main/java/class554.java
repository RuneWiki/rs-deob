import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class554 extends class268 implements class355 {

    @OriginalMember(owner = "client!vaa", name = "p", descriptor = "I")
    private int field7779;

    @OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
    public static int field7778 = 0;

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!vaa", name = "l", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!vaa", name = "m", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!vaa", name = "n", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!vaa", name = "q", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!vaa", name = "t", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!vaa", name = "u", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)J")
    public final long method2110(boolean arg0) {
        ++field7782;
        return !arg0 ? -23L : 0L;
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V")
    public final void method1608(int arg0) {
        ++field7776;
        if (arg0 == 23188) {
            super.field3390.method2187(-21610, this);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IBZ)V")
    public static final void method3150(int arg0, byte arg1, boolean arg2) {
        ++field7777;
        class464 var3 = class175.method1082(arg2, arg0, (byte) 20);
        if (var3 != null) {
            int var4 = 0;
            if (arg1 != -11) {
                method3150(-42, (byte) -80, true);
            }
            while (var3.field6715.length > var4) {
                var3.field6715[var4] = -1;
                var3.field6712[var4] = 0;
                ++var4;
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "([BBII)V")
    public final void method2109(byte[] arg0, byte arg1, int arg2, int arg3) {
        ++field7773;
        this.method1609(arg2, arg0, 1949);
        if (arg1 < -8) {
            this.field7779 = arg3;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)I")
    public final int method2112(int arg0) {
        if (arg0 < 79) {
            this.method2109((byte[]) null, (byte) -18, -76, 99);
        }
        ++field7775;
        return super.field3388;
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Leq;ILjaclib/memory/Buffer;IZ)V")
    public class554(class357 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7779 = arg1;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)I")
    public final int method2111(byte arg0) {
        ++field7781;
        if (arg0 != 124) {
            field7778 = 60;
        }
        return this.field7779;
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Leq;I[BIZ)V")
    public class554(class357 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7779 = arg1;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Let;Z)Ljava/lang/String;")
    public static final String method3151(class718 arg0, boolean arg1) {
        ++field7774;
        if (arg1) {
            method3151((class718) null, true);
        }
        if (arg0.field10123 != null && arg0.field10123.length() != 0) {
            return arg0.field10124 != null && arg0.field10124.length() > 0 ? arg0.field10132 + class586.field8157.method3261(class416.field5920, (byte) 82) + arg0.field10124 + class586.field8157.method3261(class416.field5920, (byte) 82) + arg0.field10123 : arg0.field10132 + class586.field8157.method3261(class416.field5920, (byte) 82) + arg0.field10123;
        } else {
            return arg0.field10124 != null && arg0.field10124.length() > 0 ? arg0.field10132 + class586.field8157.method3261(class416.field5920, (byte) 82) + arg0.field10124 : arg0.field10132;
        }
    }
}
