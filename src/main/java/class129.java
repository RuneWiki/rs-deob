import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class129 extends class592 {

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "S")
    public short field1606;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "Ljava/lang/String;")
    public String field1610;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1612 = new String[] { method1140(method1139("zNb\u001dO")), method1140(method1139("zNb\u001eO")), method1140(method1139("dI 3")), method1140(method1139("q\u0012bq\u001a")), method1140(method1139("zNbc\u000edU8aO")), method1140(method1139("zNb\u001cO")) };

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "Ltf;")
    public static class524 field1605 = new class524();

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "Lo;")
    public static class484 field1607;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "Lnn;")
    public static class655 field1611;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "[I")
    public static int[] field1608;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)V", line = 3)
    public static void method1136(boolean arg0) {
        try {
            field1605 = null;
            field1608 = null;
            field1611 = null;
            if (arg0) {
                method1137(-112L, -90);
            }
            field1607 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1612[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(JI)V", line = 17)
    public static final void method1137(long arg0, int arg1) {
        try {
            field1604++;
            int var3 = class36.field439;
            if (class222.field3217 != var3) {
                int var4 = var3 - class222.field3217;
                int var5 = (int) ((long) var4 * arg0 / 320L);
                if (var4 <= 0) {
                    if (var5 == 0) {
                        var5 = -1;
                    } else if (var5 < var4) {
                        var5 = var4;
                    }
                } else if (var5 == 0) {
                    var5 = 1;
                } else if (var4 < var5) {
                    var5 = var4;
                }
                class222.field3217 += var5;
            }
            if (arg1 != -1) {
                field1607 = null;
            }
            int var6 = class138.field1805;
            class349.field5057 += (float) arg0 * class292.field4112 / 40.0F * 8.0F;
            if (class604.field8658 != var6) {
                int var7 = var6 - class604.field8658;
                int var8 = (int) ((long) var7 * arg0 / 320L);
                if (var7 <= 0) {
                    if (var8 == 0) {
                        var8 = -1;
                    } else if (var7 > var8) {
                        var8 = var7;
                    }
                } else if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
                class604.field8658 += var8;
            }
            class607.field8706 += (float) arg0 * class238.field3441 / 40.0F * 8.0F;
            class626.method4600(-20556);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field1612[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Liga;Luja;Lha;IILo;III)V", line = 107)
    public static final void method1138(class353 arg0, class475 arg1, class18 arg2, int arg3, int arg4, class484 arg5, int arg6, int arg7, int arg8) {
        try {
            if (arg3 < 50) {
                method1136(true);
            }
            field1609++;
            int var9 = arg7 - (arg4 / 2) - 5;
            int var10 = arg8 + 2;
            if (arg1.field6988 != 0) {
                arg2.method121(arg4 + 10, var9, 114, arg8 + (arg5.method3736() * arg6) + 1 - var10, arg1.field6988, var10);
            }
            if (arg1.field7001 != 0) {
                arg2.method241(arg5.method3736() * arg6 + (arg8 - var10) + 1, var10, arg1.field7001, -21, arg4 + 10, var9);
            }
            int var11 = arg1.field6982;
            if (arg0.field5111 && arg1.field6983 != -1) {
                var11 = arg1.field6983;
            }
            for (int var12 = 0; var12 < arg6; var12++) {
                String var13 = class583.field8417[var12];
                if (var12 < (arg6 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                arg5.method3739(arg2, var13, arg7, arg8, var11, true);
                arg8 += arg5.method3736();
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field1612[1] + (arg0 == null ? field1612[2] : field1612[3]) + ',' + (arg1 == null ? field1612[2] : field1612[3]) + ',' + (arg2 == null ? field1612[2] : field1612[3]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field1612[2] : field1612[3]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 149)
    public class129(String arg0, int arg1) {
        try {
            this.field1603 = (int) (class614.method4531(-67) / 1000L);
            this.field1606 = (short) arg1;
            this.field1610 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1612[4] + (arg0 == null ? field1612[2] : field1612[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1139(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x67);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1140(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 95;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
