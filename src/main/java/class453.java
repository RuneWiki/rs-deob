import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class453 {

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public static int field6312 = 1;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "[I")
    public static int[] field6313 = new int[6];

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "Llk;")
    public static class638 field6317 = new class638(8);

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lgga;Z)Laq;")
    public static final class492 method2729(class511 arg0, boolean arg1) {
        if (!arg1) {
            field6312 = 45;
        }
        field6310++;
        return new class492(arg0.method3034(1), arg0.method3034(1), arg0.method3034(1), arg0.method3034(1), arg0.method2983(true), arg0.method2983(true), arg0.method3013(-125));
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
    public static void method2730(byte arg0) {
        field6317 = null;
        field6313 = null;
        int var1 = -105 % ((-arg0 - 9) / 51);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
    public static final void method2731(int arg0) {
        field6315++;
        int var1 = class783.field10748;
        int[] var2 = class244.field3610;
        if (arg0 != -16054) {
            field6309 = 18;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class723 var9 = class413.field5787[var2[var3]];
            if (var9 != null && var9.field9192 > 0) {
                var9.field9192--;
                if (var9.field9192 == 0) {
                    var9.field9204 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class429.field5988; var4++) {
            long var5 = (long) class425.field5934[var4];
            class685 var7 = (class685) class450.field6288.method3669(false, var5);
            if (var7 != null) {
                class359 var8 = var7.field9573;
                if (var8.field9192 > 0) {
                    var8.field9192--;
                    if (var8.field9192 == 0) {
                        var8.field9204 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "([[IB)V")
    public static final void method2732(int[][] arg0, byte arg1) {
        if (arg1 < 70) {
            field6317 = null;
        }
        class705.field9804 = arg0;
        field6314++;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIIII)V")
    public static final void method2733(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6308++;
        for (int var5 = 0; var5 < class187.field2331; var5++) {
            Rectangle var6 = class185.field2308[var5];
            if (arg4 < var6.x + var6.width && (arg2 + arg4) > var6.x && arg0 < (var6.y + var6.height) && var6.y < (arg0 + arg1)) {
                class363.field5240[var5] = true;
            }
        }
        class338.method2144((byte) -101, arg2 + arg4, arg0, arg0 + arg1, arg4);
        if (arg3 > -19) {
            method2733(-52, 27, 93, -88, -28);
        }
    }

    @OriginalMember(owner = "client!daa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6318++;
        throw new IllegalStateException();
    }
}
