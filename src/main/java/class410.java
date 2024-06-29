import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class410 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public int field6139;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Lck;")
    public static class452 field6141 = new class452(5000);

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[F")
    public static float[] field6146 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lf;")
    public static class529 field6144;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZLbu;I)Lnd;", line = 3)
    public static final class380 method2492(int arg0, boolean arg1, class17 arg2, int arg3) {
        if (!arg1) {
            method2493((byte) 112);
        }
        field6145++;
        byte[] var4 = arg2.method114(arg0, arg3, -73);
        return var4 == null ? null : new class380(var4);
    }

    @OriginalMember(owner = "client!pf", name = "toString", descriptor = "()Ljava/lang/String;", line = 29)
    public final String toString() {
        field6140++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 39)
    public static void method2493(byte arg0) {
        field6141 = null;
        int var1 = 77 / ((arg0 + 49) / 43);
        field6146 = null;
        field6144 = null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V", line = 53)
    public class410(int arg0, int arg1) {
        this.field6139 = arg0;
    }
}
