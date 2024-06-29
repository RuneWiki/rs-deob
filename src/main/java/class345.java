import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public abstract class class345 {

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "Leg;")
    public static class93 field4628 = new class93();

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "Lrt;")
    public static class208 field4630;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Lfa;")
    public static class212 field4629;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method2010(byte arg0, int arg1) {
        int var2 = -25 / ((-arg0 - 78) / 33);
        field4627++;
        if (class450.field6183 == 0) {
            class224.field3124.method2084((byte) -78, arg1);
        } else {
            class129.field1848 = arg1;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 19)
    public static void method2011(byte arg0) {
        field4629 = null;
        field4630 = null;
        field4628 = null;
        if (arg0 <= 7) {
            field4630 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)J")
    public abstract long method1292(int arg0);
}
