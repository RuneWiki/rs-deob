import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class556 extends class223 {

    @OriginalMember(owner = "client!oaa", name = "Xh", descriptor = "Lv;")
    private class165 field7765 = new class165();

    @OriginalMember(owner = "client!oaa", name = "hi", descriptor = "Lv;")
    private class165 field7775 = new class165();

    @OriginalMember(owner = "client!oaa", name = "ti", descriptor = "Lv;")
    private class165 field7787 = new class165();

    @OriginalMember(owner = "client!oaa", name = "wi", descriptor = "Lv;")
    private class165 field7790 = new class165();

    @OriginalMember(owner = "client!oaa", name = "zi", descriptor = "Lv;")
    private class165 field7793 = new class165();

    @OriginalMember(owner = "client!oaa", name = "Ai", descriptor = "Lv;")
    private class165 field7794 = new class165();

    @OriginalMember(owner = "client!oaa", name = "Bi", descriptor = "Lv;")
    private class165 field7795 = new class165();

    @OriginalMember(owner = "client!oaa", name = "Di", descriptor = "[Lir;")
    private class362[] field7797 = new class362[16];

    @OriginalMember(owner = "client!oaa", name = "Ci", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field7796 = new MapBuffer();

    @OriginalMember(owner = "client!oaa", name = "Li", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field7805 = new MapBuffer();

    @OriginalMember(owner = "client!oaa", name = "Ri", descriptor = "I")
    private int field7811 = 0;

    @OriginalMember(owner = "client!oaa", name = "yh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field7740;

    @OriginalMember(owner = "client!oaa", name = "Oi", descriptor = "Ljava/lang/String;")
    private String field7808;

    @OriginalMember(owner = "client!oaa", name = "Pi", descriptor = "Ljava/lang/String;")
    private String field7809;

    @OriginalMember(owner = "client!oaa", name = "Xi", descriptor = "I")
    private int field7817;

    @OriginalMember(owner = "client!oaa", name = "Ti", descriptor = "Z")
    public boolean field7813;

    @OriginalMember(owner = "client!oaa", name = "Vi", descriptor = "Z")
    private boolean field7815;

    @OriginalMember(owner = "client!oaa", name = "Ui", descriptor = "Z")
    private boolean field7814;

    @OriginalMember(owner = "client!oaa", name = "Ni", descriptor = "Z")
    public boolean field7807;

    @OriginalMember(owner = "client!oaa", name = "Si", descriptor = "Z")
    public boolean field7812;

    @OriginalMember(owner = "client!oaa", name = "Qi", descriptor = "Z")
    public boolean field7810;

    @OriginalMember(owner = "client!oaa", name = "Mi", descriptor = "[I")
    public int[] field7806;

    @OriginalMember(owner = "client!oaa", name = "Wi", descriptor = "I")
    public int field7816;

    @OriginalMember(owner = "client!oaa", name = "si", descriptor = "Lo;")
    public static class208 field7786 = new class208(4, 1, 1, 1);

    @OriginalMember(owner = "client!oaa", name = "Kg", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!oaa", name = "Lg", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!oaa", name = "Mg", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!oaa", name = "Ng", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!oaa", name = "Og", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!oaa", name = "Pg", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!oaa", name = "Qg", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!oaa", name = "Rg", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!oaa", name = "Sg", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!oaa", name = "Tg", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!oaa", name = "Ug", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!oaa", name = "Vg", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!oaa", name = "Wg", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!oaa", name = "Xg", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!oaa", name = "Yg", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!oaa", name = "Zg", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!oaa", name = "ah", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!oaa", name = "bh", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!oaa", name = "ch", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!oaa", name = "dh", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!oaa", name = "eh", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!oaa", name = "fh", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!oaa", name = "gh", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!oaa", name = "hh", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!oaa", name = "ih", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!oaa", name = "jh", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!oaa", name = "kh", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!oaa", name = "lh", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!oaa", name = "mh", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!oaa", name = "nh", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!oaa", name = "oh", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!oaa", name = "ph", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!oaa", name = "qh", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!oaa", name = "rh", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!oaa", name = "sh", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!oaa", name = "th", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!oaa", name = "uh", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!oaa", name = "vh", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!oaa", name = "wh", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!oaa", name = "xh", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!oaa", name = "zh", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!oaa", name = "Ah", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!oaa", name = "Bh", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!oaa", name = "Ch", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!oaa", name = "Dh", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!oaa", name = "Eh", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!oaa", name = "Fh", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!oaa", name = "Gh", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!oaa", name = "Hh", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!oaa", name = "Ih", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!oaa", name = "Jh", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!oaa", name = "Kh", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!oaa", name = "Lh", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!oaa", name = "Mh", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!oaa", name = "Nh", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!oaa", name = "Oh", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!oaa", name = "Ph", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!oaa", name = "Qh", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!oaa", name = "Rh", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!oaa", name = "Sh", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!oaa", name = "Th", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!oaa", name = "Uh", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!oaa", name = "Vh", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!oaa", name = "Wh", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!oaa", name = "Yh", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!oaa", name = "Zh", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!oaa", name = "ai", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!oaa", name = "bi", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!oaa", name = "ci", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!oaa", name = "di", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!oaa", name = "ei", descriptor = "I")
    public static int field7772;

    @OriginalMember(owner = "client!oaa", name = "fi", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!oaa", name = "gi", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!oaa", name = "ii", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!oaa", name = "ji", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!oaa", name = "ki", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!oaa", name = "li", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!oaa", name = "mi", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!oaa", name = "ni", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!oaa", name = "oi", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!oaa", name = "pi", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!oaa", name = "qi", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!oaa", name = "ri", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!oaa", name = "ui", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!oaa", name = "vi", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!oaa", name = "xi", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!oaa", name = "yi", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!oaa", name = "Gi", descriptor = "I")
    private int field7800;

    @OriginalMember(owner = "client!oaa", name = "Ki", descriptor = "J")
    private long field7804;

    @OriginalMember(owner = "client!oaa", name = "Ei", descriptor = "Z")
    private boolean field7798;

    @OriginalMember(owner = "client!oaa", name = "Fi", descriptor = "Z")
    private boolean field7799;

    @OriginalMember(owner = "client!oaa", name = "Hi", descriptor = "Z")
    private boolean field7801;

    @OriginalMember(owner = "client!oaa", name = "Ii", descriptor = "Z")
    private boolean field7802;

    @OriginalMember(owner = "client!oaa", name = "Ji", descriptor = "Z")
    private boolean field7803;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "()Lrb;", line = 5)
    public final class260 method172() {
        ++field7727;
        int var1 = -1;
        if (~this.field7808.indexOf("nvidia") == 0) {
            if (this.field7808.indexOf("intel") != -1) {
                var1 = 32902;
            } else if (~this.field7808.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class260(var1, "OpenGL", this.field7817, this.field7809, 0L);
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(II)Lrca;", line = 26)
    public final class36 method246(int arg0, int arg1) {
        ++field7730;
        return null;
    }

    @OriginalMember(owner = "client!oaa", name = "I", descriptor = "()I", line = 37)
    public final int method136() {
        ++field7733;
        return this.field7811;
    }

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "()V", line = 47)
    public final void method145() {
        ++field7777;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BZ)V", line = 55)
    public final void method1441(byte arg0, boolean arg1) {
        if (!arg1) {
            OpenGL.glDisable(32925);
        } else {
            OpenGL.glEnable(32925);
        }
        if (arg0 > -20) {
            this.field7806 = null;
        }
        ++field7783;
    }

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "(B)V", line = 70)
    public final void method1476(byte arg0) {
        for (int var2 = super.field3361 + -1; var2 >= 0; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field7779;
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glAlphaFunc(516, 0.0F);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; var4 < 8; ++var4) {
            int var6 = var4 + 16384;
            OpenGL.glLightfv(var6, 4608, var3, 0);
            OpenGL.glLightf(var6, 4615, 0.0F);
            OpenGL.glLightf(var6, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        int var5 = -33 / ((arg0 - 37) / 63);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field7740.setSwapInterval(0);
        super.method1476((byte) -114);
    }

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "()V", line = 125)
    public final void method205() {
        ++field7732;
        super.method205();
        if (this.field7740 != null) {
            this.field7740.method117();
            this.field7740.release();
            this.field7740 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "(Z)V", line = 142)
    public final void method1464(boolean arg0) {
        OpenGL.glMatrixMode(5889);
        if (arg0) {
            ++field7774;
            OpenGL.glLoadMatrixf(super.field3319, 0);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "B", descriptor = "(I)V", line = 156)
    public final void method1427(int arg0) {
        this.method1498(true);
        ++field7791;
        int var2;
        for (var2 = 0; var2 < super.field3344; ++var2) {
            class251 var3 = super.field3352[var2];
            int var4 = var3.method1684(-1);
            int var5 = 16386 - -var2;
            float var6 = var3.method1688(74) / 255.0F;
            class702.field9781[0] = (float) var3.method1683(10918);
            class702.field9781[1] = (float) var3.method1687(1110);
            class702.field9781[2] = (float) var3.method1686(false);
            class702.field9781[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class702.field9781, 0);
            class702.field9781[1] = (float) (class407.method2490(65375, var4) >> 8) * var6;
            class702.field9781[0] = (float) class407.method2490(var4 >> 16, 255) * var6;
            class702.field9781[2] = (float) class407.method2490(var4, 255) * var6;
            class702.field9781[3] = 1.0F;
            OpenGL.glLightfv(var5, 4609, class702.field9781, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method1685(96) * var3.method1685(118)));
            OpenGL.glEnable(var5);
        }
        while (super.field3383 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method1427(arg0);
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(IB)V", line = 200)
    public final synchronized void method3270(int arg0, byte arg1) {
        ++field7761;
        class69 var3 = new class69();
        var3.field762 = (long) arg0;
        if (arg1 != 46) {
            this.field7813 = false;
        }
        this.field7794.method1039(var3, 0);
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(IB)Lqs;", line = 214)
    public final class741 method1378(int arg0, byte arg1) {
        if (arg1 <= 7) {
            this.method1425(true, (class500) null, -2, true);
        }
        ++field7714;
        if (~arg0 != -4) {
            if (~arg0 != -5) {
                return arg0 == 8 ? new class562(this, super.field3112, super.field3100) : super.method1378(arg0, (byte) 54);
            } else {
                return new class392(this, super.field3112, super.field3100);
            }
        } else {
            return new class557(this, super.field3112);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "(B)V", line = 261)
    public final void method1504(byte arg0) {
        class702.field9781[2] = super.field3375 * super.field3359;
        class702.field9781[0] = super.field3359 * super.field3305;
        class702.field9781[3] = 1.0F;
        ++field7762;
        if (arg0 == 48) {
            class702.field9781[1] = super.field3359 * super.field3323;
            OpenGL.glLightModelfv(2899, class702.field9781, 0);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "gb", descriptor = "(I)V", line = 276)
    public final void method1508(int arg0) {
        ++field7713;
        int var2 = -43 % ((arg0 - 12) / 55);
        if (!super.field3301) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZZ)Lfw;", line = 297)
    public final class716 method1421(boolean arg0, boolean arg1) {
        ++field7725;
        if (!arg1) {
            this.field7793 = null;
        }
        return new class362(this, arg0);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IJ)V", line = 308)
    public final synchronized void method3271(int arg0, long arg1) {
        ++field7709;
        class69 var4 = new class69();
        if (arg0 != 2) {
            this.method1431((Object) null, (Canvas) null, (byte) -4);
        }
        var4.field762 = arg1;
        this.field7795.method1039(var4, 0);
    }

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "()Z", line = 322)
    public final boolean method147() {
        ++field7719;
        return false;
    }

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "(I)V", line = 330)
    public final void method1424(int arg0) {
        ++field7767;
        if (arg0 == 6048) {
            if (super.field3345) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "GA", descriptor = "(I)V", line = 345)
    public final void method230(int arg0) {
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field7755;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "(Z)V", line = 355)
    public final void method1481(boolean arg0) {
        ++field7749;
        if (arg0) {
            int var2 = this.field7806[super.field3289];
            if (var2 != 0) {
                this.field7806[super.field3289] = 0;
                OpenGL.glBindTexture(var2, 0);
                OpenGL.glDisable(var2);
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "([BLpb;ZIIIZI)Lbw;", line = 375)
    public final class28 method1483(byte[] arg0, class2 arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        ++field7720;
        if (arg6) {
            field7792 = -110;
        }
        if (!this.field7814 && (!class65.method506(arg3, 30440) || !class65.method506(arg5, 30440))) {
            if (this.field7815) {
                return new class158(this, arg1, arg3, arg5, arg0, arg4, arg7);
            } else {
                class750 var9 = new class750(this, arg1, class612.field8616, class179.method1142(arg3, -78), class179.method1142(arg5, 66));
                var9.method127(arg4, arg7, arg0, arg1, arg3, 22217, 0, arg5, 0);
                return var9;
            }
        } else {
            return new class750(this, arg1, arg3, arg5, arg2, arg0, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "(B)V", line = 406)
    public final void method1445(byte arg0) {
        OpenGL.glTexEnvi(8960, 34161, class274.method1790((byte) 33, super.field3302[super.field3289]));
        ++field7769;
        if (arg0 < 39) {
            this.field7796 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "()V", line = 418)
    public final void method167() {
        ++field7707;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(IZI)V", line = 426)
    public final synchronized void method3272(int arg0, boolean arg1, int arg2) {
        ++field7745;
        class324 var4 = new class324(arg2);
        var4.field762 = (long) arg0;
        if (!arg1) {
            this.field7775.method1039(var4, 0);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "(Z)V", line = 440)
    public final void method1413(boolean arg0) {
        class702.field9781[3] = (float) (super.field3357 >>> 24) / 255.0F;
        if (arg0) {
            this.method1412(false);
        }
        class702.field9781[2] = (float) class407.method2490(255, super.field3357) / 255.0F;
        class702.field9781[0] = (float) class407.method2490(16711680, super.field3357) / 1.671168E7F;
        class702.field9781[1] = (float) class407.method2490(65280, super.field3357) / 65280.0F;
        ++field7700;
        OpenGL.glTexEnvfv(8960, 8705, class702.field9781, 0);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B[Lim;)Lbfa;", line = 455)
    public final class262 method1406(byte arg0, class435[] arg1) {
        ++field7760;
        if (arg0 != 6) {
            this.method1462(16);
        }
        return new class779(arg1);
    }

    @OriginalMember(owner = "client!oaa", name = "Q", descriptor = "(I)V", line = 469)
    public final void method1461(int arg0) {
        if (class327.field4593 == super.field3306) {
            OpenGL.glBlendFunc(770, 771);
        } else if (class329.field4618 != super.field3306) {
            if (class467.field6491 == super.field3306) {
                OpenGL.glBlendFunc(774, 1);
            }
        } else {
            OpenGL.glBlendFunc(1, 1);
        }
        if (arg0 > -83) {
            this.method1497((Object) null, (Canvas) null, false);
        }
        ++field7722;
    }

    @OriginalMember(owner = "client!oaa", name = "R", descriptor = "(I)V", line = 490)
    public final void method1462(int arg0) {
        ++field7768;
        if (arg0 <= 39) {
            this.method1435(-5, (Object) null, (Canvas) null);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "(B)F", line = 501)
    public final float method1474(byte arg0) {
        ++field7754;
        if (arg0 != -114) {
            this.field7775 = null;
        }
        return 0.0F;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lbfa;I)V", line = 513)
    public final void method1485(class262 arg0, int arg1) {
        ++field7784;
        class435[] var3 = ((class779) arg0).field10716;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        if (arg1 != 32) {
            this.field7765 = null;
        }
        for (int var8 = 0; ~var8 > ~var3.length; ++var8) {
            class435 var11 = var3[var8];
            class362 var12 = this.field7797[var8];
            int var13 = 0;
            int var14 = var12.method2279(107);
            long var15 = var12.method3373((byte) -119);
            var12.method3376(-32022);
            for (int var17 = 0; ~var11.method2611((byte) -103) < ~var17; ++var17) {
                class382 var18 = var11.method2607(5000, var17);
                if (class382.field5466 != var18) {
                    if (class382.field5473 != var18) {
                        if (class382.field5475 != var18) {
                            if (class382.field5476 != var18) {
                                if (class382.field5477 != var18) {
                                    if (class382.field5478 != var18) {
                                        if (class382.field5479 == var18) {
                                            OpenGL.glClientActiveTexture(33984 + var4++);
                                            OpenGL.glTexCoordPointer(4, 5126, var14, (long) var13 + var15);
                                        }
                                    } else {
                                        OpenGL.glClientActiveTexture(33984 + var4++);
                                        OpenGL.glTexCoordPointer(3, 5126, var14, var15 - -((long) var13));
                                    }
                                } else {
                                    OpenGL.glClientActiveTexture(var4++ + 33984);
                                    OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                                }
                            } else {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(1, 5126, var14, var15 - -((long) var13));
                            }
                        } else {
                            var5 = true;
                            OpenGL.glColorPointer(4, 5121, var14, var15 - -((long) var13));
                        }
                    } else {
                        OpenGL.glNormalPointer(5126, var14, var15 - -((long) var13));
                        var6 = true;
                    }
                } else {
                    var7 = true;
                    OpenGL.glVertexPointer(3, 5126, var14, var15 - -((long) var13));
                }
                var13 += var18.field5469;
            }
        }
        if (!var7 != !this.field7803) {
            if (var7) {
                OpenGL.glEnableClientState(32884);
            } else {
                OpenGL.glDisableClientState(32884);
            }
            this.field7803 = var7;
        }
        if (!this.field7798 == var6) {
            if (var6) {
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            this.field7798 = var6;
        }
        if (this.field7799 != var5) {
            if (var5) {
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            this.field7799 = var5;
        }
        if (var4 > this.field7800) {
            for (int var9 = this.field7800; ~var9 > ~var4; ++var9) {
                OpenGL.glClientActiveTexture(var9 + 33984);
                OpenGL.glEnableClientState(32888);
            }
            this.field7800 = var4;
        } else if (this.field7800 > var4) {
            for (int var10 = var4; var10 < this.field7800; ++var10) {
                OpenGL.glClientActiveTexture(var10 + 33984);
                OpenGL.glDisableClientState(32888);
            }
            this.field7800 = var4;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 673)
    public final void method254(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class357 {
        this.method157(arg2, arg3);
        ++field7766;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)Lcn;", line = 681)
    public final class621 method236(int arg0, int arg1) {
        ++field7780;
        return null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZIB[[I)Lfp;", line = 690)
    public final class596 method1385(boolean arg0, int arg1, byte arg2, int[][] arg3) {
        ++field7746;
        int var5 = 112 % ((arg2 - 26) / 34);
        return new class497(this, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V", line = 700)
    public final synchronized void method232(int arg0) {
        ++field7756;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field7775.method1044(21972)) {
            class324 var12 = (class324) this.field7775.method1034(20791);
            class262.field3834[var3++] = (int) var12.field762;
            super.field3276 -= var12.field4575;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class262.field3834, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class262.field3834, 0);
            var3 = 0;
        }
        while (!this.field7787.method1044(21972)) {
            class324 var11 = (class324) this.field7787.method1034(20791);
            class262.field3834[var3++] = (int) var11.field762;
            super.field3277 -= var11.field4575;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class262.field3834, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class262.field3834, 0);
            var3 = 0;
        }
        while (!this.field7790.method1044(21972)) {
            class324 var10 = (class324) this.field7790.method1034(20791);
            class262.field3834[var3++] = var10.field4575;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class262.field3834, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class262.field3834, 0);
            var3 = 0;
        }
        while (!this.field7793.method1044(21972)) {
            class324 var9 = (class324) this.field7793.method1034(20791);
            class262.field3834[var3++] = (int) var9.field762;
            super.field3273 -= var9.field4575;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class262.field3834, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class262.field3834, 0);
            boolean var4 = false;
        }
        while (!this.field7765.method1044(21972)) {
            class324 var8 = (class324) this.field7765.method1034(20791);
            OpenGL.glDeleteLists((int) var8.field762, var8.field4575);
        }
        while (!this.field7794.method1044(21972)) {
            class69 var7 = this.field7794.method1034(20791);
            OpenGL.glDeleteProgramARB((int) var7.field762);
        }
        while (!this.field7795.method1044(21972)) {
            class69 var6 = this.field7795.method1034(20791);
            OpenGL.glDeleteObjectARB(var6.field762);
        }
        while (!this.field7765.method1044(21972)) {
            class324 var5 = (class324) this.field7765.method1034(20791);
            OpenGL.glDeleteLists((int) var5.field762, var5.field4575);
        }
        if (this.method181() > 100663296 && ~class683.method3903((byte) 4) < ~(this.field7804 + 60000L)) {
            System.gc();
            this.field7804 = class683.method3903((byte) 4);
        }
        super.method232(var2);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Loea;Lpb;B)Z", line = 861)
    public final boolean method1442(class612 arg0, class2 arg1, byte arg2) {
        ++field7716;
        if (arg2 < 63) {
            this.field7796 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V", line = 873)
    public final void method203(boolean arg0) {
        ++field7702;
    }

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "()V", line = 880)
    public final void method250() {
        ++field7731;
        if (super.field3232 > 0 || ~super.field3201 < -1) {
            int var1 = super.field3374;
            int var2 = super.field3339;
            int var3 = super.field3315;
            int var4 = super.field3371;
            this.method208();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1397(-125);
            this.method1499(false, 3);
            this.method1393(false, 0);
            this.method1480(125, false);
            this.method1479(false, 7);
            this.method1492((class34) null, 2);
            this.method1467(false, false, -2, (byte) -64);
            this.method1509(4, 1);
            this.method1404((byte) -116, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field3232, super.field3201, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method225(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "na", descriptor = "(IIII)[I", line = 927)
    public final int[] method243(int arg0, int arg1, int arg2, int arg3) {
        ++field7789;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + super.field3201 + -var6 - 1, arg2, 1, 32993, this.field7816, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "(I)V", line = 946)
    public final void method1394(int arg0) {
        ++field7752;
        if (!super.field3368) {
            OpenGL.glDisable(3008);
        } else {
            OpenGL.glEnable(3008);
        }
        if (arg0 >= -39) {
            this.method1413(true);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "hb", descriptor = "(I)V", line = 961)
    private final void method3273(int arg0) {
        if (this.field7802) {
            OpenGL.glPopMatrix();
        }
        if (arg0 < -116) {
            ++field7781;
            if (super.field3354.method2443((byte) -65)) {
                if (!this.field7801) {
                    OpenGL.glLoadMatrixf(super.field3280.method3093(false, class160.field2065), 0);
                    this.field7801 = true;
                    this.method1437(12093);
                    this.method1427(3);
                }
                if (!super.field3275) {
                    OpenGL.glPushMatrix();
                    OpenGL.glMultMatrixf(super.field3271.method3093(false, class160.field2065), 0);
                    this.field7802 = true;
                } else {
                    this.field7802 = false;
                }
            } else if (!super.field3275) {
                OpenGL.glLoadMatrixf(super.field3271.method3093(false, class160.field2065), 0);
                this.field7802 = false;
            } else {
                OpenGL.glLoadIdentity();
                this.field7802 = false;
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZII)V", line = 1009)
    public final synchronized void method3274(boolean arg0, int arg1, int arg2) {
        ++field7758;
        class324 var4 = new class324(arg1);
        if (arg0) {
            this.method1434((class718) null, (byte) 22);
        }
        var4.field762 = (long) arg2;
        this.field7787.method1039(var4, 0);
    }

    @OriginalMember(owner = "client!oaa", name = "Y", descriptor = "(I)V", line = 1033)
    public final void method1484(int arg0) {
        class702.field9781[2] = super.field3375 * super.field3358;
        class702.field9781[1] = super.field3358 * super.field3323;
        class702.field9781[3] = 1.0F;
        ++field7705;
        class702.field9781[0] = super.field3358 * super.field3305;
        OpenGL.glLightfv(16384, 4609, class702.field9781, 0);
        class702.field9781[3] = 1.0F;
        class702.field9781[1] = -super.field3309 * super.field3323;
        class702.field9781[2] = -super.field3309 * super.field3375;
        class702.field9781[0] = -super.field3309 * super.field3305;
        OpenGL.glLightfv(16385, 4609, class702.field9781, arg0);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZIZLvq;Z)V", line = 1053)
    public final void method1469(boolean arg0, int arg1, boolean arg2, class500 arg3, boolean arg4) {
        ++field7778;
        OpenGL.glTexEnvi(8960, arg1 + 34176, class679.method3861(arg3, 112));
        if (arg2) {
            this.field7798 = false;
        }
        if (arg4) {
            OpenGL.glTexEnvi(8960, arg1 + 34192, !arg0 ? 770 : 771);
        } else {
            OpenGL.glTexEnvi(8960, arg1 + 34192, !arg0 ? 768 : 769);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lmia;)V", line = 1070)
    public final void method229(class684 arg0) {
        ++field7782;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(BI)V", line = 1079)
    public final void method1417(byte arg0, int arg1) {
        if (arg0 >= -53) {
            this.field7812 = true;
        }
        ++field7738;
    }

    @OriginalMember(owner = "client!oaa", name = "ya", descriptor = "()V", line = 1089)
    public final void method226() {
        ++field7753;
        this.method1479(true, 7);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "()V", line = 1103)
    public final void method227() {
        ++field7748;
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(II)V", line = 1111)
    public final void method157(int arg0, int arg1) throws class357 {
        this.field7740.swapBuffers();
        ++field7734;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lrh;B)V", line = 1124)
    public final void method1434(class718 arg0, byte arg1) {
        ++field7739;
        if (class213.field2940 != arg0) {
            int var3 = class269.method1755(-127, arg0);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        } else {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        }
        if (arg1 != 71) {
            this.field7811 = 68;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "(Z)V", line = 1152)
    public final void method1489(boolean arg0) {
        this.method3273(-118);
        ++field7743;
        if (arg0) {
            this.field7796 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZII)Ljava/lang/String;", line = 1164)
    public static final String method3275(int arg0, boolean arg1, int arg2, int arg3) {
        ++field7785;
        if (arg2 >= 2 && arg2 <= 36) {
            if (arg1 && arg3 >= 0) {
                if (arg0 <= 115) {
                    return null;
                } else {
                    int var4 = 2;
                    int var5 = arg3 / arg2;
                    while (var5 != 0) {
                        var5 /= arg2;
                        ++var4;
                    }
                    char[] var6 = new char[var4];
                    var6[0] = '+';
                    for (int var7 = var4 + -1; ~var7 < -1; --var7) {
                        int var8 = arg3;
                        arg3 /= arg2;
                        int var9 = -(arg2 * arg3) + var8;
                        if (var9 >= 10) {
                            var6[var7] = (char) (var9 + 87);
                        } else {
                            var6[var7] = (char) (var9 + 48);
                        }
                    }
                    return new String(var6);
                }
            } else {
                return Integer.toString(arg3, arg2);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "O", descriptor = "(I)V", line = 1215)
    public final void method1459(int arg0) {
        OpenGL.glActiveTexture(33984 - -super.field3289);
        ++field7728;
        if (arg0 != 64) {
            this.method146(-91, 92);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "()V", line = 1227)
    public final void method210() {
        OpenGL.glFinish();
        ++field7724;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILdaa;II)V", line = 1235)
    public final void method1403(int arg0, class453 arg1, int arg2, int arg3) {
        ++field7704;
        byte var5;
        int var6;
        if (class219.field2999 != arg1) {
            if (class657.field9269 != arg1) {
                if (class625.field8750 == arg1) {
                    var5 = 4;
                    var6 = arg3 * 3;
                } else if (class224.field3417 == arg1) {
                    var5 = 6;
                    var6 = arg3 + 2;
                } else if (class521.field7169 != arg1) {
                    var6 = arg3;
                    var5 = 0;
                } else {
                    var6 = arg3 + 2;
                    var5 = 5;
                }
            } else {
                var5 = 3;
                var6 = arg3 - -1;
            }
        } else {
            var6 = arg3 * 2;
            var5 = 1;
        }
        if (arg0 <= 125) {
            this.method1464(false);
        }
        OpenGL.glDrawArrays(var5, arg2, var6);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V", line = 1287)
    public final void method1435(int arg0, Object arg1, Canvas arg2) {
        if (arg0 != 1) {
            method3275(19, true, -87, 37);
        }
        ++field7759;
        Long var4 = (Long) arg1;
        this.field7740.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "(I)V", line = 1302)
    public final void method1426(int arg0) {
        ++field7735;
        if (arg0 != 8) {
            this.method1489(true);
        }
        OpenGL.glTexEnvi(8960, 34162, class274.method1790((byte) 100, super.field3366[super.field3289]));
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIZIII[I)Lbw;", line = 1313)
    public final class28 method1507(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg5 != 0) {
            this.method1481(false);
        }
        ++field7751;
        if (!this.field7814 && (!class65.method506(arg0, 30440) || !class65.method506(arg1, arg5 ^ 30440))) {
            if (!this.field7815) {
                class750 var8 = new class750(this, class75.field837, class612.field8616, class179.method1142(arg0, 98), class179.method1142(arg1, 119));
                var8.method131(arg4, arg6, arg3, 0, arg1, false, 0, arg0);
                return var8;
            } else {
                return new class158(this, arg0, arg1, arg6, arg4, arg3);
            }
        } else {
            return new class750(this, arg0, arg1, arg2, arg6, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lcn;Lrca;)Lmia;", line = 1344)
    public final class684 method247(class621 arg0, class36 arg1) {
        ++field7744;
        return null;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(IIII)Z", line = 1352)
    public static final boolean method3276(int arg0, int arg1, int arg2, int arg3) {
        class267.field3878.method33(arg0, arg1, arg3, class484.field6696);
        ++field7776;
        int var4 = class484.field6696[arg2];
        if (~var4 > -51) {
            return false;
        } else {
            class484.field6696[0] = class484.field6696[0] * class627.field8782 / var4 + class368.field5310;
            class484.field6696[1] = class484.field6696[1] * class72.field781 / var4 + class309.field4454;
            class484.field6696[2] = var4;
            return true;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "ib", descriptor = "(I)V", line = 1369)
    public static void method3277(int arg0) {
        field7786 = null;
        int var1 = 122 % ((-75 - arg0) / 37);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V", line = 1380)
    public final void method1497(Object arg0, Canvas arg1, boolean arg2) {
        if (arg2) {
            this.method1421(true, false);
        }
        ++field7703;
        Long var4 = (Long) arg0;
        this.field7740.releaseSurface(arg1, var4);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lpb;ILoea;BI)Lbw;", line = 1394)
    public final class28 method1495(class2 arg0, int arg1, class612 arg2, byte arg3, int arg4) {
        if (arg3 < 94) {
            return null;
        } else {
            ++field7717;
            if (!this.field7814 && (!class65.method506(arg1, 30440) || !class65.method506(arg4, 30440))) {
                return this.field7815 ? new class158(this, arg0, arg2, arg1, arg4) : new class750(this, arg0, arg2, class179.method1142(arg1, -64), class179.method1142(arg4, -32));
            } else {
                return new class750(this, arg0, arg2, arg1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V", line = 1421)
    public final void method1431(Object arg0, Canvas arg1, byte arg2) {
        if (arg2 > -87) {
            this.method1489(false);
        }
        ++field7711;
        Long var4 = (Long) arg0;
        if (!this.field7740.setSurface(var4)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "(B)V", line = 1436)
    public final void method1420(byte arg0) {
        ++field7706;
        super.field3291 = (float) (-super.field3328 + super.field3380);
        super.field3296 = (float) (-super.field3377) + super.field3291;
        if (super.field3296 < (float) super.field3322) {
            super.field3296 = (float) super.field3322;
        }
        OpenGL.glFogf(2915, super.field3296);
        OpenGL.glFogf(2916, super.field3291);
        class702.field9781[0] = (float) class407.method2490(16711680, super.field3334) / 1.671168E7F;
        if (arg0 >= -54) {
            this.field7787 = null;
        }
        class702.field9781[2] = (float) class407.method2490(255, super.field3334) / 255.0F;
        class702.field9781[1] = (float) class407.method2490(super.field3334, 65280) / 65280.0F;
        OpenGL.glFogfv(2918, class702.field9781, 0);
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(IIIID)V", line = 1460)
    public final void method235(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field7764;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lae;I)V", line = 1467)
    public class556(OpenGL arg0, Canvas arg1, long arg2, class101 arg3, class283 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field7740 = arg0;
            this.field7740.method119();
            this.field7808 = OpenGL.glGetString(7936).toLowerCase();
            this.field7809 = OpenGL.glGetString(7937).toLowerCase();
            if (this.field7808.indexOf("microsoft") == -1 && this.field7808.indexOf("brian paul") == -1 && ~this.field7808.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class24.method105(var8.replace('.', ' '), 19478, ' ');
                if (var9.length < 2) {
                    throw new RuntimeException("");
                } else {
                    try {
                        int var10 = class157.method1014(var9[0], -14534);
                        int var11 = class157.method1014(var9[1], -14534);
                        this.field7817 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (~this.field7817 > -13) {
                        throw new RuntimeException("");
                    } else if (!this.field7740.method118("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field7740.method118("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field3361 = var12[0];
                        if (~super.field3361 > -3) {
                            throw new RuntimeException("");
                        } else {
                            super.field3341 = 8;
                            this.field7813 = this.field7740.method118("GL_ARB_vertex_buffer_object");
                            super.field3313 = this.field7740.method118("GL_ARB_multisample");
                            this.field7815 = this.field7740.method118("GL_ARB_texture_rectangle");
                            super.field3356 = this.field7740.method118("GL_ARB_texture_cube_map");
                            this.field7814 = this.field7740.method118("GL_ARB_texture_non_power_of_two");
                            super.field3363 = this.field7740.method118("GL_EXT_texture3D");
                            this.field7807 = this.field7740.method118("GL_ARB_vertex_shader");
                            this.field7812 = this.field7740.method118("GL_ARB_vertex_program");
                            this.field7810 = this.field7740.method118("GL_ARB_fragment_shader");
                            this.field7740.method118("GL_ARB_fragment_program");
                            this.field7806 = new int[super.field3361];
                            this.field7816 = Stream.method2346() ? 33639 : 5121;
                            if (~this.field7809.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class24.method105(this.field7809.replace('/', ' '), 19478, ' ');
                                for (int var17 = 0; var16.length > var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (var18.charAt(0) == 'x' && var18.length() >= 3 && class623.method3585(0, var18.substring(1, 3))) {
                                                var18 = var18.substring(1);
                                                var15 = true;
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var18 = var18.substring(2);
                                                    var14 = true;
                                                }
                                                if (var18.length() >= 4 && class623.method3585(0, var18.substring(0, 4))) {
                                                    var13 = class157.method1014(var18.substring(0, 4), -14534);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (~var13 <= -7001 && var13 <= 9250) {
                                        super.field3363 = false;
                                    }
                                    if (var13 >= 7000 && var13 <= 7999) {
                                        this.field7813 = false;
                                    }
                                }
                                this.field7815 &= this.field7740.method118("GL_ARB_half_float_pixel");
                            }
                            this.field7808.indexOf("intel");
                            if (this.field7813) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method2821((byte) 79);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "(I)V", line = 1625)
    public final void method1411(int arg0) {
        ++field7770;
        if (arg0 < 88) {
            this.method136();
        }
        OpenGL.glMatrixMode(5890);
        if (super.field3332[super.field3289] != class467.field6494) {
            OpenGL.glLoadMatrixf(super.field3330[super.field3289].method3093(false, class160.field2065), 0);
        } else {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZ)Lpm;", line = 1645)
    public final class614 method1389(int arg0, boolean arg1) {
        if (arg0 != 9) {
            this.field7798 = true;
        }
        ++field7718;
        return new class175(this, class612.field8617, arg1);
    }

    @OriginalMember(owner = "client!oaa", name = "F", descriptor = "(II)V", line = 1656)
    public final void method146(int arg0, int arg1) {
        ++field7729;
    }

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "()Z", line = 1664)
    public final boolean method199() {
        ++field7715;
        return false;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lok;Lok;FLok;)Lok;", line = 1678)
    public final class255 method209(class255 arg0, class255 arg1, float arg2, class255 arg3) {
        ++field7788;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "(B)V", line = 1688)
    public final void method1451(byte arg0) {
        if (arg0 >= -23) {
            this.field7796 = null;
        }
        if (super.field3362) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
        ++field7747;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIZIII[FLpb;)Lbw;", line = 1703)
    public final class28 method1448(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, float[] arg6, class2 arg7) {
        ++field7757;
        if (arg4 != 0) {
            this.method1476((byte) -2);
        }
        if (!this.field7814 && (!class65.method506(arg5, arg4 + 30440) || !class65.method506(arg0, 30440))) {
            if (this.field7815) {
                return new class158(this, arg7, arg5, arg0, arg6, arg3, arg1);
            } else {
                class750 var9 = new class750(this, arg7, class612.field8620, class179.method1142(arg5, arg4 + -112), class179.method1142(arg0, -72));
                var9.method4153(arg3, arg1, 0, 0, arg6, arg7, arg0, arg5, 0);
                return var9;
            }
        } else {
            return new class750(this, arg7, arg5, arg0, arg2, arg6, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "V", descriptor = "(I)V", line = 1732)
    public final void method1478(int arg0) {
        OpenGL.glViewport(super.field3295, super.field3320, super.field3232, super.field3201);
        ++field7737;
        if (arg0 != 0) {
            this.method1435(-87, (Object) null, (Canvas) null);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "W", descriptor = "(I)V", line = 1743)
    public final void method1482(int arg0) {
        ++field7708;
        this.field7801 = false;
        if (arg0 <= -105) {
            this.method3273(-127);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "(Z)V", line = 1758)
    public final void method1412(boolean arg0) {
        OpenGL.glScissor(super.field3295 - -super.field3374, super.field3320 - super.field3371 + super.field3201, -super.field3374 + super.field3339, super.field3371 - super.field3315);
        ++field7773;
        if (arg0) {
            method3275(-23, true, 16, -77);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILpb;[BIII)Lat;", line = 1769)
    public final class162 method1432(int arg0, class2 arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -13836) {
            return null;
        } else {
            ++field7736;
            return new class106(this, arg1, arg5, arg3, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZLvq;IZ)V", line = 1782)
    public final void method1425(boolean arg0, class500 arg1, int arg2, boolean arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34184, class679.method3861(arg1, 114));
        ++field7710;
        OpenGL.glTexEnvi(8960, arg2 + 34200, !arg0 ? 770 : 771);
        if (!arg3) {
            this.field7775 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Loea;ILpb;)Z", line = 1794)
    public final boolean method1491(class612 arg0, int arg1, class2 arg2) {
        ++field7771;
        if (arg1 != 1) {
            this.method1504((byte) -105);
        }
        return true;
    }

    @OriginalMember(owner = "client!oaa", name = "E", descriptor = "(I)V", line = 1805)
    public final void method1437(int arg0) {
        if (arg0 != 12093) {
            this.method3273(106);
        }
        OpenGL.glLightfv(16384, 4611, super.field3314, 0);
        ++field7721;
        OpenGL.glLightfv(16385, 4611, super.field3382, 0);
    }

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "(Z)V", line = 1817)
    public final void method1419(boolean arg0) {
        if (super.field3340 && super.field3351 && super.field3377 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field7701;
        if (arg0) {
            this.method1436((byte) 57, (Canvas) null);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BILdaa;Lpm;III)V", line = 1833)
    public final void method1430(byte arg0, int arg1, class453 arg2, class614 arg3, int arg4, int arg5, int arg6) {
        ++field7712;
        int var8;
        byte var9;
        if (class219.field2999 == arg2) {
            var8 = arg4 * 2;
            var9 = 1;
        } else if (class657.field9269 != arg2) {
            if (class625.field8750 == arg2) {
                var9 = 4;
                var8 = arg4 * 3;
            } else if (class224.field3417 == arg2) {
                var9 = 6;
                var8 = arg4 + 2;
            } else if (class521.field7169 != arg2) {
                var8 = arg4;
                var9 = 0;
            } else {
                var9 = 5;
                var8 = arg4 + 2;
            }
        } else {
            var8 = arg4 + 1;
            var9 = 3;
        }
        class612 var10 = arg3.method1122(11677);
        class175 var11 = (class175) arg3;
        var11.method3376(-32022);
        if (arg0 <= -52) {
            OpenGL.glDrawElements(var9, var8, class402.method2466(var10, false), var11.method3373((byte) -120) - -((long) (var10.field8609 * arg1)));
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIII)V", line = 1890)
    public final void method197(int arg0, int arg1, int arg2, int arg3) {
        ++field7750;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(FFF)V", line = 1897)
    public final void method186(float arg0, float arg1, float arg2) {
        ++field7772;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BLfw;I)V", line = 1904)
    public final void method1386(byte arg0, class716 arg1, int arg2) {
        ++field7741;
        if (arg0 >= -106) {
            this.method1432(15, (class2) null, (byte[]) null, -38, 71, -110);
        }
        this.field7797[arg2] = (class362) arg1;
    }

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "(I)V", line = 1916)
    public final void method1415(int arg0) {
        if (super.field3311 && !super.field3300) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field7726;
        if (arg0 <= 74) {
            this.method1489(false);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;", line = 1931)
    public final Object method1436(byte arg0, Canvas arg1) {
        ++field7723;
        if (arg0 != -65) {
            this.method1476((byte) 18);
        }
        long var3 = this.field7740.prepareSurface(arg1);
        if (var3 == -1L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "(I)V", line = 1959)
    public final void method1392(int arg0) {
        OpenGL.glDepthMask(super.field3337 && super.field3327);
        if (arg0 == 23312) {
            ++field7742;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "(Z)V", line = 1970)
    public final void method1384(boolean arg0) {
        ++field7763;
        if (!super.field3406) {
            OpenGL.glDisable(3089);
        } else {
            OpenGL.glEnable(3089);
        }
        if (arg0) {
            this.method229((class684) null);
        }
    }
}
