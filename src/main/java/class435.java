import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class435 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lfca;")
    public static class74 field6193 = new class74("", 10);

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!dk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6196++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)I")
    public static final int method2583(byte arg0, int arg1) {
        field6197++;
        if (arg0 != -50) {
            method2584(-37);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method2584(int arg0) {
        field6193 = null;
        if (arg0 < 0) {
            field6193 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(I)V")
    public class435(int arg0) {
        this.field6194 = arg0;
    }
}
