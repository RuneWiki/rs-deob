import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RXCVCUUO")
public class class45 extends class31 {

    @OriginalMember(owner = "RXCVCUUO", name = "y", descriptor = "I")
    private int field1197 = 6;

    @OriginalMember(owner = "RXCVCUUO", name = "z", descriptor = "Z")
    private boolean field1198 = false;

    @OriginalMember(owner = "RXCVCUUO", name = "A", descriptor = "Z")
    private boolean field1199 = false;

    @OriginalMember(owner = "RXCVCUUO", name = "B", descriptor = "Z")
    private boolean field1200 = false;

    @OriginalMember(owner = "RXCVCUUO", name = "C", descriptor = "[[B")
    public byte[][] field1201 = new byte[256][];

    @OriginalMember(owner = "RXCVCUUO", name = "D", descriptor = "[I")
    public int[] field1202 = new int[256];

    @OriginalMember(owner = "RXCVCUUO", name = "E", descriptor = "[I")
    public int[] field1203 = new int[256];

    @OriginalMember(owner = "RXCVCUUO", name = "F", descriptor = "[I")
    public int[] field1204 = new int[256];

    @OriginalMember(owner = "RXCVCUUO", name = "G", descriptor = "[I")
    public int[] field1205 = new int[256];

    @OriginalMember(owner = "RXCVCUUO", name = "H", descriptor = "[I")
    public int[] field1206 = new int[256];

    @OriginalMember(owner = "RXCVCUUO", name = "J", descriptor = "Ljava/util/Random;")
    public Random field1208 = new Random();

    @OriginalMember(owner = "RXCVCUUO", name = "K", descriptor = "Z")
    public boolean field1209 = false;

