import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class496 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "J")
    public static long field6547 = 0L;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field6549 = -1;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field6548;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field6550;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "[[B")
    public static byte[][] field6546;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static final void method2669(int arg0) {
        class361.method1987(11, -103);
        int var1 = -83 % ((-arg0 - 55) / 40);
        field6548++;
        class85.method489((byte) -58);
        System.gc();
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static void method2670(int arg0) {
        if (arg0 != 0) {
            method2669(83);
        }
        field6546 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method2671(String arg0, int arg1) {
        field6545++;
        if (arg1 > -8) {
            field6549 = -41;
        }
        return class509.method2751(arg0, 120, field6550 == null ? (field6550 = method2672("ka")) : field6550);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILsp;)Lsp;")
    public abstract class677 method1869(int arg0, class677 arg1);

    // $FF: synthetic method
    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2672(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
