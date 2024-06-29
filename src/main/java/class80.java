import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class80 extends class182 {

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "Z")
    public boolean field1483 = false;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static volatile int field1470 = 0;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "[Lfe;")
    public static class52[] field1473 = new class52[4];

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "Lsg;")
    public static class169 field1479 = class165.method1060("cross", 1536);

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field1482 = 1;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "Lsg;")
    public static class169 field1476 = class165.method1060(" x ", 1536);

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "[S")
    public static short[] field1481;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "[[S")
    public static short[][] field1474;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIB)I")
    public static final int method487(int arg0, int arg1, byte arg2) {
        if (arg2 >= -57) {
            return 25;
        }
        int var3 = 0;
        while (arg0 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg1 >>>= 0x1;
            arg0--;
        }
        field1471++;
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
    public static void method488(int arg0) {
        field1474 = null;
        field1473 = null;
        field1476 = null;
        field1481 = null;
        field1479 = null;
        if (arg0 >= -37) {
            method488(38);
        }
    }
}
