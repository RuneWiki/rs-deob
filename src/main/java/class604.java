import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class604 {

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "Lqi;")
    private class510 field8438;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "J")
    public long field8436;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Ljava/lang/Thread;")
    public static Thread field8439;

    @OriginalMember(owner = "client!hr", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        field8437++;
        this.field8438.method2896(this.field8436, 110);
        super.finalize();
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lwv;IBZI)V", line = 14)
    public static final void method3363(class423 arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field8441++;
        int var5 = arg0.field5561;
        int var6 = arg0.field5672;
        if (arg0.field5591 == 0) {
            arg0.field5561 = arg0.field5656;
        } else if (arg0.field5591 == 1) {
            arg0.field5561 = arg1 - arg0.field5656;
        } else if (arg0.field5591 == 2) {
            arg0.field5561 = arg0.field5656 * arg1 >> 14;
        }
        if (arg0.field5546 == 0) {
            arg0.field5672 = arg0.field5571;
        } else if (arg0.field5546 == 1) {
            arg0.field5672 = arg4 - arg0.field5571;
        } else if (arg0.field5546 == 2) {
            arg0.field5672 = arg0.field5571 * arg4 >> 14;
        }
        if (arg2 >= -26) {
            return;
        }
        if (arg0.field5591 == 4) {
            arg0.field5561 = arg0.field5672 * arg0.field5584 / arg0.field5583;
        }
        if (arg0.field5546 == 4) {
            arg0.field5672 = arg0.field5583 * arg0.field5561 / arg0.field5584;
        }
        if (class452.field5967 && (client.method3858(arg0).field48 != 0 || arg0.field5598 == 0)) {
            if (arg0.field5672 < 5 && arg0.field5561 < 5) {
                arg0.field5672 = 5;
                arg0.field5561 = 5;
            } else {
                if (arg0.field5561 <= 0) {
                    arg0.field5561 = 5;
                }
                if (arg0.field5672 <= 0) {
                    arg0.field5672 = 5;
                }
            }
        }
        if (class651.field9031 == arg0.field5619) {
            class302.field3995 = arg0;
        }
        if (arg3 && arg0.field5575 != null && arg0.field5561 != var5 || arg0.field5672 != var6) {
            class274 var7 = new class274();
            var7.field3639 = arg0.field5575;
            var7.field3644 = arg0;
            class114.field1466.method2507(var7, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIII)I", line = 92)
    public static final int method3364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg4;
            arg4 = var7;
        }
        field8435++;
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 1 + 7 - arg5 - arg0;
        } else if (arg6 == -5) {
            return 7 + 1 - arg3 - arg4;
        } else {
            return -13;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 125)
    public static void method3365(int arg0) {
        field8439 = null;
        int var1 = 16 / ((41 - arg0) / 60);
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lqi;J[Lmn;)V", line = 137)
    public class604(class510 arg0, long arg1, class61[] arg2) {
        this.field8438 = arg0;
        this.field8436 = arg1;
    }
}
