import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 extends class513 {

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public int field226 = 0;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "Ljda;")
    private class206 field212;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "F")
    public float field211;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "[I")
    private int[] field218;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "Lifa;")
    private class393 field227;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "Loe;")
    public static class183 field223 = new class183();

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public static int field229 = 2;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public static int field231 = 2;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "Lel;")
    private class508 field215;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "Ljaclib/memory/Stream;")
    private Stream field224;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field230;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
    public final void method142(int arg0, int arg1) {
        field213++;
        int var3 = -22 % ((arg0 - 41) / 44);
        this.field224.method3574(arg1 * 4 + 3);
        this.field224.method3576(-1);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)I")
    public static final int method143(int arg0, int arg1) {
        field219++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        if (arg1 < 55) {
            field231 = -87;
        }
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V")
    public final void method144(int arg0, int arg1) {
        field220++;
        this.field230 = this.field227.method2376(arg1 * 4, true, true);
        this.field224 = new Stream(this.field230, 0, arg0 * arg1);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method145(int arg0) {
        if (arg0 >= -35) {
            method145(48);
        }
        field223 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(FIIII)V")
    public final void method146(float arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~this.field222 != arg3) {
            class352 var6 = this.field227.field2023.method397(this.field222, (byte) 36);
            int var7 = var6.field4703 & 0xFF;
            if (var7 != 0 && var6.field4707 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 <= 127) {
                    var8 = arg4 * 131586;
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
            int var11 = var6.field4704 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg2 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg2 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = (var12 << 8 & 0xFF00A3) + (var13 & 0xFF00) + (var14 >> 8);
            }
        }
        field225++;
        if (arg0 != 1.0F) {
            int var15 = arg2 >> 16 & 0xFF;
            int var16 = (arg2 & 0xFF6F) >> 8;
            int var17 = (int) ((float) var15 * arg0);
            int var18 = arg2 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg0);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg0);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg2 = var20 | var17 << 16 | var19 << 8;
        }
        this.field224.method3574(arg1 * 4);
        if (this.field227.field5443 == 0) {
            this.field224.method3576((byte) arg2);
            this.field224.method3576((byte) (arg2 >> 8));
            this.field224.method3576((byte) (arg2 >> 16));
        } else {
            this.field224.method3576((byte) (arg2 >> 16));
            this.field224.method3576((byte) (arg2 >> 8));
            this.field224.method3576((byte) arg2);
        }
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(II)V")
    public final void method147(int arg0, int arg1) {
        field216++;
        this.field224.method3578();
        this.field215 = this.field227.method516((byte) 116, false);
        this.field215.method739(arg0 * arg1, -16501, 4, this.field230);
        this.field230 = null;
        this.field224 = null;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public static final void method148(int arg0) {
        field210++;
        if (arg0 != 191) {
            field223 = null;
        }
        if (class527.field7715) {
            return;
        }
        class447.field6335 = true;
        if (class221.field2851.field4141) {
            class115.field1495 = ((int) class115.field1495 + 191 & 0xFFFFFF80);
        } else {
            class16.field311 += (24.0F - class16.field311) / 2.0F;
        }
        class527.field7715 = true;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[II)V")
    public final void method149(int arg0, int[] arg1, int arg2) {
        field221++;
        class154 var4 = this.field227.method2357(this.field226 * 3, 2);
        Buffer var5 = var4.method14(true, (byte) -60);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field227.method2350(var5, true);
        int var7 = -61 % ((2 - arg2) / 38);
        int var8 = 0;
        int var9 = 32767;
        int var10 = -32768;
        if (Stream.method3579()) {
            label122: for (int var11 = 0; var11 < arg0; var11++) {
                int var12 = arg1[var11];
                int var13 = this.field218[var12];
                short[] var14 = this.field212.field2494[var12];
                if (var13 != 0 && var14 != null) {
                    int var15 = 0;
                    int var16 = 0;
                    while (true) {
                        while (true) {
                            if (var14.length <= var16) {
                                continue label122;
                            }
                            if ((0x1 << var15++ & var13) == 0) {
                                var16 += 3;
                            } else {
                                for (int var17 = 0; var17 < 3; var17++) {
                                    int var18 = var14[var16++] & 0xFFFF;
                                    if (var9 > var18) {
                                        var9 = var18;
                                    }
                                    if (var10 < var18) {
                                        var10 = var18;
                                    }
                                    var6.method3581(var18);
                                }
                                var8++;
                            }
                        }
                    }
                }
            }
        } else {
            label96: for (int var19 = 0; var19 < arg0; var19++) {
                int var21 = arg1[var19];
                short[] var22 = this.field212.field2494[var21];
                int var23 = this.field218[var21];
                if (var23 != 0 && var22 != null) {
                    int var24 = 0;
                    int var25 = 0;
                    while (true) {
                        while (true) {
                            if (var22.length <= var25) {
                                continue label96;
                            }
                            if ((0x1 << var24++ & var23) == 0) {
                                var25 += 3;
                            } else {
                                var8++;
                                for (int var26 = 0; var26 < 3; var26++) {
                                    int var27 = var22[var25++] & 0xFFFF;
                                    if (var27 > var10) {
                                        var10 = var27;
                                    }
                                    if (var27 < var9) {
                                        var9 = var27;
                                    }
                                    var6.method3586(var27);
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3578();
        if (!var4.method15(-1969) || var8 <= 0) {
            return;
        }
        this.field227.method2322(-73, this.field222, (this.field212.field2495 & 0x8) != 0, (this.field212.field2495 & 0x7) != 0);
        if (this.field227.field5496) {
            this.field227.method261(Integer.MAX_VALUE, this.field232, this.field217, this.field214);
        }
        class653 var20 = this.field227.method2373((byte) -108);
        var20.method3683((byte) -100, 1.0F / this.field211, 1.0F, 1.0F / this.field211);
        this.field227.method2319((byte) 90, class148.field1809);
        this.field227.method493(0, 1, this.field215);
        this.field227.method480(this.field212.field2516, 58);
        this.field227.method528(0, class73.field1094, var8, var9, var10 + 1 - var9, var4, (byte) 123);
        this.field227.method2305(20921);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIB)V")
    public final void method150(int arg0, int arg1, int arg2, byte arg3) {
        this.field218[this.field212.field702 * arg0 + arg1] = class242.method1474(this.field218[this.field212.field702 * arg0 + arg1], 0x1 << arg2);
        field228++;
        if (arg3 <= 83) {
            this.method144(-126, -52);
        }
        this.field226++;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Ljda;IIIII)V")
    public class13(class206 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field212 = arg0;
        this.field211 = arg2;
        this.field214 = arg5;
        this.field217 = arg4;
        this.field218 = new int[this.field212.field706 * this.field212.field702];
        this.field222 = arg1;
        this.field227 = this.field212.field2470;
        this.field232 = arg3;
    }
}
