import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class486 {

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "Lui;")
    private class251 field7128 = new class251(64);

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "Llga;")
    private class47 field7130;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public int field7124;

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7134 = new String[] { method3749(method3748("\u0006j\u0019UK")), method3749(method3748("\u00131[\u0017")), method3749(method3748("\n'VU\n\u0014*^\u000f\bU")), method3749(method3748("\n'VUwU")), method3749(method3748("\n'VUtU")), method3749(method3748("\n'VUuU")) };

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "Ltf;")
    public static class524 field7127 = new class524();

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "Lsb;")
    public static class261 field7129 = new class261(129, -1);

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "Z")
    public static boolean field7132 = false;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "Lmv;")
    public static class125 field7133 = new class125(49, 7);

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "J")
    public static long field7131;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZI)Lwq;", line = 9)
    public final class124 method3745(boolean arg0, int arg1) {
        try {
            field7125++;
            class251 var3 = this.field7128;
            class124 var5;
            synchronized (this.field7128) {
                if (!arg0) {
                    return null;
                }
                var5 = (class124) this.field7128.method2053(0, (long) arg1);
            }
            if (var5 != null) {
                return var5;
            }
            class47 var6 = this.field7130;
            byte[] var7;
            synchronized (this.field7130) {
                var7 = this.field7130.method512(arg1, 19, (byte) -107);
            }
            class124 var8 = new class124();
            if (var7 != null) {
                var8.method1111((byte) 85, new class711(var7));
            }
            class251 var9 = this.field7128;
            synchronized (this.field7128) {
                this.field7128.method2051((long) arg1, var8, 93);
                return var8;
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field7134[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V", line = 39)
    public static final void method3746(byte arg0) {
        try {
            field7126++;
            if (arg0 < -109) {
                class132.method1151((byte) -78, -1, 255);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7134[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V", line = 52)
    public static void method3747(int arg0) {
        try {
            int var1 = -100 % ((arg0 + 83) / 32);
            field7127 = null;
            field7133 = null;
            field7129 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7134[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lfs;ILlga;)V", line = 82)
    public class486(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field7130 = arg2;
            this.field7124 = this.field7130.method509(true, 19);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7134[2] + (arg0 == null ? field7134[1] : field7134[0]) + ',' + arg1 + ',' + (arg2 == null ? field7134[1] : field7134[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3748(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3749(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 55;
                    break;
                case 3:
                    var10005 = 123;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
