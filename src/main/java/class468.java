import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class468 {

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "Lnt;")
    private class220 field6747;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "[I")
    public static int[] field6746 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "[[I")
    public static int[][] field6745 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
    public static int field6751 = 0;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!maa", name = "k", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "Lak;")
    public static class349 field6748;

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "Lap;")
    public static class474 field6752;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "Ltq;")
    private class626 field6744;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lud;I)Lus;", line = 4)
    public static final class1 method2839(class35 arg0, int arg1) {
        if (arg1 != -1) {
            method2839(null, 9);
        }
        field6750++;
        return new class1(arg0.method225((byte) 95), arg0.method225((byte) 73), arg0.method225((byte) 99), arg0.method225((byte) 83), arg0.method225((byte) 78), arg0.method225((byte) 125), arg0.method225((byte) 104), arg0.method225((byte) 82), arg0.method239(-62), arg0.method273(255));
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V", line = 19)
    public class468() {
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)Ltq;", line = 23)
    public final class626 method2840(int arg0) {
        if (arg0 != -6334) {
            return null;
        }
        field6749++;
        class626 var2 = this.field6744;
        if (this.field6747.field3131 == var2) {
            this.field6744 = null;
            return null;
        } else {
            this.field6744 = var2.field8990;
            return var2;
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)Ltq;", line = 50)
    public final class626 method2841(int arg0) {
        field6754++;
        if (arg0 != 1) {
            field6751 = -52;
        }
        class626 var2 = this.field6747.field3131.field8990;
        if (this.field6747.field3131 == var2) {
            this.field6744 = null;
            return null;
        } else {
            this.field6744 = var2.field8990;
            return var2;
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lnt;)V", line = 70)
    public class468(class220 arg0) {
        this.field6747 = arg0;
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(I)V", line = 78)
    public static void method2842(int arg0) {
        if (arg0 == 7910) {
            field6752 = null;
            field6746 = null;
            field6745 = null;
            field6748 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLnt;)V", line = 92)
    public final void method2843(byte arg0, class220 arg1) {
        this.field6747 = arg1;
        if (arg0 != 65) {
            field6751 = 2;
        }
        field6753++;
    }
}
