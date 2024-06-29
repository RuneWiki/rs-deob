import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class133 extends class98 {

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public int field2383 = 0;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "Lmb;")
    private static class96 field2387 = class243.method1708(")3de", (byte) 123);

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static volatile int field2384 = 0;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "Lmb;")
    private static class96 field2389 = class243.method1708("fr", (byte) 105);

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "Lmb;")
    private static class96 field2388 = class243.method1708("en", (byte) 103);

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "Lmb;")
    private static class96 field2385 = class243.method1708(")3fr", (byte) 99);

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static volatile int field2397 = 0;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "Lmb;")
    private static class96 field2393 = class243.method1708(")3en", (byte) 123);

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "Lmb;")
    private static class96 field2394 = class243.method1708("de", (byte) 105);

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "[Lmb;")
    private static class96[] field2391 = new class96[] { field2393, field2387, field2385 };

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "[Lmb;")
    public static class96[] field2390 = new class96[] { field2388, field2394, field2389 };

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)V")
    public static final void method998(byte arg0) {
        class10.field166.method96(false);
        if (arg0 == -49) {
            field2386++;
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public static final void method999(int arg0) {
        class220.field3763.method96(false);
        field2396++;
        if (arg0 != -20627) {
            field2382 = -35;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
    public static void method1000(boolean arg0) {
        field2394 = null;
        field2387 = null;
        field2390 = null;
        field2388 = null;
        field2393 = null;
        field2385 = null;
        if (!arg0) {
            field2391 = null;
            field2389 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lrg;BI)V")
    private final void method1001(class239 arg0, byte arg1, int arg2) {
        field2395++;
        if (arg1 <= 76) {
            this.method1001((class239) null, (byte) 7, 3);
        }
        if (arg2 == 2) {
            this.field2383 = arg0.method1663((byte) 81);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILrg;)V")
    public final void method1002(int arg0, class239 arg1) {
        field2392++;
        while (true) {
            int var3 = arg1.method1651(4139);
            if (var3 == 0) {
                if (arg0 == 20270) {
                    return;
                } else {
                    this.field2383 = -53;
                    return;
                }
            }
            this.method1001(arg1, (byte) 104, var3);
        }
    }
}
