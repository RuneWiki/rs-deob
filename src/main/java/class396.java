import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class396 extends class96 {

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Z")
    private boolean field5744 = false;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Z")
    private boolean field5749 = false;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lau;")
    private class113 field5742;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lvr;")
    private class584 field5746;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5752 = new String[] { method3097(method3096("bm`\"9")), method3097(method3096("ak/\bt")), method3097(method3096("fa#\u0001")), method3097(method3096("pz+\u0005zEi:\u0001cVm>\u0010y")), method3097(method3096("bm`!9")), method3097(method3096("ei8\u0001Tjx!\nt||")), method3097(method3096("ei8\u0001X||+\nb{|7")), method3097(method3096("pz+\u0005zEi:\u0001c]n(\u0017tf")), method3097(method3096("bm`#9")), method3097(method3096("|}\"\b")), method3097(method3096("gf'\u0002~`en\u0002}}i:De{e+_\u001bgf'\u0002~`en\u0002}}i:Dbqi\"\u0001*\u0018~/\u0016h{f)Dgwk}Dfd^+\u0016ewpungsz7\r\u007fu((\b~s|n\u0013pfm< tb|&_\u001bdg'\u00001\u007fi'\n9;(5nfs|+\u0016Uwx:\f1/()\bN_}\"\u0010xFm6'~}z*T?h3D\u0012tq<n\u0001rDm<\u0010tj(sDv~W\u0003\u000buwd\u0018\rteE/\u0010c{pd\u0003}M^+\u0016ewpunfd^+\u0016ewp`\u001c1/(*\u000be:o\";_}z#\u0005}_i:\u0016xjS~9=2m-2t`|+\u001c?jq4M*\u0018\u007f82t`|+\u001c?k(sDu}|f\u0003}MF!\u0016|sd\u0003\u0005e`a6? O$n\u0001rDm<\u0010tj&6\u001dk;3D\u0013gDm<\u0010tj&4D,2l!\u00109ud\u0011*~`e/\b\\s|<\riI:\u0013H1wk\u0018\u0001cfm6Jikrg_\u001bud\u00110tjK!\u000bcvS~9?j(sDu}|f\u0003}M\\+\u001cegz+)pfz'\u001cJ\"U\u0015TL>()\bN_}\"\u0010xFm6'~}z*T88{-\u0005}w3D\u0003}M\\+\u001cR}g<\u0000J\"U`\u001d1/(*\u000be:o\";Ewp:\u0011cwE/\u0010c{p\u0015TLI9\u0013H1ud\u0011)d~|'0tjK!\u000bcv8gNbqi\"\u0001*\u0018o\";Ewp\r\u000b~`l\u0015TL<rnY1fa#\u0001*\u0018o\";Ewp\r\u000b~`l\u0015TL<\u007fnY1#&~_\u001bud\u0011\"~uN<\u0005vQg!\u0016u25nU?\"%-\bp\u007fxfLv~W\b\u000bv<m \u0000:wk\u0018\u0001cfm6Jk;\")\bNTg)Jbqi\"\u0001=28`T=29`T8)\u0002)\bNBg=\re{g D,2n:\u0016p|{(\u000bc\u007f g_\u001bo\u0002")), method3097(method3096("di<\u001dx|on\u0012tq;n\u0013gDm<\u0010tj3D\u0012p`q'\nv2n\"\u000bpf(9\u0005ewz\n\u0001af`und|a(\u000bc\u007f(8\u0001r!(=\u0011\u007fVa<_\u001bgf'\u0002~`en\u0012tq<n\u0017d|K!\b~gzund|a(\u000bc\u007f((\b~s|n\u0017d|M6\u0014~|m \u0010*\u0018} \rw}z#Dgwk|Dfs~+-\u007ffm \u0017xfqund|a(\u000bc\u007f((\b~s|n\u0013pdm\u000b\u001ca}f+\ne)\u0002;\nxtg<\t1td!\u0005e2j<\u0001py_/\u0010t`L+\u0014ez3D\u0011\u007f{n!\u0016|2n\"\u000bpf(,\u0016tsc\u0019\u0005ewz\u0001\u0002wam:_\u001bgf'\u0002~`en\u0017p\u007fx\"\u0001c!Ln\n~`e/\bBse>\bt`3D\u0011\u007f{n!\u0016|2{/\ta~m<'dpmn\u0001\u007fdE/\u0014Bse>\bt`3D\u0012~{ln\tp{ffM1i\u00028\u0001r&(9\n_}z#\u0005}25n\u0010tj|;\u0016t!Lf\n~`e/\bBse>\bt`$n\u0003}M\\+\u001cR}g<\u0000J\"U`\u001chh!`\u0016suiunf|F!\u0016|sd`\u001chh(sD#<8d\u0013\u007f\\g<\tp~&6\u001dk?9`T*\u0018~+\u0007\"2\u007f 2tq|!\u00161/( \u000bc\u007fi\"\rkw 9\u0012Gwz:\u0001i;3D\u0012tq;n\u0013\u007f@m(\btq|'\u000b\u007f25n\u0016ttd+\u0007e:\u007f 2tq|!\u0016=2\u007f *~`e/\b?jq4M*\u0018~+\u0007\"2m \u0012R}d!\u0011c25n\u0010tj|;\u0016tQ},\u00019wf8)pb[/\ta~m<H1ef\u001c\u0001w~m-\u0010x}fgJcujungwkzDbbm-\u0011}sz\r\u000b}}}<D,2{;\nR}d!\u0011c8x!\u00139qd/\ta:%*\u000be:{;\nU{zbDf|Z+\u0002}wk:\r~|!bD!<8bD <8gH1a} !ibg \u0001\u007ff!unw~g/\u00101a`!\u0016tTi-\u0010~`(sDr~i#\u00149ei:\u0001cVm>\u0010y=j<\u0001py_/\u0010t`L+\u0014ez%,\u0016tsc\u0019\u0005ewz\u0001\u0002wam:Nf|F!\u0016|sd`\u0013=28`T=29`T8)\u0002(\b~s|n\u0013pdm\b\u0005rfg<D,2x!\u00139#&~Ibzg<\u0001Wsk:\u000bc>(9\u0005gwM6\u0014~|m \u00108?8`Q*\u0018\u007f/\u0012tTi-\u0010~`(sD<&&~Nfs~+\"pq|!\u0016;ei8\u0001Wsk:\u000bc99`T*\u0018n\"\u000bpf( \u0000~fmnY1vg:Lf|^+\u0007e}zbDf|F!\u0016|sd`\u001chh!unw~g/\u00101tz+\u0017\u007fwdnY1bg9L <8c\u0005sa  \u0000~fmgH1#&~M*\u0018~+\u0007%2{;\u0016wsk+'~~g;\u00161/(#\ri:~+\u0007%:m \u0012R}d!\u0011c>((\u0016taf+\b;a`!\u0016tTi-\u0010~`!bD9ei8\u0001X||+\nb{|7Ji8\u007f *~`e/\b?e\u007f9\u001389\u007f/\u0012t[f:\u0001\u007faa:\u001d?k$n\u0013pdm\b\u0005rfg<M:ax+\u0007d~i<'~~g;\u0016;a`!\u0016tTi-\u0010~`3D\u0003}MN<\u0005vQg\"\u000bc25n\u0012tq<f\txj =\u0011cti-\u0001R}d!\u0011c<z)\u0006=2o\";W}o`\u0007~~g<JcujbDv~W\b\u000bvTz/\u0003R}g<\u00008>(=\u0011cti-\u0001R}d!\u0011c<ig_\u001bo\u0002")), method3097(method3096("bm`Xx|a:Z9")), method3097(method3096("i&`Jl")), method3097(method3096("bm`%9")), method3097(method3096("bm` 9")), method3097(method3096("bm`,9")), method3097(method3096("bm`'9")), method3097(method3096("a} !ibg \u0001\u007ff")), method3097(method3096("bm`&9")), method3097(method3096("a}  x`")), method3097(method3096("a} '~~g;\u0016")), method3097(method3096("wf8)pb[/\ta~m<")), method3097(method3096("|g<\tp~[/\ta~m<")) };

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Lmv;")
    public static class125 field5738 = new class125(30, 8);

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "J")
    public static long field5751;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)V")
    public final void method681(boolean arg0, int arg1, int arg2) {
        try {
            ++field5748;
            if (this.field5749) {
                int var4 = 1 << (arg1 & 3);
                float var5 = (float) (1 << ((arg1 & 58) >> 3)) / 32.0F;
                int var6 = 65535 & arg2;
                float var7 = (float) (3 & arg2 >> 16) / 8.0F;
                float var8 = (float) ((7948038 & arg2) >> 19) / 16.0F;
                float var9 = (float) (15 & arg2 >> 23) / 16.0F;
                int var10 = (2079188400 & arg2) >> 27;
                long var11 = this.field5746.field8430;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field5752[2]), (float) (super.field1301.field2763 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field5752[1]), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field5752[3]), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field5752[7]), var7);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, field5752[6]), var9, var8);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field5752[5]), (float) var10);
            }
            if (arg0) {
                method3095((byte) -125);
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field5752[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lml;Lau;)V")
    public class396(class194 arg0, class113 arg1) {
        super(arg0);
        try {
            this.field5742 = arg1;
            if (this.field5742.field1464 != null && super.field1301.field2888 && super.field1301.field2892) {
                class506 var3 = class558.method4178(35633, super.field1301, field5752[10], -8086);
                class506 var4 = class558.method4178(35632, super.field1301, field5752[11], -8086);
                this.field5746 = class201.method1729(super.field1301, (byte) -73, new class506[] { var3, var4 });
                this.field5744 = this.field5746 != null;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5752[12] + (arg0 != null ? field5752[13] : field5752[9]) + ',' + (arg1 != null ? field5752[13] : field5752[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public static void method3094(int arg0) {
        try {
            field5738 = null;
            if (arg0 != 0) {
                field5751 = 44L;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5752[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
    public final void method673(boolean arg0, int arg1) {
        try {
            ++field5740;
            class112 var3 = super.field1301.method1651((byte) -118);
            int var4 = 35 / ((36 - arg1) / 55);
            if (this.field5744 && var3 != null) {
                float var5 = 1.0F + (1.0F - Math.abs(super.field1301.field2803[1])) * 2.0F;
                super.field1301.method1619(1, (byte) 125);
                super.field1301.method1618((byte) -89, var3);
                super.field1301.method1619(0, (byte) 125);
                super.field1301.method1618((byte) 64, this.field5742.field1464);
                long var6 = this.field5746.field8430;
                OpenGL.glUseProgramObjectARB(var6);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, field5752[23]), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, field5752[22]), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var6, field5752[20]), -super.field1301.field2803[0], -super.field1301.field2803[1], -super.field1301.field2803[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var6, field5752[21]), super.field1301.field2853 * var5, super.field1301.field2866 * var5, super.field1301.field2808 * var5, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var6, field5752[18]), 64.0F + Math.abs(super.field1301.field2803[1]) * 928.0F);
                this.field5749 = true;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5752[19] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZB)V")
    public final void method683(boolean arg0, byte arg1) {
        try {
            if (arg1 != -54) {
                this.method677(true);
            }
            ++field5741;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5752[17] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method675(int arg0) {
        try {
            ++field5743;
            if (arg0 == -16265) {
                if (this.field5749) {
                    super.field1301.method1619(1, (byte) 125);
                    super.field1301.method1618((byte) -107, (class469) null);
                    super.field1301.method1619(0, (byte) 125);
                    super.field1301.method1618((byte) -103, (class469) null);
                    OpenGL.glUseProgramObjectARB(0L);
                    this.field5749 = false;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5752[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public static final void method3095(byte arg0) {
        try {
            ++field5745;
            if (arg0 < -100) {
                class725.field10314 = 0;
                int var1 = (class203.field2988.field2969 >> 9) + class537.field7895;
                int var2 = (class203.field2988.field2984 >> 9) - -class655.field9286;
                if (var1 >= 3053 && ~var1 >= -3157 && ~var2 <= -3057 && ~var2 >= -3137) {
                    class725.field10314 = 1;
                }
                if (~var1 <= -3073 && var1 <= 3118 && var2 >= 9492 && ~var2 >= -9536) {
                    class725.field10314 = 1;
                }
                if (class725.field10314 == 1 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && ~var2 >= -3063) {
                    class725.field10314 = 0;
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5752[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZLica;)V")
    public final void method679(int arg0, boolean arg1, class469 arg2) {
        try {
            if (arg1) {
                this.method675(-17);
            }
            if (!this.field5749) {
                super.field1301.method1618((byte) -85, arg2);
                super.field1301.method1631(arg0, 7681);
            }
            ++field5750;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5752[16] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5752[13] : field5752[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Z")
    public final boolean method677(boolean arg0) {
        try {
            if (!arg0) {
                method3094(123);
            }
            ++field5739;
            return this.field5744;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5752[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3096(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3097(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 78;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
