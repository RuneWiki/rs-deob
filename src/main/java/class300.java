import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class300 extends class176 {

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
    public int field4109 = 0;

    @OriginalMember(owner = "client!ws", name = "I", descriptor = "Luw;")
    private class352 field4113;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "[I")
    private int[] field4103;

    @OriginalMember(owner = "client!ws", name = "H", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "Lwr;")
    private class388 field4105;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    public int field4093;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public int field4095;

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "I")
    public int field4107;

    @OriginalMember(owner = "client!ws", name = "A", descriptor = "F")
    public float field4106;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field4096 = -1;

    @OriginalMember(owner = "client!ws", name = "K", descriptor = "Lcba;")
    public static class471 field4115;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ws", name = "E", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!ws", name = "J", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "Llu;")
    private class609 field4100;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4101;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field4094;

    @OriginalMember(owner = "client!ws", name = "L", descriptor = "[[Lpe;")
    public static class524[][] field4116;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIII)V")
    public static final void method1905(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4104++;
        class314 var5 = class483.method2819(arg1, arg4, arg1 ^ 0x5333);
        var5.method1959(arg1 + 19789);
        var5.field4227 = arg0;
        var5.field4223 = arg3;
        var5.field4230 = arg2;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II[I)V")
    public final void method1906(int arg0, int arg1, int[] arg2) {
        field4092++;
        class321 var4 = this.field4105.method2288(this.field4109 * 3, false);
        Buffer var5 = var4.method613(true, -25838);
        if (var5 == null) {
            return;
        }
        int var6 = 104 % ((55 - arg0) / 53);
        Stream var7 = this.field4105.method2269(50, var5);
        int var8 = 0;
        int var9 = 32767;
        int var10 = -32768;
        if (Stream.method3294()) {
            label120: for (int var11 = 0; var11 < arg1; var11++) {
                int var12 = arg2[var11];
                int var13 = this.field4103[var12];
                short[] var14 = this.field4113.field4721[var12];
                if (var13 != 0 && var14 != null) {
                    int var15 = 0;
                    int var16 = 0;
                    while (true) {
                        while (true) {
                            if (var16 >= var14.length) {
                                continue label120;
                            }
                            if ((var13 & 0x1 << var15++) == 0) {
                                var16 += 3;
                            } else {
                                var8++;
                                for (int var17 = 0; var17 < 3; var17++) {
                                    int var18 = var14[var16++] & 0xFFFF;
                                    if (var18 > var10) {
                                        var10 = var18;
                                    }
                                    var7.method3291(var18);
                                    if (var9 > var18) {
                                        var9 = var18;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label96: for (int var19 = 0; var19 < arg1; var19++) {
                int var21 = arg2[var19];
                int var22 = this.field4103[var21];
                short[] var23 = this.field4113.field4721[var21];
                if (var22 != 0 && var23 != null) {
                    int var24 = 0;
                    int var25 = 0;
                    while (true) {
                        while (true) {
                            if (var23.length <= var25) {
                                continue label96;
                            }
                            if ((var22 & 0x1 << var24++) == 0) {
                                var25 += 3;
                            } else {
                                var8++;
                                for (int var26 = 0; var26 < 3; var26++) {
                                    int var27 = var23[var25++] & 0xFFFF;
                                    if (var27 > var10) {
                                        var10 = var27;
                                    }
                                    var7.method3298(var27);
                                    if (var9 > var27) {
                                        var9 = var27;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var7.method3288();
        if (!var4.method616((byte) -107) || var8 <= 0) {
            return;
        }
        this.field4105.method2344((byte) 73, this.field4112, (this.field4113.field4727 & 0x8) != 0, (this.field4113.field4727 & 0x7) != 0);
        if (this.field4105.field5446) {
            this.field4105.method1314(Integer.MAX_VALUE, this.field4093, this.field4107, this.field4095);
        }
        class557 var20 = this.field4105.method2289(-38);
        var20.method3174(1.0F, (byte) 59, 1.0F / this.field4106, 1.0F / this.field4106);
        this.field4105.method2299(38, class510.field7141);
        this.field4105.method1609(this.field4113.field4760, -111);
        this.field4105.method1607(this.field4100, 1, false);
        this.field4105.method1615(false, var10 + 1 - var9, var4, var9, var8, 0, class481.field6784);
        this.field4105.method2325(1);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public static final void method1907(int arg0) {
        field4097++;
        if (arg0 != 255) {
            field4116 = null;
        }
        class483.field6820 = false;
        class481.method2802(-126, class467.field6582, class166.field2389, class28.field477, class228.field3256);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IB)V")
    public static final void method1908(int arg0, byte arg1) {
        if (arg1 > -66) {
            field4115 = null;
        }
        field4108++;
        if (class397.field5668 == null || class397.field5668.length < arg0) {
            class397.field5668 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1909(String arg0, byte arg1) {
        System.out.println("Error: " + class184.method1147("\n", arg0, false, "%0a"));
        field4114++;
        if (arg1 != -71) {
            method1907(-21);
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
    public static void method1910(int arg0) {
        field4116 = null;
        if (arg0 != -6966) {
            method1905(53, 100, 104, 58, -11);
        }
        field4115 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIII)V")
    public final void method1911(int arg0, int arg1, int arg2, int arg3) {
        this.field4103[this.field4113.field2505 * arg1 + arg2] = class73.method578(this.field4103[this.field4113.field2505 * arg1 + arg2], 0x1 << arg0);
        if (arg3 != 255) {
            method1908(113, (byte) -87);
        }
        field4098++;
        this.field4109++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
    public final void method1912(int arg0, int arg1) {
        this.field4101.method3299(arg0 * arg1 + 3);
        field4111++;
        this.field4101.method3297(-1);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIIF)V")
    public final void method1913(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field4112 != -1) {
            class211 var6 = this.field4105.field2924.method190((byte) -89, this.field4112);
            int var7 = var6.field2973 & 0xFF;
            if (var7 != 0 && var6.field2984 != 4) {
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
            int var11 = var6.field2975 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg0 >> 16 & 0xFF) * var11;
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
                arg0 = (var14 >> 8) + (((var12 & 0x6500FF00) << 8) + (var13 & 0xFF00));
            }
        }
        if (arg2 != 65535) {
            this.method1913(11, -30, 47, 39, 0.19475381F);
        }
        field4110++;
        if (arg4 != 1.0F) {
            int var15 = arg0 >> 16 & 0xFF;
            int var16 = (arg0 & 0xFF5E) >> 8;
            int var17 = arg0 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            int var19 = (int) ((float) var16 * arg4);
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
            int var20 = (int) ((float) var17 * arg4);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg0 = var20 | var19 << 8 | var18 << 16;
        }
        this.field4101.method3299(arg3 * 4);
        if (this.field4105.field5417 == 0) {
            this.field4101.method3297((byte) arg0);
            this.field4101.method3297((byte) (arg0 >> 8));
            this.field4101.method3297((byte) (arg0 >> 16));
        } else {
            this.field4101.method3297((byte) (arg0 >> 16));
            this.field4101.method3297((byte) (arg0 >> 8));
            this.field4101.method3297((byte) arg0);
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(IB)V")
    public final void method1914(int arg0, byte arg1) {
        this.field4101.method3288();
        field4102++;
        this.field4100 = this.field4105.method1644((byte) 115, false);
        if (arg1 > 86) {
            this.field4100.method617(81, 4, arg0 * 4, this.field4094);
            this.field4101 = null;
            this.field4094 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Luw;IIIII)V")
    public class300(class352 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4113 = arg0;
        this.field4103 = new int[this.field4113.field2505 * this.field4113.field2503];
        this.field4112 = arg1;
        this.field4105 = this.field4113.field4729;
        this.field4093 = arg3;
        this.field4095 = arg5;
        this.field4107 = arg4;
        this.field4106 = arg2;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)V")
    public final void method1915(boolean arg0, int arg1) {
        this.field4094 = this.field4105.method2293(arg1 * 4, -126, true);
        field4099++;
        if (arg0) {
            this.field4093 = -57;
        }
        this.field4101 = new Stream(this.field4094, 0, arg1 * 4);
    }

    static {
        new class104("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field4115 = new class471(19, 12);
    }
}
