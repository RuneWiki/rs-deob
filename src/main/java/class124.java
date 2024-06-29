import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class124 extends class263 {

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1512 = 0;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "[[I")
    public static int[][] field1517 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Ldr;")
    public static class675 field1511 = new class675(20, -1);

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field1519 = -1;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Lbba;")
    public static class103 field1518 = new class103();

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lkp;")
    public static class456 field1520 = new class456();

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "Lra;")
    public static class98 field1521 = new class98();

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lcga;")
    public class449 field1513;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lufa;")
    public static class637 field1510;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lqf;")
    public class638 field1516;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 4)
    public static void method824(byte arg0) {
        if (arg0 > -73) {
            field1518 = null;
        }
        field1520 = null;
        field1518 = null;
        field1517 = null;
        field1511 = null;
        field1521 = null;
        field1510 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V", line = 23)
    public final void method825(boolean arg0) {
        field1508++;
        if (class340.field4346 < class504.field6294.length) {
            if (arg0) {
                method824((byte) -106);
            }
            class504.field6294[class340.field4346++] = this;
        }
    }
}
