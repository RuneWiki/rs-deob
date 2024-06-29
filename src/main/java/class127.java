import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class127 {

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "Luf;")
    public static class310 field1734;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "[[S")
    public static short[][] field1737;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "Ljm;")
    public static class485 field1736;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "[I")
    public static int[] field1735;

    static {
        new class83("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field1734 = new class310(62, 8);
        field1737 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field1736 = new class485(73, 3);
        field1739 = -1;
        field1740 = 0;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)[B", line = 4)
    public static final synchronized byte[] method835(int arg0, int arg1) {
        field1733++;
        if (arg0 != 1701) {
            return null;
        } else if (arg1 == 100 && class89.field1215 > 0) {
            byte[] var2 = class361.field4952[--class89.field1215];
            class361.field4952[class89.field1215] = null;
            return var2;
        } else if (arg1 == 5000 && class180.field2539 > 0) {
            byte[] var3 = class497.field7323[--class180.field2539];
            class497.field7323[class180.field2539] = null;
            return var3;
        } else if (arg1 == 30000 && class239.field3288 > 0) {
            byte[] var4 = class456.field6667[--class239.field3288];
            class456.field6667[class239.field3288] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V", line = 42)
    public static void method836(byte arg0) {
        field1736 = null;
        field1734 = null;
        field1737 = null;
        if (arg0 != 125) {
            method836((byte) 92);
        }
        field1735 = null;
    }
}
