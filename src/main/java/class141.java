import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class141 {

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public int field1831 = 0;

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1838 = new String[] { method1227(method1226("{x*Y")), method1227(method1226("n#h\u001bG")), method1227(method1226("bi'\u001bx=")), method1227(method1226("bi'\u001by=")), method1227(method1226("bi'\u001b{=")), method1227(method1226("bi'\u001b~=")) };

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILjc;)V")
    public final void method1222(int arg0, class711 arg1) {
        try {
            if (arg0 <= 99) {
                this.field1831 = 10;
            }
            while (true) {
                int var3 = arg1.method5128(0);
                if (var3 == 0) {
                    field1836++;
                    return;
                }
                this.method1225(arg1, var3, 353);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1838[5] + arg0 + ',' + (arg1 == null ? field1838[0] : field1838[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method1223(int arg0, String arg1) {
        try {
            field1833++;
            int var2 = arg1.length();
            byte[] var3 = new byte[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                char var5 = arg1.charAt(var4);
                if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                    var3[var4] = (byte) var5;
                } else if (var5 == '€') {
                    var3[var4] = -128;
                } else if (var5 == '‚') {
                    var3[var4] = -126;
                } else if (var5 == 'ƒ') {
                    var3[var4] = -125;
                } else if (var5 == '„') {
                    var3[var4] = -124;
                } else if (var5 == '…') {
                    var3[var4] = -123;
                } else if (var5 == '†') {
                    var3[var4] = -122;
                } else if (var5 == '‡') {
                    var3[var4] = -121;
                } else if (var5 == 'ˆ') {
                    var3[var4] = -120;
                } else if (var5 == '‰') {
                    var3[var4] = -119;
                } else if (var5 == 'Š') {
                    var3[var4] = -118;
                } else if (var5 == '‹') {
                    var3[var4] = -117;
                } else if (var5 == 'Œ') {
                    var3[var4] = -116;
                } else if (var5 == 'Ž') {
                    var3[var4] = -114;
                } else if (var5 == '‘') {
                    var3[var4] = -111;
                } else if (var5 == '’') {
                    var3[var4] = -110;
                } else if (var5 == '“') {
                    var3[var4] = -109;
                } else if (var5 == '”') {
                    var3[var4] = -108;
                } else if (var5 == '•') {
                    var3[var4] = -107;
                } else if (var5 == '–') {
                    var3[var4] = -106;
                } else if (var5 == '—') {
                    var3[var4] = -105;
                } else if (var5 == '˜') {
                    var3[var4] = -104;
                } else if (var5 == '™') {
                    var3[var4] = -103;
                } else if (var5 == 'š') {
                    var3[var4] = -102;
                } else if (var5 == '›') {
                    var3[var4] = -101;
                } else if (var5 == 'œ') {
                    var3[var4] = -100;
                } else if (var5 == 'ž') {
                    var3[var4] = -98;
                } else if (var5 == 'Ÿ') {
                    var3[var4] = -97;
                } else {
                    var3[var4] = 63;
                }
            }
            if (arg0 == 5779) {
                return var3;
            } else {
                return null;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1838[4] + arg0 + ',' + (arg1 == null ? field1838[0] : field1838[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method1224(byte arg0, String arg1) {
        try {
            if (arg0 < 44) {
                method1224((byte) -57, null);
            }
            field1835++;
            return class231.field3344.containsKey(arg1);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1838[2] + arg0 + ',' + (arg1 == null ? field1838[0] : field1838[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljc;II)V")
    private final void method1225(class711 arg0, int arg1, int arg2) {
        try {
            if (arg1 == 5) {
                this.field1831 = arg0.method5116((byte) -123);
            }
            if (arg2 != 353) {
                this.field1831 = 123;
            }
            field1837++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1838[3] + (arg0 == null ? field1838[0] : field1838[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1226(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1227(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
