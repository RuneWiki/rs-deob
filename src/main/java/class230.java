import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class230 extends class241 {

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public int field4027;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    private int field4035;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "[Z")
    public boolean[] field4038;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "[I")
    public int[] field4030;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "[[I")
    public int[][] field4031;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "Loh;")
    private static class263 field4032 = class253.method1681(-127, " from your ignore list first)3");

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field4026 = 0;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "Loh;")
    public static class263 field4028 = field4032;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "J")
    public static volatile long field4037 = 0L;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "Lma;")
    public static class184 field4033;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "[Lbb;")
    public static class88[] field4029;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
    public static void method1553(int arg0) {
        field4029 = null;
        field4028 = null;
        if (arg0 != -1) {
            method1554(-8, 97);
        }
        field4033 = null;
        field4032 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)I")
    public static final int method1554(int arg0, int arg1) {
        if (arg0 < 19) {
            field4037 = 46L;
        }
        field4034++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([BIIIIZIIII[Lpg;)V")
    public static final void method1555(byte[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, class73[] arg10) {
        field4036++;
        class194 var11 = new class194(arg0);
        int var12 = -1;
        if (arg7 != 20235) {
            method1554(65, 97);
        }
        while (true) {
            int var13 = var11.method1303(-41);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1311(88);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var11.method1301(arg7 - 28552);
                int var19 = var18 >> 2;
                int var20 = var14 & 0x3F;
                int var21 = var18 & 0x3;
                if (arg1 == var17 && arg4 <= var16 && arg4 + 8 > var16 && var20 >= arg6 && (arg6 + 8) > var20) {
                    class12 var22 = class117.method763(var12, (byte) -106);
                    int var23 = class29.method191(-1, var22.field329, arg9, var21, var20 & 0x7, var16 & 0x7, var22.field308) + arg2;
                    int var24 = class59.method363(var16 & 0x7, arg9, var21, var22.field329, 119, var22.field308, var20 & 0x7) + arg8;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class73 var25 = null;
                        if (!arg5) {
                            int var26 = arg3;
                            if ((class77.field1576[1][var23][var24] & 0x2) == 2) {
                                var26 = arg3 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg10[var26];
                            }
                        }
                        class13.method107(var12, arg5, arg9 + var21 & 0x3, arg3, (byte) -21, var24, var19, var23, arg3, var25, !arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I[B)V")
    public class230(int arg0, byte[] arg1) {
        this.field4027 = arg0;
        class194 var3 = new class194(arg1);
        this.field4035 = var3.method1301(-8317);
        this.field4038 = new boolean[this.field4035];
        this.field4030 = new int[this.field4035];
        this.field4031 = new int[this.field4035][];
        for (int var4 = 0; var4 < this.field4035; var4++) {
            this.field4030[var4] = var3.method1301(-8317);
        }
        for (int var5 = 0; var5 < this.field4035; var5++) {
            this.field4038[var5] = var3.method1301(-8317) == 1;
        }
        for (int var6 = 0; var6 < this.field4035; var6++) {
            this.field4031[var6] = new int[var3.method1301(-8317)];
        }
        for (int var7 = 0; var7 < this.field4035; var7++) {
            for (int var8 = 0; var8 < this.field4031[var7].length; var8++) {
                this.field4031[var7][var8] = var3.method1301(-8317);
            }
        }
    }
}
