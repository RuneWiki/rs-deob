import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class464 extends class45 {

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public int field6071 = 0;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
    public int field6083 = -1;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "F")
    public static float field6081;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public int field6072;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public int field6073;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public int field6074;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    public int field6076;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
    public int field6077;

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
    public int field6079;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
    public int field6080;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "I")
    public int field6082;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "I")
    public int field6084;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "I")
    public int field6085;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(FFIF)I")
    public static final int method2589(float arg0, float arg1, int arg2, float arg3) {
        field6075++;
        if (arg2 != 5) {
            return 60;
        }
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg3 < 0.0F ? -arg3 : arg3;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var4 < var5 && var5 > var6) {
            return (arg3 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var5 < var6) {
            return arg0 > 0.0F ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }
}
