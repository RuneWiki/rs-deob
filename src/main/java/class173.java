import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class173 extends class18 {

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "Ljava/lang/String;")
    private String field2726 = "null";

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2717 = " from your friend list first.";

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "[J")
    public static long[] field2718 = new long[200];

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field2728 = 0;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2732 = "flash2:";

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "C")
    public char field2721;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "C")
    public char field2733;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "Luc;")
    public class39 field2722;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "Luc;")
    private class39 field2735;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2719;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method1170(boolean arg0, String arg1) {
        field2727++;
        if (this.field2722 == null) {
            return false;
        }
        if (this.field2735 == null) {
            this.method1172(0);
        }
        for (class170 var3 = (class170) this.field2735.method285(class103.method742(arg0, arg1), 13821); var3 != null; var3 = (class170) this.field2735.method293((byte) -43)) {
            if (var3.field2651.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
    private final void method1171(int arg0) {
        if (arg0 != 5) {
            this.field2734 = -7;
        }
        field2725++;
        this.field2735 = new class39(this.field2722.method284((byte) -111));
        for (class120 var2 = (class120) this.field2722.method287(-128); var2 != null; var2 = (class120) this.field2722.method291((byte) -52)) {
            class120 var3 = new class120((int) var2.field2603);
            this.field2735.method281(1, (long) var2.field1932, var3);
        }
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)V")
    private final void method1172(int arg0) {
        this.field2735 = new class39(this.field2722.method284((byte) -127));
        if (arg0 != 0) {
            field2717 = null;
        }
        for (class244 var2 = (class244) this.field2722.method287(-125); var2 != null; var2 = (class244) this.field2722.method291((byte) -48)) {
            class170 var3 = new class170(var2.field3970, (int) var2.field2603);
            this.field2735.method281(1, class103.method742(false, var2.field3970), var3);
        }
        field2724++;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method1173(int arg0, int arg1) {
        field2736++;
        if (this.field2722 == null) {
            return this.field2726;
        }
        class244 var3 = (class244) this.field2722.method285((long) arg1, 13821);
        if (arg0 != 6146) {
            field2717 = null;
        }
        return var3 == null ? this.field2726 : var3.field3970;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Z")
    public final boolean method1174(int arg0, byte arg1) {
        field2723++;
        if (this.field2722 == null) {
            return false;
        }
        if (this.field2735 == null) {
            this.method1171(5);
        }
        if (arg1 != 66) {
            this.field2726 = null;
        }
        class120 var3 = (class120) this.field2735.method285((long) arg0, 13821);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(II)I")
    public final int method1175(int arg0, int arg1) {
        field2730++;
        if (arg1 != 16004) {
            field2719 = null;
        }
        if (this.field2722 == null) {
            return this.field2734;
        } else {
            class120 var3 = (class120) this.field2722.method285((long) arg0, arg1 - 2183);
            return var3 == null ? this.field2734 : var3.field1932;
        }
    }

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)V")
    public static void method1176(int arg0) {
        field2719 = null;
        field2718 = null;
        if (arg0 != 21849) {
            field2728 = -22;
        }
        field2717 = null;
        field2732 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)Z")
    public static final boolean method1177(int arg0, byte arg1) {
        field2738++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class146.field2319[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg1 >= -86) {
            method1177(-68, (byte) 4);
        }
        return var2 == 1006;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lai;II)V")
    private final void method1178(class88 arg0, int arg1, int arg2) {
        field2720++;
        if (arg1 == 1) {
            this.field2721 = class190.method1279(14210, arg0.method656(arg2 - 252));
        } else if (arg1 == 2) {
            this.field2733 = class190.method1279(arg2 ^ 0x3782, arg0.method656(-252));
        } else if (arg1 == 3) {
            this.field2726 = arg0.method675((byte) 16);
        } else if (arg1 == 4) {
            this.field2734 = arg0.method641(arg2 - 1);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method645(11596);
            this.field2722 = new class39(class89.method685(var4, -1609027472));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method641(-1);
                class166 var7;
                if (arg1 == 5) {
                    var7 = new class244(arg0.method675((byte) 16));
                } else {
                    var7 = new class120(arg0.method641(arg2 - 1));
                }
                this.field2722.method281(1, (long) var6, var7);
            }
        }
        if (arg2 != 0) {
            this.field2733 = 'G';
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLai;)V")
    public final void method1179(boolean arg0, class88 arg1) {
        field2737++;
        if (arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method633(126);
            if (var3 == 0) {
                return;
            }
            this.method1178(arg1, var3, 0);
        }
    }
}
