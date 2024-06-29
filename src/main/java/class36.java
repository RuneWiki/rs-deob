import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class36 extends class108 {

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public int field549 = 0;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "Luo;")
    private class171 field562;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "[I")
    private int[] field555;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "Lre;")
    private class582 field556;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "F")
    public float field557;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "Llca;")
    private class133 field565;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "Ljaclib/memory/Stream;")
    private Stream field566;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field561;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "[Z")
    public static boolean[] field553;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([III)V")
    public final void method213(int[] arg0, int arg1, int arg2) {
        field550++;
        class180 var4 = this.field556.method3301(7040, this.field549 * 3);
        Buffer var5 = var4.method297((byte) 52, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field556.method3287(-1, var5);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3209()) {
            label124: for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = arg0[var10];
                int var12 = this.field555[var11];
                short[] var13 = this.field562.field2199[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var13.length <= var15) {
                                continue label124;
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
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    var6.method3198(var17);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label100: for (int var18 = 0; var18 < arg1; var18++) {
                int var20 = arg0[var18];
                int var21 = this.field555[var20];
                short[] var22 = this.field562.field2199[var20];
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
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                    var6.method3203(var26);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 > -125) {
            return;
        }
        var6.method3207();
        if (!var4.method290(22526) || var7 <= 0) {
            return;
        }
        this.field556.method3329(-10053, ~(this.field562.field2184 & 0x8) != -1, (this.field562.field2184 & 0x7) != 0, this.field559);
        if (this.field556.field8329) {
            this.field556.method953(Integer.MAX_VALUE, this.field551, this.field548, this.field564);
        }
        class186 var19 = this.field556.method3299(-8435);
        var19.method1138(0, 1.0F / this.field557, 1.0F / this.field557, 1.0F);
        this.field556.method3321((byte) -127, class620.field8928);
        this.field556.method1171(this.field565, 1, (byte) -98);
        this.field556.method1207(this.field562.field2211, 1);
        this.field556.method1212(class546.field7613, var4, var9 + 1 - var8, -77, var8, var7, 0);
        this.field556.method3323(0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static void method214(byte arg0) {
        if (arg0 != 54) {
            method221(125, -5);
        }
        field553 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
    public final void method215(int arg0, int arg1) {
        field558++;
        this.field566.method3204(arg1 * 4 + 3);
        this.field566.method3205(-1);
        if (arg0 != -29973) {
            this.method216(-31, 126);
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V")
    public final void method216(int arg0, int arg1) {
        this.field561 = this.field556.method3311(arg1 * 4, true, -20127);
        field554++;
        if (arg0 == -1) {
            this.field566 = new Stream(this.field561, 0, arg1 * 4);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)V")
    public final void method217(int arg0, boolean arg1) {
        field567++;
        this.field566.method3207();
        this.field565 = this.field556.method1197(10, arg1);
        this.field565.method704(this.field561, arg0 * 4, (byte) -102, 4);
        this.field566 = null;
        this.field561 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLqa;Lkr;)V")
    public static final void method218(byte arg0, class167 arg1, class329 arg2) {
        field568++;
        if (class60.field835) {
            return;
        }
        arg1.method949(0);
        class55.field731 = arg1.method916(class295.method1812(arg2, class49.field669), true);
        class55.field731.method632((class502.field6955 - class55.field731.method627()) / 2, (class604.field8711 - class55.field731.method631()) / 2);
        class354.field4959 = arg1.method916(class295.method1812(arg2, class208.field2707), true);
        class354.field4959.method632((class502.field6955 - class354.field4959.method627()) / 2, 18);
        class60.field835 = true;
        int var3 = 88 / ((-arg0 - 20) / 58);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IFIII)V")
    public final void method219(int arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field559 != -1) {
            class41 var6 = this.field556.field2114.method2151(true, this.field559);
            int var7 = var6.field600 & 0xFF;
            if (var7 != 0 && var6.field620 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((var8 & 0xFF00) * var7 + ((arg2 & 0xFF00) * var10) & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field614 & 0xFF;
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
                arg2 = (var14 >> 8) + ((var12 & 0x7D00FF00) << 8) + (var13 & 0xFF00);
            }
        }
        field560++;
        if (arg1 != 1.0F) {
            int var15 = arg2 >> 16 & 0xFF;
            int var16 = (arg2 & 0xFF73) >> 8;
            int var17 = arg2 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            int var19 = (int) ((float) var16 * arg1);
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
            int var20 = (int) ((float) var17 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg2 = var19 << 8 | var18 << 16 | var20;
        }
        this.field566.method3204(arg4 * 4);
        if (this.field556.field8376 == 0) {
            this.field566.method3205((byte) arg2);
            this.field566.method3205((byte) (arg2 >> 8));
            this.field566.method3205((byte) (arg2 >> 16));
        } else {
            this.field566.method3205((byte) (arg2 >> 16));
            this.field566.method3205((byte) (arg2 >> 8));
            this.field566.method3205((byte) arg2);
        }
        if (arg3 >= -31) {
            this.method220((byte) -108, -117, -76, -34);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIII)V")
    public final void method220(byte arg0, int arg1, int arg2, int arg3) {
        this.field555[this.field562.field7581 * arg3 + arg1] = class292.method1790(this.field555[this.field562.field7581 * arg3 + arg1], 0x1 << arg2);
        field563++;
        if (arg0 <= 124) {
            this.method220((byte) 95, 21, -97, 50);
        }
        this.field549++;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)Z")
    public static final boolean method221(int arg0, int arg1) {
        if (arg0 > -120) {
            return true;
        } else {
            field552++;
            return arg1 == 1 || arg1 == 3 || arg1 == 5;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Luo;IIIII)V")
    public class36(class171 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field562 = arg0;
        this.field548 = arg4;
        this.field559 = arg1;
        this.field555 = new int[this.field562.field7585 * this.field562.field7581];
        this.field556 = this.field562.field2182;
        this.field564 = arg5;
        this.field557 = arg2;
        this.field551 = arg3;
    }
}
