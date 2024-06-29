import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class137 extends class401 {

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public int field1934 = 0;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Lida;")
    private class214 field1935;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "F")
    public float field1949;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "I")
    public int field1946;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!as", name = "D", descriptor = "[I")
    private int[] field1951;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "Lnv;")
    private class382 field1943;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "Llh;")
    public static class487 field1945 = new class487(55, 7);

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!as", name = "C", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "Lvc;")
    private class288 field1944;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1931;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field1937;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIB)V", line = 3)
    public final void method955(int arg0, int arg1, int arg2, byte arg3) {
        field1940++;
        this.field1951[this.field1935.field446 * arg0 + arg1] = class647.method3617(this.field1951[this.field1935.field446 * arg0 + arg1], 0x1 << arg2);
        if (arg3 == -108) {
            this.field1934++;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V", line = 17)
    public final void method956(int arg0, int arg1) {
        field1947++;
        if (arg0 != 65280) {
            this.field1935 = null;
        }
        this.field1937 = this.field1943.method2215(true, arg1 * 4, 0);
        this.field1931 = new Stream(this.field1937, 0, arg1 * 4);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "([IZI)V", line = 37)
    public final void method957(int[] arg0, boolean arg1, int arg2) {
        field1941++;
        class415 var4 = this.field1943.method2263(this.field1934 * 3, 2);
        Buffer var5 = var4.method1119(116, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field1943.method2238(var5, -128);
        int var7 = 0;
        int var8 = 32767;
        if (arg1) {
            this.field1935 = null;
        }
        int var9 = -32768;
        if (Stream.method3484()) {
            label123: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg0[var10];
                short[] var12 = this.field1935.field2998[var11];
                int var13 = this.field1951[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var12.length <= var15) {
                                continue label123;
                            }
                            if ((0x1 << var14++ & var13) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    var6.method3476(var17);
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label99: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg0[var18];
                short[] var21 = this.field1935.field2998[var20];
                int var22 = this.field1951[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var21.length <= var24) {
                                continue label99;
                            }
                            if ((var22 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    var6.method3479(var26);
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3477();
        if (!var4.method1121(arg1) || var7 <= 0) {
            return;
        }
        this.field1943.method2249((this.field1935.field2994 & 0x7) != 0, (this.field1935.field2994 & 0x8) != 0, this.field1938, 0);
        if (this.field1943.field5380) {
            this.field1943.method153(Integer.MAX_VALUE, this.field1946, this.field1932, this.field1939);
        }
        class274 var19 = this.field1943.method2235(2);
        var19.method1703(1.0F / this.field1949, 1.0F / this.field1949, 1.0F, 6);
        this.field1943.method2227(class41.field482, (byte) -124);
        this.field1943.method1021(this.field1944, (byte) 102, 1);
        this.field1943.method1050(0, this.field1935.field3036);
        this.field1943.method1065(class345.field4628, var9 + 1 - var8, var8, var7, 0, var4, (byte) -104);
        this.field1943.method2234(-112);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIFII)V", line = 194)
    public final void method958(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (arg0 != -256) {
            return;
        }
        if (this.field1938 != -1) {
            class686 var6 = this.field1943.field2418.method1365(-17951, this.field1938);
            int var7 = var6.field9791 & 0xFF;
            if (var7 != 0 && var6.field9797 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((var8 & 0xFF00) * var7 + ((arg3 & 0xFF00) * var10) & 0xFF0000) + ((var8 & 0xFF00FF) * var7 + ((arg3 & 0xFF00FF) * var10) & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field9783 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg3 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var12 << 8 & 0xFF008D) + (var13 & 0xFF00) + (var14 >> 8);
            }
        }
        field1950++;
        this.field1931.method3480(arg4 * 4);
        if (arg2 != 1.0F) {
            int var15 = (arg3 & 0xFF6480) >> 16;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg3 & 0xFF;
            int var19 = (int) ((float) var16 * arg2);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var17 << 16 | var19 << 8 | var20;
        }
        if (this.field1943.field5313 == 0) {
            this.field1931.method3481((byte) arg3);
            this.field1931.method3481((byte) (arg3 >> 8));
            this.field1931.method3481((byte) (arg3 >> 16));
        } else {
            this.field1931.method3481((byte) (arg3 >> 16));
            this.field1931.method3481((byte) (arg3 >> 8));
            this.field1931.method3481((byte) arg3);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V", line = 312)
    public static void method959(int arg0) {
        field1945 = null;
        if (arg0 != 25318) {
            field1948 = 97;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lida;IIIII)V", line = 381)
    public class137(class214 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1935 = arg0;
        this.field1949 = arg2;
        this.field1946 = arg3;
        this.field1939 = arg5;
        this.field1951 = new int[this.field1935.field446 * this.field1935.field438];
        this.field1938 = arg1;
        this.field1943 = this.field1935.field3007;
        this.field1932 = arg4;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(II)V", line = 334)
    public final void method960(int arg0, int arg1) {
        field1942++;
        this.field1931.method3480(arg0 * 4 + arg1);
        this.field1931.method3481(-1);
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(II)V", line = 343)
    public final void method961(int arg0, int arg1) {
        field1933++;
        this.field1931.method3477();
        this.field1944 = this.field1943.method1038(false, -64);
        int var3 = -14 % ((-arg0 - 79) / 44);
        this.field1944.method1770(this.field1937, 4, arg1 * 4, -15029);
        this.field1937 = null;
        this.field1931 = null;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V", line = 357)
    public static final void method962(int arg0) {
        if (arg0 != 15124) {
            return;
        }
        field1936++;
        if (class266.field3600 != null) {
            class266.field3600.method1168(89);
            class266.field3600 = null;
            class315.field4348 = null;
        }
    }
}
