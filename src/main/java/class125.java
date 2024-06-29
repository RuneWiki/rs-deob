import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class125 extends class182 {

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Z")
    private boolean field1748 = false;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Z")
    private boolean field1747 = false;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "Lica;")
    private class215 field1757;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Lte;")
    private class490 field1753;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field1742 = -60;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field1752 = 0;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 5)
    public final void method82(int arg0) {
        if (this.field1747) {
            super.field2540.method2625(arg0 ^ 10229, 1);
            super.field2540.method2627(111, (class262) null);
            super.field2540.method2625(20296, 0);
            super.field2540.method2627(29, (class262) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1747 = false;
        }
        if (arg0 != 26813) {
            this.method83(-24, (class262) null, (byte) 41);
        }
        ++field1756;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILvfa;B)V", line = 26)
    public final void method83(int arg0, class262 arg1, byte arg2) {
        if (!this.field1747) {
            super.field2540.method2627(35, arg1);
            super.field2540.method2650((byte) -103, arg0);
        }
        if (arg2 > 87) {
            ++field1751;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V", line = 48)
    public final void method84(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method83(-115, (class262) null, (byte) 8);
        }
        ++field1754;
        class327 var3 = super.field2540.method2681(-21692);
        if (this.field1748 && var3 != null) {
            super.field2540.method2625(20296, 1);
            super.field2540.method2627(98, var3);
            super.field2540.method2625(20296, 0);
            super.field2540.method2627(44, this.field1757.field2821);
            long var4 = this.field1753.field6786;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field2540.field6448[0], super.field2540.field6448[1], super.field2540.field6448[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field2540.field6498, super.field2540.field6494, super.field2540.field6439, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field2540.field6448[1]) * 928.0F);
            this.field1747 = true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Z", line = 78)
    public final boolean method77(byte arg0) {
        if (arg0 != -96) {
            return false;
        } else {
            ++field1746;
            return false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Z", line = 89)
    public static final boolean method744(int arg0, int arg1) {
        if (arg1 != 45) {
            return true;
        } else {
            ++field1744;
            if (~arg0 != -5 && ~arg0 != -22 && arg0 != 15 && arg0 != 45 && ~arg0 != -1004) {
                return arg0 == 18 || arg0 == 1011;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lag;Lica;)V", line = 107)
    public class125(class469 arg0, class215 arg1) {
        super(arg0);
        this.field1757 = arg1;
        if (this.field1757.field2821 != null && super.field2540.field6540 && super.field2540.field6454) {
            class451 var3 = class362.method2116((byte) -48, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field2540, 35633);
            class451 var4 = class362.method2116((byte) -48, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field2540, 35632);
            this.field1753 = class482.method2780((byte) -53, super.field2540, new class451[] { var3, var4 });
            this.field1748 = this.field1753 != null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)V", line = 126)
    public final void method79(boolean arg0, int arg1) {
        ++field1755;
        if (arg1 >= -21) {
            field1752 = 63;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V", line = 138)
    public final void method81(int arg0, int arg1, int arg2) {
        ++field1749;
        if (this.field1747) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << (7 & arg2 >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            long var8 = this.field1753.field6786;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2540.field6393 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg0 != 2) {
            this.method82(-38);
        }
    }
}
