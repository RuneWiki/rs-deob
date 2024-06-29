import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class209 {

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lml;")
    private class194 field3040;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3048 = new String[] { method1775(method1774("9i5`W>j|`T#f(&J/w\u000ecT%b:=29i5`W>j|p]/5|uY!w0ck%}9=29i5`W>j|uY!w0cJ\u007fC|n]%`4ru-wg\fN#n8&U-n2.\u0011l|V`T#f(&\\4'a&L)\u007f(sJ)4\u0018.P)n;nL\u0001f,*\u0018:b?5\u0010at=kH b\u000foB))$*\u0018|)l*\u0018|)l/\u0013+k\u0003R]4D3iJ(\\l[\u00164~&/\u0016>'q&L)\u007f(sJ)4\u0018.P)n;nL\u0001f,*\u0018:b?5\u0010?f1vT)T5|]b\u007fp&\bb7p&\bb7u-_ X\bc@\u000fh3t\\\u00177\u0001(@5}u(Jw\r:jW-s|bAl:|r]4s)t]\u007fCtn]%`4ru-wp&N)do.\bb7p&\u0015?f1vT)T5|]b~p&\bb7u-_ X\bc@\u000fh3t\\\u00177\u0001(@5}u(Jl*|r]4s)t]\u007fCtn]%`4ru-wp&N)do.\bb7p&K-j,j]\u001fn&c\u00165+|6\u0016|.waT\u0013S9~{#h.bc|Zr~A6.rt\u0003F`0Y~>f;EW h.&\u0005lq9e\fd7r3\u0013\"h.kY n&c\u0010:b?5\u0010(\u007fp&\\5+|t[<U9jQ)au/\u0012|)i*\u00188b$rM>boB\u0010$b5aP8J=v\u0014l`0Yl)\u007f\u001fiW>c\u00076eb\u007f%|\u0011buu=21\r")), method1775(method1774(".lrD\u0010")), method1775(method1774(".lrG\u0010")), method1775(method1774("\"r0j")), method1775(method1774(".lrE\u0010")), method1775(method1774("?f1vT)T5|]")), method1775(method1774(">d,T] n9`")), method1775(method1774("7)r(E")), method1775(method1774("$b5aP8J=v")), method1775(method1774(".lr:Q\"n(8\u0010")) };

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field3041 = 0;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field3042 = 0;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lqa;")
    public static class104 field3043;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Ljka;")
    public static class228 field3044;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Lvr;")
    private class584 field3045;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILnu;Lnu;F)Z")
    public final boolean method1771(int arg0, class349 arg1, class349 arg2, float arg3) {
        try {
            field3047++;
            if (!this.method1772((byte) 68)) {
                return false;
            }
            class513 var5 = this.field3040.field2841;
            class487 var6 = new class487(this.field3040, 6408, arg1.field5058, arg1.field5063);
            boolean var7 = false;
            this.field3040.method1613((byte) 77, var5);
            var5.method3922(var6, arg0, 1);
            if (var5.method3923(true)) {
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5889);
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glPushAttrib(2048);
                OpenGL.glViewport(0, 0, arg1.field5058, arg1.field5063);
                OpenGL.glUseProgramObjectARB(this.field3045.field8430);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3045.field8430, field3048[8]), 0);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3045.field8430, field3048[6]), 1.0F / arg3);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3045.field8430, field3048[5]), 1.0F / (float) arg2.field5058, 1.0F / (float) arg2.field5063);
                for (int var8 = 0; var8 < arg1.field5056; var8++) {
                    float var9 = (float) var8 / (float) arg1.field5056;
                    this.field3040.method1618((byte) 12, arg2);
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
                    arg1.method2789(0, 0, var8, (byte) -17, arg1.field5058, arg1.field5063, 0, 0);
                }
                OpenGL.glUseProgramObjectARB(0L);
                OpenGL.glPopAttrib();
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
                OpenGL.glPopMatrix();
                var7 = true;
            }
            var5.method3926(0, (byte) 78);
            this.field3040.method1635(120, var5);
            return var7;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field3048[4] + arg0 + ',' + (arg1 == null ? field3048[3] : field3048[7]) + ',' + (arg2 == null ? field3048[3] : field3048[7]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Z")
    public final boolean method1772(byte arg0) {
        try {
            int var2 = 72 % ((-arg0 - 18) / 63);
            if (this.field3040.field2806 && this.field3040.field2892 && this.field3045 == null) {
                class506 var3 = class558.method4178(35632, this.field3040, field3048[0], -8086);
                if (var3 != null) {
                    this.field3045 = class201.method1729(this.field3040, (byte) -73, new class506[] { var3 });
                }
            }
            field3046++;
            return this.field3045 != null;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3048[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lml;)V")
    public class209(class194 arg0) {
        try {
            this.field3040 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3048[9] + (arg0 == null ? field3048[3] : field3048[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method1773(int arg0) {
        try {
            field3044 = null;
            if (arg0 != 1) {
                method1773(108);
            }
            field3043 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3048[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1774(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1775(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 7;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 6;
                    break;
                default:
                    var10005 = 56;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
