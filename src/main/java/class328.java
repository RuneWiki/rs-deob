import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public abstract class class328 extends class674 {

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field4444 = 1406;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field4447 = 1;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "F")
    public static float field4448;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
    public static final void method1952(int arg0) {
        class178.method1232(11, (byte) -85);
        field4446++;
        class578.method3297(arg0 ^ 0x352);
        System.gc();
        if (arg0 != -23176) {
            method1953(67);
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)Lhda;")
    public abstract class696 method988(int arg0);

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)V")
    public static final void method1953(int arg0) {
        field4445++;
        class610.field8463.method147(field4448, class382.field5241, class454.field6292);
        if (arg0 >= -36) {
            method1954(92);
        }
    }

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "(I)[Lhm;")
    public static final class202[] method1954(int arg0) {
        field4443++;
        int var1 = 104 % ((-arg0 - 31) / 41);
        return new class202[] { class373.field5024, class457.field6348, class492.field6730 };
    }
}
