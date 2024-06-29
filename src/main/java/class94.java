import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class94 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1598 = -1;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1600 = "Cancel";

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1607 = "flash3:";

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lpe;")
    public static class252 field1604;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "[I")
    public static int[] field1601;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[[Z")
    public static boolean[][] field1605;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method708(int arg0) {
        field1600 = null;
        field1601 = null;
        field1605 = null;
        field1604 = null;
        int var1 = 68 / ((arg0 + 53) / 36);
        field1607 = null;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public static final void method709(int arg0) {
        if (arg0 != -1) {
            field1604 = null;
        }
        field1602++;
        class231.field3670.method1898((byte) 112);
    }
}
