import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class60 extends class307 {

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Lqd;")
    public class40 field1144;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "Lqd;")
    public static class40 field1145 = class147.method1106(")3)3)3", (byte) -76);

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field1149 = 0;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "Lo;")
    public static class199 field1143 = new class199(16);

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "Lqd;")
    public static class40 field1151 = class147.method1106("Update)2Liste geladen)3", (byte) -70);

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "I")
    public static int field1152 = 1;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
    public static int field1154 = 2;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "Lqd;")
    private static class40 field1155 = class147.method1106("level: ", (byte) -66);

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
    public static int field1150 = 0;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "S")
    public static short field1156 = 1;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "Lqd;")
    public static class40 field1153 = field1155;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 4)
    public static final void method504(int arg0, int arg1, int arg2) {
        if (arg1 == 4 && !class178.field2929) {
            arg1 = 2;
            arg0 = 2;
        }
        if (arg2 != 20789) {
            return;
        }
        field1147++;
        if (class135.field2294 != arg1) {
            if (class292.field4887) {
                return;
            }
            if (class135.field2294 != 0) {
                class250.field4132[class135.field2294].method93();
            }
            if (arg1 != 0) {
                class66 var3 = class250.field4132[arg1];
                var3.method92();
                var3.method94(arg0);
            }
            class135.field2294 = arg1;
            class292.field4878 = arg0;
        } else if (arg1 != 0 && class292.field4878 != arg0) {
            class250.field4132[arg1].method94(arg0);
            class292.field4878 = arg0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(SI)Z", line = 54)
    public static final boolean method505(short arg0, int arg1) {
        field1148++;
        if (arg0 == 7 || arg0 == 36 || arg0 == 39 || arg0 == 15 || arg0 == 30 || arg0 == 38 || arg0 == 11 || arg0 == 41) {
            return true;
        } else if (arg0 == 40 || arg0 == 21 || arg0 == 1001 || arg0 == 1002) {
            return true;
        } else if (arg0 == 18 || arg0 == 28 || arg0 == 9 || arg0 == 57 || arg0 == 51) {
            return true;
        } else if (arg0 == 58 || arg0 == 8 || arg0 == 46 || arg0 == 34 || arg0 == 23 || arg0 == 29) {
            return true;
        } else if (arg1 == 11173) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 81)
    public static void method506(int arg0) {
        if (arg0 != 16) {
            return;
        }
        field1143 = null;
        field1151 = null;
        field1145 = null;
        field1153 = null;
        field1155 = null;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 96)
    public class60() {
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lqd;)V", line = 98)
    public class60(class40 arg0) {
        this.field1144 = arg0;
    }
}
