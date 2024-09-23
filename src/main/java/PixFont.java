import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "kb", name = "v", descriptor = "I")
    private int field684 = 5706;

    @OriginalMember(owner = "kb", name = "w", descriptor = "Z")
    private boolean field685 = false;

    @OriginalMember(owner = "kb", name = "x", descriptor = "I")
    private int field686 = 8;

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private int field687 = -714;

    @OriginalMember(owner = "kb", name = "z", descriptor = "B")
    private byte field688 = 7;

    @OriginalMember(owner = "kb", name = "A", descriptor = "B")
    private byte field689 = 7;

    @OriginalMember(owner = "kb", name = "C", descriptor = "Z")
    private boolean field691 = true;

    @OriginalMember(owner = "kb", name = "D", descriptor = "[[B")
    public byte[][] field692 = new byte[256][];

    @OriginalMember(owner = "kb", name = "E", descriptor = "[I")
    public int[] field693 = new int[256];

    @OriginalMember(owner = "kb", name = "F", descriptor = "[I")
    public int[] field694 = new int[256];

    @OriginalMember(owner = "kb", name = "G", descriptor = "[I")
    public int[] field695 = new int[256];

    @OriginalMember(owner = "kb", name = "H", descriptor = "[I")
    public int[] field696 = new int[256];

    @OriginalMember(owner = "kb", name = "I", descriptor = "[I")
    public int[] field697 = new int[256];

    @OriginalMember(owner = "kb", name = "K", descriptor = "Ljava/util/Random;")
    public Random field699 = new Random();

    @OriginalMember(owner = "kb", name = "L", descriptor = "Z")
    public boolean field700 = false;

    @OriginalMember(owner = "kb", name = "J", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "kb", name = "B", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lxb;ZLjava/lang/String;I)V")
    public PixFont(Jagfile arg0, boolean arg1, String arg2, int arg3) {
        Packet var5 = new Packet(arg0.method299(arg2 + ".dat", null), 58);
        Packet var6 = new Packet(arg0.method299("index.dat", null), 58);
        boolean var7 = true;
        var6.field711 = var5.method231() + 4;
        int var8 = var6.method229();
        if (var8 > 0) {
            var6.field711 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field695[var9] = var6.method229();
            this.field696[var9] = var6.method229();
            int var12 = this.field693[var9] = var6.method231();
            int var13 = this.field694[var9] = var6.method231();
            int var14 = var6.method229();
            int var15 = var12 * var13;
            this.field692[var9] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field692[var9][var16] = var5.method230();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field692[var9][var12 * var18 + var17] = var5.method230();
                    }
                }
            }
            if (var13 > this.field698 && var9 < 128) {
                this.field698 = var13;
            }
            this.field695[var9] = 1;
            this.field697[var9] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field692[var9][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field697[var9]--;
                this.field695[var9] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field692[var9][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field697[var9]--;
            }
        }
        if (arg3 != 0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        if (arg1) {
            this.field697[32] = this.field697[73];
        } else {
            this.field697[32] = this.field697[105];
            if (Linkable.field364) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method201(int arg0, int arg1, int arg2, String arg3, int arg4) {
        this.method206(arg3, 1, arg2, arg0, arg1 - this.method205((byte) -47, arg3));
        int var6 = 62 / arg4;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method202(String arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method206(arg0, 1, arg3, arg2, arg4 - this.method205((byte) -47, arg0) / 2);
        if (this.field686 != arg1) {
            this.field685 = !this.field685;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IILjava/lang/String;BIZ)V")
    public void method203(int arg0, int arg1, String arg2, byte arg3, int arg4, boolean arg5) {
        this.method210(arg0 - this.method204((byte) 5, arg2) / 2, arg1, arg2, arg5, (byte) -108, arg4);
        if (arg3 != 114) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
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
                var3 += this.field697[arg1.charAt(var4)];
            }
        }
        if (arg0 == 5) {
            boolean var5 = false;
            return var3;
        } else {
            return this.field684;
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(BLjava/lang/String;)I")
    public int method205(byte arg0, String arg1) {
        if (arg0 != -47) {
            this.field690 = 85;
        }
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            var3 += this.field697[arg1.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
    public void method206(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg3 - this.field698;
        if (arg1 < 1 || arg1 > 1) {
            return;
        }
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            char var8 = arg0.charAt(var7);
            if (var8 != ' ') {
                this.method213(this.field692[var8], this.field695[var8] + arg4, this.field696[var8] + var6, this.field693[var8], this.field694[var8], arg2);
            }
            arg4 += this.field697[var8];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIIIB)V")
    public void method207(String arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.method205((byte) -47, arg0) / 2;
        int var8 = arg4 - this.field698;
        if (arg5 == 0) {
            boolean var9 = false;
        } else {
            this.field684 = 379;
        }
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            char var11 = arg0.charAt(var10);
            if (var11 != ' ') {
                this.method213(this.field692[var11], this.field695[var11] + var7, this.field696[var11] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D), this.field693[var11], this.field694[var11], arg1);
            }
            var7 += this.field697[var11];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;IZII)V")
    public void method208(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg5 - this.method205((byte) -47, arg1) / 2;
        int var8 = arg4 - this.field698;
        if (arg3) {
            return;
        }
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method213(this.field692[var10], this.field695[var10] + var7 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field696[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field693[var10], this.field694[var10], arg2);
            }
            var7 += this.field697[var10];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public void method209(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg2 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg1 - this.method205((byte) -47, arg5) / 2;
        int var11 = arg0 - this.field698;
        for (int var12 = 0; var12 < arg5.length(); var12++) {
            char var13 = arg5.charAt(var12);
            if (var13 != ' ') {
                this.method213(this.field692[var13], this.field695[var13] + var10, this.field696[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg6) * var8), this.field693[var13], this.field694[var13], arg4);
            }
            var10 += this.field697[var13];
        }
        if (arg3 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IILjava/lang/String;ZBI)V")
    public void method210(int arg0, int arg1, String arg2, boolean arg3, byte arg4, int arg5) {
        if (arg4 != -108) {
            return;
        }
        this.field700 = false;
        int var7 = arg0;
        if (arg2 == null) {
            return;
        }
        int var8 = arg5 - this.field698;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            if (arg2.charAt(var9) == '@' && var9 + 4 < arg2.length() && arg2.charAt(var9 + 4) == '@') {
                int var10 = this.method212(this.field688, arg2.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg1 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg2.charAt(var9);
                if (var11 != ' ') {
                    if (arg3) {
                        this.method213(this.field692[var11], this.field695[var11] + arg0 + 1, this.field696[var11] + var8 + 1, this.field693[var11], this.field694[var11], 0);
                    }
                    this.method213(this.field692[var11], this.field695[var11] + arg0, this.field696[var11] + var8, this.field693[var11], this.field694[var11], arg1);
                }
                arg0 += this.field697[var11];
            }
        }
        if (this.field700) {
            Pix2D.method160(8388608, arg0 - var7, false, var7, (int) ((double) this.field698 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZIILjava/lang/String;IZI)V")
    public void method211(boolean arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        this.field699.setSeed((long) arg4);
        if (!arg0) {
            return;
        }
        int var8 = (this.field699.nextInt() & 0x1F) + 192;
        int var9 = arg1 - this.field698;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                int var11 = this.method212(this.field688, arg3.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg2 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg3.charAt(var10);
                if (var12 != ' ') {
                    if (arg5) {
                        this.method215(192, this.field694[var12], 0, this.field696[var12] + var9 + 1, (byte) 0, this.field692[var12], this.field695[var12] + arg6 + 1, this.field693[var12]);
                    }
                    this.method215(var8, this.field694[var12], arg2, this.field696[var12] + var9, (byte) 0, this.field692[var12], this.field695[var12] + arg6, this.field693[var12]);
                }
                arg6 += this.field697[var12];
                if ((this.field699.nextInt() & 0x3) == 0) {
                    arg6++;
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(BLjava/lang/String;)I")
    public int method212(byte arg0, String arg1) {
        if (this.field689 != arg0) {
            return this.field687;
        }
        boolean var3 = false;
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
                this.field700 = true;
            }
            if (arg1.equals("end")) {
                this.field700 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIII)V")
    private void method213(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field620 * arg2 + arg1;
        int var8 = Pix2D.field620 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field622) {
            int var11 = Pix2D.field622 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field622;
            var10 += arg3 * var11;
            var7 += Pix2D.field620 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field623) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field623;
        }
        if (arg1 < Pix2D.field624) {
            int var12 = Pix2D.field624 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field624;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field625) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field625;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method214(Pix2D.field619, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
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

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIIIB[BII)V")
    private void method215(int arg0, int arg1, int arg2, int arg3, byte arg4, byte[] arg5, int arg6, int arg7) {
        int var9 = Pix2D.field620 * arg3 + arg6;
        int var10 = Pix2D.field620 - arg7;
        int var11 = 0;
        int var12 = 0;
        if (arg4 == 0) {
            boolean var13 = false;
        } else {
            this.field691 = !this.field691;
        }
        if (arg3 < Pix2D.field622) {
            int var14 = Pix2D.field622 - arg3;
            arg1 -= var14;
            arg3 = Pix2D.field622;
            var12 += arg7 * var14;
            var9 += Pix2D.field620 * var14;
        }
        if (arg1 + arg3 >= Pix2D.field623) {
            arg1 -= arg1 + arg3 + 1 - Pix2D.field623;
        }
        if (arg6 < Pix2D.field624) {
            int var15 = Pix2D.field624 - arg6;
            arg7 -= var15;
            arg6 = Pix2D.field624;
            var12 += var15;
            var9 += var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 + arg7 >= Pix2D.field625) {
            int var16 = arg6 + arg7 + 1 - Pix2D.field625;
            arg7 -= var16;
            var11 += var16;
            var10 += var16;
        }
        if (arg7 > 0 && arg1 > 0) {
            this.method216(arg7, arg5, arg1, var11, Pix2D.field619, arg2, var12, arg0, true, var9, var10);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I[BII[IIIIZII)V")
    private void method216(int arg0, byte[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        int var12 = ((arg5 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg7 & 0xFF0000) >> 8;
        int var13 = 256 - arg7;
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = -arg0; var15 < 0; var15++) {
                if (arg1[arg6++] == 0) {
                    arg9++;
                } else {
                    int var16 = arg4[arg9];
                    arg4[arg9++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg9 += arg10;
            arg6 += arg3;
        }
        if (arg8) {
            ;
        }
    }
}
