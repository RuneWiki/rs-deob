import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class273 {

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Lsf;")
    private class100 field4712;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "Lvi;")
    private class5 field4715;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lam;")
    private class240 field4706;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Z")
    public static boolean field4709 = true;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Lwa;")
    public static class75 field4716 = class235.method1709(160, 25204);

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "Lwa;")
    public static class75 field4718 = class66.method560("Eingabeprozedur geladen)3", false);

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "[I")
    public static int[] field4719 = new int[32];

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field4717 = 5063219;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "[Lfg;")
    public static class202[] field4721;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Lja;")
    private class60 field4714;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[Lfa;")
    private class186[] field4707;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 4)
    public static void method1944(int arg0) {
        field4718 = null;
        int var1 = 50 % ((arg0 - 55) / 57);
        field4721 = null;
        field4719 = null;
        field4716 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([Lpk;[BIZBI)V", line = 17)
    public static final void method1945(class104[] arg0, byte[] arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        field4703++;
        if (arg4 != 36) {
            return;
        }
        int var6 = -1;
        class60 var7 = new class60(arg1);
        while (true) {
            int var8 = var7.method533(291);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method504(arg4 - 94);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var9 >> 6 & 0x3F;
                int var14 = arg2 + var13;
                int var15 = var7.method501(arg4 ^ 0x24);
                int var16 = var15 & 0x3;
                int var17 = var15 >> 2;
                int var18 = arg5 + var11;
                if (var14 > 0 && var18 > 0 && var14 < 103 && var18 < 103) {
                    class104 var19 = null;
                    if (!arg3) {
                        int var20 = var12;
                        if ((class204.field3459[1][var14][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class247.method1786(var12, var14, !arg3, var18, var19, var12, var6, var17, false, arg3, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)I", line = 99)
    public static final int method1946(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field4708++;
        if (~var4 == arg0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return 1023 - arg1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 121)
    public final void method1947(byte arg0) {
        field4713++;
        if (this.field4707 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4707.length; var2++) {
            if (this.field4707[var2] != null) {
                this.field4707[var2].method1411(122);
            }
        }
        int var3 = -59 / ((arg0 + 58) / 36);
        for (int var4 = 0; var4 < this.field4707.length; var4++) {
            if (this.field4707[var4] != null) {
                this.field4707[var4].method1403(2);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Z", line = 159)
    public final boolean method1948(int arg0) {
        if (arg0 < 38) {
            this.method1948(-47);
        }
        field4702++;
        if (this.field4714 != null) {
            return true;
        }
        if (this.field4706 == null) {
            if (this.field4715.method24(-101)) {
                return false;
            }
            this.field4706 = this.field4715.method28((byte) 0, 255, 255, true, 28169);
        }
        if (this.field4706.field4575) {
            return false;
        } else {
            this.field4714 = new class60(this.field4706.method1751(true));
            this.field4707 = new class186[(this.field4714.field997.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lci;Lci;BI)Lfa;", line = 191)
    public final class186 method1949(class188 arg0, class188 arg1, byte arg2, int arg3) {
        if (arg2 >= -36) {
            field4716 = (class75) null;
        }
        field4705++;
        return this.method1950(true, arg0, arg3, (byte) -125, arg1);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLci;IBLci;)Lfa;", line = 203)
    private final class186 method1950(boolean arg0, class188 arg1, int arg2, byte arg3, class188 arg4) {
        field4711++;
        if (this.field4714 == null) {
            throw new RuntimeException();
        }
        this.field4714.field1012 = arg2 * 8 + 5;
        if (this.field4714.field997.length <= this.field4714.field1012) {
            throw new RuntimeException();
        } else if (this.field4707[arg2] == null) {
            int var6 = this.field4714.method505(255);
            int var7 = -41 / ((-arg3 - 24) / 63);
            int var8 = this.field4714.method505(255);
            class186 var9 = new class186(arg2, arg4, arg1, this.field4715, this.field4712, var6, var8, arg0);
            this.field4707[arg2] = var9;
            return var9;
        } else {
            return this.field4707[arg2];
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIII)V", line = 241)
    public static final void method1951(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4704++;
        int var6 = arg4;
        if (arg5 <= 72) {
            field4721 = (class202[]) null;
        }
        while (arg4 + arg3 >= var6) {
            for (int var7 = arg0; var7 <= arg0 + arg1; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class164.field2786[arg2][var7][var6] = 127;
                }
            }
            var6++;
        }
        for (int var8 = arg4; var8 < (arg3 + arg4); var8++) {
            for (int var9 = arg0; var9 < (arg0 + arg1); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class53.field879[arg2][var9][var8] = arg2 > 0 ? class53.field879[arg2 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var10 = arg4 + 1; var10 < arg3 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class53.field879[arg2][arg0][var10] = class53.field879[arg2][arg0 - 1][var10];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var11 = arg0 + 1; var11 < (arg0 + arg1); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class53.field879[arg2][var11][arg4] = class53.field879[arg2][var11][arg4 - 1];
                }
            }
        }
        if (arg0 < 0 || arg4 < 0 || arg0 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 > 0 && class53.field879[arg2][arg0 - 1][arg4] != 0) {
                class53.field879[arg2][arg0][arg4] = class53.field879[arg2][arg0 - 1][arg4];
            } else if (arg4 > 0 && class53.field879[arg2][arg0][arg4 - 1] != 0) {
                class53.field879[arg2][arg0][arg4] = class53.field879[arg2][arg0][arg4 - 1];
            } else if (arg0 > 0 && arg4 > 0 && class53.field879[arg2][arg0 - 1][arg4 - 1] != 0) {
                class53.field879[arg2][arg0][arg4] = class53.field879[arg2][arg0 - 1][arg4 - 1];
            }
        } else if (arg0 > 0 && class53.field879[arg2 - 1][arg0 - 1][arg4] != class53.field879[arg2][arg0 - 1][arg4]) {
            class53.field879[arg2][arg0][arg4] = class53.field879[arg2][arg0 - 1][arg4];
        } else if (arg4 > 0 && class53.field879[arg2][arg0][arg4 - 1] != class53.field879[arg2 - 1][arg0][arg4 - 1]) {
            class53.field879[arg2][arg0][arg4] = class53.field879[arg2][arg0][arg4 - 1];
        } else if (arg0 > 0 && arg4 > 0 && class53.field879[arg2 - 1][arg0 - 1][arg4 - 1] != class53.field879[arg2][arg0 - 1][arg4 - 1]) {
            class53.field879[arg2][arg0][arg4] = class53.field879[arg2][arg0 - 1][arg4 - 1];
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4719[var1] = var0 - 1;
            var0 += var0;
        }
        field4720 = 0;
        field4721 = new class202[500];
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lvi;Lsf;)V", line = 373)
    public class273(class5 arg0, class100 arg1) {
        this.field4712 = arg1;
        this.field4715 = arg0;
        if (!this.field4715.method24(-52)) {
            this.field4706 = this.field4715.method28((byte) 0, 255, 255, true, 28169);
        }
    }
}
