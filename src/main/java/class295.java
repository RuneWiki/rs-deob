import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class295 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "[S")
    public static short[] field4252 = new short[256];

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lfj;")
    public static class399 field4254 = null;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static volatile int field4256 = 0;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lwe;")
    public static class24 field4257 = new class24(50);

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4258 = "Connecting to update server";

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1880(int arg0) {
        field4258 = null;
        field4252 = null;
        field4254 = null;
        field4257 = null;
        int var1 = -125 % ((20 - arg0) / 57);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1881(byte arg0, String arg1) {
        field4253++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class446.method2806(arg1.charAt(var2), (byte) 54)) {
            var2++;
        }
        while (var3 > var2 && class446.method2806(arg1.charAt(var3 - 1), (byte) 77)) {
            var3--;
        }
        if (arg0 < 29) {
            field4256 = 82;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class408.method2655(var7, 0)) {
                char var8 = class19.method157(var7, 376);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static final void method1882(int arg0) {
        int var1 = 44 % ((arg0 + 68) / 32);
        field4255++;
        class186.method1156();
    }
}
