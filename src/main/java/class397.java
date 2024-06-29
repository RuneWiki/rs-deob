import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class397 {

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "Ljn;")
    public static class134 field5624 = new class134(100, 0);

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "Ljn;")
    public static class134 field5628 = new class134(54, 3);

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Z")
    public final boolean method2443(byte arg0) {
        field5625++;
        if (arg0 != -65) {
            field5624 = null;
        }
        return class146.field1882 == this | class748.field10335 == this;
    }

    @OriginalMember(owner = "client!tq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5626++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public static void method2444(int arg0) {
        if (arg0 != 10571) {
            method2444(-126);
        }
        field5624 = null;
        field5628 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lae;BI)Lhw;")
    public static final class300 method2445(class283 arg0, byte arg1, int arg2) {
        field5627++;
        int var3 = 8 % ((-arg1 - 58) / 34);
        byte[] var4 = arg0.method1854(0, arg2);
        return var4 == null ? null : new class300(var4);
    }
}
