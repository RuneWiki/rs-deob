import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class342 {

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    private int field5313 = 0;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "Lqha;")
    private class112 field5322;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5323 = new String[] { method2843(method2842("F95!R")), method2843(method2842("F95#R")), method2843(method2842("F95&R")), method2843(method2842("N<w\u000e")), method2843(method2842("F95^\u0013N o\\R")), method2843(method2842("[g5L\u0007")), method2843(method2842("F95 R")) };

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "[I")
    public static int[] field5316 = new int[500];

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "[I")
    public static int[] field5314 = new int[13];

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "Lme;")
    private class206 field5318;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "Lol;")
    public static class299 field5315;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "Lla;")
    public static class476 field5319;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)Lme;", line = 10)
    public final class206 method2838(int arg0) {
        try {
            field5320++;
            if (this.field5313 > 0 && this.field5322.field1303[this.field5313 - 1] != this.field5318) {
                class206 var2 = this.field5318;
                this.field5318 = var2.field3180;
                return var2;
            }
            while (this.field5322.field1306 > this.field5313) {
                class206 var3 = this.field5322.field1303[this.field5313++].field3180;
                if (this.field5322.field1303[this.field5313 - 1] != var3) {
                    this.field5318 = var3.field3180;
                    return var3;
                }
            }
            if (arg0 <= 42) {
                method2839(43);
            }
            return null;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5323[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V", line = 90)
    public class342() {
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lqha;)V", line = 95)
    public class342(class112 arg0) {
        try {
            this.field5322 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5323[4] + (arg0 == null ? field5323[3] : field5323[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 49)
    public static void method2839(int arg0) {
        try {
            field5319 = null;
            if (arg0 == 0) {
                field5315 = null;
                field5314 = null;
                field5316 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5323[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)Lme;", line = 62)
    public final class206 method2840(int arg0) {
        try {
            this.field5313 = 0;
            if (arg0 >= -121) {
                this.method2840(11);
            }
            field5317++;
            return this.method2838(81);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5323[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)V", line = 75)
    public static final void method2841(int arg0, int arg1, int arg2) {
        try {
            field5321++;
            class313 var3 = class196.method1670(0L, 15, 107);
            var3.method2636((byte) 95);
            var3.field4958 = arg0;
            if (arg1 > 29) {
                var3.field4951 = arg2;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5323[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2842(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2843(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 98;
                    break;
                default:
                    var10005 = 122;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
