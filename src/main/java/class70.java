import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class70 {

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field1290 = 0;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[I")
    public static int[] field1289 = new int[14];

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field1291;

    @OriginalMember(owner = "client!sh", name = "toString", descriptor = "()Ljava/lang/String;", line = 10)
    public final String toString() {
        field1288++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 23)
    public static void method684(byte arg0) {
        field1289 = null;
        if (arg0 <= 105) {
            method684((byte) -48);
        }
        field1291 = null;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V", line = 34)
    public class70(int arg0) {
        this.field1292 = arg0;
    }
}
