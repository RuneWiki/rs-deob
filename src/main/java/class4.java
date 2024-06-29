import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class4 {

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field60 = new String[] { method30(method29("Y$\n\u001c8")), method30(method29("F{\npm")), method30(method29("Y$\n\u001f8")), method30(method29("S H2")), method30(method29("Y$\n\u001d8")) };

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "Lmv;")
    public static class125 field58 = new class125(48, -1);

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "Z")
    public static boolean field59 = false;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "[Lkd;")
    public class245[] field56;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILuu;Ljc;)Lkd;", line = 5)
    private final class245 method26(int arg0, class240 arg1, class711 arg2) {
        try {
            field53++;
            if (class679.field9540 == arg1) {
                return class217.method1841(-23780, arg2);
            }
            if (arg0 <= 86) {
                method28(-50);
            }
            if (class345.field5029 == arg1) {
                return class435.method3395(122, arg2);
            } else if (class80.field1126 == arg1) {
                return class323.method2556(true, arg2);
            } else if (class76.field1085 == arg1) {
                return class526.method3997(0, arg2);
            } else if (class583.field8420 == arg1) {
                return class432.method3364(arg2, 4);
            } else if (class112.field1447 == arg1) {
                return class279.method2270(arg2, -53);
            } else if (class314.field4301 == arg1) {
                return class184.method1521(-8821, arg2);
            } else if (class248.field3553 == arg1) {
                return class80.method796((byte) 79, arg2);
            } else if (class694.field9695 == arg1) {
                return class40.method459((byte) 127, arg2);
            } else if (class324.field4416 == arg1) {
                return class776.method5592(arg2, (byte) -91);
            } else {
                return null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field60[4] + arg0 + ',' + (arg1 == null ? field60[3] : field60[1]) + ',' + (arg2 == null ? field60[3] : field60[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjc;)V", line = 54)
    public final void method27(int arg0, class711 arg1) {
        try {
            field54++;
            this.field55 = arg1.method5085(true);
            this.field57 = arg1.method5116((byte) -106);
            this.field56 = new class245[arg1.method5128(arg0 + 1)];
            class240[] var3 = class680.method4885(-80);
            if (arg0 == -1) {
                for (int var4 = 0; var4 < this.field56.length; var4++) {
                    this.field56[var4] = this.method26(112, var3[arg1.method5128(0)], arg1);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field60[2] + arg0 + ',' + (arg1 == null ? field60[3] : field60[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V", line = 79)
    public static void method28(int arg0) {
        try {
            int var1 = -13 % ((arg0 - 33) / 60);
            field58 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field60[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method29(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method30(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
