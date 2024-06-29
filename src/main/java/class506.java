import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class506 {

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Lml;")
    private class194 field7404;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "J")
    public long field7403;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7406 = new String[] { method3869(method3868("jG,GG")), method3869(method3868("jG,DG")), method3869(method3868("jG,`\u0006qMno\u0015z\u0004")), method3869(method3868("jG,:\u0006qEv8G")), method3869(method3868("qYnj")), method3869(method3868("d\u0002,(\u0012")) };

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!uk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            field7401++;
            this.field7404.method1607(-41, this.field7403);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7406[2] + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)Z")
    public static final boolean method3866(int arg0, int arg1, int arg2) {
        try {
            field7405++;
            return arg2 == -12 ? false : false;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7406[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIJI)V")
    public static final void method3867(int arg0, int arg1, long arg2, int arg3) {
        try {
            if (arg1 == -18417) {
                field7402++;
                int var5 = ((int) arg2 & 0x7D3F8) >> 14;
                int var6 = (int) arg2 >> 20 & 0x3;
                int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
                if (var5 == 10 || var5 == 11 || var5 == 22) {
                    class789 var8 = class101.field1359.method2832(121, var7);
                    int var9;
                    int var10;
                    if (var6 == 0 || var6 == 2) {
                        var9 = var8.field11390;
                        var10 = var8.field11452;
                    } else {
                        var9 = var8.field11452;
                        var10 = var8.field11390;
                    }
                    int var11 = var8.field11381;
                    if (var6 != 0) {
                        var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
                    }
                    class50.method548(var11, 0, true, var9, arg3, arg0, 0, arg1 ^ 0x3ED8, var10);
                } else {
                    class50.method548(0, var5, true, 0, arg3, arg0, var6, arg1 - 12600, 0);
                }
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field7406[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lml;JI)V")
    public class506(class194 arg0, long arg1, int arg2) {
        try {
            this.field7404 = arg0;
            this.field7403 = arg1;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7406[3] + (arg0 == null ? field7406[4] : field7406[5]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3868(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3869(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 31;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 6;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
