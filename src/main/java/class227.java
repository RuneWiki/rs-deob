import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class227 extends class345 implements class172 {

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Lac;")
    private class320 field3188 = new class320();

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Lic;")
    private class417 field3193 = new class324();

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public int field3201 = 3;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public int field3199 = 8;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "Z")
    private boolean field3200 = false;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "[Lvc;")
    private class172[] field3205 = new class172[4];

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    private int field3203 = -1;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "Laq;")
    private class90 field3202 = new class90();

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "Laq;")
    private class90 field3207 = new class90();

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "Laq;")
    private class90 field3208 = new class90();

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "Laq;")
    private class90 field3209 = new class90();

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "Laq;")
    private class90 field3210 = new class90();

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "Laq;")
    private class90 field3211 = new class90();

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "Laq;")
    private class90 field3212 = new class90();

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "I")
    private int field3228 = 8448;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "F")
    public float field3214 = 3584.0F;

    @OriginalMember(owner = "client!tb", name = "sb", descriptor = "[F")
    private float[] field3234 = new float[4];

    @OriginalMember(owner = "client!tb", name = "Ab", descriptor = "I")
    public int field3242 = -1;

    @OriginalMember(owner = "client!tb", name = "tb", descriptor = "F")
    public float field3235 = -1.0F;

    @OriginalMember(owner = "client!tb", name = "ub", descriptor = "I")
    public int field3236 = 512;

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "F")
    public float field3231 = 3584.0F;

    @OriginalMember(owner = "client!tb", name = "rb", descriptor = "F")
    public float field3233 = 1.0F;

    @OriginalMember(owner = "client!tb", name = "Jb", descriptor = "I")
    private int field3251 = 0;

    @OriginalMember(owner = "client!tb", name = "uc", descriptor = "F")
    public float field3288 = 1.0F;

    @OriginalMember(owner = "client!tb", name = "oc", descriptor = "I")
    public int field3282 = 512;

    @OriginalMember(owner = "client!tb", name = "Pb", descriptor = "I")
    private int field3257 = -1;

    @OriginalMember(owner = "client!tb", name = "Fb", descriptor = "F")
    public float field3247 = 1.0F;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    public int field3227 = -1;

    @OriginalMember(owner = "client!tb", name = "mc", descriptor = "[F")
    public float[] field3280 = new float[4];

    @OriginalMember(owner = "client!tb", name = "qc", descriptor = "I")
    public int field3284 = 0;

    @OriginalMember(owner = "client!tb", name = "zc", descriptor = "[F")
    private float[] field3293 = new float[16];

    @OriginalMember(owner = "client!tb", name = "yc", descriptor = "F")
    private float field3292 = 1.0F;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    private int field3218 = 0;

    @OriginalMember(owner = "client!tb", name = "Vb", descriptor = "I")
    public int field3263 = 3584;

    @OriginalMember(owner = "client!tb", name = "Fc", descriptor = "I")
    private int field3299 = -1;

    @OriginalMember(owner = "client!tb", name = "Cb", descriptor = "I")
    private int field3244 = 0;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "[F")
    private float[] field3225 = new float[4];

    @OriginalMember(owner = "client!tb", name = "Lc", descriptor = "I")
    private int field3305 = 0;

    @OriginalMember(owner = "client!tb", name = "rc", descriptor = "I")
    private int field3285 = 0;

    @OriginalMember(owner = "client!tb", name = "Yb", descriptor = "I")
    private int field3266 = 0;

    @OriginalMember(owner = "client!tb", name = "Gc", descriptor = "I")
    public int field3300 = 0;

    @OriginalMember(owner = "client!tb", name = "Nc", descriptor = "Z")
    private boolean field3307 = true;

    @OriginalMember(owner = "client!tb", name = "Kc", descriptor = "[F")
    private float[] field3304 = new float[4];

    @OriginalMember(owner = "client!tb", name = "Tc", descriptor = "I")
    private int field3313 = 0;

    @OriginalMember(owner = "client!tb", name = "Bc", descriptor = "F")
    private float field3295 = 1.0F;

    @OriginalMember(owner = "client!tb", name = "wc", descriptor = "I")
    private int field3290 = 8448;

    @OriginalMember(owner = "client!tb", name = "Oc", descriptor = "F")
    public float field3308 = -1.0F;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    public int field3221 = -1;

    @OriginalMember(owner = "client!tb", name = "Mc", descriptor = "I")
    public int field3306 = 50;

    @OriginalMember(owner = "client!tb", name = "Jc", descriptor = "F")
    private float field3303 = 0.0F;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3190;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lja;")
    public class152 field3186;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "Ljaggl/context;")
    private context field3192;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Ljaggl/opengl;")
    public opengl field3184;

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "Z")
    public boolean field3229;

    @OriginalMember(owner = "client!tb", name = "xb", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!tb", name = "zb", descriptor = "Ljava/lang/String;")
    private String field3241;

    @OriginalMember(owner = "client!tb", name = "hc", descriptor = "Ljava/lang/String;")
    private String field3275;

    @OriginalMember(owner = "client!tb", name = "gc", descriptor = "Z")
    private boolean field3274;

    @OriginalMember(owner = "client!tb", name = "Kb", descriptor = "Z")
    public boolean field3252;

    @OriginalMember(owner = "client!tb", name = "bc", descriptor = "Z")
    public boolean field3269;

    @OriginalMember(owner = "client!tb", name = "Gb", descriptor = "Z")
    public boolean field3248;

    @OriginalMember(owner = "client!tb", name = "ac", descriptor = "Z")
    private boolean field3268;

    @OriginalMember(owner = "client!tb", name = "Pc", descriptor = "Z")
    public boolean field3309;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "Lvm;")
    public class409 field3191;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lpc;")
    private class402 field3181;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Lag;")
    private class408 field3183;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Lji;")
    private class365 field3180;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "[F")
    private static float[] field3182 = new float[4];

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field3187 = Boolean.FALSE;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "[I")
    private static int[] field3189 = new int[1000];

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "[F")
    private static float[] field3185 = new float[4];

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "F")
    public float field3223;

    @OriginalMember(owner = "client!tb", name = "wb", descriptor = "F")
    private float field3238;

    @OriginalMember(owner = "client!tb", name = "Db", descriptor = "F")
    private float field3245;

    @OriginalMember(owner = "client!tb", name = "Wb", descriptor = "F")
    public float field3264;

    @OriginalMember(owner = "client!tb", name = "Zb", descriptor = "F")
    public float field3267;

    @OriginalMember(owner = "client!tb", name = "fc", descriptor = "F")
    public float field3273;

    @OriginalMember(owner = "client!tb", name = "ic", descriptor = "F")
    public float field3276;

    @OriginalMember(owner = "client!tb", name = "kc", descriptor = "F")
    public float field3278;

    @OriginalMember(owner = "client!tb", name = "tc", descriptor = "F")
    public float field3287;

    @OriginalMember(owner = "client!tb", name = "Qc", descriptor = "F")
    public float field3310;

    @OriginalMember(owner = "client!tb", name = "Uc", descriptor = "F")
    private float field3314;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    private int field3206;

    @OriginalMember(owner = "client!tb", name = "Bb", descriptor = "I")
    private int field3243;

    @OriginalMember(owner = "client!tb", name = "Eb", descriptor = "I")
    private int field3246;

    @OriginalMember(owner = "client!tb", name = "Lb", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!tb", name = "Ob", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!tb", name = "Tb", descriptor = "I")
    public int field3261;

    @OriginalMember(owner = "client!tb", name = "jc", descriptor = "I")
    private int field3277;

    @OriginalMember(owner = "client!tb", name = "pc", descriptor = "I")
    private int field3283;

    @OriginalMember(owner = "client!tb", name = "sc", descriptor = "I")
    private int field3286;

    @OriginalMember(owner = "client!tb", name = "vc", descriptor = "I")
    private int field3289;

    @OriginalMember(owner = "client!tb", name = "xc", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!tb", name = "Hc", descriptor = "I")
    private int field3301;

    @OriginalMember(owner = "client!tb", name = "Ic", descriptor = "I")
    private int field3302;

    @OriginalMember(owner = "client!tb", name = "Vc", descriptor = "I")
    private int field3315;

    @OriginalMember(owner = "client!tb", name = "Wc", descriptor = "I")
    private int field3316;

    @OriginalMember(owner = "client!tb", name = "Sb", descriptor = "J")
    private long field3260;

    @OriginalMember(owner = "client!tb", name = "Ac", descriptor = "Lqb;")
    private class122 field3294;

    @OriginalMember(owner = "client!tb", name = "Ec", descriptor = "Lkf;")
    private class137 field3298;

    @OriginalMember(owner = "client!tb", name = "yb", descriptor = "Lok;")
    private class138 field3240;

    @OriginalMember(owner = "client!tb", name = "Rc", descriptor = "Lmm;")
    private class153 field3311;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "Lvc;")
    private class172 field3196;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "Llp;")
    public class221 field3215;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "Llp;")
    public class221 field3216;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "Llp;")
    public class221 field3219;

    @OriginalMember(owner = "client!tb", name = "Ib", descriptor = "Llp;")
    public class221 field3250;

    @OriginalMember(owner = "client!tb", name = "cc", descriptor = "Llp;")
    public class221 field3270;

    @OriginalMember(owner = "client!tb", name = "Sc", descriptor = "Llp;")
    public class221 field3312;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "Lnd;")
    public class324 field3213;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "Lnd;")
    public class324 field3226;

    @OriginalMember(owner = "client!tb", name = "Nb", descriptor = "Lim;")
    public class342 field3255;

    @OriginalMember(owner = "client!tb", name = "Ub", descriptor = "Lim;")
    public class342 field3262;

    @OriginalMember(owner = "client!tb", name = "lc", descriptor = "Lim;")
    public class342 field3279;

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "Lwq;")
    public class93 field3232;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "Z")
    public boolean field3220;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "Z")
    private boolean field3222;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "Z")
    private boolean field3224;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "Z")
    private boolean field3230;

    @OriginalMember(owner = "client!tb", name = "vb", descriptor = "Z")
    public boolean field3237;

    @OriginalMember(owner = "client!tb", name = "Hb", descriptor = "Z")
    private boolean field3249;

    @OriginalMember(owner = "client!tb", name = "Mb", descriptor = "Z")
    private boolean field3254;

    @OriginalMember(owner = "client!tb", name = "Qb", descriptor = "Z")
    private boolean field3258;

    @OriginalMember(owner = "client!tb", name = "Rb", descriptor = "Z")
    private boolean field3259;

    @OriginalMember(owner = "client!tb", name = "Xb", descriptor = "Z")
    public boolean field3265;

    @OriginalMember(owner = "client!tb", name = "dc", descriptor = "Z")
    private boolean field3271;

    @OriginalMember(owner = "client!tb", name = "ec", descriptor = "Z")
    private boolean field3272;

    @OriginalMember(owner = "client!tb", name = "nc", descriptor = "Z")
    public boolean field3281;

    @OriginalMember(owner = "client!tb", name = "Cc", descriptor = "Z")
    public boolean field3296;

    @OriginalMember(owner = "client!tb", name = "Dc", descriptor = "Z")
    private boolean field3297;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "[Lue;")
    private class127[] field3217;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([IIIII)Lsg;", line = 6)
    public final class226 method128(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class179(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(III)V", line = 10)
    public final void method1504(int arg0, int arg1, int arg2) {
        this.field3184.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 15)
    public final void method92(Rectangle[] arg0, int arg1) {
        this.method118();
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "()Z", line = 18)
    public final boolean method69() {
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "()V", line = 21)
    public final void method1505() {
        if (this.field3289 != 0) {
            this.field3289 = 0;
            this.field3302 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "()V", line = 31)
    public final void method135() {
        this.method1519(true);
        this.field3184.glClear(256);
    }

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "()I", line = 36)
    private final int method1506() {
        int var1 = 0;
        this.field3241 = this.field3184.glGetString(7936);
        this.field3275 = this.field3184.glGetString(7937);
        String var2 = this.field3241.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field3184.glGetString(7938);
        String[] var4 = class46.method408((byte) 68, ' ', var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class66.method512((byte) 118, var4[0]);
                int var6 = class66.method512((byte) 118, var4[1]);
                this.field3283 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field3283 < 12) {
            var1 |= 0x2;
        }
        if (!this.field3184.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field3184.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field3184.glGetIntegerv(34018, var8, 0);
        this.field3261 = var8[0];
        this.field3184.glGetIntegerv(34929, var8, 0);
        this.field3253 = var8[0];
        this.field3184.glGetIntegerv(34930, var8, 0);
        this.field3277 = var8[0];
        if (this.field3261 < 2 || this.field3253 < 2 || this.field3277 < 2) {
            var1 |= 0x10;
        }
        this.field3224 = class294.field4126 != null && class294.field4126.startsWith("mac");
        this.field3229 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field3274 = this.field3184.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field3272 = this.field3184.isExtensionAvailable("GL_ARB_multisample");
        this.field3237 = this.field3184.isExtensionAvailable("GL_ARB_vertex_program");
        this.field3184.isExtensionAvailable("GL_ARB_fragment_program");
        this.field3184.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field3220 = this.field3184.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field3252 = this.field3184.isExtensionAvailable("GL_EXT_texture3D");
        this.field3248 = this.field3184.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field3296 = this.field3184.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field3269 = this.field3184.isExtensionAvailable("GL_ARB_texture_float");
        this.field3281 = false;
        this.field3309 = this.field3184.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIII)V", line = 107)
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "()Z", line = 109)
    public final boolean method102() {
        return this.field3272;
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V", line = 113)
    public final synchronized void method1507(int arg0) {
        class406 var2 = new class406(arg0);
        this.field3209.method643(var2, -103);
    }

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "()V", line = 117)
    private final void method1508() {
        if (this.field3266 <= this.field3305 && this.field3313 <= this.field3244) {
            this.field3184.glScissor(this.field3266 + this.field3218, this.field3251 + this.field3194 - this.field3244, this.field3305 - this.field3266, this.field3244 - this.field3313);
        } else {
            this.field3184.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "()V", line = 126)
    public final void method75() {
        if (this.field3197 <= 0 && this.field3194 <= 0) {
            return;
        }
        int var1 = this.field3266;
        int var2 = this.field3305;
        int var3 = this.field3313;
        int var4 = this.field3244;
        this.method143();
        this.field3184.glReadBuffer(1028);
        this.field3184.glDrawBuffer(1029);
        this.method1505();
        this.method1520(false);
        this.method1544(false);
        this.method1564(false);
        this.method1519(false);
        this.method1559((class127) null);
        this.method1516(-2);
        this.method1569(0);
        this.method1510(0);
        this.field3184.glMatrixMode(5889);
        this.field3184.glLoadIdentity();
        this.field3184.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field3184.glMatrixMode(5888);
        this.field3184.glLoadIdentity();
        this.field3184.glRasterPos2i(0, 0);
        this.field3184.glCopyPixels(0, 0, this.field3197, this.field3194, 6144);
        this.field3184.glFlush();
        this.field3184.glReadBuffer(1029);
        this.field3184.glDrawBuffer(1029);
        this.method136(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "()V", line = 163)
    private final void method1509() {
        this.field3184.glLoadIdentity();
        this.field3184.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field3184.glMultMatrixf(this.field3226.method2082(-4061), 0);
        this.method1562();
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(IIIIII)Lqe;", line = 169)
    public final class275 method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field3296 ? new class355(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "(I)V", line = 172)
    public final void method1510(int arg0) {
        if (this.field3246 == arg0) {
            return;
        }
        byte var2;
        boolean var3;
        boolean var4;
        if (arg0 == 1) {
            var2 = 1;
            var3 = true;
            var4 = true;
        } else if (arg0 == 2) {
            var2 = 2;
            var3 = true;
            var4 = false;
        } else if (arg0 == 128) {
            var2 = 2;
            var3 = false;
            var4 = true;
        } else if (arg0 == 129) {
            var2 = 3;
            var3 = false;
            var4 = true;
        } else if (arg0 == 130) {
            var2 = 4;
            var3 = true;
            var4 = true;
        } else {
            var2 = 0;
            var3 = true;
            var4 = false;
        }
        if (this.field3259 != var3) {
            this.field3184.glColorMask(var3, var3, var3, true);
            this.field3259 = var3;
        }
        if (this.field3258 != var4) {
            if (var4) {
                this.field3184.glEnable(3008);
            } else {
                this.field3184.glDisable(3008);
            }
            this.field3258 = var4;
        }
        if (this.field3301 != var2) {
            if (var2 == 1) {
                this.field3184.glEnable(3042);
                this.field3184.glBlendEquation(32774);
                this.field3184.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field3184.glEnable(3042);
                this.field3184.glBlendEquation(32774);
                this.field3184.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field3184.glEnable(3042);
                this.field3184.glBlendEquation(32778);
                this.field3184.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field3184.glEnable(3042);
                this.field3184.glBlendEquation(32774);
                this.field3184.glBlendFunc(774, 1);
            } else {
                this.field3184.glDisable(3042);
            }
            this.field3301 = var2;
        }
        this.field3246 = arg0;
        this.field3302 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "()V", line = 282)
    public final void method1511() {
        if (this.field3302 == 2) {
            return;
        }
        this.method1574();
        this.method1520(false);
        this.method1544(false);
        this.method1564(false);
        this.method1519(false);
        this.method1516(-2);
        this.field3302 = 2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILep;II)V", line = 296)
    public final void method86(int arg0, class241 arg1, int arg2, int arg3) {
        class234 var5 = (class234) arg1;
        class137 var6 = var5.field3353;
        this.method1511();
        this.method1559(var5.field3353);
        this.method1510(1);
        this.method1542(7681, 8448);
        this.method1512(0, 34167, 768);
        float var7 = var6.field1976 / (float) var6.field1974;
        float var8 = var6.field1975 / (float) var6.field1977;
        this.field3184.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field3184.glBegin(7);
        this.field3184.glTexCoord2f((float) (this.field3266 - arg2) * var7, (float) (this.field3313 - arg3) * var8);
        this.field3184.glVertex2i(this.field3266, this.field3313);
        this.field3184.glTexCoord2f((float) (this.field3266 - arg2) * var7, (float) (this.field3244 - arg3) * var8);
        this.field3184.glVertex2i(this.field3266, this.field3244);
        this.field3184.glTexCoord2f((float) (this.field3305 - arg2) * var7, (float) (this.field3244 - arg3) * var8);
        this.field3184.glVertex2i(this.field3305, this.field3244);
        this.field3184.glTexCoord2f((float) (this.field3305 - arg2) * var7, (float) (this.field3313 - arg3) * var8);
        this.field3184.glVertex2i(this.field3305, this.field3313);
        this.field3184.glEnd();
        this.method1512(0, 5890, 768);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIIII)V", line = 325)
    public final void method133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(III)V", line = 329)
    public final void method1512(int arg0, int arg1, int arg2) {
        this.field3184.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field3184.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V", line = 333)
    public final void method110(int arg0) {
        this.method1548();
    }

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "()V", line = 342)
    public final void method60() {
        if (this.field3180.method1996(1)) {
            this.field3183.method2555(this.field3180);
            this.field3191.method2562(-116);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[[I[[IIII)Lij;", line = 351)
    public final class242 method88(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class111(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lq;Lq;Lq;Lq;)V", line = 356)
    public final void method1513(class246 arg0, class246 arg1, class246 arg2, class246 arg3) {
        if (arg0 == null) {
            this.field3184.glDisableClientState(32884);
        } else {
            this.field3184.glEnableClientState(32884);
            arg0.method1662((byte) -13);
        }
        if (arg1 == null) {
            this.field3184.glDisableClientState(32885);
        } else {
            this.field3184.glEnableClientState(32885);
            arg1.method1664(16005);
        }
        if (arg2 == null) {
            this.field3184.glDisableClientState(32886);
        } else {
            this.field3184.glEnableClientState(32886);
            arg2.method1661(6813);
        }
        if (arg3 == null) {
            this.field3184.glDisableClientState(32888);
        } else {
            this.field3184.glEnableClientState(32888);
            arg3.method1663(false);
        }
    }

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "()Z", line = 390)
    public final boolean method127() {
        return !this.field3224;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(IIII)V", line = 395)
    public final void method63(int arg0, int arg1, int arg2, int arg3) {
        this.field3300 = arg0;
        this.field3284 = arg1;
        this.field3282 = arg2;
        this.field3236 = arg3;
        this.method1517();
        this.method1575();
        if (this.field3289 == 3) {
            this.method1558();
        } else if (this.field3289 == 2) {
            this.method1540();
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V", line = 410)
    public final void method94(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "()Z", line = 419)
    public final boolean method141() {
        return this.field3180.method1996(1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lvc;)V", line = 423)
    public final void method1514(class172 arg0) {
        if (this.field3203 >= 3) {
            throw new RuntimeException();
        }
        if (this.field3203 >= 0) {
            this.field3205[this.field3203].method661();
        }
        this.field3196 = this.field3205[++this.field3203] = arg0;
        this.field3196.method662();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZZ)V", line = 433)
    public final void method1515(int arg0, boolean arg1, boolean arg2) {
        if (this.field3243 != arg0) {
            if (arg0 < 0) {
                this.method1524();
                this.method1559((class127) null);
                if (!this.field3265) {
                    this.field3181.method2527(arg2, arg1, 105, 0);
                }
            } else {
                class342 var4 = this.field3191.method2563(34842, arg0);
                class454 var5 = this.field3186.method469(arg0, (byte) -93);
                if (var5.field6484 == 0 && var5.field6482 == 0) {
                    this.method1524();
                } else {
                    int var6 = var5.field6488 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method1533((float) (this.field3204 % var7 * var5.field6484) / (float) var7, (float) (this.field3204 % var7 * var5.field6482) / (float) var7, 0.0F);
                }
                if (this.field3265) {
                    this.field3181.method2527(arg2, arg1, 63, 3);
                    this.method1559(var4);
                } else {
                    this.field3181.method2527(arg2, arg1, 105, var5.field6471);
                    this.field3181.method2526(var5.field6476, false, (byte) 119);
                    if (!this.field3181.method2525((byte) 124, var4)) {
                        this.method1559(var4);
                    }
                }
            }
            this.field3243 = arg0;
        }
        this.field3302 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "(I)V", line = 482)
    public final void method1516(int arg0) {
        this.method1555(arg0, true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Llg;Z)Lsg;", line = 488)
    public final class226 method105(class238 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field3392 * arg0.field3388];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field3391 == null) {
            for (int var8 = 0; var8 < arg0.field3392; var8++) {
                for (int var9 = 0; var9 < arg0.field3388; var9++) {
                    int var10 = arg0.field3393[arg0.field3390[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field3392; var6++) {
                for (int var7 = 0; var7 < arg0.field3388; var7++) {
                    var3[var5++] = arg0.field3391[var4] << 24 | arg0.field3393[arg0.field3390[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class226 var11 = this.method128(var3, 0, arg0.field3388, arg0.field3388, arg0.field3392);
        var11.method595(arg0.field3385, arg0.field3387, arg0.field3389, arg0.field3386);
        return var11;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lip;)V", line = 544)
    public final void method77(class423 arg0) {
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIII[BII)V", line = 550)
    public final void method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field3298 == null || this.field3298.field4668 < arg2 || this.field3298.field4667 < arg3) {
            this.field3298 = class137.method949(6406, false, 6406, this, (byte) 123, arg2, arg6, arg3);
            this.field3298.method2174(false, false);
            var10 = this.field3298.field1975;
            var11 = this.field3298.field1976;
        } else {
            this.field3298.method2172(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field3298.field1975 / (float) this.field3298.field4667;
            var11 = (float) arg2 * this.field3298.field1976 / (float) this.field3298.field4668;
        }
        this.method1511();
        this.method1559(this.field3298);
        this.method1510(arg8);
        this.field3184.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1549(arg5);
        this.method1542(34165, 34165);
        this.method1512(0, 34166, 768);
        this.method1512(2, 5890, 770);
        this.method1572(0, 34166, 770);
        this.method1572(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field3184.glBegin(7);
        this.field3184.glTexCoord2f(0.0F, 0.0F);
        this.field3184.glVertex2f(var12, var13);
        this.field3184.glTexCoord2f(0.0F, var11);
        this.field3184.glVertex2f(var12, var15);
        this.field3184.glTexCoord2f(var10, var11);
        this.field3184.glVertex2f(var14, var15);
        this.field3184.glTexCoord2f(var10, 0.0F);
        this.field3184.glVertex2f(var14, var13);
        this.field3184.glEnd();
        this.method1512(0, 5890, 768);
        this.method1512(2, 34166, 770);
        this.method1572(0, 5890, 770);
        this.method1572(2, 34166, 770);
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)Lip;", line = 598)
    public final class423 method65(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()I", line = 601)
    public final int method660() {
        return this.field3194;
    }

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "()V", line = 605)
    private final void method1517() {
        float[] var1 = this.field3293;
        float var2 = (float) (-this.field3300 * this.field3306) / (float) this.field3282;
        float var3 = (float) ((this.field3197 - this.field3300) * this.field3306) / (float) this.field3282;
        float var4 = (float) (this.field3306 * this.field3284) / (float) this.field3236;
        float var5 = (float) ((this.field3284 - this.field3194) * this.field3306) / (float) this.field3236;
        if (var2 == var3 || var4 == var5) {
            var1[0] = 1.0F;
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = 1.0F;
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = 0.0F;
            var1[9] = 0.0F;
            var1[10] = 1.0F;
            var1[11] = 0.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = 0.0F;
            var1[15] = 1.0F;
        } else {
            float var6 = (float) this.field3306 * 2.0F;
            var1[0] = var6 / (var3 - var2);
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = var6 / (var4 - var5);
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = (var2 + var3) / (var3 - var2);
            var1[9] = (var4 + var5) / (var4 - var5);
            var1[10] = this.field3245 = (float) (-(this.field3306 + this.field3263)) / (float) (this.field3263 - this.field3306);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field3314 = -((float) this.field3263 * var6) / (float) (this.field3263 - this.field3306);
            var1[15] = 0.0F;
        }
        this.method1545();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([Lmj;Lmr;Lic;[Lvf;I)V", line = 659)
    public final void method123(class394[] arg0, class77 arg1, class417 arg2, class84[] arg3, int arg4) {
        this.method79(arg0, arg2, arg3, arg4);
        this.method83(arg1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 663)
    public final void method103(int arg0) {
        this.method1543();
    }

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "(I)I", line = 666)
    public final int method1518(int arg0) {
        if (arg0 == 6406 || arg0 == 6409) {
            return 1;
        } else if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408 || arg0 == 34847) {
            return 4;
        } else if (arg0 == 34843) {
            return 6;
        } else if (arg0 == 34842) {
            return 8;
        } else if (arg0 == 6402) {
            return 3;
        } else if (arg0 == 6401) {
            return 1;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(Z)V", line = 701)
    public final void method1519(boolean arg0) {
        if (this.field3297 != arg0) {
            this.field3297 = arg0;
            this.method1550();
            this.field3302 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(II)V", line = 712)
    public final void method47(int arg0, int arg1) {
        if (this.field3306 == arg0 && this.field3263 == arg1) {
            return;
        }
        this.field3306 = arg0;
        this.field3263 = arg1;
        this.method1517();
        this.method1560();
        if (this.field3289 == 3) {
            this.method1558();
        } else if (this.field3289 == 2) {
            this.method1540();
        }
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(Z)V", line = 729)
    public final void method1520(boolean arg0) {
        if (this.field3254 != arg0) {
            this.field3254 = arg0;
            this.method1523();
            this.field3302 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "()V", line = 739)
    public final void method1521() {
        if (this.field3302 == 4) {
            return;
        }
        this.method1574();
        this.method1520(false);
        this.method1544(false);
        this.method1564(false);
        this.method1519(false);
        this.method1516(-2);
        this.method1510(1);
        this.method1569(1);
        this.field3302 = 4;
    }

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "()V", line = 758)
    private final void method1522() {
        if (this.field3230 && !this.field3222) {
            this.field3184.glEnable(2896);
        } else {
            this.field3184.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "()V", line = 767)
    private final void method1523() {
        if (this.field3254 && this.field3265 | this.field3227 >= 0) {
            this.field3184.glEnable(2912);
        } else {
            this.field3184.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "()V", line = 778)
    private final void method1524() {
        if (this.field3271) {
            this.field3184.glMatrixMode(5890);
            this.field3184.glLoadIdentity();
            this.field3184.glMatrixMode(5888);
            this.field3271 = false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "(I)I", line = 788)
    public final int method1525(int arg0) {
        if (arg0 == 0) {
            return 7681;
        } else if (arg0 == 1) {
            return 8448;
        } else if (arg0 == 2) {
            return 34165;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "()I", line = 803)
    public final int method131() {
        int var1 = this.field3315;
        this.field3315 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(FF)V", line = 810)
    public final void method1526(float arg0, float arg1) {
        this.field3295 = arg0;
        this.field3303 = arg1;
        if (!this.field3265) {
            this.method1560();
        }
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "()Z", line = 821)
    public final boolean method51() {
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 824)
    public final void method81(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(Z)V", line = 828)
    public final void method1527(boolean arg0) {
        if (this.field3222 != arg0) {
            this.field3222 = arg0;
            this.method1522();
        }
    }

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "()V", line = 838)
    public final void method95() {
        this.field3183.method2556();
    }

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "()Z", line = 845)
    public final boolean method140() {
        return this.field3180.method2357();
    }

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "()V", line = 848)
    public final void method1528() {
        if (this.field3302 == 8) {
            return;
        }
        this.method1563();
        this.method1520(true);
        this.method1564(true);
        this.method1519(true);
        this.method1510(1);
        this.method1569(1);
        this.field3302 = 8;
    }

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "()V", line = 862)
    public final void method1529() {
        if (this.field3302 == 16) {
            return;
        }
        this.method1552();
        this.method1520(true);
        this.method1564(true);
        this.method1519(true);
        this.method1510(1);
        this.method1569(1);
        this.field3302 = 16;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III[I)V", line = 877)
    public final void method115(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field3226.field4430 + (float) arg0 * this.field3226.field4440 + (float) arg1 * this.field3226.field4439 + this.field3226.field4434;
        if ((var5 < (float) this.field3306) || (var5 > (float) this.field3263)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field3226.field4435 + (float) arg0 * this.field3226.field4433 + (float) arg1 * this.field3226.field4432 + this.field3226.field4438) * (float) this.field3282 / var5);
        int var7 = (int) (((float) arg2 * this.field3226.field4437 + (float) arg0 * this.field3226.field4436 + (float) arg1 * this.field3226.field4429 + this.field3226.field4431) * (float) this.field3236 / var5);
        if ((float) var6 >= this.field3223 && (float) var6 <= this.field3264 && (float) var7 >= this.field3276 && (float) var7 <= this.field3267) {
            arg3[0] = (int) ((float) var6 - this.field3223);
            arg3[1] = (int) ((float) var7 - this.field3276);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IFFFFF)V", line = 906)
    public final void method67(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field3299 != arg0;
        if (var7 || this.field3308 != arg1 || this.field3235 != arg2) {
            this.field3299 = arg0;
            this.field3308 = arg1;
            this.field3235 = arg2;
            if (var7) {
                this.field3288 = (float) (this.field3299 & 0xFF0000) / 1.671168E7F;
                this.field3247 = (float) (this.field3299 & 0xFFFF) / 65535.0F;
                this.field3233 = (float) (this.field3299 & 0xFF) / 255.0F;
                this.method1573();
            }
            this.method1538();
        }
        if (this.field3304[0] == arg3 && this.field3304[1] == arg4 && this.field3304[2] == arg5) {
            return;
        }
        this.field3304[0] = arg3;
        this.field3304[1] = arg4;
        this.field3304[2] = arg5;
        this.field3225[0] = -arg3;
        this.field3225[1] = -arg4;
        this.field3225[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field3280[0] = arg3 * var8;
        this.field3280[1] = arg4 * var8;
        this.field3280[2] = arg5 * var8;
        this.field3234[0] = -this.field3280[0];
        this.field3234[1] = -this.field3280[1];
        this.field3234[2] = -this.field3280[2];
        this.method1562();
        this.field3291 = (int) (arg3 * 256.0F / arg4);
        this.field3256 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "()V", line = 948)
    private final void method1530() {
        if (this.field3302 == 1) {
            return;
        }
        this.method1574();
        this.method1520(false);
        this.method1544(false);
        this.method1564(false);
        this.method1519(false);
        this.method1559((class127) null);
        this.method1516(-2);
        this.method1569(0);
        this.field3302 = 1;
    }

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "()Lds;", line = 963)
    public final class10 method1531() {
        return this.field3311 == null ? null : this.field3311.method1031((byte) 127);
    }

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "(I)I", line = 966)
    public final int method1532(int arg0) {
        if (arg0 == 5121 || arg0 == 5120) {
            return 1;
        } else if (arg0 == 5123 || arg0 == 5122) {
            return 2;
        } else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V", line = 980)
    public final void method45(int arg0, int arg1, int arg2, int arg3) {
        this.field3183.method2561(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "()Z", line = 984)
    public final boolean method93() {
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "()Lic;", line = 987)
    public final class417 method84() {
        return this.field3193;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V", line = 992)
    public final void method120(int arg0, int arg1) {
        if (this.field3221 == arg0 && this.field3227 == arg1) {
            return;
        }
        this.field3221 = arg0;
        this.field3227 = arg1;
        if (!this.field3265) {
            this.method1560();
            this.method1523();
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(FFF)V", line = 1007)
    private final void method1533(float arg0, float arg1, float arg2) {
        this.field3184.glMatrixMode(5890);
        if (this.field3271) {
            this.field3184.glLoadIdentity();
        }
        this.field3184.glTranslatef(arg0, arg1, arg2);
        this.field3184.glMatrixMode(5888);
        this.field3271 = true;
    }

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "()Z", line = 1016)
    public final boolean method109() {
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lok;)V", line = 1019)
    public final void method1534(class138 arg0) {
        if (this.field3240 != arg0 && this.field3274) {
            this.field3184.glBindBufferARB(34963, arg0.method392());
            this.field3240 = arg0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BIZ)Lok;", line = 1029)
    public final class138 method1535(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class138) (this.field3274 && !arg3 || this.field3268 ? new class43(this, arg0, arg1, arg2, arg3) : new class136(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(IIII)[I", line = 1041)
    public final int[] method142(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field3184.glReadPixels(arg0, this.field3194 - arg1 - var6, arg2, 1, 32993, this.field3239, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(II)V", line = 1058)
    public final synchronized void method1536(int arg0, int arg1) {
        class406 var3 = new class406(arg1);
        var3.field5600 = (long) arg0;
        this.field3209.method643(var3, -64);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lqb;", line = 1067)
    public final class122 method1537(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class122) (this.field3274 && !arg2 || this.field3268 ? new class118(this, arg0, arg1, arg2) : new class350(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lic;)V", line = 1077)
    public final void method126(class417 arg0) {
        this.field3226 = (class324) arg0;
        this.field3213.method2083(12, this.field3226);
        if (this.field3289 != 1) {
            this.method1509();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V", line = 1084)
    public final void method57(int arg0, int arg1, int arg2) {
        if (!this.field3265) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field3257 = arg1;
        this.field3242 = arg2;
        this.method1560();
        this.field3181.method2526(arg0, true, (byte) 119);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqe;Lqe;FLqe;)Lqe;", line = 1095)
    public final class275 method82(class275 arg0, class275 arg1, float arg2, class275 arg3) {
        if (arg0 != null && arg1 != null && this.field3296 && this.field3309) {
            class266 var5 = null;
            class153 var6 = (class153) arg0;
            class153 var7 = (class153) arg1;
            class10 var8 = var6.method1031((byte) 127);
            class10 var9 = var7.method1031((byte) 127);
            if (var8 != null && var9 != null) {
                int var10 = var8.field177 > var9.field177 ? var8.field177 : var9.field177;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class266) {
                    class266 var11 = (class266) arg3;
                    if (var11.method1730(-22085) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class266(this, var10);
                }
                var5.method1731(arg2, -1, var8, var9);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "()I", line = 1138)
    public final int method48() {
        return 4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[Lbh;)V", line = 1144)
    public final void method113(int arg0, class24[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class24 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field3185[0] = (float) var4.field407;
            field3185[1] = (float) var4.field409;
            field3185[2] = (float) var4.field408;
            field3185[3] = 1.0F;
            this.field3184.glLightfv(var5, 4611, field3185, 0);
            int var6 = var4.field413;
            float var7 = var4.field412 / 255.0F;
            field3185[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field3185[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field3185[2] = (float) (var6 & 0xFF) * var7;
            this.field3184.glLightfv(var5, 4609, field3185, 0);
            this.field3184.glLightf(var5, 4617, 1.0F / (float) (var4.field411 * var4.field411));
            this.field3184.glEnable(var5);
        }
        while (var3 < this.field3285) {
            this.field3184.glDisable(var3 + 16386);
            var3++;
        }
        this.field3285 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIIIII)V", line = 1183)
    public final void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1530();
        this.method1510(arg5);
        this.field3184.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3272) {
            this.field3184.glDisable(32925);
        }
        this.field3184.glBegin(7);
        this.field3184.glVertex2f(var7, var8);
        this.field3184.glVertex2f(var7, var10);
        this.field3184.glVertex2f(var9, var10);
        this.field3184.glVertex2f(var9, var8);
        this.field3184.glEnd();
        if (this.field3272) {
            this.field3184.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "()V", line = 1209)
    private final void method1538() {
        field3182[0] = this.field3308 * this.field3288;
        field3182[1] = this.field3308 * this.field3247;
        field3182[2] = this.field3308 * this.field3233;
        field3182[3] = 1.0F;
        this.field3184.glLightfv(16384, 4609, field3182, 0);
        field3182[0] = -this.field3235 * this.field3288;
        field3182[1] = -this.field3235 * this.field3247;
        field3182[2] = -this.field3235 * this.field3233;
        field3182[3] = 1.0F;
        this.field3184.glLightfv(16385, 4609, field3182, 0);
    }

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "()V", line = 1225)
    public final void method43() {
        this.field3181.method2527(false, false, 93, 0);
        this.field3265 = false;
        this.method1560();
        this.method1523();
    }

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "()Z", line = 1235)
    public final boolean method66() {
        return this.field3181.method2524(3, -1);
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(II)V", line = 1242)
    public final synchronized void method1539(int arg0, int arg1) {
        class406 var3 = new class406(arg1);
        var3.field5600 = (long) arg0;
        this.field3207.method643(var3, -66);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIII)V", line = 1249)
    public final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3184.glLineWidth((float) arg5);
        this.method119(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field3184.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIZ)Lsg;", line = 1254)
    public final class226 method117(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class179(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "()V", line = 1257)
    public final void method70() {
    }

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "()V", line = 1259)
    private final void method1540() {
        this.field3184.glMatrixMode(5889);
        this.field3184.glLoadMatrixf(this.field3293, 0);
        this.field3184.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "()Z", line = 1267)
    public final boolean method125() {
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(II)V", line = 1271)
    public final synchronized void method1541(int arg0, int arg1) {
        class406 var3 = new class406(arg1);
        var3.field5600 = (long) arg0;
        this.field3208.method643(var3, -72);
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(II)V", line = 1276)
    public final void method1542(int arg0, int arg1) {
        if (this.field3286 != 0) {
            this.field3184.glTexEnvi(8960, 34161, arg0);
            this.field3184.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field3290 != arg0) {
            this.field3184.glTexEnvi(8960, 34161, arg0);
            this.field3290 = arg0;
            var3 = true;
        }
        if (this.field3228 != arg1) {
            this.field3184.glTexEnvi(8960, 34162, arg1);
            this.field3228 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field3302 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FF)V", line = 1310)
    public final void method80(float arg0, float arg1) {
        if (this.field3310 == arg0 && this.field3273 == arg1) {
            return;
        }
        this.field3310 = arg0;
        this.field3273 = arg1;
        this.method1545();
        if (this.field3289 == 3) {
            this.method1558();
        } else if (this.field3289 == 2) {
            this.method1540();
        }
    }

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "()V", line = 1327)
    private final void method1543() {
        try {
            this.field3192.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIILep;II)V", line = 1337)
    public final void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class241 arg6, int arg7, int arg8) {
        class234 var10 = (class234) arg6;
        class137 var11 = var10.field3353;
        this.method1511();
        this.method1559(var10.field3353);
        this.method1510(arg5);
        this.method1542(7681, 8448);
        this.method1512(0, 34167, 768);
        float var12 = var11.field1976 / (float) var11.field1974;
        float var13 = var11.field1975 / (float) var11.field1977;
        this.field3184.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field3184.glBegin(1);
        this.field3184.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field3184.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field3184.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field3184.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field3184.glEnd();
        this.method1512(0, 5890, 768);
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(Z)V", line = 1360)
    public final void method1544(boolean arg0) {
        if (this.field3230 != arg0) {
            this.field3230 = arg0;
            this.method1522();
            this.field3302 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()V", line = 1369)
    public final void method661() {
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(Z)V", line = 1378)
    public final void method137(boolean arg0) {
    }

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "()Z", line = 1380)
    public final boolean method52() {
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "()V", line = 1384)
    private final void method1545() {
        if (this.field3273 == 0.0F) {
            this.field3293[10] = this.field3245;
            this.field3293[14] = this.field3314;
        } else {
            float var1 = this.field3310 / (this.field3310 + this.field3273);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field3314 * (1.0F - var1) / this.field3273;
            this.field3293[10] = this.field3245 + var3;
            this.field3293[14] = this.field3314 * var2;
        }
        this.field3231 = (this.field3293[14] - (float) this.field3263) / this.field3293[10];
        this.field3214 = (float) this.field3263 - this.field3273;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lmr;)V", line = 1410)
    public final void method83(class77 arg0) {
        this.field3188.method2069(this, arg0);
    }

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "()Z", line = 1415)
    public final boolean method99() {
        if (!this.field3180.method1996(1)) {
            if (!this.field3183.method2558(this.field3180)) {
                return false;
            }
            this.field3191.method2562(-125);
        }
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "(I)V", line = 1432)
    public final synchronized void method1546(int arg0) {
        class406 var2 = new class406(arg0);
        this.field3211.method643(var2, -79);
    }

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "()V", line = 1436)
    public final void method1547() {
        this.field3184.glPopMatrix();
    }

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "()V", line = 1440)
    private final void method1548() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field3192.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class349.method2219(1000L, -104);
        }
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "()I", line = 1461)
    public final int method145() {
        return this.field3198 + this.field3195 + this.field3206;
    }

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "()V", line = 1466)
    public final void method143() {
        this.field3266 = 0;
        this.field3313 = 0;
        this.field3305 = this.field3197;
        this.field3244 = this.field3194;
        this.field3184.glDisable(3089);
        this.method1575();
    }

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "(I)V", line = 1474)
    public final void method1549(int arg0) {
        field3182[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field3182[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field3182[2] = (float) (arg0 & 0xFF) / 255.0F;
        field3182[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field3184.glTexEnvfv(8960, 8705, field3182, 0);
    }

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "()V", line = 1482)
    private final void method1550() {
        this.field3184.glDepthMask(this.field3297 && this.field3307);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(IIIII)V", line = 1489)
    public final void method138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1530();
        this.method1510(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field3184.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field3184.glBegin(1);
        this.field3184.glVertex2f(var6, var7);
        this.field3184.glVertex2f(var6, (float) arg2 + var7);
        this.field3184.glEnd();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lnd;)V", line = 1502)
    public final void method1551(class324 arg0) {
        this.field3184.glPushMatrix();
        this.field3184.glMultMatrixf(arg0.method2082(-4061), 0);
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(IIIIII)Z", line = 1508)
    public final boolean method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field3226.field4430 + (float) arg0 * this.field3226.field4440 + (float) arg1 * this.field3226.field4439 + this.field3226.field4434;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field3226.field4430 + (float) arg3 * this.field3226.field4440 + (float) arg4 * this.field3226.field4439 + this.field3226.field4434;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field3306) || !(var8 < (float) this.field3306)) || !(!(var7 > (float) this.field3263) || !(var8 > (float) this.field3263))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field3226.field4435 + (float) arg0 * this.field3226.field4433 + (float) arg1 * this.field3226.field4432 + this.field3226.field4438) * (float) this.field3282 / var7);
        int var10 = (int) (((float) arg5 * this.field3226.field4435 + (float) arg3 * this.field3226.field4433 + (float) arg4 * this.field3226.field4432 + this.field3226.field4438) * (float) this.field3282 / var8);
        if ((float) var9 < this.field3223 && (float) var10 < this.field3223 || (float) var9 > this.field3264 && (float) var10 > this.field3264) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field3226.field4437 + (float) arg0 * this.field3226.field4436 + (float) arg1 * this.field3226.field4429 + this.field3226.field4431) * (float) this.field3236 / var7);
            int var12 = (int) (((float) arg5 * this.field3226.field4437 + (float) arg3 * this.field3226.field4436 + (float) arg4 * this.field3226.field4429 + this.field3226.field4431) * (float) this.field3236 / var8);
            return (!((float) var11 < this.field3276) || !((float) var12 < this.field3276)) && (!((float) var11 > this.field3267) || !((float) var12 > this.field3267));
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([I)V", line = 1537)
    public final void method107(int[] arg0) {
        arg0[0] = this.field3266;
        arg0[1] = this.field3313;
        arg0[2] = this.field3305;
        arg0[3] = this.field3244;
    }

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "()V", line = 1543)
    private final void method1552() {
        if (this.field3289 != 3) {
            this.field3289 = 3;
            this.method1558();
            this.method1509();
            this.field3302 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "()Lvc;", line = 1557)
    public final class172 method1553() {
        return this.field3196;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I[BIZ)Lqb;", line = 1561)
    public final class122 method1554(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class122) (this.field3274 && !arg3 || this.field3268 ? new class118(this, arg0, arg1, arg2, arg3) : new class350(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V", line = 1571)
    public final void method1555(int arg0, boolean arg1) {
        this.method1515(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()V", line = 1574)
    public final void method662() {
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V", line = 1578)
    public final void method96(boolean arg0) {
        this.field3307 = arg0;
        this.method1550();
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIII)V", line = 1584)
    public final void method136(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field3197) {
            arg2 = this.field3197;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field3194) {
            arg3 = this.field3194;
        }
        this.field3266 = arg0;
        this.field3313 = arg1;
        this.field3305 = arg2;
        this.field3244 = arg3;
        this.field3184.glEnable(3089);
        this.method1575();
        this.method1508();
    }

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "()V", line = 1605)
    private final void method1556() {
        this.field3226 = new class324();
        this.field3213 = new class324();
        this.field3217 = new class127[this.field3261];
        this.field3279 = new class342(this, 3553, 6408, 1, 1);
        this.field3262 = new class342(this, 3553, 6408, 1, 1);
        this.field3255 = new class342(this, 3553, 6408, 1, 1);
        this.field3250 = new class221(this);
        this.field3219 = new class221(this);
        this.field3312 = new class221(this);
        this.field3216 = new class221(this);
        this.field3270 = new class221(this);
        this.field3215 = new class221(this);
        if (this.field3309) {
            this.field3232 = new class93(this);
        }
        this.field3188.method2071(this);
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "()V", line = 1625)
    public final void method100() {
        if (this.field3184 != null) {
            try {
                this.field3183.method2559();
            } catch (Throwable var4) {
            }
            this.field3184 = null;
        }
        if (this.field3192 != null) {
            this.method1543();
            try {
                this.field3192.destroy();
            } catch (Throwable var3) {
            }
            this.field3192 = null;
        }
        if (this.field3200) {
            class90.method637(true, true, 120);
            this.field3200 = false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "()Z", line = 1656)
    public final boolean method124() {
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Lvc;)V", line = 1659)
    public final void method1557(class172 arg0) {
        if (this.field3203 < 0 || this.field3205[this.field3203] != arg0) {
            throw new RuntimeException();
        }
        this.field3205[this.field3203--] = null;
        arg0.method661();
        if (this.field3203 >= 0) {
            this.field3196 = this.field3205[this.field3203];
            this.field3196.method662();
        }
    }

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "()V", line = 1673)
    private final void method1558() {
        float var1 = (float) (-this.field3300) * this.field3292 / (float) this.field3282;
        float var2 = (float) (-this.field3284) * this.field3292 / (float) this.field3236;
        float var3 = (float) (this.field3197 - this.field3300) * this.field3292 / (float) this.field3282;
        float var4 = (float) (this.field3194 - this.field3284) * this.field3292 / (float) this.field3236;
        this.field3184.glMatrixMode(5889);
        this.field3184.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field3184.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field3306 - this.field3273), (double) ((float) this.field3263 - this.field3273));
        }
        this.field3184.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lue;)V", line = 1689)
    public final void method1559(class127 arg0) {
        class127 var2 = this.field3217[this.field3286];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field3184.glDisable(var2.field1789);
            } else {
                if (var2 == null) {
                    this.field3184.glEnable(arg0.field1789);
                } else if (arg0.field1789 != var2.field1789) {
                    this.field3184.glDisable(var2.field1789);
                    this.field3184.glEnable(arg0.field1789);
                }
                this.field3184.glBindTexture(arg0.field1789, arg0.method862());
            }
            this.field3217[this.field3286] = arg0;
        }
        this.field3302 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "()F", line = 1717)
    public final float method97() {
        return this.field3273;
    }

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "()V", line = 1721)
    private final void method1560() {
        int var1;
        if (this.field3265) {
            this.field3184.glFogf(2915, 0.0F);
            this.field3184.glFogf(2916, 1.0F);
            var1 = this.field3257;
        } else {
            this.field3238 = (float) (this.field3263 - 256) - this.field3303;
            this.field3287 = this.field3238 - (float) this.field3227 * this.field3295;
            if (this.field3287 < (float) this.field3306) {
                this.field3287 = (float) this.field3306;
            }
            this.field3184.glFogf(2915, this.field3287);
            this.field3184.glFogf(2916, this.field3238);
            var1 = this.field3221;
        }
        field3182[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field3182[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field3182[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field3184.glFogfv(2918, field3182, 0);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 1747)
    public final void method114(int arg0) {
        this.method1510(0);
        this.field3184.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field3184.glClear(16384);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFFF)V", line = 1753)
    public final void method1561(float arg0, float arg1, float arg2, float arg3) {
        field3182[0] = arg0;
        field3182[1] = arg1;
        field3182[2] = arg2;
        field3182[3] = arg3;
        this.field3184.glTexEnvfv(8960, 8705, field3182, 0);
    }

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "()F", line = 1760)
    public final float method106() {
        return this.field3310;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFF)V", line = 1766)
    public final void method144(float arg0, float arg1, float arg2) {
        class365.field5151 = arg0;
        class365.field5141 = arg1;
        class365.field5143 = arg2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lbr;IIII)Lmj;", line = 1771)
    public final class394 method62(class223 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class221(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lk;[Llg;Z)Lai;", line = 1775)
    public final class357 method76(class337 arg0, class238[] arg1, boolean arg2) {
        return new class219(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(F)V", line = 1781)
    public final void method90(float arg0) {
        if (this.field3278 != arg0) {
            this.field3278 = arg0;
            this.method1573();
        }
    }

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "()V", line = 1789)
    public final void method1562() {
        this.field3184.glLightfv(16384, 4611, this.field3280, 0);
        this.field3184.glLightfv(16385, 4611, this.field3234, 0);
    }

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "()V", line = 1793)
    public final void method1563() {
        if (this.field3289 != 2) {
            this.field3289 = 2;
            this.method1540();
            this.method1509();
            this.field3302 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "(Z)V", line = 1803)
    public final void method1564(boolean arg0) {
        if (this.field3249 == arg0) {
            return;
        }
        if (arg0) {
            this.field3184.glEnable(2929);
        } else {
            this.field3184.glDisable(2929);
        }
        this.field3249 = arg0;
        this.field3302 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V", line = 1819)
    public final synchronized void method98(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field3207.method647(false)) {
            class406 var4 = (class406) this.field3207.method633(-77);
            field3189[var2++] = (int) var4.field5600;
            this.field3195 -= var4.field5773;
            if (var2 == 1000) {
                this.field3184.glDeleteBuffersARB(var2, field3189, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3184.glDeleteBuffersARB(var2, field3189, 0);
            var2 = 0;
        }
        while (!this.field3208.method647(false)) {
            class406 var5 = (class406) this.field3208.method633(-82);
            field3189[var2++] = (int) var5.field5600;
            this.field3198 -= var5.field5773;
            if (var2 == 1000) {
                this.field3184.glDeleteTextures(var2, field3189, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3184.glDeleteTextures(var2, field3189, 0);
            var2 = 0;
        }
        while (!this.field3209.method647(false)) {
            class406 var6 = (class406) this.field3209.method633(-91);
            field3189[var2++] = var6.field5773;
            if (var2 == 1000) {
                this.field3184.glDeleteFramebuffersEXT(var2, field3189, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3184.glDeleteFramebuffersEXT(var2, field3189, 0);
            var2 = 0;
        }
        while (!this.field3210.method647(false)) {
            class406 var7 = (class406) this.field3210.method633(-127);
            field3189[var2++] = (int) var7.field5600;
            this.field3206 -= var7.field5773;
            if (var2 == 1000) {
                this.field3184.glDeleteRenderbuffersEXT(var2, field3189, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3184.glDeleteRenderbuffersEXT(var2, field3189, 0);
            var2 = 0;
        }
        while (!this.field3211.method647(false)) {
            class406 var8 = (class406) this.field3211.method633(-115);
            field3189[var2++] = (int) var8.field5600;
            if (var2 == 1000) {
                this.field3184.glDeleteProgramsARB(var2, field3189, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3184.glDeleteProgramsARB(var2, field3189, 0);
            boolean var9 = false;
        }
        while (!this.field3202.method647(false)) {
            class406 var10 = (class406) this.field3202.method633(-114);
            this.field3184.glDeleteLists((int) var10.field5600, var10.field5773);
        }
        while (!this.field3212.method647(false)) {
            class406 var11 = (class406) this.field3212.method633(-73);
            this.field3184.glDeleteObjectARB(var11.field5773);
        }
        while (!this.field3202.method647(false)) {
            class406 var12 = (class406) this.field3202.method633(-73);
            this.field3184.glDeleteLists((int) var12.field5600, var12.field5773);
        }
        if (this.method145() > 100663296 && class385.method2442(-6631) > this.field3260 + 60000L) {
            System.gc();
            this.field3260 = class385.method2442(-6631);
        }
        this.field3204 = var3;
    }

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "()V", line = 1988)
    public final void method118() {
        try {
            this.field3192.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "()I", line = 1998)
    public final int method64() {
        int var1 = this.field3316;
        this.field3316 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(IIIII)V", line = 2012)
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1530();
        this.method1510(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field3184.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field3184.glBegin(1);
        this.field3184.glVertex2f(var6, var7);
        this.field3184.glVertex2f((float) arg2 + var6, var7);
        this.field3184.glEnd();
    }

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "()Lic;", line = 2027)
    public final class417 method101() {
        return new class324();
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(IIIIII)V", line = 2032)
    public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1530();
        this.method1510(arg5);
        this.field3184.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field3184.glBegin(2);
        this.field3184.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field3184.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field3184.glEnd();
    }

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "()Z", line = 2041)
    public final boolean method78() {
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "(II)V", line = 2044)
    public final void method1565(int arg0, int arg1) {
        this.field3218 = arg0;
        this.field3251 = arg1;
        this.field3184.glViewport(arg0, arg1, this.field3197, this.field3194);
        this.method1508();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I", line = 2053)
    public final int method139(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "(I)V", line = 2058)
    public final void method1566(int arg0) {
        if (this.field3286 != arg0) {
            this.field3184.glActiveTexture(arg0 + 33984);
            this.field3286 = arg0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqe;)V", line = 2066)
    public final void method130(class275 arg0) {
        this.field3311 = (class153) arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lok;III)V", line = 2071)
    public final void method1567(class138 arg0, int arg1, int arg2, int arg3) {
        this.method1534(arg0);
        arg0.method391(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqb;)V", line = 2078)
    public final void method1568(class122 arg0) {
        if (this.field3294 != arg0 && this.field3274) {
            this.field3184.glBindBufferARB(34962, arg0.method392());
            this.field3294 = arg0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "(I)V", line = 2086)
    public final void method1569(int arg0) {
        if (arg0 == 0) {
            this.method1542(7681, 7681);
        } else if (arg0 == 1) {
            this.method1542(8448, 8448);
        } else if (arg0 == 2) {
            this.method1542(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "()Z", line = 2101)
    public final boolean method91() {
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "()V", line = 2106)
    public final void method129() {
        this.field3197 = this.field3190.getWidth();
        this.field3194 = this.field3190.getHeight();
        this.field3184.glViewport(this.field3218, this.field3251, this.field3197, this.field3194);
        this.method1505();
        this.method143();
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(F)V", line = 2113)
    public final void method1570(float arg0) {
        if (this.field3292 != arg0) {
            this.field3292 = arg0;
            if (this.field3289 == 3) {
                this.method1558();
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 2123)
    public final void method55(boolean arg0) {
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)I", line = 2125)
    public final int method108(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "()V", line = 2131)
    private final void method1571() {
        this.method1516(-2);
        for (int var1 = this.field3261 - 1; var1 >= 0; var1--) {
            this.method1566(var1);
            this.method1559((class127) null);
            this.field3184.glTexEnvi(8960, 8704, 34160);
        }
        this.method1542(8448, 8448);
        this.method1512(2, 34168, 770);
        this.method1524();
        this.field3246 = 1;
        this.field3184.glEnable(3042);
        this.field3184.glBlendFunc(770, 771);
        this.field3301 = 1;
        this.field3184.glEnable(3008);
        this.field3184.glAlphaFunc(516, 0.0F);
        this.field3258 = true;
        this.field3184.glColorMask(true, true, true, true);
        this.field3259 = true;
        this.method1520(true);
        this.method1544(true);
        this.method1564(true);
        this.method1519(true);
        this.method1505();
        this.field3184.setSwapInterval(0);
        this.field3184.glShadeModel(7425);
        this.field3184.glClearDepth(1.0F);
        this.field3184.glDepthFunc(515);
        this.field3184.glPolygonMode(1028, 6914);
        this.field3184.glEnable(2884);
        this.field3184.glCullFace(1029);
        this.field3184.glMatrixMode(5888);
        this.field3184.glLoadIdentity();
        this.field3184.glColorMaterial(1028, 5634);
        this.field3184.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field3184.glLightfv(var4, 4608, var2, 0);
            this.field3184.glLightf(var4, 4615, 0.0F);
            this.field3184.glLightf(var4, 4616, 0.0F);
        }
        this.field3184.glEnable(16384);
        this.field3184.glEnable(16385);
        this.field3184.glFogf(2914, 0.95F);
        this.field3184.glFogi(2917, 9729);
        this.field3184.glHint(3156, 4353);
        this.field3299 = this.field3221 = -1;
        this.method143();
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lja;IILko;)V", line = 2602)
    public class227(Canvas arg0, class152 arg1, int arg2, int arg3, class294 arg4) {
        this.field3190 = arg0;
        this.field3186 = arg1;
        this.field4704 = arg2;
        int var6 = 0;
        while (!this.field3190.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class349.method2219(1000L, -100);
        }
        this.field3190.setIgnoreRepaint(true);
        try {
            if (field3187 == null || !field3187) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field3187 = Boolean.TRUE;
                } else {
                    class283 var7 = arg4.method1909(false, this.getClass());
                    while (var7.field3998 == 0) {
                        class349.method2219(100L, -126);
                    }
                    if (var7.field3998 == 1) {
                        field3187 = Boolean.TRUE;
                    }
                }
            }
            if (field3187 == null || !field3187) {
                throw new RuntimeException("");
            }
            this.field3192 = new context();
            if (!this.field3192.choosePixelFormat(this.field3190, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field3192.createContext()) {
                this.method1548();
                this.field3184 = this.field3192.getGL();
                int var8 = this.method1506();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field3239 = this.field3229 ? 33639 : 5121;
                String var9 = this.field3241.toLowerCase();
                String var10 = this.field3275.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class46.method408((byte) 68, ' ', var10.replace('/', ' '));
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class66.method513(10, var16.substring(1, 3))) {
                                    var16 = var16.substring(1);
                                    var13 = true;
                                }
                                if (var16.equals("hd")) {
                                    var12 = true;
                                } else {
                                    if (var16.startsWith("hd")) {
                                        var16 = var16.substring(2);
                                        var12 = true;
                                    }
                                    if (var16.length() >= 4 && class66.method513(10, var16.substring(0, 4))) {
                                        var11 = class66.method512((byte) 118, var16.substring(0, 4));
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field3274 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field3252 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field3269 = false;
                    }
                    this.field3248 &= this.field3184.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field3268 = this.field3274;
                }
                if (var9.contains("intel")) {
                    this.field3309 = false;
                }
                if (this.field3274) {
                    try {
                        int[] var18 = new int[1];
                        this.field3184.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method1514(this);
                this.method129();
                this.method1556();
                new class298(this);
                this.field3191 = new class409(this, this.field3186);
                class14.method231(true, true, (byte) -119);
                this.field3200 = true;
                this.field3181 = new class402(this);
                this.field3183 = new class408(this);
                this.field3180 = new class365(this);
                this.method1571();
                this.field3184.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field3192.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class349.method2219(100L, -58);
                    }
                }
                this.field3184.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method100();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "()I", line = 2201)
    public final int method49() {
        return this.field3306;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V", line = 2206)
    public final void method111(int arg0, int arg1, int arg2) {
        this.field3265 = true;
        this.field3257 = arg1;
        this.field3242 = arg2;
        this.method1560();
        this.method1523();
        this.field3181.method2527(false, false, 112, 3);
        this.field3181.method2526(arg0, true, (byte) 119);
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(III)V", line = 2218)
    public final void method1572(int arg0, int arg1, int arg2) {
        this.field3184.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field3184.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "()I", line = 2225)
    public final int method85() {
        return this.field3263;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lmj;Lmr;Lic;Lvf;I)V", line = 2237)
    public final void method72(class394 arg0, class77 arg1, class417 arg2, class84 arg3, int arg4) {
        arg0.method1416(arg2, arg3, arg4);
        this.method83(arg1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([Lmj;Lic;[Lvf;I)V", line = 2244)
    public final void method79(class394[] arg0, class417 arg1, class84[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method1416(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "()V", line = 2255)
    private final void method1573() {
        field3182[0] = this.field3288 * this.field3278;
        field3182[1] = this.field3278 * this.field3247;
        field3182[2] = this.field3278 * this.field3233;
        field3182[3] = 1.0F;
        this.field3184.glLightModelfv(2899, field3182, 0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[I[I)Lep;", line = 2263)
    public final class241 method61(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class234.method1597(arg0, arg1, arg2, this, arg3, -97);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(IIII)V", line = 2274)
    public final void method53(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3266 < arg0) {
            this.field3266 = arg0;
        }
        if (this.field3305 > arg2) {
            this.field3305 = arg2;
        }
        if (this.field3313 < arg1) {
            this.field3313 = arg1;
        }
        if (this.field3244 > arg3) {
            this.field3244 = arg3;
        }
        this.field3184.glEnable(3089);
        this.method1575();
        this.method1508();
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(IIIIII)V", line = 2300)
    public final void method59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1530();
        this.method1510(arg5);
        this.field3184.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3272) {
            this.field3184.glDisable(32925);
        }
        this.field3184.glBegin(2);
        this.field3184.glVertex2f(var7, var8);
        this.field3184.glVertex2f(var7, var10);
        this.field3184.glVertex2f(var9, var10);
        this.field3184.glVertex2f(var9, var8);
        this.field3184.glEnd();
        if (this.field3272) {
            this.field3184.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "()V", line = 2329)
    private final void method1574() {
        if (this.field3289 == 1) {
            return;
        }
        this.field3184.glMatrixMode(5889);
        this.field3184.glLoadIdentity();
        if (this.field3197 > 0 && this.field3194 > 0) {
            this.field3184.glOrtho(0.0D, (double) this.field3197, (double) this.field3194, 0.0D, -1.0D, 1.0D);
        }
        this.field3184.glMatrixMode(5888);
        this.field3184.glLoadIdentity();
        this.field3289 = 1;
        this.field3302 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!tb", name = "rb", descriptor = "()V", line = 2346)
    private final void method1575() {
        this.field3223 = (float) (this.field3266 - this.field3300);
        this.field3264 = (float) (this.field3305 - this.field3300);
        this.field3276 = (float) (this.field3313 - this.field3284);
        this.field3267 = (float) (this.field3244 - this.field3284);
    }

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "(I)V", line = 2361)
    public final synchronized void method1576(int arg0) {
        class406 var2 = new class406(arg0);
        this.field3212.method643(var2, -116);
    }
}
