import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class288 {

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "[I")
    public static int[] field3923 = new int[50];

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field3925 = 0;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V", line = 13)
    public static void method1706(boolean arg0) {
        if (!arg0) {
            method1708(39, -82, -116, 50);
        }
        field3923 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V", line = 24)
    public static final void method1707(int arg0, int arg1) {
        field3926++;
        class158.field2027 = arg0;
        class68.field715 = -1;
        class68.field715 = arg1;
        class176.method925(true);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII)V", line = 35)
    public static final void method1708(int arg0, int arg1, int arg2, int arg3) {
        class282.field3872 = new byte[arg2][arg1][arg0];
        if (arg3 < 36) {
            method1709(-109, 88);
        }
        field3924++;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)I", line = 53)
    public static final int method1709(int arg0, int arg1) {
        if (arg1 != -26866) {
            method1709(-56, -81);
        }
        field3922++;
        return arg0 >>> 8;
    }
}
