import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class603 extends class337 {

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "Z")
    private boolean field8707 = false;

    @OriginalMember(owner = "client!pw", name = "r", descriptor = "Z")
    private boolean field8711 = false;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "Lpda;")
    private class535 field8703;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "Lpi;")
    private class422 field8702;

    @OriginalMember(owner = "client!pw", name = "p", descriptor = "Lcea;")
    public static class180 field8709 = new class180(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!pw", name = "t", descriptor = "Lvj;")
    public static class373 field8713 = new class373(113, 2);

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!pw", name = "q", descriptor = "I")
    public static int field8710;

    @OriginalMember(owner = "client!pw", name = "s", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V")
    public final void method251(byte arg0) {
        if (this.field8711) {
            super.field4382.method3078(33984, 1);
            super.field4382.method3083((byte) 82, (class238) null);
            super.field4382.method3078(33984, 0);
            super.field4382.method3083((byte) 94, (class238) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8711 = false;
        }
        if (arg0 <= -21) {
            ++field8705;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(BZ)V")
    public final void method252(byte arg0, boolean arg1) {
        if (arg0 > 10) {
            ++field8710;
            class15 var3 = super.field4382.method3111(-98);
            if (this.field8707 && var3 != null) {
                super.field4382.method3078(33984, 1);
                super.field4382.method3083((byte) 103, var3);
                super.field4382.method3078(33984, 0);
                super.field4382.method3083((byte) 117, this.field8703.field7505);
                long var4 = this.field8702.field5446;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field4382.field7859[0], -super.field4382.field7859[1], -super.field4382.field7859[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field4382.field7860, super.field4382.field7774, super.field4382.field7804, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field4382.field7859[1]) * 928.0F + 96.0F);
                this.field8711 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)[Lcu;")
    public static final class185[] method3468(int arg0) {
        if (arg0 != 1) {
            method3468(-94);
        }
        ++field8700;
        return new class185[] { class172.field2095, class64.field631, class551.field8117, class195.field2366, class329.field4297, class566.field8317, class88.field1080, class493.field6879, class313.field3995, class493.field6878, class587.field8513, class89.field1097, class512.field7237, class430.field5838, class267.field3484 };
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lmh;Lpda;)V")
    public class603(class537 arg0, class535 arg1) {
        super(arg0);
        this.field8703 = arg1;
        if (this.field8703.field7505 != null && super.field4382.field7863 && super.field4382.field7763) {
            class187 var3 = class381.method2206(super.field4382, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", (byte) 79);
            class187 var4 = class381.method2206(super.field4382, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", (byte) 79);
            this.field8702 = class628.method3598(new class187[] { var3, var4 }, super.field4382, (byte) -3);
            this.field8707 = this.field8702 != null;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IBLuu;)V")
    public final void method253(int arg0, byte arg1, class238 arg2) {
        if (arg1 != 93) {
            this.method257((byte) 85);
        }
        if (!this.field8711) {
            super.field4382.method3083((byte) 76, arg2);
            super.field4382.method3063(arg0, (byte) -107);
        }
        ++field8708;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V")
    public static void method3469(boolean arg0) {
        if (arg0) {
            field8709 = null;
            field8713 = null;
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)Z")
    public final boolean method257(byte arg0) {
        if (arg0 <= 115) {
            return false;
        } else {
            ++field8706;
            return false;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZI)V")
    public final void method256(boolean arg0, int arg1) {
        if (arg1 != 28300) {
            this.method258(false, -3, -5);
        }
        ++field8712;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZII)V")
    public final void method258(boolean arg0, int arg1, int arg2) {
        ++field8701;
        if (this.field8711) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << ((arg1 & 56) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            long var8 = this.field8702.field5446;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field4382.field7730 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg0) {
            method3468(-122);
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)B")
    public static final byte method3470(int arg0, int arg1, int arg2) {
        ++field8704;
        if (arg0 != 9) {
            return 0;
        } else {
            if (arg2 != 2) {
                method3468(-108);
            }
            return (byte) ((arg1 & 1) == 0 ? 1 : 2);
        }
    }

    static {
        new class180(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }
}
