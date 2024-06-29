import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class134 {

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Z")
    private boolean field2042 = true;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    private int field2053 = -1;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    private int field2048 = -1;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    private int field2056;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    private int field2047;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    private int field2041;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Z")
    private boolean field2058;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    private int field2045;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    private int field2036;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    private int field2046;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    private static int field2038 = -1;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "[I")
    private static int[] field2044 = new int[4];

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    private static int field2055 = -1;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    private int field2039;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public int field2049;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    private int field2050;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    private int field2052;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    private int field2057;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lnb;")
    private static class135 field2054;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Lle;")
    private class137 field2040;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2037;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2043;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[B")
    private static byte[] field2059;

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        this.method870();
        super.finalize();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V", line = 10)
    private final void method869() {
        int var1 = this.field2052 * 3 / 32;
        int var3 = this.field2052 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class317.field5231 * var1 + var1;
        int var8 = class317.field5231 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class317.field5232) {
            var4 = var3 - (var1 + var3 - class317.field5232);
        }
        if (var1 < class317.field5235) {
            int var11 = class317.field5235 - var1;
            var4 -= var11;
            var7 += class317.field5231 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class317.field5229) {
            int var12 = var1 + var3 - class317.field5229;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class317.field5234) {
            int var13 = class317.field5234 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method879(class317.field5228, 0, this.field2045, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()V", line = 68)
    private final void method870() {
        if (this.field2053 != -1) {
            class173.method1198(this.field2053, 0, this.field2048);
        }
        this.field2042 = true;
        this.field2053 = -1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lw;)V", line = 75)
    private final void method871(class134 arg0) {
        method885();
        method886();
        GL var2 = class245.field3884;
        class335.method2372(field2044);
        class335.method2379();
        var2.glClearColor((float) ((this.field2045 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field2045 & 0xFF00) >> 8) / 255.0F, (float) (this.field2045 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field2058) {
                var3 = -arg0.field2056;
                var4 = -arg0.field2047;
                var5 = -arg0.field2041;
            } else {
                var3 = this.field2056 - arg0.field2056;
                var4 = this.field2047 - arg0.field2047;
                var5 = this.field2041 - arg0.field2041;
            }
        }
        class93.method612(-1.0F, 1.0F, -1.0F, 1.0F, this.field2052, this.field2052);
        if (this.field2039 != 0) {
            int var6 = class272.field4470[this.field2039];
            int var7 = class272.field4480[this.field2039];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field2050 != 0) {
            int var9 = this.field2050 - 1024 & 0x7FF;
            int var10 = class272.field4470[var9];
            int var11 = class272.field4480[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class234.method1617((float) (-var3), (float) (-var4), (float) var5);
        class234.method1620(16777215, 0.5F, 0.5F, 1.0F);
        class234.method1621();
        if (this.field2045 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class272.field4467.method414(this.field2051, this.field2052, true);
        class245.method1740(true);
        if (class245.field3869) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field2037.position(0));
        var2.glVertexPointer(2, 5126, 20, field2037.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field2037.position(12));
        var2.glDrawElements(5, field2043.limit() / 2, 5123, field2043.position(0));
        var2.glEnableClientState(32886);
        class245.method1740(false);
        if (this.field2045 != 0) {
            class7.method53(0, 0, true);
            class245.method1721(1);
            class245.method1709(0);
            class245.method1729(field2055);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field2045 >> 16), (byte) (this.field2045 >> 8), (byte) this.field2045, (byte) 127);
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
            var2.glColor4ub((byte) (this.field2045 >> 16), (byte) (this.field2045 >> 8), (byte) this.field2045, (byte) -1);
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
        class93.method619();
        class245.method1729(this.field2053);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field2052, this.field2052, 0);
        class335.method2367(field2044);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()V", line = 200)
    private static final void method872() {
        if (field2054 != null) {
            return;
        }
        class135 var0 = field2054 = new class135(260, 480, 0);
        int[] var1 = var0.field2118;
        int[] var2 = var0.field2131;
        int[] var3 = var0.field2111;
        int[] var4 = var0.field2102;
        int[] var5 = var0.field2123;
        int[] var6 = var0.field2098;
        var0.field2116 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class272.field4470[var8] >> 1;
            int var10 = class272.field4480[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class272.field4480[var12] >> 9;
                int var14 = (class272.field4470[var12] >> 1) * var9 >> 23;
                int var15 = (class272.field4470[var12] >> 1) * var10 >> 23;
                var1[var0.field2116] = var15;
                var2[var0.field2116] = var13;
                var3[var0.field2116] = -var14;
                var0.field2116++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field2122] = 0;
                var5[var0.field2122] = var17;
                var6[var0.field2122] = var16;
                var0.field2122++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field2122] = var17;
                    var5[var0.field2122] = var19;
                    var6[var0.field2122] = var16;
                    var0.field2122++;
                    var4[var0.field2122] = var19;
                    var5[var0.field2122] = var20;
                    var6[var0.field2122] = var16;
                    var0.field2122++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field2122] = var16;
                var5[var0.field2122] = var17;
                var6[var0.field2122] = 1;
                var0.field2122++;
            }
        }
        var0.field2112 = var0.field2116;
        var0.field2132 = null;
        var0.field2085 = null;
        var0.field2097 = null;
        var0.field2129 = null;
        var0.field2114 = null;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()V", line = 313)
    private final void method873() {
        int var1 = this.field2052;
        int var2 = this.field2052;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class317.field5231 - var1;
        if (var2 > class317.field5232) {
            var2 -= var2 - class317.field5232;
        }
        if (class317.field5235 > 0) {
            int var9 = class317.field5235;
            var2 -= var9;
            var7 += class317.field5231 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class317.field5229) {
            int var10 = var1 - class317.field5229;
            var1 -= var10;
            var8 += var10;
        }
        if (class317.field5234 > 0) {
            int var11 = class317.field5234;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method887(class317.field5228, this.field2045, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILw;)V", line = 362)
    public final void method874(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6) {
        int var8 = this.field2039 - arg4 & 0x7FF;
        int var9 = this.field2050 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field2057) / 2 + var10;
        int var13 = (arg2 - this.field2057) / 2 + var11;
        if (var12 < arg3 && this.field2057 + var12 > 0 && var13 < arg2 && this.field2057 + var13 > 0 && this.method877(arg6)) {
            this.field2040.method959(arg0 + var13, arg1 + var12, this.field2057, this.field2057);
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()V", line = 384)
    private static final void method875() {
        if (field2059 != null) {
            return;
        }
        field2059 = new byte[16384];
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
                field2059[var4 + var6] = field2059[var4 + var9] = field2059[var5 + var6] = field2059[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "()V", line = 436)
    public static final void method876() {
        if (field2055 != -1) {
            class173.method1198(field2055, 0, field2038);
        }
        field2055 = -1;
        field2038 = -1;
        field2037 = null;
        field2043 = null;
        field2054 = null;
        field2059 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Lw;)Z", line = 451)
    private final boolean method877(class134 arg0) {
        if (this.field2040 == null) {
            if (this.field2046 == 0) {
                this.field2040 = class272.field4467.method409(this.field2052, this.field2051, class272.field4472, (byte) -98, true);
            } else if (this.field2046 == 2) {
                this.method888(arg0);
            } else if (this.field2046 == 1) {
                this.method878(arg0);
            }
        }
        return this.field2040 != null;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Lw;)V", line = 482)
    private final void method878(class134 arg0) {
        method872();
        method875();
        this.field2040 = new class362(this.field2052, this.field2052);
        class317.method2269(field2044);
        this.field2040.method958();
        class272.method1915();
        class317.method2282(0, 0, this.field2052, this.field2052, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field2058) {
                var2 = -arg0.field2056;
                var3 = -arg0.field2047;
                var4 = -arg0.field2041;
            } else {
                var2 = this.field2056 - arg0.field2056;
                var3 = this.field2047 - arg0.field2047;
                var4 = this.field2041 - arg0.field2041;
            }
        }
        if (this.field2039 != 0) {
            int var5 = class272.field4470[this.field2039];
            int var6 = class272.field4480[this.field2039];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field2050 != 0) {
            int var8 = this.field2050 - 1024 & 0x7FF;
            int var9 = class272.field4470[var8];
            int var10 = class272.field4480[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class298.method2105(field2054.field2088, 0, field2054.field2122, (short) class272.field4467.method405(this.field2051, -8237));
        class67 var12 = field2054.method915(64, 512, -var2, -var3, -var4);
        int var13 = var12.method186() - var12.method174();
        int var14 = var12.method196() - var12.method192();
        if (var13 > var14) {
            int var15 = this.field2045 == 0 ? (var13 << 9) / this.field2052 : (var13 * 16 << 9) / (this.field2052 * 13);
            var12.method464(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field2045 == 0 ? (var14 << 9) / this.field2052 : (var14 * 16 << 9) / (this.field2052 * 13);
            var12.method464(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field2045 == 0) {
            for (int var17 = 0; var17 < class317.field5228.length; var17++) {
                if (class317.field5228[var17] != 0) {
                    class317.field5228[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method869();
            this.method873();
        }
        class92.field1331.method1169(0);
        class317.method2289(field2044);
        class272.method1915();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 588)
    private final void method879(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field2059[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!w", name = "g", descriptor = "()V", line = 628)
    public static void method880() {
        field2037 = null;
        field2043 = null;
        field2054 = null;
        field2059 = null;
        field2044 = null;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(Lw;)V", line = 635)
    public final void method881(class134 arg0) {
        if (this.field2046 == 0) {
            return;
        }
        boolean var2 = this.field2053 == -1 || class173.field2703 != this.field2048;
        if (!this.field2042 && !var2) {
            return;
        }
        if (var2) {
            this.field2048 = class173.field2703;
            this.field2053 = class200.method1368(class200.field3071, this.field2052, this.field2052);
        } else {
            class245.method1729(this.field2053);
            class200.method1365(class200.field3071, this.field2052, this.field2052);
        }
        if (this.field2046 == 1) {
            this.method871(arg0);
            this.field2042 = false;
        } else if (this.field2046 == 2) {
            this.field2042 = !this.method883(arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2056 = arg2;
        this.field2047 = arg3;
        this.field2041 = arg4;
        this.field2058 = arg7;
        this.field2051 = arg1;
        this.field2045 = arg6;
        this.field2036 = arg5;
        this.field2046 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)Z", line = 694)
    public final boolean method882(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2058) {
            this.field2049 = 1073741823;
            var8 = this.field2056;
            var9 = this.field2047;
            var10 = this.field2041;
        } else {
            int var5 = this.field2056 - arg0;
            int var6 = this.field2047 - arg1;
            int var7 = this.field2041 - arg2;
            this.field2049 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2049 == 0) {
                this.field2049 = 1;
            }
            var8 = (var5 << 8) / this.field2049;
            var9 = (var6 << 8) / this.field2049;
            var10 = (var7 << 8) / this.field2049;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2057 = this.field2036 * arg3 / (this.field2058 ? 1024 : this.field2049);
        } else {
            this.field2057 = 0;
        }
        if (this.field2057 < 8) {
            this.method870();
            this.field2040 = null;
            return false;
        }
        int var12 = class278.method1978(128, this.field2057);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2052 != var12) {
            this.field2052 = var12;
        }
        this.field2039 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field2050 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field2042 = true;
        this.field2040 = null;
        return true;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(Lw;)Z", line = 750)
    private final boolean method883(class134 arg0) {
        class135 var2 = class135.method925(class174.field2712, this.field2051, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class245.field3884;
        class335.method2372(field2044);
        class335.method2379();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field2058) {
                var4 = -arg0.field2056;
                var5 = -arg0.field2047;
                var6 = -arg0.field2041;
            } else {
                var4 = this.field2056 - arg0.field2056;
                var5 = this.field2047 - arg0.field2047;
                var6 = this.field2041 - arg0.field2041;
            }
        }
        var2.method932();
        class128 var7 = var2.method906(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method186() - var7.method174()) / 2;
        int var9 = (var7.method196() - var7.method192()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class93.method621((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field2052, this.field2052);
        if (this.field2039 != 0) {
            int var11 = class272.field4470[this.field2039];
            int var12 = class272.field4480[this.field2039];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field2050 != 0) {
            int var14 = this.field2050 - 1024 & 0x7FF;
            int var15 = class272.field4470[var14];
            int var16 = class272.field4480[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class234.method1617((float) (-var4), (float) var5, (float) (-var6));
        class234.method1620(16777215, 0.5F, 0.5F, 0.5F);
        class234.method1621();
        class245.method1724();
        class245.method1742(true);
        class245.method1740(true);
        var7.method182(0, 0, 0, 0, -var8 - var7.method174(), -var9 - var7.method192(), 0, -1L);
        class245.method1740(false);
        class245.method1742(false);
        class245.method1713();
        class93.method619();
        class245.method1729(this.field2053);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field2052, this.field2052, 0);
        class335.method2367(field2044);
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V", line = 837)
    public final void method884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field2039 - arg4 & 0x7FF;
        int var8 = this.field2050 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field2057) / 2 + var9;
        int var12 = (arg2 - this.field2057) / 2 + var10;
        if (var11 >= arg3 || this.field2057 + var11 <= 0 || var12 >= arg2 || this.field2057 + var12 <= 0) {
            return;
        }
        if (this.field2046 == 0) {
            class272.field4467.method414(this.field2051, this.field2052, true);
        } else if (this.field2053 == -1) {
            return;
        } else {
            class245.method1729(this.field2053);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field2057 + var14;
        int var16 = this.field2057 + var13;
        GL var17 = class245.field3884;
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

    @OriginalMember(owner = "client!w", name = "h", descriptor = "()V", line = 886)
    private static final void method885() {
        if (field2037 != null) {
            return;
        }
        class313 var0 = new class313(1088);
        class313 var1 = new class313(5140);
        if (class245.field3895) {
            var1.method2252(0.0F, false);
            var1.method2252(1.0F, false);
            var1.method2252(0.0F, false);
            var1.method2252(0.5F, false);
            var1.method2252(1.0F, false);
            var1.method2252(0.0F, false);
            var1.method2252(-1.0F, false);
            var1.method2252(0.0F, false);
            var1.method2252(0.5F, false);
            var1.method2252(0.0F, false);
        } else {
            var1.method2219(0.0F, (byte) -127);
            var1.method2219(1.0F, (byte) -127);
            var1.method2219(0.0F, (byte) -126);
            var1.method2219(0.5F, (byte) -127);
            var1.method2219(1.0F, (byte) -127);
            var1.method2219(0.0F, (byte) -128);
            var1.method2219(-1.0F, (byte) -128);
            var1.method2219(0.0F, (byte) -127);
            var1.method2219(0.5F, (byte) -128);
            var1.method2219(0.0F, (byte) -125);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class272.field4470[var5] / 65535.0F;
            float var7 = (float) class272.field4480[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class272.field4480[var9] / 65535.0F;
                float var11 = (float) class272.field4470[var9] * var6 / 65535.0F;
                float var12 = (float) class272.field4470[var9] * var7 / 65535.0F;
                if (class245.field3895) {
                    var1.method2252(var12, false);
                    var1.method2252(var10, false);
                    var1.method2252(var11, false);
                    var1.method2252(var2, false);
                    var1.method2252(var3, false);
                } else {
                    var1.method2219(var12, (byte) -125);
                    var1.method2219(var10, (byte) -126);
                    var1.method2219(var11, (byte) -128);
                    var1.method2219(var2, (byte) -127);
                    var1.method2219(var3, (byte) -126);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class245.field3895) {
                    var0.method2206(0, (byte) -52);
                    var0.method2206(0, (byte) -115);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method2206(var14++, (byte) -113);
                        var0.method2206(var13++, (byte) -114);
                    }
                    var0.method2206(1, (byte) -121);
                    var0.method2206(1, (byte) -116);
                } else {
                    var0.method2194(30298, 0);
                    var0.method2194(30298, 0);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method2194(30298, var14++);
                        var0.method2194(30298, var13++);
                    }
                    var0.method2194(30298, 1);
                    var0.method2194(30298, 1);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field2037 = ByteBuffer.allocateDirect(var1.field5137);
        field2037.put(var1.field5124, 0, var1.field5137);
        field2037.flip();
        field2043 = ByteBuffer.allocateDirect(var0.field5137);
        field2043.put(var0.field5124, 0, var0.field5137);
        field2043.flip();
    }

    @OriginalMember(owner = "client!w", name = "i", descriptor = "()V", line = 1046)
    private static final void method886() {
        method875();
        if (field2055 == -1 || class173.field2703 != field2038) {
            field2055 = class200.method1363(class200.field3077, 128, 128, field2059);
            field2038 = class173.field2703;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIIIIIIIII)V", line = 1059)
    private final void method887(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field2059[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(Lw;)V", line = 1093)
    private final void method888(class134 arg0) {
        class135 var2 = class135.method925(class174.field2712, this.field2051, 0);
        if (var2 == null) {
            return;
        }
        this.field2040 = new class137(this.field2052, this.field2052);
        class317.method2269(field2044);
        this.field2040.method958();
        class272.method1915();
        class317.method2282(0, 0, this.field2052, this.field2052, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field2058) {
                var3 = -arg0.field2056;
                var4 = -arg0.field2047;
                var5 = -arg0.field2041;
            } else {
                var3 = this.field2056 - arg0.field2056;
                var4 = this.field2047 - arg0.field2047;
                var5 = this.field2041 - arg0.field2041;
            }
        }
        if (this.field2039 != 0) {
            int var6 = class272.field4470[this.field2039];
            int var7 = class272.field4480[this.field2039];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field2050 != 0) {
            int var9 = this.field2050 - 1024 & 0x7FF;
            int var10 = class272.field4470[var9];
            int var11 = class272.field4480[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class67 var13 = var2.method915(64, 768, -var3, -var4, -var5);
        int var14 = var13.method186() - var13.method174();
        int var15 = var13.method196() - var13.method192();
        int var16 = var13.method174() + var14 / 2;
        int var17 = var13.method192() + var15 / 2;
        if (var14 > var15) {
            var13.method464(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field2052);
        } else {
            var13.method464(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field2052);
        }
        class92.field1331.method1169(0);
        class317.method2289(field2044);
        class272.method1915();
    }
}
