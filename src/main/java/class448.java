import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class448 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "Z")
    public static boolean field6510 = true;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "[I")
    public static int[] field6515 = new int[2];

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "Lea;")
    public static class57 field6514 = new class57(5000);

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6517 = "M";

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "Lpm;")
    public static class10 field6516;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
    public static void method2765(byte arg0) {
        field6516 = null;
        field6517 = null;
        field6514 = null;
        if (arg0 <= 102) {
            field6515 = null;
        }
        field6515 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lam;I)V")
    public static final void method2766(class286 arg0, int arg1) {
        if (arg1 != -13472) {
            method2765((byte) 42);
        }
        field6512++;
        class199.field2658 = arg0.method1700("titlebg", (byte) -70);
        class316.field4221 = arg0.method1700("logo", (byte) -70);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
    public static final void method2767(int arg0, int arg1) {
        class318.field4235 = arg1;
        field6513++;
        if (arg0 != 12405) {
            method2765((byte) -32);
        }
        class114 var2 = class376.field5277;
        synchronized (class376.field5277) {
            class376.field5277.method613(true);
        }
    }
}
