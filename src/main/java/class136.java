import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class136 extends class118 {

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Z")
    private boolean field1805 = false;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "Z")
    private boolean field1807 = false;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "Lkm;")
    private class120 field1812;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "Ldca;")
    private class501 field1804;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field1799 = 0;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Ljda;")
    public static class278 field1806;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1813;

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Los;Lkm;)V", line = 131)
    public class136(class468 arg0, class120 arg1) {
        super(arg0);
        this.field1812 = arg1;
        if (this.field1812.field1553 != null && super.field1544.field7091 && super.field1544.field7077) {
            class346 var3 = class331.method2082("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field1544, 0, 35633);
            class346 var4 = class331.method2082("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field1544, 0, 35632);
            this.field1804 = class169.method1072(1951, new class346[] { var3, var4 }, super.field1544);
            this.field1805 = this.field1804 != null;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)[Lae;", line = 19)
    public static final class40[] method837(int arg0) {
        if (arg0 != -5217) {
            return null;
        } else {
            ++field1801;
            return new class40[] { class21.field187, class434.field6355, class464.field6703 };
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBI)V", line = 31)
    public final void method445(int arg0, byte arg1, int arg2) {
        if (arg1 != 23) {
            field1799 = 12;
        }
        if (this.field1807) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((56 & arg0) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((arg2 & 232886) >> 16) / 8.0F;
            long var8 = this.field1804.field7498;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field1544.field6961 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field1809;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V", line = 60)
    public static void method838(int arg0) {
        if (arg0 != 1) {
            field1813 = null;
        }
        field1813 = null;
        field1806 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Z", line = 73)
    public final boolean method446(byte arg0) {
        ++field1802;
        return arg0 != 29;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 89)
    public final void method441(int arg0) {
        ++field1811;
        int var2 = 15 / ((arg0 - -58) / 41);
        if (this.field1807) {
            super.field1544.method2842(1, (byte) 42);
            super.field1544.method2811((class541) null, -2);
            super.field1544.method2842(0, (byte) 42);
            super.field1544.method2811((class541) null, -2);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1807 = false;
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V", line = 109)
    public static final void method839(int arg0) {
        ++field1800;
        if (!class94.field1158.method2675(0, class239.field3499) && class97.field1205 != class355.field5157) {
            class11.method53(false, class184.field2798, -5762, 10, class157.field2003);
        } else {
            class262.method1681(class379.field5558, (byte) -83);
            if (arg0 != 16933) {
                method837(-92);
            }
            if (class355.field5157 != class118.field1542) {
                class552.method3230(-2617);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZB)V", line = 150)
    public final void method442(boolean arg0, byte arg1) {
        ++field1810;
        if (arg1 >= -101) {
            this.method445(33, (byte) 119, -124);
        }
        class227 var3 = super.field1544.method2819((byte) -12);
        if (this.field1805 && var3 != null) {
            super.field1544.method2842(1, (byte) 42);
            super.field1544.method2811(var3, -2);
            super.field1544.method2842(0, (byte) 42);
            super.field1544.method2811(this.field1812.field1553, -2);
            long var4 = this.field1804.field7498;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field1544.field7036[0], -super.field1544.field7036[1], -super.field1544.field7036[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field1544.field7063, super.field1544.field7001, super.field1544.field7069, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field1544.field7036[1]));
            this.field1807 = true;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BZ)V", line = 180)
    public final void method439(byte arg0, boolean arg1) {
        if (arg0 != 56) {
            this.method445(67, (byte) 78, -72);
        }
        ++field1803;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lbaa;IB)V", line = 190)
    public final void method440(class541 arg0, int arg1, byte arg2) {
        ++field1808;
        if (arg2 > -17) {
            field1806 = null;
        }
        if (!this.field1807) {
            super.field1544.method2811(arg0, -2);
            super.field1544.method2791(arg1, (byte) -85);
        }
    }
}
