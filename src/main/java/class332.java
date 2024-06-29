import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class332 {

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public int field4852 = 1;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "[B")
    public static byte[] field4853 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field4851 = 0;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "C")
    public char field4849;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2122(boolean arg0) {
        field4853 = null;
        if (arg0) {
            method2122(true);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILdga;B)V", line = 14)
    private final void method2123(int arg0, class138 arg1, byte arg2) {
        if (arg2 != 125) {
            field4851 = -8;
        }
        field4855++;
        if (arg0 == 1) {
            this.field4849 = class679.method3748(arg1.method950(false), arg2 ^ 0xFFFFFF22);
        } else if (arg0 == 2) {
            this.field4852 = 0;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIBI)V", line = 35)
    public static final void method2124(int arg0, int arg1, byte arg2, int arg3) {
        if (arg1 == 0) {
            class187.field2294++;
            class389.method2326((byte) 118, class667.field9489);
        }
        field4854++;
        if (arg1 == 1) {
            class389.method2326((byte) 118, class464.field6339);
            class390.field5611++;
        }
        if (arg2 != 88) {
            method2122(false);
        }
        class253.field3491.method915(class186.field2280 + arg3, 1502242504);
        class253.field3491.method908(class348.field5096.method32(82, -125) ? 1 : 0, 48);
        class253.field3491.method915(arg0 + class253.field3490, 1502242504);
        class436.field6025 = arg0;
        class251.field3388 = arg3;
        class329.field4819 = false;
        class650.method3609(arg2 + 30699);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ldga;Z)V", line = 78)
    public final void method2125(class138 arg0, boolean arg1) {
        if (!arg1) {
            this.method2123(108, null, (byte) 23);
        }
        field4850++;
        while (true) {
            int var3 = arg0.method957((byte) -85);
            if (var3 == 0) {
                return;
            }
            this.method2123(var3, arg0, (byte) 125);
        }
    }
}
