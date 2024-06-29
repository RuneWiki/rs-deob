import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class117 {

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "Luca;")
    private class287 field1747;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field1754 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Ljp;")
    public static class361 field1748;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lnba;")
    private class566 field1745;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "[Lwo;")
    public static class293[] field1753;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public static void method863(int arg0) {
        field1748 = null;
        field1753 = null;
        if (arg0 != 7) {
            method865(-12);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lpj;Lpj;BF)Z")
    public final boolean method864(class679 arg0, class679 arg1, byte arg2, float arg3) {
        field1751++;
        if (!this.method866(true)) {
            return false;
        }
        class559 var5 = this.field1747.field4130;
        class267 var6 = new class267(this.field1747, 6408, arg1.field9603, arg1.field9608);
        boolean var7 = false;
        this.field1747.method1740(var5, (byte) 121);
        var5.method3239(var6, 0, false);
        if (var5.method3238(115)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field9603, arg1.field9608);
            OpenGL.glUseProgramObjectARB(this.field1745.field8262);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field1745.field8262, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field1745.field8262, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field1745.field8262, "sampleSize"), 1.0F / (float) arg0.field9603, 1.0F / (float) arg0.field9608);
            for (int var8 = 0; var8 < arg1.field9604; var8++) {
                float var9 = (float) var8 / (float) arg1.field9604;
                this.field1747.method1709((byte) -123, arg0);
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
                arg1.method3816(arg1.field9608, (byte) 50, var8, 0, 0, 0, 0, arg1.field9603);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method3244(0, 36009);
        if (arg2 != 16) {
            method865(125);
        }
        this.field1747.method1695(var5, 255);
        return var7;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
    public static final void method865(int arg0) {
        int var1 = -70 / ((52 - arg0) / 54);
        for (int var2 = 0; var2 < class155.field2213; var2++) {
            int var3 = class523.field7379[var2];
            class177 var4 = (class177) class271.field3550.method2002((byte) -115, (long) var3);
            if (var4 != null) {
                class53 var5 = var4.field2476;
                class154.method1098(var5.field805.field1239, var5, (byte) 51);
            }
        }
        field1744++;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)Z")
    public final boolean method866(boolean arg0) {
        if (!arg0) {
            return true;
        }
        if (this.field1747.field4062 && this.field1747.field4099 && this.field1745 == null) {
            class129 var2 = class94.method592((byte) -56, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field1747, 35632);
            if (var2 != null) {
                this.field1745 = class410.method2516(114, new class129[] { var2 }, this.field1747);
            }
        }
        field1749++;
        return this.field1745 != null;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Luca;)V")
    public class117(class287 arg0) {
        this.field1747 = arg0;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)Lcq;")
    public static final class273 method867(int arg0, byte arg1) {
        field1752++;
        class273[] var2 = class477.method2740((byte) -109);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field3559 == arg0) {
                return var2[var3];
            }
        }
        if (arg1 < 82) {
            field1754 = 66;
        }
        return null;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V")
    public static final void method868(int arg0) {
        if (class528.field7533 != null) {
            class528.field7533.method623((byte) -79);
            class528.field7533 = null;
            class700.field9869 = null;
        }
        field1750++;
        if (arg0 > -72) {
            method863(70);
        }
    }
}
