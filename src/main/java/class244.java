import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class244 extends OutputStream {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lmia;")
    public static class63 field3563 = new class63(35, -1);

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[[[S")
    public static short[][][] field3560;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZII)Ltea;")
    public static final class240 method1628(boolean arg0, int arg1, int arg2) {
        field3561++;
        class240 var3 = new class240();
        var3.field3496 = arg2 + 5 + 1;
        if (arg0) {
            field3563 = null;
        }
        var3.field3492 = arg1 + 1 + 5;
        var3.field3500 = -1;
        var3.field3482 = -1;
        var3.field3488 = new int[var3.field3496][var3.field3492];
        var3.method1590((byte) 120);
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3562++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1629(int arg0) {
        field3563 = null;
        field3560 = null;
        if (arg0 > -123) {
            field3560 = null;
        }
    }
}
