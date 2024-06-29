import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 extends class28 {

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    public int field261 = 5;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
    public int field268 = -1;

    @OriginalMember(owner = "client!bd", name = "hb", descriptor = "I")
    public int field272 = 2;

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "Z")
    public boolean field270 = false;

    @OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
    public int field271 = -1;

    @OriginalMember(owner = "client!bd", name = "ib", descriptor = "I")
    public int field273 = -1;

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
    public int field266 = 99;

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
    public int field269 = -1;

    @OriginalMember(owner = "client!bd", name = "qb", descriptor = "I")
    public int field281 = -1;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "Lpb;")
    public static class105 field264 = new class105();

    @OriginalMember(owner = "client!bd", name = "xb", descriptor = "[I")
    public static int[] field288 = new int[500];

    @OriginalMember(owner = "client!bd", name = "ub", descriptor = "Lja;")
    private static class62 field285 = class30.method243(43, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!bd", name = "yb", descriptor = "Lja;")
    private static class62 field289 = class30.method243(43, "Loading)3)3)3");

    @OriginalMember(owner = "client!bd", name = "Bb", descriptor = "Lja;")
    public static class62 field292 = class30.method243(43, "sl_back");

    @OriginalMember(owner = "client!bd", name = "zb", descriptor = "I")
    public static int field290 = 0;

    @OriginalMember(owner = "client!bd", name = "Ab", descriptor = "Lja;")
    public static class62 field291 = class30.method243(43, "k");

    @OriginalMember(owner = "client!bd", name = "vb", descriptor = "Lja;")
    private static class62 field286 = class30.method243(43, "No response from server)3");

    @OriginalMember(owner = "client!bd", name = "tb", descriptor = "Lja;")
    public static class62 field284 = field289;

    @OriginalMember(owner = "client!bd", name = "wb", descriptor = "I")
    public static int field287 = 0;

    @OriginalMember(owner = "client!bd", name = "Eb", descriptor = "Lja;")
    public static class62 field295 = field285;

    @OriginalMember(owner = "client!bd", name = "Cb", descriptor = "Lja;")
    public static class62 field293 = field286;

    @OriginalMember(owner = "client!bd", name = "sb", descriptor = "Lc;")
    public static class18 field283 = new class18(30);

    @OriginalMember(owner = "client!bd", name = "Hb", descriptor = "I")
    public static int field298 = -1;

    @OriginalMember(owner = "client!bd", name = "Ib", descriptor = "Lja;")
    private static class62 field299 = class30.method243(43, "You can(Wt add yourself to your own ignore list");

    @OriginalMember(owner = "client!bd", name = "Gb", descriptor = "Lja;")
    public static class62 field297 = field299;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!bd", name = "jb", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bd", name = "kb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!bd", name = "lb", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bd", name = "mb", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!bd", name = "nb", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!bd", name = "ob", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!bd", name = "rb", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!bd", name = "Db", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bd", name = "Fb", descriptor = "Lmf;")
    public static class89 field296;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "[I")
    private int[] field260;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "[I")
    private int[] field262;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "[I")
    public int[] field263;

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "[I")
    public int[] field267;

    @OriginalMember(owner = "client!bd", name = "pb", descriptor = "[I")
    public int[] field280;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public final void method85(int arg0) {
        field277++;
        if (this.field271 == -1) {
            if (this.field260 == null) {
                this.field271 = 0;
            } else {
                this.field271 = 2;
            }
        }
        if (this.field269 == -1) {
            if (this.field260 == null) {
                this.field269 = 0;
            } else {
                this.field269 = 2;
            }
        }
        if (arg0 != 500) {
            this.method88(109, null, 108);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILvb;)Lvb;")
    public final class145 method86(int arg0, int arg1, int arg2, class145 arg3) {
        int var5 = this.field263[arg0];
        class22 var6 = class119.method954((byte) -119, var5 >> 16);
        field276++;
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method1146(true);
        }
        class145 var8 = arg3.method1146(!var6.method167(32402, var7));
        int var9 = arg1 & 0x3;
        if (var9 == 1) {
            var8.method1143();
        } else if (var9 == 2) {
            var8.method1148();
        } else if (var9 == 3) {
            var8.method1150();
        }
        var8.method1156(var6, var7);
        if (arg2 != -17524) {
            return null;
        }
        if (var9 == 1) {
            var8.method1150();
        } else if (var9 == 2) {
            var8.method1148();
        } else if (var9 == 3) {
            var8.method1143();
        }
        return var8;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILvb;)Lvb;")
    public final class145 method87(int arg0, int arg1, class145 arg2) {
        field275++;
        int var4 = this.field263[arg1];
        class22 var5 = class119.method954((byte) -128, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1146(true);
        }
        int var7 = arg0;
        class22 var8 = null;
        if (this.field262 != null && arg1 < this.field262.length) {
            int var9 = this.field262[arg1];
            var8 = class119.method954((byte) -125, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class145 var11 = arg2.method1146(!var5.method167(32402, var6));
            var11.method1156(var5, var6);
            return var11;
        } else {
            class145 var10 = arg2.method1146(!var5.method167(32402, var6) & !var8.method167(32402, var7));
            var10.method1156(var5, var6);
            var10.method1156(var8, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILvb;I)Lvb;")
    public final class145 method88(int arg0, class145 arg1, int arg2) {
        field294++;
        int var4 = this.field263[arg2];
        class22 var5 = class119.method954((byte) -120, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1151(true);
        } else if (arg0 == 6) {
            class145 var7 = arg1.method1151(!var5.method167(arg0 ^ 0x7E94, var6));
            var7.method1156(var5, var6);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public static void method89(int arg0) {
        field296 = null;
        field292 = null;
        field264 = null;
        field295 = null;
        field289 = null;
        field284 = null;
        if (arg0 < 15) {
            method89(-127);
        }
        field293 = null;
        field288 = null;
        field299 = null;
        field286 = null;
        field297 = null;
        field285 = null;
        field283 = null;
        field291 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ls;I)V")
    public final void method90(class128 arg0, int arg1) {
        field274++;
        while (true) {
            int var3 = arg0.method1025(255);
            if (var3 == 0) {
                int var4 = -39 % ((-arg1 - 20) / 38);
                return;
            }
            this.method93((byte) -115, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILvb;IILbd;)Lvb;")
    public final class145 method91(int arg0, class145 arg1, int arg2, int arg3, class12 arg4) {
        field278++;
        int var6 = this.field263[arg3];
        class22 var7 = class119.method954((byte) -124, var6 >> 16);
        int var8 = var6 & arg2;
        if (var7 == null) {
            return arg4.method92(arg1, arg2 ^ 0xFFFF0064, arg0);
        }
        int var9 = arg4.field263[arg0];
        class22 var10 = class119.method954((byte) -118, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class145 var12 = arg1.method1146(!var7.method167(32402, var8));
            var12.method1156(var7, var8);
            return var12;
        } else {
            class145 var13 = arg1.method1146(!var7.method167(32402, var8) & !var10.method167(32402, var11));
            var13.method1152(var7, var8, var10, var11, this.field260);
            return var13;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lvb;II)Lvb;")
    public final class145 method92(class145 arg0, int arg1, int arg2) {
        int var4 = this.field263[arg2];
        class22 var5 = class119.method954((byte) -116, var4 >> 16);
        int var6 = 68 % ((56 - arg1) / 36);
        field279++;
        int var7 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1146(true);
        } else {
            class145 var8 = arg0.method1146(!var5.method167(32402, var7));
            var8.method1156(var5, var7);
            return var8;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLs;I)V")
    private final void method93(byte arg0, class128 arg1, int arg2) {
        if (arg2 == 1) {
            int var4 = arg1.method1041(212464720);
            this.field280 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field280[var5] = arg1.method1041(212464720);
            }
            this.field263 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field263[var6] = arg1.method1041(212464720);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field263[var7] = (arg1.method1041(212464720) << 16) + this.field263[var7];
            }
        } else if (arg2 == 2) {
            this.field273 = arg1.method1041(212464720);
        } else if (arg2 == 3) {
            int var13 = arg1.method1025(255);
            this.field260 = new int[var13 + 1];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field260[var14] = arg1.method1025(255);
            }
            this.field260[var13] = 9999999;
        } else if (arg2 == 4) {
            this.field270 = true;
        } else if (arg2 == 5) {
            this.field261 = arg1.method1025(255);
        } else if (arg2 == 6) {
            this.field268 = arg1.method1041(212464720);
        } else if (arg2 == 7) {
            this.field281 = arg1.method1041(212464720);
        } else if (arg2 == 8) {
            this.field266 = arg1.method1025(255);
        } else if (arg2 == 9) {
            this.field271 = arg1.method1025(255);
        } else if (arg2 == 10) {
            this.field269 = arg1.method1025(255);
        } else if (arg2 == 11) {
            this.field272 = arg1.method1025(255);
        } else if (arg2 == 12) {
            int var10 = arg1.method1025(255);
            this.field262 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field262[var11] = arg1.method1041(212464720);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field262[var12] += arg1.method1041(212464720) << 16;
            }
        } else if (arg2 == 13) {
            int var8 = arg1.method1025(255);
            this.field267 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field267[var9] = arg1.method1026((byte) 79);
            }
        }
        if (arg0 <= -54) {
            field265++;
        }
    }
}
