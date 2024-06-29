import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class43 extends class209 {

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "Lcl;")
    public class203 field721;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "[[I")
    public static int[][] field723 = new int[5][5000];

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "Lcc;")
    public static class222 field729;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZILtc;ZIZIZ)Lel;")
    public static final class213 method373(int arg0, boolean arg1, int arg2, class186 arg3, boolean arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        field728++;
        class179 var9 = class123.method929(22497, arg2);
        if (arg7 > 1 && var9.field2748 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg7 >= var9.field2776[var11] && var9.field2776[var11] != 0) {
                    var10 = var9.field2748[var11];
                }
            }
            if (var10 != -1) {
                var9 = class123.method929(22497, var10);
            }
        }
        class87 var12 = var9.method1285((byte) 63, arg3);
        if (var12 == null) {
            return null;
        }
        class51 var13 = null;
        if (var9.field2747 != -1) {
            var13 = (class51) method373(1, arg1, var9.field2804, arg3, false, 0, true, 10, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2805 != -1) {
            var13 = (class51) method373(arg0, false, var9.field2814, arg3, false, arg5, false, arg7, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class66.field1032;
        int var15 = class66.field1036;
        int var16 = class66.field1035;
        int[] var17 = new int[4];
        class66.method521(var17);
        class51 var18 = new class51(36, 32);
        class66.method527(var18.field822, 36, 32);
        class224.method1543();
        class224.method1554(16, 16);
        class224.field3604 = arg1;
        int var19 = var9.field2752;
        if (arg6) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg0 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class224.field3601[var9.field2787] * var19 >> 16;
        int var21 = class224.field3597[var9.field2787] * var19 >> 16;
        var12.method94(0, var9.field2750, var9.field2809, var9.field2787, var9.field2803, var20 + (var9.field2794 - (var12.method82() / 2)), var21 - -var9.field2794, -1L);
        if (arg0 >= 1) {
            var18.method423(1);
            if (arg0 >= 2) {
                var18.method423(16777215);
            }
            class66.method527(var18.field822, 36, 32);
        }
        if (arg5 != 0) {
            var18.method434(arg5);
        }
        if (var9.field2747 != -1) {
            var13.method425(0, 0);
        } else if (var9.field2805 != -1) {
            class66.method527(var13.field822, 36, 32);
            var18.method425(0, 0);
            var18 = var13;
        }
        if (arg4 && (var9.field2795 == 1 || arg7 != 1) && arg7 != -1) {
            class106.field1661.method1810(class101.method775(1000000, arg7), 0, 9, 16776960, 1);
        }
        class66.method527(var14, var15, var16);
        class66.method529(var17);
        class224.method1543();
        class224.field3604 = true;
        return var18;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
    public final void method374(int arg0, int arg1, int arg2, int arg3) {
        this.field727 = arg3;
        if (arg2 <= -77) {
            this.field715 = arg1;
            this.field722 = arg0;
            field726++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    public static void method375(int arg0) {
        if (arg0 >= -72) {
            method376((byte) -11, false, -57, -31);
        }
        field723 = null;
        field729 = null;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lcl;Lgj;)V")
    public class43(class203 arg0, class249 arg1) {
        this.field721 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BZII)V")
    public static final void method376(byte arg0, boolean arg1, int arg2, int arg3) {
        field716++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class174.field2695 = arg2;
        if (arg0 < 59) {
            method375(-112);
        }
        class259.field4107 = arg1;
        class308.field4936 = arg3;
    }
}
