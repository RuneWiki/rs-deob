import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "kb", name = "A", descriptor = "I")
    private int field688 = 864;

    @OriginalMember(owner = "kb", name = "B", descriptor = "Z")
    private boolean field689 = false;

    @OriginalMember(owner = "kb", name = "C", descriptor = "I")
    private int field690 = 455;

    @OriginalMember(owner = "kb", name = "D", descriptor = "Z")
    private boolean field691 = false;

    @OriginalMember(owner = "kb", name = "E", descriptor = "Z")
    private boolean field692 = false;

    @OriginalMember(owner = "kb", name = "F", descriptor = "[[B")
    public byte[][] field693 = new byte[256][];

    @OriginalMember(owner = "kb", name = "G", descriptor = "[I")
    public int[] field694 = new int[256];

    @OriginalMember(owner = "kb", name = "H", descriptor = "[I")
    public int[] field695 = new int[256];

    @OriginalMember(owner = "kb", name = "I", descriptor = "[I")
    public int[] field696 = new int[256];

    @OriginalMember(owner = "kb", name = "J", descriptor = "[I")
    public int[] field697 = new int[256];

    @OriginalMember(owner = "kb", name = "K", descriptor = "[I")
    public int[] field698 = new int[256];

    @OriginalMember(owner = "kb", name = "M", descriptor = "Ljava/util/Random;")
    public Random field700 = new Random();

    @OriginalMember(owner = "kb", name = "N", descriptor = "Z")
    public boolean field701 = false;

    @OriginalMember(owner = "kb", name = "L", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(ZLjava/lang/String;Lxb;I)V")
    public PixFont(boolean arg0, String arg1, Jagfile arg2, int arg3) {
        Packet var5 = new Packet(arg2.method299(arg1 + ".dat", null), (byte) -93);
        Packet var6 = new Packet(arg2.method299("index.dat", null), (byte) -93);
        boolean var7 = true;
        var6.field713 = var5.method231() + 4;
        int var8 = var6.method229();
        int var9 = 45 / arg3;
        if (var8 > 0) {
            var6.field713 += (var8 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field696[var10] = var6.method229();
            this.field697[var10] = var6.method229();
            int var12 = this.field694[var10] = var6.method231();
            int var13 = this.field695[var10] = var6.method231();
            int var14 = var6.method229();
            int var15 = var12 * var13;
            this.field693[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field693[var10][var16] = var5.method230();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field693[var10][var12 * var18 + var17] = var5.method230();
                    }
                }
            }
            if (var13 > this.field699 && var10 < 128) {
                this.field699 = var13;
            }
            this.field696[var10] = 1;
            this.field698[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field693[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field698[var10]--;
                this.field696[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field693[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field698[var10]--;
            }
        }
        if (arg0) {
            this.field698[32] = this.field698[73];
        } else {
            this.field698[32] = this.field698[105];
            if (Linkable.field362) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIZI)V")
    public void method201(String arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.method206(arg0, false, arg2, arg1 - this.method205(arg0, false), arg4);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIBI)V")
    public void method202(String arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 0) {
            this.field688 = 433;
        }
        this.method206(arg0, false, arg1, arg4 - this.method205(arg0, false) / 2, arg2);
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZIILjava/lang/String;II)V")
    public void method203(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        this.method210(arg5, arg4 - this.method204((byte) 0, arg3) / 2, arg3, arg2, arg0, (byte) 3);
        if (arg1 == 12737) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method204(byte arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field698[arg1.charAt(var4)];
            }
        }
        if (arg0 == 0) {
            boolean var5 = false;
        } else {
            this.field691 = !this.field691;
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method205(String arg0, boolean arg1) {
        if (arg1) {
            this.field689 = !this.field689;
        }
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3 += this.field698[arg0.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
    public void method206(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg2 - this.field699;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            char var8 = arg0.charAt(var7);
            if (var8 != ' ') {
                this.method213(this.field693[var8], this.field696[var8] + arg3, this.field697[var8] + var6, this.field694[var8], this.field695[var8], arg4);
            }
            arg3 += this.field698[var8];
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public void method207(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg2 >= 0) {
            this.field688 = 55;
        }
        if (arg4 == null) {
            return;
        }
        int var7 = arg3 - this.method205(arg4, false) / 2;
        int var8 = arg5 - this.field699;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            char var10 = arg4.charAt(var9);
            if (var10 != ' ') {
                this.method213(this.field693[var10], this.field696[var10] + var7, this.field697[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field694[var10], this.field695[var10], arg0);
            }
            var7 += this.field698[var10];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V")
    public void method208(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.method205(arg0, false) / 2;
        int var8 = arg5 - this.field699;
        if (arg4 != 96) {
            this.field692 = !this.field692;
        }
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method213(this.field693[var10], this.field696[var10] + var7 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field697[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field694[var10], this.field695[var10], arg1);
            }
            var7 += this.field698[var10];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public void method209(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 >= 0) {
            this.field689 = !this.field689;
        }
        if (arg1 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg3 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg6 - this.method205(arg1, false) / 2;
        int var11 = arg2 - this.field699;
        for (int var12 = 0; var12 < arg1.length(); var12++) {
            char var13 = arg1.charAt(var12);
            if (var13 != ' ') {
                this.method213(this.field693[var13], this.field696[var13] + var10, this.field697[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg4) * var8), this.field694[var13], this.field695[var13], arg0);
            }
            var10 += this.field698[var13];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IILjava/lang/String;IZB)V")
    public void method210(int arg0, int arg1, String arg2, int arg3, boolean arg4, byte arg5) {
        this.field701 = false;
        int var7 = arg1;
        if (arg5 != 3) {
            this.field690 = -483;
        }
        if (arg2 == null) {
            return;
        }
        int var8 = arg0 - this.field699;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            if (arg2.charAt(var9) == '@' && var9 + 4 < arg2.length() && arg2.charAt(var9 + 4) == '@') {
                int var10 = this.method212(695, arg2.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg2.charAt(var9);
                if (var11 != ' ') {
                    if (arg4) {
                        this.method213(this.field693[var11], this.field696[var11] + arg1 + 1, this.field697[var11] + var8 + 1, this.field694[var11], this.field695[var11], 0);
                    }
                    this.method213(this.field693[var11], this.field696[var11] + arg1, this.field697[var11] + var8, this.field694[var11], this.field695[var11], arg3);
                }
                arg1 += this.field698[var11];
            }
        }
        if (this.field701) {
            Pix2D.method160(8388608, 0, (int) ((double) this.field699 * 0.7D) + var8, arg1 - var7, var7);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIZLjava/lang/String;II)V")
    public void method211(int arg0, int arg1, int arg2, boolean arg3, String arg4, int arg5, int arg6) {
        if (arg4 == null) {
            return;
        }
        this.field700.setSeed((long) arg2);
        int var8 = (this.field700.nextInt() & 0x1F) + 192;
        if (arg5 < 7 || arg5 > 7) {
            this.field689 = !this.field689;
        }
        int var9 = arg0 - this.field699;
        for (int var10 = 0; var10 < arg4.length(); var10++) {
            if (arg4.charAt(var10) == '@' && var10 + 4 < arg4.length() && arg4.charAt(var10 + 4) == '@') {
                int var11 = this.method212(695, arg4.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg1 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg4.charAt(var10);
                if (var12 != ' ') {
                    if (arg3) {
                        this.method215(this.field694[var12], 0, this.field693[var12], this.field697[var12] + var9 + 1, this.field696[var12] + arg6 + 1, -332, 192, this.field695[var12]);
                    }
                    this.method215(this.field694[var12], arg1, this.field693[var12], this.field697[var12] + var9, this.field696[var12] + arg6, -332, var8, this.field695[var12]);
                }
                arg6 += this.field698[var12];
                if ((this.field700.nextInt() & 0x3) == 0) {
                    arg6++;
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method212(int arg0, String arg1) {
        int var3 = 45 / arg0;
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
                this.field701 = true;
            }
            if (arg1.equals("end")) {
                this.field701 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIII)V")
    private void method213(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field622 * arg2 + arg1;
        int var8 = Pix2D.field622 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field624) {
            int var11 = Pix2D.field624 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field624;
            var10 += arg3 * var11;
            var7 += Pix2D.field622 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field625) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field625;
        }
        if (arg1 < Pix2D.field626) {
            int var12 = Pix2D.field626 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field626;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field627) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field627;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method214(Pix2D.field621, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
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

    @OriginalMember(owner = "kb", name = "a", descriptor = "(II[BIIIII)V")
    private void method215(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 >= 0) {
            return;
        }
        int var9 = Pix2D.field622 * arg3 + arg4;
        int var10 = Pix2D.field622 - arg0;
        int var11 = 0;
        int var12 = 0;
        if (arg3 < Pix2D.field624) {
            int var13 = Pix2D.field624 - arg3;
            arg7 -= var13;
            arg3 = Pix2D.field624;
            var12 += arg0 * var13;
            var9 += Pix2D.field622 * var13;
        }
        if (arg3 + arg7 >= Pix2D.field625) {
            arg7 -= arg3 + arg7 + 1 - Pix2D.field625;
        }
        if (arg4 < Pix2D.field626) {
            int var14 = Pix2D.field626 - arg4;
            arg0 -= var14;
            arg4 = Pix2D.field626;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg0 + arg4 >= Pix2D.field627) {
            int var15 = arg0 + arg4 + 1 - Pix2D.field627;
            arg0 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg0 > 0 && arg7 > 0) {
            this.method216(var9, var11, var12, arg1, (byte) 8, var10, arg7, Pix2D.field621, arg6, arg2, arg0);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIIBII[II[BI)V")
    private void method216(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int[] arg7, int arg8, byte[] arg9, int arg10) {
        int var12 = ((arg3 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg8 & 0xFF0000) >> 8;
        if (arg4 != 8) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        int var14 = 256 - arg8;
        for (int var15 = -arg6; var15 < 0; var15++) {
            for (int var16 = -arg10; var16 < 0; var16++) {
                if (arg9[arg2++] == 0) {
                    arg0++;
                } else {
                    int var17 = arg7[arg0];
                    arg7[arg0++] = (((var17 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var17 & 0xFF00) * var14 & 0xFF0000) >> 8) + var12;
                }
            }
            arg0 += arg5;
            arg2 += arg1;
        }
    }
}
