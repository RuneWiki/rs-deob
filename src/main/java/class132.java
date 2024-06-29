import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class132 extends class453 {

    @OriginalMember(owner = "client!eea", name = "Gh", descriptor = "Lnt;")
    private class220 field2026 = new class220();

    @OriginalMember(owner = "client!eea", name = "fi", descriptor = "Lnt;")
    private class220 field2051 = new class220();

    @OriginalMember(owner = "client!eea", name = "wi", descriptor = "Lnt;")
    private class220 field2068 = new class220();

    @OriginalMember(owner = "client!eea", name = "Ai", descriptor = "Lnt;")
    private class220 field2072 = new class220();

    @OriginalMember(owner = "client!eea", name = "Bi", descriptor = "Lnt;")
    private class220 field2073 = new class220();

    @OriginalMember(owner = "client!eea", name = "Ci", descriptor = "Lnt;")
    private class220 field2074 = new class220();

    @OriginalMember(owner = "client!eea", name = "Di", descriptor = "Lnt;")
    private class220 field2075 = new class220();

    @OriginalMember(owner = "client!eea", name = "Gi", descriptor = "[Lsba;")
    private class214[] field2078 = new class214[16];

    @OriginalMember(owner = "client!eea", name = "Ki", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field2082 = new MapBuffer();

    @OriginalMember(owner = "client!eea", name = "Ni", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field2085 = new MapBuffer();

    @OriginalMember(owner = "client!eea", name = "Oi", descriptor = "I")
    private int field2086 = 0;

    @OriginalMember(owner = "client!eea", name = "Ah", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field2020;

    @OriginalMember(owner = "client!eea", name = "Vi", descriptor = "Ljava/lang/String;")
    private String field2093;

    @OriginalMember(owner = "client!eea", name = "Ui", descriptor = "Ljava/lang/String;")
    private String field2092;

    @OriginalMember(owner = "client!eea", name = "Pi", descriptor = "I")
    private int field2087;

    @OriginalMember(owner = "client!eea", name = "Si", descriptor = "Z")
    public boolean field2090;

    @OriginalMember(owner = "client!eea", name = "Yi", descriptor = "Z")
    private boolean field2096;

    @OriginalMember(owner = "client!eea", name = "Ri", descriptor = "Z")
    private boolean field2089;

    @OriginalMember(owner = "client!eea", name = "Ti", descriptor = "Z")
    public boolean field2091;

    @OriginalMember(owner = "client!eea", name = "Zi", descriptor = "Z")
    public boolean field2097;

    @OriginalMember(owner = "client!eea", name = "Xi", descriptor = "Z")
    public boolean field2095;

    @OriginalMember(owner = "client!eea", name = "Qi", descriptor = "[I")
    public int[] field2088;

    @OriginalMember(owner = "client!eea", name = "Wi", descriptor = "I")
    public int field2094;

    @OriginalMember(owner = "client!eea", name = "fh", descriptor = "Lqe;")
    public static class465 field1999 = new class465(19, 3);

    @OriginalMember(owner = "client!eea", name = "ti", descriptor = "[I")
    public static int[] field2065 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!eea", name = "Ng", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!eea", name = "Og", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!eea", name = "Pg", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!eea", name = "Qg", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!eea", name = "Rg", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!eea", name = "Sg", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!eea", name = "Tg", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!eea", name = "Ug", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!eea", name = "Vg", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!eea", name = "Wg", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!eea", name = "Xg", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!eea", name = "Yg", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!eea", name = "Zg", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!eea", name = "ah", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!eea", name = "bh", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!eea", name = "ch", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!eea", name = "dh", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!eea", name = "eh", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!eea", name = "gh", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!eea", name = "hh", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!eea", name = "ih", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!eea", name = "jh", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!eea", name = "kh", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!eea", name = "lh", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!eea", name = "mh", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!eea", name = "nh", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!eea", name = "oh", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!eea", name = "ph", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!eea", name = "qh", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!eea", name = "rh", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!eea", name = "sh", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!eea", name = "th", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!eea", name = "uh", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!eea", name = "vh", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!eea", name = "wh", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!eea", name = "xh", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!eea", name = "yh", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!eea", name = "zh", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!eea", name = "Bh", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!eea", name = "Ch", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!eea", name = "Dh", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!eea", name = "Eh", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!eea", name = "Fh", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!eea", name = "Hh", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!eea", name = "Ih", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!eea", name = "Jh", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!eea", name = "Kh", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!eea", name = "Lh", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!eea", name = "Mh", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!eea", name = "Nh", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!eea", name = "Oh", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!eea", name = "Ph", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!eea", name = "Qh", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!eea", name = "Rh", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!eea", name = "Sh", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!eea", name = "Th", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!eea", name = "Uh", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!eea", name = "Vh", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!eea", name = "Wh", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!eea", name = "Xh", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!eea", name = "Yh", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!eea", name = "Zh", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!eea", name = "ai", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!eea", name = "bi", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!eea", name = "ci", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!eea", name = "di", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!eea", name = "ei", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!eea", name = "gi", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!eea", name = "hi", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!eea", name = "ii", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!eea", name = "ji", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!eea", name = "ki", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!eea", name = "li", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!eea", name = "mi", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!eea", name = "ni", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!eea", name = "oi", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!eea", name = "pi", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!eea", name = "qi", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!eea", name = "ri", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!eea", name = "si", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!eea", name = "ui", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!eea", name = "vi", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!eea", name = "xi", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!eea", name = "yi", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!eea", name = "zi", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!eea", name = "Li", descriptor = "I")
    private int field2083;

    @OriginalMember(owner = "client!eea", name = "Fi", descriptor = "J")
    private long field2077;

    @OriginalMember(owner = "client!eea", name = "Ei", descriptor = "Z")
    private boolean field2076;

    @OriginalMember(owner = "client!eea", name = "Hi", descriptor = "Z")
    private boolean field2079;

    @OriginalMember(owner = "client!eea", name = "Ii", descriptor = "Z")
    private boolean field2080;

    @OriginalMember(owner = "client!eea", name = "Ji", descriptor = "Z")
    private boolean field2081;

    @OriginalMember(owner = "client!eea", name = "Mi", descriptor = "Z")
    private boolean field2084;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(IIIID)V", line = 5)
    public final void method532(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field2042;
    }

    @OriginalMember(owner = "client!eea", name = "I", descriptor = "(I)V", line = 14)
    public final void method1004(int arg0) {
        ++field1982;
        if (!super.field6458) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
        if (arg0 != 16) {
            this.field2084 = false;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZJ)V", line = 35)
    public final synchronized void method1005(boolean arg0, long arg1) {
        ++field2061;
        if (!arg0) {
            class626 var4 = new class626();
            var4.field8991 = arg1;
            this.field2075.method1526(var4, -85);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I[Lofa;)Lhi;", line = 49)
    public final class203 method1006(int arg0, class328[] arg1) {
        if (arg0 != 50) {
            return null;
        } else {
            ++field2009;
            return new class117(arg1);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V", line = 60)
    public final void method1007(Canvas arg0, byte arg1, Object arg2) {
        ++field2070;
        if (arg1 > -70) {
            this.field2082 = null;
        }
        Long var4 = (Long) arg2;
        if (!this.field2020.setSurface(var4)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "(B)V", line = 75)
    public final void method1008(byte arg0) {
        class440.field6141[1] = (float) class555.method3246(super.field6463, 65280) / 65280.0F;
        class440.field6141[2] = (float) class555.method3246(255, super.field6463) / 255.0F;
        ++field2012;
        if (arg0 <= 5) {
            this.method1045(118);
        }
        class440.field6141[3] = (float) (super.field6463 >>> 24) / 255.0F;
        class440.field6141[0] = (float) class555.method3246(super.field6463, 16711680) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class440.field6141, 0);
    }

    @OriginalMember(owner = "client!eea", name = "F", descriptor = "(II)V", line = 94)
    public final void method580(int arg0, int arg1) {
        ++field2011;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILtaa;ZI)V", line = 101)
    public final void method1009(int arg0, class405 arg1, boolean arg2, int arg3) {
        ++field1996;
        if (arg0 == 0) {
            OpenGL.glTexEnvi(8960, 34184 - -arg3, class288.method1865(34167, arg1));
            OpenGL.glTexEnvi(8960, arg3 + 34200, arg2 ? 771 : 770);
        }
    }

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "(Z)F", line = 113)
    public final float method1010(boolean arg0) {
        if (!arg0) {
            this.field2074 = null;
        }
        ++field1989;
        return 0.0F;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)V", line = 125)
    public final synchronized void method1011(int arg0, int arg1, int arg2) {
        ++field2025;
        class528 var4 = new class528(arg1);
        var4.field8991 = (long) arg0;
        this.field2068.method1526(var4, arg2 ^ -89);
        if (arg2 != -1) {
            this.method1034((Object) null, -65, (Canvas) null);
        }
    }

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "(B)V", line = 139)
    public final void method1012(byte arg0) {
        ++field2030;
        class440.field6141[0] = super.field6507 * super.field6474;
        class440.field6141[2] = super.field6547 * super.field6507;
        class440.field6141[3] = 1.0F;
        class440.field6141[1] = super.field6536 * super.field6507;
        OpenGL.glLightfv(16384, 4609, class440.field6141, 0);
        class440.field6141[1] = -super.field6455 * super.field6536;
        class440.field6141[0] = -super.field6455 * super.field6474;
        if (arg0 == 46) {
            class440.field6141[3] = 1.0F;
            class440.field6141[2] = -super.field6455 * super.field6547;
            OpenGL.glLightfv(16385, 4609, class440.field6141, 0);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BLti;Lkca;)Z", line = 160)
    public final boolean method1013(byte arg0, class438 arg1, class82 arg2) {
        ++field2066;
        if (arg0 != -19) {
            this.field2076 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lc;Lvi;)Luaa;", line = 171)
    public final class116 method544(class185 arg0, class536 arg1) {
        ++field2032;
        return null;
    }

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "()V", line = 179)
    public final void method590() {
        ++field1993;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lhi;Z)V", line = 190)
    public final void method1014(class203 arg0, boolean arg1) {
        ++field2027;
        class328[] var3 = ((class117) arg0).field1850;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = arg1;
        for (int var8 = 0; ~var8 > ~var3.length; ++var8) {
            class328 var11 = var3[var8];
            class214 var12 = this.field2078[var8];
            int var13 = 0;
            int var14 = var12.method1493(116);
            long var15 = var12.method2666((byte) 127);
            var12.method2672((byte) -127);
            for (int var17 = 0; var17 < var11.method2098(-28377); ++var17) {
                class674 var18 = var11.method2097(11, var17);
                if (class674.field9457 != var18) {
                    if (class674.field9459 != var18) {
                        if (class674.field9460 == var18) {
                            var5 = true;
                            OpenGL.glColorPointer(4, 5121, var14, var15 - -((long) var13));
                        } else if (class674.field9461 == var18) {
                            OpenGL.glClientActiveTexture(33984 - -(var4++));
                            OpenGL.glTexCoordPointer(1, 5126, var14, (long) var13 + var15);
                        } else if (class674.field9462 == var18) {
                            OpenGL.glClientActiveTexture(33984 + var4++);
                            OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                        } else if (class674.field9463 != var18) {
                            if (class674.field9464 == var18) {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(4, 5126, var14, var15 - -((long) var13));
                            }
                        } else {
                            OpenGL.glClientActiveTexture(33984 - -(var4++));
                            OpenGL.glTexCoordPointer(3, 5126, var14, var15 - -((long) var13));
                        }
                    } else {
                        OpenGL.glNormalPointer(5126, var14, (long) var13 + var15);
                        var6 = true;
                    }
                } else {
                    var7 = true;
                    OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                }
                var13 += var18.field9458;
            }
        }
        if (!var7 == this.field2080) {
            if (var7) {
                OpenGL.glEnableClientState(32884);
            } else {
                OpenGL.glDisableClientState(32884);
            }
            this.field2080 = var7;
        }
        if (!var6 == this.field2084) {
            if (var6) {
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            this.field2084 = var6;
        }
        if (!var5 == this.field2081) {
            if (var5) {
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            this.field2081 = var5;
        }
        if (~this.field2083 <= ~var4) {
            if (var4 < this.field2083) {
                for (int var9 = var4; ~this.field2083 < ~var9; ++var9) {
                    OpenGL.glClientActiveTexture(33984 - -var9);
                    OpenGL.glDisableClientState(32888);
                }
                this.field2083 = var4;
                return;
            }
        } else {
            for (int var10 = this.field2083; ~var10 > ~var4; ++var10) {
                OpenGL.glClientActiveTexture(var10 + 33984);
                OpenGL.glEnableClientState(32888);
            }
            this.field2083 = var4;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZIZ[[I)Lsaa;", line = 350)
    public final class326 method1015(boolean arg0, int arg1, boolean arg2, int[][] arg3) {
        if (arg2) {
            return null;
        } else {
            ++field2018;
            return new class754(this, arg1, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!eea", name = "GA", descriptor = "(I)V", line = 362)
    public final void method617(int arg0) {
        ++field2055;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(FFF)V", line = 379)
    public final void method606(float arg0, float arg1, float arg2) {
        ++field1990;
    }

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "()Z", line = 386)
    public final boolean method562() {
        ++field2046;
        return false;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIILkca;I[BZI)Lwda;", line = 395)
    public final class636 method1016(int arg0, int arg1, int arg2, class82 arg3, int arg4, byte[] arg5, boolean arg6, int arg7) {
        if (arg1 != 1) {
            this.method564(true);
        }
        ++field2050;
        if (!this.field2089 && (!class278.method1826((byte) 114, arg7) || !class278.method1826((byte) 117, arg4))) {
            if (!this.field2096) {
                class47 var9 = new class47(this, arg3, class438.field6117, class613.method3530(false, arg7), class613.method3530(false, arg4));
                var9.method433(arg0, arg7, 0, 0, arg4, arg3, false, arg5, arg2);
                return var9;
            } else {
                return new class321(this, arg3, arg7, arg4, arg5, arg2, arg0);
            }
        } else {
            return new class47(this, arg3, arg7, arg4, arg6, arg5, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!eea", name = "Z", descriptor = "(I)V", line = 424)
    public final void method1017(int arg0) {
        if (arg0 == 0) {
            ++field2007;
            OpenGL.glDepthMask(super.field6513 && super.field6473);
        }
    }

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "(B)V", line = 435)
    public final void method1018(byte arg0) {
        if (!super.field6534) {
            OpenGL.glDisable(3042);
        } else {
            OpenGL.glEnable(3042);
        }
        ++field2008;
        if (arg0 <= 113) {
            field1999 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "Y", descriptor = "(I)V", line = 452)
    public final void method1019(int arg0) {
        OpenGL.glViewport(super.field6531, super.field6548, super.field6252, super.field6402);
        if (arg0 >= -85) {
            this.field2095 = false;
        }
        ++field2058;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZZBILtaa;)V", line = 463)
    public final void method1020(boolean arg0, boolean arg1, byte arg2, int arg3, class405 arg4) {
        if (arg2 != 65) {
            this.method1026(false, -85, 34);
        }
        OpenGL.glTexEnvi(8960, arg3 + 34176, class288.method1865(34167, arg4));
        ++field1998;
        if (!arg1) {
            OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 769 : 768);
        } else {
            OpenGL.glTexEnvi(8960, 34192 - -arg3, arg0 ? 771 : 770);
        }
    }

    @OriginalMember(owner = "client!eea", name = "C", descriptor = "(I)V", line = 479)
    public final void method1021(int arg0) {
        if (arg0 != -27512) {
            this.method1042(13);
        }
        OpenGL.glTexEnvi(8960, 34162, class540.method3180(super.field6471[super.field6451], (byte) -126));
        ++field1983;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Luf;III)V", line = 492)
    public final void method1022(class445 arg0, int arg1, int arg2, int arg3) {
        int var5 = -105 % ((74 - arg1) / 32);
        ++field2028;
        byte var6;
        int var7;
        if (class136.field2115 != arg0) {
            if (class543.field7664 == arg0) {
                var6 = 3;
                var7 = arg2 - -1;
            } else if (class428.field5978 == arg0) {
                var7 = arg2 * 3;
                var6 = 4;
            } else if (class442.field6159 != arg0) {
                if (class657.field9242 == arg0) {
                    var6 = 5;
                    var7 = arg2 + 2;
                } else {
                    var6 = 0;
                    var7 = arg2;
                }
            } else {
                var7 = arg2 - -2;
                var6 = 6;
            }
        } else {
            var7 = arg2 * 2;
            var6 = 1;
        }
        OpenGL.glDrawArrays(var6, arg3, var7);
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "()V", line = 543)
    public final void method533() {
        ++field2059;
    }

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "()V", line = 550)
    public final void method567() {
        ++field2037;
        if (super.field6252 > 0 || super.field6402 > 0) {
            int var1 = super.field6468;
            int var2 = super.field6521;
            int var3 = super.field6511;
            int var4 = super.field6459;
            this.method601();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2700(9);
            this.method2749(false, true);
            this.method2747(false, 117);
            this.method2736(12485, false);
            this.method2715(false, -47);
            this.method2732(-122, (class355) null);
            this.method2728(false, false, (byte) 23, -2);
            this.method2721(1, true);
            this.method2738(-64, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field6252, super.field6402, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method584(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!eea", name = "I", descriptor = "()I", line = 596)
    public final int method594() {
        ++field2035;
        return this.field2086;
    }

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "(I)V", line = 604)
    public final void method1023(int arg0) {
        ++field2049;
        this.method2711(-47);
        int var2;
        for (var2 = 0; super.field6503 > var2; ++var2) {
            class36 var3 = super.field6470[var2];
            int var4 = var3.method292(6865);
            int var5 = var2 + 16386;
            float var6 = var3.method296((byte) 3) / 255.0F;
            class440.field6141[0] = (float) var3.method290((byte) 52);
            class440.field6141[1] = (float) var3.method298(false);
            class440.field6141[2] = (float) var3.method291(0);
            class440.field6141[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class440.field6141, 0);
            class440.field6141[1] = (float) (class555.method3246(var4, 65528) >> 8) * var6;
            class440.field6141[2] = (float) class555.method3246(255, var4) * var6;
            class440.field6141[0] = (float) class555.method3246(255, var4 >> 16) * var6;
            class440.field6141[3] = 1.0F;
            OpenGL.glLightfv(var5, 4609, class440.field6141, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method294(49) * var3.method294(49)));
            OpenGL.glEnable(var5);
        }
        if (arg0 <= 96) {
            this.field2074 = null;
        }
        while (~super.field6523 < ~var2) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        super.method1023(98);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILkca;Lti;II)Lwda;", line = 653)
    public final class636 method1024(int arg0, class82 arg1, class438 arg2, int arg3, int arg4) {
        ++field1986;
        if (arg3 != 0) {
            return null;
        } else if (!this.field2089 && (!class278.method1826((byte) 119, arg0) || !class278.method1826((byte) 119, arg4))) {
            return this.field2096 ? new class321(this, arg1, arg2, arg0, arg4) : new class47(this, arg1, arg2, class613.method3530(false, arg0), class613.method3530(false, arg4));
        } else {
            return new class47(this, arg1, arg2, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 681)
    public final void method1025(int arg0, Canvas arg1, Object arg2) {
        ++field2024;
        if (arg0 <= -3) {
            Long var4 = (Long) arg2;
            this.field2020.releaseSurface(arg1, var4);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZII)V", line = 694)
    public final synchronized void method1026(boolean arg0, int arg1, int arg2) {
        ++field2001;
        class528 var4 = new class528(arg1);
        var4.field8991 = (long) arg2;
        this.field2051.method1526(var4, 115);
        if (arg0) {
            this.method1026(true, -81, 43);
        }
    }

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "(I)V", line = 708)
    public final void method1027(int arg0) {
        ++field2044;
        if (super.field6520 && !super.field6501) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        int var2 = 94 % ((-60 - arg0) / 51);
    }

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "(II)V", line = 725)
    public final void method1028(int arg0, int arg1) {
        if (arg1 == 0) {
            ++field1981;
        }
    }

    @OriginalMember(owner = "client!eea", name = "J", descriptor = "(I)V", line = 735)
    public final void method1029(int arg0) {
        if (arg0 == 9) {
            ++field2014;
        }
    }

    @OriginalMember(owner = "client!eea", name = "F", descriptor = "(I)V", line = 746)
    public final void method1030(int arg0) {
        OpenGL.glActiveTexture(super.field6451 + 33984);
        ++field2003;
        if (arg0 != -5578) {
            this.field2081 = false;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIII)V", line = 758)
    public final void method625(int arg0, int arg1, int arg2, int arg3) {
        ++field2054;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZZ)V", line = 765)
    public final void method1031(boolean arg0, boolean arg1) {
        if (arg1) {
            OpenGL.glEnable(32925);
        } else {
            OpenGL.glDisable(32925);
        }
        ++field2053;
        if (arg0) {
            this.field2089 = true;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "([FIIZIILkca;I)Lwda;", line = 781)
    public final class636 method1032(float[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class82 arg6, int arg7) {
        ++field2005;
        if (arg7 > -12) {
            this.method551(117, -43);
        }
        if (!this.field2089 && (!class278.method1826((byte) 122, arg4) || !class278.method1826((byte) 114, arg1))) {
            if (!this.field2096) {
                class47 var9 = new class47(this, arg6, class438.field6121, class613.method3530(false, arg4), class613.method3530(false, arg1));
                var9.method424(0, arg0, -4, arg6, arg4, 0, arg1, arg2, arg5);
                return var9;
            } else {
                return new class321(this, arg6, arg4, arg1, arg0, arg2, arg5);
            }
        } else {
            return new class47(this, arg6, arg4, arg1, arg3, arg0, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "(B)V", line = 810)
    public final void method1033(byte arg0) {
        if (arg0 <= -25) {
            OpenGL.glScissor(super.field6531 + super.field6468, -super.field6459 + super.field6548 + super.field6402, -super.field6468 + super.field6521, -super.field6511 + super.field6459);
            ++field1984;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V", line = 823)
    public final void method1034(Object arg0, int arg1, Canvas arg2) {
        ++field2029;
        if (arg1 == 15) {
            Long var4 = (Long) arg0;
            this.field2020.surfaceResized(var4);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILti;Lkca;)Z", line = 837)
    public final boolean method1035(int arg0, class438 arg1, class82 arg2) {
        if (arg0 > -86) {
            return true;
        } else {
            ++field1997;
            return true;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BZ)Lcaa;", line = 849)
    public final class302 method1036(byte arg0, boolean arg1) {
        ++field2067;
        if (arg0 > -34) {
            this.method562();
        }
        return new class214(this, arg1);
    }

    @OriginalMember(owner = "client!eea", name = "C", descriptor = "(B)V", line = 862)
    public static void method1037(byte arg0) {
        if (arg0 < 9) {
            method1054((char) 65498, true);
        }
        field1999 = null;
        field2065 = null;
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Leq;I)V", line = 947)
    public class132(OpenGL arg0, Canvas arg1, long arg2, class149 arg3, class209 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field2020 = arg0;
            this.field2020.method3600();
            this.field2093 = OpenGL.glGetString(7936).toLowerCase();
            this.field2092 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field2093.indexOf("microsoft") == 0 && ~this.field2093.indexOf("brian paul") == 0 && ~this.field2093.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class327.method2091(' ', 26911, var8.replace('.', ' '));
                if (~var9.length > -3) {
                    throw new RuntimeException("");
                } else {
                    try {
                        int var10 = class547.method3226((byte) 48, var9[0]);
                        int var11 = class547.method3226((byte) 44, var9[1]);
                        this.field2087 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field2087 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field2020.method3599("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field2020.method3599("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field6546 = var12[0];
                        if (super.field6546 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field6539 = 8;
                            this.field2090 = this.field2020.method3599("GL_ARB_vertex_buffer_object");
                            super.field6510 = this.field2020.method3599("GL_ARB_multisample");
                            this.field2096 = this.field2020.method3599("GL_ARB_texture_rectangle");
                            super.field6518 = this.field2020.method3599("GL_ARB_texture_cube_map");
                            this.field2089 = this.field2020.method3599("GL_ARB_texture_non_power_of_two");
                            super.field6465 = this.field2020.method3599("GL_EXT_texture3D");
                            this.field2091 = this.field2020.method3599("GL_ARB_vertex_shader");
                            this.field2097 = this.field2020.method3599("GL_ARB_vertex_program");
                            this.field2095 = this.field2020.method3599("GL_ARB_fragment_shader");
                            this.field2020.method3599("GL_ARB_fragment_program");
                            this.field2088 = new int[super.field6546];
                            this.field2094 = Stream.method3762() ? 33639 : 5121;
                            if (this.field2092.indexOf("radeon") != -1) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class327.method2091(' ', 26911, this.field2092.replace('/', ' '));
                                for (int var17 = 0; var17 < var16.length; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (~var18.charAt(0) == -121 && ~var18.length() <= -4 && class395.method2450(var18.substring(1, 3), 10)) {
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
                                                if (var18.length() >= 4 && class395.method2450(var18.substring(0, 4), 10)) {
                                                    var13 = class547.method3226((byte) 78, var18.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (~var13 <= -7001 && ~var13 >= -9251) {
                                        super.field6465 = false;
                                    }
                                    if (var13 >= 7000 && var13 <= 7999) {
                                        this.field2090 = false;
                                    }
                                }
                                this.field2096 &= this.field2020.method3599("GL_ARB_half_float_pixel");
                            }
                            this.field2093.indexOf("intel");
                            if (this.field2090) {
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
            this.method638();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "(B)V", line = 880)
    public final void method1038(byte arg0) {
        ++field1995;
        if (arg0 >= -84) {
            this.field2082 = null;
        }
        if (class701.field9845 != super.field6453) {
            if (class417.field5853 == super.field6453) {
                OpenGL.glBlendFunc(1, 1);
                return;
            }
            if (class76.field1450 == super.field6453) {
                OpenGL.glBlendFunc(774, 1);
                return;
            }
        } else {
            OpenGL.glBlendFunc(770, 771);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BI)Ldw;", line = 901)
    public final class715 method1039(byte arg0, int arg1) {
        ++field1985;
        if (arg0 != 67) {
            this.field2020 = null;
        }
        if (arg1 != 3) {
            if (arg1 != 4) {
                return ~arg1 == -9 ? new class65(this, super.field6435, super.field6340) : super.method1039((byte) 67, arg1);
            } else {
                return new class555(this, super.field6435, super.field6340);
            }
        } else {
            return new class682(this, super.field6435);
        }
    }

    @OriginalMember(owner = "client!eea", name = "A", descriptor = "()V", line = 1103)
    public final void method638() {
        super.method638();
        ++field2064;
        if (this.field2020 != null) {
            this.field2020.method3601();
            this.field2020.release();
            this.field2020 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BLcv;)V", line = 1121)
    public final void method1040(byte arg0, class565 arg1) {
        if (class686.field9674 != arg1) {
            int var3 = class590.method3385(arg1, -108);
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
        ++field2060;
        if (arg0 != -123) {
            this.method1033((byte) 0);
        }
    }

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "(B)V", line = 1151)
    public final void method1041(byte arg0) {
        ++field2048;
        if (super.field6517) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
        if (arg0 != -28) {
            this.field2082 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "gb", descriptor = "(I)V", line = 1166)
    private final void method1042(int arg0) {
        ++field2021;
        if (this.field2079) {
            OpenGL.glPopMatrix();
        }
        if (!super.field6532.method3626(17)) {
            if (!super.field6444) {
                OpenGL.glLoadMatrixf(super.field6441.method177(class471.field6778, 126), 0);
                this.field2079 = false;
            } else {
                OpenGL.glLoadIdentity();
                this.field2079 = false;
            }
        } else {
            if (!this.field2076) {
                OpenGL.glLoadMatrixf(super.field6448.method177(class471.field6778, -83), 0);
                this.field2076 = true;
                this.method1053((byte) 127);
                this.method1023(113);
            }
            if (!super.field6444) {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field6441.method177(class471.field6778, 126), 0);
                this.field2079 = true;
            } else {
                this.field2079 = false;
            }
        }
        int var2 = -58 / ((-37 - arg0) / 53);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 1212)
    public final void method628(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class701 {
        this.method554(arg2, arg3);
        ++field2033;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Luaa;)V", line = 1220)
    public final void method610(class116 arg0) {
        ++field2045;
    }

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "(B)V", line = 1228)
    public final void method1043(byte arg0) {
        ++field2016;
        int var2 = -4 % ((arg0 - -62) / 43);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(super.field6478, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!eea", name = "G", descriptor = "(I)V", line = 1242)
    public final void method1044(int arg0) {
        OpenGL.glTexEnvi(8960, 34161, class540.method3180(super.field6489[super.field6451], (byte) -100));
        ++field2006;
        if (arg0 < 84) {
            this.field2085 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "()V", line = 1255)
    public final void method595() {
        ++field2036;
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "(I)V", line = 1263)
    public final synchronized void method566(int arg0) {
        ++field2023;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field2051.method1528(65)) {
            class528 var12 = (class528) this.field2051.method1521(120);
            class186.field2663[var3++] = (int) var12.field8991;
            super.field6439 -= var12.field7502;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class186.field2663, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class186.field2663, 0);
            var3 = 0;
        }
        while (!this.field2068.method1528(65)) {
            class528 var11 = (class528) this.field2068.method1521(114);
            class186.field2663[var3++] = (int) var11.field8991;
            super.field6440 -= var11.field7502;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class186.field2663, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class186.field2663, 0);
            var3 = 0;
        }
        while (!this.field2072.method1528(65)) {
            class528 var10 = (class528) this.field2072.method1521(115);
            class186.field2663[var3++] = var10.field7502;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class186.field2663, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class186.field2663, 0);
            var3 = 0;
        }
        while (!this.field2073.method1528(65)) {
            class528 var9 = (class528) this.field2073.method1521(115);
            class186.field2663[var3++] = (int) var9.field8991;
            super.field6445 -= var9.field7502;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class186.field2663, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class186.field2663, 0);
            boolean var4 = false;
        }
        while (!this.field2026.method1528(65)) {
            class528 var8 = (class528) this.field2026.method1521(120);
            OpenGL.glDeleteLists((int) var8.field8991, var8.field7502);
        }
        while (!this.field2074.method1528(65)) {
            class626 var7 = this.field2074.method1521(112);
            OpenGL.glDeleteProgramARB((int) var7.field8991);
        }
        while (!this.field2075.method1528(65)) {
            class626 var6 = this.field2075.method1521(119);
            OpenGL.glDeleteObjectARB(var6.field8991);
        }
        while (!this.field2026.method1528(65)) {
            class528 var5 = (class528) this.field2026.method1521(127);
            OpenGL.glDeleteLists((int) var5.field8991, var5.field7502);
        }
        if (~this.method641() < -100663297 && class742.method4128(1) > this.field2077 - -60000L) {
            System.gc();
            this.field2077 = class742.method4128(1);
        }
        super.method566(var2);
    }

    @OriginalMember(owner = "client!eea", name = "cb", descriptor = "(I)V", line = 1424)
    public final void method1045(int arg0) {
        if (super.field6485 && super.field6549 && super.field6477 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field1987;
        if (arg0 != 6) {
            this.method1049(-20, -77, -72, (int[]) null, false, 61, true);
        }
    }

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "()Lsia;", line = 1440)
    public final class732 method599() {
        ++field2010;
        int var1 = -1;
        if (this.field2093.indexOf("nvidia") == -1) {
            if (this.field2093.indexOf("intel") == -1) {
                if (this.field2093.indexOf("ati") != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class732(var1, "OpenGL", this.field2087, this.field2092, 0L);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IILida;BILuf;I)V", line = 1464)
    public final void method1046(int arg0, int arg1, class234 arg2, byte arg3, int arg4, class445 arg5, int arg6) {
        ++field2052;
        byte var8;
        int var9;
        if (class136.field2115 == arg5) {
            var8 = 1;
            var9 = arg4 * 2;
        } else if (class543.field7664 != arg5) {
            if (class428.field5978 != arg5) {
                if (class442.field6159 == arg5) {
                    var8 = 6;
                    var9 = arg4 - -2;
                } else if (class657.field9242 == arg5) {
                    var9 = arg4 + 2;
                    var8 = 5;
                } else {
                    var9 = arg4;
                    var8 = 0;
                }
            } else {
                var9 = arg4 * 3;
                var8 = 4;
            }
        } else {
            var8 = 3;
            var9 = arg4 - -1;
        }
        class438 var10 = arg2.method1598(-22);
        class530 var11 = (class530) arg2;
        var11.method2672((byte) -118);
        int var12 = 116 % ((-11 - arg3) / 50);
        OpenGL.glDrawElements(var8, var9, class34.method218(255, var10), var11.method2666((byte) 116) - -((long) (var10.field6113 * arg0)));
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lsfa;Lsfa;FLsfa;)Lsfa;", line = 1520)
    public final class693 method571(class693 arg0, class693 arg1, float arg2, class693 arg3) {
        ++field2047;
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(IZ)Lida;", line = 1528)
    public final class234 method1047(int arg0, boolean arg1) {
        int var3 = -121 % ((arg0 - 31) / 45);
        ++field2019;
        return new class530(this, class438.field6118, arg1);
    }

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "(I)V", line = 1538)
    public final void method1048(int arg0) {
        for (int var2 = super.field6546 + -1; ~var2 <= -1; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field2057;
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
        this.field2020.setSwapInterval(0);
        super.method1048(arg0);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(III[IZIZ)Lwda;", line = 1592)
    public final class636 method1049(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg6) {
            this.field2080 = false;
        }
        ++field1988;
        if (!this.field2089 && (!class278.method1826((byte) 127, arg2) || !class278.method1826((byte) 118, arg5))) {
            if (!this.field2096) {
                class47 var8 = new class47(this, class282.field4019, class438.field6117, class613.method3530(arg6, arg2), class613.method3530(arg6, arg5));
                var8.method434(arg5, 0, 0, true, arg0, arg2, arg3, arg1);
                return var8;
            } else {
                return new class321(this, arg2, arg5, arg3, arg1, arg0);
            }
        } else {
            return new class47(this, arg2, arg5, arg4, arg3, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "(B)V", line = 1624)
    public final void method1050(byte arg0) {
        if (arg0 == 111) {
            if (!super.field6541) {
                OpenGL.glDisable(3008);
            } else {
                OpenGL.glEnable(3008);
            }
            ++field2043;
        }
    }

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "()Z", line = 1640)
    public final boolean method618() {
        ++field2004;
        return false;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(Z)V", line = 1651)
    public final void method564(boolean arg0) {
        ++field2013;
    }

    @OriginalMember(owner = "client!eea", name = "T", descriptor = "(I)V", line = 1659)
    public final void method1051(int arg0) {
        class440.field6141[3] = 1.0F;
        class440.field6141[2] = super.field6547 * super.field6493;
        ++field2002;
        class440.field6141[0] = super.field6493 * super.field6474;
        if (arg0 != Integer.MIN_VALUE) {
            this.method1039((byte) -48, -15);
        }
        class440.field6141[1] = super.field6536 * super.field6493;
        OpenGL.glLightModelfv(2899, class440.field6141, 0);
    }

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "(I)V", line = 1675)
    public final void method1052(int arg0) {
        if (!super.field6574) {
            OpenGL.glDisable(3089);
        } else {
            OpenGL.glEnable(3089);
        }
        if (arg0 == -13771) {
            ++field2071;
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)V", line = 1693)
    public final void method1053(byte arg0) {
        ++field2039;
        OpenGL.glLightfv(16384, 4611, super.field6540, 0);
        if (arg0 <= 123) {
            this.field2096 = true;
        }
        OpenGL.glLightfv(16385, 4611, super.field6454, 0);
    }

    @OriginalMember(owner = "client!eea", name = "ya", descriptor = "()V", line = 1706)
    public final void method619() {
        this.method2715(true, -54);
        ++field2056;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(CZ)Z", line = 1715)
    public static final boolean method1054(char arg0, boolean arg1) {
        if (!arg1) {
            field1999 = null;
        }
        ++field2040;
        return arg0 == 160 || ~arg0 == -33 || ~arg0 == -96 || arg0 == '-';
    }

    @OriginalMember(owner = "client!eea", name = "bb", descriptor = "(I)V", line = 1729)
    public final void method1055(int arg0) {
        if (arg0 != 11030) {
            this.field2085 = null;
        }
        ++field2034;
        this.method1042(arg0 ^ 11013);
    }

    @OriginalMember(owner = "client!eea", name = "O", descriptor = "(I)V", line = 1741)
    public final void method1056(int arg0) {
        ++field2015;
        super.field6508 = (float) (super.field6483 - super.field6505);
        super.field6500 = super.field6508 - (float) super.field6477;
        if ((float) super.field6533 > super.field6500) {
            super.field6500 = (float) super.field6533;
        }
        OpenGL.glFogf(2915, super.field6500);
        OpenGL.glFogf(2916, super.field6508);
        class440.field6141[2] = (float) class555.method3246(super.field6542, 255) / 255.0F;
        class440.field6141[arg0] = (float) class555.method3246(super.field6542, 16711680) / 1.671168E7F;
        class440.field6141[1] = (float) class555.method3246(65280, super.field6542) / 65280.0F;
        OpenGL.glFogfv(2918, class440.field6141, 0);
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(BI)V", line = 1759)
    public final synchronized void method1057(byte arg0, int arg1) {
        ++field2000;
        if (arg0 > -123) {
            this.field2026 = null;
        }
        class626 var3 = new class626();
        var3.field8991 = (long) arg1;
        this.field2074.method1526(var3, -106);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;", line = 1781)
    public final Object method1058(Canvas arg0, byte arg1) {
        ++field1991;
        if (arg1 < 54) {
            this.field2020 = null;
        }
        long var3 = this.field2020.prepareSurface(arg0);
        if (var3 == -1L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(II)V", line = 1797)
    public final void method554(int arg0, int arg1) throws class701 {
        ++field2041;
        this.field2020.swapBuffers();
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lcaa;II)V", line = 1807)
    public final void method1059(class302 arg0, int arg1, int arg2) {
        this.field2078[arg1] = (class214) arg0;
        if (arg2 > -6) {
            this.method1046(-50, 97, (class234) null, (byte) 124, 67, (class445) null, -91);
        }
        ++field2062;
    }

    @OriginalMember(owner = "client!eea", name = "na", descriptor = "(IIII)[I", line = 1818)
    public final int[] method574(int arg0, int arg1, int arg2, int arg3) {
        ++field2069;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, super.field6402 - arg1 + -1 - var6, arg2, 1, 32993, this.field2094, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "()V", line = 1838)
    public final void method536() {
        ++field1992;
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "(II)Lc;", line = 1846)
    public final class185 method644(int arg0, int arg1) {
        ++field2017;
        return null;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lkca;IBI[BI)Lii;", line = 1863)
    public final class550 method1060(class82 arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = -47 % ((58 - arg2) / 57);
        ++field1994;
        return new class262(this, arg0, arg1, arg5, arg3, arg4);
    }

    @OriginalMember(owner = "client!eea", name = "y", descriptor = "(I)V", line = 1877)
    public final void method1061(int arg0) {
        int var2 = 31 / ((arg0 - -55) / 59);
        ++field2031;
        int var3 = this.field2088[super.field6451];
        if (~var3 != -1) {
            this.field2088[super.field6451] = 0;
            OpenGL.glBindTexture(var3, 0);
            OpenGL.glDisable(var3);
        }
    }

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "(B)V", line = 1896)
    public final void method1062(byte arg0) {
        ++field2022;
        if (arg0 <= 118) {
            method1037((byte) 3);
        }
        this.field2076 = false;
        this.method1042(88);
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "(B)V", line = 1908)
    public final void method1063(byte arg0) {
        ++field2063;
        OpenGL.glMatrixMode(5890);
        if (arg0 < 124) {
            this.field2026 = null;
        }
        if (super.field6515[super.field6451] != class43.field653) {
            OpenGL.glLoadMatrixf(super.field6486[super.field6451].method177(class471.field6778, 127), 0);
        } else {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)Lvi;", line = 1931)
    public final class536 method551(int arg0, int arg1) {
        ++field2038;
        return null;
    }
}
