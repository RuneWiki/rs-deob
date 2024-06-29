import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class57 {

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "Lko;")
    private class529 field714;

    @OriginalMember(owner = "client!hka", name = "g", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!hka", name = "b", descriptor = "Lfba;")
    public static class27 field715 = new class27(29, 3);

    @OriginalMember(owner = "client!hka", name = "h", descriptor = "Lne;")
    public static class336 field721 = new class336("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!hka", name = "c", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!hka", name = "d", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!hka", name = "e", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!hka", name = "f", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(B)V")
    public static void method391(byte arg0) {
        field715 = null;
        field721 = null;
        if (arg0 != -52) {
            field715 = null;
        }
    }

    @OriginalMember(owner = "client!hka", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field714.method3199(0, this.field720);
        field716++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(I)V")
    public static final void method392(int arg0) {
        field719++;
        if (class184.field2831 != arg0) {
            class430.method2582(-1, class184.field2831, -1, false, (byte) -99);
            class184.field2831 = -1;
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(Lru;IZBZILru;)I")
    public static final int method393(class204 arg0, int arg1, boolean arg2, byte arg3, boolean arg4, int arg5, class204 arg6) {
        if (arg3 >= -1) {
            method394(66, (byte) 67, null);
        }
        field717++;
        int var7 = class348.method2205(arg4, arg0, arg6, (byte) 18, arg5);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var8 = class348.method2205(arg2, arg0, arg6, (byte) 18, arg1);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(Lko;II)V")
    public class57(class529 arg0, int arg1, int arg2) {
        this.field714 = arg0;
        this.field720 = arg2;
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method394(int arg0, byte arg1, String arg2) {
        if (arg1 > -48) {
            method393(null, 125, true, (byte) -59, true, -89, null);
        }
        class436.field5883++;
        field718++;
        class312 var3 = class353.method2245(class87.field971, class549.field7883, (byte) 24);
        var3.field4445.method2952(0, class348.method2204((byte) -119, arg2) + 1);
        var3.field4445.method2997(arg0, 13855);
        var3.field4445.method2953(arg2, -28136);
        class208.method1440(var3, 29);
    }
}
