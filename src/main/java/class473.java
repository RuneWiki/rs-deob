import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class473 {

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "S")
    public short field7225;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public int field7224;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "S")
    public short field7221;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "B")
    public byte field7218;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "S")
    public short field7220;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "B")
    public byte field7222;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Z")
    public boolean field7226;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public int field7227;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7228 = new String[] { method3633(method3632("\u0010\u000e@mw")), method3633(method3632("\u0010\u000e@nw")), method3633(method3632("\u0010\u000e@\u00136\u000e\u0015\u001a\u0011w")) };

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)Lmp;", line = 10)
    public static final class796 method3630(int arg0, int arg1) {
        try {
            field7223++;
            class796[] var2 = class480.method3663((byte) 90);
            for (int var3 = 0; var3 < var2.length; var3++) {
                class796 var4 = var2[var3];
                if (var4.field11632 == arg1) {
                    return var4;
                }
            }
            if (arg0 >= -85) {
                method3630(36, -73);
            }
            return null;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7228[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)Ljca;", line = 37)
    public static final class715 method3631(int arg0, int arg1) {
        try {
            field7219++;
            class715[] var2 = class651.method4747((byte) 73);
            int var3 = 15 % ((arg1 - 21) / 50);
            for (int var4 = 0; var4 < var2.length; var4++) {
                class715 var5 = var2[var4];
                if (var5.field10348 == arg0) {
                    return var5;
                }
            }
            return null;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7228[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 69)
    public class473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        try {
            this.field7225 = (short) arg5;
            this.field7224 = arg10;
            this.field7221 = (short) arg6;
            this.field7218 = (byte) arg7;
            this.field7220 = (short) arg4;
            this.field7222 = (byte) arg8;
            this.field7226 = arg9;
            this.field7227 = arg0;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field7228[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3632(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3633(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 47;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
