import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class class214 {

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public int field3830;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public int field3835;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Z")
    public static boolean field3833 = false;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "[Lvf;")
    public static class70[] field3834 = new class70[4];

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "[I")
    public static int[] field3823 = new int[2000];

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Lqj;")
    public static class196 field3836 = class80.method502("(U4", -48);

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Lqj;")
    private static class196 field3831 = class80.method502("Loading)3)3)3", -48);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lqj;")
    public static class196 field3824 = field3831;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "[[B")
    public static byte[][] field3825;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
    public abstract void method388(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILec;)V")
    public static final void method1472(int arg0, class178 arg1) {
        if (class99.field1424 == arg1.field3138) {
            class161.field2588[arg1.field3107] = true;
        }
        field3828++;
        int var2 = 22 % ((arg0 - 7) / 47);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static void method1473(byte arg0) {
        field3824 = null;
        field3836 = null;
        field3834 = null;
        field3831 = null;
        field3823 = null;
        field3825 = null;
        if (arg0 != 19) {
            field3833 = false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIBLbk;)Lwi;")
    public static final class233 method1474(int arg0, int arg1, byte arg2, class136 arg3) {
        if (arg2 <= 120) {
            field3836 = null;
        }
        field3826++;
        return class84.method528(arg3, arg1, arg0, 0) ? class52.method275(false) : null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIII)V")
    public static final void method1475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3837++;
        if (arg3 != -105) {
            field3836 = null;
        }
        for (int var6 = arg1; var6 <= arg1 + arg4; var6++) {
            for (int var11 = arg0; var11 <= arg0 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class45.field538[arg2][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg1; var7 < arg1 + arg4; var7++) {
            for (int var10 = arg0; var10 < arg0 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class42.field480[arg2][var10][var7] = arg2 <= 0 ? 0 : class42.field480[arg2 - 1][var10][var7];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var8 = arg1 + 1; var8 < arg1 + arg4; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class42.field480[arg2][arg0][var8] = class42.field480[arg2][arg0 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var9 = arg0 + 1; var9 < arg0 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class42.field480[arg2][var9][arg1] = class42.field480[arg2][var9][arg1 - 1];
                }
            }
        }
        if (arg0 < 0 || arg1 < 0 || arg0 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 > 0 && class42.field480[arg2][arg0 - 1][arg1] != 0) {
                class42.field480[arg2][arg0][arg1] = class42.field480[arg2][arg0 - 1][arg1];
                return;
            }
            if (arg1 > 0 && class42.field480[arg2][arg0][arg1 - 1] != 0) {
                class42.field480[arg2][arg0][arg1] = class42.field480[arg2][arg0][arg1 - 1];
                return;
            }
            if (arg0 > 0 && arg1 > 0 && class42.field480[arg2][arg0 - 1][arg1 - 1] != 0) {
                class42.field480[arg2][arg0][arg1] = class42.field480[arg2][arg0 - 1][arg1 - 1];
                return;
            }
        } else if (arg0 <= 0 || class42.field480[arg2 - 1][arg0 - 1][arg1] == class42.field480[arg2][arg0 - 1][arg1]) {
            if (arg1 > 0 && class42.field480[arg2 - 1][arg0][arg1 - 1] != class42.field480[arg2][arg0][arg1 - 1]) {
                class42.field480[arg2][arg0][arg1] = class42.field480[arg2][arg0][arg1 - 1];
                return;
            }
            if (arg0 > 0 && arg1 > 0 && class42.field480[arg2 - 1][arg0 - 1][arg1 - 1] != class42.field480[arg2][arg0 - 1][arg1 - 1]) {
                class42.field480[arg2][arg0][arg1] = class42.field480[arg2][arg0 - 1][arg1 - 1];
                return;
            }
            return;
        } else {
            class42.field480[arg2][arg0][arg1] = class42.field480[arg2][arg0 - 1][arg1];
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
    public static final int method1476(int arg0) {
        if (arg0 == -954688305) {
            field3832++;
            return ((class70.field977 == 0 ? 0 : 1) << 22) + ((class211.field3801 == 0 ? 0 : 1) << 21) + ((class88.field1293 & 0x3) << 17) + ((class192.field3371 ? 1 : 0) << 16) + ((class151.field2444 ? 1 : 0) << 10) + ((class19.field228 ? 1 : 0) << 9) + ((class111.field1636 ? 1 : 0) << 3) + (class50.field602 & 0x7) + ((class71.field1004 ? 1 : 0) << 6) + ((class203.field3661 ? 1 : 0) << 7) + ((class133.field1898 ? 1 : 0) << 8) + ((class159.field2554 & 0x3) << 11) + ((class174.field2935 ? 1 : 0) << 13) + ((class159.field2556 ? 1 : 0) << 15) + ((class45.field543 ? 1 : 0) << 19) + ((class189.field3315 == 0 ? 0 : 1) << 20) - (-((class240.field4271 ? 1 : 0) << 4) + -((class219.field3919 ? 1 : 0) << 5));
        } else {
            return -84;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(III)V")
    public abstract void method392(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BII)V")
    public abstract void method390(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(III)V")
    public class214(int arg0, int arg1, int arg2) {
        this.field3830 = arg2;
        this.field3835 = arg0;
        this.field3827 = arg1;
    }
}
