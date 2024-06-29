import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class76 {

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1090 = new String[] { method775(method774("\u0002gk.\u0014")), method775(method774("\u0002gk/\u0014")), method775(method774("\u0002gk)\u0014")), method775(method774("\u0013+kEA")), method775(method774("\u0006p)\u0007")), method775(method774("\u0002gk,\u0014")) };

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lsb;")
    public static class261 field1084 = new class261(121, 4);

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Luu;")
    public static class240 field1085 = new class240(6, 1);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Z")
    public static boolean field1088 = false;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Lcb;")
    public static class700 field1087 = new class700();

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[[[B")
    public static byte[][][] field1089;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method770(int arg0) {
        try {
            field1087 = null;
            field1085 = null;
            field1084 = null;
            if (arg0 != 1038186785) {
                field1088 = false;
            }
            field1089 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1090[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)[B")
    public abstract byte[] method539(byte arg0);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
    public static final int method771(int arg0, int arg1) {
        try {
            int var4 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
            field1082++;
            int var5 = (var4 >>> 2 & arg1) + (var4 & 0x33333333);
            int var6 = (var5 >>> 4) + var5 & 0xF0F0F0F;
            int var7 = (var6 >>> 8) + var6;
            int var8 = (var7 >>> 16) + var7;
            return var8 & 0xFF;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1090[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BI)V")
    public abstract void method540(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    public static final void method772(byte arg0) {
        try {
            if (class751.field10694 == 1 || class751.field10694 == 3 || class751.field10694 != class213.field3123 && (class751.field10694 == 0 || class213.field3123 == 0)) {
                class438.field6458 = 0;
                class715.field10182 = 0;
                class479.field7063.method3690((byte) 107);
            }
            field1086++;
            if (arg0 != -111) {
                field1089 = null;
            }
            class213.field3123 = class751.field10694;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1090[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;")
    public static final String method773(byte arg0, String arg1, String arg2, char arg3) {
        try {
            field1083++;
            int var4 = arg2.length();
            int var5 = arg1.length();
            int var6 = var4;
            if (arg0 > -94) {
                return null;
            }
            int var7 = var5 - 1;
            if (var7 != 0) {
                int var8 = 0;
                while (true) {
                    var8 = arg2.indexOf(arg3, var8);
                    if (var8 < 0) {
                        break;
                    }
                    var8++;
                    var6 += var7;
                }
            }
            StringBuffer var9 = new StringBuffer(var6);
            int var10 = 0;
            while (true) {
                int var11 = arg2.indexOf(arg3, var10);
                if (var11 < 0) {
                    var9.append(arg2.substring(var10));
                    return var9.toString();
                }
                var9.append(arg2.substring(var10, var11));
                var10 = var11 + 1;
                var9.append(arg1);
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field1090[5] + arg0 + ',' + (arg1 == null ? field1090[4] : field1090[3]) + ',' + (arg2 == null ? field1090[4] : field1090[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)[B")
    public abstract byte[] method538(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method774(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method775(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 104;
                    break;
                case 1:
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
