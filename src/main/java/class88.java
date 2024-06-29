import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class88 {

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lur;")
    public class355 field1118;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "S")
    public short field1119;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "B")
    public byte field1114;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "B")
    public byte field1117;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lmq;")
    public static class78 field1113 = new class78(116, 1);

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field1122 = 0;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "D")
    public static double field1116;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "J")
    public static long field1120;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Lkha;")
    public static class687 field1123;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[Lac;")
    public static class712[] field1115;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method614(int arg0) {
        if (arg0 < 48) {
            field1120 = -29L;
        }
        field1113 = null;
        field1123 = null;
        field1115 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLaca;)I")
    public static final int method615(byte arg0, class580 arg1) {
        if (arg0 != -42) {
            return -61;
        }
        field1112++;
        if (class489.field6953 == arg1) {
            return 9216;
        } else if (class537.field7542 == arg1) {
            return 34065;
        } else if (class418.field5950 == arg1) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lur;III)V")
    public class88(class355 arg0, int arg1, int arg2, int arg3) {
        this.field1118 = arg0;
        this.field1119 = (short) arg1;
        this.field1114 = (byte) arg2;
        this.field1117 = (byte) arg3;
    }
}
