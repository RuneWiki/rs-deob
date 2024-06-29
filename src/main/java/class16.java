import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class16 extends class108 {

    @OriginalMember(owner = "client!c", name = "nb", descriptor = "I")
    public int field333 = 0;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "[[B")
    private byte[][] field321 = new byte[256][];

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "Ljava/util/Random;")
    private Random field329 = new Random();

    @OriginalMember(owner = "client!c", name = "wb", descriptor = "Z")
    private boolean field342 = false;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "[I")
    private int[] field318;

    @OriginalMember(owner = "client!c", name = "rb", descriptor = "[I")
    private int[] field337;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "[I")
    private int[] field324;

    @OriginalMember(owner = "client!c", name = "yb", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!c", name = "xb", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "Lke;")
    private static class65 field322 = class1.method17("yel", -115);

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "Lke;")
    private static class65 field325 = class1.method17("blu", -125);

    @OriginalMember(owner = "client!c", name = "db", descriptor = "Lke;")
    private static class65 field323 = class1.method17("lre", -121);

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "Lke;")
    private static class65 field320 = class1.method17("gr1", -112);

    @OriginalMember(owner = "client!c", name = "X", descriptor = "Lke;")
    private static class65 field317 = class1.method17("mag", -116);

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "Lke;")
    private static class65 field319 = class1.method17("or1", -117);

    @OriginalMember(owner = "client!c", name = "kb", descriptor = "Lke;")
    private static class65 field330 = class1.method17("bla", -119);

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "Lke;")
    private static class65 field328 = class1.method17("red", -121);

    @OriginalMember(owner = "client!c", name = "lb", descriptor = "Lke;")
    private static class65 field331 = class1.method17("gr3", -120);

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "Lke;")
    private static class65 field326 = class1.method17("or2", -120);

    @OriginalMember(owner = "client!c", name = "mb", descriptor = "Lke;")
    private static class65 field332 = class1.method17("gre", -127);

    @OriginalMember(owner = "client!c", name = "qb", descriptor = "Lke;")
    private static class65 field336 = class1.method17("whi", -125);

    @OriginalMember(owner = "client!c", name = "ob", descriptor = "Lke;")
    private static class65 field334 = class1.method17("dre", -112);

    @OriginalMember(owner = "client!c", name = "sb", descriptor = "Lke;")
    private static class65 field338 = class1.method17("gr2", -123);

    @OriginalMember(owner = "client!c", name = "pb", descriptor = "Lke;")
    private static class65 field335 = class1.method17("cya", -118);

    @OriginalMember(owner = "client!c", name = "ub", descriptor = "Lke;")
    private static class65 field340 = class1.method17("dbl", -125);

    @OriginalMember(owner = "client!c", name = "tb", descriptor = "Lke;")
    private static class65 field339 = class1.method17("str", -114);

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "Lke;")
    private static class65 field327 = class1.method17("or3", -111);

    @OriginalMember(owner = "client!c", name = "vb", descriptor = "[Lke;")
    private static class65[] field341 = new class65[100];

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([BIIIII)V", line = 6)
    private final void method105(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class108.field2709 * arg2 + arg1;
        int var8 = class108.field2709 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class108.field2707) {
            int var11 = class108.field2707 - arg2;
            arg4 -= var11;
            arg2 = class108.field2707;
            var10 += arg3 * var11;
            var7 += class108.field2709 * var11;
        }
        if (arg2 + arg4 > class108.field2705) {
            arg4 -= arg2 + arg4 - class108.field2705;
        }
        if (arg1 < class108.field2708) {
            int var12 = class108.field2708 - arg1;
            arg3 -= var12;
            arg1 = class108.field2708;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class108.field2710) {
            int var13 = arg1 + arg3 - class108.field2710;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method108(class108.field2711, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lke;IIIZI)V", line = 53)
    private final void method106(class65 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class65 var7 = arg0.method543((byte) -79);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method528(73); var9++) {
            if (var7.method563((byte) -17, var9) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method124(var7)) * 256 / var8;
        }
        this.field342 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field333;
        for (int var14 = 0; var14 < var7.field1733; var14++) {
            if (var7.field1702[var14] == 64 && var14 + 4 < var7.field1733 && var7.field1702[var14 + 4] == 64) {
                int var15 = this.method121(var7.method555(var14 + 1, var14 + 4, (byte) -78));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field1702[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method105(this.field321[var16], arg1 + 1, this.field318[var16] + var13 + 1, this.field337[var16], this.field324[var16], 0);
                    }
                    this.method105(this.field321[var16], arg1, this.field318[var16] + var13, this.field337[var16], this.field324[var16], arg3);
                }
                arg1 += this.field337[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field342) {
            class108.method892(var12, (int) ((double) this.field333 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lke;IIII)V", line = 121)
    public final void method107(class65 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method116(arg0) / 2;
        int var7 = arg2 - this.field333;
        for (int var8 = 0; var8 < arg0.field1733; var8++) {
            int var9 = arg0.field1702[var8] & 0xFF;
            if (var9 != 32) {
                this.method105(this.field321[var9], var6, this.field318[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field337[var9], this.field324[var9], arg3);
            }
            var6 += this.field337[var9];
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([I[BIIIIIII)V", line = 144)
    private final void method108(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lke;III)V", line = 199)
    public final void method109(class65 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field333;
        for (int var6 = 0; var6 < arg0.field1733; var6++) {
            int var7 = arg0.field1702[var6] & 0xFF;
            if (var7 != 32) {
                this.method105(this.field321[var7], arg1, this.field318[var7] + var5, this.field337[var7], this.field324[var7], arg3);
            }
            arg1 += this.field337[var7];
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lke;IIIZ)V", line = 220)
    public final void method110(class65 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field342 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field333;
        for (int var8 = 0; var8 < arg0.field1733; var8++) {
            if (arg0.field1702[var8] == 64 && var8 + 4 < arg0.field1733 && arg0.field1702[var8 + 4] == 64) {
                int var9 = this.method121(arg0.method555(var8 + 1, var8 + 4, (byte) -78));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field1702[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method105(this.field321[var10], arg1 + 1, this.field318[var10] + var7 + 1, this.field337[var10], this.field324[var10], 0);
                    }
                    this.method105(this.field321[var10], arg1, this.field318[var10] + var7, this.field337[var10], this.field324[var10], arg3);
                }
                arg1 += this.field337[var10];
            }
        }
        if (this.field342) {
            class108.method892(var6, (int) ((double) this.field333 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([BIIIIII)V", line = 269)
    private final void method111(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class108.field2709 * arg2 + arg1;
        int var9 = class108.field2709 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class108.field2707) {
            int var12 = class108.field2707 - arg2;
            arg4 -= var12;
            arg2 = class108.field2707;
            var11 += arg3 * var12;
            var8 += class108.field2709 * var12;
        }
        if (arg2 + arg4 > class108.field2705) {
            arg4 -= arg2 + arg4 - class108.field2705;
        }
        if (arg1 < class108.field2708) {
            int var13 = class108.field2708 - arg1;
            arg3 -= var13;
            arg1 = class108.field2708;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class108.field2710) {
            int var14 = arg1 + arg3 - class108.field2710;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method115(class108.field2711, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Lke;III)V", line = 319)
    public final void method112(class65 arg0, int arg1, int arg2, int arg3) {
        this.method109(arg0, arg1 - this.method116(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Lke;IIIZ)V", line = 322)
    public final void method113(class65 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method110(arg0, arg1 - this.method124(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Lke;IIIZI)V", line = 331)
    public final void method114(class65 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field329.setSeed((long) arg5);
        int var7 = (this.field329.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field333;
        for (int var9 = 0; var9 < arg0.field1733; var9++) {
            if (arg0.field1702[var9] == 64 && var9 + 4 < arg0.field1733 && arg0.field1702[var9 + 4] == 64) {
                int var10 = this.method121(arg0.method555(var9 + 1, var9 + 4, (byte) -78));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field1702[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method111(this.field321[var11], arg1 + 1, this.field318[var11] + var8 + 1, this.field337[var11], this.field324[var11], 0, 192);
                    }
                    this.method111(this.field321[var11], arg1, this.field318[var11] + var8, this.field337[var11], this.field324[var11], arg3, var7);
                }
                arg1 += this.field337[var11];
                if ((this.field329.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([I[BIIIIIIII)V", line = 377)
    private final void method115(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lke;)I", line = 419)
    public final int method116(class65 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field1733; var3++) {
            var2 += this.field337[arg0.field1702[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Lke;IIII)V", line = 435)
    public final void method117(class65 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method116(arg0) / 2;
        int var7 = arg2 - this.field333;
        for (int var8 = 0; var8 < arg0.method528(86); var8++) {
            int var9 = arg0.field1702[var8] & 0xFF;
            if (var9 != 32) {
                this.method105(this.field321[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field318[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field337[var9], this.field324[var9], arg3);
            }
            var6 += this.field337[var9];
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lke;IIIII)V", line = 456)
    public final void method118(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method116(arg0) / 2;
        int var10 = arg2 - this.field333;
        for (int var11 = 0; var11 < arg0.method528(73); var11++) {
            int var12 = arg0.field1702[var11] & 0xFF;
            if (var12 != 32) {
                this.method105(this.field321[var12], var9, this.field318[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field337[var12], this.field324[var12], arg3);
            }
            var9 += this.field337[var12];
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Lke;III)V", line = 483)
    public final void method119(class65 arg0, int arg1, int arg2, int arg3) {
        this.method109(arg0, arg1 - this.method116(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lke;IIIIIZIII)V", line = 487)
    public final void method120(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        int var12 = 0;
        class65 var13 = class76.method675(0, 100);
        int var14 = -1;
        int var15 = 0;
        class65 var16 = null;
        if (arg9 == 0) {
            arg9 = this.field344;
        }
        boolean var17 = true;
        if (arg4 < this.field344 + this.field343 + arg9 && arg4 < arg9 + arg9) {
            var17 = false;
        }
        int var18 = 0;
        int var19 = arg0.method528(66);
        for (int var20 = 0; var20 < var19; var20++) {
            int var24 = arg0.method563((byte) -17, var20);
            if (var24 == 64 && var20 + 4 < var19 && arg0.method563((byte) -17, var20 + 4) == 64) {
                var16 = arg0.method555(var20, var20 + 5, (byte) -78);
                var13.method531(var16, (byte) 53);
                var20 += 4;
            } else if (var24 == 92 && var20 + 1 < var19 && arg0.method563((byte) -17, var20 + 1) == 110) {
                var16 = null;
                field341[var18++] = var13.method555(var12, var13.method528(87), (byte) -78).method543((byte) -115);
                var12 = var13.method528(91);
                var11 = 0;
                var14 = -1;
                var20++;
            } else {
                var13.method527(var24, (byte) 8);
                var11 += this.method125(var24);
                if (var24 == 32 || var24 == 45) {
                    var14 = var13.method528(113);
                    var15 = var11;
                }
                if (var17 && var11 > arg3 && var14 >= 0) {
                    field341[var18++] = var13.method555(var12, var14, (byte) -78).method543((byte) -102);
                    var12 = var14;
                    var14 = -1;
                    var11 -= var15;
                    if (var16 != null && var12 > 4) {
                        var12 -= 5;
                        var13.method562(-9409, var16, var12);
                    }
                }
            }
        }
        if (var13.method528(115) > var12) {
            field341[var18++] = var13.method555(var12, var13.method528(110), (byte) -78).method543((byte) -78);
        }
        if (arg8 == 3 && var18 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field344 + arg2;
        } else if (arg8 == 1) {
            var21 = (arg4 - this.field344 - this.field343 - (var18 - 1) * arg9) / 2 + this.field344 + arg2;
        } else if (arg8 == 2) {
            var21 = arg2 + arg4 - this.field343 - (var18 - 1) * arg9;
        } else {
            int var22 = (arg4 - this.field344 - this.field343 - (var18 - 1) * arg9) / (var18 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            var21 = this.field344 + arg2 + var22;
            arg9 += var22;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            if (arg7 == 0) {
                this.method110(field341[var23], arg1, var21, arg5, arg6);
            } else if (arg7 == 1) {
                this.method113(field341[var23], arg3 / 2 + arg1, var21, arg5, arg6);
            } else if (arg7 == 2) {
                this.method122(field341[var23], arg1 + arg3, var21, arg5, arg6);
            } else if (var18 - 1 == var23) {
                this.method110(field341[var23], arg1, var21, arg5, arg6);
            } else {
                this.method106(field341[var23], arg1, var21, arg5, arg6, arg3);
            }
            var21 += arg9;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Lke;)I", line = 633)
    private final int method121(class65 arg0) {
        if (arg0.method564((byte) 118, field328)) {
            return 16711680;
        } else if (arg0.method564((byte) -104, field332)) {
            return 65280;
        } else if (arg0.method564((byte) -100, field325)) {
            return 255;
        } else if (arg0.method564((byte) -114, field322)) {
            return 16776960;
        } else if (arg0.method564((byte) -126, field335)) {
            return 65535;
        } else if (arg0.method564((byte) -99, field317)) {
            return 16711935;
        } else if (arg0.method564((byte) -111, field336)) {
            return 16777215;
        } else if (arg0.method564((byte) 60, field330)) {
            return 0;
        } else if (arg0.method564((byte) 114, field323)) {
            return 16748608;
        } else if (arg0.method564((byte) 44, field334)) {
            return 8388608;
        } else if (arg0.method564((byte) -109, field340)) {
            return 128;
        } else if (arg0.method564((byte) 29, field319)) {
            return 16756736;
        } else if (arg0.method564((byte) -9, field326)) {
            return 16740352;
        } else if (arg0.method564((byte) -105, field327)) {
            return 16723968;
        } else if (arg0.method564((byte) -103, field320)) {
            return 12648192;
        } else if (arg0.method564((byte) 13, field338)) {
            return 8453888;
        } else if (arg0.method564((byte) -105, field331)) {
            return 4259584;
        } else {
            if (arg0.method564((byte) -112, field339)) {
                this.field342 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Lke;IIIZ)V", line = 698)
    public final void method122(class65 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method110(arg0, arg1 - this.method124(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()V", line = 706)
    public static void method123() {
        field328 = null;
        field332 = null;
        field325 = null;
        field322 = null;
        field335 = null;
        field317 = null;
        field336 = null;
        field330 = null;
        field323 = null;
        field334 = null;
        field340 = null;
        field319 = null;
        field326 = null;
        field327 = null;
        field320 = null;
        field338 = null;
        field331 = null;
        field339 = null;
        field341 = null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 805)
    public class16(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field318 = arg0;
        this.field337 = arg1;
        this.field324 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field321 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field318[var10] < var8) {
                var8 = this.field318[var10];
            }
            if (this.field324[var10] + this.field318[var10] > var9) {
                var9 = this.field324[var10] + this.field318[var10];
            }
            byte[] var11 = this.field321[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field333 = this.field324[32] + this.field318[32];
        this.field344 = this.field333 - var8;
        this.field343 = var9 - this.field333;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Lke;)I", line = 735)
    public final int method124(class65 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field1733; var3++) {
            if (arg0.field1702[var3] == 64 && var3 + 4 < arg0.field1733 && arg0.field1702[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field337[arg0.field1702[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)I", line = 797)
    public final int method125(int arg0) {
        return this.field337[arg0 & 0xFF];
    }
}
