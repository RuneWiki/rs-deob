import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class75 extends class215 {

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public int field869;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "Ljava/lang/String;")
    public String field868;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "S")
    public short field866;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field870 = new String[] { method677(method676(")4Mz@")), method677(method676("#rM\u0015\u0015")), method677(method676("6)\u000fW")), method677(method676(")4M\u0007\u000165\u0017\u0005@")) };

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Lhg;")
    public static final class718 method675(int arg0, int arg1) {
        try {
            field867++;
            if (arg0 == 0) {
                if ((double) class161.field2163 == 3.0D) {
                    return class753.field10965;
                }
                if ((double) class161.field2163 == 4.0D) {
                    return class253.field3922;
                }
                if ((double) class161.field2163 == 6.0D) {
                    return class628.field9194;
                }
                if ((double) class161.field2163 >= 8.0D) {
                    return class133.field1556;
                }
            } else if (arg0 == 1) {
                if ((double) class161.field2163 == 3.0D) {
                    return class628.field9194;
                }
                if ((double) class161.field2163 == 4.0D) {
                    return class133.field1556;
                }
                if ((double) class161.field2163 == 6.0D) {
                    return class647.field9369;
                }
                if ((double) class161.field2163 >= 8.0D) {
                    return class439.field6483;
                }
            } else if (arg0 == 2) {
                if ((double) class161.field2163 == 3.0D) {
                    return class647.field9369;
                }
                if ((double) class161.field2163 == 4.0D) {
                    return class439.field6483;
                }
                if ((double) class161.field2163 == 6.0D) {
                    return class253.field3929;
                }
                if ((double) class161.field2163 >= 8.0D) {
                    return class643.field9315;
                }
            }
            if (arg1 != 1) {
                method675(77, -93);
            }
            return null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field870[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class75(String arg0, int arg1) {
        try {
            this.field869 = (int) (class430.method3299(110) / 1000L);
            this.field868 = arg0;
            this.field866 = (short) arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field870[3] + (arg0 == null ? field870[2] : field870[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method676(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method677(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 88;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
