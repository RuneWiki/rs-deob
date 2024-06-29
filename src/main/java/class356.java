import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class356 {

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5476 = new String[] { method2919(method2918(")_7M\n")), method2919(method2918("$VicTr")), method2919(method2918(")_7O\n")), method2919(method2918(")_7N\n")) };

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lwq;")
    public static class178 field5473 = new class178(4);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "[F")
    public static float[] field5475 = new float[16];

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 9)
    public static final void method2915(int arg0) {
        try {
            field5472++;
            if (class98.field1101 == null) {
                class270 var1 = new class270();
                byte[] var2 = var1.method2239(arg0 + 110, 16, 128, 128);
                class98.field1101 = class94.method801(var2, false, 136);
            }
            if (arg0 != 16) {
                field5473 = null;
            }
            if (class389.field5872 == null) {
                class94 var3 = new class94();
                byte[] var4 = var3.method799(16, 17968, 128, 128);
                class389.field5872 = class94.method801(var4, false, arg0 ^ 0x98);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5476[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 39)
    public static final void method2916(byte arg0) {
        try {
            class430.field6332.method155(655076648);
            int var1 = 84 % ((-arg0 - 69) / 43);
            field5474++;
            int var2 = class430.field6332.method156(-10160, 8);
            if (class6.field60 > var2) {
                for (int var3 = var2; var3 < class6.field60; var3++) {
                    class749.field10904[class454.field6638++] = class590.field8680[var3];
                }
            }
            if (class6.field60 < var2) {
                throw new RuntimeException(field5476[1]);
            }
            class6.field60 = 0;
            for (int var4 = 0; var4 < var2; var4++) {
                int var5 = class590.field8680[var4];
                class612 var6 = ((class383) class207.field3184.method977((long) var5, 1)).field5799;
                int var7 = class430.field6332.method156(-10160, 1);
                if (var7 == 0) {
                    class590.field8680[class6.field60++] = var5;
                    var6.field3840 = class190.field2585;
                } else {
                    int var8 = class430.field6332.method156(-10160, 2);
                    if (var8 == 0) {
                        class590.field8680[class6.field60++] = var5;
                        var6.field3840 = class190.field2585;
                        class545.field8146[class172.field2402++] = var5;
                    } else if (var8 == 1) {
                        class590.field8680[class6.field60++] = var5;
                        var6.field3840 = class190.field2585;
                        int var9 = class430.field6332.method156(-10160, 3);
                        var6.method4522(var9, -107, 1);
                        int var10 = class430.field6332.method156(-10160, 1);
                        if (var10 == 1) {
                            class545.field8146[class172.field2402++] = var5;
                        }
                    } else if (var8 == 2) {
                        class590.field8680[class6.field60++] = var5;
                        var6.field3840 = class190.field2585;
                        if (class430.field6332.method156(-10160, 1) == 1) {
                            int var12 = class430.field6332.method156(-10160, 3);
                            var6.method4522(var12, -112, 2);
                            int var13 = class430.field6332.method156(-10160, 3);
                            var6.method4522(var13, -126, 2);
                        } else {
                            int var11 = class430.field6332.method156(-10160, 3);
                            var6.method4522(var11, -109, 0);
                        }
                        int var14 = class430.field6332.method156(-10160, 1);
                        if (var14 == 1) {
                            class545.field8146[class172.field2402++] = var5;
                        }
                    } else if (var8 == 3) {
                        class749.field10904[class454.field6638++] = var5;
                    }
                }
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field5476[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V", line = 152)
    public static void method2917(byte arg0) {
        try {
            field5475 = null;
            field5473 = null;
            if (arg0 != 41) {
                method2917((byte) -22);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5476[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2918(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2919(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 12;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
