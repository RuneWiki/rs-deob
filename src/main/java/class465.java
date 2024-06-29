import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class465 {

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field6842 = 127;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "[I")
    public static int[] field6846 = new int[50];

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "Z")
    public static boolean field6847 = false;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "Lpf;")
    public static class425 field6851 = new class425(61, 2);

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "[S")
    public static short[] field6852 = new short[256];

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "Liq;")
    public static class134 field6841;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "Lbl;")
    public static class211 field6838;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "Lhc;")
    public static class281 field6850;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILiq;)I")
    public static final int method2863(int arg0, class134 arg1) {
        field6844++;
        int var2 = arg0;
        if (arg1.method822(arg0 - 85, class169.field2424)) {
            var2 = arg0 + 1;
        }
        if (arg1.method822(-73, class338.field5047)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)I")
    public static final int method2864(int arg0, int arg1, int arg2) {
        field6840++;
        if (arg0 == 1 || arg0 == 3) {
            return class82.field1093[arg1 & 0x3];
        } else {
            if (arg2 != 2767) {
                method2867(80, -7);
            }
            return class257.field3951[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZ)V")
    public static final void method2865(int arg0, boolean arg1) {
        if (arg0 != 127) {
            return;
        }
        for (class71 var2 = (class71) class451.field6638.method2514((byte) 61); var2 != null; var2 = (class71) class451.field6638.method2511(32)) {
            if (var2.field919 != null) {
                class267.field4077.method2135(var2.field919);
                var2.field919 = null;
            }
            if (var2.field916 != null) {
                class267.field4077.method2135(var2.field916);
                var2.field916 = null;
            }
            var2.method625((byte) -50);
        }
        field6848++;
        if (!arg1) {
            return;
        }
        for (class71 var3 = (class71) class281.field4298.method2514((byte) 61); var3 != null; var3 = (class71) class281.field4298.method2511(51)) {
            if (var3.field919 != null) {
                class267.field4077.method2135(var3.field919);
                var3.field919 = null;
            }
            var3.method625((byte) -50);
        }
        for (class71 var4 = (class71) class466.field6858.method2296(5773); var4 != null; var4 = (class71) class466.field6858.method2304(100)) {
            if (var4.field919 != null) {
                class267.field4077.method2135(var4.field919);
                var4.field919 = null;
            }
            var4.method625((byte) -50);
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(III)I")
    public static final int method2866(int arg0, int arg1, int arg2) {
        if (arg0 != 25570) {
            return 62;
        }
        field6843++;
        int var3 = class1.method13(arg2 - 1, (byte) -80, arg1 - 1) - (-class1.method13(arg2 - 1, (byte) -89, arg1 + 1) - class1.method13(arg2 + 1, (byte) -78, arg1 - 1) - class1.method13(arg2 + 1, (byte) -102, arg1 + 1));
        int var4 = class1.method13(arg2, (byte) -99, arg1 - 1) + class1.method13(arg2, (byte) -98, arg1 + 1) + (class1.method13(arg2 + -1, (byte) -58, arg1) - -class1.method13(arg2 - -1, (byte) -49, arg1));
        int var5 = class1.method13(arg2, (byte) -35, arg1);
        return var5 / 4 + (var3 / 16 + (var4 / 8));
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
    public static final void method2867(int arg0, int arg1) {
        if (arg0 == 25882) {
            field6839++;
            class319.field4812.method1481(arg0 - 25879, arg1);
            class87.field1234.method1481(3, arg1);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BI)V")
    public static final void method2868(byte arg0, int arg1) {
        field6845++;
        if (class398.field5948 == arg1) {
            return;
        }
        class115.field1522 = class198.field3004 = class426.field6268[arg1];
        class196.field2965.method350(50, (int) ((double) class115.field1522 * 34.46D));
        class310.field4666 = new int[4][class115.field1522 >> 3][class198.field3004 >> 3];
        class99.field1363 = new int[class115.field1522][class198.field3004];
        class119.field1571 = new int[class115.field1522][class198.field3004];
        for (int var2 = 0; var2 < 4; var2++) {
            class449.field6599[var2] = class375.method2262((byte) -33, class198.field3004, class115.field1522);
        }
        class75.field1016 = new byte[4][class115.field1522][class198.field3004];
        class432.method2652((byte) 73, class198.field3004, class115.field1522, 4);
        class312.method1905(class198.field3004 >> 3, class196.field2965, 1, class115.field1522 >> 3);
        if (arg0 >= -125) {
            method2868((byte) 37, 54);
        }
        class398.field5948 = arg1;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static void method2869(int arg0) {
        if (arg0 != 24785) {
            method2867(-16, -26);
        }
        field6851 = null;
        field6850 = null;
        field6838 = null;
        field6841 = null;
        field6852 = null;
        field6846 = null;
    }
}
