import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class198 {

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "Lak;")
    public static class234 field3294 = new class234("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V", line = 10)
    public static void method1371(byte arg0) {
        if (arg0 == 76) {
            field3294 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIILrp;)V", line = 21)
    public static final void method1372(int arg0, int arg1, int arg2, int arg3, class303 arg4) {
        class138 var5 = class297.method1929(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field4583 = (arg1 << class163.field2415) + class5.field63;
        arg4.field4584 = arg3;
        arg4.field4578 = (arg2 << class163.field2415) + class5.field63;
        for (class327 var7 = var5.field2118; var7 != null; var7 = var7.field4922) {
            if (var7.field4921.field5835) {
                int var8 = var7.field4921.method24(-867749273);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field4584 += var6;
            arg4.field4577 = true;
        }
        var5.field2102 = arg4;
    }
}
