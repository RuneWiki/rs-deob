import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class118 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "B")
    private byte field1435;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Llg;")
    public static class237 field1442 = new class237(8);

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Llg;")
    public static class237 field1443 = new class237(16);

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1444 = 1;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "[[I")
    public static int[][] field1446 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 7)
    public static void method729(byte arg0) {
        field1446 = null;
        field1443 = null;
        if (arg0 > 58) {
            field1442 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I", line = 24)
    public final int method730(int arg0) {
        if (arg0 != 8532) {
            method729((byte) -36);
        }
        field1438++;
        return this.field1435 & 0x7;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I", line = 39)
    public final int method731(int arg0) {
        if (arg0 < 25) {
            return 16;
        } else {
            field1436++;
            return (this.field1435 & 0x8) == 8 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 52)
    public class118() {
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ldg;)V", line = 54)
    public class118(class236 arg0) {
        this.field1435 = arg0.method1589(false);
        this.field1440 = arg0.method1617((byte) 48);
        this.field1437 = arg0.method1597(3641);
        this.field1434 = arg0.method1597(3641);
        this.field1441 = arg0.method1597(3641);
        this.field1439 = arg0.method1597(3641);
    }
}
