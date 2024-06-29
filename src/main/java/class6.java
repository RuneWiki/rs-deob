import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class540 {

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "[I")
    public static int[] field63 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Liv;")
    public static class106 field61 = new class106("game3", 2);

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "[I")
    public static int[] field65;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lwga;Z)V", line = 5)
    public static final void method32(class778 arg0, boolean arg1) {
        for (int var2 = arg0.field10733; var2 <= arg0.field10727; var2++) {
            for (int var3 = arg0.field10730; var3 <= arg0.field10736; var3++) {
                class379 var4 = class378.field5427[arg0.field7710][var2][var3];
                if (var4 != null) {
                    class393 var5 = var4.field5437;
                    class393 var6 = null;
                    while (var5 != null) {
                        if (var5.field5578 == arg0) {
                            if (var6 == null) {
                                var4.field5437 = var5.field5574;
                            } else {
                                var6.field5574 = var5.field5574;
                            }
                            var5.method2397((byte) 100);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field5574;
                    }
                }
            }
        }
        if (!arg1) {
            class257.method1692(arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(II)V", line = 54)
    public class6(int arg0, int arg1) {
        this.field64 = arg1;
        this.field62 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 71)
    public static void method33(int arg0) {
        field63 = null;
        if (arg0 > -3) {
            method32(null, true);
        }
        field61 = null;
        field65 = null;
    }
}
