import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class599 {

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8813 = new String[] { method4458(method4457("\u001b-\u0006'")), method4458(method4457("\u000evDeB")), method4458(method4457("\u0016*D\n\u0017")), method4458(method4457("\u0016*D\u000f\u0017")), method4458(method4457("\u0016*D\b\u0017")) };

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Ldv;")
    public static class685 field8808 = new class685(13, 0, 1, 0);

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field8812 = -1;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field8811 = 0;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lrt;Z)I")
    public static final int method4453(class239 arg0, boolean arg1) {
        try {
            field8810++;
            if (class48.field546 == arg0) {
                return 5890;
            } else if (class335.field5233 == arg0) {
                return 34167;
            } else if (class185.field2557 == arg0) {
                return 34168;
            } else if (class114.field1352 == arg0) {
                return 34166;
            } else {
                if (!arg1) {
                    method4453(null, true);
                }
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8813[3] + (arg0 == null ? field8813[0] : field8813[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public static void method4454(byte arg0) {
        try {
            if (arg0 <= -29) {
                field8808 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8813[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lub;I)V")
    public static final void method4455(class22 arg0, int arg1) {
        try {
            field8809++;
            arg0.method155(arg1 ^ 0x270BC34A);
            if (arg1 != 28258) {
                method4455(null, 93);
            }
            int var2 = class722.field10458;
            class726 var3 = class225.field3446 = class197.field2685[var2] = new class726();
            var3.field3780 = var2;
            int var4 = arg0.method156(-10160, 30);
            byte var5 = (byte) (var4 >> 28);
            int var6 = var4 >> 14 & 0x3FFF;
            int var7 = var4 & 0x3FFF;
            var3.field3859[0] = var6 - class494.field7101;
            var3.field6197 = (var3.field3859[0] << 9) + (var3.method2101(arg1 ^ 0x1485) << 8);
            var3.field3863[0] = var7 - class281.field4219;
            var3.field6211 = (var3.field3863[0] << 9) + (var3.method2101(31463) << 8);
            class520.field7618 = var3.field6200 = var3.field6205 = var5;
            if (class231.method1980(1, var3.field3863[0], var3.field3859[0])) {
                var3.field6205++;
            }
            if (class216.field3295[var2] != null) {
                var3.method5294(arg1 - 21258, class216.field3295[var2]);
            }
            class3.field34 = 0;
            class358.field5483[class3.field34++] = var2;
            class188.field2579[var2] = 0;
            class85.field949 = 0;
            for (int var8 = 1; var8 < 2048; var8++) {
                if (var2 != var8) {
                    int var9 = arg0.method156(-10160, 18);
                    int var10 = var9 >> 16;
                    int var11 = var9 >> 8 & 0xFF;
                    int var12 = var9 & 0xFF;
                    class133 var13 = class176.field2458[var8] = new class133();
                    var13.field1552 = false;
                    var13.field1555 = -1;
                    var13.field1557 = (var10 << 28) + var12 + (var11 << 14);
                    var13.field1553 = false;
                    var13.field1554 = 0;
                    class534.field7824[class85.field949++] = var8;
                    class188.field2579[var8] = 0;
                }
            }
            arg0.method154(arg1 ^ 0x6E61);
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field8813[2] + (arg0 == null ? field8813[0] : field8813[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)Lqa;")
    public static final class261 method4456(int arg0, int arg1, int arg2) {
        class96 var3 = class734.field10683[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1082;
    }

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4457(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4458(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
