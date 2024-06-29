import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class516 extends class446 {

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Z")
    private boolean field7480 = false;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "Z")
    private boolean field7483 = false;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "Lai;")
    private class428 field7484;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "Lvo;")
    private class32 field7486;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "[[I")
    public static int[][] field7481 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "J")
    public static long field7485;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BZ)V")
    public final void method695(byte arg0, boolean arg1) {
        if (arg0 != -33) {
            this.method688(-45);
        }
        ++field7489;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)Z")
    public final boolean method691(byte arg0) {
        if (arg0 != -93) {
            this.method688(-8);
        }
        ++field7492;
        return false;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
    public final void method688(int arg0) {
        ++field7487;
        if (this.field7480) {
            super.field6642.method392((byte) 106, 1);
            super.field6642.method381((byte) 28, (class381) null);
            super.field6642.method392((byte) 106, 0);
            super.field6642.method381((byte) 28, (class381) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field7480 = false;
        }
        if (arg0 < 5) {
            method3071(true);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
    public static void method3071(boolean arg0) {
        if (!arg0) {
            method3071(true);
        }
        field7481 = null;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lda;Lai;)V")
    public class516(class44 arg0, class428 arg1) {
        super(arg0);
        this.field7484 = arg1;
        if (this.field7484.field6407 != null && super.field6642.field859 && super.field6642.field887) {
            class466 var3 = class257.method1658(35633, super.field6642, 2, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class466 var4 = class257.method1658(35632, super.field6642, 2, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field7486 = class244.method1592(false, super.field6642, new class466[] { var3, var4 });
            this.field7483 = this.field7486 != null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V")
    public final void method689(int arg0, int arg1, int arg2) {
        ++field7491;
        if (arg0 != -1) {
            this.field7483 = true;
        }
        if (this.field7480) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((221413 & arg2) >> 16) / 8.0F;
            long var8 = this.field7486.field504;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field6642.field806 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZB)V")
    public final void method696(boolean arg0, byte arg1) {
        ++field7482;
        class46 var3 = super.field6642.method395(arg1);
        if (this.field7483 && var3 != null) {
            super.field6642.method392((byte) 106, 1);
            super.field6642.method381((byte) 28, var3);
            super.field6642.method392((byte) 106, 0);
            super.field6642.method381((byte) 28, this.field7484.field6407);
            long var4 = this.field7486.field504;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field6642.field863[0], -super.field6642.field863[1], -super.field6642.field863[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field6642.field862, super.field6642.field864, super.field6642.field919, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field6642.field863[1]) + 96.0F);
            this.field7480 = true;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IILac;)V")
    public final void method694(int arg0, int arg1, class381 arg2) {
        ++field7488;
        if (!this.field7480) {
            super.field6642.method381((byte) 28, arg2);
            super.field6642.method288((byte) -101, arg0);
        }
        if (arg1 != 0) {
            this.method696(true, (byte) 49);
        }
    }
}
