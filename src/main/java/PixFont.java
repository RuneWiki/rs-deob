import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "lb", name = "w", descriptor = "I")
    private int field708 = 7;

    @OriginalMember(owner = "lb", name = "x", descriptor = "B")
    private byte field709 = 2;

    @OriginalMember(owner = "lb", name = "z", descriptor = "I")
    private int field711 = 6;

    @OriginalMember(owner = "lb", name = "A", descriptor = "[[B")
    public byte[][] field712 = new byte[94][];

    @OriginalMember(owner = "lb", name = "B", descriptor = "[I")
    public int[] field713 = new int[94];

    @OriginalMember(owner = "lb", name = "C", descriptor = "[I")
    public int[] field714 = new int[94];

    @OriginalMember(owner = "lb", name = "D", descriptor = "[I")
    public int[] field715 = new int[94];

    @OriginalMember(owner = "lb", name = "E", descriptor = "[I")
    public int[] field716 = new int[94];

    @OriginalMember(owner = "lb", name = "F", descriptor = "[I")
    public int[] field717 = new int[95];

    @OriginalMember(owner = "lb", name = "G", descriptor = "[I")
    public int[] field718 = new int[256];

    @OriginalMember(owner = "lb", name = "I", descriptor = "Ljava/util/Random;")
    public Random field720 = new Random();

    @OriginalMember(owner = "lb", name = "J", descriptor = "Z")
    public boolean field721 = false;

    @OriginalMember(owner = "lb", name = "H", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "lb", name = "K", descriptor = "[I")
    public static int[] field722 = new int[256];

    @OriginalMember(owner = "lb", name = "y", descriptor = "I")
    private int field710;

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(Lyb;ILjava/lang/String;)V")
    public PixFont(Jagfile arg0, int arg1, String arg2) {
        Packet var4 = new Packet(45427, arg0.method309(arg2 + ".dat", null));
        Packet var5 = new Packet(45427, arg0.method309("index.dat", null));
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        boolean var6 = true;
        var5.field736 = var4.method241() + 4;
        int var7 = var5.method239();
        if (var7 > 0) {
            var5.field736 += (var7 - 1) * 3;
        }
        for (int var8 = 0; var8 < 94; var8++) {
            this.field715[var8] = var5.method239();
            this.field716[var8] = var5.method239();
            int var11 = this.field713[var8] = var5.method241();
            int var12 = this.field714[var8] = var5.method241();
            int var13 = var5.method239();
            int var14 = var11 * var12;
            this.field712[var8] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field712[var8][var15] = var4.method240();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field712[var8][var11 * var17 + var16] = var4.method240();
                    }
                }
            }
            if (var12 > this.field719) {
                this.field719 = var12;
            }
            this.field715[var8] = 1;
            this.field717[var8] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field712[var8][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field717[var8]--;
                this.field715[var8] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field712[var8][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field717[var8]--;
            }
        }
        this.field717[94] = this.field717[8];
        for (int var9 = 0; var9 < 256; var9++) {
            this.field718[var9] = this.field717[field722[var9]];
        }
        if (Linkable.field393) {
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method214(int arg0, String arg1, int arg2, int arg3, int arg4) {
        int var6 = 55 / arg2;
        this.method217(arg4 - this.method216((byte) 7, arg1) / 2, arg1, arg3, arg0, 0);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIZILjava/lang/String;I)V")
    public void method215(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5) {
        if (arg5 != 1) {
            this.field711 = -145;
        }
        this.method219(arg4, arg3, arg0 - this.method216((byte) 7, arg4) / 2, arg1, 2, arg2);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method216(byte arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0 == 7) {
            boolean var4 = false;
        } else {
            this.field708 = 232;
        }
        for (int var5 = 0; var5 < arg1.length(); var5++) {
            if (arg1.charAt(var5) == '@' && var5 + 4 < arg1.length() && arg1.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var3 += this.field718[arg1.charAt(var5)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(ILjava/lang/String;III)V")
    public void method217(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg1 == null) {
            return;
        }
        int var7 = arg2 - this.field719;
        for (int var8 = 0; var8 < arg1.length(); var8++) {
            int var9 = field722[arg1.charAt(var8)];
            if (var9 != 94) {
                this.method222(this.field712[var9], this.field715[var9] + arg0, this.field716[var9] + var7, this.field713[var9], this.field714[var9], arg3);
            }
            arg0 += this.field717[var9];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
    public void method218(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg0 - this.method216((byte) 7, arg5) / 2;
        int var8 = arg1 - this.field719;
        if (arg2 != -75) {
            return;
        }
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            int var10 = field722[arg5.charAt(var9)];
            if (var10 != 94) {
                this.method222(this.field712[var10], this.field715[var10] + var7, this.field716[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field713[var10], this.field714[var10], arg3);
            }
            var7 += this.field717[var10];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;IIIIZ)V")
    public void method219(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field721 = false;
        int var7 = arg2;
        if (arg4 != 2 || arg0 == null) {
            return;
        }
        int var8 = arg1 - this.field719;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
                int var10 = this.method221((byte) 0, arg0.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = field722[arg0.charAt(var9)];
                if (var11 != 94) {
                    if (arg5) {
                        this.method222(this.field712[var11], this.field715[var11] + arg2 + 1, this.field716[var11] + var8 + 1, this.field713[var11], this.field714[var11], 0);
                    }
                    this.method222(this.field712[var11], this.field715[var11] + arg2, this.field716[var11] + var8, this.field713[var11], this.field714[var11], arg3);
                }
                arg2 += this.field717[var11];
            }
        }
        if (this.field721) {
            Pix2D.method173(this.field709, 8388608, var7, arg2 - var7, (int) ((double) this.field719 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZIIIBILjava/lang/String;)V")
    public void method220(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, String arg6) {
        if (arg6 == null) {
            return;
        }
        this.field720.setSeed((long) arg5);
        int var8 = (this.field720.nextInt() & 0x1F) + 192;
        int var9 = arg2 - this.field719;
        for (int var10 = 0; var10 < arg6.length(); var10++) {
            if (arg6.charAt(var10) == '@' && var10 + 4 < arg6.length() && arg6.charAt(var10 + 4) == '@') {
                int var11 = this.method221((byte) 0, arg6.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg3 = var11;
                }
                var10 += 4;
            } else {
                int var12 = field722[arg6.charAt(var10)];
                if (var12 != 94) {
                    if (arg0) {
                        this.method224(this.field712[var12], 0, this.field713[var12], this.field716[var12] + var9 + 1, this.field714[var12], true, 192, this.field715[var12] + arg1 + 1);
                    }
                    this.method224(this.field712[var12], arg3, this.field713[var12], this.field716[var12] + var9, this.field714[var12], true, var8, this.field715[var12] + arg1);
                }
                arg1 += this.field717[var12];
                if ((this.field720.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
        if (arg4 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(BLjava/lang/String;)I")
    public int method221(byte arg0, String arg1) {
        if (arg0 == 0) {
            boolean var3 = false;
        } else {
            this.field711 = 38;
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
                this.field721 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([BIIIII)V")
    private void method222(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field645 * arg2 + arg1;
        int var8 = Pix2D.field645 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field647) {
            int var11 = Pix2D.field647 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field647;
            var10 += arg3 * var11;
            var7 += Pix2D.field645 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field648) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field648;
        }
        if (arg1 < Pix2D.field649) {
            int var12 = Pix2D.field649 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field649;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field650) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field650;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method223(Pix2D.field644, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method223(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "lb", name = "a", descriptor = "([BIIIIZII)V")
    private void method224(byte[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int var9 = Pix2D.field645 * arg3 + arg7;
        int var10 = Pix2D.field645 - arg2;
        int var11 = 0;
        int var12 = 0;
        if (arg3 < Pix2D.field647) {
            int var13 = Pix2D.field647 - arg3;
            arg4 -= var13;
            arg3 = Pix2D.field647;
            var12 += arg2 * var13;
            var9 += Pix2D.field645 * var13;
        }
        if (arg3 + arg4 >= Pix2D.field648) {
            arg4 -= arg3 + arg4 + 1 - Pix2D.field648;
        }
        if (arg7 < Pix2D.field649) {
            int var14 = Pix2D.field649 - arg7;
            arg2 -= var14;
            arg7 = Pix2D.field649;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg2 + arg7 >= Pix2D.field650) {
            int var15 = arg2 + arg7 + 1 - Pix2D.field650;
            arg2 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg2 > 0 && arg4 > 0) {
            this.method225(Pix2D.field644, arg4, var9, arg0, arg6, this.field710, var10, arg2, arg1, var12, var11);
            if (!arg5) {
                this.field710 = 270;
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([III[BIIIIIII)V")
    private void method225(int[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg8 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg4 & 0xFF0000) >> 8;
        if (arg5 != 0) {
            this.field711 = -425;
        }
        int var13 = 256 - arg4;
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = -arg7; var15 < 0; var15++) {
                if (arg3[arg9++] == 0) {
                    arg2++;
                } else {
                    int var16 = arg0[arg2];
                    arg0[arg2++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg2 += arg6;
            arg9 += arg10;
        }
    }

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }
            field722[var1] = var2;
        }
    }
}
