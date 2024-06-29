import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class582 extends class487 {

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "[I")
    public int[] field8156;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "[I")
    public int[] field8154;

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "I")
    public static int field8158 = -1;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "Lea;")
    public static class547 field8152 = new class547(94, -1);

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "Llga;")
    public static class712 field8159 = new class712(48, 2);

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "Lida;")
    public static class238 field8161;

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "[[Z")
    public static boolean[][] field8160;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BILac;III)Liaa;", line = 3)
    public static final class495 method3253(byte arg0, int arg1, class541 arg2, int arg3, int arg4, int arg5) {
        field8157++;
        int var6 = 71 / ((arg0 + 24) / 40);
        if (!arg2.field7637 && (!class143.method891(arg3, 0) || !class143.method891(arg1, 0))) {
            return arg2.field7589 ? new class495(arg2, 34037, arg4, arg5, arg3, arg1, true) : new class495(arg2, arg4, arg5, arg3, arg1, class128.method814(423660257, arg3), class128.method814(423660257, arg1), true);
        } else {
            return new class495(arg2, 3553, arg4, arg5, arg3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V", line = 27)
    public static void method3254(byte arg0) {
        if (arg0 != 29) {
            field8152 = null;
        }
        field8160 = null;
        field8152 = null;
        field8159 = null;
        field8161 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V", line = 42)
    public static final void method3255(int arg0) {
        if (class510.field6893 < 0) {
            class510.field6893 = 0;
            class278.field3706 = -1;
            class239.field3133 = -1;
        }
        field8151++;
        if (class510.field6893 > class642.field8961) {
            class239.field3133 = -1;
            class278.field3706 = -1;
            class510.field6893 = class642.field8961;
        }
        if (~class450.field6297 > arg0) {
            class239.field3133 = -1;
            class278.field3706 = -1;
            class450.field6297 = 0;
        }
        if (class450.field6297 > class642.field8956) {
            class278.field3706 = -1;
            class450.field6297 = class642.field8956;
            class239.field3133 = -1;
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(II[I[I)V", line = 81)
    public class582(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field8156 = arg3;
        this.field8154 = arg2;
    }
}
