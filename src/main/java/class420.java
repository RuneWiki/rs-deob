import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class420 {

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field6278 = 0;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 10)
    public static final void method2646(byte arg0) {
        if (arg0 > -105) {
            field6278 = -126;
        }
        for (class194 var1 = (class194) class154.field2501.method2283(false); var1 != null; var1 = (class194) class154.field2501.method2282((byte) 38)) {
            if (var1.field2936.method1223(0)) {
                class755.method4212(false, var1.field2934);
            } else {
                var1.field2936.method384(0);
                try {
                    var1.field2936.method1217(-116);
                } catch (Exception var5) {
                    class326.method2072(-3753, var5, "TV: " + var1.field2934);
                    class755.method4212(false, var1.field2934);
                }
                if (!var1.field2935 && !var1.field2933) {
                    class159 var3 = var1.field2936.method1221(-31);
                    if (var3 != null) {
                        class221 var4 = var3.method1169((byte) -79);
                        if (var4 != null) {
                            var4.method1484(var1.field2940, -76);
                            class171.field2666.method3835(var4);
                            var1.field2935 = true;
                        }
                    }
                }
            }
        }
        field6277++;
    }
}
