import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class213 extends OutputStream {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field3527 = -1;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lcb;")
    public static class631 field3525 = new class631(72, 7);

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[[I")
    public static int[][] field3529 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public static void method1536(boolean arg0) {
        field3525 = null;
        if (arg0) {
            field3527 = 57;
        }
        field3529 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
    public static final void method1537(int arg0, int arg1) {
        if (arg1 != 7) {
            method1537(-23, -27);
        }
        field3526++;
        class118 var2 = class86.method755(true, 9, arg0);
        var2.method936(arg1 - 7);
    }

    @OriginalMember(owner = "client!ac", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3528++;
        throw new IOException();
    }
}
