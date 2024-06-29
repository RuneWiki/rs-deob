import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class256 {

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public int field3892 = 128;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public int field3896 = 128;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public int field3895;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public int field3887;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public int field3891;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3898 = new String[] { method2165(method2164("\u0006yl\u007f\u007f\u0006z6}>")), method2165(method2164("\u0006yl\u0002>")), method2165(method2164("\u0006yl\u0001>")), method2165(method2164("\u0006f./")), method2165(method2164("\u0013=lmk")), method2165(method2164("\u0006yl\u0007>")), method2165(method2164("\u0006yl\u0000>")) };

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lhl;")
    public static class556 field3890 = new class556(78, 12);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Lsj;")
    public static class486 field3897;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Lnj;", line = 4)
    public final class256 method2160(int arg0) {
        try {
            if (arg0 >= -98) {
                method2162(null, -83, null, -109);
            }
            field3888++;
            return new class256(this.field3889, this.field3896, this.field3892, this.field3895, this.field3887, this.field3891);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3898[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V", line = 77)
    public class256(int arg0) {
        try {
            this.field3889 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3898[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIII)V", line = 84)
    private class256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field3896 = arg1;
            this.field3895 = arg3;
            this.field3887 = arg4;
            this.field3889 = arg0;
            this.field3892 = arg2;
            this.field3891 = arg5;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3898[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 26)
    public static void method2161(byte arg0) {
        try {
            field3890 = null;
            if (arg0 != 97) {
                field3890 = null;
            }
            field3897 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3898[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V", line = 44)
    public static final void method2162(String arg0, int arg1, String arg2, int arg3) {
        try {
            class683.field9892 = class185.field2948;
            class193.field3048 = 2;
            class42.field477 = arg3;
            field3893++;
            class442.method3466(false, arg2, 2116, false, arg0);
            if (arg1 != 6609) {
                method2161((byte) -119);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3898[2] + (arg0 == null ? field3898[3] : field3898[4]) + ',' + arg1 + ',' + (arg2 == null ? field3898[3] : field3898[4]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILnj;)V", line = 59)
    public final void method2163(int arg0, class256 arg1) {
        try {
            this.field3895 = arg1.field3895;
            if (arg0 > -110) {
                this.field3889 = 104;
            }
            this.field3889 = arg1.field3889;
            field3894++;
            this.field3887 = arg1.field3887;
            this.field3891 = arg1.field3891;
            this.field3892 = arg1.field3892;
            this.field3896 = arg1.field3896;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3898[6] + arg0 + ',' + (arg1 == null ? field3898[3] : field3898[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2164(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2165(char[] arg0) {
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
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
