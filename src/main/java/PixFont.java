import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class PixFont extends Draw2D {

    @OriginalMember(owner = "mapview!i", name = "p", descriptor = "[[B")
    public byte[][] field67 = new byte[256][];

    @OriginalMember(owner = "mapview!i", name = "q", descriptor = "[I")
    public int[] field68 = new int[256];

    @OriginalMember(owner = "mapview!i", name = "r", descriptor = "[I")
    public int[] field69 = new int[256];

    @OriginalMember(owner = "mapview!i", name = "s", descriptor = "[I")
    public int[] field70 = new int[256];

    @OriginalMember(owner = "mapview!i", name = "t", descriptor = "[I")
    public int[] field71 = new int[256];

    @OriginalMember(owner = "mapview!i", name = "u", descriptor = "[I")
    public int[] field72 = new int[256];

    @OriginalMember(owner = "mapview!i", name = "v", descriptor = "I")
    public int field73 = 0;

    @OriginalMember(owner = "mapview!i", name = "w", descriptor = "Ljava/util/Random;")
    public Random field74 = new Random();

    @OriginalMember(owner = "mapview!i", name = "x", descriptor = "Z")
    public boolean field75 = false;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/lang/String;III)V")
    public void method38(String arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field73;
        for (int var6 = 0; var6 < arg0.length(); var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 != ' ') {
                this.method42(this.field67[var7], this.field70[var7] + arg1, this.field71[var7] + var5, this.field68[var7], this.field69[var7], arg3);
            }
            arg1 += this.field72[var7];
        }
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "(Lo;Ljava/lang/String;Z)V")
    public PixFont(Jagfile arg0, String arg1, boolean arg2) {
        Packet var4 = new Packet(arg0.method62(arg1 + ".dat", null));
        Packet var5 = new Packet(arg0.method62("index.dat", null));
        boolean var6 = true;
        var5.field77 = var4.method47() + 4;
        int var7 = var5.method45();
        if (var7 > 0) {
            var5.field77 += (var7 - 1) * 3;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            this.field70[var8] = var5.method45();
            this.field71[var8] = var5.method45();
            int var10 = this.field68[var8] = var5.method47();
            int var11 = this.field69[var8] = var5.method47();
            int var12 = var5.method45();
            int var13 = var10 * var11;
            this.field67[var8] = new byte[var13];
            if (var12 == 0) {
                for (int var14 = 0; var14 < var13; var14++) {
                    this.field67[var8][var14] = var4.method46();
                }
            } else if (var12 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        this.field67[var8][var10 * var16 + var15] = var4.method46();
                    }
                }
            }
            if (var11 > this.field73 && var8 < 128) {
                this.field73 = var11;
            }
            this.field70[var8] = 1;
            this.field72[var8] = var10 + 2;
            int var17 = 0;
            for (int var18 = var11 / 7; var18 < var11; var18++) {
                var17 += this.field67[var8][var10 * var18];
            }
            if (var17 <= var11 / 7) {
                this.field72[var8] += -1;
                this.field70[var8] = 0;
            }
            int var19 = 0;
            for (int var20 = var11 / 7; var20 < var11; var20++) {
                var19 += this.field67[var8][var10 * var20 + var10 - 1];
            }
            if (var19 <= var11 / 7) {
                this.field72[var8] += -1;
            }
        }
        if (arg2) {
            this.field72[32] = this.field72[73];
        } else {
            this.field72[32] = this.field72[105];
        }
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(Ljava/lang/String;III)V")
    public void method39(String arg0, int arg1, int arg2, int arg3) {
        this.method38(arg0, arg1 - this.method41(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "(Ljava/lang/String;III)V")
    public void method40(String arg0, int arg1, int arg2, int arg3) {
        this.method38(arg0, arg1 - this.method41(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/lang/String;)I")
    public int method41(String arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
                var3 += 4;
            } else {
                var2 += this.field72[arg0.charAt(var3)];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "([BIIIII)V")
    private void method42(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Draw2D.field38 * arg2 + arg1;
        int var8 = Draw2D.field38 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Draw2D.field40) {
            int var11 = Draw2D.field40 - arg2;
            arg4 -= var11;
            arg2 = Draw2D.field40;
            var10 += arg3 * var11;
            var7 += Draw2D.field38 * var11;
        }
        if (arg2 + arg4 >= Draw2D.field41) {
            arg4 -= arg2 + arg4 + 1 - Draw2D.field41;
        }
        if (arg1 < Draw2D.field42) {
            int var12 = Draw2D.field42 - arg1;
            arg3 -= var12;
            arg1 = Draw2D.field42;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Draw2D.field43) {
            int var13 = arg1 + arg3 + 1 - Draw2D.field43;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method43(Draw2D.field37, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method43(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
}
