import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class507 implements class410 {

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "Luca;")
    private class538 field7338;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "Lla;")
    private class476 field7343;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "Lla;")
    private class476 field7336;

    @OriginalMember(owner = "client!cga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7345 = new String[] { method3820(method3819("&\bw@")), method3820(method3819("3S5\u0002%")), method3820(method3819("+\u001az\u0002d!\u0013rXf`")), method3820(method3819("+\u001az\u0002\u001b`")), method3820(method3819("+\u001az\u0002\u0012`")), method3820(method3819("+\u001az\u0002\u0019`")), method3820(method3819("+\u001az\u0002\u001a`")) };

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "Lel;")
    public static class573 field7342 = new class573(56, 4);

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "Lda;")
    private class67 field7337;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)V", line = 4)
    public final void method370(byte arg0) {
        try {
            field7344++;
            if (arg0 < -98) {
                class578 var2 = class350.method2876(7, this.field7338.field7894, this.field7343);
                this.field7337 = class610.field8913.method563(var2, class481.method3677(this.field7336, this.field7338.field7894), true);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7345[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)V", line = 21)
    public static void method3818(byte arg0) {
        try {
            field7342 = null;
            if (arg0 != -103) {
                method3818((byte) -121);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7345[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZB)V", line = 33)
    public final void method368(boolean arg0, byte arg1) {
        try {
            field7340++;
            if (arg0) {
                int var3 = this.field7338.field7899.method4532(this.field7338.field7889, 0, class604.field8861) + this.field7338.field7886;
                int var4 = this.field7338.field7897.method2339(this.field7338.field7883, (byte) -55, class524.field7654) + this.field7338.field7891;
                this.field7337.method598(this.field7338.field7895, this.field7338.field7898, this.field7338.field7883, this.field7338.field7884, this.field7338.field7890, (byte) -27, null, this.field7338.field7889, this.field7338.field7885, 0, null, var3, 0, null, var4, this.field7338.field7900);
            }
            int var5 = -32 / ((arg1 - 38) / 37);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7345[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)Z", line = 53)
    public final boolean method369(int arg0) {
        try {
            field7341++;
            if (arg0 != -17976) {
                this.method368(false, (byte) -15);
            }
            boolean var2 = true;
            if (!this.field7336.method3618(this.field7338.field7894, arg0 + 18064)) {
                var2 = false;
            }
            if (!this.field7343.method3618(this.field7338.field7894, 65)) {
                var2 = false;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7345[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lla;Lla;Luca;)V", line = 79)
    public class507(class476 arg0, class476 arg1, class538 arg2) {
        try {
            this.field7338 = arg2;
            this.field7343 = arg1;
            this.field7336 = arg0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7345[2] + (arg0 == null ? field7345[0] : field7345[1]) + ',' + (arg1 == null ? field7345[0] : field7345[1]) + ',' + (arg2 == null ? field7345[0] : field7345[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3819(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3820(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
