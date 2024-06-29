import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class256 extends class381 {

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public int field3466;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field3468 = 0;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Lrk;")
    public static class427 field3465;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
    public static void method1667(int arg0) {
        if (arg0 <= 74) {
            field3468 = -96;
        }
        field3465 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLrk;)V")
    public static final void method1668(byte arg0, class427 arg1) {
        field3467++;
        class236.field3284 = arg1;
        int var2 = 49 / ((arg0 + 70) / 45);
        class63.field968 = class236.field3284.method2626(15, 69);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIIIIIIIIZI)Z")
    public static final boolean method1669(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field3464++;
        int var11 = class162.method1213(arg3, arg4, class21.field380, arg7, (byte) -111, arg1, arg2, class235.field3247[class69.field1046], arg0, arg8, class95.field1379.method2146(108), arg5, class32.field523, arg6, arg10);
        if (var11 < 1) {
            return false;
        }
        class338.field4605 = class32.field523[var11 - 1];
        class335.field4543 = class21.field380[var11 - 1];
        class338.field4615 = false;
        class184.method1347(arg9);
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIILgb;)V")
    public static final void method1670(int arg0, int arg1, int arg2, int arg3, class241 arg4) {
        arg4.field3338 = (arg1 << 7) + 64;
        arg4.field3331 = arg3;
        arg4.field3328 = (arg2 << 7) + 64;
        class224 var5 = class118.field1653[arg0][arg1][arg2];
        if (var5 != null) {
            int var6 = 0;
            for (class26 var7 = var5.field3129; var7 != null; var7 = var7.field463) {
                if (var7.field460.field3174) {
                    int var8 = var7.field460.method579(0);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field3331 += var6;
                arg4.field3330 = true;
            }
        }
        if (class118.field1653[arg0][arg1][arg2] == null) {
            class263.method1695(arg0, arg1, arg2);
        }
        class118.field1653[arg0][arg1][arg2].field3110 = arg4;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(II)V")
    public class256(int arg0, int arg1) {
        this.field3466 = arg1;
        this.field3469 = arg0;
    }
}
