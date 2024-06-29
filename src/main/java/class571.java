import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class571 {

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "Lwq;")
    private class178 field8453 = new class178(64);

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "Lla;")
    private class476 field8448;

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8455 = new String[] { method4272(method4271("\t> GjJ")), method4272(method4271("\t> GmJ")), method4272(method4271("\t> GlJ")), method4272(method4271("\t> GkJ")), method4272(method4271("\t> G\u0014\u000b7(\u001d\u0016J")), method4272(method4271("\f,-\u0005")), method4272(method4271("\u0019woGU")), method4272(method4271("\t> GnJ")), method4272(method4271("\t> GiJ")) };

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "Ljh;")
    public static class169 field8447 = new class169();

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
    public static int field8454 = -1;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
    public static int field8449;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "Lla;")
    public static class476 field8452;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(ZI)Lrc;", line = 7)
    public final class564 method4265(boolean arg0, int arg1) {
        try {
            field8451++;
            class178 var3 = this.field8453;
            class564 var4;
            synchronized (this.field8453) {
                var4 = (class564) this.field8453.method1558((byte) 96, (long) arg1);
            }
            if (!arg0) {
                this.method4267(-72, true);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field8448;
            byte[] var6;
            synchronized (this.field8448) {
                var6 = this.field8448.method3632(class235.method2006(arg1, (byte) -110), class73.method660(2258, arg1), -125);
            }
            class564 var7 = new class564();
            if (var6 != null) {
                var7.method4209(-14964, new class163(var6));
            }
            class178 var8 = this.field8453;
            synchronized (this.field8453) {
                this.field8453.method1556((long) arg1, var7, 1);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field8455[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V", line = 39)
    public final void method4266(int arg0) {
        try {
            class178 var2 = this.field8453;
            synchronized (this.field8453) {
                this.field8453.method1559(0);
                int var3 = 21 % ((arg0 + 55) / 54);
            }
            field8446++;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8455[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)V", line = 53)
    public final void method4267(int arg0, boolean arg1) {
        try {
            field8449++;
            if (!arg1) {
                class178 var3 = this.field8453;
                synchronized (this.field8453) {
                    this.field8453.method1557(arg0, (byte) -118);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8455[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)V", line = 73)
    public static void method4268(int arg0) {
        try {
            if (arg0 <= -1) {
                field8447 = null;
                field8452 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8455[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)V", line = 84)
    public final void method4269(int arg0) {
        try {
            field8450++;
            class178 var2 = this.field8453;
            synchronized (this.field8453) {
                this.field8453.method1569(10574);
            }
            if (arg0 < 7) {
                this.method4266(-99);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8455[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZI)V", line = 98)
    public final void method4270(boolean arg0, int arg1) {
        try {
            field8445++;
            class178 var3 = this.field8453;
            synchronized (this.field8453) {
                this.field8453.method1559(0);
                this.field8453 = new class178(arg1);
                if (!arg0) {
                    this.method4266(1);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8455[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lto;ILla;)V", line = 120)
    public class571(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field8448 = arg2;
            if (this.field8448 != null) {
                int var4 = this.field8448.method3629((byte) 18) - 1;
                this.field8448.method3646(var4, (byte) -16);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8455[4] + (arg0 == null ? field8455[5] : field8455[6]) + ',' + arg1 + ',' + (arg2 == null ? field8455[5] : field8455[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4271(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4272(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 65;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
