import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class534 extends class261 {

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "Z")
    private boolean field7848 = false;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "Z")
    private boolean field7845 = false;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "Ljq;")
    private class264 field7856;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "Leq;")
    private class256 field7853;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    public static int field7857 = 1;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "Lo;")
    public static class138 field7849;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "Lvv;")
    public static class313 field7847;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([BB)Lgn;")
    public static final class405 method3167(byte[] arg0, byte arg1) {
        ++field7854;
        class405 var2 = new class405();
        class23 var3 = new class23(arg0);
        var3.field301 = var3.field302.length - 2;
        int var4 = var3.method132(115);
        int var5 = -2 - var4 + var3.field302.length + -12;
        var3.field301 = var5;
        if (arg1 != -21) {
            return null;
        } else {
            int var6 = var3.method143(arg1 + -3209);
            var2.field6145 = var3.method132(93);
            var2.field6143 = var3.method132(56);
            var2.field6149 = var3.method132(80);
            var2.field6150 = var3.method132(arg1 + 90);
            int var7 = var3.method126((byte) -92);
            if (~var7 < -1) {
                var2.field6146 = new class407[var7];
                for (int var8 = 0; ~var7 < ~var8; ++var8) {
                    int var9 = var3.method132(60);
                    class407 var10 = new class407(class206.method1351(var9, 121));
                    var2.field6146[var8] = var10;
                    while (~(var9--) < -1) {
                        int var11 = var3.method143(-3230);
                        int var12 = var3.method143(arg1 + -3209);
                        var10.method2517(new class22(var12), (long) var11, (byte) 30);
                    }
                }
            }
            var3.field301 = 0;
            var2.field6144 = var3.method166((byte) 83);
            var2.field6148 = new int[var6];
            var2.field6153 = new String[var6];
            var2.field6147 = new int[var6];
            int var13 = 0;
            while (var5 > var3.field301) {
                int var14 = var3.method132(arg1 + 96);
                if (var14 != 3) {
                    if (~var14 > -101 && ~var14 != -22 && ~var14 != -39 && var14 != 39) {
                        var2.field6148[var13] = var3.method143(-3230);
                    } else {
                        var2.field6148[var13] = var3.method126((byte) -77);
                    }
                } else {
                    var2.field6153[var13] = var3.method156((byte) -88).intern();
                }
                var2.field6147[var13++] = var14;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZB)V")
    public final void method1020(boolean arg0, byte arg1) {
        if (arg1 <= 23) {
            field7849 = null;
        }
        ++field7852;
        class358 var3 = super.field4358.method1435(false);
        if (this.field7848 && var3 != null) {
            super.field4358.method1440(1, 0);
            super.field4358.method1471(true, var3);
            super.field4358.method1440(0, 0);
            super.field4358.method1471(true, this.field7856.field4411);
            long var4 = this.field7853.field4330;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field4358.field3695[0], -super.field4358.field3695[1], -super.field4358.field3695[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field4358.field3697, super.field4358.field3672, super.field4358.field3652, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field4358.field3695[1]) * 928.0F);
            this.field7845 = true;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)V")
    public final void method1021(int arg0, int arg1, int arg2) {
        if (this.field7845) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << (7 & arg2 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) ((211063 & arg0) >> 16) / 8.0F;
            long var8 = this.field7853.field4330;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field4358.field3602 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        int var10 = -82 % ((82 - arg1) / 41);
        ++field7850;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lpt;III)V")
    public static final void method3168(class398 arg0, int arg1, int arg2, int arg3) {
        long var4 = class355.field5541[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field6083 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field6080[arg0.field6083++] = class435.field6486[var8 - 1].field6429;
            var6 += 16L;
        }
        for (int var9 = arg0.field6083; var9 < 4; ++var9) {
            arg0.field6080[var9] = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZ)V")
    public final void method1022(int arg0, boolean arg1) {
        int var3 = 45 % ((arg0 - 87) / 37);
        ++field7846;
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)V")
    public final void method1023(int arg0) {
        ++field7855;
        if (arg0 != 5000) {
            this.method1024(93, -55, (class179) null);
        }
        if (this.field7845) {
            super.field4358.method1440(1, 0);
            super.field4358.method1471(true, (class179) null);
            super.field4358.method1440(0, arg0 ^ 5000);
            super.field4358.method1471(true, (class179) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field7845 = false;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILkk;)V")
    public final void method1024(int arg0, int arg1, class179 arg2) {
        if (!this.field7845) {
            super.field4358.method1471(true, arg2);
            super.field4358.method1410(arg0, 7681);
        }
        ++field7851;
        int var4 = -55 / ((21 - arg1) / 36);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3169(int arg0, byte arg1, int arg2) {
        int var3 = -32 / ((24 - arg1) / 44);
        ++field7858;
        class39 var4 = class61.field928.method791(arg2, true);
        if (~arg0 == -12) {
            arg0 = 10;
        }
        if (~arg0 <= -6 && arg0 <= 8) {
            arg0 = 4;
        }
        return var4.method291(0, arg0);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
    public static void method3170(byte arg0) {
        if (arg0 != -30) {
            method3167((byte[]) null, (byte) 97);
        }
        field7847 = null;
        field7849 = null;
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)Z")
    public final boolean method1026(int arg0) {
        ++field7844;
        if (arg0 <= 69) {
            this.field7856 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lih;Ljq;)V")
    public class534(class214 arg0, class264 arg1) {
        super(arg0);
        this.field7856 = arg1;
        if (this.field7856.field4411 != null && super.field4358.field3681 && super.field4358.field3721) {
            class303 var3 = class64.method421((byte) -122, 35633, super.field4358, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class303 var4 = class64.method421((byte) -126, 35632, super.field4358, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
            this.field7853 = class287.method1864(new class303[] { var3, var4 }, super.field4358, 1);
            this.field7848 = this.field7853 != null;
        }
    }

    static {
        new class306("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        new class306("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }
}
