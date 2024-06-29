import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class40 {

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Ldc;")
    public static class303 field541 = new class303(1, 2, 2, 0);

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(FFBF)I")
    public static final int method329(float arg0, float arg1, byte arg2, float arg3) {
        field543++;
        if (arg2 != -102) {
            field544 = -102;
        }
        float var4 = arg3 < 0.0F ? -arg3 : arg3;
        float var5 = arg0 < 0.0F ? -arg0 : arg0;
        float var6 = arg1 < 0.0F ? -arg1 : arg1;
        if (var5 > var4 && var6 < var5) {
            return arg0 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var5 < var6) {
            return arg1 > 0.0F ? 2 : 3;
        } else if ((arg3 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static void method330(byte arg0) {
        field541 = null;
        if (arg0 <= 75) {
            field544 = 32;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field540++;
        for (int var6 = arg3; var6 <= arg1; var6++) {
            for (int var7 = arg4; var7 <= arg5; var7++) {
                if (class256.field3692[var6][var7] == arg0 && class366.field5086[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg2 != 1) {
            method329(-0.34085882F, 0.3311733F, (byte) -15, 0.026857603F);
        }
        return false;
    }
}
