import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "kb", name = "x", descriptor = "I")
    private int field684 = 436;

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private int field685 = 436;

    @OriginalMember(owner = "kb", name = "z", descriptor = "Z")
    private boolean field686 = false;

    @OriginalMember(owner = "kb", name = "B", descriptor = "[[B")
    public byte[][] field688 = new byte[256][];

    @OriginalMember(owner = "kb", name = "C", descriptor = "[I")
    public int[] field689 = new int[256];

    @OriginalMember(owner = "kb", name = "D", descriptor = "[I")
    public int[] field690 = new int[256];

    @OriginalMember(owner = "kb", name = "E", descriptor = "[I")
    public int[] field691 = new int[256];

    @OriginalMember(owner = "kb", name = "F", descriptor = "[I")
    public int[] field692 = new int[256];

    @OriginalMember(owner = "kb", name = "G", descriptor = "[I")
    public int[] field693 = new int[256];

    @OriginalMember(owner = "kb", name = "I", descriptor = "Ljava/util/Random;")
    public Random field695 = new Random();

    @OriginalMember(owner = "kb", name = "J", descriptor = "Z")
    public boolean field696 = false;

    @OriginalMember(owner = "kb", name = "H", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "kb", name = "w", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "kb", name = "A", descriptor = "I")
    private int field687;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lxb;ZLjava/lang/String;B)V")
    public PixFont(Jagfile arg0, boolean arg1, String arg2, byte arg3) {
        Packet var5 = new Packet(arg0.method294(arg2 + ".dat", null), (byte) 1);
        Packet var6 = new Packet(arg0.method294("index.dat", null), (byte) 1);
        boolean var7 = true;
        var6.field709 = var5.method226() + 4;
        int var8 = var6.method224();
        if (var8 > 0) {
            var6.field709 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field691[var9] = var6.method224();
            this.field692[var9] = var6.method224();
            int var12 = this.field689[var9] = var6.method226();
            int var13 = this.field690[var9] = var6.method226();
            int var14 = var6.method224();
            int var15 = var12 * var13;
            this.field688[var9] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field688[var9][var16] = var5.method225();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field688[var9][var12 * var18 + var17] = var5.method225();
                    }
                }
            }
            if (var13 > this.field694 && var9 < 128) {
                this.field694 = var13;
            }
            this.field691[var9] = 1;
            this.field693[var9] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field688[var9][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field693[var9]--;
                this.field691[var9] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field688[var9][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field693[var9]--;
            }
        }
        if (arg3 == 0) {
            boolean var10 = false;
        } else {
            this.field686 = !this.field686;
        }
        if (arg1) {
            this.field693[32] = this.field693[73];
        } else {
            this.field693[32] = this.field693[105];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIILjava/lang/String;Z)V")
    public void method200(int arg0, int arg1, int arg2, String arg3, boolean arg4) {
        this.method203(arg0 - this.method202(-43341, arg3) / 2, arg3, arg2, arg1, true);
        if (arg4) {
            this.field686 = !this.field686;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
    public void method201(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5) {
        if (arg0 != 0) {
            this.field686 = !this.field686;
        }
        this.method205(arg3, this.field684, arg5, arg2, arg1 - this.method202(-43341, arg3) / 2, arg4);
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method202(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field693[arg1.charAt(var4)];
            }
        }
        if (arg0 == -43341) {
            return var3;
        } else {
            return this.field684;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
    public void method203(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg3 - this.field694;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method208(this.field688[var8], this.field691[var8] + arg0, this.field692[var8] + var6, this.field689[var8], this.field690[var8], arg2);
            }
            arg0 += this.field693[var8];
        }
        if (!arg4) {
            this.field683 = -157;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method204(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.method202(-43341, arg0) / 2;
        if (arg4 < 6 || arg4 > 6) {
            this.field687 = -147;
        }
        int var8 = arg1 - this.field694;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method208(this.field688[var10], this.field691[var10] + var7, this.field692[var10] + var8 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field689[var10], this.field690[var10], arg3);
            }
            var7 += this.field693[var10];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IZIII)V")
    public void method205(String arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        this.field696 = false;
        int var7 = arg4;
        if (arg0 == null) {
            return;
        }
        int var8 = arg3 - this.field694;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
                int var10 = this.method207(arg0.substring(var9 + 1, var9 + 4), -13619);
                if (var10 != -1) {
                    arg5 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg0.charAt(var9);
                if (var11 != ' ') {
                    if (arg2) {
                        this.method208(this.field688[var11], this.field691[var11] + arg4 + 1, this.field692[var11] + var8 + 1, this.field689[var11], this.field690[var11], 0);
                    }
                    this.method208(this.field688[var11], this.field691[var11] + arg4, this.field692[var11] + var8, this.field689[var11], this.field690[var11], arg5);
                }
                arg4 += this.field693[var11];
            }
        }
        if (arg1 > 0 && this.field696) {
            Pix2D.method159(arg4 - var7, 8388608, var7, (byte) 125, (int) ((double) this.field694 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IILjava/lang/String;IIIZ)V")
    public void method206(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg2 == null) {
            return;
        }
        this.field695.setSeed((long) arg5);
        int var8 = (this.field695.nextInt() & 0x1F) + 192;
        int var9 = arg3 - this.field694;
        for (int var10 = 0; var10 < arg2.length(); var10++) {
            if (arg2.charAt(var10) == '@' && var10 + 4 < arg2.length() && arg2.charAt(var10 + 4) == '@') {
                int var11 = this.method207(arg2.substring(var10 + 1, var10 + 4), -13619);
                if (var11 != -1) {
                    arg4 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg2.charAt(var10);
                if (var12 != ' ') {
                    if (arg6) {
                        this.method210(this.field692[var12] + var9 + 1, this.field688[var12], this.field691[var12] + arg1 + 1, 0, this.field690[var12], false, 192, this.field689[var12]);
                    }
                    this.method210(this.field692[var12] + var9, this.field688[var12], this.field691[var12] + arg1, arg4, this.field690[var12], false, var8, this.field689[var12]);
                }
                arg1 += this.field693[var12];
                if ((this.field695.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
        if (arg0 == 12122) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method207(String arg0, int arg1) {
        if (arg1 != -13619) {
            return this.field684;
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
                this.field696 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIII)V")
    private void method208(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field616 * arg2 + arg1;
        int var8 = Pix2D.field616 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field618) {
            int var11 = Pix2D.field618 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field618;
            var10 += arg3 * var11;
            var7 += Pix2D.field616 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field619) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field619;
        }
        if (arg1 < Pix2D.field620) {
            int var12 = Pix2D.field620 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field620;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field621) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field621;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method209(Pix2D.field615, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
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

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I[BIIIZII)V")
    private void method210(int arg0, byte[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int var9 = Pix2D.field616 * arg0 + arg2;
        int var10 = Pix2D.field616 - arg7;
        int var11 = 0;
        int var12 = 0;
        if (arg0 < Pix2D.field618) {
            int var13 = Pix2D.field618 - arg0;
            arg4 -= var13;
            arg0 = Pix2D.field618;
            var12 += arg7 * var13;
            var9 += Pix2D.field616 * var13;
        }
        if (arg0 + arg4 >= Pix2D.field619) {
            arg4 -= arg0 + arg4 + 1 - Pix2D.field619;
        }
        if (arg2 < Pix2D.field620) {
            int var14 = Pix2D.field620 - arg2;
            arg7 -= var14;
            arg2 = Pix2D.field620;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg2 + arg7 >= Pix2D.field621) {
            int var15 = arg2 + arg7 + 1 - Pix2D.field621;
            arg7 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg7 > 0 && arg4 > 0) {
            this.method211(arg4, arg1, arg3, arg7, var11, arg6, var9, Pix2D.field615, -701, var12, var10);
            if (!arg5) {
                ;
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I[BIIIII[IIII)V")
    private void method211(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        while (arg8 >= 0) {
            this.field685 = -187;
        }
        int var12 = ((arg2 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg5 & 0xFF0000) >> 8;
        int var13 = 256 - arg5;
        for (int var14 = -arg0; var14 < 0; var14++) {
            for (int var15 = -arg3; var15 < 0; var15++) {
                if (arg1[arg9++] == 0) {
                    arg6++;
                } else {
                    int var16 = arg7[arg6];
                    arg7[arg6++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg6 += arg10;
            arg9 += arg4;
        }
    }
}
