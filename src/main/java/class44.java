import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class44 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public int field638 = -1;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public int field648 = 5;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public int field651 = -1;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "Z")
    public boolean field655 = false;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "Z")
    public boolean field653 = false;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public int field654 = -1;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public int field657 = -1;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public int field643 = 2;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Z")
    public boolean field646 = false;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "Z")
    public boolean field660 = false;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public int field649 = -1;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public int field645 = 99;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public static int field665 = 500;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "Loi;")
    public static class169 field656 = new class169("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Lsu;")
    public static class111 field639;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lbw;")
    public class329 field637;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "[I")
    public int[] field640;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "[I")
    public int[] field647;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "[I")
    private int[] field662;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "[Z")
    public boolean[] field667;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "[[I")
    public int[][] field666;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIIIII)Z")
    public static final boolean method279(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field659++;
        if (arg0 != -6) {
            field656 = null;
        }
        for (int var6 = arg4; var6 <= arg3; var6++) {
            for (int var7 = arg5; var7 <= arg2; var7++) {
                if (class484.field7043[var6][var7] == arg1 && class497.field7276[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILbt;)V")
    public final void method280(int arg0, class88 arg1) {
        field652++;
        while (true) {
            int var3 = arg1.method617(2);
            if (var3 == 0) {
                int var4 = 51 / ((arg0 - 19) / 51);
                return;
            }
            this.method289(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZIZ)I")
    public final int method281(int arg0, boolean arg1, int arg2, boolean arg3) {
        field658++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field640[arg0];
        class424 var8 = null;
        class424 var9 = this.field637.method1954(var7 >> 16, -112);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field660 || class310.field4004) && arg2 != -1 && this.field640.length > arg2) {
            int var11 = this.field640[arg2];
            var8 = this.field637.method1954(var11 >> 16, -118);
            var6 = var11 & 0xFFFF;
        }
        if (!arg3) {
            return -71;
        }
        if (this.field646) {
            var5 |= 0x200;
        }
        if (var9.method2513(var10, 3553)) {
            var5 |= 0x80;
        }
        if (var9.method2510(-1488416952, var10)) {
            var5 |= 0x100;
        }
        if (var9.method2511(255, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2513(var6, 3553)) {
                var5 |= 0x80;
            }
            if (var8.method2510(-1488416952, var6)) {
                var5 |= 0x100;
            }
            if (var8.method2511(255, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field662 != null && arg1) {
            if (this.field662.length > arg0) {
                int var12 = this.field662[arg0];
                if (var12 != 65535) {
                    class424 var13 = this.field637.method1954(var12 >> 16, -106);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2513(var14, 3553)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2510(-1488416952, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2511(255, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field660 || class310.field4004) && arg2 != -1 && this.field662.length > arg2) {
                int var15 = this.field662[arg2];
                if (var15 != 65535) {
                    class424 var16 = this.field637.method1954(var15 >> 16, -114);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2513(var17, 3553)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2510(-1488416952, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2511(255, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
    public final void method282(boolean arg0) {
        if (this.field649 == -1) {
            if (this.field667 == null) {
                this.field649 = 0;
            } else {
                this.field649 = 2;
            }
        }
        if (this.field654 == -1) {
            if (this.field667 == null) {
                this.field654 = 0;
            } else {
                this.field654 = 2;
            }
        }
        field644++;
        if (arg0) {
            this.method280(72, null);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)Lef;")
    public static final class436 method283(byte arg0) {
        if (arg0 != 96) {
            return null;
        }
        field664++;
        class436 var1 = (class436) class484.field7042.method2860(0);
        if (var1 != null) {
            var1.method3021(-107);
            var1.method540((byte) 121);
            return var1;
        }
        class436 var2;
        do {
            var2 = (class436) class465.field6839.method2860(0);
            if (var2 == null) {
                return null;
            }
            if (var2.method2568(true) > class173.method1134(true)) {
                return null;
            }
            var2.method3021(34);
            var2.method540((byte) 127);
        } while ((Long.MIN_VALUE & var2.field1143) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZB)V")
    public static final void method284(boolean arg0, boolean arg1, byte arg2) {
        if (arg0) {
            class478.field6976--;
            if (class478.field6976 == 0) {
                class9.field97 = null;
            }
        }
        field663++;
        if (arg2 != 9 || !arg1) {
            return;
        }
        class428.field5866--;
        if (class428.field5866 == 0) {
            class272.field3455 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIILc;I)Lc;")
    public final class507 method285(int arg0, int arg1, int arg2, int arg3, class507 arg4, int arg5) {
        field641++;
        int var7 = this.field647[arg0];
        int var8 = this.field640[arg0];
        if (arg1 >= -20) {
            field639 = null;
        }
        class424 var9 = this.field637.method1954(var8 >> 16, -103);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method510((byte) 1, arg2, true);
        }
        class424 var11 = null;
        if ((this.field660 || class310.field4004) && arg5 != -1 && this.field640.length > arg5) {
            int var12 = this.field640[arg5];
            var11 = this.field637.method1954(var12 >> 16, -117);
            arg5 = var12 & 0xFFFF;
        }
        class424 var13 = null;
        class424 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field662 != null) {
            if (this.field662.length > arg0) {
                var15 = this.field662[arg0];
                if (var15 != 65535) {
                    var13 = this.field637.method1954(var15 >> 16, -100);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field660 || class310.field4004) && arg5 != -1 && this.field662.length > arg5) {
                var16 = this.field662[arg5];
                if (var16 != 65535) {
                    var14 = this.field637.method1954(var16 >> 16, -114);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field646) {
            arg2 |= 0x200;
        }
        if (var9.method2513(var10, 3553)) {
            arg2 |= 0x80;
        }
        if (var9.method2510(-1488416952, var10)) {
            arg2 |= 0x100;
        }
        if (var9.method2511(255, var10)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2513(var15, 3553)) {
                arg2 |= 0x80;
            }
            if (var13.method2510(-1488416952, var15)) {
                arg2 |= 0x100;
            }
            if (var13.method2511(255, var15)) {
                arg2 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2513(arg5, 3553)) {
                arg2 |= 0x80;
            }
            if (var11.method2510(-1488416952, arg5)) {
                arg2 |= 0x100;
            }
            if (var11.method2511(255, arg5)) {
                arg2 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2513(var16, 3553)) {
                arg2 |= 0x80;
            }
            if (var14.method2510(-1488416952, var16)) {
                arg2 |= 0x100;
            }
            if (var14.method2511(255, var16)) {
                arg2 |= 0x400;
            }
        }
        int var17 = arg2 | 0x20;
        class507 var18 = arg4.method510((byte) 1, var17, true);
        var18.method3018(var10, var9, var7, arg3 - 1, 0, arg5, var11, this.field646, (byte) 59);
        if (var13 != null) {
            var18.method3018(var15, var13, var7, arg3 - 1, 0, var16, var14, this.field646, (byte) 59);
        }
        return var18;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
    public static void method286(byte arg0) {
        if (arg0 > -88) {
            field639 = null;
        }
        field639 = null;
        field656 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)I")
    public static final int method287(int arg0, int arg1) {
        return class507.field7443 == null ? 0 : class507.field7443[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILc;IIIIIB)Lc;")
    public final class507 method288(int arg0, class507 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field636++;
        if (arg0 < 110) {
            this.field637 = null;
        }
        int var9 = this.field647[arg6];
        int var10 = this.field640[arg6];
        class424 var11 = this.field637.method1954(var10 >> 16, -111);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method510(arg7, arg4, true);
        }
        class424 var13 = null;
        if ((this.field660 || class310.field4004) && arg2 != -1 && this.field640.length > arg2) {
            int var14 = this.field640[arg2];
            var13 = this.field637.method1954(var14 >> 16, -105);
            arg2 = var14 & 0xFFFF;
        }
        if (this.field646) {
            arg4 |= 0x200;
        }
        if (var11.method2513(var12, 3553)) {
            arg4 |= 0x80;
        }
        if (var11.method2510(-1488416952, var12)) {
            arg4 |= 0x100;
        }
        if (var11.method2511(255, var12)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2513(arg2, 3553)) {
                arg4 |= 0x80;
            }
            if (var13.method2510(-1488416952, arg2)) {
                arg4 |= 0x100;
            }
            if (var13.method2511(255, arg2)) {
                arg4 |= 0x400;
            }
        }
        int var15 = arg4 | 0x20;
        class507 var16 = arg1.method510(arg7, var15, true);
        var16.method3018(var12, var11, var9, arg5 - 1, arg3, arg2, var13, this.field646, (byte) 59);
        return var16;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZLbt;)V")
    private final void method289(int arg0, boolean arg1, class88 arg2) {
        if (arg0 == 1) {
            int var4 = arg2.method568((byte) 110);
            this.field647 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field647[var5] = arg2.method568((byte) 110);
            }
            this.field640 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field640[var6] = arg2.method568((byte) 110);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field640[var7] += arg2.method568((byte) 110) << 16;
            }
        } else if (arg0 == 2) {
            this.field657 = arg2.method568((byte) 110);
        } else if (arg0 == 3) {
            this.field667 = new boolean[256];
            int var15 = arg2.method617(2);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field667[arg2.method617(2)] = true;
            }
        } else if (arg0 == 4) {
            this.field653 = true;
        } else if (arg0 == 5) {
            this.field648 = arg2.method617(2);
        } else if (arg0 == 6) {
            this.field638 = arg2.method568((byte) 110);
        } else if (arg0 == 7) {
            this.field651 = arg2.method568((byte) 110);
        } else if (arg0 == 8) {
            this.field645 = arg2.method617(2);
        } else if (arg0 == 9) {
            this.field654 = arg2.method617(2);
        } else if (arg0 == 10) {
            this.field649 = arg2.method617(2);
        } else if (arg0 == 11) {
            this.field643 = arg2.method617(2);
        } else if (arg0 == 12) {
            int var12 = arg2.method617(2);
            this.field662 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field662[var13] = arg2.method568((byte) 110);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field662[var14] = (arg2.method568((byte) 110) << 16) + this.field662[var14];
            }
        } else if (arg0 == 13) {
            int var8 = arg2.method568((byte) 110);
            this.field666 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method617(2);
                if (var10 > 0) {
                    this.field666[var9] = new int[var10];
                    this.field666[var9][0] = arg2.method584(255);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field666[var9][var11] = arg2.method568((byte) 110);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field646 = true;
        } else if (arg0 == 15) {
            this.field660 = true;
        } else if (arg0 == 16) {
            this.field655 = true;
        }
        if (!arg1) {
            this.field637 = null;
        }
        field661++;
    }
}
