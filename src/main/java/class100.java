import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class100 {

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "[Lc;")
    public static class320[] field1523 = new class320[2048];

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field1525 = new String[100];

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1528 = "K";

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field1530 = 0;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Lao;")
    public static class194 field1527;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[[[B")
    public static byte[][][] field1520;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZIII)V", line = 23)
    public static final void method706(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class258.field4081 == 1) {
            class336.field5217[class233.field3728 / 100].method84(class231.field3699 - 8, class8.field91 + -8);
        }
        if (class258.field4081 == 2) {
            class336.field5217[class233.field3728 / 100 + 4].method84(class231.field3699 - 8, class8.field91 + -8);
        }
        if (arg1) {
            method706(62, false, -124, 125, -36);
        }
        class319.method2219((byte) 4);
        field1529++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lhh;IZ)V", line = 50)
    public static final void method707(class224 arg0, int arg1, boolean arg2) {
        field1524++;
        int var3 = arg0.field3564;
        int var4 = (int) arg0.field916;
        int var5 = 14 / ((65 - arg1) / 41);
        arg0.method465((byte) -122);
        if (arg2) {
            class206.method1510(-1, var3);
        }
        class148.method1035(var3, 121502384);
        class160 var6 = class37.method238((byte) 84, var4);
        if (var6 != null) {
            class219.method1600(var6, 114);
        }
        int var7 = class126.field1887;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class224.method1642(class50.field686[var8], (byte) 124)) {
                class215.method1570(var8, (byte) -37);
            }
        }
        if (class126.field1887 == 1) {
            class19.field274 = false;
            class325.method2260(class181.field2932, -12886, class86.field1297, class12.field136, class333.field5166);
        } else {
            class325.method2260(class181.field2932, -12886, class86.field1297, class12.field136, class333.field5166);
            int var9 = class55.field732.method995(class188.field3062);
            for (int var10 = 0; var10 < class126.field1887; var10++) {
                int var11 = class55.field732.method995(class93.method675(var10, true));
                if (var11 > var9) {
                    var9 = var11;
                }
            }
            class12.field136 = class126.field1887 * 15 + (class119.field1827 ? 26 : 22);
            class181.field2932 = var9 + 8;
        }
        if (class246.field3904 != -1) {
            class125.method864(class246.field3904, 1, -1);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 120)
    public static void method708(int arg0) {
        field1527 = null;
        field1525 = null;
        if (arg0 != 0) {
            method707((class224) null, -34, false);
        }
        field1528 = null;
        field1520 = (byte[][][]) null;
        field1523 = null;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 138)
    public static final void method709(int arg0) {
        field1526++;
        int var1 = -72 / ((-arg0 - 70) / 41);
        class35.field474.method1623(1);
        class225.field3576.method1623(1);
    }
}
