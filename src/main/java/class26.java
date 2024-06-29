import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class26 extends class681 {

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "Liv;")
    public static class100 field469 = new class100("RC", 1);

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "Lde;")
    public static class534 field470 = new class534(32);

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "[Lno;")
    public static class704[] field472 = new class704[128];

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field474 = -1;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method178(String arg0, int arg1) {
        field466++;
        if (arg1 != 70) {
            method180(95, null);
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && (var4 + 2) < var3) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + '\n' - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + '\n' - 65;
                }
                int var9 = var8 * 16;
                char var10 = arg0.charAt(var4 + 2);
                int var11;
                if (var10 >= '0' && var10 <= '9') {
                    var11 = var10 + var9 - '0';
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var9 + 10 - (97 - var10);
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 + 10 - 65;
                }
                var4 += 2;
                if (var11 != 0 && class322.method1891((byte) var11, 13)) {
                    var2.append(class534.method3078(255, (byte) var11));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
    public static void method179(byte arg0) {
        field470 = null;
        field472 = null;
        field469 = null;
        if (arg0 <= 92) {
            field473 = 93;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method180(int arg0, String arg1) {
        field467++;
        if (!class726.field10121.field6256) {
            return -1;
        } else if (class551.field7694.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class644.method3617(false, arg1);
            if (var2 == null) {
                return -1;
            }
            String var3 = class144.field2035 + var2;
            if (!class317.field4110.method3168("", var3, -1)) {
                return -1;
            } else if (class317.field4110.method3156(true, var3)) {
                byte[] var4 = class317.field4110.method3158(var3, (byte) 107, "");
                if (arg0 > -102) {
                    return -61;
                }
                Object var5 = null;
                File var6;
                try {
                    var6 = class664.method3745(var2, 0);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class380.method2170((byte) -12, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class726.field10121.method2654(var6, 0, var4);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class592.method3355(var6, (byte) -67, arg1);
                return 100;
            } else {
                return class317.field4110.method3152((byte) 94, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public static final void method181(int arg0) {
        if (arg0 != 16) {
            field473 = 105;
        }
        field468++;
        for (class729 var1 = (class729) class757.field10565.method3672(-1); var1 != null; var1 = (class729) class757.field10565.method3662(-1)) {
            class138.method1014(arg0 - 65, var1, false);
        }
        for (class729 var2 = (class729) class719.field10016.method3672(-1); var2 != null; var2 = (class729) class719.field10016.method3662(-1)) {
            class138.method1014(64, var2, true);
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(I)V")
    public class26(int arg0) {
        this.field471 = arg0;
    }
}
