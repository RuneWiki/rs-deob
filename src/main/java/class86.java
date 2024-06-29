import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class86 {

    @OriginalMember(owner = "client!aka", name = "g", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!aka", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1213 = null;

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "Z")
    public static boolean field1212 = false;

    @OriginalMember(owner = "client!aka", name = "e", descriptor = "Lmw;")
    public static class517 field1215 = new class517(44, 8);

    @OriginalMember(owner = "client!aka", name = "f", descriptor = "Ltca;")
    public static class184 field1216 = new class184(16);

    @OriginalMember(owner = "client!aka", name = "h", descriptor = "[F")
    public static float[] field1218 = new float[2];

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!aka", name = "d", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)V", line = 8)
    public static void method692(int arg0) {
        field1216 = null;
        field1213 = null;
        if (arg0 != 5153) {
            field1212 = false;
        }
        field1218 = null;
        field1215 = null;
    }

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)I", line = 22)
    public final int method693(int arg0) {
        field1214++;
        if (arg0 > -26) {
            this.method693(109);
        }
        return this.field1217;
    }

    @OriginalMember(owner = "client!aka", name = "toString", descriptor = "()Ljava/lang/String;", line = 49)
    public final String toString() {
        field1211++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 56)
    public class86(String arg0, int arg1) {
        this.field1217 = arg1;
    }
}
