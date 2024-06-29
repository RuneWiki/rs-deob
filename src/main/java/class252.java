import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class252 {

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "I")
    private int field3913;

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "Z")
    private boolean field3908;

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    private int field3903;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "Z")
    private boolean field3901;

    @OriginalMember(owner = "client!rga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3915 = new String[] { method2138(method2137("\u00143 K")), method2138(method2137("\b!-\t;R")), method2138(method2137("\u0001hb\t\u0002")), method2138(method2137("\b!-\t>R")), method2138(method2137("\b!-\t:R")), method2138(method2137("\b!-\t9R")), method2138(method2137("\b!-\t<R")), method2138(method2137("\b!-\tC\u0013(%SAR")), method2138(method2137("\b!-\t=R")) };

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!rga", name = "n", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!rga", name = "m", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!rga", name = "l", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(ILdk;)V", line = 7)
    public static final void method2131(int arg0, class536 arg1) {
        try {
            if (arg0 < 98) {
                method2131(7, null);
            }
            arg1.field7847 = null;
            field3911++;
            if (class309.field4912 < 20) {
                class60.field624.method4541((byte) -112, arg1);
                class309.field4912++;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3915[1] + arg0 + ',' + (arg1 == null ? field3915[0] : field3915[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)I", line = 26)
    public final int method2132(int arg0) {
        try {
            field3912++;
            if (arg0 < 83) {
                field3907 = -30;
            }
            return this.field3913;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3915[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Ljava/lang/String;Lib;B)I", line = 39)
    public static final int method2133(String arg0, class163 arg1, byte arg2) {
        try {
            field3910++;
            int var3 = arg1.field2201;
            if (arg2 < 108) {
                return 100;
            } else {
                byte[] var4 = class425.method3278(arg0, -48);
                arg1.method1405(var4.length, (byte) 126);
                arg1.field2201 += class419.field6176.method2808(var4.length, arg1.field2201, arg1.field2209, var4, 0, -277513377);
                return arg1.field2201 - var3;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3915[4] + (arg0 == null ? field3915[0] : field3915[2]) + ',' + (arg1 == null ? field3915[0] : field3915[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)Z", line = 60)
    public final boolean method2134(byte arg0) {
        try {
            if (arg0 == -106) {
                field3909++;
                return this.field3908;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3915[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(B)Z", line = 74)
    public final boolean method2135(byte arg0) {
        try {
            if (arg0 > -24) {
                return true;
            } else {
                field3906++;
                return this.field3901;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3915[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Z)I", line = 89)
    public final int method2136(boolean arg0) {
        try {
            if (arg0) {
                this.method2134((byte) 104);
            }
            field3904++;
            return this.field3903;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3915[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(ZIIZ)V", line = 100)
    public class252(boolean arg0, int arg1, int arg2, boolean arg3) {
        try {
            this.field3913 = arg1;
            this.field3908 = arg3;
            this.field3903 = arg2;
            this.field3901 = arg0;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3915[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2137(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2138(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
