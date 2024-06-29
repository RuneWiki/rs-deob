import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class130 {

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1858 = new String[] { method1241(method1240("$a*\u0003-")), method1241(method1240("$a*\u0002-")), method1241(method1240("$a*\u0000-")) };

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Lhl;")
    public static class556 field1855 = new class556(83, -1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "F")
    public static float field1854;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "F")
    public static float field1857;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIII)I", line = 4)
    public static final int method1237(boolean arg0, int arg1, int arg2, int arg3) {
        try {
            field1853++;
            if (class672.field9539 < 100) {
                return -2;
            } else if (arg0) {
                return -26;
            } else {
                int var4 = -2;
                int var5 = Integer.MAX_VALUE;
                int var6 = arg2 - class770.field11276;
                int var7 = arg1 - class770.field11270;
                for (class420 var8 = (class420) class770.field11260.method3228(11); var8 != null; var8 = (class420) class770.field11260.method3216(true)) {
                    if (arg3 == var8.field6636) {
                        int var9 = var8.field6631;
                        int var10 = var8.field6630;
                        int var11 = class770.field11276 + var9 << 14 | class770.field11270 + var10;
                        int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                        if (var4 < 0 || var5 > var12) {
                            var4 = var11;
                            var5 = var12;
                        }
                    }
                }
                return var4;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field1858[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V", line = 54)
    public static void method1238(boolean arg0) {
        try {
            field1855 = null;
            if (!arg0) {
                field1854 = 0.26680583F;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1858[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 71)
    public static final void method1239(byte arg0) {
        try {
            if (arg0 == -86) {
                field1856++;
                if (class95.field1383 < 0) {
                    class95.field1383 = 0;
                    class62.field822 = -1;
                    class116.field1695 = -1;
                }
                if (class770.field11284 < class95.field1383) {
                    class116.field1695 = -1;
                    class95.field1383 = class770.field11284;
                    class62.field822 = -1;
                }
                if (class317.field5174 < 0) {
                    class116.field1695 = -1;
                    class317.field5174 = 0;
                    class62.field822 = -1;
                }
                if (class317.field5174 > class770.field11272) {
                    class116.field1695 = -1;
                    class317.field5174 = class770.field11272;
                    class62.field822 = -1;
                }
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1858[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1240(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1241(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 11;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
