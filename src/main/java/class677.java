import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class677 extends class77 {

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    public int field9631;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "[[I")
    public static int[][] field9629 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "Leba;")
    public static class550 field9633 = new class550(29, 6);

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    public static int field9630;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(III)Z")
    public static final boolean method3865(int arg0, int arg1, int arg2) {
        if (arg2 == 6074) {
            field9632++;
            return (arg0 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ltl;Lfn;IIIIIIIIIIIIII)V")
    public class677(class566 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field9631 = arg15;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V")
    public static void method3866(byte arg0) {
        int var1 = 7 % (arg0 / 61);
        field9633 = null;
        field9629 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Ltca;")
    public final class141 method421(int arg0) {
        if (arg0 != 4) {
            method3866((byte) 34);
        }
        field9630++;
        return class360.field4775;
    }
}
