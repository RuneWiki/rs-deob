import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class60 {

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field824 = -1;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "F")
    public static float field825;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lqda;Z)V", line = 14)
    public static final void method370(class172 arg0, boolean arg1) {
        for (int var2 = arg0.field2247; var2 <= arg0.field2254; var2++) {
            for (int var3 = arg0.field2243; var3 <= arg0.field2244; var3++) {
                class75 var4 = class270.field3423[arg0.field6470][var2][var3];
                if (var4 != null) {
                    class138 var5 = var4.field1024;
                    class138 var6 = null;
                    while (var5 != null) {
                        if (var5.field1786 == arg0) {
                            if (var6 == null) {
                                var4.field1024 = var5.field1789;
                            } else {
                                var6.field1789 = var5.field1789;
                            }
                            var5.method794(-501);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field1789;
                    }
                }
            }
        }
        if (!arg1) {
            class66.method393(arg0);
        }
    }
}
