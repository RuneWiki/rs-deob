import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class404 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lll;")
    public class341 field5528 = new class341();

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Z")
    public boolean field5530 = false;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Ljd;")
    public static class383 field5527 = new class383("WTRC", 1);

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lch;")
    public static class151 field5532 = new class151("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lch;")
    public static class151 field5533 = new class151("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lrc;")
    public static class108 field5534 = new class108(94, 6);

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public int field5529;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public int field5531;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ldh;III[Z)Z", line = 7)
    public static final boolean method2425(class183 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class427.field5960 != class340.field4692) {
            int var6 = class190.field2858[arg1].method590(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class241 var8 = class190.field2858[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method590(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method583(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method582(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V", line = 42)
    public static void method2426(byte arg0) {
        field5534 = null;
        field5533 = null;
        field5527 = null;
        field5532 = null;
        int var1 = -19 / ((-arg0 - 29) / 41);
    }
}
