import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class478 extends class69 {

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public int field6641 = 0;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "Laga;")
    private class671 field6629;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
    public int field6642;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "F")
    public float field6627;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public int field6636;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public int field6632;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public int field6638;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "[I")
    private int[] field6626;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "Llba;")
    private class223 field6639;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "Lsha;")
    public static class115 field6635 = null;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "Lfw;")
    private class716 field6637;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6634;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6640;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)V", line = 3)
    public final void method2845(byte arg0, int arg1) {
        this.field6640 = this.field6639.method1381(-124, true, arg1 * 4);
        if (arg0 > -77) {
            this.method2849(null, -124, -19);
        }
        field6633++;
        this.field6634 = new Stream(this.field6640, 0, arg1 * 4);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V", line = 16)
    public final void method2846(int arg0, int arg1) {
        this.field6634.method2338(arg0 * 4 + 3);
        if (arg1 != 24103) {
            this.method2846(-74, -44);
        }
        field6628++;
        this.field6634.method2345(-1);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)V", line = 33)
    public final void method2847(boolean arg0, int arg1) {
        field6625++;
        this.field6634.method2351();
        this.field6637 = this.field6639.method1421(arg0, true);
        this.field6637.method2280((byte) 92, 4, this.field6640, arg1 * 4);
        this.field6634 = null;
        this.field6640 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)V", line = 51)
    public final void method2848(int arg0, int arg1, int arg2, int arg3) {
        field6643++;
        this.field6626[this.field6629.field5827 * arg3 + arg2] = class613.method3544(this.field6626[this.field6629.field5827 * arg3 + arg2], arg0 << arg1);
        this.field6641++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([III)V", line = 60)
    public final void method2849(int[] arg0, int arg1, int arg2) {
        field6631++;
        class614 var4 = this.field6639.method1463(this.field6641 * 3, 28);
        Buffer var5 = var4.method1126(true, (byte) 109);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field6639.method1449(arg1 - 32753, var5);
        int var7 = 0;
        int var8 = (short) arg1;
        int var9 = -32768;
        if (Stream.method2346()) {
            label98: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg0[var18];
                short[] var21 = this.field6629.field9401[var20];
                int var22 = this.field6626[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var21.length <= var24) {
                                continue label98;
                            }
                            if ((var22 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    var6.method2339(var26);
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                    if (var26 < var8) {
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
            label124: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg0[var10];
                int var12 = this.field6626[var11];
                short[] var13 = this.field6629.field9401[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var13.length) {
                                continue label124;
                            }
                            if ((0x1 << var14++ & var12) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                    var6.method2343(var17);
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method2351();
        if (!var4.method1121(3104) || var7 <= 0) {
            return;
        }
        this.field6639.method1467((this.field6629.field9417 & 0x8) != 0, (this.field6629.field9417 & 0x7) != 0, this.field6632, (byte) -120);
        if (this.field6639.field3316) {
            this.field6639.method217(Integer.MAX_VALUE, this.field6642, this.field6638, this.field6636);
        }
        class517 var19 = this.field6639.method1470(124);
        var19.method3096(1.0F / this.field6627, 1.0F / this.field6627, 1.0F, -9950);
        this.field6639.method1475(107, class304.field4414);
        this.field6639.method1386((byte) -125, this.field6637, 1);
        this.field6639.method1485(this.field6629.field9434, 32);
        this.field6639.method1430((byte) -108, 0, class625.field8750, var4, var7, var8, var9 + 1 - var8);
        this.field6639.method1377(true);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIFI)V", line = 216)
    public final void method2850(int arg0, int arg1, int arg2, float arg3, int arg4) {
        field6630++;
        if (this.field6632 != -1) {
            class744 var6 = this.field6639.field6556.method581(-21732, this.field6632);
            int var7 = var6.field10269 & 0xFF;
            if (var7 != 0 && var6.field10273 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((var8 & 0xFF00FF) * var7 + ((arg2 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field10262 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg2 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg2 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = ((var12 & 0x2C00FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        this.field6634.method2338(arg0 * 4);
        if (arg3 != 1.0F) {
            int var15 = arg2 >> 16 & 0xFF;
            int var16 = arg2 >> 8 & 0xFF;
            int var17 = arg2 & 0xFF;
            int var18 = (int) ((float) var15 * arg3);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            int var20 = (int) ((float) var17 * arg3);
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
            arg2 = var20 | var19 << 8 | var18 << 16;
        }
        if (this.field6639.field3326 == arg4) {
            this.field6634.method2345((byte) arg2);
            this.field6634.method2345((byte) (arg2 >> 8));
            this.field6634.method2345((byte) (arg2 >> 16));
        } else {
            this.field6634.method2345((byte) (arg2 >> 16));
            this.field6634.method2345((byte) (arg2 >> 8));
            this.field6634.method2345((byte) arg2);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 335)
    public static void method2851(byte arg0) {
        if (arg0 >= -11) {
            field6635 = null;
        }
        field6635 = null;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Laga;IIIII)V", line = 353)
    public class478(class671 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6629 = arg0;
        this.field6642 = arg3;
        this.field6627 = arg2;
        this.field6636 = arg5;
        this.field6632 = arg1;
        this.field6638 = arg4;
        this.field6626 = new int[this.field6629.field5827 * this.field6629.field5826];
        this.field6639 = this.field6629.field9396;
    }
}
