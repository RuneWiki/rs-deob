import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class PixFontFull extends PixFont {

    @OriginalMember(owner = "lb", name = "J", descriptor = "Z")
    private boolean field696 = false;

    @OriginalMember(owner = "lb", name = "L", descriptor = "Z")
    private boolean field698 = true;

    @OriginalMember(owner = "lb", name = "M", descriptor = "I")
    private int field699 = 6771;

    @OriginalMember(owner = "lb", name = "N", descriptor = "[[B")
    public byte[][] field700 = new byte[256][];

    @OriginalMember(owner = "lb", name = "O", descriptor = "[I")
    public int[] field701 = new int[256];

    @OriginalMember(owner = "lb", name = "P", descriptor = "[I")
    public int[] field702 = new int[256];

    @OriginalMember(owner = "lb", name = "Q", descriptor = "[I")
    public int[] field703 = new int[256];

    @OriginalMember(owner = "lb", name = "R", descriptor = "[I")
    public int[] field704 = new int[256];

    @OriginalMember(owner = "lb", name = "S", descriptor = "[I")
    public int[] field705 = new int[256];

    @OriginalMember(owner = "lb", name = "T", descriptor = "Ljava/util/Random;")
    public Random field706 = new Random();

    @OriginalMember(owner = "lb", name = "U", descriptor = "Z")
    public boolean field707 = false;

    @OriginalMember(owner = "lb", name = "K", descriptor = "I")
    private int field697;

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(BLjava/lang/String;Lyb;)V")
    public PixFontFull(byte arg0, String arg1, Jagfile arg2) {
        Packet var4 = new Packet(arg2.method298(arg1 + ".dat", (byte[]) null), true);
        if (arg0 == 7) {
            boolean var5 = false;
        } else {
            this.field699 = 19;
        }
        Packet var6 = new Packet(arg2.method298("index.dat", (byte[]) null), true);
        boolean var7 = true;
        var6.field714 = var4.method230() + 4;
        int var8 = var6.method228();
        if (var8 > 0) {
            var6.field714 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; ++var9) {
            this.field703[var9] = var6.method228();
            this.field704[var9] = var6.method228();
            int var11 = this.field701[var9] = var6.method230();
            int var12 = this.field702[var9] = var6.method230();
            int var13 = var6.method228();
            int var14 = var11 * var12;
            this.field700[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; ++var15) {
                    this.field700[var9][var15] = var4.method229();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; ++var16) {
                    for (int var17 = 0; var17 < var12; ++var17) {
                        this.field700[var9][var11 * var17 + var16] = var4.method229();
                    }
                }
            }
            if (var12 > super.field692 && var9 < 128) {
                super.field692 = var12;
            }
            this.field703[var9] = 1;
            this.field705[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; ++var19) {
                var18 += this.field700[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field705[var9]--;
                this.field703[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; ++var21) {
                var20 += this.field700[var9][var11 * var21 + (var11 - 1)];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field705[var9]--;
            }
        }
        this.field705[32] = this.field705[73];
        if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method200(int arg0, int arg1, int arg2, String arg3, int arg4) {
        this.method203(arg3, arg4, arg1, (byte) 110, arg2 - this.method202(false, arg3) / 2);
        if (arg0 >= 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IZZIILjava/lang/String;)V")
    public void method201(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, String arg5) {
        this.method205(arg4, 0, arg5, arg0 - this.method202(false, arg5) / 2, arg1, arg3);
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method202(boolean arg0, String arg1) {
        if (arg0) {
            this.field697 = -227;
        }
        if (arg1 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg1.length(); ++var4) {
                if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                    var4 += 4;
                } else {
                    var3 += this.field705[arg1.charAt(var4)];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;IIBI)V")
    public void method203(String arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 == 110) {
            if (arg0 != null) {
                int var6 = arg2 - super.field692;
                for (int var7 = 0; var7 < arg0.length(); ++var7) {
                    char var8 = arg0.charAt(var7);
                    if (var8 != ' ') {
                        this.method212(this.field700[var8], this.field703[var8] + arg4, this.field704[var8] + var6, this.field701[var8], this.field702[var8], arg1);
                    }
                    arg4 += this.field705[var8];
                }
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method204(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            int var7 = arg2 - this.method202(false, arg0) / 2;
            int var8 = arg4 - super.field692;
            for (int var9 = 0; var9 < arg0.length(); ++var9) {
                char var10 = arg0.charAt(var9);
                if (var10 != ' ') {
                    this.method212(this.field700[var10], this.field703[var10] + var7, this.field704[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field701[var10], this.field702[var10], arg5);
                }
                var7 += this.field705[var10];
            }
            if (arg1 < 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
    public void method205(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5) {
        this.field707 = false;
        int var7 = arg3;
        if (arg2 != null) {
            int var8 = arg0 - super.field692;
            for (int var9 = 0; var9 < arg2.length(); ++var9) {
                if (arg2.charAt(var9) == '@' && var9 + 4 < arg2.length() && arg2.charAt(var9 + 4) == '@') {
                    int var10 = this.method207((byte) 94, arg2.substring(var9 + 1, var9 + 4));
                    if (var10 != -1) {
                        arg5 = var10;
                    }
                    var9 += 4;
                } else {
                    char var11 = arg2.charAt(var9);
                    if (var11 != ' ') {
                        if (arg4) {
                            this.method212(this.field700[var11], this.field703[var11] + arg3 + 1, this.field704[var11] + var8 + 1, this.field701[var11], this.field702[var11], 0);
                        }
                        this.method212(this.field700[var11], this.field703[var11] + arg3, this.field704[var11] + var8, this.field701[var11], this.field702[var11], arg5);
                    }
                    arg3 += this.field705[var11];
                }
            }
            if (arg1 == 0) {
                if (this.field707) {
                    Pix2D.method159(8388608, arg3 - var7, var7, (int) ((double) super.field692 * 0.7D) + var8, (byte) 2);
                }
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZLjava/lang/String;IIIII)V")
    public void method206(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != null) {
            this.field706.setSeed((long) arg4);
            int var8 = 192 + (this.field706.nextInt() & 31);
            if (arg5 == 25755) {
                int var9 = arg2 - super.field692;
                for (int var10 = 0; var10 < arg1.length(); ++var10) {
                    if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                        int var11 = this.method207((byte) 94, arg1.substring(var10 + 1, var10 + 4));
                        if (var11 != -1) {
                            arg3 = var11;
                        }
                        var10 += 4;
                    } else {
                        char var12 = arg1.charAt(var10);
                        if (var12 != ' ') {
                            if (arg0) {
                                this.method214(192, this.field700[var12], this.field703[var12] + arg6 + 1, 0, this.field702[var12], this.field701[var12], this.field704[var12] + var9 + 1, true);
                            }
                            this.method214(var8, this.field700[var12], this.field703[var12] + arg6, arg3, this.field702[var12], this.field701[var12], this.field704[var12] + var9, true);
                        }
                        arg6 += this.field705[var12];
                        if ((this.field706.nextInt() & 3) == 0) {
                            ++arg6;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method207(byte arg0, String arg1) {
        if (arg0 != 94) {
            return 4;
        } else if (arg1.equals("red")) {
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
                this.field707 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "([BIIIII)V")
    private void method212(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
            arg4 -= arg2 + arg4 - Pix2D.field625 + 1;
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
            int var13 = arg1 + arg3 - Pix2D.field627 + 1;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method213(Pix2D.field621, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "([I[BIIIIIII)V")
    private void method213(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 3);
        for (int var12 = -arg6; var12 < 0; ++var12) {
            for (int var13 = var10; var13 < 0; ++var13) {
                if (arg1[arg3++] != 0) {
                    arg0[arg4++] = arg2;
                } else {
                    ++arg4;
                }
                if (arg1[arg3++] != 0) {
                    arg0[arg4++] = arg2;
                } else {
                    ++arg4;
                }
                if (arg1[arg3++] != 0) {
                    arg0[arg4++] = arg2;
                } else {
                    ++arg4;
                }
                if (arg1[arg3++] != 0) {
                    arg0[arg4++] = arg2;
                } else {
                    ++arg4;
                }
            }
            for (int var14 = var11; var14 < 0; ++var14) {
                if (arg1[arg3++] != 0) {
                    arg0[arg4++] = arg2;
                } else {
                    ++arg4;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(I[BIIIIIZ)V")
    private void method214(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var9 = Pix2D.field622 * arg6 + arg2;
        int var10 = Pix2D.field622 - arg5;
        int var11 = 0;
        int var12 = 0;
        if (arg6 < Pix2D.field624) {
            int var13 = Pix2D.field624 - arg6;
            arg4 -= var13;
            arg6 = Pix2D.field624;
            var12 += arg5 * var13;
            var9 += Pix2D.field622 * var13;
        }
        if (arg4 + arg6 >= Pix2D.field625) {
            arg4 -= arg4 + arg6 - Pix2D.field625 + 1;
        }
        if (arg2 < Pix2D.field626) {
            int var14 = Pix2D.field626 - arg2;
            arg5 -= var14;
            arg2 = Pix2D.field626;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg2 + arg5 >= Pix2D.field627) {
            int var15 = arg2 + arg5 - Pix2D.field627 + 1;
            arg5 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg5 > 0 && arg4 > 0) {
            this.method215(var11, arg3, 0, Pix2D.field621, arg5, var12, arg1, arg4, var10, arg0, var9);
            if (!arg7) {
                this.field696 = !this.field696;
            }
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(III[III[BIIII)V")
    private void method215(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg1 & 16711935) * arg9 & -16711936) + ((arg1 & 65280) * arg9 & 16711680) >> 8;
        if (arg2 == 0) {
            int var13 = 256 - arg9;
            for (int var14 = -arg7; var14 < 0; ++var14) {
                for (int var15 = -arg4; var15 < 0; ++var15) {
                    if (arg6[arg5++] != 0) {
                        int var16 = arg3[arg10];
                        arg3[arg10++] = (((var16 & 16711935) * var13 & -16711936) + ((var16 & 65280) * var13 & 16711680) >> 8) + var12;
                    } else {
                        ++arg10;
                    }
                }
                arg10 += arg8;
                arg5 += arg0;
            }
        }
    }
}
