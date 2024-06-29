import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class480 extends class362 {

    @OriginalMember(owner = "client!eu", name = "M", descriptor = "I")
    public int field6706 = 0;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "Lqm;")
    private class146 field6683;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
    public int field6686;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "F")
    public float field6699;

    @OriginalMember(owner = "client!eu", name = "N", descriptor = "Lwga;")
    private class745 field6707;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "I")
    public int field6692;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    public int field6684;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "[I")
    private int[] field6690;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
    public int field6688;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "Lmu;")
    public static class303 field6701 = null;

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "F")
    public static float field6703;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!eu", name = "K", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!eu", name = "L", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "Lcs;")
    public static class342 field6698;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "Ltc;")
    private class353 field6694;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6691;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6689;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)V")
    public final void method2811(byte arg0, int arg1) {
        if (arg0 != -57) {
            this.method2811((byte) 25, -39);
        }
        field6697++;
        this.field6689 = this.field6707.method4109((byte) 77, true, arg1 * 4);
        this.field6691 = new Stream(this.field6689, 0, arg1 * 4);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B[II)V")
    public final void method2812(byte arg0, int[] arg1, int arg2) {
        field6700++;
        class163 var4 = this.field6707.method4079(47, this.field6706 * 3);
        Buffer var5 = var4.method1241(true, false);
        if (var5 == null) {
            return;
        }
        if (arg0 != -30) {
            this.method2811((byte) 116, 72);
        }
        Stream var6 = this.field6707.method4122(var5, 9179);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3789()) {
            label123: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg1[var10];
                short[] var12 = this.field6683.field2422[var11];
                int var13 = this.field6690[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var12.length <= var15) {
                                continue label123;
                            }
                            if ((var13 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                    var6.method3790(var17);
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label99: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg1[var18];
                short[] var21 = this.field6683.field2422[var20];
                int var22 = this.field6690[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var21.length) {
                                continue label99;
                            }
                            if ((0x1 << var23++ & var22) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                    var6.method3779(var26);
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3784();
        if (!var4.method1239(arg0 + 7) || var7 <= 0) {
            return;
        }
        this.field6707.method4073((this.field6683.field2417 & 0x8) != 0, (this.field6683.field2417 & 0x7) != 0, this.field6684, (byte) 48);
        if (this.field6707.field10274) {
            this.field6707.method196(Integer.MAX_VALUE, this.field6688, this.field6692, this.field6686);
        }
        class81 var19 = this.field6707.method4077(false);
        var19.method775(1.0F, 1.0F / this.field6699, 1.0F / this.field6699, (byte) -80);
        this.field6707.method4099(arg0 - 2, class620.field8440);
        this.field6707.method2263(55, this.field6694, 1);
        this.field6707.method2289(arg0 + 30, this.field6683.field2447);
        this.field6707.method2276(class34.field855, var7, var4, var8, 0, var9 + 1 - var8, 104);
        this.field6707.method4116(-8629);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    public static void method2813(byte arg0) {
        field6701 = null;
        field6698 = null;
        int var1 = 89 / ((19 - arg0) / 43);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public static final void method2814(int arg0) {
        class73.field1331.method1270(98);
        field6696++;
        class38.field938 = arg0;
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(II)V")
    public final void method2815(int arg0, int arg1) {
        field6693++;
        this.field6691.method3784();
        this.field6694 = this.field6707.method2300(false, 16711680);
        this.field6694.method881(this.field6689, 4, arg1 * 4, (byte) -110);
        int var3 = 44 % ((arg0 - 19) / 33);
        this.field6689 = null;
        this.field6691 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IFIII)V")
    public final void method2816(int arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field6684 != -1) {
            class739 var6 = this.field6707.field1170.method1180(this.field6684, -6662);
            int var7 = var6.field9943 & 0xFF;
            if (var7 != 0 && var6.field9955 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 <= 127) {
                    var8 = arg3 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((var8 & 0xFF00FF) * var7 + ((arg4 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field9958 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg4 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var14 >> 8) + ((var12 & 0x5400FF00) << 8) + (var13 & 0xFF00);
            }
        }
        field6705++;
        this.field6691.method3791(arg0 * 4);
        if (arg1 != 1.0F) {
            int var15 = arg4 >> 16 & 0xFF;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg1);
            int var18 = arg4 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var20 | var17 << 16 | var19 << 8;
        }
        if (arg2 != 1624) {
            method2818(null, (byte) 67);
        }
        if (this.field6707.field10292 == 0) {
            this.field6691.method3793((byte) arg4);
            this.field6691.method3793((byte) (arg4 >> 8));
            this.field6691.method3793((byte) (arg4 >> 16));
        } else {
            this.field6691.method3793((byte) (arg4 >> 16));
            this.field6691.method3793((byte) (arg4 >> 8));
            this.field6691.method3793((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIB)V")
    public final void method2817(int arg0, int arg1, int arg2, byte arg3) {
        field6687++;
        this.field6690[this.field6683.field3937 * arg1 + arg2] = class418.method2577(this.field6690[this.field6683.field3937 * arg1 + arg2], 0x1 << arg0);
        if (arg3 > -65) {
            field6703 = -1.0413289F;
        }
        this.field6706++;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/awt/Component;B)Lefa;")
    public static final class185 method2818(Component arg0, byte arg1) {
        field6704++;
        int var2 = -16 % ((arg1 + 58) / 63);
        return new class671(arg0);
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(BI)V")
    public final void method2819(byte arg0, int arg1) {
        field6695++;
        if (arg0 > -106) {
            this.field6688 = -80;
        }
        this.field6691.method3791(arg1 * 4 + 3);
        this.field6691.method3793(-1);
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lqm;IIIII)V")
    public class480(class146 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6683 = arg0;
        this.field6686 = arg5;
        this.field6699 = arg2;
        this.field6707 = this.field6683.field2445;
        this.field6692 = arg4;
        this.field6684 = arg1;
        this.field6690 = new int[this.field6683.field3940 * this.field6683.field3937];
        this.field6688 = arg3;
    }
}
