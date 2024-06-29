import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public abstract class class188 extends class9 {

    @OriginalMember(owner = "client!bea", name = "x", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "Z")
    public static boolean field2261;

    @OriginalMember(owner = "client!bea", name = "y", descriptor = "[I")
    public static int[] field2260;

    @OriginalMember(owner = "client!bea", name = "w", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method121(byte arg0);

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "(B)Z")
    public abstract boolean method122(byte arg0);

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "(B)V")
    public static void method1026(byte arg0) {
        int var1 = -112 / ((arg0 + 27) / 60);
        field2260 = null;
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V")
    public static final void method1027(int arg0) {
        if (arg0 != -31383) {
            return;
        }
        field2258++;
        for (int var1 = 0; var1 < class330.field4304.length; var1++) {
            for (int var2 = 0; var2 < class330.field4304[0].length; var2++) {
                for (int var3 = 0; var3 < class330.field4304[0][0].length; var3++) {
                    class330.field4304[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(I)V")
    public class188(int arg0) {
        this.field2259 = arg0;
    }

    static {
        new class180(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field2261 = false;
        field2260 = new int[] { 16, 32, 64, 128 };
    }
}
