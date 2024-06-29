import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class268 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lbv;")
    private class282 field3721;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lrs;")
    private class486 field3726;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V", line = 10)
    public static final void method1710(boolean arg0) {
        if (!arg0) {
            method1712(null, null, 71, -114, null, (byte) -31);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class326.field5002[var1] = true;
        }
        field3720++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 29)
    public static final void method1711(int arg0, int arg1, int arg2, Class arg3) {
        class420 var4 = class380.field5802[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class115 var5 = var4.field6273; var5 != null; var5 = var5.field1600) {
            class153 var6 = var5.field1594;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2208 == arg1 && var6.field2216 == arg2) {
                class457.method2750(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;B)V", line = 56)
    public static final void method1712(String arg0, String arg1, int arg2, int arg3, String arg4, byte arg5) {
        field3724++;
        if (arg5 > 98) {
            class395.method2433(arg0, -1, arg3, arg1, arg4, null, (byte) 67, arg2);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIII)V", line = 67)
    public static final void method1713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3722++;
        int var6 = arg5 - arg1;
        int var7 = arg3 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class326.method2108(arg1, arg0, arg3, arg2, -119);
            }
        } else if (var7 == 0) {
            class205.method1417(arg0, arg5, arg2, (byte) -64, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg2 - (arg1 * var8 >> 12);
            if (arg4 != 5090) {
                method1710(false);
            }
            int var10;
            int var11;
            if (arg1 < class396.field6021) {
                var10 = (class396.field6021 * var8 >> 12) + var9;
                var11 = class396.field6021;
            } else if (class443.field6591 >= arg1) {
                var10 = arg2;
                var11 = arg1;
            } else {
                var11 = class443.field6591;
                var10 = var9 + (class443.field6591 * var8 >> 12);
            }
            int var12;
            int var13;
            if (arg5 < class396.field6021) {
                var12 = class396.field6021;
                var13 = (class396.field6021 * var8 >> 12) + var9;
            } else if (class443.field6591 < arg5) {
                var12 = class443.field6591;
                var13 = (class443.field6591 * var8 >> 12) + var9;
            } else {
                var13 = arg3;
                var12 = arg5;
            }
            if (class410.field6176 > var10) {
                var11 = (class410.field6176 - var9 << 12) / var8;
                var10 = class410.field6176;
            } else if (var10 > class158.field2302) {
                var10 = class158.field2302;
                var11 = (class158.field2302 - var9 << 12) / var8;
            }
            if (class410.field6176 > var13) {
                var12 = (class410.field6176 - var9 << 12) / var8;
                var13 = class410.field6176;
            } else if (var13 > class158.field2302) {
                var13 = class158.field2302;
                var12 = (class158.field2302 - var9 << 12) / var8;
            }
            class84.method544(false, arg0, var10, var13, var11, var12);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Z", line = 171)
    public final boolean method1714(byte arg0) {
        field3725++;
        if (this.field3721.field4159 && this.field3721.field4150 && this.field3726 == null) {
            class238 var2 = class117.method760(this.field3721, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, -12054);
            if (var2 != null) {
                this.field3726 = class384.method2382((byte) 94, new class238[] { var2 }, this.field3721);
            }
        }
        if (arg0 >= -1) {
            return true;
        } else {
            return this.field3726 != null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lpp;Lpp;FB)Z", line = 200)
    public final boolean method1715(class38 arg0, class38 arg1, float arg2, byte arg3) {
        if (arg3 != 82) {
            this.method1714((byte) 72);
        }
        field3723++;
        if (!this.method1714((byte) -122)) {
            return false;
        }
        class317 var5 = this.field3721.field4180;
        class252 var6 = new class252(this.field3721, 6408, arg0.field600, arg0.field611);
        this.field3721.method1843(arg3 - 177, var5);
        boolean var7 = false;
        var5.method2056(var6, (byte) 62, 0);
        if (var5.method2063(-16436)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field600, arg0.field611);
            OpenGL.glUseProgramObjectARB(this.field3726.field7133);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field3726.field7133, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field3726.field7133, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field3726.field7133, "sampleSize"), 1.0F / (float) arg1.field600, 1.0F / (float) arg1.field611);
            for (int var8 = 0; var8 < arg0.field599; var8++) {
                float var9 = (float) var8 / (float) arg0.field599;
                this.field3721.method1787(arg1, (byte) 121);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord3f(0.0F, 0.0F, var9);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 0.0F, var9);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 1.0F, var9);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3f(0.0F, 1.0F, var9);
                OpenGL.glVertex2f(0.0F, 1.0F);
                OpenGL.glEnd();
                arg0.method275(arg0.field600, arg0.field611, 0, 0, var8, 0, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method2066((byte) 23, 0);
        this.field3721.method1779(var5, true);
        return var7;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lbv;)V", line = 268)
    public class268(class282 arg0) {
        this.field3721 = arg0;
    }
}
