import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class690 extends class296 {

    @OriginalMember(owner = "client!rda", name = "ai", descriptor = "Lef;")
    private class513 field9997 = new class513();

    @OriginalMember(owner = "client!rda", name = "vh", descriptor = "Lef;")
    private class513 field10067 = new class513();

    @OriginalMember(owner = "client!rda", name = "ri", descriptor = "Lef;")
    private class513 field10073 = new class513();

    @OriginalMember(owner = "client!rda", name = "di", descriptor = "Lef;")
    private class513 field10085 = new class513();

    @OriginalMember(owner = "client!rda", name = "Jh", descriptor = "Lef;")
    private class513 field10089 = new class513();

    @OriginalMember(owner = "client!rda", name = "Vh", descriptor = "Lef;")
    private class513 field10090 = new class513();

    @OriginalMember(owner = "client!rda", name = "th", descriptor = "Lef;")
    private class513 field10091 = new class513();

    @OriginalMember(owner = "client!rda", name = "Sh", descriptor = "[Lgr;")
    private class458[] field10100 = new class458[16];

    @OriginalMember(owner = "client!rda", name = "eh", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field10094 = new MapBuffer();

    @OriginalMember(owner = "client!rda", name = "Fi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field10101 = new MapBuffer();

    @OriginalMember(owner = "client!rda", name = "Ng", descriptor = "I")
    private int field10105 = 0;

    @OriginalMember(owner = "client!rda", name = "Fh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field10003;

    @OriginalMember(owner = "client!rda", name = "Ih", descriptor = "Ljava/lang/String;")
    private String field10104;

    @OriginalMember(owner = "client!rda", name = "Wi", descriptor = "Ljava/lang/String;")
    private String field10106;

    @OriginalMember(owner = "client!rda", name = "Mh", descriptor = "I")
    private int field10102;

    @OriginalMember(owner = "client!rda", name = "Qg", descriptor = "Z")
    public boolean field10110;

    @OriginalMember(owner = "client!rda", name = "mi", descriptor = "Z")
    private boolean field10107;

    @OriginalMember(owner = "client!rda", name = "ch", descriptor = "Z")
    private boolean field10113;

    @OriginalMember(owner = "client!rda", name = "Xg", descriptor = "Z")
    public boolean field10109;

    @OriginalMember(owner = "client!rda", name = "ph", descriptor = "Z")
    public boolean field10108;

    @OriginalMember(owner = "client!rda", name = "hi", descriptor = "Z")
    public boolean field10111;

    @OriginalMember(owner = "client!rda", name = "xi", descriptor = "[I")
    public int[] field10103;

    @OriginalMember(owner = "client!rda", name = "Oh", descriptor = "I")
    public int field10112;

    @OriginalMember(owner = "client!rda", name = "Zi", descriptor = "[Ljava/lang/String;")
    private static final String[] field10114 = new String[] { method5059(method5058("~b~:")), method5059(method5058("k9<xI")), method5059(method5058("bssxpW?")), method5059(method5058("bssxrU?")), method5059(method5058("bssxZq?")), method5059(method5058("bssxfW?")), method5059(method5058("bssxdS?")), method5059(method5058("bssxfY?")), method5059(method5058("bssxzW?")), method5059(method5058("bssx\u007fX?")), method5059(method5058("bssxaT?")), method5059(method5058("bssxfS?")), method5059(method5058("bssx{T?")), method5059(method5058("bssxdX?")), method5059(method5058("bssxzV?")), method5059(method5058("bssx}W?")), method5059(method5058("bssx|Z?")), method5059(method5058("bssxsR?")), method5059(method5058("bssxwZ?")), method5059(method5058("bssxqV?")), method5059(method5058("bssxbW?")), method5059(method5058("bssxvY?")), method5059(method5058("bssxpR?")), method5059(method5058("bssx|X?")), method5059(method5058("bssxqW?")), method5059(method5058("bssxvZ?")), method5059(method5058("bssxfQ?")), method5059(method5058("bssxdW?")), method5059(method5058("yyf3X")), method5059(method5058("bssxxZ?")), method5059(method5058("qc{")), method5059(method5058("_gw8s\\")), method5059(method5058("~a{2]q")), method5059(method5058("bssxeU?")), method5059(method5058("bssxeY?")), method5059(method5058("bssx~S?")), method5059(method5058("bssx\u007fY?")), method5059(method5058("bssxbS?")), method5059(method5058("bssxxY?")), method5059(method5058("bssxsZ?")), method5059(method5058("bssxqZ?")), method5059(method5058("bssx}8")), method5059(method5058("bssxsW?")), method5059(method5058("bssxuZ?")), method5059(method5058("bssxfR?")), method5059(method5058("bssxxW?")), method5059(method5058("bssxrZ?")), method5059(method5058("bssxvW?")), method5059(method5058("bssx\u007fS?")), method5059(method5058("bssxwY?")), method5059(method5058("bssxcS?")), method5059(method5058("re{7Z0gs#X")), method5059(method5058("W[M\u0017fRHf3Ldb`3ksbp3k}vb")), method5059(method5058("}~q$[cxt\"")), method5059(method5058("W[M\u0017fRHf3Ldb`3k~x|\tD\u007f`w$k\u007fqM\"C\u007f")), method5059(method5058("W[M\u0017fRHd3Fdrj\tDbxu$U}")), method5059(method5058("bvv3[~")), method5059(method5058("}ra7")), method5059(method5058("xs")), method5059(method5058("W[M\u0013lDHf3Ldb`3\u0007T")), method5059(method5058("W[M\u0017fRHf3Ldb`3kuyd\tW\u007fzp?Zu")), method5059(method5058("W[M\u0017fRHd3Fdrj\tVeqt3FOxp<Qsc")), method5059(method5058("bssx\byy{\"\n8")), method5059(method5058("W[M\u0017fRHd3Fdrj\tGxvv3F")), method5059(method5058("W[M\u0017fRHt$Uwzw8@Og`9Sbv\u007f")), method5059(method5058("W[M\u0017fRHz7XvHt:[qcM&]hr~")), method5059(method5058("W[M\u0017fRHf3Ldb`3kbrq\"U~p~3")), method5059(method5058("W[M\u0017fRHt$Uwzw8@Odz7Pue")), method5059(method5058("W[M\u0017fRH\u007f#Xd~a7Y`{w")), method5059(method5058("W[M\u0017fRH\u007f#Xd~f3Ldb`3")), method5059(method5058("bssxvU?")), method5059(method5058("bssx|Y?")), method5059(method5058("bssx~U?")), method5059(method5058("bssxsT?")), method5059(method5058("bssx|V?")), method5059(method5058("bssx}Z?")), method5059(method5058("bssxzY?")), method5059(method5058("bssxqX?")), method5059(method5058("bssxgV?")), method5059(method5058("bssx{Y?")), method5059(method5058("bssxaY?")), method5059(method5058("bssxbR?")), method5059(method5058("bssxyY?")), method5059(method5058("bssx{X?")), method5059(method5058("bssxV8")), method5059(method5058("bssx`Y?")), method5059(method5058("bssx}V?")), method5059(method5058("bssxvV?")), method5059(method5058("bssxdY?")), method5059(method5058("bssxpX?")), method5059(method5058("bssx\u007fZ?")), method5059(method5058("bssx{8")), method5059(method5058("bssx}X?")), method5059(method5058("bssxsQ?")), method5059(method5058("bssxpZ?")), method5059(method5058("bssx`V?")), method5059(method5058("bssxrS?")), method5059(method5058("bssxdQ?")), method5059(method5058("bssxf8")), method5059(method5058("bssxgY?")), method5059(method5058("bssx`S?")), method5059(method5058("bssx|R?")), method5059(method5058("bssxr8")), method5059(method5058("bssxxS?")), method5059(method5058("bssx~Z?")), method5059(method5058("bssxMq?")), method5059(method5058("bssx}S?")), method5059(method5058("bssxb8")), method5059(method5058("bssxcY?")), method5059(method5058("bssxbY?")) };

    @OriginalMember(owner = "client!rda", name = "Sg", descriptor = "[I")
    public static int[] field10001 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!rda", name = "Ni", descriptor = "Lel;")
    public static class573 field10018 = new class573(52, 8);

    @OriginalMember(owner = "client!rda", name = "li", descriptor = "Z")
    public static boolean field10071 = false;

    @OriginalMember(owner = "client!rda", name = "Ch", descriptor = "I")
    public static int field10000;

    @OriginalMember(owner = "client!rda", name = "ni", descriptor = "I")
    public static int field10002;

    @OriginalMember(owner = "client!rda", name = "fi", descriptor = "I")
    public static int field10004;

    @OriginalMember(owner = "client!rda", name = "ci", descriptor = "I")
    public static int field10005;

    @OriginalMember(owner = "client!rda", name = "Gh", descriptor = "I")
    public static int field10006;

    @OriginalMember(owner = "client!rda", name = "Hi", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!rda", name = "Vg", descriptor = "I")
    public static int field10008;

    @OriginalMember(owner = "client!rda", name = "zi", descriptor = "I")
    public static int field10009;

    @OriginalMember(owner = "client!rda", name = "Qh", descriptor = "I")
    public static int field10010;

    @OriginalMember(owner = "client!rda", name = "Wh", descriptor = "I")
    public static int field10011;

    @OriginalMember(owner = "client!rda", name = "Ui", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!rda", name = "Ug", descriptor = "I")
    public static int field10013;

    @OriginalMember(owner = "client!rda", name = "Jg", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!rda", name = "Og", descriptor = "I")
    public static int field10015;

    @OriginalMember(owner = "client!rda", name = "Mi", descriptor = "I")
    public static int field10016;

    @OriginalMember(owner = "client!rda", name = "Di", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!rda", name = "Yi", descriptor = "I")
    public static int field10019;

    @OriginalMember(owner = "client!rda", name = "Xh", descriptor = "I")
    public static int field10020;

    @OriginalMember(owner = "client!rda", name = "Pi", descriptor = "I")
    public static int field10021;

    @OriginalMember(owner = "client!rda", name = "bh", descriptor = "I")
    public static int field10022;

    @OriginalMember(owner = "client!rda", name = "Ah", descriptor = "I")
    public static int field10024;

    @OriginalMember(owner = "client!rda", name = "jh", descriptor = "I")
    public static int field10025;

    @OriginalMember(owner = "client!rda", name = "oh", descriptor = "I")
    public static int field10026;

    @OriginalMember(owner = "client!rda", name = "hh", descriptor = "I")
    public static int field10027;

    @OriginalMember(owner = "client!rda", name = "Yg", descriptor = "I")
    public static int field10028;

    @OriginalMember(owner = "client!rda", name = "Ci", descriptor = "I")
    public static int field10029;

    @OriginalMember(owner = "client!rda", name = "Lh", descriptor = "I")
    public static int field10030;

    @OriginalMember(owner = "client!rda", name = "qi", descriptor = "I")
    public static int field10031;

    @OriginalMember(owner = "client!rda", name = "ki", descriptor = "I")
    public static int field10032;

    @OriginalMember(owner = "client!rda", name = "Uh", descriptor = "I")
    public static int field10033;

    @OriginalMember(owner = "client!rda", name = "ih", descriptor = "I")
    public static int field10034;

    @OriginalMember(owner = "client!rda", name = "Wg", descriptor = "I")
    public static int field10035;

    @OriginalMember(owner = "client!rda", name = "Ei", descriptor = "I")
    public static int field10036;

    @OriginalMember(owner = "client!rda", name = "Pg", descriptor = "I")
    public static int field10037;

    @OriginalMember(owner = "client!rda", name = "Rg", descriptor = "I")
    public static int field10038;

    @OriginalMember(owner = "client!rda", name = "zh", descriptor = "I")
    public static int field10039;

    @OriginalMember(owner = "client!rda", name = "Xi", descriptor = "I")
    public static int field10040;

    @OriginalMember(owner = "client!rda", name = "Si", descriptor = "I")
    public static int field10041;

    @OriginalMember(owner = "client!rda", name = "gh", descriptor = "I")
    public static int field10042;

    @OriginalMember(owner = "client!rda", name = "uh", descriptor = "I")
    public static int field10043;

    @OriginalMember(owner = "client!rda", name = "Kh", descriptor = "I")
    public static int field10044;

    @OriginalMember(owner = "client!rda", name = "Bi", descriptor = "I")
    public static int field10045;

    @OriginalMember(owner = "client!rda", name = "Eh", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!rda", name = "Nh", descriptor = "I")
    public static int field10047;

    @OriginalMember(owner = "client!rda", name = "oi", descriptor = "I")
    public static int field10048;

    @OriginalMember(owner = "client!rda", name = "ei", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!rda", name = "ah", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!rda", name = "Ji", descriptor = "I")
    public static int field10051;

    @OriginalMember(owner = "client!rda", name = "ji", descriptor = "I")
    public static int field10052;

    @OriginalMember(owner = "client!rda", name = "Oi", descriptor = "I")
    public static int field10053;

    @OriginalMember(owner = "client!rda", name = "Bh", descriptor = "I")
    public static int field10054;

    @OriginalMember(owner = "client!rda", name = "Hh", descriptor = "I")
    public static int field10055;

    @OriginalMember(owner = "client!rda", name = "Zh", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!rda", name = "Vi", descriptor = "I")
    public static int field10057;

    @OriginalMember(owner = "client!rda", name = "rh", descriptor = "I")
    public static int field10058;

    @OriginalMember(owner = "client!rda", name = "ui", descriptor = "I")
    public static int field10059;

    @OriginalMember(owner = "client!rda", name = "Gi", descriptor = "I")
    public static int field10060;

    @OriginalMember(owner = "client!rda", name = "xh", descriptor = "I")
    public static int field10061;

    @OriginalMember(owner = "client!rda", name = "si", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!rda", name = "gi", descriptor = "I")
    public static int field10063;

    @OriginalMember(owner = "client!rda", name = "nh", descriptor = "I")
    public static int field10064;

    @OriginalMember(owner = "client!rda", name = "Ti", descriptor = "I")
    public static int field10065;

    @OriginalMember(owner = "client!rda", name = "Ii", descriptor = "I")
    public static int field10066;

    @OriginalMember(owner = "client!rda", name = "sh", descriptor = "I")
    public static int field10068;

    @OriginalMember(owner = "client!rda", name = "qh", descriptor = "I")
    public static int field10069;

    @OriginalMember(owner = "client!rda", name = "mh", descriptor = "I")
    public static int field10070;

    @OriginalMember(owner = "client!rda", name = "vi", descriptor = "I")
    public static int field10072;

    @OriginalMember(owner = "client!rda", name = "bi", descriptor = "I")
    public static int field10074;

    @OriginalMember(owner = "client!rda", name = "Ai", descriptor = "I")
    public static int field10075;

    @OriginalMember(owner = "client!rda", name = "dh", descriptor = "I")
    public static int field10076;

    @OriginalMember(owner = "client!rda", name = "Ph", descriptor = "I")
    public static int field10077;

    @OriginalMember(owner = "client!rda", name = "Ri", descriptor = "I")
    public static int field10078;

    @OriginalMember(owner = "client!rda", name = "Lg", descriptor = "I")
    public static int field10079;

    @OriginalMember(owner = "client!rda", name = "Zg", descriptor = "I")
    public static int field10080;

    @OriginalMember(owner = "client!rda", name = "Kg", descriptor = "I")
    public static int field10081;

    @OriginalMember(owner = "client!rda", name = "Rh", descriptor = "I")
    public static int field10082;

    @OriginalMember(owner = "client!rda", name = "lh", descriptor = "I")
    public static int field10083;

    @OriginalMember(owner = "client!rda", name = "Yh", descriptor = "I")
    public static int field10084;

    @OriginalMember(owner = "client!rda", name = "Mg", descriptor = "I")
    public static int field10086;

    @OriginalMember(owner = "client!rda", name = "yi", descriptor = "I")
    public static int field10087;

    @OriginalMember(owner = "client!rda", name = "Li", descriptor = "I")
    public static int field10088;

    @OriginalMember(owner = "client!rda", name = "wi", descriptor = "I")
    private int field10097;

    @OriginalMember(owner = "client!rda", name = "Qi", descriptor = "I")
    public static int field9994;

    @OriginalMember(owner = "client!rda", name = "Dh", descriptor = "I")
    public static int field9995;

    @OriginalMember(owner = "client!rda", name = "Tg", descriptor = "I")
    public static int field9996;

    @OriginalMember(owner = "client!rda", name = "kh", descriptor = "I")
    public static int field9998;

    @OriginalMember(owner = "client!rda", name = "Th", descriptor = "I")
    public static int field9999;

    @OriginalMember(owner = "client!rda", name = "Ki", descriptor = "J")
    private long field10099;

    @OriginalMember(owner = "client!rda", name = "yh", descriptor = "Log;")
    public static class674 field10023;

    @OriginalMember(owner = "client!rda", name = "ii", descriptor = "Z")
    private boolean field10092;

    @OriginalMember(owner = "client!rda", name = "fh", descriptor = "Z")
    private boolean field10093;

    @OriginalMember(owner = "client!rda", name = "pi", descriptor = "Z")
    private boolean field10095;

    @OriginalMember(owner = "client!rda", name = "ti", descriptor = "Z")
    private boolean field10096;

    @OriginalMember(owner = "client!rda", name = "wh", descriptor = "Z")
    private boolean field10098;

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "(B)V")
    public final void method887(byte arg0) {
        try {
            if (arg0 != 61) {
                this.method547();
            }
            OpenGL.glDepthMask(super.field4650 && super.field4651);
            ++field10012;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "()V")
    public final void method591() {
        try {
            ++field10031;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10114[104] + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(B)V")
    public final void method898(byte arg0) {
        try {
            ++field10041;
            if (class634.field9242 != super.field4646) {
                if (class57.field614 == super.field4646) {
                    OpenGL.glBlendFunc(1, 1);
                } else if (class203.field3152 == super.field4646) {
                    OpenGL.glBlendFunc(774, 1);
                }
            } else {
                OpenGL.glBlendFunc(770, 771);
            }
            if (arg0 >= -54) {
                this.field10108 = false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[81] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IJ)V")
    public final synchronized void method5052(int arg0, long arg1) {
        try {
            ++field10062;
            class206 var4 = new class206();
            var4.field3177 = arg1;
            this.field10091.method3868(-99, var4);
            if (arg0 != -11984) {
                this.field10109 = true;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10114[79] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "H", descriptor = "(I)V")
    public final void method883(int arg0) {
        try {
            if (arg0 != -32171) {
                this.method865((byte) 20);
            }
            OpenGL.glTexEnvi(8960, 34162, class642.method4702(super.field4556[super.field4587], -8491));
            ++field10061;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(II)V")
    public final void method513(int arg0, int arg1) throws class382 {
        try {
            ++field10080;
            this.field10003.swapBuffers();
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[43] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "()V")
    public final void method470() {
        try {
            super.method470();
            ++field10044;
            if (this.field10003 != null) {
                this.field10003.method4778();
                this.field10003.release();
                this.field10003 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10114[70] + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZLgn;)V")
    public final void method868(boolean arg0, class728 arg1) {
        try {
            ++field10081;
            class240[] var3 = ((class549) arg1).field8192;
            int var4 = 0;
            boolean var5 = arg0;
            boolean var6 = false;
            boolean var7 = false;
            for (int var8 = 0; ~var3.length < ~var8; ++var8) {
                class240 var9 = var3[var8];
                class458 var10 = this.field10100[var8];
                int var11 = 0;
                int var12 = var10.method3494(-101);
                long var13 = var10.method15((byte) -112);
                var10.method21(35040);
                for (int var15 = 0; ~var15 > ~var9.method2054(15); ++var15) {
                    class778 var16 = var9.method2057(var15, 255);
                    if (class778.field11295 != var16) {
                        if (class778.field11300 != var16) {
                            if (class778.field11302 != var16) {
                                if (class778.field11303 != var16) {
                                    if (class778.field11304 != var16) {
                                        if (class778.field11305 != var16) {
                                            if (class778.field11306 == var16) {
                                                OpenGL.glClientActiveTexture(33984 - -(var4++));
                                                OpenGL.glTexCoordPointer(4, 5126, var12, var13 - -((long) var11));
                                            }
                                        } else {
                                            OpenGL.glClientActiveTexture(33984 - -(var4++));
                                            OpenGL.glTexCoordPointer(3, 5126, var12, (long) var11 + var13);
                                        }
                                    } else {
                                        OpenGL.glClientActiveTexture(var4++ + 33984);
                                        OpenGL.glTexCoordPointer(2, 5126, var12, var13 - -((long) var11));
                                    }
                                } else {
                                    OpenGL.glClientActiveTexture(33984 + var4++);
                                    OpenGL.glTexCoordPointer(1, 5126, var12, var13 - -((long) var11));
                                }
                            } else {
                                OpenGL.glColorPointer(4, 5121, var12, (long) var11 + var13);
                                var5 = true;
                            }
                        } else {
                            var6 = true;
                            OpenGL.glNormalPointer(5126, var12, var13 - -((long) var11));
                        }
                    } else {
                        var7 = true;
                        OpenGL.glVertexPointer(3, 5126, var12, (long) var11 + var13);
                    }
                    var11 += var16.field11294;
                }
            }
            if (!this.field10096 != !var7) {
                if (var7) {
                    OpenGL.glEnableClientState(32884);
                } else {
                    OpenGL.glDisableClientState(32884);
                }
                this.field10096 = var7;
            }
            if (var6 == !this.field10093) {
                if (!var6) {
                    OpenGL.glDisableClientState(32885);
                } else {
                    OpenGL.glEnableClientState(32885);
                }
                this.field10093 = var6;
            }
            if (!this.field10092 == var5) {
                if (var5) {
                    OpenGL.glEnableClientState(32886);
                } else {
                    OpenGL.glDisableClientState(32886);
                }
                this.field10092 = var5;
            }
            if (~var4 < ~this.field10097) {
                for (int var17 = this.field10097; var4 > var17; ++var17) {
                    OpenGL.glClientActiveTexture(var17 + 33984);
                    OpenGL.glEnableClientState(32888);
                }
                this.field10097 = var4;
            } else if (var4 < this.field10097) {
                for (int var18 = var4; this.field10097 > var18; ++var18) {
                    OpenGL.glClientActiveTexture(var18 + 33984);
                    OpenGL.glDisableClientState(32888);
                }
                this.field10097 = var4;
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field10114[101] + arg0 + ',' + (arg1 != null ? field10114[1] : field10114[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "M", descriptor = "(I)V")
    public final void method858(int arg0) {
        try {
            class651.field9420[1] = (float) class291.method2359(65280, super.field4581) / 65280.0F;
            ++field10070;
            class651.field9420[3] = (float) (super.field4581 >>> 24) / 255.0F;
            class651.field9420[2] = (float) class291.method2359(255, super.field4581) / 255.0F;
            if (arg0 > -40) {
                this.field10089 = null;
            }
            class651.field9420[0] = (float) class291.method2359(16711680, super.field4581) / 1.671168E7F;
            OpenGL.glTexEnvfv(8960, 8705, class651.field9420, 0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[106] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "J", descriptor = "(I)V")
    public final void method870(int arg0) {
        try {
            ++field10011;
            super.field4600 = (float) (super.field4610 - super.field4567);
            super.field4605 = super.field4600 - (float) super.field4608;
            if (super.field4605 < (float) super.field4636) {
                super.field4605 = (float) super.field4636;
            }
            OpenGL.glFogf(2915, super.field4605);
            OpenGL.glFogf(2916, super.field4600);
            if (arg0 != -1) {
                this.method894((Canvas) null, (Object) null, 120);
            }
            class651.field9420[2] = (float) class291.method2359(super.field4590, 255) / 255.0F;
            class651.field9420[1] = (float) class291.method2359(65280, super.field4590) / 65280.0F;
            class651.field9420[0] = (float) class291.method2359(16711680, super.field4590) / 1.671168E7F;
            OpenGL.glFogfv(2918, class651.field9420, 0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[72] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(B)V")
    public final void method891(byte arg0) {
        try {
            class651.field9420[0] = super.field4601 * super.field4555;
            class651.field9420[2] = super.field4633 * super.field4601;
            class651.field9420[1] = super.field4627 * super.field4601;
            ++field10058;
            if (arg0 != 105) {
                this.method554(true);
            }
            class651.field9420[3] = 1.0F;
            OpenGL.glLightModelfv(2899, class651.field9420, 0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[49] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "(Z)V")
    public final void method906(boolean arg0) {
        try {
            if (!arg0) {
                if (!super.field4580) {
                    OpenGL.glDisable(2929);
                } else {
                    OpenGL.glEnable(2929);
                }
                ++field10065;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[37] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "(II)V")
    public final synchronized void method5053(int arg0, int arg1) {
        try {
            ++field10016;
            if (arg0 == 0) {
                class206 var3 = new class206();
                var3.field3177 = (long) arg1;
                this.field10090.method3868(-54, var3);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10114[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
    public final synchronized void method498(int arg0) {
        try {
            ++field10010;
            int var14 = arg0 & Integer.MAX_VALUE;
            int var2 = 0;
            while (!this.field10067.method3873(125)) {
                class609 var3 = (class609) this.field10067.method3875(-123);
                class156.field1922[var2++] = (int) var3.field3177;
                super.field4543 -= var3.field8902;
                if (var2 == 1000) {
                    OpenGL.glDeleteBuffersARB(var2, class156.field1922, 0);
                    var2 = 0;
                }
            }
            if (~var2 < -1) {
                OpenGL.glDeleteBuffersARB(var2, class156.field1922, 0);
                var2 = 0;
            }
            while (!this.field10073.method3873(-128)) {
                class609 var4 = (class609) this.field10073.method3875(-122);
                class156.field1922[var2++] = (int) var4.field3177;
                super.field4545 -= var4.field8902;
                if (var2 == 1000) {
                    OpenGL.glDeleteTextures(var2, class156.field1922, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteTextures(var2, class156.field1922, 0);
                var2 = 0;
            }
            while (!this.field10085.method3873(-128)) {
                class609 var5 = (class609) this.field10085.method3875(-104);
                class156.field1922[var2++] = var5.field8902;
                if (~var2 == -1001) {
                    OpenGL.glDeleteFramebuffersEXT(var2, class156.field1922, 0);
                    var2 = 0;
                }
            }
            if (~var2 < -1) {
                OpenGL.glDeleteFramebuffersEXT(var2, class156.field1922, 0);
                var2 = 0;
            }
            while (!this.field10089.method3873(-118)) {
                class609 var6 = (class609) this.field10089.method3875(-118);
                class156.field1922[var2++] = (int) var6.field3177;
                super.field4546 -= var6.field8902;
                if (var2 == 1000) {
                    OpenGL.glDeleteRenderbuffersEXT(var2, class156.field1922, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class156.field1922, 0);
                boolean var7 = false;
            }
            while (!this.field9997.method3873(10)) {
                class609 var8 = (class609) this.field9997.method3875(108);
                OpenGL.glDeleteLists((int) var8.field3177, var8.field8902);
            }
            while (!this.field10090.method3873(-118)) {
                class206 var9 = this.field10090.method3875(-91);
                OpenGL.glDeleteProgramARB((int) var9.field3177);
            }
            while (!this.field10091.method3873(51)) {
                class206 var10 = this.field10091.method3875(-66);
                OpenGL.glDeleteObjectARB(var10.field3177);
            }
            while (!this.field9997.method3873(-125)) {
                class609 var11 = (class609) this.field9997.method3875(84);
                OpenGL.glDeleteLists((int) var11.field3177, var11.field8902);
            }
            if (this.method494() > 100663296 && ~class430.method3299(116) < ~(this.field10099 + 60000L)) {
                System.gc();
                this.field10099 = class430.method3299(119);
            }
            super.method498(var14);
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field10114[103] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "GA", descriptor = "(I)V")
    public final void method483(int arg0) {
        try {
            OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
            ++field9994;
            OpenGL.glClear(16384);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[93] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILsfa;Z)V")
    public final void method856(int arg0, class723 arg1, boolean arg2) {
        try {
            if (!arg2) {
                field10018 = null;
            }
            this.field10100[arg0] = (class458) arg1;
            ++field10014;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10114[23] + arg0 + ',' + (arg1 != null ? field10114[1] : field10114[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "(B)V")
    public final void method845(byte arg0) {
        try {
            ++field9998;
            OpenGL.glLightfv(16384, 4611, super.field4577, 0);
            int var2 = 64 % ((61 - arg0) / 62);
            OpenGL.glLightfv(16385, 4611, super.field4598, 0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[107] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(Z)V")
    public final void method893(boolean arg0) {
        try {
            this.method5057(82);
            if (!arg0) {
                ++field10068;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[26] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljh;I)V")
    public final void method897(class169 arg0, int arg1) {
        try {
            ++field10079;
            if (arg1 != 0) {
                this.field10107 = false;
            }
            if (class194.field2608 != arg0) {
                int var3 = class548.method4134(arg0, 9216);
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
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10114[24] + (arg0 != null ? field10114[1] : field10114[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(IZ)Lje;")
    public final class421 method899(int arg0, boolean arg1) {
        try {
            ++field10002;
            if (arg0 != 13) {
                this.method547();
            }
            return new class480(this, class157.field1953, arg1);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[97] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "(Z)V")
    public final void method853(boolean arg0) {
        try {
            ++field10069;
            for (int var2 = super.field4593 + -1; ~var2 <= -1; --var2) {
                OpenGL.glActiveTexture(33984 - -var2);
                OpenGL.glTexEnvi(8960, 8704, 34160);
                OpenGL.glTexEnvi(8960, 34161, 8448);
                OpenGL.glTexEnvi(8960, 34178, 34166);
                OpenGL.glTexEnvi(8960, 34162, 8448);
                OpenGL.glTexEnvi(8960, 34186, 34166);
            }
            OpenGL.glTexEnvi(8960, 34186, 34168);
            if (!arg0) {
                field10023 = null;
            }
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
                int var5 = 16384 - -var4;
                OpenGL.glLightfv(var5, 4608, var3, 0);
                OpenGL.glLightf(var5, 4615, 0.0F);
                OpenGL.glLightf(var5, 4616, 0.0F);
            }
            OpenGL.glFogf(2914, 0.95F);
            OpenGL.glFogi(2917, 9729);
            OpenGL.glHint(3156, 4353);
            this.field10003.setSwapInterval(0);
            super.method853(arg0);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10114[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "ya", descriptor = "()V")
    public final void method586() {
        try {
            ++field10049;
            this.method2473((byte) -123, true);
            OpenGL.glClear(256);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10114[105] + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "T", descriptor = "(I)V")
    public static void method5054(int arg0) {
        try {
            if (arg0 != 32) {
                field10018 = null;
            }
            field10018 = null;
            field10023 = null;
            field10001 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10114[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZIII[III)Lwp;")
    public final class191 method890(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        try {
            ++field10007;
            if (arg5 <= 9) {
                this.field10103 = null;
            }
            if (this.field10113 || class40.method269(arg3, 123) && class40.method269(arg6, 95)) {
                return new class88(this, arg3, arg6, arg0, arg4, arg1, arg2);
            } else if (!this.field10107) {
                class88 var8 = new class88(this, class215.field3276, class157.field1952, class12.method83((byte) -1, arg3), class12.method83((byte) -1, arg6));
                var8.method746(arg4, arg1, (byte) -110, arg2, 0, 0, arg3, arg6);
                return var8;
            } else {
                return new class710(this, arg3, arg6, arg4, arg1, arg2);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field10114[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10114[1] : field10114[0]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lrt;IIZ)V")
    public final void method844(class239 arg0, int arg1, int arg2, boolean arg3) {
        try {
            if (arg2 != 0) {
                this.field10003 = null;
            }
            ++field10088;
            OpenGL.glTexEnvi(8960, arg1 + 34184, class599.method4453(arg0, true));
            OpenGL.glTexEnvi(8960, arg1 + 34200, arg3 ? 771 : 770);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10114[6] + (arg0 != null ? field10114[1] : field10114[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "(Z)V")
    public final void method851(boolean arg0) {
        try {
            if (arg0) {
                if (!super.field4554) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                ++field10030;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[100] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lla;I)V")
    public class690(OpenGL arg0, Canvas arg1, long arg2, class160 arg3, class476 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            try {
                this.field10003 = arg0;
                this.field10003.method4776();
                this.field10104 = OpenGL.glGetString(7936).toLowerCase();
                this.field10106 = OpenGL.glGetString(7937).toLowerCase();
                if (~this.field10104.indexOf(field10114[53]) == 0 && this.field10104.indexOf(field10114[51]) == -1 && ~this.field10104.indexOf(field10114[57]) == 0) {
                    String var8 = OpenGL.glGetString(7938);
                    String[] var9 = class350.method2878(var8.replace('.', ' '), ' ', (byte) 97);
                    if (~var9.length <= -3) {
                        try {
                            int var10 = class244.method2078(-7431, var9[0]);
                            int var11 = class244.method2078(-7431, var9[1]);
                            this.field10102 = var10 * 10 + var11;
                        } catch (NumberFormatException var23) {
                            throw new RuntimeException("");
                        }
                        if (~this.field10102 > -13) {
                            throw new RuntimeException("");
                        } else if (!this.field10003.method4777(field10114[69])) {
                            throw new RuntimeException("");
                        } else if (!this.field10003.method4777(field10114[60])) {
                            throw new RuntimeException("");
                        } else {
                            int[] var12 = new int[1];
                            OpenGL.glGetIntegerv(34018, var12, 0);
                            super.field4593 = var12[0];
                            if (super.field4593 < 2) {
                                throw new RuntimeException("");
                            } else {
                                super.field4586 = 8;
                                this.field10110 = this.field10003.method4777(field10114[61]);
                                super.field4632 = this.field10003.method4777(field10114[68]);
                                this.field10107 = this.field10003.method4777(field10114[66]);
                                super.field4640 = this.field10003.method4777(field10114[52]);
                                this.field10113 = this.field10003.method4777(field10114[54]);
                                super.field4592 = this.field10003.method4777(field10114[59]);
                                this.field10109 = this.field10003.method4777(field10114[63]);
                                this.field10108 = this.field10003.method4777(field10114[55]);
                                this.field10111 = this.field10003.method4777(field10114[67]);
                                this.field10003.method4777(field10114[64]);
                                this.field10103 = new int[super.field4593];
                                this.field10112 = Stream.method5102() ? 33639 : 5121;
                                if (this.field10106.indexOf(field10114[56]) != -1) {
                                    int var13 = 0;
                                    boolean var14 = false;
                                    boolean var15 = false;
                                    String[] var16 = class350.method2878(this.field10106.replace('/', ' '), ' ', (byte) 92);
                                    for (int var17 = 0; var17 < var16.length; ++var17) {
                                        String var18 = var16[var17];
                                        try {
                                            if (var18.length() > 0) {
                                                if (var18.charAt(0) == 'x' && var18.length() >= 3 && client.method2681(true, var18.substring(1, 3))) {
                                                    var15 = true;
                                                    var18 = var18.substring(1);
                                                }
                                                if (var18.equals(field10114[58])) {
                                                    var14 = true;
                                                } else {
                                                    if (var18.startsWith(field10114[58])) {
                                                        var18 = var18.substring(2);
                                                        var14 = true;
                                                    }
                                                    if (var18.length() >= 4 && client.method2681(true, var18.substring(0, 4))) {
                                                        var13 = class244.method2078(-7431, var18.substring(0, 4));
                                                        break;
                                                    }
                                                }
                                            }
                                        } catch (Exception var24) {
                                        }
                                    }
                                    if (!var15 && !var14) {
                                        if (var13 >= 7000 && var13 <= 9250) {
                                            super.field4592 = false;
                                        }
                                        if (var13 >= 7000 && ~var13 >= -8000) {
                                            this.field10110 = false;
                                        }
                                    }
                                    this.field10107 &= this.field10003.method4777(field10114[65]);
                                }
                                this.field10104.indexOf(field10114[28]);
                                if (this.field10110) {
                                    try {
                                        int[] var19 = new int[1];
                                        OpenGL.glGenBuffersARB(1, var19, 0);
                                    } catch (Throwable var22) {
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
            } catch (Throwable var25) {
                var25.printStackTrace();
                this.method579((byte) -21);
                throw new RuntimeException("");
            }
        } catch (RuntimeException var26) {
            throw class759.method5498(var26, field10114[62] + (arg0 != null ? field10114[1] : field10114[0]) + ',' + (arg1 != null ? field10114[1] : field10114[0]) + ',' + arg2 + ',' + (arg3 != null ? field10114[1] : field10114[0]) + ',' + (arg4 != null ? field10114[1] : field10114[0]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "(I)V")
    public final void method852(int arg0) {
        try {
            ++field10078;
            if (arg0 >= -91) {
                this.method858(88);
            }
            if (!super.field4572) {
                OpenGL.glDisable(16384);
                OpenGL.glDisable(16385);
            } else {
                OpenGL.glEnable(16384);
                OpenGL.glEnable(16385);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[45] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZB)V")
    public final void method869(boolean arg0, byte arg1) {
        try {
            if (arg1 >= -49) {
                this.method850(false, 67);
            }
            if (arg0) {
                OpenGL.glEnable(32925);
            } else {
                OpenGL.glDisable(32925);
            }
            ++field10015;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[42] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(IIIID)V")
    public final void method582(int arg0, int arg1, int arg2, int arg3, double arg4) {
        try {
            ++field10076;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10114[84] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method875(int arg0, Canvas arg1) {
        try {
            ++field10026;
            if (arg0 != -1) {
                this.field10098 = false;
            }
            long var3 = this.field10003.prepareSurface(arg1);
            if (~var3 == 0L) {
                throw new RuntimeException();
            } else {
                return new Long(var3);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10114[13] + arg0 + ',' + (arg1 != null ? field10114[1] : field10114[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIII)V")
    public final void method550(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field10084;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10114[75] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "E", descriptor = "(B)F")
    public final float method885(byte arg0) {
        try {
            if (arg0 >= -77) {
                return 1.8177661F;
            } else {
                ++field10059;
                return 0.0F;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[86] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[BIILeu;)Loea;")
    public final class623 method867(int arg0, int arg1, byte[] arg2, int arg3, int arg4, class505 arg5) {
        try {
            ++field10005;
            if (arg0 != 6) {
                this.method850(true, 25);
            }
            return new class95(this, arg5, arg4, arg3, arg1, arg2);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10114[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10114[1] : field10114[0]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10114[1] : field10114[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "(Z)V")
    public final void method857(boolean arg0) {
        try {
            if (super.field4612) {
                OpenGL.glEnable(3042);
            } else {
                OpenGL.glDisable(3042);
            }
            ++field10032;
            if (!arg0) {
                this.method498(50);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[83] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
    public final void method894(Canvas arg0, Object arg1, int arg2) {
        try {
            ++field10066;
            if (arg2 != 0) {
                this.field10112 = 121;
            }
            Long var4 = (Long) arg1;
            if (!this.field10003.setSurface(var4)) {
                throw new RuntimeException();
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10114[2] + (arg0 != null ? field10114[1] : field10114[0]) + ',' + (arg1 != null ? field10114[1] : field10114[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(FFF)V")
    public final void method497(float arg0, float arg1, float arg2) {
        try {
            ++field10019;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10114[40] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "()V")
    public final void method575() {
        try {
            ++field10039;
            if (~super.field4492 < -1 || ~super.field4416 < -1) {
                int var1 = super.field4624;
                int var2 = super.field4630;
                int var3 = super.field4578;
                int var4 = super.field4561;
                this.method553();
                OpenGL.glReadBuffer(1028);
                OpenGL.glDrawBuffer(1029);
                this.method2438((byte) 25);
                this.method2445(8, false);
                this.method2472((byte) 24, false);
                this.method2449(false, true);
                this.method2473((byte) -108, false);
                this.method2467(12, (class479) null);
                this.method2477(0, false, -2, false);
                this.method2433(-16075, 1);
                this.method2457(0, (byte) -103);
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                OpenGL.glRasterPos2i(0, 0);
                OpenGL.glCopyPixels(0, 0, super.field4492, super.field4416, 6144);
                OpenGL.glFlush();
                OpenGL.glReadBuffer(1029);
                OpenGL.glDrawBuffer(1029);
                this.method489(var1, var3, var2, var4);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10114[108] + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "Q", descriptor = "(I)V")
    public final void method888(int arg0) {
        try {
            class651.field9420[3] = 1.0F;
            int var2 = 51 % ((-58 - arg0) / 47);
            ++field10083;
            class651.field9420[1] = super.field4627 * super.field4611;
            class651.field9420[0] = super.field4611 * super.field4555;
            class651.field9420[2] = super.field4633 * super.field4611;
            OpenGL.glLightfv(16384, 4609, class651.field9420, 0);
            class651.field9420[0] = -super.field4559 * super.field4555;
            class651.field9420[1] = -super.field4559 * super.field4627;
            class651.field9420[3] = 1.0F;
            class651.field9420[2] = -super.field4559 * super.field4633;
            OpenGL.glLightfv(16385, 4609, class651.field9420, 0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[98] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(ZI)Lsfa;")
    public final class723 method850(boolean arg0, int arg1) {
        try {
            if (arg1 != 0) {
                this.field10095 = false;
            }
            ++field10046;
            return new class458(this, arg0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[92] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "()V")
    public final void method484() {
        try {
            ++field10013;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10114[90] + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "(I)V")
    public final void method905(int arg0) {
        try {
            if (arg0 < 46) {
                field9995 = -62;
            }
            ++field10035;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZIIIILeu;[BI)Lwp;")
    public final class191 method847(boolean arg0, int arg1, int arg2, int arg3, int arg4, class505 arg5, byte[] arg6, int arg7) {
        try {
            ++field10028;
            if (arg3 != -1) {
                return null;
            } else if (this.field10113 || class40.method269(arg7, 113) && class40.method269(arg1, arg3 ^ -124)) {
                return new class88(this, arg5, arg7, arg1, arg0, arg6, arg4, arg2);
            } else if (!this.field10107) {
                class88 var9 = new class88(this, arg5, class157.field1952, class12.method83((byte) -1, arg7), class12.method83((byte) -1, arg1));
                var9.method742(arg2, arg6, arg1, arg7, 0, 0, 9588, arg5, arg4);
                return var9;
            } else {
                return new class710(this, arg5, arg7, arg1, arg6, arg4, arg2);
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10114[71] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10114[1] : field10114[0]) + ',' + (arg6 != null ? field10114[1] : field10114[0]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "(Z)V")
    public final void method882(boolean arg0) {
        try {
            ++field10009;
            if (arg0) {
                this.method591();
            }
            if (!super.field4675) {
                OpenGL.glDisable(3089);
            } else {
                OpenGL.glEnable(3089);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)V")
    public final void method902(int arg0) {
        try {
            if (arg0 != 27477) {
                this.field10092 = true;
            }
            ++field10051;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(super.field4619, 0);
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "(B)V")
    public final void method849(byte arg0) {
        try {
            OpenGL.glScissor(super.field4596 - -super.field4624, super.field4647 + super.field4416 + -super.field4561, -super.field4624 + super.field4630, -super.field4578 + super.field4561);
            if (arg0 != -39) {
                this.field10108 = true;
            }
            ++field10063;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)V")
    public final synchronized void method5055(byte arg0, int arg1, int arg2) {
        try {
            ++field10047;
            class609 var4 = new class609(arg1);
            var4.field3177 = (long) arg2;
            this.field10073.method3868(94, var4);
            int var5 = -9 / ((arg0 - 51) / 40);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10114[109] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "()V")
    public final void method473() {
        try {
            OpenGL.glFinish();
            ++field10087;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10114[94] + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "(B)V")
    public final void method865(byte arg0) {
        try {
            OpenGL.glActiveTexture(33984 - -super.field4587);
            if (arg0 < 11) {
                this.field10089 = null;
            }
            ++field10034;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lgea;)V")
    public final void method592(class82 arg0) {
        try {
            ++field10040;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[82] + (arg0 != null ? field10114[1] : field10114[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "()Lmi;")
    public final class521 method493() {
        try {
            ++field10042;
            int var1 = -1;
            if (this.field10104.indexOf(field10114[32]) == -1) {
                if (~this.field10104.indexOf(field10114[28]) != 0) {
                    var1 = 32902;
                } else if (~this.field10104.indexOf(field10114[30]) != 0) {
                    var1 = 4098;
                }
            } else {
                var1 = 4318;
            }
            return new class521(var1, field10114[31], this.field10102, this.field10106, 0L);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[29] + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lpj;Leu;I)Z")
    public final boolean method855(class157 arg0, class505 arg1, int arg2) {
        try {
            if (arg2 != -331365768) {
                this.method875(-76, (Canvas) null);
            }
            ++field10043;
            return true;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10114[19] + (arg0 != null ? field10114[1] : field10114[0]) + ',' + (arg1 != null ? field10114[1] : field10114[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILje;IILdea;IB)V")
    public final void method877(int arg0, class421 arg1, int arg2, int arg3, class259 arg4, int arg5, byte arg6) {
        try {
            ++field10082;
            int var8;
            byte var9;
            if (class313.field4962 == arg4) {
                var8 = arg5 * 2;
                var9 = 1;
            } else if (class750.field10911 != arg4) {
                if (class769.field11134 == arg4) {
                    var9 = 4;
                    var8 = arg5 * 3;
                } else if (class242.field3692 == arg4) {
                    var9 = 6;
                    var8 = arg5 + 2;
                } else if (class622.field9114 != arg4) {
                    var9 = 0;
                    var8 = arg5;
                } else {
                    var9 = 5;
                    var8 = arg5 + 2;
                }
            } else {
                var8 = arg5 + 1;
                var9 = 3;
            }
            if (arg6 > -43) {
                this.method858(100);
            }
            class157 var10 = arg1.method3258(-31745);
            class480 var11 = (class480) arg1;
            var11.method21(35040);
            OpenGL.glDrawElements(var9, var8, class694.method5071(var10, -86), var11.method15((byte) -119) - -((long) (var10.field1946 * arg3)));
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field10114[77] + arg0 + ',' + (arg1 != null ? field10114[1] : field10114[0]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10114[1] : field10114[0]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method881(int arg0, Canvas arg1, Object arg2) {
        try {
            if (arg0 != 16) {
                this.method897((class169) null, -37);
            }
            ++field10074;
            Long var4 = (Long) arg2;
            this.field10003.surfaceResized(var4);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10114[87] + arg0 + ',' + (arg1 != null ? field10114[1] : field10114[0]) + ',' + (arg2 != null ? field10114[1] : field10114[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(III)V")
    public final synchronized void method5056(int arg0, int arg1, int arg2) {
        try {
            if (arg2 == -1) {
                ++field10025;
                class609 var4 = new class609(arg1);
                var4.field3177 = (long) arg0;
                this.field10067.method3868(-114, var4);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10114[80] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(II)Lnq;")
    public final class485 method478(int arg0, int arg1) {
        try {
            ++field10027;
            return null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[46] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "B", descriptor = "(B)V")
    public final void method860(byte arg0) {
        try {
            this.method2495(4);
            ++field10053;
            int var2;
            for (var2 = 0; var2 < super.field4631; ++var2) {
                class471 var3 = super.field4560[var2];
                int var4 = var3.method3578(arg0 + 198);
                int var5 = 16386 - -var2;
                float var6 = var3.method3576((byte) -115) / 255.0F;
                class651.field9420[0] = (float) var3.method3577(-32630);
                class651.field9420[1] = (float) var3.method3581(-114);
                class651.field9420[2] = (float) var3.method3580((byte) 62);
                class651.field9420[3] = 1.0F;
                OpenGL.glLightfv(var5, 4611, class651.field9420, 0);
                class651.field9420[3] = 1.0F;
                class651.field9420[0] = (float) class291.method2359(var4 >> 16, 255) * var6;
                class651.field9420[2] = (float) class291.method2359(255, var4) * var6;
                class651.field9420[1] = (float) class291.method2359(255, var4 >> 8) * var6;
                OpenGL.glLightfv(var5, 4609, class651.field9420, 0);
                OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method3579((byte) 127) * var3.method3579((byte) 125)));
                OpenGL.glEnable(var5);
            }
            while (~super.field4615 < ~var2) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            super.method860(arg0);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10114[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "D", descriptor = "(I)V")
    private final void method5057(int arg0) {
        try {
            if (this.field10095) {
                OpenGL.glPopMatrix();
            }
            ++field10036;
            if (arg0 <= 52) {
                this.method857(true);
            }
            if (super.field4564.method1195((byte) -100)) {
                if (!this.field10098) {
                    OpenGL.glLoadMatrixf(super.field4549.method5555(class356.field5475, 96), 0);
                    this.field10098 = true;
                    this.method845((byte) 124);
                    this.method860((byte) -128);
                }
                if (super.field4540) {
                    this.field10095 = false;
                } else {
                    OpenGL.glPushMatrix();
                    OpenGL.glMultMatrixf(super.field4541.method5555(class356.field5475, 119), 0);
                    this.field10095 = true;
                }
            } else if (super.field4540) {
                OpenGL.glLoadIdentity();
                this.field10095 = false;
            } else {
                OpenGL.glLoadMatrixf(super.field4541.method5555(class356.field5475, 95), 0);
                this.field10095 = false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[85] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "(I)V")
    public final void method878(int arg0) {
        try {
            if (arg0 == -32266) {
                ++field10048;
                int var2 = this.field10103[super.field4587];
                if (~var2 != -1) {
                    this.field10103[super.field4587] = 0;
                    OpenGL.glBindTexture(var2, 0);
                    OpenGL.glDisable(var2);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[44] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Leu;BLpj;)Z")
    public final boolean method861(class505 arg0, byte arg1, class157 arg2) {
        try {
            if (arg1 != 91) {
                this.field10096 = false;
            }
            ++field10064;
            return true;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10114[74] + (arg0 != null ? field10114[1] : field10114[0]) + ',' + arg1 + ',' + (arg2 != null ? field10114[1] : field10114[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "(II)V")
    public final void method843(int arg0, int arg1) {
        try {
            ++field10072;
            if (arg0 != -3535) {
                this.method862((byte) -128);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[91] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lol;Lol;FLol;)Lol;")
    public final class299 method485(class299 arg0, class299 arg1, float arg2, class299 arg3) {
        try {
            ++field10029;
            return arg2 < 0.5F ? arg0 : arg1;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10114[25] + (arg0 != null ? field10114[1] : field10114[0]) + ',' + (arg1 != null ? field10114[1] : field10114[0]) + ',' + arg2 + ',' + (arg3 != null ? field10114[1] : field10114[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)V")
    public final void method554(boolean arg0) {
        try {
            ++field10052;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[99] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "y", descriptor = "()Z")
    public final boolean method566() {
        try {
            ++field10057;
            return false;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10114[39] + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "()V")
    public final void method501() {
        try {
            ++field10075;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10114[76] + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "(B)V")
    public final void method895(byte arg0) {
        try {
            if (arg0 != 84) {
                this.field10099 = 115L;
            }
            if (super.field4628 && !super.field4621) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
            ++field10054;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[95] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "([Laia;B)Lgn;")
    public final class728 method873(class240[] arg0, byte arg1) {
        try {
            ++field10017;
            if (arg1 <= 40) {
                this.field10100 = null;
            }
            return new class549(arg0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[33] + (arg0 != null ? field10114[1] : field10114[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method504(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class382 {
        try {
            this.method513(arg2, arg3);
            ++field10045;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10114[16] + (arg0 != null ? field10114[1] : field10114[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "F", descriptor = "(II)V")
    public final void method549(int arg0, int arg1) {
        try {
            ++field10008;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[102] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZII[FLeu;III)Lwp;")
    public final class191 method842(boolean arg0, int arg1, int arg2, float[] arg3, class505 arg4, int arg5, int arg6, int arg7) {
        try {
            if (arg1 <= 24) {
                this.field10103 = null;
            }
            ++field9996;
            if (!this.field10113 && (!class40.method269(arg6, 62) || !class40.method269(arg5, 124))) {
                if (this.field10107) {
                    return new class710(this, arg4, arg6, arg5, arg3, arg2, arg7);
                } else {
                    class88 var9 = new class88(this, arg4, class157.field1956, class12.method83((byte) -1, arg6), class12.method83((byte) -1, arg5));
                    var9.method741(arg2, arg6, arg3, 0, arg4, 0, 1, arg7, arg5);
                    return var9;
                }
            } else {
                return new class88(this, arg4, arg6, arg5, arg0, arg3, arg2, arg7);
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10114[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10114[1] : field10114[0]) + ',' + (arg4 != null ? field10114[1] : field10114[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZIZILrt;)V")
    public final void method889(boolean arg0, int arg1, boolean arg2, int arg3, class239 arg4) {
        try {
            ++field10000;
            OpenGL.glTexEnvi(8960, 34176 - -arg1, class599.method4453(arg4, true));
            if (!arg2) {
                OpenGL.glTexEnvi(8960, 34192 - -arg1, arg0 ? 769 : 768);
            } else {
                OpenGL.glTexEnvi(8960, arg1 + 34192, arg0 ? 771 : 770);
            }
            if (arg3 <= 97) {
                this.method843(22, 117);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10114[47] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10114[1] : field10114[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lnq;Lrk;)Lgea;")
    public final class82 method507(class485 arg0, class35 arg1) {
        try {
            ++field10038;
            return null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[34] + (arg0 != null ? field10114[1] : field10114[0]) + ',' + (arg1 != null ? field10114[1] : field10114[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLdea;II)V")
    public final void method892(byte arg0, class259 arg1, int arg2, int arg3) {
        try {
            ++field10056;
            int var5 = -13 % ((arg0 - -62) / 56);
            int var6;
            byte var7;
            if (class313.field4962 != arg1) {
                if (class750.field10911 == arg1) {
                    var6 = arg3 + 1;
                    var7 = 3;
                } else if (class769.field11134 != arg1) {
                    if (class242.field3692 == arg1) {
                        var7 = 6;
                        var6 = arg3 + 2;
                    } else if (class622.field9114 == arg1) {
                        var7 = 5;
                        var6 = arg3 + 2;
                    } else {
                        var6 = arg3;
                        var7 = 0;
                    }
                } else {
                    var6 = arg3 * 3;
                    var7 = 4;
                }
            } else {
                var6 = arg3 * 2;
                var7 = 1;
            }
            OpenGL.glDrawArrays(var7, arg2, var6);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field10114[89] + arg0 + ',' + (arg1 != null ? field10114[1] : field10114[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)Lrk;")
    public final class35 method486(int arg0, int arg1) {
        try {
            ++field10022;
            return null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[38] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "na", descriptor = "(IIII)[I")
    public final int[] method474(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field10006;
            int[] var5 = new int[arg2 * arg3];
            for (int var6 = 0; ~var6 > ~arg3; ++var6) {
                OpenGL.glReadPixelsi(arg0, -arg1 - 1 + -var6 + super.field4416, arg2, 1, 32993, this.field10112, var5, arg2 * var6);
            }
            return var5;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10114[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "()Z")
    public final boolean method547() {
        try {
            ++field9999;
            return false;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10114[88] + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "(B)V")
    public final void method862(byte arg0) {
        try {
            OpenGL.glTexEnvi(8960, 34161, class642.method4702(super.field4622[super.field4587], -8491));
            if (arg0 >= -67) {
                this.method881(60, (Canvas) null, (Object) null);
            }
            ++field10020;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[78] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "(B)V")
    public final void method903(byte arg0) {
        try {
            OpenGL.glViewport(super.field4596, super.field4647, super.field4492, super.field4416);
            int var2 = 77 / ((-44 - arg0) / 61);
            ++field10033;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[73] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(II)Loda;")
    public final class129 method841(int arg0, int arg1) {
        try {
            ++field10004;
            if (arg0 != -1) {
                return null;
            } else if (arg1 != 3) {
                if (arg1 != 4) {
                    return ~arg1 == -9 ? new class452(this, super.field4399, super.field4402) : super.method841(arg0, arg1);
                } else {
                    return new class361(this, super.field4399, super.field4402);
                }
            } else {
                return new class202(this, super.field4399);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10114[50] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "I", descriptor = "()I")
    public final int method546() {
        try {
            ++field10077;
            return this.field10105;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10114[41] + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public final void method884(Object arg0, int arg1, Canvas arg2) {
        try {
            ++field10050;
            if (arg1 != 4980) {
                this.field9997 = null;
            }
            Long var4 = (Long) arg0;
            this.field10003.releaseSurface(arg2, var4);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10114[36] + (arg0 != null ? field10114[1] : field10114[0]) + ',' + arg1 + ',' + (arg2 != null ? field10114[1] : field10114[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILeu;ILpj;I)Lwp;")
    public final class191 method866(int arg0, class505 arg1, int arg2, class157 arg3, int arg4) {
        try {
            ++field10086;
            if (arg4 != 0) {
                this.field10101 = null;
            }
            if (this.field10113 || class40.method269(arg0, arg4 ^ 81) && class40.method269(arg2, 90)) {
                return new class88(this, arg1, arg3, arg0, arg2);
            } else {
                return !this.field10107 ? new class88(this, arg1, arg3, class12.method83((byte) -1, arg0), class12.method83((byte) -1, arg2)) : new class710(this, arg1, arg3, arg0, arg2);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10114[27] + arg0 + ',' + (arg1 != null ? field10114[1] : field10114[0]) + ',' + arg2 + ',' + (arg3 != null ? field10114[1] : field10114[0]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)V")
    public final void method872(byte arg0) {
        try {
            ++field10021;
            OpenGL.glMatrixMode(5890);
            int var2 = 14 % ((-2 - arg0) / 39);
            if (super.field4642[super.field4587] != class341.field5303) {
                OpenGL.glLoadMatrixf(super.field4575[super.field4587].method5555(class356.field5475, 127), 0);
            } else {
                OpenGL.glLoadIdentity();
            }
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10114[48] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "([[IIZI)Lrr;")
    public final class380 method904(int[][] arg0, int arg1, boolean arg2, int arg3) {
        try {
            if (arg1 >= -103) {
                this.field9997 = null;
            }
            ++field10055;
            return new class108(this, arg3, arg2, arg0);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10114[5] + (arg0 != null ? field10114[1] : field10114[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "(Z)V")
    public final void method901(boolean arg0) {
        try {
            if (!arg0) {
                this.method897((class169) null, -122);
            }
            if (super.field4571 && super.field4563 && ~super.field4608 <= -1) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
            ++field10060;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[96] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "(B)V")
    public final void method876(byte arg0) {
        try {
            ++field10024;
            this.field10098 = false;
            this.method5057(72);
            if (arg0 < 119) {
                this.method893(true);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10114[35] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5058(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5059(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
