import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class188 {

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    private int field3030 = -1;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    private int field3026 = -1;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Z")
    private boolean field3031 = true;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    private int field3010;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    private int field3029;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Z")
    private boolean field3019;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    private int field3022;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    private int field3024;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    private int field3018;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    private int field3033;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    private static int field3014 = -1;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "[I")
    private static int[] field3020 = new int[4];

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    private static int field3027 = -1;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    private int field3021;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    private int field3032;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lch;")
    private static class114 field3015;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lsi;")
    private class351 field3011;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3023;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3025;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "[B")
    private static byte[] field3013;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V", line = 10)
    public static void method1472() {
        field3023 = null;
        field3025 = null;
        field3015 = null;
        field3013 = null;
        field3020 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIILra;)V", line = 18)
    public final void method1473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class188 arg6) {
        int var8 = this.field3017 - arg4 & 0x7FF;
        int var9 = this.field3016 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field3032) / 2 + var10;
        int var13 = (arg2 - this.field3032) / 2 + var11;
        if (var12 < arg3 && this.field3032 + var12 > 0 && var13 < arg2 && this.field3032 + var13 > 0 && this.method1478(arg6)) {
            this.field3011.method90(arg0 + var13, arg1 + var12, this.field3032, this.field3032);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lra;)Z", line = 41)
    private final boolean method1474(class188 arg0) {
        class114 var2 = class114.method887(class359.field5691, this.field3022, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class42.field627;
        class244.method1868(field3020);
        class244.method1863();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field3019) {
                var4 = -arg0.field3010;
                var5 = -arg0.field3012;
                var6 = -arg0.field3029;
            } else {
                var4 = this.field3010 - arg0.field3010;
                var5 = this.field3012 - arg0.field3012;
                var6 = this.field3029 - arg0.field3029;
            }
        }
        var2.method866();
        class96 var7 = var2.method880(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method547() - var7.method540()) / 2;
        int var9 = (var7.method541() - var7.method444()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class212.method1598((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field3021, this.field3021);
        if (this.field3017 != 0) {
            int var11 = class153.field2438[this.field3017];
            int var12 = class153.field2445[this.field3017];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field3016 != 0) {
            int var14 = this.field3016 - 1024 & 0x7FF;
            int var15 = class153.field2438[var14];
            int var16 = class153.field2445[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class167.method1297((float) (-var4), (float) var5, (float) (-var6));
        class167.method1305(16777215, 0.5F, 0.5F, 0.5F);
        class167.method1304();
        class42.method282();
        class42.method278(true);
        class42.method283(true);
        var7.method534(0, 0, 0, 0, -var8 - var7.method540(), -var9 - var7.method444(), 0, -1L);
        class42.method283(false);
        class42.method278(false);
        class42.method279();
        class212.method1602();
        class42.method273(this.field3030);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3021, this.field3021, 0);
        class244.method1861(field3020);
        return true;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII)V", line = 131)
    public final void method1475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field3017 - arg4 & 0x7FF;
        int var8 = this.field3016 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field3032) / 2 + var9;
        int var12 = (arg2 - this.field3032) / 2 + var10;
        if (var11 >= arg3 || this.field3032 + var11 <= 0 || var12 >= arg2 || this.field3032 + var12 <= 0) {
            return;
        }
        if (this.field3033 == 0) {
            class153.field2439.method757(this.field3021, this.field3022, (byte) -45);
        } else if (this.field3030 == -1) {
            return;
        } else {
            class42.method273(this.field3030);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field3032 + var14;
        int var16 = this.field3032 + var13;
        GL var17 = class42.field627;
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

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()V", line = 181)
    private final void method1476() {
        int var1 = this.field3021 * 3 / 32;
        int var3 = this.field3021 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class246.field4035 * var1 + var1;
        int var8 = class246.field4035 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class246.field4039) {
            var4 = var3 - (var1 + var3 - class246.field4039);
        }
        if (var1 < class246.field4038) {
            int var11 = class246.field4038 - var1;
            var4 -= var11;
            var7 += class246.field4035 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class246.field4031) {
            int var12 = var1 + var3 - class246.field4031;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class246.field4032) {
            int var13 = class246.field4032 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1490(class246.field4036, 0, this.field3024, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "()V", line = 233)
    private static final void method1477() {
        method1481();
        if (field3014 == -1 || class199.field3172 != field3027) {
            field3014 = class119.method934(class119.field2012, 128, 128, field3013);
            field3027 = class199.field3172;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lra;)Z", line = 244)
    private final boolean method1478(class188 arg0) {
        if (this.field3011 == null) {
            if (this.field3033 == 0) {
                this.field3011 = class153.field2439.method769(this.field3021, 0, class153.field2440, true, this.field3022);
            } else if (this.field3033 == 2) {
                this.method1484(arg0);
            } else if (this.field3033 == 1) {
                this.method1480(arg0);
            }
        }
        return this.field3011 != null;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Lra;)V", line = 272)
    public final void method1479(class188 arg0) {
        if (this.field3033 == 0) {
            return;
        }
        boolean var2 = this.field3030 == -1 || class199.field3172 != this.field3026;
        if (!this.field3031 && !var2) {
            return;
        }
        if (var2) {
            this.field3026 = class199.field3172;
            this.field3030 = class119.method940(class119.field2006, this.field3021, this.field3021);
        } else {
            class42.method273(this.field3030);
            class119.method935(class119.field2006, this.field3021, this.field3021);
        }
        if (this.field3033 == 1) {
            this.method1483(arg0);
            this.field3031 = false;
        } else if (this.field3033 == 2) {
            this.field3031 = !this.method1474(arg0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V", line = 315)
    protected final void finalize() throws Throwable {
        this.method1488();
        super.finalize();
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(Lra;)V", line = 323)
    private final void method1480(class188 arg0) {
        method1489();
        method1481();
        this.field3011 = new class120(this.field3021, this.field3021);
        class246.method1886(field3020);
        this.field3011.method2472();
        class153.method1179();
        class246.method1885(0, 0, this.field3021, this.field3021, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field3019) {
                var2 = -arg0.field3010;
                var3 = -arg0.field3012;
                var4 = -arg0.field3029;
            } else {
                var2 = this.field3010 - arg0.field3010;
                var3 = this.field3012 - arg0.field3012;
                var4 = this.field3029 - arg0.field3029;
            }
        }
        if (this.field3017 != 0) {
            int var5 = class153.field2438[this.field3017];
            int var6 = class153.field2445[this.field3017];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field3016 != 0) {
            int var8 = this.field3016 - 1024 & 0x7FF;
            int var9 = class153.field2438[var8];
            int var10 = class153.field2445[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class242.method1843(field3015.field1867, 0, field3015.field1912, (short) class153.field2439.method770(this.field3022, -105));
        class62 var12 = field3015.method868(64, 512, -var2, -var3, -var4);
        int var13 = var12.method547() - var12.method540();
        int var14 = var12.method541() - var12.method444();
        if (var13 > var14) {
            int var15 = this.field3024 == 0 ? (var13 << 9) / this.field3021 : (var13 * 16 << 9) / (this.field3021 * 13);
            var12.method538(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field3024 == 0 ? (var14 << 9) / this.field3021 : (var14 * 16 << 9) / (this.field3021 * 13);
            var12.method538(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field3024 == 0) {
            for (int var17 = 0; var17 < class246.field4036.length; var17++) {
                if (class246.field4036[var17] != 0) {
                    class246.field4036[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1476();
            this.method1487();
        }
        class292.field4728.method2415(-1);
        class246.method1883(field3020);
        class153.method1179();
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()V", line = 424)
    private static final void method1481() {
        if (field3013 != null) {
            return;
        }
        field3013 = new byte[16384];
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
                field3013[var4 + var6] = field3013[var4 + var9] = field3013[var5 + var6] = field3013[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)Z", line = 481)
    public final boolean method1482(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3019) {
            this.field3028 = 1073741823;
            var8 = this.field3010;
            var9 = this.field3012;
            var10 = this.field3029;
        } else {
            int var5 = this.field3010 - arg0;
            int var6 = this.field3012 - arg1;
            int var7 = this.field3029 - arg2;
            this.field3028 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3028 == 0) {
                this.field3028 = 1;
            }
            var8 = (var5 << 8) / this.field3028;
            var9 = (var6 << 8) / this.field3028;
            var10 = (var7 << 8) / this.field3028;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3032 = this.field3018 * arg3 / (this.field3019 ? 1024 : this.field3028);
        } else {
            this.field3032 = 0;
        }
        if (this.field3032 < 8) {
            this.method1488();
            this.field3011 = null;
            return false;
        }
        int var12 = class159.method1243(this.field3032, -113);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3021 != var12) {
            this.field3021 = var12;
        }
        this.field3017 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field3016 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field3031 = true;
        this.field3011 = null;
        return true;
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(Lra;)V", line = 538)
    private final void method1483(class188 arg0) {
        method1491();
        method1477();
        GL var2 = class42.field627;
        class244.method1868(field3020);
        class244.method1863();
        var2.glClearColor((float) ((this.field3024 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field3024 & 0xFF00) >> 8) / 255.0F, (float) (this.field3024 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3019) {
                var3 = -arg0.field3010;
                var4 = -arg0.field3012;
                var5 = -arg0.field3029;
            } else {
                var3 = this.field3010 - arg0.field3010;
                var4 = this.field3012 - arg0.field3012;
                var5 = this.field3029 - arg0.field3029;
            }
        }
        class212.method1595(-1.0F, 1.0F, -1.0F, 1.0F, this.field3021, this.field3021);
        if (this.field3017 != 0) {
            int var6 = class153.field2438[this.field3017];
            int var7 = class153.field2445[this.field3017];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3016 != 0) {
            int var9 = this.field3016 - 1024 & 0x7FF;
            int var10 = class153.field2438[var9];
            int var11 = class153.field2445[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class167.method1297((float) (-var3), (float) (-var4), (float) var5);
        class167.method1305(16777215, 0.5F, 0.5F, 1.0F);
        class167.method1304();
        if (this.field3024 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class153.field2439.method757(this.field3021, this.field3022, (byte) -45);
        class42.method283(true);
        if (class42.field645) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field3023.position(0));
        var2.glVertexPointer(2, 5126, 20, field3023.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field3023.position(12));
        var2.glDrawElements(5, field3025.limit() / 2, 5123, field3025.position(0));
        var2.glEnableClientState(32886);
        class42.method283(false);
        if (this.field3024 != 0) {
            class310.method2203(0, 0, 104);
            class42.method275(1);
            class42.method277(0);
            class42.method273(field3014);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field3024 >> 16), (byte) (this.field3024 >> 8), (byte) this.field3024, (byte) 127);
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
            var2.glColor4ub((byte) (this.field3024 >> 16), (byte) (this.field3024 >> 8), (byte) this.field3024, (byte) -1);
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
        class212.method1602();
        class42.method273(this.field3030);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3021, this.field3021, 0);
        class244.method1861(field3020);
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(Lra;)V", line = 669)
    private final void method1484(class188 arg0) {
        class114 var2 = class114.method887(class359.field5691, this.field3022, 0);
        if (var2 == null) {
            return;
        }
        this.field3011 = new class351(this.field3021, this.field3021);
        class246.method1886(field3020);
        this.field3011.method2472();
        class153.method1179();
        class246.method1885(0, 0, this.field3021, this.field3021, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3019) {
                var3 = -arg0.field3010;
                var4 = -arg0.field3012;
                var5 = -arg0.field3029;
            } else {
                var3 = this.field3010 - arg0.field3010;
                var4 = this.field3012 - arg0.field3012;
                var5 = this.field3029 - arg0.field3029;
            }
        }
        if (this.field3017 != 0) {
            int var6 = class153.field2438[this.field3017];
            int var7 = class153.field2445[this.field3017];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3016 != 0) {
            int var9 = this.field3016 - 1024 & 0x7FF;
            int var10 = class153.field2438[var9];
            int var11 = class153.field2445[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class62 var13 = var2.method868(64, 768, -var3, -var4, -var5);
        int var14 = var13.method547() - var13.method540();
        int var15 = var13.method541() - var13.method444();
        int var16 = var13.method540() + var14 / 2;
        int var17 = var13.method444() + var15 / 2;
        if (var14 > var15) {
            var13.method538(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field3021);
        } else {
            var13.method538(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field3021);
        }
        class292.field4728.method2415(-1);
        class246.method1883(field3020);
        class153.method1179();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIIIIIIIIII)V", line = 752)
    private final void method1485(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field3013[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "()V", line = 789)
    public static final void method1486() {
        if (field3014 != -1) {
            class199.method1535(field3014, 0, field3027);
        }
        field3014 = -1;
        field3027 = -1;
        field3023 = null;
        field3025 = null;
        field3015 = null;
        field3013 = null;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "()V", line = 806)
    private final void method1487() {
        int var1 = this.field3021;
        int var2 = this.field3021;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class246.field4035 - var1;
        if (var2 > class246.field4039) {
            var2 -= var2 - class246.field4039;
        }
        if (class246.field4038 > 0) {
            int var9 = class246.field4038;
            var2 -= var9;
            var7 += class246.field4035 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class246.field4031) {
            int var10 = var1 - class246.field4031;
            var1 -= var10;
            var8 += var10;
        }
        if (class246.field4032 > 0) {
            int var11 = class246.field4032;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1485(class246.field4036, this.field3024, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3010 = arg2;
        this.field3012 = arg3;
        this.field3029 = arg4;
        this.field3019 = arg7;
        this.field3022 = arg1;
        this.field3024 = arg6;
        this.field3018 = arg5;
        this.field3033 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "()V", line = 857)
    private final void method1488() {
        if (this.field3030 != -1) {
            class199.method1535(this.field3030, 0, this.field3026);
        }
        this.field3031 = true;
        this.field3030 = -1;
    }

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "()V", line = 867)
    private static final void method1489() {
        if (field3015 != null) {
            return;
        }
        class114 var0 = field3015 = new class114(260, 480, 0);
        int[] var1 = var0.field1869;
        int[] var2 = var0.field1916;
        int[] var3 = var0.field1910;
        int[] var4 = var0.field1876;
        int[] var5 = var0.field1878;
        int[] var6 = var0.field1892;
        var0.field1886 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class153.field2438[var8] >> 1;
            int var10 = class153.field2445[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class153.field2445[var12] >> 9;
                int var14 = (class153.field2438[var12] >> 1) * var9 >> 23;
                int var15 = (class153.field2438[var12] >> 1) * var10 >> 23;
                var1[var0.field1886] = var15;
                var2[var0.field1886] = var13;
                var3[var0.field1886] = -var14;
                var0.field1886++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field1912] = 0;
                var5[var0.field1912] = var17;
                var6[var0.field1912] = var16;
                var0.field1912++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field1912] = var17;
                    var5[var0.field1912] = var19;
                    var6[var0.field1912] = var16;
                    var0.field1912++;
                    var4[var0.field1912] = var19;
                    var5[var0.field1912] = var20;
                    var6[var0.field1912] = var16;
                    var0.field1912++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field1912] = var16;
                var5[var0.field1912] = var17;
                var6[var0.field1912] = 1;
                var0.field1912++;
            }
        }
        var0.field1885 = var0.field1886;
        var0.field1879 = null;
        var0.field1866 = null;
        var0.field1884 = null;
        var0.field1894 = null;
        var0.field1900 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 980)
    private final void method1490(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field3013[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "()V", line = 1019)
    private static final void method1491() {
        if (field3023 != null) {
            return;
        }
        class227 var0 = new class227(1088);
        class227 var1 = new class227(5140);
        if (class42.field625) {
            var1.method1713(false, 0.0F);
            var1.method1713(false, 1.0F);
            var1.method1713(false, 0.0F);
            var1.method1713(false, 0.5F);
            var1.method1713(false, 1.0F);
            var1.method1713(false, 0.0F);
            var1.method1713(false, -1.0F);
            var1.method1713(false, 0.0F);
            var1.method1713(false, 0.5F);
            var1.method1713(false, 0.0F);
        } else {
            var1.method1738(0.0F, (byte) -39);
            var1.method1738(1.0F, (byte) -39);
            var1.method1738(0.0F, (byte) -39);
            var1.method1738(0.5F, (byte) -39);
            var1.method1738(1.0F, (byte) -39);
            var1.method1738(0.0F, (byte) -39);
            var1.method1738(-1.0F, (byte) -39);
            var1.method1738(0.0F, (byte) -39);
            var1.method1738(0.5F, (byte) -39);
            var1.method1738(0.0F, (byte) -39);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class153.field2438[var5] / 65535.0F;
            float var7 = (float) class153.field2445[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class153.field2445[var9] / 65535.0F;
                float var11 = (float) class153.field2438[var9] * var6 / 65535.0F;
                float var12 = (float) class153.field2438[var9] * var7 / 65535.0F;
                if (class42.field625) {
                    var1.method1713(false, var12);
                    var1.method1713(false, var10);
                    var1.method1713(false, var11);
                    var1.method1713(false, var2);
                    var1.method1713(false, var3);
                } else {
                    var1.method1738(var12, (byte) -39);
                    var1.method1738(var10, (byte) -39);
                    var1.method1738(var11, (byte) -39);
                    var1.method1738(var2, (byte) -39);
                    var1.method1738(var3, (byte) -39);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class42.field625) {
                    var0.method1729(0, 206);
                    var0.method1729(0, 206);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method1729(var14++, 206);
                        var0.method1729(var13++, 206);
                    }
                    var0.method1729(1, 206);
                    var0.method1729(1, 206);
                } else {
                    var0.method1726(102, 0);
                    var0.method1726(-80, 0);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method1726(-115, var14++);
                        var0.method1726(113, var13++);
                    }
                    var0.method1726(56, 1);
                    var0.method1726(-95, 1);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field3023 = ByteBuffer.allocateDirect(var1.field3760);
        field3023.put(var1.field3793, 0, var1.field3760);
        field3023.flip();
        field3025 = ByteBuffer.allocateDirect(var0.field3760);
        field3025.put(var0.field3793, 0, var0.field3760);
        field3025.flip();
    }
}
