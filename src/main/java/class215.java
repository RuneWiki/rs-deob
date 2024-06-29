import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class215 extends class97 {

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "Lpj;")
    private class156 field3277;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "Lcg;")
    private class393 field3279;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    private int field3275;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    private int field3274;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    private int field3278;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "F")
    private float field3283;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "[I")
    private int[] field3281;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "Lsd;")
    private class237 field3280;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "Ltf;")
    private class464 field3276;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3282;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
    public final void method1307(int arg0, int arg1) {
        this.field3282.position(arg0 * 4 + 3);
        this.field3282.put((byte) -1);
        if (arg1 >= -36) {
            this.field3278 = -42;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)V")
    public final void method1308(byte arg0, int arg1) {
        this.field3282 = ByteBuffer.allocateDirect(arg1 * 4);
        int var3 = -1 % ((arg0) / 63);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "([III)V")
    public final void method1309(int[] arg0, int arg1, int arg2) {
        int var4 = 0;
        if (arg2 > -58) {
            this.method1312(8, 113, 84, 116, -0.8800428F);
        }
        class385 var5 = class156.field2169;
        var5.field5666 = 0;
        if (this.field3279.field5879) {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                short[] var14 = this.field3277.field2164[var13];
                int var15 = this.field3281[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method2377(var14[var17++] & 0xFFFF, -8);
                            var4++;
                            var5.method2377(var14[var17++] & 0xFFFF, -79);
                            var4++;
                            var5.method2377(var14[var17++] & 0xFFFF, -34);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field3281[var7];
                short[] var9 = this.field3277.field2164[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2329(var9[var11++] & 0xFFFF, -52);
                            var4++;
                            var5.method2329(var9[var11++] & 0xFFFF, -75);
                            var4++;
                            var5.method2329(var9[var11++] & 0xFFFF, -63);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field3279.field5783;
        this.field3279.method2464(this.field3278, (this.field3277.field2172 & 0x7) != 0, (this.field3277.field2172 & 0x8) != 0);
        if (this.field3279.field5870) {
            this.field3279.method405(Integer.MAX_VALUE, this.field3275, this.field3274);
        }
        this.field3280.method655(5123, var5.field5685, var5.field5666);
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field3283, 1.0F / this.field3283, 1.0F);
        var18.glMatrixMode(5888);
        this.field3279.method2430(this.field3277.field2190, this.field3277.field2194, this.field3276, this.field3277.field2195);
        this.field3279.method2458(this.field3280, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZ)V")
    public final void method1310(int arg0, boolean arg1) {
        this.field3282.position(arg0 * 4);
        this.field3282.flip();
        if (arg1) {
            class226 var3 = this.field3279.method2453(0, this.field3282, false);
            this.field3276 = new class464(this.field3279, var3, 5121, 4, 0);
            this.field3282 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIII)V")
    public final void method1311(int arg0, int arg1, int arg2, int arg3) {
        this.field3281[this.field3277.field1906 * arg3 + arg2] = class276.method1712(this.field3281[this.field3277.field1906 * arg3 + arg2], arg0 << arg1);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIF)V")
    public final void method1312(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field3278 != -1) {
            class154 var6 = this.field3279.field5773.method180(this.field3278, -110);
            int var7 = var6.field2123 & 0xFF;
            if (var7 != 0 && var6.field2125 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg3 * 131586;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field2108 & 0xFF;
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
                arg0 = ((var12 & 0xDB00FF00) << 8) - (-(var13 & 0xFF00) - (var14 >> 8));
            }
        }
        this.field3282.position(arg2 * 4);
        if (arg4 != 1.0F) {
            int var15 = (arg0 & 0xFF9FD3) >> 16;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg4);
            int var18 = arg0 & 0xFF;
            int var19 = (int) ((float) var16 * arg4);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var20 = (int) ((float) var18 * arg4);
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
            arg0 = var17 << 16 | var19 << 8 | var20;
        }
        if (arg1 > 7) {
            this.field3282.put((byte) (arg0 >> 16));
            this.field3282.put((byte) (arg0 >> 8));
            this.field3282.put((byte) arg0);
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lpj;IIII)V")
    public class215(class156 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3277 = arg0;
        this.field3279 = this.field3277.field2171;
        this.field3275 = arg3;
        this.field3274 = arg4;
        this.field3278 = arg1;
        this.field3283 = (float) arg2;
        this.field3281 = new int[this.field3277.field1908 * this.field3277.field1906];
        this.field3280 = new class237(this.field3279, 5123, (byte[]) null, 1);
    }
}
