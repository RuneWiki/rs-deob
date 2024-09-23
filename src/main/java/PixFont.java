import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "jb", name = "v", descriptor = "I")
    private int field585 = -886;

    @OriginalMember(owner = "jb", name = "w", descriptor = "Z")
    private boolean field586 = false;

    @OriginalMember(owner = "jb", name = "x", descriptor = "[[B")
    public byte[][] field587 = new byte[94][];

    @OriginalMember(owner = "jb", name = "y", descriptor = "[I")
    public int[] field588 = new int[94];

    @OriginalMember(owner = "jb", name = "z", descriptor = "[I")
    public int[] field589 = new int[94];

    @OriginalMember(owner = "jb", name = "A", descriptor = "[I")
    public int[] field590 = new int[94];

    @OriginalMember(owner = "jb", name = "B", descriptor = "[I")
    public int[] field591 = new int[94];

    @OriginalMember(owner = "jb", name = "C", descriptor = "[I")
    public int[] field592 = new int[95];

    @OriginalMember(owner = "jb", name = "D", descriptor = "[I")
    public int[] field593 = new int[256];

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "jb", name = "F", descriptor = "[I")
    public static int[] field595 = new int[256];

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(ZLub;Ljava/lang/String;)V")
    public PixFont(boolean arg0, Jagfile arg1, String arg2) {
        Packet var4 = new Packet(arg1.method242((byte) 6, null, arg2 + ".dat"), 4);
        Packet var5 = new Packet(arg1.method242((byte) 6, null, "index.dat"), 4);
        var5.field606 = var4.method203() + 4;
        if (!arg0) {
            this.field585 = 467;
        }
        int var6 = var5.method201();
        if (var6 > 0) {
            var5.field606 += (var6 - 1) * 3;
        }
        for (int var7 = 0; var7 < 94; var7++) {
            this.field590[var7] = var5.method201();
            this.field591[var7] = var5.method201();
            int var9 = this.field588[var7] = var5.method203();
            int var10 = this.field589[var7] = var5.method203();
            int var11 = var5.method201();
            int var12 = var9 * var10;
            this.field587[var7] = new byte[var12];
            if (var11 == 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field587[var7][var13] = var4.method202();
                }
            } else if (var11 == 1) {
                for (int var14 = 0; var14 < var9; var14++) {
                    for (int var15 = 0; var15 < var10; var15++) {
                        this.field587[var7][var9 * var15 + var14] = var4.method202();
                    }
                }
            }
            if (var10 > this.field594) {
                this.field594 = var10;
            }
            this.field590[var7] = 1;
            this.field592[var7] = var9 + 2;
            int var16 = 0;
            for (int var17 = var10 / 7; var17 < var10; var17++) {
                var16 += this.field587[var7][var9 * var17];
            }
            int var10002;
            if (var16 <= var10 / 7) {
                var10002 = this.field592[var7]--;
                this.field590[var7] = 0;
            }
            int var18 = 0;
            for (int var19 = var10 / 7; var19 < var10; var19++) {
                var18 += this.field587[var7][var9 * var19 + var9 - 1];
            }
            if (var18 <= var10 / 7) {
                var10002 = this.field592[var7]--;
            }
        }
        this.field592[94] = this.field592[8];
        for (int var8 = 0; var8 < 256; var8++) {
            this.field593[var8] = this.field592[field595[var8]];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ZIIILjava/lang/String;)V")
    public void method182(boolean arg0, int arg1, int arg2, int arg3, String arg4) {
        if (!arg0) {
            this.field586 = !this.field586;
        }
        this.method185(arg4, arg3 - this.method184(arg4, true) / 2, arg2, true, arg1);
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
    public void method183(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5) {
        if (arg4 != 26631) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.method187(-886, arg5, arg1 - this.method184(arg3, true) / 2, arg2, arg0, arg3);
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method184(String arg0, boolean arg1) {
        if (!arg1) {
            return 1;
        } else if (arg0 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                    var4 += 4;
                } else {
                    var3 += this.field593[arg0.charAt(var4)];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Ljava/lang/String;IIZI)V")
    public void method185(String arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg4 - this.field594;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            int var8 = field595[arg0.charAt(var7)];
            if (var8 != 94) {
                this.method188(this.field587[var8], this.field590[var8] + arg1, this.field591[var8] + var6, this.field588[var8], this.field589[var8], arg2);
            }
            arg1 += this.field592[var8];
        }
        if (arg3) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public void method186(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg0 < 9 || arg0 > 9) {
            this.field585 = 32;
        }
        if (arg3 == null) {
            return;
        }
        int var7 = arg5 - this.method184(arg3, true) / 2;
        int var8 = arg1 - this.field594;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            int var10 = field595[arg3.charAt(var9)];
            if (var10 != 94) {
                this.method188(this.field587[var10], this.field590[var10] + var7, this.field591[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field588[var10], this.field589[var10], arg2);
            }
            var7 += this.field592[var10];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IZIIILjava/lang/String;)V")
    public void method187(int arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5) {
        label114: while (true) {
            if (arg0 >= 0) {
                int var11 = 1;
                while (true) {
                    if (var11 <= 0) {
                        continue label114;
                    }
                    var11++;
                }
            }
            if (arg5 == null) {
                return;
            }
            int var7 = arg4 - this.field594;
            for (int var8 = 0; var8 < arg5.length(); var8++) {
                if (arg5.charAt(var8) == '@' && var8 + 4 < arg5.length() && arg5.charAt(var8 + 4) == '@') {
                    String var9 = arg5.substring(var8 + 1, var8 + 4);
                    if (var9.equals("red")) {
                        arg3 = 16711680;
                    }
                    if (var9.equals("gre")) {
                        arg3 = 65280;
                    }
                    if (var9.equals("blu")) {
                        arg3 = 255;
                    }
                    if (var9.equals("yel")) {
                        arg3 = 16776960;
                    }
                    if (var9.equals("cya")) {
                        arg3 = 65535;
                    }
                    if (var9.equals("mag")) {
                        arg3 = 16711935;
                    }
                    if (var9.equals("whi")) {
                        arg3 = 16777215;
                    }
                    if (var9.equals("bla")) {
                        arg3 = 0;
                    }
                    if (var9.equals("lre")) {
                        arg3 = 16748608;
                    }
                    if (var9.equals("dre")) {
                        arg3 = 8388608;
                    }
                    if (var9.equals("dbl")) {
                        arg3 = 128;
                    }
                    if (var9.equals("or1")) {
                        arg3 = 16756736;
                    }
                    if (var9.equals("or2")) {
                        arg3 = 16740352;
                    }
                    if (var9.equals("or3")) {
                        arg3 = 16723968;
                    }
                    if (var9.equals("gr1")) {
                        arg3 = 12648192;
                    }
                    if (var9.equals("gr2")) {
                        arg3 = 8453888;
                    }
                    if (var9.equals("gr3")) {
                        arg3 = 4259584;
                    }
                    var8 += 4;
                } else {
                    int var10 = field595[arg5.charAt(var8)];
                    if (var10 != 94) {
                        if (arg1) {
                            this.method188(this.field587[var10], this.field590[var10] + arg2 + 1, this.field591[var10] + var7 + 1, this.field588[var10], this.field589[var10], 0);
                        }
                        this.method188(this.field587[var10], this.field590[var10] + arg2, this.field591[var10] + var7, this.field588[var10], this.field589[var10], arg3);
                    }
                    arg2 += this.field592[var10];
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([BIIIII)V")
    private void method188(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field523 * arg2 + arg1;
        int var8 = Pix2D.field523 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field525) {
            int var11 = Pix2D.field525 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field525;
            var10 += arg3 * var11;
            var7 += Pix2D.field523 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field526) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field526;
        }
        if (arg1 < Pix2D.field527) {
            int var12 = Pix2D.field527 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field527;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field528) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field528;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method189(Pix2D.field522, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method189(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }
            field595[var1] = var2;
        }
    }
}
