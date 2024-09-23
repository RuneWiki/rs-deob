import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private int field677 = -206;

    @OriginalMember(owner = "kb", name = "A", descriptor = "[[B")
    public byte[][] field679 = new byte[256][];

    @OriginalMember(owner = "kb", name = "B", descriptor = "[I")
    public int[] field680 = new int[256];

    @OriginalMember(owner = "kb", name = "C", descriptor = "[I")
    public int[] field681 = new int[256];

    @OriginalMember(owner = "kb", name = "D", descriptor = "[I")
    public int[] field682 = new int[256];

    @OriginalMember(owner = "kb", name = "E", descriptor = "[I")
    public int[] field683 = new int[256];

    @OriginalMember(owner = "kb", name = "F", descriptor = "[I")
    public int[] field684 = new int[256];

    @OriginalMember(owner = "kb", name = "H", descriptor = "Ljava/util/Random;")
    public Random field686 = new Random();

    @OriginalMember(owner = "kb", name = "I", descriptor = "Z")
    public boolean field687 = false;

    @OriginalMember(owner = "kb", name = "G", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "kb", name = "z", descriptor = "I")
    private int field678;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lxb;ILjava/lang/String;Z)V")
    public PixFont(Jagfile arg0, int arg1, String arg2, boolean arg3) {
        Packet var5 = new Packet((byte) 3, arg0.method294(arg2 + ".dat", null));
        Packet var6 = new Packet((byte) 3, arg0.method294("index.dat", null));
        int var7 = 53 / arg1;
        boolean var8 = true;
        var6.field702 = var5.method226() + 4;
        int var9 = var6.method224();
        if (var9 > 0) {
            var6.field702 += (var9 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field682[var10] = var6.method224();
            this.field683[var10] = var6.method224();
            int var12 = this.field680[var10] = var6.method226();
            int var13 = this.field681[var10] = var6.method226();
            int var14 = var6.method224();
            int var15 = var12 * var13;
            this.field679[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field679[var10][var16] = var5.method225();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field679[var10][var12 * var18 + var17] = var5.method225();
                    }
                }
            }
            if (var13 > this.field685 && var10 < 128) {
                this.field685 = var13;
            }
            this.field682[var10] = 1;
            this.field684[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field679[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field684[var10]--;
                this.field682[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field679[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field684[var10]--;
            }
        }
        if (arg3) {
            this.field684[32] = this.field684[73];
        } else {
            this.field684[32] = this.field684[105];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIBILjava/lang/String;)V")
    public void method200(int arg0, int arg1, byte arg2, int arg3, String arg4) {
        this.method203(arg0 - this.method202(arg4, true) / 2, 474, arg3, arg4, arg1);
        if (arg2 != 1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
    public void method201(String arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg3 >= 0 && arg3 <= 0) {
            this.method205(arg0, arg1, 0, arg2, arg5 - this.method202(arg0, true) / 2, arg4);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method202(String arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            if (arg0.charAt(var5) == '@' && var5 + 4 < arg0.length() && arg0.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var4 += this.field684[arg0.charAt(var5)];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method203(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg3 == null) {
            return;
        }
        int var6 = arg4 - this.field685;
        int var7 = 99 / arg1;
        for (int var8 = 0; var8 < arg3.length(); var8++) {
            char var9 = arg3.charAt(var8);
            if (var9 != ' ') {
                this.method208(this.field679[var9], this.field682[var9] + arg0, this.field683[var9] + var6, this.field680[var9], this.field681[var9], arg2);
            }
            arg0 += this.field684[var9];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public void method204(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg4 == null) {
            return;
        }
        int var7 = arg2 - this.method202(arg4, true) / 2;
        int var8 = arg5 - this.field685;
        if (arg3 >= 0) {
            this.field677 = 380;
        }
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            char var10 = arg4.charAt(var9);
            if (var10 != ' ') {
                this.method208(this.field679[var10], this.field682[var10] + var7, this.field683[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field680[var10], this.field681[var10], arg1);
            }
            var7 += this.field684[var10];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIIIZ)V")
    public void method205(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field687 = false;
        int var7 = arg4;
        if (arg0 == null) {
            return;
        }
        int var8 = arg1 - this.field685;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
                int var11 = this.method207(arg0.substring(var9 + 1, var9 + 4), 9);
                if (var11 != -1) {
                    arg3 = var11;
                }
                var9 += 4;
            } else {
                char var12 = arg0.charAt(var9);
                if (var12 != ' ') {
                    if (arg5) {
                        this.method208(this.field679[var12], this.field682[var12] + arg4 + 1, this.field683[var12] + var8 + 1, this.field680[var12], this.field681[var12], 0);
                    }
                    this.method208(this.field679[var12], this.field682[var12] + arg4, this.field683[var12] + var8, this.field680[var12], this.field681[var12], arg3);
                }
                arg4 += this.field684[var12];
            }
        }
        if (arg2 != 0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        if (this.field687) {
            Pix2D.method159(3, var7, 8388608, (int) ((double) this.field685 * 0.7D) + var8, arg4 - var7);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZILjava/lang/String;IZII)V")
    public void method206(boolean arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg4 || arg2 == null) {
            return;
        }
        this.field686.setSeed((long) arg1);
        int var8 = (this.field686.nextInt() & 0x1F) + 192;
        int var9 = arg6 - this.field685;
        for (int var10 = 0; var10 < arg2.length(); var10++) {
            if (arg2.charAt(var10) == '@' && var10 + 4 < arg2.length() && arg2.charAt(var10 + 4) == '@') {
                int var11 = this.method207(arg2.substring(var10 + 1, var10 + 4), 9);
                if (var11 != -1) {
                    arg3 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg2.charAt(var10);
                if (var12 != ' ') {
                    if (arg0) {
                        this.method210(this.field679[var12], -31507, this.field683[var12] + var9 + 1, this.field682[var12] + arg5 + 1, 0, this.field680[var12], this.field681[var12], 192);
                    }
                    this.method210(this.field679[var12], -31507, this.field683[var12] + var9, this.field682[var12] + arg5, arg3, this.field680[var12], this.field681[var12], var8);
                }
                arg5 += this.field684[var12];
                if ((this.field686.nextInt() & 0x3) == 0) {
                    arg5++;
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method207(String arg0, int arg1) {
        if (arg1 < 9 || arg1 > 9) {
            return 2;
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
                this.field687 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIII)V")
    private void method208(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field615 * arg2 + arg1;
        int var8 = Pix2D.field615 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field617) {
            int var11 = Pix2D.field617 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field617;
            var10 += arg3 * var11;
            var7 += Pix2D.field615 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field618) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field618;
        }
        if (arg1 < Pix2D.field619) {
            int var12 = Pix2D.field619 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field619;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field620) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field620;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method209(Pix2D.field614, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method209(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIIIII)V")
    private void method210(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != -31507) {
            return;
        }
        int var9 = Pix2D.field615 * arg2 + arg3;
        int var10 = Pix2D.field615 - arg5;
        int var11 = 0;
        int var12 = 0;
        if (arg2 < Pix2D.field617) {
            int var13 = Pix2D.field617 - arg2;
            arg6 -= var13;
            arg2 = Pix2D.field617;
            var12 += arg5 * var13;
            var9 += Pix2D.field615 * var13;
        }
        if (arg2 + arg6 >= Pix2D.field618) {
            arg6 -= arg2 + arg6 + 1 - Pix2D.field618;
        }
        if (arg3 < Pix2D.field619) {
            int var14 = Pix2D.field619 - arg3;
            arg5 -= var14;
            arg3 = Pix2D.field619;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg3 + arg5 >= Pix2D.field620) {
            int var15 = arg3 + arg5 + 1 - Pix2D.field620;
            arg5 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg5 > 0 && arg6 > 0) {
            this.method211(var10, var12, arg5, this.field678, Pix2D.field614, var11, arg6, arg4, arg7, arg0, var9);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIII[IIIII[BI)V")
    private void method211(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        int var12 = ((arg7 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg8 & 0xFF0000) >> 8;
        int var13 = 256 - arg8;
        for (int var14 = -arg6; var14 < 0; var14++) {
            for (int var15 = -arg2; var15 < 0; var15++) {
                if (arg9[arg1++] == 0) {
                    arg10++;
                } else {
                    int var16 = arg4[arg10];
                    arg4[arg10++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg10 += arg0;
            arg1 += arg5;
        }
        if (arg3 != 0) {
            this.field678 = 463;
        }
    }
}
