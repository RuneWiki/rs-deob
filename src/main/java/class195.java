import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class195 {

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Z")
    private boolean field2713 = true;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    private int field2726 = -1;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    private int field2727 = -1;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    private int field2724;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    private int field2717;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    private int field2728;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Z")
    private boolean field2710;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    private int field2708;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    private int field2709;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    private int field2719;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    private int field2715;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "[I")
    private static int[] field2716 = new int[4];

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    private static int field2725 = -1;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    private static int field2711 = -1;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    private int field2721;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    private int field2722;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    private int field2723;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    private int field2729;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Lkn;")
    private class178 field2712;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Ldl;")
    private static class308 field2714;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2707;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2720;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "[B")
    private static byte[] field2718;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V", line = 7)
    private static final void method1364() {
        if (field2707 != null) {
            return;
        }
        class316 var0 = new class316(1088);
        class316 var1 = new class316(5140);
        if (class67.field916) {
            var1.method2213(-1, 0.0F);
            var1.method2213(-1, 1.0F);
            var1.method2213(-1, 0.0F);
            var1.method2213(-1, 0.5F);
            var1.method2213(-1, 1.0F);
            var1.method2213(-1, 0.0F);
            var1.method2213(-1, -1.0F);
            var1.method2213(-1, 0.0F);
            var1.method2213(-1, 0.5F);
            var1.method2213(-1, 0.0F);
        } else {
            var1.method2171(-1365938680, 0.0F);
            var1.method2171(-1365938680, 1.0F);
            var1.method2171(-1365938680, 0.0F);
            var1.method2171(-1365938680, 0.5F);
            var1.method2171(-1365938680, 1.0F);
            var1.method2171(-1365938680, 0.0F);
            var1.method2171(-1365938680, -1.0F);
            var1.method2171(-1365938680, 0.0F);
            var1.method2171(-1365938680, 0.5F);
            var1.method2171(-1365938680, 0.0F);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class184.field2538[var5] / 65535.0F;
            float var7 = (float) class184.field2532[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class184.field2532[var9] / 65535.0F;
                float var11 = (float) class184.field2538[var9] * var6 / 65535.0F;
                float var12 = (float) class184.field2538[var9] * var7 / 65535.0F;
                if (class67.field916) {
                    var1.method2213(-1, var12);
                    var1.method2213(-1, var10);
                    var1.method2213(-1, var11);
                    var1.method2213(-1, var2);
                    var1.method2213(-1, var3);
                } else {
                    var1.method2171(-1365938680, var12);
                    var1.method2171(-1365938680, var10);
                    var1.method2171(-1365938680, var11);
                    var1.method2171(-1365938680, var2);
                    var1.method2171(-1365938680, var3);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class67.field916) {
                    var0.method2189(-1, 0);
                    var0.method2189(-1, 0);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method2189(-1, var14++);
                        var0.method2189(-1, var13++);
                    }
                    var0.method2189(-1, 1);
                    var0.method2189(-1, 1);
                } else {
                    var0.method2159(-82, 0);
                    var0.method2159(-48, 0);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method2159(-47, var14++);
                        var0.method2159(-119, var13++);
                    }
                    var0.method2159(-94, 1);
                    var0.method2159(-118, 1);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field2707 = ByteBuffer.allocateDirect(var1.field4777);
        field2707.put(var1.field4798, 0, var1.field4777);
        field2707.flip();
        field2720 = ByteBuffer.allocateDirect(var0.field4777);
        field2720.put(var0.field4798, 0, var0.field4777);
        field2720.flip();
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()V", line = 157)
    private static final void method1365() {
        method1380();
        if (field2725 == -1 || field2711 != class180.field2413) {
            field2725 = class46.method296(class46.field566, 128, 128, field2718);
            field2711 = class180.field2413;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIILqd;)V", line = 171)
    public final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class195 arg6) {
        int var8 = this.field2723 - arg4 & 0x7FF;
        int var9 = this.field2729 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field2722) / 2 + var10;
        int var13 = (arg2 - this.field2722) / 2 + var11;
        if (var12 < arg3 && this.field2722 + var12 > 0 && var13 < arg2 && this.field2722 + var13 > 0 && this.method1369(arg6)) {
            this.field2712.method837(arg0 + var13, arg1 + var12, this.field2722, this.field2722);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)Z", line = 196)
    public final boolean method1367(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2710) {
            this.field2730 = 1073741823;
            var8 = this.field2724;
            var9 = this.field2717;
            var10 = this.field2728;
        } else {
            int var5 = this.field2724 - arg0;
            int var6 = this.field2717 - arg1;
            int var7 = this.field2728 - arg2;
            this.field2730 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2730 == 0) {
                this.field2730 = 1;
            }
            var8 = (var5 << 8) / this.field2730;
            var9 = (var6 << 8) / this.field2730;
            var10 = (var7 << 8) / this.field2730;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2722 = this.field2719 * arg3 / (this.field2710 ? 1024 : this.field2730);
        } else {
            this.field2722 = 0;
        }
        if (this.field2722 < 8) {
            this.method1381();
            this.field2712 = null;
            return false;
        }
        int var12 = class234.method1613(this.field2722, true);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2721 != var12) {
            this.field2721 = var12;
        }
        this.field2723 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field2729 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field2713 = true;
        this.field2712 = null;
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "()V", line = 251)
    public static final void method1368() {
        if (field2725 != -1) {
            class180.method1249(field2725, 0, field2711);
        }
        field2725 = -1;
        field2711 = -1;
        field2707 = null;
        field2720 = null;
        field2714 = null;
        field2718 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lqd;)Z", line = 267)
    private final boolean method1369(class195 arg0) {
        if (this.field2712 == null) {
            if (this.field2715 == 0) {
                this.field2712 = class184.field2543.method679(this.field2721, true, this.field2708, class184.field2544, 64);
            } else if (this.field2715 == 2) {
                this.method1383(arg0);
            } else if (this.field2715 == 1) {
                this.method1378(arg0);
            }
        }
        return this.field2712 != null;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "()V", line = 297)
    private final void method1370() {
        int var1 = this.field2721;
        int var2 = this.field2721;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class38.field433 - var1;
        if (var2 > class38.field428) {
            var2 -= var2 - class38.field428;
        }
        if (class38.field427 > 0) {
            int var9 = class38.field427;
            var2 -= var9;
            var7 += class38.field433 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class38.field431) {
            int var10 = var1 - class38.field431;
            var1 -= var10;
            var8 += var10;
        }
        if (class38.field434 > 0) {
            int var11 = class38.field434;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1372(class38.field429, this.field2709, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Lqd;)V", line = 346)
    private final void method1371(class195 arg0) {
        method1364();
        method1365();
        GL var2 = class67.field899;
        class102.method747(field2716);
        class102.method748();
        var2.glClearColor((float) ((this.field2709 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field2709 & 0xFF00) >> 8) / 255.0F, (float) (this.field2709 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field2710) {
                var3 = -arg0.field2724;
                var4 = -arg0.field2717;
                var5 = -arg0.field2728;
            } else {
                var3 = this.field2724 - arg0.field2724;
                var4 = this.field2717 - arg0.field2717;
                var5 = this.field2728 - arg0.field2728;
            }
        }
        class105.method777(-1.0F, 1.0F, -1.0F, 1.0F, this.field2721, this.field2721);
        if (this.field2723 != 0) {
            int var6 = class184.field2538[this.field2723];
            int var7 = class184.field2532[this.field2723];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field2729 != 0) {
            int var9 = this.field2729 - 1024 & 0x7FF;
            int var10 = class184.field2538[var9];
            int var11 = class184.field2532[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class139.method1003((float) (-var3), (float) (-var4), (float) var5);
        class139.method1004(16777215, 0.5F, 0.5F, 1.0F);
        class139.method1002();
        if (this.field2709 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class184.field2543.method668(this.field2721, (byte) -31, this.field2708);
        class67.method460(true);
        if (class67.field914) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field2707.position(0));
        var2.glVertexPointer(2, 5126, 20, field2707.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field2707.position(12));
        var2.glDrawElements(5, field2720.limit() / 2, 5123, field2720.position(0));
        var2.glEnableClientState(32886);
        class67.method460(false);
        if (this.field2709 != 0) {
            class123.method884(0, 0, -50);
            class67.method489(1);
            class67.method457(0);
            class67.method479(field2725);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field2709 >> 16), (byte) (this.field2709 >> 8), (byte) this.field2709, (byte) 127);
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
            var2.glColor4ub((byte) (this.field2709 >> 16), (byte) (this.field2709 >> 8), (byte) this.field2709, (byte) -1);
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
        class105.method773();
        class67.method479(this.field2727);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field2721, this.field2721, 0);
        class102.method740(field2716);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([IIIIIIIIIII)V", line = 472)
    private final void method1372(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field2718[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "()V", line = 507)
    private final void method1373() {
        int var1 = this.field2721 * 3 / 32;
        int var3 = this.field2721 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class38.field433 * var1 + var1;
        int var8 = class38.field433 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class38.field428) {
            var4 = var3 - (var1 + var3 - class38.field428);
        }
        if (var1 < class38.field427) {
            int var11 = class38.field427 - var1;
            var4 -= var11;
            var7 += class38.field433 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class38.field431) {
            int var12 = var1 + var3 - class38.field431;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class38.field434) {
            int var13 = class38.field434 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1376(class38.field429, 0, this.field2709, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(Lqd;)V", line = 559)
    public final void method1374(class195 arg0) {
        if (this.field2715 == 0) {
            return;
        }
        boolean var2 = this.field2727 == -1 || class180.field2413 != this.field2726;
        if (!this.field2713 && !var2) {
            return;
        }
        if (var2) {
            this.field2726 = class180.field2413;
            this.field2727 = class46.method290(class46.field560, this.field2721, this.field2721);
        } else {
            class67.method479(this.field2727);
            class46.method297(class46.field560, this.field2721, this.field2721);
        }
        if (this.field2715 == 1) {
            this.method1371(arg0);
            this.field2713 = false;
        } else if (this.field2715 == 2) {
            this.field2713 = !this.method1379(arg0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "()V", line = 598)
    public static void method1375() {
        field2707 = null;
        field2720 = null;
        field2714 = null;
        field2718 = null;
        field2716 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 606)
    private final void method1376(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field2718[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2724 = arg2;
        this.field2717 = arg3;
        this.field2728 = arg4;
        this.field2710 = arg7;
        this.field2708 = arg1;
        this.field2709 = arg6;
        this.field2719 = arg5;
        this.field2715 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "()V", line = 661)
    private static final void method1377() {
        if (field2714 != null) {
            return;
        }
        class308 var0 = field2714 = new class308(260, 480, 0);
        int[] var1 = var0.field4626;
        int[] var2 = var0.field4622;
        int[] var3 = var0.field4642;
        int[] var4 = var0.field4607;
        int[] var5 = var0.field4610;
        int[] var6 = var0.field4613;
        var0.field4634 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class184.field2538[var8] >> 1;
            int var10 = class184.field2532[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class184.field2532[var12] >> 9;
                int var14 = (class184.field2538[var12] >> 1) * var9 >> 23;
                int var15 = (class184.field2538[var12] >> 1) * var10 >> 23;
                var1[var0.field4634] = var15;
                var2[var0.field4634] = var13;
                var3[var0.field4634] = -var14;
                var0.field4634++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field4606] = 0;
                var5[var0.field4606] = var17;
                var6[var0.field4606] = var16;
                var0.field4606++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field4606] = var17;
                    var5[var0.field4606] = var19;
                    var6[var0.field4606] = var16;
                    var0.field4606++;
                    var4[var0.field4606] = var19;
                    var5[var0.field4606] = var20;
                    var6[var0.field4606] = var16;
                    var0.field4606++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field4606] = var16;
                var5[var0.field4606] = var17;
                var6[var0.field4606] = 1;
                var0.field4606++;
            }
        }
        var0.field4650 = var0.field4634;
        var0.field4641 = null;
        var0.field4646 = null;
        var0.field4620 = null;
        var0.field4648 = null;
        var0.field4608 = null;
    }

    @OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V", line = 772)
    protected final void finalize() throws Throwable {
        this.method1381();
        super.finalize();
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(Lqd;)V", line = 776)
    private final void method1378(class195 arg0) {
        method1377();
        method1380();
        this.field2712 = new class114(this.field2721, this.field2721);
        class38.method218(field2716);
        this.field2712.method1226();
        class184.method1290();
        class38.method224(0, 0, this.field2721, this.field2721, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field2710) {
                var2 = -arg0.field2724;
                var3 = -arg0.field2717;
                var4 = -arg0.field2728;
            } else {
                var2 = this.field2724 - arg0.field2724;
                var3 = this.field2717 - arg0.field2717;
                var4 = this.field2728 - arg0.field2728;
            }
        }
        if (this.field2723 != 0) {
            int var5 = class184.field2538[this.field2723];
            int var6 = class184.field2532[this.field2723];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field2729 != 0) {
            int var8 = this.field2729 - 1024 & 0x7FF;
            int var9 = class184.field2538[var8];
            int var10 = class184.field2532[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class281.method1941(field2714.field4627, 0, field2714.field4606, (short) class184.field2543.method669(this.field2708, 64));
        class50 var12 = field2714.method2117(64, 512, -var2, -var3, -var4);
        int var13 = var12.method347() - var12.method316();
        int var14 = var12.method312() - var12.method105();
        if (var13 > var14) {
            int var15 = this.field2709 == 0 ? (var13 << 9) / this.field2721 : (var13 * 16 << 9) / (this.field2721 * 13);
            var12.method341(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field2709 == 0 ? (var14 << 9) / this.field2721 : (var14 * 16 << 9) / (this.field2721 * 13);
            var12.method341(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field2709 == 0) {
            for (int var17 = 0; var17 < class38.field429.length; var17++) {
                if (class38.field429[var17] != 0) {
                    class38.field429[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1373();
            this.method1370();
        }
        class272.field4079.method1111((byte) 124);
        class38.method230(field2716);
        class184.method1290();
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(Lqd;)Z", line = 883)
    private final boolean method1379(class195 arg0) {
        class308 var2 = class308.method2089(class49.field604, this.field2708, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class67.field899;
        class102.method747(field2716);
        class102.method748();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field2710) {
                var4 = -arg0.field2724;
                var5 = -arg0.field2717;
                var6 = -arg0.field2728;
            } else {
                var4 = this.field2724 - arg0.field2724;
                var5 = this.field2717 - arg0.field2717;
                var6 = this.field2728 - arg0.field2728;
            }
        }
        var2.method2099();
        class345 var7 = var2.method2097(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method347() - var7.method316()) / 2;
        int var9 = (var7.method312() - var7.method105()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class105.method778((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field2721, this.field2721);
        if (this.field2723 != 0) {
            int var11 = class184.field2538[this.field2723];
            int var12 = class184.field2532[this.field2723];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field2729 != 0) {
            int var14 = this.field2729 - 1024 & 0x7FF;
            int var15 = class184.field2538[var14];
            int var16 = class184.field2532[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class139.method1003((float) (-var4), (float) var5, (float) (-var6));
        class139.method1004(16777215, 0.5F, 0.5F, 0.5F);
        class139.method1002();
        class67.method482();
        class67.method459(true);
        class67.method460(true);
        var7.method329(0, 0, 0, 0, -var8 - var7.method316(), -var9 - var7.method105(), 0, -1L);
        class67.method460(false);
        class67.method459(false);
        class67.method475();
        class105.method773();
        class67.method479(this.field2727);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field2721, this.field2721, 0);
        class102.method740(field2716);
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "()V", line = 974)
    private static final void method1380() {
        if (field2718 != null) {
            return;
        }
        field2718 = new byte[16384];
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
                field2718[var4 + var6] = field2718[var4 + var9] = field2718[var5 + var6] = field2718[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "()V", line = 1029)
    private final void method1381() {
        if (this.field2727 != -1) {
            class180.method1249(this.field2727, 0, this.field2726);
        }
        this.field2713 = true;
        this.field2727 = -1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIII)V", line = 1038)
    public final void method1382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field2723 - arg4 & 0x7FF;
        int var8 = this.field2729 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field2722) / 2 + var9;
        int var12 = (arg2 - this.field2722) / 2 + var10;
        if (var11 >= arg3 || this.field2722 + var11 <= 0 || var12 >= arg2 || this.field2722 + var12 <= 0) {
            return;
        }
        if (this.field2715 == 0) {
            class184.field2543.method668(this.field2721, (byte) -13, this.field2708);
        } else if (this.field2727 == -1) {
            return;
        } else {
            class67.method479(this.field2727);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field2722 + var14;
        int var16 = this.field2722 + var13;
        GL var17 = class67.field899;
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

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(Lqd;)V", line = 1091)
    private final void method1383(class195 arg0) {
        class308 var2 = class308.method2089(class49.field604, this.field2708, 0);
        if (var2 == null) {
            return;
        }
        this.field2712 = new class178(this.field2721, this.field2721);
        class38.method218(field2716);
        this.field2712.method1226();
        class184.method1290();
        class38.method224(0, 0, this.field2721, this.field2721, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field2710) {
                var3 = -arg0.field2724;
                var4 = -arg0.field2717;
                var5 = -arg0.field2728;
            } else {
                var3 = this.field2724 - arg0.field2724;
                var4 = this.field2717 - arg0.field2717;
                var5 = this.field2728 - arg0.field2728;
            }
        }
        if (this.field2723 != 0) {
            int var6 = class184.field2538[this.field2723];
            int var7 = class184.field2532[this.field2723];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field2729 != 0) {
            int var9 = this.field2729 - 1024 & 0x7FF;
            int var10 = class184.field2538[var9];
            int var11 = class184.field2532[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class50 var13 = var2.method2117(64, 768, -var3, -var4, -var5);
        int var14 = var13.method347() - var13.method316();
        int var15 = var13.method312() - var13.method105();
        int var16 = var13.method316() + var14 / 2;
        int var17 = var13.method105() + var15 / 2;
        if (var14 > var15) {
            var13.method341(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field2721);
        } else {
            var13.method341(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field2721);
        }
        class272.field4079.method1111((byte) 120);
        class38.method230(field2716);
        class184.method1290();
    }
}
