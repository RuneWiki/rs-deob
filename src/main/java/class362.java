import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class362 {

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "[Z")
    public static boolean[] field4797 = new boolean[100];

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "Lfc;")
    public static class262 field4796 = new class262(20);

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Lea;")
    public static class547 field4799 = new class547(10, -2);

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "Z")
    public static boolean field4800 = false;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "[C")
    private static char[] field4801 = new char[64];

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "B")
    public static byte field4798;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V")
    public static void method2074(boolean arg0) {
        field4799 = null;
        if (arg0) {
            field4799 = null;
        }
        field4796 = null;
        field4801 = null;
        field4797 = null;
    }

    @OriginalMember(owner = "client!oq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4795++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIZ)V")
    public static final void method2075(int arg0, int arg1, boolean arg2) {
        field4794++;
        class369 var3 = class190.method1059(arg1, arg2, 6);
        if (var3 == null) {
            return;
        }
        if (arg0 != -26) {
            method2074(false);
        }
        for (int var4 = 0; var4 < var3.field5172.length; var4++) {
            var3.field5172[var4] = -1;
            var3.field5171[var4] = 0;
        }
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4801[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4801[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4801[var2] = (char) (var2 + 48 - 52);
        }
        field4801[63] = '/';
        field4801[62] = '+';
    }
}
