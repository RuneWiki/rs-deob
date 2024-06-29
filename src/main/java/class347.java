import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class347 extends class417 {

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "J")
    public long field4757;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    public static int field4758 = -2;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "[C")
    private static char[] field4756 = new char[64];

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "Z")
    public static boolean field4759;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "()V")
    public class347() {
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(J)V")
    public class347(long arg0) {
        this.field4757 = arg0;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
    public static void method2108(byte arg0) {
        if (arg0 != -72) {
            method2108((byte) 40);
        }
        field4756 = null;
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4756[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4756[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4756[var2] = (char) (var2 - 4);
        }
        field4756[63] = '-';
        field4756[62] = '*';
        field4759 = false;
        field4760 = 503;
    }
}
