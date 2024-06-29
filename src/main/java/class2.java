import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AKTTXKXI")
public class class2 extends class58 {

    @OriginalMember(owner = "client!AKTTXKXI", name = "B", descriptor = "B")
    private byte field21 = 16;

    @OriginalMember(owner = "client!AKTTXKXI", name = "C", descriptor = "B")
    private byte field22 = -106;

    @OriginalMember(owner = "client!AKTTXKXI", name = "D", descriptor = "I")
    private int field23 = 4;

    @OriginalMember(owner = "client!AKTTXKXI", name = "E", descriptor = "Z")
    private boolean field24 = true;

    @OriginalMember(owner = "client!AKTTXKXI", name = "F", descriptor = "[[B")
    public byte[][] field25 = new byte[256][];

    @OriginalMember(owner = "client!AKTTXKXI", name = "G", descriptor = "[I")
    public int[] field26 = new int[256];

    @OriginalMember(owner = "client!AKTTXKXI", name = "H", descriptor = "[I")
    public int[] field27 = new int[256];

    @OriginalMember(owner = "client!AKTTXKXI", name = "I", descriptor = "[I")
    public int[] field28 = new int[256];

    @OriginalMember(owner = "client!AKTTXKXI", name = "J", descriptor = "[I")
    public int[] field29 = new int[256];

    @OriginalMember(owner = "client!AKTTXKXI", name = "K", descriptor = "[I")
    public int[] field30 = new int[256];

    @OriginalMember(owner = "client!AKTTXKXI", name = "M", descriptor = "Ljava/util/Random;")
    public Random field32 = new Random();

    @OriginalMember(owner = "client!AKTTXKXI", name = "N", descriptor = "Z")
    public boolean field33 = false;

