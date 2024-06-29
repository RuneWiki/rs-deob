import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class670 {

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Lwm;")
    private class30 field8698;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public int field8695;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field8696 = -1;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field8697;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(FFFB)I")
    public static final int method3625(float arg0, float arg1, float arg2, byte arg3) {
        field8697++;
        float var4 = arg0 < 0.0F ? -arg0 : arg0;
        if (arg3 <= 114) {
            method3625(-0.694778F, 0.50268644F, -1.1827635F, (byte) -107);
        }
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 < var5 && var5 > var6) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return (arg2 > 0.0F) ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lega;ILwm;)V")
    public class670(class473 arg0, int arg1, class30 arg2) {
        new class536(64);
        this.field8698 = arg2;
        this.field8695 = this.field8698.method138(0, 15);
    }
}
