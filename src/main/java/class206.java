import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class206 {

    @OriginalMember(owner = "client!me", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3183 = new String[] { method1829(method1828("\n\u0000\u0010^<O")), method1829(method1828("\n\u0000\u0010_<O")), method1829(method1828("\n\u0000\u0010Y<O")), method1829(method1828("\t\u0010R`")), method1829(method1828("\n\u0000\u0010X<O")), method1829(method1828("\u001cK\u0010\"\u0002")), method1829(method1828("\n\u0000\u0010]<O")) };

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lbda;")
    public static class531 field3175 = new class531();

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "J")
    public long field3177;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lme;")
    public class206 field3179;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Lme;")
    public class206 field3180;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lpb;")
    public static class681 field3178;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Z", line = 3)
    public final boolean method1823(int arg0) {
        try {
            field3182++;
            if (arg0 == 0) {
                return this.field3179 != null;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3183[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V", line = 24)
    public final void method1824(int arg0) {
        try {
            field3176++;
            if (this.field3179 != null) {
                this.field3179.field3180 = this.field3180;
                this.field3180.field3179 = this.field3179;
                if (arg0 != 1) {
                    this.method1824(21);
                }
                this.field3180 = null;
                this.field3179 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3183[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([II[IIILkd;)Ltd;", line = 44)
    public static final class478 method1825(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, class296 arg5) {
        try {
            field3181++;
            if (arg4 != 1) {
                method1825(null, 110, null, -84, 115, null);
            }
            if (!arg5.method855(class157.field1952, class667.field9691, -331365768)) {
                int[] var10 = new int[arg1 * arg3];
                for (int var11 = 0; var11 < arg1; var11++) {
                    int var12 = arg3 * var11 + arg2[var11];
                    for (int var13 = 0; var13 < arg0[var11]; var13++) {
                        var10[var12++] = -16777216;
                    }
                }
                return new class478(arg5, arg3, arg1, var10);
            }
            byte[] var6 = new byte[arg1 * arg3];
            for (int var7 = 0; var7 < arg1; var7++) {
                int var8 = arg3 * var7 + arg2[var7];
                for (int var9 = 0; var9 < arg0[var7]; var9++) {
                    var6[var8++] = -1;
                }
            }
            return new class478(arg5, arg3, arg1, var6);
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field3183[4] + (arg0 == null ? field3183[3] : field3183[5]) + ',' + arg1 + ',' + (arg2 == null ? field3183[3] : field3183[5]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field3183[3] : field3183[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V", line = 101)
    public static void method1826(int arg0) {
        try {
            if (arg0 == 1) {
                field3178 = null;
                field3175 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3183[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 117)
    public static final void method1827(String arg0, int arg1) {
        try {
            field3174++;
            if (arg0 != null) {
                if (arg1 != -21916) {
                    field3175 = null;
                }
                if (arg0.startsWith("*")) {
                    arg0 = arg0.substring(1);
                }
                String var2 = class727.method5306((byte) -127, arg0);
                if (var2 != null) {
                    for (int var3 = 0; var3 < class157.field1960; var3++) {
                        String var4 = class54.field598[var3];
                        if (var4.startsWith("*")) {
                            var4 = var4.substring(1);
                        }
                        String var5 = class727.method5306((byte) -59, var4);
                        if (var5 != null && var5.equals(var2)) {
                            class157.field1960--;
                            for (int var6 = var3; var6 < class157.field1960; var6++) {
                                class54.field598[var6] = class54.field598[var6 + 1];
                                class83.field927[var6] = class83.field927[var6 + 1];
                                class666.field9687[var6] = class666.field9687[var6 + 1];
                                class298.field4705[var6] = class298.field4705[var6 + 1];
                                class502.field7253[var6] = class502.field7253[var6 + 1];
                            }
                            class622.field9112++;
                            class117.field1392 = class28.field349;
                            class280 var7 = class610.method4508(class672.field9758, class279.field4190, (byte) 34);
                            var7.field4197.method1428((byte) -24, class554.method4169(arg1 ^ 0xFFFFF777, arg0));
                            var7.field4197.method1464(arg0, arg1 + 22171);
                            class106.method934((byte) 53, var7);
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3183[6] + (arg0 == null ? field3183[3] : field3183[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1828(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!me", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1829(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 103;
                    break;
                case 1:
                    var10005 = 101;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 12;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
