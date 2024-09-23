import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "kb", name = "z", descriptor = "Z")
    private boolean field700 = true;

    @OriginalMember(owner = "kb", name = "A", descriptor = "I")
    private int field701 = 315;

    @OriginalMember(owner = "kb", name = "B", descriptor = "B")
    private byte field702 = -59;

    @OriginalMember(owner = "kb", name = "C", descriptor = "I")
    private int field703 = 1742;

    @OriginalMember(owner = "kb", name = "D", descriptor = "I")
    private int field704 = 1;

    @OriginalMember(owner = "kb", name = "E", descriptor = "[[B")
    public byte[][] field705 = new byte[256][];

    @OriginalMember(owner = "kb", name = "F", descriptor = "[I")
    public int[] field706 = new int[256];

    @OriginalMember(owner = "kb", name = "G", descriptor = "[I")
    public int[] field707 = new int[256];

    @OriginalMember(owner = "kb", name = "H", descriptor = "[I")
    public int[] field708 = new int[256];

    @OriginalMember(owner = "kb", name = "I", descriptor = "[I")
    public int[] field709 = new int[256];

    @OriginalMember(owner = "kb", name = "J", descriptor = "[I")
    public int[] field710 = new int[256];

    @OriginalMember(owner = "kb", name = "L", descriptor = "Ljava/util/Random;")
    public Random field712 = new Random();

    @OriginalMember(owner = "kb", name = "M", descriptor = "Z")
    public boolean field713 = false;

    @OriginalMember(owner = "kb", name = "K", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(ZZLjava/lang/String;Lxb;)V")
    public PixFont(boolean arg0, boolean arg1, String arg2, Jagfile arg3) {
        Packet var5 = new Packet(-49365, arg3.method299(arg2 + ".dat", null));
        if (arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        Packet var7 = new Packet(-49365, arg3.method299("index.dat", null));
        boolean var8 = true;
        var7.field722 = var5.method231() + 4;
        int var9 = var7.method229();
        if (var9 > 0) {
            var7.field722 += (var9 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field708[var10] = var7.method229();
            this.field709[var10] = var7.method229();
            int var12 = this.field706[var10] = var7.method231();
            int var13 = this.field707[var10] = var7.method231();
            int var14 = var7.method229();
            int var15 = var12 * var13;
            this.field705[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field705[var10][var16] = var5.method230();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field705[var10][var12 * var18 + var17] = var5.method230();
                    }
                }
            }
            if (var13 > this.field711 && var10 < 128) {
                this.field711 = var13;
            }
            this.field708[var10] = 1;
            this.field710[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field705[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field710[var10]--;
                this.field708[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field705[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field710[var10]--;
            }
        }
        if (arg0) {
            this.field710[32] = this.field710[73];
        } else {
            this.field710[32] = this.field710[105];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIILjava/lang/String;B)V")
    public void method201(int arg0, int arg1, int arg2, String arg3, byte arg4) {
        if (arg4 == 9) {
            boolean var6 = false;
            this.method206(arg2, arg3, arg1, -56, arg0 - this.method205(arg3, (byte) -73));
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
    public void method202(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            this.method206(arg4, arg0, arg2, -56, arg3 - this.method205(arg0, (byte) -73) / 2);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IBILjava/lang/String;IZ)V")
    public void method203(int arg0, byte arg1, int arg2, String arg3, int arg4, boolean arg5) {
        this.method210(arg3, (byte) 5, arg4, arg0, arg5, arg2 - this.method204(arg3, (byte) 86) / 2);
        if (arg1 == 4) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method204(String arg0, byte arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 != 86) {
            return this.field704;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field710[arg0.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(Ljava/lang/String;B)I")
    public int method205(String arg0, byte arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 != -73) {
            this.field700 = !this.field700;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3 += this.field710[arg0.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method206(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg0 - this.field711;
        while (arg3 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method213(this.field705[var8], this.field708[var8] + arg4, this.field709[var8] + var6, this.field706[var8], this.field707[var8], arg2);
            }
            arg4 += this.field710[var8];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
    public void method207(String arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.method205(arg0, (byte) -73) / 2;
        int var8 = arg1 - this.field711;
        if (arg4) {
            this.field700 = !this.field700;
        }
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method213(this.field705[var10], this.field708[var10] + var7, this.field709[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field706[var10], this.field707[var10], arg5);
            }
            var7 += this.field710[var10];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method208(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg5 - this.method205(arg1, (byte) -73) / 2;
        int var8 = arg4 - this.field711;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method213(this.field705[var10], this.field708[var10] + var7 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field709[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field706[var10], this.field707[var10], arg2);
            }
            var7 += this.field710[var10];
        }
        if (arg0 == 39024) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IZILjava/lang/String;III)V")
    public void method209(int arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg1) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg3 == null) {
            return;
        }
        double var9 = 7.0D - (double) arg6 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg2 - this.method205(arg3, (byte) -73) / 2;
        int var12 = arg4 - this.field711;
        for (int var13 = 0; var13 < arg3.length(); var13++) {
            char var14 = arg3.charAt(var13);
            if (var14 != ' ') {
                this.method213(this.field705[var14], this.field708[var14] + var11, this.field709[var14] + var12 + (int) (Math.sin((double) var13 / 1.5D + (double) arg5) * var9), this.field706[var14], this.field707[var14], arg0);
            }
            var11 += this.field710[var14];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;BIIZI)V")
    public void method210(String arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.field713 = false;
        int var7 = arg5;
        if (arg0 == null) {
            return;
        }
        int var8 = arg3 - this.field711;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
                int var10 = this.method212(arg0.substring(var9 + 1, var9 + 4), (byte) -59);
                if (var10 != -1) {
                    arg2 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg0.charAt(var9);
                if (var11 != ' ') {
                    if (arg4) {
                        this.method213(this.field705[var11], this.field708[var11] + arg5 + 1, this.field709[var11] + var8 + 1, this.field706[var11], this.field707[var11], 0);
                    }
                    this.method213(this.field705[var11], this.field708[var11] + arg5, this.field709[var11] + var8, this.field706[var11], this.field707[var11], arg2);
                }
                arg5 += this.field710[var11];
            }
        }
        if (arg1 != 5) {
            this.field700 = !this.field700;
        }
        if (this.field713) {
            Pix2D.method160(arg5 - var7, 8388608, -380, (int) ((double) this.field711 * 0.7D) + var8, var7);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IBIZII)V")
    public void method211(String arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.field712.setSeed((long) arg1);
        int var8 = (this.field712.nextInt() & 0x1F) + 192;
        int var9 = arg3 - this.field711;
        if (arg2 != 5) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            if (arg0.charAt(var11) == '@' && var11 + 4 < arg0.length() && arg0.charAt(var11 + 4) == '@') {
                int var12 = this.method212(arg0.substring(var11 + 1, var11 + 4), (byte) -59);
                if (var12 != -1) {
                    arg5 = var12;
                }
                var11 += 4;
            } else {
                char var13 = arg0.charAt(var11);
                if (var13 != ' ') {
                    if (arg4) {
                        this.method215(this.field707[var13], 192, this.field709[var13] + var9 + 1, this.field706[var13], this.field705[var13], this.field708[var13] + arg6 + 1, 1742, 0);
                    }
                    this.method215(this.field707[var13], var8, this.field709[var13] + var9, this.field706[var13], this.field705[var13], this.field708[var13] + arg6, 1742, arg5);
                }
                arg6 += this.field710[var13];
                if ((this.field712.nextInt() & 0x3) == 0) {
                    arg6++;
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(Ljava/lang/String;B)I")
    public int method212(String arg0, byte arg1) {
        if (this.field702 != arg1) {
            this.field701 = -255;
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
                this.field713 = true;
            }
            if (arg0.equals("end")) {
                this.field713 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIII)V")
    private void method213(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field640 * arg2 + arg1;
        int var8 = Pix2D.field640 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field642) {
            int var11 = Pix2D.field642 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field642;
            var10 += arg3 * var11;
            var7 += Pix2D.field640 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field643) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field643;
        }
        if (arg1 < Pix2D.field644) {
            int var12 = Pix2D.field644 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field644;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field645) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field645;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method214(Pix2D.field639, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
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

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIII[BIII)V")
    private void method215(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        int var9 = Pix2D.field640 * arg2 + arg5;
        int var10 = Pix2D.field640 - arg3;
        int var11 = 0;
        int var12 = 0;
        if (arg2 < Pix2D.field642) {
            int var13 = Pix2D.field642 - arg2;
            arg0 -= var13;
            arg2 = Pix2D.field642;
            var12 += arg3 * var13;
            var9 += Pix2D.field640 * var13;
        }
        if (arg0 + arg2 >= Pix2D.field643) {
            arg0 -= arg0 + arg2 + 1 - Pix2D.field643;
        }
        if (arg5 < Pix2D.field644) {
            int var14 = Pix2D.field644 - arg5;
            arg3 -= var14;
            arg5 = Pix2D.field644;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg3 + arg5 >= Pix2D.field645) {
            int var15 = arg3 + arg5 + 1 - Pix2D.field645;
            arg3 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg3 > 0 && arg0 > 0) {
            this.method216(Pix2D.field639, var11, var9, var12, arg1, arg0, -45169, arg3, arg4, arg7, var10);
            if (this.field703 == arg6) {
                ;
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([IIIIIIII[BII)V")
    private void method216(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        if (arg6 != -45169) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = ((arg9 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg4 & 0xFF0000) >> 8;
        int var14 = 256 - arg4;
        for (int var15 = -arg5; var15 < 0; var15++) {
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg8[arg3++] == 0) {
                    arg2++;
                } else {
                    int var17 = arg0[arg2];
                    arg0[arg2++] = (((var17 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var17 & 0xFF00) * var14 & 0xFF0000) >> 8) + var13;
                }
            }
            arg2 += arg10;
            arg3 += arg1;
        }
    }
}
