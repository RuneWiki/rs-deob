import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class92 extends class499 {

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public int field1236 = -1;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "Z")
    public boolean field1239 = false;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "Luf;")
    public static class310 field1232 = new class310(92, -1);

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
    public int field1238;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    public int field1241;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1242;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field1240;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public static final void method622(int arg0) {
        class329.field4490.method483(class118.field1588, class66.field913, class13.field164);
        if (arg0 <= 44) {
            field1242 = null;
        }
        field1243++;
    }

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "(I)V")
    public static void method623(int arg0) {
        field1232 = null;
        field1242 = null;
        if (arg0 != 23989) {
            method623(54);
        }
        field1240 = null;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(I)V")
    public class92(int arg0) {
        this.field1236 = arg0;
    }
}
