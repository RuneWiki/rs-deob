import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "kb", name = "x", descriptor = "Z")
    private boolean field682 = true;

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private int field683 = 5;

    @OriginalMember(owner = "kb", name = "z", descriptor = "I")
    private int field684 = 2;

    @OriginalMember(owner = "kb", name = "A", descriptor = "[[B")
    public byte[][] field685 = new byte[256][];

    @OriginalMember(owner = "kb", name = "B", descriptor = "[I")
    public int[] field686 = new int[256];

    @OriginalMember(owner = "kb", name = "C", descriptor = "[I")
    public int[] field687 = new int[256];

    @OriginalMember(owner = "kb", name = "D", descriptor = "[I")
    public int[] field688 = new int[256];

    @OriginalMember(owner = "kb", name = "E", descriptor = "[I")
    public int[] field689 = new int[256];

    @OriginalMember(owner = "kb", name = "F", descriptor = "[I")
    public int[] field690 = new int[256];

    @OriginalMember(owner = "kb", name = "H", descriptor = "Ljava/util/Random;")
    public Random field692 = new Random();

    @OriginalMember(owner = "kb", name = "I", descriptor = "Z")
    public boolean field693 = false;

    @OriginalMember(owner = "kb", name = "G", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "kb", name = "w", descriptor = "I")
    private int field681;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lxb;ZLjava/lang/String;I)V")
    public PixFont(Jagfile arg0, boolean arg1, String arg2, int arg3) {
        Packet var5 = new Packet(arg0.method295(arg2 + ".dat", null), 185);
        Packet var6 = new Packet(arg0.method295("index.dat", null), 185);
        boolean var7 = true;
        var6.field708 = var5.method227() + 4;
        int var8 = var6.method225();
        if (var8 > 0) {
            var6.field708 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field688[var9] = var6.method225();
            this.field689[var9] = var6.method225();
            int var12 = this.field686[var9] = var6.method227();
            int var13 = this.field687[var9] = var6.method227();
            int var14 = var6.method225();
            int var15 = var12 * var13;
            this.field685[var9] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field685[var9][var16] = var5.method226();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field685[var9][var12 * var18 + var17] = var5.method226();
                    }
                }
            }
            if (var13 > this.field691 && var9 < 128) {
                this.field691 = var13;
            }
            this.field688[var9] = 1;
            this.field690[var9] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field685[var9][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field690[var9]--;
                this.field688[var9] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field685[var9][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field690[var9]--;
            }
        }
        if (arg3 != 8) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        if (arg1) {
            this.field690[32] = this.field690[73];
        } else {
            this.field690[32] = this.field690[105];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IBILjava/lang/String;I)V")
    public void method200(int arg0, byte arg1, int arg2, String arg3, int arg4) {
        if (arg1 != 2) {
            this.field681 = 467;
        }
        this.method204(arg0 - this.method203(arg3, 479) / 2, arg3, -1765, arg4, arg2);
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZILjava/lang/String;IZI)V")
    public void method201(boolean arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5) {
        if (arg4) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.method206(arg1, 12, arg3 - this.method202(arg2, 5) / 2, arg0, arg5, arg2);
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method202(String arg0, int arg1) {
        if (arg1 < this.field683 || arg1 > this.field683) {
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
                var4 += this.field690[arg0.charAt(var5)];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method203(String arg0, int arg1) {
        if (arg1 <= 0) {
            return 1;
        } else if (arg0 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                var3 += this.field690[arg0.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method204(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1765 || arg1 == null) {
            return;
        }
        int var6 = arg3 - this.field691;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method209(this.field685[var8], this.field688[var8] + arg0, this.field689[var8] + var6, this.field686[var8], this.field687[var8], arg4);
            }
            arg0 += this.field690[var8];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;IIIB)V")
    public void method205(int arg0, String arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg4 - this.method203(arg1, 479) / 2;
        int var8 = arg3 - this.field691;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var11 = arg1.charAt(var9);
            if (var11 != ' ') {
                this.method209(this.field685[var11], this.field688[var11] + var7, this.field689[var11] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field686[var11], this.field687[var11], arg0);
            }
            var7 += this.field690[var11];
        }
        if (arg5 == 8) {
            boolean var10 = false;
        } else {
            this.field684 = 303;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIZILjava/lang/String;)V")
    public void method206(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5) {
        this.field693 = false;
        int var7 = arg2;
        if (arg5 == null) {
            return;
        }
        int var8 = arg0 - this.field691;
        if (arg1 <= 0) {
            return;
        }
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            if (arg5.charAt(var9) == '@' && var9 + 4 < arg5.length() && arg5.charAt(var9 + 4) == '@') {
                int var10 = this.method208((byte) 6, arg5.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg4 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg5.charAt(var9);
                if (var11 != ' ') {
                    if (arg3) {
                        this.method209(this.field685[var11], this.field688[var11] + arg2 + 1, this.field689[var11] + var8 + 1, this.field686[var11], this.field687[var11], 0);
                    }
                    this.method209(this.field685[var11], this.field688[var11] + arg2, this.field689[var11] + var8, this.field686[var11], this.field687[var11], arg4);
                }
                arg2 += this.field690[var11];
            }
        }
        if (this.field693) {
            Pix2D.method159((int) ((double) this.field691 * 0.7D) + var8, 8388608, arg2 - var7, 0, var7);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIZIIZ)V")
    public void method207(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 == null) {
            return;
        }
        this.field692.setSeed((long) arg4);
        int var8 = (this.field692.nextInt() & 0x1F) + 192;
        if (arg6) {
            this.field683 = 187;
        }
        int var9 = arg2 - this.field691;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) == '@' && var10 + 4 < arg0.length() && arg0.charAt(var10 + 4) == '@') {
                int var11 = this.method208((byte) 6, arg0.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg1 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg0.charAt(var10);
                if (var12 != ' ') {
                    if (arg3) {
                        this.method211(192, this.field687[var12], false, this.field686[var12], this.field689[var12] + var9 + 1, this.field688[var12] + arg5 + 1, this.field685[var12], 0);
                    }
                    this.method211(var8, this.field687[var12], false, this.field686[var12], this.field689[var12] + var9, this.field688[var12] + arg5, this.field685[var12], arg1);
                }
                arg5 += this.field690[var12];
                if ((this.field692.nextInt() & 0x3) == 0) {
                    arg5++;
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method208(byte arg0, String arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            this.field681 = 18;
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
                this.field693 = true;
            }
            if (arg1.equals("end")) {
                this.field693 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIII)V")
    private void method209(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
            this.method210(Pix2D.field620, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method210(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIZIII[BI)V")
    private void method211(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        if (arg2) {
            return;
        }
        int var9 = Pix2D.field621 * arg4 + arg5;
        int var10 = Pix2D.field621 - arg3;
        int var11 = 0;
        int var12 = 0;
        if (arg4 < Pix2D.field623) {
            int var13 = Pix2D.field623 - arg4;
            arg1 -= var13;
            arg4 = Pix2D.field623;
            var12 += arg3 * var13;
            var9 += Pix2D.field621 * var13;
        }
        if (arg1 + arg4 >= Pix2D.field624) {
            arg1 -= arg1 + arg4 + 1 - Pix2D.field624;
        }
        if (arg5 < Pix2D.field625) {
            int var14 = Pix2D.field625 - arg5;
            arg3 -= var14;
            arg5 = Pix2D.field625;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg3 + arg5 >= Pix2D.field626) {
            int var15 = arg3 + arg5 + 1 - Pix2D.field626;
            arg3 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg3 > 0 && arg1 > 0) {
            this.method212(arg1, arg7, arg3, var11, var9, arg6, (byte) 9, Pix2D.field620, arg0, var12, var10);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIII[BB[IIII)V")
    private void method212(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, byte arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg1 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg8 & 0xFF0000) >> 8;
        if (arg6 != 9) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        int var14 = 256 - arg8;
        for (int var15 = -arg0; var15 < 0; var15++) {
            for (int var16 = -arg2; var16 < 0; var16++) {
                if (arg5[arg9++] == 0) {
                    arg4++;
                } else {
                    int var17 = arg7[arg4];
                    arg7[arg4++] = (((var17 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var17 & 0xFF00) * var14 & 0xFF0000) >> 8) + var12;
                }
            }
            arg4 += arg10;
            arg9 += arg3;
        }
    }
}
