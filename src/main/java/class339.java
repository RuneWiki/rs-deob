import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class339 extends class294 {

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    private int field5405 = -32768;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field5408 = 0;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public int field5406;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public int field5409;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIIJILlg;)V", line = 5)
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class141 arg10) {
        field5407++;
        class362 var13 = class190.method1302(this.field5409, (byte) -122).method2188(-1, (class246) null, (byte) -106, 0, 0, (class111) null, this.field5406);
        if (var13 != null) {
            var13.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field5405 = var13.method417();
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V", line = 21)
    public final void method408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5404++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()I", line = 42)
    public final int method417() {
        field5403++;
        return this.field5405;
    }
}
