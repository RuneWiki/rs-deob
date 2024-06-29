import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class377 extends class499 {

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Lff;")
    public static class9 field5104 = new class9(21, 3);

    @OriginalMember(owner = "client!j", name = "C", descriptor = "J")
    public static long field5107 = -1L;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field5106 = 0;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field5105 = 999999;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "B")
    public static byte field5108;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(B)V")
    public static void method2180(byte arg0) {
        if (arg0 != -126) {
            method2180((byte) -52);
        }
        field5104 = null;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V")
    public static final void method2181(byte arg0) {
        class473.field6514 = -1;
        class497.field6888 = -1;
        if (arg0 == 117) {
            class11.field239 = -1;
            field5103++;
            class130.field1894 = 0;
        }
    }
}
