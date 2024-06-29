import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public abstract class class192 {

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "Lqp;")
    public static class586 field2902 = new class586(31, -1);

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
    public static int field2903 = 0;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V", line = 5)
    public static void method1245(byte arg0) {
        if (arg0 >= 7) {
            field2902 = null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "([BIII)V")
    public abstract void method1243(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
    public abstract void method1244(int arg0);

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)Z")
    public abstract boolean method1246(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)V")
    public abstract void method1247(byte arg0);

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I[BII)I")
    public abstract int method1248(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;
}
