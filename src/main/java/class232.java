import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class232 extends class69 {

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public int field3689;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public int field3691;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3692 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "[C")
    public static char[] field3690 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field3694 = 0;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field3696 = 0;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static final void method1534(byte arg0) {
        if (arg0 >= -23) {
            method1535(47, -27, -98);
        }
        field3695++;
        for (int var1 = 0; var1 < class166.field2715; var1++) {
            class221 var2 = class150.method1017(var1, 0);
            if (var2 != null && var2.field3522 == 0) {
                class108.field1876[var1] = 0;
                class214.field3454[var1] = 0;
            }
        }
        class129.field2158 = new class61(16);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
    public static final void method1535(int arg0, int arg1, int arg2) {
        field3693++;
        int var3 = 48 / ((52 - arg1) / 60);
        if (class186.field2986 != arg2) {
            class246.field3958 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class246.field3958[var4] = (var4 << 12) / arg2;
            }
            field3688 = arg2 * 32;
            class186.field2986 = arg2;
            class34.field422 = arg2 - 1;
        }
        if (class205.field3296 == arg0) {
            return;
        }
        if (class186.field2986 == arg0) {
            class1.field15 = class246.field3958;
        } else {
            class1.field15 = new int[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                class1.field15[var5] = (var5 << 12) / arg0;
            }
        }
        class205.field3296 = arg0;
        class144.field2332 = arg0 - 1;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(II)V")
    public class232(int arg0, int arg1) {
        this.field3689 = arg1;
        this.field3691 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
    public static void method1536(boolean arg0) {
        field3690 = null;
        if (!arg0) {
            field3692 = null;
        }
        field3692 = null;
    }
}
