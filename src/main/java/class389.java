import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class389 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lwq;")
    private class178 field5868 = new class178(128);

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Lla;")
    private class476 field5869;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5874 = new String[] { method3101(method3100("^\u001a\u001b\u0001\"")), method3101(method3100("^\u001a\u001b\u0002\"")), method3101(method3100("^\u001a\u001b\u0000\"")), method3101(method3100("MQ\u001bmw")), method3101(method3100("X\nY/")), method3101(method3100("^\u001a\u001b\u007fcX\u0016A}\"")), method3101(method3100("^\u001a\u001b\u0007\"")) };

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field5872;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I", line = 3)
    public static final int method3096(byte arg0) {
        try {
            field5873++;
            if (class216.field3297) {
                return 6;
            } else if (class513.field7366 == null) {
                return 0;
            } else {
                int var1 = -41 / ((-arg0 - 3) / 60);
                int var2 = class513.field7366.field6146;
                if (class398.method3140((byte) -127, var2)) {
                    return 1;
                } else if (class83.method713(var2, -50)) {
                    return 2;
                } else if (class31.method207(var2, false)) {
                    return 3;
                } else if (class473.method3592((byte) 127, var2)) {
                    return 4;
                } else {
                    return 5;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5874[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI)Z", line = 36)
    public static final boolean method3097(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 != 124) {
                method3096((byte) -2);
            }
            field5870++;
            return class124.method1075(-105, arg2, arg0) || class454.method3477(arg0, arg2, arg1 ^ 0xFFFFFFA3);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5874[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Lki;", line = 49)
    public final class735 method3098(int arg0, byte arg1) {
        try {
            if (arg1 != -80) {
                return null;
            }
            field5871++;
            class178 var3 = this.field5868;
            class735 var4;
            synchronized (this.field5868) {
                var4 = (class735) this.field5868.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            byte[] var5 = this.field5869.method3632(class307.method2606(-124, arg0), class727.method5305((byte) 107, arg0), -120);
            class735 var6 = new class735();
            if (var5 != null) {
                var6.method5363((byte) 63, new class163(var5));
            }
            class178 var7 = this.field5868;
            synchronized (this.field5868) {
                this.field5868.method1556((long) arg0, var6, 1);
                return var6;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field5874[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 83)
    public static void method3099(int arg0) {
        try {
            int var1 = -7 % ((-arg0 - 42) / 34);
            field5872 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5874[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lto;ILla;)V", line = 99)
    public class389(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field5869 = arg2;
            if (this.field5869 != null) {
                int var4 = this.field5869.method3629((byte) 18) - 1;
                this.field5869.method3646(var4, (byte) -79);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5874[5] + (arg0 == null ? field5874[4] : field5874[3]) + ',' + arg1 + ',' + (arg2 == null ? field5874[4] : field5874[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!he", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3100(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xA);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!he", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3101(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
