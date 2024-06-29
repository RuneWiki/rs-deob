import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class class344 {

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "Lvf;")
    public class159 field5595;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5599 = new String[] { method2889(method2888("|\t\u0010\u000fK")), method2889(method2888("z\u000fR)")), method2889(method2888("oT\u0010k\u001e")), method2889(method2888("|\t\u0010y\nz\u0013J{K")), method2889(method2888("|\t\u0010\u000eK")) };

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field5598 = 0;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "Lat;")
    public static class398 field5596 = new class398();

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public static void method2886(byte arg0) {
        try {
            field5596 = null;
            if (arg0 < 64) {
                field5593 = -94;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5599[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public abstract void method833(int arg0);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)Z")
    public abstract boolean method831(boolean arg0);

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(III)V")
    public abstract void method835(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z")
    public static final boolean method2887(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != -30958) {
                field5594 = -107;
            }
            field5597++;
            return (arg2 & 0x10) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5599[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lvf;)V")
    public class344(class159 arg0) {
        try {
            this.field5595 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5599[3] + (arg0 == null ? field5599[1] : field5599[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZ)V")
    public abstract void method834(int arg0, boolean arg1);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZ)V")
    public abstract void method837(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lgb;II)V")
    public abstract void method836(class224 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2888(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2889(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
