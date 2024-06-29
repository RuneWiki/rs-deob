import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class538 implements class285 {

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
    public int field7895;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
    public int field7886;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "Ljava/lang/String;")
    public String field7885;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    public int field7898;

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "I")
    public int field7884;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "Llk;")
    public class613 field7899;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
    public int field7900;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
    public int field7889;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public int field7894;

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "Lvea;")
    public class288 field7897;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
    public int field7883;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
    public int field7890;

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
    public int field7891;

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7902 = new String[] { method4061(method4060("pTBZ6")), method4061(method4060("e\u000f\u0000\u0018")), method4061(method4060("~\u0019\rZwb\u0014\u0005\u0000u#")), method4061(method4060("~\u0019\rZ\u000f#")), method4061(method4060("~\u0019\rZ\t#")), method4061(method4060("~\u0019\rZ\n#")), method4061(method4060("~\u0019\rZ\b#")) };

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
    public static int field7888 = 500;

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "[F")
    public static float[] field7901 = new float[4];

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILic;)I", line = 3)
    public static final int method4057(int arg0, class726 arg1) {
        try {
            field7896++;
            if (arg0 != 4) {
                return -93;
            }
            int var2 = arg1.field10504;
            class144 var3 = arg1.method2099(arg0 ^ 0x61);
            if (arg1.field3796 == -1 || arg1.field3849) {
                var2 = arg1.field10518;
            } else if (arg1.field3796 == var3.field1729 || arg1.field3796 == var3.field1742 || arg1.field3796 == var3.field1763 || arg1.field3796 == var3.field1748) {
                var2 = arg1.field10534;
            } else if (arg1.field3796 == var3.field1725 || arg1.field3796 == var3.field1773 || arg1.field3796 == var3.field1745 || arg1.field3796 == var3.field1735) {
                var2 = arg1.field10501;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7902[3] + arg0 + ',' + (arg1 == null ? field7902[1] : field7902[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)V", line = 37)
    public static void method4058(boolean arg0) {
        try {
            field7901 = null;
            if (!arg0) {
                method4058(true);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7902[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)Lvaa;", line = 48)
    public final class494 method1226(int arg0) {
        try {
            int var2 = 71 / ((57 - arg0) / 61);
            field7893++;
            return class724.field10464;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7902[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)I", line = 74)
    public static final int method4059(int arg0) {
        try {
            if (arg0 != 500) {
                field7901 = null;
            }
            field7887++;
            return class759.field11004;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7902[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Ljava/lang/String;Llk;Lvea;IIIIIIIIII)V", line = 85)
    public class538(String arg0, class613 arg1, class288 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        try {
            this.field7895 = arg6;
            this.field7886 = arg3;
            this.field7885 = arg0;
            this.field7898 = arg7;
            this.field7884 = arg11;
            this.field7899 = arg1;
            this.field7900 = arg5;
            this.field7889 = arg8;
            this.field7894 = arg10;
            this.field7897 = arg2;
            this.field7883 = arg9;
            this.field7890 = arg12;
            this.field7891 = arg4;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field7902[2] + (arg0 == null ? field7902[1] : field7902[0]) + ',' + (arg1 == null ? field7902[1] : field7902[0]) + ',' + (arg2 == null ? field7902[1] : field7902[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4060(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4061(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
