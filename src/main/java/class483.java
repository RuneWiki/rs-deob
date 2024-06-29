import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class483 extends class461 {

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field6434 = 0;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Lra;")
    public static class361 field6433 = new class361(60, 10);

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "[I")
    public static int[] field6441 = new int[3];

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Loo;")
    public static class10 field6428;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Lxa;")
    private class511 field6436;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Lxa;")
    public static class511 field6437;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Loi;")
    public static class57 field6429;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "[[[Lgn;")
    public static class530[][][] field6438;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V", line = 6)
    public static void method2663(int arg0) {
        field6437 = null;
        field6441 = null;
        field6433 = null;
        field6428 = null;
        if (arg0 != 0) {
            field6428 = null;
        }
        field6429 = null;
        field6438 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIII)V", line = 24)
    public final void method552(boolean arg0, int arg1, int arg2, int arg3) {
        ++field6440;
        int var5 = 51 % ((arg2 - -83) / 41);
        int var6 = this.method2586((byte) 93) * super.field6043.field584 / 10000;
        int[] var7 = new int[4];
        class520.field6799.method356(var7);
        class520.field6799.method376(arg3, arg1 - -2, arg3 + var6, arg1 - -super.field6043.field585);
        this.field6436.method2756(arg3, arg1 + 2, super.field6043.field584, super.field6043.field585);
        class520.field6799.method376(var7[0], var7[1], var7[2], var7[3]);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 42)
    public static final void method2664(boolean arg0) {
        ++field6431;
        if (!class81.field1107) {
            class494.method2694(class515.field6748, 54);
            if (class168.field2096 != null) {
                class494.method2694(class168.field2096, 52);
            }
            class81.field1107 = arg0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZIB)V", line = 64)
    public final void method553(int arg0, boolean arg1, int arg2, byte arg3) {
        ++field6430;
        class520.field6799.method388(arg2 - 2, arg0, super.field6043.field584 + 4, super.field6043.field585 - -2, ((class53) super.field6043).field720, 0);
        if (arg3 >= -79) {
            field6441 = null;
        }
        class520.field6799.method388(arg2 + -1, arg0 + 1, super.field6043.field584 + 2, super.field6043.field585, 0, 0);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZ)V", line = 76)
    public static final void method2665(int arg0, int arg1, boolean arg2) {
        ++field6435;
        class57.field769 = arg1;
        class222.field2906 = arg0;
        class39.method309(class611.field8255.field3543, 6693, class611.field8255.field3554);
        if (arg2) {
            class540.method2866(false, "", 0, "");
        } else {
            class601.method3272(arg1 + -65);
            class540.method2866(false, class635.field8834, arg1 ^ 3, class183.field2346);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Z", line = 96)
    public final boolean method444(byte arg0) {
        if (arg0 >= -10) {
            return false;
        } else {
            ++field6439;
            return !super.method444((byte) -113) ? false : super.field6049.method3362(((class53) super.field6043).field723, -121);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 123)
    public final void method449(int arg0) {
        ++field6432;
        super.method449(-2);
        this.field6436 = class53.method462(26513, ((class53) super.field6043).field723, super.field6049);
        int var2 = -73 / ((65 - arg0) / 45);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lpe;Lpe;Lu;)V", line = 138)
    public class483(class615 arg0, class615 arg1, class53 arg2) {
        super(arg0, arg1, arg2);
    }
}
