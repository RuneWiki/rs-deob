import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class39 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field638 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lek;")
    public static class183 field637 = new class183();

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Lwm;")
    public static class152 field642 = class157.method1048("blinken2:", 100);

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Lhh;")
    public static class209 field641;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[[[I")
    public static int[][][] field643;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)I", line = 17)
    public static final int method281(int arg0, int arg1, int arg2) {
        field639++;
        class123 var3 = (class123) class225.field3655.method1586((long) arg1, arg0 - 123);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = arg0;
            for (int var5 = 0; var5 < var3.field1729.length; var5++) {
                if (var3.field1730[var5] == arg2) {
                    var4 += var3.field1729[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 70)
    public static void method282(byte arg0) {
        field637 = null;
        field642 = null;
        field641 = null;
        field643 = (int[][][]) null;
        int var1 = 39 % ((arg0 - 38) / 57);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)Z", line = 87)
    public static final boolean method283(int arg0, boolean arg1) {
        field640++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        }
        if (!arg1) {
            method283(78, false);
        }
        if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }
}
