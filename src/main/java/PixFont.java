import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "lb", name = "x", descriptor = "Z")
    private boolean field668 = false;

    @OriginalMember(owner = "lb", name = "y", descriptor = "B")
    private byte field669 = -73;

    @OriginalMember(owner = "lb", name = "z", descriptor = "I")
    private int field670 = 7;

    @OriginalMember(owner = "lb", name = "A", descriptor = "[[B")
    public byte[][] field671 = new byte[94][];

    @OriginalMember(owner = "lb", name = "B", descriptor = "[I")
    public int[] field672 = new int[94];

    @OriginalMember(owner = "lb", name = "C", descriptor = "[I")
    public int[] field673 = new int[94];

    @OriginalMember(owner = "lb", name = "D", descriptor = "[I")
    public int[] field674 = new int[94];

    @OriginalMember(owner = "lb", name = "E", descriptor = "[I")
    public int[] field675 = new int[94];

    @OriginalMember(owner = "lb", name = "F", descriptor = "[I")
    public int[] field676 = new int[95];

    @OriginalMember(owner = "lb", name = "G", descriptor = "[I")
    public int[] field677 = new int[256];

    @OriginalMember(owner = "lb", name = "I", descriptor = "Ljava/util/Random;")
    public Random field679 = new Random();

    @OriginalMember(owner = "lb", name = "H", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "lb", name = "J", descriptor = "[I")
    public static int[] field680 = new int[256];

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(BLyb;Ljava/lang/String;)V")
    public PixFont(byte arg0, Jagfile arg1, String arg2) {
        Packet var4 = new Packet(699, arg1.method295(arg2 + ".dat", null));
        if (arg0 != 9) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Packet var6 = new Packet(699, arg1.method295("index.dat", null));
        boolean var7 = true;
        var6.field694 = var4.method233() + 4;
        int var8 = var6.method231();
        if (var8 > 0) {
            var6.field694 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 94; var9++) {
            this.field674[var9] = var6.method231();
            this.field675[var9] = var6.method231();
            int var12 = this.field672[var9] = var6.method233();
            int var13 = this.field673[var9] = var6.method233();
            int var14 = var6.method231();
            int var15 = var12 * var13;
            this.field671[var9] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field671[var9][var16] = var4.method232();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field671[var9][var12 * var18 + var17] = var4.method232();
                    }
                }
            }
            if (var13 > this.field678) {
                this.field678 = var13;
            }
            this.field674[var9] = 1;
            this.field676[var9] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field671[var9][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field676[var9]--;
                this.field674[var9] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field671[var9][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field676[var9]--;
            }
        }
        this.field676[94] = this.field676[8];
        for (int var10 = 0; var10 < 256; var10++) {
            this.field677[var10] = this.field676[field680[var10]];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method206(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 39475) {
            this.field670 = 250;
        }
        this.method209(arg1 - this.method208((byte) 37, arg0) / 2, arg0, this.field668, arg4, arg2);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(BZILjava/lang/String;II)V")
    public void method207(byte arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5) {
        this.method211(arg1, arg3, false, arg4, arg2, arg5 - this.method208((byte) 37, arg3) / 2);
        if (arg0 == 9) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method208(byte arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0 != 37) {
            return 0;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field677[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ILjava/lang/String;ZII)V")
    public void method209(int arg0, String arg1, boolean arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg4 - this.field678;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            int var8 = field680[arg1.charAt(var7)];
            if (var8 != 94) {
                this.method214(this.field671[var8], this.field674[var8] + arg0, this.field675[var8] + var6, this.field672[var8], this.field673[var8], arg3);
            }
            arg0 += this.field676[var8];
        }
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public void method210(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg4 - this.method208((byte) 37, arg5) / 2;
        int var8 = arg1 - this.field678;
        if (arg3 < 2 || arg3 > 2) {
            this.field668 = !this.field668;
        }
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            int var10 = field680[arg5.charAt(var9)];
            if (var10 != 94) {
                this.method214(this.field671[var10], this.field674[var10] + var7, this.field675[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field672[var10], this.field673[var10], arg2);
            }
            var7 += this.field676[var10];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZLjava/lang/String;ZIII)V")
    public void method211(boolean arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg4 - this.field678;
        for (int var8 = 0; var8 < arg1.length(); var8++) {
            if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
                arg3 = this.method213(arg1.substring(var8 + 1, var8 + 4), -32565);
                var8 += 4;
            } else {
                int var9 = field680[arg1.charAt(var8)];
                if (var9 != 94) {
                    if (arg0) {
                        this.method214(this.field671[var9], this.field674[var9] + arg5 + 1, this.field675[var9] + var7 + 1, this.field672[var9], this.field673[var9], 0);
                    }
                    this.method214(this.field671[var9], this.field674[var9] + arg5, this.field675[var9] + var7, this.field672[var9], this.field673[var9], arg3);
                }
                arg5 += this.field676[var9];
            }
        }
        if (arg2) {
            this.field670 = 482;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ILjava/lang/String;IIZIZ)V")
    public void method212(int arg0, String arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg1 == null) {
            return;
        }
        this.field679.setSeed((long) arg2);
        if (arg4) {
            this.field670 = -187;
        }
        int var8 = (this.field679.nextInt() & 0x1F) + 192;
        int var9 = arg5 - this.field678;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                arg0 = this.method213(arg1.substring(var10 + 1, var10 + 4), -32565);
                var10 += 4;
            } else {
                int var11 = field680[arg1.charAt(var10)];
                if (var11 != 94) {
                    if (arg6) {
                        this.method216(192, this.field671[var11], this.field675[var11] + var9 + 1, this.field669, this.field674[var11] + arg3 + 1, this.field672[var11], this.field673[var11], 0);
                    }
                    this.method216(var8, this.field671[var11], this.field675[var11] + var9, this.field669, this.field674[var11] + arg3, this.field672[var11], this.field673[var11], arg0);
                }
                arg3 += this.field676[var11];
                if ((this.field679.nextInt() & 0x3) == 0) {
                    arg3++;
                }
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method213(String arg0, int arg1) {
        if (arg1 != -32565) {
            this.field670 = -37;
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
            return 0;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([BIIIII)V")
    private void method214(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field609 * arg2 + arg1;
        int var8 = Pix2D.field609 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field611) {
            int var11 = Pix2D.field611 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field611;
            var10 += arg3 * var11;
            var7 += Pix2D.field609 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field612) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field612;
        }
        if (arg1 < Pix2D.field613) {
            int var12 = Pix2D.field613 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field613;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field614) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field614;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method215(Pix2D.field608, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method215(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I[BIBIIII)V")
    private void method216(int arg0, byte[] arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = Pix2D.field609 * arg2 + arg4;
        int var10 = Pix2D.field609 - arg5;
        int var11 = 0;
        int var12 = 0;
        if (arg2 < Pix2D.field611) {
            int var13 = Pix2D.field611 - arg2;
            arg6 -= var13;
            arg2 = Pix2D.field611;
            var12 += arg5 * var13;
            var9 += Pix2D.field609 * var13;
        }
        if (arg2 + arg6 >= Pix2D.field612) {
            arg6 -= arg2 + arg6 + 1 - Pix2D.field612;
        }
        if (arg4 < Pix2D.field613) {
            int var14 = Pix2D.field613 - arg4;
            arg5 -= var14;
            arg4 = Pix2D.field613;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg4 + arg5 >= Pix2D.field614) {
            int var15 = arg4 + arg5 + 1 - Pix2D.field614;
            arg5 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg5 <= 0 || arg6 <= 0) {
            return;
        }
        this.method217(arg6, arg5, arg0, var12, var9, arg7, var10, var11, Pix2D.field608, true, arg1);
        if (arg3 != -73) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIIIIIII[IZ[B)V")
    private void method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, boolean arg9, byte[] arg10) {
        int var12 = ((arg5 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg2 & 0xFF0000) >> 8;
        int var13 = 256 - arg2;
        if (!arg9) {
            return;
        }
        for (int var14 = -arg0; var14 < 0; var14++) {
            for (int var15 = -arg1; var15 < 0; var15++) {
                if (arg10[arg3++] == 0) {
                    arg4++;
                } else {
                    int var16 = arg8[arg4];
                    arg8[arg4++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg4 += arg6;
            arg3 += arg7;
        }
    }

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }
            field680[var1] = var2;
        }
    }
}
