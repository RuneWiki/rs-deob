import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class29 extends class134 {

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public int field332 = 0;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Lum;")
    private class523 field325;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lln;")
    private class377 field320;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "[I")
    private int[] field328;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "F")
    public float field333;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "[[I")
    public static int[][] field321 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Lel;")
    private class545 field331;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Ljaclib/memory/Stream;")
    private Stream field318;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field324;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIBI)V")
    public final void method145(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == -87) {
            field323++;
            this.field328[this.field325.field3410 * arg3 + arg0] = class695.method3919(this.field328[this.field325.field3410 * arg3 + arg0], 0x1 << arg1);
            this.field332++;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V")
    public final void method146(int arg0, byte arg1) {
        field322++;
        this.field324 = this.field320.method2314(false, arg0 * 4, true);
        this.field318 = new Stream(this.field324, 0, arg0 * 4);
        int var3 = 127 % ((arg1 + 25) / 34);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)V")
    public final void method147(byte arg0, int arg1) {
        field327++;
        this.field318.method3821();
        if (arg0 < 23) {
            this.field331 = null;
        }
        this.field331 = this.field320.method2306(false, 0);
        this.field331.method3106(this.field324, (byte) 123, 4, arg1 * 4);
        this.field324 = null;
        this.field318 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI[I)V")
    public final void method148(byte arg0, int arg1, int[] arg2) {
        field336++;
        class543 var4 = this.field320.method2288(15951, this.field332 * 3);
        Buffer var5 = var4.method263(13931, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field320.method2299(var5, 0);
        int var7 = 0;
        int var8 = 32767;
        if (arg0 <= 45) {
            field321 = null;
        }
        int var9 = -32768;
        if (Stream.method3823()) {
            label123: for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = arg2[var10];
                int var12 = this.field328[var11];
                short[] var13 = this.field325.field7444[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var13.length) {
                                continue label123;
                            }
                            if ((var12 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                    var6.method3820(var17);
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
            label98: for (int var18 = 0; var18 < arg1; var18++) {
                int var20 = arg2[var18];
                short[] var21 = this.field325.field7444[var20];
                int var22 = this.field328[var20];
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
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                    var6.method3816(var26);
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3821();
        if (!var4.method266(-19067) || var7 <= 0) {
            return;
        }
        this.field320.method2275((this.field325.field7450 & 0x8) != 0, (this.field325.field7450 & 0x7) != 0, (byte) 24, this.field334);
        if (this.field320.field5145) {
            this.field320.method355(Integer.MAX_VALUE, this.field326, this.field329, this.field335);
        }
        class427 var19 = this.field320.method2224((byte) 23);
        var19.method2661(1.0F / this.field333, 1.0F, (byte) 60, 1.0F / this.field333);
        this.field320.method2226(class655.field9349, -105);
        this.field320.method2301(true, this.field331, 1);
        this.field320.method2285(1, this.field325.field7474);
        this.field320.method2295(class178.field2092, -104, var4, var8, var7, 0, var9 + 1 - var8);
        this.field320.method2248((byte) -70);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static void method149(byte arg0) {
        field321 = null;
        int var1 = -57 / ((arg0 + 38) / 62);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    public final void method150(int arg0, int arg1) {
        if (arg1 != 32276) {
            this.method148((byte) 18, 51, null);
        }
        this.field318.method3811(arg0 * 4 + 3);
        field330++;
        this.field318.method3814(-1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIFII)V")
    public final void method151(boolean arg0, int arg1, float arg2, int arg3, int arg4) {
        if (this.field334 != -1) {
            class298 var6 = this.field320.field578.method931(this.field334, !arg0);
            int var7 = var6.field3696 & 0xFF;
            if (var7 != 0 && var6.field3702 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
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
            int var11 = var6.field3709 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg4 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg4 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = ((var12 & 0xF900FF00) << 8) + (var13 & 0xFF00) + (var14 >> 8);
            }
        }
        field319++;
        if (arg0) {
            return;
        }
        if (arg2 != 1.0F) {
            int var15 = (arg4 & 0xFF3AB9) >> 16;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg2);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var20 | var19 << 8 | var18 << 16;
        }
        this.field318.method3811(arg3 * 4);
        if (this.field320.field5074 == 0) {
            this.field318.method3814((byte) arg4);
            this.field318.method3814((byte) (arg4 >> 8));
            this.field318.method3814((byte) (arg4 >> 16));
        } else {
            this.field318.method3814((byte) (arg4 >> 16));
            this.field318.method3814((byte) (arg4 >> 8));
            this.field318.method3814((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lum;IIIII)V")
    public class29(class523 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field325 = arg0;
        this.field334 = arg1;
        this.field335 = arg5;
        this.field320 = this.field325.field7446;
        this.field326 = arg3;
        this.field328 = new int[this.field325.field3410 * this.field325.field3408];
        this.field333 = arg2;
        this.field329 = arg4;
    }
}
