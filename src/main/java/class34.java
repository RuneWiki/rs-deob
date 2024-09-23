import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KGPDNFPL")
public class class34 extends class24 {

    @OriginalMember(owner = "KGPDNFPL", name = "x", descriptor = "I")
    private int field1011 = -998;

    @OriginalMember(owner = "KGPDNFPL", name = "y", descriptor = "Z")
    private boolean field1012 = false;

    @OriginalMember(owner = "KGPDNFPL", name = "z", descriptor = "B")
    private byte field1013 = -46;

    @OriginalMember(owner = "KGPDNFPL", name = "A", descriptor = "Z")
    private boolean field1014 = true;

    @OriginalMember(owner = "KGPDNFPL", name = "B", descriptor = "I")
    private int field1015 = -34;

    @OriginalMember(owner = "KGPDNFPL", name = "C", descriptor = "Z")
    private boolean field1016 = false;

    @OriginalMember(owner = "KGPDNFPL", name = "D", descriptor = "Z")
    private boolean field1017 = false;

    @OriginalMember(owner = "KGPDNFPL", name = "E", descriptor = "[[B")
    public byte[][] field1018 = new byte[256][];

    @OriginalMember(owner = "KGPDNFPL", name = "F", descriptor = "[I")
    public int[] field1019 = new int[256];

    @OriginalMember(owner = "KGPDNFPL", name = "G", descriptor = "[I")
    public int[] field1020 = new int[256];

    @OriginalMember(owner = "KGPDNFPL", name = "H", descriptor = "[I")
    public int[] field1021 = new int[256];

    @OriginalMember(owner = "KGPDNFPL", name = "I", descriptor = "[I")
    public int[] field1022 = new int[256];

    @OriginalMember(owner = "KGPDNFPL", name = "J", descriptor = "[I")
    public int[] field1023 = new int[256];

    @OriginalMember(owner = "KGPDNFPL", name = "L", descriptor = "Ljava/util/Random;")
    public Random field1025 = new Random();

    @OriginalMember(owner = "KGPDNFPL", name = "M", descriptor = "Z")
    public boolean field1026 = false;

