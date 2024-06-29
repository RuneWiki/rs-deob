import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class93 extends class170 {

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field1478 = 0;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "Lsc;")
    private static class181 field1480 = class149.method967(255, "Connecting to update server");

    @OriginalMember(owner = "client!p", name = "M", descriptor = "[I")
    public static int[] field1471 = new int[50];

    @OriginalMember(owner = "client!p", name = "S", descriptor = "Lsc;")
    public static class181 field1477 = field1480;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "J")
    public static long field1475;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "Lsc;")
    public class181 field1482;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "Lbe;")
    public static class218 field1479;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "[[S")
    public static short[][] field1476;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLvf;)V")
    public final void method614(byte arg0, class230 arg1) {
        field1473++;
        while (true) {
            int var3 = arg1.method1516((byte) 82);
            if (var3 == 0) {
                int var4 = 122 % ((arg0 - 71) / 38);
                return;
            }
            this.method617(-116, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    public static void method615(int arg0) {
        field1479 = null;
        field1471 = null;
        if (arg0 != 1) {
            method615(110);
        }
        field1477 = null;
        field1476 = null;
        field1480 = null;
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)Z")
    public final boolean method616(int arg0) {
        field1481++;
        int var2 = -33 % (arg0 / 38);
        return this.field1472 == 115;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILvf;I)V")
    private final void method617(int arg0, class230 arg1, int arg2) {
        field1474++;
        if (arg0 != -116) {
            this.field1482 = null;
        }
        if (arg2 == 1) {
            this.field1472 = arg1.method1516((byte) 82);
        } else if (arg2 == 2) {
            this.field1483 = arg1.method1529(-32494);
            return;
        } else if (arg2 == 5) {
            this.field1482 = arg1.method1549(28);
            return;
        }
    }
}
