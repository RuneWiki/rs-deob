import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class269 {

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Z")
    private boolean field4237 = true;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    private int field4243 = -1;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    private int field4251 = -1;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    private int field4254;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    private int field4233;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    private int field4241;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "Z")
    private boolean field4250;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    private int field4242;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    private int field4249;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    private int field4244;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    private int field4232;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    private static int field4245 = -1;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    private static int field4235 = -1;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "[I")
    private static int[] field4239 = new int[4];

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    private int field4236;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    private int field4240;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    private int field4253;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Lch;")
    private class158 field4247;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lrd;")
    private static class193 field4234;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4246;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4248;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "[B")
    private static byte[] field4238;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lqg;)V", line = 6)
    private final void method1883(class269 arg0) {
        method1895();
        method1901();
        this.field4247 = new class155(this.field4240, this.field4240);
        class343.method2366(field4239);
        this.field4247.method1150();
        class104.method671();
        class343.method2352(0, 0, this.field4240, this.field4240, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field4250) {
                var2 = -arg0.field4254;
                var3 = -arg0.field4233;
                var4 = -arg0.field4241;
            } else {
                var2 = this.field4254 - arg0.field4254;
                var3 = this.field4233 - arg0.field4233;
                var4 = this.field4241 - arg0.field4241;
            }
        }
        if (this.field4252 != 0) {
            int var5 = class104.field1426[this.field4252];
            int var6 = class104.field1435[this.field4252];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field4236 != 0) {
            int var8 = this.field4236 - 1024 & 0x7FF;
            int var9 = class104.field1426[var8];
            int var10 = class104.field1435[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class8.method51(field4234.field2884, 0, field4234.field2894, (short) class104.field1438.method878(-91, this.field4242));
        class133 var12 = field4234.method1328(64, 512, -var2, -var3, -var4);
        int var13 = var12.method813() - var12.method811();
        int var14 = var12.method806() - var12.method417();
        if (var13 > var14) {
            int var15 = this.field4249 == 0 ? (var13 << 9) / this.field4240 : (var13 * 16 << 9) / (this.field4240 * 13);
            var12.method911(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field4249 == 0 ? (var14 << 9) / this.field4240 : (var14 * 16 << 9) / (this.field4240 * 13);
            var12.method911(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field4249 == 0) {
            for (int var17 = 0; var17 < class343.field5439.length; var17++) {
                if (class343.field5439[var17] != 0) {
                    class343.field5439[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1893();
            this.method1885();
        }
        class10.field107.method59(0);
        class343.method2373(field4239);
        class104.method671();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()V", line = 107)
    private static final void method1884() {
        if (field4248 != null) {
            return;
        }
        class143 var0 = new class143(1088);
        class143 var1 = new class143(5140);
        if (class272.field4318) {
            var1.method1053((byte) 104, 0.0F);
            var1.method1053((byte) 97, 1.0F);
            var1.method1053((byte) 115, 0.0F);
            var1.method1053((byte) 104, 0.5F);
            var1.method1053((byte) 110, 1.0F);
            var1.method1053((byte) 105, 0.0F);
            var1.method1053((byte) 121, -1.0F);
            var1.method1053((byte) 101, 0.0F);
            var1.method1053((byte) 114, 0.5F);
            var1.method1053((byte) 91, 0.0F);
        } else {
            var1.method1060((byte) 47, 0.0F);
            var1.method1060((byte) 47, 1.0F);
            var1.method1060((byte) 47, 0.0F);
            var1.method1060((byte) 47, 0.5F);
            var1.method1060((byte) 47, 1.0F);
            var1.method1060((byte) 47, 0.0F);
            var1.method1060((byte) 47, -1.0F);
            var1.method1060((byte) 47, 0.0F);
            var1.method1060((byte) 47, 0.5F);
            var1.method1060((byte) 47, 0.0F);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class104.field1426[var5] / 65535.0F;
            float var7 = (float) class104.field1435[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class104.field1435[var9] / 65535.0F;
                float var11 = (float) class104.field1426[var9] * var6 / 65535.0F;
                float var12 = (float) class104.field1426[var9] * var7 / 65535.0F;
                if (class272.field4318) {
                    var1.method1053((byte) 118, var12);
                    var1.method1053((byte) 126, var10);
                    var1.method1053((byte) 120, var11);
                    var1.method1053((byte) 126, var2);
                    var1.method1053((byte) 101, var3);
                } else {
                    var1.method1060((byte) 47, var12);
                    var1.method1060((byte) 47, var10);
                    var1.method1060((byte) 47, var11);
                    var1.method1060((byte) 47, var2);
                    var1.method1060((byte) 47, var3);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class272.field4318) {
                    var0.method1003(0, -2);
                    var0.method1003(0, -2);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method1003(var14++, -2);
                        var0.method1003(var13++, -2);
                    }
                    var0.method1003(1, -2);
                    var0.method1003(1, -2);
                } else {
                    var0.method1009(-2025348152, 0);
                    var0.method1009(-2025348152, 0);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method1009(-2025348152, var14++);
                        var0.method1009(-2025348152, var13++);
                    }
                    var0.method1009(-2025348152, 1);
                    var0.method1009(-2025348152, 1);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field4248 = ByteBuffer.allocateDirect(var1.field2295);
        field4248.put(var1.field2260, 0, var1.field2295);
        field4248.flip();
        field4246 = ByteBuffer.allocateDirect(var0.field2295);
        field4246.put(var0.field2260, 0, var0.field2295);
        field4246.flip();
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()V", line = 258)
    private final void method1885() {
        int var1 = this.field4240;
        int var2 = this.field4240;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class343.field5437 - var1;
        if (var2 > class343.field5435) {
            var2 -= var2 - class343.field5435;
        }
        if (class343.field5433 > 0) {
            int var9 = class343.field5433;
            var2 -= var9;
            var7 += class343.field5437 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class343.field5440) {
            int var10 = var1 - class343.field5440;
            var1 -= var10;
            var8 += var10;
        }
        if (class343.field5434 > 0) {
            int var11 = class343.field5434;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1890(class343.field5439, this.field4249, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Lqg;)Z", line = 310)
    private final boolean method1886(class269 arg0) {
        class193 var2 = class193.method1319(class3.field38, this.field4242, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class272.field4310;
        class239.method1670(field4239);
        class239.method1656();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field4250) {
                var4 = -arg0.field4254;
                var5 = -arg0.field4233;
                var6 = -arg0.field4241;
            } else {
                var4 = this.field4254 - arg0.field4254;
                var5 = this.field4233 - arg0.field4233;
                var6 = this.field4241 - arg0.field4241;
            }
        }
        var2.method1313();
        class362 var7 = var2.method1324(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method813() - var7.method811()) / 2;
        int var9 = (var7.method806() - var7.method417()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class204.method1422((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field4240, this.field4240);
        if (this.field4252 != 0) {
            int var11 = class104.field1426[this.field4252];
            int var12 = class104.field1435[this.field4252];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field4236 != 0) {
            int var14 = this.field4236 - 1024 & 0x7FF;
            int var15 = class104.field1426[var14];
            int var16 = class104.field1435[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class26.method190((float) (-var4), (float) var5, (float) (-var6));
        class26.method187(16777215, 0.5F, 0.5F, 0.5F);
        class26.method186();
        class272.method1942();
        class272.method1934(true);
        class272.method1941(true);
        var7.method853(0, 0, 0, 0, -var8 - var7.method811(), -var9 - var7.method417(), 0, -1L);
        class272.method1941(false);
        class272.method1934(false);
        class272.method1922();
        class204.method1431();
        class272.method1965(this.field4243);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field4240, this.field4240, 0);
        class239.method1671(field4239);
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIILqg;)V", line = 397)
    public final void method1887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class269 arg6) {
        int var8 = this.field4252 - arg4 & 0x7FF;
        int var9 = this.field4236 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field4253) / 2 + var10;
        int var13 = (arg2 - this.field4253) / 2 + var11;
        if (var12 < arg3 && this.field4253 + var12 > 0 && var13 < arg2 && this.field4253 + var13 > 0 && this.method1900(arg6)) {
            this.field4247.method19(arg0 + var13, arg1 + var12, this.field4253, this.field4253);
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(Lqg;)V", line = 421)
    public final void method1888(class269 arg0) {
        if (this.field4232 == 0) {
            return;
        }
        boolean var2 = this.field4243 == -1 || class1.field3 != this.field4251;
        if (!this.field4237 && !var2) {
            return;
        }
        if (var2) {
            this.field4251 = class1.field3;
            this.field4243 = class66.method402(class66.field794, this.field4240, this.field4240);
        } else {
            class272.method1965(this.field4243);
            class66.method400(class66.field794, this.field4240, this.field4240);
        }
        if (this.field4232 == 1) {
            this.method1889(arg0);
            this.field4237 = false;
        } else if (this.field4232 == 2) {
            this.field4237 = !this.method1886(arg0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(Lqg;)V", line = 462)
    private final void method1889(class269 arg0) {
        method1884();
        method1894();
        GL var2 = class272.field4310;
        class239.method1670(field4239);
        class239.method1656();
        var2.glClearColor((float) ((this.field4249 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field4249 & 0xFF00) >> 8) / 255.0F, (float) (this.field4249 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field4250) {
                var3 = -arg0.field4254;
                var4 = -arg0.field4233;
                var5 = -arg0.field4241;
            } else {
                var3 = this.field4254 - arg0.field4254;
                var4 = this.field4233 - arg0.field4233;
                var5 = this.field4241 - arg0.field4241;
            }
        }
        class204.method1426(-1.0F, 1.0F, -1.0F, 1.0F, this.field4240, this.field4240);
        if (this.field4252 != 0) {
            int var6 = class104.field1426[this.field4252];
            int var7 = class104.field1435[this.field4252];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field4236 != 0) {
            int var9 = this.field4236 - 1024 & 0x7FF;
            int var10 = class104.field1426[var9];
            int var11 = class104.field1435[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class26.method190((float) (-var3), (float) (-var4), (float) var5);
        class26.method187(16777215, 0.5F, 0.5F, 1.0F);
        class26.method186();
        if (this.field4249 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class104.field1438.method887(false, this.field4240, this.field4242);
        class272.method1941(true);
        if (class272.field4302) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field4248.position(0));
        var2.glVertexPointer(2, 5126, 20, field4248.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field4248.position(12));
        var2.glDrawElements(5, field4246.limit() / 2, 5123, field4246.position(0));
        var2.glEnableClientState(32886);
        class272.method1941(false);
        if (this.field4249 != 0) {
            class11.method69(-128, 0, 0);
            class272.method1961(1);
            class272.method1947(0);
            class272.method1965(field4235);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field4249 >> 16), (byte) (this.field4249 >> 8), (byte) this.field4249, (byte) 127);
            var2.glTexCoord2f(0.0F, 0.0F);
            var2.glVertex2i(-1, -1);
            var2.glTexCoord2f(1.0F, 0.0F);
            var2.glVertex2i(1, -1);
            var2.glTexCoord2f(1.0F, 1.0F);
            var2.glVertex2i(1, 1);
            var2.glTexCoord2f(0.0F, 1.0F);
            var2.glVertex2i(-1, 1);
            var2.glEnd();
            var2.glTexEnvi(8960, 34200, 770);
            var2.glLoadIdentity();
            var2.glColorMask(true, true, true, true);
            var2.glBlendFunc(773, 772);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field4249 >> 16), (byte) (this.field4249 >> 8), (byte) this.field4249, (byte) -1);
            var2.glTexCoord2f(0.0F, 0.0F);
            var2.glVertex2i(-1, -1);
            var2.glTexCoord2f(1.0F, 0.0F);
            var2.glVertex2i(1, -1);
            var2.glTexCoord2f(1.0F, 1.0F);
            var2.glVertex2i(1, 1);
            var2.glTexCoord2f(0.0F, 1.0F);
            var2.glVertex2i(-1, 1);
            var2.glEnd();
            var2.glBlendFunc(770, 771);
            var2.glTexEnvi(8960, 34176, 5890);
        }
        class204.method1431();
        class272.method1965(this.field4243);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field4240, this.field4240, 0);
        class239.method1671(field4239);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([IIIIIIIIIII)V", line = 588)
    private final void method1890(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field4238[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "()V", line = 622)
    public static final void method1891() {
        if (field4235 != -1) {
            class1.method4(field4235, 0, field4245);
        }
        field4235 = -1;
        field4245 = -1;
        field4248 = null;
        field4246 = null;
        field4234 = null;
        field4238 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)Z", line = 636)
    public final boolean method1892(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4250) {
            this.field4231 = 1073741823;
            var8 = this.field4254;
            var9 = this.field4233;
            var10 = this.field4241;
        } else {
            int var5 = this.field4254 - arg0;
            int var6 = this.field4233 - arg1;
            int var7 = this.field4241 - arg2;
            this.field4231 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4231 == 0) {
                this.field4231 = 1;
            }
            var8 = (var5 << 8) / this.field4231;
            var9 = (var6 << 8) / this.field4231;
            var10 = (var7 << 8) / this.field4231;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4253 = this.field4244 * arg3 / (this.field4250 ? 1024 : this.field4231);
        } else {
            this.field4253 = 0;
        }
        if (this.field4253 < 8) {
            this.method1898();
            this.field4247 = null;
            return false;
        }
        int var12 = class75.method477((byte) 84, this.field4253);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4240 != var12) {
            this.field4240 = var12;
        }
        this.field4252 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field4236 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field4237 = true;
        this.field4247 = null;
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "()V", line = 699)
    private final void method1893() {
        int var1 = this.field4240 * 3 / 32;
        int var3 = this.field4240 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class343.field5437 * var1 + var1;
        int var8 = class343.field5437 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class343.field5435) {
            var4 = var3 - (var1 + var3 - class343.field5435);
        }
        if (var1 < class343.field5433) {
            int var11 = class343.field5433 - var1;
            var4 -= var11;
            var7 += class343.field5437 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class343.field5440) {
            int var12 = var1 + var3 - class343.field5440;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class343.field5434) {
            int var13 = class343.field5434 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1899(class343.field5439, 0, this.field4249, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "()V", line = 751)
    private static final void method1894() {
        method1901();
        if (field4235 == -1 || field4245 != class1.field3) {
            field4235 = class66.method397(class66.field800, 128, 128, field4238);
            field4245 = class1.field3;
        }
    }

    @OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V", line = 762)
    protected final void finalize() throws Throwable {
        this.method1898();
        super.finalize();
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "()V", line = 768)
    private static final void method1895() {
        if (field4234 != null) {
            return;
        }
        class193 var0 = field4234 = new class193(260, 480, 0);
        int[] var1 = var0.field2924;
        int[] var2 = var0.field2919;
        int[] var3 = var0.field2915;
        int[] var4 = var0.field2893;
        int[] var5 = var0.field2914;
        int[] var6 = var0.field2887;
        var0.field2932 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class104.field1426[var8] >> 1;
            int var10 = class104.field1435[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class104.field1435[var12] >> 9;
                int var14 = (class104.field1426[var12] >> 1) * var9 >> 23;
                int var15 = (class104.field1426[var12] >> 1) * var10 >> 23;
                var1[var0.field2932] = var15;
                var2[var0.field2932] = var13;
                var3[var0.field2932] = -var14;
                var0.field2932++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field2894] = 0;
                var5[var0.field2894] = var17;
                var6[var0.field2894] = var16;
                var0.field2894++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field2894] = var17;
                    var5[var0.field2894] = var19;
                    var6[var0.field2894] = var16;
                    var0.field2894++;
                    var4[var0.field2894] = var19;
                    var5[var0.field2894] = var20;
                    var6[var0.field2894] = var16;
                    var0.field2894++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field2894] = var16;
                var5[var0.field2894] = var17;
                var6[var0.field2894] = 1;
                var0.field2894++;
            }
        }
        var0.field2903 = var0.field2932;
        var0.field2916 = null;
        var0.field2923 = null;
        var0.field2937 = null;
        var0.field2908 = null;
        var0.field2895 = null;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4254 = arg2;
        this.field4233 = arg3;
        this.field4241 = arg4;
        this.field4250 = arg7;
        this.field4242 = arg1;
        this.field4249 = arg6;
        this.field4244 = arg5;
        this.field4232 = arg0;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(Lqg;)V", line = 884)
    private final void method1896(class269 arg0) {
        class193 var2 = class193.method1319(class3.field38, this.field4242, 0);
        if (var2 == null) {
            return;
        }
        this.field4247 = new class158(this.field4240, this.field4240);
        class343.method2366(field4239);
        this.field4247.method1150();
        class104.method671();
        class343.method2352(0, 0, this.field4240, this.field4240, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field4250) {
                var3 = -arg0.field4254;
                var4 = -arg0.field4233;
                var5 = -arg0.field4241;
            } else {
                var3 = this.field4254 - arg0.field4254;
                var4 = this.field4233 - arg0.field4233;
                var5 = this.field4241 - arg0.field4241;
            }
        }
        if (this.field4252 != 0) {
            int var6 = class104.field1426[this.field4252];
            int var7 = class104.field1435[this.field4252];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field4236 != 0) {
            int var9 = this.field4236 - 1024 & 0x7FF;
            int var10 = class104.field1426[var9];
            int var11 = class104.field1435[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class133 var13 = var2.method1328(64, 768, -var3, -var4, -var5);
        int var14 = var13.method813() - var13.method811();
        int var15 = var13.method806() - var13.method417();
        int var16 = var13.method811() + var14 / 2;
        int var17 = var13.method417() + var15 / 2;
        if (var14 > var15) {
            var13.method911(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field4240);
        } else {
            var13.method911(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field4240);
        }
        class10.field107.method59(0);
        class343.method2373(field4239);
        class104.method671();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V", line = 968)
    public final void method1897(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field4252 - arg4 & 0x7FF;
        int var8 = this.field4236 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field4253) / 2 + var9;
        int var12 = (arg2 - this.field4253) / 2 + var10;
        if (var11 >= arg3 || this.field4253 + var11 <= 0 || var12 >= arg2 || this.field4253 + var12 <= 0) {
            return;
        }
        if (this.field4232 == 0) {
            class104.field1438.method887(false, this.field4240, this.field4242);
        } else if (this.field4243 == -1) {
            return;
        } else {
            class272.method1965(this.field4243);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field4253 + var14;
        int var16 = this.field4253 + var13;
        GL var17 = class272.field4310;
        var17.glBegin(7);
        var17.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var17.glTexCoord2f(0.0F, 0.0F);
        var17.glVertex2i(var14, var13);
        var17.glTexCoord2f(0.0F, 1.0F);
        var17.glVertex2i(var14, var16);
        var17.glTexCoord2f(1.0F, 1.0F);
        var17.glVertex2i(var15, var16);
        var17.glTexCoord2f(1.0F, 0.0F);
        var17.glVertex2i(var15, var13);
        var17.glEnd();
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "()V", line = 1017)
    private final void method1898() {
        if (this.field4243 != -1) {
            class1.method4(this.field4243, 0, this.field4251);
        }
        this.field4237 = true;
        this.field4243 = -1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 1029)
    private final void method1899(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field4238[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(Lqg;)Z", line = 1077)
    private final boolean method1900(class269 arg0) {
        if (this.field4247 == null) {
            if (this.field4232 == 0) {
                this.field4247 = class104.field1438.method890(this.field4242, true, this.field4240, class104.field1425, (byte) 120);
            } else if (this.field4232 == 2) {
                this.method1896(arg0);
            } else if (this.field4232 == 1) {
                this.method1883(arg0);
            }
        }
        return this.field4247 != null;
    }

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "()V", line = 1115)
    private static final void method1901() {
        if (field4238 != null) {
            return;
        }
        field4238 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field4238[var4 + var6] = field4238[var4 + var9] = field4238[var5 + var6] = field4238[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "()V", line = 1172)
    public static void method1902() {
        field4248 = null;
        field4246 = null;
        field4234 = null;
        field4238 = null;
        field4239 = null;
    }
}
