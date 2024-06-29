import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class597 extends class27 {

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Z")
    private boolean field8337 = false;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Z")
    private boolean field8351 = false;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Lud;")
    private class33 field8347;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Lwba;")
    private class46 field8349;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "[I")
    public static int[] field8342 = new int[16384];

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "[I")
    public static int[] field8344 = new int[16384];

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field8341 = 0;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field8336;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    public final void method261(int arg0, int arg1, int arg2) {
        ++field8336;
        if (arg2 == 4) {
            if (this.field8337) {
                int var4 = 1 << (arg0 & 3);
                float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
                int var6 = 65535 & arg1;
                float var7 = (float) ((227825 & arg1) >> 16) / 8.0F;
                float var8 = (float) (arg1 >> 19 & 15) / 16.0F;
                float var9 = (float) ((127608514 & arg1) >> 23) / 16.0F;
                int var10 = 15 & arg1 >> 27;
                long var11 = this.field8349.field552;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field337.field7834 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILvf;)V")
    public final void method257(int arg0, int arg1, class136 arg2) {
        if (arg1 != -10479) {
            this.field8347 = null;
        }
        ++field8339;
        if (!this.field8337) {
            super.field337.method3206(arg2, (byte) 26);
            super.field337.method3205(5123, arg0);
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Llj;Lud;)V")
    public class597(class565 arg0, class33 arg1) {
        super(arg0);
        this.field8347 = arg1;
        if (this.field8347.field408 != null && super.field337.field7877 && super.field337.field7890) {
            class17 var3 = class78.method604((byte) -116, super.field337, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class17 var4 = class78.method604((byte) -123, super.field337, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field8349 = class138.method966((byte) -66, super.field337, new class17[] { var3, var4 });
            this.field8351 = this.field8349 != null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Z")
    public final boolean method260(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field8346;
            return this.field8351;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BZII)V")
    public static final void method3370(byte arg0, boolean arg1, int arg2, int arg3) {
        ++field8348;
        if (arg2 >= 8000 && ~arg2 >= -48001) {
            int var4 = -70 % ((arg0 - 31) / 54);
            class506.field6945 = arg1;
            class357.field4736 = arg2;
            class121.field1673 = arg3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
    public final void method263(boolean arg0, int arg1) {
        if (arg1 != 8) {
            this.field8337 = true;
        }
        ++field8343;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILrc;)V")
    public static final void method3371(int arg0, class499 arg1) {
        ++field8340;
        if (!class541.field7327) {
            if (arg0 != -8257) {
                field8341 = -94;
            }
            arg1.method2340(93);
            --class137.field1948;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method3372(int arg0) {
        field8344 = null;
        if (arg0 != 1) {
            method3372(102);
        }
        field8342 = null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public static final void method3373(int arg0) {
        ++field8350;
        if (arg0 != 0) {
            method3372(64);
        }
        class193.field2746.method3749(arg0 ^ 7648);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public final void method256(byte arg0) {
        ++field8338;
        if (this.field8337) {
            super.field337.method3220(0, 1);
            super.field337.method3206((class136) null, (byte) 26);
            super.field337.method3220(arg0 ^ 50, 0);
            super.field337.method3206((class136) null, (byte) 26);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8337 = false;
        }
        if (arg0 != 50) {
            method3372(-55);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BZ)V")
    public final void method258(byte arg0, boolean arg1) {
        ++field8345;
        if (arg0 < -80) {
            class696 var3 = super.field337.method3168((byte) -114);
            if (this.field8351 && var3 != null) {
                float var4 = 1.0F + (1.0F - Math.abs(super.field337.field7923[1])) * 2.0F;
                super.field337.method3220(0, 1);
                super.field337.method3206(var3, (byte) 26);
                super.field337.method3220(0, 0);
                super.field337.method3206(this.field8347.field408, (byte) 26);
                long var5 = this.field8349.field552;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field337.field7923[0], -super.field337.field7923[1], -super.field337.field7923[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field337.field7948 * var4, super.field337.field7963 * var4, super.field337.field7975 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field337.field7923[1]) + 64.0F);
                this.field8337 = true;
            }
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field8342[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field8344[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }
}
