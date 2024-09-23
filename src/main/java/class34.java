import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MCYRKBJU")
public class class34 extends class26 {

    @OriginalMember(owner = "MCYRKBJU", name = "x", descriptor = "I")
    private int field1092 = -118;

    @OriginalMember(owner = "MCYRKBJU", name = "y", descriptor = "Z")
    private boolean field1093 = false;

    @OriginalMember(owner = "MCYRKBJU", name = "z", descriptor = "I")
    private int field1094 = 4;

    @OriginalMember(owner = "MCYRKBJU", name = "A", descriptor = "Z")
    private boolean field1095 = true;

    @OriginalMember(owner = "MCYRKBJU", name = "C", descriptor = "[[B")
    public byte[][] field1097 = new byte[256][];

    @OriginalMember(owner = "MCYRKBJU", name = "D", descriptor = "[I")
    public int[] field1098 = new int[256];

    @OriginalMember(owner = "MCYRKBJU", name = "E", descriptor = "[I")
    public int[] field1099 = new int[256];

    @OriginalMember(owner = "MCYRKBJU", name = "F", descriptor = "[I")
    public int[] field1100 = new int[256];

    @OriginalMember(owner = "MCYRKBJU", name = "G", descriptor = "[I")
    public int[] field1101 = new int[256];

    @OriginalMember(owner = "MCYRKBJU", name = "H", descriptor = "[I")
    public int[] field1102 = new int[256];

    @OriginalMember(owner = "MCYRKBJU", name = "J", descriptor = "Ljava/util/Random;")
    public Random field1104 = new Random();

    @OriginalMember(owner = "MCYRKBJU", name = "K", descriptor = "Z")
    public boolean field1105 = false;

