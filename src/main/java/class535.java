import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class535 {

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "Lgd;")
    public static class308 field7504 = new class308(8);

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "[[Ljava/lang/String;")
    public static String[][] field7507 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field7508 = -1;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "Lpu;")
    public static class522 field7511;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "[[Z")
    public static boolean[][] field7505;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V")
    public static void method3043(boolean arg0) {
        field7507 = null;
        field7505 = null;
        field7504 = null;
        field7511 = null;
        if (arg0) {
            method3045(-35, null, true, (byte) 31);
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(Z)Llt;")
    public static final class627 method3044(boolean arg0) {
        if (!arg0) {
            field7505 = null;
        }
        field7512++;
        if (class25.field346 == null || class192.field2780 == null) {
            return null;
        }
        class192.field2780.method1205(-63, class25.field346);
        class627 var1 = (class627) class192.field2780.method1202(6);
        if (var1 == null) {
            return null;
        } else {
            class588 var2 = class25.field339.method812((byte) 68, var1.field8781);
            return var2 != null && var2.field8259 && var2.method3329(34379, class25.field338) ? var1 : class655.method3611((byte) 120);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILjava/lang/String;ZB)Z")
    public static final boolean method3045(int arg0, String arg1, boolean arg2, byte arg3) {
        field7510++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg3 != 39) {
            field7507 = null;
        }
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg0 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }
}
