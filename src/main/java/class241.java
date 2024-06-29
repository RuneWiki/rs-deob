import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class241 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Z")
    private boolean field3618 = true;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    private int field3636 = -1;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    private int field3638 = -1;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    private int field3621;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    private int field3634;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    private int field3624;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Z")
    private boolean field3623;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    private int field3640;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    private int field3619;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    private int field3622;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    private int field3633;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "[I")
    private static int[] field3631 = new int[4];

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    private static int field3625 = -1;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    private static int field3626 = -1;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    private int field3620;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    private int field3627;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public int field3629;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    private int field3630;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    private int field3635;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Laf;")
    private class189 field3632;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lpn;")
    private static class207 field3628;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3617;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3639;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "[B")
    private static byte[] field3637;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIILjf;)V", line = 12)
    public final void method1725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class241 arg6) {
        int var8 = this.field3620 - arg4 & 0x7FF;
        int var9 = this.field3630 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field3627) / 2 + var10;
        int var13 = (arg2 - this.field3627) / 2 + var11;
        if (var12 < arg3 && this.field3627 + var12 > 0 && var13 < arg2 && this.field3627 + var13 > 0 && this.method1734(arg6)) {
            this.field3632.method539(arg0 + var13, arg1 + var12, this.field3627, this.field3627);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V", line = 34)
    private static final void method1726() {
        if (field3628 != null) {
            return;
        }
        class207 var0 = field3628 = new class207(260, 480, 0);
        int[] var1 = var0.field2941;
        int[] var2 = var0.field2935;
        int[] var3 = var0.field2914;
        int[] var4 = var0.field2943;
        int[] var5 = var0.field2920;
        int[] var6 = var0.field2927;
        var0.field2929 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class215.field3024[var8] >> 1;
            int var10 = class215.field3017[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class215.field3017[var12] >> 9;
                int var14 = (class215.field3024[var12] >> 1) * var9 >> 23;
                int var15 = (class215.field3024[var12] >> 1) * var10 >> 23;
                var1[var0.field2929] = var15;
                var2[var0.field2929] = var13;
                var3[var0.field2929] = -var14;
                var0.field2929++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field2938] = 0;
                var5[var0.field2938] = var17;
                var6[var0.field2938] = var16;
                var0.field2938++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field2938] = var17;
                    var5[var0.field2938] = var19;
                    var6[var0.field2938] = var16;
                    var0.field2938++;
                    var4[var0.field2938] = var19;
                    var5[var0.field2938] = var20;
                    var6[var0.field2938] = var16;
                    var0.field2938++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field2938] = var16;
                var5[var0.field2938] = var17;
                var6[var0.field2938] = 1;
                var0.field2938++;
            }
        }
        var0.field2944 = var0.field2929;
        var0.field2913 = null;
        var0.field2924 = null;
        var0.field2930 = null;
        var0.field2895 = null;
        var0.field2904 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()V", line = 146)
    private final void method1727() {
        int var1 = this.field3635 * 3 / 32;
        int var3 = this.field3635 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class144.field2009 * var1 + var1;
        int var8 = class144.field2009 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class144.field2008) {
            var4 = var3 - (var1 + var3 - class144.field2008);
        }
        if (var1 < class144.field2007) {
            int var11 = class144.field2007 - var1;
            var4 -= var11;
            var7 += class144.field2009 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class144.field2010) {
            int var12 = var1 + var3 - class144.field2010;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class144.field2006) {
            int var13 = class144.field2006 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1732(class144.field2005, 0, this.field3619, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()V", line = 199)
    private final void method1728() {
        int var1 = this.field3635;
        int var2 = this.field3635;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class144.field2009 - var1;
        if (var2 > class144.field2008) {
            var2 -= var2 - class144.field2008;
        }
        if (class144.field2007 > 0) {
            int var9 = class144.field2007;
            var2 -= var9;
            var7 += class144.field2009 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class144.field2010) {
            int var10 = var1 - class144.field2010;
            var1 -= var10;
            var8 += var10;
        }
        if (class144.field2006 > 0) {
            int var11 = class144.field2006;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1729(class144.field2005, this.field3619, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3621 = arg2;
        this.field3634 = arg3;
        this.field3624 = arg4;
        this.field3623 = arg7;
        this.field3640 = arg1;
        this.field3619 = arg6;
        this.field3622 = arg5;
        this.field3633 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([IIIIIIIIIII)V", line = 258)
    private final void method1729(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field3637[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)V", line = 294)
    public final void method1730(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field3620 - arg4 & 0x7FF;
        int var8 = this.field3630 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field3627) / 2 + var9;
        int var12 = (arg2 - this.field3627) / 2 + var10;
        if (var11 >= arg3 || this.field3627 + var11 <= 0 || var12 >= arg2 || this.field3627 + var12 <= 0) {
            return;
        }
        if (this.field3633 == 0) {
            class215.field3020.method368((byte) -6, this.field3635, this.field3640);
        } else if (this.field3636 == -1) {
            return;
        } else {
            class250.method1806(this.field3636);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field3627 + var14;
        int var16 = this.field3627 + var13;
        GL var17 = class250.field3818;
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

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljf;)V", line = 343)
    private final void method1731(class241 arg0) {
        method1736();
        method1744();
        GL var2 = class250.field3818;
        class306.method2147(field3631);
        class306.method2143();
        var2.glClearColor((float) ((this.field3619 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field3619 & 0xFF00) >> 8) / 255.0F, (float) (this.field3619 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3623) {
                var3 = -arg0.field3621;
                var4 = -arg0.field3634;
                var5 = -arg0.field3624;
            } else {
                var3 = this.field3621 - arg0.field3621;
                var4 = this.field3634 - arg0.field3634;
                var5 = this.field3624 - arg0.field3624;
            }
        }
        class297.method2106(-1.0F, 1.0F, -1.0F, 1.0F, this.field3635, this.field3635);
        if (this.field3620 != 0) {
            int var6 = class215.field3024[this.field3620];
            int var7 = class215.field3017[this.field3620];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3630 != 0) {
            int var9 = this.field3630 - 1024 & 0x7FF;
            int var10 = class215.field3024[var9];
            int var11 = class215.field3017[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class64.method403((float) (-var3), (float) (-var4), (float) var5);
        class64.method399(16777215, 0.5F, 0.5F, 1.0F);
        class64.method397();
        if (this.field3619 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class215.field3020.method368((byte) -6, this.field3635, this.field3640);
        class250.method1819(true);
        if (class250.field3809) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field3639.position(0));
        var2.glVertexPointer(2, 5126, 20, field3639.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field3639.position(12));
        var2.glDrawElements(5, field3617.limit() / 2, 5123, field3617.position(0));
        var2.glEnableClientState(32886);
        class250.method1819(false);
        if (this.field3619 != 0) {
            class262.method1886(0, 3, 0);
            class250.method1797(1);
            class250.method1812(0);
            class250.method1806(field3625);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field3619 >> 16), (byte) (this.field3619 >> 8), (byte) this.field3619, (byte) 127);
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
            var2.glColor4ub((byte) (this.field3619 >> 16), (byte) (this.field3619 >> 8), (byte) this.field3619, (byte) -1);
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
        class297.method2096();
        class250.method1806(this.field3636);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3635, this.field3635, 0);
        class306.method2142(field3631);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 471)
    private final void method1732(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field3637[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()V", line = 511)
    public static void method1733() {
        field3639 = null;
        field3617 = null;
        field3628 = null;
        field3637 = null;
        field3631 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Ljf;)Z", line = 521)
    private final boolean method1734(class241 arg0) {
        if (this.field3632 == null) {
            if (this.field3633 == 0) {
                this.field3632 = class215.field3020.method385(true, (byte) -125, this.field3635, this.field3640, class215.field3008);
            } else if (this.field3633 == 2) {
                this.method1738(arg0);
            } else if (this.field3633 == 1) {
                this.method1735(arg0);
            }
        }
        return this.field3632 != null;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(Ljf;)V", line = 555)
    private final void method1735(class241 arg0) {
        method1726();
        method1739();
        this.field3632 = new class317(this.field3635, this.field3635);
        class144.method959(field3631);
        this.field3632.method1306();
        class215.method1485();
        class144.method977(0, 0, this.field3635, this.field3635, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field3623) {
                var2 = -arg0.field3621;
                var3 = -arg0.field3634;
                var4 = -arg0.field3624;
            } else {
                var2 = this.field3621 - arg0.field3621;
                var3 = this.field3634 - arg0.field3634;
                var4 = this.field3624 - arg0.field3624;
            }
        }
        if (this.field3620 != 0) {
            int var5 = class215.field3024[this.field3620];
            int var6 = class215.field3017[this.field3620];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field3630 != 0) {
            int var8 = this.field3630 - 1024 & 0x7FF;
            int var9 = class215.field3024[var8];
            int var10 = class215.field3017[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class86.method512(field3628.field2896, 0, field3628.field2938, (short) class215.field3020.method375(this.field3640, 4964));
        class333 var12 = field3628.method1423(64, 512, -var2, -var3, -var4);
        int var13 = var12.method721() - var12.method728();
        int var14 = var12.method699() - var12.method11();
        if (var13 > var14) {
            int var15 = this.field3619 == 0 ? (var13 << 9) / this.field3635 : (var13 * 16 << 9) / (this.field3635 * 13);
            var12.method2293(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field3619 == 0 ? (var14 << 9) / this.field3635 : (var14 * 16 << 9) / (this.field3635 * 13);
            var12.method2293(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field3619 == 0) {
            for (int var17 = 0; var17 < class144.field2005.length; var17++) {
                if (class144.field2005[var17] != 0) {
                    class144.field2005[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1727();
            this.method1728();
        }
        class72.field916.method904((byte) -28);
        class144.method968(field3631);
        class215.method1485();
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "()V", line = 656)
    private static final void method1736() {
        if (field3639 != null) {
            return;
        }
        class107 var0 = new class107(1088);
        class107 var1 = new class107(5140);
        if (class250.field3825) {
            var1.method673(32166, 0.0F);
            var1.method673(32166, 1.0F);
            var1.method673(32166, 0.0F);
            var1.method673(32166, 0.5F);
            var1.method673(32166, 1.0F);
            var1.method673(32166, 0.0F);
            var1.method673(32166, -1.0F);
            var1.method673(32166, 0.0F);
            var1.method673(32166, 0.5F);
            var1.method673(32166, 0.0F);
        } else {
            var1.method682(-106, 0.0F);
            var1.method682(76, 1.0F);
            var1.method682(-116, 0.0F);
            var1.method682(108, 0.5F);
            var1.method682(118, 1.0F);
            var1.method682(94, 0.0F);
            var1.method682(-95, -1.0F);
            var1.method682(115, 0.0F);
            var1.method682(-83, 0.5F);
            var1.method682(-122, 0.0F);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class215.field3024[var5] / 65535.0F;
            float var7 = (float) class215.field3017[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class215.field3017[var9] / 65535.0F;
                float var11 = (float) class215.field3024[var9] * var6 / 65535.0F;
                float var12 = (float) class215.field3024[var9] * var7 / 65535.0F;
                if (class250.field3825) {
                    var1.method673(32166, var12);
                    var1.method673(32166, var10);
                    var1.method673(32166, var11);
                    var1.method673(32166, var2);
                    var1.method673(32166, var3);
                } else {
                    var1.method682(-108, var12);
                    var1.method682(-116, var10);
                    var1.method682(-94, var11);
                    var1.method682(112, var2);
                    var1.method682(-121, var3);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class250.field3825) {
                    var0.method662(true, 0);
                    var0.method662(true, 0);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method662(true, var14++);
                        var0.method662(true, var13++);
                    }
                    var0.method662(true, 1);
                    var0.method662(true, 1);
                } else {
                    var0.method623(95, 0);
                    var0.method623(99, 0);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method623(13, var14++);
                        var0.method623(71, var13++);
                    }
                    var0.method623(35, 1);
                    var0.method623(20, 1);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field3639 = ByteBuffer.allocateDirect(var1.field1400);
        field3639.put(var1.field1388, 0, var1.field1400);
        field3639.flip();
        field3617 = ByteBuffer.allocateDirect(var0.field1400);
        field3617.put(var0.field1388, 0, var0.field1400);
        field3617.flip();
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)Z", line = 810)
    public final boolean method1737(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3623) {
            this.field3629 = 1073741823;
            var8 = this.field3621;
            var9 = this.field3634;
            var10 = this.field3624;
        } else {
            int var5 = this.field3621 - arg0;
            int var6 = this.field3634 - arg1;
            int var7 = this.field3624 - arg2;
            this.field3629 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3629 == 0) {
                this.field3629 = 1;
            }
            var8 = (var5 << 8) / this.field3629;
            var9 = (var6 << 8) / this.field3629;
            var10 = (var7 << 8) / this.field3629;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3627 = this.field3622 * arg3 / (this.field3623 ? 1024 : this.field3629);
        } else {
            this.field3627 = 0;
        }
        if (this.field3627 < 8) {
            this.method1740();
            this.field3632 = null;
            return false;
        }
        int var12 = class80.method475(1397417249, this.field3627);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3635 != var12) {
            this.field3635 = var12;
        }
        this.field3620 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field3630 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field3618 = true;
        this.field3632 = null;
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(Ljf;)V", line = 872)
    private final void method1738(class241 arg0) {
        class207 var2 = class207.method1414(class344.field5338, this.field3640, 0);
        if (var2 == null) {
            return;
        }
        this.field3632 = new class189(this.field3635, this.field3635);
        class144.method959(field3631);
        this.field3632.method1306();
        class215.method1485();
        class144.method977(0, 0, this.field3635, this.field3635, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3623) {
                var3 = -arg0.field3621;
                var4 = -arg0.field3634;
                var5 = -arg0.field3624;
            } else {
                var3 = this.field3621 - arg0.field3621;
                var4 = this.field3634 - arg0.field3634;
                var5 = this.field3624 - arg0.field3624;
            }
        }
        if (this.field3620 != 0) {
            int var6 = class215.field3024[this.field3620];
            int var7 = class215.field3017[this.field3620];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3630 != 0) {
            int var9 = this.field3630 - 1024 & 0x7FF;
            int var10 = class215.field3024[var9];
            int var11 = class215.field3017[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class333 var13 = var2.method1423(64, 768, -var3, -var4, -var5);
        int var14 = var13.method721() - var13.method728();
        int var15 = var13.method699() - var13.method11();
        int var16 = var13.method728() + var14 / 2;
        int var17 = var13.method11() + var15 / 2;
        if (var14 > var15) {
            var13.method2293(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field3635);
        } else {
            var13.method2293(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field3635);
        }
        class72.field916.method904((byte) -28);
        class144.method968(field3631);
        class215.method1485();
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "()V", line = 955)
    private static final void method1739() {
        if (field3637 != null) {
            return;
        }
        field3637 = new byte[16384];
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
                field3637[var4 + var6] = field3637[var4 + var9] = field3637[var5 + var6] = field3637[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "()V", line = 1007)
    private final void method1740() {
        if (this.field3636 != -1) {
            class266.method1927(this.field3636, 0, this.field3638);
        }
        this.field3618 = true;
        this.field3636 = -1;
    }

    @OriginalMember(owner = "client!jf", name = "finalize", descriptor = "()V", line = 1020)
    protected final void finalize() throws Throwable {
        this.method1740();
        super.finalize();
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(Ljf;)V", line = 1029)
    public final void method1741(class241 arg0) {
        if (this.field3633 == 0) {
            return;
        }
        boolean var2 = this.field3636 == -1 || class266.field4192 != this.field3638;
        if (!this.field3618 && !var2) {
            return;
        }
        if (var2) {
            this.field3638 = class266.field4192;
            this.field3636 = class209.method1435(class209.field2961, this.field3635, this.field3635);
        } else {
            class250.method1806(this.field3636);
            class209.method1440(class209.field2961, this.field3635, this.field3635);
        }
        if (this.field3633 == 1) {
            this.method1731(arg0);
            this.field3618 = false;
        } else if (this.field3633 == 2) {
            this.field3618 = !this.method1743(arg0);
        }
    }

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "()V", line = 1067)
    public static final void method1742() {
        if (field3625 != -1) {
            class266.method1927(field3625, 0, field3626);
        }
        field3625 = -1;
        field3626 = -1;
        field3639 = null;
        field3617 = null;
        field3628 = null;
        field3637 = null;
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(Ljf;)Z", line = 1079)
    private final boolean method1743(class241 arg0) {
        class207 var2 = class207.method1414(class344.field5338, this.field3640, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class250.field3818;
        class306.method2147(field3631);
        class306.method2143();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field3623) {
                var4 = -arg0.field3621;
                var5 = -arg0.field3634;
                var6 = -arg0.field3624;
            } else {
                var4 = this.field3621 - arg0.field3621;
                var5 = this.field3634 - arg0.field3634;
                var6 = this.field3624 - arg0.field3624;
            }
        }
        var2.method1400();
        class201 var7 = var2.method1407(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method721() - var7.method728()) / 2;
        int var9 = (var7.method699() - var7.method11()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class297.method2103((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field3635, this.field3635);
        if (this.field3620 != 0) {
            int var11 = class215.field3024[this.field3620];
            int var12 = class215.field3017[this.field3620];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field3630 != 0) {
            int var14 = this.field3630 - 1024 & 0x7FF;
            int var15 = class215.field3024[var14];
            int var16 = class215.field3017[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class64.method403((float) (-var4), (float) var5, (float) (-var6));
        class64.method399(16777215, 0.5F, 0.5F, 0.5F);
        class64.method397();
        class250.method1791();
        class250.method1794(true);
        class250.method1819(true);
        var7.method687(0, 0, 0, 0, -var8 - var7.method728(), -var9 - var7.method11(), 0, -1L);
        class250.method1819(false);
        class250.method1794(false);
        class250.method1827();
        class297.method2096();
        class250.method1806(this.field3636);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3635, this.field3635, 0);
        class306.method2142(field3631);
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "()V", line = 1166)
    private static final void method1744() {
        method1739();
        if (field3625 == -1 || class266.field4192 != field3626) {
            field3625 = class209.method1434(class209.field2967, 128, 128, field3637);
            field3626 = class266.field4192;
        }
    }
}
