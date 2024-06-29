import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class118 {

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "[I")
    public static int[] field1942 = new int[1];

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "Z")
    public static boolean field1945 = false;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)I", line = 4)
    public static final int method878(int arg0, int arg1) {
        field1944++;
        if (arg0 != 1887) {
            field1942 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BII)Z", line = 15)
    public static final boolean method879(byte arg0, int arg1, int arg2) {
        if (arg0 > -110) {
            return true;
        }
        field1943++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        class79 var3 = class319.field4807.method2874(arg2, -17045);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method629(arg1, -54);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)V", line = 49)
    public static final void method880(int arg0, int arg1, int arg2) {
        class429 var3 = class380.field5761[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6380 != null) {
            var3.field6380 = null;
        }
        if (var3.field6367 != null) {
            var3.field6367 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 62)
    public static void method881(int arg0) {
        field1942 = null;
        if (arg0 != 20750) {
            method881(5);
        }
    }
}
