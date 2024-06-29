import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class642 extends class38 {

    @OriginalMember(owner = "client!om", name = "mh", descriptor = "Ltg;")
    private class605 field9086 = new class605();

    @OriginalMember(owner = "client!om", name = "ni", descriptor = "Ltg;")
    private class605 field9139 = new class605();

    @OriginalMember(owner = "client!om", name = "zi", descriptor = "Ltg;")
    private class605 field9151 = new class605();

    @OriginalMember(owner = "client!om", name = "Ai", descriptor = "Ltg;")
    private class605 field9152 = new class605();

    @OriginalMember(owner = "client!om", name = "Bi", descriptor = "Ltg;")
    private class605 field9153 = new class605();

    @OriginalMember(owner = "client!om", name = "Ci", descriptor = "Ltg;")
    private class605 field9154 = new class605();

    @OriginalMember(owner = "client!om", name = "Di", descriptor = "Ltg;")
    private class605 field9155 = new class605();

    @OriginalMember(owner = "client!om", name = "Li", descriptor = "[Ljca;")
    private class77[] field9163 = new class77[16];

    @OriginalMember(owner = "client!om", name = "Fi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field9157 = new MapBuffer();

    @OriginalMember(owner = "client!om", name = "Ni", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field9165 = new MapBuffer();

    @OriginalMember(owner = "client!om", name = "Yi", descriptor = "I")
    private int field9176 = 0;

    @OriginalMember(owner = "client!om", name = "zh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field9099;

    @OriginalMember(owner = "client!om", name = "Qi", descriptor = "Ljava/lang/String;")
    private String field9168;

    @OriginalMember(owner = "client!om", name = "Ti", descriptor = "Ljava/lang/String;")
    private String field9171;

    @OriginalMember(owner = "client!om", name = "Vi", descriptor = "I")
    private int field9173;

    @OriginalMember(owner = "client!om", name = "Si", descriptor = "Z")
    public boolean field9170;

    @OriginalMember(owner = "client!om", name = "Oi", descriptor = "Z")
    private boolean field9166;

    @OriginalMember(owner = "client!om", name = "Ui", descriptor = "Z")
    private boolean field9172;

    @OriginalMember(owner = "client!om", name = "Pi", descriptor = "Z")
    public boolean field9167;

    @OriginalMember(owner = "client!om", name = "Wi", descriptor = "Z")
    public boolean field9174;

    @OriginalMember(owner = "client!om", name = "Ri", descriptor = "Z")
    public boolean field9169;

    @OriginalMember(owner = "client!om", name = "Zi", descriptor = "[I")
    public int[] field9177;

    @OriginalMember(owner = "client!om", name = "Xi", descriptor = "I")
    public int field9175;

    @OriginalMember(owner = "client!om", name = "bi", descriptor = "[S")
    public static short[] field9127 = new short[256];

    @OriginalMember(owner = "client!om", name = "Lh", descriptor = "[I")
    public static int[] field9111 = new int[2];

    @OriginalMember(owner = "client!om", name = "Lg", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!om", name = "Mg", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!om", name = "Ng", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!om", name = "Og", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!om", name = "Pg", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!om", name = "Qg", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!om", name = "Rg", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!om", name = "Sg", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!om", name = "Tg", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!om", name = "Ug", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!om", name = "Vg", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!om", name = "Wg", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!om", name = "Xg", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!om", name = "Yg", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!om", name = "Zg", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!om", name = "ah", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!om", name = "bh", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!om", name = "ch", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!om", name = "dh", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!om", name = "eh", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!om", name = "fh", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!om", name = "gh", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!om", name = "hh", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!om", name = "ih", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!om", name = "jh", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!om", name = "kh", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!om", name = "lh", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!om", name = "nh", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!om", name = "oh", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!om", name = "ph", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!om", name = "qh", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!om", name = "rh", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!om", name = "sh", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!om", name = "th", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!om", name = "uh", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!om", name = "vh", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!om", name = "wh", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!om", name = "xh", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!om", name = "yh", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!om", name = "Ah", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!om", name = "Bh", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!om", name = "Dh", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!om", name = "Eh", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!om", name = "Gh", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!om", name = "Hh", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!om", name = "Ih", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!om", name = "Jh", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!om", name = "Kh", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!om", name = "Mh", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!om", name = "Nh", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!om", name = "Oh", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!om", name = "Ph", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!om", name = "Qh", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!om", name = "Rh", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!om", name = "Sh", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!om", name = "Th", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!om", name = "Uh", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!om", name = "Vh", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!om", name = "Wh", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!om", name = "Xh", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!om", name = "Yh", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!om", name = "Zh", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!om", name = "ai", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!om", name = "ci", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!om", name = "di", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!om", name = "ei", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!om", name = "fi", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!om", name = "gi", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!om", name = "hi", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!om", name = "ii", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!om", name = "ji", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!om", name = "ki", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!om", name = "li", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!om", name = "mi", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!om", name = "oi", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!om", name = "pi", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!om", name = "qi", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!om", name = "ri", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!om", name = "si", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!om", name = "ti", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!om", name = "ui", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!om", name = "vi", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!om", name = "wi", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!om", name = "xi", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!om", name = "yi", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!om", name = "Mi", descriptor = "I")
    private int field9164;

    @OriginalMember(owner = "client!om", name = "Ii", descriptor = "J")
    private long field9160;

    @OriginalMember(owner = "client!om", name = "Fh", descriptor = "Lla;")
    public static class422 field9105;

    @OriginalMember(owner = "client!om", name = "Ch", descriptor = "Ljava/lang/Object;")
    public static Object field9102;

    @OriginalMember(owner = "client!om", name = "Ei", descriptor = "Z")
    private boolean field9156;

    @OriginalMember(owner = "client!om", name = "Gi", descriptor = "Z")
    private boolean field9158;

    @OriginalMember(owner = "client!om", name = "Hi", descriptor = "Z")
    private boolean field9159;

    @OriginalMember(owner = "client!om", name = "Ji", descriptor = "Z")
    private boolean field9161;

    @OriginalMember(owner = "client!om", name = "Ki", descriptor = "Z")
    private boolean field9162;

    @OriginalMember(owner = "client!om", name = "ya", descriptor = "()V", line = 3)
    public final void method1287() {
        ++field9064;
        this.method394(13119, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 14)
    public final void method422(byte arg0, Canvas arg1, Object arg2) {
        ++field9063;
        if (arg0 > -27) {
            this.field9165 = null;
        }
        Long var4 = (Long) arg2;
        this.field9099.releaseSurface(arg1, var4);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([FIZILlw;III)Lrm;", line = 28)
    public final class90 method415(float[] arg0, int arg1, boolean arg2, int arg3, class233 arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 10) {
            this.method362((byte) -86);
        }
        ++field9136;
        if (!this.field9172 && (!class668.method3743((byte) -122, arg1) || !class668.method3743((byte) -125, arg7))) {
            if (this.field9166) {
                return new class60(this, arg4, arg1, arg7, arg0, arg5, arg6);
            } else {
                class529 var9 = new class529(this, arg4, class121.field1863, class567.method3292(arg1, -67), class567.method3292(arg7, arg3 + -90));
                var9.method3135(arg0, arg4, 0, arg7, arg1, 0, true, arg6, arg5);
                return var9;
            }
        } else {
            return new class529(this, arg4, arg1, arg7, arg2, arg0, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;", line = 56)
    public final Object method324(Canvas arg0, byte arg1) {
        int var3 = 37 / ((arg1 - -33) / 54);
        ++field9082;
        long var4 = this.field9099.prepareSurface(arg0);
        if (var4 == -1L) {
            throw new RuntimeException();
        } else {
            return new Long(var4);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lfb;II)V", line = 73)
    public final void method327(class669 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            ++field9081;
            this.field9163[arg2] = (class77) arg0;
        }
    }

    @OriginalMember(owner = "client!om", name = "q", descriptor = "()Lqm;", line = 86)
    public final class429 method1308() {
        ++field9116;
        int var1 = -1;
        if (~this.field9168.indexOf("nvidia") == 0) {
            if (this.field9168.indexOf("intel") != -1) {
                var1 = 32902;
            } else if (this.field9168.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class429(var1, "OpenGL", this.field9173, this.field9171, 0L);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "()V", line = 109)
    public final void method248() {
        ++field9098;
        super.method248();
        if (this.field9099 != null) {
            this.field9099.method3277();
            this.field9099.release();
            this.field9099 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "()V", line = 124)
    public final void method1258() {
        ++field9080;
    }

    @OriginalMember(owner = "client!om", name = "u", descriptor = "()V", line = 135)
    public final void method1285() {
        ++field9144;
    }

    @OriginalMember(owner = "client!om", name = "u", descriptor = "(B)V", line = 142)
    public static final void method3624(byte arg0) {
        if (arg0 != -83) {
            method3624((byte) 90);
        }
        ++field9119;
        for (class124 var1 = (class124) class662.field9426.method3508((byte) -104); var1 != null; var1 = (class124) class662.field9426.method3520(-1)) {
            class188.method1429(var1.field1896, arg0 + 182);
        }
    }

    @OriginalMember(owner = "client!om", name = "cb", descriptor = "(I)V", line = 161)
    public final void method412(int arg0) {
        this.method432(5);
        ++field9072;
        int var2;
        for (var2 = 0; super.field578 > var2; ++var2) {
            class759 var3 = super.field588[var2];
            int var4 = var3.method4227(false);
            int var5 = var2 + 16386;
            float var6 = var3.method4226(5) / 255.0F;
            class690.field9797[0] = (float) var3.method4228(-117);
            class690.field9797[1] = (float) var3.method4221((byte) -7);
            class690.field9797[2] = (float) var3.method4223((byte) -110);
            class690.field9797[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class690.field9797, 0);
            class690.field9797[1] = var6 * (float) (class636.method3603(var4, 65414) >> 8);
            class690.field9797[3] = 1.0F;
            class690.field9797[2] = var6 * (float) class636.method3603(255, var4);
            class690.field9797[0] = (float) (class636.method3603(16738970, var4) >> 16) * var6;
            OpenGL.glLightfv(var5, 4609, class690.field9797, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method4224((byte) 127) * var3.method4224((byte) 127)));
            OpenGL.glEnable(var5);
        }
        while (~super.field608 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method412(arg0);
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(II)Lwm;", line = 206)
    public final class28 method1276(int arg0, int arg1) {
        ++field9113;
        return null;
    }

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "(I)V", line = 216)
    public final void method397(int arg0) {
        if (super.field696) {
            OpenGL.glEnable(3089);
        } else {
            OpenGL.glDisable(3089);
        }
        ++field9114;
        if (arg0 != 0) {
            this.method330(103, (class313) null);
        }
    }

    @OriginalMember(owner = "client!om", name = "S", descriptor = "(I)V", line = 231)
    public final void method378(int arg0) {
        if (arg0 > -33) {
            this.field9170 = false;
        }
        ++field9070;
        if (super.field663) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
    }

    @OriginalMember(owner = "client!om", name = "K", descriptor = "(I)V", line = 246)
    public final void method359(int arg0) {
        OpenGL.glScissor(super.field624 + super.field591, super.field655 + super.field462 + -super.field611, -super.field591 + super.field607, -super.field614 + super.field611);
        if (arg0 != -8) {
            this.field9168 = null;
        }
        ++field9083;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILlw;Lal;)Z", line = 257)
    public final boolean method430(int arg0, class233 arg1, class121 arg2) {
        ++field9101;
        if (arg0 <= 18) {
            this.field9168 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!om", name = "F", descriptor = "(II)V", line = 268)
    public final void method1290(int arg0, int arg1) {
        ++field9140;
    }

    @OriginalMember(owner = "client!om", name = "m", descriptor = "(B)V", line = 277)
    public final void method358(byte arg0) {
        if (arg0 != -21) {
            this.field9169 = false;
        }
        ++field9088;
        if (super.field584 && !super.field639) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(ZI)Lfb;", line = 294)
    public final class669 method293(boolean arg0, int arg1) {
        if (arg1 != 6) {
            this.method362((byte) 43);
        }
        ++field9112;
        return new class77(this, arg0);
    }

    @OriginalMember(owner = "client!om", name = "GA", descriptor = "(I)V", line = 305)
    public final void method1328(int arg0) {
        ++field9084;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(B)V", line = 314)
    public final void method276(byte arg0) {
        ++field9141;
        OpenGL.glDepthMask(super.field598 && super.field604);
        int var2 = -10 % ((-8 - arg0) / 52);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)V", line = 324)
    public final void method1301(boolean arg0) {
        ++field9091;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([[IBIZ)Lqn;", line = 331)
    public final class295 method363(int[][] arg0, byte arg1, int arg2, boolean arg3) {
        if (arg1 > -97) {
            this.field9176 = 80;
        }
        ++field9115;
        return new class455(this, arg2, arg3, arg0);
    }

    @OriginalMember(owner = "client!om", name = "G", descriptor = "(I)V", line = 344)
    public final void method334(int arg0) {
        ++field9097;
        if (arg0 != 0) {
            this.method372(-77);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILoq;ILri;I)V", line = 354)
    public final void method289(int arg0, int arg1, int arg2, class743 arg3, int arg4, class342 arg5, int arg6) {
        ++field9135;
        byte var8;
        int var9;
        if (class338.field4931 != arg5) {
            if (class468.field6809 == arg5) {
                var8 = 3;
                var9 = arg0 + 1;
            } else if (class386.field5775 == arg5) {
                var8 = 4;
                var9 = arg0 * 3;
            } else if (class255.field4027 == arg5) {
                var8 = 6;
                var9 = arg0 + 2;
            } else if (class358.field5430 != arg5) {
                var9 = arg0;
                var8 = 0;
            } else {
                var8 = 5;
                var9 = arg0 - -2;
            }
        } else {
            var9 = arg0 * 2;
            var8 = 1;
        }
        class121 var10 = arg3.method927(arg6 + 1592);
        class116 var11 = (class116) arg3;
        if (arg6 == 0) {
            var11.method1661(126);
            OpenGL.glDrawElements(var8, var9, class583.method3364(5122, var10), var11.method1655(false) - -((long) (var10.field1855 * arg4)));
        }
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(IZ)Loq;", line = 412)
    public final class743 method428(int arg0, boolean arg1) {
        ++field9129;
        if (arg0 > -107) {
            this.method333(false, (class266) null);
        }
        return new class116(this, class121.field1860, arg1);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLqg;)V", line = 423)
    public final void method333(boolean arg0, class266 arg1) {
        if (class465.field6786 == arg1) {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        } else {
            int var3 = class680.method3797(true, arg1);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        }
        if (arg0) {
            ++field9085;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lpea;)V", line = 451)
    public final void method1340(class456 arg0) {
        ++field9073;
    }

    @OriginalMember(owner = "client!om", name = "I", descriptor = "(I)V", line = 458)
    public final void method347(int arg0) {
        if (class560.field7946 == super.field645) {
            OpenGL.glBlendFunc(770, 771);
        } else if (class682.field9654 != super.field645) {
            if (class182.field3072 == super.field645) {
                OpenGL.glBlendFunc(774, 1);
            }
        } else {
            OpenGL.glBlendFunc(1, 1);
        }
        if (arg0 != 8) {
            this.field9174 = true;
        }
        ++field9076;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lmq;ZII)V", line = 481)
    public final void method369(class592 arg0, boolean arg1, int arg2, int arg3) {
        ++field9066;
        OpenGL.glTexEnvi(8960, arg2 + 34184, client.method2747(arg0, 5890));
        OpenGL.glTexEnvi(8960, arg2 + 34200, arg1 ? 771 : 770);
        if (arg3 >= -44) {
            this.method422((byte) 61, (Canvas) null, (Object) null);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(IIIID)V", line = 493)
    public final void method1278(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field9069;
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(B)V", line = 500)
    public final void method284(byte arg0) {
        ++field9147;
        if (arg0 < -18) {
            OpenGL.glMatrixMode(5890);
            if (super.field613[super.field617] == class243.field3916) {
                OpenGL.glLoadIdentity();
            } else {
                OpenGL.glLoadMatrixf(super.field616[super.field617].method2194((byte) 29, class758.field10578), 0);
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!om", name = "n", descriptor = "(B)V", line = 524)
    public final void method362(byte arg0) {
        if (arg0 != -46) {
            this.field9164 = -70;
        }
        ++field9061;
        if (!super.field671) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
    }

    @OriginalMember(owner = "client!om", name = "l", descriptor = "(B)V", line = 546)
    public final void method357(byte arg0) {
        ++field9065;
        if (super.field650) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
        if (arg0 >= -38) {
            this.field9167 = true;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Llw;IILal;I)Lrm;", line = 561)
    public final class90 method417(class233 arg0, int arg1, int arg2, class121 arg3, int arg4) {
        ++field9117;
        if (arg1 != 3) {
            this.field9160 = 50L;
        }
        if (!this.field9172 && (!class668.method3743((byte) -119, arg2) || !class668.method3743((byte) -122, arg4))) {
            return !this.field9166 ? new class529(this, arg0, arg3, class567.method3292(arg2, -125), class567.method3292(arg4, arg1 ^ -67)) : new class60(this, arg0, arg3, arg2, arg4);
        } else {
            return new class529(this, arg0, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lvm;Lvm;FLvm;)Lvm;", line = 590)
    public final class72 method1242(class72 arg0, class72 arg1, float arg2, class72 arg3) {
        ++field9128;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([BBLlw;III)Luc;", line = 599)
    public final class123 method408(byte[] arg0, byte arg1, class233 arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -91) {
            this.method1281(57, -46, -76, -21);
        }
        ++field9068;
        return new class37(this, arg2, arg4, arg3, arg5, arg0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILfk;)V", line = 610)
    public final void method330(int arg0, class313 arg1) {
        ++field9118;
        class468[] var3 = ((class451) arg1).field6569;
        if (arg0 != 19661) {
            this.field9172 = true;
        }
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        for (int var8 = 0; ~var8 > ~var3.length; ++var8) {
            class468 var11 = var3[var8];
            class77 var12 = this.field9163[var8];
            int var13 = 0;
            int var14 = var12.method702(arg0 ^ 19611);
            long var15 = var12.method1655(false);
            var12.method1661(126);
            for (int var17 = 0; var17 < var11.method2864(arg0 ^ 19601); ++var17) {
                class531 var18 = var11.method2863((byte) -117, var17);
                if (class531.field7629 != var18) {
                    if (class531.field7634 != var18) {
                        if (class531.field7635 == var18) {
                            OpenGL.glColorPointer(4, 5121, var14, (long) var13 + var15);
                            var5 = true;
                        } else if (class531.field7636 != var18) {
                            if (class531.field7637 == var18) {
                                OpenGL.glClientActiveTexture(33984 + var4++);
                                OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                            } else if (class531.field7638 == var18) {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(3, 5126, var14, (long) var13 + var15);
                            } else if (class531.field7639 == var18) {
                                OpenGL.glClientActiveTexture(33984 + var4++);
                                OpenGL.glTexCoordPointer(4, 5126, var14, (long) var13 + var15);
                            }
                        } else {
                            OpenGL.glClientActiveTexture(33984 - -(var4++));
                            OpenGL.glTexCoordPointer(1, 5126, var14, (long) var13 + var15);
                        }
                    } else {
                        OpenGL.glNormalPointer(5126, var14, (long) var13 + var15);
                        var6 = true;
                    }
                } else {
                    var7 = true;
                    OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                }
                var13 += var18.field7631;
            }
        }
        if (this.field9156 != var7) {
            if (var7) {
                OpenGL.glEnableClientState(32884);
            } else {
                OpenGL.glDisableClientState(32884);
            }
            this.field9156 = var7;
        }
        if (this.field9162 != var6) {
            if (!var6) {
                OpenGL.glDisableClientState(32885);
            } else {
                OpenGL.glEnableClientState(32885);
            }
            this.field9162 = var6;
        }
        if (!this.field9159 != !var5) {
            if (!var5) {
                OpenGL.glDisableClientState(32886);
            } else {
                OpenGL.glEnableClientState(32886);
            }
            this.field9159 = var5;
        }
        if (~var4 >= ~this.field9164) {
            if (~var4 > ~this.field9164) {
                for (int var9 = var4; var9 < this.field9164; ++var9) {
                    OpenGL.glClientActiveTexture(var9 + 33984);
                    OpenGL.glDisableClientState(32888);
                }
                this.field9164 = var4;
                return;
            }
        } else {
            for (int var10 = this.field9164; ~var4 < ~var10; ++var10) {
                OpenGL.glClientActiveTexture(var10 + 33984);
                OpenGL.glEnableClientState(32888);
            }
            this.field9164 = var4;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILmq;ZZI)V", line = 775)
    public final void method338(int arg0, class592 arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg4 == 31181) {
            OpenGL.glTexEnvi(8960, arg0 + 34176, client.method2747(arg1, 5890));
            ++field9137;
            if (!arg3) {
                OpenGL.glTexEnvi(8960, 34192 - -arg0, !arg2 ? 768 : 769);
            } else {
                OpenGL.glTexEnvi(8960, arg0 + 34192, arg2 ? 771 : 770);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "k", descriptor = "(Z)V", line = 791)
    public final void method318(boolean arg0) {
        ++field9148;
        class690.field9797[1] = (float) class636.method3603(super.field600, 65280) / 65280.0F;
        class690.field9797[0] = (float) class636.method3603(16711680, super.field600) / 1.671168E7F;
        class690.field9797[2] = (float) class636.method3603(255, super.field600) / 255.0F;
        if (arg0) {
            this.field9169 = false;
        }
        class690.field9797[3] = (float) (super.field600 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class690.field9797, 0);
    }

    @OriginalMember(owner = "client!om", name = "F", descriptor = "(I)F", line = 809)
    public final float method325(int arg0) {
        if (arg0 != 5484) {
            this.field9167 = true;
        }
        ++field9107;
        return 0.0F;
    }

    @OriginalMember(owner = "client!om", name = "j", descriptor = "(II)V", line = 823)
    public final void method241(int arg0, int arg1) {
        ++field9071;
        if (arg1 != 0) {
            this.method1268(0.74815935F, -0.9143618F, -0.8551251F);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILlw;I[BIIZ)Lrm;", line = 835)
    public final class90 method349(int arg0, int arg1, class233 arg2, int arg3, byte[] arg4, int arg5, int arg6, boolean arg7) {
        if (arg1 != -1) {
            this.method1268(1.1362364F, 0.73978317F, -0.6191066F);
        }
        ++field9109;
        if (!this.field9172 && (!class668.method3743((byte) -118, arg3) || !class668.method3743((byte) -126, arg6))) {
            if (this.field9166) {
                return new class60(this, arg2, arg3, arg6, arg4, arg0, arg5);
            } else {
                class529 var9 = new class529(this, arg2, class121.field1859, class567.method3292(arg3, -83), class567.method3292(arg6, arg1 + -72));
                var9.method594(arg5, arg2, arg1 + -32481, 0, arg0, arg6, 0, arg3, arg4);
                return var9;
            }
        } else {
            return new class529(this, arg2, arg3, arg6, arg7, arg4, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Lhu;", line = 863)
    public final class224 method1288(int arg0, int arg1) {
        ++field9059;
        return null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 871)
    public final void method1272(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class556 {
        this.method1261(arg2, arg3);
        ++field9120;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(B)V", line = 879)
    public final void method271(byte arg0) {
        ++field9110;
        this.method3625(0);
        if (arg0 != -98) {
            this.method214(65);
        }
    }

    @OriginalMember(owner = "client!om", name = "fb", descriptor = "(I)V", line = 890)
    private final void method3625(int arg0) {
        ++field9133;
        if (this.field9161) {
            OpenGL.glPopMatrix();
        }
        if (super.field605.method115(arg0)) {
            if (!this.field9158) {
                OpenGL.glLoadMatrixf(super.field570.method2194((byte) 31, class758.field10578), 0);
                this.field9158 = true;
                this.method341(29069);
                this.method412(15);
            }
            if (!super.field551) {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field547.method2194((byte) 71, class758.field10578), 0);
                this.field9161 = true;
            } else {
                this.field9161 = false;
            }
        } else if (super.field551) {
            OpenGL.glLoadIdentity();
            this.field9161 = false;
        } else {
            OpenGL.glLoadMatrixf(super.field547.method2194((byte) 78, class758.field10578), 0);
            this.field9161 = false;
        }
    }

    @OriginalMember(owner = "client!om", name = "H", descriptor = "(I)V", line = 935)
    public final void method341(int arg0) {
        if (arg0 != 29069) {
            this.method1340((class456) null);
        }
        OpenGL.glLightfv(16384, 4611, super.field642, 0);
        ++field9100;
        OpenGL.glLightfv(16385, 4611, super.field573, 0);
    }

    @OriginalMember(owner = "client!om", name = "v", descriptor = "()Z", line = 949)
    public final boolean method1292() {
        ++field9106;
        return false;
    }

    @OriginalMember(owner = "client!om", name = "l", descriptor = "(Z)V", line = 959)
    public final void method319(boolean arg0) {
        if (super.field657 && super.field665 && ~super.field636 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field9143;
        if (!arg0) {
            this.method289(-103, 4, 29, (class743) null, -77, (class342) null, -25);
        }
    }

    @OriginalMember(owner = "client!om", name = "A", descriptor = "()Z", line = 974)
    public final boolean method1237() {
        ++field9150;
        return false;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V", line = 983)
    public final void method214(int arg0) {
        int var2 = -83 / ((arg0 - 9) / 40);
        OpenGL.glViewport(super.field624, super.field655, super.field378, super.field462);
        ++field9077;
    }

    @OriginalMember(owner = "client!om", name = "db", descriptor = "(I)V", line = 995)
    public final void method425(int arg0) {
        OpenGL.glTexEnvi(8960, 34161, class555.method3234(super.field673[super.field617], 0));
        if (arg0 < 0) {
            this.field9176 = -32;
        }
        ++field9087;
    }

    @OriginalMember(owner = "client!om", name = "na", descriptor = "(IIII)[I", line = 1006)
    public final int[] method1262(int arg0, int arg1, int arg2, int arg3) {
        ++field9090;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, super.field462 - arg1 - var6 + -1, arg2, 1, 32993, this.field9175, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 1026)
    public final synchronized void method261(int arg0) {
        ++field9067;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field9139.method3473(false)) {
            class332 var12 = (class332) this.field9139.method3466(0);
            class705.field9951[var2++] = (int) var12.field1039;
            super.field556 -= var12.field4880;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class705.field9951, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class705.field9951, 0);
            var2 = 0;
        }
        while (!this.field9151.method3473(false)) {
            class332 var11 = (class332) this.field9151.method3466(0);
            class705.field9951[var2++] = (int) var11.field1039;
            super.field550 -= var11.field4880;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class705.field9951, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class705.field9951, 0);
            var2 = 0;
        }
        while (!this.field9152.method3473(false)) {
            class332 var10 = (class332) this.field9152.method3466(0);
            class705.field9951[var2++] = var10.field4880;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class705.field9951, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class705.field9951, 0);
            var2 = 0;
        }
        while (!this.field9153.method3473(false)) {
            class332 var9 = (class332) this.field9153.method3466(0);
            class705.field9951[var2++] = (int) var9.field1039;
            super.field560 -= var9.field4880;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class705.field9951, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class705.field9951, 0);
            boolean var4 = false;
        }
        while (!this.field9086.method3473(false)) {
            class332 var8 = (class332) this.field9086.method3466(0);
            OpenGL.glDeleteLists((int) var8.field1039, var8.field4880);
        }
        while (!this.field9154.method3473(false)) {
            class65 var7 = this.field9154.method3466(0);
            OpenGL.glDeleteProgramARB((int) var7.field1039);
        }
        while (!this.field9155.method3473(false)) {
            class65 var6 = this.field9155.method3466(0);
            OpenGL.glDeleteObjectARB(var6.field1039);
        }
        while (!this.field9086.method3473(false)) {
            class332 var5 = (class332) this.field9086.method3466(0);
            OpenGL.glDeleteLists((int) var5.field1039, var5.field4880);
        }
        if (~this.method332() < -100663297 && this.field9160 + 60000L < class18.method109(-11121)) {
            System.gc();
            this.field9160 = class18.method109(-11121);
        }
        super.method261(var3);
    }

    @OriginalMember(owner = "client!om", name = "k", descriptor = "(B)V", line = 1184)
    public final void method346(byte arg0) {
        class690.field9797[1] = super.field651 * super.field593;
        if (arg0 == -50) {
            class690.field9797[0] = super.field651 * super.field626;
            class690.field9797[2] = super.field661 * super.field651;
            class690.field9797[3] = 1.0F;
            ++field9123;
            OpenGL.glLightModelfv(2899, class690.field9797, 0);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V", line = 1202)
    public final void method1281(int arg0, int arg1, int arg2, int arg3) {
        ++field9096;
    }

    @OriginalMember(owner = "client!om", name = "m", descriptor = "()V", line = 1211)
    public final void method1274() {
        ++field9142;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lla;I)V", line = 1221)
    public class642(OpenGL arg0, Canvas arg1, long arg2, class267 arg3, class422 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field9099 = arg0;
            this.field9099.method3276();
            this.field9168 = OpenGL.glGetString(7936).toLowerCase();
            this.field9171 = OpenGL.glGetString(7937).toLowerCase();
            if (this.field9168.indexOf("microsoft") == -1 && ~this.field9168.indexOf("brian paul") == 0 && ~this.field9168.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class750.method4181((byte) -8, var8.replace('.', ' '), ' ');
                if (~var9.length <= -3) {
                    try {
                        int var10 = class714.method3949((byte) -116, var9[0]);
                        int var11 = class714.method3949((byte) -78, var9[1]);
                        this.field9173 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field9173 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field9099.method3275("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field9099.method3275("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field597 = var12[0];
                        if (super.field597 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field579 = 8;
                            this.field9170 = this.field9099.method3275("GL_ARB_vertex_buffer_object");
                            super.field619 = this.field9099.method3275("GL_ARB_multisample");
                            this.field9166 = this.field9099.method3275("GL_ARB_texture_rectangle");
                            super.field583 = this.field9099.method3275("GL_ARB_texture_cube_map");
                            this.field9172 = this.field9099.method3275("GL_ARB_texture_non_power_of_two");
                            super.field574 = this.field9099.method3275("GL_EXT_texture3D");
                            this.field9167 = this.field9099.method3275("GL_ARB_vertex_shader");
                            this.field9174 = this.field9099.method3275("GL_ARB_vertex_program");
                            this.field9169 = this.field9099.method3275("GL_ARB_fragment_shader");
                            this.field9099.method3275("GL_ARB_fragment_program");
                            this.field9177 = new int[super.field597];
                            this.field9175 = Stream.method2572() ? 33639 : 5121;
                            if (~this.field9171.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class750.method4181((byte) -80, this.field9171.replace('/', ' '), ' ');
                                for (int var17 = 0; var16.length > var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (~var18.charAt(0) == -121 && ~var18.length() <= -4 && class166.method1277(var18.substring(1, 3), 0)) {
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
                                                if (~var18.length() <= -5 && class166.method1277(var18.substring(0, 4), 0)) {
                                                    var13 = class714.method3949((byte) -66, var18.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (~var13 <= -7001 && ~var13 >= -9251) {
                                        super.field574 = false;
                                    }
                                    if (var13 >= 7000 && var13 <= 7999) {
                                        this.field9170 = false;
                                    }
                                }
                                this.field9166 &= this.field9099.method3275("GL_ARB_half_float_pixel");
                            }
                            this.field9168.indexOf("intel");
                            if (this.field9170) {
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
            this.method3190((byte) 107);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)Loca;", line = 1374)
    public final class279 method277(int arg0, byte arg1) {
        if (arg1 != -79) {
            this.method1281(-8, 97, 8, -7);
        }
        ++field9138;
        if (arg0 != 3) {
            if (~arg0 != -5) {
                return arg0 == 8 ? new class110(this, super.field418, super.field435) : super.method277(arg0, (byte) -79);
            } else {
                return new class138(this, super.field418, super.field435);
            }
        } else {
            return new class580(this, super.field418);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(JI)V", line = 1417)
    public final synchronized void method3626(long arg0, int arg1) {
        ++field9074;
        class65 var4 = new class65();
        var4.field1039 = arg0;
        this.field9155.method3472(83, var4);
        if (arg1 != 27693) {
            this.field9163 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "C", descriptor = "(I)V", line = 1434)
    public final void method307(int arg0) {
        ++field9126;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(super.field586, 0);
        if (arg0 != -1) {
            field9105 = null;
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V", line = 1449)
    public final void method340(Object arg0, int arg1, Canvas arg2) {
        if (arg1 != 5) {
            this.method407(108, 9, 27, (int[]) null, -111, 34, false);
        }
        ++field9108;
        Long var4 = (Long) arg0;
        this.field9099.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!om", name = "D", descriptor = "(I)V", line = 1462)
    public final void method311(int arg0) {
        ++field9149;
        super.field653 = (float) (-super.field646 + super.field581);
        super.field621 = (float) (-super.field636) + super.field653;
        if ((float) super.field634 > super.field621) {
            super.field621 = (float) super.field634;
        }
        OpenGL.glFogf(2915, super.field621);
        int var2 = 16 / ((arg0 - -31) / 49);
        OpenGL.glFogf(2916, super.field653);
        class690.field9797[2] = (float) class636.method3603(255, super.field618) / 255.0F;
        class690.field9797[1] = (float) class636.method3603(65280, super.field618) / 65280.0F;
        class690.field9797[0] = (float) class636.method3603(16711680, super.field618) / 1.671168E7F;
        OpenGL.glFogfv(2918, class690.field9797, 0);
    }

    @OriginalMember(owner = "client!om", name = "A", descriptor = "(I)V", line = 1484)
    public final void method304(int arg0) {
        if (arg0 == 26467) {
            ++field9093;
            int var2 = this.field9177[super.field617];
            if (var2 != 0) {
                this.field9177[super.field617] = 0;
                OpenGL.glBindTexture(var2, 0);
                OpenGL.glDisable(var2);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V", line = 1504)
    public final synchronized void method3627(int arg0, int arg1, int arg2) {
        ++field9089;
        class332 var4 = new class332(arg2);
        if (arg1 == 8960) {
            var4.field1039 = (long) arg0;
            this.field9139.method3472(arg1 + -8873, var4);
        }
    }

    @OriginalMember(owner = "client!om", name = "n", descriptor = "()V", line = 1518)
    public final void method1338() {
        OpenGL.glFinish();
        ++field9062;
    }

    @OriginalMember(owner = "client!om", name = "M", descriptor = "(I)V", line = 1526)
    public final void method364(int arg0) {
        ++field9060;
        if (super.field652) {
            OpenGL.glEnable(3008);
        } else {
            OpenGL.glDisable(3008);
        }
        if (arg0 != 23698) {
            this.method422((byte) -126, (Canvas) null, (Object) null);
        }
    }

    @OriginalMember(owner = "client!om", name = "r", descriptor = "(I)V", line = 1542)
    public final void method255(int arg0) {
        if (arg0 > -76) {
            this.field9173 = -110;
        }
        ++field9078;
        OpenGL.glTexEnvi(8960, 34162, class555.method3234(super.field625[super.field617], 0));
    }

    @OriginalMember(owner = "client!om", name = "o", descriptor = "(Z)V", line = 1556)
    public static void method3628(boolean arg0) {
        if (arg0) {
            field9102 = null;
            field9127 = null;
            field9105 = null;
            field9111 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "h", descriptor = "()V", line = 1569)
    public final void method1265() {
        ++field9145;
        if (super.field378 > 0 || super.field462 > 0) {
            int var1 = super.field591;
            int var2 = super.field607;
            int var3 = super.field614;
            int var4 = super.field611;
            this.method374();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method262(102);
            this.method232(false, (byte) 123);
            this.method384(-37, false);
            this.method258(false, 1);
            this.method394(13119, false);
            this.method215(8, (class506) null);
            this.method421(false, 15, -2, false);
            this.method405(1, (byte) 121);
            this.method314(0, (byte) 21);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field378, super.field462, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method240(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILri;ZI)V", line = 1615)
    public final void method403(int arg0, class342 arg1, boolean arg2, int arg3) {
        ++field9121;
        if (arg2) {
            method3628(true);
        }
        int var5;
        byte var6;
        if (class338.field4931 != arg1) {
            if (class468.field6809 != arg1) {
                if (class386.field5775 == arg1) {
                    var5 = arg0 * 3;
                    var6 = 4;
                } else if (class255.field4027 != arg1) {
                    if (class358.field5430 != arg1) {
                        var6 = 0;
                        var5 = arg0;
                    } else {
                        var5 = arg0 + 2;
                        var6 = 5;
                    }
                } else {
                    var6 = 6;
                    var5 = arg0 - -2;
                }
            } else {
                var6 = 3;
                var5 = arg0 + 1;
            }
        } else {
            var5 = arg0 * 2;
            var6 = 1;
        }
        OpenGL.glDrawArrays(var6, arg3, var5);
    }

    @OriginalMember(owner = "client!om", name = "i", descriptor = "(B)V", line = 1671)
    public final void method329(byte arg0) {
        if (arg0 != 18) {
            this.method214(43);
        }
        ++field9092;
        OpenGL.glActiveTexture(super.field617 + 33984);
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(B)V", line = 1683)
    public final void method281(byte arg0) {
        for (int var2 = super.field597 + -1; ~var2 <= -1; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field9079;
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
        this.field9099.setSwapInterval(0);
        super.method281(arg0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILal;Llw;)Z", line = 1741)
    public final boolean method399(int arg0, class121 arg1, class233 arg2) {
        ++field9094;
        return arg0 != 18154 ? true : true;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lhu;Lwm;)Lpea;", line = 1755)
    public final class456 method1344(class224 arg0, class28 arg1) {
        ++field9124;
        return null;
    }

    @OriginalMember(owner = "client!om", name = "w", descriptor = "(I)V", line = 1766)
    public final void method286(int arg0) {
        ++field9134;
        if (arg0 <= 63) {
            this.method278((Object) null, (byte) 63, (Canvas) null);
        }
        this.field9158 = false;
        this.method3625(0);
    }

    @OriginalMember(owner = "client!om", name = "P", descriptor = "(I)V", line = 1778)
    public final void method372(int arg0) {
        class690.field9797[3] = 1.0F;
        class690.field9797[1] = super.field632 * super.field593;
        class690.field9797[2] = super.field661 * super.field632;
        class690.field9797[arg0] = super.field632 * super.field626;
        ++field9095;
        OpenGL.glLightfv(16384, 4609, class690.field9797, 0);
        class690.field9797[0] = -super.field620 * super.field626;
        class690.field9797[3] = 1.0F;
        class690.field9797[1] = -super.field620 * super.field593;
        class690.field9797[2] = -super.field620 * super.field661;
        OpenGL.glLightfv(16385, 4609, class690.field9797, 0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III[IIIZ)Lrm;", line = 1796)
    public final class90 method407(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 < 55) {
            return null;
        } else {
            ++field9122;
            if (!this.field9172 && (!class668.method3743((byte) -119, arg4) || !class668.method3743((byte) -126, arg1))) {
                if (this.field9166) {
                    return new class60(this, arg4, arg1, arg3, arg2, arg0);
                } else {
                    class529 var8 = new class529(this, class238.field3830, class121.field1859, class567.method3292(arg4, -107), class567.method3292(arg1, -85));
                    var8.method587(arg0, arg3, arg2, arg4, 17432, arg1, 0, 0);
                    return var8;
                }
            } else {
                return new class529(this, arg4, arg1, arg6, arg3, arg2, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(IZ)V", line = 1825)
    public final void method396(int arg0, boolean arg1) {
        ++field9130;
        if (arg1) {
            OpenGL.glEnable(32925);
        } else {
            OpenGL.glDisable(32925);
        }
        if (arg0 > -38) {
            this.field9164 = -102;
        }
    }

    @OriginalMember(owner = "client!om", name = "k", descriptor = "(II)V", line = 1840)
    public final synchronized void method3629(int arg0, int arg1) {
        if (arg1 != 14068) {
            this.method304(4);
        }
        ++field9104;
        class65 var3 = new class65();
        var3.field1039 = (long) arg0;
        this.field9154.method3472(93, var3);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I[Lbl;)Lfk;", line = 1855)
    public final class313 method219(int arg0, class468[] arg1) {
        ++field9103;
        if (arg0 != 2) {
            this.field9152 = null;
        }
        return new class451(arg1);
    }

    @OriginalMember(owner = "client!om", name = "I", descriptor = "()I", line = 1872)
    public final int method1273() {
        ++field9131;
        return this.field9176;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(FFF)V", line = 1880)
    public final void method1268(float arg0, float arg1, float arg2) {
        ++field9125;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BII)V", line = 1888)
    public final synchronized void method3630(byte arg0, int arg1, int arg2) {
        ++field9132;
        class332 var4 = new class332(arg2);
        if (arg0 > 119) {
            var4.field1039 = (long) arg1;
            this.field9151.method3472(110, var4);
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(II)V", line = 1908)
    public final void method1261(int arg0, int arg1) throws class556 {
        ++field9075;
        this.field9099.swapBuffers();
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V", line = 1923)
    public final void method278(Object arg0, byte arg1, Canvas arg2) {
        ++field9146;
        Long var4 = (Long) arg0;
        if (arg1 != -16) {
            this.field9165 = null;
        }
        if (!this.field9099.setSurface(var4)) {
            throw new RuntimeException();
        }
    }
}
