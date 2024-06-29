import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class369 {

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "Lhd;")
    private class17 field5056;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "Lge;")
    private class104 field5058;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Lge;")
    private class104 field5059;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "Lln;")
    private class254 field5057;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "Lln;")
    private class254 field5060;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "()Z", line = 3)
    public final boolean method2299() {
        if (this.field5056.field295 && this.field5056.field304) {
            if (this.field5057 == null) {
                this.field5057 = class254.method1637(this.field5056, 35632, "const float XO=1.0\n;const float YO=47.0\n;const float ZO=103.0\n;vec4 random(const vec4 s) {\nvec4 z=mod(s,5612.0);\nz=mod(z,2.0*3.141628);\nreturn fract(cos(z)*56784.5354);\n}\nfloat cnoise(const vec3 c, const vec3 period) {\nvec3 ic1=floor(c);\nvec3 fc=c-ic1;\nic1=mod(ic1, period);\nvec3 ic2=mod(ic1+1.0, period);\nvec3 d=(ic2-ic1)*vec3(XO, YO, ZO);\nfloat base=dot(ic1, vec3(XO, YO, ZO));\nvec4 s1=random(base+vec4(0.0,     d.y,     d.z,     d.y+d.z));\nvec4 s2=random(base+vec4(d.x, d.x+d.y, d.x+d.z, d.x+d.y+d.z));\nvec3 f=fc*fc*fc*(fc*(6.0*fc-15.0)+10.0);\nvec4 xi=mix(s1, s2, fc.x);\nreturn 1.0-2.0*mix(mix(xi.x, xi.y, fc.y), mix(xi.z, xi.w, fc.y), fc.z);\n}\n");
            }
            if (this.field5060 == null) {
                this.field5060 = class254.method1637(this.field5056, 35632, "float cnoise(const vec3 c, const vec3 period);\nuniform vec3 scale;\nuniform vec3 scalecoef;\nuniform vec2 amplitude;\nvoid main() {\nfloat n=0.0, a=amplitude.x;\nvec3 p=scale, c=gl_TexCoord[0].xyz;for (int i=0; i<8; ++i) {\nn+=cnoise(c, p)*a;\na*=amplitude.y;\nc*=scalecoef;\np*=scalecoef;\n}\ngl_FragColor=vec4(n*0.5+0.5);\n}\n");
            }
        }
        return this.field5057 != null && this.field5060 != null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lhj;Lhj;)Z", line = 16)
    public final boolean method2300(class106 arg0, class106 arg1) {
        if (!this.method2301()) {
            return false;
        }
        opengl var3 = this.field5056.field198;
        class337 var4 = this.field5056.field253;
        this.field5056.method260(var4);
        var3.glPushMatrix();
        var3.glLoadIdentity();
        var3.glMatrixMode(5889);
        var3.glPushMatrix();
        var3.glLoadIdentity();
        var3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var3.glPushAttrib(2048);
        var3.glViewport(0, 0, arg1.field1553, arg1.field1554);
        this.field5056.method207(arg0);
        var3.glUseProgramObjectARB(this.field5059.field1527);
        var3.glUniform1iARB(var3.glGetUniformLocation(this.field5059.field1527, "heightMap"), 0);
        var3.glUniform2fARB(var3.glGetUniformLocation(this.field5059.field1527, "sampleSize"), 1.0F / (float) arg0.field1553, 1.0F / (float) arg0.field1554);
        boolean var5 = true;
        for (int var6 = 0; var6 < arg1.field1552; var6++) {
            float var7 = (float) var6 / (float) arg1.field1552;
            var4.method2139(0, arg1, var6);
            if (!var4.method2135()) {
                var5 = false;
                break;
            }
            var3.glBegin(7);
            var3.glTexCoord3f(0.0F, 0.0F, var7);
            var3.glVertex2f(0.0F, 0.0F);
            var3.glTexCoord3f(1.0F, 0.0F, var7);
            var3.glVertex2f(1.0F, 0.0F);
            var3.glTexCoord3f(1.0F, 1.0F, var7);
            var3.glVertex2f(1.0F, 1.0F);
            var3.glTexCoord3f(0.0F, 1.0F, var7);
            var3.glVertex2f(0.0F, 1.0F);
            var3.glEnd();
        }
        var3.glUseProgramObjectARB(0);
        var3.glPopAttrib();
        var3.glPopMatrix();
        var3.glMatrixMode(5888);
        var3.glPopMatrix();
        var4.method2138(0);
        this.field5056.method214(var4);
        return var5;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "()Z", line = 75)
    public final boolean method2301() {
        if (this.field5056.field295 && this.field5056.field304 && this.field5059 == null) {
            class254 var1 = class254.method1637(this.field5056, 35632, "uniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, 1.0))*0.5, 1.0);\n}\n");
            this.field5059 = class104.method882(this.field5056, new class254[] { var1 });
        }
        return this.field5059 != null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lhj;Lge;FFFFFFFF)Z", line = 91)
    private final boolean method2302(class106 arg0, class104 arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9) {
        opengl var11 = this.field5056.field198;
        class337 var12 = this.field5056.field253;
        this.field5056.method260(var12);
        var11.glPushMatrix();
        var11.glLoadIdentity();
        var11.glMatrixMode(5889);
        var11.glPushMatrix();
        var11.glLoadIdentity();
        var11.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        var11.glPushAttrib(2048);
        var11.glViewport(0, 0, arg0.field1553, arg0.field1554);
        var11.glUseProgramObjectARB(arg1.field1527);
        var11.glUniform2fARB(var11.glGetUniformLocation(arg1.field1527, "amplitude"), arg8, arg9);
        var11.glUniform3fARB(var11.glGetUniformLocation(arg1.field1527, "scale"), arg2, arg3, arg4);
        var11.glUniform3fARB(var11.glGetUniformLocation(arg1.field1527, "scalecoef"), arg5, arg6, arg7);
        boolean var13 = true;
        for (int var14 = 0; var14 < arg0.field1552; var14++) {
            float var15 = (float) var14 * arg4 / (float) arg0.field1552;
            var12.method2139(0, arg0, var14);
            if (!var12.method2135()) {
                var13 = false;
                break;
            }
            var11.glBegin(7);
            var11.glTexCoord3f(0.0F, 0.0F, var15);
            var11.glVertex2f(0.0F, 0.0F);
            var11.glTexCoord3f(arg2, 0.0F, var15);
            var11.glVertex2f(1.0F, 0.0F);
            var11.glTexCoord3f(arg2, arg3, var15);
            var11.glVertex2f(1.0F, 1.0F);
            var11.glTexCoord3f(0.0F, arg3, var15);
            var11.glVertex2f(0.0F, 1.0F);
            var11.glEnd();
        }
        var11.glUseProgramObjectARB(0);
        var11.glPopAttrib();
        var11.glPopMatrix();
        var11.glMatrixMode(5888);
        var11.glPopMatrix();
        var12.method2138(0);
        this.field5056.method214(var12);
        return var13;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lhj;)Z", line = 153)
    public final boolean method2303(class106 arg0) {
        return this.method2304(arg0, 8, 8.0F, 8.0F, 8.0F, 2.0F, 2.0F, 2.0F, 0.5F, 0.5F);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lhj;IFFFFFFFF)Z", line = 156)
    private final boolean method2304(class106 arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9) {
        if (this.field5058 == null) {
            this.field5058 = class104.method882(this.field5056, new class254[] { this.field5057, this.field5060 });
        }
        return this.field5058 == null ? false : this.method2302(arg0, this.field5058, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lhd;)V", line = 164)
    public class369(class17 arg0) {
        this.field5056 = arg0;
    }
}
