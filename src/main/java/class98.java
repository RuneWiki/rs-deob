import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class98 {

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1442 = -1;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[I")
    public static int[] field1444 = new int[8];

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lsi;")
    public static class204 field1443;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lsi;")
    public static class204 field1448;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method754(byte arg0) {
        field1443 = null;
        if (arg0 > -7) {
            method754((byte) -113);
        }
        field1448 = null;
        field1444 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
    public static final int method755(int arg0, int arg1) {
        field1441++;
        if (arg0 != -18002) {
            return -114;
        }
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }
}
