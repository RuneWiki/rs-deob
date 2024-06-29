import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class482 extends class656 implements class393 {

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    private int field5991;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "Lcga;")
    public static class449 field5993 = new class449(42, 3);

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)I")
    public final int method2232(byte arg0) {
        ++field5992;
        int var2 = -39 % ((arg0 - 23) / 39);
        return this.field5991;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5995;
        if (arg3 != -12) {
            method2628(6);
        }
        class26[] var7 = class565.field7071;
        for (int var8 = 0; var7.length > var8; ++var8) {
            class26 var9 = var7[var8];
            if (var9 != null && ~var9.field301 == -3) {
                class131.method846(var9.field304, arg5, arg6, (byte) 125, arg1 >> 1, var9.field307 * 2, var9.field305, var9.field308, arg0 >> 1);
                if (~class347.field4465[0] < 0 && ~(class665.field9027 % 20) > -11) {
                    class194.field2291[var9.field299].method2556(arg2 - (-class347.field4465[0] - -12), class347.field4465[1] + arg4 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Ljaa;ILjaclib/memory/Buffer;IZ)V")
    public class482(class576 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field5991 = arg1;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)J")
    public final long method2234(byte arg0) {
        if (arg0 > -85) {
            method2627(true);
        }
        ++field5994;
        return 0L;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Ljaa;I[BIZ)V")
    public class482(class576 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field5991 = arg1;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(Z)V")
    public static final void method2627(boolean arg0) {
        ++field5996;
        class285[] var1 = class694.field9611;
        synchronized (class694.field9611) {
            if (arg0) {
                field5993 = null;
            }
            for (int var2 = 0; var2 < class694.field9611.length; ++var2) {
                class694.field9611[var2] = new class285();
                class539.field6804[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
    public static void method2628(int arg0) {
        if (arg0 != -12) {
            field5993 = null;
        }
        field5993 = null;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
    public final void method2629(int arg0) {
        ++field5997;
        super.field8928.method3179(-105, this);
        int var2 = 65 / ((12 - arg0) / 53);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)I")
    public final int method2233(int arg0) {
        ++field5989;
        if (arg0 < 34) {
            method2627(false);
        }
        return super.field8926;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III[B)V")
    public final void method2231(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method3663(106, arg3, arg1);
        if (arg2 != 18449) {
            this.field5991 = -115;
        }
        ++field5990;
        this.field5991 = arg0;
    }
}
