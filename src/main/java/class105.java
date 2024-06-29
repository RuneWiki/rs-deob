import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class105 extends class117 {

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    public int field2581 = 0;

    @OriginalMember(owner = "client!rc", name = "pb", descriptor = "[[B")
    private byte[][] field2597 = new byte[256][];

    @OriginalMember(owner = "client!rc", name = "tb", descriptor = "Ljava/util/Random;")
    private Random field2601 = new Random();

    @OriginalMember(owner = "client!rc", name = "vb", descriptor = "Z")
    private boolean field2603 = false;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "[I")
    private int[] field2584;

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "[I")
    private int[] field2592;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "[I")
    private int[] field2582;

    @OriginalMember(owner = "client!rc", name = "yb", descriptor = "I")
    private int field2606;

    @OriginalMember(owner = "client!rc", name = "wb", descriptor = "I")
    private int field2604;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "Lv;")
    private static class122 field2579 = class55.method425(-53, "gre");

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "Lv;")
    private static class122 field2586 = class55.method425(-77, "or1");

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "Lv;")
    private static class122 field2580 = class55.method425(-122, "or2");

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "Lv;")
    private static class122 field2588 = class55.method425(-77, "blu");

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "Lv;")
    private static class122 field2590 = class55.method425(-63, "gr2");

    @OriginalMember(owner = "client!rc", name = "nb", descriptor = "Lv;")
    private static class122 field2595 = class55.method425(-87, "dbl");

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "Lv;")
    private static class122 field2587 = class55.method425(-68, "bla");

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "Lv;")
    private static class122 field2591 = class55.method425(-74, "yel");

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "Lv;")
    private static class122 field2583 = class55.method425(-61, "gr1");

    @OriginalMember(owner = "client!rc", name = "mb", descriptor = "[Lv;")
    private static class122[] field2594 = new class122[100];

    @OriginalMember(owner = "client!rc", name = "rb", descriptor = "Lv;")
    private static class122 field2599 = class55.method425(-100, "whi");

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "Lv;")
    private static class122 field2589 = class55.method425(-105, "gr3");

    @OriginalMember(owner = "client!rc", name = "ob", descriptor = "Lv;")
    private static class122 field2596 = class55.method425(-60, "mag");

    @OriginalMember(owner = "client!rc", name = "qb", descriptor = "Lv;")
    private static class122 field2598 = class55.method425(-77, "dre");

    @OriginalMember(owner = "client!rc", name = "sb", descriptor = "Lv;")
    private static class122 field2600 = class55.method425(-77, "str");

    @OriginalMember(owner = "client!rc", name = "lb", descriptor = "Lv;")
    private static class122 field2593 = class55.method425(-81, "lre");

    @OriginalMember(owner = "client!rc", name = "ub", descriptor = "Lv;")
    private static class122 field2602 = class55.method425(-56, "red");

    @OriginalMember(owner = "client!rc", name = "xb", descriptor = "Lv;")
    private static class122 field2605 = class55.method425(-112, "or3");

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "Lv;")
    private static class122 field2585 = class55.method425(-49, "cya");

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lv;IIIII)V", line = 6)
    public final void method797(class122 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method809(arg0) / 2;
        int var10 = arg2 - this.field2581;
        for (int var11 = 0; var11 < arg0.method946(70); var11++) {
            int var12 = arg0.field2923[var11] & 0xFF;
            if (var12 != 32) {
                this.method812(this.field2597[var12], var9, this.field2584[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field2592[var12], this.field2582[var12], arg3);
            }
            var9 += this.field2592[var12];
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lv;III)V", line = 33)
    public final void method798(class122 arg0, int arg1, int arg2, int arg3) {
        this.method800(arg0, arg1 - this.method809(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([I[BIIIIIIII)V", line = 44)
    private final void method799(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 805)
    public class105(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field2584 = arg0;
        this.field2592 = arg1;
        this.field2582 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field2597 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2584[var10] < var8) {
                var8 = this.field2584[var10];
            }
            if (this.field2584[var10] + this.field2582[var10] > var9) {
                var9 = this.field2584[var10] + this.field2582[var10];
            }
            byte[] var11 = this.field2597[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field2581 = this.field2584[32] + this.field2582[32];
        this.field2606 = this.field2581 - var8;
        this.field2604 = var9 - this.field2581;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lv;III)V", line = 79)
    public final void method800(class122 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field2581;
        for (int var6 = 0; var6 < arg0.field2971; var6++) {
            int var7 = arg0.field2923[var6] & 0xFF;
            if (var7 != 32) {
                this.method812(this.field2597[var7], arg1, this.field2584[var7] + var5, this.field2592[var7], this.field2582[var7], arg3);
            }
            arg1 += this.field2592[var7];
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lv;IIII)V", line = 115)
    public final void method801(class122 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method809(arg0) / 2;
        int var7 = arg2 - this.field2581;
        for (int var8 = 0; var8 < arg0.field2971; var8++) {
            int var9 = arg0.field2923[var8] & 0xFF;
            if (var9 != 32) {
                this.method812(this.field2597[var9], var6, this.field2584[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field2592[var9], this.field2582[var9], arg3);
            }
            var6 += this.field2592[var9];
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lv;IIIZ)V", line = 136)
    public final void method802(class122 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2603 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field2581;
        for (int var8 = 0; var8 < arg0.field2971; var8++) {
            if (arg0.field2923[var8] == 64 && var8 + 4 < arg0.field2971 && arg0.field2923[var8 + 4] == 64) {
                int var9 = this.method805(arg0.method951(7835, var8 + 4, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field2923[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method812(this.field2597[var10], arg1 + 1, this.field2584[var10] + var7 + 1, this.field2592[var10], this.field2582[var10], 0);
                    }
                    this.method812(this.field2597[var10], arg1, this.field2584[var10] + var7, this.field2592[var10], this.field2582[var10], arg3);
                }
                arg1 += this.field2592[var10];
            }
        }
        if (this.field2603) {
            class117.method901(var6, (int) ((double) this.field2581 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)I", line = 178)
    public final int method803(int arg0) {
        return this.field2592[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lv;IIIZI)V", line = 182)
    private final void method804(class122 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class122 var7 = arg0.method957(-66);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method946(70); var9++) {
            if (var7.method968(var9, 255) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method808(var7)) * 256 / var8;
        }
        this.field2603 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field2581;
        for (int var14 = 0; var14 < var7.field2971; var14++) {
            if (var7.field2923[var14] == 64 && var14 + 4 < var7.field2971 && var7.field2923[var14 + 4] == 64) {
                int var15 = this.method805(var7.method951(7835, var14 + 4, var14 + 1));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field2923[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method812(this.field2597[var16], arg1 + 1, this.field2584[var16] + var13 + 1, this.field2592[var16], this.field2582[var16], 0);
                    }
                    this.method812(this.field2597[var16], arg1, this.field2584[var16] + var13, this.field2592[var16], this.field2582[var16], arg3);
                }
                arg1 += this.field2592[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field2603) {
            class117.method901(var12, (int) ((double) this.field2581 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lv;)I", line = 251)
    private final int method805(class122 arg0) {
        if (arg0.method933(field2602, 0)) {
            return 16711680;
        } else if (arg0.method933(field2579, 0)) {
            return 65280;
        } else if (arg0.method933(field2588, 0)) {
            return 255;
        } else if (arg0.method933(field2591, 0)) {
            return 16776960;
        } else if (arg0.method933(field2585, 0)) {
            return 65535;
        } else if (arg0.method933(field2596, 0)) {
            return 16711935;
        } else if (arg0.method933(field2599, 0)) {
            return 16777215;
        } else if (arg0.method933(field2587, 0)) {
            return 0;
        } else if (arg0.method933(field2593, 0)) {
            return 16748608;
        } else if (arg0.method933(field2598, 0)) {
            return 8388608;
        } else if (arg0.method933(field2595, 0)) {
            return 128;
        } else if (arg0.method933(field2586, 0)) {
            return 16756736;
        } else if (arg0.method933(field2580, 0)) {
            return 16740352;
        } else if (arg0.method933(field2605, 0)) {
            return 16723968;
        } else if (arg0.method933(field2583, 0)) {
            return 12648192;
        } else if (arg0.method933(field2590, 0)) {
            return 8453888;
        } else if (arg0.method933(field2589, 0)) {
            return 4259584;
        } else {
            if (arg0.method933(field2600, 0)) {
                this.field2603 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lv;IIII)V", line = 311)
    public final void method806(class122 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method809(arg0) / 2;
        int var7 = arg2 - this.field2581;
        for (int var8 = 0; var8 < arg0.method946(70); var8++) {
            int var9 = arg0.field2923[var8] & 0xFF;
            if (var9 != 32) {
                this.method812(this.field2597[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field2584[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field2592[var9], this.field2582[var9], arg3);
            }
            var6 += this.field2592[var9];
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lv;IIIZI)V", line = 332)
    public final void method807(class122 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field2601.setSeed((long) arg5);
        int var7 = (this.field2601.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field2581;
        for (int var9 = 0; var9 < arg0.field2971; var9++) {
            if (arg0.field2923[var9] == 64 && var9 + 4 < arg0.field2971 && arg0.field2923[var9 + 4] == 64) {
                int var10 = this.method805(arg0.method951(7835, var9 + 4, var9 + 1));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field2923[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method816(this.field2597[var11], arg1 + 1, this.field2584[var11] + var8 + 1, this.field2592[var11], this.field2582[var11], 0, 192);
                    }
                    this.method816(this.field2597[var11], arg1, this.field2584[var11] + var8, this.field2592[var11], this.field2582[var11], arg3, var7);
                }
                arg1 += this.field2592[var11];
                if ((this.field2601.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lv;)I", line = 379)
    public final int method808(class122 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2971; var3++) {
            if (arg0.field2923[var3] == 64 && var3 + 4 < arg0.field2971 && arg0.field2923[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field2592[arg0.field2923[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Lv;)I", line = 402)
    public final int method809(class122 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2971; var3++) {
            var2 += this.field2592[arg0.field2923[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lv;IIIZ)V", line = 418)
    public final void method810(class122 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method802(arg0, arg1 - this.method808(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Lv;III)V", line = 421)
    public final void method811(class122 arg0, int arg1, int arg2, int arg3) {
        this.method800(arg0, arg1 - this.method809(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([BIIIII)V", line = 432)
    private final void method812(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class117.field2834 * arg2 + arg1;
        int var8 = class117.field2834 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class117.field2832) {
            int var11 = class117.field2832 - arg2;
            arg4 -= var11;
            arg2 = class117.field2832;
            var10 += arg3 * var11;
            var7 += class117.field2834 * var11;
        }
        if (arg2 + arg4 > class117.field2836) {
            arg4 -= arg2 + arg4 - class117.field2836;
        }
        if (arg1 < class117.field2830) {
            int var12 = class117.field2830 - arg1;
            arg3 -= var12;
            arg1 = class117.field2830;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class117.field2831) {
            int var13 = arg1 + arg3 - class117.field2831;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method813(class117.field2833, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([I[BIIIIIII)V", line = 483)
    private final void method813(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Lv;IIIZ)V", line = 546)
    public final void method814(class122 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method802(arg0, arg1 - this.method808(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lv;IIIIIZIII)V", line = 549)
    public final void method815(class122 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        int var12 = 0;
        class122 var13 = class91.method724(19999, 100);
        int var14 = -1;
        int var15 = 0;
        class122 var16 = null;
        if (arg9 == 0) {
            arg9 = this.field2606;
        }
        boolean var17 = true;
        if (arg4 < this.field2606 + this.field2604 + arg9 && arg4 < arg9 + arg9) {
            var17 = false;
        }
        int var18 = 0;
        int var19 = arg0.method946(70);
        for (int var20 = 0; var20 < var19; var20++) {
            int var24 = arg0.method968(var20, 255);
            if (var24 == 64 && var20 + 4 < var19 && arg0.method968(var20 + 4, 255) == 64) {
                var16 = arg0.method951(7835, var20 + 5, var20);
                var13.method931(var16, (byte) -64);
                var20 += 4;
            } else if (var24 == 92 && var20 + 1 < var19 && arg0.method968(var20 + 1, 255) == 110) {
                var16 = null;
                field2594[var18++] = var13.method951(7835, var13.method946(70), var12).method957(-66);
                var12 = var13.method946(70);
                var11 = 0;
                var14 = -1;
                var20++;
            } else {
                var13.method943((byte) -126, var24);
                var11 += this.method803(var24);
                if (var24 == 32 || var24 == 45) {
                    var14 = var13.method946(70);
                    var15 = var11;
                }
                if (var17 && var11 > arg3 && var14 >= 0) {
                    field2594[var18++] = var13.method951(7835, var14, var12).method957(-66);
                    var12 = var14;
                    var14 = -1;
                    var11 -= var15;
                    if (var16 != null && var12 > 4) {
                        var12 -= 5;
                        var13.method967(var16, -4066, var12);
                    }
                }
            }
        }
        if (var13.method946(70) > var12) {
            field2594[var18++] = var13.method951(7835, var13.method946(70), var12).method957(-66);
        }
        if (arg8 == 3 && var18 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field2606 + arg2;
        } else if (arg8 == 1) {
            var21 = (arg4 - this.field2606 - this.field2604 - (var18 - 1) * arg9) / 2 + this.field2606 + arg2;
        } else if (arg8 == 2) {
            var21 = arg2 + arg4 - this.field2604 - (var18 - 1) * arg9;
        } else {
            int var22 = (arg4 - this.field2606 - this.field2604 - (var18 - 1) * arg9) / (var18 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            var21 = this.field2606 + arg2 + var22;
            arg9 += var22;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            if (arg7 == 0) {
                this.method802(field2594[var23], arg1, var21, arg5, arg6);
            } else if (arg7 == 1) {
                this.method814(field2594[var23], arg3 / 2 + arg1, var21, arg5, arg6);
            } else if (arg7 == 2) {
                this.method810(field2594[var23], arg1 + arg3, var21, arg5, arg6);
            } else if (var18 - 1 == var23) {
                this.method802(field2594[var23], arg1, var21, arg5, arg6);
            } else {
                this.method804(field2594[var23], arg1, var21, arg5, arg6, arg3);
            }
            var21 += arg9;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([BIIIIII)V", line = 689)
    private final void method816(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class117.field2834 * arg2 + arg1;
        int var9 = class117.field2834 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class117.field2832) {
            int var12 = class117.field2832 - arg2;
            arg4 -= var12;
            arg2 = class117.field2832;
            var11 += arg3 * var12;
            var8 += class117.field2834 * var12;
        }
        if (arg2 + arg4 > class117.field2836) {
            arg4 -= arg2 + arg4 - class117.field2836;
        }
        if (arg1 < class117.field2830) {
            int var13 = class117.field2830 - arg1;
            arg3 -= var13;
            arg1 = class117.field2830;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class117.field2831) {
            int var14 = arg1 + arg3 - class117.field2831;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method799(class117.field2833, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "()V", line = 770)
    public static void method817() {
        field2602 = null;
        field2579 = null;
        field2588 = null;
        field2591 = null;
        field2585 = null;
        field2596 = null;
        field2599 = null;
        field2587 = null;
        field2593 = null;
        field2598 = null;
        field2595 = null;
        field2586 = null;
        field2580 = null;
        field2605 = null;
        field2583 = null;
        field2590 = null;
        field2589 = null;
        field2600 = null;
        field2594 = null;
    }
}
