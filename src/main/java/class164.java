import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class164 {

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2464 = 0;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lgg;")
    public class116 field2468;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lae;")
    public class164 field2467;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lbw;")
    public static class483 field2471;

    static {
        new class187("", 76);
        new class466(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 12)
    public final void method1091(int arg0) {
        field2463++;
        if (arg0 <= class391.field5738) {
            return;
        }
        this.field2468 = null;
        this.field2469 = 0;
        this.field2467 = client.field2793;
        client.field2793 = this;
        class391.field5738++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 29)
    public static void method1092(byte arg0) {
        if (arg0 > -107) {
            field2471 = null;
        }
        field2471 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLsi;)Lhe;", line = 41)
    public static final class250 method1093(boolean arg0, class391 arg1) {
        field2470++;
        if (!arg0) {
            method1094(70, -86, null);
        }
        return new class250(arg1.method2311((byte) 125), arg1.method2311((byte) -125), arg1.method2311((byte) -99), arg1.method2311((byte) 124), arg1.method2311((byte) -60), arg1.method2311((byte) -73), arg1.method2311((byte) 1), arg1.method2311((byte) -87), arg1.method2338(true), arg1.method2348(-2));
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILjava/lang/String;)V", line = 60)
    public static final void method1094(int arg0, int arg1, String arg2) {
        field2466++;
        if (arg0 < 39) {
            field2464 = -58;
        }
        class97 var3 = class348.method2064(arg1, 3, 118);
        var3.method712((byte) -87);
        var3.field1469 = arg2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lmg;B)V", line = 74)
    public static final void method1095(class101 arg0, byte arg1) {
        if (arg1 >= 43) {
            class128.field1892 = arg0.method735(-125, "titlebg");
            field2465++;
            class165.field2476 = arg0.method735(12, "logo");
        }
    }
}
