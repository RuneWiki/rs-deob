import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class class720 {

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10545 = new String[] { method5232(method5231("g\u000b'xl")), method5232(method5231("g\u000b'}l")) };

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field10542 = 0;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field10543;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field10544;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)Z")
    public abstract boolean method5042(byte arg0);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Z")
    public static final boolean method5229(int arg0, int arg1, int arg2) {
        try {
            int var3 = 51 % ((arg2 - 17) / 56);
            field10541++;
            return class241.method2075((byte) 127, arg1, arg0) || class157.method1412(arg1, arg0, (byte) 127);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10545[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Z")
    public final boolean method5230(int arg0) {
        try {
            field10544++;
            int var2 = 34 % ((arg0 - 57) / 57);
            return this.method5040(false) || this.method5042((byte) 120) || this.method5054((byte) -72);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10545[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "(I)I")
    public abstract int method5051(int arg0);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)I")
    public abstract int method5048(boolean arg0);

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V")
    public abstract void method5047(int arg0);

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)Z")
    public abstract boolean method5040(boolean arg0);

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
    public abstract void method5044(int arg0);

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)Z")
    public abstract boolean method5054(byte arg0);

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)Lva;")
    public abstract class524 method5050(int arg0);

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5231(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5232(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 13;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
