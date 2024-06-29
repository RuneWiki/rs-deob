import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class236 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field3251 = 0;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3252 = -1;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field3253 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)Z")
    public static final boolean method1481(int arg0, byte arg1) {
        field3254++;
        if (arg1 > -81) {
            return false;
        } else {
            return arg0 == 7 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(FFIF)I")
    public static final int method1482(float arg0, float arg1, int arg2, float arg3) {
        if (arg2 >= -86) {
            field3251 = -36;
        }
        field3250++;
        float var4 = (arg3 < 0.0F) ? -arg3 : arg3;
        float var5 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var6 = arg1 < 0.0F ? -arg1 : arg1;
        if (var4 < var5 && var5 > var6) {
            return arg0 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return arg1 > 0.0F ? 2 : 3;
        } else if (arg3 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }
}
