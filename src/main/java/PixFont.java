import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "kb", name = "x", descriptor = "I")
    private int field684 = -456;

    @OriginalMember(owner = "kb", name = "y", descriptor = "[[B")
    public byte[][] field685 = new byte[94][];

    @OriginalMember(owner = "kb", name = "z", descriptor = "[I")
    public int[] field686 = new int[94];

    @OriginalMember(owner = "kb", name = "A", descriptor = "[I")
    public int[] field687 = new int[94];

    @OriginalMember(owner = "kb", name = "B", descriptor = "[I")
    public int[] field688 = new int[94];

    @OriginalMember(owner = "kb", name = "C", descriptor = "[I")
    public int[] field689 = new int[94];

    @OriginalMember(owner = "kb", name = "D", descriptor = "[I")
    public int[] field690 = new int[95];

    @OriginalMember(owner = "kb", name = "E", descriptor = "[I")
    public int[] field691 = new int[256];

    @OriginalMember(owner = "kb", name = "G", descriptor = "Ljava/util/Random;")
    public Random field693 = new Random();

    @OriginalMember(owner = "kb", name = "H", descriptor = "Z")
    public boolean field694 = false;

    @OriginalMember(owner = "kb", name = "F", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "kb", name = "I", descriptor = "[I")
    public static int[] field695 = new int[256];

    @OriginalMember(owner = "kb", name = "w", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "()V")
    public PixFont() {
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;)V")
    public PixFont(Jagfile arg0, String arg1) {
        Packet var3 = new Packet(arg0.method298(arg1 + ".dat", null), true);
        Packet var4 = new Packet(arg0.method298("index.dat", null), true);
        boolean var5 = true;
        var4.field714 = var3.method230() + 4;
        int var6 = var4.method228();
        if (var6 > 0) {
            var4.field714 += (var6 - 1) * 3;
        }
        for (int var7 = 0; var7 < 94; var7++) {
            this.field688[var7] = var4.method228();
            this.field689[var7] = var4.method228();
            int var10 = this.field686[var7] = var4.method230();
            int var11 = this.field687[var7] = var4.method230();
            int var12 = var4.method228();
            int var13 = var10 * var11;
            this.field685[var7] = new byte[var13];
            if (var12 == 0) {
                for (int var14 = 0; var14 < var13; var14++) {
                    this.field685[var7][var14] = var3.method229();
                }
            } else if (var12 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        this.field685[var7][var10 * var16 + var15] = var3.method229();
                    }
                }
            }
            if (var11 > this.field692) {
                this.field692 = var11;
            }
            this.field688[var7] = 1;
            this.field690[var7] = var10 + 2;
            int var17 = 0;
            for (int var18 = var11 / 7; var18 < var11; var18++) {
                var17 += this.field685[var7][var10 * var18];
            }
            int var10002;
            if (var17 <= var11 / 7) {
                var10002 = this.field690[var7]--;
                this.field688[var7] = 0;
            }
            int var19 = 0;
            for (int var20 = var11 / 7; var20 < var11; var20++) {
                var19 += this.field685[var7][var10 * var20 + var10 - 1];
            }
            if (var19 <= var11 / 7) {
                var10002 = this.field690[var7]--;
            }
        }
        this.field690[94] = this.field690[8];
        for (int var8 = 0; var8 < 256; var8++) {
            this.field691[var8] = this.field690[field695[var8]];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method200(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg0 < 0) {
            this.method203(arg3, arg4, arg1, (byte) 110, arg2 - this.method202(false, arg3) / 2);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IZZIILjava/lang/String;)V")
    public void method201(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, String arg5) {
        this.method205(arg4, 0, arg5, arg0 - this.method202(false, arg5) / 2, arg1, arg3);
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method202(boolean arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field691[arg1.charAt(var4)];
            }
        }
        if (arg0) {
            this.field683 = -183;
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIBI)V")
    public void method203(String arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg2 - this.field692;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            int var8 = field695[arg0.charAt(var7)];
            if (var8 != 94) {
                this.method208(this.field685[var8], this.field688[var8] + arg4, this.field689[var8] + var6, this.field686[var8], this.field687[var8], arg1);
            }
            arg4 += this.field690[var8];
        }
        if (arg3 == 110) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method204(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= 0 || arg0 == null) {
            return;
        }
        int var7 = arg2 - this.method202(false, arg0) / 2;
        int var8 = arg4 - this.field692;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            int var10 = field695[arg0.charAt(var9)];
            if (var10 != 94) {
                this.method208(this.field685[var10], this.field688[var10] + var7, this.field689[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field686[var10], this.field687[var10], arg5);
            }
            var7 += this.field690[var10];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
    public void method205(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5) {
        if (arg1 != 0) {
            return;
        }
        this.field694 = false;
        int var7 = arg3;
        if (arg2 == null) {
            return;
        }
        int var8 = arg0 - this.field692;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            if (arg2.charAt(var9) == '@' && var9 + 4 < arg2.length() && arg2.charAt(var9 + 4) == '@') {
                int var10 = this.method207((byte) 94, arg2.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg5 = var10;
                }
                var9 += 4;
            } else {
                int var11 = field695[arg2.charAt(var9)];
                if (var11 != 94) {
                    if (arg4) {
                        this.method208(this.field685[var11], this.field688[var11] + arg3 + 1, this.field689[var11] + var8 + 1, this.field686[var11], this.field687[var11], 0);
                    }
                    this.method208(this.field685[var11], this.field688[var11] + arg3, this.field689[var11] + var8, this.field686[var11], this.field687[var11], arg5);
                }
                arg3 += this.field690[var11];
            }
        }
        if (this.field694) {
            Pix2D.method159(8388608, arg3 - var7, var7, (int) ((double) this.field692 * 0.7D) + var8, (byte) 2);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZLjava/lang/String;IIIII)V")
    public void method206(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        this.field693.setSeed((long) arg4);
        int var8 = (this.field693.nextInt() & 0x1F) + 192;
        int var9 = arg2 - this.field692;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method207((byte) 94, arg1.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg3 = var11;
                }
                var10 += 4;
            } else {
                int var12 = field695[arg1.charAt(var10)];
                if (var12 != 94) {
                    if (arg0) {
                        this.method210(192, this.field685[var12], this.field688[var12] + arg6 + 1, 0, this.field687[var12], this.field686[var12], this.field689[var12] + var9 + 1, true);
                    }
                    this.method210(var8, this.field685[var12], this.field688[var12] + arg6, arg3, this.field687[var12], this.field686[var12], this.field689[var12] + var9, true);
                }
                arg6 += this.field690[var12];
                if ((this.field693.nextInt() & 0x3) == 0) {
                    arg6++;
                }
            }
        }
        if (arg5 != 25755) {
            this.field684 = 196;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method207(byte arg0, String arg1) {
        if (arg0 != 94) {
            this.field684 = -117;
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
                this.field694 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIIII)V")
    private void method208(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field622 * arg2 + arg1;
        int var8 = Pix2D.field622 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field624) {
            int var11 = Pix2D.field624 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field624;
            var10 += arg3 * var11;
            var7 += Pix2D.field622 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field625) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field625;
        }
        if (arg1 < Pix2D.field626) {
            int var12 = Pix2D.field626 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field626;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field627) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field627;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method209(Pix2D.field621, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method209(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I[BIIIIIZ)V")
    private void method210(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (!arg7) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = Pix2D.field622 * arg6 + arg2;
        int var11 = Pix2D.field622 - arg5;
        int var12 = 0;
        int var13 = 0;
        if (arg6 < Pix2D.field624) {
            int var14 = Pix2D.field624 - arg6;
            arg4 -= var14;
            arg6 = Pix2D.field624;
            var13 += arg5 * var14;
            var10 += Pix2D.field622 * var14;
        }
        if (arg4 + arg6 >= Pix2D.field625) {
            arg4 -= arg4 + arg6 + 1 - Pix2D.field625;
        }
        if (arg2 < Pix2D.field626) {
            int var15 = Pix2D.field626 - arg2;
            arg5 -= var15;
            arg2 = Pix2D.field626;
            var13 += var15;
            var10 += var15;
            var12 += var15;
            var11 += var15;
        }
        if (arg2 + arg5 >= Pix2D.field627) {
            int var16 = arg2 + arg5 + 1 - Pix2D.field627;
            arg5 -= var16;
            var12 += var16;
            var11 += var16;
        }
        if (arg5 > 0 && arg4 > 0) {
            this.method211(var12, arg3, 0, Pix2D.field621, arg5, var13, arg1, arg4, var11, arg0, var10);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(III[III[BIIII)V")
    private void method211(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg1 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var13 = 256 - arg9;
        for (int var14 = -arg7; var14 < 0; var14++) {
            for (int var16 = -arg4; var16 < 0; var16++) {
                if (arg6[arg5++] == 0) {
                    arg10++;
                } else {
                    int var17 = arg3[arg10];
                    arg3[arg10++] = (((var17 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var17 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg10 += arg8;
            arg5 += arg0;
        }
        if (arg2 != 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
    }

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }
            field695[var1] = var2;
        }
    }
}
