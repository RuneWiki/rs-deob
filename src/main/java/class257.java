import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class257 extends class406 {

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "Liq;")
    public static class362 field3684 = new class362("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "Lgj;")
    public class381 field3685;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "Lfk;")
    public static class393 field3687;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "Z")
    public boolean field3683;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "[I")
    public static int[] field3686;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lwl;)V")
    public static final void method1727(class233 arg0) {
        for (int var1 = arg0.field3268; var1 <= arg0.field3275; var1++) {
            for (int var2 = arg0.field3267; var2 <= arg0.field3271; var2++) {
                class193 var3 = class250.field3570[arg0.field3285][var1][var2];
                if (var3 != null) {
                    class250 var4 = var3.field2779;
                    class250 var5 = null;
                    while (var4 != null) {
                        if (var4.field3571 == arg0) {
                            if (var5 == null) {
                                var3.field2779 = var4.field3568;
                            } else {
                                var5.field3568 = var4.field3568;
                            }
                            var4.method1700(9);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field3568;
                    }
                    var3.field2770 = 0;
                    for (class250 var6 = var3.field2779; var6 != null; var6 = var6.field3568) {
                        var3.field2770 = (byte) (var3.field2770 | var6.field3565);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
    public static void method1728(int arg0) {
        field3687 = null;
        if (arg0 == 498) {
            field3686 = null;
            field3684 = null;
        }
    }
}
