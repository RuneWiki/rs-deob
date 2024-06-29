import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class410 extends OutputStream {

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public static int field5779 = -1;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field5780 = -50;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "[I")
    public static int[] field5783;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "[[[B")
    public static byte[][][] field5781;

    @OriginalMember(owner = "client!taa", name = "write", descriptor = "(I)V", line = 4)
    public final void write(int arg0) throws IOException {
        field5782++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V", line = 16)
    public static void method2363(int arg0) {
        field5783 = null;
        if (arg0 != -1) {
            method2363(124);
        }
        field5781 = null;
    }
}
