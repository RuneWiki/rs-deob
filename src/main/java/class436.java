import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class436 {

    @OriginalMember(owner = "client!im", name = "d", descriptor = "Llea;")
    private class573 field6067;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "[I")
    public static int[] field6069 = new int[3];

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Lkba;")
    private class25 field6068;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZLjava/lang/String;II)I", line = 3)
    public static final int method2601(boolean arg0, String arg1, int arg2, int arg3) {
        field6064++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg3 != 6408) {
            return 41;
        }
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg2) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if ((var10 / arg2) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()V", line = 83)
    public static final void method2602() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class495.field6792.length; var1++) {
                if (class495.field6792[var1].method3999()) {
                    class346.field4931[var1] = class495.field6792[var1].method4002();
                } else {
                    synchronized (class495.field6792[var1]) {
                        class495.field6792[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class495.field6792[class495.field6792.length - 1].method3997();
                class243.method1616(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class495.field6792.length - 1; var4++) {
                        if (!class495.field6792[var4].method3999()) {
                            synchronized (class495.field6792[var4]) {
                                class495.field6792[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class495.field6792.length - 2; var6++) {
                            class495.field6792[var6].method3997();
                        }
                        class243.method1616(2);
                        while (!class495.field6792[0].method3999()) {
                            synchronized (class495.field6792[0]) {
                                class495.field6792[0].notify();
                            }
                            try {
                                class579.method3405(1L, 10);
                            } catch (Exception var9) {
                            }
                        }
                        class495.field6792[0].method3997();
                        return;
                    }
                    try {
                        class579.method3405(1L, 10);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class579.method3405(1L, 10);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILcfa;FLcfa;)Z", line = 176)
    public final boolean method2603(int arg0, class188 arg1, float arg2, class188 arg3) {
        if (arg0 >= -32) {
            return false;
        }
        field6066++;
        if (!this.method2604(3)) {
            return false;
        }
        class727 var5 = this.field6067.field8244;
        class399 var6 = new class399(this.field6067, 6408, arg1.field2837, arg1.field2839);
        this.field6067.method3307(var5, 30909);
        boolean var7 = false;
        var5.method4034(var6, 1, 0);
        if (var5.method4032(0)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field2837, arg1.field2839);
            OpenGL.glUseProgramObjectARB(this.field6068.field277);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field6068.field277, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field6068.field277, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field6068.field277, "sampleSize"), 1.0F / (float) arg3.field2837, 1.0F / (float) arg3.field2839);
            for (int var8 = 0; var8 < arg1.field2831; var8++) {
                float var9 = (float) var8 / (float) arg1.field2831;
                this.field6067.method3384(arg3, (byte) 96);
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
                arg1.method1361(arg1.field2837, var8, 0, 0, 0, arg1.field2839, 0, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var7 = true;
        }
        var5.method4036(1, 0);
        this.field6067.method3372((byte) -94, var5);
        return var7;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Z", line = 247)
    public final boolean method2604(int arg0) {
        field6065++;
        if (arg0 != 3) {
            return false;
        }
        if (this.field6067.field8207 && this.field6067.field8175 && this.field6068 == null) {
            class235 var2 = class472.method2756(-21541, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field6067, 35632);
            if (var2 != null) {
                this.field6068 = class505.method2954(new class235[] { var2 }, this.field6067, (byte) -116);
            }
        }
        return this.field6068 != null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILus;ZI)V", line = 274)
    public static final void method2605(int arg0, class341 arg1, boolean arg2, int arg3) {
        if (!arg2) {
            method2602();
        }
        field6070++;
        class548.field7629[arg3][arg0] = arg1;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 289)
    public static void method2606(byte arg0) {
        int var1 = -109 / ((arg0 - 45) / 55);
        field6069 = null;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Llea;)V", line = 299)
    public class436(class573 arg0) {
        this.field6067 = arg0;
    }
}
