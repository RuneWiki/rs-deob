import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class178 {

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2873 = new String[] { method1701(method1700("}U}a0")), method1701(method1700("}U}b0")), method1701(method1700("}U}c0")), method1701(method1700("}U}d0")) };

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "[Z")
    public static boolean[] field2871 = new boolean[100];

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V", line = 7)
    public static final void method1696(boolean arg0) {
        try {
            class683.field9892 = class185.field2943;
            class42.field477 = -1;
            if (!arg0) {
                class193.field3048 = 1;
                field2868++;
                class442.method3466(true, "", 2116, class748.field11039.equals(""), class748.field11039);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2873[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V", line = 22)
    public static final void method1697(int arg0, int arg1, int arg2) {
        try {
            field2869++;
            int var3 = client.field5163.method498(class709.field10226.method5154(class795.field11624, (byte) 65), -1);
            int var6;
            if (class595.field8598) {
                for (class603 var7 = (class603) class580.field8365.method5147((byte) -52); var7 != null; var7 = (class603) class580.field8365.method5144(256)) {
                    int var8;
                    if (var7.field8711 == 1) {
                        var8 = class343.method2883(-1002, (class59) var7.field8713.field10193.field7074);
                    } else {
                        var8 = class304.method2611(3246, var7);
                    }
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
                class209.field3290 = class681.field9707 * 16 + (class793.field11597 ? 26 : 22);
                var3 += 8;
                var6 = class681.field9707 * 16 + 21;
            } else {
                for (class59 var4 = (class59) class439.field6858.method3228(11); var4 != null; var4 = (class59) class439.field6858.method3216(true)) {
                    int var5 = class343.method2883(-1002, var4);
                    if (var3 < var5) {
                        var3 = var5;
                    }
                }
                var3 += 8;
                var6 = class320.field5213 * 16 + 21;
                class209.field3290 = (class793.field11597 ? 26 : 22) + class320.field5213 * 16;
            }
            int var9 = arg2 - var3 / 2;
            if (arg1 == 29225) {
                if ((var3 + var9) > class64.field881) {
                    var9 = class64.field881 - var3;
                }
                if (var9 < 0) {
                    var9 = 0;
                }
                int var10 = arg0;
                if (var6 + arg0 > class333.field5444) {
                    var10 = class333.field5444 - var6;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                class65.field897 = var9;
                class606.field8725 = var10;
                class16.field177 = true;
                class489.field7379 = var3;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field2873[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V", line = 104)
    public static void method1698(boolean arg0) {
        try {
            field2871 = null;
            if (!arg0) {
                field2871 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2873[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)B", line = 116)
    public static final byte method1699(int arg0, int arg1, int arg2) {
        try {
            if (arg0 != 18123) {
                field2871 = null;
            }
            field2870++;
            if (arg1 == 9) {
                return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
            } else {
                return 0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2873[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1700(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1701(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
