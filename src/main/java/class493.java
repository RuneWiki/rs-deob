import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class493 {

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "[I")
    public static int[] field6916 = new int[14];

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "I")
    public static int field6910 = 999999;

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "Z")
    public static boolean field6918 = false;

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "Z")
    public static boolean field6912 = true;

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "I")
    public int field6915;

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "Ljb;")
    public class192 field6914;

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "[I")
    public int[] field6911;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IZLjava/lang/String;B)I", line = 12)
    public static final int method2984(int arg0, boolean arg1, String arg2, byte arg3) {
        field6913++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg3 < 26) {
            field6918 = false;
        }
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
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
                throw new NumberFormatException();
            }
            if (arg0 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(CI)Z", line = 100)
    public static final boolean method2985(char arg0, int arg1) {
        field6917++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class587.field7990;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return arg1 == 160 ? false : false;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V", line = 141)
    public static void method2986(int arg0) {
        field6916 = null;
        if (arg0 != 128) {
            field6912 = true;
        }
    }
}
