import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class PixFont extends Pix2D {

    @OriginalMember(owner = "jb", name = "v", descriptor = "Z")
    private boolean field590 = false;

    @OriginalMember(owner = "jb", name = "w", descriptor = "B")
    private byte field591 = 5;

    @OriginalMember(owner = "jb", name = "x", descriptor = "I")
    private int field592 = 931;

    @OriginalMember(owner = "jb", name = "y", descriptor = "[[B")
    public byte[][] field593 = new byte[94][];

    @OriginalMember(owner = "jb", name = "z", descriptor = "[I")
    public int[] field594 = new int[94];

    @OriginalMember(owner = "jb", name = "A", descriptor = "[I")
    public int[] field595 = new int[94];

    @OriginalMember(owner = "jb", name = "B", descriptor = "[I")
    public int[] field596 = new int[94];

    @OriginalMember(owner = "jb", name = "C", descriptor = "[I")
    public int[] field597 = new int[94];

    @OriginalMember(owner = "jb", name = "D", descriptor = "[I")
    public int[] field598 = new int[95];

    @OriginalMember(owner = "jb", name = "E", descriptor = "[I")
    public int[] field599 = new int[256];

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "jb", name = "G", descriptor = "[I")
    public static int[] field601 = new int[256];

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Ljava/lang/String;Lub;I)V")
    public PixFont(String arg0, Jagfile arg1, int arg2) {
        Packet var4 = new Packet(575, arg1.method250(null, 3, arg0 + ".dat"));
        Packet var5 = new Packet(575, arg1.method250(null, 3, "index.dat"));
        var5.field612 = var4.method211() + 4;
        int var6 = var5.method209();
        if (arg2 >= 0) {
            throw new NullPointerException();
        }
        if (var6 > 0) {
            var5.field612 += (var6 - 1) * 3;
        }
        for (int var7 = 0; var7 < 94; var7++) {
            this.field596[var7] = var5.method209();
            this.field597[var7] = var5.method209();
            int var9 = this.field594[var7] = var5.method211();
            int var10 = this.field595[var7] = var5.method211();
            int var11 = var5.method209();
            int var12 = var9 * var10;
            this.field593[var7] = new byte[var12];
            if (var11 == 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field593[var7][var13] = var4.method210();
                }
            } else if (var11 == 1) {
                for (int var14 = 0; var14 < var9; var14++) {
                    for (int var15 = 0; var15 < var10; var15++) {
                        this.field593[var7][var9 * var15 + var14] = var4.method210();
                    }
                }
            }
            if (var10 > this.field600) {
                this.field600 = var10;
            }
            this.field596[var7] = 1;
            this.field598[var7] = var9 + 2;
            int var16 = 0;
            for (int var17 = var10 / 7; var17 < var10; var17++) {
                var16 += this.field593[var7][var9 * var17];
            }
            int var10002;
            if (var16 <= var10 / 7) {
                var10002 = this.field598[var7]--;
                this.field596[var7] = 0;
            }
            int var18 = 0;
            for (int var19 = var10 / 7; var19 < var10; var19++) {
                var18 += this.field593[var7][var9 * var19 + var9 - 1];
            }
            if (var18 <= var10 / 7) {
                var10002 = this.field598[var7]--;
            }
        }
        this.field598[94] = this.field598[8];
        for (int var8 = 0; var8 < 256; var8++) {
            this.field599[var8] = this.field598[field601[var8]];
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Ljava/lang/String;IIZI)V")
    public void method188(String arg0, int arg1, int arg2, boolean arg3, int arg4) {
        this.method191(1, arg4, arg2 - this.method190(arg0, (byte) 3) / 2, arg0, arg1);
        if (!arg3) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(BLjava/lang/String;IIIZ)V")
    public void method189(byte arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method193(931, arg5, arg1, arg4, arg3 - this.method190(arg1, (byte) 3) / 2, arg2);
        if (this.field591 == arg0) {
            boolean var7 = false;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method190(String arg0, byte arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 != 3) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            if (arg0.charAt(var5) == '@' && var5 + 4 < arg0.length() && arg0.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var3 += this.field599[arg0.charAt(var5)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method191(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg3 == null) {
            return;
        }
        int var6 = arg4 - this.field600;
        for (int var7 = 0; var7 < arg3.length(); var7++) {
            int var8 = field601[arg3.charAt(var7)];
            if (var8 != 94) {
                this.method194(this.field593[var8], this.field596[var8] + arg2, this.field597[var8] + var6, this.field594[var8], this.field595[var8], arg1);
            }
            arg2 += this.field598[var8];
        }
        if (arg0 == 1) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method192(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg4 - this.method190(arg1, (byte) 3) / 2;
        int var8 = arg5 - this.field600;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var11 = field601[arg1.charAt(var9)];
            if (var11 != 94) {
                this.method194(this.field593[var11], this.field596[var11] + var7, this.field597[var11] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field594[var11], this.field595[var11], arg0);
            }
            var7 += this.field598[var11];
        }
        if (arg3 <= 0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IZLjava/lang/String;III)V")
    public void method193(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg2 == null) {
            return;
        }
        int var7 = arg3 - this.field600;
        for (int var8 = 0; var8 < arg2.length(); var8++) {
            if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
                String var10 = arg2.substring(var8 + 1, var8 + 4);
                if (var10.equals("red")) {
                    arg5 = 16711680;
                }
                if (var10.equals("gre")) {
                    arg5 = 65280;
                }
                if (var10.equals("blu")) {
                    arg5 = 255;
                }
                if (var10.equals("yel")) {
                    arg5 = 16776960;
                }
                if (var10.equals("cya")) {
                    arg5 = 65535;
                }
                if (var10.equals("mag")) {
                    arg5 = 16711935;
                }
                if (var10.equals("whi")) {
                    arg5 = 16777215;
                }
                if (var10.equals("bla")) {
                    arg5 = 0;
                }
                if (var10.equals("lre")) {
                    arg5 = 16748608;
                }
                if (var10.equals("dre")) {
                    arg5 = 8388608;
                }
                if (var10.equals("dbl")) {
                    arg5 = 128;
                }
                if (var10.equals("or1")) {
                    arg5 = 16756736;
                }
                if (var10.equals("or2")) {
                    arg5 = 16740352;
                }
                if (var10.equals("or3")) {
                    arg5 = 16723968;
                }
                if (var10.equals("gr1")) {
                    arg5 = 12648192;
                }
                if (var10.equals("gr2")) {
                    arg5 = 8453888;
                }
                if (var10.equals("gr3")) {
                    arg5 = 4259584;
                }
                var8 += 4;
            } else {
                int var11 = field601[arg2.charAt(var8)];
                if (var11 != 94) {
                    if (arg1) {
                        this.method194(this.field593[var11], this.field596[var11] + arg4 + 1, this.field597[var11] + var7 + 1, this.field594[var11], this.field595[var11], 0);
                    }
                    this.method194(this.field593[var11], this.field596[var11] + arg4, this.field597[var11] + var7, this.field594[var11], this.field595[var11], arg5);
                }
                arg4 += this.field598[var11];
            }
        }
        int var9 = 95 / arg0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([BIIIII)V")
    private void method194(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Pix2D.field533 * arg2 + arg1;
        int var8 = Pix2D.field533 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Pix2D.field535) {
            int var11 = Pix2D.field535 - arg2;
            arg4 -= var11;
            arg2 = Pix2D.field535;
            var10 += arg3 * var11;
            var7 += Pix2D.field533 * var11;
        }
        if (arg2 + arg4 >= Pix2D.field536) {
            arg4 -= arg2 + arg4 + 1 - Pix2D.field536;
        }
        if (arg1 < Pix2D.field537) {
            int var12 = Pix2D.field537 - arg1;
            arg3 -= var12;
            arg1 = Pix2D.field537;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Pix2D.field538) {
            int var13 = arg1 + arg3 + 1 - Pix2D.field538;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method195(Pix2D.field532, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
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
            field601[var1] = var2;
        }
    }
}
