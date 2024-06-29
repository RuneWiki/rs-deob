import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class88 extends class83 {

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1568 = "glow3:";

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "[I")
    public static int[] field1575 = new int[100];

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "B")
    public byte field1567;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "Llk;")
    public static class174 field1572;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "Leb;")
    public static class34 field1571;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Ljava/lang/String;")
    public String field1570;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Ljava/lang/String;")
    public String field1574;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "[[[B")
    public static byte[][][] field1566;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
    public static void method572(boolean arg0) {
        field1572 = null;
        field1566 = null;
        field1575 = null;
        field1568 = null;
        if (!arg0) {
            method575(38, -40, -48, 41);
        }
        field1571 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
    public static final void method573(int arg0, int arg1) {
        class213.field3583 = arg1;
        if (arg0 > -97) {
            method574((String) null, 98);
        }
        class248.field4084 = -1;
        class248.field4084 = -1;
        class27.method180((byte) -93);
        field1577++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method574(String arg0, int arg1) {
        field1569++;
        return arg1 == 10 ? class272.method1788(arg0, true, 10, (byte) 127) : false;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(IIII)V")
    public static final void method575(int arg0, int arg1, int arg2, int arg3) {
        String var4 = "::tele " + arg0 + "," + (arg3 >> 6) + "," + (arg1 >> 6) + "," + (arg3 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        field1573++;
        class188.method1227((byte) 99, var4);
        if (arg2 != -9225) {
            method575(-44, 82, -21, -96);
        }
    }
}
