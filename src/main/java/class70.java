import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class70 {

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!aw", name = "n", descriptor = "B")
    public byte field1054;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!aw", name = "o", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public static int field1046 = 500;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    public static int field1050 = 0;

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "[I")
    public static int[] field1051 = new int[1000];

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "Ljda;")
    public class211 field1053;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "Lfc;")
    public class241 field1041;

    @OriginalMember(owner = "client!aw", name = "r", descriptor = "Lsaa;")
    public static class302 field1058;

    @OriginalMember(owner = "client!aw", name = "p", descriptor = "Lqba;")
    public class377 field1056;

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "Lin;")
    public class81 field1052;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method542(int arg0) {
        field1047++;
        if (arg0 != -3) {
            this.method542(46);
        }
        return this.field1054 == 2 || this.field1054 == 3;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILvj;)V", line = 16)
    public static final void method543(int arg0, class411 arg1) {
        if (arg0 != 0) {
            method545(89);
        }
        field1042++;
        if (arg1 instanceof class287) {
            class287 var2 = (class287) arg1;
            if (var2.field4052 != null) {
                class178.method1195(var2, 0, class199.field2897.field8609 != var2.field8609);
                return;
            }
        } else if ((arg1 instanceof class403)) {
            class403 var3 = (class403) arg1;
            class634.method3501(class199.field2897.field8609 != var3.field8609, var3, true);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V", line = 52)
    public static void method544(byte arg0) {
        field1058 = null;
        field1051 = null;
        if (arg0 <= 86) {
            field1058 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V", line = 69)
    public static final void method545(int arg0) {
        field1044++;
        if (class32.field525 == 7) {
            class55.method365((byte) -112, false);
            return;
        }
        if (arg0 >= -109) {
            field1050 = 56;
        }
        class334.field4580 = class370.field4996;
        class370.field4996 = null;
        class472.method2658(19093, 13);
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(BIIIII)V", line = 99)
    public class70(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1048 = arg1;
        this.field1057 = arg2;
        this.field1054 = arg0;
        this.field1049 = arg5;
        this.field1055 = arg3;
        this.field1043 = arg4;
    }
}
