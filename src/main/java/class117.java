import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class117 extends class55 {

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public int field2650 = 0;

    @OriginalMember(owner = "client!ub", name = "ob", descriptor = "[[B")
    private byte[][] field2667 = new byte[256][];

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "Ljava/util/Random;")
    private Random field2651 = new Random();

    @OriginalMember(owner = "client!ub", name = "ub", descriptor = "Z")
    private boolean field2673 = false;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "[I")
    private int[] field2647;

    @OriginalMember(owner = "client!ub", name = "qb", descriptor = "[I")
    private int[] field2669;

    @OriginalMember(owner = "client!ub", name = "sb", descriptor = "[I")
    private int[] field2671;

    @OriginalMember(owner = "client!ub", name = "vb", descriptor = "I")
    private int field2674;

    @OriginalMember(owner = "client!ub", name = "tb", descriptor = "I")
    private int field2672;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "Lva;")
    private static class121 field2652 = class107.method797("yel", -10983);

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "Lva;")
    private static class121 field2655 = class107.method797("bla", -10983);

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "Lva;")
    private static class121 field2649 = class107.method797("whi", -10983);

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "[Lva;")
    private static class121[] field2648 = new class121[100];

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "Lva;")
    private static class121 field2659 = class107.method797("dbl", -10983);

    @OriginalMember(owner = "client!ub", name = "mb", descriptor = "Lva;")
    private static class121 field2665 = class107.method797("gr1", -10983);

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "Lva;")
    private static class121 field2656 = class107.method797("cya", -10983);

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "Lva;")
    private static class121 field2654 = class107.method797("or3", -10983);

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "Lva;")
    private static class121 field2663 = class107.method797("gre", -10983);

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "Lva;")
    private static class121 field2657 = class107.method797("lre", -10983);

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "Lva;")
    private static class121 field2661 = class107.method797("or1", -10983);

    @OriginalMember(owner = "client!ub", name = "pb", descriptor = "Lva;")
    private static class121 field2668 = class107.method797("or2", -10983);

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "Lva;")
    private static class121 field2658 = class107.method797("blu", -10983);

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "Lva;")
    private static class121 field2662 = class107.method797("str", -10983);

    @OriginalMember(owner = "client!ub", name = "nb", descriptor = "Lva;")
    private static class121 field2666 = class107.method797("gr3", -10983);

    @OriginalMember(owner = "client!ub", name = "rb", descriptor = "Lva;")
    private static class121 field2670 = class107.method797("mag", -10983);

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "Lva;")
    private static class121 field2660 = class107.method797("dre", -10983);

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "Lva;")
    private static class121 field2653 = class107.method797("gr2", -10983);

    @OriginalMember(owner = "client!ub", name = "lb", descriptor = "Lva;")
    private static class121 field2664 = class107.method797("red", -10983);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lva;IIIZI)V", line = 3)
    private final void method885(class121 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class121 var7 = arg0.method955(false);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method942(36); var9++) {
            if (var7.method947(true, var9) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method890(var7)) * 256 / var8;
        }
        this.field2673 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field2650;
        for (int var14 = 0; var14 < var7.field2783; var14++) {
            if (var7.field2817[var14] == 64 && var14 + 4 < var7.field2783 && var7.field2817[var14 + 4] == 64) {
                int var15 = this.method896(var7.method957(var14 + 4, true, var14 + 1));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field2817[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method894(this.field2667[var16], arg1 + 1, this.field2647[var16] + var13 + 1, this.field2669[var16], this.field2671[var16], 0);
                    }
                    this.method894(this.field2667[var16], arg1, this.field2647[var16] + var13, this.field2669[var16], this.field2671[var16], arg3);
                }
                arg1 += this.field2669[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field2673) {
            class55.method397(var12, (int) ((double) this.field2650 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lva;IIII)V", line = 79)
    public final void method886(class121 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method898(arg0) / 2;
        int var7 = arg2 - this.field2650;
        for (int var8 = 0; var8 < arg0.method942(36); var8++) {
            int var9 = arg0.field2817[var8] & 0xFF;
            if (var9 != 32) {
                this.method894(this.field2667[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field2647[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field2669[var9], this.field2671[var9], arg3);
            }
            var6 += this.field2669[var9];
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "()V", line = 102)
    public static void method887() {
        field2664 = null;
        field2663 = null;
        field2658 = null;
        field2652 = null;
        field2656 = null;
        field2670 = null;
        field2649 = null;
        field2655 = null;
        field2657 = null;
        field2660 = null;
        field2659 = null;
        field2661 = null;
        field2668 = null;
        field2654 = null;
        field2665 = null;
        field2653 = null;
        field2666 = null;
        field2662 = null;
        field2648 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([I[BIIIIIII)V", line = 128)
    private final void method888(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lva;IIIII)V", line = 183)
    public final void method889(class121 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method898(arg0) / 2;
        int var10 = arg2 - this.field2650;
        for (int var11 = 0; var11 < arg0.method942(36); var11++) {
            int var12 = arg0.field2817[var11] & 0xFF;
            if (var12 != 32) {
                this.method894(this.field2667[var12], var9, this.field2647[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field2669[var12], this.field2671[var12], arg3);
            }
            var9 += this.field2669[var12];
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lva;)I", line = 209)
    public final int method890(class121 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2783; var3++) {
            if (arg0.field2817[var3] == 64 && var3 + 4 < arg0.field2783 && arg0.field2817[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field2669[arg0.field2817[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 805)
    public class117(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field2647 = arg0;
        this.field2669 = arg1;
        this.field2671 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field2667 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2647[var10] < var8) {
                var8 = this.field2647[var10];
            }
            if (this.field2671[var10] + this.field2647[var10] > var9) {
                var9 = this.field2671[var10] + this.field2647[var10];
            }
            byte[] var11 = this.field2667[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field2650 = this.field2671[32] + this.field2647[32];
        this.field2674 = this.field2650 - var8;
        this.field2672 = var9 - this.field2650;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BIIIIII)V", line = 237)
    private final void method891(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class55.field1272 * arg2 + arg1;
        int var9 = class55.field1272 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class55.field1269) {
            int var12 = class55.field1269 - arg2;
            arg4 -= var12;
            arg2 = class55.field1269;
            var11 += arg3 * var12;
            var8 += class55.field1272 * var12;
        }
        if (arg2 + arg4 > class55.field1266) {
            arg4 -= arg2 + arg4 - class55.field1266;
        }
        if (arg1 < class55.field1270) {
            int var13 = class55.field1270 - arg1;
            arg3 -= var13;
            arg1 = class55.field1270;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class55.field1268) {
            int var14 = arg1 + arg3 - class55.field1268;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method902(class55.field1271, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lva;IIIZ)V", line = 288)
    public final void method892(class121 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method903(arg0, arg1 - this.method890(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lva;III)V", line = 291)
    public final void method893(class121 arg0, int arg1, int arg2, int arg3) {
        this.method897(arg0, arg1 - this.method898(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BIIIII)V", line = 299)
    private final void method894(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class55.field1272 * arg2 + arg1;
        int var8 = class55.field1272 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class55.field1269) {
            int var11 = class55.field1269 - arg2;
            arg4 -= var11;
            arg2 = class55.field1269;
            var10 += arg3 * var11;
            var7 += class55.field1272 * var11;
        }
        if (arg2 + arg4 > class55.field1266) {
            arg4 -= arg2 + arg4 - class55.field1266;
        }
        if (arg1 < class55.field1270) {
            int var12 = class55.field1270 - arg1;
            arg3 -= var12;
            arg1 = class55.field1270;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class55.field1268) {
            int var13 = arg1 + arg3 - class55.field1268;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method888(class55.field1271, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lva;IIIIIZIII)V", line = 351)
    public final void method895(class121 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        int var12 = 0;
        class121 var13 = class115.method879((byte) 63, 100);
        int var14 = -1;
        int var15 = 0;
        class121 var16 = null;
        if (arg9 == 0) {
            arg9 = this.field2674;
        }
        boolean var17 = true;
        if (arg4 < this.field2674 + this.field2672 + arg9 && arg4 < arg9 + arg9) {
            var17 = false;
        }
        int var18 = 0;
        int var19 = arg0.method942(36);
        for (int var20 = 0; var20 < var19; var20++) {
            int var24 = arg0.method947(true, var20);
            if (var24 == 64 && var20 + 4 < var19 && arg0.method947(true, var20 + 4) == 64) {
                var16 = arg0.method957(var20 + 5, true, var20);
                var13.method939((byte) 106, var16);
                var20 += 4;
            } else if (var24 == 92 && var20 + 1 < var19 && arg0.method947(true, var20 + 1) == 110) {
                var16 = null;
                field2648[var18++] = var13.method957(var13.method942(36), true, var12).method955(false);
                var12 = var13.method942(36);
                var11 = 0;
                var14 = -1;
                var20++;
            } else {
                var13.method944(-123, var24);
                var11 += this.method901(var24);
                if (var24 == 32 || var24 == 45) {
                    var14 = var13.method942(36);
                    var15 = var11;
                }
                if (var17 && var11 > arg3 && var14 >= 0) {
                    field2648[var18++] = var13.method957(var14, true, var12).method955(false);
                    var12 = var14;
                    var14 = -1;
                    var11 -= var15;
                    if (var16 != null && var12 > 4) {
                        var12 -= 5;
                        var13.method935(var16, var12, true);
                    }
                }
            }
        }
        if (var13.method942(36) > var12) {
            field2648[var18++] = var13.method957(var13.method942(36), true, var12).method955(false);
        }
        if (arg8 == 3 && var18 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field2674 + arg2;
        } else if (arg8 == 1) {
            var21 = (arg4 - this.field2674 - this.field2672 - (var18 - 1) * arg9) / 2 + this.field2674 + arg2;
        } else if (arg8 == 2) {
            var21 = arg2 + arg4 - this.field2672 - (var18 - 1) * arg9;
        } else {
            int var22 = (arg4 - this.field2674 - this.field2672 - (var18 - 1) * arg9) / (var18 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            var21 = this.field2674 + arg2 + var22;
            arg9 += var22;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            if (arg7 == 0) {
                this.method903(field2648[var23], arg1, var21, arg5, arg6);
            } else if (arg7 == 1) {
                this.method892(field2648[var23], arg3 / 2 + arg1, var21, arg5, arg6);
            } else if (arg7 == 2) {
                this.method904(field2648[var23], arg1 + arg3, var21, arg5, arg6);
            } else if (var18 - 1 == var23) {
                this.method903(field2648[var23], arg1, var21, arg5, arg6);
            } else {
                this.method885(field2648[var23], arg1, var21, arg5, arg6, arg3);
            }
            var21 += arg9;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lva;)I", line = 492)
    private final int method896(class121 arg0) {
        if (arg0.method954(field2664, 17706)) {
            return 16711680;
        } else if (arg0.method954(field2663, 17706)) {
            return 65280;
        } else if (arg0.method954(field2658, 17706)) {
            return 255;
        } else if (arg0.method954(field2652, 17706)) {
            return 16776960;
        } else if (arg0.method954(field2656, 17706)) {
            return 65535;
        } else if (arg0.method954(field2670, 17706)) {
            return 16711935;
        } else if (arg0.method954(field2649, 17706)) {
            return 16777215;
        } else if (arg0.method954(field2655, 17706)) {
            return 0;
        } else if (arg0.method954(field2657, 17706)) {
            return 16748608;
        } else if (arg0.method954(field2660, 17706)) {
            return 8388608;
        } else if (arg0.method954(field2659, 17706)) {
            return 128;
        } else if (arg0.method954(field2661, 17706)) {
            return 16756736;
        } else if (arg0.method954(field2668, 17706)) {
            return 16740352;
        } else if (arg0.method954(field2654, 17706)) {
            return 16723968;
        } else if (arg0.method954(field2665, 17706)) {
            return 12648192;
        } else if (arg0.method954(field2653, 17706)) {
            return 8453888;
        } else if (arg0.method954(field2666, 17706)) {
            return 4259584;
        } else {
            if (arg0.method954(field2662, 17706)) {
                this.field2673 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lva;III)V", line = 550)
    public final void method897(class121 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field2650;
        for (int var6 = 0; var6 < arg0.field2783; var6++) {
            int var7 = arg0.field2817[var6] & 0xFF;
            if (var7 != 32) {
                this.method894(this.field2667[var7], arg1, this.field2647[var7] + var5, this.field2669[var7], this.field2671[var7], arg3);
            }
            arg1 += this.field2669[var7];
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Lva;)I", line = 570)
    public final int method898(class121 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2783; var3++) {
            var2 += this.field2669[arg0.field2817[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lva;IIII)V", line = 585)
    public final void method899(class121 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method898(arg0) / 2;
        int var7 = arg2 - this.field2650;
        for (int var8 = 0; var8 < arg0.field2783; var8++) {
            int var9 = arg0.field2817[var8] & 0xFF;
            if (var9 != 32) {
                this.method894(this.field2667[var9], var6, this.field2647[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field2669[var9], this.field2671[var9], arg3);
            }
            var6 += this.field2669[var9];
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Lva;III)V", line = 609)
    public final void method900(class121 arg0, int arg1, int arg2, int arg3) {
        this.method897(arg0, arg1 - this.method898(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I", line = 620)
    public final int method901(int arg0) {
        return this.field2669[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([I[BIIIIIIII)V", line = 633)
    private final void method902(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lva;IIIZ)V", line = 664)
    public final void method903(class121 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2673 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field2650;
        for (int var8 = 0; var8 < arg0.field2783; var8++) {
            if (arg0.field2817[var8] == 64 && var8 + 4 < arg0.field2783 && arg0.field2817[var8 + 4] == 64) {
                int var9 = this.method896(arg0.method957(var8 + 4, true, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field2817[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method894(this.field2667[var10], arg1 + 1, this.field2647[var10] + var7 + 1, this.field2669[var10], this.field2671[var10], 0);
                    }
                    this.method894(this.field2667[var10], arg1, this.field2647[var10] + var7, this.field2669[var10], this.field2671[var10], arg3);
                }
                arg1 += this.field2669[var10];
            }
        }
        if (this.field2673) {
            class55.method397(var6, (int) ((double) this.field2650 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Lva;IIIZ)V", line = 720)
    private final void method904(class121 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method903(arg0, arg1 - this.method890(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lva;IIIZI)V", line = 730)
    public final void method905(class121 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field2651.setSeed((long) arg5);
        int var7 = (this.field2651.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field2650;
        for (int var9 = 0; var9 < arg0.field2783; var9++) {
            if (arg0.field2817[var9] == 64 && var9 + 4 < arg0.field2783 && arg0.field2817[var9 + 4] == 64) {
                int var10 = this.method896(arg0.method957(var9 + 4, true, var9 + 1));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field2817[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method891(this.field2667[var11], arg1 + 1, this.field2647[var11] + var8 + 1, this.field2669[var11], this.field2671[var11], 0, 192);
                    }
                    this.method891(this.field2667[var11], arg1, this.field2647[var11] + var8, this.field2669[var11], this.field2671[var11], arg3, var7);
                }
                arg1 += this.field2669[var11];
                if ((this.field2651.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }
}
