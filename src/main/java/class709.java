import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class709 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Z")
    public static boolean field9906 = false;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3982(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field9906 = true;
        }
        field9905++;
        return class325.method1940(32768, arg0, arg1) | (arg0 & 0x800) != 0 || class391.method2283(arg1, (byte) 121, arg0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Llr;Z)V")
    public static final void method3983(class752 arg0, boolean arg1) {
        for (int var2 = arg0.field10422; var2 <= arg0.field10426; var2++) {
            for (int var3 = arg0.field10421; var3 <= arg0.field10425; var3++) {
                class624 var4 = class77.field947[arg0.field2175][var2][var3];
                if (var4 != null) {
                    class603 var5 = var4.field8729;
                    class603 var6 = null;
                    while (var5 != null) {
                        if (var5.field8410 == arg0) {
                            if (var6 == null) {
                                var4.field8729 = var5.field8413;
                            } else {
                                var6.field8413 = var5.field8413;
                            }
                            var5.method3335(2);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field8413;
                    }
                }
            }
        }
        if (!arg1) {
            class440.method2487(arg0);
        }
    }
}
