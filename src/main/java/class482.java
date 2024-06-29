import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class482 extends class578 {

    @OriginalMember(owner = "client!po", name = "m", descriptor = "Ljava/lang/String;")
    public String field7096;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7098 = new String[] { method3726(method3725(" 58\u0016$")), method3726(method3725(" 58\u0011$")), method3726(method3725(" 58\u0015$")), method3726(method3725(" 58\u0017$")), method3726(method3725("+t8zq")), method3726(method3725(" 58he>3bj$")), method3726(method3725(">/z8")), method3726(method3725(" 58\u0010$")) };

    @OriginalMember(owner = "client!po", name = "o", descriptor = "[B")
    public static byte[] field7094 = null;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "[Lta;")
    public static class330[] field7093 = new class330[8];

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(BI)I")
    public static final int method3720(byte arg0, int arg1) {
        try {
            field7090++;
            int var2 = arg1 >>> 1;
            int var3 = var2 | var2 >>> 1;
            int var4 = 75 % ((arg0 + 18) / 40);
            int var5 = var3 | var3 >>> 2;
            int var6 = var5 | var5 >>> 4;
            int var7 = var6 | var6 >>> 8;
            int var8 = var7 | var7 >>> 16;
            return arg1 & ~var8;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field7098[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public static void method3721(int arg0) {
        try {
            if (arg0 != 24267) {
                field7093 = null;
            }
            field7094 = null;
            field7093 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7098[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)I")
    public static final int method3722(int arg0, int arg1, int arg2) {
        try {
            field7092++;
            if (arg0 == arg2) {
                return 12345678;
            } else if (arg2 == -1) {
                if (arg1 < 2) {
                    arg1 = 2;
                } else if (arg1 > 126) {
                    arg1 = 126;
                }
                return arg1;
            } else {
                arg1 = (arg2 & 0x7F) * arg1 >> 7;
                if (arg1 < 2) {
                    arg1 = 2;
                } else if (arg1 > 126) {
                    arg1 = 126;
                }
                return (arg2 & 0xFF80) + arg1;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7098[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)V")
    public static final void method3723(byte arg0, int arg1) {
        try {
            field7095++;
            if (arg0 <= 0) {
                method3721(-77);
            }
            class500 var2 = (class500) class687.field9624.method3693(false, (long) arg1);
            if (var2 != null) {
                var2.field7303 = !var2.field7303;
                var2.field7313.method3099((byte) 74, var2.field7303);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7098[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)Z")
    public static final boolean method3724(int arg0) {
        try {
            field7091++;
            if (arg0 != 1027279812) {
                field7097 = 5;
            }
            return class559.field8139 >= 1;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7098[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
    public class482() {
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class482(String arg0) {
        try {
            this.field7096 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7098[5] + (arg0 == null ? field7098[6] : field7098[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3725(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xC);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!po", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3726(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 80;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 84;
                    break;
                default:
                    var10005 = 12;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
