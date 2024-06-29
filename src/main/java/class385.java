import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class385 extends class424 {

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public int field4921 = 0;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "Los;")
    private class247 field4934;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "Lfc;")
    private class575 field4935;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "[I")
    private int[] field4939;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public int field4929;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "F")
    public float field4920;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public int field4930;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public int field4931;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field4919 = 0;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "F")
    public static float field4918;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lcu;")
    private class269 field4924;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4923;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field4932;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[II)V", line = 3)
    public final void method2190(int arg0, int[] arg1, int arg2) {
        field4936++;
        if (arg2 != 6026) {
            return;
        }
        class498 var4 = this.field4935.method3130(-10903, this.field4921 * 3);
        Buffer var5 = var4.method647(false, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field4935.method3087(var5, 6);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method1964()) {
            label100: for (int var18 = 0; var18 < arg0; var18++) {
                int var20 = arg1[var18];
                int var21 = this.field4939[var20];
                short[] var22 = this.field4934.field3330[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var22.length) {
                                continue label100;
                            }
                            if ((var21 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                    var6.method1961(var26);
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label126: for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = arg1[var10];
                short[] var12 = this.field4934.field3330[var11];
                int var13 = this.field4939[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var12.length <= var15) {
                                continue label126;
                            }
                            if ((var13 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                    var6.method1959(var17);
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
        var6.method1955();
        if (!var4.method646(arg2 - 6152) || var7 <= 0) {
            return;
        }
        this.field4935.method3065((this.field4934.field3305 & 0x7) != 0, (this.field4934.field3305 & 0x8) != 0, arg2 ^ 0x2E0B, this.field4931);
        if (this.field4935.field7690) {
            this.field4935.method358(Integer.MAX_VALUE, this.field4930, this.field4922, this.field4929);
        }
        class131 var19 = this.field4935.method3125((byte) 108);
        var19.method955(1.0F, 1.0F / this.field4920, 0, 1.0F / this.field4920);
        this.field4935.method3140(30604, class34.field500);
        this.field4935.method155(1, this.field4924, -39);
        this.field4935.method187(-2, this.field4934.field3347);
        this.field4935.method164(var8, class527.field6860, -47, 0, var7, var9 - (var8 - 1), var4);
        this.field4935.method3114(arg2 - 6011);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I", line = 158)
    public static final int method2191(int arg0, int arg1, int arg2) {
        field4938++;
        if (arg1 == 1 || arg1 == 3) {
            return class12.field127[arg0 & 0x3];
        } else {
            if (arg2 != 16711716) {
                method2195(-120, 82);
            }
            return class377.field4833[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V", line = 174)
    public final void method2192(int arg0, int arg1) {
        field4926++;
        this.field4923.method1954(arg0 * arg1 + 3);
        this.field4923.method1957(-1);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBI)V", line = 194)
    public static final void method2193(int arg0, byte arg1, int arg2) {
        if (arg1 <= 0) {
            return;
        }
        field4928++;
        if (class362.field4679 == 1) {
            class559.method2993(-22678, arg2, arg0, class592.field8017);
        } else if (class362.field4679 == 2) {
            class424.method2443((byte) 102, arg2, arg0);
        }
        class592.field8017 = null;
        class362.field4679 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)V", line = 215)
    public final void method2194(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -20) {
            this.field4935 = null;
        }
        this.field4939[this.field4934.field1166 * arg0 + arg2] = class131.method954(this.field4939[this.field4934.field1166 * arg0 + arg2], 0x1 << arg3);
        field4937++;
        this.field4921++;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V", line = 227)
    public static final void method2195(int arg0, int arg1) {
        class414.field5327 = null;
        class64.field867 = false;
        field4927++;
        class332.field4314 = arg1;
        class426.field5523 = 1;
        class557.field7280 = -1;
        class521.field6803 = -1;
        class27.field403 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V", line = 246)
    public final void method2196(int arg0, int arg1) {
        this.field4932 = this.field4935.method3098(arg0 * 4, true, (byte) -97);
        field4925++;
        if (arg1 < 125) {
            this.field4931 = 68;
        }
        this.field4923 = new Stream(this.field4932, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Los;IIIII)V", line = 406)
    public class385(class247 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4934 = arg0;
        this.field4935 = this.field4934.field3320;
        this.field4939 = new int[this.field4934.field1166 * this.field4934.field1164];
        this.field4929 = arg5;
        this.field4922 = arg4;
        this.field4920 = arg2;
        this.field4930 = arg3;
        this.field4931 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)V", line = 271)
    public final void method2197(int arg0, int arg1) {
        this.field4923.method1955();
        field4917++;
        this.field4924 = this.field4935.method159(false, false);
        int var3 = -117 % ((-arg0 - 61) / 38);
        this.field4924.method643(arg1 * 4, 2106, this.field4932, 4);
        this.field4932 = null;
        this.field4923 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(FIIII)V", line = 286)
    public final void method2198(float arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 255) {
            method2195(-51, -73);
        }
        field4933++;
        if (this.field4931 != -1) {
            class59 var6 = this.field4935.field598.method3162((byte) -104, this.field4931);
            int var7 = var6.field798 & 0xFF;
            if (var7 != 0 && var6.field805 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg4 * 131586;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((var8 & 0xFF00FF) * var7 + ((arg2 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field811 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg2 & 0xFF0000) >> 16) * var11;
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
                arg2 = (var13 & 0xFF00) + ((var12 << 8 & 0xFF0024) + (var14 >> 8));
            }
        }
        if (arg0 != 1.0F) {
            int var15 = (arg2 & 0xFF2B2A) >> 16;
            int var16 = arg2 >> 8 & 0xFF;
            int var17 = arg2 & 0xFF;
            int var18 = (int) ((float) var15 * arg0);
            int var19 = (int) ((float) var16 * arg0);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var20 = (int) ((float) var17 * arg0);
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
            arg2 = var20 | var18 << 16 | var19 << 8;
        }
        this.field4923.method1954(arg1 * 4);
        if (this.field4935.field7738 == 0) {
            this.field4923.method1957((byte) arg2);
            this.field4923.method1957((byte) (arg2 >> 8));
            this.field4923.method1957((byte) (arg2 >> 16));
        } else {
            this.field4923.method1957((byte) (arg2 >> 16));
            this.field4923.method1957((byte) (arg2 >> 8));
            this.field4923.method1957((byte) arg2);
        }
    }
}
