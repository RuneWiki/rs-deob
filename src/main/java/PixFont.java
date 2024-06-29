import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class PixFont extends Draw2D {

    @OriginalMember(owner = "mapview!j", name = "p", descriptor = "[[B")
    public byte[][] field75 = new byte[94][];

    @OriginalMember(owner = "mapview!j", name = "q", descriptor = "[I")
    public int[] field76 = new int[94];

    @OriginalMember(owner = "mapview!j", name = "r", descriptor = "[I")
    public int[] field77 = new int[94];

    @OriginalMember(owner = "mapview!j", name = "s", descriptor = "[I")
    public int[] field78 = new int[94];

    @OriginalMember(owner = "mapview!j", name = "t", descriptor = "[I")
    public int[] field79 = new int[94];

    @OriginalMember(owner = "mapview!j", name = "u", descriptor = "[I")
    public int[] field80 = new int[95];

    @OriginalMember(owner = "mapview!j", name = "v", descriptor = "[I")
    public int[] field81 = new int[256];

    @OriginalMember(owner = "mapview!j", name = "w", descriptor = "I")
    public int field82 = 0;

    @OriginalMember(owner = "mapview!j", name = "x", descriptor = "Ljava/util/Random;")
    public Random field83 = new Random();

    @OriginalMember(owner = "mapview!j", name = "y", descriptor = "Z")
    public boolean field84 = false;

    @OriginalMember(owner = "mapview!j", name = "z", descriptor = "[I")
    public static int[] field85 = new int[256];

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/lang/String;III)V")
    public void method49(String arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field82;
        for (int var6 = 0; var6 < arg0.length(); var6++) {
            int var7 = field85[arg0.charAt(var6)];
            if (var7 != 94) {
                this.method52(this.field75[var7], this.field78[var7] + arg1, this.field79[var7] + var5, this.field76[var7], this.field77[var7], arg3);
            }
            arg1 += this.field80[var7];
        }
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "(Lp;Ljava/lang/String;)V")
    public PixFont(Jagfile arg0, String arg1) {
        Packet var3 = new Packet(arg0.method76(arg1 + ".dat", null));
        Packet var4 = new Packet(arg0.method76("index.dat", null));
        boolean var5 = true;
        var4.field87 = var3.method57() + 4;
        int var6 = var4.method55();
        if (var6 > 0) {
            var4.field87 += (var6 - 1) * 3;
        }
        for (int var7 = 0; var7 < 94; var7++) {
            this.field78[var7] = var4.method55();
            this.field79[var7] = var4.method55();
            int var10 = this.field76[var7] = var4.method57();
            int var11 = this.field77[var7] = var4.method57();
            int var12 = var4.method55();
            int var13 = var10 * var11;
            this.field75[var7] = new byte[var13];
            if (var12 == 0) {
                for (int var14 = 0; var14 < var13; var14++) {
                    this.field75[var7][var14] = var3.method56();
                }
            } else if (var12 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        this.field75[var7][var10 * var16 + var15] = var3.method56();
                    }
                }
            }
            if (var11 > this.field82) {
                this.field82 = var11;
            }
            this.field78[var7] = 1;
            this.field80[var7] = var10 + 2;
            int var17 = 0;
            for (int var18 = var11 / 7; var18 < var11; var18++) {
                var17 += this.field75[var7][var10 * var18];
            }
            if (var17 <= var11 / 7) {
                this.field80[var7] += -1;
                this.field78[var7] = 0;
            }
            int var19 = 0;
            for (int var20 = var11 / 7; var20 < var11; var20++) {
                var19 += this.field75[var7][var10 * var20 + var10 - 1];
            }
            if (var19 <= var11 / 7) {
                this.field80[var7] += -1;
            }
        }
        this.field80[94] = this.field80[8];
        for (int var8 = 0; var8 < 256; var8++) {
            this.field81[var8] = this.field80[field85[var8]];
        }
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(Ljava/lang/String;III)V")
    public void method50(String arg0, int arg1, int arg2, int arg3) {
        this.method49(arg0, arg1 - this.method51(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/lang/String;)I")
    public int method51(String arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
                var3 += 4;
            } else {
                var2 += this.field81[arg0.charAt(var3)];
            }
        }
        return var2;
    }

    static {
        String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = var0.indexOf(var1);
            if (var2 == -1) {
                var2 = 74;
            }
            field85[var1] = var2;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([BIIIII)V")
    private void method52(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Draw2D.field46 * arg2 + arg1;
        int var8 = Draw2D.field46 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Draw2D.field48) {
            int var11 = Draw2D.field48 - arg2;
            arg4 -= var11;
            arg2 = Draw2D.field48;
            var10 += arg3 * var11;
            var7 += Draw2D.field46 * var11;
        }
        if (arg2 + arg4 >= Draw2D.field49) {
            arg4 -= arg2 + arg4 + 1 - Draw2D.field49;
        }
        if (arg1 < Draw2D.field50) {
            int var12 = Draw2D.field50 - arg1;
            arg3 -= var12;
            arg1 = Draw2D.field50;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Draw2D.field51) {
            int var13 = arg1 + arg3 + 1 - Draw2D.field51;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method53(Draw2D.field45, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method53(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
