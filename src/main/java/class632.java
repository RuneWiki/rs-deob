import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class632 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lef;")
    public static class488 field8698 = class520.method3026(96);

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
    public static void method3609(boolean arg0) {
        field8698 = null;
        if (arg0) {
            field8698 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIBII)Z")
    public static final boolean method3610(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 < 117) {
            field8698 = null;
        }
        field8700++;
        for (int var6 = arg4; var6 <= arg1; var6++) {
            for (int var7 = arg0; var7 <= arg5; var7++) {
                if (class172.field2683[var6][var7] == arg2 && class616.field8415[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIZBIZ)V")
    public static final void method3611(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, boolean arg6) {
        int var7 = 73 % ((arg4 + 31) / 40);
        if (arg2 > arg1) {
            int var8 = (arg1 + arg2) / 2;
            int var9 = arg1;
            class420 var10 = class690.field9322[var8];
            class690.field9322[var8] = class690.field9322[arg2];
            class690.field9322[arg2] = var10;
            for (int var11 = arg1; var11 < arg2; var11++) {
                if (class29.method404((byte) -122, arg5, var10, arg0, arg6, arg3, class690.field9322[var11]) <= 0) {
                    class420 var12 = class690.field9322[var11];
                    class690.field9322[var11] = class690.field9322[var9];
                    class690.field9322[var9++] = var12;
                }
            }
            class690.field9322[arg2] = class690.field9322[var9];
            class690.field9322[var9] = var10;
            method3611(arg0, arg1, var9 - 1, arg3, (byte) 114, arg5, arg6);
            method3611(arg0, var9 + 1, arg2, arg3, (byte) 50, arg5, arg6);
        }
        field8699++;
    }
}
