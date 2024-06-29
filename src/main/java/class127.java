import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class127 extends class209 {

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "Z")
    private boolean field1574 = false;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "Z")
    private boolean field1579 = false;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "Lln;")
    private class94 field1583;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "Lqca;")
    private class610 field1575;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "Luv;")
    public static class3 field1576 = new class3(80, 4);

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
    public final void method45(int arg0, int arg1, int arg2) {
        if (arg2 >= -75) {
            this.method42(true);
        }
        ++field1582;
        if (this.field1579) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (arg1 >> 16 & 3) / 8.0F;
            long var8 = this.field1575.field8770;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2710.field4198 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(ZB)V")
    public final void method48(boolean arg0, byte arg1) {
        ++field1586;
        if (arg1 < 122) {
            field1580 = 55;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
    public final void method43(int arg0) {
        ++field1587;
        if (this.field1579) {
            super.field2710.method1966(3000, 1);
            super.field2710.method1884((class148) null, -2);
            super.field2710.method1966(arg0 ^ -3001, 0);
            super.field2710.method1884((class148) null, arg0 + -1);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1579 = false;
        }
        if (arg0 != -1) {
            this.field1574 = false;
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V")
    public static void method681(int arg0) {
        field1576 = null;
        if (arg0 != 365) {
            field1580 = -37;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        ++field1577;
        return !arg0 ? false : false;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Luq;Lln;)V")
    public class127(class313 arg0, class94 arg1) {
        super(arg0);
        this.field1583 = arg1;
        if (this.field1583.field1241 != null && super.field2710.field4299 && super.field2710.field4274) {
            class364 var3 = class579.method3253("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field2710, 35633, false);
            class364 var4 = class579.method3253("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field2710, 35632, false);
            this.field1575 = class643.method3710(super.field2710, 113, new class364[] { var3, var4 });
            this.field1574 = this.field1575 != null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 > 112) {
            ++field1581;
            class596 var10 = null;
            for (class596 var11 = (class596) class556.field7781.method3188((byte) -100); var11 != null; var11 = (class596) class556.field7781.method3182((byte) -80)) {
                if (var11.field8599 == arg9 && ~var11.field8595 == ~arg2 && var11.field8590 == arg8 && var11.field8602 == arg4) {
                    var10 = var11;
                    break;
                }
            }
            if (var10 == null) {
                var10 = new class596();
                var10.field8590 = arg8;
                var10.field8595 = arg2;
                var10.field8602 = arg4;
                var10.field8599 = arg9;
                if (arg2 >= 0 && arg8 >= 0 && arg2 < class139.field1760 && ~arg8 > ~class369.field5135) {
                    class474.method2694(var10, -14227);
                }
                class556.field7781.method3181(var10, true);
            }
            var10.field8603 = arg3;
            var10.field8594 = arg0;
            var10.field8588 = arg5;
            var10.field8591 = arg7;
            var10.field8598 = arg1;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lea;IZ)V")
    public final void method44(class148 arg0, int arg1, boolean arg2) {
        ++field1573;
        if (!this.field1579) {
            super.field2710.method1884(arg0, -2);
            super.field2710.method1909(-114, arg1);
        }
        if (!arg2) {
            this.field1579 = true;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([JB[I)V")
    public static final void method683(long[] arg0, byte arg1, int[] arg2) {
        class132.method700(false, arg0, arg0.length + -1, 0, arg2);
        ++field1585;
        if (arg1 != 48) {
            field1580 = -54;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZB)V")
    public final void method47(boolean arg0, byte arg1) {
        ++field1578;
        class415 var3 = super.field2710.method1929((byte) -43);
        if (arg1 >= 88) {
            if (this.field1574 && var3 != null) {
                super.field2710.method1966(3000, 1);
                super.field2710.method1884(var3, -2);
                super.field2710.method1966(3000, 0);
                super.field2710.method1884(this.field1583.field1241, -2);
                long var4 = this.field1575.field8770;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field2710.field4284[0], -super.field2710.field4284[1], -super.field2710.field4284[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field2710.field4312, super.field2710.field4235, super.field2710.field4252, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field2710.field4284[1]) * 928.0F);
                this.field1579 = true;
            }
        }
    }
}
