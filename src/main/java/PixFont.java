import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "lb", name = "y", descriptor = "Z")
    private boolean field691 = true;

    @OriginalMember(owner = "lb", name = "z", descriptor = "B")
    private byte field692 = 7;

    @OriginalMember(owner = "lb", name = "B", descriptor = "[[B")
    public byte[][] field694 = new byte[94][];

    @OriginalMember(owner = "lb", name = "C", descriptor = "[I")
    public int[] field695 = new int[94];

    @OriginalMember(owner = "lb", name = "D", descriptor = "[I")
    public int[] field696 = new int[94];

    @OriginalMember(owner = "lb", name = "E", descriptor = "[I")
    public int[] field697 = new int[94];

    @OriginalMember(owner = "lb", name = "F", descriptor = "[I")
    public int[] field698 = new int[94];

    @OriginalMember(owner = "lb", name = "G", descriptor = "[I")
    public int[] field699 = new int[95];

    @OriginalMember(owner = "lb", name = "H", descriptor = "[I")
    public int[] field700 = new int[256];

    @OriginalMember(owner = "lb", name = "J", descriptor = "Ljava/util/Random;")
    public Random field702 = new Random();

    @OriginalMember(owner = "lb", name = "K", descriptor = "Z")
    public boolean field703 = false;

    @OriginalMember(owner = "lb", name = "I", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "lb", name = "L", descriptor = "[I")
    public static int[] field704 = new int[256];

    @OriginalMember(owner = "lb", name = "x", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "lb", name = "A", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;B)V")
    public PixFont(Jagfile arg0, String arg1, byte arg2) {
        Packet var4 = new Packet(16, arg0.method309(arg1 + ".dat", null));
        Packet var5 = new Packet(16, arg0.method309("index.dat", null));
        boolean var6 = true;
        var5.field717 = var4.method241() + 4;
        if (this.field692 != arg2) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = var5.method239();
        if (var8 > 0) {
            var5.field717 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 94; var9++) {
            this.field697[var9] = var5.method239();
            this.field698[var9] = var5.method239();
            int var12 = this.field695[var9] = var5.method241();
            int var13 = this.field696[var9] = var5.method241();
            int var14 = var5.method239();
            int var15 = var12 * var13;
            this.field694[var9] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field694[var9][var16] = var4.method240();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field694[var9][var12 * var18 + var17] = var4.method240();
                    }
                }
            }
            if (var13 > this.field701) {
                this.field701 = var13;
            }
            this.field697[var9] = 1;
            this.field699[var9] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field694[var9][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field699[var9]--;
                this.field697[var9] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field694[var9][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field699[var9]--;
            }
        }
        this.field699[94] = this.field699[8];
        for (int var10 = 0; var10 < 256; var10++) {
            this.field700[var10] = this.field699[field704[var10]];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method214(int arg0, String arg1, int arg2, int arg3, int arg4) {
        this.method217(arg3, arg4, false, arg1, arg0 - this.method216(false, arg1) / 2);
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;IIZII)V")
    public void method215(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.method219(3, arg4, arg3, arg0, arg5, arg2 - this.method216(false, arg0) / 2);
        if (arg1 >= 0) {
            this.field693 = -217;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method216(boolean arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0) {
            this.field690 = -235;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field700[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIZLjava/lang/String;I)V")
    public void method217(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
        if (arg3 == null) {
            return;
        }
        int var6 = arg0 - this.field701;
        for (int var7 = 0; var7 < arg3.length(); var7++) {
            int var8 = field704[arg3.charAt(var7)];
            if (var8 != 94) {
                this.method222(this.field694[var8], this.field697[var8] + arg4, this.field698[var8] + var6, this.field695[var8], this.field696[var8], arg1);
            }
            arg4 += this.field699[var8];
        }
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method218(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 0) {
            this.field691 = !this.field691;
        }
        if (arg0 == null) {
            return;
        }
        int var7 = arg5 - this.method216(false, arg0) / 2;
        int var8 = arg1 - this.field701;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            int var10 = field704[arg0.charAt(var9)];
            if (var10 != 94) {
                this.method222(this.field694[var10], this.field697[var10] + var7, this.field698[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field695[var10], this.field696[var10], arg3);
            }
            var7 += this.field699[var10];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIZLjava/lang/String;II)V")
    public void method219(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5) {
        if (arg0 != 3) {
            this.field693 = -467;
        }
        this.field703 = false;
        int var7 = arg5;
        if (arg3 == null) {
            return;
        }
        int var8 = arg4 - this.field701;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            if (arg3.charAt(var9) == '@' && var9 + 4 < arg3.length() && arg3.charAt(var9 + 4) == '@') {
                int var10 = this.method221(arg3.substring(var9 + 1, var9 + 4), 4);
                if (var10 != -1) {
                    arg1 = var10;
                }
                var9 += 4;
            } else {
                int var11 = field704[arg3.charAt(var9)];
                if (var11 != 94) {
                    if (arg2) {
                        this.method222(this.field694[var11], this.field697[var11] + arg5 + 1, this.field698[var11] + var8 + 1, this.field695[var11], this.field696[var11], 0);
                    }
                    this.method222(this.field694[var11], this.field697[var11] + arg5, this.field698[var11] + var8, this.field695[var11], this.field696[var11], arg1);
                }
                arg5 += this.field699[var11];
            }
        }
        if (this.field703) {
            Pix2D.method173(8388608, (int) ((double) this.field701 * 0.7D) + var8, -25370, arg5 - var7, var7);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZIIIIILjava/lang/String;)V")
    public void method220(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        if (arg3 != 0) {
            this.field691 = !this.field691;
        }
        if (arg6 == null) {
            return;
        }
        this.field702.setSeed((long) arg5);
        int var8 = (this.field702.nextInt() & 0x1F) + 192;
        int var9 = arg4 - this.field701;
        for (int var10 = 0; var10 < arg6.length(); var10++) {
            if (arg6.charAt(var10) == '@' && var10 + 4 < arg6.length() && arg6.charAt(var10 + 4) == '@') {
                int var11 = this.method221(arg6.substring(var10 + 1, var10 + 4), 4);
                if (var11 != -1) {
                    arg2 = var11;
                }
                var10 += 4;
            } else {
                int var12 = field704[arg6.charAt(var10)];
                if (var12 != 94) {
                    if (arg0) {
                        this.method224(this.field697[var12] + arg1 + 1, this.field695[var12], 192, this.field698[var12] + var9 + 1, this.field694[var12], (byte) 62, this.field696[var12], 0);
                    }
                    this.method224(this.field697[var12] + arg1, this.field695[var12], var8, this.field698[var12] + var9, this.field694[var12], (byte) 62, this.field696[var12], arg2);
                }
                arg1 += this.field699[var12];
                if ((this.field702.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method221(String arg0, int arg1) {
        if (arg1 < 4 || arg1 > 4) {
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
                this.field703 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "([BIIIII)V")
    private void method222(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
            this.method223(Pix2D.field627, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
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

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIII[BBII)V")
    private void method224(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5, int arg6, int arg7) {
        int var9 = Pix2D.field628 * arg3 + arg0;
        int var10 = Pix2D.field628 - arg1;
        int var11 = 0;
        int var12 = 0;
        if (arg5 != 62) {
            this.field693 = -234;
        }
        if (arg3 < Pix2D.field630) {
            int var13 = Pix2D.field630 - arg3;
            arg6 -= var13;
            arg3 = Pix2D.field630;
            var12 += arg1 * var13;
            var9 += Pix2D.field628 * var13;
        }
        if (arg3 + arg6 >= Pix2D.field631) {
            arg6 -= arg3 + arg6 + 1 - Pix2D.field631;
        }
        if (arg0 < Pix2D.field632) {
            int var14 = Pix2D.field632 - arg0;
            arg1 -= var14;
            arg0 = Pix2D.field632;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg0 + arg1 >= Pix2D.field633) {
            int var15 = arg0 + arg1 + 1 - Pix2D.field633;
            arg1 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg1 > 0 && arg6 > 0) {
            this.method225(arg2, arg4, Pix2D.field627, var12, arg1, true, arg7, arg6, var11, var10, var9);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I[B[IIIZIIIII)V")
    private void method225(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (!arg5) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = ((arg6 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg0 & 0xFF0000) >> 8;
        int var14 = 256 - arg0;
        for (int var15 = -arg7; var15 < 0; var15++) {
            for (int var16 = -arg4; var16 < 0; var16++) {
                if (arg1[arg3++] == 0) {
                    arg10++;
                } else {
                    int var17 = arg2[arg10];
                    arg2[arg10++] = (((var17 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var17 & 0xFF00) * var14 & 0xFF0000) >> 8) + var13;
                }
            }
            arg10 += arg9;
            arg3 += arg8;
        }
    }

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }
            field704[var1] = var2;
        }
    }
}
