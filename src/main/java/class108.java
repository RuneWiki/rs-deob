import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class108 extends class369 {

    @OriginalMember(owner = "client!er", name = "i", descriptor = "Z")
    private boolean field1887 = false;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "Z")
    private boolean field1883 = false;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "Llc;")
    private class648 field1892;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "Ldw;")
    private class716 field1884;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "Lej;")
    public static class124 field1894 = new class124(9, 8);

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lud;BI)V", line = 3)
    public final void method373(class36 arg0, byte arg1, int arg2) {
        if (!this.field1883) {
            super.field5255.method256((byte) -124, arg0);
            super.field5255.method237(0, arg2);
        }
        ++field1890;
        if (arg1 > -89) {
            field1896 = 45;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 25)
    public final void method371(int arg0) {
        ++field1886;
        if (arg0 >= -75) {
            this.method368(-39);
        }
        if (this.field1883) {
            super.field5255.method190(-15039, 1);
            super.field5255.method256((byte) -92, (class36) null);
            super.field5255.method190(-15039, 0);
            super.field5255.method256((byte) -123, (class36) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1883 = false;
        }
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(I)I", line = 47)
    public static final int method968(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class165.field2594 - 1; ++var2) {
            if (arg0 < class691.field9346[var2] + class488.field6756[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class165.field2594 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)I", line = 69)
    public static final int method969(int arg0, byte arg1) {
        if (arg1 != 43) {
            return -54;
        } else {
            int var2 = ((-1431655765 & arg0) >>> 1) + (arg0 & 1431655765);
            ++field1891;
            int var3 = (858993459 & var2 >>> 2) + (858993459 & var2);
            int var4 = 252645135 & (var3 >>> 4) + var3;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 255;
        }
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(I)V", line = 85)
    public static void method970(int arg0) {
        field1894 = null;
        if (arg0 <= 57) {
            field1894 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZZ)V", line = 99)
    public final void method369(boolean arg0, boolean arg1) {
        if (arg1) {
            this.field1887 = false;
        }
        ++field1885;
        class429 var3 = super.field5255.method194(444720536);
        if (this.field1887 && var3 != null) {
            float var4 = 2.0F * (-Math.abs(super.field5255.field647[1]) + 1.0F) + 1.0F;
            super.field5255.method190(-15039, 1);
            super.field5255.method256((byte) -114, var3);
            super.field5255.method190(-15039, 0);
            super.field5255.method256((byte) -87, this.field1892.field8914);
            long var5 = this.field1884.field9752;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field5255.field647[0], -super.field5255.field647[1], -super.field5255.field647[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field5255.field603 * var4, super.field5255.field638 * var4, super.field5255.field645 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field5255.field647[1]));
            this.field1883 = true;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZB)V", line = 131)
    public final void method366(boolean arg0, byte arg1) {
        int var3 = 126 / ((arg1 - -60) / 38);
        ++field1889;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lqo;Llc;)V", line = 140)
    public class108(class22 arg0, class648 arg1) {
        super(arg0);
        this.field1892 = arg1;
        if (this.field1892.field8914 != null && super.field5255.field613 && super.field5255.field605) {
            class164 var3 = class594.method3381(35633, -21, super.field5255, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class164 var4 = class594.method3381(35632, -53, super.field5255, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field1884 = class705.method3931(super.field5255, -1, new class164[] { var3, var4 });
            this.field1887 = this.field1884 != null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIB)V", line = 161)
    public final void method372(int arg0, int arg1, byte arg2) {
        if (this.field1883) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            float var8 = (float) ((arg1 & 8127994) >> 19) / 16.0F;
            float var9 = (float) ((126142723 & arg1) >> 23) / 16.0F;
            int var10 = (2036536578 & arg1) >> 27;
            long var11 = this.field1884.field9752;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field5255.field557 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field1893;
        if (arg2 > -42) {
            this.method373((class36) null, (byte) -69, -63);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Ljava/lang/String;", line = 200)
    public static final String method971(int arg0, int arg1) {
        ++field1888;
        if (arg1 != -1431655765) {
            method971(-27, 75);
        }
        class7 var2 = (class7) class581.field7954.method1465((long) arg0, -6008);
        if (var2 != null) {
            class535 var3 = var2.field47.method1907(arg1 + 1431655815);
            if (var3 != null) {
                double var4 = var2.field47.method1913(arg1 ^ 1431655716);
                if ((double) var3.method3080((byte) 85) <= var4 && var4 <= (double) var3.method3081((byte) 97)) {
                    return var3.method3086(9);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)Z", line = 230)
    public final boolean method368(int arg0) {
        ++field1895;
        if (arg0 >= -5) {
            this.method372(94, 3, (byte) 11);
        }
        return this.field1887;
    }
}
