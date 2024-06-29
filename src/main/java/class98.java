import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class98 {

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(FFIF)I", line = 5)
    public static final int method842(float arg0, float arg1, int arg2, float arg3) {
        field1288++;
        float var4 = (arg1 < 0.0F) ? -arg1 : arg1;
        if (arg2 != -23996) {
            return -31;
        }
        float var5 = arg0 < 0.0F ? -arg0 : arg0;
        float var6 = arg3 < 0.0F ? -arg3 : arg3;
        if (var4 < var5 && var6 < var5) {
            return arg0 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return arg3 > 0.0F ? 2 : 3;
        } else if ((arg1 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }
}
