import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class368 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lfd;")
    private class365 field5470;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "[Z")
    public static boolean[] field5473 = new boolean[100];

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field5474 = 16777215;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Ljc;")
    public static class303 field5471 = new class303("WIP", 2);

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field5478 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lru;")
    private class128 field5472;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([[[Lnt;I)V")
    public static final void method2274(class148[][][] arg0, int arg1) {
        if (arg1 >= -71) {
            return;
        }
        field5475++;
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class148[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class148 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2082 instanceof class529) {
                            ((class529) var6.field2082).method39(-65);
                        }
                        if (var6.field2079 instanceof class529) {
                            ((class529) var6.field2079).method39(-115);
                        }
                        if (var6.field2085 instanceof class529) {
                            ((class529) var6.field2085).method39(-51);
                        }
                        if (var6.field2098 instanceof class529) {
                            ((class529) var6.field2098).method39(-65);
                        }
                        if (var6.field2078 instanceof class529) {
                            ((class529) var6.field2078).method39(-21);
                        }
                        for (class480 var7 = var6.field2086; var7 != null; var7 = var7.field7058) {
                            class431 var8 = var7.field7054;
                            if (var8 instanceof class529) {
                                ((class529) var8).method39(-75);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method2275(int arg0) {
        if (arg0 < 12) {
            field5471 = null;
        }
        field5471 = null;
        field5473 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Z")
    public final boolean method2276(int arg0) {
        field5476++;
        if (arg0 > -16) {
            field5478 = -107;
        }
        if (this.field5470.field5328 && this.field5470.field5442 && this.field5472 == null) {
            class280 var2 = class49.method499((byte) 121, this.field5470, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field5472 = class196.method1371(new class280[] { var2 }, this.field5470, -1);
            }
        }
        return this.field5472 != null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lfs;I)V")
    public static final void method2277(class387 arg0, int arg1) {
        field5469++;
        class85.field1164 = arg0;
        if (arg1 != 1) {
            field5471 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lfd;)V")
    public class368(class365 arg0) {
        this.field5470 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(FLcf;ILcf;)Z")
    public final boolean method2278(float arg0, class427 arg1, int arg2, class427 arg3) {
        field5477++;
        if (!this.method2276(-62)) {
            return false;
        }
        class264 var5 = this.field5470.field5429;
        class301 var6 = new class301(this.field5470, 6408, arg3.field6294, arg3.field6303);
        if (arg2 != 1) {
            field5474 = 20;
        }
        this.field5470.method2205(var5, (byte) -101);
        boolean var7 = false;
        var5.method1695(var6, 0, (byte) -102);
        if (var5.method1698(-36054)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg3.field6294, arg3.field6303);
            OpenGL.glUseProgramObjectARB(this.field5472.field1860);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field5472.field1860, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field5472.field1860, "rcpRelief"), 1.0F / arg0);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field5472.field1860, "sampleSize"), 1.0F / (float) arg1.field6294, 1.0F / (float) arg1.field6303);
            for (int var8 = 0; var8 < arg3.field6296; var8++) {
                float var9 = (float) var8 / (float) arg3.field6296;
                this.field5470.method2188((byte) 78, arg1);
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
                arg3.method2607(0, 0, 0, arg3.field6294, var8, (byte) -9, arg3.field6303, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method1691(0, arg2 - 110);
        this.field5470.method2254(var5, -114);
        return var7;
    }
}
