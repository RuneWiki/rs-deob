import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class229 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3467 = 0;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3468 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Z")
    public static boolean field3472 = true;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Lkc;")
    public static class29 field3473;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "[I")
    public static int[] field3469;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 7)
    public static void method1709(int arg0) {
        if (arg0 == 30) {
            field3473 = null;
            field3469 = null;
            field3468 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lek;", line = 25)
    public static final class240 method1710(Throwable arg0, String arg1) {
        field3474++;
        class240 var2;
        if ((arg0 instanceof class240)) {
            var2 = (class240) arg0;
            var2.field3572 = var2.field3572 + ' ' + arg1;
        } else {
            var2 = new class240(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BZ)V", line = 42)
    public static final void method1711(byte arg0, boolean arg1) {
        class32.method228(0);
        field3470++;
        if (class194.field2819 != 30 && class194.field2819 != 25) {
            return;
        }
        class169.field2426++;
        if (class169.field2426 < 50 && !arg1) {
            return;
        }
        class169.field2426 = 0;
        if (!class313.field4658 && class67.field973 != null) {
            class107.field1533.method1915(true, 122);
            try {
                class67.field973.method1558(5000, class107.field1533.field2718, 0, class107.field1533.field2776);
                class107.field1533.field2776 = 0;
            } catch (IOException var3) {
                class313.field4658 = true;
            }
            class263.field4002++;
        }
        class32.method228(0);
        if (arg0 < 79) {
            method1712((byte) -79, (String) null, false);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 82)
    public static final void method1712(byte arg0, String arg1, boolean arg2) {
        field3471++;
        if (arg1 == null) {
            return;
        }
        if (class255.field3810 >= 100) {
            class28.method177(class288.field4359, -19420);
            return;
        }
        String var3 = class19.method117(20563, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class255.field3810; var4++) {
            String var5 = class19.method117(20563, class192.field2806[var4]);
            if (var5 != null && var5.equals(var3)) {
                class28.method177(arg1 + class21.field328, -19420);
                return;
            }
            if (class170.field2455[var4] != null) {
                String var6 = class19.method117(20563, class170.field2455[var4]);
                if (var6 != null && var6.equals(var3)) {
                    class28.method177(arg1 + class21.field328, -19420);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < class110.field1608; var7++) {
            String var8 = class19.method117(20563, class109.field1585[var7]);
            if (var8 != null && var8.equals(var3)) {
                class28.method177(class342.field5281 + arg1 + class85.field1197, -19420);
                return;
            }
            if (class50.field761[var7] != null) {
                String var9 = class19.method117(20563, class50.field761[var7]);
                if (var9 != null && var9.equals(var3)) {
                    class28.method177(class342.field5281 + arg1 + class85.field1197, -19420);
                    return;
                }
            }
        }
        if (class19.method117(20563, class1.field55.field3453).equals(var3)) {
            class28.method177(class154.field2206, -19420);
            return;
        }
        class107.field1533.method1915(true, 26);
        class107.field1533.method1355((byte) -126, class225.method1646(-105, arg1) + 1);
        class107.field1533.method1343(arg1, 0);
        class110.field1605++;
        if (arg0 <= -109) {
            class107.field1533.method1355((byte) -127, arg2 ? 1 : 0);
        }
    }
}
