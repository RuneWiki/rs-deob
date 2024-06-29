import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class333 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field5188 = 100;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5190 = "Loaded config";

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[I")
    public static int[] field5186;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method2333(boolean arg0) {
        field5189++;
        class293.field4602 = 0;
        if (arg0) {
            method2334(true);
        }
        int var1 = (class345.field5363.field4672 >> 7) + class133.field2118;
        int var2 = (class345.field5363.field4671 >> 7) + class117.field1902;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class293.field4602 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class293.field4602 = 1;
        }
        if (class293.field4602 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class293.field4602 = 0;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V", line = 44)
    public static void method2334(boolean arg0) {
        if (arg0) {
            field5190 = null;
            field5186 = null;
        }
    }
}
