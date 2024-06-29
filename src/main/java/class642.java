import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class642 implements class105 {

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "I")
    public int field9215;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "Ltda;")
    public class666 field9203;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "Ljava/lang/String;")
    public String field9204;

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
    public int field9218;

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "I")
    public int field9207;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public int field9208;

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
    public int field9206;

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "Ljk;")
    public class662 field9214;

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
    public int field9202;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public int field9205;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
    public int field9217;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
    public int field9209;

    @OriginalMember(owner = "client!jaa", name = "q", descriptor = "I")
    public int field9219;

    @OriginalMember(owner = "client!jaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9221 = new String[] { method4653(method4652("/Q\r\u000f\u0017")), method4653(method4652(":\nOM")), method4653(method4652(">\u001eB\u000fV=\u0011JUT|")), method4653(method4652(">\u001eB\u000f.|")), method4653(method4652(">\u001eB\u000f)|")), method4653(method4652(">\u001eB\u000f+|")), method4653(method4652(">\u001eB\u000f(|")) };

    @OriginalMember(owner = "client!jaa", name = "n", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!jaa", name = "p", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!jaa", name = "l", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 14)
    public static final Class method4649(byte arg0, String arg1) throws ClassNotFoundException {
        try {
            field9213++;
            if (arg1.equals("B")) {
                return Byte.TYPE;
            } else if (arg1.equals("I")) {
                return Integer.TYPE;
            } else if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else {
                if (arg0 <= 63) {
                    method4650(87);
                }
                if (arg1.equals("Z")) {
                    return Boolean.TYPE;
                } else if (arg1.equals("F")) {
                    return Float.TYPE;
                } else if (arg1.equals("D")) {
                    return Double.TYPE;
                } else if (arg1.equals("C")) {
                    return Character.TYPE;
                } else {
                    return Class.forName(arg1);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9221[3] + arg0 + ',' + (arg1 == null ? field9221[1] : field9221[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V", line = 54)
    public static final void method4650(int arg0) {
        try {
            class640.field9178.method298(5);
            field9212++;
            if (arg0 != 1) {
                method4650(-123);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9221[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)Lot;", line = 67)
    public static final class617 method4651(int arg0, int arg1) {
        try {
            field9216++;
            class617 var2 = (class617) class54.field688.method302(-116, (long) arg0);
            if (var2 != null) {
                return var2;
            }
            byte[] var3 = class124.field1807.method604((byte) -119, arg0, 1);
            class617 var4 = new class617();
            var4.field8898 = arg0;
            if (var3 != null) {
                var4.method4507((byte) 79, new class176(var3));
            }
            var4.method4503(false);
            if (var4.field8902 == 2 && class97.field1432.method737((byte) -39, (long) arg0) == null) {
                class97.field1432.method738(new class272(class316.field5133), (long) arg0, -12002);
                class276.field4421[class316.field5133++] = var4;
            }
            class54.field688.method295(false, (long) arg0, var4);
            if (arg1 > -125) {
                field9220 = 107;
            }
            return var4;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9221[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)Lwh;", line = 106)
    public final class155 method989(boolean arg0) {
        try {
            field9211++;
            if (arg0) {
                method4651(71, -57);
            }
            return class623.field8992;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9221[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Ljava/lang/String;Ljk;Ltda;IIIIIIIIII)V", line = 120)
    public class642(String arg0, class662 arg1, class666 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        try {
            this.field9215 = arg10;
            this.field9203 = arg2;
            this.field9204 = arg0;
            this.field9218 = arg5;
            this.field9207 = arg4;
            this.field9208 = arg12;
            this.field9206 = arg7;
            this.field9214 = arg1;
            this.field9202 = arg3;
            this.field9205 = arg8;
            this.field9217 = arg9;
            this.field9209 = arg6;
            this.field9219 = arg11;
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field9221[2] + (arg0 == null ? field9221[1] : field9221[0]) + ',' + (arg1 == null ? field9221[1] : field9221[0]) + ',' + (arg2 == null ? field9221[1] : field9221[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!jaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4652(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4653(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 35;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
