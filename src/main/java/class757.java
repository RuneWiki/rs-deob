import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class757 extends class703 {

    @OriginalMember(owner = "client!sha", name = "Ch", descriptor = "Lqw;")
    private class84 field10270 = new class84();

    @OriginalMember(owner = "client!sha", name = "ui", descriptor = "Lqw;")
    private class84 field10314 = new class84();

    @OriginalMember(owner = "client!sha", name = "zi", descriptor = "Lqw;")
    private class84 field10319 = new class84();

    @OriginalMember(owner = "client!sha", name = "Bi", descriptor = "Lqw;")
    private class84 field10321 = new class84();

    @OriginalMember(owner = "client!sha", name = "Ci", descriptor = "Lqw;")
    private class84 field10322 = new class84();

    @OriginalMember(owner = "client!sha", name = "Di", descriptor = "Lqw;")
    private class84 field10323 = new class84();

    @OriginalMember(owner = "client!sha", name = "Ei", descriptor = "Lqw;")
    private class84 field10324 = new class84();

    @OriginalMember(owner = "client!sha", name = "Ji", descriptor = "[Lni;")
    private class547[] field10329 = new class547[16];

    @OriginalMember(owner = "client!sha", name = "Ii", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field10328 = new MapBuffer();

    @OriginalMember(owner = "client!sha", name = "Oi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field10334 = new MapBuffer();

    @OriginalMember(owner = "client!sha", name = "Ti", descriptor = "I")
    private int field10339 = 0;

    @OriginalMember(owner = "client!sha", name = "gi", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field10300;

    @OriginalMember(owner = "client!sha", name = "Wi", descriptor = "Ljava/lang/String;")
    private String field10342;

    @OriginalMember(owner = "client!sha", name = "Yi", descriptor = "Ljava/lang/String;")
    private String field10344;

    @OriginalMember(owner = "client!sha", name = "Ri", descriptor = "I")
    private int field10337;

    @OriginalMember(owner = "client!sha", name = "Pi", descriptor = "Z")
    public boolean field10335;

    @OriginalMember(owner = "client!sha", name = "aj", descriptor = "Z")
    private boolean field10346;

    @OriginalMember(owner = "client!sha", name = "Xi", descriptor = "Z")
    private boolean field10343;

    @OriginalMember(owner = "client!sha", name = "Zi", descriptor = "Z")
    public boolean field10345;

    @OriginalMember(owner = "client!sha", name = "Ui", descriptor = "Z")
    public boolean field10340;

    @OriginalMember(owner = "client!sha", name = "Si", descriptor = "Z")
    public boolean field10338;

    @OriginalMember(owner = "client!sha", name = "Vi", descriptor = "[I")
    public int[] field10341;

    @OriginalMember(owner = "client!sha", name = "Qi", descriptor = "I")
    public int field10336;

    @OriginalMember(owner = "client!sha", name = "Lh", descriptor = "F")
    public static float field10279;

    @OriginalMember(owner = "client!sha", name = "Og", descriptor = "I")
    public static int field10230;

    @OriginalMember(owner = "client!sha", name = "Pg", descriptor = "I")
    public static int field10231;

    @OriginalMember(owner = "client!sha", name = "Qg", descriptor = "I")
    public static int field10232;

    @OriginalMember(owner = "client!sha", name = "Rg", descriptor = "I")
    public static int field10233;

    @OriginalMember(owner = "client!sha", name = "Sg", descriptor = "I")
    public static int field10234;

    @OriginalMember(owner = "client!sha", name = "Tg", descriptor = "I")
    public static int field10235;

    @OriginalMember(owner = "client!sha", name = "Ug", descriptor = "I")
    public static int field10236;

    @OriginalMember(owner = "client!sha", name = "Vg", descriptor = "I")
    public static int field10237;

    @OriginalMember(owner = "client!sha", name = "Wg", descriptor = "I")
    public static int field10238;

    @OriginalMember(owner = "client!sha", name = "Xg", descriptor = "I")
    public static int field10239;

    @OriginalMember(owner = "client!sha", name = "Yg", descriptor = "I")
    public static int field10240;

    @OriginalMember(owner = "client!sha", name = "Zg", descriptor = "I")
    public static int field10241;

    @OriginalMember(owner = "client!sha", name = "ah", descriptor = "I")
    public static int field10242;

    @OriginalMember(owner = "client!sha", name = "bh", descriptor = "I")
    public static int field10243;

    @OriginalMember(owner = "client!sha", name = "ch", descriptor = "I")
    public static int field10244;

    @OriginalMember(owner = "client!sha", name = "dh", descriptor = "I")
    public static int field10245;

    @OriginalMember(owner = "client!sha", name = "eh", descriptor = "I")
    public static int field10246;

    @OriginalMember(owner = "client!sha", name = "gh", descriptor = "I")
    public static int field10248;

    @OriginalMember(owner = "client!sha", name = "hh", descriptor = "I")
    public static int field10249;

    @OriginalMember(owner = "client!sha", name = "ih", descriptor = "I")
    public static int field10250;

    @OriginalMember(owner = "client!sha", name = "jh", descriptor = "I")
    public static int field10251;

    @OriginalMember(owner = "client!sha", name = "kh", descriptor = "I")
    public static int field10252;

    @OriginalMember(owner = "client!sha", name = "lh", descriptor = "I")
    public static int field10253;

    @OriginalMember(owner = "client!sha", name = "mh", descriptor = "I")
    public static int field10254;

    @OriginalMember(owner = "client!sha", name = "nh", descriptor = "I")
    public static int field10255;

    @OriginalMember(owner = "client!sha", name = "oh", descriptor = "I")
    public static int field10256;

    @OriginalMember(owner = "client!sha", name = "ph", descriptor = "I")
    public static int field10257;

    @OriginalMember(owner = "client!sha", name = "qh", descriptor = "I")
    public static int field10258;

    @OriginalMember(owner = "client!sha", name = "rh", descriptor = "I")
    public static int field10259;

    @OriginalMember(owner = "client!sha", name = "sh", descriptor = "I")
    public static int field10260;

    @OriginalMember(owner = "client!sha", name = "th", descriptor = "I")
    public static int field10261;

    @OriginalMember(owner = "client!sha", name = "uh", descriptor = "I")
    public static int field10262;

    @OriginalMember(owner = "client!sha", name = "vh", descriptor = "I")
    public static int field10263;

    @OriginalMember(owner = "client!sha", name = "wh", descriptor = "I")
    public static int field10264;

    @OriginalMember(owner = "client!sha", name = "xh", descriptor = "I")
    public static int field10265;

    @OriginalMember(owner = "client!sha", name = "yh", descriptor = "I")
    public static int field10266;

    @OriginalMember(owner = "client!sha", name = "zh", descriptor = "I")
    public static int field10267;

    @OriginalMember(owner = "client!sha", name = "Ah", descriptor = "I")
    public static int field10268;

    @OriginalMember(owner = "client!sha", name = "Bh", descriptor = "I")
    public static int field10269;

    @OriginalMember(owner = "client!sha", name = "Dh", descriptor = "I")
    public static int field10271;

    @OriginalMember(owner = "client!sha", name = "Eh", descriptor = "I")
    public static int field10272;

    @OriginalMember(owner = "client!sha", name = "Fh", descriptor = "I")
    public static int field10273;

    @OriginalMember(owner = "client!sha", name = "Gh", descriptor = "I")
    public static int field10274;

    @OriginalMember(owner = "client!sha", name = "Hh", descriptor = "I")
    public static int field10275;

    @OriginalMember(owner = "client!sha", name = "Ih", descriptor = "I")
    public static int field10276;

    @OriginalMember(owner = "client!sha", name = "Jh", descriptor = "I")
    public static int field10277;

    @OriginalMember(owner = "client!sha", name = "Kh", descriptor = "I")
    public static int field10278;

    @OriginalMember(owner = "client!sha", name = "Mh", descriptor = "I")
    public static int field10280;

    @OriginalMember(owner = "client!sha", name = "Nh", descriptor = "I")
    public static int field10281;

    @OriginalMember(owner = "client!sha", name = "Oh", descriptor = "I")
    public static int field10282;

    @OriginalMember(owner = "client!sha", name = "Ph", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!sha", name = "Qh", descriptor = "I")
    public static int field10284;

    @OriginalMember(owner = "client!sha", name = "Rh", descriptor = "I")
    public static int field10285;

    @OriginalMember(owner = "client!sha", name = "Sh", descriptor = "I")
    public static int field10286;

    @OriginalMember(owner = "client!sha", name = "Th", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!sha", name = "Uh", descriptor = "I")
    public static int field10288;

    @OriginalMember(owner = "client!sha", name = "Vh", descriptor = "I")
    public static int field10289;

    @OriginalMember(owner = "client!sha", name = "Wh", descriptor = "I")
    public static int field10290;

    @OriginalMember(owner = "client!sha", name = "Xh", descriptor = "I")
    public static int field10291;

    @OriginalMember(owner = "client!sha", name = "Yh", descriptor = "I")
    public static int field10292;

    @OriginalMember(owner = "client!sha", name = "Zh", descriptor = "I")
    public static int field10293;

    @OriginalMember(owner = "client!sha", name = "ai", descriptor = "I")
    public static int field10294;

    @OriginalMember(owner = "client!sha", name = "bi", descriptor = "I")
    public static int field10295;

    @OriginalMember(owner = "client!sha", name = "ci", descriptor = "I")
    public static int field10296;

    @OriginalMember(owner = "client!sha", name = "di", descriptor = "I")
    public static int field10297;

    @OriginalMember(owner = "client!sha", name = "ei", descriptor = "I")
    public static int field10298;

    @OriginalMember(owner = "client!sha", name = "fi", descriptor = "I")
    public static int field10299;

    @OriginalMember(owner = "client!sha", name = "hi", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!sha", name = "ii", descriptor = "I")
    public static int field10302;

    @OriginalMember(owner = "client!sha", name = "ji", descriptor = "I")
    public static int field10303;

    @OriginalMember(owner = "client!sha", name = "ki", descriptor = "I")
    public static int field10304;

    @OriginalMember(owner = "client!sha", name = "li", descriptor = "I")
    public static int field10305;

    @OriginalMember(owner = "client!sha", name = "mi", descriptor = "I")
    public static int field10306;

    @OriginalMember(owner = "client!sha", name = "ni", descriptor = "I")
    public static int field10307;

    @OriginalMember(owner = "client!sha", name = "oi", descriptor = "I")
    public static int field10308;

    @OriginalMember(owner = "client!sha", name = "pi", descriptor = "I")
    public static int field10309;

    @OriginalMember(owner = "client!sha", name = "qi", descriptor = "I")
    public static int field10310;

    @OriginalMember(owner = "client!sha", name = "ri", descriptor = "I")
    public static int field10311;

    @OriginalMember(owner = "client!sha", name = "si", descriptor = "I")
    public static int field10312;

    @OriginalMember(owner = "client!sha", name = "ti", descriptor = "I")
    public static int field10313;

    @OriginalMember(owner = "client!sha", name = "vi", descriptor = "I")
    public static int field10315;

    @OriginalMember(owner = "client!sha", name = "wi", descriptor = "I")
    public static int field10316;

    @OriginalMember(owner = "client!sha", name = "xi", descriptor = "I")
    public static int field10317;

    @OriginalMember(owner = "client!sha", name = "yi", descriptor = "I")
    public static int field10318;

    @OriginalMember(owner = "client!sha", name = "Ai", descriptor = "I")
    public static int field10320;

    @OriginalMember(owner = "client!sha", name = "Li", descriptor = "I")
    private int field10331;

    @OriginalMember(owner = "client!sha", name = "Ni", descriptor = "J")
    private long field10333;

    @OriginalMember(owner = "client!sha", name = "fh", descriptor = "Ltga;")
    public static class64 field10247;

    @OriginalMember(owner = "client!sha", name = "Fi", descriptor = "Z")
    private boolean field10325;

    @OriginalMember(owner = "client!sha", name = "Gi", descriptor = "Z")
    private boolean field10326;

    @OriginalMember(owner = "client!sha", name = "Hi", descriptor = "Z")
    private boolean field10327;

    @OriginalMember(owner = "client!sha", name = "Ki", descriptor = "Z")
    private boolean field10330;

    @OriginalMember(owner = "client!sha", name = "Mi", descriptor = "Z")
    private boolean field10332;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public final Object method2790(Canvas arg0, int arg1) {
        ++field10251;
        if (arg1 < 83) {
            this.field10319 = null;
        }
        long var3 = this.field10300.prepareSurface(arg0);
        if (~var3 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZB)Lra;")
    public final class118 method2813(boolean arg0, byte arg1) {
        ++field10265;
        if (arg1 > -97) {
            this.method2769((byte) -109, (class166) null, (class415) null);
        }
        return new class206(this, class415.field5987, arg0);
    }

    @OriginalMember(owner = "client!sha", name = "m", descriptor = "(I)V")
    public final void method2761(int arg0) {
        if (arg0 != 7) {
            this.method2781(97);
        }
        OpenGL.glActiveTexture(super.field9508 + 33984);
        ++field10306;
    }

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "(B)V")
    public final void method2774(byte arg0) {
        if (!super.field9543) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
        if (arg0 <= 85) {
            this.method531((class720) null, (class720) null, -0.4454757F, (class720) null);
        }
        ++field10237;
    }

    @OriginalMember(owner = "client!sha", name = "i", descriptor = "(Z)V")
    public final void method2759(boolean arg0) {
        ++field10301;
        super.field9518 = (float) (-super.field9548 + super.field9533);
        super.field9556 = super.field9518 - (float) super.field9569;
        if ((float) super.field9571 > super.field9556) {
            super.field9556 = (float) super.field9571;
        }
        OpenGL.glFogf(2915, super.field9556);
        OpenGL.glFogf(2916, super.field9518);
        class544.field7522[2] = (float) class519.method3018(255, super.field9515) / 255.0F;
        class544.field7522[0] = (float) class519.method3018(16711680, super.field9515) / 1.671168E7F;
        class544.field7522[1] = (float) class519.method3018(65280, super.field9515) / 65280.0F;
        if (!arg0) {
            OpenGL.glFogfv(2918, class544.field7522, 0);
        }
    }

    @OriginalMember(owner = "client!sha", name = "t", descriptor = "(B)V")
    public final void method2758(byte arg0) {
        if (!super.field9535) {
            OpenGL.glDisable(3008);
        } else {
            OpenGL.glEnable(3008);
        }
        ++field10315;
        if (arg0 != -30) {
            this.method2803((byte) 92);
        }
    }

    @OriginalMember(owner = "client!sha", name = "o", descriptor = "()V")
    public final void method482() {
        ++field10236;
        if (~super.field9469 < -1 || ~super.field9440 < -1) {
            int var1 = super.field9522;
            int var2 = super.field9599;
            int var3 = super.field9512;
            int var4 = super.field9574;
            this.method526();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3862((byte) 18);
            this.method3853(false, -105);
            this.method3894(16544, false);
            this.method3887(false, true);
            this.method3849((byte) 54, false);
            this.method3882(0, (class352) null);
            this.method3863(false, -2, 27016, false);
            this.method3871(0, 1);
            this.method3893(114, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field9469, super.field9440, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method453(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!sha", name = "l", descriptor = "()V")
    public final void method476() {
        ++field10263;
        super.method476();
        if (this.field10300 != null) {
            this.field10300.method3611();
            this.field10300.release();
            this.field10300 = null;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public final void method2811(Canvas arg0, byte arg1, Object arg2) {
        if (arg1 == 67) {
            ++field10260;
            Long var4 = (Long) arg2;
            this.field10300.surfaceResized(var4);
        }
    }

    @OriginalMember(owner = "client!sha", name = "GA", descriptor = "(I)V")
    public final void method493(int arg0) {
        ++field10316;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!sha", name = "n", descriptor = "(II)V")
    public final synchronized void method4147(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field10270 = null;
        }
        ++field10233;
        class159 var3 = new class159();
        var3.field2146 = (long) arg1;
        this.field10323.method689(var3, arg0 ^ 118);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZI[FIIILg;)Lfk;")
    public final class678 method2805(int arg0, boolean arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, class166 arg7) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field10258;
            if (!this.field10343 && (!class439.method2627(0, arg6) || !class439.method2627(0, arg4))) {
                if (!this.field10346) {
                    class93 var9 = new class93(this, arg7, class415.field5990, class8.method45(23714, arg6), class8.method45(23714, arg4));
                    var9.method728(0, arg6, arg5, arg4, (byte) -109, arg3, 0, arg7, arg2);
                    return var9;
                } else {
                    return new class77(this, arg7, arg6, arg4, arg3, arg2, arg5);
                }
            } else {
                return new class93(this, arg7, arg6, arg4, arg1, arg3, arg2, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILsia;)V")
    public final void method2765(int arg0, class765 arg1) {
        ++field10231;
        int var3 = -87 % ((arg0 - 32) / 52);
        if (class96.field1374 != arg1) {
            int var4 = class711.method3946(arg1, 5);
            OpenGL.glTexGeni(8192, 9472, var4);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var4);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var4);
            OpenGL.glEnable(3170);
        } else {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(II)Lrr;")
    public final class381 method437(int arg0, int arg1) {
        ++field10302;
        return null;
    }

    @OriginalMember(owner = "client!sha", name = "j", descriptor = "(B)V")
    public final void method2764(byte arg0) {
        ++field10281;
        int var2 = this.field10341[super.field9508];
        if (var2 != 0) {
            this.field10341[super.field9508] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
        if (arg0 != 127) {
            this.field10330 = true;
        }
    }

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "(II)Lio;")
    public final class461 method498(int arg0, int arg1) {
        ++field10289;
        return null;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIII)V")
    public final void method486(int arg0, int arg1, int arg2, int arg3) {
        ++field10272;
    }

    @OriginalMember(owner = "client!sha", name = "n", descriptor = "(B)V")
    public final void method2777(byte arg0) {
        ++field10230;
        if (arg0 != -78) {
            field10279 = -0.05386129F;
        }
        if (super.field9630) {
            OpenGL.glEnable(3089);
        } else {
            OpenGL.glDisable(3089);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method521(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class283 {
        this.method471(arg2, arg3);
        ++field10313;
    }

    @OriginalMember(owner = "client!sha", name = "u", descriptor = "(I)V")
    public final void method2766(int arg0) {
        this.method3880(8);
        ++field10273;
        int var2;
        for (var2 = 0; super.field9516 > var2; ++var2) {
            class127 var3 = super.field9561[var2];
            int var4 = var3.method898(-99);
            int var5 = var2 + 16386;
            float var6 = var3.method902(0) / 255.0F;
            class544.field7522[0] = (float) var3.method899(true);
            class544.field7522[1] = (float) var3.method904(-118);
            class544.field7522[2] = (float) var3.method901((byte) -115);
            class544.field7522[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class544.field7522, 0);
            class544.field7522[0] = var6 * (float) class519.method3018(255, var4 >> 16);
            class544.field7522[1] = (float) class519.method3018(var4 >> 8, 255) * var6;
            class544.field7522[3] = 1.0F;
            class544.field7522[2] = var6 * (float) class519.method3018(var4, 255);
            OpenGL.glLightfv(var5, 4609, class544.field7522, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method903((byte) -122) * var3.method903((byte) -122)));
            OpenGL.glEnable(var5);
        }
        while (super.field9572 > var2) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        super.method2766(arg0);
    }

    @OriginalMember(owner = "client!sha", name = "D", descriptor = "(I)V")
    public final void method2781(int arg0) {
        OpenGL.glViewport(super.field9510, super.field9536, super.field9469, super.field9440);
        if (arg0 != 0) {
            this.field10334 = null;
        }
        ++field10320;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lhg;)V")
    public final void method554(class718 arg0) {
        ++field10257;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IBI)V")
    public final synchronized void method4148(int arg0, byte arg1, int arg2) {
        int var4 = 66 / ((arg1 - 76) / 49);
        ++field10256;
        class445 var5 = new class445(arg2);
        var5.field2146 = (long) arg0;
        this.field10319.method689(var5, 0);
    }

    @OriginalMember(owner = "client!sha", name = "I", descriptor = "()I")
    public final int method445() {
        ++field10240;
        return this.field10339;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lcj;Lcj;FLcj;)Lcj;")
    public final class720 method531(class720 arg0, class720 arg1, float arg2, class720 arg3) {
        ++field10305;
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIIILfga;ILra;)V")
    public final void method2820(int arg0, int arg1, int arg2, int arg3, class269 arg4, int arg5, class118 arg6) {
        ++field10255;
        int var8;
        byte var9;
        if (class687.field9184 != arg4) {
            if (class84.field1198 == arg4) {
                var8 = arg0 + 1;
                var9 = 3;
            } else if (class356.field5191 == arg4) {
                var8 = arg0 * 3;
                var9 = 4;
            } else if (class9.field88 != arg4) {
                if (class553.field7635 != arg4) {
                    var8 = arg0;
                    var9 = 0;
                } else {
                    var8 = arg0 + 2;
                    var9 = 5;
                }
            } else {
                var9 = 6;
                var8 = arg0 + 2;
            }
        } else {
            var8 = arg0 * 2;
            var9 = 1;
        }
        class415 var10 = arg6.method848((byte) -92);
        class206 var11 = (class206) arg6;
        var11.method2449(arg2 + 13847);
        OpenGL.glDrawElements(var9, var8, class195.method1284(5125, var10), var11.method2453(false) + (long) (var10.field5982 * arg1));
        if (arg2 != -13847) {
            this.field10329 = null;
        }
    }

    @OriginalMember(owner = "client!sha", name = "u", descriptor = "()V")
    public final void method514() {
        ++field10282;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lwj;IBILg;)Lfk;")
    public final class678 method2793(class415 arg0, int arg1, byte arg2, int arg3, class166 arg4) {
        ++field10312;
        if (arg2 >= -62) {
            this.method2800(43);
        }
        if (!this.field10343 && (!class439.method2627(0, arg3) || !class439.method2627(0, arg1))) {
            return this.field10346 ? new class77(this, arg4, arg0, arg3, arg1) : new class93(this, arg4, arg0, class8.method45(23714, arg3), class8.method45(23714, arg1));
        } else {
            return new class93(this, arg4, arg0, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!sha", name = "x", descriptor = "(B)V")
    public final void method2762(byte arg0) {
        this.method4150(0);
        ++field10297;
        if (arg0 > -24) {
            this.field10326 = true;
        }
    }

    @OriginalMember(owner = "client!sha", name = "eb", descriptor = "(I)V")
    public final void method2798(int arg0) {
        if (!super.field9549) {
            OpenGL.glDisable(2929);
        } else {
            OpenGL.glEnable(2929);
        }
        if (arg0 >= -61) {
            this.method2818(true, (class373) null, -38);
        }
        ++field10267;
    }

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "(Z)V")
    public final void method2799(boolean arg0) {
        OpenGL.glScissor(super.field9522 + super.field9510, super.field9440 - super.field9574 + super.field9536, -super.field9522 + super.field9599, -super.field9512 + super.field9574);
        if (!arg0) {
            this.field10342 = null;
        }
        ++field10250;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILg;III[B)Lor;")
    public final class665 method2783(int arg0, class166 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg0 != -25885) {
            this.field10321 = null;
        }
        ++field10245;
        return new class173(this, arg1, arg4, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!sha", name = "ya", descriptor = "()V")
    public final void method547() {
        this.method3849((byte) 54, true);
        ++field10261;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(III)V")
    public final synchronized void method4149(int arg0, int arg1, int arg2) {
        if (arg1 != 12246) {
            this.field10344 = null;
        }
        ++field10288;
        class445 var4 = new class445(arg0);
        var4.field2146 = (long) arg2;
        this.field10314.method689(var4, arg1 ^ -12280);
    }

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "(B)V")
    public final void method2771(byte arg0) {
        if (arg0 >= -56) {
            this.method482();
        }
        OpenGL.glMatrixMode(5889);
        ++field10295;
        OpenGL.glLoadMatrixf(super.field9554, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZLkm;I)V")
    public final void method2818(boolean arg0, class373 arg1, int arg2) {
        if (arg0) {
            this.field10330 = true;
        }
        this.field10329[arg2] = (class547) arg1;
        ++field10276;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLeda;)V")
    public final void method2816(byte arg0, class110 arg1) {
        ++field10243;
        class92[] var3 = ((class15) arg1).field147;
        int var4 = 0;
        if (arg0 >= 78) {
            boolean var5 = false;
            boolean var6 = false;
            boolean var7 = false;
            for (int var8 = 0; var8 < var3.length; ++var8) {
                class92 var11 = var3[var8];
                class547 var12 = this.field10329[var8];
                int var13 = 0;
                int var14 = var12.method3152((byte) 88);
                long var15 = var12.method2453(false);
                var12.method2449(0);
                for (int var17 = 0; var17 < var11.method726(99); ++var17) {
                    class382 var18 = var11.method722(var17, 119);
                    if (class382.field5542 != var18) {
                        if (class382.field5546 == var18) {
                            OpenGL.glNormalPointer(5126, var14, (long) var13 + var15);
                            var6 = true;
                        } else if (class382.field5550 == var18) {
                            var5 = true;
                            OpenGL.glColorPointer(4, 5121, var14, var15 - -((long) var13));
                        } else if (class382.field5551 != var18) {
                            if (class382.field5552 != var18) {
                                if (class382.field5553 == var18) {
                                    OpenGL.glClientActiveTexture(var4++ + 33984);
                                    OpenGL.glTexCoordPointer(3, 5126, var14, (long) var13 + var15);
                                } else if (class382.field5554 == var18) {
                                    OpenGL.glClientActiveTexture(33984 - -(var4++));
                                    OpenGL.glTexCoordPointer(4, 5126, var14, var15 - -((long) var13));
                                }
                            } else {
                                OpenGL.glClientActiveTexture(33984 - -(var4++));
                                OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                            }
                        } else {
                            OpenGL.glClientActiveTexture(var4++ + 33984);
                            OpenGL.glTexCoordPointer(1, 5126, var14, (long) var13 + var15);
                        }
                    } else {
                        OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                        var7 = true;
                    }
                    var13 += var18.field5548;
                }
            }
            if (this.field10327 != var7) {
                if (var7) {
                    OpenGL.glEnableClientState(32884);
                } else {
                    OpenGL.glDisableClientState(32884);
                }
                this.field10327 = var7;
            }
            if (this.field10325 != var6) {
                if (var6) {
                    OpenGL.glEnableClientState(32885);
                } else {
                    OpenGL.glDisableClientState(32885);
                }
                this.field10325 = var6;
            }
            if (this.field10330 == !var5) {
                if (!var5) {
                    OpenGL.glDisableClientState(32886);
                } else {
                    OpenGL.glEnableClientState(32886);
                }
                this.field10330 = var5;
            }
            if (~var4 >= ~this.field10331) {
                if (~var4 > ~this.field10331) {
                    for (int var9 = var4; ~this.field10331 < ~var9; ++var9) {
                        OpenGL.glClientActiveTexture(var9 + 33984);
                        OpenGL.glDisableClientState(32888);
                    }
                    this.field10331 = var4;
                    return;
                }
            } else {
                for (int var10 = this.field10331; var10 < var4; ++var10) {
                    OpenGL.glClientActiveTexture(var10 + 33984);
                    OpenGL.glEnableClientState(32888);
                }
                this.field10331 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!sha", name = "cb", descriptor = "(I)V")
    public final void method2788(int arg0) {
        OpenGL.glMatrixMode(5890);
        ++field10318;
        if (arg0 == 4) {
            if (super.field9530[super.field9508] != class183.field2405) {
                OpenGL.glLoadMatrixf(super.field9566[super.field9508].method3077(class151.field2057, 113), 0);
            } else {
                OpenGL.glLoadIdentity();
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZIII[III)Lfk;")
    public final class678 method2814(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        ++field10268;
        if (arg5 >= -88) {
            return null;
        } else if (!this.field10343 && (!class439.method2627(0, arg3) || !class439.method2627(0, arg2))) {
            if (!this.field10346) {
                class93 var8 = new class93(this, class109.field1521, class415.field5986, class8.method45(23714, arg3), class8.method45(23714, arg2));
                var8.method620(arg1, 0, arg3, 0, arg6, arg4, 114, arg2);
                return var8;
            } else {
                return new class77(this, arg3, arg2, arg4, arg1, arg6);
            }
        } else {
            return new class93(this, arg3, arg2, arg0, arg4, arg1, arg6);
        }
    }

    @OriginalMember(owner = "client!sha", name = "na", descriptor = "(IIII)[I")
    public final int[] method439(int arg0, int arg1, int arg2, int arg3) {
        ++field10248;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 - 1 + -arg1 + super.field9440, arg2, 1, 32993, this.field10336, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!sha", name = "A", descriptor = "()Ldca;")
    public final class189 method542() {
        ++field10241;
        int var1 = -1;
        if (this.field10342.indexOf("nvidia") == -1) {
            if (this.field10342.indexOf("intel") != -1) {
                var1 = 32902;
            } else if (~this.field10342.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class189(var1, "OpenGL", this.field10337, this.field10344, 0L);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "([Lrf;Z)Leda;")
    public final class110 method2791(class92[] arg0, boolean arg1) {
        ++field10232;
        if (arg1) {
            this.method2821((byte) 54);
        }
        return new class15(arg0);
    }

    @OriginalMember(owner = "client!sha", name = "w", descriptor = "()V")
    public final void method535() {
        OpenGL.glFinish();
        ++field10253;
    }

    @OriginalMember(owner = "client!sha", name = "J", descriptor = "(I)V")
    private final void method4150(int arg0) {
        ++field10299;
        if (this.field10332) {
            OpenGL.glPopMatrix();
        }
        if (!super.field9605.method213(arg0 + arg0)) {
            if (super.field9491) {
                OpenGL.glLoadIdentity();
                this.field10332 = false;
            } else {
                OpenGL.glLoadMatrixf(super.field9501.method3077(class151.field2057, 115), 0);
                this.field10332 = false;
            }
        } else {
            if (!this.field10326) {
                OpenGL.glLoadMatrixf(super.field9504.method3077(class151.field2057, 119), 0);
                this.field10326 = true;
                this.method2801((byte) -42);
                this.method2766(11);
            }
            if (super.field9491) {
                this.field10332 = false;
            } else {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field9501.method3077(class151.field2057, 126), 0);
                this.field10332 = true;
            }
        }
    }

    @OriginalMember(owner = "client!sha", name = "L", descriptor = "(I)V")
    public final void method2804(int arg0) {
        if (arg0 == -14214) {
            ++field10275;
            for (int var2 = super.field9547 + -1; ~var2 <= -1; --var2) {
                OpenGL.glActiveTexture(var2 + 33984);
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
            OpenGL.glAlphaFunc(516, 0.0F);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glColorMaterial(1028, 5634);
            OpenGL.glEnable(2903);
            float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
            for (int var4 = 0; ~var4 > -9; ++var4) {
                int var5 = var4 + 16384;
                OpenGL.glLightfv(var5, 4608, var3, 0);
                OpenGL.glLightf(var5, 4615, 0.0F);
                OpenGL.glLightf(var5, 4616, 0.0F);
            }
            OpenGL.glFogf(2914, 0.95F);
            OpenGL.glFogi(2917, 9729);
            OpenGL.glHint(3156, 4353);
            this.field10300.setSwapInterval(0);
            super.method2804(arg0);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILmq;ZI)V")
    public final void method2786(int arg0, class534 arg1, boolean arg2, int arg3) {
        ++field10311;
        OpenGL.glTexEnvi(8960, arg3 + 34184, class173.method1195(-21575, arg1));
        OpenGL.glTexEnvi(8960, arg3 + 34200, !arg2 ? 770 : 771);
        if (arg0 != 0) {
            this.field10330 = true;
        }
    }

    @OriginalMember(owner = "client!sha", name = "u", descriptor = "(B)V")
    public final void method2789(byte arg0) {
        if (!super.field9520) {
            OpenGL.glDisable(3042);
        } else {
            OpenGL.glEnable(3042);
        }
        ++field10310;
        if (arg0 >= -99) {
            this.field10345 = true;
        }
    }

    @OriginalMember(owner = "client!sha", name = "y", descriptor = "(B)V")
    public static void method4151(byte arg0) {
        field10247 = null;
        int var1 = -38 / ((65 - arg0) / 54);
    }

    @OriginalMember(owner = "client!sha", name = "j", descriptor = "(Z)V")
    public final void method2807(boolean arg0) {
        if (arg0) {
            this.field10337 = -50;
        }
        ++field10308;
        OpenGL.glTexEnvi(8960, 34162, class512.method2993(super.field9509[super.field9508], 260));
    }

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "(Z)V")
    public final void method485(boolean arg0) {
        ++field10317;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method2819(boolean arg0, Canvas arg1, Object arg2) {
        ++field10307;
        Long var4 = (Long) arg2;
        if (!arg0) {
            this.method2774((byte) 117);
        }
        if (!this.field10300.setSurface(var4)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "(B)V")
    public final void method2763(byte arg0) {
        OpenGL.glDepthMask(super.field9590 && super.field9531);
        ++field10303;
        if (arg0 != 103) {
            this.field10339 = -1;
        }
    }

    @OriginalMember(owner = "client!sha", name = "A", descriptor = "(I)F")
    public final float method2796(int arg0) {
        int var2 = -101 % ((arg0 - 44) / 41);
        ++field10246;
        return 0.0F;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BIILfga;)V")
    public final void method2778(byte arg0, int arg1, int arg2, class269 arg3) {
        if (arg0 >= -57) {
            this.field10337 = 70;
        }
        ++field10271;
        byte var5;
        int var6;
        if (class687.field9184 == arg3) {
            var5 = 1;
            var6 = arg2 * 2;
        } else if (class84.field1198 != arg3) {
            if (class356.field5191 != arg3) {
                if (class9.field88 != arg3) {
                    if (class553.field7635 == arg3) {
                        var6 = arg2 + 2;
                        var5 = 5;
                    } else {
                        var6 = arg2;
                        var5 = 0;
                    }
                } else {
                    var6 = arg2 + 2;
                    var5 = 6;
                }
            } else {
                var5 = 4;
                var6 = arg2 * 3;
            }
        } else {
            var5 = 3;
            var6 = arg2 - -1;
        }
        OpenGL.glDrawArrays(var5, arg1, var6);
    }

    @OriginalMember(owner = "client!sha", name = "O", descriptor = "(I)V")
    public final void method2810(int arg0) {
        class544.field7522[2] = super.field9579 * super.field9532;
        class544.field7522[0] = super.field9579 * super.field9540;
        class544.field7522[3] = 1.0F;
        if (arg0 != -30427) {
            this.method2807(false);
        }
        class544.field7522[1] = super.field9581 * super.field9579;
        ++field10249;
        OpenGL.glLightModelfv(2899, class544.field7522, 0);
    }

    @OriginalMember(owner = "client!sha", name = "k", descriptor = "(B)V")
    public final void method2792(byte arg0) {
        class544.field7522[1] = super.field9607 * super.field9581;
        ++field10244;
        class544.field7522[3] = 1.0F;
        class544.field7522[2] = super.field9607 * super.field9532;
        class544.field7522[0] = super.field9607 * super.field9540;
        OpenGL.glLightfv(16384, 4609, class544.field7522, 0);
        class544.field7522[0] = -super.field9529 * super.field9540;
        class544.field7522[2] = -super.field9529 * super.field9532;
        class544.field7522[3] = 1.0F;
        if (arg0 < -55) {
            class544.field7522[1] = -super.field9529 * super.field9581;
            OpenGL.glLightfv(16385, 4609, class544.field7522, 0);
        }
    }

    @OriginalMember(owner = "client!sha", name = "v", descriptor = "(I)V")
    public final void method2772(int arg0) {
        if (arg0 <= -41) {
            ++field10290;
            if (class612.field8269 != super.field9589) {
                if (class93.field1303 == super.field9589) {
                    OpenGL.glBlendFunc(1, 1);
                    return;
                }
                if (class765.field10515 == super.field9589) {
                    OpenGL.glBlendFunc(774, 1);
                    return;
                }
            } else {
                OpenGL.glBlendFunc(770, 771);
            }
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZ)Lkm;")
    public final class373 method2795(int arg0, boolean arg1) {
        ++field10286;
        if (arg0 != 0) {
            this.field10339 = 44;
        }
        return new class547(this, arg1);
    }

    @OriginalMember(owner = "client!sha", name = "t", descriptor = "()V")
    public final void method511() {
        ++field10283;
    }

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "(I)V")
    public final synchronized void method533(int arg0) {
        ++field10234;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field10314.method688(126)) {
            class445 var12 = (class445) this.field10314.method687((byte) -112);
            class245.field3203[var3++] = (int) var12.field2146;
            super.field9495 -= var12.field6408;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class245.field3203, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class245.field3203, 0);
            var3 = 0;
        }
        while (!this.field10319.method688(107)) {
            class445 var11 = (class445) this.field10319.method687((byte) -107);
            class245.field3203[var3++] = (int) var11.field2146;
            super.field9496 -= var11.field6408;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class245.field3203, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class245.field3203, 0);
            var3 = 0;
        }
        while (!this.field10321.method688(-8)) {
            class445 var10 = (class445) this.field10321.method687((byte) -70);
            class245.field3203[var3++] = var10.field6408;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class245.field3203, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class245.field3203, 0);
            var3 = 0;
        }
        while (!this.field10322.method688(107)) {
            class445 var9 = (class445) this.field10322.method687((byte) -101);
            class245.field3203[var3++] = (int) var9.field2146;
            super.field9492 -= var9.field6408;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class245.field3203, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class245.field3203, 0);
            boolean var4 = false;
        }
        while (!this.field10270.method688(-108)) {
            class445 var8 = (class445) this.field10270.method687((byte) -104);
            OpenGL.glDeleteLists((int) var8.field2146, var8.field6408);
        }
        while (!this.field10323.method688(113)) {
            class159 var7 = this.field10323.method687((byte) -104);
            OpenGL.glDeleteProgramARB((int) var7.field2146);
        }
        while (!this.field10324.method688(123)) {
            class159 var6 = this.field10324.method687((byte) -73);
            OpenGL.glDeleteObjectARB(var6.field2146);
        }
        while (!this.field10270.method688(114)) {
            class445 var5 = (class445) this.field10270.method687((byte) -112);
            OpenGL.glDeleteLists((int) var5.field2146, var5.field6408);
        }
        if (this.method496() > 100663296 && ~(this.field10333 - -60000L) > ~class401.method2440(false)) {
            System.gc();
            this.field10333 = class401.method2440(false);
        }
        super.method533(var2);
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(II)V")
    public final void method471(int arg0, int arg1) throws class283 {
        this.field10300.swapBuffers();
        ++field10277;
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(IIIID)V")
    public final void method499(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field10278;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZLwj;Lg;)Z")
    public final boolean method2784(boolean arg0, class415 arg1, class166 arg2) {
        if (!arg0) {
            this.method527();
        }
        ++field10280;
        return true;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lio;Lrr;)Lhg;")
    public final class718 method461(class461 arg0, class381 arg1) {
        ++field10291;
        return null;
    }

    @OriginalMember(owner = "client!sha", name = "fb", descriptor = "(I)V")
    public final void method2760(int arg0) {
        ++field10274;
        class544.field7522[2] = (float) class519.method3018(255, super.field9563) / 255.0F;
        class544.field7522[0] = (float) class519.method3018(super.field9563, 16711680) / 1.671168E7F;
        class544.field7522[1] = (float) class519.method3018(65280, super.field9563) / 65280.0F;
        class544.field7522[3] = (float) (super.field9563 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class544.field7522, 0);
        if (arg0 < 60) {
            this.method535();
        }
    }

    @OriginalMember(owner = "client!sha", name = "S", descriptor = "(I)V")
    public final void method2797(int arg0) {
        if (super.field9521 && super.field9583 && super.field9569 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field10287;
        if (arg0 != -1) {
            this.method2820(-101, 40, 113, 58, (class269) null, 94, (class118) null);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I[[IZB)Lfaa;")
    public final class165 method2787(int arg0, int[][] arg1, boolean arg2, byte arg3) {
        if (arg3 > -35) {
            this.method2808(-3, (class166) null, (byte[]) null, 94, -28, 81, 18, false);
        }
        ++field10235;
        return new class451(this, arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BJ)V")
    public final synchronized void method4152(byte arg0, long arg1) {
        ++field10293;
        class159 var4 = new class159();
        var4.field2146 = arg1;
        if (arg0 != -46) {
            this.method2808(98, (class166) null, (byte[]) null, -12, 4, 20, 104, true);
        }
        this.field10324.method689(var4, arg0 + 56);
    }

    @OriginalMember(owner = "client!sha", name = "r", descriptor = "(B)V")
    public final void method2821(byte arg0) {
        ++field10304;
        if (super.field9601 && !super.field9534) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != -27) {
            this.method4152((byte) -38, 20L);
        }
    }

    @OriginalMember(owner = "client!sha", name = "F", descriptor = "(II)V")
    public final void method497(int arg0, int arg1) {
        ++field10254;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLg;Lwj;)Z")
    public final boolean method2769(byte arg0, class166 arg1, class415 arg2) {
        ++field10259;
        if (arg0 != 6) {
            field10279 = 0.09452741F;
        }
        return true;
    }

    @OriginalMember(owner = "client!sha", name = "v", descriptor = "()V")
    public final void method527() {
        ++field10296;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILdt;)Llga;")
    public static final class739 method4153(int arg0, class254 arg1) {
        ++field10239;
        if (arg0 != -31399) {
            method4151((byte) 16);
        }
        return new class739(arg1.method1695(423951304), arg1.method1695(423951304), arg1.method1695(arg0 ^ -423919983), arg1.method1695(423951304), arg1.method1722(false), arg1.method1722(false), arg1.method1731((byte) 64));
    }

    @OriginalMember(owner = "client!sha", name = "V", descriptor = "(I)V")
    public final void method2800(int arg0) {
        if (arg0 == -25) {
            ++field10242;
            OpenGL.glTexEnvi(8960, 34161, class512.method2993(super.field9582[super.field9508], 260));
        }
    }

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "(BZ)V")
    public final void method2817(byte arg0, boolean arg1) {
        if (!arg1) {
            OpenGL.glDisable(32925);
        } else {
            OpenGL.glEnable(32925);
        }
        if (arg0 == 102) {
            ++field10266;
        }
    }

    @OriginalMember(owner = "client!sha", name = "o", descriptor = "(B)V")
    public final void method2801(byte arg0) {
        OpenGL.glLightfv(16384, 4611, super.field9558, 0);
        ++field10309;
        OpenGL.glLightfv(16385, 4611, super.field9564, 0);
        int var2 = 107 / ((arg0 - 59) / 58);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZLmq;ZI)V")
    public final void method2812(int arg0, boolean arg1, class534 arg2, boolean arg3, int arg4) {
        OpenGL.glTexEnvi(8960, arg0 + 34176, class173.method1195(-21575, arg2));
        if (arg4 != 0) {
            this.field10270 = null;
        }
        ++field10284;
        if (arg3) {
            OpenGL.glTexEnvi(8960, arg0 + 34192, !arg1 ? 770 : 771);
        } else {
            OpenGL.glTexEnvi(8960, 34192 - -arg0, arg1 ? 769 : 768);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public final void method2780(Canvas arg0, int arg1, Object arg2) {
        int var4 = 35 / ((arg1 - 23) / 53);
        ++field10238;
        Long var5 = (Long) arg2;
        this.field10300.releaseSurface(arg0, var5);
    }

    @OriginalMember(owner = "client!sha", name = "j", descriptor = "()Z")
    public final boolean method472() {
        ++field10294;
        return false;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(FFF)V")
    public final void method549(float arg0, float arg1, float arg2) {
        ++field10292;
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Luq;I)V")
    public class757(OpenGL arg0, Canvas arg1, long arg2, class161 arg3, class172 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field10300 = arg0;
            this.field10300.method3609();
            this.field10342 = OpenGL.glGetString(7936).toLowerCase();
            this.field10344 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field10342.indexOf("microsoft") == 0 && ~this.field10342.indexOf("brian paul") == 0 && ~this.field10342.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class684.method3748(-2242, var8.replace('.', ' '), ' ');
                if (~var9.length > -3) {
                    throw new RuntimeException("");
                } else {
                    try {
                        int var10 = class469.method2750((byte) 94, var9[0]);
                        int var11 = class469.method2750((byte) 126, var9[1]);
                        this.field10337 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (~this.field10337 > -13) {
                        throw new RuntimeException("");
                    } else if (!this.field10300.method3610("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field10300.method3610("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field9547 = var12[0];
                        if (super.field9547 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field9541 = 8;
                            this.field10335 = this.field10300.method3610("GL_ARB_vertex_buffer_object");
                            super.field9580 = this.field10300.method3610("GL_ARB_multisample");
                            this.field10346 = this.field10300.method3610("GL_ARB_texture_rectangle");
                            super.field9596 = this.field10300.method3610("GL_ARB_texture_cube_map");
                            this.field10343 = this.field10300.method3610("GL_ARB_texture_non_power_of_two");
                            super.field9578 = this.field10300.method3610("GL_EXT_texture3D");
                            this.field10345 = this.field10300.method3610("GL_ARB_vertex_shader");
                            this.field10340 = this.field10300.method3610("GL_ARB_vertex_program");
                            this.field10338 = this.field10300.method3610("GL_ARB_fragment_shader");
                            this.field10300.method3610("GL_ARB_fragment_program");
                            this.field10341 = new int[super.field9547];
                            this.field10336 = Stream.method3798() ? 33639 : 5121;
                            if (~this.field10344.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class684.method3748(-2242, this.field10344.replace('/', ' '), ' ');
                                for (int var17 = 0; var16.length > var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (~var18.length() < -1) {
                                            if (var18.charAt(0) == 'x' && ~var18.length() <= -4 && class398.method2429((byte) 104, var18.substring(1, 3))) {
                                                var15 = true;
                                                var18 = var18.substring(1);
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var18 = var18.substring(2);
                                                    var14 = true;
                                                }
                                                if (~var18.length() <= -5 && class398.method2429((byte) 52, var18.substring(0, 4))) {
                                                    var13 = class469.method2750((byte) 55, var18.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (~var13 <= -7001 && var13 <= 7999) {
                                        this.field10335 = false;
                                    }
                                    if (var13 >= 7000 && var13 <= 9250) {
                                        super.field9578 = false;
                                    }
                                }
                                this.field10346 &= this.field10300.method3610("GL_ARB_half_float_pixel");
                            }
                            this.field10342.indexOf("intel");
                            if (this.field10335) {
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
            this.method464((byte) -122);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!sha", name = "h", descriptor = "(Z)V")
    public final void method2785(boolean arg0) {
        ++field10269;
        if (arg0) {
            this.field10344 = null;
        }
    }

    @OriginalMember(owner = "client!sha", name = "m", descriptor = "(II)Lev;")
    public final class719 method2775(int arg0, int arg1) {
        ++field10262;
        if (arg1 != 10) {
            this.method4149(-34, 113, -91);
        }
        if (~arg0 != -4) {
            if (~arg0 != -5) {
                return arg0 == 8 ? new class39(this, super.field9472, super.field9400) : super.method2775(arg0, 10);
            } else {
                return new class351(this, super.field9472, super.field9400);
            }
        } else {
            return new class83(this, super.field9472);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILg;[BIIIIZ)Lfk;")
    public final class678 method2808(int arg0, class166 arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg5 > -107) {
            this.method2790((Canvas) null, -66);
        }
        ++field10285;
        if (!this.field10343 && (!class439.method2627(0, arg4) || !class439.method2627(0, arg0))) {
            if (!this.field10346) {
                class93 var9 = new class93(this, arg1, class415.field5986, class8.method45(23714, arg4), class8.method45(23714, arg0));
                var9.method618(arg3, 0, arg6, arg0, 0, arg2, arg1, arg4, (byte) 103);
                return var9;
            } else {
                return new class77(this, arg1, arg4, arg0, arg2, arg3, arg6);
            }
        } else {
            return new class93(this, arg1, arg4, arg0, arg7, arg2, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!sha", name = "s", descriptor = "()Z")
    public final boolean method510() {
        ++field10264;
        return false;
    }

    @OriginalMember(owner = "client!sha", name = "p", descriptor = "(B)V")
    public final void method2803(byte arg0) {
        int var2 = 123 / ((arg0 - 63) / 42);
        ++field10252;
        this.field10326 = false;
        this.method4150(0);
    }

    @OriginalMember(owner = "client!sha", name = "i", descriptor = "(II)V")
    public final void method2809(int arg0, int arg1) {
        if (arg1 == 3433) {
            ++field10298;
        }
    }
}
