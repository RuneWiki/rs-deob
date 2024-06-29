import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class77 {

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "Lqk;")
    public static class148 field1057 = new class148(104, 0);

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "Lgha;")
    public static class497 field1058 = new class497();

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "J")
    public static long field1053;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method471(boolean arg0) {
        field1056++;
        class491.field6599 = new class712[class602.field8614.method3341((byte) -93)][];
        if (!arg0) {
            field1053 = 104L;
        }
        class13.field185 = new class712[class602.field8614.method3341((byte) 104)][];
        class325.field4188 = new boolean[class602.field8614.method3341((byte) -56)];
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V", line = 18)
    public static void method472(int arg0) {
        if (arg0 != 104) {
            method471(false);
        }
        field1058 = null;
        field1057 = null;
    }

    @OriginalMember(owner = "client!kea", name = "toString", descriptor = "()Ljava/lang/String;", line = 30)
    public final String toString() {
        field1055++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(I)V", line = 37)
    public class77(int arg0) {
        this.field1054 = arg0;
    }
}
