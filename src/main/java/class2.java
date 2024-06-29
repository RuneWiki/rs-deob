import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 {

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Z")
    public static boolean field17 = false;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lvv;")
    public static class313 field14 = new class313(42, 8);

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lo;")
    public static class138 field12;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Ljava/lang/String;")
    public String field13;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 6)
    public static void method5(int arg0) {
        field14 = null;
        if (arg0 != 42) {
            method5(10);
        }
        field12 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 17)
    public static final void method6(int arg0, String arg1) {
        field16++;
        if (arg1 == null) {
            return;
        }
        int var2 = 20 % ((arg0 + 75) / 45);
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var3 = class162.method1121(arg1, 1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class139.field2317; var4++) {
            String var5 = class485.field7122[var4];
            if (var5.startsWith("*")) {
                var5 = var5.substring(1);
            }
            String var6 = class162.method1121(var5, 1);
            if (var6 != null && var6.equals(var3)) {
                class139.field2317--;
                for (int var7 = var4; var7 < class139.field2317; var7++) {
                    class485.field7122[var7] = class485.field7122[var7 + 1];
                    class5.field48[var7] = class5.field48[var7 + 1];
                    class305.field4875[var7] = class305.field4875[var7 + 1];
                    class346.field5446[var7] = class346.field5446[var7 + 1];
                    class358.field5570[var7] = class358.field5570[var7 + 1];
                    class34.field524[var7] = class34.field524[var7 + 1];
                }
                class172.field2753 = class78.field1368;
                class59.field911++;
                class265.method1775(-2, class160.field2560);
                class261.field4357.method163(class323.method2037(arg1, -1), (byte) 49);
                class261.field4357.method145(arg1, (byte) 0);
                return;
            }
        }
    }
}
