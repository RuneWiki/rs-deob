import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class225 extends class203 {

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Lpea;", line = 3)
    public static final class722 method1306(int arg0, int arg1) {
        field2577++;
        class722[] var2 = class203.method1224(28543);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class722 var4 = var2[var3];
            if (var4.field10122 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
