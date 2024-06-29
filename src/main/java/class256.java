import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class256 extends class243 {

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "Ltc;")
    public static class477 field3466 = null;

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "Z")
    public static boolean field3468 = false;

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "Luk;")
    public static class265 field3470;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "[Lxa;")
    public static class511[] field3469;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIZLjba;Ljba;Z)I", line = 4)
    public static final int method1612(int arg0, int arg1, int arg2, boolean arg3, class138 arg4, class138 arg5, boolean arg6) {
        field3472++;
        int var7 = class585.method3196(arg2, arg5, arg3, 55, arg4);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg0 == arg1) {
            return 0;
        } else {
            int var8 = class585.method3196(arg1, arg5, arg6, 127, arg4);
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(ILffa;Loca;III)V", line = 41)
    public class256(int arg0, class562 arg1, class573 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3471 = arg5;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)Lfl;", line = 54)
    public final class103 method318(int arg0) {
        field3467++;
        if (arg0 != -26207) {
            method1613(80);
        }
        return class419.field5431;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)V", line = 68)
    public static void method1613(int arg0) {
        field3469 = null;
        if (arg0 >= -107) {
            field3466 = null;
        }
        field3470 = null;
        field3466 = null;
    }
}
