import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class489 {

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lad;")
    private class362 field7126;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Lig;")
    public static class206 field7131 = new class206(67, -2);

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lea;")
    public static class474 field7132 = new class474("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "[[Z")
    public static boolean[][] field7133 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field7134 = 0;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lis;")
    private class434 field7123;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Z")
    public final boolean method2936(byte arg0) {
        if (this.field7126.field5481 && this.field7126.field5459 && this.field7123 == null) {
            class451 var2 = class410.method2594("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field7126, (byte) 76, 35632);
            if (var2 != null) {
                this.field7123 = class224.method1458(new class451[] { var2 }, this.field7126, 5097);
            }
        }
        int var3 = 1 / ((arg0 + 35) / 41);
        field7130++;
        return this.field7123 != null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
    public static void method2937(byte arg0) {
        int var1 = -73 % ((80 - arg0) / 35);
        field7131 = null;
        field7133 = null;
        field7132 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Z")
    public static final boolean method2938(int arg0, int arg1, int arg2) {
        if (arg2 == -20661) {
            field7127++;
            return (class155.method902(83, arg1, arg0) | class40.method217(arg0, arg1, (byte) -125) | class113.method700(arg0, true, arg1)) & class614.method3548(30890, arg0, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
    public static final void method2939(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class418.field6298 <= arg3 && class461.field6877 >= arg3) {
            int var5 = class132.method818((byte) -93, arg2, class113.field1385, class4.field43);
            int var6 = class132.method818((byte) -93, arg4, class113.field1385, class4.field43);
            class327.method2123(arg3, var6, var5, arg1, (byte) 17);
        }
        field7124++;
        int var7 = 30 / ((arg0 - 15) / 33);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)I")
    public static final int method2940(int arg0, int arg1, int arg2) {
        field7125++;
        if (arg0 != 30810) {
            field7132 = null;
        }
        int var3 = arg2 + (arg1 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIZI)I")
    public static final int method2941(int arg0, int arg1, boolean arg2, int arg3) {
        field7129++;
        if (!arg2) {
            return 93;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 4095 - arg0;
        } else if (var4 == 2) {
            return 4095 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lad;)V")
    public class489(class362 arg0) {
        this.field7126 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILrv;FLrv;)Z")
    public final boolean method2942(int arg0, class93 arg1, float arg2, class93 arg3) {
        field7128++;
        if (!this.method2936((byte) 26)) {
            return false;
        }
        class535 var5 = this.field7126.field5398;
        class635 var6 = new class635(this.field7126, 6408, arg1.field1088, arg1.field1093);
        this.field7126.method2266(var5, true);
        boolean var7 = false;
        if (arg0 >= -98) {
            method2938(125, -49, 100);
        }
        var5.method3123(98, 0, var6);
        if (var5.method3126((byte) -79)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field1088, arg1.field1093);
            OpenGL.glUseProgramObjectARB(this.field7123.field6444);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field7123.field6444, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field7123.field6444, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field7123.field6444, "sampleSize"), 1.0F / (float) arg3.field1088, 1.0F / (float) arg3.field1093);
            for (int var8 = 0; var8 < arg1.field1098; var8++) {
                float var9 = (float) var8 / (float) arg1.field1098;
                this.field7126.method2295(-116, arg3);
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
                arg1.method588(arg1.field1088, 0, var8, arg1.field1093, 0, (byte) 102, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method3127(0, 0);
        this.field7126.method2261(false, var5);
        return var7;
    }
}
