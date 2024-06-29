import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class466 extends class417 {

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public int field6570 = 0;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lih;")
    private class600 field6549;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public int field6562;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public int field6567;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public int field6554;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Lcb;")
    private class444 field6565;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "[I")
    private int[] field6563;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public int field6569;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "F")
    public float field6552;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field6557 = 0;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field6568 = 0;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Lql;")
    private class628 field6561;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6559;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6550;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(II)V")
    public final void method2807(int arg0, int arg1) {
        field6553++;
        this.field6550 = this.field6565.method2634(true, 53, arg1 * 4);
        this.field6559 = new Stream(this.field6550, 0, arg1 * 4);
        if (arg0 >= -48) {
            method2810(9);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBI)V")
    public final void method2808(int arg0, int arg1, byte arg2, int arg3) {
        field6571++;
        this.field6563[this.field6549.field2697 * arg3 + arg0] = class473.method2847(this.field6563[this.field6549.field2697 * arg3 + arg0], 0x1 << arg1);
        if (arg2 == -44) {
            this.field6570++;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
    public final void method2809(int arg0, boolean arg1) {
        this.field6559.method3449(arg0 * 4 + 3);
        field6564++;
        if (arg1) {
            this.field6563 = null;
        }
        this.field6559.method3445(-1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)I")
    public static final int method2810(int arg0) {
        field6551++;
        if (arg0 != -1851278840) {
            method2814(false, null, -24, -0.8576446F, -57, -68, -0.9917534F, 61, -0.10473569F, -0.6807338F, 74, null, -0.6201979F);
        }
        return class228.field3342;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIFII)V")
    public final void method2811(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (this.field6562 != -1) {
            class471 var6 = this.field6565.field3092.method110(this.field6562, (byte) 111);
            int var7 = var6.field6660 & 0xFF;
            if (var7 != 0 && var6.field6646 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg1 * 131586;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field6657 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg4 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg4 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var13 & 0xFF00) + ((var12 & 0x7300FF00) << 8) + (var14 >> 8);
            }
        }
        field6555++;
        if (arg3 != -12494) {
            return;
        }
        if (arg2 != 1.0F) {
            int var15 = arg4 >> 16 & 0xFF;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg2);
            int var19 = (int) ((float) var16 * arg2);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var20 | var19 << 8 | var18 << 16;
        }
        this.field6559.method3449(arg0 * 4);
        if (this.field6565.field6131 == 0) {
            this.field6559.method3445((byte) arg4);
            this.field6559.method3445((byte) (arg4 >> 8));
            this.field6559.method3445((byte) (arg4 >> 16));
        } else {
            this.field6559.method3445((byte) (arg4 >> 16));
            this.field6559.method3445((byte) (arg4 >> 8));
            this.field6559.method3445((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V")
    public final void method2812(int arg0, byte arg1) {
        field6556++;
        this.field6559.method3448();
        int var3 = 63 / ((arg1 - 42) / 39);
        this.field6561 = this.field6565.method2627(false, -30125);
        this.field6561.method1867(4, arg0 * 4, this.field6550, 81);
        this.field6559 = null;
        this.field6550 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II[I)V")
    public final void method2813(int arg0, int arg1, int[] arg2) {
        field6566++;
        class370 var4 = this.field6565.method2689(true, this.field6570 * 3);
        Buffer var5 = var4.method282(-13803, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field6565.method2597(var5, 1);
        int var7 = 0;
        if (arg0 < 6) {
            this.method2812(85, (byte) 4);
        }
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3454()) {
            label99: for (int var18 = 0; var18 < arg1; var18++) {
                int var20 = arg2[var18];
                int var21 = this.field6563[var20];
                short[] var22 = this.field6549.field8856[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var22.length) {
                                continue label99;
                            }
                            if ((var21 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                    var6.method3447(var26);
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label125: for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = arg2[var10];
                short[] var12 = this.field6549.field8856[var11];
                int var13 = this.field6563[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var12.length <= var15) {
                                continue label125;
                            }
                            if ((0x1 << var14++ & var13) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    var6.method3452(var17);
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method3448();
        if (!var4.method280(28596) || var7 <= 0) {
            return;
        }
        this.field6565.method2652((this.field6549.field8866 & 0x8) != 0, 128, this.field6562, (this.field6549.field8866 & 0x7) != 0);
        if (this.field6565.field6117) {
            this.field6565.method453(Integer.MAX_VALUE, this.field6554, this.field6567, this.field6569);
        }
        class57 var19 = this.field6565.method2653((byte) -110);
        var19.method381(1.0F, 1.0F / this.field6552, 1.0F / this.field6552, (byte) -60);
        this.field6565.method2623(113, class210.field3107);
        this.field6565.method2617(this.field6561, 1, (byte) 115);
        this.field6565.method2584(true, this.field6549.field8887);
        this.field6565.method2578((byte) 49, class569.field8396, var8, 0, var9 + 1 - var8, var7, var4);
        this.field6565.method2664(-127);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLmba;IFIIFIFFI[BF)V")
    public static final void method2814(boolean arg0, class357 arg1, int arg2, float arg3, int arg4, int arg5, float arg6, int arg7, float arg8, float arg9, int arg10, byte[] arg11, float arg12) {
        field6558++;
        for (int var13 = 0; var13 < arg7; var13++) {
            class587.method3492(arg2, arg8, arg7, arg10, arg11, arg12, var13, arg4, arg9, 3169, arg1, arg5, arg3, arg6);
            arg4 += arg5 * arg10;
        }
        if (!arg0) {
            method2810(15);
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lih;IIIII)V")
    public class466(class600 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6549 = arg0;
        this.field6562 = arg1;
        this.field6567 = arg4;
        this.field6554 = arg3;
        this.field6565 = this.field6549.field8873;
        this.field6563 = new int[this.field6549.field2697 * this.field6549.field2693];
        this.field6569 = arg5;
        this.field6552 = arg2;
    }
}
