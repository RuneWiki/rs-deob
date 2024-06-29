import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class417 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lrl;")
    private class487 field6188;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[S")
    public static short[] field6189 = new short[256];

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Ljh;")
    private class105 field6190;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "[I")
    public static int[] field6187;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Z")
    public static final boolean method2479(int arg0) {
        if (arg0 == 21125) {
            field6186++;
            return class378.field5658 == 0 ? class8.field133.method1513(arg0 - 21234) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BFLbc;Lbc;)Z")
    public final boolean method2480(byte arg0, float arg1, class235 arg2, class235 arg3) {
        field6194++;
        if (!this.method2482(35632)) {
            return false;
        }
        class295 var5 = this.field6188.field7428;
        class479 var6 = new class479(this.field6188, 6408, arg2.field3303, arg2.field3291);
        this.field6188.method2872(125, var5);
        boolean var7 = false;
        var5.method1780(0, -1, var6);
        if (var5.method1789(false)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg2.field3303, arg2.field3291);
            OpenGL.glUseProgramObjectARB(this.field6190.field1409);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field6190.field1409, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field6190.field1409, "rcpRelief"), 1.0F / arg1);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field6190.field1409, "sampleSize"), 1.0F / (float) arg3.field3303, 1.0F / (float) arg3.field3291);
            for (int var8 = 0; var8 < arg2.field3300; var8++) {
                float var9 = (float) var8 / (float) arg2.field3300;
                this.field6188.method2883(arg3, -101);
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
                arg2.method1428(0, 0, arg2.field3291, var8, arg2.field3303, (byte) 91, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        if (arg0 >= -73) {
            field6187 = null;
        }
        var5.method1782(-1, 0);
        this.field6188.method2927(14921, var5);
        return var7;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    public static void method2481(boolean arg0) {
        if (arg0) {
            method2479(-82);
        }
        field6187 = null;
        field6189 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)Z")
    public final boolean method2482(int arg0) {
        if (arg0 != 35632) {
            field6192 = 113;
        }
        if (this.field6188.field7348 && this.field6188.field7366 && this.field6190 == null) {
            class260 var2 = class150.method921(this.field6188, 35632, (byte) -75, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field6190 = class40.method307((byte) 55, this.field6188, new class260[] { var2 });
            }
        }
        field6193++;
        return this.field6190 != null;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lrl;)V")
    public class417(class487 arg0) {
        this.field6188 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V")
    public static final void method2483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6191++;
        if (arg5 != 1) {
            field6189 = null;
        }
        if (arg2 == arg4) {
            class27.method230(0, arg1, arg4, arg3, arg0);
        } else if (arg3 - arg4 >= class473.field6839 && arg3 + arg4 <= class63.field933 && class7.field131 <= (arg0 - arg2) && (arg0 + arg2) <= class92.field1252) {
            class389.method2340(arg2, arg3, arg4, arg0, arg1, (byte) 120);
        } else {
            class76.method500(arg3, arg1, arg0, arg2, arg4, (byte) -64);
        }
    }
}
