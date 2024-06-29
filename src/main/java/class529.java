import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class529 extends class367 {

    @OriginalMember(owner = "client!hl", name = "Yg", descriptor = "Lkba;")
    private class108 field7103 = new class108();

    @OriginalMember(owner = "client!hl", name = "ci", descriptor = "Lkba;")
    private class108 field7159 = new class108();

    @OriginalMember(owner = "client!hl", name = "ji", descriptor = "Lkba;")
    private class108 field7166 = new class108();

    @OriginalMember(owner = "client!hl", name = "mi", descriptor = "Lkba;")
    private class108 field7169 = new class108();

    @OriginalMember(owner = "client!hl", name = "qi", descriptor = "Lkba;")
    private class108 field7173 = new class108();

    @OriginalMember(owner = "client!hl", name = "si", descriptor = "Lkba;")
    private class108 field7175 = new class108();

    @OriginalMember(owner = "client!hl", name = "ti", descriptor = "Lkba;")
    private class108 field7176 = new class108();

    @OriginalMember(owner = "client!hl", name = "zi", descriptor = "[Lva;")
    private class497[] field7182 = new class497[16];

    @OriginalMember(owner = "client!hl", name = "Ai", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field7183 = new MapBuffer();

    @OriginalMember(owner = "client!hl", name = "Di", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field7186 = new MapBuffer();

    @OriginalMember(owner = "client!hl", name = "Hi", descriptor = "I")
    private int field7190 = 0;

    @OriginalMember(owner = "client!hl", name = "Vg", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field7100;

    @OriginalMember(owner = "client!hl", name = "Pi", descriptor = "Ljava/lang/String;")
    private String field7198;

    @OriginalMember(owner = "client!hl", name = "Gi", descriptor = "Ljava/lang/String;")
    private String field7189;

    @OriginalMember(owner = "client!hl", name = "Ei", descriptor = "I")
    private int field7187;

    @OriginalMember(owner = "client!hl", name = "Mi", descriptor = "Z")
    public boolean field7195;

    @OriginalMember(owner = "client!hl", name = "Ni", descriptor = "Z")
    private boolean field7196;

    @OriginalMember(owner = "client!hl", name = "Fi", descriptor = "Z")
    private boolean field7188;

    @OriginalMember(owner = "client!hl", name = "Ii", descriptor = "Z")
    public boolean field7191;

    @OriginalMember(owner = "client!hl", name = "Ji", descriptor = "Z")
    public boolean field7192;

    @OriginalMember(owner = "client!hl", name = "Li", descriptor = "Z")
    public boolean field7194;

    @OriginalMember(owner = "client!hl", name = "Oi", descriptor = "[I")
    public int[] field7197;

    @OriginalMember(owner = "client!hl", name = "Ki", descriptor = "I")
    public int field7193;

    @OriginalMember(owner = "client!hl", name = "Gg", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!hl", name = "Hg", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!hl", name = "Ig", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!hl", name = "Jg", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!hl", name = "Kg", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!hl", name = "Lg", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!hl", name = "Mg", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!hl", name = "Ng", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!hl", name = "Og", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!hl", name = "Pg", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!hl", name = "Qg", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!hl", name = "Rg", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!hl", name = "Sg", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!hl", name = "Tg", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!hl", name = "Ug", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!hl", name = "Wg", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!hl", name = "Xg", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!hl", name = "Zg", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!hl", name = "ah", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!hl", name = "bh", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!hl", name = "ch", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!hl", name = "dh", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!hl", name = "eh", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!hl", name = "fh", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!hl", name = "gh", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!hl", name = "hh", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!hl", name = "ih", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!hl", name = "jh", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!hl", name = "kh", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!hl", name = "lh", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!hl", name = "mh", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!hl", name = "nh", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!hl", name = "oh", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!hl", name = "ph", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!hl", name = "qh", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!hl", name = "rh", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!hl", name = "sh", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!hl", name = "th", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!hl", name = "uh", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!hl", name = "vh", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!hl", name = "wh", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!hl", name = "xh", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!hl", name = "yh", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!hl", name = "zh", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!hl", name = "Ah", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!hl", name = "Bh", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!hl", name = "Ch", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!hl", name = "Dh", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!hl", name = "Eh", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!hl", name = "Fh", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!hl", name = "Gh", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!hl", name = "Hh", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!hl", name = "Ih", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!hl", name = "Jh", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!hl", name = "Kh", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!hl", name = "Lh", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!hl", name = "Mh", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!hl", name = "Nh", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!hl", name = "Oh", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!hl", name = "Ph", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!hl", name = "Qh", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!hl", name = "Rh", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!hl", name = "Sh", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!hl", name = "Th", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!hl", name = "Uh", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!hl", name = "Vh", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!hl", name = "Wh", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!hl", name = "Xh", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!hl", name = "Yh", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!hl", name = "Zh", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!hl", name = "ai", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!hl", name = "bi", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!hl", name = "di", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!hl", name = "ei", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!hl", name = "fi", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!hl", name = "gi", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!hl", name = "hi", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!hl", name = "ii", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!hl", name = "ki", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!hl", name = "li", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!hl", name = "ni", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!hl", name = "oi", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!hl", name = "pi", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!hl", name = "ri", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!hl", name = "Bi", descriptor = "I")
    private int field7184;

    @OriginalMember(owner = "client!hl", name = "Ci", descriptor = "J")
    private long field7185;

    @OriginalMember(owner = "client!hl", name = "ui", descriptor = "Z")
    private boolean field7177;

    @OriginalMember(owner = "client!hl", name = "vi", descriptor = "Z")
    private boolean field7178;

    @OriginalMember(owner = "client!hl", name = "wi", descriptor = "Z")
    private boolean field7179;

    @OriginalMember(owner = "client!hl", name = "xi", descriptor = "Z")
    private boolean field7180;

    @OriginalMember(owner = "client!hl", name = "yi", descriptor = "Z")
    private boolean field7181;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)V")
    public final void method1311(byte arg0, int arg1) {
        ++field7153;
        if (arg0 < 0) {
            this.field7191 = true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "GA", descriptor = "(I)V")
    public final void method402(int arg0) {
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field7116;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZBLef;Z)V")
    public final void method1334(int arg0, boolean arg1, byte arg2, class488 arg3, boolean arg4) {
        ++field7134;
        if (arg2 != 27) {
            this.field7198 = null;
        }
        OpenGL.glTexEnvi(8960, arg0 + 34176, class109.method736(arg3, 36));
        if (arg1) {
            OpenGL.glTexEnvi(8960, arg0 + 34192, !arg4 ? 770 : 771);
        } else {
            OpenGL.glTexEnvi(8960, arg0 + 34192, !arg4 ? 768 : 769);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Loq;IBI)V")
    public final void method1290(class362 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 > 8) {
            ++field7121;
            int var5;
            byte var6;
            if (class246.field3199 != arg0) {
                if (class100.field1321 == arg0) {
                    var5 = arg3 + 1;
                    var6 = 3;
                } else if (class387.field5460 == arg0) {
                    var6 = 4;
                    var5 = arg3 * 3;
                } else if (class401.field5677 == arg0) {
                    var5 = arg3 - -2;
                    var6 = 6;
                } else if (class300.field4025 == arg0) {
                    var5 = arg3 + 2;
                    var6 = 5;
                } else {
                    var5 = arg3;
                    var6 = 0;
                }
            } else {
                var5 = arg3 * 2;
                var6 = 1;
            }
            OpenGL.glDrawArrays(var6, arg1, var5);
        }
    }

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "(B)V")
    private final void method2928(byte arg0) {
        if (this.field7178) {
            OpenGL.glPopMatrix();
        }
        ++field7111;
        int var2 = -109 / (-arg0 / 51);
        if (super.field5043.method2843(126)) {
            if (!this.field7180) {
                OpenGL.glLoadMatrixf(super.field5037.method3649((byte) -81, class431.field6081), 0);
                this.field7180 = true;
                this.method1312((byte) 80);
                this.method1333(-14713);
            }
            if (super.field5031) {
                this.field7178 = false;
            } else {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field5034.method3649((byte) -80, class431.field6081), 0);
                this.field7178 = true;
            }
        } else if (!super.field5031) {
            OpenGL.glLoadMatrixf(super.field5034.method3649((byte) -57, class431.field6081), 0);
            this.field7178 = false;
        } else {
            OpenGL.glLoadIdentity();
            this.field7178 = false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "(B)V")
    public final void method1299(byte arg0) {
        int var2 = 93 % ((arg0 - 69) / 53);
        ++field7098;
        if (!super.field5047) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(IB)Lew;")
    public final class493 method1298(int arg0, byte arg1) {
        ++field7140;
        int var3 = -112 / ((39 - arg1) / 56);
        if (arg0 != 3) {
            if (~arg0 != -5) {
                return ~arg0 == -9 ? new class430(this, super.field5016, super.field4945) : super.method1298(arg0, (byte) -112);
            } else {
                return new class556(this, super.field5016, super.field4945);
            }
        } else {
            return new class122(this, super.field5016);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V")
    public final void method345(int arg0, int arg1, int arg2, int arg3) {
        ++field7086;
    }

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "(I)V")
    public final void method1295(int arg0) {
        OpenGL.glScissor(super.field5094 + super.field5070, -super.field5130 + super.field4959 + super.field5114, super.field5067 - super.field5094, -super.field5050 + super.field5130);
        if (arg0 != 28976) {
            this.method1343(-60);
        }
        ++field7139;
    }

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "(II)V")
    public final void method358(int arg0, int arg1) {
        ++field7160;
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(Z)V")
    public final void method1279(boolean arg0) {
        super.field5084 = (float) (-super.field5093 + super.field5097);
        ++field7152;
        super.field5107 = (float) (-super.field5073) + super.field5084;
        if (arg0) {
            this.method1318(58);
        }
        if (super.field5107 < (float) super.field5132) {
            super.field5107 = (float) super.field5132;
        }
        OpenGL.glFogf(2915, super.field5107);
        OpenGL.glFogf(2916, super.field5084);
        class706.field9893[2] = (float) class321.method1919(super.field5128, 255) / 255.0F;
        class706.field9893[0] = (float) class321.method1919(16711680, super.field5128) / 1.671168E7F;
        class706.field9893[1] = (float) class321.method1919(65280, super.field5128) / 65280.0F;
        OpenGL.glFogfv(2918, class706.field9893, 0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public final Object method1328(Canvas arg0, int arg1) {
        ++field7145;
        if (arg1 != -8401) {
            this.field7184 = -114;
        }
        long var3 = this.field7100.prepareSurface(arg0);
        if (var3 == -1L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "()I")
    public final int method459() {
        ++field7156;
        return this.field7190;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IIIID)V")
    public final void method428(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field7129;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IJ)V")
    public final synchronized void method2929(int arg0, long arg1) {
        if (arg0 != 0) {
            this.field7103 = null;
        }
        ++field7151;
        class55 var4 = new class55();
        var4.field556 = arg1;
        this.field7176.method725(var4, -20911);
    }

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "(B)V")
    public final void method1314(byte arg0) {
        if (!super.field5164) {
            OpenGL.glDisable(3089);
        } else {
            OpenGL.glEnable(3089);
        }
        ++field7094;
        if (arg0 != -122) {
            this.method1279(true);
        }
    }

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "(B)V")
    public final void method1323(byte arg0) {
        if (super.field5063 && super.field5054 && ~super.field5073 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 == 112) {
            ++field7147;
        }
    }

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "(I)V")
    public final void method1291(int arg0) {
        if (arg0 != -11155) {
            this.field7181 = false;
        }
        OpenGL.glViewport(super.field5070, super.field5114, super.field4913, super.field4959);
        ++field7087;
    }

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "(B)V")
    public final void method1342(byte arg0) {
        if (class278.field3705 == super.field5117) {
            OpenGL.glBlendFunc(770, 771);
        } else if (class129.field1674 == super.field5117) {
            OpenGL.glBlendFunc(1, 1);
        } else if (class258.field3381 == super.field5117) {
            OpenGL.glBlendFunc(774, 1);
        }
        if (arg0 < -109) {
            ++field7117;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZZ)V")
    public final void method1338(boolean arg0, boolean arg1) {
        if (arg0) {
            OpenGL.glEnable(32925);
        } else {
            OpenGL.glDisable(32925);
        }
        ++field7161;
        if (arg1) {
            this.method430(86);
        }
    }

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "()Leca;")
    public final class758 method418() {
        ++field7106;
        int var1 = -1;
        if (this.field7198.indexOf("nvidia") == -1) {
            if (~this.field7198.indexOf("intel") != 0) {
                var1 = 32902;
            } else if (~this.field7198.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class758(var1, "OpenGL", this.field7187, this.field7189, 0L);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V")
    public final void method373(int arg0, int arg1) throws class353 {
        this.field7100.swapBuffers();
        ++field7131;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(FFF)V")
    public final void method408(float arg0, float arg1, float arg2) {
        ++field7132;
    }

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "(I)V")
    public final void method1337(int arg0) {
        ++field7114;
        if (super.field5052) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
        int var2 = -123 % ((-43 - arg0) / 34);
    }

    @OriginalMember(owner = "client!hl", name = "na", descriptor = "(IIII)[I")
    public final int[] method460(int arg0, int arg1, int arg2, int arg3) {
        ++field7109;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + super.field4959 + -arg1 + -1, arg2, 1, 32993, this.field7193, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "(I)V")
    public final synchronized void method430(int arg0) {
        ++field7127;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field7159.method726(-126)) {
            class629 var12 = (class629) this.field7159.method727(6494);
            class351.field4703[var3++] = (int) var12.field556;
            super.field5029 -= var12.field8775;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class351.field4703, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class351.field4703, 0);
            var3 = 0;
        }
        while (!this.field7166.method726(-125)) {
            class629 var11 = (class629) this.field7166.method727(6494);
            class351.field4703[var3++] = (int) var11.field556;
            super.field5032 -= var11.field8775;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class351.field4703, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class351.field4703, 0);
            var3 = 0;
        }
        while (!this.field7169.method726(-125)) {
            class629 var10 = (class629) this.field7169.method727(6494);
            class351.field4703[var3++] = var10.field8775;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class351.field4703, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class351.field4703, 0);
            var3 = 0;
        }
        while (!this.field7173.method726(-124)) {
            class629 var9 = (class629) this.field7173.method727(6494);
            class351.field4703[var3++] = (int) var9.field556;
            super.field5030 -= var9.field8775;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class351.field4703, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class351.field4703, 0);
            boolean var4 = false;
        }
        while (!this.field7103.method726(-127)) {
            class629 var8 = (class629) this.field7103.method727(6494);
            OpenGL.glDeleteLists((int) var8.field556, var8.field8775);
        }
        while (!this.field7175.method726(-128)) {
            class55 var7 = this.field7175.method727(6494);
            OpenGL.glDeleteProgramARB((int) var7.field556);
        }
        while (!this.field7176.method726(-125)) {
            class55 var6 = this.field7176.method727(6494);
            OpenGL.glDeleteObjectARB(var6.field556);
        }
        while (!this.field7103.method726(-125)) {
            class629 var5 = (class629) this.field7103.method727(6494);
            OpenGL.glDeleteLists((int) var5.field556, var5.field8775);
        }
        if (this.method415() > 100663296 && this.field7185 - -60000L < class538.method2963(-47)) {
            System.gc();
            this.field7185 = class538.method2963(-47);
        }
        super.method430(var2);
    }

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "(I)V")
    public final void method1294(int arg0) {
        ++field7137;
        if (super.field5135 && !super.field5129) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != -5668) {
            this.method1314((byte) -122);
        }
    }

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "(B)V")
    public final void method1329(byte arg0) {
        int var2 = 70 / ((-6 - arg0) / 34);
        OpenGL.glMatrixMode(5889);
        ++field7157;
        OpenGL.glLoadMatrixf(super.field5058, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(ZI)Ltea;")
    public final class241 method1292(boolean arg0, int arg1) {
        if (arg1 < 40) {
            return null;
        } else {
            ++field7149;
            return new class497(this, arg0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(BZ)Lug;")
    public final class562 method1281(byte arg0, boolean arg1) {
        if (arg0 != 84) {
            this.field7182 = null;
        }
        ++field7104;
        return new class36(this, class594.field8278, arg1);
    }

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "()V")
    public final void method458() {
        ++field7133;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method429(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class353 {
        this.method373(arg2, arg3);
        ++field7125;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)V")
    public final void method369(boolean arg0) {
        ++field7122;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Lku;")
    public final class379 method343(int arg0, int arg1) {
        ++field7142;
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILkt;Lkq;)Z")
    public final boolean method1315(int arg0, class159 arg1, class594 arg2) {
        ++field7105;
        if (arg0 != 0) {
            this.method1331((Canvas) null, (Object) null, 89);
        }
        return true;
    }

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "(I)V")
    public final void method1318(int arg0) {
        OpenGL.glDepthMask(super.field5098 && super.field5112);
        ++field7163;
        if (arg0 != 0) {
            this.field7183 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V")
    public final synchronized void method2930(int arg0, int arg1, int arg2) {
        ++field7136;
        class629 var4 = new class629(arg2);
        var4.field556 = (long) arg1;
        if (arg0 <= -4) {
            this.field7166.method725(var4, -20911);
        }
    }

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "(B)V")
    public final void method1303(byte arg0) {
        this.method2928((byte) -89);
        ++field7165;
        int var2 = 121 / ((26 - arg0) / 53);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZBLef;)V")
    public final void method1340(int arg0, boolean arg1, byte arg2, class488 arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34184, class109.method736(arg3, 97));
        ++field7158;
        OpenGL.glTexEnvi(8960, 34200 - -arg0, arg1 ? 771 : 770);
        if (arg2 != -42) {
            this.field7196 = true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB[IZIII)Ljs;")
    public final class334 method1317(int arg0, byte arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = -10 % ((60 - arg1) / 58);
        ++field7174;
        if (!this.field7188 && (!class143.method891(arg4, 0) || !class143.method891(arg5, 0))) {
            if (!this.field7196) {
                class537 var9 = new class537(this, class758.field10567, class594.field8277, class128.method814(423660257, arg4), class128.method814(423660257, arg5));
                var9.method1697(17779, 0, arg5, arg2, 0, arg0, arg6, arg4);
                return var9;
            } else {
                return new class282(this, arg4, arg5, arg2, arg0, arg6);
            }
        } else {
            return new class537(this, arg4, arg5, arg3, arg2, arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "()V")
    public final void method388() {
        ++field7130;
    }

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "(I)V")
    public final void method1288(int arg0) {
        if (super.field5091) {
            OpenGL.glEnable(3008);
        } else {
            OpenGL.glDisable(3008);
        }
        ++field7092;
        if (arg0 != 0) {
            this.field7175 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(II)Lci;")
    public final class451 method440(int arg0, int arg1) {
        ++field7148;
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([BZLkt;IIZII)Ljs;")
    public final class334 method1319(byte[] arg0, boolean arg1, class159 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg1) {
            this.field7190 = -43;
        }
        ++field7096;
        if (!this.field7188 && (!class143.method891(arg7, 0) || !class143.method891(arg4, 0))) {
            if (!this.field7196) {
                class537 var9 = new class537(this, arg2, class594.field8277, class128.method814(423660257, arg7), class128.method814(423660257, arg4));
                var9.method1691(arg3, arg6, arg7, 0, arg4, -26946, arg0, arg2, 0);
                return var9;
            } else {
                return new class282(this, arg2, arg7, arg4, arg0, arg6, arg3);
            }
        } else {
            return new class537(this, arg2, arg7, arg4, arg5, arg0, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "(I)V")
    public final void method1343(int arg0) {
        ++field7123;
        if (arg0 == 0) {
            if (!super.field5069) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILkt;[BIII)Lff;")
    public final class9 method1336(int arg0, class159 arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        ++field7093;
        int var7 = -56 / ((arg0 - 49) / 38);
        return new class284(this, arg1, arg3, arg4, arg5, arg2);
    }

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "()V")
    public final void method441() {
        ++field7146;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lcm;B)V")
    public final void method1301(class729 arg0, byte arg1) {
        if (arg1 != 26) {
            this.field7188 = false;
        }
        if (class601.field8374 == arg0) {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        } else {
            int var3 = class94.method652((byte) 115, arg0);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        }
        ++field7124;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lqa;B)V")
    public final void method1330(class251 arg0, byte arg1) {
        ++field7102;
        int var3 = -90 % ((-4 - arg1) / 48);
        class235[] var4 = ((class212) arg0).field2544;
        int var5 = 0;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        for (int var9 = 0; ~var4.length < ~var9; ++var9) {
            class235 var12 = var4[var9];
            class497 var13 = this.field7182[var9];
            int var14 = 0;
            int var15 = var13.method2768((byte) -22);
            long var16 = var13.method1017(-30277);
            var13.method1020(18569);
            for (int var18 = 0; var12.method1417((byte) -99) > var18; ++var18) {
                class239 var19 = var12.method1416(var18, (byte) -122);
                if (class239.field3118 != var19) {
                    if (class239.field3123 == var19) {
                        var7 = true;
                        OpenGL.glNormalPointer(5126, var15, var16 - -((long) var14));
                    } else if (class239.field3124 == var19) {
                        var6 = true;
                        OpenGL.glColorPointer(4, 5121, var15, (long) var14 + var16);
                    } else if (class239.field3125 == var19) {
                        OpenGL.glClientActiveTexture(var5++ + 33984);
                        OpenGL.glTexCoordPointer(1, 5126, var15, var16 - -((long) var14));
                    } else if (class239.field3127 == var19) {
                        OpenGL.glClientActiveTexture(33984 + var5++);
                        OpenGL.glTexCoordPointer(2, 5126, var15, var16 - -((long) var14));
                    } else if (class239.field3128 != var19) {
                        if (class239.field3129 == var19) {
                            OpenGL.glClientActiveTexture(33984 + var5++);
                            OpenGL.glTexCoordPointer(4, 5126, var15, (long) var14 + var16);
                        }
                    } else {
                        OpenGL.glClientActiveTexture(33984 - -(var5++));
                        OpenGL.glTexCoordPointer(3, 5126, var15, var16 - -((long) var14));
                    }
                } else {
                    var8 = true;
                    OpenGL.glVertexPointer(3, 5126, var15, (long) var14 + var16);
                }
                var14 += var19.field3120;
            }
        }
        if (this.field7179 != var8) {
            if (!var8) {
                OpenGL.glDisableClientState(32884);
            } else {
                OpenGL.glEnableClientState(32884);
            }
            this.field7179 = var8;
        }
        if (!this.field7181 != !var7) {
            if (var7) {
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            this.field7181 = var7;
        }
        if (this.field7177 == !var6) {
            if (!var6) {
                OpenGL.glDisableClientState(32886);
            } else {
                OpenGL.glEnableClientState(32886);
            }
            this.field7177 = var6;
        }
        if (~this.field7184 <= ~var5) {
            if (this.field7184 > var5) {
                for (int var10 = var5; var10 < this.field7184; ++var10) {
                    OpenGL.glClientActiveTexture(33984 - -var10);
                    OpenGL.glDisableClientState(32888);
                }
                this.field7184 = var5;
                return;
            }
        } else {
            for (int var11 = this.field7184; ~var11 > ~var5; ++var11) {
                OpenGL.glClientActiveTexture(var11 + 33984);
                OpenGL.glEnableClientState(32888);
            }
            this.field7184 = var5;
        }
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(B)V")
    public final void method1326(byte arg0) {
        ++field7099;
        OpenGL.glTexEnvi(8960, 34162, class438.method2480(super.field5131[super.field5071], 0));
        if (arg0 != -48) {
            this.method1312((byte) -18);
        }
    }

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "()V")
    public final void method448() {
        ++field7141;
        if (~super.field4913 < -1 || super.field4959 > 0) {
            int var1 = super.field5094;
            int var2 = super.field5067;
            int var3 = super.field5050;
            int var4 = super.field5130;
            this.method406();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2138((byte) 125);
            this.method2162(false, (byte) -101);
            this.method2131(false, -60);
            this.method2151(false, 2103);
            this.method2142(0, false);
            this.method2148((class649) null, 127);
            this.method2167(false, 0, -2, false);
            this.method2153(1, (byte) -120);
            this.method2145(0, 79);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field4913, super.field4959, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method426(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Loq;IIILug;II)V")
    public final void method1304(class362 arg0, int arg1, int arg2, int arg3, class562 arg4, int arg5, int arg6) {
        ++field7085;
        if (arg3 == 26810) {
            int var8;
            byte var9;
            if (class246.field3199 == arg0) {
                var8 = arg6 * 2;
                var9 = 1;
            } else if (class100.field1321 != arg0) {
                if (class387.field5460 == arg0) {
                    var9 = 4;
                    var8 = arg6 * 3;
                } else if (class401.field5677 == arg0) {
                    var9 = 6;
                    var8 = arg6 + 2;
                } else if (class300.field4025 == arg0) {
                    var9 = 5;
                    var8 = arg6 + 2;
                } else {
                    var8 = arg6;
                    var9 = 0;
                }
            } else {
                var8 = arg6 + 1;
                var9 = 3;
            }
            class594 var10 = arg4.method181(-15448);
            class36 var11 = (class36) arg4;
            var11.method1020(18569);
            OpenGL.glDrawElements(var9, var8, class557.method3153(var10, (byte) 105), var11.method1017(-30277) - -((long) (var10.field8274 * arg2)));
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ldi;Ldi;FLdi;)Ldi;")
    public final class128 method378(class128 arg0, class128 arg1, float arg2, class128 arg3) {
        ++field7115;
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "(I)V")
    public final void method1341(int arg0) {
        ++field7171;
        OpenGL.glTexEnvi(8960, 34161, class438.method2480(super.field5077[super.field5071], 0));
        if (arg0 != 2) {
            this.method402(-98);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZLkt;III[F)Ljs;")
    public final class334 method1278(int arg0, int arg1, boolean arg2, class159 arg3, int arg4, int arg5, int arg6, float[] arg7) {
        ++field7091;
        int var9 = -104 % ((arg4 - 57) / 33);
        if (!this.field7188 && (!class143.method891(arg1, 0) || !class143.method891(arg5, 0))) {
            if (this.field7196) {
                return new class282(this, arg3, arg1, arg5, arg7, arg0, arg6);
            } else {
                class537 var10 = new class537(this, arg3, class594.field8281, class128.method814(423660257, arg1), class128.method814(423660257, arg5));
                var10.method2957(arg7, arg3, arg5, arg1, (byte) 111, 0, arg6, 0, arg0);
                return var10;
            }
        } else {
            return new class537(this, arg3, arg1, arg5, arg2, arg7, arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "(I)V")
    public final void method1296(int arg0) {
        ++field7118;
        class706.field9893[2] = (float) class321.method1919(super.field5140, 255) / 255.0F;
        class706.field9893[1] = (float) class321.method1919(65280, super.field5140) / 65280.0F;
        if (arg0 != 12362) {
            this.field7185 = 41L;
        }
        class706.field9893[0] = (float) class321.method1919(16711680, super.field5140) / 1.671168E7F;
        class706.field9893[3] = (float) (super.field5140 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class706.field9893, 0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([Ldia;I)Lqa;")
    public final class251 method1316(class235[] arg0, int arg1) {
        ++field7095;
        if (arg1 != 6) {
            this.method1291(59);
        }
        return new class212(arg0);
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(B)V")
    public final void method1321(byte arg0) {
        int var2 = 50 % ((-49 - arg0) / 47);
        OpenGL.glActiveTexture(super.field5071 + 33984);
        ++field7128;
    }

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "(B)V")
    public final void method1335(byte arg0) {
        class706.field9893[1] = super.field5122 * super.field5041;
        class706.field9893[3] = 1.0F;
        class706.field9893[0] = super.field5122 * super.field5103;
        ++field7135;
        class706.field9893[2] = super.field5122 * super.field5083;
        OpenGL.glLightfv(16384, 4609, class706.field9893, 0);
        class706.field9893[3] = 1.0F;
        class706.field9893[1] = -super.field5086 * super.field5041;
        class706.field9893[2] = -super.field5086 * super.field5083;
        class706.field9893[0] = -super.field5086 * super.field5103;
        OpenGL.glLightfv(16385, 4609, class706.field9893, 0);
        if (arg0 > -98) {
            this.field7196 = false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method1305(int arg0, Object arg1, Canvas arg2) {
        if (arg0 != 0) {
            this.field7178 = false;
        }
        ++field7089;
        Long var4 = (Long) arg1;
        this.field7100.releaseSurface(arg2, var4);
    }

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "(I)V")
    public final void method1282(int arg0) {
        if (arg0 != 0) {
            this.method1282(-94);
        }
        this.field7180 = false;
        ++field7138;
        this.method2928((byte) 119);
    }

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "(B)V")
    public final void method1312(byte arg0) {
        ++field7113;
        OpenGL.glLightfv(16384, 4611, super.field5088, 0);
        if (arg0 == 80) {
            OpenGL.glLightfv(16385, 4611, super.field5064, 0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "(I)V")
    public final void method1327(int arg0) {
        ++field7126;
        int var2 = this.field7197[super.field5071];
        if (arg0 != var2) {
            this.field7197[super.field5071] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lqp;)V")
    public final void method339(class657 arg0) {
        ++field7088;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(III)V")
    public final synchronized void method2931(int arg0, int arg1, int arg2) {
        ++field7154;
        if (arg0 != 1) {
            this.method345(-36, 50, 45, 78);
        }
        class629 var4 = new class629(arg1);
        var4.field556 = (long) arg2;
        this.field7159.method725(var4, -20911);
    }

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "(I)V")
    public final void method1286(int arg0) {
        int var2 = 35 / ((arg0 - -16) / 50);
        ++field7120;
    }

    @OriginalMember(owner = "client!hl", name = "ya", descriptor = "()V")
    public final void method370() {
        ++field7162;
        this.method2142(0, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lni;I)V")
    public class529(OpenGL arg0, Canvas arg1, long arg2, class152 arg3, class522 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field7100 = arg0;
            this.field7100.method3531();
            this.field7198 = OpenGL.glGetString(7936).toLowerCase();
            this.field7189 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field7198.indexOf("microsoft") == 0 && this.field7198.indexOf("brian paul") == -1 && this.field7198.indexOf("mesa") == -1) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class490.method2753(var8.replace('.', ' '), ' ', false);
                if (~var9.length <= -3) {
                    try {
                        int var10 = class436.method2477(-52, var9[0]);
                        int var11 = class436.method2477(73, var9[1]);
                        this.field7187 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (~this.field7187 > -13) {
                        throw new RuntimeException("");
                    } else if (!this.field7100.method3530("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field7100.method3530("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field5100 = var12[0];
                        if (super.field5100 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field5057 = 8;
                            this.field7195 = this.field7100.method3530("GL_ARB_vertex_buffer_object");
                            super.field5051 = this.field7100.method3530("GL_ARB_multisample");
                            this.field7196 = this.field7100.method3530("GL_ARB_texture_rectangle");
                            super.field5061 = this.field7100.method3530("GL_ARB_texture_cube_map");
                            this.field7188 = this.field7100.method3530("GL_ARB_texture_non_power_of_two");
                            super.field5080 = this.field7100.method3530("GL_EXT_texture3D");
                            this.field7191 = this.field7100.method3530("GL_ARB_vertex_shader");
                            this.field7192 = this.field7100.method3530("GL_ARB_vertex_program");
                            this.field7194 = this.field7100.method3530("GL_ARB_fragment_shader");
                            this.field7100.method3530("GL_ARB_fragment_program");
                            this.field7197 = new int[super.field5100];
                            this.field7193 = !Stream.method3786() ? 5121 : 33639;
                            if (this.field7189.indexOf("radeon") != -1) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class490.method2753(this.field7189.replace('/', ' '), ' ', false);
                                for (int var17 = 0; var16.length > var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (var18.charAt(0) == 'x' && ~var18.length() <= -4 && class266.method1590((byte) 53, var18.substring(1, 3))) {
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
                                                if (~var18.length() <= -5 && class266.method1590((byte) 53, var18.substring(0, 4))) {
                                                    var13 = class436.method2477(87, var18.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && var13 <= 7999) {
                                        this.field7195 = false;
                                    }
                                    if (var13 >= 7000 && var13 <= 9250) {
                                        super.field5080 = false;
                                    }
                                }
                                this.field7196 &= this.field7100.method3530("GL_ARB_half_float_pixel");
                            }
                            this.field7198.indexOf("intel");
                            if (this.field7195) {
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
            this.method342(-1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lci;Lku;)Lqp;")
    public final class657 method443(class451 arg0, class379 arg1) {
        ++field7101;
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lkq;ZLkt;)Z")
    public final boolean method1293(class594 arg0, boolean arg1, class159 arg2) {
        ++field7167;
        if (!arg1) {
            this.field7190 = -89;
        }
        return true;
    }

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "()Z")
    public final boolean method423() {
        ++field7107;
        return false;
    }

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "(I)V")
    public final void method1313(int arg0) {
        class706.field9893[2] = super.field5083 * super.field5068;
        class706.field9893[3] = 1.0F;
        class706.field9893[1] = super.field5068 * super.field5041;
        ++field7119;
        class706.field9893[0] = super.field5103 * super.field5068;
        if (arg0 != -24391) {
            this.method459();
        }
        OpenGL.glLightModelfv(2899, class706.field9893, 0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILkt;BLkq;)Ljs;")
    public final class334 method1307(int arg0, int arg1, class159 arg2, byte arg3, class594 arg4) {
        ++field7170;
        if (arg3 != 45) {
            return null;
        } else if (!this.field7188 && (!class143.method891(arg1, 0) || !class143.method891(arg0, 0))) {
            return this.field7196 ? new class282(this, arg2, arg4, arg1, arg0) : new class537(this, arg2, arg4, class128.method814(423660257, arg1), class128.method814(423660257, arg0));
        } else {
            return new class537(this, arg2, arg4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "(I)V")
    public final void method1339(int arg0) {
        for (int var2 = super.field5100 + -1; ~var2 <= -1; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field7097;
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
        this.field7100.setSwapInterval(0);
        super.method1339(arg0);
    }

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "(B)F")
    public final float method1283(byte arg0) {
        if (arg0 != 56) {
            return -1.1192888F;
        } else {
            ++field7112;
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ[[II)Ltd;")
    public final class455 method1324(int arg0, boolean arg1, int[][] arg2, int arg3) {
        if (arg0 != 8) {
            this.field7169 = null;
        }
        ++field7143;
        return new class553(this, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "(I)V")
    public final void method1333(int arg0) {
        ++field7168;
        this.method2120(arg0 ^ -3848);
        int var2;
        for (var2 = 0; super.field5111 > var2; ++var2) {
            class551 var3 = super.field5089[var2];
            int var4 = var3.method3135((byte) -78);
            int var5 = 16386 - -var2;
            float var6 = var3.method3131(false) / 255.0F;
            class706.field9893[0] = (float) var3.method3130(class158.method949(arg0, -8724));
            class706.field9893[1] = (float) var3.method3137((byte) 84);
            class706.field9893[2] = (float) var3.method3136(arg0 + 43412);
            class706.field9893[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class706.field9893, 0);
            class706.field9893[2] = var6 * (float) class321.method1919(255, var4);
            class706.field9893[1] = var6 * (float) class321.method1919(var4 >> 8, 255);
            class706.field9893[3] = 1.0F;
            class706.field9893[0] = (float) class321.method1919(255, var4 >> 16) * var6;
            OpenGL.glLightfv(var5, 4609, class706.field9893, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method3133(arg0 + 14840) * var3.method3133(126)));
            OpenGL.glEnable(var5);
        }
        while (~super.field5120 < ~var2) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        super.method1333(arg0);
    }

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "()V")
    public final void method383() {
        ++field7108;
        super.method383();
        if (this.field7100 != null) {
            this.field7100.method3529();
            this.field7100.release();
            this.field7100 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZLtea;)V")
    public final void method1325(int arg0, boolean arg1, class241 arg2) {
        if (arg1) {
            this.field7182[arg0] = (class497) arg2;
            ++field7150;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "()V")
    public final void method362() {
        ++field7110;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
    public final void method1331(Canvas arg0, Object arg1, int arg2) {
        ++field7155;
        if (arg2 >= -40) {
            this.method1299((byte) -19);
        }
        Long var4 = (Long) arg1;
        this.field7100.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "()Z")
    public final boolean method377() {
        ++field7144;
        return false;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(ZI)V")
    public final synchronized void method2932(boolean arg0, int arg1) {
        if (!arg0) {
            this.field7191 = false;
        }
        ++field7090;
        class55 var3 = new class55();
        var3.field556 = (long) arg1;
        this.field7175.method725(var3, -20911);
    }

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "(I)V")
    public final void method1280(int arg0) {
        ++field7172;
        OpenGL.glMatrixMode(5890);
        if (super.field5136[super.field5071] == class761.field10620) {
            OpenGL.glLoadIdentity();
        } else {
            OpenGL.glLoadMatrixf(super.field5101[super.field5071].method3649((byte) -58, class431.field6081), 0);
        }
        int var2 = -73 % ((arg0 - -62) / 42);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public final void method1320(Object arg0, Canvas arg1, byte arg2) {
        ++field7164;
        if (arg2 == -34) {
            Long var4 = (Long) arg0;
            if (!this.field7100.setSurface(var4)) {
                throw new RuntimeException();
            }
        }
    }
}
