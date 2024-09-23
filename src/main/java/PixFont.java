import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "lb", name = "z", descriptor = "I")
    private int field689 = 919;

    @OriginalMember(owner = "lb", name = "A", descriptor = "[[B")
    public byte[][] field690 = new byte[94][];

    @OriginalMember(owner = "lb", name = "B", descriptor = "[I")
    public int[] field691 = new int[94];

    @OriginalMember(owner = "lb", name = "C", descriptor = "[I")
    public int[] field692 = new int[94];

    @OriginalMember(owner = "lb", name = "D", descriptor = "[I")
    public int[] field693 = new int[94];

    @OriginalMember(owner = "lb", name = "E", descriptor = "[I")
    public int[] field694 = new int[94];

    @OriginalMember(owner = "lb", name = "F", descriptor = "[I")
    public int[] field695 = new int[95];

    @OriginalMember(owner = "lb", name = "G", descriptor = "[I")
    public int[] field696 = new int[256];

    @OriginalMember(owner = "lb", name = "I", descriptor = "Ljava/util/Random;")
    public Random field698 = new Random();

    @OriginalMember(owner = "lb", name = "J", descriptor = "Z")
    public boolean field699 = false;

    @OriginalMember(owner = "lb", name = "H", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "lb", name = "K", descriptor = "[I")
    public static int[] field700 = new int[256];

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(Ljava/lang/String;BLyb;)V")
    public PixFont(String arg0, byte arg1, Jagfile arg2) {
        Packet var4 = new Packet(arg2.method309(arg0 + ".dat", null), 337);
        Packet var5 = new Packet(arg2.method309("index.dat", null), 337);
        boolean var6 = true;
        var5.field710 = var4.method241() + 4;
        int var7 = var5.method239();
        if (var7 > 0) {
            var5.field710 += (var7 - 1) * 3;
        }
        for (int var8 = 0; var8 < 94; var8++) {
            this.field693[var8] = var5.method239();
            this.field694[var8] = var5.method239();
            int var11 = this.field691[var8] = var5.method241();
            int var12 = this.field692[var8] = var5.method241();
            int var13 = var5.method239();
            int var14 = var11 * var12;
            this.field690[var8] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field690[var8][var15] = var4.method240();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field690[var8][var11 * var17 + var16] = var4.method240();
                    }
                }
            }
            if (var12 > this.field697) {
                this.field697 = var12;
            }
            this.field693[var8] = 1;
            this.field695[var8] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field690[var8][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field695[var8]--;
                this.field693[var8] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field690[var8][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field695[var8]--;
            }
        }
        this.field695[94] = this.field695[8];
        if (arg1 != 7) {
            throw new NullPointerException();
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field696[var9] = this.field695[field700[var9]];
        }
        if (Linkable.field375) {
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method214(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -28519) {
            this.field689 = 392;
        }
        this.method217(arg2, arg3 - this.method216(-525, arg0) / 2, arg0, arg1, (byte) 3);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IBIZLjava/lang/String;I)V")
    public void method215(int arg0, byte arg1, int arg2, boolean arg3, String arg4, int arg5) {
        this.method219(arg4, arg0, arg2 - this.method216(-525, arg4) / 2, arg3, -44475, arg5);
        if (arg1 == 6) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method216(int arg0, String arg1) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg1 == null) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length(); var5++) {
            if (arg1.charAt(var5) == '@' && var5 + 4 < arg1.length() && arg1.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var4 += this.field696[arg1.charAt(var5)];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IILjava/lang/String;IB)V")
    public void method217(int arg0, int arg1, String arg2, int arg3, byte arg4) {
        if (arg2 == null) {
            return;
        }
        int var6 = arg0 - this.field697;
        if (arg4 != 3) {
            this.field689 = -25;
        }
        for (int var7 = 0; var7 < arg2.length(); var7++) {
            int var8 = field700[arg2.charAt(var7)];
            if (var8 != 94) {
                this.method222(this.field690[var8], this.field693[var8] + arg1, this.field694[var8] + var6, this.field691[var8], this.field692[var8], arg3);
            }
            arg1 += this.field695[var8];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method218(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= 0 || arg1 == null) {
            return;
        }
        int var7 = arg0 - this.method216(-525, arg1) / 2;
        int var8 = arg5 - this.field697;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field700[arg1.charAt(var9)];
            if (var10 != 94) {
                this.method222(this.field690[var10], this.field693[var10] + var7, this.field694[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field691[var10], this.field692[var10], arg3);
            }
            var7 += this.field695[var10];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;IIZII)V")
    public void method219(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field699 = false;
        if (arg4 != -44475) {
            return;
        }
        int var7 = arg2;
        if (arg0 == null) {
            return;
        }
        int var8 = arg1 - this.field697;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
                int var10 = this.method221(arg0.substring(var9 + 1, var9 + 4), 856);
                if (var10 != -1) {
                    arg5 = var10;
                }
                var9 += 4;
            } else {
                int var11 = field700[arg0.charAt(var9)];
                if (var11 != 94) {
                    if (arg3) {
                        this.method222(this.field690[var11], this.field693[var11] + arg2 + 1, this.field694[var11] + var8 + 1, this.field691[var11], this.field692[var11], 0);
                    }
                    this.method222(this.field690[var11], this.field693[var11] + arg2, this.field694[var11] + var8, this.field691[var11], this.field692[var11], arg5);
                }
                arg2 += this.field695[var11];
            }
        }
        if (this.field699) {
            Pix2D.method173((int) ((double) this.field697 * 0.7D) + var8, var7, arg2 - var7, 8388608, (byte) 59);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IBIIILjava/lang/String;Z)V")
    public void method220(int arg0, byte arg1, int arg2, int arg3, int arg4, String arg5, boolean arg6) {
        if (arg5 == null) {
            return;
        }
        this.field698.setSeed((long) arg0);
        int var8 = (this.field698.nextInt() & 0x1F) + 192;
        if (arg1 != -37) {
            return;
        }
        int var9 = arg2 - this.field697;
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            if (arg5.charAt(var10) == '@' && var10 + 4 < arg5.length() && arg5.charAt(var10 + 4) == '@') {
                int var11 = this.method221(arg5.substring(var10 + 1, var10 + 4), 856);
                if (var11 != -1) {
                    arg4 = var11;
                }
                var10 += 4;
            } else {
                int var12 = field700[arg5.charAt(var10)];
                if (var12 != 94) {
                    if (arg6) {
                        this.method224(-371, this.field693[var12] + arg3 + 1, this.field694[var12] + var9 + 1, this.field691[var12], 0, this.field692[var12], this.field690[var12], 192);
                    }
                    this.method224(-371, this.field693[var12] + arg3, this.field694[var12] + var9, this.field691[var12], arg4, this.field692[var12], this.field690[var12], var8);
                }
                arg3 += this.field695[var12];
                if ((this.field698.nextInt() & 0x3) == 0) {
                    arg3++;
                }
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method221(String arg0, int arg1) {
        int var3 = 78 / arg1;
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
                this.field699 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([BIIIII)V")
    private void method222(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field630 * arg2 + arg1;
        int var8 = Pix2D.field630 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field632) {
            int var11 = Pix2D.field632 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field632;
            var10 += arg3 * var11;
            var7 += Pix2D.field630 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field633) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field633;
        }
        if (arg1 < Pix2D.field634) {
            int var12 = Pix2D.field634 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field634;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field635) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field635;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method223(Pix2D.field629, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
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

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIIIII[BI)V")
    private void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        if (arg0 >= 0) {
            return;
        }
        int var9 = Pix2D.field630 * arg2 + arg1;
        int var10 = Pix2D.field630 - arg3;
        int var11 = 0;
        int var12 = 0;
        if (arg2 < Pix2D.field632) {
            int var13 = Pix2D.field632 - arg2;
            arg5 -= var13;
            arg2 = Pix2D.field632;
            var12 += arg3 * var13;
            var9 += Pix2D.field630 * var13;
        }
        if (arg2 + arg5 >= Pix2D.field633) {
            arg5 -= arg2 + arg5 + 1 - Pix2D.field633;
        }
        if (arg1 < Pix2D.field634) {
            int var14 = Pix2D.field634 - arg1;
            arg3 -= var14;
            arg1 = Pix2D.field634;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg3 >= Pix2D.field635) {
            int var15 = arg1 + arg3 + 1 - Pix2D.field635;
            arg3 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg3 > 0 && arg5 > 0) {
            this.method225(var10, Pix2D.field629, arg3, var11, arg4, var12, arg7, var9, true, arg5, arg6);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I[IIIIIIIZI[B)V")
    private void method225(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, byte[] arg10) {
        int var12 = ((arg4 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg6 & 0xFF0000) >> 8;
        if (!arg8) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        int var14 = 256 - arg6;
        for (int var15 = -arg9; var15 < 0; var15++) {
            for (int var16 = -arg2; var16 < 0; var16++) {
                if (arg10[arg5++] == 0) {
                    arg7++;
                } else {
                    int var17 = arg1[arg7];
                    arg1[arg7++] = (((var17 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var17 & 0xFF00) * var14 & 0xFF0000) >> 8) + var12;
                }
            }
            arg7 += arg0;
            arg5 += arg3;
        }
    }

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }
            field700[var1] = var2;
        }
    }
}
