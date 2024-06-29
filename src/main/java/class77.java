import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class77 extends class187 {

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1149 = "Ok";

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field1152 = 0;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 5)
    public static final void method540(int arg0) {
        field1156++;
        if (arg0 == -6910) {
            class115.field1790.method1296(arg0 + 7165);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)I", line = 15)
    public static final int method541(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V", line = 28)
    public static final void method542(int arg0, int arg1) {
        if (arg1 == 127) {
            field1150++;
            class75 var2 = class204.method1371(8, 7, arg0);
            var2.method533(22461);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V", line = 55)
    public static final void method543(int arg0, byte arg1) {
        field1148++;
        class255.field3981.method1287(arg0, 126);
        if (arg1 <= -86) {
            class242.field3826.method1287(arg0, -20);
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V", line = 67)
    public static void method544(int arg0) {
        if (arg0 >= -121) {
            field1154 = -52;
        }
        field1149 = null;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(II)V", line = 79)
    public class77(int arg0, int arg1) {
        this.field1155 = arg0;
        this.field1153 = arg1;
    }
}
