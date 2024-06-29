import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class153 extends class70 {

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "Z")
    public boolean field2744 = false;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    private int field2735 = 0;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    private int field2746 = 0;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    private int field2745 = -32768;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lsa;")
    private class249 field2727;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "[I")
    public static int[] field2731 = new int[100];

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "Leb;")
    public static class230 field2730 = null;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Lha;")
    public static class30 field2725 = new class30(128);

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Lpb;")
    public static class124 field2747 = new class124(5000);

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "Lgd;")
    public static class73 field2740;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method1171(byte arg0) {
        if (arg0 >= -1) {
            return;
        }
        field2740 = null;
        field2730 = null;
        field2731 = null;
        field2747 = null;
        field2725 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
    public final void method1172(int arg0, int arg1) {
        field2726++;
        if (this.field2744) {
            return;
        }
        this.field2746 += arg0;
        while (this.field2746 > this.field2727.field4433[this.field2735]) {
            this.field2746 -= this.field2727.field4433[this.field2735];
            this.field2735++;
            if (this.field2727.field4408.length <= this.field2735) {
                this.field2744 = true;
                break;
            }
        }
        if (arg1 != 0) {
            this.method500(-65, 3, -27, 3, 117, 91, 94, -85, 45L);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lrk;")
    private final class257 method1173(int arg0) {
        int var2 = -20 / ((arg0 - 13) / 39);
        field2741++;
        class8 var3 = class162.method1217((byte) 95, this.field2732);
        class257 var4;
        if (this.field2744) {
            var4 = var3.method77(0, -1);
        } else {
            var4 = var3.method77(0, this.field2735);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZIII)V")
    public static final void method1174(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg3; var6 <= arg1 + arg3; var6++) {
            for (int var11 = arg4; var11 <= arg0 + arg4; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class209.field3650[arg5][var11][var6] = 127;
                }
            }
        }
        field2743++;
        int var7 = arg3;
        if (!arg2) {
            method1171((byte) 80);
        }
        while ((arg1 + arg3) > var7) {
            for (int var10 = arg4; var10 < arg0 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class106.field1912[arg5][var10][var7] = arg5 > 0 ? class106.field1912[arg5 - 1][var10][var7] : 0;
                }
            }
            var7++;
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var8 = arg3 + 1; var8 < (arg1 + arg3); var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class106.field1912[arg5][arg4][var8] = class106.field1912[arg5][arg4 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var9 = arg4 + 1; var9 < arg4 + arg0; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class106.field1912[arg5][var9][arg3] = class106.field1912[arg5][var9][arg3 - 1];
                }
            }
        }
        if (arg4 < 0 || arg3 < 0 || arg4 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 > 0 && class106.field1912[arg5][arg4 - 1][arg3] != 0) {
                class106.field1912[arg5][arg4][arg3] = class106.field1912[arg5][arg4 - 1][arg3];
                return;
            }
            if (arg3 > 0 && class106.field1912[arg5][arg4][arg3 - 1] != 0) {
                class106.field1912[arg5][arg4][arg3] = class106.field1912[arg5][arg4][arg3 - 1];
                return;
            }
            if (arg4 > 0 && arg3 > 0 && class106.field1912[arg5][arg4 - 1][arg3 - 1] != 0) {
                class106.field1912[arg5][arg4][arg3] = class106.field1912[arg5][arg4 - 1][arg3 - 1];
                return;
            }
        } else if (arg4 <= 0 || class106.field1912[arg5 - 1][arg4 - 1][arg3] == class106.field1912[arg5][arg4 - 1][arg3]) {
            if (arg3 > 0 && class106.field1912[arg5][arg4][arg3 - 1] != class106.field1912[arg5 - 1][arg4][arg3 - 1]) {
                class106.field1912[arg5][arg4][arg3] = class106.field1912[arg5][arg4][arg3 - 1];
                return;
            }
            if (arg4 > 0 && arg3 > 0 && class106.field1912[arg5][arg4 - 1][arg3 - 1] != class106.field1912[arg5 - 1][arg4 - 1][arg3 - 1]) {
                class106.field1912[arg5][arg4][arg3] = class106.field1912[arg5][arg4 - 1][arg3 - 1];
                return;
            }
            return;
        } else {
            class106.field1912[arg5][arg4][arg3] = class106.field1912[arg5][arg4 - 1][arg3];
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()I")
    public final int method496() {
        field2739++;
        return this.field2745;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class257 var11 = this.method1173(72);
        field2728++;
        if (var11 != null) {
            var11.method500(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2745 = var11.method496();
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(IIIIIII)V")
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2738 = arg4;
        this.field2732 = arg0;
        this.field2736 = arg1;
        this.field2733 = arg5 + arg6;
        this.field2742 = arg2;
        this.field2737 = arg3;
        int var8 = class162.method1217((byte) 96, this.field2732).field131;
        if (var8 == -1) {
            this.field2744 = true;
        } else {
            this.field2744 = false;
            this.field2727 = class237.method1667(var8, 11);
        }
    }
}
