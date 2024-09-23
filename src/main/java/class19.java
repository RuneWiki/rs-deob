import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EYHVDWTF")
public class class19 extends class53 {

    @OriginalMember(owner = "EYHVDWTF", name = "B", descriptor = "Z")
    private boolean field719 = false;

    @OriginalMember(owner = "EYHVDWTF", name = "C", descriptor = "Z")
    private boolean field720 = true;

    @OriginalMember(owner = "EYHVDWTF", name = "E", descriptor = "[[B")
    public byte[][] field722 = new byte[256][];

    @OriginalMember(owner = "EYHVDWTF", name = "F", descriptor = "[I")
    public int[] field723 = new int[256];

    @OriginalMember(owner = "EYHVDWTF", name = "G", descriptor = "[I")
    public int[] field724 = new int[256];

    @OriginalMember(owner = "EYHVDWTF", name = "H", descriptor = "[I")
    public int[] field725 = new int[256];

    @OriginalMember(owner = "EYHVDWTF", name = "I", descriptor = "[I")
    public int[] field726 = new int[256];

    @OriginalMember(owner = "EYHVDWTF", name = "J", descriptor = "[I")
    public int[] field727 = new int[256];

    @OriginalMember(owner = "EYHVDWTF", name = "L", descriptor = "Ljava/util/Random;")
    public Random field729 = new Random();

    @OriginalMember(owner = "EYHVDWTF", name = "M", descriptor = "Z")
    public boolean field730 = false;

    @OriginalMember(owner = "EYHVDWTF", name = "A", descriptor = "I")
    private int field718;

    @OriginalMember(owner = "EYHVDWTF", name = "K", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "EYHVDWTF", name = "D", descriptor = "I")
    private int field721;

