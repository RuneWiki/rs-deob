import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class163 extends class498 {

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public int field2417;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    private int field2409;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    private int field2402;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    private int field2410;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    private int field2408;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    private int field2404;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "Ltn;")
    public static class60 field2414;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "Lac;")
    public static class384 field2413;

    static {
        new class530(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        new class530("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field2414 = new class60(24, 7);
        field2416 = -1;
        field2418 = 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)Z", line = 4)
    public final boolean method1037(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field2412++;
            return arg0 >= this.field2402 && this.field2408 >= arg0 && this.field2409 <= arg1 && this.field2404 >= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BII)Z", line = 21)
    public final boolean method1038(byte arg0, int arg1, int arg2) {
        if (arg0 == 61) {
            field2405++;
            return this.field2406 <= arg1 && arg1 <= this.field2401 && this.field2417 <= arg2 && arg2 <= this.field2411;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([IIII)V", line = 36)
    public final void method1039(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 108) {
            field2407++;
            arg0[2] = this.field2417 + arg2 - this.field2409;
            arg0[1] = this.field2406 - (this.field2402 - arg1);
            arg0[0] = 0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)Z", line = 52)
    public final boolean method1040(int arg0, int arg1, int arg2, int arg3) {
        field2415++;
        if (arg0 != 0) {
            this.method1040(55, -73, -61, 26);
        }
        return this.field2410 == arg1 && this.field2402 <= arg2 && arg2 <= this.field2408 && this.field2409 <= arg3 && arg3 <= this.field2404;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 70)
    public static void method1041(int arg0) {
        field2413 = null;
        if (arg0 != 0) {
            method1041(26);
        }
        field2414 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III[I)V", line = 102)
    public final void method1042(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[arg0] = this.field2410;
        arg3[2] = arg2 + this.field2409 - this.field2417;
        field2403++;
        arg3[1] = this.field2402 + arg1 - this.field2406;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIII)V", line = 112)
    public class163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2401 = arg7;
        this.field2417 = arg6;
        this.field2411 = arg8;
        this.field2406 = arg5;
        this.field2409 = arg2;
        this.field2402 = arg1;
        this.field2410 = arg0;
        this.field2408 = arg3;
        this.field2404 = arg4;
    }
}
