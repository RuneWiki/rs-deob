import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public abstract class class274 {

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Lbd;")
    public static class44 field4096 = new class44("K", "T", "K", "K");

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public static void method1763(int arg0) {
        field4096 = null;
        int var1 = -96 % ((21 - arg0) / 50);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1764(byte arg0);

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
    public static final void method1765(int arg0) {
        class517.field7488.method2286((byte) 19);
        field4094++;
        class417.field5927.method2286((byte) 19);
        if (arg0 <= 106) {
            field4096 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBI)[B")
    public abstract byte[] method1766(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)Loo;")
    public static final class450 method1767(int arg0, int arg1) {
        field4095++;
        return arg0 >= arg1 && arg0 < 100 ? class262.field3960[arg0] : null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([BI)V")
    public abstract void method1768(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1769(int arg0, String arg1) {
        field4097++;
        if (arg1 == null) {
            return null;
        }
        int var2 = arg0;
        int var3 = arg1.length();
        while (var2 < var3 && class108.method786((byte) -96, arg1.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class108.method786((byte) -117, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class252.method1629(28307, var7)) {
                char var8 = class45.method429(var7, -84);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }
}
