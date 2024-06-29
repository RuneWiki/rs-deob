import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class27 {

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Lmh;")
    public static class62 field343 = class201.method1405(true, "scrollen:");

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Llj;")
    public static class25 field331;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V", line = 4)
    public static final void method165(int arg0, int arg1) {
        field345++;
        if (class174.field2804 == arg0 && arg0 != 0) {
            class95 var2 = class163.field2647[arg0];
            var2.method385(class32.field437);
        }
        if (arg1 != 0) {
            field331 = (class25) null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 24)
    public static void method166(int arg0) {
        field343 = null;
        if (arg0 == 512) {
            field331 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 38)
    public static final void method167(int arg0) {
        field339++;
        class36.field496.method1395((byte) -43);
        class62.field899.method1395((byte) -43);
        if (arg0 != -10404) {
            method167(19);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIZII)V", line = 75)
    public static final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field352++;
        if (arg6 < 128 || arg1 < 128 || arg6 > 13056 || arg1 > 13056) {
            class62.field934 = -1;
            class148.field2327 = -1;
            return;
        }
        int var8 = class165.method1186((byte) -58, arg1, arg6, class7.field85) - arg4;
        if (!arg5) {
            method165(27, -79);
        }
        int var9 = var8 - class15.field134;
        int var10 = arg6 - class258.field4351;
        int var11 = arg1 - class215.field3647;
        int var12 = class23.field245[class46.field683];
        int var13 = class23.field254[class46.field683];
        int var14 = class23.field245[class30.field414];
        int var15 = class23.field254[class30.field414];
        int var16 = var10 * var15 + var11 * var14 >> 16;
        int var17 = var11 * var15 - (var10 * var14) >> 16;
        int var19 = var9 * var13 - (var12 * var17) >> 16;
        int var20 = var9 * var12 + var13 * var17 >> 16;
        if (var20 < 50) {
            class148.field2327 = -1;
            class62.field934 = -1;
        } else {
            int var22 = arg3 * 512 >> 8;
            class148.field2327 = arg2 + (var19 * var22 / var20);
            int var23 = arg7 * 512 >> 8;
            class62.field934 = arg0 + (var16 * var23 / var20);
        }
    }
}
