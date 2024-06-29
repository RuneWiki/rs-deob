import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public abstract class class191 extends class116 {

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "Lda;")
    public static class275 field3277 = class255.method1672(123, "null");

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "[I")
    public static int[] field3280 = new int[50];

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "Lda;")
    public static class275 field3283 = class255.method1672(124, "Sprites geladen)3");

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "Lfd;")
    public static class229 field3279;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)Z")
    public abstract boolean method136(byte arg0);

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method138(int arg0);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([BIII)Lda;")
    public static final class275 method1256(byte[] arg0, int arg1, int arg2, int arg3) {
        field3278++;
        class275 var4 = new class275();
        var4.field4752 = 0;
        int var5 = 5 / ((-arg1 - 40) / 55);
        var4.field4749 = new byte[arg2];
        for (int var6 = arg3; var6 < (arg3 + arg2); var6++) {
            if (arg0[var6] != 0) {
                var4.field4749[var4.field4752++] = arg0[var6];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V")
    public static final void method1257(byte arg0, int arg1) {
        field3281++;
        int var2 = 61 % ((arg0 + 33) / 48);
        class69 var3 = class108.field1869;
        synchronized (class108.field1869) {
            class102.field1705 = arg1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V")
    public static void method1258(int arg0) {
        field3283 = null;
        field3280 = null;
        if (arg0 <= 98) {
            field3279 = null;
        }
        field3277 = null;
        field3279 = null;
    }
}
