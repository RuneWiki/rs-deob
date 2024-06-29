import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class644 extends class277 {

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "Z")
    private boolean field9063 = false;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Z")
    private boolean field9050 = false;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lpea;")
    private class222 field9057;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Llaa;")
    private class633 field9061;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field9058;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "[[I")
    public static int[][] field9052;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFIFBIII)[F")
    public static final float[] method3596(float arg0, float arg1, int arg2, float arg3, byte arg4, int arg5, int arg6, int arg7) {
        ++field9064;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
        var8[2] = var11;
        var8[8] = var10;
        var8[0] = var10;
        float var12 = 1.0F - var10;
        var8[7] = 0.0F;
        var8[1] = 0.0F;
        var8[6] = -var11;
        var8[3] = 0.0F;
        var8[5] = 0.0F;
        var8[4] = 1.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg5 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (-(var15 * var15) + 1.0F)));
        float var18 = -var15 + 1.0F;
        float var19 = (float) Math.sqrt((double) (arg7 * arg7 - -(arg6 * arg6)));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg6) / var19;
                var16 = (float) arg7 / var19;
            }
            var13[2] = var14 * var16 * var18;
            var13[4] = var15;
            var13[8] = var16 * var16 * var18 + var15;
            var13[1] = var16 * var17;
            var13[3] = -var16 * var17;
            var13[6] = var14 * var16 * var18;
            var13[5] = var14 * var17;
            var13[0] = var14 * var14 * var18 + var15;
            var13[7] = -var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[5] *= arg0;
        var9[1] *= arg3;
        if (arg4 >= -68) {
            method3597(-124, (short[]) null, 127);
        }
        var9[0] *= arg3;
        var9[8] *= arg1;
        var9[4] *= arg0;
        var9[7] *= arg1;
        var9[2] *= arg3;
        var9[6] *= arg1;
        var9[3] *= arg0;
        return var9;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)Z")
    public final boolean method284(byte arg0) {
        if (arg0 > -93) {
            method3599((byte) 110);
        }
        ++field9059;
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method3597(int arg0, short[] arg1, int arg2) {
        ++field9060;
        if (arg0 <= 37) {
            method3599((byte) -18);
        }
        short[] var3 = new short[arg2];
        class293.method1644(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(III)V")
    public static final void method3598(int arg0, int arg1, int arg2) {
        ++field9055;
        class592 var3 = class61.method371(15, arg0, (byte) 88);
        var3.method3256((byte) 11);
        var3.field8314 = arg1;
        var3.field8312 = arg2;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)V")
    public static void method3599(byte arg0) {
        if (arg0 != 3) {
            field9052 = null;
        }
        field9052 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILrg;)V")
    public final void method279(int arg0, int arg1, class615 arg2) {
        if (arg1 != 7) {
            field9052 = null;
        }
        ++field9058;
        if (!this.field9063) {
            super.field3475.method2960(arg2, -2);
            super.field3475.method3005(false, arg0);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)V")
    public final void method280(int arg0, boolean arg1) {
        ++field9056;
        if (arg0 > -64) {
            this.method280(98, false);
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lqj;Lpea;)V")
    public class644(class548 arg0, class222 arg1) {
        super(arg0);
        this.field9057 = arg1;
        if (this.field9057.field2721 != null && super.field3475.field7592 && super.field3475.field7544) {
            class165 var3 = class506.method2719((byte) 105, super.field3475, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class165 var4 = class506.method2719((byte) 124, super.field3475, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field9061 = class220.method1300(new class165[] { var3, var4 }, super.field3475, 0);
            this.field9050 = this.field9061 != null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(IZ)V")
    public final void method277(int arg0, boolean arg1) {
        int var3 = 33 / ((arg0 - 65) / 60);
        ++field9062;
        class33 var4 = super.field3475.method2965(8960);
        if (this.field9050 && var4 != null) {
            super.field3475.method3027(1, true);
            super.field3475.method2960(var4, -2);
            super.field3475.method3027(0, true);
            super.field3475.method2960(this.field9057.field2721, -2);
            long var5 = this.field9061.field8883;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field3475.field7610[0], super.field3475.field7610[1], super.field3475.field7610[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field3475.field7541, super.field3475.field7620, super.field3475.field7534, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field3475.field7610[1]) * 928.0F + 96.0F);
            this.field9063 = true;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
    public final void method276(int arg0, int arg1, int arg2) {
        if (this.field9063) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((260832 & arg2) >> 16) / 8.0F;
            long var8 = this.field9061.field8883;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field3475.field7477 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg1 == 50) {
            ++field9053;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public final void method278(int arg0) {
        ++field9051;
        if (this.field9063) {
            super.field3475.method3027(1, true);
            super.field3475.method2960((class615) null, -2);
            super.field3475.method3027(0, true);
            super.field3475.method2960((class615) null, -2);
            OpenGL.glUseProgramObjectARB(0L);
            this.field9063 = false;
        }
        if (arg0 != 1268) {
            method3597(1, (short[]) null, 79);
        }
    }
}
