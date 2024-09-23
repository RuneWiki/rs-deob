import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "kb", name = "z", descriptor = "I")
    private int field680 = 1000;

    @OriginalMember(owner = "kb", name = "A", descriptor = "B")
    private byte field681 = -42;

    @OriginalMember(owner = "kb", name = "B", descriptor = "I")
    private int field682 = 8184;

    @OriginalMember(owner = "kb", name = "C", descriptor = "Z")
    private boolean field683 = true;

    @OriginalMember(owner = "kb", name = "D", descriptor = "[[B")
    public byte[][] field684 = new byte[256][];

    @OriginalMember(owner = "kb", name = "E", descriptor = "[I")
    public int[] field685 = new int[256];

    @OriginalMember(owner = "kb", name = "F", descriptor = "[I")
    public int[] field686 = new int[256];

    @OriginalMember(owner = "kb", name = "G", descriptor = "[I")
    public int[] field687 = new int[256];

    @OriginalMember(owner = "kb", name = "H", descriptor = "[I")
    public int[] field688 = new int[256];

    @OriginalMember(owner = "kb", name = "I", descriptor = "[I")
    public int[] field689 = new int[256];

    @OriginalMember(owner = "kb", name = "K", descriptor = "Ljava/util/Random;")
    public Random field691 = new Random();

    @OriginalMember(owner = "kb", name = "L", descriptor = "Z")
    public boolean field692 = false;

    @OriginalMember(owner = "kb", name = "J", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(ZLxb;ILjava/lang/String;)V")
    public PixFont(boolean arg0, Jagfile arg1, int arg2, String arg3) {
        Packet var5 = new Packet(this.field680, arg1.method299(arg3 + ".dat", null));
        Packet var6 = new Packet(this.field680, arg1.method299("index.dat", null));
        boolean var7 = true;
        var6.field703 = var5.method231() + 4;
        if (arg2 != 45801) {
            this.field680 = 243;
        }
        int var8 = var6.method229();
        if (var8 > 0) {
            var6.field703 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field687[var9] = var6.method229();
            this.field688[var9] = var6.method229();
            int var11 = this.field685[var9] = var6.method231();
            int var12 = this.field686[var9] = var6.method231();
            int var13 = var6.method229();
            int var14 = var11 * var12;
            this.field684[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field684[var9][var15] = var5.method230();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field684[var9][var11 * var17 + var16] = var5.method230();
                    }
                }
            }
            if (var12 > this.field690 && var9 < 128) {
                this.field690 = var12;
            }
            this.field687[var9] = 1;
            this.field689[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field684[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field689[var9]--;
                this.field687[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field684[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field689[var9]--;
            }
        }
        if (arg0) {
            this.field689[32] = this.field689[73];
        } else {
            this.field689[32] = this.field689[105];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method201(int arg0, String arg1, int arg2, int arg3, int arg4) {
        this.method206(-49546, arg1, arg0, arg4 - this.method205(arg1, -309), arg2);
        if (arg3 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method202(int arg0, int arg1, int arg2, int arg3, String arg4) {
        if (arg2 == 36569) {
            this.method206(-49546, arg4, arg0, arg3 - this.method205(arg4, -309) / 2, arg1);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIZIILjava/lang/String;)V")
    public void method203(int arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5) {
        if (arg1 == 0) {
            this.method210(arg3, arg2, arg0 - this.method204(arg5, this.field681) / 2, 16365, arg4, arg5);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method204(String arg0, byte arg1) {
        if (arg1 != -42) {
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
                var4 += this.field689[arg0.charAt(var5)];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method205(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 >= 0) {
            return 2;
        } else {
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                var3 += this.field689[arg0.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(ILjava/lang/String;III)V")
    public void method206(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg4 - this.field690;
        if (arg0 != -49546) {
            this.field680 = 54;
        }
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method213(this.field684[var8], this.field687[var8] + arg3, this.field688[var8] + var6, this.field685[var8], this.field686[var8], arg2);
            }
            arg3 += this.field689[var8];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IBIIILjava/lang/String;)V")
    public void method207(int arg0, byte arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg3 - this.method205(arg5, -309) / 2;
        int var8 = arg2 - this.field690;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method213(this.field684[var10], this.field687[var10] + var7, this.field688[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field685[var10], this.field686[var10], arg0);
            }
            var7 += this.field689[var10];
        }
        if (arg1 == 6) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IZIILjava/lang/String;I)V")
    public void method208(int arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg4 == null) {
            return;
        }
        int var7 = arg0 - this.method205(arg4, -309) / 2;
        if (arg1) {
            return;
        }
        int var8 = arg3 - this.field690;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            char var10 = arg4.charAt(var9);
            if (var10 != ' ') {
                this.method213(this.field684[var10], this.field687[var10] + var7 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field688[var10] + var8 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field685[var10], this.field686[var10], arg2);
            }
            var7 += this.field689[var10];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public void method209(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg3 / 8.0D;
        if (arg6 != 4) {
            this.field680 = -399;
        }
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg2 - this.method205(arg1, -309) / 2;
        int var11 = arg0 - this.field690;
        for (int var12 = 0; var12 < arg1.length(); var12++) {
            char var13 = arg1.charAt(var12);
            if (var13 != ' ') {
                this.method213(this.field684[var13], this.field687[var13] + var10, this.field688[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg4) * var8), this.field685[var13], this.field686[var13], arg5);
            }
            var10 += this.field689[var13];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IZIIILjava/lang/String;)V")
    public void method210(int arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5) {
        this.field692 = false;
        if (arg3 != 16365) {
            return;
        }
        int var7 = arg2;
        if (arg5 == null) {
            return;
        }
        int var8 = arg0 - this.field690;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            if (arg5.charAt(var9) == '@' && var9 + 4 < arg5.length() && arg5.charAt(var9 + 4) == '@') {
                int var10 = this.method212(arg5.substring(var9 + 1, var9 + 4), (byte) -119);
                if (var10 != -1) {
                    arg4 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg5.charAt(var9);
                if (var11 != ' ') {
                    if (arg1) {
                        this.method213(this.field684[var11], this.field687[var11] + arg2 + 1, this.field688[var11] + var8 + 1, this.field685[var11], this.field686[var11], 0);
                    }
                    this.method213(this.field684[var11], this.field687[var11] + arg2, this.field688[var11] + var8, this.field685[var11], this.field686[var11], arg4);
                }
                arg2 += this.field689[var11];
            }
        }
        if (this.field692) {
            Pix2D.method160((int) ((double) this.field690 * 0.7D) + var8, var7, arg2 - var7, (byte) 6, 8388608);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZIIIILjava/lang/String;I)V")
    public void method211(boolean arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        int var8 = 6 / arg2;
        if (arg5 == null) {
            return;
        }
        this.field691.setSeed((long) arg1);
        int var9 = (this.field691.nextInt() & 0x1F) + 192;
        int var10 = arg3 - this.field690;
        for (int var11 = 0; var11 < arg5.length(); var11++) {
            if (arg5.charAt(var11) == '@' && var11 + 4 < arg5.length() && arg5.charAt(var11 + 4) == '@') {
                int var12 = this.method212(arg5.substring(var11 + 1, var11 + 4), (byte) -119);
                if (var12 != -1) {
                    arg4 = var12;
                }
                var11 += 4;
            } else {
                char var13 = arg5.charAt(var11);
                if (var13 != ' ') {
                    if (arg0) {
                        this.method215(0, this.field687[var13] + arg6 + 1, this.field685[var13], 192, 0, this.field688[var13] + var10 + 1, this.field686[var13], this.field684[var13]);
                    }
                    this.method215(0, this.field687[var13] + arg6, this.field685[var13], var9, arg4, this.field688[var13] + var10, this.field686[var13], this.field684[var13]);
                }
                arg6 += this.field689[var13];
                if ((this.field691.nextInt() & 0x3) == 0) {
                    arg6++;
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(Ljava/lang/String;B)I")
    public int method212(String arg0, byte arg1) {
        if (arg1 != -119) {
            this.field683 = !this.field683;
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
                this.field692 = true;
            }
            if (arg0.equals("end")) {
                this.field692 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIII)V")
    private void method213(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
            this.method214(Pix2D.field620, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method214(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIIIII[B)V")
    private void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7) {
        if (arg0 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = Pix2D.field621 * arg5 + arg1;
        int var11 = Pix2D.field621 - arg2;
        int var12 = 0;
        int var13 = 0;
        if (arg5 < Pix2D.field623) {
            int var14 = Pix2D.field623 - arg5;
            arg6 -= var14;
            arg5 = Pix2D.field623;
            var13 += arg2 * var14;
            var10 += Pix2D.field621 * var14;
        }
        if (arg5 + arg6 >= Pix2D.field624) {
            arg6 -= arg5 + arg6 + 1 - Pix2D.field624;
        }
        if (arg1 < Pix2D.field625) {
            int var15 = Pix2D.field625 - arg1;
            arg2 -= var15;
            arg1 = Pix2D.field625;
            var13 += var15;
            var10 += var15;
            var12 += var15;
            var11 += var15;
        }
        if (arg1 + arg2 >= Pix2D.field626) {
            int var16 = arg1 + arg2 + 1 - Pix2D.field626;
            arg2 -= var16;
            var12 += var16;
            var11 += var16;
        }
        if (arg2 > 0 && arg6 > 0) {
            this.method216(this.field682, var10, arg6, arg3, Pix2D.field620, var13, arg7, arg4, var12, var11, arg2);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIII[II[BIIII)V")
    private void method216(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 != 8184) {
            return;
        }
        int var12 = ((arg7 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg3 & 0xFF0000) >> 8;
        int var13 = 256 - arg3;
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = -arg10; var15 < 0; var15++) {
                if (arg6[arg5++] == 0) {
                    arg1++;
                } else {
                    int var16 = arg4[arg1];
                    arg4[arg1++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg1 += arg9;
            arg5 += arg8;
        }
    }
}
