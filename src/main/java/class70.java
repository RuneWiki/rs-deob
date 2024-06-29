import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class70 extends class199 {

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "Ljava/lang/String;")
    private String field1154 = "null";

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static volatile int field1133 = 0;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "S")
    public static short field1138 = 1;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1135 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field1144 = -1;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "C")
    public char field1145;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "C")
    public char field1153;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Lgd;")
    private class170 field1142;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "Lgd;")
    public class170 field1149;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "[[[B")
    public static byte[][][] field1139;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)Ljava/lang/String;", line = 4)
    public final String method525(int arg0, int arg1) {
        field1137++;
        if (this.field1149 == null) {
            return this.field1154;
        }
        class214 var3 = (class214) this.field1149.method1222(0, (long) arg1);
        if (arg0 != -1) {
            method533((byte) -18);
        }
        return var3 == null ? this.field1154 : var3.field3259;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(II)Z", line = 24)
    public static final boolean method526(int arg0, int arg1) {
        if (arg1 > -19) {
            field1138 = -86;
        }
        field1134++;
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 36)
    private final void method527(byte arg0) {
        this.field1142 = new class170(this.field1149.method1229(arg0 + 12));
        field1146++;
        if (arg0 != 67) {
            field1144 = -50;
        }
        for (class295 var2 = (class295) this.field1149.method1228(true); var2 != null; var2 = (class295) this.field1149.method1223((byte) 13)) {
            class295 var3 = new class295((int) var2.field758);
            this.field1142.method1227(var3, arg0 - 67, (long) var2.field4562);
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(II)I", line = 65)
    public final int method528(int arg0, int arg1) {
        field1136++;
        if (arg0 != 3) {
            this.method525(-127, -43);
        }
        if (this.field1149 == null) {
            return this.field1147;
        } else {
            class295 var3 = (class295) this.field1149.method1222(0, (long) arg1);
            return var3 == null ? this.field1147 : var3.field4562;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BJ)V", line = 84)
    public static final void method529(byte arg0, long arg1) {
        field1148++;
        if (arg1 != 0L) {
            int var3 = 107 / ((arg0 - 15) / 58);
            class106.field1642.method753(126, 112);
            class106.field1642.method1125(8473, arg1);
            class55.field927++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 103)
    public final boolean method530(String arg0, int arg1) {
        field1143++;
        if (this.field1149 == null) {
            return false;
        }
        if (this.field1142 == null) {
            this.method532((byte) 43);
        }
        for (class242 var3 = (class242) this.field1142.method1222(0, class97.method717(arg0, 29565)); var3 != null; var3 = (class242) this.field1142.method1230(arg1 + 15117)) {
            if (var3.field3867.equals(arg0)) {
                return true;
            }
        }
        if (arg1 != 112) {
            this.method528(-87, 86);
        }
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lkh;BI)V", line = 133)
    private final void method531(class166 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field1153 = class214.method1503(arg0.method1143(-83), (byte) 58);
        } else if (arg2 == 2) {
            this.field1145 = class214.method1503(arg0.method1143(-91), (byte) 58);
        } else if (arg2 == 3) {
            this.field1154 = arg0.method1179((byte) -73);
        } else if (arg2 == 4) {
            this.field1147 = arg0.method1137(-79);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1151(-88);
            this.field1149 = new class170(class10.method73((byte) 123, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1137(80);
                class46 var7;
                if (arg2 == 5) {
                    var7 = new class214(arg0.method1179((byte) -126));
                } else {
                    var7 = new class295(arg0.method1137(80));
                }
                this.field1149.method1227(var7, arg1 + 60, (long) var6);
            }
        }
        if (arg1 != -60) {
            method529((byte) -33, -93L);
        }
        field1140++;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V", line = 187)
    private final void method532(byte arg0) {
        this.field1142 = new class170(this.field1149.method1229(101));
        field1151++;
        class214 var2 = (class214) this.field1149.method1228(true);
        if (arg0 != 43) {
            return;
        }
        while (var2 != null) {
            class242 var3 = new class242(var2.field3259, (int) var2.field758);
            this.field1142.method1227(var3, 0, class97.method717(var2.field3259, arg0 ^ 0x7356));
            var2 = (class214) this.field1149.method1223((byte) 13);
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V", line = 209)
    public static void method533(byte arg0) {
        field1139 = (byte[][][]) null;
        field1135 = null;
        if (arg0 >= -107) {
            method529((byte) -102, 27L);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Z", line = 247)
    public final boolean method534(int arg0, byte arg1) {
        if (arg1 < 47) {
            return false;
        }
        field1150++;
        if (this.field1149 == null) {
            return false;
        }
        if (this.field1142 == null) {
            this.method527((byte) 67);
        }
        class295 var3 = (class295) this.field1142.method1222(0, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILkh;)V", line = 279)
    public final void method535(int arg0, class166 arg1) {
        while (true) {
            int var3 = arg1.method1178(0);
            if (var3 == 0) {
                field1141++;
                if (arg0 != -1) {
                    this.method535(-2, (class166) null);
                }
                return;
            }
            this.method531(arg1, (byte) -60, var3);
        }
    }
}
