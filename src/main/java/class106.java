import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class106 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lia;")
    public static class257 field1961 = class28.method234(-128, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "[I")
    public static int[] field1962;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V")
    public static final void method764(byte arg0, int arg1) {
        class181.field3146 = arg1;
        class143.field2516 = -1;
        class26.field510 = -1;
        field1959++;
        class228.method1488((byte) 107);
        if (arg0 != 104) {
            field1962 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method765(byte arg0) {
        field1962 = null;
        if (arg0 < -9) {
            field1961 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
    public static final void method766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 54) {
            return;
        }
        if (arg4 <= class255.field4371 && class40.field834 <= arg1) {
            boolean var6;
            if (class123.field2211 > arg5) {
                var6 = false;
                arg5 = class123.field2211;
            } else if (class145.field2540 >= arg5) {
                var6 = true;
            } else {
                var6 = false;
                arg5 = class145.field2540;
            }
            boolean var7;
            if (class123.field2211 > arg2) {
                arg2 = class123.field2211;
                var7 = false;
            } else if (arg2 <= class145.field2540) {
                var7 = true;
            } else {
                var7 = false;
                arg2 = class145.field2540;
            }
            if (arg4 >= class40.field834) {
                class94.method692(class185.field3220[arg4++], (byte) -126, arg5, arg3, arg2);
            } else {
                arg4 = class40.field834;
            }
            if (arg1 <= class255.field4371) {
                class94.method692(class185.field3220[arg1--], (byte) -126, arg5, arg3, arg2);
            } else {
                arg1 = class255.field4371;
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg1; var8++) {
                    int[] var9 = class185.field3220[var8];
                    var9[arg5] = var9[arg2] = arg3;
                }
            } else if (var6) {
                for (int var11 = arg4; var11 <= arg1; var11++) {
                    class185.field3220[var11][arg5] = arg3;
                }
            } else if (var7) {
                for (int var10 = arg4; var10 <= arg1; var10++) {
                    class185.field3220[var10][arg2] = arg3;
                }
            }
        }
        field1960++;
    }
}
