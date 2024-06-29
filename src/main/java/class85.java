import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class class85 {

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Ljn;")
    public static class134 field1028 = new class134(86, -2);

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Lqk;")
    public static class1 field1030 = new class1(15, -1);

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lae;")
    public static class283 field1026;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "[I")
    public static int[] field1027;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 5)
    public static void method643(byte arg0) {
        field1030 = null;
        field1027 = null;
        field1028 = null;
        int var1 = -31 / ((arg0 + 24) / 42);
        field1026 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method644(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class710.field9836 != -1) {
            class447.method2714((byte) 2, false, -1, class710.field9836, -1);
            class710.field9836 = -1;
        }
        field1031++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lio;I)Lio;")
    public abstract class774 method645(class774 arg0, int arg1);
}
