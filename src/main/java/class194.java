import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class194 {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lcf;")
    private class28 field3601 = new class28();

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Loe;")
    private class157 field3613 = new class157();

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    private int field3616;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    private int field3612;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lnc;")
    private class144 field3615;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "Lqe;")
    private static class179 field3617 = class206.method1380("K", (byte) 43);

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lqe;")
    public static class179 field3602 = field3617;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lqe;")
    public static class179 field3609 = field3617;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lnc;")
    public static class144 field3603 = new class144(32);

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field3618 = 0;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "Lqe;")
    public static class179 field3620 = class206.method1380("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", (byte) -37);

    @OriginalMember(owner = "client!s", name = "t", descriptor = "[[[I")
    public static int[][][] field3619 = new int[4][105][105];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "[Lnb;")
    public static class143[] field3621;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public final void method1297(byte arg0) {
        while (true) {
            class28 var2 = this.field3613.method1020(1);
            if (var2 == null) {
                if (arg0 != 89) {
                    field3617 = null;
                }
                field3604++;
                this.field3612 = this.field3616;
                return;
            }
            var2.method592((byte) -128);
            var2.method187((byte) 104);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)Lib;")
    public final class89 method1298(byte arg0) {
        if (arg0 < 40) {
            return null;
        } else {
            field3610++;
            return this.field3615.method907(true);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BJ)Lcf;")
    public final class28 method1299(byte arg0, long arg1) {
        field3608++;
        class28 var4 = (class28) this.field3615.method909(-1, arg1);
        if (var4 != null) {
            this.field3613.method1021(-1, var4);
        }
        int var5 = -22 % ((-arg0 - 56) / 56);
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Z")
    public static final boolean method1300(int arg0, int arg1) {
        if (arg0 != 0) {
            method1305(29);
        }
        field3607++;
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Z")
    public static final boolean method1301(int arg0, int arg1) {
        int var2 = 123 % ((arg1 + 32) / 42);
        field3605++;
        return (arg0 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1302(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = -75 % ((arg5 - 28) / 47);
        field3614++;
        for (int var7 = arg4; var7 <= arg4 + arg3; var7++) {
            for (int var12 = arg1; var12 <= arg1 + arg2; var12++) {
                if (var12 >= 0 && var12 < 104 && var7 >= 0 && var7 < 104) {
                    class128.field2344[arg0][var12][var7] = 127;
                }
            }
        }
        for (int var8 = arg4; var8 < arg3 + arg4; var8++) {
            for (int var11 = arg1; var11 < arg1 + arg2; var11++) {
                if (var11 >= 0 && var11 < 104 && var8 >= 0 && var8 < 104) {
                    field3619[arg0][var11][var8] = arg0 <= 0 ? 0 : field3619[arg0 - 1][var11][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var9 = arg4 + 1; var9 < arg4 + arg3; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    field3619[arg0][arg1][var9] = field3619[arg0][arg1 - 1][var9];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var10 = arg1 + 1; var10 < arg1 + arg2; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    field3619[arg0][var10][arg4] = field3619[arg0][var10][arg4 - 1];
                }
            }
        }
        if (arg1 < 0 || arg4 < 0 || arg1 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 > 0 && field3619[arg0][arg1 - 1][arg4] != 0) {
                field3619[arg0][arg1][arg4] = field3619[arg0][arg1 - 1][arg4];
                return;
            }
            if (arg4 > 0 && field3619[arg0][arg1][arg4 - 1] != 0) {
                field3619[arg0][arg1][arg4] = field3619[arg0][arg1][arg4 - 1];
                return;
            }
            if (arg1 > 0 && arg4 > 0 && field3619[arg0][arg1 - 1][arg4 - 1] != 0) {
                field3619[arg0][arg1][arg4] = field3619[arg0][arg1 - 1][arg4 - 1];
                return;
            }
        } else if (arg1 <= 0 || field3619[arg0 - 1][arg1 - 1][arg4] == field3619[arg0][arg1 - 1][arg4]) {
            if (arg4 > 0 && field3619[arg0 - 1][arg1][arg4 - 1] != field3619[arg0][arg1][arg4 - 1]) {
                field3619[arg0][arg1][arg4] = field3619[arg0][arg1][arg4 - 1];
                return;
            }
            if (arg1 > 0 && arg4 > 0 && field3619[arg0][arg1 - 1][arg4 - 1] != field3619[arg0 - 1][arg1 - 1][arg4 - 1]) {
                field3619[arg0][arg1][arg4] = field3619[arg0][arg1 - 1][arg4 - 1];
                return;
            }
            return;
        } else {
            field3619[arg0][arg1][arg4] = field3619[arg0][arg1 - 1][arg4];
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lcf;JB)V")
    public final void method1303(class28 arg0, long arg1, byte arg2) {
        field3606++;
        if (this.field3612 == 0) {
            class28 var5 = this.field3613.method1020(1);
            var5.method592((byte) -128);
            var5.method187((byte) 14);
            if (this.field3601 == var5) {
                class28 var6 = this.field3613.method1020(1);
                var6.method592((byte) -128);
                var6.method187((byte) -104);
            }
        } else {
            this.field3612--;
        }
        this.field3615.method914(arg1, arg0, true);
        this.field3613.method1021(-1, arg0);
        int var7 = 84 % ((arg2 + 26) / 42);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JI)V")
    public final void method1304(long arg0, int arg1) {
        if (arg1 > -104) {
            method1302(110, 75, 122, -32, 42, (byte) 120);
        }
        field3600++;
        class28 var4 = (class28) this.field3615.method909(-1, arg0);
        if (var4 != null) {
            var4.method592((byte) -128);
            var4.method187((byte) 35);
            this.field3612++;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1305(int arg0) {
        field3609 = null;
        if (arg0 != -1) {
            return;
        }
        field3619 = null;
        field3617 = null;
        field3621 = null;
        field3603 = null;
        field3620 = null;
        field3602 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Lib;")
    public final class89 method1306(int arg0) {
        field3611++;
        if (arg0 < 52) {
            field3602 = null;
        }
        return this.field3615.method913(0);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V")
    public class194(int arg0) {
        this.field3616 = arg0;
        this.field3612 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3615 = new class144(var2);
    }
}
