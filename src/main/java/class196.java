import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class196 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    private int field3327 = -1;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Z")
    private boolean field3335 = true;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    private int field3331 = -1;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    private int field3350;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    private int field3346;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    private int field3336;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "Z")
    private boolean field3349;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    private int field3332;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    private int field3347;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    private int field3343;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    private int field3334;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    private static int field3333 = -1;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[I")
    private static int[] field3329 = new int[4];

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    private static int field3345 = -1;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    private int field3338;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    private int field3340;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    private int field3342;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public int field3348;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lud;")
    private static class307 field3328;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Ln;")
    private class309 field3330;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3337;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3339;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "[B")
    private static byte[] field3344;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 8)
    private final void method1469(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field3344[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3350 = arg2;
        this.field3346 = arg3;
        this.field3336 = arg4;
        this.field3349 = arg7;
        this.field3332 = arg1;
        this.field3347 = arg6;
        this.field3343 = arg5;
        this.field3334 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V", line = 52)
    private static final void method1470() {
        if (field3344 != null) {
            return;
        }
        field3344 = new byte[16384];
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
                field3344[var4 + var6] = field3344[var4 + var9] = field3344[var5 + var6] = field3344[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIII)V", line = 106)
    public final void method1471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field3341 - arg4 & 0x7FF;
        int var8 = this.field3338 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field3342) / 2 + var9;
        int var12 = (arg2 - this.field3342) / 2 + var10;
        if (var11 >= arg3 || this.field3342 + var11 <= 0 || var12 >= arg2 || this.field3342 + var12 <= 0) {
            return;
        }
        if (this.field3334 == 0) {
            class62.field953.method1215(this.field3332, this.field3340, (byte) -70);
        } else if (this.field3327 == -1) {
            return;
        } else {
            class43.method390(this.field3327);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field3342 + var14;
        int var16 = this.field3342 + var13;
        GL var17 = class43.field651;
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

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Laf;)Z", line = 156)
    private final boolean method1472(class196 arg0) {
        class307 var2 = class307.method2127(class167.field2913, this.field3332, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class43.field651;
        class169.method1326(field3329);
        class169.method1335();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field3349) {
                var4 = -arg0.field3350;
                var5 = -arg0.field3346;
                var6 = -arg0.field3336;
            } else {
                var4 = this.field3350 - arg0.field3350;
                var5 = this.field3346 - arg0.field3346;
                var6 = this.field3336 - arg0.field3336;
            }
        }
        var2.method2129();
        class10 var7 = var2.method2104(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method82() - var7.method86()) / 2;
        int var9 = (var7.method84() - var7.method95()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class19.method190((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field3340, this.field3340);
        if (this.field3341 != 0) {
            int var11 = class62.field962[this.field3341];
            int var12 = class62.field961[this.field3341];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field3338 != 0) {
            int var14 = this.field3338 - 1024 & 0x7FF;
            int var15 = class62.field962[var14];
            int var16 = class62.field961[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class9.method70((float) (-var4), (float) var5, (float) (-var6));
        class9.method68(16777215, 0.5F, 0.5F, 0.5F);
        class9.method62();
        class43.method376();
        class43.method366(true);
        class43.method352(true);
        var7.method88(0, 0, 0, 0, -var8 - var7.method86(), -var9 - var7.method95(), 0, -1L);
        class43.method352(false);
        class43.method366(false);
        class43.method354();
        class19.method192();
        class43.method390(this.field3327);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3340, this.field3340, 0);
        class169.method1333(field3329);
        return true;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Laf;)Z", line = 249)
    private final boolean method1473(class196 arg0) {
        if (this.field3330 == null) {
            if (this.field3334 == 0) {
                this.field3330 = class62.field953.method1219(true, this.field3340, true, class62.field947, this.field3332);
            } else if (this.field3334 == 2) {
                this.method1477(arg0);
            } else if (this.field3334 == 1) {
                this.method1476(arg0);
            }
        }
        return this.field3330 != null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()V", line = 277)
    private static final void method1474() {
        if (field3337 != null) {
            return;
        }
        class336 var0 = new class336(1088);
        class336 var1 = new class336(5140);
        if (class43.field639) {
            var1.method2353(0.0F, (byte) 26);
            var1.method2353(1.0F, (byte) 60);
            var1.method2353(0.0F, (byte) 71);
            var1.method2353(0.5F, (byte) 65);
            var1.method2353(1.0F, (byte) 55);
            var1.method2353(0.0F, (byte) 43);
            var1.method2353(-1.0F, (byte) 89);
            var1.method2353(0.0F, (byte) 61);
            var1.method2353(0.5F, (byte) 41);
            var1.method2353(0.0F, (byte) 107);
        } else {
            var1.method2341(0.0F, 21536);
            var1.method2341(1.0F, 21536);
            var1.method2341(0.0F, 21536);
            var1.method2341(0.5F, 21536);
            var1.method2341(1.0F, 21536);
            var1.method2341(0.0F, 21536);
            var1.method2341(-1.0F, 21536);
            var1.method2341(0.0F, 21536);
            var1.method2341(0.5F, 21536);
            var1.method2341(0.0F, 21536);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class62.field962[var5] / 65535.0F;
            float var7 = (float) class62.field961[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class62.field961[var9] / 65535.0F;
                float var11 = (float) class62.field962[var9] * var6 / 65535.0F;
                float var12 = (float) class62.field962[var9] * var7 / 65535.0F;
                if (class43.field639) {
                    var1.method2353(var12, (byte) 109);
                    var1.method2353(var10, (byte) 66);
                    var1.method2353(var11, (byte) 113);
                    var1.method2353(var2, (byte) 69);
                    var1.method2353(var3, (byte) 65);
                } else {
                    var1.method2341(var12, 21536);
                    var1.method2341(var10, 21536);
                    var1.method2341(var11, 21536);
                    var1.method2341(var2, 21536);
                    var1.method2341(var3, 21536);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class43.field639) {
                    var0.method2359(-805606200, 0);
                    var0.method2359(-805606200, 0);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method2359(-805606200, var14++);
                        var0.method2359(-805606200, var13++);
                    }
                    var0.method2359(-805606200, 1);
                    var0.method2359(-805606200, 1);
                } else {
                    var0.method2354(0, -668578648);
                    var0.method2354(0, -668578648);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method2354(var14++, -668578648);
                        var0.method2354(var13++, -668578648);
                    }
                    var0.method2354(1, -668578648);
                    var0.method2354(1, -668578648);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field3337 = ByteBuffer.allocateDirect(var1.field5353);
        field3337.put(var1.field5342, 0, var1.field5353);
        field3337.flip();
        field3339 = ByteBuffer.allocateDirect(var0.field5353);
        field3339.put(var0.field5342, 0, var0.field5353);
        field3339.flip();
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(Laf;)V", line = 427)
    private final void method1475(class196 arg0) {
        method1474();
        method1484();
        GL var2 = class43.field651;
        class169.method1326(field3329);
        class169.method1335();
        var2.glClearColor((float) ((this.field3347 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field3347 & 0xFF00) >> 8) / 255.0F, (float) (this.field3347 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3349) {
                var3 = -arg0.field3350;
                var4 = -arg0.field3346;
                var5 = -arg0.field3336;
            } else {
                var3 = this.field3350 - arg0.field3350;
                var4 = this.field3346 - arg0.field3346;
                var5 = this.field3336 - arg0.field3336;
            }
        }
        class19.method194(-1.0F, 1.0F, -1.0F, 1.0F, this.field3340, this.field3340);
        if (this.field3341 != 0) {
            int var6 = class62.field962[this.field3341];
            int var7 = class62.field961[this.field3341];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3338 != 0) {
            int var9 = this.field3338 - 1024 & 0x7FF;
            int var10 = class62.field962[var9];
            int var11 = class62.field961[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class9.method70((float) (-var3), (float) (-var4), (float) var5);
        class9.method68(16777215, 0.5F, 0.5F, 1.0F);
        class9.method62();
        if (this.field3347 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class62.field953.method1215(this.field3332, this.field3340, (byte) -70);
        class43.method352(true);
        if (class43.field674) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field3337.position(0));
        var2.glVertexPointer(2, 5126, 20, field3337.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field3337.position(12));
        var2.glDrawElements(5, field3339.limit() / 2, 5123, field3339.position(0));
        var2.glEnableClientState(32886);
        class43.method352(false);
        if (this.field3347 != 0) {
            class83.method749(0, 0, 97);
            class43.method368(1);
            class43.method349(0);
            class43.method390(field3345);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field3347 >> 16), (byte) (this.field3347 >> 8), (byte) this.field3347, (byte) 127);
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
            var2.glColor4ub((byte) (this.field3347 >> 16), (byte) (this.field3347 >> 8), (byte) this.field3347, (byte) -1);
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
        class19.method192();
        class43.method390(this.field3327);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3340, this.field3340, 0);
        class169.method1333(field3329);
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(Laf;)V", line = 552)
    private final void method1476(class196 arg0) {
        method1479();
        method1470();
        this.field3330 = new class273(this.field3340, this.field3340);
        class47.method410(field3329);
        this.field3330.method2141();
        class62.method575();
        class47.method422(0, 0, this.field3340, this.field3340, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field3349) {
                var2 = -arg0.field3350;
                var3 = -arg0.field3346;
                var4 = -arg0.field3336;
            } else {
                var2 = this.field3350 - arg0.field3350;
                var3 = this.field3346 - arg0.field3346;
                var4 = this.field3336 - arg0.field3336;
            }
        }
        if (this.field3341 != 0) {
            int var5 = class62.field962[this.field3341];
            int var6 = class62.field961[this.field3341];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field3338 != 0) {
            int var8 = this.field3338 - 1024 & 0x7FF;
            int var9 = class62.field962[var8];
            int var10 = class62.field961[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class345.method2421(field3328.field4895, 0, field3328.field4875, (short) class62.field953.method1220(this.field3332, -109));
        class103 var12 = field3328.method2123(64, 512, -var2, -var3, -var4);
        int var13 = var12.method82() - var12.method86();
        int var14 = var12.method84() - var12.method95();
        if (var13 > var14) {
            int var15 = this.field3347 == 0 ? (var13 << 9) / this.field3340 : (var13 * 16 << 9) / (this.field3340 * 13);
            var12.method882(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field3347 == 0 ? (var14 << 9) / this.field3340 : (var14 * 16 << 9) / (this.field3340 * 13);
            var12.method882(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field3347 == 0) {
            for (int var17 = 0; var17 < class47.field725.length; var17++) {
                if (class47.field725[var17] != 0) {
                    class47.field725[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1483();
            this.method1482();
        }
        class256.field4119.method1358(2);
        class47.method406(field3329);
        class62.method575();
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(Laf;)V", line = 654)
    private final void method1477(class196 arg0) {
        class307 var2 = class307.method2127(class167.field2913, this.field3332, 0);
        if (var2 == null) {
            return;
        }
        this.field3330 = new class309(this.field3340, this.field3340);
        class47.method410(field3329);
        this.field3330.method2141();
        class62.method575();
        class47.method422(0, 0, this.field3340, this.field3340, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3349) {
                var3 = -arg0.field3350;
                var4 = -arg0.field3346;
                var5 = -arg0.field3336;
            } else {
                var3 = this.field3350 - arg0.field3350;
                var4 = this.field3346 - arg0.field3346;
                var5 = this.field3336 - arg0.field3336;
            }
        }
        if (this.field3341 != 0) {
            int var6 = class62.field962[this.field3341];
            int var7 = class62.field961[this.field3341];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3338 != 0) {
            int var9 = this.field3338 - 1024 & 0x7FF;
            int var10 = class62.field962[var9];
            int var11 = class62.field961[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class103 var13 = var2.method2123(64, 768, -var3, -var4, -var5);
        int var14 = var13.method82() - var13.method86();
        int var15 = var13.method84() - var13.method95();
        int var16 = var13.method86() + var14 / 2;
        int var17 = var13.method95() + var15 / 2;
        if (var14 > var15) {
            var13.method882(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field3340);
        } else {
            var13.method882(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field3340);
        }
        class256.field4119.method1358(2);
        class47.method406(field3329);
        class62.method575();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIILaf;)V", line = 741)
    public final void method1478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class196 arg6) {
        int var8 = this.field3341 - arg4 & 0x7FF;
        int var9 = this.field3338 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field3342) / 2 + var10;
        int var13 = (arg2 - this.field3342) / 2 + var11;
        if (var12 < arg3 && this.field3342 + var12 > 0 && var13 < arg2 && this.field3342 + var13 > 0 && this.method1473(arg6)) {
            this.field3330.method1251(arg0 + var13, arg1 + var12, this.field3342, this.field3342);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "()V", line = 770)
    private static final void method1479() {
        if (field3328 != null) {
            return;
        }
        class307 var0 = field3328 = new class307(260, 480, 0);
        int[] var1 = var0.field4893;
        int[] var2 = var0.field4898;
        int[] var3 = var0.field4883;
        int[] var4 = var0.field4891;
        int[] var5 = var0.field4853;
        int[] var6 = var0.field4866;
        var0.field4876 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class62.field962[var8] >> 1;
            int var10 = class62.field961[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class62.field961[var12] >> 9;
                int var14 = (class62.field962[var12] >> 1) * var9 >> 23;
                int var15 = (class62.field962[var12] >> 1) * var10 >> 23;
                var1[var0.field4876] = var15;
                var2[var0.field4876] = var13;
                var3[var0.field4876] = -var14;
                var0.field4876++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field4875] = 0;
                var5[var0.field4875] = var17;
                var6[var0.field4875] = var16;
                var0.field4875++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field4875] = var17;
                    var5[var0.field4875] = var19;
                    var6[var0.field4875] = var16;
                    var0.field4875++;
                    var4[var0.field4875] = var19;
                    var5[var0.field4875] = var20;
                    var6[var0.field4875] = var16;
                    var0.field4875++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field4875] = var16;
                var5[var0.field4875] = var17;
                var6[var0.field4875] = 1;
                var0.field4875++;
            }
        }
        var0.field4874 = var0.field4876;
        var0.field4868 = null;
        var0.field4880 = null;
        var0.field4877 = null;
        var0.field4851 = null;
        var0.field4861 = null;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "()V", line = 885)
    public static final void method1480() {
        if (field3345 != -1) {
            class151.method1190(field3345, 0, field3333);
        }
        field3345 = -1;
        field3333 = -1;
        field3337 = null;
        field3339 = null;
        field3328 = null;
        field3344 = null;
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(Laf;)V", line = 898)
    public final void method1481(class196 arg0) {
        if (this.field3334 == 0) {
            return;
        }
        boolean var2 = this.field3327 == -1 || class151.field2669 != this.field3331;
        if (!this.field3335 && !var2) {
            return;
        }
        if (var2) {
            this.field3331 = class151.field2669;
            this.field3327 = class3.method20(class3.field41, this.field3340, this.field3340);
        } else {
            class43.method390(this.field3327);
            class3.method18(class3.field41, this.field3340, this.field3340);
        }
        if (this.field3334 == 1) {
            this.method1475(arg0);
            this.field3335 = false;
        } else if (this.field3334 == 2) {
            this.field3335 = !this.method1472(arg0);
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "()V", line = 943)
    private final void method1482() {
        int var1 = this.field3340;
        int var2 = this.field3340;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class47.field729 - var1;
        if (var2 > class47.field727) {
            var2 -= var2 - class47.field727;
        }
        if (class47.field723 > 0) {
            int var9 = class47.field723;
            var2 -= var9;
            var7 += class47.field729 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class47.field724) {
            int var10 = var1 - class47.field724;
            var1 -= var10;
            var8 += var10;
        }
        if (class47.field726 > 0) {
            int var11 = class47.field726;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1488(class47.field725, this.field3347, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "()V", line = 995)
    private final void method1483() {
        int var1 = this.field3340 * 3 / 32;
        int var3 = this.field3340 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class47.field729 * var1 + var1;
        int var8 = class47.field729 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class47.field727) {
            var4 = var3 - (var1 + var3 - class47.field727);
        }
        if (var1 < class47.field723) {
            int var11 = class47.field723 - var1;
            var4 -= var11;
            var7 += class47.field729 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class47.field724) {
            int var12 = var1 + var3 - class47.field724;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class47.field726) {
            int var13 = class47.field726 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1469(class47.field725, 0, this.field3347, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "()V", line = 1048)
    private static final void method1484() {
        method1470();
        if (field3345 == -1 || field3333 != class151.field2669) {
            field3345 = class3.method16(class3.field47, 128, 128, field3344);
            field3333 = class151.field2669;
        }
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "()V", line = 1057)
    public static void method1485() {
        field3337 = null;
        field3339 = null;
        field3328 = null;
        field3344 = null;
        field3329 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)Z", line = 1072)
    public final boolean method1486(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3349) {
            this.field3348 = 1073741823;
            var8 = this.field3350;
            var9 = this.field3346;
            var10 = this.field3336;
        } else {
            int var5 = this.field3350 - arg0;
            int var6 = this.field3346 - arg1;
            int var7 = this.field3336 - arg2;
            this.field3348 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3348 == 0) {
                this.field3348 = 1;
            }
            var8 = (var5 << 8) / this.field3348;
            var9 = (var6 << 8) / this.field3348;
            var10 = (var7 << 8) / this.field3348;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3342 = this.field3343 * arg3 / (this.field3349 ? 1024 : this.field3348);
        } else {
            this.field3342 = 0;
        }
        if (this.field3342 < 8) {
            this.method1487();
            this.field3330 = null;
            return false;
        }
        int var12 = class48.method427(this.field3342, -9);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3340 != var12) {
            this.field3340 = var12;
        }
        this.field3341 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field3338 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field3335 = true;
        this.field3330 = null;
        return true;
    }

    @OriginalMember(owner = "client!af", name = "finalize", descriptor = "()V", line = 1128)
    protected final void finalize() throws Throwable {
        this.method1487();
        super.finalize();
    }

    @OriginalMember(owner = "client!af", name = "i", descriptor = "()V", line = 1133)
    private final void method1487() {
        if (this.field3327 != -1) {
            class151.method1190(this.field3327, 0, this.field3331);
        }
        this.field3335 = true;
        this.field3327 = -1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([IIIIIIIIIII)V", line = 1147)
    private final void method1488(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field3344[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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
}
