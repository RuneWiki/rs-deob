import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class140 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Ltf;")
    public static class298 field1993 = new class298();

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field1996 = 0;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field1995 = -1;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!cg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1992++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1021(int arg0) {
        int var1 = 36 % ((arg0 - 13) / 40);
        field1993 = null;
    }
}
