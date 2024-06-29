import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class198 {

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2937 = new String[] { method1716(method1715("0\u0018m:")), method1716(method1715("6\u000b/\u0014h")), method1716(method1715("%C/x=")), method1716(method1715("6\u000b/\u0015h")), method1716(method1715("6\u000b/\u0017h")), method1716(method1715("6\u000b/\u0012h")), method1716(method1715("6\u000b/\u0013h")) };

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Lvo;")
    public static class782 field2936 = null;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    private int field2930;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public int field2931;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Ltca;")
    public class611 field2929;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
    public static final void method1710(int arg0, boolean arg1) {
        try {
            field2934++;
            int var2 = class649.field9225;
            int var3 = class90.field1257;
            if (arg1 && class149.field1902) {
                var2 <<= 0x1;
                var3 = -var2;
            }
            class236.field3418.method120(var3, var2);
            if (arg0 != 1) {
                field2936 = null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2937[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjc;)V")
    public final void method1711(byte arg0, class711 arg1) {
        try {
            if (arg0 != 102) {
                this.method1713(-5);
            }
            field2933++;
            while (true) {
                int var3 = arg1.method5128(0);
                if (var3 == 0) {
                    return;
                }
                this.method1712((byte) -128, arg1, var3);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2937[1] + arg0 + ',' + (arg1 == null ? field2937[0] : field2937[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjc;I)V")
    private final void method1712(byte arg0, class711 arg1, int arg2) {
        try {
            if (arg2 == 1) {
                this.field2930 = arg1.method5116((byte) -118);
            } else if (arg2 == 2) {
                this.field2935 = arg1.method5128(0);
                this.field2931 = arg1.method5128(0);
            }
            field2932++;
            if (arg0 > -111) {
                method1710(107, false);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2937[3] + arg0 + ',' + (arg1 == null ? field2937[0] : field2937[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Lcu;")
    public final synchronized class66 method1713(int arg0) {
        try {
            if (arg0 >= -55) {
                return null;
            }
            field2928++;
            class66 var2 = (class66) this.field2929.field8753.method2053(0, (long) this.field2930);
            if (var2 != null) {
                return var2;
            }
            class66 var3 = class66.method704(this.field2929.field8748, this.field2930, 0);
            if (var3 != null) {
                this.field2929.field8753.method2051((long) this.field2930, var3, 93);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2937[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static void method1714(boolean arg0) {
        try {
            if (arg0) {
                field2936 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2937[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1715(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1716(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
