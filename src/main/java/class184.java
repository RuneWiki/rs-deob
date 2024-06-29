import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class184 extends class425 {

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "I")
    public int field2960 = 0;

    @OriginalMember(owner = "client!rfa", name = "D", descriptor = "Ltr;")
    private class268 field2964;

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "F")
    public float field2953;

    @OriginalMember(owner = "client!rfa", name = "B", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "Lcf;")
    private class562 field2946;

    @OriginalMember(owner = "client!rfa", name = "t", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!rfa", name = "H", descriptor = "[I")
    private int[] field2968;

    @OriginalMember(owner = "client!rfa", name = "C", descriptor = "[[I")
    public static int[][] field2963 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!rfa", name = "u", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!rfa", name = "v", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!rfa", name = "w", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!rfa", name = "y", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!rfa", name = "A", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!rfa", name = "E", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!rfa", name = "G", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!rfa", name = "x", descriptor = "Lwl;")
    private class378 field2958;

    @OriginalMember(owner = "client!rfa", name = "F", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2966;

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2951;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIFII)V")
    public final void method1342(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (~this.field2952 != arg4) {
            class699 var6 = this.field2946.field2768.method1500(this.field2952, -109);
            int var7 = var6.field9843 & 0xFF;
            if (var7 != 0 && var6.field9829 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field9838 & 0xFF;
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
                arg0 = (var14 >> 8) + ((var12 << 8 & 0xFF00F7) + (var13 & 0xFF00));
            }
        }
        field2961++;
        this.field2966.method3571(arg3 * 4);
        if (arg2 != 1.0F) {
            int var15 = (arg0 & 0xFFB01E) >> 16;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg0 & 0xFF;
            int var19 = (int) ((float) var16 * arg2);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var20 = (int) ((float) var18 * arg2);
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
            arg0 = var20 | var19 << 8 | var17 << 16;
        }
        if (this.field2946.field8161 == 0) {
            this.field2966.method3570((byte) arg0);
            this.field2966.method3570((byte) (arg0 >> 8));
            this.field2966.method3570((byte) (arg0 >> 16));
        } else {
            this.field2966.method3570((byte) (arg0 >> 16));
            this.field2966.method3570((byte) (arg0 >> 8));
            this.field2966.method3570((byte) arg0);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
    public static void method1343(int arg0) {
        field2963 = null;
        if (arg0 != 2643) {
            method1343(53);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[II)V")
    public final void method1344(int arg0, int[] arg1, int arg2) {
        field2949++;
        class595 var4 = this.field2946.method3256((byte) -33, this.field2960 * 3);
        Buffer var5 = var4.method1188(false, true);
        if (var5 == null) {
            return;
        }
        if (arg2 != 7) {
            this.method1351(17, (byte) -118);
        }
        Stream var6 = this.field2946.method3219(var5, arg2 ^ 0x3F6);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3580()) {
            label125: for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = arg1[var10];
                short[] var12 = this.field2964.field3970[var11];
                int var13 = this.field2968[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var12.length) {
                                continue label125;
                            }
                            if ((0x1 << var14++ & var13) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                    var6.method3575(var17);
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label100: for (int var18 = 0; var18 < arg0; var18++) {
                int var20 = arg1[var18];
                short[] var21 = this.field2964.field3970[var20];
                int var22 = this.field2968[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var21.length) {
                                continue label100;
                            }
                            if ((var22 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    var6.method3583(var26);
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method3576();
        if (!var4.method1185(true) || var7 <= 0) {
            return;
        }
        this.field2946.method3222(this.field2952, (byte) -103, (this.field2964.field3968 & 0x8) != 0, (this.field2964.field3968 & 0x7) != 0);
        if (this.field2946.field8192) {
            this.field2946.method39(Integer.MAX_VALUE, this.field2954, this.field2962, this.field2950);
        }
        class391 var19 = this.field2946.method3240(true);
        var19.method2421((byte) 56, 1.0F, 1.0F / this.field2953, 1.0F / this.field2953);
        this.field2946.method3265((byte) -88, class662.field9533);
        this.field2946.method2873(arg2 - 6, 1, this.field2958);
        this.field2946.method2862(13427, this.field2964.field3993);
        this.field2946.method2872(class634.field9107, var8, arg2 ^ 0xFFFFFFC0, var9 + 1 - var8, 0, var7, var4);
        this.field2946.method3220((byte) -106);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZLiga;Liga;)V")
    public static final void method1345(boolean arg0, class425 arg1, class425 arg2) {
        field2955++;
        if (arg0) {
            field2963 = null;
        }
        if (arg1.field6139 != null) {
            arg1.method2588(300);
        }
        arg1.field6134 = arg2;
        arg1.field6139 = arg2.field6139;
        arg1.field6139.field6134 = arg1;
        arg1.field6134.field6139 = arg1;
    }

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "(I)V")
    public static final void method1346(int arg0) {
        field2957++;
        if (arg0 != 0) {
            method1343(102);
        }
        class140.field2463.method27(class691.field9759, class234.field3494, class592.field8515);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BI)V")
    public static final void method1347(byte arg0, int arg1) {
        class87.field1627 = -1;
        field2959++;
        class362.field5373 = arg1;
        class42.field1080 = 100;
        class414.field6008 = 3;
        if (arg0 != -33) {
            field2963 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IB)V")
    public final void method1348(int arg0, byte arg1) {
        if (arg1 != 15) {
            method1345(false, null, null);
        }
        this.field2966.method3576();
        field2944++;
        this.field2958 = this.field2946.method2851(true, false);
        this.field2958.method2170(4, arg0 * 4, this.field2951, 118);
        this.field2966 = null;
        this.field2951 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIB)I")
    public static final int method1349(int arg0, int arg1, int arg2, byte arg3) {
        field2947++;
        if (class660.field9506 < 100) {
            return -2;
        }
        if (arg3 <= 1) {
            method1350(-9, 57, -58, 102, 90, -48);
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg2 - class407.field5899;
        int var7 = arg1 - class407.field5902;
        for (class473 var8 = (class473) class407.field5880.method1224(-2); var8 != null; var8 = (class473) class407.field5880.method1232(-2)) {
            if (var8.field6709 == arg0) {
                int var9 = var8.field6712;
                int var10 = var8.field6706;
                int var11 = var10 + class407.field5902 | class407.field5899 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var12 < var5) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIII)V")
    public static final void method1350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2945++;
        if (arg1 != 65535) {
            return;
        }
        if (arg3 >= class704.field9911 && class379.field5612 >= arg0 && class309.field4556 <= arg2 && client.field4115 >= arg5) {
            class70.method784(arg3, arg2, arg5, (byte) -88, arg0, arg4);
        } else {
            class518.method3044(arg3, arg4, arg2, arg5, (byte) -36, arg0);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(IB)V")
    public final void method1351(int arg0, byte arg1) {
        this.field2951 = this.field2946.method3246(true, arg0 * 4, (byte) 26);
        field2967++;
        if (arg1 != 61) {
            this.method1353(false, -34);
        }
        this.field2966 = new Stream(this.field2951, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIII)V")
    public final void method1352(int arg0, int arg1, int arg2, int arg3) {
        field2948++;
        this.field2968[this.field2964.field1041 * arg1 + arg3] = class2.method189(this.field2968[this.field2964.field1041 * arg1 + arg3], 0x1 << arg0);
        if (arg2 < -87) {
            this.field2960++;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Ltr;IIIII)V")
    public class184(class268 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2964 = arg0;
        this.field2953 = arg2;
        this.field2962 = arg4;
        this.field2950 = arg5;
        this.field2946 = this.field2964.field3965;
        this.field2954 = arg3;
        this.field2952 = arg1;
        this.field2968 = new int[this.field2964.field1043 * this.field2964.field1041];
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZI)V")
    public final void method1353(boolean arg0, int arg1) {
        if (arg0) {
            method1350(83, -14, 46, 67, -84, -46);
        }
        this.field2966.method3571(arg1 * 4 + 3);
        field2965++;
        this.field2966.method3570(-1);
    }
}
