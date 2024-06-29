import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class134 extends class348 {

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Z")
    private boolean field1810 = false;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Z")
    private boolean field1808 = false;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lwc;")
    private class273 field1809;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Lmv;")
    private class233 field1804;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lbi;")
    public static class104 field1807 = new class104(75, 3);

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field1814;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)V")
    public final void method262(boolean arg0, byte arg1) {
        ++field1805;
        int var3 = -35 / ((-23 - arg1) / 41);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIB)V")
    public final void method263(int arg0, int arg1, byte arg2) {
        if (this.field1808) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) ((213235 & arg0) >> 16) / 8.0F;
            float var8 = (float) ((8089960 & arg0) >> 19) / 16.0F;
            float var9 = (float) (arg0 >> 23 & 15) / 16.0F;
            int var10 = arg0 >> 27 & 15;
            long var11 = this.field1804.field3852;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field5398.field3484 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field1815;
        if (arg2 >= -51) {
            field1807 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(ZB)V")
    public final void method261(boolean arg0, byte arg1) {
        if (arg1 <= -30) {
            ++field1811;
            class15 var3 = super.field5398.method1517((byte) 115);
            if (this.field1810 && var3 != null) {
                float var4 = 1.0F + (1.0F - Math.abs(super.field5398.field3572[1])) * 2.0F;
                super.field5398.method1507(1, 0);
                super.field5398.method1540(46, var3);
                super.field5398.method1507(0, 0);
                super.field5398.method1540(101, this.field1809.field4348);
                long var5 = this.field1804.field3852;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field5398.field3572[0], -super.field5398.field3572[1], -super.field5398.field3572[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field5398.field3611 * var4, super.field5398.field3512 * var4, super.field5398.field3539 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field5398.field3572[1]) * 928.0F + 64.0F);
                this.field1808 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILed;)V")
    public final void method264(int arg0, int arg1, class427 arg2) {
        if (!this.field1808) {
            super.field5398.method1540(109, arg2);
            super.field5398.method1494(arg0, -25951);
        }
        int var4 = -71 % ((arg1 - -49) / 44);
        ++field1806;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public final void method265(int arg0) {
        int var2 = 106 / ((arg0 - 61) / 63);
        ++field1812;
        if (this.field1808) {
            super.field5398.method1507(1, 0);
            super.field5398.method1540(40, (class427) null);
            super.field5398.method1507(0, 0);
            super.field5398.method1540(47, (class427) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1808 = false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static void method828(byte arg0) {
        field1807 = null;
        if (arg0 == 32) {
            field1814 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z")
    public final boolean method267(int arg0) {
        if (arg0 != -233) {
            return false;
        } else {
            ++field1813;
            return this.field1810;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lna;Lwc;)V")
    public class134(class211 arg0, class273 arg1) {
        super(arg0);
        this.field1809 = arg1;
        if (this.field1809.field4348 != null && super.field5398.field3504 && super.field5398.field3545) {
            class297 var3 = class284.method1908(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field5398, (byte) 59);
            class297 var4 = class284.method1908(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field5398, (byte) 67);
            this.field1804 = class326.method2178(super.field5398, new class297[] { var3, var4 }, 116);
            this.field1810 = this.field1804 != null;
        }
    }

    static {
        new class213("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field1814 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
    }
}
