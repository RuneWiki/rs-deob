import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class139 {

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "Lbv;")
    public static class567 field2191 = new class567("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field2192 = -1;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "Z")
    public static boolean field2195 = false;

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "I")
    public static int field2196 = 500;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "Lpp;")
    public static class464 field2194 = new class464(11, -1);

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "Lkk;")
    public static class149 field2188;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field2193;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lhn;II)V", line = 5)
    public static final void method1044(class85 arg0, int arg1, int arg2) {
        field2190++;
        if (arg2 != -26587) {
            field2193 = null;
        }
        int var3 = -1;
        int var4 = 0;
        if (class310.field4553 < arg0.field1527) {
            class191.method1268(arg0, (byte) -49);
        } else if (arg0.field1524 < class310.field4553) {
            class215.method1457((byte) 85, arg0, false);
            var3 = class580.field8260;
            var4 = class393.field5886;
        } else {
            class109.method917(arg0, arg2 ^ 0x67A6);
        }
        if (arg0.field5108 < 128 || arg0.field5109 < 128 || (class146.field2247 * 128 - 128) <= arg0.field5108 || class66.field990 * 128 - 128 <= arg0.field5109) {
            arg0.field1487 = -1;
            var4 = 0;
            arg0.field1527 = 0;
            var3 = -1;
            arg0.field1524 = 0;
            arg0.field1520 = -1;
            arg0.field1514 = -1;
            arg0.field5108 = arg0.field1571[0] * 128 + arg0.method781((byte) 91) * 64;
            arg0.field5109 = arg0.field1572[0] * 128 + arg0.method781((byte) 39) * 64;
            arg0.method786(28);
        }
        if (class644.field9367 == arg0 && (arg0.field5108 < 1536 || arg0.field5109 < 1536 || (class146.field2247 - 12) * 128 <= arg0.field5108 || arg0.field5109 >= (class66.field990 * 128 - 1536))) {
            arg0.field1487 = -1;
            arg0.field1520 = -1;
            arg0.field1527 = 0;
            var3 = -1;
            var4 = 0;
            arg0.field1524 = 0;
            arg0.field1514 = -1;
            arg0.field5108 = arg0.field1571[0] * 128 + (arg0.method781((byte) -98) * 64);
            arg0.field5109 = arg0.field1572[0] * 128 + (arg0.method781((byte) -111) * 64);
            arg0.method786(-88);
        }
        int var5 = class381.method2316(arg0, 16383);
        class461.method2698(arg0, var5, -24469, var4, var3);
        class95.method836(arg0, (byte) -70);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 68)
    public static final int method1045(boolean arg0, String arg1) {
        field2189++;
        for (int var2 = 0; var2 < class130.field2115.length; var2++) {
            if (class130.field2115[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        if (!arg0) {
            method1046(-121);
        }
        return -1;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V", line = 90)
    public static void method1046(int arg0) {
        field2193 = null;
        field2191 = null;
        field2188 = null;
        if (arg0 != 0) {
            method1045(true, null);
        }
        field2194 = null;
    }
}
