import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class108 {

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    private int field1402 = -1;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    private int field1405 = -1;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Z")
    private boolean field1403 = true;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "Z")
    private boolean field1407;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[I")
    private static int[] field1390 = new int[4];

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    private static int field1393 = -1;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    private static int field1409 = -1;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Lvn;")
    private class11 field1387;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "Lml;")
    private static class197 field1401;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1388;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1394;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "[B")
    private static byte[] field1408;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 6)
    private final void method753(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field1408[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lkg;)V", line = 49)
    private final void method754(class108 arg0) {
        method762();
        method770();
        GL var2 = class47.field592;
        class129.method982(field1390);
        class129.method994();
        var2.glClearColor((float) ((this.field1396 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field1396 & 0xFF00) >> 8) / 255.0F, (float) (this.field1396 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field1407) {
                var3 = -arg0.field1400;
                var4 = -arg0.field1406;
                var5 = -arg0.field1399;
            } else {
                var3 = this.field1400 - arg0.field1400;
                var4 = this.field1406 - arg0.field1406;
                var5 = this.field1399 - arg0.field1399;
            }
        }
        class320.method2211(-1.0F, 1.0F, -1.0F, 1.0F, this.field1398, this.field1398);
        if (this.field1404 != 0) {
            int var6 = class350.field5476[this.field1404];
            int var7 = class350.field5474[this.field1404];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field1391 != 0) {
            int var9 = this.field1391 - 1024 & 0x7FF;
            int var10 = class350.field5476[var9];
            int var11 = class350.field5474[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class41.method294((float) (-var3), (float) (-var4), (float) var5);
        class41.method301(16777215, 0.5F, 0.5F, 1.0F);
        class41.method296();
        if (this.field1396 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class350.field5467.method915((byte) -115, this.field1398, this.field1395);
        class47.method367(true);
        if (class47.field618) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field1388.position(0));
        var2.glVertexPointer(2, 5126, 20, field1388.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field1388.position(12));
        var2.glDrawElements(5, field1394.limit() / 2, 5123, field1394.position(0));
        var2.glEnableClientState(32886);
        class47.method367(false);
        if (this.field1396 != 0) {
            class255.method1781(0, 0, -63);
            class47.method354(1);
            class47.method364(0);
            class47.method357(field1409);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field1396 >> 16), (byte) (this.field1396 >> 8), (byte) this.field1396, (byte) 127);
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
            var2.glColor4ub((byte) (this.field1396 >> 16), (byte) (this.field1396 >> 8), (byte) this.field1396, (byte) -1);
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
        class320.method2207();
        class47.method357(this.field1402);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field1398, this.field1398, 0);
        class129.method991(field1390);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Lkg;)Z", line = 175)
    private final boolean method755(class108 arg0) {
        class197 var2 = class197.method1430(class324.field4759, this.field1395, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class47.field592;
        class129.method982(field1390);
        class129.method994();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field1407) {
                var4 = -arg0.field1400;
                var5 = -arg0.field1406;
                var6 = -arg0.field1399;
            } else {
                var4 = this.field1400 - arg0.field1400;
                var5 = this.field1406 - arg0.field1406;
                var6 = this.field1399 - arg0.field1399;
            }
        }
        var2.method1426();
        class81 var7 = var2.method1439(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method597() - var7.method588()) / 2;
        int var9 = (var7.method601() - var7.method583()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class320.method2210((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field1398, this.field1398);
        if (this.field1404 != 0) {
            int var11 = class350.field5476[this.field1404];
            int var12 = class350.field5474[this.field1404];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field1391 != 0) {
            int var14 = this.field1391 - 1024 & 0x7FF;
            int var15 = class350.field5476[var14];
            int var16 = class350.field5474[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class41.method294((float) (-var4), (float) var5, (float) (-var6));
        class41.method301(16777215, 0.5F, 0.5F, 0.5F);
        class41.method296();
        class47.method348();
        class47.method345(true);
        class47.method367(true);
        var7.method579(0, 0, 0, 0, -var8 - var7.method588(), -var9 - var7.method583(), 0, -1L);
        class47.method367(false);
        class47.method345(false);
        class47.method346();
        class320.method2207();
        class47.method357(this.field1402);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field1398, this.field1398, 0);
        class129.method991(field1390);
        return true;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V", line = 265)
    private final void method756() {
        int var1 = this.field1398;
        int var2 = this.field1398;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class37.field454 - var1;
        if (var2 > class37.field453) {
            var2 -= var2 - class37.field453;
        }
        if (class37.field446 > 0) {
            int var9 = class37.field446;
            var2 -= var9;
            var7 += class37.field454 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class37.field451) {
            int var10 = var1 - class37.field451;
            var1 -= var10;
            var8 += var10;
        }
        if (class37.field450 > 0) {
            int var11 = class37.field450;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method772(class37.field452, this.field1396, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIII)V", line = 317)
    public final void method757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1404 - arg4 & 0x7FF;
        int var8 = this.field1391 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field1392) / 2 + var9;
        int var12 = (arg2 - this.field1392) / 2 + var10;
        if (var11 >= arg3 || this.field1392 + var11 <= 0 || var12 >= arg2 || this.field1392 + var12 <= 0) {
            return;
        }
        if (this.field1410 == 0) {
            class350.field5467.method915((byte) -108, this.field1398, this.field1395);
        } else if (this.field1402 == -1) {
            return;
        } else {
            class47.method357(this.field1402);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field1392 + var14;
        int var16 = this.field1392 + var13;
        GL var17 = class47.field592;
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

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(Lkg;)V", line = 368)
    public final void method758(class108 arg0) {
        if (this.field1410 == 0) {
            return;
        }
        boolean var2 = this.field1402 == -1 || class298.field4320 != this.field1405;
        if (!this.field1403 && !var2) {
            return;
        }
        if (var2) {
            this.field1405 = class298.field4320;
            this.field1402 = class358.method2489(class358.field5593, this.field1398, this.field1398);
        } else {
            class47.method357(this.field1402);
            class358.method2488(class358.field5593, this.field1398, this.field1398);
        }
        if (this.field1410 == 1) {
            this.method754(arg0);
            this.field1403 = false;
        } else if (this.field1410 == 2) {
            this.field1403 = !this.method755(arg0);
        }
    }

    @OriginalMember(owner = "client!kg", name = "finalize", descriptor = "()V", line = 406)
    protected final void finalize() throws Throwable {
        this.method771();
        super.finalize();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)Z", line = 413)
    public final boolean method759(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1407) {
            this.field1397 = 1073741823;
            var8 = this.field1400;
            var9 = this.field1406;
            var10 = this.field1399;
        } else {
            int var5 = this.field1400 - arg0;
            int var6 = this.field1406 - arg1;
            int var7 = this.field1399 - arg2;
            this.field1397 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1397 == 0) {
                this.field1397 = 1;
            }
            var8 = (var5 << 8) / this.field1397;
            var9 = (var6 << 8) / this.field1397;
            var10 = (var7 << 8) / this.field1397;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1392 = this.field1389 * arg3 / (this.field1407 ? 1024 : this.field1397);
        } else {
            this.field1392 = 0;
        }
        if (this.field1392 < 8) {
            this.method771();
            this.field1387 = null;
            return false;
        }
        int var12 = class54.method408(this.field1392, (byte) 115);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1398 != var12) {
            this.field1398 = var12;
        }
        this.field1404 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field1391 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field1403 = true;
        this.field1387 = null;
        return true;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()V", line = 468)
    private static final void method760() {
        if (field1408 != null) {
            return;
        }
        field1408 = new byte[16384];
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
                field1408[var4 + var6] = field1408[var4 + var9] = field1408[var5 + var6] = field1408[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "()V", line = 520)
    private static final void method761() {
        if (field1401 != null) {
            return;
        }
        class197 var0 = field1401 = new class197(260, 480, 0);
        int[] var1 = var0.field2753;
        int[] var2 = var0.field2724;
        int[] var3 = var0.field2744;
        int[] var4 = var0.field2760;
        int[] var5 = var0.field2754;
        int[] var6 = var0.field2761;
        var0.field2759 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class350.field5476[var8] >> 1;
            int var10 = class350.field5474[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class350.field5474[var12] >> 9;
                int var14 = (class350.field5476[var12] >> 1) * var9 >> 23;
                int var15 = (class350.field5476[var12] >> 1) * var10 >> 23;
                var1[var0.field2759] = var15;
                var2[var0.field2759] = var13;
                var3[var0.field2759] = -var14;
                var0.field2759++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field2719] = 0;
                var5[var0.field2719] = var17;
                var6[var0.field2719] = var16;
                var0.field2719++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field2719] = var17;
                    var5[var0.field2719] = var19;
                    var6[var0.field2719] = var16;
                    var0.field2719++;
                    var4[var0.field2719] = var19;
                    var5[var0.field2719] = var20;
                    var6[var0.field2719] = var16;
                    var0.field2719++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field2719] = var16;
                var5[var0.field2719] = var17;
                var6[var0.field2719] = 1;
                var0.field2719++;
            }
        }
        var0.field2749 = var0.field2759;
        var0.field2739 = null;
        var0.field2713 = null;
        var0.field2735 = null;
        var0.field2723 = null;
        var0.field2742 = null;
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "()V", line = 640)
    private static final void method762() {
        if (field1388 != null) {
            return;
        }
        class299 var0 = new class299(1088);
        class299 var1 = new class299(5140);
        if (class47.field593) {
            var1.method2071(true, 0.0F);
            var1.method2071(true, 1.0F);
            var1.method2071(true, 0.0F);
            var1.method2071(true, 0.5F);
            var1.method2071(true, 1.0F);
            var1.method2071(true, 0.0F);
            var1.method2071(true, -1.0F);
            var1.method2071(true, 0.0F);
            var1.method2071(true, 0.5F);
            var1.method2071(true, 0.0F);
        } else {
            var1.method2099(0.0F, -2503);
            var1.method2099(1.0F, -2503);
            var1.method2099(0.0F, -2503);
            var1.method2099(0.5F, -2503);
            var1.method2099(1.0F, -2503);
            var1.method2099(0.0F, -2503);
            var1.method2099(-1.0F, -2503);
            var1.method2099(0.0F, -2503);
            var1.method2099(0.5F, -2503);
            var1.method2099(0.0F, -2503);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class350.field5476[var5] / 65535.0F;
            float var7 = (float) class350.field5474[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class350.field5474[var9] / 65535.0F;
                float var11 = (float) class350.field5476[var9] * var6 / 65535.0F;
                float var12 = (float) class350.field5476[var9] * var7 / 65535.0F;
                if (class47.field593) {
                    var1.method2071(true, var12);
                    var1.method2071(true, var10);
                    var1.method2071(true, var11);
                    var1.method2071(true, var2);
                    var1.method2071(true, var3);
                } else {
                    var1.method2099(var12, -2503);
                    var1.method2099(var10, -2503);
                    var1.method2099(var11, -2503);
                    var1.method2099(var2, -2503);
                    var1.method2099(var3, -2503);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class47.field593) {
                    var0.method2098(-32, 0);
                    var0.method2098(-21, 0);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method2098(-93, var14++);
                        var0.method2098(-60, var13++);
                    }
                    var0.method2098(-120, 1);
                    var0.method2098(-84, 1);
                } else {
                    var0.method2070((byte) 43, 0);
                    var0.method2070((byte) 43, 0);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method2070((byte) 43, var14++);
                        var0.method2070((byte) 43, var13++);
                    }
                    var0.method2070((byte) 43, 1);
                    var0.method2070((byte) 43, 1);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field1388 = ByteBuffer.allocateDirect(var1.field4351);
        field1388.put(var1.field4350, 0, var1.field4351);
        field1388.flip();
        field1394 = ByteBuffer.allocateDirect(var0.field4351);
        field1394.put(var0.field4350, 0, var0.field4351);
        field1394.flip();
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(Lkg;)Z", line = 798)
    private final boolean method763(class108 arg0) {
        if (this.field1387 == null) {
            if (this.field1410 == 0) {
                this.field1387 = class350.field5467.method913(true, class350.field5462, false, this.field1398, this.field1395);
            } else if (this.field1410 == 2) {
                this.method769(arg0);
            } else if (this.field1410 == 1) {
                this.method765(arg0);
            }
        }
        return this.field1387 != null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIILkg;)V", line = 831)
    public final void method764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class108 arg6) {
        int var8 = this.field1404 - arg4 & 0x7FF;
        int var9 = this.field1391 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field1392) / 2 + var10;
        int var13 = (arg2 - this.field1392) / 2 + var11;
        if (var12 < arg3 && this.field1392 + var12 > 0 && var13 < arg2 && this.field1392 + var13 > 0 && this.method763(arg6)) {
            this.field1387.method70(arg0 + var13, arg1 + var12, this.field1392, this.field1392);
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(Lkg;)V", line = 854)
    private final void method765(class108 arg0) {
        method761();
        method760();
        this.field1387 = new class301(this.field1398, this.field1398);
        class37.method249(field1390);
        this.field1387.method88();
        class350.method2444();
        class37.method231(0, 0, this.field1398, this.field1398, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field1407) {
                var2 = -arg0.field1400;
                var3 = -arg0.field1406;
                var4 = -arg0.field1399;
            } else {
                var2 = this.field1400 - arg0.field1400;
                var3 = this.field1406 - arg0.field1406;
                var4 = this.field1399 - arg0.field1399;
            }
        }
        if (this.field1404 != 0) {
            int var5 = class350.field5476[this.field1404];
            int var6 = class350.field5474[this.field1404];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field1391 != 0) {
            int var8 = this.field1391 - 1024 & 0x7FF;
            int var9 = class350.field5476[var8];
            int var10 = class350.field5474[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class87.method627(field1401.field2720, 0, field1401.field2719, (short) class350.field5467.method907(this.field1395, 65535));
        class332 var12 = field1401.method1437(64, 512, -var2, -var3, -var4);
        int var13 = var12.method597() - var12.method588();
        int var14 = var12.method601() - var12.method583();
        if (var13 > var14) {
            int var15 = this.field1396 == 0 ? (var13 << 9) / this.field1398 : (var13 * 16 << 9) / (this.field1398 * 13);
            var12.method2313(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field1396 == 0 ? (var14 << 9) / this.field1398 : (var14 * 16 << 9) / (this.field1398 * 13);
            var12.method2313(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field1396 == 0) {
            for (int var17 = 0; var17 < class37.field452.length; var17++) {
                if (class37.field452[var17] != 0) {
                    class37.field452[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method766();
            this.method756();
        }
        class283.field4035.method1224(84167136);
        class37.method252(field1390);
        class350.method2444();
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "()V", line = 956)
    private final void method766() {
        int var1 = this.field1398 * 3 / 32;
        int var3 = this.field1398 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class37.field454 * var1 + var1;
        int var8 = class37.field454 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class37.field453) {
            var4 = var3 - (var1 + var3 - class37.field453);
        }
        if (var1 < class37.field446) {
            int var11 = class37.field446 - var1;
            var4 -= var11;
            var7 += class37.field454 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class37.field451) {
            int var12 = var1 + var3 - class37.field451;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class37.field450) {
            int var13 = class37.field450 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method753(class37.field452, 0, this.field1396, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "()V", line = 1008)
    public static void method767() {
        field1388 = null;
        field1394 = null;
        field1401 = null;
        field1408 = null;
        field1390 = null;
    }

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "()V", line = 1016)
    public static final void method768() {
        if (field1409 != -1) {
            class298.method2037(field1409, 0, field1393);
        }
        field1409 = -1;
        field1393 = -1;
        field1388 = null;
        field1394 = null;
        field1401 = null;
        field1408 = null;
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(Lkg;)V", line = 1032)
    private final void method769(class108 arg0) {
        class197 var2 = class197.method1430(class324.field4759, this.field1395, 0);
        if (var2 == null) {
            return;
        }
        this.field1387 = new class11(this.field1398, this.field1398);
        class37.method249(field1390);
        this.field1387.method88();
        class350.method2444();
        class37.method231(0, 0, this.field1398, this.field1398, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field1407) {
                var3 = -arg0.field1400;
                var4 = -arg0.field1406;
                var5 = -arg0.field1399;
            } else {
                var3 = this.field1400 - arg0.field1400;
                var4 = this.field1406 - arg0.field1406;
                var5 = this.field1399 - arg0.field1399;
            }
        }
        if (this.field1404 != 0) {
            int var6 = class350.field5476[this.field1404];
            int var7 = class350.field5474[this.field1404];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field1391 != 0) {
            int var9 = this.field1391 - 1024 & 0x7FF;
            int var10 = class350.field5476[var9];
            int var11 = class350.field5474[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class332 var13 = var2.method1437(64, 768, -var3, -var4, -var5);
        int var14 = var13.method597() - var13.method588();
        int var15 = var13.method601() - var13.method583();
        int var16 = var13.method588() + var14 / 2;
        int var17 = var13.method583() + var15 / 2;
        if (var14 > var15) {
            var13.method2313(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field1398);
        } else {
            var13.method2313(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field1398);
        }
        class283.field4035.method1224(84167136);
        class37.method252(field1390);
        class350.method2444();
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1400 = arg2;
        this.field1406 = arg3;
        this.field1399 = arg4;
        this.field1407 = arg7;
        this.field1395 = arg1;
        this.field1396 = arg6;
        this.field1389 = arg5;
        this.field1410 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "()V", line = 1119)
    private static final void method770() {
        method760();
        if (field1409 == -1 || class298.field4320 != field1393) {
            field1409 = class358.method2491(class358.field5599, 128, 128, field1408);
            field1393 = class298.field4320;
        }
    }

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "()V", line = 1128)
    private final void method771() {
        if (this.field1402 != -1) {
            class298.method2037(this.field1402, 0, this.field1405);
        }
        this.field1403 = true;
        this.field1402 = -1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([IIIIIIIIIII)V", line = 1140)
    private final void method772(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field1408[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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
