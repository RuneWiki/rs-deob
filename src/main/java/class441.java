import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class441 {

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "[B")
    public static byte[] field5871 = new byte[2048];

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Lnd;")
    public static class547 field5870;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public static void method2505(int arg0) {
        if (arg0 < 66) {
            method2506((byte) -109);
        }
        field5871 = null;
        field5870 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public static final void method2506(byte arg0) {
        class253.method1546();
        field5869++;
        for (int var1 = 0; var1 < 4; var1++) {
            class526.field7350[var1].method2253(true);
        }
        if (arg0 >= -27) {
            field5871 = null;
        }
        class126.method947((byte) 88);
        class660.method3714(0);
        class382.method2173(-11715);
        System.gc();
        class386.field4930.method512();
    }
}
