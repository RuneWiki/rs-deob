import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class140 extends class293 {

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "[J")
    public static long[] field2301 = new long[100];

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "[[[I")
    public static int[][][] field2298;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
    public static void method957(int arg0) {
        if (arg0 < -44) {
            field2298 = null;
            field2301 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)I")
    public static final int method958(int arg0, int arg1, int arg2, int arg3) {
        field2300++;
        if ((class134.field2251[arg1][arg2][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg0 == 0) {
            return arg1 <= 0 || (class134.field2251[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 110;
        }
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V")
    public static final void method959(int arg0) {
        field2295++;
        if (arg0 <= -34) {
            class128.field2136.method1831(-119);
            class254.field4053.method1831(-98);
            class100.field1521.method1831(-112);
            class73.field996.method1831(-117);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)Z")
    public static final boolean method960(int arg0, byte arg1) {
        field2302++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1 != -102) {
            field2296 = -110;
        }
        int var2 = class23.field291[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1007;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method961(String arg0, int arg1) {
        field2297++;
        if (class225.field3572 == null || arg0.length() == 0) {
            return -1;
        }
        int var2 = 0;
        if (arg1 != -1644) {
            field2301 = null;
        }
        while (var2 < class225.field3572.field1086) {
            if (class7.method43(class247.method1630(" ", (byte) 115, "<br>", class225.field3572.field1083[var2]), (byte) 125, arg0)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }
}
