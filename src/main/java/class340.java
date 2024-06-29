import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class340 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Z")
    private boolean field5263 = true;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    private int field5284 = -1;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    private int field5267 = -1;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    private int field5276;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    private int field5283;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    private int field5279;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
    private boolean field5265;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    private int field5269;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    private int field5272;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    private int field5277;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    private int field5262;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    private static int field5275 = -1;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "[I")
    private static int[] field5274 = new int[4];

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    private static int field5271 = -1;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    private int field5270;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public int field5280;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    private int field5281;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    private int field5282;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    private int field5285;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Lfd;")
    private class206 field5268;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lel;")
    private static class3 field5266;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5264;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5278;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "[B")
    private static byte[] field5273;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V", line = 13)
    private static final void method2342() {
        if (field5266 != null) {
            return;
        }
        class3 var0 = field5266 = new class3(260, 480, 0);
        int[] var1 = var0.field49;
        int[] var2 = var0.field97;
        int[] var3 = var0.field92;
        int[] var4 = var0.field68;
        int[] var5 = var0.field75;
        int[] var6 = var0.field60;
        var0.field52 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class284.field4395[var8] >> 1;
            int var10 = class284.field4398[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class284.field4398[var12] >> 9;
                int var14 = (class284.field4395[var12] >> 1) * var9 >> 23;
                int var15 = (class284.field4395[var12] >> 1) * var10 >> 23;
                var1[var0.field52] = var15;
                var2[var0.field52] = var13;
                var3[var0.field52] = -var14;
                var0.field52++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field65] = 0;
                var5[var0.field65] = var17;
                var6[var0.field65] = var16;
                var0.field65++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field65] = var17;
                    var5[var0.field65] = var19;
                    var6[var0.field65] = var16;
                    var0.field65++;
                    var4[var0.field65] = var19;
                    var5[var0.field65] = var20;
                    var6[var0.field65] = var16;
                    var0.field65++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field65] = var16;
                var5[var0.field65] = var17;
                var6[var0.field65] = 1;
                var0.field65++;
            }
        }
        var0.field70 = var0.field52;
        var0.field78 = null;
        var0.field82 = null;
        var0.field76 = null;
        var0.field69 = null;
        var0.field93 = null;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field5276 = arg2;
        this.field5283 = arg3;
        this.field5279 = arg4;
        this.field5265 = arg7;
        this.field5269 = arg1;
        this.field5272 = arg6;
        this.field5277 = arg5;
        this.field5262 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()V", line = 129)
    private static final void method2343() {
        if (field5278 != null) {
            return;
        }
        class202 var0 = new class202(1088);
        class202 var1 = new class202(5140);
        if (class249.field3916) {
            var1.method1328(27700, 0.0F);
            var1.method1328(27700, 1.0F);
            var1.method1328(27700, 0.0F);
            var1.method1328(27700, 0.5F);
            var1.method1328(27700, 1.0F);
            var1.method1328(27700, 0.0F);
            var1.method1328(27700, -1.0F);
            var1.method1328(27700, 0.0F);
            var1.method1328(27700, 0.5F);
            var1.method1328(27700, 0.0F);
        } else {
            var1.method1301(0.0F, false);
            var1.method1301(1.0F, false);
            var1.method1301(0.0F, false);
            var1.method1301(0.5F, false);
            var1.method1301(1.0F, false);
            var1.method1301(0.0F, false);
            var1.method1301(-1.0F, false);
            var1.method1301(0.0F, false);
            var1.method1301(0.5F, false);
            var1.method1301(0.0F, false);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class284.field4395[var5] / 65535.0F;
            float var7 = (float) class284.field4398[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class284.field4398[var9] / 65535.0F;
                float var11 = (float) class284.field4395[var9] * var6 / 65535.0F;
                float var12 = (float) class284.field4395[var9] * var7 / 65535.0F;
                if (class249.field3916) {
                    var1.method1328(27700, var12);
                    var1.method1328(27700, var10);
                    var1.method1328(27700, var11);
                    var1.method1328(27700, var2);
                    var1.method1328(27700, var3);
                } else {
                    var1.method1301(var12, false);
                    var1.method1301(var10, false);
                    var1.method1301(var11, false);
                    var1.method1301(var2, false);
                    var1.method1301(var3, false);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class249.field3916) {
                    var0.method1313(0, -376480);
                    var0.method1313(0, -376480);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method1313(var14++, -376480);
                        var0.method1313(var13++, -376480);
                    }
                    var0.method1313(1, -376480);
                    var0.method1313(1, -376480);
                } else {
                    var0.method1334(-231194192, 0);
                    var0.method1334(-231194192, 0);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method1334(-231194192, var14++);
                        var0.method1334(-231194192, var13++);
                    }
                    var0.method1334(-231194192, 1);
                    var0.method1334(-231194192, 1);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field5278 = ByteBuffer.allocateDirect(var1.field3249);
        field5278.put(var1.field3273, 0, var1.field3249);
        field5278.flip();
        field5264 = ByteBuffer.allocateDirect(var0.field3249);
        field5264.put(var0.field3273, 0, var0.field3249);
        field5264.flip();
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIILjf;)V", line = 281)
    public final void method2344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class340 arg6) {
        int var8 = this.field5281 - arg4 & 0x7FF;
        int var9 = this.field5285 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field5270) / 2 + var10;
        int var13 = (arg2 - this.field5270) / 2 + var11;
        if (var12 < arg3 && this.field5270 + var12 > 0 && var13 < arg2 && this.field5270 + var13 > 0 && this.method2345(arg6)) {
            this.field5268.method905(arg0 + var13, arg1 + var12, this.field5270, this.field5270);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljf;)Z", line = 305)
    private final boolean method2345(class340 arg0) {
        if (this.field5268 == null) {
            if (this.field5262 == 0) {
                this.field5268 = class284.field4393.method410(this.field5282, class284.field4394, 65535, this.field5269, true);
            } else if (this.field5262 == 2) {
                this.method2355(arg0);
            } else if (this.field5262 == 1) {
                this.method2353(arg0);
            }
        }
        return this.field5268 != null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Ljf;)V", line = 336)
    private final void method2346(class340 arg0) {
        method2343();
        method2350();
        GL var2 = class249.field3898;
        class115.method746(field5274);
        class115.method753();
        var2.glClearColor((float) ((this.field5272 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field5272 & 0xFF00) >> 8) / 255.0F, (float) (this.field5272 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field5265) {
                var3 = -arg0.field5276;
                var4 = -arg0.field5283;
                var5 = -arg0.field5279;
            } else {
                var3 = this.field5276 - arg0.field5276;
                var4 = this.field5283 - arg0.field5283;
                var5 = this.field5279 - arg0.field5279;
            }
        }
        class273.method1825(-1.0F, 1.0F, -1.0F, 1.0F, this.field5282, this.field5282);
        if (this.field5281 != 0) {
            int var6 = class284.field4395[this.field5281];
            int var7 = class284.field4398[this.field5281];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field5285 != 0) {
            int var9 = this.field5285 - 1024 & 0x7FF;
            int var10 = class284.field4395[var9];
            int var11 = class284.field4398[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class65.method494((float) (-var3), (float) (-var4), (float) var5);
        class65.method502(16777215, 0.5F, 0.5F, 1.0F);
        class65.method495();
        if (this.field5272 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class284.field4393.method407(this.field5269, -81, this.field5282);
        class249.method1648(true);
        if (class249.field3877) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field5278.position(0));
        var2.glVertexPointer(2, 5126, 20, field5278.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field5278.position(12));
        var2.glDrawElements(5, field5264.limit() / 2, 5123, field5264.position(0));
        var2.glEnableClientState(32886);
        class249.method1648(false);
        if (this.field5272 != 0) {
            class128.method844(0, 0, (byte) -117);
            class249.method1653(1);
            class249.method1681(0);
            class249.method1689(field5275);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field5272 >> 16), (byte) (this.field5272 >> 8), (byte) this.field5272, (byte) 127);
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
            var2.glColor4ub((byte) (this.field5272 >> 16), (byte) (this.field5272 >> 8), (byte) this.field5272, (byte) -1);
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
        class273.method1831();
        class249.method1689(this.field5284);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field5282, this.field5282, 0);
        class115.method749(field5274);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()V", line = 461)
    public static void method2347() {
        field5278 = null;
        field5264 = null;
        field5266 = null;
        field5273 = null;
        field5274 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)Z", line = 471)
    public final boolean method2348(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field5265) {
            this.field5280 = 1073741823;
            var8 = this.field5276;
            var9 = this.field5283;
            var10 = this.field5279;
        } else {
            int var5 = this.field5276 - arg0;
            int var6 = this.field5283 - arg1;
            int var7 = this.field5279 - arg2;
            this.field5280 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field5280 == 0) {
                this.field5280 = 1;
            }
            var8 = (var5 << 8) / this.field5280;
            var9 = (var6 << 8) / this.field5280;
            var10 = (var7 << 8) / this.field5280;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field5270 = this.field5277 * arg3 / (this.field5265 ? 1024 : this.field5280);
        } else {
            this.field5270 = 0;
        }
        if (this.field5270 < 8) {
            this.method2349();
            this.field5268 = null;
            return false;
        }
        int var12 = class173.method1093((byte) 58, this.field5270);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field5282 != var12) {
            this.field5282 = var12;
        }
        this.field5281 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field5285 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field5263 = true;
        this.field5268 = null;
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()V", line = 531)
    private final void method2349() {
        if (this.field5284 != -1) {
            class258.method1732(this.field5284, 0, this.field5267);
        }
        this.field5263 = true;
        this.field5284 = -1;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "()V", line = 541)
    private static final void method2350() {
        method2354();
        if (field5275 == -1 || field5271 != class258.field4013) {
            field5275 = class105.method680(class105.field1815, 128, 128, field5273);
            field5271 = class258.field4013;
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(Ljf;)Z", line = 552)
    private final boolean method2351(class340 arg0) {
        class3 var2 = class3.method33(class145.field2373, this.field5269, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class249.field3898;
        class115.method746(field5274);
        class115.method753();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field5265) {
                var4 = -arg0.field5276;
                var5 = -arg0.field5283;
                var6 = -arg0.field5279;
            } else {
                var4 = this.field5276 - arg0.field5276;
                var5 = this.field5283 - arg0.field5283;
                var6 = this.field5279 - arg0.field5279;
            }
        }
        var2.method18();
        class309 var7 = var2.method28(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method164() - var7.method165()) / 2;
        int var9 = (var7.method160() - var7.method39()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class273.method1829((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field5282, this.field5282);
        if (this.field5281 != 0) {
            int var11 = class284.field4395[this.field5281];
            int var12 = class284.field4398[this.field5281];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field5285 != 0) {
            int var14 = this.field5285 - 1024 & 0x7FF;
            int var15 = class284.field4395[var14];
            int var16 = class284.field4398[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class65.method494((float) (-var4), (float) var5, (float) (-var6));
        class65.method502(16777215, 0.5F, 0.5F, 0.5F);
        class65.method495();
        class249.method1659();
        class249.method1677(true);
        class249.method1648(true);
        var7.method150(0, 0, 0, 0, -var8 - var7.method165(), -var9 - var7.method39(), 0, -1L);
        class249.method1648(false);
        class249.method1677(false);
        class249.method1650();
        class273.method1831();
        class249.method1689(this.field5284);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field5282, this.field5282, 0);
        class115.method749(field5274);
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 641)
    private final void method2352(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field5273[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(Ljf;)V", line = 680)
    private final void method2353(class340 arg0) {
        method2342();
        method2354();
        this.field5268 = new class300(this.field5282, this.field5282);
        class270.method1798(field5274);
        this.field5268.method1387();
        class284.method1909();
        class270.method1811(0, 0, this.field5282, this.field5282, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field5265) {
                var2 = -arg0.field5276;
                var3 = -arg0.field5283;
                var4 = -arg0.field5279;
            } else {
                var2 = this.field5276 - arg0.field5276;
                var3 = this.field5283 - arg0.field5283;
                var4 = this.field5279 - arg0.field5279;
            }
        }
        if (this.field5281 != 0) {
            int var5 = class284.field4395[this.field5281];
            int var6 = class284.field4398[this.field5281];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field5285 != 0) {
            int var8 = this.field5285 - 1024 & 0x7FF;
            int var9 = class284.field4395[var8];
            int var10 = class284.field4398[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class129.method850(field5266.field74, 0, field5266.field65, (short) class284.field4393.method388(this.field5269, true));
        class20 var12 = field5266.method40(64, 512, -var2, -var3, -var4);
        int var13 = var12.method164() - var12.method165();
        int var14 = var12.method160() - var12.method39();
        if (var13 > var14) {
            int var15 = this.field5272 == 0 ? (var13 << 9) / this.field5282 : (var13 * 16 << 9) / (this.field5282 * 13);
            var12.method138(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field5272 == 0 ? (var14 << 9) / this.field5282 : (var14 * 16 << 9) / (this.field5282 * 13);
            var12.method138(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field5272 == 0) {
            for (int var17 = 0; var17 < class270.field4170.length; var17++) {
                if (class270.field4170[var17] != 0) {
                    class270.field4170[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method2357();
            this.method2359();
        }
        class330.field5055.method369((byte) -19);
        class270.method1816(field5274);
        class284.method1909();
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "()V", line = 782)
    private static final void method2354() {
        if (field5273 != null) {
            return;
        }
        field5273 = new byte[16384];
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
                field5273[var4 + var6] = field5273[var4 + var9] = field5273[var5 + var6] = field5273[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(Ljf;)V", line = 835)
    private final void method2355(class340 arg0) {
        class3 var2 = class3.method33(class145.field2373, this.field5269, 0);
        if (var2 == null) {
            return;
        }
        this.field5268 = new class206(this.field5282, this.field5282);
        class270.method1798(field5274);
        this.field5268.method1387();
        class284.method1909();
        class270.method1811(0, 0, this.field5282, this.field5282, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field5265) {
                var3 = -arg0.field5276;
                var4 = -arg0.field5283;
                var5 = -arg0.field5279;
            } else {
                var3 = this.field5276 - arg0.field5276;
                var4 = this.field5283 - arg0.field5283;
                var5 = this.field5279 - arg0.field5279;
            }
        }
        if (this.field5281 != 0) {
            int var6 = class284.field4395[this.field5281];
            int var7 = class284.field4398[this.field5281];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field5285 != 0) {
            int var9 = this.field5285 - 1024 & 0x7FF;
            int var10 = class284.field4395[var9];
            int var11 = class284.field4398[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class20 var13 = var2.method40(64, 768, -var3, -var4, -var5);
        int var14 = var13.method164() - var13.method165();
        int var15 = var13.method160() - var13.method39();
        int var16 = var13.method165() + var14 / 2;
        int var17 = var13.method39() + var15 / 2;
        if (var14 > var15) {
            var13.method138(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field5282);
        } else {
            var13.method138(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field5282);
        }
        class330.field5055.method369((byte) -19);
        class270.method1816(field5274);
        class284.method1909();
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)V", line = 923)
    public final void method2356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field5281 - arg4 & 0x7FF;
        int var8 = this.field5285 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field5270) / 2 + var9;
        int var12 = (arg2 - this.field5270) / 2 + var10;
        if (var11 >= arg3 || this.field5270 + var11 <= 0 || var12 >= arg2 || this.field5270 + var12 <= 0) {
            return;
        }
        if (this.field5262 == 0) {
            class284.field4393.method407(this.field5269, -82, this.field5282);
        } else if (this.field5284 == -1) {
            return;
        } else {
            class249.method1689(this.field5284);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field5270 + var14;
        int var16 = this.field5270 + var13;
        GL var17 = class249.field3898;
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

    @OriginalMember(owner = "client!jf", name = "finalize", descriptor = "()V", line = 972)
    protected final void finalize() throws Throwable {
        this.method2349();
        super.finalize();
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "()V", line = 978)
    private final void method2357() {
        int var1 = this.field5282 * 3 / 32;
        int var3 = this.field5282 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class270.field4172 * var1 + var1;
        int var8 = class270.field4172 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class270.field4168) {
            var4 = var3 - (var1 + var3 - class270.field4168);
        }
        if (var1 < class270.field4165) {
            int var11 = class270.field4165 - var1;
            var4 -= var11;
            var7 += class270.field4172 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class270.field4166) {
            int var12 = var1 + var3 - class270.field4166;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class270.field4171) {
            int var13 = class270.field4171 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method2352(class270.field4170, 0, this.field5272, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([IIIIIIIIIII)V", line = 1031)
    private final void method2358(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field5273[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "()V", line = 1068)
    private final void method2359() {
        int var1 = this.field5282;
        int var2 = this.field5282;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class270.field4172 - var1;
        if (var2 > class270.field4168) {
            var2 -= var2 - class270.field4168;
        }
        if (class270.field4165 > 0) {
            int var9 = class270.field4165;
            var2 -= var9;
            var7 += class270.field4172 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class270.field4166) {
            int var10 = var1 - class270.field4166;
            var1 -= var10;
            var8 += var10;
        }
        if (class270.field4171 > 0) {
            int var11 = class270.field4171;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method2358(class270.field4170, this.field5272, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "()V", line = 1117)
    public static final void method2360() {
        if (field5275 != -1) {
            class258.method1732(field5275, 0, field5271);
        }
        field5275 = -1;
        field5271 = -1;
        field5278 = null;
        field5264 = null;
        field5266 = null;
        field5273 = null;
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(Ljf;)V", line = 1138)
    public final void method2361(class340 arg0) {
        if (this.field5262 == 0) {
            return;
        }
        boolean var2 = this.field5284 == -1 || class258.field4013 != this.field5267;
        if (!this.field5263 && !var2) {
            return;
        }
        if (var2) {
            this.field5267 = class258.field4013;
            this.field5284 = class105.method682(class105.field1809, this.field5282, this.field5282);
        } else {
            class249.method1689(this.field5284);
            class105.method684(class105.field1809, this.field5282, this.field5282);
        }
        if (this.field5262 == 1) {
            this.method2346(arg0);
            this.field5263 = false;
        } else if (this.field5262 == 2) {
            this.field5263 = !this.method2351(arg0);
        }
    }
}
