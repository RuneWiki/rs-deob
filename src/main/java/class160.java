import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class160 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field2372 = 0;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[I")
    public static int[] field2373 = new int[4096];

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field2376 = 999999;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field2377 = 0;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method1021(int arg0) {
        field2373 = null;
        if (arg0 <= 7) {
            field2372 = 80;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(JB)V")
    public static final void method1022(long arg0, byte arg1) {
        field2375++;
        int var3 = class360.field5147;
        int var4 = class168.field2451;
        if (class267.field3903 != var3) {
            int var5 = var3 - class267.field3903;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class267.field3903 += var6;
        }
        if (!class4.field81.field1437) {
            class327.field4768 += (float) arg0 * class325.field4750 / 40.0F * 8.0F;
            class153.field2204 += (float) arg0 * class431.field6092 / 40.0F * 8.0F;
        }
        if (class220.field3175 != var4) {
            int var7 = var4 - class220.field3175;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class220.field3175 += var8;
        }
        class97.method688(-16503);
        int var9 = 84 / ((arg1 - 65) / 61);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public static final void method1023(int arg0) {
        field2374++;
        if (class386.field5422 <= 0) {
            class483.field6728 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class133.field1752.length; var2++) {
                if (class133.field1752[var2].startsWith("--> ")) {
                    var1++;
                    if (class386.field5422 == var1) {
                        class483.field6728 = class133.field1752[var2].substring(4);
                        break;
                    }
                }
            }
        }
        if (arg0 != 3221) {
            field2372 = 5;
        }
    }

    static {
        new class530("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }
}
