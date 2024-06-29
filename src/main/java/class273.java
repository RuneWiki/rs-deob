import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class273 extends class168 {

    @OriginalMember(owner = "client!gia", name = "k", descriptor = "S")
    public short field3422;

    @OriginalMember(owner = "client!gia", name = "l", descriptor = "Lkg;")
    public static class275 field3423 = new class275(50, 10);

    @OriginalMember(owner = "client!gia", name = "p", descriptor = "Lan;")
    public static class23 field3427 = new class23();

    @OriginalMember(owner = "client!gia", name = "j", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!gia", name = "m", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!gia", name = "n", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!gia", name = "q", descriptor = "Lnd;")
    public static class547 field3428;

    @OriginalMember(owner = "client!gia", name = "o", descriptor = "Z")
    public static boolean field3426;

    @OriginalMember(owner = "client!gia", name = "r", descriptor = "[I")
    public static int[] field3429;

    @OriginalMember(owner = "client!gia", name = "s", descriptor = "[[B")
    public static byte[][] field3430;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V")
    public static void method1611(int arg0) {
        field3430 = null;
        if (arg0 == 0) {
            field3427 = null;
            field3428 = null;
            field3429 = null;
            field3423 = null;
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1612(int arg0, String arg1) {
        field3421++;
        if (arg1 == null || arg0 != 1) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class286.method1701(-1, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class20.field370; var3++) {
            String var4 = class469.field6287[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class286.method1701(-1, var4);
            if (var5 != null && var5.equals(var2)) {
                class20.field370--;
                for (int var6 = var3; var6 < class20.field370; var6++) {
                    class469.field6287[var6] = class469.field6287[var6 + 1];
                    class160.field2213[var6] = class160.field2213[var6 + 1];
                    class636.field8768[var6] = class636.field8768[var6 + 1];
                    class752.field10499[var6] = class752.field10499[var6 + 1];
                    class216.field2921[var6] = class216.field2921[var6 + 1];
                }
                class42.field624 = class676.field9444;
                class682.field9507++;
                class589 var7 = class514.method2994(-29488, class760.field10605, class741.field10341);
                var7.field8251.method2578(class747.method4155(-1, arg1), arg0 ^ 0xB73181F1);
                var7.field8251.method2597(arg1, (byte) 126);
                class737.method4107(var7, 7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "()V")
    public class273() {
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZZI)V")
    public static final void method1613(boolean arg0, boolean arg1, int arg2) {
        field3424++;
        if (arg1) {
            class692.field9624++;
            class193.method1290(true);
        }
        if (arg2 != 10) {
            field3430 = null;
        }
        if (arg0) {
            class100.field1383++;
            class344.method1974((byte) -93);
        }
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(S)V")
    public class273(short arg0) {
        this.field3422 = arg0;
    }
}
