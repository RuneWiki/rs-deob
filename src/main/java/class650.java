import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class650 extends class31 {

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public int field9109;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public int field9108;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "Z")
    public static boolean field9111 = false;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lut;Lgi;IIIIIIIII)V")
    public class650(class109 arg0, class630 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field9109 = arg10;
        this.field9108 = arg9;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Lrw;")
    public final class703 method351(byte arg0) {
        field9110++;
        return arg0 < 73 ? null : class188.field2710;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;)V")
    public static final void method3598(int arg0, String arg1, File arg2) {
        if (arg0 != -20878) {
            method3598(87, null, null);
        }
        field9112++;
        class336.field4959.put(arg1, arg2);
    }
}
