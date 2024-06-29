import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class365 extends class269 {

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public int field5276;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public int field5274;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Z")
    public static boolean field5272 = false;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lve;")
    public static class527 field5277 = new class527(0, 1);

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Lke;")
    public static class622 field5278 = new class622(4, -2);

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lve;", line = 4)
    public final class527 method606(int arg0) {
        field5273++;
        return arg0 == 0 ? class681.field9674 : null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lfda;Laba;IIIIIIIII)V", line = 15)
    public class365(class336 arg0, class185 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field5276 = arg10;
        this.field5274 = arg9;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V", line = 26)
    public static void method2278(boolean arg0) {
        field5278 = null;
        if (!arg0) {
            method2278(false);
        }
        field5277 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILli;IIII)V", line = 42)
    public static final void method2279(int arg0, int arg1, class449 arg2, int arg3, int arg4, int arg5, int arg6) {
        class785.method4302(arg1, (byte) -86, arg4, arg6, arg3, arg2.field7718, arg2.field7710, arg0, arg5, arg2.field7719);
        field5275++;
    }
}
