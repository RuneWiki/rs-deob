import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class100 {

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "Ljr;")
    public static class100 field1285 = new class100(1);

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "Ljr;")
    public static class100 field1286 = new class100(2);

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "Ljr;")
    public static class100 field1287 = new class100(4);

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "Ljr;")
    public static class100 field1288 = new class100(1);

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "Ljr;")
    public static class100 field1289 = new class100(2);

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "Ljr;")
    public static class100 field1290 = new class100(4);

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "Ljr;")
    public static class100 field1291 = new class100(2);

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "Ljr;")
    public static class100 field1292 = new class100(4);

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field1293 = 0;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!jr", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field1283++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 15)
    public static void method729(int arg0) {
        field1288 = null;
        field1286 = null;
        field1292 = null;
        field1289 = null;
        field1291 = null;
        field1287 = null;
        if (arg0 > 115) {
            field1290 = null;
            field1285 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V", line = 31)
    private class100(int arg0) {
        this.field1284 = arg0;
    }
}
