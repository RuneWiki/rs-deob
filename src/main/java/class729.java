import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class729 {

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "[I")
    public int[] field10682;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "[S")
    public short[] field10680;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "J")
    public long field10681;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "[S")
    public short[] field10677;

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10683 = new String[] { method5289(method5288("5L6B\u0005?Tl@D")), method5289(method5288("?Ht\u0012")), method5289(method5288("*\u00136P\u0011")), method5289(method5288("5L6?D")) };

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "F")
    public static float field10679 = 0.25F;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field10678;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IJI)Ljava/lang/String;", line = 4)
    public static final String method5287(int arg0, long arg1, int arg2) {
        try {
            class310.method2659(arg1, (byte) 78);
            if (arg0 != 10) {
                field10679 = -1.0472717F;
            }
            field10678++;
            int var4 = class679.field9664.get(5);
            int var5 = class679.field9664.get(2) + 1;
            int var6 = class679.field9664.get(1);
            return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10683[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(J[I[S[S)V", line = 26)
    public class729(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        try {
            this.field10682 = arg1;
            this.field10680 = arg3;
            this.field10681 = arg0;
            this.field10677 = arg2;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field10683[0] + arg0 + ',' + (arg1 == null ? field10683[1] : field10683[2]) + ',' + (arg2 == null ? field10683[1] : field10683[2]) + ',' + (arg3 == null ? field10683[1] : field10683[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V", line = 39)
    protected class729() {
    }

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5288(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5289(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 61;
                    break;
                case 2:
                    var10005 = 24;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 108;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
