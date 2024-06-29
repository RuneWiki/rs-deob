import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class105 extends class225 {

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "Lwo;")
    public class52 field1522;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "[I")
    public static int[] field1520 = new int[13];

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "I")
    public static int field1523 = 0;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1524 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "J")
    public static long field1525 = 0L;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)I")
    public static final int method709(int arg0, int arg1) {
        field1521++;
        if (arg1 < 0) {
            return 0;
        }
        if (arg0 != 20225) {
            method711(38);
        }
        class72 var2 = (class72) class8.field145.method384((long) arg1, true);
        if (var2 == null) {
            return class310.method2110(arg1, -122).field6289;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field1038.length; var4++) {
            if (var2.field1038[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class310.method2110(arg1, arg0 - 20115).field6289 - var2.field1038.length);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lwo;)V")
    public class105(class52 arg0) {
        this.field1522 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(CZ)Z")
    public static final boolean method710(char arg0, boolean arg1) {
        field1519++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class451.field6586;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        if (!arg1) {
            field1520 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
    public static void method711(int arg0) {
        if (arg0 != 255) {
            method711(62);
        }
        field1524 = null;
        field1520 = null;
    }
}
