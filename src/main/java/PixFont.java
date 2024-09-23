import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "jb", name = "x", descriptor = "I")
    private int field605 = 770;

    @OriginalMember(owner = "jb", name = "y", descriptor = "Z")
    private boolean field606 = false;

    @OriginalMember(owner = "jb", name = "z", descriptor = "[[B")
    public byte[][] field607 = new byte[94][];

    @OriginalMember(owner = "jb", name = "A", descriptor = "[I")
    public int[] field608 = new int[94];

    @OriginalMember(owner = "jb", name = "B", descriptor = "[I")
    public int[] field609 = new int[94];

    @OriginalMember(owner = "jb", name = "C", descriptor = "[I")
    public int[] field610 = new int[94];

    @OriginalMember(owner = "jb", name = "D", descriptor = "[I")
    public int[] field611 = new int[94];

    @OriginalMember(owner = "jb", name = "E", descriptor = "[I")
    public int[] field612 = new int[95];

    @OriginalMember(owner = "jb", name = "F", descriptor = "[I")
    public int[] field613 = new int[256];

    @OriginalMember(owner = "jb", name = "H", descriptor = "Ljava/util/Random;")
    public Random field615 = new Random();

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "jb", name = "I", descriptor = "[I")
    public static int[] field616 = new int[256];

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lub;ILjava/lang/String;)V")
    public PixFont(Jagfile arg0, int arg1, String arg2) {
        Packet var4 = new Packet((byte) 64, arg0.method257(null, arg2 + ".dat", -31149));
        Packet var5 = new Packet((byte) 64, arg0.method257(null, "index.dat", -31149));
        var5.field624 = var4.method218() + 4;
        int var6 = var5.method216();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        if (var6 > 0) {
            var5.field624 += (var6 - 1) * 3;
        }
        for (int var7 = 0; var7 < 94; var7++) {
            this.field610[var7] = var5.method216();
            this.field611[var7] = var5.method216();
            int var9 = this.field608[var7] = var5.method218();
            int var10 = this.field609[var7] = var5.method218();
            int var11 = var5.method216();
            int var12 = var9 * var10;
            this.field607[var7] = new byte[var12];
            if (var11 == 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field607[var7][var13] = var4.method217();
                }
            } else if (var11 == 1) {
                for (int var14 = 0; var14 < var9; var14++) {
                    for (int var15 = 0; var15 < var10; var15++) {
                        this.field607[var7][var9 * var15 + var14] = var4.method217();
                    }
                }
            }
            if (var10 > this.field614) {
                this.field614 = var10;
            }
            this.field610[var7] = 1;
            this.field612[var7] = var9 + 2;
            int var16 = 0;
            for (int var17 = var10 / 7; var17 < var10; var17++) {
                var16 += this.field607[var7][var9 * var17];
            }
            int var10002;
            if (var16 <= var10 / 7) {
                var10002 = this.field612[var7]--;
                this.field610[var7] = 0;
            }
            int var18 = 0;
            for (int var19 = var10 / 7; var19 < var10; var19++) {
                var18 += this.field607[var7][var9 * var19 + var9 - 1];
            }
            if (var18 <= var10 / 7) {
                var10002 = this.field612[var7]--;
            }
        }
        this.field612[94] = this.field612[8];
        for (int var8 = 0; var8 < 256; var8++) {
            this.field613[var8] = this.field612[field616[var8]];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method191(int arg0, int arg1, int arg2, String arg3, int arg4) {
        while (arg0 >= 0) {
            this.field605 = -225;
        }
        this.method194(arg2, arg3, arg4, arg1 - this.method193(6, arg3) / 2, 0);
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Ljava/lang/String;ZIIBI)V")
    public void method192(String arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -58) {
            this.field605 = 163;
        }
        this.method196(arg5, 0, arg3 - this.method193(6, arg0) / 2, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method193(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0 < 6 || arg0 > 6) {
            this.field606 = !this.field606;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field613[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method194(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg0 - this.field614;
        if (arg4 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var8 = 0; var8 < arg1.length(); var8++) {
            int var9 = field616[arg1.charAt(var8)];
            if (var9 != 94) {
                this.method199(this.field607[var9], this.field610[var9] + arg3, this.field611[var9] + var6, this.field608[var9], this.field609[var9], arg2);
            }
            arg3 += this.field612[var9];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IILjava/lang/String;IIZ)V")
    public void method195(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 == null) {
            return;
        }
        int var7 = arg1 - this.method193(6, arg2) / 2;
        int var8 = arg0 - this.field614;
        if (arg5) {
            return;
        }
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            int var10 = field616[arg2.charAt(var9)];
            if (var10 != 94) {
                this.method199(this.field607[var10], this.field610[var10] + var7, this.field611[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field608[var10], this.field609[var10], arg3);
            }
            var7 += this.field612[var10];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIZILjava/lang/String;)V")
    public void method196(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5) {
        if (arg1 != 0 || arg5 == null) {
            return;
        }
        int var7 = arg0 - this.field614;
        for (int var8 = 0; var8 < arg5.length(); var8++) {
            if (arg5.charAt(var8) == '@' && var8 + 4 < arg5.length() && arg5.charAt(var8 + 4) == '@') {
                arg4 = this.method198(arg5.substring(var8 + 1, var8 + 4), (byte) 7);
                var8 += 4;
            } else {
                int var9 = field616[arg5.charAt(var8)];
                if (var9 != 94) {
                    if (arg3) {
                        this.method199(this.field607[var9], this.field610[var9] + arg2 + 1, this.field611[var9] + var7 + 1, this.field608[var9], this.field609[var9], 0);
                    }
                    this.method199(this.field607[var9], this.field610[var9] + arg2, this.field611[var9] + var7, this.field608[var9], this.field609[var9], arg4);
                }
                arg2 += this.field612[var9];
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIILjava/lang/String;IZI)V")
    public void method197(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        this.field615.setSeed((long) arg4);
        int var8 = (this.field615.nextInt() & 0x1F) + 192;
        int var9 = arg1 - this.field614;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                arg2 = this.method198(arg3.substring(var10 + 1, var10 + 4), (byte) 7);
                var10 += 4;
            } else {
                int var11 = field616[arg3.charAt(var10)];
                if (var11 != 94) {
                    if (arg5) {
                        this.method201(192, this.field611[var11] + var9 + 1, this.field608[var11], 3181, this.field610[var11] + arg6 + 1, 0, this.field609[var11], this.field607[var11]);
                    }
                    this.method201(var8, this.field611[var11] + var9, this.field608[var11], 3181, this.field610[var11] + arg6, arg2, this.field609[var11], this.field607[var11]);
                }
                arg6 += this.field612[var11];
                if ((this.field615.nextInt() & 0x3) == 0) {
                    arg6++;
                }
            }
        }
        if (arg0 == -13789) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method198(String arg0, byte arg1) {
        if (arg1 != 7) {
            this.field605 = -42;
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

    @OriginalMember(owner = "jb", name = "a", descriptor = "([BIIIII)V")
    private void method199(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field545 * arg2 + arg1;
        int var8 = Pix2D.field545 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field547) {
            int var11 = Pix2D.field547 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field547;
            var10 += arg3 * var11;
            var7 += Pix2D.field545 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field548) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field548;
        }
        if (arg1 < Pix2D.field549) {
            int var12 = Pix2D.field549 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field549;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field550) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field550;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method200(Pix2D.field544, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method200(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIIIII[B)V")
    private void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7) {
        int var9 = Pix2D.field545 * arg1 + arg4;
        int var10 = Pix2D.field545 - arg2;
        int var11 = 0;
        int var12 = 0;
        if (arg3 != 3181) {
            return;
        }
        if (arg1 < Pix2D.field547) {
            int var13 = Pix2D.field547 - arg1;
            arg6 -= var13;
            arg1 = Pix2D.field547;
            var12 += arg2 * var13;
            var9 += Pix2D.field545 * var13;
        }
        if (arg1 + arg6 >= Pix2D.field548) {
            arg6 -= arg1 + arg6 + 1 - Pix2D.field548;
        }
        if (arg4 < Pix2D.field549) {
            int var14 = Pix2D.field549 - arg4;
            arg2 -= var14;
            arg4 = Pix2D.field549;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg2 + arg4 >= Pix2D.field550) {
            int var15 = arg2 + arg4 + 1 - Pix2D.field550;
            arg2 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg2 > 0 && arg6 > 0) {
            this.method202(arg2, var11, arg5, var10, arg6, var12, Pix2D.field544, var9, true, arg7, arg0);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIIIII[IIZ[BI)V")
    private void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, boolean arg8, byte[] arg9, int arg10) {
        int var12 = ((arg2 & 0xFF00FF) * arg10 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg10 & 0xFF0000) >> 8;
        int var13 = 256 - arg10;
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = -arg0; var15 < 0; var15++) {
                if (arg9[arg5++] == 0) {
                    arg7++;
                } else {
                    int var16 = arg6[arg7];
                    arg6[arg7++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg7 += arg3;
            arg5 += arg1;
        }
        if (!arg8) {
            this.field605 = 389;
        }
    }

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }
            field616[var1] = var2;
        }
    }
}
