import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class122 {

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "Lqg;")
    private class321 field1904;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "Lpo;")
    public static class389 field1903 = class207.method1385(3);

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "[[I")
    public static int[][] field1908 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "Lcv;")
    public static class398 field1907 = new class398(16);

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public static int field1910 = -50;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "Lv;")
    private class406 field1900;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "[Lf;")
    public static class528[] field1911;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "()V")
    public static final void method922() {
        for (int var0 = 0; var0 < class288.field4149; var0++) {
            class370 var1 = class381.field5681[var0];
            class263.method1674(var1);
            class381.field5681[var0] = null;
        }
        class288.field4149 = 0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public static final void method923(int arg0) {
        field1905++;
        class388.field5751.method2349(arg0);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)Z")
    public final boolean method924(boolean arg0) {
        if (arg0) {
            field1911 = null;
        }
        if (this.field1904.field4836 && this.field1904.field4831 && this.field1900 == null) {
            class279 var2 = class523.method3087(22476, 35632, this.field1904, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field1900 = class410.method2538(1357486177, this.field1904, new class279[] { var2 });
            }
        }
        field1906++;
        return this.field1900 != null;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
    public static void method925(int arg0) {
        field1907 = null;
        field1903 = null;
        if (arg0 == -2172) {
            field1908 = null;
            field1911 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lqa;ILhh;)V")
    public static final void method926(class162 arg0, int arg1, class84 arg2) {
        field1901++;
        class158[] var3 = class158.method1137(arg2, class170.field2553, 0);
        class205.field2957 = new class528[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class205.field2957[var4] = arg0.method517(var3[var4], true);
        }
        class158[] var5 = class158.method1137(arg2, class281.field4021, 0);
        class319.field4561 = new class528[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class319.field4561[var6] = arg0.method517(var5[var6], true);
        }
        class158[] var7 = class158.method1137(arg2, class127.field1929, 0);
        class18.field283 = new class528[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class18.field283[var8] = arg0.method517(var7[var8], true);
        }
        class158[] var9 = class158.method1137(arg2, class398.field5854, 0);
        class364.field5482 = new class528[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class364.field5482[var10] = arg0.method517(var9[var10], true);
        }
        class158[] var11 = class158.method1137(arg2, class474.field6988, 0);
        field1911 = new class528[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            field1911[var12] = arg0.method517(var11[var12], true);
        }
        class158[] var13 = class158.method1137(arg2, class11.field176, 0);
        class57.field829 = new class528[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class57.field829[var14] = arg0.method517(var13[var14], true);
        }
        class158[] var15 = class158.method1137(arg2, class274.field3961, 0);
        class436.field6341 = new class528[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class436.field6341[var16] = arg0.method517(var15[var16], true);
        }
        class158[] var17 = class158.method1137(arg2, class265.field3829, 0);
        class267.field3856 = new class528[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class267.field3856[var18] = arg0.method517(var17[var18], true);
        }
        class158[] var19 = class158.method1137(arg2, class439.field6405, 0);
        class113.field1797 = new class528[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class113.field1797[var20] = arg0.method517(var19[var20], true);
        }
        class158[] var21 = class158.method1137(arg2, class220.field3169, 0);
        class74.field1239 = new class528[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class74.field1239[var22] = arg0.method517(var21[var22], true);
        }
        class158[] var23 = class158.method1137(arg2, class277.field3995, 0);
        class317.field4545 = new class528[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class317.field4545[var24] = arg0.method517(var23[var24], true);
        }
        class158[] var25 = class158.method1137(arg2, class292.field4179, 0);
        class402.field5901 = new class528[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class402.field5901[var26] = arg0.method517(var25[var26], true);
        }
        class342.field5219 = arg0.method517(class158.method1134(arg2, class182.field2746, 0), true);
        class507.field7414 = arg0.method517(class158.method1134(arg2, class160.field2430, 0), true);
        class158[] var27 = class158.method1137(arg2, class17.field259, 0);
        class86.field1431 = new class528[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class86.field1431[var28] = arg0.method517(var27[var28], true);
        }
        if (arg1 <= 10) {
            method925(25);
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lqg;)V")
    public class122(class321 arg0) {
        this.field1904 = arg0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lbd;Lbd;IF)Z")
    public final boolean method927(class43 arg0, class43 arg1, int arg2, float arg3) {
        field1902++;
        if (!this.method924(false)) {
            return false;
        }
        class217 var5 = this.field1904.field4854;
        int var6 = -102 % ((arg2 - 20) / 63);
        class156 var7 = new class156(this.field1904, 6408, arg0.field659, arg0.field652);
        this.field1904.method2036((byte) 106, var5);
        boolean var8 = false;
        var5.method1439(var7, 0, 125);
        if (var5.method1444(-128)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field659, arg0.field652);
            OpenGL.glUseProgramObjectARB(this.field1900.field5973);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field1900.field5973, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field1900.field5973, "rcpRelief"), 1.0F / arg3);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field1900.field5973, "sampleSize"), 1.0F / (float) arg1.field659, 1.0F / (float) arg1.field652);
            for (int var9 = 0; var9 < arg0.field660; var9++) {
                float var10 = (float) var9 / (float) arg0.field660;
                this.field1904.method2042(arg1, 0);
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
                arg0.method328(0, var9, arg0.field652, 0, 0, 0, arg0.field659, (byte) 109);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var8 = true;
            OpenGL.glPopMatrix();
        }
        var5.method1445(1, 0);
        this.field1904.method2060((byte) -54, var5);
        return var8;
    }
}
