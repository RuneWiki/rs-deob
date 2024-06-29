import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class class96 {

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "Lml;")
    public class194 field1301;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1305 = new String[] { method956(method955(">'k_P")), method956(method955(">'k(\u0011'%1*P")), method956(method955("'9)x")), method956(method955("2bk:\u0005")), method956(method955(">'k^P")), method956(method955(">'k]P")) };

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Ltf;")
    public static class524 field1299 = new class524();

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field1303 = -1;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lmv;")
    public static class125 field1302 = new class125(27, 8);

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static void method952(int arg0) {
        try {
            field1302 = null;
            if (arg0 == 1) {
                field1299 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1305[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZLica;)V")
    public abstract void method679(int arg0, boolean arg1, class469 arg2);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZB)V")
    public abstract void method683(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([II[J)V")
    public static final void method953(int[] arg0, int arg1, long[] arg2) {
        try {
            class372.method2953(arg0, -1, arg2, 0, arg2.length - arg1);
            field1304++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1305[4] + (arg0 == null ? field1305[2] : field1305[3]) + ',' + arg1 + ',' + (arg2 == null ? field1305[2] : field1305[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZII)V")
    public abstract void method681(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V")
    public abstract void method673(boolean arg0, int arg1);

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lml;)V")
    public class96(class194 arg0) {
        try {
            this.field1301 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1305[1] + (arg0 == null ? field1305[2] : field1305[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)[Lofa;")
    public static final class139[] method954(byte arg0) {
        try {
            field1300++;
            if (arg0 > -7) {
                method953(null, -85, null);
            }
            return new class139[] { class97.field1310, class496.field7287, class792.field11522 };
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1305[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)Z")
    public abstract boolean method677(boolean arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public abstract void method675(int arg0);

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method955(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method956(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
