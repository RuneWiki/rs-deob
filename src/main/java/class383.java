import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class383 extends class106 {

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "Z")
    private boolean field5799 = false;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "Z")
    private boolean field5798 = false;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Lpo;")
    private class389 field5791;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Lwf;")
    private class88 field5794;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lvj;Lpo;)V")
    public class383(class303 arg0, class389 arg1) {
        super(arg0);
        this.field5791 = arg1;
        if (this.field5791.field5851 != null && super.field1770.field4523 && super.field1770.field4612) {
            class108 var3 = class88.method693(1, 35633, super.field1770, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class108 var4 = class88.method693(1, 35632, super.field1770, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field5794 = class5.method40(new class108[] { var3, var4 }, false, super.field1770);
            this.field5798 = this.field5794 != null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        if (arg0 != 3) {
            this.field5798 = true;
        }
        ++field5795;
        if (this.field5799) {
            super.field1770.method1929(1, (byte) 63);
            super.field1770.method1990((class492) null, arg0 + 11861);
            super.field1770.method1929(0, (byte) 116);
            super.field1770.method1990((class492) null, arg0 + 11861);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5799 = false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)I")
    public static final int method2377(int arg0, int arg1) {
        if (arg1 != 1023) {
            method2378(-25, 3, -100, 38, -113, true, -81);
        }
        ++field5787;
        return 1023 & arg0;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Z")
    public final boolean method348(int arg0) {
        if (arg0 != -22884) {
            return false;
        } else {
            ++field5792;
            return false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBI)V")
    public final void method347(int arg0, byte arg1, int arg2) {
        if (this.field5799) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            long var8 = this.field5794.field1539;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field1770.field4490 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg1 != 43) {
            this.method347(-92, (byte) -67, 119);
        }
        ++field5793;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method2378(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class98.field1631 = arg2;
        class236.field3422 = arg4;
        ++field5789;
        class403.field6053 = arg6;
        class516.field7587 = arg1;
        class302.field4285 = arg0;
        if (arg5 && class98.field1631 >= 100) {
            class405.field6075 = class403.field6053 * 128 + 64;
            class40.field732 = class236.field3422 * 128 - -64;
            class222.field3184 = class343.method2188(class163.field2525, class40.field732, (byte) -102, class405.field6075) - class302.field4285;
        }
        if (arg3 == 128) {
            class85.field1473 = 2;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILih;)V")
    public final void method346(int arg0, int arg1, class492 arg2) {
        if (arg0 != 128) {
            this.method346(-78, 48, (class492) null);
        }
        if (!this.field5799) {
            super.field1770.method1990(arg2, 11864);
            super.field1770.method1989(-24145, arg1);
        }
        ++field5796;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZB)V")
    public final void method344(boolean arg0, byte arg1) {
        ++field5797;
        if (arg1 <= 102) {
            this.field5791 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)V")
    public final void method343(boolean arg0, int arg1) {
        if (arg1 == 1) {
            ++field5788;
            class221 var3 = super.field1770.method1914((byte) -59);
            if (this.field5798 && var3 != null) {
                super.field1770.method1929(1, (byte) 93);
                super.field1770.method1990(var3, arg1 ^ 11865);
                super.field1770.method1929(0, (byte) 121);
                super.field1770.method1990(this.field5791.field5851, 11864);
                long var4 = this.field5794.field1539;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field1770.field4527[0], -super.field1770.field4527[1], -super.field1770.field4527[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field1770.field4573, super.field1770.field4575, super.field1770.field4536, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field1770.field4527[1]));
                this.field5799 = true;
            }
        }
    }
}
