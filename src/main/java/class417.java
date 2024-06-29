import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class417 {

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Lhk;")
    private class111 field5704;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "[I")
    public static int[] field5700 = new int[2048];

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "J")
    public static long field5699;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Lsk;")
    public static class650 field5701;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lag;")
    private class712 field5703;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)Z")
    public final boolean method2456(boolean arg0) {
        if (!arg0) {
            this.method2456(false);
        }
        if (this.field5704.field2041 && this.field5704.field2074 && this.field5703 == null) {
            class546 var2 = class692.method3873("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", true, 35632, this.field5704);
            if (var2 != null) {
                this.field5703 = class300.method1927(this.field5704, new class546[] { var2 }, (byte) 31);
            }
        }
        field5697++;
        return this.field5703 != null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method2457(byte arg0) {
        field5700 = null;
        field5701 = null;
        if (arg0 != 24) {
            method2457((byte) 13);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lew;ILew;F)Z")
    public final boolean method2458(class520 arg0, int arg1, class520 arg2, float arg3) {
        field5702++;
        if (arg1 != 1) {
            return false;
        } else if (this.method2456(true)) {
            class621 var5 = this.field5704.field1978;
            class63 var6 = new class63(this.field5704, 6408, arg0.field7053, arg0.field7052);
            this.field5704.method934(false, var5);
            boolean var7 = false;
            var5.method3496(-125, var6, 0);
            if (var5.method3497((byte) 89)) {
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5889);
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glPushAttrib(2048);
                OpenGL.glViewport(0, 0, arg0.field7053, arg0.field7052);
                OpenGL.glUseProgramObjectARB(this.field5703.field9800);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field5703.field9800, "heightMap"), 0);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field5703.field9800, "rcpRelief"), 1.0F / arg3);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field5703.field9800, "sampleSize"), 1.0F / (float) arg2.field7053, 1.0F / (float) arg2.field7052);
                for (int var8 = 0; var8 < arg0.field7051; var8++) {
                    float var9 = (float) var8 / (float) arg0.field7051;
                    this.field5704.method939(arg2, arg1 ^ 0x2101);
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
                    arg0.method2957(var8, 0, 0, 0, arg0.field7052, arg0.field7053, 0, (byte) -41);
                }
                OpenGL.glUseProgramObjectARB(0L);
                OpenGL.glPopAttrib();
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
                OpenGL.glPopMatrix();
                var7 = true;
            }
            var5.method3500((byte) 125, 0);
            this.field5704.method954(arg1, var5);
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lhk;)V")
    public class417(class111 arg0) {
        this.field5704 = arg0;
    }
}
