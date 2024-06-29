import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class268 {

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "J")
    private long field4320 = -1L;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lat;")
    private class398 field4325 = new class398();

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4329 = new String[] { method2320(method2319("tIiS[")), method2320(method2319("tIiU[")), method2320(method2319("tIiV[")), method2320(method2319("\u007f\u0003i9\u000e")), method2320(method2319("jX+{")), method2320(method2319("QC5r\u0010kJ)~\u0000aIgT\u001feC\u0004\u007f\u0012jC\"{7aA3vSpT7rSmCgs\u0016gB#r[-")), method2320(method2319("tIi+\u001ajD3)[")), method2320(method2319("tIiT[")), method2320(method2319("GA&y0lL)y\u0016hi\"{\u0007e\u0003&g\u0003hT\u0013x0hL)T\u001beC)r\u001f,\u0004}70vH#r\u001dpD&{\u0000$I(7\u001dkYgz\u0012pN/6SgNit\u001feC\u000fv\u0000l\u0017")), method2320(method2319("tIiR[")), method2320(method2319("$I\"{\u0007e\u0003${\u0012je&d\u001b>")), method2320(method2319("$X7s\u0012pH\tb\u001e>")) };

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field4323 = -2;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lvn;")
    public static class330 field4319 = new class330(27, 1);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "J")
    private long field4322;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lmj;")
    public static class683 field4328;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[I")
    public static int[] field4327;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIBI)V", line = 6)
    public static final void method2314(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        try {
            if (class546.field8030 <= arg4 - arg1 && class779.field11374 >= arg1 + arg4 && arg3 - arg1 >= class310.field5088 && (arg3 + arg1) <= class478.field7264) {
                class18.method126(arg3, arg4, arg0, arg2, -117, arg1, arg6);
            } else {
                class688.method5008(arg4, arg2, 75, arg0, arg3, arg1, arg6);
            }
            int var7 = -124 / ((10 - arg5) / 46);
            field4321++;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field4329[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)[Ljk;", line = 27)
    public static final class662[] method2315(boolean arg0) {
        try {
            if (arg0) {
                return null;
            } else {
                field4318++;
                return new class662[] { class628.field9046, class533.field7816, class302.field4874 };
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4329[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lwq;I)V", line = 39)
    private final void method2316(class176 arg0, int arg1) {
        try {
            this.field4322 = arg0.method1658(-24862);
            field4324++;
            this.field4320 = arg0.method1658(-24862);
            int var3 = 26 / ((43 - arg1) / 48);
            for (int var4 = arg0.method1645((byte) -118); var4 != 0; var4 = arg0.method1645((byte) -86)) {
                class36 var5;
                if (var4 == 1) {
                    var5 = new class778();
                } else if (var4 == 4) {
                    var5 = new class687();
                } else if (var4 == 3) {
                    var5 = new class543();
                } else if (var4 == 2) {
                    var5 = new class601();
                } else {
                    throw new RuntimeException(field4329[5]);
                }
                var5.method361(arg0, 99);
                this.field4325.method3220(var5, 0);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4329[2] + (arg0 == null ? field4329[4] : field4329[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lwq;)V", line = 132)
    public class268(class176 arg0) {
        try {
            this.method2316(arg0, 116);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4329[6] + (arg0 == null ? field4329[4] : field4329[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLwt;)V", line = 92)
    public final void method2317(byte arg0, class328 arg1) {
        try {
            field4326++;
            if (this.field4322 != arg1.field8252 || this.field4320 != arg1.field5389) {
                throw new RuntimeException(field4329[8] + arg1.field8252 + field4329[11] + arg1.field5389 + field4329[10] + this.field4322 + field4329[11] + this.field4320);
            }
            for (class36 var3 = (class36) this.field4325.method3228(11); var3 != null; var3 = (class36) this.field4325.method3216(true)) {
                var3.method359(arg1, arg0 + 1898);
            }
            if (arg0 != 86) {
                method2318(-2);
            }
            arg1.field5389++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4329[9] + arg0 + ',' + (arg1 == null ? field4329[4] : field4329[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 116)
    public static void method2318(int arg0) {
        try {
            field4328 = null;
            field4327 = null;
            field4319 = null;
            if (arg0 != 4) {
                method2314(-8, -100, 31, -100, 47, (byte) -68, -116);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4329[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2319(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2320(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 4;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 71;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
