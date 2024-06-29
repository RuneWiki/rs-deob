import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class540 extends class65 {

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "Ltm;")
    public static class334 field7706 = new class334(29, 3);

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "Lvj;")
    public static class26 field7709 = new class26(5, 1);

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "[[I")
    public static int[][] field7710 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
    public static int field7713 = 0;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public int field7708;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    public int field7711;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "Lcb;")
    public class631 field7703;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "Lgba;")
    public class702 field7707;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
    public static void method3163(boolean arg0) {
        field7706 = null;
        field7709 = null;
        if (arg0) {
            field7710 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)I")
    public static final int method3164(int arg0, int arg1, int arg2) {
        field7704++;
        if (arg0 > -111) {
            field7710 = null;
        }
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public final void method3165(int arg0) {
        field7702++;
        if (class629.field8850.length > class135.field2155) {
            class629.field8850[class135.field2155++] = this;
            if (arg0 < 89) {
                method3164(-43, 100, -40);
            }
        }
    }
}
