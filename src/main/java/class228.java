import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class228 {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3602 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3604 = null;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3603 = 0;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "S")
    public static short field3607 = 1;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "[I")
    public static int[] field3608 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Lqn;")
    public class233 field3609;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "[I")
    public int[] field3600;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 12)
    public static void method1513(int arg0) {
        field3608 = null;
        if (arg0 == 128) {
            field3602 = null;
            field3604 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Ltf;", line = 32)
    public static final class112 method1514(int arg0) {
        field3610++;
        if (arg0 != 3) {
            field3602 = (String) null;
        }
        class112 var1;
        if (class249.field3893) {
            var1 = new class314(class194.field3127, class321.field4891, class80.field1572[0], class27.field530[0], class28.field537[0], class176.field2833[0], class254.field3968[0], class274.field4202);
        } else {
            var1 = new class113(class194.field3127, class321.field4891, class80.field1572[0], class27.field530[0], class28.field537[0], class176.field2833[0], class254.field3968[0], class274.field4202);
        }
        class97.method644((byte) 95);
        return var1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)C", line = 61)
    public static final char method1515(int arg0, byte arg1) {
        field3598++;
        int var2 = arg1 & 0xFF;
        if (arg0 == var2) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class194.field3129[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IC)Z", line = 99)
    public static final boolean method1516(int arg0, char arg1) {
        if (arg0 != 160) {
            field3604 = (String) null;
        }
        field3597++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class194.field3129;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }
}
