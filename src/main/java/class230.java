import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class230 {

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3075 = "K";

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Z")
    public static boolean field3076 = false;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    private int field3077;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "Lpo;")
    public static class202 field3073;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BZ)V")
    public static final void method1383(byte arg0, boolean arg1) {
        class38.field534++;
        field3083++;
        class185.field2507.method5(-6445, 147);
        if (arg0 >= -23) {
            field3075 = null;
        }
        for (class169 var2 = (class169) class99.field1377.method389(0); var2 != null; var2 = (class169) class99.field1377.method388(0)) {
            if (!var2.method323((byte) 69)) {
                var2 = (class169) class99.field1377.method389(0);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field2276 == 0) {
                class271.method1864(true, arg1, true, var2);
            }
        }
        if (class211.field2807 != null) {
            class407.method2621(class211.field2807, 15);
            class211.field2807 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V")
    public static final void method1384(int arg0, int arg1) {
        for (class45 var2 = class34.field474.method389(0); var2 != null; var2 = class34.field474.method388(0)) {
            if (((long) arg1) == (var2.field640 >> 48 & 0xFFFFL)) {
                var2.method322(arg0 ^ 0xFFFFA154);
            }
        }
        if (arg0 == -24225) {
            field3080++;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILnj;II)V")
    private final void method1385(int arg0, class228 arg1, int arg2, int arg3) {
        if (arg0 != -3) {
            return;
        }
        field3078++;
        if (arg3 == 1) {
            this.field3077 = arg1.method1343(arg0 + 258);
        } else if (arg3 == 2) {
            this.field3072 = arg1.method1348(-117);
            this.field3081 = arg1.method1348(-104);
            return;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static void method1386(int arg0) {
        field3075 = null;
        field3073 = null;
        if (arg0 != 19) {
            field3075 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Llm;I)V")
    public static final void method1387(class347 arg0, int arg1) {
        class25.field324 = arg0;
        field3079++;
        class240.field3215 = class25.field324.method2272(117, arg1);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)Lup;")
    public final class441 method1388(byte arg0) {
        field3074++;
        class441 var2 = (class441) class420.field6213.method1137((long) this.field3077, 2108653711);
        if (var2 != null) {
            return var2;
        }
        class441 var3 = class441.method2778(class33.field471, this.field3077, 0);
        if (var3 != null) {
            class420.field6213.method1144((long) this.field3077, var3, -3480);
        }
        int var4 = -112 / ((-arg0 - 25) / 52);
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILnj;Z)V")
    public final void method1389(int arg0, class228 arg1, boolean arg2) {
        field3082++;
        while (true) {
            int var4 = arg1.method1348(-117);
            if (var4 == 0) {
                if (arg2) {
                    field3076 = false;
                    return;
                } else {
                    return;
                }
            }
            this.method1385(-3, arg1, arg0, var4);
        }
    }
}
