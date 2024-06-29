import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class243 extends class627 {

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public int field3134 = 0;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "Lup;")
    private class521 field3128;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "[I")
    private int[] field3135;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "F")
    public float field3130;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public int field3127;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lbm;")
    private class684 field3117;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Lu;")
    private class60 field3122;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3129;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3125;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V")
    public final void method1506(int arg0, int arg1, int arg2, int arg3) {
        field3126++;
        if (arg2 != 131586) {
            this.method1511(-2, -94);
        }
        this.field3135[this.field3128.field5569 * arg1 + arg0] = class216.method1308(this.field3135[this.field3128.field5569 * arg1 + arg0], 0x1 << arg3);
        this.field3134++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B[II)V")
    public final void method1507(byte arg0, int[] arg1, int arg2) {
        field3120++;
        class246 var4 = this.field3117.method3712(this.field3134 * 3, (byte) 104);
        Buffer var5 = var4.method1518((byte) 82, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field3117.method3772(var5, arg0 - 45);
        int var7 = 0;
        int var8 = 32767;
        if (arg0 != 49) {
            this.field3117 = null;
        }
        int var9 = -32768;
        if (Stream.method2226()) {
            label122: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg1[var10];
                short[] var12 = this.field3128.field7338[var11];
                int var13 = this.field3135[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var12.length <= var15) {
                                continue label122;
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
                                    var6.method2233(var17);
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
            label98: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg1[var18];
                int var21 = this.field3135[var20];
                short[] var22 = this.field3128.field7338[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var22.length <= var24) {
                                continue label98;
                            }
                            if ((0x1 << var23++ & var21) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                    var6.method2224(var26);
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
        var6.method2223();
        if (!var4.method1517((byte) 116) || var7 <= 0) {
            return;
        }
        this.field3117.method3725((this.field3128.field7349 & 0x8) != 0, 121, this.field3127, (this.field3128.field7349 & 0x7) != 0);
        if (this.field3117.field9555) {
            this.field3117.method78(Integer.MAX_VALUE, this.field3118, this.field3132, this.field3116);
        }
        class462 var19 = this.field3117.method3729(1);
        var19.method2738(1.0F / this.field3130, 1.0F, 1.0F / this.field3130, arg0 - 36);
        this.field3117.method3771(0, class641.field8858);
        this.field3117.method1407(this.field3122, (byte) 77, 1);
        this.field3117.method1436(14522, this.field3128.field7372);
        this.field3117.method1415(var8, class260.field3301, (byte) 124, 0, var7, var4, var9 + 1 - var8);
        this.field3117.method3734((byte) -14);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
    public static final void method1508(String arg0, boolean arg1, byte arg2) {
        field3119++;
        class636.method3452(arg1, arg0, -1, -1, 24296);
        if (arg2 == 10) {
            ;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIF)V")
    public final void method1509(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field3127 != -1) {
            class91 var6 = this.field3117.field6364.method389(9559, this.field3127);
            int var7 = var6.field1156 & 0xFF;
            if (var7 != 0 && var6.field1149 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field1166 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg1 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg1 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var14 >> 8) + ((var12 << 8 & 0xFF00EE) + (var13 & 0xFF00));
            }
        }
        field3131++;
        if (arg4 != 1.0F) {
            int var15 = (arg1 & 0xFFFA8B) >> 16;
            int var16 = (arg1 & 0xFFE7) >> 8;
            int var17 = arg1 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg4);
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
            arg1 = var18 << 16 | var19 << 8 | var20;
        }
        this.field3129.method2234(arg0 * 4);
        if (this.field3117.field9608 == 0) {
            this.field3129.method2227((byte) arg1);
            this.field3129.method2227((byte) (arg1 >> 8));
            this.field3129.method2227((byte) (arg1 >> 16));
        } else {
            this.field3129.method2227((byte) (arg1 >> 16));
            this.field3129.method2227((byte) (arg1 >> 8));
            this.field3129.method2227((byte) arg1);
        }
        if (arg3 != 255) {
            method1508(null, true, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V")
    public final void method1510(int arg0, byte arg1) {
        this.field3125 = this.field3117.method3740(-3317, arg0 * 4, true);
        field3133++;
        this.field3129 = new Stream(this.field3125, 0, arg0 * 4);
        if (arg1 != 122) {
            this.field3132 = -51;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
    public final void method1511(int arg0, int arg1) {
        field3124++;
        this.field3129.method2234(arg1 * 4 + 3);
        if (arg0 == 1) {
            this.field3129.method2227(-1);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V")
    public final void method1512(int arg0, int arg1) {
        this.field3129.method2223();
        field3121++;
        this.field3122 = this.field3117.method1423(arg1 - 16025, false);
        this.field3122.method473(8660, arg0 * 4, 4, this.field3125);
        this.field3125 = null;
        this.field3129 = null;
        if (arg1 != 16129) {
            this.method1511(123, 25);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lup;IIIII)V")
    public class243(class521 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3128 = arg0;
        this.field3135 = new int[this.field3128.field5569 * this.field3128.field5562];
        this.field3130 = arg2;
        this.field3132 = arg4;
        this.field3127 = arg1;
        this.field3117 = this.field3128.field7371;
        this.field3116 = arg5;
        this.field3118 = arg3;
    }
}
