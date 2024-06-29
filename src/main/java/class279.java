import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class279 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "J")
    public static long field4731 = 0L;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field4730 = 10;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[[[B")
    public static byte[][][] field4733;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)Z", line = 9)
    public static final boolean method1891(byte arg0, int arg1) {
        field4729++;
        if (arg0 >= -87) {
            method1894((byte) -68);
        }
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 20)
    public static void method1892(byte arg0) {
        field4733 = (byte[][][]) null;
        if (arg0 >= -65) {
            field4731 = -108L;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lni;Lni;ZZ)V", line = 30)
    public static final void method1893(class202 arg0, class202 arg1, boolean arg2, boolean arg3) {
        class69.field1095 = arg0;
        class97.field1463 = arg1;
        if (arg2) {
            field4730 = -22;
        }
        field4735++;
        class8.field124 = arg3;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V", line = 50)
    public static final void method1894(byte arg0) {
        field4734++;
        class134.method868(104, 104);
        if (arg0 != 18) {
            return;
        }
        class86.method572(class286.field4830, class206.field3285, arg0 ^ 0x6B);
        class61.method451(class206.field3285, (byte) 112);
        if (class5.field58 == 10) {
            class112.method741(28, 5);
        }
        if (class5.field58 == 30) {
            class112.method741(25, arg0 ^ 0x17);
        }
    }
}
