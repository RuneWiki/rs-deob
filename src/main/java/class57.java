import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lfc;")
    public static class39 field1411 = class90.method774("", -113);

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lfc;")
    public static class39 field1419 = class90.method774("Mitteilung", -104);

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1414 = 0;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1417 = -1;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lfc;")
    public static class39 field1412 = class90.method774("headicons_hint", -117);

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Z")
    public static volatile boolean field1421 = false;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[[I")
    public static int[][] field1422 = new int[104][104];

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lfc;")
    private static class39 field1423 = class90.method774("Remove", -122);

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lfc;")
    public static class39 field1420 = field1423;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1413 = 0;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lmf;")
    public static class89 field1416;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lmf;")
    public static class89 field1418;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V", line = 29)
    public static void method582(boolean arg0) {
        field1422 = null;
        field1423 = null;
        if (!arg0) {
            method583((byte) 22, 31);
        }
        field1419 = null;
        field1420 = null;
        field1411 = null;
        field1412 = null;
        field1418 = null;
        field1416 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)I", line = 58)
    public static final int method583(byte arg0, int arg1) {
        if (arg0 < 42) {
            return -46;
        }
        field1415++;
        class43 var2 = class137.method1112(-1, arg1);
        int var3 = var2.field1158;
        int var4 = var2.field1178;
        int var5 = var2.field1168;
        int var6 = class14.field362[var4 - var5];
        return var6 & class110.field2834[var3] >> var5;
    }
}
