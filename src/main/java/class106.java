import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class106 extends OutputStream {

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "[[Z")
    public static boolean[][] field1692 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
    public static void method913(byte arg0) {
        if (arg0 == 13) {
            field1692 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZI)Z")
    public static final boolean method914(boolean arg0, int arg1) {
        field1690++;
        if (!arg0) {
            method914(false, -64);
        }
        return arg1 == 2 || arg1 == 3;
    }

    @OriginalMember(owner = "client!qu", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1691++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "([BI)[B")
    public static final byte[] method915(byte[] arg0, int arg1) {
        field1689++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class275.method1771(arg0, arg1, var3, 0, var2);
        return var3;
    }
}
