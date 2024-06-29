import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class72 extends class657 {

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "Z")
    private boolean field792 = false;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "Z")
    private boolean field790 = false;

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "Lbb;")
    private class351 field791;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Lvc;")
    private class335 field796;

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field797 = new String[] { method652(method651("#h+rl<r0C")), method652(method651("#h+t{ r+Tm$")), method652(method651("!oku+")), method652(method651(">r7\\b<N$\\s<x7")), method652(method651("5s3|b N$\\s<x7")), method652(method651("#h+uj\"")), method652(method651("!okv+")), method652(method651("!okt+")), method652(method651("!okw+")), method652(method651("+3k\u001f~")), method652(method651(">h)]")), method652(method651("!oks+")), method652(method651("!okr+")), method652(method651("!ok\rj>t1\u000f+")), method652(method651("%s,Wl\"peWo?|1\u0011w9p \n\t%s,Wl\"peWo?|1\u0011p3|)T8Zk$Cz9s\"\u0011u5~v\u0011t&K Cw5e~;u1o<Xm7=#]l1ieFb$x7uf i-\n\t&r,U#=|,_+y=>;t1i CG5m1Y#m=\"]\\\u001dh)Ej\u0004x=rl?o!\u0001-*&OGf3)eT`\u0006x7Ef(=x\u0011d<B\b^g5q\u0013Xf'P$Eq9eoVo\u000fK Cw5e~;t&K Cw5ekI#m=!^wxz)nM?o(Po\u001d|1Cj(Ful/px&gf\"i I-(d?\u00188Zj3gf\"i I-)=x\u0011g?imVo\u000fS*Cn1q\bPw\"t=j2\r1eT`\u0006x7Ef(3=Hyy&OFu\u0006x7Ef(3?\u0011>py*E+7q\u001a\u007fl\"p$]N1i7X{\u000b/\u0018\u001d#5~\u0013Tq$x=\u001f{)gl\n\t7q\u001aef(^*^q4Ful-(=x\u0011g?imVo\u000fI Iw%o |b$o,IX`@\u001e\u0001^|=\"]\\\u001dh)Ej\u0004x=rl?o!\u0001*zn&Po5&OVo\u000fI I@?r7UX`@kH#m=!^wxz)nW5e1Dq5P$Eq9e\u001e\u0001^\u000b,\u0018\u001d#7q\u001a|v<i,ef(^*^q4-l\u001bp3|)T8Zz)nW5e\u0006^l\"y\u001e\u0001^~ge\f#$t(T8Zz)nW5e\u0006^l\"y\u001e\u0001^~je\f#a3u\n\t7q\u001awl7[7Pd\u0013r*Cgp e\u0000-`0&]b=mm\u0019d<B\u0003^d~x+U(5~\u0013Tq$x=\u001fyy7\"]\\\u0016r\"\u001fp3|)T/p-k\u0001/p,k\u0001*k\u0017\"]\\\u0000r6Xw9r+\u0011>p{1Cb>n#^q=5l\n\t-\u0017")), method652(method651("&|7Hj>zeGf3.eFu\u0006x7Ef(&OGb\"d,_dp{)^b$=2Pw5o\u0001Ts$u~;v>t#^q==3T`c=6Dm\u0014t7\n\t%s,Wl\"peGf3)eBv>^*]l%o~;v>t#^q==#]l1ieBv>X=Al>x+E8Zh+Xe?o(\u0011u5~w\u0011t1k xm$x+Bj$d~;v>t#^q==#]l1ieFb&x\u0000Is?s _wk\u00170_j6r7\\#6q*Pwp\u007f7Tb;J$Ef\"Y Aw8&ODm9{*Cnp{)^b$='Cf1v\u0012Pw5o\nWe#x1\n\t%s,Wl\"peBb=m)TqcYe_l\"p$]P1p5]f\"&ODm9{*Cnpn$\\s<x7rv2xeTm&P$AP1p5]f\"&OGl9ye\\b9sm\u0018#+\u00173T`d=2_M?o(Pop eEf(i0CfcYm_l\"p$]P1p5]f\"1eVo\u000fI I@?r7UX`@kIz*4kCa7|~;t>S*Cn1qkIz*=x\u00111~-oFm\u001er7\\b<3=Hy},k\u00018Zk R0pj+gf3i*C#m=+^q=|)Xy552GU5o1T{y&OGf3.eFm\u0002x#]f3i,^mp eCf6q Rwxj+gf3i*C/pj+\u007fl\"p$]-(d?\u00188Zk R0px+G@?q*Dqp eEf(i0Cf\u0013h'T+5s3|b N$\\s<x7\u001d#'s\u0017Te<x&Ej?sl\u001fq7\u007f~;u5~q\u0011p x&Do1o\u0006^o?h7\u0011>pn0_@?q*Dqzm*F+3q$\\sx0!^wxn0_G9oi\u0011t>O Wo5~1Xl>4i\u00113~-i\u00112~-l\u001d##h+t{ r+Tm$4~;e<r$E##u*Cf\u0016|&El\"=x\u0011`<|(A+'|1Tq\u0014x5Ek\u007f\u007f7Tb;J$Ef\"Y Aw80'Cf1v\u0012Pw5o\nWe#x1\u001bt>S*Cn1qkF/p-k\u0001/p,k\u0001*k\u0017#]l1ieFb&x\u0003P`$r7\u0011>pm*F+a3u\u001cp8r7TE1~1^q|=2Pu5X=Al>x+E*}-k\u00048Zj$Gf\u0016|&El\"=x\u0011.d3u\u001bt1k wb3i*C)'|3TE1~1^q{,k\u00018Z{)^b$=+Ul$xe\f#4r1\u0019t>K Rw?oi\u0011t>S*Cn1qkIz*4~;e<r$E#6o Bm5qe\f# r2\u00192~-hPa#5+Ul$xl\u001d#a3u\u00188Zk R7pn0Ce1~ rl<r0C#m=(X{xk R7xx+G@?q*Dq|=#Cf#s ])#u*Cf\u0016|&El\"4i\u0011+'|3TJ>i _p9i<\u001f{zj+\u007fl\"p$]-'j2F*{j$Gf\u0019s1Tm#t1H-)1eFb&x\u0003P`$r7\u0018(#m Rv<|7rl<r0C)#u*Cf\u0016|&El\"&OVo\u000f[7Pd\u0013r)^qp eGf3)m\\j(56Dq6|&T@?q*Dq~o\"S/pz)nE?zkRl<r7\u001fq7\u007fi\u0011d<B\u0003^d\u0016o$V@?r7U*|=6Dq6|&T@?q*Dq~|l\n\t-\u0017")), method652(method651("'|3TF(m*_f>i")), method652(method651("2o Ph\u0007|1Tq\u001f{#Bf$")), method652(method651("'|3TJ>i _p9i<")), method652(method651("#~$]f")), method652(method651("$t(T")), method652(method651("2o Ph\u0007|1Tq\u0014x5Ek")), method652(method651("!okp+")) };

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "Ljava/lang/String;")
    public static String field785;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "Ljava/lang/String;")
    public static String field789;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "Lol;")
    public static class299 field795;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "Lla;")
    public static class476 field794;

    static {
        String var0 = method652(method651("\u0005s._l's"));
        try {
            var0 = System.getProperty(method652(method651(":|3P-&x+Ul\""))).toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = method652(method651("\u0005s._l's"));
        try {
            var1 = System.getProperty(method652(method651(":|3P-&x7Bj?s"))).toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = method652(method651("\u0005s._l's"));
        try {
            var2 = System.getProperty(method652(method651("?nk_b=x"))).toLowerCase();
        } catch (Exception var9) {
        }
        field785 = var2.toLowerCase();
        String var3 = method652(method651("\u0005s._l's"));
        try {
            var3 = System.getProperty(method652(method651("?nkPq3u"))).toLowerCase();
        } catch (Exception var8) {
        }
        field789 = var3.toLowerCase();
        String var4 = method652(method651("\u0005s._l's"));
        try {
            var4 = System.getProperty(method652(method651("?nkGf\"n,^m"))).toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = method652(method651(".2"));
        try {
            var5 = System.getProperty(method652(method651("%n C-8r(T"))).toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBLmw;)V", line = 3)
    public final void method4(int arg0, byte arg1, class517 arg2) {
        try {
            ++field783;
            if (!this.field790) {
                super.field9490.method1733(arg2, 17237);
                super.field9490.method1753(0, arg0);
            }
            if (arg1 <= 117) {
                this.method1(26);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field797[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field797[9] : field797[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lffa;Lbb;)V", line = 19)
    public class72(class197 arg0, class351 arg1) {
        super(arg0);
        try {
            this.field791 = arg1;
            if (this.field791.field5424 != null && super.field9490.field2929 && super.field9490.field2937) {
                class414 var3 = class484.method3687(super.field9490, (byte) 96, 35633, field797[14]);
                class414 var4 = class484.method3687(super.field9490, (byte) 76, 35632, field797[15]);
                this.field796 = class586.method4371(super.field9490, (byte) -126, new class414[] { var3, var4 });
                this.field792 = this.field796 != null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field797[13] + (arg0 != null ? field797[9] : field797[10]) + ',' + (arg1 != null ? field797[9] : field797[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V", line = 38)
    public static void method650(int arg0) {
        try {
            if (arg0 == 35632) {
                field794 = null;
                field795 = null;
                field785 = null;
                field789 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field797[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIZ)V", line = 55)
    public final void method7(int arg0, int arg1, boolean arg2) {
        try {
            ++field786;
            if (this.field790) {
                int var4 = 1 << (3 & arg1);
                float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
                int var6 = arg0 & 65535;
                float var7 = (float) (arg0 >> 16 & 3) / 8.0F;
                float var8 = (float) (15 & arg0 >> 19) / 16.0F;
                float var9 = (float) (arg0 >> 23 & 15) / 16.0F;
                int var10 = (arg0 & 2129033699) >> 27;
                long var11 = this.field796.field5237;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field797[20]), (float) (super.field9490.field2853 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field797[19]), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field797[21]), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field797[17]), var7);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, field797[18]), var9, var8);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field797[16]), (float) var10);
            }
            if (!arg2) {
                this.method1(-85);
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field797[22] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)Z", line = 93)
    public final boolean method8(int arg0) {
        try {
            ++field784;
            int var2 = -1 / ((arg0 - -17) / 42);
            return this.field792;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field797[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V", line = 104)
    public final void method1(int arg0) {
        try {
            if (arg0 != 0) {
                this.method8(-91);
            }
            ++field788;
            if (this.field790) {
                super.field9490.method1716(33984, 1);
                super.field9490.method1733((class517) null, 17237);
                super.field9490.method1716(33984, 0);
                super.field9490.method1733((class517) null, 17237);
                OpenGL.glUseProgramObjectARB(0L);
                this.field790 = false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field797[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BZ)V", line = 126)
    public final void method6(byte arg0, boolean arg1) {
        try {
            if (arg0 != 38) {
                field794 = null;
            }
            ++field787;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field797[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)V", line = 144)
    public final void method3(boolean arg0, int arg1) {
        try {
            ++field793;
            class532 var3 = super.field9490.method1703(99);
            if (this.field792 && var3 != null) {
                float var4 = 1.0F + 2.0F * (1.0F - Math.abs(super.field9490.field2888[1]));
                super.field9490.method1716(33984, 1);
                super.field9490.method1733(var3, 17237);
                super.field9490.method1716(33984, 0);
                super.field9490.method1733(this.field791.field5424, 17237);
                long var5 = this.field796.field5237;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field797[3]), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field797[4]), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, field797[5]), -super.field9490.field2888[0], -super.field9490.field2888[1], -super.field9490.field2888[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, field797[0]), super.field9490.field2930 * var4, super.field9490.field2936 * var4, super.field9490.field2987 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, field797[1]), 64.0F + 928.0F * Math.abs(super.field9490.field2888[1]));
                this.field790 = true;
            }
            if (arg1 != 1) {
                this.method8(-58);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field797[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method651(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 3);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method652(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 80;
                    break;
                case 1:
                    var10005 = 29;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 3;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
