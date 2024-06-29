import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class307 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5266 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field5269 = 7759444;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Lbe;")
    public static class283 field5270 = class153.method941(125, "loginscreen");

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lbe;")
    private static class283 field5264 = class153.method941(125, "Loading sprites )2 ");

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lbe;")
    public static class283 field5273 = field5264;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lbe;")
    private static class283 field5267 = class153.method941(-125, "Loading)3)3)3");

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Lbe;")
    public static class283 field5271 = field5267;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lkg;B)Z", line = 43)
    public static final boolean method2090(class69 arg0, byte arg1) {
        field5272++;
        if (arg0.field990 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field990.length; var2++) {
            int var3 = class12.method63((byte) -31, var2, arg0);
            int var4 = arg0.field1131[var2];
            if (arg0.field990[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field990[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field990[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg1 != 32) {
            method2093((byte) 87);
        }
        return true;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)Z", line = 103)
    public static final boolean method2091(int arg0, int arg1, int arg2, int arg3) {
        if (class196.method1262(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class46.method267(var4 + 1, class65.field890[arg0][arg1][arg2] + arg3, var5 + 1) && class46.method267(var4 + 128 - 1, class65.field890[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class46.method267(var4 + 128 - 1, class65.field890[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class46.method267(var4 + 1, class65.field890[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V", line = 141)
    public static final void method2092(int arg0, int arg1) {
        field5265++;
        class87.field1466.method1637(true, arg1);
        class150.field2445.method1637(true, arg1);
        class104.field1779.method1637(true, arg1);
        int var2 = 85 % ((arg0 + 64) / 34);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 226)
    public static void method2093(byte arg0) {
        field5267 = null;
        if (arg0 != -93) {
            field5271 = (class283) null;
        }
        field5264 = null;
        field5271 = null;
        field5273 = null;
        field5270 = null;
    }
}
