import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class630 extends OutputStream {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field8919 = 0;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field8920 = 0;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method3622(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class240.field3554 = arg1;
        field8923++;
        class542.field7858 = arg6;
        class31.field291 = arg4;
        class30.field278 = arg3;
        if (arg5 != -76) {
            method3623((byte) 44, false, 25);
        }
        class389.field5610 = arg0;
        class166.field2357 = arg2;
    }

    @OriginalMember(owner = "client!cb", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field8921++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BZI)Ljava/lang/String;")
    public static final String method3623(byte arg0, boolean arg1, int arg2) {
        field8922++;
        if (arg0 > -61) {
            field8919 = -101;
        }
        return arg1 && arg2 >= 0 ? class755.method4197(arg2, 10, arg1, false) : Integer.toString(arg2);
    }
}
