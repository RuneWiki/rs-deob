import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class467 {

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "Z")
    public boolean field6814 = false;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public int field6810 = 5;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public int field6811 = -1;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public int field6822 = -1;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public int field6821 = -1;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public int field6824 = -1;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public int field6818 = -1;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "Z")
    public boolean field6820 = false;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public int field6827 = 99;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "Z")
    public boolean field6816 = false;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
    public int field6826 = 2;

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "Z")
    public boolean field6830 = false;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field6804 = new String[100];

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "Lfg;")
    public static class83 field6808 = new class83("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field6831 = new String[200];

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "[I")
    public static int[] field6833 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!qp", name = "F", descriptor = "Luf;")
    public static class310 field6834 = null;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public int field6819;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "Lbk;")
    public class253 field6823;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "[I")
    public int[] field6806;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "[I")
    private int[] field6828;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "[I")
    public int[] field6829;

    @OriginalMember(owner = "client!qp", name = "D", descriptor = "[Lf;")
    public static class529[] field6832;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "[Z")
    public boolean[] field6803;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "[[I")
    public int[][] field6815;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Llh;II)V", line = 5)
    private final void method2741(class365 arg0, int arg1, int arg2) {
        if (arg1 != 6529) {
            return;
        }
        field6807++;
        if (arg2 == 1) {
            int var13 = arg0.method2062((byte) 14);
            this.field6829 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field6829[var14] = arg0.method2062((byte) 14);
            }
            this.field6806 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field6806[var15] = arg0.method2062((byte) 14);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field6806[var16] += arg0.method2062((byte) 14) << 16;
            }
        } else if (arg2 == 2) {
            this.field6821 = arg0.method2062((byte) 14);
        } else if (arg2 == 3) {
            this.field6803 = new boolean[256];
            int var4 = arg0.method2099(255);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6803[arg0.method2099(class63.method396(arg1, 6526))] = true;
            }
        } else if (arg2 == 4) {
            this.field6814 = true;
        } else if (arg2 == 5) {
            this.field6810 = arg0.method2099(255);
        } else if (arg2 == 6) {
            this.field6818 = arg0.method2062((byte) 14);
        } else if (arg2 == 7) {
            this.field6811 = arg0.method2062((byte) 14);
        } else if (arg2 == 8) {
            this.field6827 = arg0.method2099(255);
        } else if (arg2 == 9) {
            this.field6824 = arg0.method2099(255);
        } else if (arg2 == 10) {
            this.field6822 = arg0.method2099(255);
        } else if (arg2 == 11) {
            this.field6826 = arg0.method2099(255);
        } else if (arg2 == 12) {
            int var6 = arg0.method2099(255);
            this.field6828 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field6828[var7] = arg0.method2062((byte) 14);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field6828[var8] = (arg0.method2062((byte) 14) << 16) + this.field6828[var8];
            }
        } else if (arg2 == 13) {
            int var9 = arg0.method2062((byte) 14);
            this.field6815 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg0.method2099(arg1 - 6274);
                if (var11 > 0) {
                    this.field6815[var10] = new int[var11];
                    this.field6815[var10][0] = arg0.method2111(-2);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field6815[var10][var12] = arg0.method2062((byte) 14);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field6820 = true;
        } else if (arg2 == 15) {
            this.field6816 = true;
        } else if (arg2 == 16) {
            this.field6830 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 167)
    public static void method2742(int arg0) {
        field6804 = null;
        field6808 = null;
        field6832 = null;
        field6834 = null;
        field6833 = null;
        field6831 = null;
        if (arg0 != -1) {
            field6833 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILlh;)V", line = 182)
    public final void method2743(int arg0, class365 arg1) {
        field6825++;
        int var3 = -88 / ((-arg0 - 76) / 48);
        while (true) {
            int var4 = arg1.method2099(255);
            if (var4 == 0) {
                return;
            }
            this.method2741(arg1, 6529, var4);
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V", line = 208)
    public final void method2744(int arg0) {
        field6813++;
        if (this.field6824 == -1) {
            if (this.field6803 == null) {
                this.field6824 = 0;
            } else {
                this.field6824 = 2;
            }
        }
        if (arg0 != 128) {
            this.field6819 = -98;
        }
        if (this.field6822 != -1) {
            return;
        }
        if (this.field6803 == null) {
            this.field6822 = 0;
        } else {
            this.field6822 = 2;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIII)I", line = 251)
    public final int method2745(boolean arg0, int arg1, int arg2, int arg3) {
        field6805++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field6806[arg3];
        class102 var8 = null;
        if (arg1 != 29742) {
            this.field6826 = -59;
        }
        class102 var9 = this.field6823.method1488(-24, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field6816 || class239.field3287) && arg2 != -1 && this.field6806.length > arg2) {
            int var11 = this.field6806[arg2];
            var8 = this.field6823.method1488(-24, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field6820) {
            var5 |= 0x200;
        }
        if (var9.method672((byte) 35, var10)) {
            var5 |= 0x80;
        }
        if (var9.method673(var10, arg1 ^ 0x742C)) {
            var5 |= 0x100;
        }
        if (var9.method677((byte) -89, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method672((byte) 66, var6)) {
                var5 |= 0x80;
            }
            if (var8.method673(var6, arg1 ^ 0x742C)) {
                var5 |= 0x100;
            }
            if (var8.method677((byte) -110, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field6828 != null && arg0) {
            if (this.field6828.length > arg3) {
                int var12 = this.field6828[arg3];
                if (var12 != 65535) {
                    class102 var13 = this.field6823.method1488(-24, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method672((byte) 87, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method673(var14, arg1 ^ 0x742C)) {
                            var5 |= 0x100;
                        }
                        if (var13.method677((byte) -117, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field6816 || class239.field3287) && arg2 != -1 && this.field6828.length > arg2) {
                int var15 = this.field6828[arg2];
                if (var15 != 65535) {
                    class102 var16 = this.field6823.method1488(-24, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method672((byte) 125, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method673(var17, 2)) {
                            var5 |= 0x100;
                        }
                        if (var16.method677((byte) -123, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V", line = 377)
    public static final void method2746(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 > -55) {
            field6834 = null;
        }
        if (class437.field6374.field4262 != 0 && arg2 != 0 && class292.field3915 < 50 && arg4 != -1) {
            class526.field7723[class292.field3915++] = new class20((byte) 2, arg4, arg2, arg0, arg1, 0);
        }
        field6812++;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIZLc;)Lc;", line = 416)
    public final class121 method2747(int arg0, int arg1, int arg2, int arg3, boolean arg4, class121 arg5) {
        field6817++;
        int var7 = this.field6829[arg3];
        int var8 = this.field6806[arg3];
        class102 var9 = this.field6823.method1488(-24, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method761((byte) 1, arg1, true);
        }
        class102 var11 = null;
        if ((this.field6816 || class239.field3287) && arg0 != -1 && this.field6806.length > arg0) {
            int var12 = this.field6806[arg0];
            var11 = this.field6823.method1488(-24, var12 >> 16);
            arg0 = var12 & 0xFFFF;
        }
        class102 var13 = null;
        class102 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field6828 != null) {
            if (this.field6828.length > arg3) {
                var15 = this.field6828[arg3];
                if (var15 != 65535) {
                    var13 = this.field6823.method1488(-24, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field6816 || class239.field3287) && arg0 != -1 && this.field6828.length > arg0) {
                var16 = this.field6828[arg0];
                if (var16 != 65535) {
                    var14 = this.field6823.method1488(-24, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field6820) {
            arg1 |= 0x200;
        }
        if (var9.method672((byte) 65, var10)) {
            arg1 |= 0x80;
        }
        if (var9.method673(var10, 2)) {
            arg1 |= 0x100;
        }
        if (var9.method677((byte) -128, var10)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method672((byte) 42, var15)) {
                arg1 |= 0x80;
            }
            if (var13.method673(var15, 2)) {
                arg1 |= 0x100;
            }
            if (var13.method677((byte) -113, var15)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method672((byte) 41, arg0)) {
                arg1 |= 0x80;
            }
            if (var11.method673(arg0, 2)) {
                arg1 |= 0x100;
            }
            if (var11.method677((byte) -84, arg0)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method672((byte) 80, var16)) {
                arg1 |= 0x80;
            }
            if (var14.method673(var16, 2)) {
                arg1 |= 0x100;
            }
            if (var14.method677((byte) -95, var16)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        class121 var18 = arg5.method761((byte) 1, var17, arg4);
        var18.method768(arg2 - 1, var10, 0, var11, this.field6820, var9, arg0, -83, var7);
        if (var13 != null) {
            var18.method768(arg2 - 1, var15, 0, var14, this.field6820, var13, var16, -87, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BILc;IIIII)Lc;", line = 554)
    public final class121 method2748(byte arg0, int arg1, class121 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6809++;
        int var9 = this.field6829[arg1];
        int var10 = this.field6806[arg1];
        class102 var11 = this.field6823.method1488(-24, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg2.method761(arg0, arg3, true);
        }
        class102 var13 = null;
        if ((this.field6816 || class239.field3287) && arg7 != -1 && this.field6806.length > arg7) {
            int var14 = this.field6806[arg7];
            var13 = this.field6823.method1488(-24, var14 >> 16);
            arg7 = var14 & 0xFFFF;
        }
        if (this.field6820) {
            arg3 |= 0x200;
        }
        if (var11.method672((byte) 77, var12)) {
            arg3 |= 0x80;
        }
        if (var11.method673(var12, 2)) {
            arg3 |= 0x100;
        }
        if (var11.method677((byte) -128, var12)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method672((byte) 54, arg7)) {
                arg3 |= 0x80;
            }
            if (var13.method673(arg7, arg5 ^ 0x22)) {
                arg3 |= 0x100;
            }
            if (var13.method677((byte) -93, arg7)) {
                arg3 |= 0x400;
            }
        }
        int var15 = arg3 | arg5;
        class121 var16 = arg2.method761(arg0, var15, true);
        var16.method768(arg4 - 1, var12, arg6, var13, this.field6820, var11, arg7, -123, var9);
        return var16;
    }
}
