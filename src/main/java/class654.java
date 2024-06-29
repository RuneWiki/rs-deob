import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class654 implements class354 {

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public int field8813;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field8815 = 0;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "Ltq;")
    public static class654 field8809 = new class654("", 18);

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method3635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8810++;
        for (int var6 = arg3; var6 <= arg0; var6++) {
            for (int var8 = arg5; var8 <= arg4; var8++) {
                if (class689.field9214[var6][var8] == arg1 && class227.field2932[var6][var8] <= 1) {
                    return true;
                }
            }
        }
        int var7 = 68 % ((arg2 - 82) / 34);
        return false;
    }

    @OriginalMember(owner = "client!tq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8817++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public static void method3636(int arg0) {
        field8809 = null;
        if (arg0 != 0) {
            field8815 = 100;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;IIIIBLha;I)V")
    public static final void method3637(String arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class66 arg6, int arg7) {
        field8812++;
        if (class574.field7826 == null || class429.field6219 == null) {
            if (class490.field6826.method1185(class123.field1700, 9330) && class490.field6826.method1185(class302.field4240, 9330)) {
                class574.field7826 = arg6.method466(class162.method1115(class490.field6826, class123.field1700, 0), true);
                class162 var8 = class162.method1115(class490.field6826, class302.field4240, 0);
                class429.field6219 = arg6.method466(var8, true);
                var8.method1128();
                class324.field4598 = arg6.method466(var8, true);
            } else {
                arg6.method434(arg1, arg4, arg3, arg7, class415.field5993 | 255 - class149.field2005 << 24, 1);
            }
        }
        if (class574.field7826 != null && class429.field6219 != null) {
            int var9 = (arg3 - (class429.field6219.method350() * 2)) / class574.field7826.method350();
            for (int var10 = 0; var10 < var9; var10++) {
                class574.field7826.method968(arg1 + class429.field6219.method350() + class574.field7826.method350() * var10, arg4);
            }
            class429.field6219.method968(arg1, arg4);
            class324.field4598.method968(arg3 + (arg1 - class324.field4598.method350()), arg4);
        }
        class88.field1251.method568(class609.field8240 | 0xFF000000, arg1 + 3, arg4 + 14, arg0, -1, true);
        arg6.method434(arg1, arg4 + arg7, arg3, arg2 - arg7, class415.field5993 | -class149.field2005 + 255 << 24, 1);
        if (arg5 <= 40) {
            field8815 = 38;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public static final void method3638(byte arg0) {
        class634.field8566 = false;
        class712.field9720 = new int[class504.field7090][class196.field2540 + 1][class247.field3229 + 1];
        class175.field2318 = new class378[500];
        class282.field4079 = 0;
        class135.field1833 = new class378[1000];
        class346.field4859 = 0;
        if (arg0 != -79) {
            method3637(null, 109, 114, 32, -84, (byte) -127, null, -40);
        }
        class583.field7922 = 0;
        field8811++;
        class586.field7974 = 0;
        class561.field7690 = new class378[500];
        class693.field9225 = class30.field299;
        class139.field1881 = new class378[2000];
        class350.field5104 = class30.field299;
        if (class34.field372 instanceof class721) {
            class14.field144 = false;
        } else {
            class14.field144 = true;
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
    public static final void method3639(int arg0) {
        class715.method3961(512);
        field8814++;
        int var1 = class125.field1721.field5154.method1216(43);
        if (var1 == 2) {
            class229.method1446(class693.field9222, class460.field6558, 100, 100, -1, class375.field5490);
        } else if (var1 == 3) {
            class107.method805(2, 1, class693.field9222, class375.field5490, class657.field8863, class460.field6558, class205.field2652, 2);
        }
        if (arg0 >= -28) {
            method3639(-27);
        }
        if (class125.field1721.field5154.method1215((byte) 70)) {
            class657.method3648(class669.field8962, (byte) 114);
        }
        if (class375.field5490 != null) {
            class539.method3122(-78);
        }
        class408.field5786 = class125.field1721.field5154.method1216(43) != 0;
        class24.field246 = class125.field1721.field5154.method1215((byte) -63);
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class654(String arg0, int arg1) {
        this.field8813 = arg1;
    }
}
