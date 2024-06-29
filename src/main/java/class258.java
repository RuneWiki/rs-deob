import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public abstract class class258 {

    @OriginalMember(owner = "client!cca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3905 = new String[] { method2175(method2174("\u0005a*f")), method2175(method2174("\u0010:h$l")), method2175(method2174("\bw'$YC")) };

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I[IIIIIII)Z")
    public static final boolean method2168(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            if (arg4 < 0) {
                arg4 = 0;
            }
            if (class115.field1680 < arg7) {
                arg7 = class115.field1680;
            }
            field3903++;
            if (arg7 <= arg4) {
                return true;
            }
            arg5 += arg4 - 1;
            arg0 += arg3 * arg4;
            int var12 = arg7 - arg4 >> 2;
            int var10;
            int var11;
            if (~class353.field5694 == arg6) {
                class74.field1066 += var12;
                while (true) {
                    var12--;
                    if (var12 < 0) {
                        var12 = arg7 - arg4 & 0x3;
                        while (true) {
                            var12--;
                            if (var12 < 0) {
                                return true;
                            }
                            arg5++;
                            if (arg1[arg5] > arg0) {
                                arg1[arg5] = arg0;
                            }
                            arg0 += arg3;
                        }
                    }
                    var11 = arg5 + 1;
                    if (arg1[var11] > arg0) {
                        arg1[var11] = arg0;
                    }
                    var10 = arg0 + arg3;
                    var11++;
                    if (arg1[var11] > var10) {
                        arg1[var11] = var10;
                    }
                    var10 += arg3;
                    var11++;
                    if (var10 < arg1[var11]) {
                        arg1[var11] = var10;
                    }
                    var10 += arg3;
                    arg5 = var11 + 1;
                    if (arg1[arg5] > var10) {
                        arg1[arg5] = var10;
                    }
                    arg0 = var10 + arg3;
                }
            } else {
                arg0 -= 38400;
                while (true) {
                    var12--;
                    if (var12 < 0) {
                        var12 = arg7 - arg4 & 0x3;
                        while (true) {
                            var12--;
                            if (var12 < 0) {
                                return true;
                            }
                            arg5++;
                            if (arg1[arg5] > arg0) {
                                return false;
                            }
                            arg0 += arg3;
                        }
                    }
                    int var10000 = ~arg0;
                    var11 = arg5 + 1;
                    if (var10000 > ~arg1[var11]) {
                        return false;
                    }
                    var10 = arg0 + arg3;
                    var11++;
                    if (arg1[var11] > var10) {
                        return false;
                    }
                    var10 += arg3;
                    var10000 = ~var10;
                    var11++;
                    if (var10000 > ~arg1[var11]) {
                        return false;
                    }
                    var10 += arg3;
                    var10000 = ~var10;
                    arg5 = var11 + 1;
                    if (var10000 > ~arg1[arg5]) {
                        return false;
                    }
                    arg0 = var10 + arg3;
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3905[2] + arg0 + ',' + (arg1 == null ? field3905[0] : field3905[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "([BZII)V")
    public abstract void method2169(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
    public abstract void method2170(int arg0);

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)Z")
    public abstract boolean method2171(byte arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "([BIII)I")
    public abstract int method2172(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
    public abstract void method2173(byte arg0);

    @OriginalMember(owner = "client!cca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2174(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2175(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 20;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
