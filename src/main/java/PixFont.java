import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "lb", name = "v", descriptor = "I")
    private int field690 = 626;

    @OriginalMember(owner = "lb", name = "w", descriptor = "I")
    private int field691 = 31154;

    @OriginalMember(owner = "lb", name = "x", descriptor = "I")
    private int field692 = 9;

    @OriginalMember(owner = "lb", name = "y", descriptor = "[[B")
    public byte[][] field693 = new byte[94][];

    @OriginalMember(owner = "lb", name = "z", descriptor = "[I")
    public int[] field694 = new int[94];

    @OriginalMember(owner = "lb", name = "A", descriptor = "[I")
    public int[] field695 = new int[94];

    @OriginalMember(owner = "lb", name = "B", descriptor = "[I")
    public int[] field696 = new int[94];

    @OriginalMember(owner = "lb", name = "C", descriptor = "[I")
    public int[] field697 = new int[94];

    @OriginalMember(owner = "lb", name = "D", descriptor = "[I")
    public int[] field698 = new int[95];

    @OriginalMember(owner = "lb", name = "E", descriptor = "[I")
    public int[] field699 = new int[256];

    @OriginalMember(owner = "lb", name = "G", descriptor = "Ljava/util/Random;")
    public Random field701 = new Random();

    @OriginalMember(owner = "lb", name = "H", descriptor = "Z")
    public boolean field702 = false;

    @OriginalMember(owner = "lb", name = "F", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "lb", name = "I", descriptor = "[I")
    public static int[] field703 = new int[256];

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(Ljava/lang/String;Lyb;B)V")
    public PixFont(String arg0, Jagfile arg1, byte arg2) {
        Packet var4 = new Packet(arg1.method308(arg0 + ".dat", null), false);
        Packet var5 = new Packet(arg1.method308("index.dat", null), false);
        boolean var6 = true;
        var5.field713 = var4.method240() + 4;
        int var7 = var5.method238();
        if (var7 > 0) {
            var5.field713 += (var7 - 1) * 3;
        }
        for (int var8 = 0; var8 < 94; var8++) {
            this.field696[var8] = var5.method238();
            this.field697[var8] = var5.method238();
            int var12 = this.field694[var8] = var5.method240();
            int var13 = this.field695[var8] = var5.method240();
            int var14 = var5.method238();
            int var15 = var12 * var13;
            this.field693[var8] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field693[var8][var16] = var4.method239();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field693[var8][var12 * var18 + var17] = var4.method239();
                    }
                }
            }
            if (var13 > this.field700) {
                this.field700 = var13;
            }
            this.field696[var8] = 1;
            this.field698[var8] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field693[var8][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field698[var8]--;
                this.field696[var8] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field693[var8][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field698[var8]--;
            }
        }
        this.field698[94] = this.field698[8];
        if (arg2 != -113) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field699[var10] = this.field698[field703[var10]];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method213(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg4 < 0) {
            this.method216(0, arg3, arg0, arg1 - this.method215(true, arg3) / 2, arg2);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZIIILjava/lang/String;B)V")
    public void method214(boolean arg0, int arg1, int arg2, int arg3, String arg4, byte arg5) {
        if (arg5 != -5) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.method218(arg2, arg3 - this.method215(true, arg4) / 2, arg1, arg0, false, arg4);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method215(boolean arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg1.length(); var5++) {
            if (arg1.charAt(var5) == '@' && var5 + 4 < arg1.length() && arg1.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var3 += this.field699[arg1.charAt(var5)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method216(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg1 == null) {
            return;
        }
        int var7 = arg4 - this.field700;
        for (int var8 = 0; var8 < arg1.length(); var8++) {
            int var9 = field703[arg1.charAt(var8)];
            if (var9 != 94) {
                this.method221(this.field693[var9], this.field696[var9] + arg3, this.field697[var9] + var7, this.field694[var9], this.field695[var9], arg2);
            }
            arg3 += this.field698[var9];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIILjava/lang/String;IB)V")
    public void method217(int arg0, int arg1, int arg2, String arg3, int arg4, byte arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg0 - this.method215(true, arg3) / 2;
        int var8 = arg2 - this.field700;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            int var10 = field703[arg3.charAt(var9)];
            if (var10 != 94) {
                this.method221(this.field693[var10], this.field696[var10] + var7, this.field697[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field694[var10], this.field695[var10], arg1);
            }
            var7 += this.field698[var10];
        }
        if (arg5 == 1) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIIZZLjava/lang/String;)V")
    public void method218(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, String arg5) {
        this.field702 = false;
        int var7 = arg1;
        if (arg5 == null) {
            return;
        }
        int var8 = arg2 - this.field700;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            if (arg5.charAt(var9) == '@' && var9 + 4 < arg5.length() && arg5.charAt(var9 + 4) == '@') {
                int var11 = this.method220(true, arg5.substring(var9 + 1, var9 + 4));
                if (var11 != -1) {
                    arg0 = var11;
                }
                var9 += 4;
            } else {
                int var12 = field703[arg5.charAt(var9)];
                if (var12 != 94) {
                    if (arg3) {
                        this.method221(this.field693[var12], this.field696[var12] + arg1 + 1, this.field697[var12] + var8 + 1, this.field694[var12], this.field695[var12], 0);
                    }
                    this.method221(this.field693[var12], this.field696[var12] + arg1, this.field697[var12] + var8, this.field694[var12], this.field695[var12], arg0);
                }
                arg1 += this.field698[var12];
            }
        }
        if (arg4) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        if (this.field702) {
            Pix2D.method172((int) ((double) this.field700 * 0.7D) + var8, arg1 - var7, var7, 0, 8388608);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIZLjava/lang/String;IIZ)V")
    public void method219(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 == null) {
            return;
        }
        this.field701.setSeed((long) arg0);
        int var8 = (this.field701.nextInt() & 0x1F) + 192;
        int var9 = arg4 - this.field700;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                int var11 = this.method220(true, arg3.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg1 = var11;
                }
                var10 += 4;
            } else {
                int var12 = field703[arg3.charAt(var10)];
                if (var12 != 94) {
                    if (arg6) {
                        this.method223(this.field696[var12] + arg5 + 1, this.field697[var12] + var9 + 1, -197, 192, this.field693[var12], 0, this.field694[var12], this.field695[var12]);
                    }
                    this.method223(this.field696[var12] + arg5, this.field697[var12] + var9, -197, var8, this.field693[var12], arg1, this.field694[var12], this.field695[var12]);
                }
                arg5 += this.field698[var12];
                if ((this.field701.nextInt() & 0x3) == 0) {
                    arg5++;
                }
            }
        }
        if (!arg2) {
            this.field692 = -130;
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(ZLjava/lang/String;)I")
    public int method220(boolean arg0, String arg1) {
        if (!arg0) {
            this.field690 = -9;
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
                this.field702 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([BIIIII)V")
    private void method221(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field631 * arg2 + arg1;
        int var8 = Pix2D.field631 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field633) {
            int var11 = Pix2D.field633 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field633;
            var10 += arg3 * var11;
            var7 += Pix2D.field631 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field634) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field634;
        }
        if (arg1 < Pix2D.field635) {
            int var12 = Pix2D.field635 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field635;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field636) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field636;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method222(Pix2D.field630, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method222(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIII[BIII)V")
    private void method223(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        int var9 = Pix2D.field631 * arg1 + arg0;
        int var10 = Pix2D.field631 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (arg1 < Pix2D.field633) {
            int var13 = Pix2D.field633 - arg1;
            arg7 -= var13;
            arg1 = Pix2D.field633;
            var12 += arg6 * var13;
            var9 += Pix2D.field631 * var13;
        }
        if (arg1 + arg7 >= Pix2D.field634) {
            arg7 -= arg1 + arg7 + 1 - Pix2D.field634;
        }
        if (arg0 < Pix2D.field635) {
            int var14 = Pix2D.field635 - arg0;
            arg6 -= var14;
            arg0 = Pix2D.field635;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg0 + arg6 >= Pix2D.field636) {
            int var15 = arg0 + arg6 + 1 - Pix2D.field636;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg7 > 0) {
            this.method224(arg6, var12, Pix2D.field630, arg4, var9, var11, var10, false, arg5, arg7, arg3);
            if (arg2 < 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II[I[BIIIZIII)V")
    private void method224(int arg0, int arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg8 & 0xFF00FF) * arg10 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg10 & 0xFF0000) >> 8;
        int var13 = 256 - arg10;
        for (int var14 = -arg9; var14 < 0; var14++) {
            for (int var15 = -arg0; var15 < 0; var15++) {
                if (arg3[arg1++] == 0) {
                    arg4++;
                } else {
                    int var16 = arg2[arg4];
                    arg2[arg4++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg4 += arg6;
            arg1 += arg5;
        }
        if (!arg7) {
            ;
        }
    }

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }
            field703[var1] = var2;
        }
    }
}