    @OriginalMember(owner = "EYHVDWTF", name = "<init>", descriptor = "(LSPZBTZXL;IZLjava/lang/String;)V")
    public class19(class51 arg0, int arg1, boolean arg2, String arg3) {
        class34 var5 = new class34(arg0.method515(arg3 + ".dat", null), this.field718);
        class34 var6 = new class34(arg0.method515("index.dat", null), this.field718);
        int var7 = 81 / arg1;
        boolean var8 = true;
        var6.field1073 = var5.method404() + 4;
        int var9 = var6.method402();
        if (var9 > 0) {
            var6.field1073 += (var9 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field725[var10] = var6.method402();
            this.field726[var10] = var6.method402();
            int var12 = this.field723[var10] = var6.method404();
            int var13 = this.field724[var10] = var6.method404();
            int var14 = var6.method402();
            int var15 = var12 * var13;
            this.field722[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field722[var10][var16] = var5.method403();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field722[var10][var12 * var18 + var17] = var5.method403();
                    }
                }
            }
            if (var13 > this.field728 && var10 < 128) {
                this.field728 = var13;
            }
            this.field725[var10] = 1;
            this.field727[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field722[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field727[var10]--;
                this.field725[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field722[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field727[var10]--;
            }
        }
        if (arg2) {
            this.field727[32] = this.field727[73];
        } else {
            this.field727[32] = this.field727[105];
        }
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "(Ljava/lang/String;BIII)V")
    public void method252(String arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.method257(arg2 - this.method256(-163, arg0), arg0, arg4, arg3, 0);
        if (arg1 != 28) {
            this.field719 = !this.field719;
        }
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method253(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 > 0) {
            this.method257(arg1 - this.method256(-163, arg0) / 2, arg0, arg2, arg3, 0);
        }
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "(IIILjava/lang/String;ZZ)V")
    public void method254(int arg0, int arg1, int arg2, String arg3, boolean arg4, boolean arg5) {
        if (arg5) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.method261(arg2, arg0 - this.method255(arg3, 0) / 2, arg4, true, arg3, arg1);
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method255(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field727[arg0.charAt(var4)];
            }
        }
        if (arg1 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        return var3;
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method256(int arg0, String arg1) {
        if (arg0 >= 0) {
            this.field719 = !this.field719;
        }
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            var3 += this.field727[arg1.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method257(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg2 - this.field728;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method264(this.field722[var8], this.field725[var8] + arg0, this.field726[var8] + var6, this.field723[var8], this.field724[var8], arg3);
            }
            arg0 += this.field727[var8];
        }
        if (arg4 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method258(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg5 - this.method256(-163, arg0) / 2;
        int var8 = arg4 - this.field728;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var11 = arg0.charAt(var9);
            if (var11 != ' ') {
                this.method264(this.field722[var11], this.field725[var11] + var7, this.field726[var11] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field723[var11], this.field724[var11], arg3);
            }
            var7 += this.field727[var11];
        }
        if (arg2 != -45089) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
    }

    @OriginalMember(owner = "EYHVDWTF", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method259(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 8) {
            this.field720 = !this.field720;
        }
        if (arg0 == null) {
            return;
        }
        int var7 = arg3 - this.method256(-163, arg0) / 2;
        int var8 = arg4 - this.field728;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method264(this.field722[var10], this.field725[var10] + var7 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field726[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field723[var10], this.field724[var10], arg1);
            }
            var7 += this.field727[var10];
        }
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "(Ljava/lang/String;IIIZII)V")
    public void method260(String arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg4 || arg0 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg5 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg2 - this.method256(-163, arg0) / 2;
        int var11 = arg1 - this.field728;
        for (int var12 = 0; var12 < arg0.length(); var12++) {
            char var13 = arg0.charAt(var12);
            if (var13 != ' ') {
                this.method264(this.field722[var13], this.field725[var13] + var10, this.field726[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg6) * var8), this.field723[var13], this.field724[var13], arg3);
            }
            var10 += this.field727[var13];
        }
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "(IIZZLjava/lang/String;I)V")
    public void method261(int arg0, int arg1, boolean arg2, boolean arg3, String arg4, int arg5) {
        this.field730 = false;
        int var7 = arg1;
        if (!arg3) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg4 == null) {
            return;
        }
        int var9 = arg5 - this.field728;
        for (int var10 = 0; var10 < arg4.length(); var10++) {
            if (arg4.charAt(var10) == '@' && var10 + 4 < arg4.length() && arg4.charAt(var10 + 4) == '@') {
                int var11 = this.method263(arg4.substring(var10 + 1, var10 + 4), 2);
                if (var11 != -1) {
                    arg0 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg4.charAt(var10);
                if (var12 != ' ') {
                    if (arg2) {
                        this.method264(this.field722[var12], this.field725[var12] + arg1 + 1, this.field726[var12] + var9 + 1, this.field723[var12], this.field724[var12], 0);
                    }
                    this.method264(this.field722[var12], this.field725[var12] + arg1, this.field726[var12] + var9, this.field723[var12], this.field724[var12], arg0);
                }
                arg1 += this.field727[var12];
            }
        }
        if (this.field730) {
            class53.method524((int) ((double) this.field728 * 0.7D) + var9, var7, 8388608, arg1 - var7, -81);
        }
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "(ILjava/lang/String;ZIIII)V")
    public void method262(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        this.field729.setSeed((long) arg4);
        int var8 = (this.field729.nextInt() & 0x1F) + 192;
        int var9 = arg6 - this.field728;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method263(arg1.substring(var10 + 1, var10 + 4), 2);
                if (var11 != -1) {
                    arg0 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg1.charAt(var10);
                if (var12 != ' ') {
                    if (arg2) {
                        this.method266((byte) 2, 192, this.field725[var12] + arg3 + 1, this.field724[var12], this.field723[var12], this.field726[var12] + var9 + 1, this.field722[var12], 0);
                    }
                    this.method266((byte) 2, var8, this.field725[var12] + arg3, this.field724[var12], this.field723[var12], this.field726[var12] + var9, this.field722[var12], arg0);
                }
                arg3 += this.field727[var12];
                if ((this.field729.nextInt() & 0x3) == 0) {
                    arg3++;
                }
            }
        }
        if (arg5 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "EYHVDWTF", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method263(String arg0, int arg1) {
        if (arg1 < 2 || arg1 > 2) {
            return 4;
        } else if (arg0.equals("red")) {
            return 16711680;
        } else if (arg0.equals("gre")) {
            return 65280;
        } else if (arg0.equals("blu")) {
            return 255;
        } else if (arg0.equals("yel")) {
            return 16776960;
        } else if (arg0.equals("cya")) {
            return 65535;
        } else if (arg0.equals("mag")) {
            return 16711935;
        } else if (arg0.equals("whi")) {
            return 16777215;
        } else if (arg0.equals("bla")) {
            return 0;
        } else if (arg0.equals("lre")) {
            return 16748608;
        } else if (arg0.equals("dre")) {
            return 8388608;
        } else if (arg0.equals("dbl")) {
            return 128;
        } else if (arg0.equals("or1")) {
            return 16756736;
        } else if (arg0.equals("or2")) {
            return 16740352;
        } else if (arg0.equals("or3")) {
            return 16723968;
        } else if (arg0.equals("gr1")) {
            return 12648192;
        } else if (arg0.equals("gr2")) {
            return 8453888;
        } else if (arg0.equals("gr3")) {
            return 4259584;
        } else {
            if (arg0.equals("str")) {
                this.field730 = true;
            }
            if (arg0.equals("end")) {
                this.field730 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "([BIIIII)V")
    private void method264(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class53.field1348 * arg2 + arg1;
        int var8 = class53.field1348 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class53.field1350) {
            int var11 = class53.field1350 - arg2;
            arg4 -= var11;
            arg2 = class53.field1350;
            var10 += arg3 * var11;
            var7 += class53.field1348 * var11;
        }
        if (arg2 + arg4 >= class53.field1351) {
            arg4 -= arg2 + arg4 + 1 - class53.field1351;
        }
        if (arg1 < class53.field1352) {
            int var12 = class53.field1352 - arg1;
            arg3 -= var12;
            arg1 = class53.field1352;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class53.field1353) {
            int var13 = arg1 + arg3 + 1 - class53.field1353;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method265(class53.field1347, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method265(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "(BIIIII[BI)V")
    private void method266(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        int var9 = class53.field1348 * arg5 + arg2;
        int var10 = class53.field1348 - arg4;
        int var11 = 0;
        int var12 = 0;
        if (arg0 != 2) {
            return;
        }
        boolean var13 = false;
        if (arg5 < class53.field1350) {
            int var14 = class53.field1350 - arg5;
            arg3 -= var14;
            arg5 = class53.field1350;
            var12 += arg4 * var14;
            var9 += class53.field1348 * var14;
        }
        if (arg3 + arg5 >= class53.field1351) {
            arg3 -= arg3 + arg5 + 1 - class53.field1351;
        }
        if (arg2 < class53.field1352) {
            int var15 = class53.field1352 - arg2;
            arg4 -= var15;
            arg2 = class53.field1352;
            var12 += var15;
            var9 += var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg2 + arg4 >= class53.field1353) {
            int var16 = arg2 + arg4 + 1 - class53.field1353;
            arg4 -= var16;
            var11 += var16;
            var10 += var16;
        }
        if (arg4 > 0 && arg3 > 0) {
            this.method267(var9, var10, 927, arg3, arg4, arg7, var12, arg1, var11, class53.field1347, arg6);
        }
    }

    @OriginalMember(owner = "EYHVDWTF", name = "a", descriptor = "(IIIIIIIII[I[B)V")
    private void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, byte[] arg10) {
        if (arg2 <= 0) {
            this.field721 = 499;
        }
        int var12 = ((arg5 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg7 & 0xFF0000) >> 8;
        int var13 = 256 - arg7;
        for (int var14 = -arg3; var14 < 0; var14++) {
            for (int var15 = -arg4; var15 < 0; var15++) {
                if (arg10[arg6++] == 0) {
                    arg0++;
                } else {
                    int var16 = arg9[arg0];
                    arg9[arg0++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg0 += arg1;
            arg6 += arg8;
        }
    }
}
