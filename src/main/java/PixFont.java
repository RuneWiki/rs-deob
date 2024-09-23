import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "kb", name = "w", descriptor = "Z")
    private boolean field687 = true;

    @OriginalMember(owner = "kb", name = "x", descriptor = "I")
    private int field688 = 1;

    @OriginalMember(owner = "kb", name = "y", descriptor = "B")
    private byte field689 = 4;

    @OriginalMember(owner = "kb", name = "z", descriptor = "I")
    private int field690 = 7;

    @OriginalMember(owner = "kb", name = "A", descriptor = "I")
    private int field691 = -17283;

    @OriginalMember(owner = "kb", name = "B", descriptor = "I")
    private int field692 = 25737;

    @OriginalMember(owner = "kb", name = "C", descriptor = "Z")
    private boolean field693 = true;

    @OriginalMember(owner = "kb", name = "F", descriptor = "[[B")
    public byte[][] field696 = new byte[256][];

    @OriginalMember(owner = "kb", name = "G", descriptor = "[I")
    public int[] field697 = new int[256];

    @OriginalMember(owner = "kb", name = "H", descriptor = "[I")
    public int[] field698 = new int[256];

    @OriginalMember(owner = "kb", name = "I", descriptor = "[I")
    public int[] field699 = new int[256];

    @OriginalMember(owner = "kb", name = "J", descriptor = "[I")
    public int[] field700 = new int[256];

    @OriginalMember(owner = "kb", name = "K", descriptor = "[I")
    public int[] field701 = new int[256];

    @OriginalMember(owner = "kb", name = "M", descriptor = "Ljava/util/Random;")
    public Random field703 = new Random();

    @OriginalMember(owner = "kb", name = "N", descriptor = "Z")
    public boolean field704 = false;

    @OriginalMember(owner = "kb", name = "L", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "kb", name = "D", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "kb", name = "E", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(IZLjava/lang/String;Lxb;)V")
    public PixFont(int arg0, boolean arg1, String arg2, Jagfile arg3) {
        Packet var5 = new Packet(arg3.method299(arg2 + ".dat", null), -26728);
        Packet var6 = new Packet(arg3.method299("index.dat", null), -26728);
        boolean var7 = true;
        var6.field717 = var5.method231() + 4;
        int var8 = var6.method229();
        if (var8 > 0) {
            var6.field717 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field699[var9] = var6.method229();
            this.field700[var9] = var6.method229();
            int var11 = this.field697[var9] = var6.method231();
            int var12 = this.field698[var9] = var6.method231();
            int var13 = var6.method229();
            int var14 = var11 * var12;
            this.field696[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field696[var9][var15] = var5.method230();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field696[var9][var11 * var17 + var16] = var5.method230();
                    }
                }
            }
            if (var12 > this.field702 && var9 < 128) {
                this.field702 = var12;
            }
            this.field699[var9] = 1;
            this.field701[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field696[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field701[var9]--;
                this.field699[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field696[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field701[var9]--;
            }
        }
        if (arg0 < this.field690 || arg0 > this.field690) {
            throw new NullPointerException();
        } else if (arg1) {
            this.field701[32] = this.field701[73];
        } else {
            this.field701[32] = this.field701[105];
            if (Linkable.field363) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method201(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg3 == 44274) {
            this.method206(arg2, arg0 - this.method205(arg2, -17283), arg4, 25737, arg1);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method202(String arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 78 / arg4;
        this.method206(arg0, arg3 - this.method205(arg0, -17283) / 2, arg2, 25737, arg1);
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIIBZ)V")
    public void method203(String arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        if (arg4 != 1) {
            this.field694 = 265;
        }
        this.method210(arg0, false, arg3, arg2 - this.method204((byte) 4, arg0) / 2, arg5, arg1);
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method204(byte arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (this.field689 != arg0) {
            return this.field694;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field701[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method205(String arg0, int arg1) {
        if (this.field691 != arg1) {
            this.field687 = !this.field687;
        }
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3 += this.field701[arg0.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
    public void method206(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field692 != arg3) {
            this.field693 = !this.field693;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = arg4 - this.field702;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            char var8 = arg0.charAt(var7);
            if (var8 != ' ') {
                this.method213(this.field696[var8], this.field699[var8] + arg1, this.field700[var8] + var6, this.field697[var8], this.field698[var8], arg2);
            }
            arg1 += this.field701[var8];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIIZLjava/lang/String;)V")
    public void method207(int arg0, int arg1, int arg2, int arg3, boolean arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg3 - this.method205(arg5, -17283) / 2;
        int var8 = arg2 - this.field702;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method213(this.field696[var10], this.field699[var10] + var7, this.field700[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field697[var10], this.field698[var10], arg1);
            }
            var7 += this.field701[var10];
        }
        if (arg4) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public void method208(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg1 != 0) {
            this.field693 = !this.field693;
        }
        if (arg3 == null) {
            return;
        }
        int var7 = arg5 - this.method205(arg3, -17283) / 2;
        int var8 = arg4 - this.field702;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            char var10 = arg3.charAt(var9);
            if (var10 != ' ') {
                this.method213(this.field696[var10], this.field699[var10] + var7 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field700[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field697[var10], this.field698[var10], arg0);
            }
            var7 += this.field701[var10];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIIIIB)V")
    public void method209(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg0 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg1 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg5 - this.method205(arg0, -17283) / 2;
        int var11 = arg3 - this.field702;
        for (int var12 = 0; var12 < arg0.length(); var12++) {
            char var13 = arg0.charAt(var12);
            if (var13 != ' ') {
                this.method213(this.field696[var13], this.field699[var13] + var10, this.field700[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg4) * var8), this.field697[var13], this.field698[var13], arg2);
            }
            var10 += this.field701[var13];
        }
        if (arg6 != 30) {
            this.field691 = -46;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;ZIIZI)V")
    public void method210(String arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.field704 = false;
        if (arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = arg3;
        if (arg0 == null) {
            return;
        }
        int var9 = arg5 - this.field702;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) == '@' && var10 + 4 < arg0.length() && arg0.charAt(var10 + 4) == '@') {
                int var11 = this.method212(arg0.substring(var10 + 1, var10 + 4), true);
                if (var11 != -1) {
                    arg2 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg0.charAt(var10);
                if (var12 != ' ') {
                    if (arg4) {
                        this.method213(this.field696[var12], this.field699[var12] + arg3 + 1, this.field700[var12] + var9 + 1, this.field697[var12], this.field698[var12], 0);
                    }
                    this.method213(this.field696[var12], this.field699[var12] + arg3, this.field700[var12] + var9, this.field697[var12], this.field698[var12], arg2);
                }
                arg3 += this.field701[var12];
            }
        }
        if (this.field704) {
            Pix2D.method160((int) ((double) this.field702 * 0.7D) + var9, 5, var8, 8388608, arg3 - var8);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIILjava/lang/String;IBZ)V")
    public void method211(int arg0, int arg1, int arg2, String arg3, int arg4, byte arg5, boolean arg6) {
        if (arg3 == null) {
            return;
        }
        this.field703.setSeed((long) arg0);
        int var8 = (this.field703.nextInt() & 0x1F) + 192;
        if (arg5 != 8) {
            this.field688 = 44;
        }
        int var9 = arg2 - this.field702;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                int var11 = this.method212(arg3.substring(var10 + 1, var10 + 4), true);
                if (var11 != -1) {
                    arg1 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg3.charAt(var10);
                if (var12 != ' ') {
                    if (arg6) {
                        this.method215(this.field697[var12], this.field699[var12] + arg4 + 1, 192, 0, this.field700[var12] + var9 + 1, this.field698[var12], this.field696[var12], (byte) 6);
                    }
                    this.method215(this.field697[var12], this.field699[var12] + arg4, var8, arg1, this.field700[var12] + var9, this.field698[var12], this.field696[var12], (byte) 6);
                }
                arg4 += this.field701[var12];
                if ((this.field703.nextInt() & 0x3) == 0) {
                    arg4++;
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method212(String arg0, boolean arg1) {
        if (!arg1) {
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
                this.field704 = true;
            }
            if (arg0.equals("end")) {
                this.field704 = false;
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

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIIII[BB)V")
    private void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, byte arg7) {
        int var9 = Pix2D.field622 * arg4 + arg1;
        int var10 = Pix2D.field622 - arg0;
        int var11 = 0;
        int var12 = 0;
        if (arg4 < Pix2D.field624) {
            int var13 = Pix2D.field624 - arg4;
            arg5 -= var13;
            arg4 = Pix2D.field624;
            var12 += arg0 * var13;
            var9 += Pix2D.field622 * var13;
        }
        if (arg4 + arg5 >= Pix2D.field625) {
            arg5 -= arg4 + arg5 + 1 - Pix2D.field625;
        }
        if (arg1 < Pix2D.field626) {
            int var14 = Pix2D.field626 - arg1;
            arg0 -= var14;
            arg1 = Pix2D.field626;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg0 + arg1 >= Pix2D.field627) {
            int var15 = arg0 + arg1 + 1 - Pix2D.field627;
            arg0 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg0 > 0 && arg5 > 0) {
            this.method216(var11, Pix2D.field621, -487, arg2, arg5, arg0, var9, arg3, var10, arg6, var12);
            if (arg7 == 6) {
                boolean var16 = false;
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I[IIIIIIII[BI)V")
    private void method216(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        int var12 = ((arg7 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg3 & 0xFF0000) >> 8;
        while (arg2 >= 0) {
            this.field695 = -271;
        }
        int var13 = 256 - arg3;
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = -arg5; var15 < 0; var15++) {
                if (arg9[arg10++] == 0) {
                    arg6++;
                } else {
                    int var16 = arg1[arg6];
                    arg1[arg6++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg6 += arg8;
            arg10 += arg0;
        }
    }
}
