import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class58 extends class665 {

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    public int field1124 = 0;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "Lni;")
    private class481 field1117;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "F")
    public float field1121;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "Lhea;")
    private class387 field1122;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "[I")
    private int[] field1115;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "Lnba;")
    public static class268 field1106 = new class268();

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "Lbca;")
    private class613 field1123;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1114;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field1110;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "[S")
    public static short[] field1119;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([III)V")
    public final void method622(int[] arg0, int arg1, int arg2) {
        field1126++;
        class241 var4 = this.field1122.method2370(this.field1124 * 3, -12029);
        Buffer var5 = var4.method5(true, 126);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field1122.method2381(0, var5);
        if (arg1 != -543050192) {
            field1119 = null;
        }
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3483()) {
            label100: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg0[var18];
                int var21 = this.field1115[var20];
                short[] var22 = this.field1117.field6842[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var22.length <= var24) {
                                continue label100;
                            }
                            if ((var21 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    var6.method3475(var26);
                                    if (var26 > var9) {
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
            label126: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg0[var10];
                short[] var12 = this.field1117.field6842[var11];
                int var13 = this.field1115[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var12.length) {
                                continue label126;
                            }
                            if ((var13 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    var6.method3472(var17);
                                    if (var9 < var17) {
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
        var6.method3471();
        if (!var4.method2(105) || var7 <= 0) {
            return;
        }
        this.field1122.method2389((this.field1117.field6833 & 0x7) != 0, (this.field1117.field6833 & 0x8) != 0, this.field1105, false);
        if (this.field1122.field5653) {
            this.field1122.method195(Integer.MAX_VALUE, this.field1108, this.field1111, this.field1125);
        }
        class21 var19 = this.field1122.method2327(true);
        var19.method242(1.0F, 1.0F / this.field1121, 1.0F / this.field1121, (byte) 127);
        this.field1122.method2356(0, class266.field4017);
        this.field1122.method1865(1, -26558, this.field1123);
        this.field1122.method1883(-77, this.field1117.field6846);
        this.field1122.method1874(class80.field1355, var7, var8, true, var4, var9 + 1 - var8, 0);
        this.field1122.method2358(-1);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III[II)V")
    public static final void method623(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field1120++;
        arg4--;
        if (arg2 != 23309) {
            return;
        }
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg4 = var13 + 1;
            arg3[arg4] = arg0;
        }
        while (arg4 < var6) {
            arg4++;
            arg3[arg4] = arg0;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
    public final void method624(int arg0, int arg1) {
        field1118++;
        this.field1114.method3473(arg1 * 4 + 3);
        this.field1114.method3485(-1);
        if (arg0 != 16711935) {
            this.field1125 = 44;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)V")
    public final void method625(int arg0, int arg1) {
        this.field1114.method3471();
        field1113++;
        if (arg1 != 0) {
            method623(-109, -42, 87, null, 117);
        }
        this.field1123 = this.field1122.method1901(-21710, false);
        this.field1123.method994(arg1 ^ 0x6C7E, arg0 * 4, 4, this.field1110);
        this.field1110 = null;
        this.field1114 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    public static void method626(int arg0) {
        if (arg0 >= 99) {
            field1106 = null;
            field1119 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIFII)V")
    public final void method627(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (this.field1105 != -1) {
            class159 var6 = this.field1122.field2384.method1386(this.field1105, -6514);
            int var7 = var6.field2292 & 0xFF;
            if (var7 != 0 && var6.field2300 != 4) {
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
                    arg0 = ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((var8 & 0xFF00) * var7 + ((arg0 & 0xFF00) * var10) & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field2297 & 0xFF;
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
                arg0 = (var13 & 0xFF00) + (var14 >> 8) + (var12 << 8 & 0xFF0026);
            }
        }
        field1109++;
        if (arg2 != 1.0F) {
            int var15 = arg0 >> 16 & 0xFF;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = arg0 & 0xFF;
            int var18 = (int) ((float) var15 * arg2);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
            int var20 = (int) ((float) var17 * arg2);
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
            arg0 = var18 << 16 | var19 << 8 | var20;
        }
        this.field1114.method3473(arg3 * 4);
        if (this.field1122.field5672 == arg4) {
            this.field1114.method3485((byte) arg0);
            this.field1114.method3485((byte) (arg0 >> 8));
            this.field1114.method3485((byte) (arg0 >> 16));
        } else {
            this.field1114.method3485((byte) (arg0 >> 16));
            this.field1114.method3485((byte) (arg0 >> 8));
            this.field1114.method3485((byte) arg0);
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(II)V")
    public final void method628(int arg0, int arg1) {
        if (arg1 != 31269) {
            this.field1117 = null;
        }
        this.field1110 = this.field1122.method2333(arg0 * 4, (byte) 80, true);
        field1116++;
        this.field1114 = new Stream(this.field1110, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIZI)V")
    public final void method629(int arg0, int arg1, boolean arg2, int arg3) {
        this.field1115[this.field1117.field631 * arg3 + arg0] = class486.method2826(this.field1115[this.field1117.field631 * arg3 + arg0], 0x1 << arg1);
        field1107++;
        if (arg2) {
            this.field1124++;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lni;IIIII)V")
    public class58(class481 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1117 = arg0;
        this.field1108 = arg3;
        this.field1111 = arg4;
        this.field1125 = arg5;
        this.field1121 = arg2;
        this.field1105 = arg1;
        this.field1122 = this.field1117.field6809;
        this.field1115 = new int[this.field1117.field632 * this.field1117.field631];
    }
}
