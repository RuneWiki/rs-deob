import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class341 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    private int field4930 = 0;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    private int field4942 = 1;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    private int field4951 = 0;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    private int field4952 = 1;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Lam;")
    private class455 field4940 = new class455();

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "Z")
    private boolean field4956 = true;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    private int field4959 = -1;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "Z")
    private boolean field4958 = true;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "Z")
    private boolean field4954 = true;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "Z")
    private boolean field4961 = true;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    private int field4960 = 0;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "[Lgu;")
    private class417[] field4962 = new class417[2];

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "Z")
    private boolean field4955 = false;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lih;")
    private class503 field4937;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Lgb;")
    private class146 field4939;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lgb;")
    private class146 field4934;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lgb;")
    private class146 field4941;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field4943 = 0;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "Lgu;")
    private class417 field4963;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "Llc;")
    private class466 field4953;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "Llc;")
    private class466 field4957;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Z")
    private boolean field4946;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)I")
    public static final int method2025(int arg0, int arg1, int arg2, int arg3) {
        field4932++;
        int var4 = arg0 & 0x3;
        if (arg1 != 8) {
            method2034(true);
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)Z")
    public final boolean method2026(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            this.method2035((byte) 86);
        }
        field4933++;
        if (this.field4934 == null || this.field4940.method2661(-118)) {
            return false;
        }
        if (this.field4952 != arg1 || this.field4942 != arg4) {
            this.field4952 = arg1;
            this.field4942 = arg4;
            for (class498 var6 = this.field4940.method2655(15152); var6 != this.field4940.field6378; var6 = var6.field7055) {
                ((class50) var6).method398(this.field4952, arg0, this.field4942);
            }
            this.field4958 = true;
            this.field4956 = true;
            this.field4954 = true;
        }
        if (!this.method2028(arg0 ^ 0xFFFFFFB1)) {
            return false;
        }
        this.field4930 = arg3;
        this.field4951 = arg2;
        this.field4946 = true;
        this.field4937.method2928(this.field4934, (byte) -59);
        this.field4934.method915(0, -90);
        this.field4937.method2942(-this.field4951, (byte) -98, this.field4942 - this.field4934.method911(4) - this.field4930);
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lqh;I)V")
    public final void method2027(class50 arg0, int arg1) {
        field4948++;
        arg0.field612 = false;
        arg0.method402((byte) 103);
        arg0.method2891(-121);
        if (arg1 == -16642) {
            this.method2030((byte) 17);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Z")
    private final boolean method2028(int arg0) {
        field4950++;
        if (this.field4958) {
            if (this.field4953 != null) {
                this.field4953.method2700((byte) -94);
                this.field4953 = null;
            }
            if (this.field4963 != null) {
                this.field4963.method2757(-10909);
                this.field4963 = null;
            }
            if (this.field4941 != null) {
                this.field4953 = new class466(this.field4937, 6402, this.field4952, this.field4942, this.field4937.field7292);
            }
            if (this.field4955) {
                this.field4963 = new class417(this.field4937, 34037, 6402, this.field4952, this.field4942);
            } else if (this.field4953 == null) {
                this.field4953 = new class466(this.field4937, 6402, this.field4952, this.field4942);
            }
            this.field4958 = false;
            this.field4961 = true;
            this.field4954 = true;
        }
        if (this.field4956) {
            if (this.field4957 != null) {
                this.field4957.method2700((byte) -25);
                this.field4957 = null;
            }
            if (this.field4962[0] != null) {
                this.field4962[0].method2757(-10909);
                this.field4962[0] = null;
            }
            if (this.field4962[1] != null) {
                this.field4962[1].method2757(-10909);
                this.field4962[1] = null;
            }
            if (this.field4941 != null) {
                this.field4957 = new class466(this.field4937, this.field4959, this.field4952, this.field4942, this.field4937.field7292);
            }
            this.field4962[0] = new class417(this.field4937, 34037, this.field4959, this.field4952, this.field4942);
            this.field4962[1] = this.field4960 <= 1 ? null : new class417(this.field4937, 34037, this.field4959, this.field4952, this.field4942);
            this.field4961 = true;
            this.field4956 = false;
            this.field4954 = true;
        }
        if (this.field4954) {
            if (this.field4941 == null) {
                this.field4937.method2928(this.field4939, (byte) -88);
                this.field4939.method906((byte) 87, 0);
                this.field4939.method906((byte) 87, 1);
                this.field4939.method906((byte) 87, 8);
                this.field4939.method907(this.field4962[0], 0, (byte) 68);
                if (this.field4960 > 1) {
                    this.field4939.method907(this.field4962[1], 1, (byte) 124);
                }
                if (this.field4955) {
                    this.field4939.method907(this.field4963, 8, (byte) -106);
                } else {
                    this.field4939.method913(8, -1, this.field4953);
                }
                this.field4937.method2931(false, this.field4939);
            } else {
                this.field4937.method2928(this.field4939, (byte) -73);
                this.field4939.method906((byte) 87, 0);
                this.field4939.method906((byte) 87, 1);
                this.field4939.method906((byte) 87, 8);
                this.field4939.method907(this.field4962[0], 0, (byte) -86);
                if (this.field4960 > 1) {
                    this.field4939.method907(this.field4962[1], 1, (byte) -69);
                }
                if (this.field4955) {
                    this.field4939.method907(this.field4963, 8, (byte) 65);
                }
                this.field4937.method2931(false, this.field4939);
                this.field4937.method2928(this.field4941, (byte) -32);
                this.field4941.method906((byte) 87, 0);
                this.field4941.method906((byte) 87, 8);
                this.field4941.method913(0, -1, this.field4957);
                this.field4941.method913(8, -1, this.field4953);
                this.field4937.method2931(false, this.field4941);
            }
            this.field4954 = false;
            this.field4961 = true;
        }
        if (this.field4961) {
            this.field4937.method2928(this.field4934, (byte) -101);
            this.field4961 = !this.field4934.method916((byte) 125);
            this.field4937.method2931(false, this.field4934);
        }
        if (arg0 >= -49) {
            this.method2026(1, 110, 111, -52, -44);
        }
        return !this.field4961;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public final void method2029(int arg0) {
        field4944++;
        if (!this.field4946) {
            return;
        }
        if (this.field4941 != null) {
            int var2 = 16384;
            this.field4937.method2936(this.field4941, (byte) 125);
            this.field4937.method2966(-123, this.field4939);
            this.field4941.method909(0, -127);
            this.field4939.method915(0, -98);
            if (this.field4955) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field4952, this.field4942, 0, 0, this.field4952, this.field4942, var2, 9728);
            this.field4937.method2978(true, this.field4941);
            this.field4937.method2970(-257, this.field4939);
        }
        this.field4937.method2930((byte) -96);
        this.field4937.method2967(0, 103);
        this.field4937.method2999(arg0, arg0 ^ 0x66);
        this.field4937.method295();
        int var3 = 0;
        int var4 = 1;
        class50 var6;
        for (class50 var5 = (class50) this.field4940.method2655(arg0 ^ 0x3B31); var5 != null; var5 = var6) {
            var6 = (class50) this.field4940.method2660((byte) 67);
            int var7 = var5.method400(-43);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method404(this.field4963, 32326, this.field4962[var3], var8);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field4937.method2931(false, this.field4939);
                    this.field4937.method2942(0, (byte) 122, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4942);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4951, this.field4930);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4951, this.field4930 + this.field4942);
                    OpenGL.glTexCoord2f((float) this.field4952, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4952 + this.field4951, this.field4942 + this.field4930);
                    OpenGL.glTexCoord2f((float) this.field4952, (float) this.field4942);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4951 + this.field4952, this.field4930);
                    OpenGL.glEnd();
                } else {
                    this.field4939.method915(-(-var4), arg0 - 74);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4942);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field4942);
                    OpenGL.glTexCoord2f((float) this.field4952, (float) this.field4942);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4952, this.field4942);
                    OpenGL.glTexCoord2f((float) this.field4952, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4952, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5.method393(var8, (byte) 118);
                var3 = var3 + 1 & 0x1;
            }
        }
        this.field4946 = false;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    private final void method2030(byte arg0) {
        field4931++;
        boolean var2 = false;
        if (arg0 != 17) {
            this.method2033(-9, null);
        }
        int var3 = 0;
        int var4 = 0;
        for (class50 var5 = (class50) this.field4940.method2655(arg0 + 15135); var5 != null; var5 = (class50) this.field4940.method2660((byte) 67)) {
            int var9 = var5.method401(true);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method400(108);
            var2 |= var5.method399(arg0 ^ 0x11);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4959 != var6) {
            this.field4956 = true;
            this.field4959 = var6;
        }
        int var7 = this.field4960 > 2 ? 2 : this.field4960;
        int var8 = var4 <= 2 ? var4 : 2;
        if (var2 != this.field4955) {
            this.field4958 = true;
            this.field4955 = var2;
        }
        this.field4960 = var4;
        if (var7 != var8) {
            this.field4954 = this.field4956 = true;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IFIIZIIIZ)[[I")
    public static final int[][] method2031(int arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field4947++;
        if (!arg8) {
            return null;
        }
        int[][] var9 = new int[arg0][arg6];
        class184 var10 = new class184();
        var10.field2643 = arg4;
        var10.field2652 = arg7;
        var10.field2644 = (int) (arg1 * 4096.0F);
        var10.field2645 = arg5;
        var10.field2648 = arg3;
        var10.method31(-9);
        class450.method2635((byte) 117, arg0, arg6);
        for (int var11 = 0; var11 < arg0; var11++) {
            var10.method1166(true, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Z")
    public final boolean method2032(boolean arg0) {
        if (arg0) {
            this.method2027(null, -27);
        }
        field4935++;
        return this.field4934 != null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILqh;)Z")
    public final boolean method2033(int arg0, class50 arg1) {
        field4938++;
        if (arg0 != 0) {
            this.field4955 = false;
        }
        if (this.field4934 != null) {
            if (arg1.method397(arg0) || arg1.method395(-16951)) {
                this.field4940.method2657(8492, arg1);
                this.method2030((byte) 17);
                if (this.method2028(-90)) {
                    if (this.field4952 != -1 && this.field4942 != -1) {
                        arg1.method398(this.field4952, 0, this.field4942);
                    }
                    arg1.field612 = true;
                    return true;
                }
            }
            this.method2027(arg1, -16642);
        }
        return false;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public static final void method2034(boolean arg0) {
        if (class68.field861 == null || class475.field6607 == null) {
            class68.field861 = new int[256];
            class475.field6607 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class68.field861[var1] = (int) (Math.sin(var2) * 4096.0D);
                class475.field6607[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (!arg0) {
            method2025(82, -63, 6, -101);
        }
        field4936++;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
    public final void method2035(byte arg0) {
        this.field4963 = null;
        field4949++;
        this.field4962 = null;
        this.field4934 = this.field4941 = this.field4939 = null;
        this.field4953 = null;
        this.field4957 = null;
        if (arg0 < 93) {
            this.method2029(-31);
        }
        if (!this.field4940.method2661(-120)) {
            for (class498 var2 = this.field4940.method2655(15152); var2 != this.field4940.field6378; var2 = var2.field7055) {
                ((class50) var2).method402((byte) 56);
            }
        }
        this.field4952 = this.field4942 = 1;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lih;)V")
    public class341(class503 arg0) {
        this.field4937 = arg0;
        if (this.field4937.field7432 && this.field4937.field7428) {
            this.field4934 = this.field4939 = new class146(this.field4937);
            if (this.field4937.field7292 > 1 && this.field4937.field7363 && this.field4937.field7385) {
                this.field4934 = this.field4941 = new class146(this.field4937);
                return;
            }
        }
    }
}
