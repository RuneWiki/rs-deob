import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class758 {

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "Ljava/lang/String;")
    public String field10570;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "Ljava/lang/String;")
    public String field10571;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public int field10565;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "J")
    public long field10566;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
    public int field10564;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "Lkt;")
    public static class159 field10567 = new class159(4);

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
    public static int field10572 = 0;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    public static int field10569;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "Lqi;")
    public static class568 field10568;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
    public static void method4215(int arg0) {
        field10567 = null;
        field10568 = null;
        if (arg0 != 0) {
            field10568 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIIIIIIIIII)V")
    public static final void method4216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field10569++;
        if (!class382.method2244(arg2, 48)) {
            return;
        }
        if (class607.field8483[arg2] == null) {
            client.method1823(class357.field4742[arg2], -1, arg11, arg1, arg3, arg5, arg6, arg10, arg7, arg8, arg0, arg9);
        } else {
            client.method1823(class607.field8483[arg2], -1, arg11, arg1, arg3, arg5, arg6, arg10, arg7, arg8, arg0, arg9);
        }
        if (arg4 != 0) {
            method4215(-60);
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class758(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field10570 = arg3;
        this.field10571 = arg1;
        this.field10565 = arg0;
        this.field10566 = arg4;
        this.field10564 = arg2;
    }
}
