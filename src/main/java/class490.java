import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class490 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Lvfa;")
    public static class616 field6779;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIILwv;)V")
    public static final void method2747(int arg0, int arg1, int arg2, int arg3, class32 arg4) {
        class486 var5 = class80.method635(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field380 = (arg1 << class627.field8753) + class634.field8905;
        arg4.field376 = arg3;
        arg4.field382 = (arg2 << class627.field8753) + class634.field8905;
        for (class20 var7 = var5.field6751; var7 != null; var7 = var7.field284) {
            if (var7.field281.field513) {
                int var8 = var7.field281.method179(-1);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field376 += var6;
            arg4.field378 = true;
        } else if (var5.field6748 != null) {
            arg4.field376 -= var5.field6748.field5008;
        }
        var5.field6743 = arg4;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static void method2748(int arg0) {
        if (arg0 == 0) {
            field6779 = null;
        }
    }
}
