import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class57 {

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Z")
    public static boolean field879;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lkg;")
    public static class177 field872;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lvg;")
    public static class38 field876;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
    public static int[] field875;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[I")
    public static int[] field878;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method346(int arg0) {
        field876 = null;
        if (arg0 == -1) {
            field872 = null;
            field875 = null;
            field878 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method347(int arg0, int arg1, boolean arg2) {
        field873++;
        if (!arg2) {
            field879 = true;
        }
        return (class183.field2684[1][arg1][arg0] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(JI)V")
    public static final void method348(long arg0, int arg1) {
        field874++;
        int var3 = class94.field1398;
        if (arg1 != 0) {
            return;
        }
        if (class48.field774 != var3) {
            int var4 = var3 - class48.field774;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var4 < var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var5 < var4) {
                var5 = var4;
            }
            class48.field774 += var5;
        }
        int var6 = class367.field5612;
        if (!class426.field6401.field1013) {
            class382.field5792 += (float) arg0 * class450.field6707 / 40.0F * 8.0F;
            class24.field262 += (float) arg0 * class244.field3608 / 40.0F * 8.0F;
        }
        if (class366.field5598 != var6) {
            int var7 = var6 - class366.field5598;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class366.field5598 += var8;
        }
        class11.method75(-91);
    }

    static {
        new class475(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field879 = false;
    }
}
