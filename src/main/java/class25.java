import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class25 extends class187 {

    @OriginalMember(owner = "client!an", name = "p", descriptor = "Z")
    private boolean field498 = false;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "Z")
    private boolean field496 = false;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "Lol;")
    private class301 field503;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "Lag;")
    private class712 field495;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    public static int field501 = 0;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()V")
    public static final void method165() {
        for (int var0 = 0; var0 < class34.field571.length; ++var0) {
            class34.field571[var0].method2533();
        }
        class34.field571 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V")
    public static final void method166(int arg0, int arg1) {
        ++field497;
        class154 var2 = class396.field5475.method335(-29067);
        if (arg1 != -691366160) {
            field501 = 73;
        }
        while (var2 != null) {
            if ((long) arg0 == (65535L & var2.field2528 >> 48)) {
                var2.method1207(111);
            }
            var2 = class396.field5475.method336(79);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IBLqk;)V")
    public final void method167(int arg0, byte arg1, class18 arg2) {
        if (arg1 != -126) {
            this.method168(false, (byte) 17);
        }
        if (!this.field496) {
            super.field2885.method939(arg2, 8448);
            super.field2885.method999(true, arg0);
        }
        ++field499;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZB)V")
    public final void method168(boolean arg0, byte arg1) {
        ++field505;
        int var3 = 6 / ((arg1 - 36) / 48);
        class34 var4 = super.field2885.method1004(3553);
        if (this.field498 && var4 != null) {
            float var5 = 1.0F + (1.0F - Math.abs(super.field2885.field2022[1])) * 2.0F;
            super.field2885.method1002(1, -5172);
            super.field2885.method939(var4, 8448);
            super.field2885.method1002(0, -5172);
            super.field2885.method939(this.field503.field4138, 8448);
            long var6 = this.field495.field9800;
            OpenGL.glUseProgramObjectARB(var6);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var6, "sunDir"), -super.field2885.field2022[0], -super.field2885.field2022[1], -super.field2885.field2022[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var6, "sunColour"), super.field2885.field2014 * var5, super.field2885.field1977 * var5, super.field2885.field1990 * var5, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var6, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field2885.field2022[1]));
            this.field496 = true;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lhk;Lol;)V")
    public class25(class111 arg0, class301 arg1) {
        super(arg0);
        this.field503 = arg1;
        if (this.field503.field4138 != null && super.field2885.field2043 && super.field2885.field2074) {
            class546 var3 = class692.method3873("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", true, 35633, super.field2885);
            class546 var4 = class692.method3873("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", true, 35632, super.field2885);
            this.field495 = class300.method1927(super.field2885, new class546[] { var3, var4 }, (byte) 31);
            this.field498 = this.field495 != null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
        if (!arg0) {
            this.field498 = false;
        }
        if (this.field496) {
            super.field2885.method1002(1, -5172);
            super.field2885.method939((class18) null, 8448);
            super.field2885.method1002(0, -5172);
            super.field2885.method939((class18) null, 8448);
            OpenGL.glUseProgramObjectARB(0L);
            this.field496 = false;
        }
        ++field494;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IZI)V")
    public final void method170(int arg0, boolean arg1, int arg2) {
        if (this.field496) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << ((63 & arg0) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            float var8 = (float) (15 & arg2 >> 19) / 16.0F;
            float var9 = (float) (arg2 >> 23 & 15) / 16.0F;
            int var10 = arg2 >> 27 & 15;
            long var11 = this.field495.field9800;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field2885.field1938 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field502;
        if (!arg1) {
            this.method168(true, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)Z")
    public final boolean method171(int arg0) {
        ++field500;
        return arg0 != 20220 ? false : this.field498;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IZ)V")
    public final void method172(int arg0, boolean arg1) {
        if (arg0 >= 56) {
            ++field504;
        }
    }
}
