import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class349 extends class344 {

    @OriginalMember(owner = "client!js", name = "q", descriptor = "Z")
    private boolean field5654 = false;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "Z")
    private boolean field5652 = false;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "Lpia;")
    private class100 field5655;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "Lir;")
    private class25 field5646;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5657 = new String[] { method2913(method2912("\u0016\u0005\u001fo ")), method2913(method2912("\u0012\u0003]G")), method2913(method2912("\u0007X\u001f\u0005u")), method2913(method2912("\u0016\u0005\u001f\u0017a\u0012\u001fE\u0015 ")), method2913(method2912("\t\u0018XMg\u000e\u001b\u0011Md\u0013\u0017E\u000b|\u0015\u001bT\u0010\u0002\t\u0018XMg\u000e\u001b\u0011Md\u0013\u0017E\u000b{\u001f\u0017]N3v\u0000PYq\u0015\u0018V\u000b~\u0019\u0015\u0002\u000b\u007f\n TY|\u0019\u000e\n!~\u001d\u0004HBf\u001bVWGg\u001d\u0002\u0011\\i\b\u0013Com\f\u0002Y\u0010\u0002\n\u0019XO(\u0011\u0017XE UVJ!\u007f\u001d\u0002TYL\u0019\u0006EC(AVVGW1\u0003]_a(\u0013Ihg\u0013\u0004U\u001b&\u0006M;]m\u001fB\u0011Nk*\u0013C_m\u0004V\f\u000bo\u0010)|Dl\u0019\u001agBm\u000b;P_z\u0015\u000e\u001bLd# TY|\u0019\u000e\n!\u007f\n TY|\u0019\u000e\u001fS(AVUD|T\u0011]tF\u0013\u0004\\Jd1\u0017EYa\u0004-\u0001v$\\\u0013R}m\u000e\u0002TS&\u0004\u000fK\u00023v\u0001G}m\u000e\u0002TS&\u0005V\f\u000bl\u0013\u0002\u0019Ld#8^Ye\u001d\u001a|J|\u000e\u001fIp9!Z\u0011Nk*\u0013C_m\u0004XIRrUM;\\~*\u0013C_m\u0004XK\u000b5\\\u0012^_ \u001b\u001aneg\u000e\u001bPGE\u001d\u0002CBp'Dl\u0007(\u0019\u0015gNz\b\u0013I\u0005p\u0005\f\u0018\u0010\u0002\u001b\u001an\u007fm\u00045^Dz\u0018-\u0001v&\u0004V\f\u000bl\u0013\u0002\u0019Ld#\"TS|\t\u0004Tfi\b\u0004XSSL+j\u001bUPVVGW1\u0003]_a(\u0013Ihg\u0013\u0004U\u001b!V\u0005RJd\u0019M;Ld#\"TSK\u0013\u0019COSL+\u001fR(AVUD|T\u0011]t\\\u0019\u000eE^z\u0019;P_z\u0015\u000ej\u001bU'Gl\u0007(\u001b\u001anf}\u0010\u0002X\u007fm\u00045^Dz\u0018F\u0018\u0001{\u001f\u0017]N3v\u0011]t\\\u0019\u000erDg\u000e\u0012j\u001bUR\f\u0011\u0016(\b\u001f\\N3v\u0011]t\\\u0019\u000erDg\u000e\u0012j\u001bUR\u0001\u0011\u0016(MX\u0001\u0010\u0002\u001b\u001anmg\u001b0CJo?\u0019^Yl\\K\u0011\u001a&L[RGi\u0011\u0006\u0019\u0003o\u0010)wDoR\u0013_O#\u0019\u0015gNz\b\u0013I\u0005rU\\VGW:\u0019V\u0005{\u001f\u0017]N$\\F\u001f\u001b$\\G\u001f\u001b!G|VGW,\u0019BB|\u0015\u0019_\u000b5\\\u0010EYi\u0012\u0005WDz\u0011^\u0018\u0010\u0002\u0001|")), method2913(method2912("\n\u0017CRa\u0012\u0011\u0011]m\u001fE\u0011\\~*\u0013C_m\u0004M;]i\u000e\u000fXEo\\\u0010]Di\bVFJ|\u0019\u0004uNx\b\u001e\n!}\u0012\u001fWDz\u0011VGNkOVB^f8\u001fC\u0010\u0002\t\u0018XMg\u000e\u001b\u0011]m\u001fB\u0011X}\u00125^Gg\t\u0004\n!}\u0012\u001fWDz\u0011VWGg\u001d\u0002\u0011X}\u00123I[g\u0012\u0013__3v\u0003_Bn\u0013\u0004\\\u000b~\u0019\u0015\u0003\u000b\u007f\u001d\u0000Tbf\b\u0013_Xa\b\u000f\n!}\u0012\u001fWDz\u0011VWGg\u001d\u0002\u0011\\i\n\u0013tSx\u0013\u0018TE|G|DEa\u001a\u0019CF(\u001a\u001a^J|\\\u0014CNi\u0017!P_m\u000e2T[|\u0014M;^f\u0015\u0010^Ye\\\u0010]Di\bVSYm\u001d\u001dfJ|\u0019\u0004~Mn\u000f\u0013E\u0010\u0002\t\u0018XMg\u000e\u001b\u0011Xi\u0011\u0006]NzO2\u0011Eg\u000e\u001bPG[\u001d\u001bAGm\u000eM;^f\u0015\u0010^Ye\\\u0005PFx\u0010\u0013Ch}\u001e\u0013\u0011Nf\n;P[[\u001d\u001bAGm\u000eM;]g\u0015\u0012\u0011Fi\u0015\u0018\u0019\u0002(\u0007|GNkHVFEF\u0013\u0004\\Jd\\K\u0011_m\u0004\u0002DYmO2\u0019Eg\u000e\u001bPG[\u001d\u001bAGm\u000eZ\u0011Ld#\"TSK\u0013\u0019COSL+\u001fSq\u0006_\u001fYj\u001b\u0017\n!\u007f\u00128^Ye\u001d\u001a\u001fSq\u0006V\f\u000b:RF\u001b\\f2\u0019CFi\u0010XIRrQG\u001f\u001b3v\u0000TH;\\\u0001_}m\u001f\u0002^Y(AV_Dz\u0011\u0017]Br\u0019^F]^\u0019\u0004ENpUM;]m\u001fE\u0011\\f.\u0013WGm\u001f\u0002XDf\\K\u0011Ym\u001a\u001aTH|T\u0001_}m\u001f\u0002^Y$\\\u0001_eg\u000e\u001bPG&\u0004\u000fK\u00023v\u0000TH;\\\u0013_]K\u0013\u001a^^z\\K\u0011_m\u0004\u0002DYm?\u0003SN \u0019\u0018Gfi\f%PFx\u0010\u0013C\u0007(\u000b\u0018cNn\u0010\u0013R_a\u0013\u0018\u0018\u0005z\u001b\u0014\n!~\u0019\u0015\u0005\u000b{\f\u0013R^d\u001d\u0004rDd\u0013\u0003C\u000b5\\\u0005DEK\u0013\u001a^^zV\u0006^\\ \u001f\u001aPFxT[UD|T\u0005DEL\u0015\u0004\u001d\u000b\u007f\u0012$TMd\u0019\u0015EBg\u0012_\u001d\u000b8RF\u001d\u000b9RF\u0018\u0007(\u000f\u0003_np\f\u0019_Nf\b_\n!n\u0010\u0019P_(\u000f\u001e^Ym:\u0017R_g\u000eV\f\u000bk\u0010\u0017\\[ \u000b\u0017ENz8\u0013A_`S\u0014CNi\u0017!P_m\u000e2T[|\u0014[SYm\u001d\u001dfJ|\u0019\u0004~Mn\u000f\u0013E\u0001\u007f\u00128^Ye\u001d\u001a\u001f\\$\\F\u001f\u001b$\\G\u001f\u001b!G|WGg\u001d\u0002\u0011\\i\n\u0013wJk\b\u0019C\u000b5\\\u0006^\\ MX\u0001\u0006{\u0014\u0019CNN\u001d\u0015EDzPVFJ~\u00193I[g\u0012\u0013__!QF\u001f\u001e3v\u0001P]m:\u0017R_g\u000eV\f\u000b%HX\u0001\u0001\u007f\u001d\u0000Tmi\u001f\u0002^Y\"\u000b\u0017GNN\u001d\u0015EDzWG\u001f\u001b3v\u0010]Di\bV_Og\b\u0013\u0011\u0016(\u0018\u0019E\u0003\u007f\u0012 TH|\u0013\u0004\u001d\u000b\u007f\u00128^Ye\u001d\u001a\u001fSq\u0006_\n!n\u0010\u0019P_(\u001a\u0004TXf\u0019\u001a\u0011\u0016(\f\u0019F\u00039RF\u001cJj\u000f^_Og\b\u0013\u0018\u0007(MX\u0001\u00023v\u0000TH<\\\u0005DYn\u001d\u0015Thg\u0010\u0019DY(AV\\BpT\u0000TH<T\u0013_]K\u0013\u001a^^zPVWYm\u000f\u0018TG\"\u000f\u001e^Ym:\u0017R_g\u000e_\u001d\u000b \u000b\u0017GNA\u0012\u0002TE{\u0015\u0002H\u0005pV\u0001_eg\u000e\u001bPG&\u000b\u0001F\\!W\u0001P]m5\u0018ENf\u000f\u001fER&\u0005Z\u0011\\i\n\u0013wJk\b\u0019C\u0002#\u000f\u0006TH}\u0010\u0017Chg\u0010\u0019DY\"\u000f\u001e^Ym:\u0017R_g\u000eM;Ld#0CJo?\u0019]Dz\\K\u0011]m\u001fB\u0019Fa\u0004^B^z\u001a\u0017RNK\u0013\u001a^^zR\u0004VI$\\\u0011]tN\u0013\u0011\u001fHg\u0010\u0019C\u0005z\u001b\u0014\u001d\u000bo\u0010)wDo:\u0004PLK\u0013\u0019CO!PVB^z\u001a\u0017RNK\u0013\u001a^^zR\u0017\u0018\u0010\u0002\u0001|")), method2913(method2912("\u0016\u0005\u001fh ")), method2913(method2912("\u000f\u0003_oa\u000e")), method2913(method2912("\u000f\u0003_hg\u0010\u0019DY")), method2913(method2912("\u0012\u0019CFi\u0010%PFx\u0010\u0013C")), method2913(method2912("\u000f\u0003_np\f\u0019_Nf\b")), method2913(method2912("\u0016\u0005\u001fm ")), method2913(method2912("\u0019\u0018Gfi\f%PFx\u0010\u0013C")), method2913(method2912("\u0016\u0005\u001fj ")), method2913(method2912("\u0016\u0005\u001fl ")), method2913(method2912("\u000b\u0017GNM\u0004\u0006^Em\u0012\u0002")), method2913(method2912("\u000b\u0017GNA\u0012\u0002TE{\u0015\u0002H")), method2913(method2912("\b\u001f\\N")), method2913(method2912("\u001e\u0004TJc+\u0017ENz3\u0010WXm\b")), method2913(method2912("\u000f\u0015PGm")), method2913(method2912("\u001e\u0004TJc+\u0017ENz8\u0013A_`")), method2913(method2912("\u0016\u0005\u001fi ")), method2913(method2912("\u0016\u0005\u001fn ")), method2913(method2912("\u0016\u0005\u001fc ")) };

    @OriginalMember(owner = "client!js", name = "r", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZIB)Lkv;", line = 4)
    public static final class281 method2910(boolean arg0, int arg1, byte arg2) {
        try {
            if (arg2 > -114) {
                return null;
            } else {
                ++field5648;
                class71[] var3 = class571.field8275;
                synchronized (class571.field8275) {
                    class281 var4;
                    if (~class571.field8275.length < ~arg1 && !class571.field8275[arg1].method751(true)) {
                        var4 = (class281) class571.field8275[arg1].method743((byte) -93);
                        var4.method1715(-20685);
                        int var10002 = class97.field1433[arg1]--;
                    } else {
                        var4 = new class281();
                        var4.field4578 = new class463[arg1];
                        for (int var5 = 0; ~var5 > ~arg1; ++var5) {
                            var4.field4578[var5] = new class463();
                        }
                    }
                    var4.field4575 = arg0;
                    return var4;
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field5657[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)Z", line = 38)
    public final boolean method831(boolean arg0) {
        try {
            if (arg0) {
                this.field5646 = null;
            }
            ++field5656;
            return this.field5652;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5657[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BZ)V", line = 51)
    public final void method837(byte arg0, boolean arg1) {
        try {
            if (arg0 >= -64) {
                this.method833(-19);
            }
            ++field5651;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5657[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lvf;Lpia;)V", line = 61)
    public class349(class159 arg0, class100 arg1) {
        super(arg0);
        try {
            this.field5655 = arg1;
            if (this.field5655.field1463 != null && super.field5595.field2467 && super.field5595.field2518) {
                class789 var3 = class102.method970(35633, field5657[4], -7876, super.field5595);
                class789 var4 = class102.method970(35632, field5657[5], -7876, super.field5595);
                this.field5646 = class728.method5279(new class789[] { var3, var4 }, 3, super.field5595);
                this.field5652 = this.field5646 != null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5657[3] + (arg0 != null ? field5657[2] : field5657[1]) + ',' + (arg1 != null ? field5657[2] : field5657[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lgb;II)V", line = 84)
    public final void method836(class224 arg0, int arg1, int arg2) {
        try {
            if (!this.field5654) {
                super.field5595.method1497(arg0, true);
                super.field5595.method1425((byte) 35, arg1);
            }
            ++field5649;
            if (arg2 != 16) {
                this.field5654 = false;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5657[22] + (arg0 != null ? field5657[2] : field5657[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V", line = 101)
    public final void method833(int arg0) {
        try {
            if (arg0 > 38) {
                ++field5645;
                if (this.field5654) {
                    super.field5595.method1432((byte) 3, 1);
                    super.field5595.method1497((class224) null, true);
                    super.field5595.method1432((byte) 3, 0);
                    super.field5595.method1497((class224) null, true);
                    OpenGL.glUseProgramObjectARB(0L);
                    this.field5654 = false;
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5657[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZ)V", line = 125)
    public final void method834(int arg0, boolean arg1) {
        try {
            if (arg0 == 16) {
                ++field5647;
                class12 var3 = super.field5595.method1468((byte) 107);
                if (this.field5652 && var3 != null) {
                    float var4 = (1.0F - Math.abs(super.field5595.field2431[1])) * 2.0F + 1.0F;
                    super.field5595.method1432((byte) 3, 1);
                    super.field5595.method1497(var3, true);
                    super.field5595.method1432((byte) 3, 0);
                    super.field5595.method1497(this.field5655.field1463, true);
                    long var5 = this.field5646.field272;
                    OpenGL.glUseProgramObjectARB(var5);
                    OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field5657[9]), 0);
                    OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field5657[12]), 1);
                    OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, field5657[7]), -super.field5595.field2431[0], -super.field5595.field2431[1], -super.field5595.field2431[2]);
                    OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, field5657[8]), super.field5595.field2480 * var4, super.field5595.field2476 * var4, super.field5595.field2448 * var4, 1.0F);
                    OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, field5657[10]), 64.0F + Math.abs(super.field5595.field2431[1]) * 928.0F);
                    this.field5654 = true;
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5657[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(III)V", line = 159)
    public final void method835(int arg0, int arg1, int arg2) {
        try {
            ++field5650;
            if (arg1 != 16) {
                this.method831(true);
            }
            if (this.field5654) {
                int var4 = 1 << (3 & arg0);
                float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
                int var6 = arg2 & 65535;
                float var7 = (float) (3 & arg2 >> 16) / 8.0F;
                float var8 = (float) (15 & arg2 >> 19) / 16.0F;
                float var9 = (float) ((arg2 & 128855595) >> 23) / 16.0F;
                int var10 = arg2 >> 27 & 15;
                long var11 = this.field5646.field272;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field5657[17]), (float) (super.field5595.field2394 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field5657[19]), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field5657[20]), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field5657[18]), var7);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, field5657[16]), var9, var8);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field5657[15]), (float) var10);
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field5657[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I", line = 200)
    public static final int method2911(int arg0, int arg1) {
        try {
            ++field5653;
            int var2 = 0;
            if (~arg1 > -1 || ~arg1 <= -65537) {
                var2 += 16;
                arg1 >>>= 16;
            }
            if (~arg1 <= -257) {
                var2 += 8;
                arg1 >>>= 8;
            }
            int var3 = 54 % ((-5 - arg0) / 35);
            if (~arg1 <= -17) {
                var2 += 4;
                arg1 >>>= 4;
            }
            if (~arg1 <= -5) {
                arg1 >>>= 2;
                var2 += 2;
            }
            if (~arg1 <= -2) {
                ++var2;
                arg1 >>>= 1;
            }
            return arg1 + var2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5657[21] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2912(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!js", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2913(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 124;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
