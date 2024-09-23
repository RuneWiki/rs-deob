import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "lb", name = "x", descriptor = "I")
    private int field679 = 33317;

    @OriginalMember(owner = "lb", name = "z", descriptor = "Z")
    private boolean field681 = false;

    @OriginalMember(owner = "lb", name = "A", descriptor = "I")
    private int field682 = -251;

    @OriginalMember(owner = "lb", name = "B", descriptor = "[[B")
    public byte[][] field683 = new byte[94][];

    @OriginalMember(owner = "lb", name = "C", descriptor = "[I")
    public int[] field684 = new int[94];

    @OriginalMember(owner = "lb", name = "D", descriptor = "[I")
    public int[] field685 = new int[94];

    @OriginalMember(owner = "lb", name = "E", descriptor = "[I")
    public int[] field686 = new int[94];

    @OriginalMember(owner = "lb", name = "F", descriptor = "[I")
    public int[] field687 = new int[94];

    @OriginalMember(owner = "lb", name = "G", descriptor = "[I")
    public int[] field688 = new int[95];

    @OriginalMember(owner = "lb", name = "H", descriptor = "[I")
    public int[] field689 = new int[256];

    @OriginalMember(owner = "lb", name = "J", descriptor = "Ljava/util/Random;")
    public Random field691 = new Random();

    @OriginalMember(owner = "lb", name = "I", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "lb", name = "K", descriptor = "[I")
    public static int[] field692 = new int[256];

    @OriginalMember(owner = "lb", name = "y", descriptor = "I")
    private int field680;

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(BLjava/lang/String;Lyb;)V")
    public PixFont(byte arg0, String arg1, Jagfile arg2) {
        Packet var4 = new Packet(arg2.method299(arg1 + ".dat", null), true);
        Packet var5 = new Packet(arg2.method299("index.dat", null), true);
        boolean var6 = true;
        var5.field698 = var4.method233() + 4;
        int var7 = var5.method231();
        if (arg0 != 121) {
            throw new NullPointerException();
        }
        if (var7 > 0) {
            var5.field698 += (var7 - 1) * 3;
        }
        for (int var8 = 0; var8 < 94; var8++) {
            this.field686[var8] = var5.method231();
            this.field687[var8] = var5.method231();
            int var11 = this.field684[var8] = var5.method233();
            int var12 = this.field685[var8] = var5.method233();
            int var13 = var5.method231();
            int var14 = var11 * var12;
            this.field683[var8] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field683[var8][var15] = var4.method232();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field683[var8][var11 * var17 + var16] = var4.method232();
                    }
                }
            }
            if (var12 > this.field690) {
                this.field690 = var12;
            }
            this.field686[var8] = 1;
            this.field688[var8] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field683[var8][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field688[var8]--;
                this.field686[var8] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field683[var8][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field688[var8]--;
            }
        }
        this.field688[94] = this.field688[8];
        for (int var9 = 0; var9 < 256; var9++) {
            this.field689[var9] = this.field688[field692[var9]];
        }
        if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(BLjava/lang/String;III)V")
    public void method206(byte arg0, String arg1, int arg2, int arg3, int arg4) {
        this.method209(arg4, arg2 - this.method208((byte) 2, arg1) / 2, 9, arg3, arg1);
        if (arg0 == -53) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IZIIILjava/lang/String;)V")
    public void method207(int arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg4 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.method211(arg0, arg3, false, arg5, arg1, arg2 - this.method208((byte) 2, arg5) / 2);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method208(byte arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field689[arg1.charAt(var4)];
            }
        }
        if (arg0 == 2) {
            boolean var5 = false;
            return var3;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method209(int arg0, int arg1, int arg2, int arg3, String arg4) {
        if (arg4 == null) {
            return;
        }
        int var6 = arg3 - this.field690;
        for (int var7 = 0; var7 < arg4.length(); var7++) {
            int var8 = field692[arg4.charAt(var7)];
            if (var8 != 94) {
                this.method214(this.field683[var8], this.field686[var8] + arg1, this.field687[var8] + var6, this.field684[var8], this.field685[var8], arg0);
            }
            arg1 += this.field688[var8];
        }
        if (arg2 < 9 || arg2 > 9) {
            this.field679 = 201;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(BLjava/lang/String;IIII)V")
    public void method210(byte arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 117) {
            this.field679 = 29;
        }
        if (arg1 == null) {
            return;
        }
        int var7 = arg5 - this.method208((byte) 2, arg1) / 2;
        int var8 = arg3 - this.field690;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field692[arg1.charAt(var9)];
            if (var10 != 94) {
                this.method214(this.field683[var10], this.field686[var10] + var7, this.field687[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field684[var10], this.field685[var10], arg2);
            }
            var7 += this.field688[var10];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIZLjava/lang/String;ZI)V")
    public void method211(int arg0, int arg1, boolean arg2, String arg3, boolean arg4, int arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg1 - this.field690;
        if (arg2) {
            this.field679 = 474;
        }
        for (int var8 = 0; var8 < arg3.length(); var8++) {
            if (arg3.charAt(var8) == '@' && var8 + 4 < arg3.length() && arg3.charAt(var8 + 4) == '@') {
                arg0 = this.method213(arg3.substring(var8 + 1, var8 + 4), 0);
                var8 += 4;
            } else {
                int var9 = field692[arg3.charAt(var8)];
                if (var9 != 94) {
                    if (arg4) {
                        this.method214(this.field683[var9], this.field686[var9] + arg5 + 1, this.field687[var9] + var7 + 1, this.field684[var9], this.field685[var9], 0);
                    }
                    this.method214(this.field683[var9], this.field686[var9] + arg5, this.field687[var9] + var7, this.field684[var9], this.field685[var9], arg0);
                }
                arg5 += this.field688[var9];
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIZLjava/lang/String;IZI)V")
    public void method212(int arg0, int arg1, boolean arg2, String arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        this.field691.setSeed((long) arg1);
        if (arg5) {
            this.field679 = -315;
        }
        int var8 = (this.field691.nextInt() & 0x1F) + 192;
        int var9 = arg0 - this.field690;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                arg6 = this.method213(arg3.substring(var10 + 1, var10 + 4), 0);
                var10 += 4;
            } else {
                int var11 = field692[arg3.charAt(var10)];
                if (var11 != 94) {
                    if (arg2) {
                        this.method216(this.field685[var11], -251, this.field684[var11], this.field683[var11], 0, this.field686[var11] + arg4 + 1, this.field687[var11] + var9 + 1, 192);
                    }
                    this.method216(this.field685[var11], -251, this.field684[var11], this.field683[var11], arg6, this.field686[var11] + arg4, this.field687[var11] + var9, var8);
                }
                arg4 += this.field688[var11];
                if ((this.field691.nextInt() & 0x3) == 0) {
                    arg4++;
                }
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method213(String arg0, int arg1) {
        if (arg1 != 0) {
            this.field680 = -282;
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
        int var7 = Pix2D.field617 * arg2 + arg1;
        int var8 = Pix2D.field617 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field619) {
            int var11 = Pix2D.field619 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field619;
            var10 += arg3 * var11;
            var7 += Pix2D.field617 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field620) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field620;
        }
        if (arg1 < Pix2D.field621) {
            int var12 = Pix2D.field621 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field621;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field622) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field622;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method215(Pix2D.field616, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
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

    @OriginalMember(owner = "lb", name = "a", descriptor = "(III[BIIII)V")
    private void method216(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = Pix2D.field617 * arg6 + arg5;
        int var10 = Pix2D.field617 - arg2;
        int var11 = 0;
        int var12 = 0;
        if (arg6 < Pix2D.field619) {
            int var13 = Pix2D.field619 - arg6;
            arg0 -= var13;
            arg6 = Pix2D.field619;
            var12 += arg2 * var13;
            var9 += Pix2D.field617 * var13;
        }
        if (arg0 + arg6 >= Pix2D.field620) {
            arg0 -= arg0 + arg6 + 1 - Pix2D.field620;
        }
        if (arg5 < Pix2D.field621) {
            int var14 = Pix2D.field621 - arg5;
            arg2 -= var14;
            arg5 = Pix2D.field621;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg2 + arg5 >= Pix2D.field622) {
            int var15 = arg2 + arg5 + 1 - Pix2D.field622;
            arg2 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg2 > 0 && arg0 > 0) {
            this.method217(Pix2D.field616, var10, arg3, var9, arg7, arg2, arg0, arg4, var12, 385, var11);
            while (arg1 >= 0) {
                this.field681 = !this.field681;
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([II[BIIIIIIII)V")
    private void method217(int[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg7 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg4 & 0xFF0000) >> 8;
        int var13 = 256 - arg4;
        if (arg9 <= 0) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        for (int var15 = -arg6; var15 < 0; var15++) {
            for (int var16 = -arg5; var16 < 0; var16++) {
                if (arg2[arg8++] == 0) {
                    arg3++;
                } else {
                    int var17 = arg0[arg3];
                    arg0[arg3++] = (((var17 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var17 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg3 += arg1;
            arg8 += arg10;
        }
    }

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }
            field692[var1] = var2;
        }
    }
}
