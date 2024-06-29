import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class249 {

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "J")
    public long field3735;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Ljq;")
    private class475 field3733;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "[I")
    public static int[] field3736 = new int[8];

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field3737 = 0;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!kg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3733.method2856((byte) -14, this.field3735);
        field3734++;
        super.finalize();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZJ)V")
    public static final void method1675(boolean arg0, long arg1) {
        field3732++;
        if (arg0) {
            method1676((byte) -56);
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method1676(byte arg0) {
        field3736 = null;
        int var1 = -62 % ((arg0 - 12) / 57);
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljq;J[Lpm;)V")
    public class249(class475 arg0, long arg1, class542[] arg2) {
        this.field3735 = arg1;
        this.field3733 = arg0;
    }
}
