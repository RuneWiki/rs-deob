import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class270 {

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[[I")
    public static int[][] field4203 = new int[104][104];

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field4202 = 20;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Lob;")
    public static class292 field4207;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[[B")
    public static byte[][] field4198;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIBII)V", line = 5)
    public static final void method1945(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = 45 % ((arg2 - 19) / 54);
        field4204++;
        if (class277.field4292 == 1) {
            class87.field1330[class159.field2514 / 100].method59(class128.field2043 - 8, class98.field1625 + -8);
        }
        if (class277.field4292 == 2) {
            class87.field1330[(class159.field2514 / 100) + 4].method59(class128.field2043 - 8, class98.field1625 - 8);
        }
        class328.method2244((byte) -116);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 24)
    public static final void method1946(int arg0) {
        class54.field858 = null;
        field4206++;
        if (arg0 != 20) {
            field4198 = (byte[][]) ((byte[][]) null);
        }
        class184.method1384();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLjava/lang/String;)I", line = 42)
    public static final int method1947(byte arg0, String arg1) {
        field4196++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class319.field4971; var2++) {
            if (arg1.equalsIgnoreCase(class329.field5082[var2])) {
                return var2;
            }
        }
        if (arg0 != 107) {
            field4203 = (int[][]) ((int[][]) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBIII)V", line = 69)
    public static final void method1948(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4201++;
        if (arg1 != -105) {
            field4200 = -78;
        }
        for (int var5 = 0; var5 < class319.field4983; var5++) {
            if ((class260.field4042[var5] + class104.field1758[var5]) > arg3 && (arg3 + arg4) > class260.field4042[var5] && arg2 < (class258.field3981[var5] + class230.field3661[var5]) && (arg2 + arg0) > class230.field3661[var5]) {
                class301.field4734[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 92)
    public static void method1949(int arg0) {
        field4198 = (byte[][]) null;
        field4203 = (int[][]) null;
        if (arg0 == -3) {
            field4207 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BIIII)V", line = 106)
    public static final void method1950(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4199++;
        class4 var5 = class67.method510(arg0 ^ 0x79, 10, arg3);
        var5.method14(24710);
        var5.field20 = arg2;
        var5.field15 = arg4;
        var5.field21 = arg1;
        if (arg0 != 120) {
            field4203 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILja;Lja;B)Lui;", line = 125)
    public static final class266 method1951(int arg0, int arg1, class64 arg2, class64 arg3, byte arg4) {
        field4205++;
        int var5 = 37 / ((arg4 - 20) / 50);
        return class150.method1152(arg2, arg1, 50, arg0) ? class18.method150(105, arg3.method467(arg0, 82, arg1)) : null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V", line = 139)
    public static final void method1952(int arg0, boolean arg1) {
        class312.field4900 = arg0;
        class326.field5060 = 1;
        field4197++;
        class34.field572 = null;
        class14.field268 = -1;
        class196.field3120 = -1;
        class14.field264 = arg1;
        class147.field2371 = 0;
    }
}