    @OriginalMember(owner = "KGPDNFPL", name = "K", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "KGPDNFPL", name = "<init>", descriptor = "(Ljava/lang/String;ZLMJLXHQTQ;Z)V")
    public class34(String arg0, boolean arg1, class44 arg2, boolean arg3) {
        class69 var5 = new class69(arg2.method317(arg0 + ".dat", null), -82);
        class69 var6 = new class69(arg2.method317("index.dat", null), -82);
        if (arg1) {
            throw new NullPointerException();
        }
        boolean var7 = true;
        var6.field1652 = var5.method467() + 4;
        int var8 = var6.method465();
        if (var8 > 0) {
            var6.field1652 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1021[var9] = var6.method465();
            this.field1022[var9] = var6.method465();
            int var11 = this.field1019[var9] = var6.method467();
            int var12 = this.field1020[var9] = var6.method467();
            int var13 = var6.method465();
            int var14 = var11 * var12;
            this.field1018[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1018[var9][var15] = var5.method466();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1018[var9][var11 * var17 + var16] = var5.method466();
                    }
                }
            }
            if (var12 > this.field1024 && var9 < 128) {
                this.field1024 = var12;
            }
            this.field1021[var9] = 1;
            this.field1023[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1018[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1023[var9]--;
                this.field1021[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1018[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1023[var9]--;
            }
        }
        if (arg3) {
            this.field1023[32] = this.field1023[73];
        } else {
            this.field1023[32] = this.field1023[105];
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method270(int arg0, String arg1, int arg2, int arg3, int arg4) {
        while (arg3 >= 0) {
            this.field1017 = !this.field1017;
        }
        this.method275(arg0, arg2 - this.method274(arg1, 219), arg4, arg1, (byte) 6);
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
    public void method271(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            this.method275(arg3, arg4 - this.method274(arg0, 219) / 2, arg2, arg0, (byte) 6);
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
    public void method272(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5) {
        if (arg5 == 0) {
            this.method279(0, arg2, arg0 - this.method273(false, arg2) / 2, arg3, arg4, arg1);
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method273(boolean arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field1023[arg1.charAt(var4)];
            }
        }
        if (arg0) {
            this.field1017 = !this.field1017;
        }
        return var3;
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method274(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 <= 0) {
            return this.field1011;
        } else {
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                var3 += this.field1023[arg0.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(IIILjava/lang/String;B)V")
    public void method275(int arg0, int arg1, int arg2, String arg3, byte arg4) {
        if (arg4 == 6) {
            boolean var6 = false;
        } else {
            this.field1016 = !this.field1016;
        }
        if (arg3 == null) {
            return;
        }
        int var7 = arg0 - this.field1024;
        for (int var8 = 0; var8 < arg3.length(); var8++) {
            char var9 = arg3.charAt(var8);
            if (var9 != ' ') {
                this.method282(this.field1018[var9], this.field1021[var9] + arg1, this.field1022[var9] + var7, this.field1019[var9], this.field1020[var9], arg2);
            }
            arg1 += this.field1023[var9];
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(IIBILjava/lang/String;I)V")
    public void method276(int arg0, int arg1, byte arg2, int arg3, String arg4, int arg5) {
        if (arg4 == null) {
            return;
        }
        int var7 = arg3 - this.method274(arg4, 219) / 2;
        int var8 = arg5 - this.field1024;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            char var10 = arg4.charAt(var9);
            if (var10 != ' ') {
                this.method282(this.field1018[var10], this.field1021[var10] + var7, this.field1022[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1019[var10], this.field1020[var10], arg0);
            }
            var7 += this.field1023[var10];
        }
        if (this.field1013 == arg2) {
            ;
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(Ljava/lang/String;IZIII)V")
    public void method277(String arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg1 - this.method274(arg0, 219) / 2;
        int var8 = arg5 - this.field1024;
        if (!arg2) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            char var11 = arg0.charAt(var10);
            if (var11 != ' ') {
                this.method282(this.field1018[var11], this.field1021[var11] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var10 / 5.0D) * 5.0D), this.field1022[var11] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var10 / 3.0D) * 5.0D), this.field1019[var11], this.field1020[var11], arg3);
            }
            var7 += this.field1023[var11];
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(IILjava/lang/String;IIIB)V")
    public void method278(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != 3) {
            return;
        }
        boolean var8 = false;
        if (arg2 == null) {
            return;
        }
        double var9 = 7.0D - (double) arg5 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg3 - this.method274(arg2, 219) / 2;
        int var12 = arg0 - this.field1024;
        for (int var13 = 0; var13 < arg2.length(); var13++) {
            char var14 = arg2.charAt(var13);
            if (var14 != ' ') {
                this.method282(this.field1018[var14], this.field1021[var14] + var11, this.field1022[var14] + var12 + (int) (Math.sin((double) var13 / 1.5D + (double) arg1) * var9), this.field1019[var14], this.field1020[var14], arg4);
            }
            var11 += this.field1023[var14];
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(ILjava/lang/String;IIZI)V")
    public void method279(int arg0, String arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.field1026 = false;
        int var7 = arg2;
        if (arg1 == null) {
            return;
        }
        int var8 = arg5 - this.field1024;
        if (arg0 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method281(40765, arg1.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg3 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg1.charAt(var10);
                if (var12 != ' ') {
                    if (arg4) {
                        this.method282(this.field1018[var12], this.field1021[var12] + arg2 + 1, this.field1022[var12] + var8 + 1, this.field1019[var12], this.field1020[var12], 0);
                    }
                    this.method282(this.field1018[var12], this.field1021[var12] + arg2, this.field1022[var12] + var8, this.field1019[var12], this.field1020[var12], arg3);
                }
                arg2 += this.field1023[var12];
            }
        }
        if (this.field1026) {
            class24.method248(8388608, (int) ((double) this.field1024 * 0.7D) + var8, arg2 - var7, var7, false);
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(ILjava/lang/String;IIIIZ)V")
    public void method280(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == null) {
            return;
        }
        this.field1025.setSeed((long) arg2);
        int var8 = (this.field1025.nextInt() & 0x1F) + 192;
        if (arg0 != 0) {
            this.field1015 = -82;
        }
        int var9 = arg5 - this.field1024;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method281(40765, arg1.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg3 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg1.charAt(var10);
                if (var12 != ' ') {
                    if (arg6) {
                        this.method284(this.field1020[var12], this.field1021[var12] + arg4 + 1, 192, 0, this.field1019[var12], this.field1018[var12], this.field1022[var12] + var9 + 1, true);
                    }
                    this.method284(this.field1020[var12], this.field1021[var12] + arg4, var8, arg3, this.field1019[var12], this.field1018[var12], this.field1022[var12] + var9, true);
                }
                arg4 += this.field1023[var12];
                if ((this.field1025.nextInt() & 0x3) == 0) {
                    arg4++;
                }
            }
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method281(int arg0, String arg1) {
        if (arg0 != 40765) {
            this.field1017 = !this.field1017;
        }
        if (arg1.equals("red")) {
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
                this.field1026 = true;
            }
            if (arg1.equals("end")) {
                this.field1026 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "([BIIIII)V")
    private void method282(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class24.field898 * arg2 + arg1;
        int var8 = class24.field898 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class24.field900) {
            int var11 = class24.field900 - arg2;
            arg4 -= var11;
            arg2 = class24.field900;
            var10 += arg3 * var11;
            var7 += class24.field898 * var11;
        }
        if (arg2 + arg4 >= class24.field901) {
            arg4 -= arg2 + arg4 + 1 - class24.field901;
        }
        if (arg1 < class24.field902) {
            int var12 = class24.field902 - arg1;
            arg3 -= var12;
            arg1 = class24.field902;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class24.field903) {
            int var13 = arg1 + arg3 + 1 - class24.field903;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method283(class24.field897, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method283(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(IIIII[BIZ)V")
    private void method284(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, boolean arg7) {
        if (!arg7) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = class24.field898 * arg6 + arg1;
        int var11 = class24.field898 - arg4;
        int var12 = 0;
        int var13 = 0;
        if (arg6 < class24.field900) {
            int var14 = class24.field900 - arg6;
            arg0 -= var14;
            arg6 = class24.field900;
            var13 += arg4 * var14;
            var10 += class24.field898 * var14;
        }
        if (arg0 + arg6 >= class24.field901) {
            arg0 -= arg0 + arg6 + 1 - class24.field901;
        }
        if (arg1 < class24.field902) {
            int var15 = class24.field902 - arg1;
            arg4 -= var15;
            arg1 = class24.field902;
            var13 += var15;
            var10 += var15;
            var12 += var15;
            var11 += var15;
        }
        if (arg1 + arg4 >= class24.field903) {
            int var16 = arg1 + arg4 + 1 - class24.field903;
            arg4 -= var16;
            var12 += var16;
            var11 += var16;
        }
        if (arg4 > 0 && arg0 > 0) {
            this.method285(var13, 495, arg0, var12, var11, arg4, arg5, class24.field897, var10, arg3, arg2);
        }
    }

    @OriginalMember(owner = "KGPDNFPL", name = "a", descriptor = "(IIIIII[B[IIII)V")
    private void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg9 & 0xFF00FF) * arg10 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg10 & 0xFF0000) >> 8;
        int var13 = 256 - arg10;
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = -arg5; var15 < 0; var15++) {
                if (arg6[arg0++] == 0) {
                    arg8++;
                } else {
                    int var16 = arg7[arg8];
                    arg7[arg8++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg8 += arg4;
            arg0 += arg3;
        }
        if (arg1 <= 0) {
            this.field1014 = !this.field1014;
        }
    }
}
