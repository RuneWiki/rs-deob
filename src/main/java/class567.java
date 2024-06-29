import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class567 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lqo;")
    private class22 field7803;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Z")
    public static boolean field7806 = false;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lej;")
    public static class124 field7804 = new class124(16, 7);

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Ldw;")
    private class716 field7805;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static void method3279(boolean arg0) {
        if (!arg0) {
            method3284(121);
        }
        field7804 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII)Z")
    public static final boolean method3280(byte arg0, int arg1, int arg2) {
        if (arg0 != -35) {
            method3279(true);
        }
        field7811++;
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lgj;Lgj;IF)Z")
    public final boolean method3281(class635 arg0, class635 arg1, int arg2, float arg3) {
        field7809++;
        if (!this.method3282(35632)) {
            return false;
        }
        class643 var5 = this.field7803.field600;
        int var6 = 30 % ((-arg2 - 55) / 59);
        class251 var7 = new class251(this.field7803, 6408, arg0.field8723, arg0.field8729);
        this.field7803.method264(-1, var5);
        boolean var8 = false;
        var5.method3654(0, var7, -12);
        if (var5.method3653(117)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field8723, arg0.field8729);
            OpenGL.glUseProgramObjectARB(this.field7805.field9752);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field7805.field9752, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field7805.field9752, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field7805.field9752, "sampleSize"), 1.0F / (float) arg1.field8723, 1.0F / (float) arg1.field8729);
            for (int var9 = 0; var9 < arg0.field8722; var9++) {
                float var10 = (float) var9 / (float) arg0.field8722;
                this.field7803.method256((byte) -118, arg1);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord3f(0.0F, 0.0F, var10);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 0.0F, var10);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 1.0F, var10);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3f(0.0F, 1.0F, var10);
                OpenGL.glVertex2f(0.0F, 1.0F);
                OpenGL.glEnd();
                arg0.method3618(-26823, 0, arg0.field8723, 0, 0, var9, arg0.field8729, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var8 = true;
        }
        var5.method3646(2983, 0);
        this.field7803.method255(-422613672, var5);
        return var8;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Z")
    public final boolean method3282(int arg0) {
        if (this.field7803.field642 && this.field7803.field605 && this.field7805 == null) {
            class164 var2 = class594.method3381(35632, 121, this.field7803, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field7805 = class705.method3931(this.field7803, arg0 - 35633, new class164[] { var2 });
            }
        }
        field7810++;
        if (arg0 != 35632) {
            this.method3281(null, null, 102, 0.17865802F);
        }
        return this.field7805 != null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V")
    public static final void method3283(int arg0, int arg1) {
        field7812++;
        class594 var2 = class692.method3869(arg0, (byte) 105, 17);
        if (arg1 < 106) {
            method3285(-62, null, -125);
        }
        var2.method3383(-16058);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method3284(int arg0) {
        class732.field9888.method3030(5, -101);
        field7807++;
        class130.field2186.method2756(arg0 ^ 0x804C, 5);
        class57.field1143.method4060(-17452, 5);
        class76.field1366.method1685(5, arg0 - 6);
        class510.field7099.method1338(5, true);
        class721.field9801.method159(5, false);
        class456.field6436.method1022(5, 93);
        class104.field1840.method3017(5, (byte) -41);
        class732.field9890.method3431(5, (byte) 1);
        class537.field7423.method980(5, arg0 ^ 0xEAB);
        class624.field8505.method1444((byte) 119, 5);
        class72.field1322.method2135(5, (byte) -98);
        class351.field4888.method1038(5, (byte) 52);
        class495.field6863.method22(5, 11);
        class72.field1327.method1355(5, -20721);
        class132.field2230.method3661((byte) 74, 5);
        class744.field9996.method1224(5, 16);
        class669.field9130.method3819(88, 5);
        class212.field3015.method4036(arg0, 8);
        class419.field6056.method3856(5, 26);
        class192.field2850.method1921(5, -66);
        class136.method1113(5, 0);
        class356.method2238(50, -1);
        class351.method2200(50, -30742);
        class660.method3712(-8186, 5);
        class651.method3684(5, 26603);
        class321.field4406.method987(arg0 - 3, 5);
        class222.field3183.method987(2, 5);
        class465.field6523.method987(arg0 ^ 0x7, 5);
        class699.field9442.method987(2, 5);
        class83.field1517.method987(2, 5);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILin;I)Ljf;")
    public static final class217 method3285(int arg0, class91 arg1, int arg2) {
        field7808++;
        if (arg0 != 0) {
            field7806 = true;
        }
        byte[] var3 = arg1.method868((byte) 73, arg2);
        return var3 == null ? null : new class217(var3);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lqo;)V")
    public class567(class22 arg0) {
        this.field7803 = arg0;
    }
}
