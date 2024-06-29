import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class384 extends class190 {

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Z")
    private boolean field5709 = false;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Z")
    private boolean field5704 = false;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Llm;")
    private class307 field5721;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lvv;")
    private class640 field5710;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lkl;")
    public static class468 field5715 = new class468(1);

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lcq;")
    public static class106 field5712;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Lei;")
    public static class329 field5720;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lnm;")
    public static class337 field5706;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "[Lha;")
    public static class116[] field5708;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public static void method2337(int arg0) {
        if (arg0 == 6978) {
            field5720 = null;
            field5706 = null;
            field5715 = null;
            field5712 = null;
            field5708 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)V")
    public final void method921(boolean arg0, int arg1) {
        if (arg1 != 25747) {
            field5712 = null;
        }
        ++field5707;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Ljj;Llm;)V")
    public class384(class66 arg0, class307 arg1) {
        super(arg0);
        this.field5721 = arg1;
        if (this.field5721.field4414 != null && super.field2722.field1256 && super.field2722.field1167) {
            class119 var3 = class20.method223(35633, super.field2722, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", true);
            class119 var4 = class20.method223(35632, super.field2722, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", true);
            this.field5710 = class626.method3551(new class119[] { var3, var4 }, 126, super.field2722);
            this.field5709 = this.field5710 != null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public final void method926(byte arg0) {
        ++field5714;
        if (arg0 > -102) {
            field5706 = null;
        }
        if (this.field5704) {
            super.field2722.method654(false, 1);
            super.field2722.method648(78, (class222) null);
            super.field2722.method654(false, 0);
            super.field2722.method648(92, (class222) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5704 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Z")
    public final boolean method928(int arg0) {
        ++field5716;
        int var2 = -99 / ((arg0 - -7) / 57);
        return false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILaba;I)V")
    public final void method927(int arg0, class222 arg1, int arg2) {
        ++field5713;
        if (!this.field5704) {
            super.field2722.method648(arg2 ^ 20634, arg1);
            super.field2722.method634(arg2 + -20848, arg0);
        }
        if (arg2 != 20731) {
            this.field5710 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZB)V")
    public final void method919(boolean arg0, byte arg1) {
        int var3 = -80 % ((arg1 - -55) / 47);
        ++field5718;
        class498 var4 = super.field2722.method630((byte) -117);
        if (this.field5709 && var4 != null) {
            super.field2722.method654(false, 1);
            super.field2722.method648(98, var4);
            super.field2722.method654(false, 0);
            super.field2722.method648(91, this.field5721.field4414);
            long var5 = this.field5710.field9286;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field2722.field1247[0], -super.field2722.field1247[1], -super.field2722.field1247[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field2722.field1262, super.field2722.field1161, super.field2722.field1208, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field2722.field1247[1]) + 96.0F);
            this.field5704 = true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)Z")
    public static final boolean method2338(int arg0, int arg1, int arg2) {
        if (arg2 != 1408) {
            method2339(-77);
        }
        ++field5711;
        return ~(arg1 & 1408) != -1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
    public final void method925(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field5720 = null;
        }
        if (this.field5704) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((242130 & arg2) >> 16) / 8.0F;
            long var8 = this.field5710.field9286;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2722.field1135 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field5717;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public static final void method2339(int arg0) {
        class444.method2625(false, class202.field2854.field7885);
        if (arg0 != 1043) {
            method2339(-71);
        }
        ++field5705;
        int var1 = (class545.field7584 >> 10) + (class382.field5687 >> 3);
        int var2 = (class597.field8500 >> 3) + (class216.field3274 >> 10);
        class545.field7583 = class644.field9367.field5116 = 0;
        class644.field9367.method2445(8, 8, (byte) 123);
        byte var3 = 18;
        class43.field584 = new int[var3];
        class648.field9390 = new byte[var3][];
        class265.field3877 = new int[var3];
        class142.field2215 = new int[var3];
        class142.field2219 = new int[var3];
        class443.field6477 = new int[var3];
        class469.field6758 = new int[var3];
        class563.field8070 = new byte[var3][];
        class543.field7574 = new byte[var3][];
        class166.field2426 = new byte[var3][];
        class210.field2969 = new int[var3][4];
        class179.field2602 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (-(class146.field2247 >> 4) + var1) / 8; ~var5 >= ~((var1 - -(class146.field2247 >> 4)) / 8); ++var5) {
            for (int var8 = (-(class66.field990 >> 4) + var2) / 8; var8 <= ((class66.field990 >> 4) + var2) / 8; ++var8) {
                int var9 = (var5 << 8) + var8;
                class43.field584[var4] = var9;
                class265.field3877[var4] = class597.field8501.method3195(0, "m" + var5 + "_" + var8);
                class142.field2215[var4] = class597.field8501.method3195(0, "l" + var5 + "_" + var8);
                class469.field6758[var4] = class597.field8501.method3195(0, "n" + var5 + "_" + var8);
                class142.field2219[var4] = class597.field8501.method3195(0, "um" + var5 + "_" + var8);
                class443.field6477[var4] = class597.field8501.method3195(0, "ul" + var5 + "_" + var8);
                if (class469.field6758[var4] == -1) {
                    class265.field3877[var4] = -1;
                    class142.field2215[var4] = -1;
                    class142.field2219[var4] = -1;
                    class443.field6477[var4] = -1;
                }
                ++var4;
            }
        }
        for (int var6 = var4; var6 < class469.field6758.length; ++var6) {
            class469.field6758[var6] = -1;
            class265.field3877[var6] = -1;
            class142.field2215[var6] = -1;
            class142.field2219[var6] = -1;
            class443.field6477[var6] = -1;
        }
        byte var7;
        if (~class64.field893 != -2 && class64.field893 != 2) {
            var7 = 7;
        } else {
            var7 = 3;
        }
        class159.method1125(var7, false, var2, 113, var1);
    }
}
