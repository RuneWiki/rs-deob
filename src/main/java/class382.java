import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oka")
public class class382 {

    @OriginalMember(owner = "client!oka", name = "e", descriptor = "Lvf;")
    private class159 field6135;

    @OriginalMember(owner = "client!oka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6145 = new String[] { method3128(method3127("g{2?")), method3128(method3127("zo3#7l]7)>")), method3128(method3127("ak743}C?#")), method3128(method3127("r p}&")), method3128(method3127("fe?}\u001f!")), method3128(method3127("{m.\u0001>eg;5")), method3128(method3127("fe?}g``7'e!")), method3128(method3127("fe?}\u0019!")), method3128(method3127("|`754{c~57fo*s)j~\f67`k8hQ|`754{c~%>j<~ :d~26\b`t;hQ|`754{c~ :d~26):J~;>`i6'\u0016h~eY-fg:s6hg0{r)uT57fo*s?q.cs/lv*&)l=\u001a{3lg9;/Do.\u007f{\u007fk=`s$}?>+ek\r:!l &\u007f{9 n\u007f{9 nzpnb\u0001\u0007>qM1<)mUn\u000euqw$zu{.ss/lv*&)l=\u001a{3lg9;/Do.\u007f{\u007fk=`szo3#7l]7)>'vrsk'>rsk'>wx<eQ\n6#Ja1!?R>\u0003}#ptw})2\u00048?4hz~7\")3~'>qz+!>:Jv;>`i6'\u0016h~rs-lmm{k'>rsvzo3#7l]7)>'wrsk'>wx<eQ\n6#Ja1!?R>\u0003}#ptw}))#~'>qz+!>:Jv;>`i6'\u0016h~rs-lmm{k'>rs(hc.?>Zg$6up\"~cu9'u47VZ;+\u0018fa,7\u00009Sp+\"s'p!`\u0003i2\f\u001d{o9\u00104ea,sf)x;0o!>pfpga,>:eg$6s\u007fk=`smvrs?p\"~!8y\\;?2lhwzq9 k\u007f{}k&'.{km\u0017sak743}C?#w)i2\f\u000flv\u001d<4{j\u0005c\u0006'v')r'|whQt\u0004")), method3128(method3127("fe?}\u001a!")), method3128(method3127("fe?}\u0018!")) };

    @OriginalMember(owner = "client!oka", name = "f", descriptor = "I")
    public static int field6136 = -1;

    @OriginalMember(owner = "client!oka", name = "b", descriptor = "Z")
    public static boolean field6142 = true;

    @OriginalMember(owner = "client!oka", name = "d", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!oka", name = "k", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!oka", name = "c", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!oka", name = "h", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!oka", name = "i", descriptor = "Lir;")
    private class25 field6138;

    @OriginalMember(owner = "client!oka", name = "a", descriptor = "Lda;")
    public static class64 field6141;

    @OriginalMember(owner = "client!oka", name = "j", descriptor = "[Lnh;")
    public static class781[] field6139;

    @OriginalMember(owner = "client!oka", name = "g", descriptor = "[[B")
    public static byte[][] field6143;

    @OriginalMember(owner = "client!oka", name = "a", descriptor = "(IIIII)V", line = 9)
    public static final void method3123(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg4 != 0) {
                method3126(-13);
            }
            field6140++;
            class551 var5 = class380.method3113(-119, (long) arg0 << 32 | (long) arg1, 19);
            var5.method4086(73);
            var5.field8076 = arg2;
            var5.field8073 = arg3;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6145[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "a", descriptor = "(ZFLbe;Lbe;)Z", line = 24)
    public final boolean method3124(boolean arg0, float arg1, class38 arg2, class38 arg3) {
        try {
            field6134++;
            if (!this.method3125(7)) {
                return false;
            }
            class639 var5 = this.field6135.field2525;
            class449 var6 = new class449(this.field6135, 6408, arg3.field437, arg3.field433);
            boolean var7 = arg0;
            this.field6135.method1424(var5, (byte) -29);
            var5.method4633(-128, var6, 0);
            if (var5.method4624(-36054)) {
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5889);
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glPushAttrib(2048);
                OpenGL.glViewport(0, 0, arg3.field437, arg3.field433);
                OpenGL.glUseProgramObjectARB(this.field6138.field272);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field6138.field272, field6145[2]), 0);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field6138.field272, field6145[5]), 1.0F / arg1);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field6138.field272, field6145[1]), 1.0F / (float) arg2.field437, 1.0F / (float) arg2.field433);
                for (int var8 = 0; var8 < arg3.field439; var8++) {
                    float var9 = (float) var8 / (float) arg3.field439;
                    this.field6135.method1497(arg2, true);
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
                    arg3.method370(var8, 0, arg3.field433, 0, 0, 0, arg3.field437, 0);
                }
                OpenGL.glUseProgramObjectARB(0L);
                OpenGL.glPopAttrib();
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
                var7 = true;
                OpenGL.glPopMatrix();
            }
            var5.method4627(0, -20878);
            this.field6135.method1502(var5, -113);
            return var7;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6145[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6145[0] : field6145[3]) + ',' + (arg3 == null ? field6145[0] : field6145[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "a", descriptor = "(I)Z", line = 93)
    public final boolean method3125(int arg0) {
        try {
            field6137++;
            if (arg0 != 7) {
                this.method3124(false, -0.5830933F, null, null);
            }
            if (this.field6135.field2532 && this.field6135.field2518 && this.field6138 == null) {
                class789 var2 = class102.method970(35632, field6145[8], -7876, this.field6135);
                if (var2 != null) {
                    this.field6138 = class728.method5279(new class789[] { var2 }, 3, this.field6135);
                }
            }
            return this.field6138 != null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6145[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "<init>", descriptor = "(Lvf;)V", line = 118)
    public class382(class159 arg0) {
        try {
            this.field6135 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6145[6] + (arg0 == null ? field6145[0] : field6145[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "b", descriptor = "(I)V", line = 126)
    public static void method3126(int arg0) {
        try {
            if (arg0 == 0) {
                field6143 = null;
                field6141 = null;
                field6139 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6145[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3127(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3128(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 83;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
