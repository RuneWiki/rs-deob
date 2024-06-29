import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class178 extends class424 {

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "Lwo;")
    private class295 field2216;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public int field2218;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Lji;")
    private class622 field2202;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "F")
    public float field2208;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "[I")
    private int[] field2204;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "Lur;")
    private class333 field2211;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field2212 = -1;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lvv;")
    private class414 field2206;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "Ltc;")
    public static class477 field2217;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2214;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2215;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V", line = 7)
    public final void method1192(byte arg0, int arg1) {
        this.field2214.method1954(arg1 * 4 + 3);
        if (arg0 < 11) {
            this.method1197(true, -75);
        }
        field2201++;
        this.field2214.method1957(-1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[IB)V", line = 23)
    public final void method1193(int arg0, int[] arg1, byte arg2) {
        field2209++;
        if (arg2 >= -125) {
            this.field2206 = null;
        }
        int var4 = 0;
        class703 var5 = this.field2202.field8654;
        var5.field5367 = 0;
        if (this.field2202.field8631) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                int var14 = this.field2204[var13];
                short[] var15 = this.field2216.field3853[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2386(var15[var17++] & 0xFFFF, 1103587288);
                            var5.method2386(var15[var17++] & 0xFFFF, 1103587288);
                            var4++;
                            var4++;
                            var5.method2386(var15[var17++] & 0xFFFF, 1103587288);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field2216.field3853[var7];
                int var9 = this.field2204[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method2356(var8[var11++] & 0xFFFF, -18174);
                            var4++;
                            var5.method2356(var8[var11++] & 0xFFFF, -18174);
                            var4++;
                            var5.method2356(var8[var11++] & 0xFFFF, -18174);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field2211.method574(5123, -18622, var5.field5393, var5.field5367);
        this.field2202.method3420(this.field2206, this.field2216.field3871, true, this.field2216.field3870, this.field2216.field3858);
        this.field2202.method3436(this.field2213, true, (this.field2216.field3835 & 0x7) != 0, (this.field2216.field3835 & 0x8) != 0);
        if (this.field2202.field8630) {
            this.field2202.method358(Integer.MAX_VALUE, this.field2218, this.field2219, this.field2210);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field2208, 1.0F / this.field2208, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field2202.method3420(this.field2206, this.field2216.field3871, true, this.field2216.field3870, this.field2216.field3858);
        this.field2202.method3464(var4, 4, this.field2211, -123, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V", line = 146)
    public final void method1194(int arg0, int arg1) {
        this.field2214.method1955();
        field2205++;
        class373 var3 = this.field2202.method3384(false, 8222, this.field2215, 4, arg1 * 4);
        this.field2206 = new class414(var3, 5121, 4, arg0);
        this.field2215 = null;
        this.field2214 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZII)V", line = 161)
    public final void method1195(int arg0, boolean arg1, int arg2, int arg3) {
        field2203++;
        if (arg1) {
            this.field2216 = null;
        }
        this.field2204[this.field2216.field1166 * arg2 + arg0] = class131.method954(this.field2204[this.field2216.field1166 * arg2 + arg0], 0x1 << arg3);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIFII)V", line = 173)
    public final void method1196(int arg0, int arg1, float arg2, int arg3, int arg4) {
        int var6 = -44 / ((62 - arg1) / 56);
        field2221++;
        if (this.field2213 != -1) {
            class59 var7 = this.field2202.field598.method3162((byte) -104, this.field2213);
            int var8 = var7.field798 & 0xFF;
            if (var8 != 0 && var7.field805 != 4) {
                int var9;
                if (arg0 < 0) {
                    var9 = 0;
                } else if (arg0 <= 127) {
                    var9 = arg0 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    arg4 = var9;
                } else {
                    int var11 = 256 - var8;
                    arg4 = ((var9 & 0xFF00FF) * var8 + ((arg4 & 0xFF00FF) * var11) & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field811 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((arg4 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (arg4 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                arg4 = (var15 >> 8) + ((var13 & 0x8100FF00) << 8) + (var14 & 0xFF00);
            }
        }
        this.field2214.method1954(arg3 * 4);
        if (arg2 != 1.0F) {
            int var16 = arg4 >> 16 & 0xFF;
            int var17 = (arg4 & 0xFFF7) >> 8;
            int var18 = (int) ((float) var16 * arg2);
            int var19 = arg4 & 0xFF;
            int var20 = (int) ((float) var17 * arg2);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var21 = (int) ((float) var19 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > 255) {
                var21 = 255;
            }
            arg4 = var18 << 16 | var20 << 8 | var21;
        }
        this.field2214.method1957((byte) (arg4 >> 16));
        this.field2214.method1957((byte) (arg4 >> 8));
        this.field2214.method1957((byte) arg4);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V", line = 289)
    public final void method1197(boolean arg0, int arg1) {
        this.field2215 = this.field2202.field8572.method1950(arg1 * 4, arg0);
        field2207++;
        this.field2214 = new Stream(this.field2215);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 298)
    public static void method1198(byte arg0) {
        field2217 = null;
        int var1 = 79 / ((arg0 + 62) / 51);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILtc;)Ljava/lang/String;", line = 308)
    public static final String method1199(int arg0, int arg1, class477 arg2) {
        field2220++;
        if (!client.method696(arg2).method1143(78, arg0) && arg2.field6268 == null) {
            return null;
        } else if (arg1 != -65536) {
            return null;
        } else if (arg2.field6220 == null || arg0 >= arg2.field6220.length || arg2.field6220[arg0] == null || arg2.field6220[arg0].trim().length() == 0) {
            return class100.field1336 ? "Hidden-" + arg0 : null;
        } else {
            return arg2.field6220[arg0];
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lwo;IIIII)V", line = 332)
    public class178(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2216 = arg0;
        this.field2218 = arg3;
        this.field2202 = this.field2216.field3845;
        this.field2208 = arg2;
        this.field2213 = arg1;
        this.field2210 = arg5;
        this.field2204 = new int[this.field2216.field1166 * this.field2216.field1164];
        this.field2219 = arg4;
        this.field2211 = new class333(this.field2202, 5123, null, 1);
    }
}
