import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class557 extends class66 {

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "Ler;")
    public class92 field8053;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "Lgv;")
    public static class73 field8048 = new class73(0, -1);

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "Z")
    public boolean field8052;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V", line = 6)
    public static void method3325(byte arg0) {
        field8048 = null;
        int var1 = -17 / ((arg0 - 39) / 41);
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(B)I", line = 17)
    public final int method3326(byte arg0) {
        int var2 = -12 / ((-arg0 - 65) / 55);
        field8051++;
        return 1;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Z", line = 32)
    public final boolean method3327(int arg0) {
        field8049++;
        return arg0 < 81 ? false : this.field8052;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)Z", line = 48)
    public final boolean method3328(int arg0) {
        field8047++;
        return arg0 != -1;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ler;)V", line = 62)
    public class557(class92 arg0) {
        this.field8053 = arg0;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)I", line = 70)
    public int method1428(boolean arg0) {
        if (arg0) {
            return 89;
        } else {
            field8050++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)Z")
    public abstract boolean method1429(byte arg0);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)Z")
    public abstract boolean method1430(int arg0);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILwh;Lwh;I)V")
    public abstract void method1437(int arg0, class133 arg1, class133 arg2, int arg3);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
    public abstract void method1431(int arg0, int arg1);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public abstract void method1432(boolean arg0);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
    public abstract void method1434(int arg0, int arg1, int arg2);
}
