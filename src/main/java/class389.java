import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class389 extends class66 {

    @OriginalMember(owner = "client!hea", name = "u", descriptor = "Lhm;")
    private class203 field6021;

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "Lcp;")
    private class674 field6027;

    @OriginalMember(owner = "client!hea", name = "D", descriptor = "Lrr;")
    private class332 field6030;

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
    private int field6032;

    @OriginalMember(owner = "client!hea", name = "C", descriptor = "I")
    private int field6029;

    @OriginalMember(owner = "client!hea", name = "y", descriptor = "I")
    private int field6025;

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "I")
    private int field6019;

    @OriginalMember(owner = "client!hea", name = "v", descriptor = "[[F")
    private float[][] field6022;

    @OriginalMember(owner = "client!hea", name = "J", descriptor = "[[F")
    private float[][] field6036;

    @OriginalMember(owner = "client!hea", name = "K", descriptor = "[[F")
    private float[][] field6037;

    @OriginalMember(owner = "client!hea", name = "x", descriptor = "I")
    private int field6024;

    @OriginalMember(owner = "client!hea", name = "M", descriptor = "Lsba;")
    private class200 field6039;

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "Lbo;")
    private class679 field6018;

    @OriginalMember(owner = "client!hea", name = "L", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6038;

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6035;

    @OriginalMember(owner = "client!hea", name = "H", descriptor = "Log;")
    private class601 field6034;

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "I")
    private int field6026;

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!hea", name = "w", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!hea", name = "B", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!hea", name = "E", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!hea", name = "N", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "[I")
    public static int[] field6020;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIII)V")
    private final void method2525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6040++;
        long var8 = -1L;
        int var10 = (arg0 << this.field6021.field515) + arg5;
        if (arg6 != 4) {
            this.method2525(10, -83, 109, 69, -116, -60, 27);
        }
        int var11 = arg3 + (arg4 << this.field6021.field515);
        int var12 = this.field6021.method477(-1, var11, var10);
        if ((arg5 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 << 16 & 0xFFFFL << 16;
            class66 var13 = this.field6039.method1558(var8, (byte) -93);
            if (var13 != null) {
                this.method2529((byte) 40, ((class426) var13).field6472);
                return;
            }
        }
        short var14 = (short) (this.field6026++);
        if (var8 != -1L) {
            this.field6039.method1564(var8, new class426(var14), (byte) 117);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg3 == 0) {
            var15 = this.field6036[arg2][arg1];
            var16 = this.field6037[arg2][arg1];
            var17 = this.field6022[arg2][arg1];
        } else if (this.field6021.field516 == arg5 && arg3 == 0) {
            var17 = this.field6022[arg2 + 1][arg1];
            var16 = this.field6037[arg2 + 1][arg1];
            var15 = this.field6036[arg2 + 1][arg1];
        } else if (this.field6021.field516 == arg5 && this.field6021.field516 == arg3) {
            var16 = this.field6037[arg2 + 1][arg1 + 1];
            var17 = this.field6022[arg2 + 1][arg1 + 1];
            var15 = this.field6036[arg2 + 1][arg1 + 1];
        } else if (arg5 == 0 && this.field6021.field516 == arg3) {
            var15 = this.field6036[arg2][arg1 + 1];
            var17 = this.field6022[arg2][arg1 + 1];
            var16 = this.field6037[arg2][arg1 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field6021.field516;
            float var19 = (float) arg3 / (float) this.field6021.field516;
            float var20 = this.field6036[arg2][arg1];
            float var21 = this.field6037[arg2][arg1];
            float var22 = this.field6022[arg2][arg1];
            float var23 = this.field6036[arg2 + 1][arg1];
            float var24 = this.field6037[arg2 + 1][arg1];
            float var25 = (this.field6036[arg2][arg1 + 1] - var20) * var18 + var20;
            float var26 = this.field6022[arg2 + 1][arg1];
            float var27 = (this.field6036[arg2 + 1][arg1 + 1] - var23) * var18 + var23;
            float var28 = (this.field6037[arg2 + 1][arg1 + 1] - var24) * var18 + var24;
            float var29 = (this.field6022[arg2][arg1 + 1] - var22) * var18 + var22;
            float var30 = (this.field6037[arg2][arg1 + 1] - var21) * var18 + var21;
            float var31 = (this.field6022[arg2 + 1][arg1 + 1] - var26) * var18 + var26;
            var15 = (var27 - var25) * var19 + var25;
            var16 = (var28 - var30) * var19 + var30;
            var17 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field6027.method3857((byte) -35) - var10);
        float var33 = (float) (this.field6027.method3851((byte) -112) - var12);
        float var34 = (float) (this.field6027.method3859((byte) 117) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field6027.method3860((byte) -124);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var37 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field6027.method3854(-1);
        int var45 = (int) ((float) ((var44 & 0xFF0847) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3620()) {
            this.field6038.method3621((float) var10);
            this.field6038.method3621((float) var12);
            this.field6038.method3621((float) var11);
        } else {
            this.field6038.method3630((float) var10);
            this.field6038.method3630((float) var12);
            this.field6038.method3630((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field6030.field5358 == 0) {
            this.field6038.method3631(var47);
            this.field6038.method3631(var46);
            this.field6038.method3631(var45);
        } else {
            this.field6038.method3631(var45);
            this.field6038.method3631(var46);
            this.field6038.method3631(var47);
        }
        this.field6038.method3631(255);
        this.method2529((byte) 40, var14);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)I")
    public static final int method2526(int arg0, int arg1) {
        return class575.field8191 == null ? 0 : class575.field8191[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIII[[Z)V")
    public final void method2527(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field6023++;
        if (arg2 != 31584) {
            this.field6034 = null;
        }
        if (this.field6018 == null || arg0 + arg1 < this.field6032 || this.field6029 < (arg0 - arg1) || (arg1 + arg3) < this.field6025 || this.field6019 < arg3 - arg1) {
            return;
        }
        for (int var6 = this.field6025; var6 <= this.field6019; var6++) {
            for (int var7 = this.field6032; var7 <= this.field6029; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg3;
                if (var8 > (-arg1) && var8 < arg1 && var9 > -arg1 && var9 < arg1 && arg4[arg1 + var8][arg1 + var9]) {
                    this.field6030.method2235((byte) ((int) (this.field6027.method3856((byte) -114) * 255.0F)), 3);
                    this.field6030.method178(this.field6034, 0, arg2 - 31496);
                    this.field6030.method137(-85, this.field6030.field5437);
                    this.field6030.method120(class646.field9077, this.field6026, this.field6018, 0, arg2 - 31458, this.field6024 / 3, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(III)V")
    public static final void method2528(int arg0, int arg1, int arg2) {
        field6028++;
        if (class378.field5877 < class378.field5884) {
            class378.field5877 = (float) ((double) class378.field5877 / 30.0D + (double) class378.field5877);
            if (class378.field5884 < class378.field5877) {
                class378.field5877 = class378.field5884;
            }
            class555.method3320(arg0 ^ 0xFFFFE1CB);
            class378.field5876 = (int) class378.field5877 >> 1;
            class378.field5878 = class417.method2651(-53, class378.field5876);
        } else if (class378.field5884 < class378.field5877) {
            class378.field5877 = (float) ((double) class378.field5877 - (double) class378.field5877 / 30.0D);
            if (class378.field5877 < class378.field5884) {
                class378.field5877 = class378.field5884;
            }
            class555.method3320(-7733);
            class378.field5876 = (int) class378.field5877 >> 1;
            class378.field5878 = class417.method2651(-41, class378.field5876);
        }
        if (arg0 != 0) {
            field6020 = null;
        }
        if (class2.field16 != -1 && class55.field717 != -1) {
            int var3 = class2.field16 - class528.field7705;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class55.field717 - class97.field1570;
            class528.field7705 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class97.field1570 += var4;
            if (var3 == 0 && var4 == 0) {
                class55.field717 = -1;
                class2.field16 = -1;
            }
            class555.method3320(-7733);
        }
        if (class471.field6976 <= 0) {
            class204.field3329 = -1;
            class516.field7497 = -1;
        } else {
            class442.field6729--;
            if (class442.field6729 == 0) {
                class442.field6729 = 100;
                class471.field6976--;
            }
        }
        if (!class412.field6327 || class167.field2803 == null) {
            return;
        }
        for (class659 var5 = (class659) class167.field2803.method3465((byte) 103); var5 != null; var5 = (class659) class167.field2803.method3469(0)) {
            class257 var6 = class378.field5873.method3286(29982, var5.field9179.field2408);
            if (var5.method3783(Integer.MIN_VALUE, arg1, arg2)) {
                if (var6.field4074 != null) {
                    if (var6.field4074[4] != null) {
                        class652.method3758(0, -1, var6.field4074[4], var6.field4090, true, 1004, false, false, (long) var5.field9179.field2408, var6.field4112, -1);
                    }
                    if (var6.field4074[3] != null) {
                        class652.method3758(0, -1, var6.field4074[3], var6.field4090, true, 1001, false, false, (long) var5.field9179.field2408, var6.field4112, -1);
                    }
                    if (var6.field4074[2] != null) {
                        class652.method3758(0, -1, var6.field4074[2], var6.field4090, true, 1011, false, false, (long) var5.field9179.field2408, var6.field4112, -1);
                    }
                    if (var6.field4074[1] != null) {
                        class652.method3758(0, -1, var6.field4074[1], var6.field4090, true, 1008, false, false, (long) var5.field9179.field2408, var6.field4112, -1);
                    }
                    if (var6.field4074[0] != null) {
                        class652.method3758(0, -1, var6.field4074[0], var6.field4090, true, 1003, false, false, (long) var5.field9179.field2408, var6.field4112, -1);
                    }
                }
                if (!var5.field9179.field2410) {
                    var5.field9179.field2410 = true;
                    class142.method1213(class588.field8353, var5.field9179.field2408, var6.field4112);
                }
                if (var5.field9179.field2410) {
                    class142.method1213(class574.field8186, var5.field9179.field2408, var6.field4112);
                }
            } else if (var5.field9179.field2410) {
                var5.field9179.field2410 = false;
                class142.method1213(class597.field8454, var5.field9179.field2408, var6.field4112);
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(BS)V")
    private final void method2529(byte arg0, short arg1) {
        if (Stream.method3620()) {
            this.field6035.method3628(arg1);
        } else {
            this.field6035.method3623(arg1);
        }
        field6033++;
        if (arg0 != 40) {
            this.field6035 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)V")
    public static void method2530(byte arg0) {
        if (arg0 <= 52) {
            field6017 = -98;
        }
        field6020 = null;
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lrr;Lhm;Lcp;[I)V")
    public class389(class332 arg0, class203 arg1, class674 arg2, int[] arg3) {
        this.field6021 = arg1;
        this.field6027 = arg2;
        this.field6030 = arg0;
        int var5 = this.field6027.method3860((byte) -120) - (arg1.field516 >> 1);
        this.field6032 = this.field6027.method3857((byte) -35) - var5 >> arg1.field515;
        this.field6029 = var5 + this.field6027.method3857((byte) -35) >> arg1.field515;
        this.field6025 = this.field6027.method3859((byte) 117) - var5 >> arg1.field515;
        this.field6019 = var5 + this.field6027.method3859((byte) 117) >> arg1.field515;
        int var6 = this.field6029 + 1 - this.field6032;
        int var7 = this.field6019 + 1 - this.field6025;
        this.field6022 = new float[var6 + 1][var7 + 1];
        this.field6036 = new float[var6 + 1][var7 + 1];
        this.field6037 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field6025 + var8;
            if (var27 > 0 && var27 < (this.field6021.field513 - 1)) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field6032 + var28;
                    if (var29 > 0 && var29 < this.field6021.field510 - 1) {
                        int var30 = arg1.method479(var27, var29 + 1, -89) - arg1.method479(var27, var29 - 1, 65);
                        int var31 = arg1.method479(var27 + 1, var29, -102) - arg1.method479(var27 - 1, var29, 76);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field6036[var28][var8] = (float) var30 * var32;
                        this.field6037[var28][var8] = var32 * -256.0F;
                        this.field6022[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field6025; var10 <= this.field6019; var10++) {
            if (var10 >= 0 && arg1.field513 > var10) {
                for (int var23 = this.field6032; var23 <= this.field6029; var23++) {
                    if (var23 >= 0 && arg1.field510 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field3297[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field6024 += 3;
                                    }
                                }
                            } else {
                                this.field6024 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field6029 - this.field6032;
            }
        }
        if (this.field6024 > 0) {
            this.field6039 = new class200(class413.method2636(this.field6024, 127));
            this.field6018 = this.field6030.method113(false, 126);
            this.field6018.method424((byte) -80, this.field6024);
            NativeHeapBuffer var11 = this.field6030.method2284(false, this.field6024 * 16, 0);
            this.field6038 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field6018.method430(true, (byte) -107);
                } while (var12 == null);
                this.field6035 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field6025; var15 <= this.field6019; var15++) {
                    if (var15 >= 0 && var15 < arg1.field513) {
                        int var16 = 0;
                        for (int var17 = this.field6032; var17 <= this.field6029; var17++) {
                            if (var17 >= 0 && arg1.field510 > var17) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field3297[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field3305[var17][var15];
                                        int[] var21 = arg1.field3306[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method2525(var17, var13, var16, var21[var22], var15, var20[var22], 4);
                                                    var22++;
                                                    this.method2525(var17, var13, var16, var21[var22], var15, var20[var22], 4);
                                                    var22++;
                                                    this.method2525(var17, var13, var16, var21[var22], var15, var20[var22], 4);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method2525(var17, var13, var16, 0, var15, 0, 4);
                                        this.method2525(var17, var13, var16, 0, var15, arg1.field516, 4);
                                        this.method2525(var17, var13, var16, arg1.field516, var15, 0, 4);
                                    } else if (var18 == 2) {
                                        this.method2525(var17, var13, var16, 0, var15, arg1.field516, 4);
                                        this.method2525(var17, var13, var16, arg1.field516, var15, arg1.field516, 4);
                                        this.method2525(var17, var13, var16, 0, var15, 0, 4);
                                    } else if (var18 == 5) {
                                        this.method2525(var17, var13, var16, arg1.field516, var15, arg1.field516, 4);
                                        this.method2525(var17, var13, var16, arg1.field516, var15, 0, 4);
                                        this.method2525(var17, var13, var16, 0, var15, arg1.field516, 4);
                                    } else if (var18 == 4) {
                                        this.method2525(var17, var13, var16, arg1.field516, var15, 0, 4);
                                        this.method2525(var17, var13, var16, 0, var15, 0, 4);
                                        this.method2525(var17, var13, var16, arg1.field516, var15, arg1.field516, 4);
                                    }
                                }
                            }
                            var16++;
                            var14++;
                        }
                    } else {
                        var14 += this.field6029 - this.field6032;
                    }
                    var13++;
                }
                this.field6035.method3626();
                if (this.field6018.method425(30899)) {
                    this.field6038.method3626();
                    this.field6034 = this.field6030.method174(false, 81);
                    this.field6034.method1723(var11, 18869, 16, this.field6026 * 16);
                    break;
                }
                this.field6038.method3618(0);
                this.field6039.method1562((byte) 118);
            }
        } else {
            this.field6034 = null;
            this.field6018 = null;
        }
        this.field6036 = this.field6037 = this.field6022 = null;
        this.field6039 = null;
        this.field6038 = null;
        this.field6035 = null;
    }
}
