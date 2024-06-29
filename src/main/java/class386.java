import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class386 extends class436 {

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "Lvq;")
    public static class24 field5639 = new class24(18, -2);

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public int field5640;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public int field5642;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public int field5645;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "J")
    public long field5648;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "Lae;")
    public static class285 field5644;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)J")
    public final long method2436(byte arg0) {
        field5643++;
        return arg0 == 74 ? this.field5648 : -95L;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)I")
    public final int method2437(byte arg0) {
        field5647++;
        if (arg0 != 26) {
            this.method2440(98);
        }
        return this.field5645;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)I")
    public static int method2438(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V")
    public static void method2439(int arg0) {
        field5639 = null;
        if (arg0 == -27873) {
            field5644 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)I")
    public final int method2440(int arg0) {
        field5646++;
        if (arg0 != -1) {
            this.method2441(75);
        }
        return this.field5640;
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)I")
    public final int method2441(int arg0) {
        field5641++;
        return arg0 == -3 ? this.field5642 : -114;
    }
}
