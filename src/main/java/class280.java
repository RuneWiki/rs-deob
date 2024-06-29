import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class280 implements class54 {

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Z")
    private boolean field4813 = false;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    private int field4828 = 50;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "Lme;")
    private class295 field4829;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "Lme;")
    private class295 field4836;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Lj;")
    private class138 field4797;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Lj;")
    private class138 field4807;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "[Z")
    private boolean[] field4825;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "[B")
    private byte[] field4821;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "[B")
    private byte[] field4796;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "[Z")
    private boolean[] field4803;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "[B")
    private byte[] field4804;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "[S")
    private short[] field4837;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "[Z")
    private boolean[] field4824;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[Z")
    private boolean[] field4795;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "[B")
    private byte[] field4838;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[Z")
    private boolean[] field4802;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4793 = 0;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "Lme;")
    public static class295 field4814;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "[I")
    public static int[] field4819;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)Z", line = 5)
    public final boolean method381(byte arg0, int arg1) {
        field4817++;
        if (arg0 < 31) {
            method1970(2, 41, 41, -120, -16, -17, 105);
        }
        return this.field4803[arg1];
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IB)Z", line = 16)
    public final boolean method379(int arg0, byte arg1) {
        field4826++;
        if (arg1 <= 50) {
            method1967(-15, 17, (byte) -12);
        }
        return this.field4795[arg0];
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)V", line = 28)
    public final void method1961(boolean arg0, int arg1) {
        if (arg1 != 0) {
            method1974(true);
        }
        this.field4813 = arg0;
        field4799++;
        this.method1972((byte) 14);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)I", line = 47)
    public final int method374(int arg0, int arg1) {
        if (arg1 != -2) {
            this.method372(-5, 12);
        }
        field4818++;
        return this.field4837[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(II)Z", line = 59)
    public final boolean method383(int arg0, int arg1) {
        if (arg1 > -39) {
            this.field4797 = (class138) null;
        }
        field4810++;
        return this.field4825[arg0];
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILme;)Lgg;", line = 73)
    public static final class47 method1962(int arg0, int arg1, class295 arg2) {
        field4816++;
        int var3 = 105 % ((arg0 - 21) / 39);
        return class96.method727(arg1, (byte) -117, arg2) ? class86.method647(121) : null;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IZ)V", line = 92)
    public final void method1963(int arg0, boolean arg1) {
        for (class147 var3 = (class147) this.field4797.method1004(100); var3 != null; var3 = (class147) this.field4797.method1002((byte) 116)) {
            if (var3.field2409) {
                var3.method1066((byte) 114, arg0);
                var3.field2409 = false;
            }
        }
        if (arg1) {
            this.field4829 = (class295) null;
        }
        field4805++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Laf;", line = 115)
    public static final class16 method1964(Throwable arg0, String arg1) {
        field4798++;
        class16 var2;
        if ((arg0 instanceof class16)) {
            var2 = (class16) arg0;
            var2.field210 = var2.field210 + ' ' + arg1;
        } else {
            var2 = new class16(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)I", line = 134)
    public final int method373(int arg0, byte arg1) {
        if (arg1 != -128) {
            method1962(1, -21, (class295) null);
        }
        field4800++;
        return this.field4838[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(FZI)[I", line = 146)
    public final int[] method376(float arg0, boolean arg1, int arg2) {
        field4815++;
        class147 var4 = this.method1969(arg2, 0);
        if (var4 == null) {
            return null;
        } else {
            var4.field2409 = arg1;
            return var4.method1062(this, -32471, arg0, this.field4813 || this.field4824[arg2], this.field4836);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZB)V", line = 171)
    public static final void method1965(boolean arg0, byte arg1) {
        field4806++;
        byte var2;
        byte[][] var3;
        if (class55.field815 && arg0) {
            var2 = 1;
            var3 = class190.field3185;
        } else {
            var3 = class288.field4953;
            var2 = 4;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class269.method1881((byte) -1);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class119.field1970[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0x6) >> 1;
                            int var11 = (var8 & 0xFFDE1F) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class260.field4348.length; var14++) {
                                if (class260.field4348[var14] == var13 && var3[var14] != null) {
                                    class19.method130(var4, var6 * 8, (var11 & 0x7) * 8, var3[var14], arg0, class41.field612, var9, var5 * 8, false, (var12 & 0x7) * 8, var10);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class197.method1423(8, var5 * 8, var6 * 8, var4, -22896, 8);
                    }
                }
            }
        }
        if (arg1 != -45) {
            method1974(true);
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(II)Z", line = 264)
    public final boolean method377(int arg0, int arg1) {
        field4823++;
        class147 var3 = this.method1969(arg1, arg0);
        return var3 == null ? false : var3.method1068(this, (byte) -94, this.field4836);
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(II)V", line = 281)
    public final void method375(int arg0, int arg1) {
        class131.method963(-12390, this.field4821[arg0] & 0xFF, arg1 & this.field4838[arg0]);
        field4830++;
        boolean var3 = false;
        class147 var4 = this.method1969(arg0, arg1 - 255);
        if (var4 != null) {
            var3 = var4.method1067(this.field4813 || this.field4824[arg0], this, (byte) -61, this.field4836);
        }
        if (!var3) {
            class120 var5 = this.method1973(arg1 ^ 0xFFFFB9A3, arg0);
            var5.method899(arg1 ^ 0xFFFFFF00);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Z", line = 314)
    public final boolean method372(int arg0, int arg1) {
        field4811++;
        if (arg1 != 0) {
            field4814 = (class295) null;
        }
        return this.field4813 || this.field4824[arg0];
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(II)I", line = 328)
    public final int method380(int arg0, int arg1) {
        field4801++;
        if (arg1 != 255) {
            this.field4802 = (boolean[]) null;
        }
        return this.field4804[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 340)
    public static void method1966(byte arg0) {
        field4819 = null;
        field4814 = null;
        int var1 = -46 % ((-arg0 - 22) / 57);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIB)V", line = 353)
    public static final void method1967(int arg0, int arg1, byte arg2) {
        field4809++;
        class186 var3 = class67.method561(32, arg0, 12);
        if (arg2 <= 105) {
            field4814 = (class295) null;
        }
        var3.method1380(3293);
        var3.field3117 = arg1;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lme;Lme;Lme;IZ)V", line = 594)
    public class280(class295 arg0, class295 arg1, class295 arg2, int arg3, boolean arg4) {
        this.field4828 = arg3;
        this.field4829 = arg0;
        this.field4813 = arg4;
        this.field4836 = arg2;
        this.field4797 = new class138(this.field4828);
        if (class55.field815) {
            this.field4807 = new class138(this.field4828);
        } else {
            this.field4807 = null;
        }
        class170 var6 = new class170(arg1.method2042(0, 0, (byte) -124));
        int var7 = var6.method1214(-18254);
        this.field4825 = new boolean[var7];
        this.field4821 = new byte[var7];
        this.field4796 = new byte[var7];
        this.field4803 = new boolean[var7];
        this.field4804 = new byte[var7];
        this.field4837 = new short[var7];
        this.field4824 = new boolean[var7];
        this.field4795 = new boolean[var7];
        this.field4838 = new byte[var7];
        this.field4802 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field4802[var8] = var6.method1221(100) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field4802[var9]) {
                this.field4795[var9] = var6.method1221(87) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field4802[var10]) {
                this.field4803[var10] = var6.method1221(86) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field4802[var11]) {
                this.field4824[var11] = var6.method1221(73) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field4802[var12]) {
                this.field4825[var12] = var6.method1221(93) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field4802[var13]) {
                this.field4796[var13] = var6.method1205(-1);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field4802[var14]) {
                this.field4804[var14] = var6.method1205(-1);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field4802[var15]) {
                this.field4838[var15] = var6.method1205(-1);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field4802[var16]) {
                this.field4821[var16] = var6.method1205(-1);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field4802[var17]) {
                this.field4837[var17] = (short) var6.method1214(-18254);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(II)I", line = 374)
    public final int method378(int arg0, int arg1) {
        if (arg0 == -27774) {
            field4808++;
            return this.field4796[arg1] & 0xFF;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lme;I)I", line = 387)
    public static final int method1968(class295 arg0, int arg1) {
        int var2 = 0;
        field4820++;
        if (arg1 != 1) {
            method1966((byte) 70);
        }
        if (arg0.method2034(class185.field3106, (byte) 12)) {
            var2++;
        }
        if (arg0.method2034(class9.field126, (byte) 52)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(II)Lmc;", line = 416)
    private final class147 method1969(int arg0, int arg1) {
        class147 var3 = (class147) this.field4797.method1006((long) arg0, 1);
        field4834++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4829.method2042(arg0, 0, (byte) -125);
        if (var4 == null) {
            return null;
        } else {
            class170 var5 = new class170(var4);
            class147 var6 = new class147(var5);
            this.field4797.method1008(var6, (long) arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)[I", line = 441)
    public final int[] method382(int arg0, boolean arg1) {
        if (arg1) {
            field4794++;
            class147 var3 = this.method1969(arg0, 0);
            return var3 == null ? null : var3.method1065(this.field4836, this.field4813 || this.field4824[arg0], (byte) -87, this);
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIII)V", line = 461)
    public static final void method1970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4833++;
        if (arg0 <= 98) {
            return;
        }
        int var7 = class262.method1808(arg4, class28.field369, 0, class62.field957);
        int var8 = class262.method1808(arg1, class28.field369, 0, class62.field957);
        int var9 = class262.method1808(arg5, class69.field1061, 0, class153.field2504);
        int var10 = class262.method1808(arg2, class69.field1061, 0, class153.field2504);
        int var11 = class262.method1808(arg4 + arg6, class28.field369, 0, class62.field957);
        int var12 = class262.method1808(arg1 - arg6, class28.field369, 0, class62.field957);
        for (int var13 = var7; var13 < var11; var13++) {
            class174.method1283(7, arg3, class163.field2662[var13], var9, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class174.method1283(7, arg3, class163.field2662[var14], var9, var10);
        }
        int var15 = class262.method1808(arg5 + arg6, class69.field1061, 0, class153.field2504);
        int var16 = class262.method1808(arg2 - arg6, class69.field1061, 0, class153.field2504);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class163.field2662[var17];
            class174.method1283(7, arg3, var18, var9, var15);
            class174.method1283(7, arg3, var18, var16, var10);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(BI)I", line = 513)
    public final int method384(byte arg0, int arg1) {
        field4822++;
        if (arg0 <= 97) {
            this.method375(-67, 83);
        }
        return this.field4821[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(IZ)V", line = 524)
    public final void method1971(int arg0, boolean arg1) {
        field4832++;
        if (!arg1) {
            this.field4803 = (boolean[]) null;
        }
        this.field4828 = arg0;
        this.field4797 = new class138(this.field4828);
        if (class55.field815) {
            this.field4807 = new class138(this.field4828);
        } else {
            this.field4807 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V", line = 541)
    public final void method1972(byte arg0) {
        this.field4797.method1005(52);
        if (this.field4807 != null) {
            this.field4807.method1005(-80);
        }
        field4835++;
        if (arg0 != 14) {
            this.field4836 = (class295) null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "(II)Lf;", line = 563)
    private final class120 method1973(int arg0, int arg1) {
        if (arg0 != -18084) {
            this.field4825 = (boolean[]) null;
        }
        class120 var3 = (class120) this.field4807.method1006((long) arg1, 1);
        field4812++;
        if (var3 == null) {
            class120 var4 = new class120(this.field4837[arg1] & 0xFFFF);
            this.field4807.method1008(var4, (long) arg1, 0);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 583)
    public static final void method1974(boolean arg0) {
        if (arg0) {
            field4827++;
            class292.field4990.method1482((byte) 30);
        }
    }
}
