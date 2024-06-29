import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class171 extends class96 {

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Z")
    private boolean field2271 = false;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Z")
    private boolean field2265 = false;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "Lau;")
    private class113 field2266;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Lvr;")
    private class584 field2268;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2276 = new String[] { method1450(method1449("S+'#$")), method1450(method1449("S+'%$")), method1450(method1449("S+''$")), method1450(method1449("X8e\b")), method1450(method1449("Mc'Jq")), method1450(method1449("S+',$")), method1450(method1449("X\"{\tmZ\u001eh\t|Z({")), method1450(method1449("E8g!tF\"g\u0001bB")), method1450(method1449("E8g'cZ\"|\u0016")), method1450(method1449("E8g eD")), method1450(method1449("S+'&$")), method1450(method1449("S#\u007f)mF\u001eh\t|Z({")), method1450(method1449("T?l\u0005ga,}\u0001~r(y\u0010d")), method1450(method1449("T?l\u0005ga,}\u0001~y+o\u0017iB")), method1450(method1449("B$d\u0001")), method1450(method1449("E.h\bi")), method1450(method1449("S+'!$")), method1450(method1449("@,{\u001deX*)\u0012iU~)\u0013z`({\u0010iNv\u0003\u0012mD4`\nk\u0016+e\u000bmBm~\u0005xS?M\u0001|B%2nyX$o\u000b~[m\u007f\u0001o\u0005mz\u0011br${_\u0006C#`\u0002cD )\u0012iUy)\u0017yX\u000ef\bcC?2nyX$o\u000b~[mo\bcW9)\u0017yX\bq\u0014cX(g\u00107<8g\rjY?dDjZ\"h\u0010,T?l\u0005ga,}\u0001~r(y\u0010d\rG|\neP\"{\t,P!f\u0005x\u0016/{\u0001m]\u001ah\u0010iD\u0002o\u0002\u007fS92nyX$o\u000b~[mz\u0005aF!l\u0016?rmg\u000b~[,e7m[=e\u0001~\rG|\neP\"{\t,E,d\u0014`S?J\u0011nSml\nz{,y7m[=e\u0001~\rG\u007f\u000beRmd\u0005eXe Dw<;l\u00078\u0016:g*cD h\b,\u000bm}\u0001tB8{\u0001?reg\u000b~[,e7m[=e\u0001~\u001amn\bSb(q'cY?m?<kcq\u001dv\u001fc{\u0006kWv\u0003\u0013bx\"{\tmZcq\u001dv\u0016p)V\"\u0006g~\nBY?d\u0005`\u00185p\u001e!\u0007c9_\u0006@(jW,A#_\u0001oB\"{D1\u0016#f\u0016aW!`\u001ei\u001e:\u007f2iD9l\u001c%\rG\u007f\u0001o\u0005m~\n^S+e\u0001oB$f\n,\u000bm{\u0001jZ(j\u0010$A#_\u0001oB\"{H,A#G\u000b~[,eJtO7 _\u0006@(jW,S#\u007f'cZ\"|\u0016,\u000bm}\u0001tB8{\u0001OC/lLiX;D\u0005|e,d\u0014`S?%D{X\u001fl\u0002`S.}\rcXd'\u0016kTv\u0003\u0012iUy)\u0017|S.|\bmD\u000ef\bcC?)Y,E8g'cZ\"|\u0016&F\"~LoZ,d\u0014$\u001b)f\u0010$E8g eDa)\u0013bd(o\biU9`\u000bb\u001fa)T\"\u0006a)U\"\u0006d%D\u007fC#L\u001c|Y#l\nx\u001fv\u0003\u0002`Y,}D\u007f^\"{\u0001JW.}\u000b~\u0016p)\u0007`W yL{W9l\u0016HS=}\f#T?l\u0005ga,}\u0001~r(y\u0010d\u001b/{\u0001m]\u001ah\u0010iD\u0002o\u0002\u007fS9#\u0013bx\"{\tmZc~H,\u0006c9H,\u0007c9M7<+e\u000bmBmg\u0000cB()Y,R\"}L{X\u001bl\u0007xY?%D{X\u0003f\u0016aW!'\u001cuLd2njZ\"h\u0010,P?l\u0017bS!)Y,F\"~L=\u0018}$\u0005nEeg\u0000cB( H,\u0004c9M7<;l\u00078\u0016>|\u0016jW.l'cZ\"|\u0016,\u000bm\u007f\u0001o\u0002el\nzu\"e\u000byDa)\u0002~S>g\u0001`\u001c>a\u000b~S\u000bh\u0007xY? O\u007fF(j\u0011`W?J\u000b`Y8{N\u007f^\"{\u0001JW.}\u000b~\rGn\bSp?h\u0003OY!f\u0016,\u000bm\u007f\u0001o\u0002ed\rt\u001e>|\u0016jW.l'cZ\"|\u0016\"D*kH,Q!V\"cQcj\u000b`Y?'\u0016kTa)\u0003`i\u000bf\u0003JD,n'cY?mM \u0016>|\u0016jW.l'cZ\"|\u0016\"Wd2nq<")), method1450(method1449("S+'XeX$}Z$")), method1450(method1449("C#`\u0002cD )\u0002`Y,}Dx_ l_\u0006C#`\u0002cD )\u0002`Y,}D\u007fU,e\u00017<;h\u0016u_#nDzS.:D{@\u001bl\u0016xS52nzW?p\rbQmo\bcW9)\u0013mB({ iF9a_\u0006@\"`\u0000,[,`\n$\u001fmrn{W9l\u0016HS=}\f,\u000bmn\bS{8e\u0010eb(q'cY?mT\"Lv\u0003\u0012iUy)\u0001o`({\u0010iNm4DkZ\u0012D\u000bhS!_\riA\u0000h\u0010~_5#\u0003`i\u001bl\u0016xS52n{@\u001bl\u0016xS5'\u001c,\u000bmm\u000bx\u001e*e;BY?d\u0005`{,}\u0016eN\u001699 \u0016(j2iD9l\u001c\"N4sM7<:\u007f2iD9l\u001c\"Om4DhY9!\u0003`i\u0003f\u0016aW!D\u0005xD$q?=ka)\u0001o`({\u0010iNcq\u001dv\u001fv\u0003\u0013z`({\u0010iNcsD1\u0016)f\u0010$Q!V*cD h\bAW9{\rtm\u007fTH,S._\u0001~B(qJtO7 _\u0006Q!V0iN\u000ef\u000b~R\u001699\"Nm4DhY9!\u0003`i\u0019l\u001cxC?l)mB?`\u001cW\u0006\u0010RTQ\u001amn\bS{8e\u0010eb(q'cY?mT%\u001c>j\u0005`Sv\u0003\u0003`i\u0019l\u001cOY\"{\u0000W\u0006\u0010'\u001d,\u000bmm\u000bx\u001e*e;XS5}\u0011~S\u0000h\u0010~_5RTQm|TH,Q!V)yZ9`0iN\u000ef\u000b~R} N\u007fU,e\u00017<*e;XS5J\u000bcD)RTQ\u00187)Y,B$d\u00017<*e;XS5J\u000bcD)RTQ\u0018:)Y,\u0007c9_\u0006Q!V\"cQ\u000b{\u0005ku\"f\u0016h\u0016p)U\"\u0006`j\bm[=!LkZ\u0012O\u000bk\u0018(g\u0000'S._\u0001~B(qJv\u001fgn\bSp\"nJ\u007fU,e\u0001 \u0016}'T \u0016|'T%\rGn\bSf\"z\rx_\"gD1\u0016+}\u0016mX>o\u000b~[e _\u0006KG")) };

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public final void method675(int arg0) {
        try {
            ++field2270;
            if (arg0 == -16265) {
                if (this.field2265) {
                    super.field1301.method1619(1, (byte) 125);
                    super.field1301.method1618((byte) -107, (class469) null);
                    super.field1301.method1619(0, (byte) 125);
                    super.field1301.method1618((byte) 33, (class469) null);
                    OpenGL.glUseProgramObjectARB(0L);
                    this.field2265 = false;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2276[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZLica;)V")
    public final void method679(int arg0, boolean arg1, class469 arg2) {
        try {
            ++field2264;
            if (arg1) {
                this.field2268 = null;
            }
            if (!this.field2265) {
                super.field1301.method1618((byte) 86, arg2);
                super.field1301.method1631(arg0, 7681);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2276[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2276[4] : field2276[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)V")
    public final void method683(boolean arg0, byte arg1) {
        try {
            ++field2272;
            if (arg1 != -54) {
                this.method681(true, -16, 105);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2276[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZII)V")
    public final void method681(boolean arg0, int arg1, int arg2) {
        try {
            if (arg0) {
                field2273 = 47;
            }
            if (this.field2265) {
                int var4 = 1 << (arg1 & 3);
                float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
                int var6 = 65535 & arg2;
                float var7 = (float) ((241257 & arg2) >> 16) / 8.0F;
                long var8 = this.field2268.field8430;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field2276[14]), (float) (super.field1301.field2763 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field2276[15]), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field2276[12]), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field2276[13]), var7);
            }
            ++field2274;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field2276[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lml;Lau;)V")
    public class171(class194 arg0, class113 arg1) {
        super(arg0);
        try {
            this.field2266 = arg1;
            if (this.field2266.field1464 != null && super.field1301.field2888 && super.field1301.field2892) {
                class506 var3 = class558.method4178(35633, super.field1301, field2276[19], -8086);
                class506 var4 = class558.method4178(35632, super.field1301, field2276[17], -8086);
                this.field2268 = class201.method1729(super.field1301, (byte) -73, new class506[] { var3, var4 });
                this.field2271 = this.field2268 != null;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2276[18] + (arg0 != null ? field2276[4] : field2276[3]) + ',' + (arg1 != null ? field2276[4] : field2276[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
    public final void method673(boolean arg0, int arg1) {
        try {
            ++field2269;
            int var3 = 60 % ((36 - arg1) / 55);
            class112 var4 = super.field1301.method1651((byte) -118);
            if (this.field2271 && var4 != null) {
                super.field1301.method1619(1, (byte) 125);
                super.field1301.method1618((byte) -127, var4);
                super.field1301.method1619(0, (byte) 125);
                super.field1301.method1618((byte) 47, this.field2266.field1464);
                long var5 = this.field2268.field8430;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field2276[6]), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field2276[11]), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, field2276[9]), -super.field1301.field2803[0], -super.field1301.field2803[1], -super.field1301.field2803[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, field2276[8]), super.field1301.field2853, super.field1301.field2866, super.field1301.field2808, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, field2276[7]), Math.abs(super.field1301.field2803[1]) * 928.0F + 96.0F);
                this.field2265 = true;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2276[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Z")
    public final boolean method677(boolean arg0) {
        try {
            ++field2275;
            if (!arg0) {
                this.field2268 = null;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2276[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1449(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 12);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1450(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 12;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
