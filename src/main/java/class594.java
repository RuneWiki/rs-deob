import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class594 {

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8541 = new String[] { method4385(method4384("X!/6p")), method4385(method4384("X!/7p")), method4385(method4384("X!/1p")), method4385(method4384("X!/2p")), method4385(method4384("X!/0p")) };

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Ltf;")
    public static class524 field8536 = new class524();

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Lel;")
    public static final class585 method4379(int arg0, int arg1) {
        try {
            field8537++;
            class585 var2 = (class585) class762.field10876.method2053(0, (long) arg1);
            if (var2 != null) {
                return var2;
            }
            byte[] var3 = class249.field3564.method512(arg1, 1, (byte) -57);
            class585 var4 = new class585();
            if (arg0 < 80) {
                field8536 = null;
            }
            var4.field8441 = arg1;
            if (var3 != null) {
                var4.method4330(-6622, new class711(var3));
            }
            var4.method4327(false);
            if (var4.field8440 == 2 && class217.field3175.method3693(false, (long) arg1) == null) {
                class217.field3175.method3691(new class529(class344.field5012), (long) arg1, -1);
                class591.field8511[class344.field5012++] = var4;
            }
            class762.field10876.method2051((long) arg1, var4, 93);
            return var4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8541[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
    public static final void method4380(boolean arg0) {
        try {
            if (arg0) {
                class550.field8036.method2047(11914);
                field8538++;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8541[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJ)V")
    public static final void method4381(int arg0, long arg1) {
        try {
            field8540++;
            if (class608.field8715 != null) {
                if (class596.field8579 == 1 || class596.field8579 == 5) {
                    class327.method2578((byte) -79, arg1);
                } else if (class596.field8579 == 4) {
                    class129.method1137(arg1, -1);
                }
            }
            class161.method1363((long) class694.field9700, class236.field3418, 79);
            if (arg0 >= -82) {
                field8536 = null;
            }
            if (class572.field8291 != -1) {
                class632.method4620(class572.field8291, -122);
            }
            for (int var3 = 0; var3 < class153.field1962; var3++) {
                if (class752.field10742[var3]) {
                    class7.field92[var3] = true;
                }
                class106.field1387[var3] = class752.field10742[var3];
                class752.field10742[var3] = false;
            }
            class355.field5158 = class694.field9700;
            class298.method2391(null, -1, (byte) -86, -1);
            class281.method2289(null, -1, -44, -1);
            if (class572.field8291 != -1) {
                class153.field1962 = 0;
                class40.method457((byte) 4);
            }
            class236.field3418.method240();
            class637.method4639(class236.field3418, 0);
            int var4 = class375.method2966((byte) 63);
            if (var4 == -1) {
                var4 = class670.field9445;
            }
            if (var4 == -1) {
                var4 = class204.field2993;
            }
            class714.method5172(var4, -1);
            int var5 = class203.field2988.method1437((byte) -28) << 8;
            class304.method2441(class203.field2988.field2984 + var5, 3, class203.field2988.field2969 + var5, class393.field5721, class203.field2988.field2981);
            class393.field5721 = 0;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8541[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method4382(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        try {
            if (arg5) {
                field8536 = null;
            }
            class337[] var7 = class99.field1336;
            for (int var8 = 0; var8 < var7.length; var8++) {
                class337 var9 = var7[var8];
                if (var9 != null && var9.field4876 == 2) {
                    class615.method4535(var9.field4887, var9.field4875 * 2, arg2, 0, arg0, arg3 >> 1, var9.field4873, var9.field4879, arg6 >> 1);
                    if (class302.field4219[0] > -1 && (class694.field9700 % 20) < 10) {
                        class392 var10 = class41.field624[var9.field4874];
                        int var11 = arg4 + class302.field4219[0] - 12;
                        int var12 = class302.field4219[1] + arg1 - 28;
                        var10.method3074(var11, var12);
                        class232.method1925(var12, var11, var12 + var10.method1380(), var10.method1378() + var11, (byte) 121);
                    }
                }
            }
            field8539++;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field8541[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method4383(int arg0) {
        try {
            if (arg0 == 0) {
                field8536 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8541[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4384(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4385(char[] arg0) {
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
                    var10005 = 72;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
