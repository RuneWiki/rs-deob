import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class654 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field9228 = 0;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field9229;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field9232;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BII)Lpaa;", line = 8)
    public static final class712 method3778(byte arg0, int arg1, int arg2) {
        field9232++;
        class712 var3 = class733.method4073(true, arg1);
        if (arg2 == -1) {
            return var3;
        } else if (arg0 >= -48) {
            return null;
        } else if (var3 == null || var3.field9981 == null || arg2 >= var3.field9981.length) {
            return null;
        } else {
            return var3.field9981[arg2];
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 42)
    public static final void method3779(int arg0) {
        for (int var1 = 0; var1 < class446.field6100; var1++) {
            int var2 = class611.method3569(arg0 + 2311, class11.field136 + var1, class446.field6100) * class209.field2976;
            for (int var3 = 0; var3 < class209.field2976; var3++) {
                int var4 = var2 + class611.method3569(2439, class717.field10140 + var3, class209.field2976);
                if (class38.field530[var4] == class677.field9538) {
                    class264.field3599[var4].method1678(0, 0, class61.field829, class459.field6317, class61.field829 * var3, class459.field6317 * var1, true, true);
                }
            }
        }
        if (arg0 != 128) {
            method3779(-5);
        }
        field9230++;
    }
}
