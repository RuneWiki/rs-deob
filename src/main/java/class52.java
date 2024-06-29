import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class52 extends class207 {

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "Ljb;")
    public static class519 field623 = new class519(52, 3);

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "Z")
    public static boolean field625 = true;

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "Lmw;")
    public static class517 field632 = new class517(71, 8);

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lrd;)V")
    public class52(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(ILrd;)V")
    public class52(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IBILjava/awt/Component;Lec;)Lbr;")
    public static final class414 method329(int arg0, byte arg1, int arg2, Component arg3, class248 arg4) {
        ++field627;
        if (~class624.field8419 == -1) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && ~arg2 > -3) {
            if (~arg0 > -257) {
                arg0 = 256;
            }
            try {
                class414 var5 = (class414) Class.forName("fs").newInstance();
                var5.field5968 = arg0;
                var5.field5949 = new int[(!class177.field2341 ? 1 : 2) * 256];
                if (arg1 != 65) {
                    field625 = true;
                }
                var5.method2297(arg3);
                var5.field5979 = (-1024 & arg0) + 1024;
                if (~var5.field5979 < -16385) {
                    var5.field5979 = 16384;
                }
                var5.method2292(var5.field5979);
                if (class340.field4756 > 0 && class630.field8527 == null) {
                    class630.field8527 = new class366();
                    class630.field8527.field5274 = arg4;
                    arg4.method1538(class630.field8527, (byte) -116, class340.field4756);
                }
                if (class630.field8527 != null) {
                    if (class630.field8527.field5275[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class630.field8527.field5275[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class362 var6 = new class362(arg4, arg2);
                    var6.field5968 = arg0;
                    var6.field5949 = new int[256 * (class177.field2341 ? 2 : 1)];
                    var6.method2297(arg3);
                    var6.field5979 = 16384;
                    var6.method2292(var6.field5979);
                    if (~class340.field4756 < -1 && class630.field8527 == null) {
                        class630.field8527 = new class366();
                        class630.field8527.field5274 = arg4;
                        arg4.method1538(class630.field8527, (byte) -80, class340.field4756);
                    }
                    if (class630.field8527 != null) {
                        if (class630.field8527.field5275[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class630.field8527.field5275[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class414();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(IB)I")
    public final int method39(int arg0, byte arg1) {
        ++field629;
        return arg1 != 69 ? 24 : 1;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IB)V")
    public final void method41(int arg0, byte arg1) {
        ++field624;
        if (arg1 >= -7) {
            field630 = -51;
        }
        super.field2669 = arg0;
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)V")
    public static void method330(int arg0) {
        field632 = null;
        if (arg0 == -1) {
            field623 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "(I)I")
    public final int method331(int arg0) {
        ++field628;
        return arg0 != 43 ? -86 : super.field2669;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        ++field631;
        int var2 = -122 % ((arg0 - -58) / 48);
        if (~super.field2669 > -1 || ~super.field2669 < -5) {
            super.field2669 = this.method36(-46);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)I")
    public final int method36(int arg0) {
        ++field626;
        if (arg0 >= -14) {
            method329(104, (byte) -91, -104, (Component) null, (class248) null);
        }
        return 3;
    }
}
