import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class147 extends class382 {

    @OriginalMember(owner = "client!tba", name = "lh", descriptor = "Lgca;")
    private class227 field2116 = new class227();

    @OriginalMember(owner = "client!tba", name = "Lh", descriptor = "Lgca;")
    private class227 field2142 = new class227();

    @OriginalMember(owner = "client!tba", name = "Oh", descriptor = "Lgca;")
    private class227 field2145 = new class227();

    @OriginalMember(owner = "client!tba", name = "Vh", descriptor = "Lgca;")
    private class227 field2152 = new class227();

    @OriginalMember(owner = "client!tba", name = "ai", descriptor = "Lgca;")
    private class227 field2157 = new class227();

    @OriginalMember(owner = "client!tba", name = "bi", descriptor = "Lgca;")
    private class227 field2158 = new class227();

    @OriginalMember(owner = "client!tba", name = "ci", descriptor = "Lgca;")
    private class227 field2159 = new class227();

    @OriginalMember(owner = "client!tba", name = "ei", descriptor = "[Lot;")
    private class547[] field2161 = new class547[16];

    @OriginalMember(owner = "client!tba", name = "ki", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field2167 = new MapBuffer();

    @OriginalMember(owner = "client!tba", name = "mi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field2169 = new MapBuffer();

    @OriginalMember(owner = "client!tba", name = "si", descriptor = "I")
    private int field2175 = 0;

    @OriginalMember(owner = "client!tba", name = "xh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field2128;

    @OriginalMember(owner = "client!tba", name = "xi", descriptor = "Ljava/lang/String;")
    private String field2180;

    @OriginalMember(owner = "client!tba", name = "qi", descriptor = "Ljava/lang/String;")
    private String field2173;

    @OriginalMember(owner = "client!tba", name = "ni", descriptor = "I")
    private int field2170;

    @OriginalMember(owner = "client!tba", name = "yi", descriptor = "Z")
    public boolean field2181;

    @OriginalMember(owner = "client!tba", name = "vi", descriptor = "Z")
    private boolean field2178;

    @OriginalMember(owner = "client!tba", name = "ui", descriptor = "Z")
    private boolean field2177;

    @OriginalMember(owner = "client!tba", name = "wi", descriptor = "Z")
    public boolean field2179;

    @OriginalMember(owner = "client!tba", name = "pi", descriptor = "Z")
    public boolean field2172;

    @OriginalMember(owner = "client!tba", name = "ri", descriptor = "Z")
    public boolean field2174;

    @OriginalMember(owner = "client!tba", name = "oi", descriptor = "[I")
    public int[] field2171;

    @OriginalMember(owner = "client!tba", name = "ti", descriptor = "I")
    public int field2176;

    @OriginalMember(owner = "client!tba", name = "tg", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!tba", name = "ug", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!tba", name = "vg", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!tba", name = "wg", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!tba", name = "xg", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!tba", name = "yg", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!tba", name = "zg", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!tba", name = "Ag", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!tba", name = "Bg", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!tba", name = "Cg", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!tba", name = "Dg", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!tba", name = "Eg", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!tba", name = "Fg", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!tba", name = "Gg", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!tba", name = "Hg", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!tba", name = "Ig", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!tba", name = "Jg", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!tba", name = "Kg", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!tba", name = "Lg", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!tba", name = "Mg", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!tba", name = "Ng", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!tba", name = "Pg", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!tba", name = "Qg", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!tba", name = "Rg", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!tba", name = "Sg", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!tba", name = "Tg", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!tba", name = "Ug", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!tba", name = "Vg", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!tba", name = "Wg", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!tba", name = "Xg", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!tba", name = "Yg", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!tba", name = "Zg", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!tba", name = "ah", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!tba", name = "bh", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!tba", name = "ch", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!tba", name = "dh", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!tba", name = "eh", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!tba", name = "fh", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!tba", name = "gh", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!tba", name = "hh", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!tba", name = "ih", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!tba", name = "jh", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!tba", name = "kh", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!tba", name = "mh", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!tba", name = "nh", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!tba", name = "oh", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!tba", name = "ph", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!tba", name = "qh", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!tba", name = "rh", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!tba", name = "sh", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!tba", name = "th", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!tba", name = "uh", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!tba", name = "vh", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!tba", name = "wh", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!tba", name = "yh", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!tba", name = "zh", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!tba", name = "Ah", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!tba", name = "Bh", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!tba", name = "Ch", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!tba", name = "Dh", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!tba", name = "Eh", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!tba", name = "Fh", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!tba", name = "Gh", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!tba", name = "Hh", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!tba", name = "Ih", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!tba", name = "Jh", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!tba", name = "Kh", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!tba", name = "Mh", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!tba", name = "Nh", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!tba", name = "Ph", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!tba", name = "Qh", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!tba", name = "Rh", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!tba", name = "Sh", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!tba", name = "Th", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!tba", name = "Uh", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!tba", name = "Wh", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!tba", name = "Xh", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!tba", name = "Yh", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!tba", name = "Zh", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!tba", name = "ii", descriptor = "I")
    private int field2165;

    @OriginalMember(owner = "client!tba", name = "hi", descriptor = "J")
    private long field2164;

    @OriginalMember(owner = "client!tba", name = "di", descriptor = "Z")
    private boolean field2160;

    @OriginalMember(owner = "client!tba", name = "fi", descriptor = "Z")
    private boolean field2162;

    @OriginalMember(owner = "client!tba", name = "gi", descriptor = "Z")
    private boolean field2163;

    @OriginalMember(owner = "client!tba", name = "ji", descriptor = "Z")
    private boolean field2166;

    @OriginalMember(owner = "client!tba", name = "li", descriptor = "Z")
    private boolean field2168;

    @OriginalMember(owner = "client!tba", name = "Og", descriptor = "[[Z")
    public static boolean[][] field2093;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lvc;BI)V")
    public final void method1021(class288 arg0, byte arg1, int arg2) {
        if (arg1 <= 101) {
            this.method1028(false, (int[][]) null, 67, 24);
        }
        ++field2078;
        this.field2161[arg2] = (class547) arg0;
    }

    @OriginalMember(owner = "client!tba", name = "C", descriptor = "()Z")
    public final boolean method192() {
        ++field2106;
        return false;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
    public final void method1022(byte arg0) {
        class457.field6349[3] = (float) (super.field5362 >>> 24) / 255.0F;
        class457.field6349[1] = (float) class136.method950(super.field5362, 65280) / 65280.0F;
        ++field2085;
        class457.field6349[0] = (float) class136.method950(super.field5362, 16711680) / 1.671168E7F;
        if (arg0 < -69) {
            class457.field6349[2] = (float) class136.method950(255, super.field5362) / 255.0F;
            OpenGL.glTexEnvfv(8960, 8705, class457.field6349, 0);
        }
    }

    @OriginalMember(owner = "client!tba", name = "D", descriptor = "(I)V")
    public final void method1023(int arg0) {
        ++field2148;
        OpenGL.glMatrixMode(5889);
        if (arg0 < 22) {
            this.method1054((class309) null, (class692) null, -11);
        }
        OpenGL.glLoadMatrixf(super.field5314, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "(B)V")
    public final void method1024(byte arg0) {
        OpenGL.glViewport(super.field5376, super.field5361, super.field5208, super.field5165);
        if (arg0 != 64) {
            this.field2176 = 39;
        }
        ++field2156;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLpn;ILjg;I)Lcm;")
    public final class679 method1025(byte arg0, class692 arg1, int arg2, class309 arg3, int arg4) {
        if (arg0 != 59) {
            return null;
        } else {
            ++field2137;
            if (!this.field2177 && (!class588.method3342(46, arg4) || !class588.method3342(arg0 ^ 23, arg2))) {
                return this.field2178 ? new class371(this, arg1, arg3, arg4, arg2) : new class534(this, arg1, arg3, class206.method1334(arg0 + -60, arg4), class206.method1334(arg0 + -60, arg2));
            } else {
                return new class534(this, arg1, arg3, arg4, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "(I)V")
    public final void method1026(int arg0) {
        ++field2102;
        if (arg0 <= 73) {
            this.field2163 = false;
        }
        OpenGL.glTexEnvi(8960, 34162, class158.method1117(8448, super.field5383[super.field5325]));
    }

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "(I)V")
    public final void method1027(int arg0) {
        if (!super.field5354) {
            OpenGL.glDisable(3008);
        } else {
            OpenGL.glEnable(3008);
        }
        ++field2110;
        if (arg0 >= -63) {
            this.method1050(-128, (class520) null);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z[[III)Lhea;")
    public final class388 method1028(boolean arg0, int[][] arg1, int arg2, int arg3) {
        if (arg3 <= 44) {
            this.field2168 = false;
        }
        ++field2090;
        return new class458(this, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)V")
    public final synchronized void method1029(int arg0, int arg1, int arg2) {
        ++field2112;
        if (arg1 != 3545) {
            this.method1056(-16);
        }
        class72 var4 = new class72(arg0);
        var4.field5623 = (long) arg2;
        this.field2142.method1441(var4, 0);
    }

    @OriginalMember(owner = "client!tba", name = "u", descriptor = "(I)V")
    public final void method1030(int arg0) {
        super.field5336 = (float) (super.field5347 - super.field5360);
        ++field2105;
        super.field5377 = (float) (-super.field5308) + super.field5336;
        if (super.field5377 < (float) super.field5367) {
            super.field5377 = (float) super.field5367;
        }
        if (arg0 != 18913) {
            this.field2159 = null;
        }
        OpenGL.glFogf(2915, super.field5377);
        OpenGL.glFogf(2916, super.field5336);
        class457.field6349[2] = (float) class136.method950(super.field5309, 255) / 255.0F;
        class457.field6349[0] = (float) class136.method950(super.field5309, 16711680) / 1.671168E7F;
        class457.field6349[1] = (float) class136.method950(65280, super.field5309) / 65280.0F;
        OpenGL.glFogfv(2918, class457.field6349, 0);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public final void method1031(Canvas arg0, byte arg1, Object arg2) {
        ++field2122;
        Long var4 = (Long) arg2;
        if (arg1 != 36) {
            this.method147(-0.5120175F, -1.0654935F, 0.79991305F);
        }
        if (!this.field2128.setSurface(var4)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tba", name = "V", descriptor = "(I)V")
    public final void method1032(int arg0) {
        class457.field6349[3] = 1.0F;
        class457.field6349[arg0] = super.field5358 * super.field5320;
        ++field2125;
        class457.field6349[2] = super.field5324 * super.field5320;
        class457.field6349[0] = super.field5332 * super.field5320;
        OpenGL.glLightModelfv(2899, class457.field6349, 0);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "([Lth;B)Lsi;")
    public final class520 method1033(class553[] arg0, byte arg1) {
        if (arg1 != -127) {
            this.field2168 = true;
        }
        ++field2151;
        return new class354(arg0);
    }

    @OriginalMember(owner = "client!tba", name = "jb", descriptor = "(I)V")
    public static void method1034(int arg0) {
        field2093 = null;
        if (arg0 != 16384) {
            method1034(-82);
        }
    }

    @OriginalMember(owner = "client!tba", name = "U", descriptor = "(I)V")
    public final void method1035(int arg0) {
        OpenGL.glLightfv(16384, 4611, super.field5349, 0);
        ++field2136;
        OpenGL.glLightfv(16385, 4611, super.field5369, 0);
        if (arg0 != 10) {
            this.method1021((class288) null, (byte) -117, -69);
        }
    }

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "()V")
    public final void method100() throws class39 {
        ++field2113;
        this.field2128.swapBuffers();
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(Z)V")
    public final void method157(boolean arg0) {
        ++field2082;
    }

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "(B)V")
    public final void method1036(byte arg0) {
        if (arg0 <= -113) {
            if (super.field5409) {
                OpenGL.glEnable(3089);
            } else {
                OpenGL.glDisable(3089);
            }
            ++field2107;
        }
    }

    @OriginalMember(owner = "client!tba", name = "Q", descriptor = "(I)V")
    public final void method1037(int arg0) {
        if (super.field5355 && super.field5291 && ~super.field5308 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field2097;
        if (arg0 > -123) {
            this.method89();
        }
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(ZI)Lvc;")
    public final class288 method1038(boolean arg0, int arg1) {
        int var3 = -7 % ((arg1 - -2) / 39);
        ++field2120;
        return new class547(this, arg0);
    }

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "(B)V")
    public final void method1039(byte arg0) {
        if (arg0 != -26) {
            this.field2178 = false;
        }
        if (class571.field8103 == super.field5350) {
            OpenGL.glBlendFunc(770, 771);
        } else if (class416.field5864 == super.field5350) {
            OpenGL.glBlendFunc(1, 1);
        } else if (class4.field32 == super.field5350) {
            OpenGL.glBlendFunc(774, 1);
        }
        ++field2135;
    }

    @OriginalMember(owner = "client!tba", name = "B", descriptor = "(I)V")
    public final void method1040(int arg0) {
        ++field2134;
        this.method1068(6292);
        if (arg0 != -1113) {
            this.field2179 = true;
        }
    }

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "(II)Lcc;")
    public final class681 method1041(int arg0, int arg1) {
        ++field2154;
        if (arg0 != 128) {
            this.method1056(96);
        }
        if (arg1 != 3) {
            if (~arg1 != -5) {
                return arg1 == 8 ? new class174(this, super.field5203, super.field5266) : super.method1041(128, arg1);
            } else {
                return new class450(this, super.field5203, super.field5266);
            }
        } else {
            return new class238(this, super.field5203);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZLou;)V")
    public final void method1042(boolean arg0, class562 arg1) {
        if (class564.field7621 == arg1) {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        } else {
            int var3 = class297.method1808(arg1, (byte) -127);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        }
        ++field2139;
        if (arg0) {
            this.method1044(true, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public final void method1043(Object arg0, Canvas arg1, byte arg2) {
        int var4 = 27 / ((arg2 - -11) / 44);
        ++field2138;
        Long var5 = (Long) arg0;
        this.field2128.releaseSurface(arg1, var5);
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(ZB)V")
    public final void method1044(boolean arg0, byte arg1) {
        if (!arg0) {
            OpenGL.glDisable(32925);
        } else {
            OpenGL.glEnable(32925);
        }
        ++field2076;
        if (arg1 <= 1) {
            this.method101(-17);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method92(Rectangle[] arg0, int arg1) throws class39 {
        ++field2101;
        this.method100();
    }

    @OriginalMember(owner = "client!tba", name = "H", descriptor = "(I)V")
    public final void method1045(int arg0) {
        ++field2133;
        int var2 = this.field2171[super.field5325];
        if (~var2 != arg0) {
            this.field2171[super.field5325] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
    }

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "(IIII)[I")
    public final int[] method148(int arg0, int arg1, int arg2, int arg3) {
        ++field2088;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -1 + -var6 + super.field5165, arg2, 1, 32993, this.field2176, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(JI)V")
    public final synchronized void method1046(long arg0, int arg1) {
        ++field2130;
        class401 var4 = new class401();
        if (arg1 <= 42) {
            this.field2160 = true;
        }
        var4.field5623 = arg0;
        this.field2159.method1441(var4, 0);
    }

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "()V")
    public final void method125() {
        ++field2129;
        if (super.field5208 > 0 || ~super.field5165 < -1) {
            int var1 = super.field5381;
            int var2 = super.field5331;
            int var3 = super.field5322;
            int var4 = super.field5318;
            this.method193();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2228(false);
            this.method2267(false, 2);
            this.method2250(-8, false);
            this.method2247(false, (byte) 74);
            this.method2254(false, (byte) -73);
            this.method2241((class218) null, (byte) 44);
            this.method2249(false, false, -2, 0);
            this.method2246(1, 26770);
            this.method2230(0, -122);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field5208, super.field5165, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method200(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!tba", name = "hb", descriptor = "(I)V")
    public final void method1047(int arg0) {
        ++field2147;
        this.method2255(false);
        int var2;
        for (var2 = 0; super.field5345 > var2; ++var2) {
            class186 var3 = super.field5287[var2];
            int var4 = var3.method1283(0);
            int var5 = var2 + 16386;
            float var6 = var3.method1285(-1120) / 255.0F;
            class457.field6349[0] = (float) var3.method1280(true);
            class457.field6349[1] = (float) var3.method1282((byte) 102);
            class457.field6349[2] = (float) var3.method1279(0);
            class457.field6349[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class457.field6349, 0);
            class457.field6349[0] = var6 * (float) (class136.method950(16749678, var4) >> 16);
            class457.field6349[2] = var6 * (float) class136.method950(255, var4);
            class457.field6349[3] = 1.0F;
            class457.field6349[1] = var6 * (float) (class136.method950(var4, 65508) >> 8);
            OpenGL.glLightfv(var5, 4609, class457.field6349, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method1281(90) * var3.method1281(23)));
            OpenGL.glEnable(var5);
        }
        if (arg0 > -81) {
            this.field2116 = null;
        }
        while (var2 < super.field5290) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method1047(-83);
    }

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "()Z")
    public final boolean method120() {
        ++field2144;
        return false;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(FFF)V")
    public final void method147(float arg0, float arg1, float arg2) {
        ++field2126;
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(III)V")
    public final synchronized void method1048(int arg0, int arg1, int arg2) {
        if (arg2 == -31013) {
            ++field2124;
            class72 var4 = new class72(arg1);
            var4.field5623 = (long) arg0;
            this.field2145.method1441(var4, arg2 + 31013);
        }
    }

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "()V")
    public final void method196() {
        ++field2118;
    }

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "(B)V")
    public final void method1049(byte arg0) {
        if (arg0 != 27) {
            this.method120();
        }
        if (super.field5315 && !super.field5295) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field2114;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILsi;)V")
    public final void method1050(int arg0, class520 arg1) {
        ++field2081;
        class553[] var3 = ((class354) arg1).field4704;
        int var4 = arg0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        for (int var8 = 0; var8 < var3.length; ++var8) {
            class553 var11 = var3[var8];
            class547 var12 = this.field2161[var8];
            int var13 = 0;
            int var14 = var12.method3078((byte) -40);
            long var15 = var12.method1873((byte) 116);
            var12.method1867(false);
            for (int var17 = 0; var11.method3104(false) > var17; ++var17) {
                class103 var18 = var11.method3100(var17, 0);
                if (class103.field1441 == var18) {
                    OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                    var7 = true;
                } else if (class103.field1442 == var18) {
                    var6 = true;
                    OpenGL.glNormalPointer(5126, var14, (long) var13 + var15);
                } else if (class103.field1445 != var18) {
                    if (class103.field1446 != var18) {
                        if (class103.field1447 != var18) {
                            if (class103.field1448 == var18) {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(3, 5126, var14, var15 - -((long) var13));
                            } else if (class103.field1449 == var18) {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(4, 5126, var14, (long) var13 + var15);
                            }
                        } else {
                            OpenGL.glClientActiveTexture(33984 + var4++);
                            OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                        }
                    } else {
                        OpenGL.glClientActiveTexture(33984 - -(var4++));
                        OpenGL.glTexCoordPointer(1, 5126, var14, var15 - -((long) var13));
                    }
                } else {
                    OpenGL.glColorPointer(4, 5121, var14, (long) var13 + var15);
                    var5 = true;
                }
                var13 += var18.field1444;
            }
        }
        if (!this.field2162 != !var7) {
            if (!var7) {
                OpenGL.glDisableClientState(32884);
            } else {
                OpenGL.glEnableClientState(32884);
            }
            this.field2162 = var7;
        }
        if (!var6 == this.field2166) {
            if (!var6) {
                OpenGL.glDisableClientState(32885);
            } else {
                OpenGL.glEnableClientState(32885);
            }
            this.field2166 = var6;
        }
        if (!this.field2163 != !var5) {
            if (var5) {
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            this.field2163 = var5;
        }
        if (~var4 >= ~this.field2165) {
            if (~var4 > ~this.field2165) {
                for (int var9 = var4; ~this.field2165 < ~var9; ++var9) {
                    OpenGL.glClientActiveTexture(var9 + 33984);
                    OpenGL.glDisableClientState(32888);
                }
                this.field2165 = var4;
                return;
            }
        } else {
            for (int var10 = this.field2165; var10 < var4; ++var10) {
                OpenGL.glClientActiveTexture(var10 + 33984);
                OpenGL.glEnableClientState(32888);
            }
            this.field2165 = var4;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lhw;IIZ)V")
    public final void method1051(class115 arg0, int arg1, int arg2, boolean arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34184, class588.method3341((byte) 126, arg0));
        ++field2119;
        if (arg2 < -45) {
            OpenGL.glTexEnvi(8960, arg1 + 34200, !arg3 ? 770 : 771);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lf;Z)V")
    public final void method164(class702 arg0, boolean arg1) {
        ++field2074;
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLfa;Lsea;I)V")
    public class147(OpenGL arg0, Canvas arg1, long arg2, class212 arg3, class648 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field2128 = arg0;
            this.field2128.method3304();
            this.field2180 = OpenGL.glGetString(7936).toLowerCase();
            this.field2173 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field2180.indexOf("microsoft") == 0 && this.field2180.indexOf("brian paul") == -1 && ~this.field2180.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class48.method383(var8.replace('.', ' '), 1, ' ');
                if (~var9.length <= -3) {
                    try {
                        int var10 = class214.method1376(0, var9[0]);
                        int var11 = class214.method1376(0, var9[1]);
                        this.field2170 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field2170 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field2128.method3303("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field2128.method3303("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field5352 = var12[0];
                        if (~super.field5352 > -3) {
                            throw new RuntimeException("");
                        } else {
                            super.field5338 = 8;
                            this.field2181 = this.field2128.method3303("GL_ARB_vertex_buffer_object");
                            super.field5302 = this.field2128.method3303("GL_ARB_multisample");
                            this.field2178 = this.field2128.method3303("GL_ARB_texture_rectangle");
                            super.field5372 = this.field2128.method3303("GL_ARB_texture_cube_map");
                            this.field2177 = this.field2128.method3303("GL_ARB_texture_non_power_of_two");
                            super.field5340 = this.field2128.method3303("GL_EXT_texture3D");
                            this.field2179 = this.field2128.method3303("GL_ARB_vertex_shader");
                            this.field2172 = this.field2128.method3303("GL_ARB_vertex_program");
                            this.field2174 = this.field2128.method3303("GL_ARB_fragment_shader");
                            this.field2128.method3303("GL_ARB_fragment_program");
                            this.field2171 = new int[super.field5352];
                            this.field2176 = Stream.method3484() ? 33639 : 5121;
                            if (this.field2173.indexOf("radeon") != -1) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class48.method383(this.field2173.replace('/', ' '), 1, ' ');
                                for (int var17 = 0; var16.length > var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (~var18.length() < -1) {
                                            if (~var18.charAt(0) == -121 && ~var18.length() <= -4 && class568.method3250(var18.substring(1, 3), 10)) {
                                                var18 = var18.substring(1);
                                                var15 = true;
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var14 = true;
                                                    var18 = var18.substring(2);
                                                }
                                                if (~var18.length() <= -5 && class568.method3250(var18.substring(0, 4), 10)) {
                                                    var13 = class214.method1376(0, var18.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && ~var13 >= -9251) {
                                        super.field5340 = false;
                                    }
                                    if (var13 >= 7000 && ~var13 >= -8000) {
                                        this.field2181 = false;
                                    }
                                }
                                this.field2178 &= this.field2128.method3303("GL_ARB_half_float_pixel");
                            }
                            this.field2180.indexOf("intel");
                            if (this.field2181) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
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
            this.method136();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lwn;Lwn;FLwn;)Lwn;")
    public final class674 method91(class674 arg0, class674 arg1, float arg2, class674 arg3) {
        ++field2087;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZIZLhw;I)V")
    public final void method1052(boolean arg0, int arg1, boolean arg2, class115 arg3, int arg4) {
        OpenGL.glTexEnvi(8960, arg1 + 34176, class588.method3341((byte) 126, arg3));
        if (arg4 <= 88) {
            this.field2163 = true;
        }
        ++field2091;
        if (arg2) {
            OpenGL.glTexEnvi(8960, arg1 + 34192, !arg0 ? 770 : 771);
        } else {
            OpenGL.glTexEnvi(8960, 34192 - -arg1, arg0 ? 769 : 768);
        }
    }

    @OriginalMember(owner = "client!tba", name = "u", descriptor = "()Lho;")
    public final class134 method151() {
        ++field2109;
        int var1 = -1;
        if (~this.field2180.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (~this.field2180.indexOf("intel") != 0) {
            var1 = 32902;
        } else if (~this.field2180.indexOf("ati") != 0) {
            var1 = 4098;
        }
        return new class134(var1, "OpenGL", this.field2170, this.field2173, 0L);
    }

    @OriginalMember(owner = "client!tba", name = "G", descriptor = "(I)V")
    public final void method1053(int arg0) {
        ++field2121;
        if (!super.field5374) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
        if (arg0 != 0) {
            this.field2174 = true;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljg;Lpn;I)Z")
    public final boolean method1054(class309 arg0, class692 arg1, int arg2) {
        int var4 = 52 % ((76 - arg2) / 44);
        ++field2103;
        return true;
    }

    @OriginalMember(owner = "client!tba", name = "x", descriptor = "(I)V")
    public final void method1055(int arg0) {
        for (int var2 = super.field5352 - 1; ~var2 <= -1; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field2131;
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
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field2128.setSwapInterval(0);
        super.method1055(arg0);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIII)V")
    public final void method103(int arg0, int arg1, int arg2, int arg3) {
        ++field2111;
    }

    @OriginalMember(owner = "client!tba", name = "X", descriptor = "(I)F")
    public final float method1056(int arg0) {
        if (arg0 != 0) {
            this.method1056(-72);
        }
        ++field2150;
        return 0.0F;
    }

    @OriginalMember(owner = "client!tba", name = "Z", descriptor = "(I)V")
    public final void method1057(int arg0) {
        if (arg0 != 30624) {
            this.field2116 = null;
        }
        OpenGL.glMatrixMode(5890);
        ++field2092;
        if (super.field5368[super.field5325] == class635.field8783) {
            OpenGL.glLoadIdentity();
        } else {
            OpenGL.glLoadMatrixf(super.field5288[super.field5325].method1712(class259.field3526, arg0 ^ 29029), 0);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZI[FIIILpn;)Lcm;")
    public final class679 method1058(int arg0, boolean arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, class692 arg7) {
        if (arg4 != 9) {
            this.method1061(29, -106, (byte[]) null, -78, (class692) null, -85);
        }
        ++field2096;
        if (!this.field2177 && (!class588.method3342(59, arg2) || !class588.method3342(109, arg0))) {
            if (!this.field2178) {
                class534 var9 = new class534(this, arg7, class309.field4275, class206.method1334(-1, arg2), class206.method1334(arg4 ^ -10, arg0));
                var9.method3031(arg6, arg4 + 6635, arg0, 0, 0, arg5, arg2, arg3, arg7);
                return var9;
            } else {
                return new class371(this, arg7, arg2, arg0, arg3, arg6, arg5);
            }
        } else {
            return new class534(this, arg7, arg2, arg0, arg1, arg3, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLpn;IZII[BI)Lcm;")
    public final class679 method1059(byte arg0, class692 arg1, int arg2, boolean arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        ++field2084;
        if (arg0 != 2) {
            return null;
        } else if (!this.field2177 && (!class588.method3342(63, arg2) || !class588.method3342(-105, arg4))) {
            if (this.field2178) {
                return new class371(this, arg1, arg2, arg4, arg6, arg5, arg7);
            } else {
                class534 var9 = new class534(this, arg1, class309.field4271, class206.method1334(-1, arg2), class206.method1334(arg0 + -3, arg4));
                var9.method2136(arg7, arg2, 0, 0, true, arg5, arg1, arg4, arg6);
                return var9;
            }
        } else {
            return new class534(this, arg1, arg2, arg4, arg3, arg6, arg5, arg7);
        }
    }

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "()V")
    public final void method96() {
        ++field2077;
    }

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "(I)V")
    public final void method1060(int arg0) {
        if (arg0 != 20018) {
            this.field2173 = null;
        }
        OpenGL.glTexEnvi(8960, 34161, class158.method1117(8448, super.field5323[super.field5325]));
        ++field2117;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(II[BILpn;I)Ltea;")
    public final class217 method1061(int arg0, int arg1, byte[] arg2, int arg3, class692 arg4, int arg5) {
        ++field2146;
        return arg5 < 59 ? null : new class468(this, arg4, arg1, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "(ZI)Ljea;")
    public final class415 method1062(boolean arg0, int arg1) {
        if (arg1 != 18554) {
            this.method101(68);
        }
        ++field2127;
        return new class158(this, class309.field4272, arg0);
    }

    @OriginalMember(owner = "client!tba", name = "ja", descriptor = "(I)V")
    public final void method101(int arg0) {
        ++field2155;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z[IIIIII)Lcm;")
    public final class679 method1063(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 1) {
            return null;
        } else {
            ++field2100;
            if (!this.field2177 && (!class588.method3342(83, arg2) || !class588.method3342(-123, arg5))) {
                if (!this.field2178) {
                    class534 var8 = new class534(this, class129.field1851, class309.field4271, class206.method1334(-1, arg2), class206.method1334(-1, arg5));
                    var8.method2134(arg4, arg5, 19390, arg1, 0, 0, arg2, arg3);
                    return var8;
                } else {
                    return new class371(this, arg2, arg5, arg1, arg4, arg3);
                }
            } else {
                return new class534(this, arg2, arg5, arg0, arg1, arg4, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "(B)V")
    public final void method1064(byte arg0) {
        if (arg0 >= -12) {
            this.method157(false);
        }
        ++field2140;
        if (super.field5356) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
    }

    @OriginalMember(owner = "client!tba", name = "DA", descriptor = "()I")
    public final int method184() {
        ++field2132;
        return this.field2175;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Leg;IIIILjea;B)V")
    public final void method1065(class93 arg0, int arg1, int arg2, int arg3, int arg4, class415 arg5, byte arg6) {
        if (arg6 != -104) {
            this.method89();
        }
        ++field2143;
        byte var8;
        int var9;
        if (class372.field5013 == arg0) {
            var8 = 1;
            var9 = arg3 * 2;
        } else if (class628.field8698 != arg0) {
            if (class345.field4628 != arg0) {
                if (class412.field5846 == arg0) {
                    var8 = 6;
                    var9 = arg3 + 2;
                } else if (class12.field124 == arg0) {
                    var8 = 5;
                    var9 = arg3 + 2;
                } else {
                    var9 = arg3;
                    var8 = 0;
                }
            } else {
                var9 = arg3 * 3;
                var8 = 4;
            }
        } else {
            var9 = arg3 - -1;
            var8 = 3;
        }
        class309 var10 = arg5.method1124(114);
        class158 var11 = (class158) arg5;
        var11.method1867(false);
        OpenGL.glDrawElements(var8, var9, class58.method484(5120, var10), var11.method1873((byte) 119) + (long) (var10.field4267 * arg4));
    }

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "(I)V")
    public final void method1066(int arg0) {
        if (arg0 != 16777215) {
            this.field2179 = false;
        }
        OpenGL.glActiveTexture(super.field5325 + 33984);
        ++field2095;
    }

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "(II)V")
    public final synchronized void method1067(int arg0, int arg1) {
        ++field2080;
        if (arg1 != 5888) {
            this.field2152 = null;
        }
        class401 var3 = new class401();
        var3.field5623 = (long) arg0;
        this.field2158.method1441(var3, 0);
    }

    @OriginalMember(owner = "client!tba", name = "kb", descriptor = "(I)V")
    private final void method1068(int arg0) {
        ++field2141;
        if (this.field2160) {
            OpenGL.glPopMatrix();
        }
        if (arg0 != 6292) {
            this.method1028(true, (int[][]) null, 23, -108);
        }
        if (super.field5327.method2788((byte) 95)) {
            if (!this.field2168) {
                OpenGL.glLoadMatrixf(super.field5284.method1712(class259.field3526, 1733), 0);
                this.field2168 = true;
                this.method1035(10);
                this.method1047(-103);
            }
            if (!super.field5278) {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field5280.method1712(class259.field3526, 1733), 0);
                this.field2160 = true;
            } else {
                this.field2160 = false;
            }
        } else if (!super.field5278) {
            OpenGL.glLoadMatrixf(super.field5280.method1712(class259.field3526, 1733), 0);
            this.field2160 = false;
        } else {
            OpenGL.glLoadIdentity();
            this.field2160 = false;
        }
    }

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "(Z)V")
    public final void method1069(boolean arg0) {
        ++field2075;
        if (!arg0) {
            OpenGL.glDepthMask(super.field5312 && super.field5304);
        }
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(Ljg;Lpn;I)Z")
    public final boolean method1070(class309 arg0, class692 arg1, int arg2) {
        ++field2094;
        if (arg2 != 23770) {
            this.method1070((class309) null, (class692) null, -66);
        }
        return true;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public final void method1071(Object arg0, int arg1, Canvas arg2) {
        if (arg1 != 11) {
            this.field2174 = false;
        }
        ++field2072;
        Long var4 = (Long) arg0;
        this.field2128.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!tba", name = "t", descriptor = "(I)V")
    public final void method1072(int arg0) {
        if (arg0 < 64) {
            this.field2167 = null;
        }
        if (super.field5310) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
        ++field2079;
    }

    @OriginalMember(owner = "client!tba", name = "x", descriptor = "()V")
    public final void method104() {
        ++field2108;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public final Object method1073(Canvas arg0, int arg1) {
        ++field2073;
        if (arg1 < 101) {
            this.method1046(19L, -109);
        }
        long var3 = this.field2128.prepareSurface(arg0);
        if (~var3 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "(B)V")
    public final void method1074(byte arg0) {
        ++field2086;
        this.field2168 = false;
        if (arg0 == 101) {
            this.method1068(6292);
        }
    }

    @OriginalMember(owner = "client!tba", name = "ya", descriptor = "()V")
    public final void method89() {
        this.method2254(true, (byte) -121);
        ++field2153;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "(B)V")
    public final void method1075(byte arg0) {
        ++field2115;
        if (arg0 < 64) {
            this.field2181 = false;
        }
        OpenGL.glScissor(super.field5376 - -super.field5381, -super.field5318 + super.field5165 + super.field5361, super.field5331 - super.field5381, -super.field5322 + super.field5318);
    }

    @OriginalMember(owner = "client!tba", name = "s", descriptor = "()V")
    public final void method98() {
        OpenGL.glFinish();
        ++field2083;
    }

    @OriginalMember(owner = "client!tba", name = "N", descriptor = "(I)V")
    public final void method1076(int arg0) {
        if (arg0 == 10) {
            ++field2104;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZI)V")
    public final void method1077(boolean arg0, int arg1) {
        if (arg0) {
            ++field2123;
        }
    }

    @OriginalMember(owner = "client!tba", name = "W", descriptor = "(I)V")
    public final void method1078(int arg0) {
        class457.field6349[0] = super.field5353 * super.field5332;
        class457.field6349[1] = super.field5358 * super.field5353;
        class457.field6349[3] = 1.0F;
        class457.field6349[2] = super.field5353 * super.field5324;
        ++field2098;
        OpenGL.glLightfv(16384, 4609, class457.field6349, 0);
        class457.field6349[1] = -super.field5385 * super.field5358;
        class457.field6349[2] = -super.field5385 * super.field5324;
        if (arg0 != -16769) {
            this.field2176 = -34;
        }
        class457.field6349[0] = -super.field5385 * super.field5332;
        class457.field6349[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class457.field6349, 0);
    }

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "(I)V")
    public final synchronized void method194(int arg0) {
        ++field2089;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field2142.method1435((byte) -98)) {
            class72 var12 = (class72) this.field2142.method1442(-10011);
            class377.field5031[var2++] = (int) var12.field5623;
            super.field5281 -= var12.field956;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class377.field5031, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class377.field5031, 0);
            var2 = 0;
        }
        while (!this.field2145.method1435((byte) -98)) {
            class72 var11 = (class72) this.field2145.method1442(-10011);
            class377.field5031[var2++] = (int) var11.field5623;
            super.field5279 -= var11.field956;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class377.field5031, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class377.field5031, 0);
            var2 = 0;
        }
        while (!this.field2152.method1435((byte) -98)) {
            class72 var10 = (class72) this.field2152.method1442(-10011);
            class377.field5031[var2++] = var10.field956;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class377.field5031, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class377.field5031, 0);
            var2 = 0;
        }
        while (!this.field2157.method1435((byte) -98)) {
            class72 var9 = (class72) this.field2157.method1442(-10011);
            class377.field5031[var2++] = (int) var9.field5623;
            super.field5277 -= var9.field956;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class377.field5031, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class377.field5031, 0);
            boolean var4 = false;
        }
        while (!this.field2116.method1435((byte) -98)) {
            class72 var8 = (class72) this.field2116.method1442(-10011);
            OpenGL.glDeleteLists((int) var8.field5623, var8.field956);
        }
        while (!this.field2158.method1435((byte) -98)) {
            class401 var7 = this.field2158.method1442(-10011);
            OpenGL.glDeleteProgramARB((int) var7.field5623);
        }
        while (!this.field2159.method1435((byte) -98)) {
            class401 var6 = this.field2159.method1442(-10011);
            OpenGL.glDeleteObjectARB(var6.field5623);
        }
        while (!this.field2116.method1435((byte) -98)) {
            class72 var5 = (class72) this.field2116.method1442(-10011);
            OpenGL.glDeleteLists((int) var5.field5623, var5.field956);
        }
        if (~this.method169() < -100663297 && ~(this.field2164 - -60000L) > ~class577.method3295((byte) 15)) {
            System.gc();
            this.field2164 = class577.method3295((byte) 15);
        }
        super.method194(var3);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILeg;II)V")
    public final void method1079(int arg0, class93 arg1, int arg2, int arg3) {
        ++field2149;
        if (arg3 != 10) {
            this.method104();
        }
        byte var5;
        int var6;
        if (class372.field5013 == arg1) {
            var5 = 1;
            var6 = arg2 * 2;
        } else if (class628.field8698 != arg1) {
            if (class345.field4628 != arg1) {
                if (class412.field5846 != arg1) {
                    if (class12.field124 != arg1) {
                        var6 = arg2;
                        var5 = 0;
                    } else {
                        var5 = 5;
                        var6 = arg2 - -2;
                    }
                } else {
                    var6 = arg2 + 2;
                    var5 = 6;
                }
            } else {
                var6 = arg2 * 3;
                var5 = 4;
            }
        } else {
            var5 = 3;
            var6 = arg2 + 1;
        }
        OpenGL.glDrawArrays(var5, arg0, var6);
    }

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "()V")
    public final void method136() {
        super.method136();
        ++field2099;
        if (this.field2128 != null) {
            this.field2128.method3305();
            this.field2128.release();
            this.field2128 = null;
        }
    }
}
