import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class68 {

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field1051 = 0;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Ltl;")
    private static class59 field1054 = class85.method639("skill: ", 9588);

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Ltl;")
    public static class59 field1053 = field1054;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Ltl;")
    public static class59 field1055 = class85.method639("cookieprefix", 9588);

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lme;")
    public static class295 field1050;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 26)
    public static void method564(byte arg0) {
        if (arg0 != -120) {
            field1055 = (class59) null;
        }
        field1050 = null;
        field1053 = null;
        field1054 = null;
        field1055 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([BI)[B", line = 52)
    public static final byte[] method565(byte[] arg0, int arg1) {
        field1052++;
        class170 var2 = new class170(arg0);
        int var3 = var2.method1221(arg1 + 83);
        int var4 = var2.method1233((byte) -77);
        if (var4 < 0 || class223.field3627 != 0 && class223.field3627 < var4) {
            throw new RuntimeException();
        } else if (~var3 == arg1) {
            byte[] var5 = new byte[var4];
            var2.method1243(var4, 128, 0, var5);
            return var5;
        } else {
            int var6 = var2.method1233((byte) -77);
            if (var6 < 0 || class223.field3627 != 0 && class223.field3627 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class142.method1037(var7, var6, arg0, var4, 9);
            } else {
                class92.field1432.method446((byte) -50, var2, var7);
            }
            return var7;
        }
    }
}
