import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class325 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[[B")
    public static byte[][] field4723 = new byte[50][];

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field4725 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[I")
    public static int[] field4724;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method2145(byte arg0) {
        if (arg0 != 101) {
            method2145((byte) 98);
        }
        field4723 = null;
        field4724 = null;
    }
}
