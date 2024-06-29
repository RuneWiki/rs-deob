import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class36 extends class155 {

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public static int field561 = 0;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "Ljava/lang/String;")
    public static String field570 = "Loading config - ";

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "[I")
    public static int[] field575 = new int[128];

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "[I")
    public static int[] field571 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field572 = 0;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "[I")
    public static int[] field563 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "[Lbf;")
    public static class31[] field566 = new class31[14];

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field578 = -1;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "[Z")
    public static boolean[] field579 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "Lqh;")
    public static class237 field567 = class179.method1304(0);

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "Laj;")
    public static class151 field573;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "Laj;")
    public static class151 field582;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "Ljava/lang/String;")
    public String field583;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "[I")
    public static int[] field574;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "[[Z")
    public static boolean[][] field584;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)V")
    public static final void method220(int arg0) {
        class49.field837.method94(34);
        ++field576;
        class49.field825.method94(34);
        class270.field4484.method94(arg0 ^ 35);
        if (arg0 != 1) {
            field571 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "(I)V")
    public final void method221(int arg0) {
        super.field2570 = class188.method1355(-128) - -500L | super.field2570 & Long.MIN_VALUE;
        class244.field4099.method449((byte) -64, this);
        ++field565;
        if (arg0 != 1) {
            field570 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static void method222(boolean arg0) {
        if (arg0) {
            method225(119, -11, -35, -45, 46, 6, 95, -19, false);
        }
        field582 = null;
        field567 = null;
        field574 = null;
        field579 = null;
        field571 = null;
        field566 = null;
        field563 = null;
        field570 = null;
        field573 = null;
        field584 = null;
        field575 = null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V")
    public static final void method223(int arg0, int arg1) {
        class49.field837.method98(1, arg0);
        ++field568;
        class49.field825.method98(1, arg0);
        class270.field4484.method98(arg1 ^ 449960424, arg0);
        if (arg1 != 449960425) {
            method223(109, 10);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
    public final void method224(boolean arg0) {
        ++field559;
        super.field2570 |= Long.MIN_VALUE;
        if (arg0) {
            this.field562 = 106;
        }
        if (this.method227(2) == 0L) {
            class293.field4806.method449((byte) -64, this);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIZ)V")
    public static final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        ++field581;
        if (arg7 >= 128 && arg1 >= 128 && ~arg7 >= -13057 && ~arg1 >= -13057) {
            int var9 = -arg6 + class277.method1939(class182.field2898, arg7, arg1, (byte) -34);
            int var10 = var9 - class263.field4393;
            int var11 = arg1 - class76.field1302;
            if (!arg8) {
                method220(-24);
            }
            int var12 = class128.field2130[class183.field2926];
            int var13 = arg7 - class107.field1758;
            int var14 = class128.field2133[class245.field4102];
            int var15 = class128.field2133[class183.field2926];
            int var16 = class128.field2130[class245.field4102];
            int var17 = var11 * var14 + var13 * var16 >> 16;
            int var18 = var11 * var16 - var13 * var14 >> 16;
            int var20 = var10 * var12 - var15 * var18 >> 16;
            int var21 = arg3 + var17;
            int var22 = var10 * var15 - -(var12 * var18) >> 16;
            if (~var22 > -51) {
                class147.field2418 = -1;
                class170.field2756 = -1;
            } else {
                class147.field2418 = (var20 << 9) / var22 + arg4;
                class170.field2756 = arg2 - -((var21 << 9) / var22);
            }
        } else {
            class147.field2418 = -1;
            class170.field2756 = -1;
        }
    }

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "(I)I")
    public final int method226(int arg0) {
        ++field564;
        int var2 = 53 / ((arg0 - 53) / 59);
        return (int) super.field2213;
    }

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "(I)J")
    public final long method227(int arg0) {
        if (arg0 != 2) {
            this.field583 = null;
        }
        ++field569;
        return Long.MAX_VALUE & super.field2570;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)I")
    public final int method228(byte arg0) {
        if (arg0 != -37) {
            return -100;
        } else {
            ++field580;
            return (int) (super.field2213 >>> 32 & 255L);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(II)V")
    public class36(int arg0, int arg1) {
        super.field2213 = (long) arg0 << 32 | (long) arg1;
    }
}
