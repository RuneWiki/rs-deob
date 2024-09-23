import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "jb", name = "v", descriptor = "Z")
    private boolean field596 = true;

    @OriginalMember(owner = "jb", name = "w", descriptor = "B")
    private byte field597 = 8;

    @OriginalMember(owner = "jb", name = "x", descriptor = "B")
    private byte field598 = 6;

    @OriginalMember(owner = "jb", name = "y", descriptor = "B")
    private byte field599 = 2;

    @OriginalMember(owner = "jb", name = "z", descriptor = "I")
    private int field600 = -708;

    @OriginalMember(owner = "jb", name = "A", descriptor = "I")
    private int field601 = 997;

    @OriginalMember(owner = "jb", name = "B", descriptor = "[[B")
    public byte[][] field602 = new byte[94][];

    @OriginalMember(owner = "jb", name = "C", descriptor = "[I")
    public int[] field603 = new int[94];

    @OriginalMember(owner = "jb", name = "D", descriptor = "[I")
    public int[] field604 = new int[94];

    @OriginalMember(owner = "jb", name = "E", descriptor = "[I")
    public int[] field605 = new int[94];

    @OriginalMember(owner = "jb", name = "F", descriptor = "[I")
    public int[] field606 = new int[94];

    @OriginalMember(owner = "jb", name = "G", descriptor = "[I")
    public int[] field607 = new int[95];

    @OriginalMember(owner = "jb", name = "H", descriptor = "[I")
    public int[] field608 = new int[256];

    @OriginalMember(owner = "jb", name = "J", descriptor = "Ljava/util/Random;")
    public Random field610 = new Random();

    @OriginalMember(owner = "jb", name = "I", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "jb", name = "K", descriptor = "[I")
    public static int[] field611 = new int[256];

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public PixFont(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(363, arg0.read(arg1 + ".dat", null, (byte) 2));
        Packet var5 = new Packet(363, arg0.read("index.dat", null, (byte) 2));
        var5.field622 = var4.method218() + 4;
        int var6 = var5.method216();
        if (var6 > 0) {
            var5.field622 += (var6 - 1) * 3;
        }
        for (int var7 = 0; var7 < 94; var7++) {
            this.field605[var7] = var5.method216();
            this.field606[var7] = var5.method216();
            int var10 = this.field603[var7] = var5.method218();
            int var11 = this.field604[var7] = var5.method218();
            int var12 = var5.method216();
            int var13 = var10 * var11;
            this.field602[var7] = new byte[var13];
            if (var12 == 0) {
                for (int var14 = 0; var14 < var13; var14++) {
                    this.field602[var7][var14] = var4.method217();
                }
            } else if (var12 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        this.field602[var7][var10 * var16 + var15] = var4.method217();
                    }
                }
            }
            if (var11 > this.field609) {
                this.field609 = var11;
            }
            this.field605[var7] = 1;
            this.field607[var7] = var10 + 2;
            int var17 = 0;
            for (int var18 = var11 / 7; var18 < var11; var18++) {
                var17 += this.field602[var7][var10 * var18];
            }
            int var10002;
            if (var17 <= var11 / 7) {
                var10002 = this.field607[var7]--;
                this.field605[var7] = 0;
            }
            int var19 = 0;
            for (int var20 = var11 / 7; var20 < var11; var20++) {
                var19 += this.field602[var7][var10 * var20 + var10 - 1];
            }
            if (var19 <= var11 / 7) {
                var10002 = this.field607[var7]--;
            }
        }
        int var8 = 9 / arg2;
        this.field607[94] = this.field607[8];
        for (int var9 = 0; var9 < 256; var9++) {
            this.field608[var9] = this.field607[field611[var9]];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IBILjava/lang/String;I)V")
    public void method191(int arg0, byte arg1, int arg2, String arg3, int arg4) {
        if (arg1 != 6) {
            this.field601 = 140;
        }
        this.method194(arg4 - this.method193(false, arg3) / 2, arg0, false, arg2, arg3);
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIZILjava/lang/String;I)V")
    public void method192(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5) {
        this.method196(arg0 - this.method193(false, arg4) / 2, 6, arg3, arg4, arg2, arg1);
        if (arg5 != 0) {
            this.field596 = !this.field596;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method193(boolean arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0) {
            return this.field600;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field608[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIZILjava/lang/String;)V")
    public void method194(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
        if (arg4 == null) {
            return;
        }
        int var6 = arg1 - this.field609;
        if (arg2) {
            this.field596 = !this.field596;
        }
        for (int var7 = 0; var7 < arg4.length(); var7++) {
            int var8 = field611[arg4.charAt(var7)];
            if (var8 != 94) {
                this.method199(this.field602[var8], this.field605[var8] + arg0, this.field606[var8] + var6, this.field603[var8], this.field604[var8], arg3);
            }
            arg0 += this.field607[var8];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IBIIILjava/lang/String;)V")
    public void method195(int arg0, byte arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg2 - this.method193(false, arg5) / 2;
        int var8 = arg3 - this.field609;
        if (this.field597 != arg1) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            int var11 = field611[arg5.charAt(var10)];
            if (var11 != 94) {
                this.method199(this.field602[var11], this.field605[var11] + var7, this.field606[var11] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 2.0D) * 5.0D), this.field603[var11], this.field604[var11], arg4);
            }
            var7 += this.field607[var11];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIILjava/lang/String;ZI)V")
    public void method196(int arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg2 - this.field609;
        for (int var8 = 0; var8 < arg3.length(); var8++) {
            if (arg3.charAt(var8) == '@' && var8 + 4 < arg3.length() && arg3.charAt(var8 + 4) == '@') {
                arg5 = this.method198(0, arg3.substring(var8 + 1, var8 + 4));
                var8 += 4;
            } else {
                int var9 = field611[arg3.charAt(var8)];
                if (var9 != 94) {
                    if (arg4) {
                        this.method199(this.field602[var9], this.field605[var9] + arg0 + 1, this.field606[var9] + var7 + 1, this.field603[var9], this.field604[var9], 0);
                    }
                    this.method199(this.field602[var9], this.field605[var9] + arg0, this.field606[var9] + var7, this.field603[var9], this.field604[var9], arg5);
                }
                arg0 += this.field607[var9];
            }
        }
        if (arg1 == 6) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IZBIILjava/lang/String;I)V")
    public void method197(int arg0, boolean arg1, byte arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        this.field610.setSeed((long) arg0);
        int var8 = (this.field610.nextInt() & 0x1F) + 192;
        int var9 = arg3 - this.field609;
        if (arg2 != -121) {
            this.field601 = 341;
        }
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            if (arg5.charAt(var10) == '@' && var10 + 4 < arg5.length() && arg5.charAt(var10 + 4) == '@') {
                arg4 = this.method198(0, arg5.substring(var10 + 1, var10 + 4));
                var10 += 4;
            } else {
                int var11 = field611[arg5.charAt(var10)];
                if (var11 != 94) {
                    if (arg1) {
                        this.method201(this.field602[var11], (byte) 6, this.field605[var11] + arg6 + 1, this.field604[var11], 0, this.field606[var11] + var9 + 1, 192, this.field603[var11]);
                    }
                    this.method201(this.field602[var11], (byte) 6, this.field605[var11] + arg6, this.field604[var11], arg4, this.field606[var11] + var9, var8, this.field603[var11]);
                }
                arg6 += this.field607[var11];
                if ((this.field610.nextInt() & 0x3) == 0) {
                    arg6++;
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method198(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field600 = 450;
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
            return 0;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([BIIIII)V")
    private void method199(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field534 * arg2 + arg1;
        int var8 = Pix2D.field534 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field536) {
            int var11 = Pix2D.field536 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field536;
            var10 += arg3 * var11;
            var7 += Pix2D.field534 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field537) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field537;
        }
        if (arg1 < Pix2D.field538) {
            int var12 = Pix2D.field538 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field538;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field539) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field539;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method200(Pix2D.field533, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
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

    @OriginalMember(owner = "jb", name = "a", descriptor = "([BBIIIIII)V")
    private void method201(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field598 != arg1) {
            return;
        }
        int var9 = Pix2D.field534 * arg5 + arg2;
        int var10 = Pix2D.field534 - arg7;
        int var11 = 0;
        int var12 = 0;
        if (arg5 < Pix2D.field536) {
            int var13 = Pix2D.field536 - arg5;
            arg3 -= var13;
            arg5 = Pix2D.field536;
            var12 += arg7 * var13;
            var9 += Pix2D.field534 * var13;
        }
        if (arg3 + arg5 >= Pix2D.field537) {
            arg3 -= arg3 + arg5 + 1 - Pix2D.field537;
        }
        if (arg2 < Pix2D.field538) {
            int var14 = Pix2D.field538 - arg2;
            arg7 -= var14;
            arg2 = Pix2D.field538;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg2 + arg7 >= Pix2D.field539) {
            int var15 = arg2 + arg7 + 1 - Pix2D.field539;
            arg7 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg7 > 0 && arg3 > 0) {
            this.method202(arg3, var9, arg7, Pix2D.field533, arg0, arg6, var12, var10, var11, (byte) 2, arg4);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III[I[BIIIIBI)V")
    private void method202(int arg0, int arg1, int arg2, int[] arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        int var12 = ((arg10 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg10 & 0xFF00) * arg5 & 0xFF0000) >> 8;
        if (this.field599 == arg9) {
            boolean var13 = false;
        } else {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        int var15 = 256 - arg5;
        for (int var16 = -arg0; var16 < 0; var16++) {
            for (int var17 = -arg2; var17 < 0; var17++) {
                if (arg4[arg6++] == 0) {
                    arg1++;
                } else {
                    int var18 = arg3[arg1];
                    arg3[arg1++] = (((var18 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var18 & 0xFF00) * var15 & 0xFF0000) >> 8) + var12;
                }
            }
            arg1 += arg7;
            arg6 += arg8;
        }
    }

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }
            field611[var1] = var2;
        }
    }
}
