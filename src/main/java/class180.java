import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class180 extends class115 {

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lvd;")
    public class258 field2666;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "J")
    public static long field2657 = 0L;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Z")
    public static boolean field2663 = false;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "F")
    public static float field2665;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Lok;")
    public static class74 field2662;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Z")
    public boolean field2670;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[I")
    public static int[] field2659;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "[J")
    public static long[] field2661;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Z")
    public final boolean method1227(int arg0) {
        field2660++;
        int var2 = 99 / ((arg0 + 68) / 41);
        return this.field2670;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)I")
    public static final int method1228(int arg0) {
        field2668++;
        if (arg0 != 2) {
            field2659 = null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)Z")
    public abstract boolean method850(int arg0);

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)I")
    public int method848(int arg0) {
        int var2 = 11 / ((-arg0 - 40) / 54);
        field2667++;
        return 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lud;BILud;)V")
    public abstract void method855(class94 arg0, byte arg1, int arg2, class94 arg3);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public abstract void method846(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
    public static void method1229(int arg0) {
        field2662 = null;
        if (arg0 <= -125) {
            field2659 = null;
            field2661 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
    public abstract void method847(int arg0, int arg1);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)Z")
    public final boolean method1230(boolean arg0) {
        if (arg0) {
            field2669 = -11;
        }
        field2664++;
        return false;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)I")
    public final int method1231(byte arg0) {
        field2658++;
        return arg0 == -27 ? 1 : -125;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(B)Z")
    public abstract boolean method852(byte arg0);

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(B)V")
    public abstract void method849(byte arg0);

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lvd;)V")
    public class180(class258 arg0) {
        this.field2666 = arg0;
    }
}
