import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "kb", name = "x", descriptor = "Z")
    private boolean field689 = false;

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private int field690 = -836;

    @OriginalMember(owner = "kb", name = "z", descriptor = "I")
    private int field691 = -6835;

    @OriginalMember(owner = "kb", name = "A", descriptor = "[[B")
    public byte[][] field692 = new byte[256][];

    @OriginalMember(owner = "kb", name = "B", descriptor = "[I")
    public int[] field693 = new int[256];

    @OriginalMember(owner = "kb", name = "C", descriptor = "[I")
    public int[] field694 = new int[256];

    @OriginalMember(owner = "kb", name = "D", descriptor = "[I")
    public int[] field695 = new int[256];

    @OriginalMember(owner = "kb", name = "E", descriptor = "[I")
    public int[] field696 = new int[256];

    @OriginalMember(owner = "kb", name = "F", descriptor = "[I")
    public int[] field697 = new int[256];

    @OriginalMember(owner = "kb", name = "H", descriptor = "Ljava/util/Random;")
    public Random field699 = new Random();

    @OriginalMember(owner = "kb", name = "I", descriptor = "Z")
    public boolean field700 = false;

    @OriginalMember(owner = "kb", name = "G", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(ZLjava/lang/String;Lxb;I)V")
    public PixFont(boolean arg0, String arg1, Jagfile arg2, int arg3) {
        Packet var5 = new Packet(arg2.method299(arg1 + ".dat", null), this.field689);
        Packet var6 = new Packet(arg2.method299("index.dat", null), this.field689);
        boolean var7 = true;
        if (arg3 < 4 || arg3 > 4) {
            throw new NullPointerException();
        }
        var6.field712 = var5.method231() + 4;
        int var8 = var6.method229();
        if (var8 > 0) {
            var6.field712 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field695[var9] = var6.method229();
            this.field696[var9] = var6.method229();
            int var11 = this.field693[var9] = var6.method231();
            int var12 = this.field694[var9] = var6.method231();
            int var13 = var6.method229();
            int var14 = var11 * var12;
            this.field692[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field692[var9][var15] = var5.method230();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field692[var9][var11 * var17 + var16] = var5.method230();
                    }
                }
            }
            if (var12 > this.field698 && var9 < 128) {
                this.field698 = var12;
            }
            this.field695[var9] = 1;
            this.field697[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field692[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field697[var9]--;
                this.field695[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field692[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field697[var9]--;
            }
        }
        if (arg0) {
            this.field697[32] = this.field697[73];
        } else {
            this.field697[32] = this.field697[105];
            if (Linkable.field368) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method201(int arg0, int arg1, int arg2, int arg3, String arg4) {
        if (arg3 > 0) {
            this.method206(arg0, arg1, arg2 - this.method205((byte) 7, arg4), arg4, 3);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method202(int arg0, int arg1, int arg2, String arg3, int arg4) {
        this.method206(arg4, arg2, arg0 - this.method205((byte) 7, arg3) / 2, arg3, 3);
        if (arg1 != -33071) {
            this.field689 = !this.field689;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IZILjava/lang/String;II)V")
    public void method203(int arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5) {
        this.method210(arg2, arg0 - this.method204(arg3, 0) / 2, arg1, arg4, arg3, 1);
        if (arg5 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method204(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 != 0) {
            this.field691 = -65;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field697[arg0.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method205(byte arg0, String arg1) {
        if (arg0 != 7) {
            return this.field690;
        } else if (arg1 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg1.length(); var4++) {
                var3 += this.field697[arg1.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(IIILjava/lang/String;I)V")
    public void method206(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg3 == null) {
            return;
        }
        int var6 = arg0 - this.field698;
        if (arg4 != 3) {
            return;
        }
        for (int var7 = 0; var7 < arg3.length(); var7++) {
            char var8 = arg3.charAt(var7);
            if (var8 != ' ') {
                this.method213(this.field692[var8], this.field695[var8] + arg2, this.field696[var8] + var6, this.field693[var8], this.field694[var8], arg1);
            }
            arg2 += this.field697[var8];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
    public void method207(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg3 - this.method205((byte) 7, arg5) / 2;
        if (arg2 != 0) {
            return;
        }
        boolean var8 = false;
        int var9 = arg4 - this.field698;
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            char var11 = arg5.charAt(var10);
            if (var11 != ' ') {
                this.method213(this.field692[var11], this.field695[var11] + var7, this.field696[var11] + var9 + (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 2.0D) * 5.0D), this.field693[var11], this.field694[var11], arg1);
            }
            var7 += this.field697[var11];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;IZII)V")
    public void method208(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3 || arg1 == null) {
            return;
        }
        int var7 = arg2 - this.method205((byte) 7, arg1) / 2;
        int var8 = arg0 - this.field698;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method213(this.field692[var10], this.field695[var10] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field696[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field693[var10], this.field694[var10], arg5);
            }
            var7 += this.field697[var10];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public void method209(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg0 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg6 - this.method205((byte) 7, arg3) / 2;
        int var11 = arg5 - this.field698;
        if (arg2 != -32105) {
            this.field690 = 25;
        }
        for (int var12 = 0; var12 < arg3.length(); var12++) {
            char var13 = arg3.charAt(var12);
            if (var13 != ' ') {
                this.method213(this.field692[var13], this.field695[var13] + var10, this.field696[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg1) * var8), this.field693[var13], this.field694[var13], arg4);
            }
            var10 += this.field697[var13];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIZILjava/lang/String;I)V")
    public void method210(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5) {
        this.field700 = false;
        int var7 = arg1;
        if (arg4 == null) {
            return;
        }
        int var8 = arg3 - this.field698;
        if (arg5 != 1) {
            return;
        }
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            if (arg4.charAt(var9) == '@' && var9 + 4 < arg4.length() && arg4.charAt(var9 + 4) == '@') {
                int var10 = this.method212(arg4.substring(var9 + 1, var9 + 4), 381);
                if (var10 != -1) {
                    arg0 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg4.charAt(var9);
                if (var11 != ' ') {
                    if (arg2) {
                        this.method213(this.field692[var11], this.field695[var11] + arg1 + 1, this.field696[var11] + var8 + 1, this.field693[var11], this.field694[var11], 0);
                    }
                    this.method213(this.field692[var11], this.field695[var11] + arg1, this.field696[var11] + var8, this.field693[var11], this.field694[var11], arg0);
                }
                arg1 += this.field697[var11];
            }
        }
        if (this.field700) {
            Pix2D.method160(var7, 8388608, (int) ((double) this.field698 * 0.7D) + var8, arg1 - var7, 1);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIILjava/lang/String;IIZ)V")
    public void method211(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 != 9 || arg3 == null) {
            return;
        }
        this.field699.setSeed((long) arg4);
        int var8 = (this.field699.nextInt() & 0x1F) + 192;
        int var9 = arg5 - this.field698;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                int var11 = this.method212(arg3.substring(var10 + 1, var10 + 4), 381);
                if (var11 != -1) {
                    arg2 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg3.charAt(var10);
                if (var12 != ' ') {
                    if (arg6) {
                        this.method215(this.field695[var12] + arg1 + 1, this.field696[var12] + var9 + 1, this.field693[var12], 216, this.field694[var12], this.field692[var12], 192, 0);
                    }
                    this.method215(this.field695[var12] + arg1, this.field696[var12] + var9, this.field693[var12], 216, this.field694[var12], this.field692[var12], var8, arg2);
                }
                arg1 += this.field697[var12];
                if ((this.field699.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method212(String arg0, int arg1) {
        if (arg1 <= 0) {
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
                this.field700 = true;
            }
            if (arg0.equals("end")) {
                this.field700 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIII)V")
    private void method213(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field628 * arg2 + arg1;
        int var8 = Pix2D.field628 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field630) {
            int var11 = Pix2D.field630 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field630;
            var10 += arg3 * var11;
            var7 += Pix2D.field628 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field631) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field631;
        }
        if (arg1 < Pix2D.field632) {
            int var12 = Pix2D.field632 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field632;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field633) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field633;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method214(Pix2D.field627, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
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

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIII[BII)V")
    private void method215(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7) {
        int var9 = Pix2D.field628 * arg1 + arg0;
        int var10 = Pix2D.field628 - arg2;
        int var11 = 0;
        int var12 = 0;
        if (arg1 < Pix2D.field630) {
            int var13 = Pix2D.field630 - arg1;
            arg4 -= var13;
            arg1 = Pix2D.field630;
            var12 += arg2 * var13;
            var9 += Pix2D.field628 * var13;
        }
        if (arg1 + arg4 >= Pix2D.field631) {
            arg4 -= arg1 + arg4 + 1 - Pix2D.field631;
        }
        if (arg0 < Pix2D.field632) {
            int var14 = Pix2D.field632 - arg0;
            arg2 -= var14;
            arg0 = Pix2D.field632;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg0 + arg2 >= Pix2D.field633) {
            int var15 = arg0 + arg2 + 1 - Pix2D.field633;
            arg2 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg2 <= 0 || arg4 <= 0) {
            return;
        }
        this.method216(arg5, arg6, 0, var12, arg2, var11, var9, Pix2D.field627, var10, arg7, arg4);
        if (arg3 <= 0) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIIII[IIII)V")
    private void method216(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg2 != 0) {
            return;
        }
        int var12 = ((arg9 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg1 & 0xFF0000) >> 8;
        int var13 = 256 - arg1;
        for (int var14 = -arg10; var14 < 0; var14++) {
            for (int var15 = -arg4; var15 < 0; var15++) {
                if (arg0[arg3++] == 0) {
                    arg6++;
                } else {
                    int var16 = arg7[arg6];
                    arg7[arg6++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg6 += arg8;
            arg3 += arg5;
        }
    }
}
