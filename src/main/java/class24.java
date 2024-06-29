import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class24 {

    @OriginalMember(owner = "client!um", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field293 = new String[] { method286(method285("8*\u0003M")), method286(method285("#2AeG")), method286(method285("-qA\u000f\u0012")), method286(method285("#2A`G")), method286(method285("#2AbG")), method286(method285("vrQ\u0001")), method286(method285("#2AdG")), method286(method285("#2AcG")), method286(method285("vc\fN\u0003k9\tG\t09Q\u001f")) };

    @OriginalMember(owner = "client!um", name = "i", descriptor = "Z")
    public static boolean field285 = false;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Lff;")
    public static class733 field284 = new class733();

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "Ld;")
    public static class673 field292;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILvo;II)V", line = 4)
    public static final void method280(int arg0, class782 arg1, int arg2, int arg3) {
        try {
            field290++;
            if (class351.field5091) {
                class573 var4 = class760.field10845 == -1 ? null : class202.field2972.method611(false, class760.field10845);
                if (client.method4957(arg1).method1182(-1) && (class140.field1826 & 0x20) != 0 && (var4 == null || arg1.method5634(-99, var4.field8295, class760.field10845) != var4.field8295)) {
                    class624.field8914++;
                    class751.method5441(class121.field1534, class109.field1426 + field293[5] + arg1.field11179, arg1.field11206, -1, (long) (arg1.field11206 << 0 | arg1.field11158), true, class268.field3795, arg1.field11276, false, arg1.field11158, false, 45, 0L);
                }
            }
            for (int var5 = 9; var5 >= 5; var5--) {
                String var6 = class676.method4842(var5, arg1, 0);
                if (var6 != null) {
                    class751.method5441(class169.method1418(arg1, var5, 0), arg1.field11179, arg1.field11206, -1, (long) (arg1.field11158 | arg1.field11206 << 0), true, var6, arg1.field11276, false, arg1.field11158, false, 1007, (long) (var5 + 1));
                    class341.field4964++;
                }
            }
            String var7 = class521.method3962(0, arg1);
            if (var7 != null) {
                class751.method5441(arg1.field11144, arg1.field11179, arg1.field11206, -1, (long) (arg1.field11206 << 0 | arg1.field11158), true, var7, arg1.field11276, false, arg1.field11158, false, 11, 0L);
                class800.field11642++;
            }
            int var8 = 64 % ((-arg0 - 10) / 50);
            for (int var9 = 4; var9 >= 0; var9--) {
                String var10 = class676.method4842(var9, arg1, 0);
                if (var10 != null) {
                    class341.field4964++;
                    class751.method5441(class169.method1418(arg1, var9, 0), arg1.field11179, arg1.field11206, -1, (long) (arg1.field11158 | arg1.field11206 << 0), true, var10, arg1.field11276, false, arg1.field11158, false, 6, (long) (var9 + 1));
                }
            }
            if (client.method4957(arg1).method1187((byte) 10)) {
                class670.field9444++;
                if (arg1.field11284 == null) {
                    class751.method5441(-1, "", arg1.field11206, -1, (long) (arg1.field11206 << 0 | arg1.field11158), true, class537.field7840.method4068((byte) -73, class405.field5883), arg1.field11276, false, arg1.field11158, false, 60, 0L);
                } else {
                    class751.method5441(-1, "", arg1.field11206, -1, (long) (arg1.field11158 | arg1.field11206 << 0), true, arg1.field11284, arg1.field11276, false, arg1.field11158, false, 60, 0L);
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field293[4] + arg0 + ',' + (arg1 == null ? field293[0] : field293[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 85)
    public static void method281(byte arg0) {
        try {
            field284 = null;
            if (arg0 <= 32) {
                field292 = null;
            }
            field292 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field293[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Ljc;", line = 96)
    public static final class711 method282(int arg0) {
        try {
            field291++;
            int var1 = 87 % ((arg0 + 72) / 52);
            class711 var2 = new class711(518);
            class43.field634 = new int[4];
            class43.field634[3] = (int) (Math.random() * 9.9999999E7D);
            class43.field634[2] = (int) (Math.random() * 9.9999999E7D);
            class43.field634[0] = (int) (Math.random() * 9.9999999E7D);
            class43.field634[1] = (int) (Math.random() * 9.9999999E7D);
            var2.method5114(255, 10);
            var2.method5127(class43.field634[0], 26108);
            var2.method5127(class43.field634[1], 26108);
            var2.method5127(class43.field634[2], 26108);
            var2.method5127(class43.field634[3], 26108);
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field293[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILha;III)Lka;", line = 126)
    public static final class761 method283(int arg0, int arg1, int arg2, class18 arg3, int arg4, int arg5, int arg6) {
        try {
            field283++;
            long var7 = (long) arg0;
            class761 var9 = (class761) class550.field8037.method2053(0, var7);
            short var10 = 2055;
            if (var9 == null) {
                class60 var11 = class372.method2951(arg0, 0, (byte) -3, class378.field5529);
                if (var11 == null) {
                    return null;
                }
                if (var11.field902 < 13) {
                    var11.method644(arg6 ^ 0x7F, 2);
                }
                var9 = arg3.method197(var11, var10, class788.field11377, 64, 768);
                class550.field8037.method2051(var7, var9, 93);
            }
            class761 var12 = var9.method418((byte) 2, var10, true);
            if (arg1 != 0) {
                var12.method419(arg1);
            }
            if (arg4 != 0) {
                var12.method436(arg4);
            }
            if (arg5 != arg6) {
                var12.method437(arg5);
            }
            if (arg2 != 0) {
                var12.method430(0, arg2, 0);
            }
            return var12;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field293[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field293[0] : field293[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILbo;)Ljava/lang/String;", line = 170)
    public static final String method284(int arg0, class801 arg1) {
        try {
            if (arg0 != -1) {
                field285 = false;
            }
            field288++;
            return arg1.field11650 + field293[8];
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field293[7] + arg0 + ',' + (arg1 == null ? field293[0] : field293[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!um", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method285(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!um", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method286(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 86;
                    break;
                case 1:
                    var10005 = 95;
                    break;
                case 2:
                    var10005 = 111;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
