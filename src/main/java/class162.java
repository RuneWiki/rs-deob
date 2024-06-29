import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class162 extends class184 {

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
    public int field2567 = 0;

    @OriginalMember(owner = "client!uq", name = "H", descriptor = "Llw;")
    private class662 field2578;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!uq", name = "G", descriptor = "F")
    public float field2577;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "[I")
    private int[] field2570;

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "Lwu;")
    private class373 field2569;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!uq", name = "F", descriptor = "I")
    public static int field2576 = 13156520;

    @OriginalMember(owner = "client!uq", name = "D", descriptor = "Lmia;")
    public static class63 field2574 = new class63(66, -1);

    @OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
    public static int field2580 = 0;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!uq", name = "A", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!uq", name = "E", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!uq", name = "I", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "Lll;")
    private class366 field2559;

    @OriginalMember(owner = "client!uq", name = "C", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2573;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2566;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)V")
    public final void method1178(byte arg0, int arg1) {
        this.field2573.method3872();
        field2572++;
        this.field2559 = this.field2569.method2384(false, -70);
        this.field2559.method1285(4, this.field2566, arg1 * 4, 6265);
        if (arg0 <= 79) {
            field2574 = null;
        }
        this.field2573 = null;
        this.field2566 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
    public final void method1179(int arg0, int arg1) {
        field2557++;
        if (arg0 > -13) {
            method1182(-110);
        }
        this.field2573.method3859(arg1 * 4 + 3);
        this.field2573.method3871(-1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method1180(Random arg0, int arg1, int arg2) {
        if (arg2 > -91) {
            method1183(null, (byte) 58);
        }
        field2571++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class627.method3619(2, arg1)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class291.method1859(arg1, (byte) -97, var4);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZII)V")
    public final void method1181(int arg0, boolean arg1, int arg2, int arg3) {
        field2561++;
        this.field2570[this.field2578.field3963 * arg3 + arg2] = class625.method3600(this.field2570[this.field2578.field3963 * arg3 + arg2], 0x1 << arg0);
        this.field2567++;
        if (arg1) {
            this.field2569 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static void method1182(int arg0) {
        if (arg0 < 25) {
            method1188(-120L, (byte) -12);
        }
        field2574 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lcs;B)I")
    public static final int method1183(class342 arg0, byte arg1) {
        field2564++;
        int var2 = -16 / ((36 - arg1) / 55);
        String var3 = class180.method1277((byte) -85, arg0);
        int[] var4 = null;
        if (class88.method713(0, arg0.field4972)) {
            var4 = class336.field4876.method2079((int) arg0.field4971, (byte) -123).field8219;
        } else if (arg0.field4961 != -1) {
            var4 = class336.field4876.method2079(arg0.field4961, (byte) 125).field8219;
        } else if (class615.method3555(arg0.field4972, 5066)) {
            class432 var5 = (class432) class497.field7067.method2287((long) ((int) arg0.field4971), (byte) -117);
            if (var5 != null) {
                class282 var6 = var5.field6439;
                class348 var7 = var6.field4008;
                if (var7.field5076 != null) {
                    var7 = var7.method2207(100, class83.field1160);
                }
                if (var7 != null) {
                    var4 = var7.field5045;
                }
            }
        } else if (class348.method2203((byte) 87, arg0.field4972)) {
            Object var8 = null;
            class211 var9;
            if (arg0.field4972 == 1008) {
                var9 = class239.field3470.method388((int) arg0.field4971, 100);
            } else {
                var9 = class239.field3470.method388((int) (arg0.field4971 >>> 32 & 0x7FFFFFFFL), 100);
            }
            if (var9.field3172 != null) {
                var9 = var9.method1442((byte) -78, class83.field1160);
            }
            if (var9 != null) {
                var4 = var9.field3098;
            }
        }
        if (var4 != null) {
            var3 = var3 + class518.method3056(0, var4);
        }
        int var10 = class335.field4827.method589(var3, 169, class259.field3701);
        if (arg0.field4965) {
            var10 += class385.field5817.method1517() + 4;
        }
        return var10;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIFB)V")
    public final void method1184(int arg0, int arg1, int arg2, float arg3, byte arg4) {
        if (this.field2563 != -1) {
            class293 var6 = this.field2569.field849.method1124((byte) 62, this.field2563);
            int var7 = var6.field4179 & 0xFF;
            if (var7 != 0 && var6.field4185 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field4193 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg0 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg0 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = ((var12 & 0xE00FF00) << 8) + (var13 & 0xFF00) + (var14 >> 8);
            }
        }
        field2579++;
        if (arg3 != 1.0F) {
            int var15 = (arg0 & 0xFF686E) >> 16;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg0 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            int var20 = (int) ((float) var18 * arg3);
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
            arg0 = var19 << 8 | var17 << 16 | var20;
        }
        this.field2573.method3859(arg1 * 4);
        if (this.field2569.field5629 == 0) {
            this.field2573.method3871((byte) arg0);
            this.field2573.method3871((byte) (arg0 >> 8));
            this.field2573.method3871((byte) (arg0 >> 16));
        } else {
            this.field2573.method3871((byte) (arg0 >> 16));
            this.field2573.method3871((byte) (arg0 >> 8));
            this.field2573.method3871((byte) arg0);
        }
        int var21 = 94 % ((arg4 + 29) / 58);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[II)V")
    public final void method1185(int arg0, int[] arg1, int arg2) {
        field2568++;
        class216 var4 = this.field2569.method2404((byte) 116, this.field2567 * 3);
        Buffer var5 = var4.method1457(true, arg0 ^ 0xFF008E);
        if (var5 == null) {
            return;
        }
        if (arg0 != -16711936) {
            this.field2559 = null;
        }
        Stream var6 = this.field2569.method2392(var5, -15232);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3869()) {
            label126: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg1[var10];
                short[] var12 = this.field2578.field9253[var11];
                int var13 = this.field2570[var11];
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
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                    var6.method3861(var17);
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label100: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg1[var18];
                short[] var21 = this.field2578.field9253[var20];
                int var22 = this.field2570[var20];
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
                                    var6.method3858(var26);
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
        }
        var6.method3872();
        if (!var4.method1459(arg0 + 16685437) || var7 <= 0) {
            return;
        }
        this.field2569.method2398(false, (this.field2578.field9275 & 0x8) != 0, (this.field2578.field9275 & 0x7) != 0, this.field2563);
        if (this.field2569.field5570) {
            this.field2569.method439(Integer.MAX_VALUE, this.field2565, this.field2562, this.field2558);
        }
        class441 var19 = this.field2569.method2299(-25498);
        var19.method2720(1.0F / this.field2577, 1.0F, 0, 1.0F / this.field2577);
        this.field2569.method2291(class127.field1688, -122);
        this.field2569.method2389(1, (byte) -64, this.field2559);
        this.field2569.method2368(this.field2578.field9294, (byte) 53);
        this.field2569.method2325(var7, 0, var9 + 1 - var8, var8, var4, -8, class506.field7196);
        this.field2569.method2410(-1);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)V")
    public final void method1186(int arg0, int arg1) {
        this.field2566 = this.field2569.method2342(arg1 * 4, 4194, true);
        field2560++;
        this.field2573 = new Stream(this.field2566, arg0, arg1 * 4);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)V")
    public static final void method1187(int arg0, int arg1, int arg2) {
        class186 var3 = class80.field1136[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class51.method371(var3.field2835);
        class51.method371(var3.field2832);
        if (var3.field2835 != null) {
            var3.field2835 = null;
        }
        if (var3.field2832 != null) {
            var3.field2832 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Llw;IIIII)V")
    public class162(class662 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2578 = arg0;
        this.field2565 = arg3;
        this.field2577 = arg2;
        this.field2562 = arg4;
        this.field2570 = new int[this.field2578.field3963 * this.field2578.field3962];
        this.field2569 = this.field2578.field9250;
        this.field2563 = arg1;
        this.field2558 = arg5;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1188(long arg0, byte arg1) {
        field2575++;
        class220.field3225.setTime(new Date(arg0));
        int var3 = class220.field3225.get(7);
        int var4 = class220.field3225.get(5);
        int var5 = class220.field3225.get(2);
        int var6 = class220.field3225.get(1);
        int var7 = class220.field3225.get(11);
        int var8 = class220.field3225.get(12);
        if (arg1 != -76) {
            method1187(125, -72, 1);
        }
        int var9 = class220.field3225.get(13);
        return class55.field761[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class243.field3546[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }
}
