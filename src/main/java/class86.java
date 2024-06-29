import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class86 extends class125 {

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "Loa;")
    public static class99 field1484 = null;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "Loa;")
    public static class99 field1481 = class221.method1463(2844, "");

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "[I")
    public static int[] field1483 = new int[32];

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "Loa;")
    public static class99 field1488 = class221.method1463(2844, "Objet d(Wabonn-Bs");

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "Loa;")
    public static class99 field1489 = class221.method1463(2844, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "Loa;")
    public static class99 field1487 = class221.method1463(2844, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "B")
    public byte field1485;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "J")
    public static long field1486;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "Loa;")
    public class99 field1479;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "Loa;")
    public class99 field1480;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V")
    public static void method584(byte arg0) {
        field1483 = null;
        if (arg0 != 6) {
            field1484 = null;
        }
        field1489 = null;
        field1481 = null;
        field1484 = null;
        field1487 = null;
        field1488 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
    public static final int method585(int arg0, int arg1) {
        int var2 = arg0;
        field1482++;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 = arg0 + 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }
}
