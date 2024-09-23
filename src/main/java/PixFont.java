import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "kb", name = "z", descriptor = "I")
    private int field683 = 784;

    @OriginalMember(owner = "kb", name = "A", descriptor = "Z")
    private boolean field684 = false;

    @OriginalMember(owner = "kb", name = "C", descriptor = "B")
    private byte field686 = 5;

    @OriginalMember(owner = "kb", name = "D", descriptor = "I")
    private int field687 = 2;

    @OriginalMember(owner = "kb", name = "E", descriptor = "Z")
    private boolean field688 = false;

    @OriginalMember(owner = "kb", name = "F", descriptor = "[[B")
    public byte[][] field689 = new byte[256][];

    @OriginalMember(owner = "kb", name = "G", descriptor = "[I")
    public int[] field690 = new int[256];

    @OriginalMember(owner = "kb", name = "H", descriptor = "[I")
    public int[] field691 = new int[256];

    @OriginalMember(owner = "kb", name = "I", descriptor = "[I")
    public int[] field692 = new int[256];

    @OriginalMember(owner = "kb", name = "J", descriptor = "[I")
    public int[] field693 = new int[256];

    @OriginalMember(owner = "kb", name = "K", descriptor = "[I")
    public int[] field694 = new int[256];

    @OriginalMember(owner = "kb", name = "M", descriptor = "Ljava/util/Random;")
    public Random field696 = new Random();

    @OriginalMember(owner = "kb", name = "N", descriptor = "Z")
    public boolean field697 = false;

    @OriginalMember(owner = "kb", name = "L", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "kb", name = "B", descriptor = "I")
    private int field685;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(ILjava/lang/String;ZLxb;)V")
    public PixFont(int arg0, String arg1, boolean arg2, Jagfile arg3) {
        Packet var5 = new Packet(arg3.method297(arg1 + ".dat", null), 15787);
        Packet var6 = new Packet(arg3.method297("index.dat", null), 15787);
        boolean var7 = true;
        var6.field710 = var5.method229() + 4;
        if (arg0 != 9) {
            this.field684 = !this.field684;
        }
        int var8 = var6.method227();
        if (var8 > 0) {
            var6.field710 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field692[var9] = var6.method227();
            this.field693[var9] = var6.method227();
            int var11 = this.field690[var9] = var6.method229();
            int var12 = this.field691[var9] = var6.method229();
            int var13 = var6.method227();
            int var14 = var11 * var12;
            this.field689[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field689[var9][var15] = var5.method228();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field689[var9][var11 * var17 + var16] = var5.method228();
                    }
                }
            }
            if (var12 > this.field695 && var9 < 128) {
                this.field695 = var12;
            }
            this.field692[var9] = 1;
            this.field694[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field689[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field694[var9]--;
                this.field692[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field689[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field694[var9]--;
            }
        }
        if (arg2) {
            this.field694[32] = this.field694[73];
        } else {
            this.field694[32] = this.field694[105];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method200(int arg0, String arg1, int arg2, int arg3, int arg4) {
        this.method204((byte) -104, arg3, arg1, arg0 - this.method203(arg1, -725) / 2, arg4);
        if (arg2 == -31546) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZIBILjava/lang/String;I)V")
    public void method201(boolean arg0, int arg1, byte arg2, int arg3, String arg4, int arg5) {
        this.method208(arg1, 2, arg5, arg0, arg3 - this.method202(arg4, true) / 2, arg4);
        if (arg2 == -85) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method202(String arg0, boolean arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (!arg1) {
            this.field683 = 391;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field694[arg0.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method203(String arg0, int arg1) {
        while (arg1 >= 0) {
            this.field684 = !this.field684;
        }
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3 += this.field694[arg0.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BILjava/lang/String;II)V")
    public void method204(byte arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null) {
            return;
        }
        int var6 = arg4 - this.field695;
        if (arg0 != -104) {
            this.field685 = -300;
        }
        for (int var7 = 0; var7 < arg2.length(); var7++) {
            char var8 = arg2.charAt(var7);
            if (var8 != ' ') {
                this.method211(this.field689[var8], this.field692[var8] + arg3, this.field693[var8] + var6, this.field690[var8], this.field691[var8], arg1);
            }
            arg3 += this.field694[var8];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
    public void method205(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg0 - this.method203(arg5, -725) / 2;
        int var8 = arg4 - this.field695;
        if (this.field686 != arg2) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            char var11 = arg5.charAt(var10);
            if (var11 != ' ') {
                this.method211(this.field689[var11], this.field692[var11] + var7, this.field693[var11] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D), this.field690[var11], this.field691[var11], arg3);
            }
            var7 += this.field694[var11];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;BIII)V")
    public void method206(int arg0, String arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 3) {
            return;
        }
        boolean var7 = false;
        if (arg1 == null) {
            return;
        }
        int var8 = arg3 - this.method203(arg1, -725) / 2;
        int var9 = arg4 - this.field695;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            char var11 = arg1.charAt(var10);
            if (var11 != ' ') {
                this.method211(this.field689[var11], this.field692[var11] + var8 + (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D), this.field693[var11] + var9 + (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D), this.field690[var11], this.field691[var11], arg0);
            }
            var8 += this.field694[var11];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public void method207(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (arg5 != 8) {
            this.field684 = !this.field684;
        }
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg1 - this.method203(arg0, -725) / 2;
        int var11 = arg3 - this.field695;
        for (int var12 = 0; var12 < arg0.length(); var12++) {
            char var13 = arg0.charAt(var12);
            if (var13 != ' ') {
                this.method211(this.field689[var13], this.field692[var13] + var10, this.field693[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg2) * var8), this.field690[var13], this.field691[var13], arg4);
            }
            var10 += this.field694[var13];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIZILjava/lang/String;)V")
    public void method208(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5) {
        this.field697 = false;
        int var7 = arg4;
        if (arg5 == null) {
            return;
        }
        int var8 = arg2 - this.field695;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            if (arg5.charAt(var9) == '@' && var9 + 4 < arg5.length() && arg5.charAt(var9 + 4) == '@') {
                int var10 = this.method210(arg5.substring(var9 + 1, var9 + 4), 1);
                if (var10 != -1) {
                    arg0 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg5.charAt(var9);
                if (var11 != ' ') {
                    if (arg3) {
                        this.method211(this.field689[var11], this.field692[var11] + arg4 + 1, this.field693[var11] + var8 + 1, this.field690[var11], this.field691[var11], 0);
                    }
                    this.method211(this.field689[var11], this.field692[var11] + arg4, this.field693[var11] + var8, this.field690[var11], this.field691[var11], arg0);
                }
                arg4 += this.field694[var11];
            }
        }
        if (arg1 >= this.field687 && arg1 <= this.field687 && this.field697) {
            Pix2D.method159(arg4 - var7, var7, 8388608, true, (int) ((double) this.field695 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;ZIIIII)V")
    public void method209(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 26617) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg0 == null) {
            return;
        }
        this.field696.setSeed((long) arg5);
        int var9 = (this.field696.nextInt() & 0x1F) + 192;
        int var10 = arg6 - this.field695;
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            if (arg0.charAt(var11) == '@' && var11 + 4 < arg0.length() && arg0.charAt(var11 + 4) == '@') {
                int var12 = this.method210(arg0.substring(var11 + 1, var11 + 4), 1);
                if (var12 != -1) {
                    arg2 = var12;
                }
                var11 += 4;
            } else {
                char var13 = arg0.charAt(var11);
                if (var13 != ' ') {
                    if (arg1) {
                        this.method213(this.field689[var13], this.field692[var13] + arg4 + 1, 0, this.field693[var13] + var10 + 1, this.field691[var13], 192, this.field690[var13], false);
                    }
                    this.method213(this.field689[var13], this.field692[var13] + arg4, arg2, this.field693[var13] + var10, this.field691[var13], var9, this.field690[var13], false);
                }
                arg4 += this.field694[var13];
                if ((this.field696.nextInt() & 0x3) == 0) {
                    arg4++;
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method210(String arg0, int arg1) {
        if (arg1 != 1) {
            return this.field685;
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
                this.field697 = true;
            }
            if (arg0.equals("end")) {
                this.field697 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIII)V")
    private void method211(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field621 * arg2 + arg1;
        int var8 = Pix2D.field621 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field623) {
            int var11 = Pix2D.field623 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field623;
            var10 += arg3 * var11;
            var7 += Pix2D.field621 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field624) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field624;
        }
        if (arg1 < Pix2D.field625) {
            int var12 = Pix2D.field625 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field625;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field626) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field626;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method212(Pix2D.field620, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method212(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIIIIZ)V")
    private void method213(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg7) {
            this.field685 = 122;
        }
        int var9 = Pix2D.field621 * arg3 + arg1;
        int var10 = Pix2D.field621 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (arg3 < Pix2D.field623) {
            int var13 = Pix2D.field623 - arg3;
            arg4 -= var13;
            arg3 = Pix2D.field623;
            var12 += arg6 * var13;
            var9 += Pix2D.field621 * var13;
        }
        if (arg3 + arg4 >= Pix2D.field624) {
            arg4 -= arg3 + arg4 + 1 - Pix2D.field624;
        }
        if (arg1 < Pix2D.field625) {
            int var14 = Pix2D.field625 - arg1;
            arg6 -= var14;
            arg1 = Pix2D.field625;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg6 >= Pix2D.field626) {
            int var15 = arg1 + arg6 + 1 - Pix2D.field626;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg4 > 0) {
            this.method214(var11, arg6, arg2, arg0, false, Pix2D.field620, var9, var12, var10, arg5, arg4);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(III[BZ[IIIIII)V")
    private void method214(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg4) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var14 = 256 - arg9;
        for (int var15 = -arg10; var15 < 0; var15++) {
            for (int var16 = -arg1; var16 < 0; var16++) {
                if (arg3[arg7++] == 0) {
                    arg6++;
                } else {
                    int var17 = arg5[arg6];
                    arg5[arg6++] = (((var17 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var17 & 0xFF00) * var14 & 0xFF0000) >> 8) + var13;
                }
            }
            arg6 += arg8;
            arg7 += arg0;
        }
    }
}
