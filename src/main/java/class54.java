import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QJBJRTJO")
public class class54 extends class19 {

    @OriginalMember(owner = "QJBJRTJO", name = "x", descriptor = "Z")
    private boolean field1158 = false;

    @OriginalMember(owner = "QJBJRTJO", name = "y", descriptor = "I")
    private int field1159 = 788;

    @OriginalMember(owner = "QJBJRTJO", name = "A", descriptor = "I")
    private int field1161 = 42086;

    @OriginalMember(owner = "QJBJRTJO", name = "B", descriptor = "Z")
    private boolean field1162 = false;

    @OriginalMember(owner = "QJBJRTJO", name = "D", descriptor = "[[B")
    public byte[][] field1164 = new byte[256][];

    @OriginalMember(owner = "QJBJRTJO", name = "E", descriptor = "[I")
    public int[] field1165 = new int[256];

    @OriginalMember(owner = "QJBJRTJO", name = "F", descriptor = "[I")
    public int[] field1166 = new int[256];

    @OriginalMember(owner = "QJBJRTJO", name = "G", descriptor = "[I")
    public int[] field1167 = new int[256];

    @OriginalMember(owner = "QJBJRTJO", name = "H", descriptor = "[I")
    public int[] field1168 = new int[256];

    @OriginalMember(owner = "QJBJRTJO", name = "I", descriptor = "[I")
    public int[] field1169 = new int[256];

    @OriginalMember(owner = "QJBJRTJO", name = "K", descriptor = "Ljava/util/Random;")
    public Random field1171 = new Random();

    @OriginalMember(owner = "QJBJRTJO", name = "L", descriptor = "Z")
    public boolean field1172 = false;

    @OriginalMember(owner = "QJBJRTJO", name = "J", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "QJBJRTJO", name = "z", descriptor = "I")
    private int field1160;

    @OriginalMember(owner = "QJBJRTJO", name = "C", descriptor = "I")
    private int field1163;

