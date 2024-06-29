import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class401 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lej;")
    public static class124 field5909 = new class124(71, 2);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public abstract void method1699(byte arg0);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)J")
    public static final long method2503(byte arg0) {
        field5907++;
        return arg0 == -45 ? class272.field3828.method1696(-18931) : -58L;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)J")
    public abstract long method1698(int arg0);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IJ)I")
    public abstract int method1697(int arg0, long arg1);

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
    public static void method2504(byte arg0) {
        field5909 = null;
        int var1 = -52 / ((-arg0 - 22) / 55);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IJ)I")
    public final int method2505(int arg0, long arg1) {
        field5908++;
        long var4 = this.method1698(-73);
        if ((long) arg0 < var4) {
            class700.method3916((byte) 61, var4);
        }
        return this.method1697(71, arg1);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)J")
    public abstract long method1696(int arg0);
}
