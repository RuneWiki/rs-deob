import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class306 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field4951 = -1;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "[I")
    public static int[] field4955 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field4957 = 0;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Luj;")
    public static class132 field4952 = new class132(8);

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field4958 = 0;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[B")
    public static byte[] field4956;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method2071(byte arg0) {
        if (arg0 < 86) {
            field4955 = null;
        }
        field4952 = null;
        field4955 = null;
        field4956 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static final void method2072(int arg0) {
        field4950++;
        class110.field1823.method97(120);
        class31.field518.method97(92);
        if (arg0 > 100) {
            class228.field3853.method97(82);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIBI)V")
    public static final void method2073(int arg0, int arg1, byte arg2, int arg3) {
        field4954++;
        if (arg2 != 9) {
            field4958 = 106;
        }
        String var4 = "::tele " + arg0 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class189.method1359(var4, false);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2074(byte arg0, String arg1) {
        field4953++;
        int var2 = 96 / ((arg0 + 16) / 62);
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }
}
