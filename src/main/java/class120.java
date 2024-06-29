import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class120 extends class304 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Z")
    private boolean field1564 = false;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Z")
    private boolean field1566 = false;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lnc;")
    private class75 field1565;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lb;")
    private class375 field1567;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public final void method627() {
        if (!this.field1566) {
            return;
        }
        this.field4557.method1862(1);
        this.field4557.method1915((class344) null);
        this.field4557.method1862(0);
        this.field4557.method1915((class344) null);
        this.field4557.field4140.glUseProgramObjectARB(0);
        this.field1566 = false;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()Z")
    private final boolean method867() {
        class65 var1 = class65.method564(this.field4557, 35633, "uniform float time;\nuniform vec4 scale;\nvarying vec3 wvVertex;\nvoid main() {\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_Position = gl_ProjectionMatrix*ecVertex;\ngl_TexCoord[0] = vec4(gl_Vertex.xz*0.001953125, time, 1.0)*scale;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\n}\n");
        class65 var2 = class65.method564(this.field4557, 35632, "#extension GL_ARB_texture_rectangle : enable\nvarying vec3 wvVertex;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec3 wnVector = normalize(wvVertex);\nvec3 wnNormal = 2.0*texture3D(normalSampler, gl_TexCoord[0].xyz).rbg-1.0;\nvec3 wnReflection = reflect(wnVector, wnNormal);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat ndote = dot(wnVector, wnNormal);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*0.75)+specularColour;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
        this.field1567 = class375.method2459(this.field4557, new class65[] { var1, var2 });
        return this.field1567 != null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public final void method624(boolean arg0) {
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lgd;)V")
    public final void method629(class344 arg0) {
        if (!this.field1566) {
            this.field4557.method1915(arg0);
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()Z")
    private final boolean method868() {
        class148 var1 = this.field4557.field4162;
        if (var1.method1023() && var1.method1022()) {
            class75 var2 = new class75(this.field4557, 6409, 256, 256, 64);
            if (var1.method1019(var2)) {
                this.field1565 = new class75(this.field4557, 6407, 256, 256, 64);
                if (var1.method1018(var2, this.field1565)) {
                    this.field1565.method2278();
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lse;)V")
    public class120(class282 arg0) {
        super(arg0);
        if (this.field4557.field4241 && this.field4557.field4192 && this.field4557.field4273 && this.field4557.field4212) {
            if (this.method867() && this.method868()) {
                this.field1564 = true;
            } else {
                this.field1565 = null;
                this.field1567 = null;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
    public final void method630(boolean arg0) {
        class141 var2 = this.field4557.method1887();
        if (!this.field1564 || var2 == null) {
            return;
        }
        opengl var3 = this.field4557.field4140;
        this.field4557.method1862(1);
        this.field4557.method1915(var2);
        this.field4557.method1862(0);
        this.field4557.method1915(this.field1565);
        int var4 = this.field1567.field5510;
        var3.glUseProgramObjectARB(var4);
        var3.glUniform1iARB(var3.glGetUniformLocation(var4, "normalSampler"), 0);
        var3.glUniform1iARB(var3.glGetUniformLocation(var4, "envMapSampler"), 1);
        var3.glUniform3fARB(var3.glGetUniformLocation(var4, "sunDir"), this.field4557.field4188[0], -this.field4557.field4188[1], -this.field4557.field4188[2]);
        var3.glUniform4fARB(var3.glGetUniformLocation(var4, "sunColour"), this.field4557.field4216, this.field4557.field4248, this.field4557.field4275, 1.0F);
        var3.glUniform1fARB(var3.glGetUniformLocation(var4, "sunExponent"), Math.abs(this.field4557.field4188[1]) * 928.0F + 96.0F);
        this.field1566 = true;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()Z")
    public final boolean method628() {
        return this.field1564;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public final void method625(int arg0) {
        if (!this.field1566) {
            return;
        }
        opengl var2 = this.field4557.field4140;
        int var3 = 0x1 << (arg0 & 0x3);
        float var4 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
        int var5 = this.field1567.field5510;
        int var6 = var2.glGetUniformLocation(var5, "time");
        int var7 = var2.glGetUniformLocation(var5, "scale");
        var2.glUniform1fARB(var6, (float) (this.field4557.field4153 * var3 % 40000) / 40000.0F);
        var2.glUniform4fARB(var7, var4, var4, 1.0F, 1.0F);
    }
}
