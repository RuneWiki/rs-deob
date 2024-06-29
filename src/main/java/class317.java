import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class317 extends class170 {

    @OriginalMember(owner = "client!si", name = "j", descriptor = "S")
    public static short field4921 = 256;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field4923 = 0;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field4926 = 3;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Lmj;")
    public static class230 field4922 = new class230();

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field4929 = 0;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "Lcl;")
    public static class132 field4928 = new class132();

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Lek;")
    public static class184 field4925;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "[Lwk;")
    public static class175[] field4927;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZILjava/lang/String;B)Z", line = 26)
    public static final boolean method2174(boolean arg0, int arg1, String arg2, byte arg3) {
        field4924++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 0;
        boolean var5 = false;
        if (arg3 != 84) {
            method2174(false, -108, (String) null, (byte) -14);
        }
        boolean var6 = false;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var6 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
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
            if (arg1 <= var11) {
                return false;
            }
            if (var6) {
                var11 = -var11;
            }
            int var10 = arg1 * var4 + var11;
            if ((var10 / arg1) != var4) {
                return false;
            }
            var5 = true;
            var4 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V", line = 100)
    public static void method2175(int arg0) {
        field4927 = null;
        field4925 = null;
        field4928 = null;
        if (arg0 != 97) {
            method2174(true, 37, (String) null, (byte) 104);
        }
        field4922 = null;
    }
}
