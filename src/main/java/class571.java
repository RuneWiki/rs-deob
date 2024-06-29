import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class571 extends class607 {

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "[Lmm;")
    public class253[] field8340;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "[I")
    public static int[] field8345 = new int[8];

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "Lkb;")
    public static class640 field8343;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "[I")
    public static int[] field8344;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IC)Z", line = 4)
    public static final boolean method3342(int arg0, char arg1) {
        int var2 = -104 / ((arg0 - 73) / 43);
        field8341++;
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILsr;Lda;III)V", line = 17)
    public static final void method3343(int arg0, class229 arg1, class55 arg2, int arg3, int arg4, int arg5) {
        field8342++;
        if (arg2 != null) {
            if (arg4 != -28256) {
                method3344(false);
            }
            arg1.method1389(arg5, arg2.method115(), arg2.method94(), arg2.method79(), (byte) -99, arg2.method83(), arg3, arg2.method99(), arg2.method119(), arg0, arg2.method65());
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "([Lmm;)V", line = 31)
    public class571(class253[] arg0) {
        this.field8340 = arg0;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)V", line = 39)
    public static void method3344(boolean arg0) {
        field8343 = null;
        field8345 = null;
        field8344 = null;
        if (arg0) {
            field8344 = null;
        }
    }
}
