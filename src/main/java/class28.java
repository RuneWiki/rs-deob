import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 extends class68 {

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "[[B")
    private byte[][] field577 = new byte[256][];

    @OriginalMember(owner = "client!df", name = "yb", descriptor = "I")
    public int field592 = 0;

    @OriginalMember(owner = "client!df", name = "vb", descriptor = "Ljava/util/Random;")
    private Random field589 = new Random();

    @OriginalMember(owner = "client!df", name = "Eb", descriptor = "Z")
    private boolean field598 = false;

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "[I")
    private int[] field579;

    @OriginalMember(owner = "client!df", name = "tb", descriptor = "[I")
    private int[] field587;

    @OriginalMember(owner = "client!df", name = "rb", descriptor = "[I")
    private int[] field585;

    @OriginalMember(owner = "client!df", name = "Db", descriptor = "I")
    private int field597;

    @OriginalMember(owner = "client!df", name = "Cb", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "Lkc;")
    private static class67 field570 = class19.method144("mag", 99);

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "Lkc;")
    private static class67 field575 = class19.method144("bla", 73);

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "Lkc;")
    private static class67 field578 = class19.method144("gre", 76);

    @OriginalMember(owner = "client!df", name = "qb", descriptor = "Lkc;")
    private static class67 field584 = class19.method144("yel", 99);

    @OriginalMember(owner = "client!df", name = "sb", descriptor = "Lkc;")
    private static class67 field586 = class19.method144("gr3", 77);

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "Lkc;")
    private static class67 field574 = class19.method144("str", 120);

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "Lkc;")
    private static class67 field580 = class19.method144("whi", 70);

    @OriginalMember(owner = "client!df", name = "db", descriptor = "Lkc;")
    private static class67 field571 = class19.method144("dbl", 111);

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "Lkc;")
    private static class67 field572 = class19.method144("blu", 72);

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "Lkc;")
    private static class67 field573 = class19.method144("@str@", 112);

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "Lkc;")
    private static class67 field581 = class19.method144("dre", 107);

    @OriginalMember(owner = "client!df", name = "ub", descriptor = "[Lkc;")
    private static class67[] field588 = new class67[100];

    @OriginalMember(owner = "client!df", name = "wb", descriptor = "Lkc;")
    private static class67 field590 = class19.method144("or3", 81);

    @OriginalMember(owner = "client!df", name = "Ab", descriptor = "Lkc;")
    private static class67 field594 = class19.method144("gr1", 95);

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "Lkc;")
    private static class67 field576 = class19.method144("or1", 82);

    @OriginalMember(owner = "client!df", name = "pb", descriptor = "Lkc;")
    private static class67 field583 = class19.method144("cya", 99);

    @OriginalMember(owner = "client!df", name = "Bb", descriptor = "Lkc;")
    private static class67 field595 = class19.method144("lre", 73);

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "Lkc;")
    private static class67 field582 = class19.method144("red", 116);

    @OriginalMember(owner = "client!df", name = "zb", descriptor = "Lkc;")
    private static class67 field593 = class19.method144("or2", 73);

    @OriginalMember(owner = "client!df", name = "xb", descriptor = "Lkc;")
    private static class67 field591 = class19.method144("gr2", 98);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkc;IIIZI)V", line = 3)
    public final void method226(class67 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field589.setSeed((long) arg5);
        int var7 = (this.field589.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field592;
        for (int var9 = 0; var9 < arg0.field1572; var9++) {
            if (arg0.field1597[var9] == 64 && var9 + 4 < arg0.field1572 && arg0.field1597[var9 + 4] == 64) {
                int var10 = this.method228(arg0.method529(var9 + 1, var9 + 4, 17804));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field1597[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method243(this.field577[var11], arg1 + 1, this.field579[var11] + var8 + 1, this.field587[var11], this.field585[var11], 0, 192);
                    }
                    this.method243(this.field577[var11], arg1, this.field579[var11] + var8, this.field587[var11], this.field585[var11], arg3, var7);
                }
                arg1 += this.field587[var11];
                if ((this.field589.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkc;III)V", line = 49)
    public final void method227(class67 arg0, int arg1, int arg2, int arg3) {
        this.method229(arg0, arg1 - this.method231(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkc;)I", line = 54)
    private final int method228(class67 arg0) {
        if (arg0.method533(field582, (byte) -109)) {
            return 16711680;
        } else if (arg0.method533(field578, (byte) -105)) {
            return 65280;
        } else if (arg0.method533(field572, (byte) -122)) {
            return 255;
        } else if (arg0.method533(field584, (byte) -100)) {
            return 16776960;
        } else if (arg0.method533(field583, (byte) -128)) {
            return 65535;
        } else if (arg0.method533(field570, (byte) -125)) {
            return 16711935;
        } else if (arg0.method533(field580, (byte) -108)) {
            return 16777215;
        } else if (arg0.method533(field575, (byte) -112)) {
            return 0;
        } else if (arg0.method533(field595, (byte) -121)) {
            return 16748608;
        } else if (arg0.method533(field581, (byte) -111)) {
            return 8388608;
        } else if (arg0.method533(field571, (byte) -105)) {
            return 128;
        } else if (arg0.method533(field576, (byte) -99)) {
            return 16756736;
        } else if (arg0.method533(field593, (byte) -128)) {
            return 16740352;
        } else if (arg0.method533(field590, (byte) -116)) {
            return 16723968;
        } else if (arg0.method533(field594, (byte) -108)) {
            return 12648192;
        } else if (arg0.method533(field591, (byte) -109)) {
            return 8453888;
        } else if (arg0.method533(field586, (byte) -128)) {
            return 4259584;
        } else {
            if (arg0.method533(field574, (byte) -101)) {
                this.field598 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lkc;III)V", line = 114)
    public final void method229(class67 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field592;
        for (int var6 = 0; var6 < arg0.field1572; var6++) {
            int var7 = arg0.field1597[var6] & 0xFF;
            if (var7 != 32) {
                this.method232(this.field577[var7], arg1, this.field579[var7] + var5, this.field587[var7], this.field585[var7], arg3);
            }
            arg1 += this.field587[var7];
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkc;IIIZ)V", line = 134)
    public final void method230(class67 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method248(arg0, arg1 - this.method235(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lkc;)I", line = 138)
    public final int method231(class67 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field1572; var3++) {
            var2 += this.field587[arg0.field1597[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([BIIIII)V", line = 155)
    private final void method232(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class68.field1628 * arg2 + arg1;
        int var8 = class68.field1628 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class68.field1629) {
            int var11 = class68.field1629 - arg2;
            arg4 -= var11;
            arg2 = class68.field1629;
            var10 += arg3 * var11;
            var7 += class68.field1628 * var11;
        }
        if (arg2 + arg4 > class68.field1624) {
            arg4 -= arg2 + arg4 - class68.field1624;
        }
        if (arg1 < class68.field1627) {
            int var12 = class68.field1627 - arg1;
            arg3 -= var12;
            arg1 = class68.field1627;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class68.field1626) {
            int var13 = arg1 + arg3 - class68.field1626;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method247(class68.field1630, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)I", line = 202)
    public final int method233(int arg0) {
        return this.field587[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkc;IZ)I", line = 206)
    private final int method234(class67 arg0, int arg1, boolean arg2) {
        int var4 = 0;
        int var5 = 0;
        class67 var6 = class121.method949(-80, 100);
        int var7 = -1;
        int var8 = 0;
        class67 var9 = null;
        int var10 = 0;
        boolean var11 = false;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg0.method539(2618);
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = arg0.method515(var15, 255);
            if (var16 == 64 && var15 + 4 < var14 && arg0.method515(var15 + 4, 255) == 64) {
                class67 var17 = arg0.method529(var15, var15 + 5, 17804);
                if (var17.method533(field574, (byte) -118)) {
                    var11 = true;
                    var12 = var6.method539(2618);
                } else {
                    var9 = var17;
                    var10 = var6.method539(2618);
                }
                var6.method551(-107, var17);
                var15 += 4;
            } else if (var16 == 92 && var15 + 1 < var14 && arg0.method515(var15 + 1, 255) == 110) {
                field588[var13++] = var6.method529(var5, var6.method539(2618), 17804).method525((byte) 56);
                var5 = var6.method539(2618);
                var4 = 0;
                var7 = -1;
                var15++;
                var9 = null;
                var11 = false;
            } else {
                var6.method521(var16, -1);
                var4 += this.method233(var16);
                if (var16 == 32 || var16 == 45) {
                    var7 = var6.method539(2618);
                    var8 = var4;
                }
                if (arg2 && var4 > arg1 && var7 >= 0) {
                    field588[var13++] = var6.method529(var5, var7, 17804).method525((byte) 56);
                    var5 = var7;
                    var7 = -1;
                    var4 -= var8;
                    if (var9 != null && var10 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method540(0, var5, var9);
                    }
                    if (var11 && var12 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method540(0, var5, field573);
                    }
                }
            }
        }
        if (var6.method539(2618) > var5) {
            field588[var13++] = var6.method529(var5, var6.method539(2618), 17804).method525((byte) 56);
        }
        return var13;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Lkc;)I", line = 308)
    public final int method235(class67 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field1572; var3++) {
            if (arg0.field1597[var3] == 64 && var3 + 4 < arg0.field1572 && arg0.field1597[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field587[arg0.field1597[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkc;IIIII)V", line = 338)
    public final void method236(class67 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method231(arg0) / 2;
        int var10 = arg2 - this.field592;
        for (int var11 = 0; var11 < arg0.method539(2618); var11++) {
            int var12 = arg0.field1597[var11] & 0xFF;
            if (var12 != 32) {
                this.method232(this.field577[var12], var9, this.field579[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field587[var12], this.field585[var12], arg3);
            }
            var9 += this.field587[var12];
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkc;IIII)V", line = 374)
    public final void method237(class67 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method231(arg0) / 2;
        int var7 = arg2 - this.field592;
        for (int var8 = 0; var8 < arg0.method539(2618); var8++) {
            int var9 = arg0.field1597[var8] & 0xFF;
            if (var9 != 32) {
                this.method232(this.field577[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field579[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field587[var9], this.field585[var9], arg3);
            }
            var6 += this.field587[var9];
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkc;IIIIIZIII)V", line = 395)
    public final void method238(class67 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        if (arg9 == 0) {
            arg9 = this.field597;
        }
        boolean var11 = true;
        if (arg4 < this.field597 + this.field596 + arg9 && arg4 < arg9 + arg9) {
            var11 = false;
        }
        int var12 = this.method234(arg0, arg3, var11);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field597 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field597 - this.field596 - (var12 - 1) * arg9) / 2 + this.field597 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field596 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field597 - this.field596 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field597 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method248(field588[var15], arg1, var13, arg5, arg6);
            } else if (arg7 == 1) {
                this.method230(field588[var15], arg3 / 2 + arg1, var13, arg5, arg6);
            } else if (arg7 == 2) {
                this.method245(field588[var15], arg1 + arg3, var13, arg5, arg6);
            } else if (var12 - 1 == var15) {
                this.method248(field588[var15], arg1, var13, arg5, arg6);
            } else {
                this.method244(field588[var15], arg1, var13, arg5, arg6, arg3);
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([I[BIIIIIIII)V", line = 476)
    private final void method239(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var12 = 256 - arg9;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var15 = arg0[arg4];
                    arg0[arg4++] = (((var15 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * var12 & 0xFF0000) >> 8) + var11;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lkc;IIII)V", line = 516)
    public final void method240(class67 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method231(arg0) / 2;
        int var7 = arg2 - this.field592;
        for (int var8 = 0; var8 < arg0.field1572; var8++) {
            int var9 = arg0.field1597[var8] & 0xFF;
            if (var9 != 32) {
                this.method232(this.field577[var9], var6, this.field579[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field587[var9], this.field585[var9], arg3);
            }
            var6 += this.field587[var9];
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkc;I)I", line = 549)
    public final int method241(class67 arg0, int arg1) {
        int var3 = this.method234(arg0, arg1, true);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method231(field588[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Lkc;III)V", line = 568)
    public final void method242(class67 arg0, int arg1, int arg2, int arg3) {
        this.method229(arg0, arg1 - this.method231(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 867)
    public class28(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field579 = arg0;
        this.field587 = arg1;
        this.field585 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field577 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field579[var10] < var8) {
                var8 = this.field579[var10];
            }
            if (this.field585[var10] + this.field579[var10] > var9) {
                var9 = this.field585[var10] + this.field579[var10];
            }
            byte[] var11 = this.field577[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field592 = this.field585[32] + this.field579[32];
        this.field597 = this.field592 - var8;
        this.field596 = var9 - this.field592;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V", line = 924)
    public class28(byte[] arg0) {
        this.field587 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field587.length; var2++) {
            this.field587[var2] = arg0[var2] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([BIIIIII)V", line = 577)
    private final void method243(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class68.field1628 * arg2 + arg1;
        int var9 = class68.field1628 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class68.field1629) {
            int var12 = class68.field1629 - arg2;
            arg4 -= var12;
            arg2 = class68.field1629;
            var11 += arg3 * var12;
            var8 += class68.field1628 * var12;
        }
        if (arg2 + arg4 > class68.field1624) {
            arg4 -= arg2 + arg4 - class68.field1624;
        }
        if (arg1 < class68.field1627) {
            int var13 = class68.field1627 - arg1;
            arg3 -= var13;
            arg1 = class68.field1627;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class68.field1626) {
            int var14 = arg1 + arg3 - class68.field1626;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method239(class68.field1630, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lkc;IIIZI)V", line = 627)
    private final void method244(class67 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class67 var7 = arg0.method525((byte) 56);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method539(2618); var9++) {
            if (var7.method515(var9, 255) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method235(var7)) * 256 / var8;
        }
        this.field598 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field592;
        for (int var14 = 0; var14 < var7.field1572; var14++) {
            if (var7.field1597[var14] == 64 && var14 + 4 < var7.field1572 && var7.field1597[var14 + 4] == 64) {
                int var15 = this.method228(var7.method529(var14 + 1, var14 + 4, 17804));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field1597[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method232(this.field577[var16], arg1 + 1, this.field579[var16] + var13 + 1, this.field587[var16], this.field585[var16], 0);
                    }
                    this.method232(this.field577[var16], arg1, this.field579[var16] + var13, this.field587[var16], this.field585[var16], arg3);
                }
                arg1 += this.field587[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field598) {
            class68.method556(var12, (int) ((double) this.field592 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lkc;IIIZ)V", line = 703)
    public final void method245(class67 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method248(arg0, arg1 - this.method235(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lkc;I)I", line = 706)
    public final int method246(class67 arg0, int arg1) {
        return this.method234(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([I[BIIIIIII)V", line = 721)
    private final void method247(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Lkc;IIIZ)V", line = 787)
    public final void method248(class67 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field598 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field592;
        for (int var8 = 0; var8 < arg0.field1572; var8++) {
            if (arg0.field1597[var8] == 64 && var8 + 4 < arg0.field1572 && arg0.field1597[var8 + 4] == 64) {
                int var9 = this.method228(arg0.method529(var8 + 1, var8 + 4, 17804));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field1597[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method232(this.field577[var10], arg1 + 1, this.field579[var10] + var7 + 1, this.field587[var10], this.field585[var10], 0);
                    }
                    this.method232(this.field577[var10], arg1, this.field579[var10] + var7, this.field587[var10], this.field585[var10], arg3);
                }
                arg1 += this.field587[var10];
            }
        }
        if (this.field598) {
            class68.method556(var6, (int) ((double) this.field592 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()V", line = 829)
    public static void method249() {
        field574 = null;
        field573 = null;
        field582 = null;
        field578 = null;
        field572 = null;
        field584 = null;
        field583 = null;
        field570 = null;
        field580 = null;
        field575 = null;
        field595 = null;
        field581 = null;
        field571 = null;
        field576 = null;
        field593 = null;
        field590 = null;
        field594 = null;
        field591 = null;
        field586 = null;
        field588 = null;
    }
}
