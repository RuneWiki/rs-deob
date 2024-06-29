import jaclib.memory.Buffer;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class103 extends class440 implements class170 {

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field1535 = 0;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Z")
    public static boolean field1534 = false;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Lvm;")
    public static class72 field1529;

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lrs;ILjaclib/memory/Buffer;IZ)V", line = 3)
    public class103(class166 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1532 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([BBII)V", line = 11)
    public final void method846(byte[] arg0, byte arg1, int arg2, int arg3) {
        ++field1533;
        this.method2708(arg0, arg3, 0);
        this.field1532 = arg2;
        int var5 = -66 % ((arg1 - 39) / 38);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lrs;I[BIZ)V", line = 25)
    public class103(class166 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1532 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V", line = 33)
    public final void method847(byte arg0) {
        ++field1527;
        int var2 = -16 / ((80 - arg0) / 34);
        super.field6403.method1300(true, this);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)I", line = 43)
    public final int method848(boolean arg0) {
        ++field1528;
        if (!arg0) {
            field1534 = false;
        }
        return super.field6412;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)I", line = 57)
    public final int method849(int arg0) {
        if (arg0 != 8479) {
            this.method849(15);
        }
        ++field1536;
        return this.field1532;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)J", line = 69)
    public final long method850(byte arg0) {
        ++field1531;
        return arg0 != 98 ? 16L : 0L;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)[B", line = 84)
    public static final byte[] method851(int arg0, byte arg1) {
        ++field1530;
        class210 var2 = (class210) class301.field4563.method3893(0, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = 255 - var6;
                int var8 = class721.method3975(var7, var4, false);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class210(var3);
            class301.field4563.method3894(var2, (long) arg0, 0);
        }
        if (arg1 > -54) {
            field1535 = 14;
        }
        return var2.field3499;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 140)
    public static void method852(int arg0) {
        field1529 = null;
        if (arg0 != 34962) {
            field1535 = -62;
        }
    }
}
