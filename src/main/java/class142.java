import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class142 extends class307 {

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "[B")
    public byte[] field2386;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "Lqd;")
    private static class40 field2382 = class147.method1106("M", (byte) -93);

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Lqd;")
    private static class40 field2380 = class147.method1106("Please remove ", (byte) -117);

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "Lqd;")
    public static class40 field2381 = field2382;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Z")
    public static boolean field2387 = true;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "Lqd;")
    public static class40 field2388 = class147.method1106(")4l=", (byte) -116);

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Lqd;")
    public static class40 field2390 = field2382;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "Lqd;")
    public static class40 field2384 = field2380;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Lqd;")
    public static class40 field2391 = field2380;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "F")
    public static float field2377;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)I", line = 10)
    public static final int method1039(byte arg0, int arg1) {
        if (arg0 != 61) {
            field2388 = (class40) null;
        }
        field2383++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 24)
    public static final void method1040(boolean arg0) {
        field2379++;
        class250.field4132 = null;
        if (!arg0) {
            field2377 = 1.7257848F;
        }
        class176.method1296();
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V", line = 67)
    public static void method1041(int arg0) {
        field2382 = null;
        field2390 = null;
        field2388 = null;
        if (arg0 != 1252752458) {
            field2390 = (class40) null;
        }
        field2381 = null;
        field2384 = null;
        field2391 = null;
        field2380 = null;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V", line = 91)
    public class142(byte[] arg0) {
        this.field2386 = arg0;
    }
}
