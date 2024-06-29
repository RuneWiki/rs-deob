import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class506 extends class756 {

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Ljava/lang/String;")
    private String field7329 = null;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "J")
    private long field7327 = -1L;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7335 = new String[] { method3817(method3816("0=\u0002O\t/0\u000e^\u0004g")), method3817(method3816("}5\n@\u000e8*\u0001L\u00018b")), method3817(method3816("&vA\u0003\u0011")), method3817(method3816("?1AoD")), method3817(method3816("3-\u0003A")), method3817(method3816("?1AlD")), method3817(method3816("?1AnD")), method3817(method3816("?1AkD")), method3817(method3816("?1AiD")), method3817(method3816("?1AhD")) };

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "Lel;")
    public static class573 field7326 = new class573(12, -2);

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "Ldv;")
    public static class685 field7333 = new class685(2, 4, 4, 0);

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "J")
    public static long field7334;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLib;)V", line = 7)
    public final void method38(byte arg0, class163 arg1) {
        try {
            if (arg1.method1455((byte) 62) != 255) {
                arg1.field2201--;
                this.field7327 = arg1.method1435(19);
            }
            field7332++;
            if (arg0 > 32) {
                this.field7329 = arg1.method1401(0);
                if (class288.field4281) {
                    System.out.println(field7335[0] + this.field7327 + field7335[1] + this.field7329);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7335[3] + arg0 + ',' + (arg1 == null ? field7335[4] : field7335[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V", line = 34)
    public static final void method3812(int arg0, int arg1, int arg2) {
        try {
            field7328++;
            class313 var3 = class196.method1670((long) arg0, 6, arg1 ^ 0x3);
            var3.method2636((byte) -2);
            if (arg1 == -48) {
                var3.field4951 = arg2;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7335[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 49)
    public static void method3813(int arg0) {
        try {
            field7333 = null;
            field7326 = null;
            if (arg0 != 255) {
                field7326 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7335[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lkp;I)V", line = 63)
    public final void method41(class514 arg0, int arg1) {
        try {
            if (arg1 == 9893) {
                arg0.method3891(this.field7327, true, this.field7329);
                field7330++;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7335[6] + (arg0 == null ? field7335[4] : field7335[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 82)
    public static final String method3814(int arg0, String arg1) {
        try {
            field7331++;
            StringBuffer var2 = new StringBuffer();
            int var3 = arg1.length();
            if (arg0 != 48) {
                field7333 = null;
            }
            for (int var4 = 0; var4 < var3; var4++) {
                char var5 = arg1.charAt(var4);
                if (var5 == '%' && var3 > var4 + 2) {
                    char var6 = arg1.charAt(var4 + 1);
                    boolean var7 = false;
                    int var8;
                    if (var6 >= '0' && var6 <= '9') {
                        var8 = var6 - 48;
                    } else if (var6 >= 'a' && var6 <= 'f') {
                        var8 = var6 + '\n' - 97;
                    } else {
                        if (var6 < 'A' || var6 > 'F') {
                            var2.append('%');
                            continue;
                        }
                        var8 = var6 - 55;
                    }
                    char var9 = arg1.charAt(var4 + 2);
                    int var10 = var8 * 16;
                    int var11;
                    if (var9 >= '0' && var9 <= '9') {
                        var11 = var9 + var10 - 48;
                    } else if (var9 >= 'a' && var9 <= 'f') {
                        var11 = var9 + var10 + '\n' - 97;
                    } else {
                        if (var9 < 'A' || var9 > 'F') {
                            var2.append('%');
                            continue;
                        }
                        var11 = var9 + var10 + '\n' - 65;
                    }
                    if (var11 != 0 && class497.method3755(true, (byte) var11)) {
                        var2.append(class259.method2185(-161, (byte) var11));
                    }
                    var4 += 2;
                } else if (var5 == '+') {
                    var2.append(' ');
                } else {
                    var2.append(var5);
                }
            }
            return var2.toString();
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field7335[5] + arg0 + ',' + (arg1 == null ? field7335[4] : field7335[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIIIIII)V", line = 159)
    public static final void method3815(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class179.field2493 = arg4;
            class155.field1910 = arg2;
            class290.field4313 = arg6;
            class315.field4975 = arg1;
            class361.field5517 = arg3;
            field7325++;
            if (arg5 != 32252) {
                method3814(5, null);
            }
            if (arg0 && class290.field4313 >= 100) {
                class271.field4116 = class361.field5517 * 512 + 256;
                class683.field9899 = class315.field4975 * 512 + 256;
                class144.field1749 = class316.method2656(class271.field4116, class520.field7618, class683.field9899, 0) - class179.field2493;
            }
            class238.field3617 = -1;
            class730.field10605 = -1;
            class185.field2559 = 2;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field7335[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3816(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3817(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 111;
                    break;
                case 3:
                    var10005 = 45;
                    break;
                default:
                    var10005 = 108;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
