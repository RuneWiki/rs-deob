import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class103 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1657 = new String[200];

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Z")
    public static boolean field1660 = false;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method741(int arg0, int arg1) {
        field1659++;
        if (arg0 == 100 && class314.field5004 > 0) {
            byte[] var2 = class230.field3730[--class314.field5004];
            class230.field3730[class314.field5004] = null;
            return var2;
        } else if (arg0 == 5000 && class119.field1911 > 0) {
            byte[] var3 = class310.field4965[--class119.field1911];
            class310.field4965[class119.field1911] = null;
            return var3;
        } else {
            if (arg1 != 0) {
                field1658 = -128;
            }
            if (arg0 == 30000 && class67.field1120 > 0) {
                byte[] var4 = class32.field473[--class67.field1120];
                class32.field473[class67.field1120] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method742(int arg0) {
        field1657 = null;
        int var1 = 26 % ((arg0 - 14) / 42);
    }
}
