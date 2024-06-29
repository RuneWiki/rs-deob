import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class411 extends class86 {

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "Z")
    private boolean field6239 = false;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "Z")
    private boolean field6240 = false;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "Lhl;")
    private class373 field6246;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "Lsu;")
    private class142 field6238;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "[Lvs;")
    public static class425[] field6236 = new class425[14];

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "Let;")
    public static class428 field6247 = new class428();

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "Lla;")
    public static class319 field6250 = new class319(20, 4);

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "F")
    public static float field6254 = 1.0F;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "[I")
    public static int[] field6255 = new int[1];

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "Lni;")
    public static class367 field6256 = new class367(71, 7);

    @OriginalMember(owner = "client!cr", name = "B", descriptor = "F")
    public static float field6252;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "[[I")
    public static int[][] field6253;

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "[[[J")
    public static long[][][] field6251;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZB)V", line = 4)
    public final void method235(boolean arg0, byte arg1) {
        if (arg1 != 112) {
            field6253 = null;
        }
        ++field6235;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBI)V", line = 15)
    public final void method239(int arg0, byte arg1, int arg2) {
        if (this.field6239) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << ((arg2 & 61) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) (3 & arg0 >> 16) / 8.0F;
            long var8 = this.field6238.field1898;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field1248.field4899 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field6241;
        int var10 = -50 % ((-50 - arg1) / 53);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZLlr;I)V", line = 44)
    public final void method236(boolean arg0, class538 arg1, int arg2) {
        if (arg0) {
            if (!this.field6239) {
                super.field1248.method2075(arg1, 0);
                super.field1248.method2045(34023, arg2);
            }
            ++field6243;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)Z", line = 62)
    public final boolean method238(byte arg0) {
        if (arg0 >= -2) {
            this.method238((byte) -125);
        }
        ++field6249;
        return false;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lnq;Lhl;)V", line = 73)
    public class411(class325 arg0, class373 arg1) {
        super(arg0);
        this.field6246 = arg1;
        if (this.field6246.field5683 != null && super.field1248.field5005 && super.field1248.field4923) {
            class473 var3 = class222.method1502("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field1248, 35633, (byte) 73);
            class473 var4 = class222.method1502("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field1248, 35632, (byte) -115);
            this.field6238 = class194.method1306(super.field1248, new class473[] { var3, var4 }, (byte) -114);
            this.field6240 = this.field6238 != null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 92)
    public final void method237(int arg0) {
        if (this.field6239) {
            super.field1248.method2040((byte) -2, 1);
            super.field1248.method2075((class538) null, 0);
            super.field1248.method2040((byte) -11, 0);
            super.field1248.method2075((class538) null, 0);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6239 = false;
        }
        ++field6245;
        if (arg0 != 27670) {
            method2536(84);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZ)V", line = 112)
    public final void method241(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method2533((byte) 115, (String) null);
        }
        ++field6244;
        class1 var3 = super.field1248.method2080(27094);
        if (this.field6240 && var3 != null) {
            super.field1248.method2040((byte) 27, 1);
            super.field1248.method2075(var3, arg0);
            super.field1248.method2040((byte) -93, 0);
            super.field1248.method2075(this.field6246.field5683, 0);
            long var4 = this.field6238.field1898;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field1248.field4959[0], -super.field1248.field4959[1], -super.field1248.field4959[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field1248.field4981, super.field1248.field5012, super.field1248.field4978, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field1248.field4959[1]) * 928.0F + 96.0F);
            this.field6239 = true;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(II)V", line = 144)
    public static final void method2532(int arg0, int arg1) {
        class162.field2114 = 0;
        class474.field7042 = arg1;
        class406.field6164 = 1;
        if (arg0 < -68) {
            class433.field6577 = false;
            class342.field5271 = -1;
            ++field6237;
            class372.field5667 = -1;
            class445.field6686 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 173)
    public static final boolean method2533(byte arg0, String arg1) {
        ++field6248;
        int var2 = 5 / ((arg0 - 36) / 54);
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; ~class454.field6834 < ~var3; ++var3) {
                if (arg1.equalsIgnoreCase(class466.field6946[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(class56.field800.field1393);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 202)
    public static final int method2534(String arg0, int arg1) {
        ++field6234;
        int var2 = arg0.length();
        int var3 = arg1;
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            var3 = arg0.charAt(var4) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V", line = 233)
    public static void method2535(int arg0) {
        field6236 = null;
        field6251 = null;
        field6250 = null;
        field6247 = null;
        field6253 = null;
        field6256 = null;
        if (arg0 != 928) {
            method2534((String) null, -14);
        }
        field6255 = null;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V", line = 252)
    public static final void method2536(int arg0) {
        if (arg0 > 52) {
            ++field6242;
            if (~class139.field1848 < -1) {
                int var1 = 0;
                for (int var2 = 0; ~var2 > ~class470.field7013.length; ++var2) {
                    if (class470.field7013[var2].startsWith("--> ")) {
                        ++var1;
                        if (~class139.field1848 == ~var1) {
                            class4.field31 = class470.field7013[var2].substring(4);
                            return;
                        }
                    }
                }
            } else {
                class4.field31 = "";
            }
        }
    }
}
