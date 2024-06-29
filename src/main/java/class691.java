import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class691 extends class766 {

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Lsl;")
    private class99 field9739;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Lmj;")
    private class114 field9741;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Lmfa;")
    private class217 field9735;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    private int field9744;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    private int field9750;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    private int field9740;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    private int field9731;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "[[F")
    private float[][] field9736;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "[[F")
    private float[][] field9749;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "[[F")
    private float[][] field9733;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    private int field9730;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Lsi;")
    private class769 field9734;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lvv;")
    private class463 field9737;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9745;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9752;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Lwba;")
    private class601 field9742;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    private int field9743;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "J")
    public static long field9738;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "[I")
    public static int[] field9751;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(SB)V")
    private final void method3884(short arg0, byte arg1) {
        field9747++;
        if (arg1 != -111) {
            method3888(42);
        }
        if (Stream.method2263()) {
            this.field9752.method2259(arg0);
        } else {
            this.field9752.method2252(arg0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static final void method3885(int arg0) {
        class56.field876.method1286(true);
        field9746++;
        for (int var1 = 0; var1 < 32; var1++) {
            class479.field6592[var1] = 0L;
        }
        int var2 = 72 / ((arg0 - 31) / 44);
        for (int var3 = 0; var3 < 32; var3++) {
            class467.field6367[var3] = 0L;
        }
        class599.field8549 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIII[[Z)V")
    public final void method3886(boolean arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field9748++;
        if (this.field9737 == null || arg1 + arg3 < this.field9744 || arg1 - arg3 > this.field9750 || this.field9740 > (arg2 + arg3) || arg2 - arg3 > this.field9731 || arg0) {
            return;
        }
        for (int var6 = this.field9740; var6 <= this.field9731; var6++) {
            for (int var7 = this.field9744; var7 <= this.field9750; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg2;
                if (var8 > -arg3 && arg3 > var8 && var9 > -arg3 && var9 < arg3 && arg4[arg3 + var8][arg3 + var9]) {
                    this.field9741.method948((byte) ((int) (this.field9735.method1488(false) * 255.0F)), -290369688);
                    this.field9741.method71((byte) -43, 0, this.field9742);
                    this.field9741.method89(this.field9741.field1960, 125);
                    this.field9741.method140(0, this.field9743, this.field9737, class710.field9929, 0, 0, this.field9730 / 3);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IIIIIII)V")
    private final void method3887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9732++;
        long var8 = -1L;
        int var10 = arg3 + (arg6 << this.field9739.field5807);
        int var11 = (arg0 << this.field9739.field5807) + arg5;
        int var12 = this.field9739.method2478(true, var11, var10);
        if ((arg3 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class766 var13 = this.field9734.method4253(var8, -1);
            if (var13 != null) {
                this.method3884(((class654) var13).field9255, (byte) -111);
                return;
            }
        }
        short var14 = (short) (this.field9743++);
        if (var8 != -1L) {
            this.field9734.method4252(false, new class654(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg5 == 0) {
            var15 = this.field9736[arg2][arg4];
            var16 = this.field9733[arg2][arg4];
            var17 = this.field9749[arg2][arg4];
        } else if (this.field9739.field5805 == arg3 && arg5 == 0) {
            var16 = this.field9733[arg2 + 1][arg4];
            var15 = this.field9736[arg2 + 1][arg4];
            var17 = this.field9749[arg2 + 1][arg4];
        } else if (this.field9739.field5805 == arg3 && this.field9739.field5805 == arg5) {
            var17 = this.field9749[arg2 + 1][arg4 + 1];
            var15 = this.field9736[arg2 + 1][arg4 + 1];
            var16 = this.field9733[arg2 + 1][arg4 + 1];
        } else if (arg3 == 0 && this.field9739.field5805 == arg5) {
            var16 = this.field9733[arg2][arg4 + 1];
            var17 = this.field9749[arg2][arg4 + 1];
            var15 = this.field9736[arg2][arg4 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field9739.field5805;
            float var19 = (float) arg5 / (float) this.field9739.field5805;
            float var20 = this.field9736[arg2][arg4];
            float var21 = this.field9749[arg2][arg4];
            float var22 = this.field9733[arg2][arg4];
            float var23 = this.field9736[arg2 + 1][arg4];
            float var24 = this.field9749[arg2 + 1][arg4];
            float var25 = (this.field9749[arg2][arg4 + 1] - var21) * var18 + var21;
            float var26 = (this.field9749[arg2 + 1][arg4 + 1] - var24) * var18 + var24;
            float var27 = (this.field9733[arg2][arg4 + 1] - var22) * var18 + var22;
            float var28 = (this.field9736[arg2][arg4 + 1] - var20) * var18 + var20;
            float var29 = (this.field9736[arg2 + 1][arg4 + 1] - var23) * var18 + var23;
            float var30 = this.field9733[arg2 + 1][arg4];
            float var31 = (this.field9733[arg2 + 1][arg4 + 1] - var30) * var18 + var30;
            var15 = (var29 - var28) * var19 + var28;
            var17 = (var26 - var25) * var19 + var25;
            var16 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field9735.method1495(false) - var10);
        float var33 = (float) (this.field9735.method1494(false) - var12);
        float var34 = (float) (this.field9735.method1490((byte) -126) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field9735.method1491(0);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        if (arg1 != -19269) {
            this.field9739 = null;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field9735.method1489((byte) -116);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method2263()) {
            this.field9745.method2251((float) var10);
            this.field9745.method2251((float) var12);
            this.field9745.method2251((float) var11);
        } else {
            this.field9745.method2258((float) var10);
            this.field9745.method2258((float) var12);
            this.field9745.method2258((float) var11);
        }
        if (this.field9741.field1920 == 0) {
            this.field9745.method2254(var47);
            this.field9745.method2254(var46);
            this.field9745.method2254(var45);
        } else {
            this.field9745.method2254(var45);
            this.field9745.method2254(var46);
            this.field9745.method2254(var47);
        }
        this.field9745.method2254(255);
        this.method3884(var14, (byte) -111);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public static void method3888(int arg0) {
        if (arg0 != -26079) {
            method3885(-76);
        }
        field9751 = null;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lmj;Lsl;Lmfa;[I)V")
    public class691(class114 arg0, class99 arg1, class217 arg2, int[] arg3) {
        this.field9739 = arg1;
        this.field9741 = arg0;
        this.field9735 = arg2;
        int var5 = this.field9735.method1491(0) - (arg1.field5805 >> 1);
        this.field9744 = this.field9735.method1495(false) - var5 >> arg1.field5807;
        this.field9750 = var5 + this.field9735.method1495(false) >> arg1.field5807;
        this.field9740 = this.field9735.method1490((byte) -126) - var5 >> arg1.field5807;
        this.field9731 = var5 + this.field9735.method1490((byte) -126) >> arg1.field5807;
        int var6 = this.field9750 + 1 - this.field9744;
        int var7 = this.field9731 + 1 - this.field9740;
        this.field9736 = new float[var6 + 1][var7 + 1];
        this.field9749 = new float[var6 + 1][var7 + 1];
        this.field9733 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = var8 + this.field9740;
            if (var27 > 0 && var27 < (this.field9739.field5809 - 1)) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field9744 + var28;
                    if (var29 > 0 && (this.field9739.field5808 - 1) > var29) {
                        int var30 = arg1.method2476(var27, var29 + 1, -1) - arg1.method2476(var27, var29 - 1, -1);
                        int var31 = arg1.method2476(var27 + 1, var29, -1) - arg1.method2476(var27 - 1, var29, -1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + var31 * var31 + 65536)));
                        this.field9736[var28][var8] = (float) var30 * var32;
                        this.field9749[var28][var8] = var32 * -256.0F;
                        this.field9733[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field9740; var10 <= this.field9731; var10++) {
            if (var10 >= 0 && var10 < arg1.field5809) {
                for (int var23 = this.field9744; var23 <= this.field9750; var23++) {
                    if (var23 >= 0 && var23 < arg1.field5808) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field1458[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field9730 += 3;
                                    }
                                }
                            } else {
                                this.field9730 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field9750 - this.field9744;
            }
        }
        if (this.field9730 > 0) {
            this.field9734 = new class769(class661.method3706(this.field9730, true));
            this.field9737 = this.field9741.method84(-119, false);
            this.field9737.method602(17154, this.field9730);
            NativeHeapBuffer var11 = this.field9741.method999(false, this.field9730 * 16, -86);
            this.field9745 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field9737.method1440(true, -15169);
                } while (var12 == null);
                this.field9752 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field9740; var15 <= this.field9731; var15++) {
                    if (var15 >= 0 && arg1.field5809 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field9744; var17 <= this.field9750; var17++) {
                            if (var17 >= 0 && var17 < arg1.field5808) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field1458[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field1455[var17][var15];
                                        int[] var21 = arg1.field1443[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3887(var15, -19269, var16, var20[var22], var14, var21[var22], var17);
                                                    var22++;
                                                    this.method3887(var15, -19269, var16, var20[var22], var14, var21[var22], var17);
                                                    var22++;
                                                    this.method3887(var15, -19269, var16, var20[var22], var14, var21[var22], var17);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3887(var15, -19269, var16, 0, var14, 0, var17);
                                        this.method3887(var15, -19269, var16, arg1.field5805, var14, 0, var17);
                                        this.method3887(var15, -19269, var16, 0, var14, arg1.field5805, var17);
                                    } else if (var18 == 2) {
                                        this.method3887(var15, -19269, var16, arg1.field5805, var14, 0, var17);
                                        this.method3887(var15, -19269, var16, arg1.field5805, var14, arg1.field5805, var17);
                                        this.method3887(var15, -19269, var16, 0, var14, 0, var17);
                                    } else if (var18 == 5) {
                                        this.method3887(var15, -19269, var16, arg1.field5805, var14, arg1.field5805, var17);
                                        this.method3887(var15, -19269, var16, 0, var14, arg1.field5805, var17);
                                        this.method3887(var15, -19269, var16, arg1.field5805, var14, 0, var17);
                                    } else if (var18 == 4) {
                                        this.method3887(var15, -19269, var16, 0, var14, arg1.field5805, var17);
                                        this.method3887(var15, -19269, var16, 0, var14, 0, var17);
                                        this.method3887(var15, -19269, var16, arg1.field5805, var14, arg1.field5805, var17);
                                    }
                                }
                            }
                            var16++;
                            var13++;
                        }
                    } else {
                        var13 += this.field9750 - this.field9744;
                    }
                    var14++;
                }
                this.field9752.method2255();
                if (this.field9737.method1441(32416)) {
                    this.field9745.method2255();
                    this.field9742 = this.field9741.method135(false, 0);
                    this.field9742.method38((byte) 121, 16, var11, this.field9743 * 16);
                    break;
                }
                this.field9745.method2262(0);
                this.field9734.method4249((byte) 111);
            }
        } else {
            this.field9742 = null;
            this.field9737 = null;
        }
        this.field9734 = null;
        this.field9745 = null;
        this.field9736 = this.field9749 = this.field9733 = null;
        this.field9752 = null;
    }
}
