import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class445 extends class125 {

    @OriginalMember(owner = "client!go", name = "r", descriptor = "Z")
    private boolean field6475 = false;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "Z")
    private boolean field6476 = false;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "Lqf;")
    private class482 field6467;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "Luq;")
    private class113 field6468;

    @OriginalMember(owner = "client!go", name = "v", descriptor = "Lho;")
    public static class103 field6479 = new class103(31, 0);

    @OriginalMember(owner = "client!go", name = "y", descriptor = "I")
    public static int field6482 = 0;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!go", name = "w", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!go", name = "x", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!go", name = "A", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!go", name = "z", descriptor = "[I")
    public static int[] field6483;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIB)V")
    public static final void method2747(int arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            method2750(93L, (byte) 89);
        }
        ++field6472;
        class184 var3 = class277.method1682(arg1, 16, -92);
        var3.method1069(true);
        var3.field2393 = arg0;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
    public final void method667(int arg0) {
        if (arg0 == -18112) {
            ++field6469;
            if (this.field6475) {
                super.field1617.method2250((byte) 86, 1);
                super.field1617.method2236((class252) null, 105);
                super.field1617.method2250((byte) 121, 0);
                super.field1617.method2236((class252) null, arg0 + 18083);
                OpenGL.glUseProgramObjectARB(0L);
                this.field6475 = false;
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljn;Ljn;I)V")
    public static final void method2748(class507 arg0, class507 arg1, int arg2) {
        if (arg2 != 29359) {
            field6479 = null;
        }
        ++field6484;
        if (arg1.field7346 != null) {
            arg1.method3022((byte) 54);
        }
        arg1.field7345 = arg0.field7345;
        arg1.field7346 = arg0;
        arg1.field7346.field7345 = arg1;
        arg1.field7345.field7346 = arg1;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILhe;I)V")
    public final void method669(int arg0, class252 arg1, int arg2) {
        if (!this.field6475) {
            super.field1617.method2236(arg1, -23);
            super.field1617.method2260(16640, arg2);
        }
        ++field6481;
        if (arg0 != 67) {
            method2752(true, -67);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2749(int arg0, byte arg1, int arg2) {
        ++field6480;
        if (arg1 != 9) {
            field6482 = 54;
        }
        return ~(arg2 & 16) != -1;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(ZI)V")
    public final void method665(boolean arg0, int arg1) {
        ++field6474;
        if (arg1 <= 92) {
            this.field6475 = true;
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lur;Lqf;)V")
    public class445(class377 arg0, class482 arg1) {
        super(arg0);
        this.field6467 = arg1;
        if (this.field6467.field7120 != null && super.field1617.field5409 && super.field1617.field5378) {
            class346 var3 = class113.method686("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, 42, super.field1617);
            class346 var4 = class113.method686("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, -93, super.field1617);
            this.field6468 = class151.method904((byte) 71, new class346[] { var3, var4 }, super.field1617);
            this.field6476 = this.field6468 != null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(JB)V")
    public static final void method2750(long arg0, byte arg1) {
        ++field6470;
        class106.field1443.field5729 = 0;
        if (arg1 > 116) {
            class106.field1443.method2449((byte) 122, class459.field6855.field782);
            class106.field1443.method2422(arg0, 123);
            class106.field1443.method2449((byte) 125, class374.field5072);
            class114.field1497 = 1;
            class173.field2226 = -3;
            class225.field3030 = 0;
            class329.field4373 = 0;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(III)V")
    public final void method662(int arg0, int arg1, int arg2) {
        ++field6471;
        if (this.field6475) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << (7 & arg2 >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            long var8 = this.field6468.field1485;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field1617.field5310 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg0 > -35) {
            method2751(-128);
        }
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(I)V")
    public static void method2751(int arg0) {
        field6483 = null;
        if (arg0 != 0) {
            method2750(26L, (byte) 37);
        }
        field6479 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)V")
    public final void method668(boolean arg0, int arg1) {
        ++field6477;
        class139 var3 = super.field1617.method2268(30323);
        if (arg1 != 0) {
            this.method665(false, -40);
        }
        if (this.field6476 && var3 != null) {
            super.field1617.method2250((byte) 59, 1);
            super.field1617.method2236(var3, 5);
            super.field1617.method2250((byte) 107, 0);
            super.field1617.method2236(this.field6467.field7120, 124);
            long var4 = this.field6468.field1485;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field1617.field5345[0], -super.field1617.field5345[1], -super.field1617.field5345[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field1617.field5448, super.field1617.field5353, super.field1617.field5438, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field1617.field5345[1]) * 928.0F + 96.0F);
            this.field6475 = true;
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(ZI)V")
    public static final void method2752(boolean arg0, int arg1) {
        if (!arg0) {
            method2750(-118L, (byte) 79);
        }
        for (class435 var2 = class179.field2317.method300((byte) -113); var2 != null; var2 = class179.field2317.method301(-118)) {
            if ((long) arg1 == (var2.field6348 >> 48 & 65535L)) {
                var2.method2674(true);
            }
        }
        ++field6478;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z")
    public final boolean method666(int arg0) {
        ++field6473;
        int var2 = -84 % ((arg0 - 11) / 63);
        return false;
    }
}
