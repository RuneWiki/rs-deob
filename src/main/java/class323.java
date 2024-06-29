import jaggl.OpenGL;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class323 extends class682 {

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "Z")
    private boolean field4120 = false;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "Z")
    private boolean field4124 = false;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "Lpr;")
    private class445 field4122;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "Lrda;")
    private class660 field4131;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    public static int field4127 = 0;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4125;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "[I")
    public static int[] field4123;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "[Lhu;")
    public static class131[] field4118;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public final void method288(int arg0) {
        if (this.field4124) {
            super.field9647.method2545(32886, 1);
            super.field9647.method2621(-2, (class292) null);
            super.field9647.method2545(32886, 0);
            super.field9647.method2621(-2, (class292) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4124 = false;
        }
        ++field4128;
        if (arg0 != 0) {
            method1926(100);
        }
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)V")
    public static final void method1926(int arg0) {
        class351.field4526 = arg0;
        for (int var1 = 0; var1 < class284.field3473; ++var1) {
            for (int var2 = 0; var2 < class151.field1664; ++var2) {
                if (class638.field9170[arg0][var1][var2] == null) {
                    class638.field9170[arg0][var1][var2] = new class691(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)Z")
    public static final boolean method1927(int arg0) {
        ++field4132;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class124.field1306.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class124.field1306.get(var3));
        }
        try {
            if (arg0 != 35632) {
                field4118 = null;
            }
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class124.field1306.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class326.field4234.get(var9);
                        Class var11 = (Class) class124.field1306.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; ~var12.size() < ~var13; ++var13) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, new Integer(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class124.field1306 = var1;
        return class124.field1306.isEmpty();
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBI)V")
    public final void method289(int arg0, byte arg1, int arg2) {
        ++field4119;
        if (this.field4124) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            long var8 = this.field4131.field9424;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field9647.field5919 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg1 < 72) {
            this.method288(-8);
        }
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)V")
    public static void method1928(int arg0) {
        field4118 = null;
        if (arg0 != 1663338224) {
            method1929((byte) -84, (class244) null);
        }
        field4123 = null;
        field4125 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ltha;II)V")
    public final void method292(class292 arg0, int arg1, int arg2) {
        if (!this.field4124) {
            super.field9647.method2621(-2, arg0);
            super.field9647.method2573(arg1, false);
        }
        if (arg2 != -16997) {
            this.method286(false);
        }
        ++field4126;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)Z")
    public final boolean method286(boolean arg0) {
        ++field4121;
        if (!arg0) {
            this.field4120 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLig;)V")
    public static final void method1929(byte arg0, class244 arg1) {
        ++field4130;
        int var2 = arg1.method1463(3010);
        class458.field6556 = new class96[var2];
        for (int var3 = 0; ~var3 > ~var2; ++var3) {
            class458.field6556[var3] = new class96();
            class458.field6556[var3].field1013 = arg1.method1463(3010);
            class458.field6556[var3].field1017 = arg1.method1467(arg0 + 9380);
        }
        class647.field9257 = arg1.method1463(arg0 + 3042);
        class85.field897 = arg1.method1463(arg0 + 3042);
        class267.field3327 = arg1.method1463(arg0 ^ -3038);
        class341.field4407 = new class526[-class647.field9257 + class85.field897 - -1];
        int var4 = 0;
        if (arg0 != -32) {
            field4123 = null;
        }
        while (~class267.field3327 < ~var4) {
            int var5 = arg1.method1463(3010);
            class526 var6 = class341.field4407[var5] = new class526();
            var6.field9066 = arg1.method1423(-28);
            var6.field9076 = arg1.method1438(arg0 ^ -108);
            var6.field7497 = var5 - -class647.field9257;
            var6.field7496 = arg1.method1467(9348);
            var6.field7493 = arg1.method1467(arg0 ^ -9372);
            ++var4;
        }
        class585.field8267 = arg1.method1438(105);
        class520.field7393 = true;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BZ)V")
    public final void method285(byte arg0, boolean arg1) {
        if (arg0 != 52) {
            method1927(-99);
        }
        ++field4129;
        class351 var3 = super.field9647.method2550(-20140);
        if (this.field4120 && var3 != null) {
            super.field9647.method2545(32886, 1);
            super.field9647.method2621(-2, var3);
            super.field9647.method2545(arg0 ^ 32834, 0);
            super.field9647.method2621(-2, this.field4122.field6446);
            long var4 = this.field4131.field9424;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field9647.field6003[0], -super.field9647.field6003[1], -super.field9647.field6003[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field9647.field5969, super.field9647.field6050, super.field9647.field5974, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field9647.field6003[1]) * 928.0F + 96.0F);
            this.field4124 = true;
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lnv;Lpr;)V")
    public class323(class417 arg0, class445 arg1) {
        super(arg0);
        this.field4122 = arg1;
        if (this.field4122.field6446 != null && super.field9647.field6041 && super.field9647.field6030) {
            class299 var3 = class261.method1572(super.field9647, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", false);
            class299 var4 = class261.method1572(super.field9647, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", false);
            this.field4131 = class501.method2971(super.field9647, new class299[] { var3, var4 }, -15582);
            this.field4120 = this.field4131 != null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZ)V")
    public final void method287(int arg0, boolean arg1) {
        if (arg0 < 111) {
            this.method286(true);
        }
        ++field4134;
    }
}
