import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class301 {

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4727 = new String[] { method2533(method2532("\u0005vvL\u001c#w*Q\u001d\u0017+")), method2533(method2532("\u001ev4T")), method2533(method2532("\u0005vvy[")), method2533(method2532("\u000b-v\u0016\u000e")), method2533(method2532("\u0005vv{[")), method2533(method2532("\u0005vvz[")) };

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "Lup;")
    public static class290 field4724 = new class290();

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "Lha;")
    public static class66 field4720;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "[I")
    public static int[] field4726;

    @OriginalMember(owner = "client!uu", name = "toString", descriptor = "()Ljava/lang/String;", line = 9)
    public final String toString() {
        try {
            field4722++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4727[0] + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V", line = 19)
    public static void method2529(int arg0) {
        try {
            field4724 = null;
            if (arg0 >= 46) {
                field4726 = null;
                field4720 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4727[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZI)Z", line = 32)
    public static final boolean method2530(boolean arg0, int arg1) {
        try {
            if (!arg0) {
                method2530(false, -40);
            }
            field4723++;
            return arg1 == 1 || arg1 == 3 || arg1 == 5;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4727[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILib;)Lbc;", line = 43)
    public static final class384 method2531(int arg0, class163 arg1) {
        try {
            field4721++;
            class613 var2 = class325.method2758(-82)[arg1.method1455((byte) 62)];
            class288 var3 = class349.method2869((byte) -126)[arg1.method1455((byte) 62)];
            int var4 = arg1.method1442(65280);
            int var5 = 73 / ((arg0 - 57) / 35);
            int var6 = arg1.method1442(65280);
            int var7 = arg1.method1445((byte) 123);
            int var8 = arg1.method1445((byte) 124);
            int var9 = arg1.method1442(65280);
            int var10 = arg1.method1453((byte) 107);
            int var11 = arg1.method1453((byte) 82);
            return new class384(var2, var3, var4, var6, var7, var8, var9, var10, var11);
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field4727[2] + arg0 + ',' + (arg1 == null ? field4727[1] : field4727[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2532(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2533(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 56;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
