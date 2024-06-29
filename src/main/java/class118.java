import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class118 extends class425 {

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "Loj;")
    private class350 field2101;

    @OriginalMember(owner = "client!eea", name = "w", descriptor = "I")
    public int field2105;

    @OriginalMember(owner = "client!eea", name = "C", descriptor = "I")
    public int field2111;

    @OriginalMember(owner = "client!eea", name = "A", descriptor = "Lus;")
    private class1 field2109;

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "F")
    public float field2108;

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "[I")
    private int[] field2097;

    @OriginalMember(owner = "client!eea", name = "x", descriptor = "I")
    public int field2106;

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!eea", name = "G", descriptor = "Lbl;")
    private class603 field2115;

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2098 = "";

    @OriginalMember(owner = "client!eea", name = "B", descriptor = "[I")
    public static int[] field2110 = new int[] { 7500, 500 };

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "[I")
    public static int[] field2092 = new int[3];

    @OriginalMember(owner = "client!eea", name = "H", descriptor = "[I")
    public static int[] field2116 = new int[256];

    @OriginalMember(owner = "client!eea", name = "J", descriptor = "Lsb;")
    public static class266 field2118;

    @OriginalMember(owner = "client!eea", name = "K", descriptor = "Lqfa;")
    public static class85 field2119;

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!eea", name = "t", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!eea", name = "y", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!eea", name = "D", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!eea", name = "E", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!eea", name = "I", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!eea", name = "F", descriptor = "Lrca;")
    private class423 field2114;

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2104;

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2096;

    @OriginalMember(owner = "client!eea", name = "r", descriptor = "[I")
    public static int[] field2100;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)V")
    public final void method1030(int arg0, int arg1) {
        if (arg1 == 256) {
            field2102++;
            this.field2104.method3571(arg0 * 4 + 3);
            this.field2104.method3570(-1);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BIII)V")
    public final void method1031(byte arg0, int arg1, int arg2, int arg3) {
        this.field2097[this.field2101.field1041 * arg3 + arg1] = class2.method189(this.field2097[this.field2101.field1041 * arg3 + arg1], 0x1 << arg2);
        field2107++;
        if (arg0 < 102) {
            field2118 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lcj;Z)V")
    public static final void method1032(class646 arg0, boolean arg1) {
        if (!arg1) {
            method1036(false);
        }
        class301.field4497 = arg0;
        field2117++;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IB)V")
    public final void method1033(int arg0, byte arg1) {
        this.field2096 = this.field2109.field214.method3567(arg0 * 4, true);
        if (arg1 != 59) {
            this.method1037(null, -22, (byte) 46);
        }
        field2113++;
        this.field2104 = new Stream(this.field2096);
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(IB)V")
    public final void method1034(int arg0, byte arg1) {
        field2103++;
        this.field2104.method3576();
        class510 var3 = this.field2109.method183(arg0 * 4, 4, this.field2096, false, (byte) -78);
        this.field2114 = new class423(var3, 5121, 4, 0);
        this.field2104 = null;
        if (arg1 != 8) {
            this.method1037(null, -29, (byte) -21);
        }
        this.field2096 = null;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIFII)V")
    public final void method1035(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (arg4 < 7) {
            this.method1037(null, 104, (byte) -104);
        }
        if (this.field2105 != -1) {
            class699 var6 = this.field2109.field2768.method1500(this.field2105, -88);
            int var7 = var6.field9843 & 0xFF;
            if (var7 != 0 && var6.field9829 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg1 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field9838 & 0xFF;
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
                arg3 = (var14 >> 8) + (var12 << 8 & 0xFF00D1) + (var13 & 0xFF00);
            }
        }
        field2112++;
        if (arg2 != 1.0F) {
            int var15 = (arg3 & 0xFF3D7F) >> 16;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg3 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
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
            arg3 = var19 << 8 | var17 << 16 | var20;
        }
        this.field2104.method3571(arg0 * 4);
        this.field2104.method3570((byte) (arg3 >> 16));
        this.field2104.method3570((byte) (arg3 >> 8));
        this.field2104.method3570((byte) arg3);
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Loj;IIIII)V")
    public class118(class350 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2101 = arg0;
        this.field2105 = arg1;
        this.field2111 = arg5;
        this.field2109 = this.field2101.field5217;
        this.field2108 = arg2;
        this.field2097 = new int[this.field2101.field1043 * this.field2101.field1041];
        this.field2106 = arg4;
        this.field2093 = arg3;
        this.field2115 = new class603(this.field2109, 5123, null, 1);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)V")
    public static void method1036(boolean arg0) {
        field2100 = null;
        field2092 = null;
        field2116 = null;
        field2098 = null;
        field2110 = null;
        if (!arg0) {
            method1038(13, -35);
        }
        field2119 = null;
        field2118 = null;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "([IIB)V")
    public final void method1037(int[] arg0, int arg1, byte arg2) {
        field2099++;
        int var4 = 0;
        int var5 = -89 / ((6 - arg2) / 56);
        class424 var6 = this.field2109.field333;
        var6.field1393 = 0;
        if (this.field2109.field267) {
            for (int var13 = 0; var13 < arg1; var13++) {
                int var14 = arg0[var13];
                int var15 = this.field2097[var14];
                short[] var16 = this.field2101.field5236[var14];
                if (var15 != 0 && var16 != null) {
                    int var17 = 0;
                    int var18 = 0;
                    while (var16.length > var18) {
                        if ((0x1 << var17++ & var15) == 0) {
                            var18 += 3;
                        } else {
                            var4++;
                            var6.method745(var16[var18++] & 0xFFFF, 128);
                            var4++;
                            var6.method745(var16[var18++] & 0xFFFF, 128);
                            var4++;
                            var6.method745(var16[var18++] & 0xFFFF, 128);
                        }
                    }
                }
            }
        } else {
            for (int var7 = 0; var7 < arg1; var7++) {
                int var8 = arg0[var7];
                short[] var9 = this.field2101.field5236[var8];
                int var10 = this.field2097[var8];
                if (var10 != 0 && var9 != null) {
                    int var11 = 0;
                    int var12 = 0;
                    while (var12 < var9.length) {
                        if ((var10 & 0x1 << var11++) == 0) {
                            var12 += 3;
                        } else {
                            var6.method689(var9[var12++] & 0xFFFF, true);
                            var4++;
                            var6.method689(var9[var12++] & 0xFFFF, true);
                            var4++;
                            var6.method689(var9[var12++] & 0xFFFF, true);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field2115.method263(-102, var6.field1397, var6.field1393, 5123);
        this.field2109.method184(this.field2101.field5260, this.field2101.field5250, this.field2114, this.field2101.field5251, (byte) 52);
        this.field2109.method6((this.field2101.field5233 & 0x7) != 0, this.field2105, -10715, (this.field2101.field5233 & 0x8) != 0);
        if (this.field2109.field349) {
            this.field2109.method39(Integer.MAX_VALUE, this.field2093, this.field2106, this.field2111);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field2108, 1.0F / this.field2108, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field2109.method184(this.field2101.field5260, this.field2101.field5250, this.field2114, this.field2101.field5251, (byte) 99);
        this.field2109.method9(this.field2115, 0, 4, (byte) 90, var4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(II)V")
    public static final void method1038(int arg0, int arg1) {
        field2095++;
        if (class199.field3098 == arg0) {
            return;
        }
        if (arg0 == 13) {
            if (class687.field9733 == null) {
                class286.method1899(class362.field5384, class163.field2735, class284.field4229, 2);
            } else {
                class462.method2763(class163.field2735, 3685);
            }
        }
        if (arg0 != 13 && class275.field4099 != null) {
            class275.field4099.method481(true);
            class275.field4099 = null;
        }
        if (arg0 == 3) {
            class115.method1018(true, class46.field1129 != class361.field5368);
        }
        if (arg0 == 7) {
            class1.method73((byte) -16, class444.field6382 != class361.field5368);
        }
        if (arg0 == 5) {
            if (class687.field9733 == null) {
                class107.method969(class362.field5384, class284.field4229, (byte) -125);
            } else {
                class581.method3336((byte) 54);
            }
        } else if (arg0 == 6) {
            if (class687.field9733 == null) {
                class286.method1899(class362.field5384, class163.field2735, class284.field4229, 2);
            } else {
                class462.method2763(class163.field2735, 3685);
            }
        } else if (arg0 == 9) {
            if (class687.field9733 == null) {
                class286.method1899(class362.field5384, class163.field2735, class284.field4229, 2);
            } else {
                class462.method2763(class163.field2735, 3685);
            }
        } else if (arg0 == 12) {
            if (class687.field9733 == null) {
                class107.method969(class362.field5384, class284.field4229, (byte) 31);
            } else {
                class581.method3336((byte) 54);
            }
        }
        if (class685.method3853(27931, class199.field3098)) {
            class213.field3263.field5152 = 2;
            class323.field4720.field5152 = 2;
            class455.field6494.field5152 = 2;
            class136.field2418.field5152 = 2;
            class51.field1188.field5152 = 2;
            class405.field5852.field5152 = 2;
            class420.field6053.field5152 = 2;
        }
        if (class685.method3853(arg1 ^ 0x6D1A, arg0)) {
            class346.field5164 = 0;
            class107.field1856 = 1;
            class170.field2831 = 1;
            class363.field5387 = 0;
            class269.field4005 = 0;
            class11.method284(64, true);
            class213.field3263.field5152 = 1;
            class323.field4720.field5152 = 1;
            class455.field6494.field5152 = 1;
            class136.field2418.field5152 = 1;
            class51.field1188.field5152 = 1;
            class405.field5852.field5152 = 1;
            class420.field6053.field5152 = 1;
        }
        if (arg0 == 11 || arg0 == 3) {
            class649.method3706(16495);
        }
        boolean var2 = arg0 == 2 || class233.method1571(arg0, arg1 ^ 0x55) || class396.method2443(-10, arg0);
        boolean var3 = class199.field3098 == 2 || class233.method1571(class199.field3098, -122) || class396.method2443(-10, class199.field3098);
        if (var3 != var2) {
            if (var2) {
                class65.field1434 = class628.field9057;
                if (class527.field7429.field2622 == 0) {
                    class610.method3506(15995, 2);
                } else {
                    class213.method1490(-12709, 0, class628.field9057, false, class527.field7429.field2622, 2, class46.field1128);
                }
                class186.field2999.method1492((byte) 63, false);
            } else {
                class610.method3506(arg1 ^ 0x3E7A, 2);
                class186.field2999.method1492((byte) 63, true);
            }
        }
        if (class685.method3853(arg1 ^ 0x6D1A, arg0) || arg0 == 13) {
            class623.field9017.method106();
        }
        class199.field3098 = arg0;
        if (arg1 != 1) {
            field2110 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2116[var0] = var1;
        }
        field2118 = new class266(74, 8);
        field2119 = new class85(80, 4);
    }
}
