import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class666 extends class134 {

    @OriginalMember(owner = "client!aga", name = "l", descriptor = "[[I")
    public static int[][] field9277 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "Lea;")
    public static class547 field9272 = new class547(34, 6);

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    public static int field9271;

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
    public static int field9276;

    @OriginalMember(owner = "client!aga", name = "o", descriptor = "Lni;")
    public static class522 field9280;

    @OriginalMember(owner = "client!aga", name = "m", descriptor = "[I")
    public static int[] field9278;

    @OriginalMember(owner = "client!aga", name = "n", descriptor = "[I")
    public static int[] field9279;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (arg0 > 118) {
            ++field9274;
            if (super.field1708 != 1 && ~super.field1708 != -1) {
                super.field1708 = this.method58(0);
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)V")
    public static void method3759(int arg0) {
        field9277 = null;
        if (arg0 <= 79) {
            field9278 = null;
        }
        field9280 = null;
        field9279 = null;
        field9272 = null;
        field9278 = null;
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)I")
    public final int method3760(byte arg0) {
        if (arg0 < 119) {
            return -80;
        } else {
            ++field9276;
            return super.field1708;
        }
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        if (arg1 != 29053) {
            return 78;
        } else {
            ++field9271;
            return 1;
        }
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lkda;)V")
    public class666(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        ++field9273;
        if (arg0 != 0) {
            field9278 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(ILkda;)V")
    public class666(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        ++field9275;
        int var3 = 20 / ((arg0 - -26) / 41);
        super.field1708 = arg1;
    }
}
