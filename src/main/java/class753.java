import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class753 extends class742 {

    @OriginalMember(owner = "client!cja", name = "s", descriptor = "I")
    public int field10765;

    @OriginalMember(owner = "client!cja", name = "r", descriptor = "I")
    public int field10764;

    @OriginalMember(owner = "client!cja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10769 = new String[] { method5461(method5460("\u0018,\u001d\fwS")), method5461(method5460("\u0018,\u001d\ftS")), method5461(method5460("\u00153\u0010N")), method5461(method5460("\u0000hR\fH")), method5461(method5460("\u0018,\u001d\f\t\u0012(\u0015V\u000bS")), method5461(method5460("\u0018,\u001d\fvS")) };

    @OriginalMember(owner = "client!cja", name = "t", descriptor = "I")
    public static int field10766 = 0;

    @OriginalMember(owner = "client!cja", name = "q", descriptor = "I")
    public static int field10763;

    @OriginalMember(owner = "client!cja", name = "u", descriptor = "I")
    public static int field10767;

    @OriginalMember(owner = "client!cja", name = "v", descriptor = "[[B")
    public static byte[][] field10768;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(BII)Z")
    public static final boolean method5458(byte arg0, int arg1, int arg2) {
        try {
            field10767++;
            int var3 = -10 / ((61 - arg0) / 49);
            if (((arg1 & 0x10000) != 0 | class639.method4653(arg1, arg2, -4413)) || class375.method2967(arg2, arg1, 4)) {
                return true;
            } else {
                return (arg2 & 0x37) == 0 && class754.method5469(arg1, arg2, 12529);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10769[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)V")
    public static void method5459(byte arg0) {
        try {
            int var1 = -73 / ((-arg0 - 7) / 45);
            field10768 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10769[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)Luu;")
    public final class240 method482(int arg0) {
        try {
            field10763++;
            if (arg0 != 0) {
                method5458((byte) -96, 114, -27);
            }
            return class345.field5029;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10769[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(Lrj;Lmq;IIIIIIIII)V")
    public class753(class252 arg0, class657 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        try {
            this.field10765 = arg10;
            this.field10764 = arg9;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field10769[4] + (arg0 == null ? field10769[2] : field10769[3]) + ',' + (arg1 == null ? field10769[2] : field10769[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!cja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5460(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5461(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 124;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
