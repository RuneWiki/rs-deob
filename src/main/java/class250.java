import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class class250 {

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lul;")
    public static class51 field4053 = new class51(5);

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "[Lud;")
    public static class307[] field4055 = new class307[4];

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "[I")
    public static int[] field4057 = new int[5];

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public int field4050;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public int field4051;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public int field4052;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field4054;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Ljg;")
    public static class326 field4056;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)I", line = 14)
    public static final int method1752(boolean arg0, int arg1) {
        if (arg0) {
            field4049++;
            return arg1 >> 11 & 0x7F;
        } else {
            return -27;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 27)
    public static void method1753(int arg0) {
        if (arg0 == -23115) {
            field4055 = null;
            field4057 = null;
            field4053 = null;
            field4056 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
    public abstract void method1604(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
    public abstract void method1596(int arg0, int arg1);
}
