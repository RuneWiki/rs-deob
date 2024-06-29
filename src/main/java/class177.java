import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class177 extends class147 {

    @OriginalMember(owner = "client!us", name = "p", descriptor = "Lto;")
    private class296 field2133;

    @OriginalMember(owner = "client!us", name = "x", descriptor = "F")
    public float field2141;

    @OriginalMember(owner = "client!us", name = "w", descriptor = "Lic;")
    private class246 field2140;

    @OriginalMember(owner = "client!us", name = "y", descriptor = "[I")
    private int[] field2142;

    @OriginalMember(owner = "client!us", name = "r", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!us", name = "s", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!us", name = "u", descriptor = "Llh;")
    private class489 field2138;

    @OriginalMember(owner = "client!us", name = "t", descriptor = "Lfh;")
    private class228 field2137;

    @OriginalMember(owner = "client!us", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2139;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)V")
    public final void method868(int arg0, byte arg1) {
        if (arg1 <= 111) {
            this.method869(100, -106, 9, -126);
        }
        this.field2139.position(arg0 * 4 + 3);
        this.field2139.put((byte) -1);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIII)V")
    public final void method869(int arg0, int arg1, int arg2, int arg3) {
        this.field2142[this.field2133.field6326 * arg1 + arg0] = class292.method1841(this.field2142[this.field2133.field6326 * arg1 + arg0], arg3 << arg2);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)V")
    public final void method870(int arg0, boolean arg1) {
        this.field2139.position(arg0 * 4);
        this.field2139.flip();
        class416 var3 = this.field2140.method1349(0, this.field2139, arg1);
        this.field2137 = new class228(this.field2140, var3, 5121, 4, 0);
        this.field2139 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)V")
    public final void method871(int arg0, int arg1) {
        int var3 = -125 % ((arg0 - 61) / 42);
        this.field2139 = ByteBuffer.allocateDirect(arg1 * 4);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIFI)V")
    public final void method872(int arg0, int arg1, int arg2, float arg3, int arg4) {
        if (this.field2136 != -1) {
            class189 var6 = this.field2140.field4073.method577(this.field2136, arg4 + 899884158);
            int var7 = var6.field2584 & 0xFF;
            if (var7 != 0 && var6.field2576 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg0 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field2589 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg1 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg1 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var14 >> 8) + (((var12 & 0xCC00FF00) << 8) + (var13 & 0xFF00));
            }
        }
        this.field2139.position(arg2 * 4);
        if (arg3 != 1.0F) {
            int var15 = (arg1 & 0xFF67E4) >> 16;
            int var16 = arg1 >> 8 & 0xFF;
            int var17 = arg1 & 0xFF;
            int var18 = (int) ((float) var15 * arg3);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg3);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var20 | var19 << 8 | var18 << 16;
        }
        this.field2139.put((byte) (arg1 >> 16));
        if (arg4 != -899884280) {
            this.method873((byte) -111, (int[]) null, 116);
        }
        this.field2139.put((byte) (arg1 >> 8));
        this.field2139.put((byte) arg1);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B[II)V")
    public final void method873(byte arg0, int[] arg1, int arg2) {
        int var4 = 0;
        if (arg0 != -40) {
            this.method869(43, 124, 125, 48);
        }
        class179 var5 = class296.field4380;
        var5.field2206 = 0;
        if (this.field2140.field3370) {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                int var14 = this.field2142[var13];
                short[] var15 = this.field2133.field4369[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method884(var15[var17++] & 0xFFFF, true);
                            var4++;
                            var5.method884(var15[var17++] & 0xFFFF, true);
                            var4++;
                            var5.method884(var15[var17++] & 0xFFFF, true);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field2142[var7];
                short[] var9 = this.field2133.field4369[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var5.method880(true, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method880(true, var9[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method880(true, var9[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field2140.field3342;
        this.field2138.method748(5123, var5.field2159, var5.field2206);
        this.field2140.method1412(this.field2133.field4400, this.field2133.field4405, this.field2137, this.field2133.field4393);
        this.field2140.method1446(this.field2136, (this.field2133.field4387 & 0x7) != 0, (this.field2133.field4387 & 0x8) != 0);
        if (this.field2140.field3465) {
            this.field2140.method1382(Integer.MAX_VALUE, this.field2132, this.field2135, this.field2134);
        }
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field2141, 1.0F / this.field2141, 1.0F);
        var18.glMatrixMode(5888);
        this.field2140.method1412(this.field2133.field4400, this.field2133.field4405, this.field2137, this.field2133.field4393);
        this.field2140.method1399(this.field2138, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lto;IIIII)V")
    public class177(class296 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2133 = arg0;
        this.field2141 = (float) arg2;
        this.field2140 = this.field2133.field4381;
        this.field2142 = new int[this.field2133.field6326 * this.field2133.field6324];
        this.field2135 = arg4;
        this.field2134 = arg5;
        this.field2136 = arg1;
        this.field2132 = arg3;
        this.field2138 = new class489(this.field2140, 5123, (byte[]) null, 1);
    }
}
