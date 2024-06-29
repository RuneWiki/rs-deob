import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class730 extends class706 {

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public int field10111;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "I")
    public int field10113;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field10110 = 0;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "Lfba;")
    public static class27 field10109 = new class27(16, -1);

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field10107;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    public static int field10112;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "[I")
    public static int[] field10114;

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lin;Lti;IIIIIIIIII)V")
    public class730(class97 arg0, class463 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field10111 = arg10;
        this.field10113 = arg11;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)Lsaa;")
    public final class345 method1656(int arg0) {
        field10112++;
        return arg0 == 0 ? class759.field10480 : null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
    public static void method4085(byte arg0) {
        int var1 = 13 % ((arg0 - 34) / 46);
        field10109 = null;
        field10114 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)I")
    public static final int method4086(byte arg0, int arg1) {
        int var2 = -65 % ((2 - arg0) / 59);
        field10108++;
        return arg1 & 0x3FF;
    }
}