    @OriginalMember(owner = "QJBJRTJO", name = "<init>", descriptor = "(ILHRXSNEYZ;Ljava/lang/String;Z)V")
    public class54(int arg0, class26 arg1, String arg2, boolean arg3) {
        class31 var5 = new class31(arg1.method289(arg2 + ".dat", null), 8);
        class31 var6 = new class31(arg1.method289("index.dat", null), 8);
        boolean var7 = true;
        if (arg0 < 9 || arg0 > 9) {
            throw new NullPointerException();
        }
        var6.field901 = var5.method308() + 4;
        int var8 = var6.method306();
        if (var8 > 0) {
            var6.field901 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1167[var9] = var6.method306();
            this.field1168[var9] = var6.method306();
            int var11 = this.field1165[var9] = var6.method308();
            int var12 = this.field1166[var9] = var6.method308();
            int var13 = var6.method306();
            int var14 = var11 * var12;
            this.field1164[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1164[var9][var15] = var5.method307();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1164[var9][var11 * var17 + var16] = var5.method307();
                    }
                }
            }
            if (var12 > this.field1170 && var9 < 128) {
                this.field1170 = var12;
            }
            this.field1167[var9] = 1;
            this.field1169[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1164[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1169[var9]--;
                this.field1167[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1164[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1169[var9]--;
            }
        }
        if (arg3) {
            this.field1169[32] = this.field1169[73];
        } else {
            this.field1169[32] = this.field1169[105];
            if (class29.field878) {
            }
        }
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method417(int arg0, int arg1, String arg2, int arg3, int arg4) {
        this.method422(arg4, (byte) 2, arg2, arg0 - this.method421(510, arg2), arg3);
        if (arg1 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "QJBJRTJO", name = "b", descriptor = "(IILjava/lang/String;II)V")
    public void method418(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg4 < 5 || arg4 > 5) {
            this.field1160 = 195;
        }
        this.method422(arg3, (byte) 2, arg2, arg1 - this.method421(510, arg2) / 2, arg0);
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "(ZLjava/lang/String;IIII)V")
    public void method419(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method426(arg1, arg0, true, arg3 - this.method420(arg1, this.field1161) / 2, arg4, arg5);
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method420(String arg0, int arg1) {
        if (arg1 != 42086) {
            this.field1160 = 247;
        }
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field1169[arg0.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method421(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        int var4 = 88 / arg0;
        for (int var5 = 0; var5 < arg1.length(); var5++) {
            var3 += this.field1169[arg1.charAt(var5)];
        }
        return var3;
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "(IBLjava/lang/String;II)V")
    public void method422(int arg0, byte arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null) {
            return;
        }
        int var6 = arg4 - this.field1170;
        for (int var7 = 0; var7 < arg2.length(); var7++) {
            char var9 = arg2.charAt(var7);
            if (var9 != ' ') {
                this.method429(this.field1164[var9], this.field1167[var9] + arg3, this.field1168[var9] + var6, this.field1165[var9], this.field1166[var9], arg0);
            }
            arg3 += this.field1169[var9];
        }
        if (arg1 == 2) {
            boolean var8 = false;
        } else {
            this.field1158 = !this.field1158;
        }
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "(IILjava/lang/String;IIZ)V")
    public void method423(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 == null) {
            return;
        }
        int var7 = arg4 - this.method421(510, arg2) / 2;
        int var8 = arg1 - this.field1170;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            char var10 = arg2.charAt(var9);
            if (var10 != ' ') {
                this.method429(this.field1164[var10], this.field1167[var10] + var7, this.field1168[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1165[var10], this.field1166[var10], arg0);
            }
            var7 += this.field1169[var10];
        }
        if (!arg5) {
            ;
        }
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public void method424(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg1 - this.method421(510, arg5) / 2;
        if (arg4 != 0) {
            this.field1159 = -165;
        }
        int var8 = arg0 - this.field1170;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method429(this.field1164[var10], this.field1167[var10] + var7 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1168[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1165[var10], this.field1166[var10], arg2);
            }
            var7 += this.field1169[var10];
        }
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public void method425(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg3 / 8.0D;
        if (arg6 != 5) {
            this.field1162 = !this.field1162;
        }
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg1 - this.method421(510, arg5) / 2;
        int var11 = arg2 - this.field1170;
        for (int var12 = 0; var12 < arg5.length(); var12++) {
            char var13 = arg5.charAt(var12);
            if (var13 != ' ') {
                this.method429(this.field1164[var13], this.field1167[var13] + var10, this.field1168[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg4) * var8), this.field1165[var13], this.field1166[var13], arg0);
            }
            var10 += this.field1169[var13];
        }
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "(Ljava/lang/String;ZZIII)V")
    public void method426(String arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            this.field1160 = -176;
        }
        this.field1172 = false;
        int var7 = arg3;
        if (arg0 == null) {
            return;
        }
        int var8 = arg5 - this.field1170;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
                int var10 = this.method428(-357, arg0.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg4 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg0.charAt(var9);
                if (var11 != ' ') {
                    if (arg1) {
                        this.method429(this.field1164[var11], this.field1167[var11] + arg3 + 1, this.field1168[var11] + var8 + 1, this.field1165[var11], this.field1166[var11], 0);
                    }
                    this.method429(this.field1164[var11], this.field1167[var11] + arg3, this.field1168[var11] + var8, this.field1165[var11], this.field1166[var11], arg4);
                }
                arg3 += this.field1169[var11];
            }
        }
        if (this.field1172) {
            class19.method238(arg3 - var7, 8388608, -518, var7, (int) ((double) this.field1170 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "(ZLjava/lang/String;IBIII)V")
    public void method427(boolean arg0, String arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -13) {
            this.field1163 = 65;
        }
        if (arg1 == null) {
            return;
        }
        this.field1171.setSeed((long) arg4);
        int var8 = (this.field1171.nextInt() & 0x1F) + 192;
        int var9 = arg2 - this.field1170;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method428(-357, arg1.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg5 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg1.charAt(var10);
                if (var12 != ' ') {
                    if (arg0) {
                        this.method431(this.field1167[var12] + arg6 + 1, this.field1168[var12] + var9 + 1, this.field1164[var12], this.field1166[var12], false, this.field1165[var12], 0, 192);
                    }
                    this.method431(this.field1167[var12] + arg6, this.field1168[var12] + var9, this.field1164[var12], this.field1166[var12], false, this.field1165[var12], arg5, var8);
                }
                arg6 += this.field1169[var12];
                if ((this.field1171.nextInt() & 0x3) == 0) {
                    arg6++;
                }
            }
        }
    }

    @OriginalMember(owner = "QJBJRTJO", name = "b", descriptor = "(ILjava/lang/String;)I")
    public int method428(int arg0, String arg1) {
        if (arg0 >= 0) {
            return this.field1160;
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
                this.field1172 = true;
            }
            if (arg1.equals("end")) {
                this.field1172 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "([BIIIII)V")
    private void method429(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class19.field685 * arg2 + arg1;
        int var8 = class19.field685 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class19.field687) {
            int var11 = class19.field687 - arg2;
            arg4 -= var11;
            arg2 = class19.field687;
            var10 += arg3 * var11;
            var7 += class19.field685 * var11;
        }
        if (arg2 + arg4 >= class19.field688) {
            arg4 -= arg2 + arg4 + 1 - class19.field688;
        }
        if (arg1 < class19.field689) {
            int var12 = class19.field689 - arg1;
            arg3 -= var12;
            arg1 = class19.field689;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class19.field690) {
            int var13 = arg1 + arg3 + 1 - class19.field690;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method430(class19.field684, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method430(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "(II[BIZIII)V")
    private void method431(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg4) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = class19.field685 * arg1 + arg0;
        int var11 = class19.field685 - arg5;
        int var12 = 0;
        int var13 = 0;
        if (arg1 < class19.field687) {
            int var14 = class19.field687 - arg1;
            arg3 -= var14;
            arg1 = class19.field687;
            var13 += arg5 * var14;
            var10 += class19.field685 * var14;
        }
        if (arg1 + arg3 >= class19.field688) {
            arg3 -= arg1 + arg3 + 1 - class19.field688;
        }
        if (arg0 < class19.field689) {
            int var15 = class19.field689 - arg0;
            arg5 -= var15;
            arg0 = class19.field689;
            var13 += var15;
            var10 += var15;
            var12 += var15;
            var11 += var15;
        }
        if (arg0 + arg5 >= class19.field690) {
            int var16 = arg0 + arg5 + 1 - class19.field690;
            arg5 -= var16;
            var12 += var16;
            var11 += var16;
        }
        if (arg5 > 0 && arg3 > 0) {
            this.method432(arg2, var10, var12, arg7, (byte) 85, class19.field684, arg3, arg6, arg5, var13, var11);
        }
    }

    @OriginalMember(owner = "QJBJRTJO", name = "a", descriptor = "([BIIIB[IIIIII)V")
    private void method432(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg4 != 85) {
            this.field1161 = -379;
        }
        int var12 = ((arg7 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg3 & 0xFF0000) >> 8;
        int var13 = 256 - arg3;
        for (int var14 = -arg6; var14 < 0; var14++) {
            for (int var15 = -arg8; var15 < 0; var15++) {
                if (arg0[arg9++] == 0) {
                    arg1++;
                } else {
                    int var16 = arg5[arg1];
                    arg5[arg1++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg1 += arg10;
            arg9 += arg2;
        }
    }
}
