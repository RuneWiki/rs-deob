import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class384 implements class285 {

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public int field5810;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public int field5809;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public int field5806;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public int field5815;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public int field5804;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Llk;")
    public class613 field5805;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public int field5807;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public int field5814;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lvea;")
    public class288 field5813;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5818 = new String[] { method3074(method3073(")+`A")), method3074(method3073("%=\"\u0011[)7x\u0013\u001a")), method3074(method3073("<p\"\u0003O")), method3074(method3073("%=\"l\u001a")), method3074(method3073("%=\"j\u001a")) };

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field5811 = 0;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lel;")
    public static class573 field5808 = new class573(44, 0);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field5816 = 0;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 4)
    public static void method3072(int arg0) {
        try {
            if (arg0 != -3436) {
                field5816 = -68;
            }
            field5808 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5818[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Lvaa;", line = 18)
    public class494 method1226(int arg0) {
        try {
            field5812++;
            int var2 = -67 % ((57 - arg0) / 61);
            return null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5818[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Llk;Lvea;IIIIIII)V", line = 48)
    public class384(class613 arg0, class288 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            this.field5810 = arg5;
            this.field5809 = arg4;
            this.field5806 = arg7;
            this.field5815 = arg8;
            this.field5804 = arg2;
            this.field5805 = arg0;
            this.field5807 = arg3;
            this.field5814 = arg6;
            this.field5813 = arg1;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field5818[1] + (arg0 == null ? field5818[0] : field5818[2]) + ',' + (arg1 == null ? field5818[0] : field5818[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3073(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3074(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 94;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 45;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
