import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class311 extends class157 {

    @OriginalMember(owner = "client!so", name = "c", descriptor = "Z")
    private boolean field4211 = false;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "Z")
    private boolean field4213 = false;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "Lhj;")
    private class106 field4212;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "Lge;")
    private class104 field4210;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lvd;)V", line = 3)
    public final void method557(class4 arg0) {
        if (!this.field4213) {
            this.field2366.method207(arg0);
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "()V", line = 10)
    public final void method552() {
        if (!this.field4213) {
            return;
        }
        this.field2366.method176(1);
        this.field2366.method207((class4) null);
        this.field2366.method176(0);
        this.field2366.method207((class4) null);
        this.field2366.field198.glUseProgramObjectARB(0);
        this.field4213 = false;
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "()Z", line = 25)
    private final boolean method1990() {
        class369 var1 = this.field2366.field217;
        if (var1.method2299() && var1.method2301()) {
            class106 var2 = new class106(this.field2366, 6409, 256, 256, 64);
            if (var1.method2303(var2)) {
                this.field4212 = new class106(this.field2366, 6407, 256, 256, 64);
                if (var1.method2300(var2, this.field4212)) {
                    this.field4212.method27();
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!so", name = "d", descriptor = "()Z", line = 48)
    private final boolean method1991() {
        class254 var1 = class254.method1637(this.field2366, 35633, "uniform float time;\nuniform vec4 scale;\nvarying vec3 wvVertex;\nvoid main() {\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_Position = gl_ProjectionMatrix*ecVertex;\ngl_TexCoord[0] = vec4(gl_Vertex.xz*0.001953125, time, 1.0)*scale;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\n}\n");
        class254 var2 = class254.method1637(this.field2366, 35632, "#extension GL_ARB_texture_rectangle : enable\nvarying vec3 wvVertex;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec3 wnVector = normalize(wvVertex);\nvec3 wnNormal = 2.0*texture3D(normalSampler, gl_TexCoord[0].xyz).rbg-1.0;\nvec3 wnReflection = reflect(wnVector, wnNormal);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat ndote = dot(wnVector, wnNormal);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*0.75)+specularColour;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
        this.field4210 = class104.method882(this.field2366, new class254[] { var1, var2 });
        return this.field4210 != null;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)V", line = 56)
    public final void method554(boolean arg0) {
        class181 var2 = this.field2366.method96();
        if (!this.field4211 || var2 == null) {
            return;
        }
        opengl var3 = this.field2366.field198;
        this.field2366.method176(1);
        this.field2366.method207(var2);
        this.field2366.method176(0);
        this.field2366.method207(this.field4212);
        int var4 = this.field4210.field1527;
        var3.glUseProgramObjectARB(var4);
        var3.glUniform1iARB(var3.glGetUniformLocation(var4, "normalSampler"), 0);
        var3.glUniform1iARB(var3.glGetUniformLocation(var4, "envMapSampler"), 1);
        var3.glUniform3fARB(var3.glGetUniformLocation(var4, "sunDir"), this.field2366.field242[0], -this.field2366.field242[1], -this.field2366.field242[2]);
        var3.glUniform4fARB(var3.glGetUniformLocation(var4, "sunColour"), this.field2366.field281, this.field2366.field316, this.field2366.field230, 1.0F);
        var3.glUniform1fARB(var3.glGetUniformLocation(var4, "sunExponent"), Math.abs(this.field2366.field242[1]) * 928.0F + 96.0F);
        this.field4213 = true;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "()Z", line = 78)
    public final boolean method555() {
        return this.field4211;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lhd;)V", line = 85)
    public class311(class17 arg0) {
        super(arg0);
        if (this.field2366.field283 && this.field2366.field287 && this.field2366.field304 && this.field2366.field295) {
            if (this.method1991() && this.method1990()) {
                this.field4211 = true;
            } else {
                this.field4212 = null;
                this.field4210 = null;
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 101)
    public final void method553(int arg0) {
        if (!this.field4213) {
            return;
        }
        opengl var2 = this.field2366.field198;
        int var3 = 0x1 << (arg0 & 0x3);
        float var4 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
        int var5 = this.field4210.field1527;
        int var6 = var2.glGetUniformLocation(var5, "time");
        int var7 = var2.glGetUniformLocation(var5, "scale");
        var2.glUniform1fARB(var6, (float) (this.field2366.field210 * var3 % 40000) / 40000.0F);
        var2.glUniform4fARB(var7, var4, var4, 1.0F, 1.0F);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V", line = 126)
    public final void method556(boolean arg0) {
    }
}
