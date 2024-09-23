import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "ib", name = "u", descriptor = "Z")
    private boolean field565 = false;

    @OriginalMember(owner = "ib", name = "v", descriptor = "I")
    private int field566 = -449;

    @OriginalMember(owner = "ib", name = "w", descriptor = "I")
    private int field567 = 331;

    @OriginalMember(owner = "ib", name = "y", descriptor = "[[B")
    public byte[][] field569 = new byte[94][];

    @OriginalMember(owner = "ib", name = "z", descriptor = "[I")
    public int[] field570 = new int[94];

    @OriginalMember(owner = "ib", name = "A", descriptor = "[I")
    public int[] field571 = new int[94];

    @OriginalMember(owner = "ib", name = "B", descriptor = "[I")
    public int[] field572 = new int[94];

    @OriginalMember(owner = "ib", name = "C", descriptor = "[I")
    public int[] field573 = new int[94];

    @OriginalMember(owner = "ib", name = "D", descriptor = "[I")
    public int[] field574 = new int[95];

    @OriginalMember(owner = "ib", name = "E", descriptor = "[I")
    public int[] field575 = new int[256];

    @OriginalMember(owner = "ib", name = "x", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "ib", name = "G", descriptor = "[I")
    public static int[] field577 = new int[256];

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Ljava/lang/String;Ltb;Z)V")
    public PixFont(String arg0, Jagfile arg1, boolean arg2) {
        Packet var4 = new Packet(arg1.method225(0, null, arg0 + ".dat"), (byte) 63);
        Packet var5 = new Packet(arg1.method225(0, null, "index.dat"), (byte) 63);
        var5.field586 = var4.method187() + 4;
        int var6 = var5.method185();
        if (var6 > 0) {
            var5.field586 += (var6 - 1) * 3;
        }
        for (int var7 = 0; var7 < 94; var7++) {
            this.field572[var7] = var5.method185();
            this.field573[var7] = var5.method185();
            int var9 = this.field570[var7] = var5.method187();
            int var10 = this.field571[var7] = var5.method187();
            int var11 = var5.method185();
            int var12 = var9 * var10;
            this.field569[var7] = new byte[var12];
            if (var11 == 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field569[var7][var13] = var4.method186();
                }
            } else if (var11 == 1) {
                for (int var14 = 0; var14 < var9; var14++) {
                    for (int var15 = 0; var15 < var10; var15++) {
                        this.field569[var7][var9 * var15 + var14] = var4.method186();
                    }
                }
            }
            if (var10 > this.field576) {
                this.field576 = var10;
            }
            this.field572[var7] = 1;
            this.field574[var7] = var9 + 2;
            int var16 = 0;
            for (int var17 = var10 / 7; var17 < var10; var17++) {
                var16 += this.field569[var7][var9 * var17];
            }
            int var10002;
            if (var16 <= var10 / 7) {
                var10002 = this.field574[var7]--;
                this.field572[var7] = 0;
            }
            int var18 = 0;
            for (int var19 = var10 / 7; var19 < var10; var19++) {
                var18 += this.field569[var7][var9 * var19 + var9 - 1];
            }
            if (var18 <= var10 / 7) {
                var10002 = this.field574[var7]--;
            }
        }
        if (arg2) {
            this.field568 = 314;
        }
        this.field574[94] = this.field574[8];
        for (int var8 = 0; var8 < 256; var8++) {
            this.field575[var8] = this.field574[field577[var8]];
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IZIILjava/lang/String;)V")
    public void method168(int arg0, boolean arg1, int arg2, int arg3, String arg4) {
        if (arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.method171(arg4, arg2 - this.method170(331, arg4) / 2, arg0, arg3, -200);
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ILjava/lang/String;IIIZ)V")
    public void method169(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method173(arg5, arg0 - this.method170(331, arg1) / 2, arg2, arg4, true, arg1);
        if (arg3 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method170(int arg0, String arg1) {
        if (arg0 <= 0) {
            return 4;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field575[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method171(String arg0, int arg1, int arg2, int arg3, int arg4) {
        while (arg4 >= 0) {
            this.field568 = 407;
        }
        int var6 = arg2 - this.field576;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            int var8 = field577[arg0.charAt(var7)];
            if (var8 != 94) {
                this.method174(this.field569[var8], this.field572[var8] + arg1, this.field573[var8] + var6, this.field570[var8], this.field571[var8], arg3);
            }
            arg1 += this.field574[var8];
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
    public void method172(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5) {
        int var7 = arg0 - this.method170(331, arg5) / 2;
        if (arg2 != 71) {
            this.field568 = 157;
        }
        int var8 = arg4 - this.field576;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            int var10 = field577[arg5.charAt(var9)];
            if (var10 != 94) {
                this.method174(this.field569[var10], this.field572[var10] + var7, this.field573[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field570[var10], this.field571[var10], arg1);
            }
            var7 += this.field574[var10];
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ZIIIZLjava/lang/String;)V")
    public void method173(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, String arg5) {
        int var7 = arg2 - this.field576;
        for (int var8 = 0; var8 < arg5.length(); var8++) {
            if (arg5.charAt(var8) == '@' && var8 + 4 < arg5.length() && arg5.charAt(var8 + 4) == '@') {
                String var9 = arg5.substring(var8 + 1, var8 + 4);
                if (var9.equals("red")) {
                    arg3 = 16711680;
                }
                if (var9.equals("gre")) {
                    arg3 = 65280;
                }
                if (var9.equals("blu")) {
                    arg3 = 255;
                }
                if (var9.equals("yel")) {
                    arg3 = 16776960;
                }
                if (var9.equals("cya")) {
                    arg3 = 65535;
                }
                if (var9.equals("mag")) {
                    arg3 = 16711935;
                }
                if (var9.equals("whi")) {
                    arg3 = 16777215;
                }
                if (var9.equals("bla")) {
                    arg3 = 0;
                }
                if (var9.equals("lre")) {
                    arg3 = 16748608;
                }
                if (var9.equals("dre")) {
                    arg3 = 8388608;
                }
                if (var9.equals("dbl")) {
                    arg3 = 128;
                }
                if (var9.equals("or1")) {
                    arg3 = 16756736;
                }
                if (var9.equals("or2")) {
                    arg3 = 16740352;
                }
                if (var9.equals("or3")) {
                    arg3 = 16723968;
                }
                if (var9.equals("gr1")) {
                    arg3 = 12648192;
                }
                if (var9.equals("gr2")) {
                    arg3 = 8453888;
                }
                if (var9.equals("gr3")) {
                    arg3 = 4259584;
                }
                var8 += 4;
            } else {
                int var10 = field577[arg5.charAt(var8)];
                if (var10 != 94) {
                    if (arg0) {
                        this.method174(this.field569[var10], this.field572[var10] + arg1 + 1, this.field573[var10] + var7 + 1, this.field570[var10], this.field571[var10], 0);
                    }
                    this.method174(this.field569[var10], this.field572[var10] + arg1, this.field573[var10] + var7, this.field570[var10], this.field571[var10], arg3);
                }
                arg1 += this.field574[var10];
            }
        }
        if (arg4) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([BIIIII)V")
    private void method174(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field507 * arg2 + arg1;
        int var8 = Pix2D.field507 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field509) {
            int var11 = Pix2D.field509 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field509;
            var10 += arg3 * var11;
            var7 += Pix2D.field507 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field510) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field510;
        }
        if (arg1 < Pix2D.field511) {
            int var12 = Pix2D.field511 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field511;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field512) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field512;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method175(Pix2D.field506, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method175(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }
            field577[var1] = var2;
        }
    }
}
