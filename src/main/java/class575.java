import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class575 extends class108 {

    @OriginalMember(owner = "client!es", name = "C", descriptor = "I")
    public int field8199 = 0;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "Lhm;")
    private class460 field8190;

    @OriginalMember(owner = "client!es", name = "B", descriptor = "F")
    public float field8198;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    public int field8192;

    @OriginalMember(owner = "client!es", name = "D", descriptor = "I")
    public int field8200;

    @OriginalMember(owner = "client!es", name = "A", descriptor = "[I")
    private int[] field8197;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    public int field8196;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "I")
    public int field8182;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "Lnd;")
    private class632 field8185;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!es", name = "y", descriptor = "Lup;")
    private class342 field8195;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8189;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8188;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZI)V")
    public final void method3288(int arg0, int arg1, boolean arg2, int arg3) {
        this.field8197[this.field8190.field7541 * arg0 + arg1] = class188.method1258(this.field8197[this.field8190.field7541 * arg0 + arg1], 0x1 << arg3);
        field8181++;
        this.field8199++;
        if (!arg2) {
            this.method3294(-22, true);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
    public final void method3289(int arg0, int arg1) {
        field8193++;
        this.field8189.method3246();
        this.field8195 = this.field8185.method128(16240, false);
        this.field8195.method1344(-17817, this.field8188, arg0 * arg1, 4);
        this.field8188 = null;
        this.field8189 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I[II)V")
    public final void method3290(int arg0, int[] arg1, int arg2) {
        int var4 = -38 % ((76 - arg0) / 46);
        field8194++;
        class620 var5 = this.field8185.method3637(this.field8199 * 3, 2);
        Buffer var6 = var5.method251(true, (byte) 60);
        if (var6 == null) {
            return;
        }
        Stream var7 = this.field8185.method3588(var6, (byte) 46);
        int var8 = 0;
        int var9 = 32767;
        int var10 = -32768;
        if (Stream.method3248()) {
            label122: for (int var11 = 0; var11 < arg2; var11++) {
                int var12 = arg1[var11];
                short[] var13 = this.field8190.field6650[var12];
                int var14 = this.field8197[var12];
                if (var14 != 0 && var13 != null) {
                    int var15 = 0;
                    int var16 = 0;
                    while (true) {
                        while (true) {
                            if (var16 >= var13.length) {
                                continue label122;
                            }
                            if ((var14 & 0x1 << var15++) == 0) {
                                var16 += 3;
                            } else {
                                for (int var17 = 0; var17 < 3; var17++) {
                                    int var18 = var13[var16++] & 0xFFFF;
                                    if (var18 < var9) {
                                        var9 = var18;
                                    }
                                    if (var18 > var10) {
                                        var10 = var18;
                                    }
                                    var7.method3244(var18);
                                }
                                var8++;
                            }
                        }
                    }
                }
            }
        } else {
            label96: for (int var19 = 0; var19 < arg2; var19++) {
                int var21 = arg1[var19];
                int var22 = this.field8197[var21];
                short[] var23 = this.field8190.field6650[var21];
                if (var22 != 0 && var23 != null) {
                    int var24 = 0;
                    int var25 = 0;
                    while (true) {
                        while (true) {
                            if (var23.length <= var25) {
                                continue label96;
                            }
                            if ((0x1 << var24++ & var22) == 0) {
                                var25 += 3;
                            } else {
                                var8++;
                                for (int var26 = 0; var26 < 3; var26++) {
                                    int var27 = var23[var25++] & 0xFFFF;
                                    if (var9 > var27) {
                                        var9 = var27;
                                    }
                                    var7.method3238(var27);
                                    if (var27 > var10) {
                                        var10 = var27;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var7.method3246();
        if (!var5.method245(-11359) || var8 <= 0) {
            return;
        }
        this.field8185.method3568(this.field8196, 14511, (this.field8190.field6653 & 0x7) != 0, (this.field8190.field6653 & 0x8) != 0);
        if (this.field8185.field9120) {
            this.field8185.method572(Integer.MAX_VALUE, this.field8182, this.field8200, this.field8192);
        }
        class516 var20 = this.field8185.method3595((byte) 40);
        var20.method2902(1.0F / this.field8198, 1.0F / this.field8198, (byte) 2, 1.0F);
        this.field8185.method3616(class577.field8230, (byte) 94);
        this.field8185.method152(1, this.field8195, 81);
        this.field8185.method114(this.field8190.field6664, (byte) -25);
        this.field8185.method134(class12.field118, 0, var10 - (var9 - 1), var8, var5, 10, var9);
        this.field8185.method3627(-85);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIB)I")
    public static final int method3291(int arg0, int arg1, byte arg2) {
        field8184++;
        int var3 = class57.method467((byte) 75, 4, arg1 + 91923, arg0 + 45365) + (class57.method467((byte) 75, 2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (class57.method467((byte) 75, 1, arg1, arg0) + -128 >> 2) - 128;
        if (arg2 != -65) {
            return 21;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIFI)V")
    public final void method3292(int arg0, int arg1, int arg2, float arg3, int arg4) {
        field8183++;
        if (this.field8196 != -1) {
            class576 var6 = this.field8185.field2443.method2387((byte) 127, this.field8196);
            int var7 = var6.field8212 & 0xFF;
            if (var7 != 0 && var6.field8203 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg0 * 131586;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((var8 & 0xFF00FF) * var7 + ((arg4 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field8216 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
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
                arg4 = (var14 >> 8) + (var12 & 0xFF00 << 8) + (var13 & 0xFF00);
            }
        }
        if (arg3 != 1.0F) {
            int var15 = (arg4 & 0xFFF8DE) >> 16;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg3);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg3);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var18 << 16 | var19 << 8 | var20;
        }
        this.field8189.method3241(arg1 * 4);
        if (arg2 != -257) {
            method3291(100, 6, (byte) -26);
        }
        if (this.field8185.field9138 == 0) {
            this.field8189.method3242((byte) arg4);
            this.field8189.method3242((byte) (arg4 >> 8));
            this.field8189.method3242((byte) (arg4 >> 16));
        } else {
            this.field8189.method3242((byte) (arg4 >> 16));
            this.field8189.method3242((byte) (arg4 >> 8));
            this.field8189.method3242((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)V")
    public final void method3293(byte arg0, int arg1) {
        field8187++;
        this.field8188 = this.field8185.method3584(true, false, arg1 * 4);
        this.field8189 = new Stream(this.field8188, 0, arg1 * 4);
        if (arg0 <= 70) {
            this.method3294(-23, true);
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lhm;IIIII)V")
    public class575(class460 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8190 = arg0;
        this.field8198 = arg2;
        this.field8192 = arg5;
        this.field8200 = arg4;
        this.field8197 = new int[this.field8190.field7541 * this.field8190.field7539];
        this.field8196 = arg1;
        this.field8182 = arg3;
        this.field8185 = this.field8190.field6657;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)V")
    public final void method3294(int arg0, boolean arg1) {
        this.field8189.method3241(arg0 * 4 + 3);
        field8191++;
        if (!arg1) {
            this.method3289(112, 123);
        }
        this.field8189.method3242(-1);
    }
}
