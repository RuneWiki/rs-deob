import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class372 {

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "Lbaa;")
    public static class130 field5245 = new class130(64);

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!tha", name = "e", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!tha", name = "g", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "Lok;")
    public static class594 field5248;

    @OriginalMember(owner = "client!tha", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5244++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V")
    public static void method2328(byte arg0) {
        field5248 = null;
        if (arg0 < 85) {
            method2329((byte) 62);
        }
        field5245 = null;
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(B)I")
    public static final int method2329(byte arg0) {
        if (arg0 > -13) {
            method2330(-98, 61, 84, true, -11);
        }
        field5247++;
        class690 var1 = class301.field4258;
        synchronized (class301.field4258) {
            return class301.field4258.method3908((byte) -4);
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIIZI)V")
    public static final void method2330(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5246++;
        class110.method718(arg4 - 4);
        class434.field6058 = 0L;
        int var5 = class710.method3997(arg4);
        if (arg1 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (!class129.field1802.method1389()) {
            arg3 = true;
        }
        class306.method2006(var5, arg1, true, arg0, arg3, arg2);
    }
}
