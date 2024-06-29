import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class34 extends class84 {

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Lce;")
    public static class126 field504 = class206.method1445(-7923, "weiss:");

    @OriginalMember(owner = "client!u", name = "C", descriptor = "[I")
    public static int[] field506 = new int[500];

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Z")
    public static boolean field510 = false;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V", line = 10)
    public static void method188(boolean arg0) {
        if (arg0) {
            field506 = null;
            field504 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I", line = 29)
    public static final int method189(int arg0) {
        field507++;
        int var1 = 52 / ((arg0 + 13) / 50);
        if ((double) class15.field200 == 3.0D) {
            return 37;
        } else if ((double) class15.field200 == 4.0D) {
            return 50;
        } else if ((double) class15.field200 == 6.0D) {
            return 75;
        } else if ((double) class15.field200 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V", line = 75)
    public static final void method190(int arg0, int arg1, int arg2) {
        field503++;
        if (class159.field2866 != arg2 && arg0 != -1) {
            class257.method1743(false, class112.field1756, 0, arg0, class159.field2866, arg2 + 2);
            class51.field785 = true;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Z", line = 105)
    public static final boolean method191(int arg0, int arg1) {
        int var2 = 14 / ((arg0 + 3) / 39);
        field508++;
        return ((arg1 & 0x31D3868B) >> 29) != 0;
    }
}
