import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class302 {

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    private int field4813 = -1;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Z")
    private boolean field4808 = true;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    private int field4806 = -1;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    private int field4805;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    private int field4822;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    private int field4809;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Z")
    private boolean field4814;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    private int field4824;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    private int field4817;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    private int field4827;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    private int field4823;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    private static int field4816 = -1;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "[I")
    private static int[] field4819 = new int[4];

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    private static int field4825 = -1;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    private int field4811;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    private int field4812;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    private int field4818;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    private int field4820;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public int field4821;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Leg;")
    private class317 field4815;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lvi;")
    private static class7 field4807;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4804;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4826;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "[B")
    private static byte[] field4810;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lma;)Z", line = 6)
    private final boolean method2132(class302 arg0) {
        class7 var2 = class7.method130(class250.field3697, this.field4824, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class162.field2654;
        class114.method898(field4819);
        class114.method892();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field4814) {
                var4 = -arg0.field4805;
                var5 = -arg0.field4822;
                var6 = -arg0.field4809;
            } else {
                var4 = this.field4805 - arg0.field4805;
                var5 = this.field4822 - arg0.field4822;
                var6 = this.field4809 - arg0.field4809;
            }
        }
        var2.method129();
        class94 var7 = var2.method121(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method754() - var7.method755()) / 2;
        int var9 = (var7.method746() - var7.method137()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class46.method399((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field4820, this.field4820);
        if (this.field4812 != 0) {
            int var11 = class40.field612[this.field4812];
            int var12 = class40.field619[this.field4812];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field4818 != 0) {
            int var14 = this.field4818 - 1024 & 0x7FF;
            int var15 = class40.field612[var14];
            int var16 = class40.field619[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class261.method1813((float) (-var4), (float) var5, (float) (-var6));
        class261.method1816(16777215, 0.5F, 0.5F, 0.5F);
        class261.method1814();
        class162.method1203();
        class162.method1193(true);
        class162.method1205(true);
        var7.method756(0, 0, 0, 0, -var8 - var7.method755(), -var9 - var7.method137(), 0, -1L);
        class162.method1205(false);
        class162.method1193(false);
        class162.method1196();
        class46.method395();
        class162.method1219(this.field4806);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field4820, this.field4820, 0);
        class114.method896(field4819);
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 98)
    private final void method2133(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field4810[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 137)
    private static final void method2134() {
        if (field4807 != null) {
            return;
        }
        class7 var0 = field4807 = new class7(260, 480, 0);
        int[] var1 = var0.field180;
        int[] var2 = var0.field169;
        int[] var3 = var0.field167;
        int[] var4 = var0.field159;
        int[] var5 = var0.field191;
        int[] var6 = var0.field157;
        var0.field181 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class40.field612[var8] >> 1;
            int var10 = class40.field619[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class40.field619[var12] >> 9;
                int var14 = (class40.field612[var12] >> 1) * var9 >> 23;
                int var15 = (class40.field612[var12] >> 1) * var10 >> 23;
                var1[var0.field181] = var15;
                var2[var0.field181] = var13;
                var3[var0.field181] = -var14;
                var0.field181++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field172] = 0;
                var5[var0.field172] = var17;
                var6[var0.field172] = var16;
                var0.field172++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field172] = var17;
                    var5[var0.field172] = var19;
                    var6[var0.field172] = var16;
                    var0.field172++;
                    var4[var0.field172] = var19;
                    var5[var0.field172] = var20;
                    var6[var0.field172] = var16;
                    var0.field172++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field172] = var16;
                var5[var0.field172] = var17;
                var6[var0.field172] = 1;
                var0.field172++;
            }
        }
        var0.field151 = var0.field181;
        var0.field193 = null;
        var0.field177 = null;
        var0.field185 = null;
        var0.field165 = null;
        var0.field175 = null;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lma;)Z", line = 252)
    private final boolean method2135(class302 arg0) {
        if (this.field4815 == null) {
            if (this.field4823 == 0) {
                this.field4815 = class40.field614.method252(true, class40.field604, 12194, this.field4820, this.field4824);
            } else if (this.field4823 == 2) {
                this.method2143(arg0);
            } else if (this.field4823 == 1) {
                this.method2151(arg0);
            }
        }
        return this.field4815 != null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIIIIIIIIII)V", line = 283)
    private final void method2136(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field4810[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(Lma;)V", line = 316)
    private final void method2137(class302 arg0) {
        method2149();
        method2146();
        GL var2 = class162.field2654;
        class114.method898(field4819);
        class114.method892();
        var2.glClearColor((float) ((this.field4817 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field4817 & 0xFF00) >> 8) / 255.0F, (float) (this.field4817 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field4814) {
                var3 = -arg0.field4805;
                var4 = -arg0.field4822;
                var5 = -arg0.field4809;
            } else {
                var3 = this.field4805 - arg0.field4805;
                var4 = this.field4822 - arg0.field4822;
                var5 = this.field4809 - arg0.field4809;
            }
        }
        class46.method396(-1.0F, 1.0F, -1.0F, 1.0F, this.field4820, this.field4820);
        if (this.field4812 != 0) {
            int var6 = class40.field612[this.field4812];
            int var7 = class40.field619[this.field4812];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field4818 != 0) {
            int var9 = this.field4818 - 1024 & 0x7FF;
            int var10 = class40.field612[var9];
            int var11 = class40.field619[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class261.method1813((float) (-var3), (float) (-var4), (float) var5);
        class261.method1816(16777215, 0.5F, 0.5F, 1.0F);
        class261.method1814();
        if (this.field4817 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class40.field614.method261(this.field4824, (byte) -12, this.field4820);
        class162.method1205(true);
        if (class162.field2639) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field4804.position(0));
        var2.glVertexPointer(2, 5126, 20, field4804.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field4804.position(12));
        var2.glDrawElements(5, field4826.limit() / 2, 5123, field4826.position(0));
        var2.glEnableClientState(32886);
        class162.method1205(false);
        if (this.field4817 != 0) {
            class102.method830(0, 14804, 0);
            class162.method1206(1);
            class162.method1211(0);
            class162.method1219(field4816);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field4817 >> 16), (byte) (this.field4817 >> 8), (byte) this.field4817, (byte) 127);
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
            var2.glColor4ub((byte) (this.field4817 >> 16), (byte) (this.field4817 >> 8), (byte) this.field4817, (byte) -1);
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
        class46.method395();
        class162.method1219(this.field4806);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field4820, this.field4820, 0);
        class114.method896(field4819);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIII)V", line = 444)
    public final void method2138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field4812 - arg4 & 0x7FF;
        int var8 = this.field4818 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field4811) / 2 + var9;
        int var12 = (arg2 - this.field4811) / 2 + var10;
        if (var11 >= arg3 || this.field4811 + var11 <= 0 || var12 >= arg2 || this.field4811 + var12 <= 0) {
            return;
        }
        if (this.field4823 == 0) {
            class40.field614.method261(this.field4824, (byte) -12, this.field4820);
        } else if (this.field4806 == -1) {
            return;
        } else {
            class162.method1219(this.field4806);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field4811 + var14;
        int var16 = this.field4811 + var13;
        GL var17 = class162.field2654;
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

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(Lma;)V", line = 493)
    public final void method2139(class302 arg0) {
        if (this.field4823 == 0) {
            return;
        }
        boolean var2 = this.field4806 == -1 || class177.field2819 != this.field4813;
        if (!this.field4808 && !var2) {
            return;
        }
        if (var2) {
            this.field4813 = class177.field2819;
            this.field4806 = class287.method2016(class287.field4492, this.field4820, this.field4820);
        } else {
            class162.method1219(this.field4806);
            class287.method2022(class287.field4492, this.field4820, this.field4820);
        }
        if (this.field4823 == 1) {
            this.method2137(arg0);
            this.field4808 = false;
        } else if (this.field4823 == 2) {
            this.field4808 = !this.method2132(arg0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 540)
    protected final void finalize() throws Throwable {
        this.method2150();
        super.finalize();
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4805 = arg2;
        this.field4822 = arg3;
        this.field4809 = arg4;
        this.field4814 = arg7;
        this.field4824 = arg1;
        this.field4817 = arg6;
        this.field4827 = arg5;
        this.field4823 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 548)
    private final void method2140() {
        int var1 = this.field4820 * 3 / 32;
        int var3 = this.field4820 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class33.field506 * var1 + var1;
        int var8 = class33.field506 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class33.field504) {
            var4 = var3 - (var1 + var3 - class33.field504);
        }
        if (var1 < class33.field507) {
            int var11 = class33.field507 - var1;
            var4 -= var11;
            var7 += class33.field506 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class33.field508) {
            int var12 = var1 + var3 - class33.field508;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class33.field505) {
            int var13 = class33.field505 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method2133(class33.field503, 0, this.field4817, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIILma;)V", line = 602)
    public final void method2141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class302 arg6) {
        int var8 = this.field4812 - arg4 & 0x7FF;
        int var9 = this.field4818 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field4811) / 2 + var10;
        int var13 = (arg2 - this.field4811) / 2 + var11;
        if (var12 < arg3 && this.field4811 + var12 > 0 && var13 < arg2 && this.field4811 + var13 > 0 && this.method2135(arg6)) {
            this.field4815.method695(arg0 + var13, arg1 + var12, this.field4811, this.field4811);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()V", line = 629)
    private final void method2142() {
        int var1 = this.field4820;
        int var2 = this.field4820;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class33.field506 - var1;
        if (var2 > class33.field504) {
            var2 -= var2 - class33.field504;
        }
        if (class33.field507 > 0) {
            int var9 = class33.field507;
            var2 -= var9;
            var7 += class33.field506 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class33.field508) {
            int var10 = var1 - class33.field508;
            var1 -= var10;
            var8 += var10;
        }
        if (class33.field505 > 0) {
            int var11 = class33.field505;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method2136(class33.field503, this.field4817, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(Lma;)V", line = 678)
    private final void method2143(class302 arg0) {
        class7 var2 = class7.method130(class250.field3697, this.field4824, 0);
        if (var2 == null) {
            return;
        }
        this.field4815 = new class317(this.field4820, this.field4820);
        class33.method300(field4819);
        this.field4815.method2246();
        class40.method368();
        class33.method288(0, 0, this.field4820, this.field4820, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field4814) {
                var3 = -arg0.field4805;
                var4 = -arg0.field4822;
                var5 = -arg0.field4809;
            } else {
                var3 = this.field4805 - arg0.field4805;
                var4 = this.field4822 - arg0.field4822;
                var5 = this.field4809 - arg0.field4809;
            }
        }
        if (this.field4812 != 0) {
            int var6 = class40.field612[this.field4812];
            int var7 = class40.field619[this.field4812];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field4818 != 0) {
            int var9 = this.field4818 - 1024 & 0x7FF;
            int var10 = class40.field612[var9];
            int var11 = class40.field619[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class271 var13 = var2.method136(64, 768, -var3, -var4, -var5);
        int var14 = var13.method754() - var13.method755();
        int var15 = var13.method746() - var13.method137();
        int var16 = var13.method755() + var14 / 2;
        int var17 = var13.method137() + var15 / 2;
        if (var14 > var15) {
            var13.method1930(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field4820);
        } else {
            var13.method1930(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field4820);
        }
        class101.field1666.method1981(18517);
        class33.method290(field4819);
        class40.method368();
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()V", line = 760)
    public static final void method2144() {
        if (field4816 != -1) {
            class177.method1308(field4816, 0, field4825);
        }
        field4816 = -1;
        field4825 = -1;
        field4804 = null;
        field4826 = null;
        field4807 = null;
        field4810 = null;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "()V", line = 773)
    private static final void method2145() {
        if (field4810 != null) {
            return;
        }
        field4810 = new byte[16384];
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
                field4810[var4 + var6] = field4810[var4 + var9] = field4810[var5 + var6] = field4810[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "()V", line = 825)
    private static final void method2146() {
        method2145();
        if (field4816 == -1 || field4825 != class177.field2819) {
            field4816 = class287.method2014(class287.field4498, 128, 128, field4810);
            field4825 = class177.field2819;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)Z", line = 838)
    public final boolean method2147(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4814) {
            this.field4821 = 1073741823;
            var8 = this.field4805;
            var9 = this.field4822;
            var10 = this.field4809;
        } else {
            int var5 = this.field4805 - arg0;
            int var6 = this.field4822 - arg1;
            int var7 = this.field4809 - arg2;
            this.field4821 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4821 == 0) {
                this.field4821 = 1;
            }
            var8 = (var5 << 8) / this.field4821;
            var9 = (var6 << 8) / this.field4821;
            var10 = (var7 << 8) / this.field4821;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4811 = this.field4827 * arg3 / (this.field4814 ? 1024 : this.field4821);
        } else {
            this.field4811 = 0;
        }
        if (this.field4811 < 8) {
            this.method2150();
            this.field4815 = null;
            return false;
        }
        int var12 = class284.method1990(true, this.field4811);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4820 != var12) {
            this.field4820 = var12;
        }
        this.field4812 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field4818 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field4808 = true;
        this.field4815 = null;
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "()V", line = 893)
    public static void method2148() {
        field4804 = null;
        field4826 = null;
        field4807 = null;
        field4810 = null;
        field4819 = null;
    }

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "()V", line = 906)
    private static final void method2149() {
        if (field4804 != null) {
            return;
        }
        class1 var0 = new class1(1088);
        class1 var1 = new class1(5140);
        if (class162.field2624) {
            var1.method64(0.0F, (byte) 41);
            var1.method64(1.0F, (byte) 41);
            var1.method64(0.0F, (byte) 41);
            var1.method64(0.5F, (byte) 41);
            var1.method64(1.0F, (byte) 41);
            var1.method64(0.0F, (byte) 41);
            var1.method64(-1.0F, (byte) 41);
            var1.method64(0.0F, (byte) 41);
            var1.method64(0.5F, (byte) 41);
            var1.method64(0.0F, (byte) 41);
        } else {
            var1.method5(15852, 0.0F);
            var1.method5(15852, 1.0F);
            var1.method5(15852, 0.0F);
            var1.method5(15852, 0.5F);
            var1.method5(15852, 1.0F);
            var1.method5(15852, 0.0F);
            var1.method5(15852, -1.0F);
            var1.method5(15852, 0.0F);
            var1.method5(15852, 0.5F);
            var1.method5(15852, 0.0F);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class40.field612[var5] / 65535.0F;
            float var7 = (float) class40.field619[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class40.field619[var9] / 65535.0F;
                float var11 = (float) class40.field612[var9] * var6 / 65535.0F;
                float var12 = (float) class40.field612[var9] * var7 / 65535.0F;
                if (class162.field2624) {
                    var1.method64(var12, (byte) 41);
                    var1.method64(var10, (byte) 41);
                    var1.method64(var11, (byte) 41);
                    var1.method64(var2, (byte) 41);
                    var1.method64(var3, (byte) 41);
                } else {
                    var1.method5(15852, var12);
                    var1.method5(15852, var10);
                    var1.method5(15852, var11);
                    var1.method5(15852, var2);
                    var1.method5(15852, var3);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class162.field2624) {
                    var0.method14(-246866616, 0);
                    var0.method14(-246866616, 0);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method14(-246866616, var14++);
                        var0.method14(-246866616, var13++);
                    }
                    var0.method14(-246866616, 1);
                    var0.method14(-246866616, 1);
                } else {
                    var0.method42(false, 0);
                    var0.method42(false, 0);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method42(false, var14++);
                        var0.method42(false, var13++);
                    }
                    var0.method42(false, 1);
                    var0.method42(false, 1);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field4804 = ByteBuffer.allocateDirect(var1.field48);
        field4804.put(var1.field34, 0, var1.field48);
        field4804.flip();
        field4826 = ByteBuffer.allocateDirect(var0.field48);
        field4826.put(var0.field34, 0, var0.field48);
        field4826.flip();
    }

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "()V", line = 1061)
    private final void method2150() {
        if (this.field4806 != -1) {
            class177.method1308(this.field4806, 0, this.field4813);
        }
        this.field4808 = true;
        this.field4806 = -1;
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(Lma;)V", line = 1075)
    private final void method2151(class302 arg0) {
        method2134();
        method2145();
        this.field4815 = new class224(this.field4820, this.field4820);
        class33.method300(field4819);
        this.field4815.method2246();
        class40.method368();
        class33.method288(0, 0, this.field4820, this.field4820, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field4814) {
                var2 = -arg0.field4805;
                var3 = -arg0.field4822;
                var4 = -arg0.field4809;
            } else {
                var2 = this.field4805 - arg0.field4805;
                var3 = this.field4822 - arg0.field4822;
                var4 = this.field4809 - arg0.field4809;
            }
        }
        if (this.field4812 != 0) {
            int var5 = class40.field612[this.field4812];
            int var6 = class40.field619[this.field4812];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field4818 != 0) {
            int var8 = this.field4818 - 1024 & 0x7FF;
            int var9 = class40.field612[var8];
            int var10 = class40.field619[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class330.method2314(field4807.field156, 0, field4807.field172, (short) class40.field614.method251(false, this.field4824));
        class271 var12 = field4807.method136(64, 512, -var2, -var3, -var4);
        int var13 = var12.method754() - var12.method755();
        int var14 = var12.method746() - var12.method137();
        if (var13 > var14) {
            int var15 = this.field4817 == 0 ? (var13 << 9) / this.field4820 : (var13 * 16 << 9) / (this.field4820 * 13);
            var12.method1930(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field4817 == 0 ? (var14 << 9) / this.field4820 : (var14 * 16 << 9) / (this.field4820 * 13);
            var12.method1930(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field4817 == 0) {
            for (int var17 = 0; var17 < class33.field503.length; var17++) {
                if (class33.field503[var17] != 0) {
                    class33.field503[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method2140();
            this.method2142();
        }
        class101.field1666.method1981(18517);
        class33.method290(field4819);
        class40.method368();
    }
}
