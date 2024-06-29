import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class381 extends class312 {

    @OriginalMember(owner = "client!mc", name = "Og", descriptor = "Lrh;")
    private class59 field5468 = new class59();

    @OriginalMember(owner = "client!mc", name = "mh", descriptor = "Lrh;")
    private class59 field5492 = new class59();

    @OriginalMember(owner = "client!mc", name = "Fh", descriptor = "Lrh;")
    private class59 field5511 = new class59();

    @OriginalMember(owner = "client!mc", name = "Zh", descriptor = "Lrh;")
    private class59 field5531 = new class59();

    @OriginalMember(owner = "client!mc", name = "bi", descriptor = "Lrh;")
    private class59 field5533 = new class59();

    @OriginalMember(owner = "client!mc", name = "fi", descriptor = "Lrh;")
    private class59 field5537 = new class59();

    @OriginalMember(owner = "client!mc", name = "ki", descriptor = "Lrh;")
    private class59 field5542 = new class59();

    @OriginalMember(owner = "client!mc", name = "li", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field5543 = new MapBuffer();

    @OriginalMember(owner = "client!mc", name = "ri", descriptor = "I")
    private int field5549 = 0;

    @OriginalMember(owner = "client!mc", name = "xi", descriptor = "Z")
    private boolean field5555 = false;

    @OriginalMember(owner = "client!mc", name = "Pg", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field5469;

    @OriginalMember(owner = "client!mc", name = "ti", descriptor = "Ljava/lang/String;")
    private String field5551;

    @OriginalMember(owner = "client!mc", name = "wi", descriptor = "Ljava/lang/String;")
    private String field5554;

    @OriginalMember(owner = "client!mc", name = "si", descriptor = "I")
    private int field5550;

    @OriginalMember(owner = "client!mc", name = "ni", descriptor = "Z")
    public boolean field5545;

    @OriginalMember(owner = "client!mc", name = "pi", descriptor = "Z")
    private boolean field5547;

    @OriginalMember(owner = "client!mc", name = "vi", descriptor = "Z")
    private boolean field5553;

    @OriginalMember(owner = "client!mc", name = "qi", descriptor = "Z")
    public boolean field5548;

    @OriginalMember(owner = "client!mc", name = "oi", descriptor = "I")
    public int field5546;

    @OriginalMember(owner = "client!mc", name = "ui", descriptor = "[I")
    public int[] field5552;

    @OriginalMember(owner = "client!mc", name = "Lh", descriptor = "Lnj;")
    public static class436 field5517 = new class436(16);

    @OriginalMember(owner = "client!mc", name = "ch", descriptor = "F")
    public static float field5482;

    @OriginalMember(owner = "client!mc", name = "Dg", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!mc", name = "Eg", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!mc", name = "Fg", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!mc", name = "Gg", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!mc", name = "Hg", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!mc", name = "Ig", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!mc", name = "Jg", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!mc", name = "Kg", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!mc", name = "Lg", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!mc", name = "Mg", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!mc", name = "Ng", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!mc", name = "Qg", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!mc", name = "Rg", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!mc", name = "Sg", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!mc", name = "Tg", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!mc", name = "Ug", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!mc", name = "Vg", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!mc", name = "Wg", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!mc", name = "Xg", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!mc", name = "Yg", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!mc", name = "Zg", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!mc", name = "ah", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!mc", name = "bh", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!mc", name = "dh", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!mc", name = "eh", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!mc", name = "fh", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!mc", name = "gh", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!mc", name = "hh", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!mc", name = "ih", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!mc", name = "jh", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!mc", name = "kh", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!mc", name = "lh", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!mc", name = "nh", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!mc", name = "oh", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!mc", name = "ph", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!mc", name = "qh", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!mc", name = "rh", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!mc", name = "sh", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!mc", name = "th", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!mc", name = "uh", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!mc", name = "vh", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!mc", name = "wh", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!mc", name = "xh", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!mc", name = "yh", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!mc", name = "zh", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!mc", name = "Ah", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!mc", name = "Bh", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!mc", name = "Ch", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!mc", name = "Dh", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!mc", name = "Eh", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!mc", name = "Gh", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!mc", name = "Hh", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!mc", name = "Ih", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!mc", name = "Jh", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!mc", name = "Kh", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!mc", name = "Mh", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!mc", name = "Nh", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!mc", name = "Oh", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!mc", name = "Ph", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!mc", name = "Qh", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!mc", name = "Rh", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!mc", name = "Sh", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!mc", name = "Th", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!mc", name = "Uh", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!mc", name = "Vh", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!mc", name = "Wh", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!mc", name = "Xh", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!mc", name = "Yh", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!mc", name = "ai", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!mc", name = "ci", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!mc", name = "di", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!mc", name = "ei", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!mc", name = "gi", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!mc", name = "hi", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!mc", name = "ii", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!mc", name = "ji", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!mc", name = "mi", descriptor = "J")
    private long field5544;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "(Z)F")
    public final float method859(boolean arg0) {
        if (!arg0) {
            this.method844((int[]) null, -29, -99, -28, false, 37, -26);
        }
        ++field5498;
        return 0.0F;
    }

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "()Lru;")
    public final class276 method794() {
        ++field5504;
        int var1 = -1;
        if (~this.field5551.indexOf("nvidia") == 0) {
            if (~this.field5551.indexOf("intel") == 0) {
                if (this.field5551.indexOf("ati") != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class276(var1, "OpenGL", this.field5550, this.field5554, 0L);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(FFF)V")
    public final void method851(float arg0, float arg1, float arg2) {
        ++field5457;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lnl;ILeea;)Z")
    public final boolean method808(class50 arg0, int arg1, class680 arg2) {
        int var4 = 33 % ((arg1 - 5) / 54);
        ++field5487;
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZI[[I)Lvea;")
    public final class64 method845(byte arg0, boolean arg1, int arg2, int[][] arg3) {
        ++field5465;
        if (arg0 <= 99) {
            this.field5548 = false;
        }
        return new class364(this, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILnl;[BI)Lgp;")
    public final class94 method799(int arg0, int arg1, int arg2, class50 arg3, byte[] arg4, int arg5) {
        if (arg5 < 52) {
            this.field5543 = null;
        }
        ++field5508;
        return new class99(this, arg3, arg0, arg2, arg1, arg4);
    }

    @OriginalMember(owner = "client!mc", name = "SA", descriptor = "()I")
    public final int method791() {
        ++field5474;
        return this.field5549;
    }

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "(I)V")
    public final void method810(int arg0) {
        this.method2305(true);
        if (arg0 <= 72) {
            this.method816(103);
        }
        ++field5538;
    }

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "(I)V")
    public final void method830(int arg0) {
        if (super.field4467 && !super.field4483) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 >= -65) {
            this.field5552 = null;
        }
        ++field5503;
    }

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "()Z")
    public final boolean method842() {
        ++field5512;
        return false;
    }

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "(Z)V")
    private final void method2305(boolean arg0) {
        ++field5509;
        if (this.field5555) {
            OpenGL.glPopMatrix();
        }
        if (super.field4383.method2716(-71)) {
            if (!this.field5555) {
                OpenGL.glLoadIdentity();
                OpenGL.glMultMatrixf(super.field4379.method2784(class481.field6475, (byte) -92), 0);
                this.method812(8);
                this.method857(-3136);
                this.field5555 = true;
            }
            if (this.field5555) {
                OpenGL.glPushMatrix();
            }
            if (!super.field4371) {
                OpenGL.glMultMatrixf(super.field4374.method2784(class481.field6475, (byte) -92), 0);
            }
        } else if (super.field4371) {
            OpenGL.glLoadIdentity();
            this.field5555 = false;
        } else {
            OpenGL.glLoadMatrixf(super.field4374.method2784(class481.field6475, (byte) -92), 0);
            this.field5555 = false;
        }
        if (!arg0) {
            this.field5544 = 0L;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IBI)V")
    public final synchronized void method2306(int arg0, byte arg1, int arg2) {
        ++field5529;
        class360 var4 = new class360(arg2);
        var4.field272 = (long) arg0;
        if (arg1 > -120) {
            this.method779(-49);
        }
        this.field5492.method378(var4, 31316);
    }

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "(I)V")
    public final void method846(int arg0) {
        OpenGL.glMatrixMode(5890);
        ++field5530;
        if (super.field4455[super.field4425] == class100.field1221) {
            OpenGL.glLoadIdentity();
        } else {
            OpenGL.glLoadMatrixf(super.field4416[super.field4425].method2784(class481.field6475, (byte) -92), 0);
        }
        OpenGL.glMatrixMode(5888);
        if (arg0 != 2) {
            this.method823(-121, -17);
        }
    }

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "(Z)V")
    public final void method840(boolean arg0) {
        OpenGL.glTexEnvi(8960, 34161, class395.method2345(super.field4444[super.field4425], (byte) -69));
        if (!arg0) {
            this.field5543 = null;
        }
        ++field5460;
    }

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "(B)V")
    public final void method858(byte arg0) {
        if (super.field4504) {
            OpenGL.glEnable(3089);
        } else {
            OpenGL.glDisable(3089);
        }
        if (arg0 < 54) {
            this.method841(121);
        }
        ++field5532;
    }

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "()V")
    public final void method839() {
        ++field5471;
        if (super.field4345 > 0 || super.field4340 > 0) {
            int var1 = super.field4396;
            int var2 = super.field4403;
            int var3 = super.field4422;
            int var4 = super.field4435;
            this.method1984();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1979(3000);
            this.method2024(false, false);
            this.method1965(false, 0);
            this.method1994(false, false);
            this.method1949(-32, false);
            this.method1884((class619) null, -2);
            this.method2018((byte) -85, -2, false, false);
            this.method1995(1, 1);
            this.method1881(122, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field4345, super.field4340, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1908(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "(I)V")
    public final void method820(int arg0) {
        ++field5494;
        OpenGL.glDepthMask(super.field4433 && super.field4442);
        if (arg0 != 14084) {
            field5482 = -0.39359233F;
        }
    }

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "(I)V")
    public final void method779(int arg0) {
        if (arg0 >= 2) {
            ++field5491;
            int var2 = this.field5552[super.field4425];
            if (~var2 != -1) {
                this.field5552[super.field4425] = 0;
                OpenGL.glBindTexture(var2, 0);
                OpenGL.glDisable(var2);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILfo;I)V")
    public final void method856(int arg0, int arg1, class417 arg2, int arg3) {
        if (arg0 == -2) {
            ++field5486;
            int var5;
            byte var6;
            if (class315.field4530 == arg2) {
                var5 = arg3 * 2;
                var6 = 1;
            } else if (class321.field4713 != arg2) {
                if (class319.field4687 != arg2) {
                    if (class490.field6606 == arg2) {
                        var6 = 6;
                        var5 = arg3 - -2;
                    } else if (class489.field6602 == arg2) {
                        var6 = 5;
                        var5 = arg3 + 2;
                    } else {
                        var6 = 0;
                        var5 = arg3;
                    }
                } else {
                    var5 = arg3 * 3;
                    var6 = 4;
                }
            } else {
                var6 = 3;
                var5 = arg3 + 1;
            }
            OpenGL.glDrawArrays(var6, arg1, var5);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILll;)V")
    public final void method788(int arg0, class114 arg1) {
        if (class179.field2239 == arg1) {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        } else {
            int var3 = class604.method3340(arg1, arg0 ^ -14376);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        }
        if (arg0 != 14433) {
            this.field5552 = null;
        }
        ++field5458;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([Loh;I)Lqca;")
    public final class547 method813(class401[] arg0, int arg1) {
        if (arg1 < 20) {
            return null;
        } else {
            ++field5495;
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILeea;IILnl;)Lsd;")
    public final class595 method804(int arg0, class680 arg1, int arg2, int arg3, class50 arg4) {
        if (arg2 < 64) {
            this.field5468 = null;
        }
        ++field5525;
        if (!this.field5553 && (!class144.method986(arg0, (byte) -128) || !class144.method986(arg3, (byte) -114))) {
            return this.field5547 ? new class376(this, arg4, arg1, arg0, arg3) : new class297(this, arg4, arg1, class306.method1837((byte) -113, arg0), class306.method1837((byte) -122, arg3));
        } else {
            return new class297(this, arg4, arg1, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZB)Lvp;")
    public final class467 method819(boolean arg0, byte arg1) {
        ++field5505;
        int var3 = 62 / ((-63 - arg1) / 54);
        return new class347(this, arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([IIIIZII)Lsd;")
    public final class595 method844(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field5539;
        if (arg5 != 0) {
            this.field5549 = -91;
        }
        if (!this.field5553 && (!class144.method986(arg3, (byte) -103) || !class144.method986(arg1, (byte) -102))) {
            if (!this.field5547) {
                class297 var8 = new class297(this, class420.field5862, class680.field9664, class306.method1837((byte) -117, arg3), class306.method1837((byte) -113, arg1));
                var8.method171(arg6, 27729, arg2, 0, arg0, arg1, 0, arg3);
                return var8;
            } else {
                return new class376(this, arg3, arg1, arg0, arg6, arg2);
            }
        } else {
            return new class297(this, arg3, arg1, arg4, arg0, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIILtk;)V")
    public final void method814(boolean arg0, int arg1, int arg2, class73 arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34184, class419.method2435(arg3, true));
        ++field5535;
        OpenGL.glTexEnvi(8960, arg2 + 34200, arg0 ? 771 : 770);
        if (arg1 > -108) {
            this.method823(65, 57);
        }
    }

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "(Z)V")
    public static void method2307(boolean arg0) {
        if (arg0) {
            method2307(true);
        }
        field5517 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Laq;Laq;FLaq;)Laq;")
    public final class108 method796(class108 arg0, class108 arg1, float arg2, class108 arg3) {
        ++field5473;
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
    public final void method790(byte arg0) {
        int var2 = 55 / ((20 - arg0) / 43);
        if (super.field4386) {
            OpenGL.glEnable(3008);
        } else {
            OpenGL.glDisable(3008);
        }
        ++field5480;
    }

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "(I)V")
    public final void method806(int arg0) {
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field5528;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public final synchronized void method785(int arg0) {
        ++field5515;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field5492.method379(-1)) {
            class360 var12 = (class360) this.field5492.method368(98);
            class691.field9749[var3++] = (int) var12.field272;
            super.field4373 -= var12.field5197;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class691.field9749, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class691.field9749, 0);
            var3 = 0;
        }
        while (!this.field5511.method379(-1)) {
            class360 var11 = (class360) this.field5511.method368(48);
            class691.field9749[var3++] = (int) var11.field272;
            super.field4376 -= var11.field5197;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class691.field9749, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class691.field9749, 0);
            var3 = 0;
        }
        while (!this.field5531.method379(-1)) {
            class360 var10 = (class360) this.field5531.method368(64);
            class691.field9749[var3++] = var10.field5197;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class691.field9749, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class691.field9749, 0);
            var3 = 0;
        }
        while (!this.field5533.method379(-1)) {
            class360 var9 = (class360) this.field5533.method368(72);
            class691.field9749[var3++] = (int) var9.field272;
            super.field4370 -= var9.field5197;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class691.field9749, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class691.field9749, 0);
            boolean var4 = false;
        }
        while (!this.field5468.method379(-1)) {
            class360 var8 = (class360) this.field5468.method368(89);
            OpenGL.glDeleteLists((int) var8.field272, var8.field5197);
        }
        while (!this.field5537.method379(-1)) {
            class28 var7 = this.field5537.method368(66);
            OpenGL.glDeleteProgramARB((int) var7.field272);
        }
        while (!this.field5542.method379(-1)) {
            class28 var6 = this.field5542.method368(74);
            OpenGL.glDeleteObjectARB(var6.field272);
        }
        while (!this.field5468.method379(-1)) {
            class360 var5 = (class360) this.field5468.method368(113);
            OpenGL.glDeleteLists((int) var5.field272, var5.field5197);
        }
        if (this.method1950() > 100663296 && class669.method3713(0) > this.field5544 + 60000L) {
            System.gc();
            this.field5544 = class669.method3713(0);
        }
        super.method785(var2);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLqca;)V")
    public final void method849(byte arg0, class547 arg1) {
        ++field5520;
        if (arg0 != 43) {
            this.field5555 = true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZ)V")
    public final void method817(byte arg0, boolean arg1) {
        ++field5477;
        if (arg0 <= -47) {
            if (!arg1) {
                OpenGL.glDisable(32925);
            } else {
                OpenGL.glEnable(32925);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(II)V")
    public final void method823(int arg0, int arg1) {
        if (arg0 != 4) {
            this.method817((byte) -50, true);
        }
        ++field5536;
    }

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "(I)V")
    public final void method831(int arg0) {
        this.method2305(true);
        if (arg0 != 13081) {
            this.field5544 = 7L;
        }
        ++field5501;
    }

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "()V")
    public final void method843() {
        ++field5475;
        super.method843();
        if (this.field5469 != null) {
            this.field5469.method3349();
            this.field5469.release();
            this.field5469 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "(I)V")
    public final void method837(int arg0) {
        int var2 = 13 / ((arg0 - -35) / 60);
        ++field5462;
        OpenGL.glTexEnvi(8960, 34162, class395.method2345(super.field4411[super.field4425], (byte) -78));
    }

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "(B)V")
    public final void method853(byte arg0) {
        OpenGL.glScissor(super.field4450 - -super.field4396, super.field4464 - -super.field4340 + -super.field4435, -super.field4396 + super.field4403, -super.field4422 + super.field4435);
        if (arg0 != 118) {
            this.method789(true, -39, -11, (class50) null, (byte) -95, -107, -56, (float[]) null);
        }
        ++field5472;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BILnl;ZZII)Lsd;")
    public final class595 method787(int arg0, byte[] arg1, int arg2, class50 arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        if (arg4) {
            this.field5537 = null;
        }
        ++field5489;
        if (!this.field5553 && (!class144.method986(arg2, (byte) -126) || !class144.method986(arg0, (byte) -108))) {
            if (!this.field5547) {
                class297 var9 = new class297(this, arg3, class680.field9664, class306.method1837((byte) -119, arg2), class306.method1837((byte) -113, arg0));
                var9.method173(arg3, arg0, (byte) -99, arg1, 0, 0, arg2, arg6, arg7);
                return var9;
            } else {
                return new class376(this, arg3, arg2, arg0, arg1, arg7, arg6);
            }
        } else {
            return new class297(this, arg3, arg2, arg0, arg5, arg1, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(Z)V")
    public final void method778(boolean arg0) {
        ++field5493;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
    public final void method854(Object arg0, boolean arg1, Canvas arg2) {
        ++field5507;
        Long var4 = (Long) arg0;
        if (!arg1) {
            this.field5544 = 53L;
        }
        this.field5469.releaseSurface(arg2, var4);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method803(Rectangle[] arg0, int arg1) throws class352 {
        ++field5459;
        this.method805();
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
    public final synchronized void method2308(int arg0, int arg1, int arg2) {
        ++field5521;
        class360 var4 = new class360(arg2);
        var4.field272 = (long) arg0;
        int var5 = 77 / ((-78 - arg1) / 41);
        this.field5511.method378(var4, 31316);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lnl;Leea;Z)Z")
    public final boolean method826(class50 arg0, class680 arg1, boolean arg2) {
        ++field5466;
        if (!arg2) {
            field5517 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()V")
    public final void method821() {
        ++field5463;
        this.method1949(-32, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "(I)V")
    public final void method793(int arg0) {
        if (super.field4457) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
        ++field5497;
        if (arg0 > -23) {
            this.field5548 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public final void method835(int arg0) {
        if (super.field4397) {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        } else {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        }
        ++field5490;
        if (arg0 != 0) {
            this.method831(-77);
        }
    }

    @OriginalMember(owner = "client!mc", name = "KA", descriptor = "(IIII)[I")
    public final int[] method797(int arg0, int arg1, int arg2, int arg3) {
        ++field5524;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + super.field4340 + -arg1 - 1, arg2, 1, 32993, this.field5546, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method855(int arg0, Canvas arg1, Object arg2) {
        ++field5464;
        Long var4 = (Long) arg2;
        if (!this.field5469.setSurface(var4)) {
            throw new RuntimeException();
        } else if (arg0 != 7472) {
            field5517 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
    public final void method825(byte arg0) {
        class304.field4079[2] = super.field4419 * super.field4399;
        class304.field4079[1] = super.field4414 * super.field4399;
        class304.field4079[0] = super.field4458 * super.field4399;
        int var2 = 62 / ((-24 - arg0) / 61);
        class304.field4079[3] = 1.0F;
        ++field5483;
        OpenGL.glLightfv(16384, 4609, class304.field4079, 0);
        class304.field4079[1] = -super.field4432 * super.field4414;
        class304.field4079[0] = -super.field4432 * super.field4458;
        class304.field4079[3] = 1.0F;
        class304.field4079[2] = -super.field4432 * super.field4419;
        OpenGL.glLightfv(16385, 4609, class304.field4079, 0);
    }

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "()V")
    public final void method829() {
        ++field5523;
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(Z)V")
    public final void method852(boolean arg0) {
        if (arg0) {
            ++field5510;
            OpenGL.glActiveTexture(super.field4425 + 33984);
        }
    }

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "(I)V")
    public final void method812(int arg0) {
        if (arg0 == 8) {
            OpenGL.glLightfv(16384, 4611, super.field4443, 0);
            ++field5500;
            OpenGL.glLightfv(16385, 4611, super.field4470, 0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)V")
    public final void method828(int arg0) {
        if (arg0 >= -111) {
            this.field5542 = null;
        }
        ++field5506;
        if (super.field4447) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
    }

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "(Z)V")
    public final void method833(boolean arg0) {
        if (class301.field4011 == super.field4474) {
            OpenGL.glBlendFunc(770, 771);
        } else if (class624.field8481 != super.field4474) {
            if (class604.field8250 == super.field4474) {
                OpenGL.glBlendFunc(774, 1);
            }
        } else {
            OpenGL.glBlendFunc(1, 1);
        }
        ++field5516;
        if (arg0) {
            this.field5554 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)V")
    public final void method834(int arg0, int arg1, int arg2, int arg3) {
        ++field5527;
    }

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "(I)V")
    public final void method832(int arg0) {
        ++field5488;
        class304.field4079[2] = super.field4475 * super.field4419;
        class304.field4079[1] = super.field4475 * super.field4414;
        class304.field4079[0] = super.field4475 * super.field4458;
        class304.field4079[3] = 1.0F;
        if (arg0 != 5) {
            this.method841(125);
        }
        OpenGL.glLightModelfv(2899, class304.field4079, 0);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "()V")
    public final void method827() {
        ++field5541;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)Lqr;")
    public final class213 method798(int arg0, boolean arg1) {
        ++field5534;
        if (arg1) {
            this.field5551 = null;
        }
        if (~arg0 != -4) {
            return arg0 == 4 ? new class593(this, super.field4231, super.field4351) : super.method798(arg0, arg1);
        } else {
            return new class475(this, super.field4231);
        }
    }

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "(B)V")
    public final void method786(byte arg0) {
        ++field5499;
        if (arg0 != -60) {
            this.method808((class50) null, 32, (class680) null);
        }
        int var2;
        if (super.field4431) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = super.field4471;
        } else {
            super.field4451 = (float) (-super.field4395 + super.field4424);
            super.field4478 = (float) (-super.field4439) + super.field4451;
            if (super.field4478 < (float) super.field4384) {
                super.field4478 = (float) super.field4384;
            }
            OpenGL.glFogf(2915, super.field4478);
            OpenGL.glFogf(2916, super.field4451);
            var2 = super.field4441;
        }
        class304.field4079[2] = (float) class230.method1424(255, var2) / 255.0F;
        class304.field4079[1] = (float) class230.method1424(var2, 65280) / 65280.0F;
        class304.field4079[0] = (float) class230.method1424(16711680, var2) / 1.671168E7F;
        OpenGL.glFogfv(2918, class304.field4079, 0);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(IB)V")
    public final synchronized void method2309(int arg0, byte arg1) {
        ++field5467;
        if (arg1 != -114) {
            this.method844((int[]) null, -13, 14, 45, false, -14, -110);
        }
        class28 var3 = new class28();
        var3.field272 = (long) arg0;
        this.field5537.method378(var3, 31316);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILvp;)V")
    public final void method809(int arg0, int arg1, class467 arg2) {
        ++field5478;
        if (arg0 != 1) {
            this.method843();
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIZILtk;)V")
    public final void method807(boolean arg0, int arg1, boolean arg2, int arg3, class73 arg4) {
        ++field5481;
        OpenGL.glTexEnvi(8960, arg1 + 34176, class419.method2435(arg4, true));
        if (!arg0) {
            OpenGL.glTexEnvi(8960, 34192 - -arg1, !arg2 ? 768 : 769);
        } else {
            OpenGL.glTexEnvi(8960, 34192 - -arg1, arg2 ? 771 : 770);
        }
        if (arg3 != -21480) {
            this.field5548 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "(B)V")
    public final void method848(byte arg0) {
        OpenGL.glViewport(super.field4450, super.field4464, super.field4345, super.field4340);
        ++field5540;
        int var2 = 47 / ((-49 - arg0) / 41);
    }

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "(I)V")
    public final void method816(int arg0) {
        ++field5526;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(super.field4420, 0);
        if (arg0 != 8) {
            this.method2308(20, -127, -127);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "()Z")
    public final boolean method811() {
        ++field5522;
        return false;
    }

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "(I)V")
    public final void method824(int arg0) {
        ++field5514;
        if (arg0 != 1) {
            field5517 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "(Z)V")
    public final void method795(boolean arg0) {
        ++field5502;
        for (int var2 = super.field4460 + -1; var2 >= 0; --var2) {
            OpenGL.glActiveTexture(33984 - -var2);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; ~var4 > -9; ++var4) {
            int var5 = 16384 - -var4;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field5469.setSwapInterval(0);
        super.method795(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method847(boolean arg0, Canvas arg1) {
        ++field5461;
        if (!arg0) {
            return null;
        } else {
            long var3 = this.field5469.prepareSurface(arg1);
            if (var3 == -1L) {
                throw new RuntimeException();
            } else {
                return new Long(var3);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILgo;IILfo;I)V")
    public final void method818(int arg0, int arg1, class526 arg2, int arg3, int arg4, class417 arg5, int arg6) {
        if (arg4 != -1) {
            this.field5543 = null;
        }
        ++field5513;
        byte var8;
        int var9;
        if (class315.field4530 == arg5) {
            var8 = 1;
            var9 = arg3 * 2;
        } else if (class321.field4713 == arg5) {
            var9 = arg3 + 1;
            var8 = 3;
        } else if (class319.field4687 != arg5) {
            if (class490.field6606 == arg5) {
                var9 = arg3 + 2;
                var8 = 6;
            } else if (class489.field6602 != arg5) {
                var9 = arg3;
                var8 = 0;
            } else {
                var8 = 5;
                var9 = arg3 + 2;
            }
        } else {
            var8 = 4;
            var9 = arg3 * 3;
        }
        class680 var10 = arg2.method2310((byte) -80);
        class466 var11 = (class466) arg2;
        var11.method1451(-122);
        OpenGL.glDrawElements(var8, var9, class202.method1272((byte) 110, var10), var11.method1452(18456) - -((long) (var10.field9661 * arg6)));
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLe;Lpq;I)V")
    public class381(OpenGL arg0, Canvas arg1, long arg2, class479 arg3, class159 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field5469 = arg0;
            this.field5469.method3347();
            this.field5551 = OpenGL.glGetString(7936).toLowerCase();
            this.field5554 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field5551.indexOf("microsoft") == 0 && ~this.field5551.indexOf("brian paul") == 0 && this.field5551.indexOf("mesa") == -1) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class105.method562(var8.replace('.', ' '), ' ', true);
                if (var9.length >= 2) {
                    try {
                        int var10 = class433.method2495(var9[0], 0);
                        int var11 = class433.method2495(var9[1], 0);
                        this.field5550 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field5550 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field5469.method3348("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field5469.method3348("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field4460 = var12[0];
                        if (super.field4460 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field4387 = 8;
                            this.field5545 = this.field5469.method3348("GL_ARB_vertex_buffer_object");
                            super.field4468 = this.field5469.method3348("GL_ARB_multisample");
                            this.field5547 = this.field5469.method3348("GL_ARB_texture_rectangle");
                            super.field4390 = this.field5469.method3348("GL_ARB_texture_cube_map");
                            this.field5553 = this.field5469.method3348("GL_ARB_texture_non_power_of_two");
                            super.field4423 = this.field5469.method3348("GL_EXT_texture3D");
                            this.field5469.method3348("GL_ARB_vertex_shader");
                            this.field5548 = this.field5469.method3348("GL_ARB_vertex_program");
                            this.field5469.method3348("GL_ARB_fragment_shader");
                            this.field5469.method3348("GL_ARB_fragment_program");
                            this.field5546 = Stream.method1519() ? 33639 : 5121;
                            if (this.field5554.indexOf("radeon") != -1) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class105.method562(this.field5554.replace('/', ' '), ' ', true);
                                for (int var17 = 0; ~var16.length < ~var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (var18.charAt(0) == 'x' && var18.length() >= 3 && class224.method1371(var18.substring(1, 3), (byte) 98)) {
                                                var15 = true;
                                                var18 = var18.substring(1);
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var14 = true;
                                                    var18 = var18.substring(2);
                                                }
                                                if (~var18.length() <= -5 && class224.method1371(var18.substring(0, 4), (byte) -52)) {
                                                    var13 = class433.method2495(var18.substring(0, 4), 0);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (~var13 <= -7001 && ~var13 >= -8000) {
                                        this.field5545 = false;
                                    }
                                    if (~var13 <= -7001 && ~var13 >= -9251) {
                                        super.field4423 = false;
                                    }
                                }
                                this.field5547 &= this.field5469.method3348("GL_ARB_half_float_pixel");
                            }
                            this.field5551.indexOf("intel");
                            if (this.field5545) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                            this.field5552 = new int[super.field4460];
                            OpenGL.glClear(16640);
                            this.field5469.swapBuffers();
                            OpenGL.glClear(16640);
                        }
                    }
                } else {
                    throw new RuntimeException("");
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method843();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "(I)V")
    public final void method841(int arg0) {
        class304.field4079[1] = (float) class230.method1424(super.field4477, 65280) / 65280.0F;
        class304.field4079[3] = (float) (super.field4477 >>> 24) / 255.0F;
        ++field5496;
        class304.field4079[0] = (float) class230.method1424(16711680, super.field4477) / 1.671168E7F;
        int var2 = -29 % ((39 - arg0) / 46);
        class304.field4079[2] = (float) class230.method1424(255, super.field4477) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class304.field4079, 0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIILnl;BII[F)Lsd;")
    public final class595 method789(boolean arg0, int arg1, int arg2, class50 arg3, byte arg4, int arg5, int arg6, float[] arg7) {
        if (arg4 != 106) {
            return null;
        } else {
            ++field5476;
            if (!this.field5553 && (!class144.method986(arg6, (byte) -119) || !class144.method986(arg5, (byte) -125))) {
                if (!this.field5547) {
                    class297 var9 = new class297(this, arg3, class680.field9668, class306.method1837((byte) -120, arg6), class306.method1837((byte) -125, arg5));
                    var9.method1777(arg7, 0, arg6, arg1, 0, arg2, arg5, arg3, true);
                    return var9;
                } else {
                    return new class376(this, arg3, arg6, arg5, arg7, arg1, arg2);
                }
            } else {
                return new class297(this, arg3, arg6, arg5, arg0, arg7, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
    public final void method815(Object arg0, byte arg1, Canvas arg2) {
        ++field5484;
        Long var4 = (Long) arg0;
        this.field5469.surfaceResized(var4);
        if (arg1 != 31) {
            this.method785(-35);
        }
    }

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "(I)V")
    public final void method857(int arg0) {
        ++field5519;
        int var2;
        for (var2 = 0; var2 < super.field4469; ++var2) {
            class329 var3 = super.field4465[var2];
            int var4 = var3.method2109(14463);
            int var5 = var2 + 16386;
            float var6 = var3.method2113((byte) 86) / 255.0F;
            class304.field4079[0] = (float) var3.method2112(class599.method3320(arg0, -3136));
            class304.field4079[1] = (float) var3.method2115((byte) -63);
            class304.field4079[2] = (float) var3.method2114((byte) -112);
            class304.field4079[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class304.field4079, 0);
            class304.field4079[2] = var6 * (float) class230.method1424(255, var4);
            class304.field4079[0] = var6 * (float) (class230.method1424(16729805, var4) >> 16);
            class304.field4079[3] = 1.0F;
            class304.field4079[1] = (float) class230.method1424(var4 >> 8, 255) * var6;
            OpenGL.glLightfv(var5, 4609, class304.field4079, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method2110(true) * var3.method2110(true)));
            OpenGL.glEnable(var5);
        }
        while (var2 < super.field4479) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method857(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "()V")
    public final void method805() throws class352 {
        ++field5518;
        this.field5469.swapBuffers();
    }

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "(B)V")
    public final void method800(byte arg0) {
        if (arg0 == -46) {
            if (super.field4413 && super.field4409 && super.field4431 | ~super.field4439 <= -1) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
            ++field5485;
        }
    }

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "()V")
    public final void method801() {
        ++field5470;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZ)Lgo;")
    public final class526 method850(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method834(-79, -22, 100, 36);
        }
        ++field5479;
        return new class466(this, class680.field9665, arg1);
    }
}
