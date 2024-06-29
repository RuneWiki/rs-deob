import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class541 implements class105 {

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
    public int field7968;

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "Ljk;")
    public class662 field7974;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    public int field7971;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public int field7970;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "Ltda;")
    public class666 field7973;

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7979 = new String[] { method4032(method4031(":{ !")), method4032(method4031("/ bc\u0012")), method4032(method4031(":i-cS=`%9Q|")), method4032(method4031(":i-c(|")), method4032(method4031(":i-c-|")), method4032(method4031(":i-c*|")), method4032(method4031(":i-c)|")), method4032(method4031(":i-c+|")) };

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "Lhl;")
    public static class556 field7978;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "F")
    public static float field7975;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
    public static int field7976;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
    public static int field7977;

    static {
        new BitSet(65536);
        field7978 = new class556(67, 8);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(BIIIIII[[[BILha;III)V", line = 3)
    public static final void method4027(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int arg8, class63 arg9, int arg10, int arg11, int arg12) {
        try {
            if (arg0 < -34) {
                field7972++;
                if (arg10 != 0 && arg3 != 0) {
                    if (arg10 == 9) {
                        arg6 = arg6 + 1 & 0x3;
                        arg10 = 1;
                    }
                    if (arg10 == 10) {
                        arg6 = arg6 + 3 & 0x3;
                        arg10 = 1;
                    }
                    if (arg10 == 11) {
                        arg6 = arg6 + 3 & 0x3;
                        arg10 = 8;
                    }
                    arg9.method168(arg4, arg5, arg1, arg2, arg12, arg11, arg7[arg10 - 1][arg6], arg3, arg8);
                }
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field7979[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field7979[0] : field7979[1]) + ',' + arg8 + ',' + (arg9 == null ? field7979[0] : field7979[1]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)Lwh;", line = 47)
    public class155 method989(boolean arg0) {
        try {
            field7969++;
            if (arg0) {
                this.field7971 = -33;
            }
            return class39.field443;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7979[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIB)Z", line = 59)
    public static final boolean method4028(int arg0, int arg1, byte arg2) {
        try {
            field7967++;
            if (arg1 >= 0 && arg0 >= 0 && class224.field3519[1].length > arg1 && class224.field3519[1][arg1].length > arg0) {
                if (arg2 != 113) {
                    field7977 = -47;
                }
                return (class224.field3519[1][arg1][arg0] & 0x2) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7979[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)Z", line = 82)
    public static final boolean method4029(int arg0, int arg1, int arg2) {
        try {
            field7976++;
            if (arg2 >= -73) {
                return true;
            } else {
                return (arg1 & 0x37) != 0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7979[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(ILjk;Ltda;II)V", line = 95)
    public class541(int arg0, class662 arg1, class666 arg2, int arg3, int arg4) {
        try {
            this.field7968 = arg0;
            this.field7974 = arg1;
            this.field7971 = arg3;
            this.field7970 = arg4;
            this.field7973 = arg2;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7979[2] + arg0 + ',' + (arg1 == null ? field7979[0] : field7979[1]) + ',' + (arg2 == null ? field7979[0] : field7979[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V", line = 112)
    public static void method4030(int arg0) {
        try {
            field7978 = null;
            if (arg0 > -30) {
                method4029(-99, 110, 121);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7979[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4031(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4032(char[] arg0) {
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
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 77;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