    @OriginalMember(owner = "MCYRKBJU", name = "I", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "MCYRKBJU", name = "B", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "MCYRKBJU", name = "<init>", descriptor = "(LBBMKAXRK;ILjava/lang/String;Z)V")
    public class34(class6 arg0, int arg1, String arg2, boolean arg3) {
        class17 var5 = new class17(arg0.method30(arg2 + ".dat", null), -26583);
        class17 var6 = new class17(arg0.method30("index.dat", null), -26583);
        boolean var7 = true;
        var6.field779 = var5.method226() + 4;
        int var8 = var6.method224();
        if (var8 > 0) {
            var6.field779 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1100[var9] = var6.method224();
            this.field1101[var9] = var6.method224();
            int var12 = this.field1098[var9] = var6.method226();
            int var13 = this.field1099[var9] = var6.method226();
            int var14 = var6.method224();
            int var15 = var12 * var13;
            this.field1097[var9] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field1097[var9][var16] = var5.method225();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field1097[var9][var12 * var18 + var17] = var5.method225();
                    }
                }
            }
            if (var13 > this.field1103 && var9 < 128) {
                this.field1103 = var13;
            }
            this.field1100[var9] = 1;
            this.field1102[var9] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field1097[var9][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field1102[var9]--;
                this.field1100[var9] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field1097[var9][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field1102[var9]--;
            }
        }
        if (arg1 < 2 || arg1 > 2) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        if (arg3) {
            this.field1102[32] = this.field1102[73];
        } else {
            this.field1102[32] = this.field1102[105];
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method372(int arg0, int arg1, int arg2, int arg3, String arg4) {
        this.method377(arg4, arg1, arg2 - this.method376(arg4, -980), 0, arg3);
        int var6 = 55 / arg0;
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method373(int arg0, String arg1, int arg2, int arg3, int arg4) {
        this.method377(arg1, arg3, arg2 - this.method376(arg1, -980) / 2, 0, arg0);
        if (arg4 != 48419) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
    public void method374(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 < 0) {
            this.method381(arg1 - this.method375(arg2, true) / 2, arg3, arg4, arg5, arg2, -98);
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method375(String arg0, boolean arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field1102[arg0.charAt(var4)];
            }
        }
        if (arg1) {
            return var3;
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method376(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 >= 0) {
            return this.field1096;
        } else {
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                var3 += this.field1102[arg0.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method377(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg0 == null) {
            return;
        }
        int var7 = arg1 - this.field1103;
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            char var9 = arg0.charAt(var8);
            if (var9 != ' ') {
                this.method384(this.field1097[var9], this.field1100[var9] + arg2, this.field1101[var9] + var7, this.field1098[var9], this.field1099[var9], arg4);
            }
            arg2 += this.field1102[var9];
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public void method378(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg2 - this.method376(arg5, -980) / 2;
        if (arg1 != -31425) {
            return;
        }
        int var8 = arg0 - this.field1103;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method384(this.field1097[var10], this.field1100[var10] + var7, this.field1101[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1098[var10], this.field1099[var10], arg4);
            }
            var7 += this.field1102[var10];
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(IIILjava/lang/String;ZI)V")
    public void method379(int arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg1 - this.method376(arg3, -980) / 2;
        if (!arg4) {
            this.field1093 = !this.field1093;
        }
        int var8 = arg0 - this.field1103;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            char var10 = arg3.charAt(var9);
            if (var10 != ' ') {
                this.method384(this.field1097[var10], this.field1100[var10] + var7 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1101[var10] + var8 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1098[var10], this.field1099[var10], arg2);
            }
            var7 += this.field1102[var10];
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(IBLjava/lang/String;IIII)V")
    public void method380(int arg0, byte arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg0 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg5 - this.method376(arg2, -980) / 2;
        int var11 = arg3 - this.field1103;
        for (int var12 = 0; var12 < arg2.length(); var12++) {
            char var13 = arg2.charAt(var12);
            if (var13 != ' ') {
                this.method384(this.field1097[var13], this.field1100[var13] + var10, this.field1101[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg6) * var8), this.field1098[var13], this.field1099[var13], arg4);
            }
            var10 += this.field1102[var13];
        }
        if (arg1 == 9) {
            ;
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(IIZILjava/lang/String;I)V")
    public void method381(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5) {
        this.field1105 = false;
        int var7 = arg0;
        if (arg4 == null) {
            return;
        }
        int var8 = arg1 - this.field1103;
        if (arg5 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        for (int var10 = 0; var10 < arg4.length(); var10++) {
            if (arg4.charAt(var10) == '@' && var10 + 4 < arg4.length() && arg4.charAt(var10 + 4) == '@') {
                int var11 = this.method383(0, arg4.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg3 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg4.charAt(var10);
                if (var12 != ' ') {
                    if (arg2) {
                        this.method384(this.field1097[var12], this.field1100[var12] + arg0 + 1, this.field1101[var12] + var8 + 1, this.field1098[var12], this.field1099[var12], 0);
                    }
                    this.method384(this.field1097[var12], this.field1100[var12] + arg0, this.field1101[var12] + var8, this.field1098[var12], this.field1099[var12], arg3);
                }
                arg0 += this.field1102[var12];
            }
        }
        if (this.field1105) {
            class26.method318(arg0 - var7, (int) ((double) this.field1103 * 0.7D) + var8, var7, -548, 8388608);
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(IZLjava/lang/String;IIII)V")
    public void method382(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 8 || arg2 == null) {
            return;
        }
        this.field1104.setSeed((long) arg4);
        int var8 = (this.field1104.nextInt() & 0x1F) + 192;
        int var9 = arg3 - this.field1103;
        for (int var10 = 0; var10 < arg2.length(); var10++) {
            if (arg2.charAt(var10) == '@' && var10 + 4 < arg2.length() && arg2.charAt(var10 + 4) == '@') {
                int var11 = this.method383(0, arg2.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg0 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg2.charAt(var10);
                if (var12 != ' ') {
                    if (arg1) {
                        this.method386(this.field1101[var12] + var9 + 1, this.field1100[var12] + arg5 + 1, this.field1097[var12], 0, 192, 769, this.field1099[var12], this.field1098[var12]);
                    }
                    this.method386(this.field1101[var12] + var9, this.field1100[var12] + arg5, this.field1097[var12], arg0, var8, 769, this.field1099[var12], this.field1098[var12]);
                }
                arg5 += this.field1102[var12];
                if ((this.field1104.nextInt() & 0x3) == 0) {
                    arg5++;
                }
            }
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method383(int arg0, String arg1) {
        if (arg0 != 0) {
            return this.field1094;
        } else if (arg1.equals("red")) {
            return 16711680;
        } else if (arg1.equals("gre")) {
            return 65280;
        } else if (arg1.equals("blu")) {
            return 255;
        } else if (arg1.equals("yel")) {
            return 16776960;
        } else if (arg1.equals("cya")) {
            return 65535;
        } else if (arg1.equals("mag")) {
            return 16711935;
        } else if (arg1.equals("whi")) {
            return 16777215;
        } else if (arg1.equals("bla")) {
            return 0;
        } else if (arg1.equals("lre")) {
            return 16748608;
        } else if (arg1.equals("dre")) {
            return 8388608;
        } else if (arg1.equals("dbl")) {
            return 128;
        } else if (arg1.equals("or1")) {
            return 16756736;
        } else if (arg1.equals("or2")) {
            return 16740352;
        } else if (arg1.equals("or3")) {
            return 16723968;
        } else if (arg1.equals("gr1")) {
            return 12648192;
        } else if (arg1.equals("gr2")) {
            return 8453888;
        } else if (arg1.equals("gr3")) {
            return 4259584;
        } else {
            if (arg1.equals("str")) {
                this.field1105 = true;
            }
            if (arg1.equals("end")) {
                this.field1105 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "([BIIIII)V")
    private void method384(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class26.field877 * arg2 + arg1;
        int var8 = class26.field877 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class26.field879) {
            int var11 = class26.field879 - arg2;
            arg4 -= var11;
            arg2 = class26.field879;
            var10 += arg3 * var11;
            var7 += class26.field877 * var11;
        }
        if (arg2 + arg4 >= class26.field880) {
            arg4 -= arg2 + arg4 + 1 - class26.field880;
        }
        if (arg1 < class26.field881) {
            int var12 = class26.field881 - arg1;
            arg3 -= var12;
            arg1 = class26.field881;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class26.field882) {
            int var13 = arg1 + arg3 + 1 - class26.field882;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method385(class26.field876, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method385(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(II[BIIIII)V")
    private void method386(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 <= 0) {
            this.field1095 = !this.field1095;
        }
        int var9 = class26.field877 * arg0 + arg1;
        int var10 = class26.field877 - arg7;
        int var11 = 0;
        int var12 = 0;
        if (arg0 < class26.field879) {
            int var13 = class26.field879 - arg0;
            arg6 -= var13;
            arg0 = class26.field879;
            var12 += arg7 * var13;
            var9 += class26.field877 * var13;
        }
        if (arg0 + arg6 >= class26.field880) {
            arg6 -= arg0 + arg6 + 1 - class26.field880;
        }
        if (arg1 < class26.field881) {
            int var14 = class26.field881 - arg1;
            arg7 -= var14;
            arg1 = class26.field881;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg7 >= class26.field882) {
            int var15 = arg1 + arg7 + 1 - class26.field882;
            arg7 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg7 > 0 && arg6 > 0) {
            this.method387(var12, var11, arg7, arg6, var9, arg2, true, class26.field876, arg3, arg4, var10);
        }
    }

    @OriginalMember(owner = "MCYRKBJU", name = "a", descriptor = "(IIIII[BZ[IIII)V")
    private void method387(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, boolean arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg8 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var13 = 256 - arg9;
        for (int var14 = -arg3; var14 < 0; var14++) {
            for (int var15 = -arg2; var15 < 0; var15++) {
                if (arg5[arg0++] == 0) {
                    arg4++;
                } else {
                    int var16 = arg7[arg4];
                    arg7[arg4++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg4 += arg10;
            arg0 += arg1;
        }
        if (!arg6) {
            this.field1092 = -429;
        }
    }
}
