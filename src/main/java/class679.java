import java.math.BigInteger;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class679 {

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public int field9650 = 128;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public int field9645 = 128;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public int field9654;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public int field9652;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public int field9659;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public int field9663;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9667 = new String[] { method4949(method4948("uV<k4")), method4949(method4948("uV<o4")), method4949(method4948("uV<m4")), method4949(method4948("uV<h4")), method4949(method4948("uV<l4")), method4949(method4948("kO~F")), method4949(method4948("uV<i4")), method4949(method4948("~\u0014<\u0004a")), method4949(method4948("uV<\u0016ukSf\u00144")), method4949(method4948("uV<b4")), method4949(method4948("%\u0006{G{8")), method4949(method4948("uV<n4")) };

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9653 = new BigInteger(method4949(method4948("4\n\"\u001a-")), 16);

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field9664 = Calendar.getInstance();

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field9666 = Calendar.getInstance(TimeZone.getTimeZone(method4949(method4948("BwF"))));

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public int field9647;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public int field9648;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field9651;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public int field9655;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public int field9656;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public int field9657;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)Lpl;", line = 7)
    public final class679 method4940(byte arg0) {
        try {
            field9660++;
            return arg0 < 27 ? null : new class679(this.field9654, this.field9650, this.field9645, this.field9652, this.field9663, this.field9659);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9667[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V", line = 206)
    public class679(int arg0) {
        try {
            this.field9654 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9667[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(IIIIII)V", line = 214)
    private class679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field9652 = arg3;
            this.field9645 = arg2;
            this.field9654 = arg0;
            this.field9650 = arg1;
            this.field9659 = arg5;
            this.field9663 = arg4;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field9667[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZLpl;)V", line = 35)
    public final void method4941(boolean arg0, class679 arg1) {
        try {
            this.field9652 = arg1.field9652;
            this.field9654 = arg1.field9654;
            this.field9650 = arg1.field9650;
            this.field9645 = arg1.field9645;
            field9646++;
            if (!arg0) {
                this.field9650 = 88;
            }
            this.field9663 = arg1.field9663;
            this.field9659 = arg1.field9659;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9667[9] + arg0 + ',' + (arg1 == null ? field9667[5] : field9667[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZBI)V", line = 52)
    public static final void method4942(boolean arg0, byte arg1, int arg2) {
        try {
            class152.method1382(-5, arg0, arg2, class709.field10214.method5154(class795.field11624, (byte) 65));
            int var3 = 53 % ((arg1 + 44) / 50);
            field9651++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9667[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V", line = 62)
    public static void method4943(byte arg0) {
        try {
            field9664 = null;
            field9666 = null;
            field9653 = null;
            if (arg0 != 99) {
                field9666 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9667[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 74)
    public static final String method4944(int arg0, int[] arg1) {
        try {
            field9661++;
            StringBuffer var2 = new StringBuffer();
            int var3 = class731.field10713;
            for (int var4 = arg0; var4 < arg1.length; var4++) {
                class517 var5 = class161.field2548.method4536(arg1[var4], (byte) 116);
                if (var5.field7661 != -1) {
                    class107 var6 = (class107) class607.field8753.method302(arg0 - 108, (long) var5.field7661);
                    if (var6 == null) {
                        class174 var7 = class174.method1608(class550.field8065, var5.field7661, 0);
                        if (var7 != null) {
                            var6 = class662.field9437.method213(var7, true);
                            class607.field8753.method295(false, (long) var5.field7661, var6);
                        }
                    }
                    if (var6 != null) {
                        class475.field7238[var3] = var6;
                        var2.append(field9667[10]).append(var3).append(">");
                        var3++;
                    }
                }
            }
            return var2.toString();
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field9667[11] + arg0 + ',' + (arg1 == null ? field9667[5] : field9667[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLmj;)V", line = 121)
    public static final void method4945(byte arg0, class683 arg1) {
        try {
            field9665++;
            if (class570.field8260 == arg1.field9763) {
                if (class438.field6846.field10821 == null) {
                    arg1.field9863 = 0;
                    arg1.field9765 = 0;
                } else {
                    arg1.field9727 = 150;
                    arg1.field9879 = (int) (Math.sin((double) class431.field6776 / 40.0D) * 256.0D) & 0x7FF;
                    arg1.field9768 = 5;
                    arg1.field9765 = class356.field5733;
                    arg1.field9863 = class407.method3273(true, class438.field6846.field10821);
                    arg1.field9873 = class438.field6846.field1161;
                    arg1.field9769 = class438.field6846.field1143;
                    arg1.field9874 = 0;
                    arg1.field9824 = class438.field6846.field1121;
                    class210 var2 = arg1.field9824 == -1 ? null : class397.field6293.method2058(arg1.field9824, (byte) 1);
                    if (var2 != null) {
                        class290.method2443((byte) 65, arg1.field9769, var2);
                    }
                }
            } else if (arg0 >= -76) {
                method4943((byte) -12);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9667[6] + arg0 + ',' + (arg1 == null ? field9667[5] : field9667[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 161)
    public static final void method4946(int arg0) {
        try {
            class135.field1910 = null;
            class595.field8594 = null;
            class194.field3055 = null;
            class192.field3021 = -1;
            class184.field2931 = -1;
            class765.field11214 = null;
            class761.field11182 = null;
            class102.field1499 = null;
            class574.field8295 = null;
            if (arg0 == -12284) {
                class751.field11062 = -1;
                field9658++;
                class276.field4418 = -1;
                class212.field3353.method1923(0);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9667[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)V", line = 185)
    public static final void method4947(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg2 > -47) {
                field9664 = null;
            }
            class224.field3519 = new byte[arg1][arg0][arg3];
            field9649++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9667[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4948(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4949(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 28;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
