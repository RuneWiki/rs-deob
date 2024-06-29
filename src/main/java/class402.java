import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class402 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Lug;")
    private class395 field5720;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Z")
    public static boolean field5723 = false;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Ldq;")
    public static class493 field5726 = new class493(10, 6);

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Lap;")
    public static class335 field5730 = new class335("K", "T", "K", "K");

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field5732 = -60;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Lme;")
    private class131 field5728;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Z")
    public static boolean field5731;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 5)
    public static void method2377(int arg0) {
        field5730 = null;
        if (arg0 != 0) {
            method2377(65);
        }
        field5726 = null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V", line = 18)
    public static final void method2378(int arg0) {
        field5724++;
        class2.field13.method2387(-18, arg0);
        class359.field4633.method2634(-1, 5);
        class360.field4654.method2048(-88, 5);
        class315.field4017.method1953(arg0 - 7472, 5);
        class390.field5244.method1324(-1, 5);
        class376.field4949.method621(5537, 5);
        class404.field5756.method556(5, (byte) -79);
        class120.field1624.method1835(1, 5);
        class242.field3132.method1687(5, (byte) -126);
        class436.field6239.method2959(16, 5);
        class327.field4134.method2574(-110, 5);
        class505.field7281.method1624(5, -22345);
        class72.field931.method953(5, arg0 + 29);
        class199.field2592.method2580(392, 5);
        class143.field1839.method3028(arg0 ^ 0xFFFFFFA1, 5);
        class456.field6572.method756((byte) -106, 5);
        class375.field4840.method2426((byte) 1, 5);
        class38.field503.method1599(5, 109);
        class72.field927.method1727((byte) 109, 5);
        class100.field1217.method1046(122, 5);
        class2.method11((byte) -127, 5);
        class342.method1966(50, (byte) -26);
        class339.method1950(5, -11420);
        class489.method2965(-126, 5);
        class515.field7469.method2648(false, 5);
        class489.field7110.method2648(false, 5);
        class505.field7279.method2648(false, 5);
        class42.field518.method2648(false, 5);
        class239.field3077.method2648(false, 5);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Leh;ILeh;F)Z", line = 55)
    public final boolean method2379(class243 arg0, int arg1, class243 arg2, float arg3) {
        field5722++;
        if (!this.method2380(false)) {
            return false;
        }
        class279 var5 = this.field5720.field5524;
        class430 var6 = new class430(this.field5720, 6408, arg2.field3147, arg2.field3145);
        this.field5720.method2303(var5, 34165);
        boolean var7 = false;
        var5.method1657(var6, 0, 91);
        if (var5.method1654(0)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg2.field3147, arg2.field3145);
            OpenGL.glUseProgramObjectARB(this.field5728.field1719);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field5728.field1719, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field5728.field1719, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field5728.field1719, "sampleSize"), 1.0F / (float) arg0.field3147, 1.0F / (float) arg0.field3145);
            for (int var8 = 0; var8 < arg2.field3144; var8++) {
                float var9 = (float) var8 / (float) arg2.field3144;
                this.field5720.method2322(arg0, 14);
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
                arg2.method1481(0, var8, arg2.field3147, true, 0, 0, arg2.field3145, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method1643(0, 1);
        this.field5720.method2283(116, var5);
        if (arg1 != 16208) {
            field5723 = false;
        }
        return var7;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)Z", line = 123)
    public final boolean method2380(boolean arg0) {
        field5727++;
        if (arg0) {
            field5726 = null;
        }
        if (this.field5720.field5529 && this.field5720.field5531 && this.field5728 == null) {
            class320 var2 = class157.method1019("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, 1, this.field5720);
            if (var2 != null) {
                this.field5728 = class18.method155(this.field5720, new class320[] { var2 }, 0);
            }
        }
        return this.field5728 != null;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lug;)V", line = 156)
    public class402(class395 arg0) {
        this.field5720 = arg0;
    }
}
