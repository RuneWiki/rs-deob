import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class587 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lffa;")
    private class197 field8639;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8646 = new String[] { method4380(method4379("K^-_hUT8k")), method4380(method4379("QX4jeMp<}")), method4380(method4379("WH1a")), method4380(method4379("B\u0013s#p")), method4380(method4379("J\\0}a\\n4wh")), method4380(method4379("LZsN%")), method4380(method4379("LZsL%")), method4380(method4379("LZsI%")), method4380(method4379("LZs1dWT)3%")), method4380(method4379("LS4kbKP}kaV\\)-\u007fZM\u000fhaPX;6\u0007LS4kbKP}{hZ\u000f}~lTM1h^PG86\u0007LS4kbKP}~lTM1h\u007f\ny}ehPZ5y@XMf\u0007{VT9-`XT3%$\u0019FWkaV\\)-iA\u001d`-y\\E)x\u007f\\\u000e\u0019%e\\T:eyt\\-!-OX>>%\u0014N<`}UX\u000edw\\\u0013%!-\t\u0013m!-\t\u0013m$&^Q\u0002YhA~2b\u007f]fmP#AD'$#K\u001dp-y\\E)x\u007f\\\u000e\u0019%e\\T:eyt\\-!-OX>>%J\\0}a\\n4wh\u0017Eq-=\u0017\rq-=\u0017\rt&jUb\thuzR2\u007fib\r\u0000#u@Gt#\u007f\u00027;abXI}it\u0019\u0000}yhAI(\u007fh\nyuehPZ5y@XMq-{\\^n%=\u0017\rq- J\\0}a\\n4wh\u0017Dq-=\u0017\rt&jUb\thuzR2\u007fib\r\u0000#u@Gt#\u007f\u0019\u0010}yhAI(\u007fh\nyuehPZ5y@XMq-{\\^n%=\u0017\rq-~XP-ahjT'h#@\u0011}=#\t\u0014vjafi8uNVR/iV\t`sutC\u0014s\u007f63Z1RKK\\:NbUR/-0\u0019K8n9\u0011\rs8&WR/`lUT'h%OX>>%]Eq-i@\u0011}\u007fnIo8ad\\[t$'\t\u0013h!-MX%yxKXnI%QX4jeMp<}!\u0019Z1RY\\E\u001ebbKY\u0006=P\u0017E$w$\u0017Ot6\u0007D7")), method4380(method4379("LZsO%")) };

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[Ldn;")
    public static class542[] field8640 = new class542[16];

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Lvc;")
    private class335 field8641;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLbv;Lbv;F)Z")
    public final boolean method4375(byte arg0, class322 arg1, class322 arg2, float arg3) {
        try {
            field8642++;
            if (!this.method4378(-48)) {
                return false;
            }
            class156 var5 = this.field8639.field2933;
            class486 var6 = new class486(this.field8639, 6408, arg1.field5073, arg1.field5081);
            boolean var7 = false;
            this.field8639.method1755(var5, 0);
            var5.method1312(0, (byte) -34, var6);
            if (var5.method1309((byte) 37)) {
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5889);
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glPushAttrib(2048);
                OpenGL.glViewport(0, 0, arg1.field5073, arg1.field5081);
                OpenGL.glUseProgramObjectARB(this.field8641.field5237);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field8641.field5237, field8646[1]), 0);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field8641.field5237, field8646[0]), 1.0F / arg3);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field8641.field5237, field8646[4]), 1.0F / (float) arg2.field5073, 1.0F / (float) arg2.field5081);
                for (int var8 = 0; var8 < arg1.field5083; var8++) {
                    float var9 = (float) var8 / (float) arg1.field5083;
                    this.field8639.method1733(arg2, 17237);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord3f(0.0F, 0.0F, var9);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord3f(1.0F, 0.0F, var9);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord3f(1.0F, 1.0F, var9);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord3f(0.0F, 1.0F, var9);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                    OpenGL.glEnd();
                    arg1.method2726(0, 0, arg1.field5081, arg1.field5073, 0, var8, (byte) -128, 0);
                }
                OpenGL.glUseProgramObjectARB(0L);
                OpenGL.glPopAttrib();
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
                OpenGL.glPopMatrix();
                var7 = true;
            }
            var5.method1300((byte) 41, 0);
            this.field8639.method1746(var5, (byte) 110);
            int var10 = 102 % ((arg0 + 37) / 45);
            return var7;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field8646[5] + arg0 + ',' + (arg1 == null ? field8646[2] : field8646[3]) + ',' + (arg2 == null ? field8646[2] : field8646[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method4376(int arg0) {
        try {
            field8640 = null;
            if (arg0 != 0) {
                field8645 = -20;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8646[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILcca;IILka;I)V")
    public static final void method4377(int arg0, class260 arg1, int arg2, int arg3, class497 arg4, int arg5) {
        try {
            if (arg3 <= 98) {
                method4377(43, null, -73, 17, null, -66);
            }
            field8643++;
            if (arg4 != null) {
                arg1.method2191(arg4.method313(), arg4.method336(), arg4.method306(), arg0, arg5, false, arg4.method335(), arg2, arg4.method340(), arg4.method305(), arg4.method341());
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field8646[6] + arg0 + ',' + (arg1 == null ? field8646[2] : field8646[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field8646[2] : field8646[3]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Z")
    public final boolean method4378(int arg0) {
        try {
            if (arg0 > -33) {
                this.method4378(-14);
            }
            if (this.field8639.field2983 && this.field8639.field2937 && this.field8641 == null) {
                class414 var2 = class484.method3687(this.field8639, (byte) -123, 35632, field8646[9]);
                if (var2 != null) {
                    this.field8641 = class586.method4371(this.field8639, (byte) -127, new class414[] { var2 });
                }
            }
            field8644++;
            return this.field8641 != null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8646[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lffa;)V")
    public class587(class197 arg0) {
        try {
            this.field8639 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8646[8] + (arg0 == null ? field8646[2] : field8646[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4379(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4380(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 61;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
