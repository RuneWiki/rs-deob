import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class155 extends class92 {

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "Z")
    public static boolean field2337 = false;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "Lpp;")
    public static class464 field2333 = new class464(30, 3);

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "Liu;")
    public static class517 field2339 = new class517(25, 8);

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V")
    public static void method1096(int arg0) {
        field2339 = null;
        if (arg0 < -79) {
            field2333 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Z")
    public final boolean method673(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field2334;
            return false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZII)V")
    public final void method675(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            ++field2332;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILqv;)V")
    public final void method672(int arg0, int arg1, class96 arg2) {
        super.field1635.method3577(arg2, true);
        ++field2330;
        super.field1635.method3600(-78, arg1);
        if (arg0 != 0) {
            this.method672(-40, -12, (class96) null);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BII)Z")
    public static final boolean method1097(byte arg0, int arg1, int arg2) {
        ++field2331;
        if (!class562.method3204(arg2, arg1, (byte) -104)) {
            return false;
        } else {
            if (arg0 >= -62) {
                method1097((byte) -92, 79, 88);
            }
            return ~(arg2 & 36864) != -1 | class8.method34(arg2, arg1, (byte) -112) | class400.method2444(arg2, arg1, (byte) 25) ? true : ~(55 & arg1) == -1 & (class471.method2740(arg2, (byte) -122, arg1) | ~(arg2 & 8192) != -1 | class619.method3499(arg2, arg1, 30191));
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
    public final void method669(byte arg0) {
        if (arg0 < 55) {
            this.method676(true, -108);
        }
        ++field2338;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZB)V")
    public final void method671(boolean arg0, byte arg1) {
        ++field2335;
        if (arg1 != 107) {
            this.method673(126);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
    public final void method676(boolean arg0, int arg1) {
        ++field2336;
        if (arg1 >= -65) {
            field2333 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lnd;)V")
    public class155(class632 arg0) {
        super(arg0);
    }
}