    @OriginalMember(owner = "client!AKTTXKXI", name = "L", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!AKTTXKXI", name = "z", descriptor = "I")
    private int field20;

    @OriginalMember(owner = "client!AKTTXKXI", name = "<init>", descriptor = "(BLSMIVAFST;ZLjava/lang/String;)V")
    public class2(byte arg0, class52 arg1, boolean arg2, String arg3) {
        class7 var5 = new class7(arg1.method512(arg3 + ".dat", null), (byte) 3);
        class7 var6 = new class7(arg1.method512("index.dat", null), (byte) 3);
        boolean var7 = true;
        var6.field91 = var5.method49() + 4;
        int var8 = var6.method47();
        if (this.field21 != arg0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (var8 > 0) {
            var6.field91 += (var8 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field28[var10] = var6.method47();
            this.field29[var10] = var6.method47();
            int var12 = this.field26[var10] = var6.method49();
            int var13 = this.field27[var10] = var6.method49();
            int var14 = var6.method47();
            int var15 = var12 * var13;
            this.field25[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field25[var10][var16] = var5.method48();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field25[var10][var12 * var18 + var17] = var5.method48();
                    }
                }
            }
            if (var13 > this.field31 && var10 < 128) {
                this.field31 = var13;
            }
            this.field28[var10] = 1;
            this.field30[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field25[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field30[var10]--;
                this.field28[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field25[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field30[var10]--;
            }
        }
        if (arg2) {
            this.field30[32] = this.field30[73];
        } else {
            this.field30[32] = this.field30[105];
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(ILjava/lang/String;IBI)V")
    public void method3(int arg0, String arg1, int arg2, byte arg3, int arg4) {
        if (arg3 == -83) {
            this.method8(arg0 - this.method7(arg1, 324), arg1, arg4, arg2, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(IILjava/lang/String;BI)V")
    public void method4(int arg0, int arg1, String arg2, byte arg3, int arg4) {
        this.method8(arg4 - this.method7(arg2, 324) / 2, arg2, arg1, arg0, (byte) 27);
        if (arg3 != 5) {
            this.field20 = -310;
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(ZZLjava/lang/String;III)V")
    public void method5(boolean arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
        this.method12(arg5 - this.method6(-754, arg2) / 2, arg1, arg3, arg2, arg4, 32048);
        if (arg0) {
            this.field20 = -80;
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method6(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0 >= 0) {
            return this.field23;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field30[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method7(String arg0, int arg1) {
        int var3 = 48 / arg1;
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            var4 += this.field30[arg0.charAt(var5)];
        }
        return var4;
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(ILjava/lang/String;IIB)V")
    public void method8(int arg0, String arg1, int arg2, int arg3, byte arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg2 - this.field31;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var9 = arg1.charAt(var7);
            if (var9 != ' ') {
                this.method15(this.field25[var9], this.field28[var9] + arg0, this.field29[var9] + var6, this.field26[var9], this.field27[var9], arg3);
            }
            arg0 += this.field30[var9];
        }
        if (arg4 != 27) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(BLjava/lang/String;IIII)V")
    public void method9(byte arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg2 - this.method7(arg1, 324) / 2;
        int var8 = arg3 - this.field31;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method15(this.field25[var10], this.field28[var10] + var7, this.field29[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field26[var10], this.field27[var10], arg5);
            }
            var7 += this.field30[var10];
        }
        if (this.field22 != arg0) {
            this.field24 = !this.field24;
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(ZIIIILjava/lang/String;)V")
    public void method10(boolean arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg4 - this.method7(arg5, 324) / 2;
        int var8 = arg3 - this.field31;
        if (!arg0) {
            return;
        }
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method15(this.field25[var10], this.field28[var10] + var7 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field29[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field26[var10], this.field27[var10], arg2);
            }
            var7 += this.field30[var10];
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public void method11(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < 1 || arg3 > 1 || arg0 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg1 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg4 - this.method7(arg0, 324) / 2;
        int var11 = arg5 - this.field31;
        for (int var12 = 0; var12 < arg0.length(); var12++) {
            char var13 = arg0.charAt(var12);
            if (var13 != ' ') {
                this.method15(this.field25[var13], this.field28[var13] + var10, this.field29[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg2) * var8), this.field26[var13], this.field27[var13], arg6);
            }
            var10 += this.field30[var13];
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(IZILjava/lang/String;II)V")
    public void method12(int arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5) {
        this.field33 = false;
        if (arg5 != 32048) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = arg0;
        if (arg3 == null) {
            return;
        }
        int var9 = arg2 - this.field31;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                int var11 = this.method14(arg3.substring(var10 + 1, var10 + 4), false);
                if (var11 != -1) {
                    arg4 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg3.charAt(var10);
                if (var12 != ' ') {
                    if (arg1) {
                        this.method15(this.field25[var12], this.field28[var12] + arg0 + 1, this.field29[var12] + var9 + 1, this.field26[var12], this.field27[var12], 0);
                    }
                    this.method15(this.field25[var12], this.field28[var12] + arg0, this.field29[var12] + var9, this.field26[var12], this.field27[var12], arg4);
                }
                arg0 += this.field30[var12];
            }
        }
        if (this.field33) {
            class58.method531((int) ((double) this.field31 * 0.7D) + var9, arg0 - var8, 8388608, var8, 0);
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(ZLjava/lang/String;IZIII)V")
    public void method13(boolean arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        this.field32.setSeed((long) arg5);
        int var8 = (this.field32.nextInt() & 0x1F) + 192;
        int var9 = arg6 - this.field31;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method14(arg1.substring(var10 + 1, var10 + 4), false);
                if (var11 != -1) {
                    arg4 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg1.charAt(var10);
                if (var12 != ' ') {
                    if (arg0) {
                        this.method17(this.field29[var12] + var9 + 1, this.field27[var12], 192, this.field25[var12], 0, true, this.field26[var12], this.field28[var12] + arg2 + 1);
                    }
                    this.method17(this.field29[var12] + var9, this.field27[var12], var8, this.field25[var12], arg4, true, this.field26[var12], this.field28[var12] + arg2);
                }
                arg2 += this.field30[var12];
                if ((this.field32.nextInt() & 0x3) == 0) {
                    arg2++;
                }
            }
        }
        if (arg3) {
            ;
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method14(String arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg0.equals("red")) {
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
                this.field33 = true;
            }
            if (arg0.equals("end")) {
                this.field33 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "([BIIIII)V")
    private void method15(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class58.field1546 * arg2 + arg1;
        int var8 = class58.field1546 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class58.field1548) {
            int var11 = class58.field1548 - arg2;
            arg4 -= var11;
            arg2 = class58.field1548;
            var10 += arg3 * var11;
            var7 += class58.field1546 * var11;
        }
        if (arg2 + arg4 >= class58.field1549) {
            arg4 -= arg2 + arg4 + 1 - class58.field1549;
        }
        if (arg1 < class58.field1550) {
            int var12 = class58.field1550 - arg1;
            arg3 -= var12;
            arg1 = class58.field1550;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class58.field1551) {
            int var13 = arg1 + arg3 + 1 - class58.field1551;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method16(class58.field1545, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method16(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(III[BIZII)V")
    private void method17(int arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg5) {
            this.field24 = !this.field24;
        }
        int var9 = class58.field1546 * arg0 + arg7;
        int var10 = class58.field1546 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (arg0 < class58.field1548) {
            int var13 = class58.field1548 - arg0;
            arg1 -= var13;
            arg0 = class58.field1548;
            var12 += arg6 * var13;
            var9 += class58.field1546 * var13;
        }
        if (arg0 + arg1 >= class58.field1549) {
            arg1 -= arg0 + arg1 + 1 - class58.field1549;
        }
        if (arg7 < class58.field1550) {
            int var14 = class58.field1550 - arg7;
            arg6 -= var14;
            arg7 = class58.field1550;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg6 + arg7 >= class58.field1551) {
            int var15 = arg6 + arg7 + 1 - class58.field1551;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg1 > 0) {
            this.method18(-369, var9, arg1, var11, var12, arg6, class58.field1545, arg2, var10, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(IIIIII[III[BI)V")
    private void method18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        int var12 = ((arg10 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg10 & 0xFF00) * arg7 & 0xFF0000) >> 8;
        int var13 = 256 - arg7;
        if (arg0 >= 0) {
            this.field23 = -293;
        }
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = -arg5; var15 < 0; var15++) {
                if (arg9[arg4++] == 0) {
                    arg1++;
                } else {
                    int var16 = arg6[arg1];
                    arg6[arg1++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg1 += arg8;
            arg4 += arg3;
        }
    }
}
