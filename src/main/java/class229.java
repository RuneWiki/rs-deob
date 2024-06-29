import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class229 extends class66 {

    @OriginalMember(owner = "client!gca", name = "K", descriptor = "I")
    public int field3676 = 0;

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "Lhm;")
    private class203 field3656;

    @OriginalMember(owner = "client!gca", name = "L", descriptor = "I")
    public int field3677;

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "F")
    public float field3669;

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
    public int field3662;

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "Lrr;")
    private class332 field3661;

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!gca", name = "B", descriptor = "[I")
    private int[] field3667;

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "I")
    public int field3674;

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "Lrl;")
    public static class672 field3671 = new class672(72, -1);

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!gca", name = "C", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!gca", name = "G", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!gca", name = "A", descriptor = "Log;")
    private class601 field3666;

    @OriginalMember(owner = "client!gca", name = "H", descriptor = "Lri;")
    public static class97 field3673;

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3659;

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3665;

    @OriginalMember(owner = "client!gca", name = "J", descriptor = "Ljava/lang/Object;")
    public static Object field3675;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIZI)V")
    public final void method1679(int arg0, int arg1, boolean arg2, int arg3) {
        this.field3667[this.field3656.field510 * arg1 + arg3] = class81.method769(this.field3667[this.field3656.field510 * arg1 + arg3], 0x1 << arg0);
        if (arg2) {
            this.field3674 = -37;
        }
        field3670++;
        this.field3676++;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BI)V")
    public final void method1680(byte arg0, int arg1) {
        field3668++;
        this.field3665 = this.field3661.method2284(true, arg1 * 4, 0);
        int var3 = -50 % ((arg0 - 23) / 38);
        this.field3659 = new Stream(this.field3665, 0, arg1 * 4);
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(BI)V")
    public final void method1681(byte arg0, int arg1) {
        if (arg0 >= 87) {
            field3660++;
            this.field3659.method3618(arg1 * 4 + 3);
            this.field3659.method3631(-1);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIF)V")
    public final void method1682(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field3674 != -1) {
            class258 var6 = this.field3661.field2812.method1610(arg2 ^ 0xFFFFD5C3, this.field3674);
            int var7 = var6.field4131 & 0xFF;
            if (var7 != 0 && var6.field4134 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 <= 127) {
                    var8 = arg3 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((var8 & 0xFF00FF) * var7 + ((arg0 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field4126 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg0 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg0 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = (var12 << 8 & 0xFF0023) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        if (arg2 != -25573) {
            return;
        }
        field3664++;
        this.field3659.method3618(arg1 * 4);
        if (arg4 != 1.0F) {
            int var15 = (arg0 & 0xFFC313) >> 16;
            int var16 = (arg0 & 0xFFBA) >> 8;
            int var17 = arg0 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            int var19 = (int) ((float) var16 * arg4);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var20 = (int) ((float) var17 * arg4);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg0 = var19 << 8 | var18 << 16 | var20;
        }
        if (this.field3661.field5358 == 0) {
            this.field3659.method3631((byte) arg0);
            this.field3659.method3631((byte) (arg0 >> 8));
            this.field3659.method3631((byte) (arg0 >> 16));
        } else {
            this.field3659.method3631((byte) (arg0 >> 16));
            this.field3659.method3631((byte) (arg0 >> 8));
            this.field3659.method3631((byte) arg0);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)V")
    public final void method1683(int arg0, int arg1) {
        field3657++;
        if (arg1 <= 90) {
            this.field3667 = null;
        }
        this.field3659.method3626();
        this.field3666 = this.field3661.method174(false, 59);
        this.field3666.method1723(this.field3665, 18869, 4, arg0 * 4);
        this.field3659 = null;
        this.field3665 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V")
    public static void method1684(byte arg0) {
        if (arg0 >= -35) {
            method1685(-70);
        }
        field3671 = null;
        field3673 = null;
        field3675 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
    public static final void method1685(int arg0) {
        field3672++;
        if (arg0 != 16711935) {
            field3671 = null;
        }
        class433[] var1 = class504.field7378;
        synchronized (class504.field7378) {
            for (int var2 = 0; var2 < class504.field7378.length; var2++) {
                class504.field7378[var2] = new class433();
                class674.field9495[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I[II)V")
    public final void method1686(int arg0, int[] arg1, int arg2) {
        field3663++;
        class679 var4 = this.field3661.method2262((byte) -118, this.field3676 * 3);
        Buffer var5 = var4.method430(true, (byte) -107);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field3661.method2286(var5, (byte) -55);
        int var7 = 0;
        int var8 = 32767;
        if (arg0 >= -108) {
            this.field3674 = 41;
        }
        int var9 = -32768;
        if (Stream.method3620()) {
            label100: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg1[var18];
                int var21 = this.field3667[var20];
                short[] var22 = this.field3656.field3286[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var22.length <= var24) {
                                continue label100;
                            }
                            if ((0x1 << var23++ & var21) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    var6.method3628(var26);
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label125: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg1[var10];
                int var12 = this.field3667[var11];
                short[] var13 = this.field3656.field3286[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var13.length) {
                                continue label125;
                            }
                            if ((0x1 << var14++ & var12) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    var6.method3623(var17);
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3626();
        if (!var4.method425(30899) || var7 <= 0) {
            return;
        }
        this.field3661.method2242((this.field3656.field3288 & 0x8) != 0, -14500, this.field3674, (this.field3656.field3288 & 0x7) != 0);
        if (this.field3661.field5350) {
            this.field3661.method309(Integer.MAX_VALUE, this.field3658, this.field3662, this.field3677);
        }
        class498 var19 = this.field3661.method2282((byte) -65);
        var19.method3034(1.0F / this.field3669, 1.0F / this.field3669, true, 1.0F);
        this.field3661.method2291(class386.field5995, 24813);
        this.field3661.method178(this.field3666, 1, 60);
        this.field3661.method137(-104, this.field3656.field3320);
        this.field3661.method120(class646.field9077, var9 + 1 - var8, var4, 0, 122, var7, var8);
        this.field3661.method2263((byte) 118);
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lhm;IIIII)V")
    public class229(class203 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3656 = arg0;
        this.field3677 = arg5;
        this.field3669 = arg2;
        this.field3662 = arg4;
        this.field3661 = this.field3656.field3281;
        this.field3658 = arg3;
        this.field3667 = new int[this.field3656.field513 * this.field3656.field510];
        this.field3674 = arg1;
    }
}
