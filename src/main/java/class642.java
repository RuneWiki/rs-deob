import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class642 extends class114 {

    @OriginalMember(owner = "client!fc", name = "ai", descriptor = "Low;")
    private class665 field9102 = new class665();

    @OriginalMember(owner = "client!fc", name = "mi", descriptor = "Low;")
    private class665 field9114 = new class665();

    @OriginalMember(owner = "client!fc", name = "pi", descriptor = "Low;")
    private class665 field9117 = new class665();

    @OriginalMember(owner = "client!fc", name = "qi", descriptor = "Low;")
    private class665 field9118 = new class665();

    @OriginalMember(owner = "client!fc", name = "ri", descriptor = "Low;")
    private class665 field9119 = new class665();

    @OriginalMember(owner = "client!fc", name = "si", descriptor = "Low;")
    private class665 field9120 = new class665();

    @OriginalMember(owner = "client!fc", name = "ti", descriptor = "Low;")
    private class665 field9121 = new class665();

    @OriginalMember(owner = "client!fc", name = "Ci", descriptor = "[Luha;")
    private class5[] field9130 = new class5[16];

    @OriginalMember(owner = "client!fc", name = "ui", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field9122 = new MapBuffer();

    @OriginalMember(owner = "client!fc", name = "Di", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field9131 = new MapBuffer();

    @OriginalMember(owner = "client!fc", name = "Pi", descriptor = "I")
    private int field9143 = 0;

    @OriginalMember(owner = "client!fc", name = "Sh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field9094;

    @OriginalMember(owner = "client!fc", name = "Hi", descriptor = "Ljava/lang/String;")
    private String field9135;

    @OriginalMember(owner = "client!fc", name = "Mi", descriptor = "Ljava/lang/String;")
    private String field9140;

    @OriginalMember(owner = "client!fc", name = "Ni", descriptor = "I")
    private int field9141;

    @OriginalMember(owner = "client!fc", name = "Ii", descriptor = "Z")
    public boolean field9136;

    @OriginalMember(owner = "client!fc", name = "Gi", descriptor = "Z")
    private boolean field9134;

    @OriginalMember(owner = "client!fc", name = "Li", descriptor = "Z")
    private boolean field9139;

    @OriginalMember(owner = "client!fc", name = "Fi", descriptor = "Z")
    public boolean field9133;

    @OriginalMember(owner = "client!fc", name = "Ei", descriptor = "Z")
    public boolean field9132;

    @OriginalMember(owner = "client!fc", name = "Oi", descriptor = "Z")
    public boolean field9142;

    @OriginalMember(owner = "client!fc", name = "Ki", descriptor = "[I")
    public int[] field9138;

    @OriginalMember(owner = "client!fc", name = "Ji", descriptor = "I")
    public int field9137;

    @OriginalMember(owner = "client!fc", name = "Cg", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!fc", name = "Dg", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!fc", name = "Eg", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!fc", name = "Fg", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!fc", name = "Gg", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!fc", name = "Hg", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!fc", name = "Ig", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!fc", name = "Jg", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!fc", name = "Kg", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!fc", name = "Lg", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!fc", name = "Mg", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!fc", name = "Ng", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!fc", name = "Og", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!fc", name = "Pg", descriptor = "I")
    public static int field9039;

    @OriginalMember(owner = "client!fc", name = "Qg", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!fc", name = "Rg", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!fc", name = "Sg", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!fc", name = "Tg", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!fc", name = "Ug", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!fc", name = "Vg", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!fc", name = "Wg", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!fc", name = "Xg", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!fc", name = "Yg", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!fc", name = "Zg", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!fc", name = "ah", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!fc", name = "bh", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!fc", name = "ch", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!fc", name = "dh", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!fc", name = "eh", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!fc", name = "fh", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!fc", name = "gh", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!fc", name = "hh", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!fc", name = "ih", descriptor = "I")
    public static int field9058;

    @OriginalMember(owner = "client!fc", name = "jh", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!fc", name = "kh", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!fc", name = "lh", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!fc", name = "mh", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!fc", name = "nh", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!fc", name = "oh", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!fc", name = "ph", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!fc", name = "qh", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!fc", name = "rh", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!fc", name = "sh", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!fc", name = "th", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!fc", name = "uh", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!fc", name = "vh", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!fc", name = "wh", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!fc", name = "xh", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!fc", name = "yh", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!fc", name = "zh", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!fc", name = "Ah", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!fc", name = "Bh", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!fc", name = "Ch", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!fc", name = "Dh", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!fc", name = "Eh", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!fc", name = "Fh", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!fc", name = "Gh", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!fc", name = "Hh", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!fc", name = "Ih", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!fc", name = "Jh", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!fc", name = "Kh", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!fc", name = "Lh", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!fc", name = "Mh", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!fc", name = "Nh", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!fc", name = "Oh", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!fc", name = "Ph", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!fc", name = "Qh", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!fc", name = "Rh", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!fc", name = "Th", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!fc", name = "Uh", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!fc", name = "Vh", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!fc", name = "Wh", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!fc", name = "Xh", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!fc", name = "Yh", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!fc", name = "Zh", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!fc", name = "bi", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!fc", name = "ci", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!fc", name = "di", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!fc", name = "ei", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!fc", name = "fi", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!fc", name = "gi", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!fc", name = "hi", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!fc", name = "ii", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!fc", name = "ji", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!fc", name = "ki", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!fc", name = "li", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!fc", name = "ni", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!fc", name = "oi", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!fc", name = "vi", descriptor = "I")
    private int field9123;

    @OriginalMember(owner = "client!fc", name = "Ai", descriptor = "J")
    private long field9128;

    @OriginalMember(owner = "client!fc", name = "wi", descriptor = "Z")
    private boolean field9124;

    @OriginalMember(owner = "client!fc", name = "xi", descriptor = "Z")
    private boolean field9125;

    @OriginalMember(owner = "client!fc", name = "yi", descriptor = "Z")
    private boolean field9126;

    @OriginalMember(owner = "client!fc", name = "zi", descriptor = "Z")
    private boolean field9127;

    @OriginalMember(owner = "client!fc", name = "Bi", descriptor = "Z")
    private boolean field9129;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(II)Ljk;", line = 5)
    public final class788 method88(int arg0, int arg1) {
        ++field9044;
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "(I)V", line = 18)
    public final void method93(int arg0) {
        if (arg0 == 9) {
            ++field9045;
            if (!super.field1899) {
                OpenGL.glDisable(16384);
                OpenGL.glDisable(16385);
            } else {
                OpenGL.glEnable(16384);
                OpenGL.glEnable(16385);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ[BIILnea;I)Llba;", line = 42)
    public final class225 method136(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4, int arg5, class600 arg6, int arg7) {
        if (arg1 > -23) {
            this.method54(41);
        }
        ++field9031;
        if (!this.field9139 && (!class362.method2181(arg0, -1) || !class362.method2181(arg5, -1))) {
            if (!this.field9134) {
                class686 var9 = new class686(this, arg6, class629.field8918, class661.method3706(arg0, true), class661.method3706(arg5, true));
                var9.method331(0, true, arg6, 0, arg3, arg4, arg0, arg7, arg5);
                return var9;
            } else {
                return new class44(this, arg6, arg0, arg5, arg3, arg7, arg4);
            }
        } else {
            return new class686(this, arg6, arg0, arg5, arg2, arg3, arg7, arg4);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(IB)V", line = 70)
    public final void method102(int arg0, byte arg1) {
        if (arg1 <= 90) {
            this.method76(-78, -76);
        }
        ++field9103;
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "()Z", line = 80)
    public final boolean method99() {
        ++field9050;
        return false;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILnea;I[BI)Loq;", line = 89)
    public final class232 method112(int arg0, int arg1, class600 arg2, int arg3, byte[] arg4, int arg5) {
        ++field9055;
        return arg5 != 0 ? null : new class404(this, arg2, arg1, arg3, arg0, arg4);
    }

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "()V", line = 107)
    public final void method142() {
        ++field9108;
        super.method142();
        if (this.field9094 != null) {
            this.field9094.method233();
            this.field9094.release();
            this.field9094 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)Lwba;", line = 132)
    public final class601 method135(boolean arg0, int arg1) {
        ++field9100;
        if (arg1 != 0) {
            this.method74(6);
        }
        return new class5(this, arg0);
    }

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "(I)V", line = 143)
    public final void method105(int arg0) {
        OpenGL.glLightfv(16384, 4611, super.field1940, 0);
        if (arg0 == -14620) {
            ++field9038;
            OpenGL.glLightfv(16385, 4611, super.field1886, 0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "(B)V", line = 155)
    public final void method55(byte arg0) {
        int var2 = 30 % ((-53 - arg0) / 59);
        OpenGL.glActiveTexture(33984 - -super.field1876);
        ++field9033;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lvr;Lvr;FLvr;)Lvr;", line = 165)
    public final class458 method94(class458 arg0, class458 arg1, float arg2, class458 arg3) {
        ++field9051;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "()V", line = 176)
    public final void method87() {
        ++field9079;
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(B)V", line = 184)
    public final void method70(byte arg0) {
        if (arg0 == 85) {
            if (super.field1852 && !super.field1895) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
            ++field9101;
        }
    }

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "(Z)V", line = 199)
    public final void method68(boolean arg0) {
        ++field9060;
        int var2 = this.field9138[super.field1876];
        if (arg0) {
            if (var2 != 0) {
                this.field9138[super.field1876] = 0;
                OpenGL.glBindTexture(var2, 0);
                OpenGL.glDisable(var2);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)V", line = 219)
    public final void method129(byte arg0) {
        OpenGL.glMatrixMode(5890);
        if (arg0 != -54) {
            this.field9119 = null;
        }
        ++field9040;
        if (super.field1946[super.field1876] == class527.field7355) {
            OpenGL.glLoadIdentity();
        } else {
            OpenGL.glLoadMatrixf(super.field1938[super.field1876].method4099(class39.field457, 21194), 0);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "()Lev;", line = 239)
    public final class165 method108() {
        ++field9071;
        int var1 = -1;
        if (~this.field9135.indexOf("nvidia") == 0) {
            if (~this.field9135.indexOf("intel") == 0) {
                if (this.field9135.indexOf("ati") != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class165(var1, "OpenGL", this.field9141, this.field9140, 0L);
    }

    @OriginalMember(owner = "client!fc", name = "na", descriptor = "(IIII)[I", line = 261)
    public final int[] method82(int arg0, int arg1, int arg2, int arg3) {
        ++field9043;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 - 1 + -var6 + super.field1824, arg2, 1, 32993, this.field9137, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "(I)V", line = 280)
    public final void method101(int arg0) {
        super.field1866 = (float) (-super.field1914 + super.field1934);
        ++field9078;
        super.field1919 = (float) (-super.field1942) + super.field1866;
        if ((float) super.field1911 > super.field1919) {
            super.field1919 = (float) super.field1911;
        }
        if (arg0 <= -88) {
            OpenGL.glFogf(2915, super.field1919);
            OpenGL.glFogf(2916, super.field1866);
            class320.field4553[1] = (float) class194.method1380(65280, super.field1936) / 65280.0F;
            class320.field4553[2] = (float) class194.method1380(super.field1936, 255) / 255.0F;
            class320.field4553[0] = (float) class194.method1380(super.field1936, 16711680) / 1.671168E7F;
            OpenGL.glFogfv(2918, class320.field4553, 0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILmg;II)Z", line = 303)
    public static final boolean method3640(int arg0, int arg1, int arg2, int arg3, class248 arg4, int arg5, int arg6) {
        ++field9106;
        if (class83.field1263 && class317.field4537) {
            if (~class414.field5685 > arg2) {
                return false;
            } else if (arg1 == arg5 && arg0 == arg6) {
                if (!class291.method1845(arg0, (byte) -53, arg5, arg3)) {
                    return false;
                } else if (class707.method3947(arg2 + 2, arg4)) {
                    ++class222.field3263;
                    return true;
                } else {
                    return false;
                }
            } else {
                for (int var7 = arg5; ~arg1 <= ~var7; ++var7) {
                    for (int var8 = arg0; var8 <= arg6; ++var8) {
                        if (class695.field9788[arg3][var7][var8] == -class94.field1352) {
                            return false;
                        }
                    }
                }
                if (!class707.method3947(-115, arg4)) {
                    return false;
                } else {
                    ++class222.field3263;
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "jb", descriptor = "(I)V", line = 359)
    private final void method3641(int arg0) {
        if (arg0 != 0) {
            this.field9140 = null;
        }
        ++field9089;
        if (this.field9129) {
            OpenGL.glPopMatrix();
        }
        if (super.field1918.method2695(27457)) {
            if (!this.field9127) {
                OpenGL.glLoadMatrixf(super.field1845.method4099(class39.field457, arg0 + 21194), 0);
                this.field9127 = true;
                this.method105(-14620);
                this.method107((byte) -128);
            }
            if (super.field1840) {
                this.field9129 = false;
            } else {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field1837.method4099(class39.field457, arg0 + 21194), 0);
                this.field9129 = true;
            }
        } else if (super.field1840) {
            OpenGL.glLoadIdentity();
            this.field9129 = false;
        } else {
            OpenGL.glLoadMatrixf(super.field1837.method4099(class39.field457, 21194), 0);
            this.field9129 = false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V", line = 406)
    public final void method134(int arg0, Object arg1, Canvas arg2) {
        if (arg0 != 0) {
            this.field9131 = null;
        }
        ++field9035;
        Long var4 = (Long) arg1;
        this.field9094.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "()V", line = 421)
    public final void method115() {
        ++field9032;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V", line = 428)
    public final void method111(byte arg0) {
        ++field9084;
        if (!super.field1905) {
            OpenGL.glDisable(3042);
        } else {
            OpenGL.glEnable(3042);
        }
        if (arg0 >= -12) {
            this.field9130 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "()V", line = 446)
    public final void method121() {
        OpenGL.glFinish();
        ++field9074;
    }

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "(B)V", line = 454)
    public final void method80(byte arg0) {
        if (arg0 == -101) {
            OpenGL.glMatrixMode(5889);
            ++field9087;
            OpenGL.glLoadMatrixf(super.field1922, 0);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(IZ)V", line = 467)
    public final synchronized void method3642(int arg0, boolean arg1) {
        ++field9066;
        class766 var3 = new class766();
        var3.field10592 = (long) arg0;
        this.field9120.method3728((byte) 126, var3);
        if (arg1) {
            this.field9130 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(IZ)V", line = 481)
    public final void method62(int arg0, boolean arg1) {
        ++field9104;
        if (arg1) {
            OpenGL.glEnable(32925);
        } else {
            OpenGL.glDisable(32925);
        }
        int var3 = 31 % ((26 - arg0) / 61);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLnea;Ldr;)Z", line = 496)
    public final boolean method69(byte arg0, class600 arg1, class629 arg2) {
        int var4 = -114 / ((23 - arg0) / 57);
        ++field9088;
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "(I)V", line = 506)
    public final void method78(int arg0) {
        ++field9099;
        this.method3641(arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZLgca;B)V", line = 516)
    public final void method133(int arg0, boolean arg1, class705 arg2, byte arg3) {
        ++field9083;
        OpenGL.glTexEnvi(8960, arg0 + 34184, class151.method1184(arg2, (byte) 62));
        OpenGL.glTexEnvi(8960, arg0 + 34200, !arg1 ? 770 : 771);
        if (arg3 != 119) {
            this.field9134 = false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()Z", line = 528)
    public final boolean method83() {
        ++field9058;
        return false;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)V", line = 536)
    public final synchronized void method3643(int arg0, byte arg1, int arg2) {
        ++field9030;
        class725 var4 = new class725(arg0);
        var4.field10592 = (long) arg2;
        this.field9117.method3728((byte) 121, var4);
        if (arg1 > -32) {
            this.method140(-22, 125, (class463) null, (class713) null, -75, 38, -18);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lrs;)V", line = 550)
    public final void method120(class730 arg0) {
        ++field9034;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILrl;II)V", line = 557)
    public final void method124(int arg0, class713 arg1, int arg2, int arg3) {
        ++field9093;
        int var5;
        byte var6;
        if (class591.field8480 != arg1) {
            if (class315.field4465 != arg1) {
                if (class710.field9929 == arg1) {
                    var5 = arg2 * 3;
                    var6 = 4;
                } else if (class595.field8512 != arg1) {
                    if (class395.field5465 == arg1) {
                        var5 = arg2 - -2;
                        var6 = 5;
                    } else {
                        var5 = arg2;
                        var6 = 0;
                    }
                } else {
                    var5 = arg2 + 2;
                    var6 = 6;
                }
            } else {
                var6 = 3;
                var5 = arg2 + 1;
            }
        } else {
            var5 = arg2 * 2;
            var6 = 1;
        }
        OpenGL.glDrawArrays(var6, arg0, var5);
        if (arg3 != 25886) {
            this.field9132 = true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BILwba;)V", line = 610)
    public final void method71(byte arg0, int arg1, class601 arg2) {
        if (arg0 != -43) {
            field9082 = -97;
        }
        this.field9130[arg1] = (class5) arg2;
        ++field9113;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[Lpfa;)Lija;", line = 622)
    public final class161 method126(int arg0, class249[] arg1) {
        if (arg0 != 10) {
            return null;
        } else {
            ++field9110;
            return new class369(arg1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "()I", line = 634)
    public final int method60() {
        ++field9057;
        return this.field9143;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lup;B)V", line = 642)
    public final void method98(class547 arg0, byte arg1) {
        ++field9116;
        if (arg1 != -60) {
            this.method3646(25, 51L);
        }
        if (class766.field10585 != arg0) {
            int var3 = class480.method2843(arg0, false);
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
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V", line = 670)
    public final synchronized void method74(int arg0) {
        ++field9085;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field9114.method3723((byte) 120)) {
            class725 var12 = (class725) this.field9114.method3726(12691);
            class277.field4001[var2++] = (int) var12.field10592;
            super.field1838 -= var12.field10098;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class277.field4001, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class277.field4001, 0);
            var2 = 0;
        }
        while (!this.field9117.method3723((byte) 108)) {
            class725 var11 = (class725) this.field9117.method3726(12691);
            class277.field4001[var2++] = (int) var11.field10592;
            super.field1842 -= var11.field10098;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class277.field4001, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class277.field4001, 0);
            var2 = 0;
        }
        while (!this.field9118.method3723((byte) 94)) {
            class725 var10 = (class725) this.field9118.method3726(12691);
            class277.field4001[var2++] = var10.field10098;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class277.field4001, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class277.field4001, 0);
            var2 = 0;
        }
        while (!this.field9119.method3723((byte) 108)) {
            class725 var9 = (class725) this.field9119.method3726(12691);
            class277.field4001[var2++] = (int) var9.field10592;
            super.field1839 -= var9.field10098;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class277.field4001, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class277.field4001, 0);
            boolean var4 = false;
        }
        while (!this.field9102.method3723((byte) 100)) {
            class725 var8 = (class725) this.field9102.method3726(12691);
            OpenGL.glDeleteLists((int) var8.field10592, var8.field10098);
        }
        while (!this.field9120.method3723((byte) 92)) {
            class766 var7 = this.field9120.method3726(12691);
            OpenGL.glDeleteProgramARB((int) var7.field10592);
        }
        while (!this.field9121.method3723((byte) 96)) {
            class766 var6 = this.field9121.method3726(12691);
            OpenGL.glDeleteObjectARB(var6.field10592);
        }
        while (!this.field9102.method3723((byte) 111)) {
            class725 var5 = (class725) this.field9102.method3726(12691);
            OpenGL.glDeleteLists((int) var5.field10592, var5.field10098);
        }
        if (this.method474() > 100663296 && ~class337.method2062(false) < ~(this.field9128 - -60000L)) {
            System.gc();
            this.field9128 = class337.method2062(false);
        }
        super.method74(var3);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;", line = 829)
    public final Object method131(Canvas arg0, byte arg1) {
        ++field9068;
        long var3 = this.field9094.prepareSurface(arg0);
        if (arg1 != -1) {
            this.field9136 = false;
        }
        if (~var3 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILnea;[FIZIB)Llba;", line = 847)
    public final class225 method118(int arg0, int arg1, class600 arg2, float[] arg3, int arg4, boolean arg5, int arg6, byte arg7) {
        ++field9105;
        if (arg7 < 36) {
            return null;
        } else if (!this.field9139 && (!class362.method2181(arg4, -1) || !class362.method2181(arg1, -1))) {
            if (this.field9134) {
                return new class44(this, arg2, arg4, arg1, arg3, arg6, arg0);
            } else {
                class686 var9 = new class686(this, arg2, class629.field8922, class661.method3706(arg4, true), class661.method3706(arg1, true));
                var9.method3873(arg3, arg4, arg1, arg6, 0, 0, arg0, 119, arg2);
                return var9;
            }
        } else {
            return new class686(this, arg2, arg4, arg1, arg5, arg3, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZZLgca;I)V", line = 877)
    public final void method139(int arg0, boolean arg1, boolean arg2, class705 arg3, int arg4) {
        if (arg4 == 0) {
            ++field9052;
            OpenGL.glTexEnvi(8960, arg0 + 34176, class151.method1184(arg3, (byte) 62));
            if (arg2) {
                OpenGL.glTexEnvi(8960, arg0 + 34192, !arg1 ? 770 : 771);
            } else {
                OpenGL.glTexEnvi(8960, 34192 - -arg0, !arg1 ? 768 : 769);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(II)Lsba;", line = 893)
    public final class429 method61(int arg0, int arg1) {
        ++field9091;
        if (arg0 != 8983) {
            return null;
        } else if (~arg1 != -4) {
            if (~arg1 != -5) {
                return ~arg1 == -9 ? new class279(this, super.field1726, super.field1782) : super.method61(8983, arg1);
            } else {
                return new class322(this, super.field1726, super.field1782);
            }
        } else {
            return new class383(this, super.field1726);
        }
    }

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "(I)V", line = 938)
    public final void method64(int arg0) {
        OpenGL.glViewport(super.field1933, super.field1910, super.field1834, super.field1824);
        if (arg0 <= 0) {
            this.field9138 = null;
        }
        ++field9026;
    }

    @OriginalMember(owner = "client!fc", name = "ya", descriptor = "()V", line = 950)
    public final void method91() {
        this.method960(true, 0);
        ++field9092;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBLnea;Ldr;I)Llba;", line = 960)
    public final class225 method63(int arg0, byte arg1, class600 arg2, class629 arg3, int arg4) {
        ++field9107;
        if (arg1 != -128) {
            return null;
        } else if (!this.field9139 && (!class362.method2181(arg4, -1) || !class362.method2181(arg0, -1))) {
            return !this.field9134 ? new class686(this, arg2, arg3, class661.method3706(arg4, true), class661.method3706(arg0, true)) : new class44(this, arg2, arg3, arg4, arg0);
        } else {
            return new class686(this, arg2, arg3, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "()V", line = 985)
    public final void method138() {
        ++field9056;
        if (super.field1834 > 0 || super.field1824 > 0) {
            int var1 = super.field1925;
            int var2 = super.field1887;
            int var3 = super.field1944;
            int var4 = super.field1929;
            this.method512();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method950(30);
            this.method994((byte) -38, false);
            this.method946(-1, false);
            this.method947((byte) -75, false);
            this.method960(false, 0);
            this.method988(1, (class408) null);
            this.method963(-2, false, (byte) -124, false);
            this.method949(1, (byte) 57);
            this.method1022(-101, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field1834, super.field1824, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method488(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!fc", name = "GA", descriptor = "(I)V", line = 1028)
    public final void method97(int arg0) {
        ++field9039;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "(Z)V", line = 1037)
    public final void method143(boolean arg0) {
        ++field9098;
        if (!super.field1902) {
            OpenGL.glDisable(2929);
        } else {
            OpenGL.glEnable(2929);
        }
        if (arg0) {
            this.field9134 = false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "(I)V", line = 1054)
    public final void method130(int arg0) {
        if (arg0 != 16) {
            this.field9139 = false;
        }
        OpenGL.glTexEnvi(8960, 34162, class781.method4293((byte) -78, super.field1913[super.field1876]));
        ++field9070;
    }

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "(I)V", line = 1070)
    public final void method59(int arg0) {
        ++field9090;
        for (int var2 = super.field1861 - 1; var2 >= 0; --var2) {
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
        this.field9094.setSwapInterval(0);
        super.method59(arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lija;I)V", line = 1123)
    public final void method89(class161 arg0, int arg1) {
        ++field9072;
        class249[] var3 = ((class369) arg0).field5217;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        if (arg1 > 122) {
            for (int var8 = 0; ~var8 > ~var3.length; ++var8) {
                class249 var11 = var3[var8];
                class5 var12 = this.field9130[var8];
                int var13 = 0;
                int var14 = var12.method40((byte) 96);
                long var15 = var12.method606((byte) 88);
                var12.method608((byte) -17);
                for (int var17 = 0; var11.method1651(3) > var17; ++var17) {
                    class664 var18 = var11.method1652(true, var17);
                    if (class664.field9349 == var18) {
                        var7 = true;
                        OpenGL.glVertexPointer(3, 5126, var14, var15 - -((long) var13));
                    } else if (class664.field9350 != var18) {
                        if (class664.field9351 != var18) {
                            if (class664.field9352 != var18) {
                                if (class664.field9353 != var18) {
                                    if (class664.field9354 == var18) {
                                        OpenGL.glClientActiveTexture(33984 + var4++);
                                        OpenGL.glTexCoordPointer(3, 5126, var14, var15 - -((long) var13));
                                    } else if (class664.field9355 == var18) {
                                        OpenGL.glClientActiveTexture(33984 + var4++);
                                        OpenGL.glTexCoordPointer(4, 5126, var14, (long) var13 + var15);
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
                            var5 = true;
                            OpenGL.glColorPointer(4, 5121, var14, (long) var13 + var15);
                        }
                    } else {
                        OpenGL.glNormalPointer(5126, var14, var15 - -((long) var13));
                        var6 = true;
                    }
                    var13 += var18.field9346;
                }
            }
            if (this.field9125 != var7) {
                if (var7) {
                    OpenGL.glEnableClientState(32884);
                } else {
                    OpenGL.glDisableClientState(32884);
                }
                this.field9125 = var7;
            }
            if (this.field9126 != var6) {
                if (var6) {
                    OpenGL.glEnableClientState(32885);
                } else {
                    OpenGL.glDisableClientState(32885);
                }
                this.field9126 = var6;
            }
            if (this.field9124 != var5) {
                if (!var5) {
                    OpenGL.glDisableClientState(32886);
                } else {
                    OpenGL.glEnableClientState(32886);
                }
                this.field9124 = var5;
            }
            if (~var4 >= ~this.field9123) {
                if (~var4 > ~this.field9123) {
                    for (int var9 = var4; ~this.field9123 < ~var9; ++var9) {
                        OpenGL.glClientActiveTexture(var9 + 33984);
                        OpenGL.glDisableClientState(32888);
                    }
                    this.field9123 = var4;
                    return;
                }
            } else {
                for (int var10 = this.field9123; var4 > var10; ++var10) {
                    OpenGL.glClientActiveTexture(33984 - -var10);
                    OpenGL.glEnableClientState(32888);
                }
                this.field9123 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V", line = 1286)
    public final synchronized void method3644(int arg0, int arg1, int arg2) {
        ++field9029;
        class725 var4 = new class725(arg0);
        var4.field10592 = (long) arg1;
        this.field9114.method3728((byte) 120, var4);
        if (arg2 != 27231) {
            this.method115();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([IIIIIIZ)Llba;", line = 1302)
    public final class225 method125(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 != 9) {
            return null;
        } else {
            ++field9112;
            if (!this.field9139 && (!class362.method2181(arg3, -1) || !class362.method2181(arg2, -1))) {
                if (this.field9134) {
                    return new class44(this, arg3, arg2, arg0, arg4, arg1);
                } else {
                    class686 var8 = new class686(this, class133.field2225, class629.field8918, class661.method3706(arg3, true), class661.method3706(arg2, true));
                    var8.method329(arg1, 0, arg0, arg2, arg3, 0, arg4, -27716);
                    return var8;
                }
            } else {
                return new class686(this, arg3, arg2, arg6, arg0, arg4, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILvv;Lrl;III)V", line = 1330)
    public final void method140(int arg0, int arg1, class463 arg2, class713 arg3, int arg4, int arg5, int arg6) {
        ++field9061;
        byte var8;
        int var9;
        if (class591.field8480 == arg3) {
            var8 = 1;
            var9 = arg6 * 2;
        } else if (class315.field4465 != arg3) {
            if (class710.field9929 == arg3) {
                var9 = arg6 * 3;
                var8 = 4;
            } else if (class595.field8512 == arg3) {
                var8 = 6;
                var9 = arg6 + 2;
            } else if (class395.field5465 == arg3) {
                var8 = 5;
                var9 = arg6 + 2;
            } else {
                var9 = arg6;
                var8 = 0;
            }
        } else {
            var9 = arg6 + 1;
            var8 = 3;
        }
        class629 var10 = arg2.method1442((byte) -92);
        class240 var11 = (class240) arg2;
        var11.method608((byte) -17);
        if (arg4 != 0) {
            this.field9117 = null;
        }
        OpenGL.glDrawElements(var8, var9, class3.method23(false, var10), var11.method606((byte) 84) - -((long) (var10.field8914 * arg5)));
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V", line = 1387)
    public final void method72(Object arg0, Canvas arg1, boolean arg2) {
        ++field9049;
        if (arg2) {
            this.field9132 = false;
        }
        Long var4 = (Long) arg0;
        this.field9094.releaseSurface(arg1, var4);
    }

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "(I)V", line = 1401)
    public final void method144(int arg0) {
        class320.field4553[3] = (float) (super.field1945 >>> 24) / 255.0F;
        class320.field4553[arg0] = (float) class194.method1380(16711680, super.field1945) / 1.671168E7F;
        class320.field4553[1] = (float) class194.method1380(65280, super.field1945) / 65280.0F;
        ++field9069;
        class320.field4553[2] = (float) class194.method1380(255, super.field1945) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class320.field4553, 0);
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(Z)V", line = 1414)
    public final void method77(boolean arg0) {
        ++field9065;
        if (!arg0) {
            OpenGL.glScissor(super.field1933 + super.field1925, super.field1910 + super.field1824 + -super.field1929, super.field1887 - super.field1925, -super.field1944 + super.field1929);
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V", line = 1427)
    public final void method65(byte arg0) {
        ++field9048;
        class320.field4553[0] = super.field1912 * super.field1867;
        class320.field4553[3] = 1.0F;
        if (arg0 > -42) {
            this.field9114 = null;
        }
        class320.field4553[2] = super.field1882 * super.field1867;
        class320.field4553[1] = super.field1883 * super.field1867;
        OpenGL.glLightModelfv(2899, class320.field4553, 0);
    }

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "(I)V", line = 1445)
    public final void method113(int arg0) {
        if (!super.field1971) {
            OpenGL.glDisable(3089);
        } else {
            OpenGL.glEnable(3089);
        }
        if (arg0 != 0) {
            this.method64(-66);
        }
        ++field9075;
    }

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "()V", line = 1460)
    public final void method119() {
        ++field9080;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIIID)V", line = 1467)
    public final void method79(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field9042;
    }

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "(B)V", line = 1475)
    public final void method107(byte arg0) {
        ++field9073;
        if (arg0 > -127) {
            field9082 = -35;
        }
        this.method977((byte) -68);
        int var2;
        for (var2 = 0; ~var2 > ~super.field1924; ++var2) {
            class217 var3 = super.field1870[var2];
            int var4 = var3.method1489((byte) -123);
            int var5 = var2 + 16386;
            float var6 = var3.method1488(false) / 255.0F;
            class320.field4553[0] = (float) var3.method1495(false);
            class320.field4553[1] = (float) var3.method1494(false);
            class320.field4553[2] = (float) var3.method1490((byte) -126);
            class320.field4553[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class320.field4553, 0);
            class320.field4553[2] = var6 * (float) class194.method1380(255, var4);
            class320.field4553[0] = (float) class194.method1380(var4 >> 16, 255) * var6;
            class320.field4553[3] = 1.0F;
            class320.field4553[1] = var6 * (float) (class194.method1380(65486, var4) >> 8);
            OpenGL.glLightfv(var5, 4609, class320.field4553, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method1491(0) * var3.method1491(0)));
            OpenGL.glEnable(var5);
        }
        while (~super.field1889 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method107((byte) -128);
    }

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "(I)V", line = 1522)
    public final void method104(int arg0) {
        ++field9076;
        class320.field4553[0] = super.field1912 * super.field1877;
        class320.field4553[3] = 1.0F;
        class320.field4553[2] = super.field1882 * super.field1877;
        class320.field4553[1] = super.field1883 * super.field1877;
        OpenGL.glLightfv(16384, 4609, class320.field4553, arg0);
        class320.field4553[2] = -super.field1907 * super.field1882;
        class320.field4553[3] = 1.0F;
        class320.field4553[1] = -super.field1907 * super.field1883;
        class320.field4553[0] = -super.field1907 * super.field1912;
        OpenGL.glLightfv(16385, 4609, class320.field4553, 0);
    }

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "(II)V", line = 1540)
    public final void method75(int arg0, int arg1) {
        ++field9081;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lnea;Ldr;I)Z", line = 1549)
    public final boolean method92(class600 arg0, class629 arg1, int arg2) {
        if (arg2 > -113) {
            return false;
        } else {
            ++field9064;
            return true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)Llf;", line = 1561)
    public final class567 method76(int arg0, int arg1) {
        ++field9041;
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 1571)
    public final void method86(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class684 {
        this.method109(arg2, arg3);
        ++field9115;
    }

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "(I)F", line = 1582)
    public final float method54(int arg0) {
        if (arg0 != -457) {
            this.field9124 = false;
        }
        ++field9062;
        return 0.0F;
    }

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "(I)V", line = 1593)
    public final void method116(int arg0) {
        if (class295.field4293 != super.field1865) {
            if (class599.field8548 == super.field1865) {
                OpenGL.glBlendFunc(1, 1);
            } else if (class741.field10255 == super.field1865) {
                OpenGL.glBlendFunc(774, 1);
            }
        } else {
            OpenGL.glBlendFunc(770, 771);
        }
        int var2 = -100 % ((20 - arg0) / 40);
        ++field9036;
    }

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "(I)V", line = 1616)
    public final void method96(int arg0) {
        ++field9109;
        if (!super.field1851) {
            OpenGL.glDisable(3008);
        } else {
            OpenGL.glEnable(3008);
        }
        if (arg0 != -25707) {
            this.field9117 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(FFF)V", line = 1631)
    public final void method57(float arg0, float arg1, float arg2) {
        ++field9096;
    }

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "(I)V", line = 1638)
    public final void method103(int arg0) {
        ++field9097;
        if (arg0 == 0) {
            if (super.field1908 && super.field1931 && ~super.field1942 <= -1) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "(I)V", line = 1654)
    public final void method85(int arg0) {
        if (arg0 != 0) {
            this.method102(28, (byte) -102);
        }
        ++field9054;
        OpenGL.glTexEnvi(8960, 34161, class781.method4293((byte) -74, super.field1878[super.field1876]));
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 1665)
    public final void method109(int arg0, int arg1) throws class684 {
        ++field9047;
        this.field9094.swapBuffers();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIBIII)V", line = 1680)
    public static final void method3645(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        ++field9077;
        class547.field7575[class258.field3667++] = new class131(arg6, arg4, arg7, arg1, arg1, arg7, arg8, arg0, arg0, arg8, arg2, arg2, arg3, arg3);
        if (arg5 != 1) {
            field9037 = 111;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 1691)
    public final void method106(byte arg0) {
        ++field9027;
        if (arg0 <= 67) {
            this.method3641(56);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Llf;Ljk;)Lrs;", line = 1702)
    public final class730 method53(class567 arg0, class788 arg1) {
        ++field9046;
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "(I)V", line = 1715)
    public final void method90(int arg0) {
        ++field9111;
        OpenGL.glDepthMask(super.field1880 && super.field1909);
        if (arg0 <= 91) {
            this.field9120 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V", line = 1727)
    public final void method132(int arg0, Object arg1, Canvas arg2) {
        ++field9067;
        if (arg0 == 19362) {
            Long var4 = (Long) arg1;
            if (!this.field9094.setSurface(var4)) {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)V", line = 1743)
    public final void method127(int arg0, int arg1, int arg2, int arg3) {
        ++field9053;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(IZ)Lvv;", line = 1750)
    public final class463 method84(int arg0, boolean arg1) {
        ++field9095;
        return arg0 > -104 ? null : new class240(this, class629.field8919, arg1);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z[[IIZ)Lwf;", line = 1761)
    public final class540 method81(boolean arg0, int[][] arg1, int arg2, boolean arg3) {
        ++field9028;
        return arg3 ? null : new class62(this, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V", line = 1774)
    public final void method137(boolean arg0) {
        ++field9059;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lgga;I)V", line = 1798)
    public class642(OpenGL arg0, Canvas arg1, long arg2, class103 arg3, class513 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field9094 = arg0;
            this.field9094.method234();
            this.field9135 = OpenGL.glGetString(7936).toLowerCase();
            this.field9140 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field9135.indexOf("microsoft") == 0 && ~this.field9135.indexOf("brian paul") == 0 && ~this.field9135.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class544.method3151((byte) -28, ' ', var8.replace('.', ' '));
                if (~var9.length <= -3) {
                    try {
                        int var10 = class185.method1340(var9[0], (byte) 120);
                        int var11 = class185.method1340(var9[1], (byte) 56);
                        this.field9141 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field9141 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field9094.method235("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field9094.method235("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field1861 = var12[0];
                        if (super.field1861 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field1943 = 8;
                            this.field9136 = this.field9094.method235("GL_ARB_vertex_buffer_object");
                            super.field1923 = this.field9094.method235("GL_ARB_multisample");
                            this.field9134 = this.field9094.method235("GL_ARB_texture_rectangle");
                            super.field1894 = this.field9094.method235("GL_ARB_texture_cube_map");
                            this.field9139 = this.field9094.method235("GL_ARB_texture_non_power_of_two");
                            super.field1891 = this.field9094.method235("GL_EXT_texture3D");
                            this.field9133 = this.field9094.method235("GL_ARB_vertex_shader");
                            this.field9132 = this.field9094.method235("GL_ARB_vertex_program");
                            this.field9142 = this.field9094.method235("GL_ARB_fragment_shader");
                            this.field9094.method235("GL_ARB_fragment_program");
                            this.field9138 = new int[super.field1861];
                            this.field9137 = Stream.method2263() ? 33639 : 5121;
                            if (~this.field9140.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class544.method3151((byte) 103, ' ', this.field9140.replace('/', ' '));
                                for (int var17 = 0; ~var16.length < ~var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (~var18.length() < -1) {
                                            if (~var18.charAt(0) == -121 && var18.length() >= 3 && class256.method1685(var18.substring(1, 3), (byte) -105)) {
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
                                                if (~var18.length() <= -5 && class256.method1685(var18.substring(0, 4), (byte) -105)) {
                                                    var13 = class185.method1340(var18.substring(0, 4), (byte) 118);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && var13 <= 9250) {
                                        super.field1891 = false;
                                    }
                                    if (var13 >= 7000 && ~var13 >= -8000) {
                                        this.field9136 = false;
                                    }
                                }
                                this.field9134 &= this.field9094.method235("GL_ARB_half_float_pixel");
                            }
                            this.field9135.indexOf("intel");
                            if (this.field9136) {
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
            this.method2779((byte) -67);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IJ)V", line = 1784)
    public final synchronized void method3646(int arg0, long arg1) {
        ++field9063;
        int var4 = -60 / ((arg0 - 73) / 39);
        class766 var5 = new class766();
        var5.field10592 = arg1;
        this.field9121.method3728((byte) 109, var5);
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(Z)V", line = 1958)
    public final void method123(boolean arg0) {
        ++field9086;
        this.field9127 = false;
        this.method3641(0);
        if (!arg0) {
            this.field9131 = null;
        }
    }
}