    @OriginalMember(owner = "RXCVCUUO", name = "I", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "RXCVCUUO", name = "<init>", descriptor = "(ZBLjava/lang/String;LOTSGNSQM;)V")
    public class45(boolean arg0, byte arg1, String arg2, class41 arg3) {
        class68 var5 = new class68(arg3.method376(arg2 + ".dat", null), -103);
        class68 var6 = new class68(arg3.method376("index.dat", null), -103);
        boolean var7 = true;
        var6.field1612 = var5.method551() + 4;
        if (arg1 != -51) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = var6.method549();
        if (var9 > 0) {
            var6.field1612 += (var9 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field1204[var10] = var6.method549();
            this.field1205[var10] = var6.method549();
            int var12 = this.field1202[var10] = var6.method551();
            int var13 = this.field1203[var10] = var6.method551();
            int var14 = var6.method549();
            int var15 = var12 * var13;
            this.field1201[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field1201[var10][var16] = var5.method550();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field1201[var10][var12 * var18 + var17] = var5.method550();
                    }
                }
            }
            if (var13 > this.field1207 && var10 < 128) {
                this.field1207 = var13;
            }
            this.field1204[var10] = 1;
            this.field1206[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field1201[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field1206[var10]--;
                this.field1204[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field1201[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field1206[var10]--;
            }
        }
        if (arg0) {
            this.field1206[32] = this.field1206[73];
        } else {
            this.field1206[32] = this.field1206[105];
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "(IIBLjava/lang/String;I)V")
    public void method381(int arg0, int arg1, byte arg2, String arg3, int arg4) {
        if (arg2 == 2) {
            boolean var6 = false;
            this.method386(arg0 - this.method385(-1850, arg3), arg3, arg4, -997, arg1);
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method382(int arg0, int arg1, String arg2, int arg3, int arg4) {
        this.method386(arg4 - this.method385(-1850, arg2) / 2, arg2, arg0, -997, arg3);
        if (arg1 == 19850) {
            ;
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "(IIIZLjava/lang/String;I)V")
    public void method383(int arg0, int arg1, int arg2, boolean arg3, String arg4, int arg5) {
        this.method390(arg4, arg0, (byte) 3, arg2 - this.method384(arg4, true) / 2, arg1, arg3);
        if (arg5 < 6 || arg5 > 6) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method384(String arg0, boolean arg1) {
        if (!arg1) {
            return 4;
        } else if (arg0 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                    var4 += 4;
                } else {
                    var3 += this.field1206[arg0.charAt(var4)];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method385(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0 != -1850) {
            this.field1197 = -249;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            var3 += this.field1206[arg1.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method386(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg4 - this.field1207;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method393(this.field1201[var8], this.field1204[var8] + arg0, this.field1205[var8] + var6, this.field1202[var8], this.field1203[var8], arg2);
            }
            arg0 += this.field1206[var8];
        }
        if (arg3 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public void method387(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg2 - this.method385(-1850, arg5) / 2;
        if (arg1 >= 0) {
            this.field1198 = !this.field1198;
        }
        int var8 = arg0 - this.field1207;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method393(this.field1201[var10], this.field1204[var10] + var7, this.field1205[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1202[var10], this.field1203[var10], arg4);
            }
            var7 += this.field1206[var10];
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "b", descriptor = "(IIIIILjava/lang/String;)V")
    public void method388(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg4 != 0) {
            this.field1199 = !this.field1199;
        }
        if (arg5 == null) {
            return;
        }
        int var7 = arg3 - this.method385(-1850, arg5) / 2;
        int var8 = arg1 - this.field1207;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method393(this.field1201[var10], this.field1204[var10] + var7 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1205[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1202[var10], this.field1203[var10], arg0);
            }
            var7 += this.field1206[var10];
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "(ILjava/lang/String;IBIII)V")
    public void method389(int arg0, String arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg2 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg6 - this.method385(-1850, arg1) / 2;
        int var11 = arg0 - this.field1207;
        if (arg3 != 9) {
            return;
        }
        for (int var12 = 0; var12 < arg1.length(); var12++) {
            char var13 = arg1.charAt(var12);
            if (var13 != ' ') {
                this.method393(this.field1201[var13], this.field1204[var13] + var10, this.field1205[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg4) * var8), this.field1202[var13], this.field1203[var13], arg5);
            }
            var10 += this.field1206[var13];
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "(Ljava/lang/String;IBIIZ)V")
    public void method390(String arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        this.field1209 = false;
        int var7 = arg3;
        if (arg0 == null) {
            return;
        }
        int var8 = arg1 - this.field1207;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
                int var11 = this.method392(arg0.substring(var9 + 1, var9 + 4), false);
                if (var11 != -1) {
                    arg4 = var11;
                }
                var9 += 4;
            } else {
                char var12 = arg0.charAt(var9);
                if (var12 != ' ') {
                    if (arg5) {
                        this.method393(this.field1201[var12], this.field1204[var12] + arg3 + 1, this.field1205[var12] + var8 + 1, this.field1202[var12], this.field1203[var12], 0);
                    }
                    this.method393(this.field1201[var12], this.field1204[var12] + arg3, this.field1205[var12] + var8, this.field1202[var12], this.field1203[var12], arg4);
                }
                arg3 += this.field1206[var12];
            }
        }
        if (arg2 == 3) {
            boolean var10 = false;
            if (this.field1209) {
                class31.method287(8388608, var7, (int) ((double) this.field1207 * 0.7D) + var8, (byte) 8, arg3 - var7);
            }
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "(IZILjava/lang/String;III)V")
    public void method391(int arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        this.field1208.setSeed((long) arg5);
        if (arg6 != 16830) {
            return;
        }
        int var8 = (this.field1208.nextInt() & 0x1F) + 192;
        int var9 = arg0 - this.field1207;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                int var11 = this.method392(arg3.substring(var10 + 1, var10 + 4), false);
                if (var11 != -1) {
                    arg2 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg3.charAt(var10);
                if (var12 != ' ') {
                    if (arg1) {
                        this.method395(this.field1205[var12] + var9 + 1, this.field1203[var12], 192, 0, this.field1202[var12], this.field1201[var12], this.field1204[var12] + arg4 + 1, (byte) -9);
                    }
                    this.method395(this.field1205[var12] + var9, this.field1203[var12], var8, arg2, this.field1202[var12], this.field1201[var12], this.field1204[var12] + arg4, (byte) -9);
                }
                arg4 += this.field1206[var12];
                if ((this.field1208.nextInt() & 0x3) == 0) {
                    arg4++;
                }
            }
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "b", descriptor = "(Ljava/lang/String;Z)I")
    public int method392(String arg0, boolean arg1) {
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
                this.field1209 = true;
            }
            if (arg0.equals("end")) {
                this.field1209 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "([BIIIII)V")
    private void method393(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class31.field954 * arg2 + arg1;
        int var8 = class31.field954 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class31.field956) {
            int var11 = class31.field956 - arg2;
            arg4 -= var11;
            arg2 = class31.field956;
            var10 += arg3 * var11;
            var7 += class31.field954 * var11;
        }
        if (arg2 + arg4 >= class31.field957) {
            arg4 -= arg2 + arg4 + 1 - class31.field957;
        }
        if (arg1 < class31.field958) {
            int var12 = class31.field958 - arg1;
            arg3 -= var12;
            arg1 = class31.field958;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class31.field959) {
            int var13 = arg1 + arg3 + 1 - class31.field959;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method394(class31.field953, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method394(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "(IIIII[BIB)V")
    private void method395(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, byte arg7) {
        if (arg7 != -9) {
            return;
        }
        int var9 = class31.field954 * arg0 + arg6;
        int var10 = class31.field954 - arg4;
        int var11 = 0;
        int var12 = 0;
        if (arg0 < class31.field956) {
            int var13 = class31.field956 - arg0;
            arg1 -= var13;
            arg0 = class31.field956;
            var12 += arg4 * var13;
            var9 += class31.field954 * var13;
        }
        if (arg0 + arg1 >= class31.field957) {
            arg1 -= arg0 + arg1 + 1 - class31.field957;
        }
        if (arg6 < class31.field958) {
            int var14 = class31.field958 - arg6;
            arg4 -= var14;
            arg6 = class31.field958;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg4 + arg6 >= class31.field959) {
            int var15 = arg4 + arg6 + 1 - class31.field959;
            arg4 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg4 > 0 && arg1 > 0) {
            this.method396((byte) 6, var12, arg5, arg3, class31.field953, arg1, arg4, var11, var9, var10, arg2);
        }
    }

    @OriginalMember(owner = "RXCVCUUO", name = "a", descriptor = "(BI[BI[IIIIIII)V")
    private void method396(byte arg0, int arg1, byte[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg3 & 0xFF00FF) * arg10 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg10 & 0xFF0000) >> 8;
        if (arg0 == 6) {
            boolean var13 = false;
        } else {
            this.field1200 = !this.field1200;
        }
        int var14 = 256 - arg10;
        for (int var15 = -arg5; var15 < 0; var15++) {
            for (int var16 = -arg6; var16 < 0; var16++) {
                if (arg2[arg1++] == 0) {
                    arg8++;
                } else {
                    int var17 = arg4[arg8];
                    arg4[arg8++] = (((var17 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var17 & 0xFF00) * var14 & 0xFF0000) >> 8) + var12;
                }
            }
            arg8 += arg9;
            arg1 += arg7;
        }
    }
}
