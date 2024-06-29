import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class279 extends OutputStream {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "[I")
    public static int[] field4321 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field4323 = 0;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field4327 = 0;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "[I")
    public static int[] field4325;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "[[I")
    public static int[][] field4324;

    @OriginalMember(owner = "client!wk", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4322++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public static void method1867(boolean arg0) {
        if (arg0) {
            method1867(false);
        }
        field4325 = null;
        field4324 = null;
        field4321 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
    public static final void method1868(int arg0, int arg1) {
        if (arg1 != 32) {
            field4327 = 21;
        }
        class224.field3396.method536(-73, arg0);
        field4326++;
    }
}
