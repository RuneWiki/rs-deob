import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "jb", name = "x", descriptor = "Z")
    private boolean field598 = false;

    @OriginalMember(owner = "jb", name = "y", descriptor = "I")
    private int field599 = 958;

    @OriginalMember(owner = "jb", name = "z", descriptor = "Z")
    private boolean field600 = true;

    @OriginalMember(owner = "jb", name = "A", descriptor = "[[B")
    public byte[][] field601 = new byte[94][];

    @OriginalMember(owner = "jb", name = "B", descriptor = "[I")
    public int[] field602 = new int[94];

    @OriginalMember(owner = "jb", name = "C", descriptor = "[I")
    public int[] field603 = new int[94];

    @OriginalMember(owner = "jb", name = "D", descriptor = "[I")
    public int[] field604 = new int[94];

    @OriginalMember(owner = "jb", name = "E", descriptor = "[I")
    public int[] field605 = new int[94];

    @OriginalMember(owner = "jb", name = "F", descriptor = "[I")
    public int[] field606 = new int[95];

    @OriginalMember(owner = "jb", name = "G", descriptor = "[I")
    public int[] field607 = new int[256];

    @OriginalMember(owner = "jb", name = "H", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "jb", name = "I", descriptor = "[I")
    public static int[] field609 = new int[256];

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Ljava/lang/String;ILub;)V")
    public PixFont(String arg0, int arg1, Jagfile arg2) {
        Packet var4 = new Packet(0, arg2.method250(arg0 + ".dat", null, 8));
        Packet var5 = new Packet(0, arg2.method250("index.dat", null, 8));
        var5.field621 = var4.method211() + 4;
        int var6 = var5.method209();
        if (var6 > 0) {
            var5.field621 += (var6 - 1) * 3;
        }
        for (int var7 = 0; var7 < 94; var7++) {
            this.field604[var7] = var5.method209();
            this.field605[var7] = var5.method209();
            int var9 = this.field602[var7] = var5.method211();
            int var10 = this.field603[var7] = var5.method211();
            int var11 = var5.method209();
            int var12 = var9 * var10;
            this.field601[var7] = new byte[var12];
            if (var11 == 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field601[var7][var13] = var4.method210();
                }
            } else if (var11 == 1) {
                for (int var14 = 0; var14 < var9; var14++) {
                    for (int var15 = 0; var15 < var10; var15++) {
                        this.field601[var7][var9 * var15 + var14] = var4.method210();
                    }
                }
            }
            if (var10 > this.field608) {
                this.field608 = var10;
            }
            this.field604[var7] = 1;
            this.field606[var7] = var9 + 2;
            int var16 = 0;
            for (int var17 = var10 / 7; var17 < var10; var17++) {
                var16 += this.field601[var7][var9 * var17];
            }
            int var10002;
            if (var16 <= var10 / 7) {
                var10002 = this.field606[var7]--;
                this.field604[var7] = 0;
            }
            int var18 = 0;
            for (int var19 = var10 / 7; var19 < var10; var19++) {
                var18 += this.field601[var7][var9 * var19 + var9 - 1];
            }
            if (var18 <= var10 / 7) {
                var10002 = this.field606[var7]--;
            }
        }
        this.field606[94] = this.field606[8];
        if (arg1 != -10272) {
            this.field598 = !this.field598;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            this.field607[var8] = this.field606[field609[var8]];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method188(int arg0, int arg1, int arg2, String arg3, int arg4) {
        this.method191(arg1 - this.method190(arg3, true) / 2, arg4, (byte) 6, arg3, arg2);
        if (arg0 != 12097) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ILjava/lang/String;ZIBI)V")
    public void method189(int arg0, String arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        this.method193(arg5 - this.method190(arg1, true) / 2, arg3, arg0, arg1, 0, arg2);
        if (arg4 != 62) {
            this.field599 = -260;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method190(String arg0, boolean arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field607[arg0.charAt(var4)];
            }
        }
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        return var3;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIBLjava/lang/String;I)V")
    public void method191(int arg0, int arg1, byte arg2, String arg3, int arg4) {
        if (arg2 != 6 || arg3 == null) {
            return;
        }
        int var6 = arg4 - this.field608;
        for (int var7 = 0; var7 < arg3.length(); var7++) {
            int var8 = field609[arg3.charAt(var7)];
            if (var8 != 94) {
                this.method194(this.field601[var8], this.field604[var8] + arg0, this.field605[var8] + var6, this.field602[var8], this.field603[var8], arg1);
            }
            arg0 += this.field606[var8];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public void method192(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg0 <= 0 || arg3 == null) {
            return;
        }
        int var7 = arg1 - this.method190(arg3, true) / 2;
        int var8 = arg2 - this.field608;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            int var10 = field609[arg3.charAt(var9)];
            if (var10 != 94) {
                this.method194(this.field601[var10], this.field604[var10] + var7, this.field605[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field602[var10], this.field603[var10], arg5);
            }
            var7 += this.field606[var10];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
    public void method193(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg2 - this.field608;
        if (arg4 != 0) {
            this.field598 = !this.field598;
        }
        for (int var8 = 0; var8 < arg3.length(); var8++) {
            if (arg3.charAt(var8) == '@' && var8 + 4 < arg3.length() && arg3.charAt(var8 + 4) == '@') {
                String var9 = arg3.substring(var8 + 1, var8 + 4);
                if (var9.equals("red")) {
                    arg1 = 16711680;
                }
                if (var9.equals("gre")) {
                    arg1 = 65280;
                }
                if (var9.equals("blu")) {
                    arg1 = 255;
                }
                if (var9.equals("yel")) {
                    arg1 = 16776960;
                }
                if (var9.equals("cya")) {
                    arg1 = 65535;
                }
                if (var9.equals("mag")) {
                    arg1 = 16711935;
                }
                if (var9.equals("whi")) {
                    arg1 = 16777215;
                }
                if (var9.equals("bla")) {
                    arg1 = 0;
                }
                if (var9.equals("lre")) {
                    arg1 = 16748608;
                }
                if (var9.equals("dre")) {
                    arg1 = 8388608;
                }
                if (var9.equals("dbl")) {
                    arg1 = 128;
                }
                if (var9.equals("or1")) {
                    arg1 = 16756736;
                }
                if (var9.equals("or2")) {
                    arg1 = 16740352;
                }
                if (var9.equals("or3")) {
                    arg1 = 16723968;
                }
                if (var9.equals("gr1")) {
                    arg1 = 12648192;
                }
                if (var9.equals("gr2")) {
                    arg1 = 8453888;
                }
                if (var9.equals("gr3")) {
                    arg1 = 4259584;
                }
                var8 += 4;
            } else {
                int var10 = field609[arg3.charAt(var8)];
                if (var10 != 94) {
                    if (arg5) {
                        this.method194(this.field601[var10], this.field604[var10] + arg0 + 1, this.field605[var10] + var7 + 1, this.field602[var10], this.field603[var10], 0);
                    }
                    this.method194(this.field601[var10], this.field604[var10] + arg0, this.field605[var10] + var7, this.field602[var10], this.field603[var10], arg1);
                }
                arg0 += this.field606[var10];
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([BIIIII)V")
    private void method194(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field535 * arg2 + arg1;
        int var8 = Pix2D.field535 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field537) {
            int var11 = Pix2D.field537 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field537;
            var10 += arg3 * var11;
            var7 += Pix2D.field535 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field538) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field538;
        }
        if (arg1 < Pix2D.field539) {
            int var12 = Pix2D.field539 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field539;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field540) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field540;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method195(Pix2D.field534, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method195(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
            field609[var1] = var2;
        }
    }
}
