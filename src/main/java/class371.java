import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class371 extends OutputStream {

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "[Lcu;")
    public static class207[] field4790 = new class207[14];

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "F")
    public static float field4789;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
    public static void method2151(int arg0) {
        field4790 = null;
        if (arg0 != 0) {
            field4789 = -0.016777301F;
        }
    }

    @OriginalMember(owner = "client!jba", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4788++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)I")
    public static final int method2152(int arg0) {
        field4791++;
        if (arg0 != 16) {
            field4790 = null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIB[B)[B")
    public static final byte[] method2153(int arg0, int arg1, byte arg2, byte[] arg3) {
        field4787++;
        byte[] var4;
        if (arg0 > 0) {
            var4 = new byte[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                var4[var5] = arg3[arg0 + var5];
            }
        } else {
            var4 = arg3;
        }
        if (arg2 > -12) {
            method2152(95);
        }
        class701 var6 = new class701();
        var6.method3877(-110);
        var6.method3875((long) (arg1 * 8), var4, -1);
        byte[] var7 = new byte[64];
        var6.method3879(0, (byte) -69, var7);
        return var7;
    }
}
