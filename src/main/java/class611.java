import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class611 extends OutputStream {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[Lxa;")
    public static class424[] field8323;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 4)
    public static void method3364(int arg0) {
        if (arg0 > 20) {
            field8323 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "write", descriptor = "(I)V", line = 14)
    public final void write(int arg0) throws IOException {
        field8321++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILba;Lvg;I)V", line = 23)
    public static final void method3365(int arg0, int arg1, int arg2, class629 arg3, class162 arg4, int arg5) {
        int var6 = 117 % ((-arg1 - 11) / 50);
        field8322++;
        if (arg3 != null) {
            arg4.method1097(arg3.method662(), arg3.method690(), arg3.method679(), arg0, arg5, arg3.method660(), 11328, arg3.method683(), arg2, arg3.method641(), arg3.method686());
        }
    }
}
