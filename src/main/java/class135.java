import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class class135 extends class376 {

    @OriginalMember(owner = "client!fq", name = "A", descriptor = "I")
    public int field1948;

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "[[B")
    public static byte[][] field1947 = new byte[250][];

    @OriginalMember(owner = "client!fq", name = "y", descriptor = "[I")
    public static int[] field1946 = new int[8];

    @OriginalMember(owner = "client!fq", name = "C", descriptor = "[B")
    public static byte[] field1949 = new byte[2048];

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "(B)Z")
    public abstract boolean method1030(byte arg0);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static void method1031(int arg0) {
        field1947 = null;
        if (arg0 != 2048) {
            field1946 = null;
        }
        field1949 = null;
        field1946 = null;
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1032(int arg0);

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(I)V")
    public class135(int arg0) {
        this.field1948 = arg0;
    }
}
