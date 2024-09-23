import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "jb", name = "y", descriptor = "Z")
    private boolean field602 = true;

    @OriginalMember(owner = "jb", name = "z", descriptor = "[[B")
    public byte[][] field603 = new byte[94][];

    @OriginalMember(owner = "jb", name = "A", descriptor = "[I")
    public int[] field604 = new int[94];

    @OriginalMember(owner = "jb", name = "B", descriptor = "[I")
    public int[] field605 = new int[94];

    @OriginalMember(owner = "jb", name = "C", descriptor = "[I")
    public int[] field606 = new int[94];

    @OriginalMember(owner = "jb", name = "D", descriptor = "[I")
    public int[] field607 = new int[94];

    @OriginalMember(owner = "jb", name = "E", descriptor = "[I")
    public int[] field608 = new int[95];

    @OriginalMember(owner = "jb", name = "F", descriptor = "[I")
    public int[] field609 = new int[256];

    @OriginalMember(owner = "jb", name = "x", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "jb", name = "G", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "jb", name = "H", descriptor = "[I")
    public static int[] field611 = new int[256];

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Ljava/lang/String;Lub;I)V")
    public PixFont(String arg0, Jagfile arg1, int arg2) {
        Packet var4 = new Packet(arg1.method249(arg0 + ".dat", true, null), this.field602);
        Packet var5 = new Packet(arg1.method249("index.dat", true, null), this.field602);
        var5.field622 = var4.method210() + 4;
        int var6 = var5.method208();
        if (var6 > 0) {
            var5.field622 += (var6 - 1) * 3;
        }
        for (int var7 = 0; var7 < 94; var7++) {
            this.field606[var7] = var5.method208();
            this.field607[var7] = var5.method208();
            int var9 = this.field604[var7] = var5.method210();
            int var10 = this.field605[var7] = var5.method210();
            int var11 = var5.method208();
            int var12 = var9 * var10;
            this.field603[var7] = new byte[var12];
            if (var11 == 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field603[var7][var13] = var4.method209();
                }
            } else if (var11 == 1) {
                for (int var14 = 0; var14 < var9; var14++) {
                    for (int var15 = 0; var15 < var10; var15++) {
                        this.field603[var7][var9 * var15 + var14] = var4.method209();
                    }
                }
            }
            if (var10 > this.field610) {
                this.field610 = var10;
            }
            this.field606[var7] = 1;
            this.field608[var7] = var9 + 2;
            int var16 = 0;
            for (int var17 = var10 / 7; var17 < var10; var17++) {
                var16 += this.field603[var7][var9 * var17];
            }
            int var10002;
            if (var16 <= var10 / 7) {
                var10002 = this.field608[var7]--;
                this.field606[var7] = 0;
            }
            int var18 = 0;
            for (int var19 = var10 / 7; var19 < var10; var19++) {
                var18 += this.field603[var7][var9 * var19 + var9 - 1];
            }
            if (var18 <= var10 / 7) {
                var10002 = this.field608[var7]--;
            }
        }
        if (arg2 != -37957) {
            this.field601 = 179;
        }
        this.field608[94] = this.field608[8];
        for (int var8 = 0; var8 < 256; var8++) {
            this.field609[var8] = this.field608[field611[var8]];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Ljava/lang/String;IIBI)V")
    public void method187(String arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 == 0) {
            boolean var6 = false;
            this.method190(arg0, arg2 - this.method189(0, arg0) / 2, -729, arg1, arg4);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ILjava/lang/String;ZIZI)V")
    public void method188(int arg0, String arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        if (!arg2) {
            this.method192(arg4, arg3, false, arg5 - this.method189(0, arg1) / 2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method189(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field601 = -397;
        }
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field609[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method190(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg3 - this.field610;
        if (arg2 >= 0) {
            return;
        }
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            int var8 = field611[arg0.charAt(var7)];
            if (var8 != 94) {
                this.method193(this.field603[var8], this.field606[var8] + arg1, this.field607[var8] + var6, this.field604[var8], this.field605[var8], arg4);
            }
            arg1 += this.field608[var8];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method191(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg1 - this.method189(0, arg0) / 2;
        int var8 = arg2 - this.field610;
        if (arg4 != 0) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            int var10 = field611[arg0.charAt(var9)];
            if (var10 != 94) {
                this.method193(this.field603[var10], this.field606[var10] + var7, this.field607[var10] + var8 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field604[var10], this.field605[var10], arg3);
            }
            var7 += this.field608[var10];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ZIZIILjava/lang/String;)V")
    public void method192(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg4 - this.field610;
        if (arg2) {
            return;
        }
        for (int var8 = 0; var8 < arg5.length(); var8++) {
            if (arg5.charAt(var8) == '@' && var8 + 4 < arg5.length() && arg5.charAt(var8 + 4) == '@') {
                String var9 = arg5.substring(var8 + 1, var8 + 4);
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
                int var10 = field611[arg5.charAt(var8)];
                if (var10 != 94) {
                    if (arg0) {
                        this.method193(this.field603[var10], this.field606[var10] + arg3 + 1, this.field607[var10] + var7 + 1, this.field604[var10], this.field605[var10], 0);
                    }
                    this.method193(this.field603[var10], this.field606[var10] + arg3, this.field607[var10] + var7, this.field604[var10], this.field605[var10], arg1);
                }
                arg3 += this.field608[var10];
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([BIIIII)V")
    private void method193(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
            this.method194(Pix2D.field534, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method194(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
            field611[var1] = var2;
        }
    }
}
