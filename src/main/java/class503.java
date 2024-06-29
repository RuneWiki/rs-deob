import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class503 {

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    private int field7258 = 0;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    private int field7252 = 0;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    private int field7256 = 1;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    private int field7270 = 1;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Lgw;")
    private class118 field7253 = new class118();

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    private int field7273 = -1;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "[Luk;")
    private class176[] field7275 = new class176[2];

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "Z")
    private boolean field7279 = true;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "Z")
    private boolean field7282 = true;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "Z")
    private boolean field7281 = true;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "Z")
    private boolean field7276 = false;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    private int field7283 = 0;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "Z")
    private boolean field7278 = true;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "Lbt;")
    private class33 field7269;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "Lnn;")
    private class292 field7267;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Lnn;")
    private class292 field7254;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lnn;")
    private class292 field7257;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field7255 = 0;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "Ljava/lang/String;")
    public static String field7268 = null;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "Luk;")
    private class176 field7272;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "Lat;")
    private class262 field7274;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "Lat;")
    private class262 field7277;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Z")
    private boolean field7265;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "[Laa;")
    public static class343[] field7264;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)Z")
    public final boolean method2933(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7249++;
        if (this.field7254 == null || this.field7253.method854(33)) {
            return false;
        }
        if (this.field7270 != arg2 || this.field7256 != arg1) {
            this.field7270 = arg2;
            this.field7256 = arg1;
            for (class42 var6 = this.field7253.method863(-1); var6 != this.field7253.field1835; var6 = var6.field857) {
                ((class358) var6).method501(arg3 ^ 0x881A, this.field7256, this.field7270);
            }
            this.field7281 = true;
            this.field7282 = true;
            this.field7279 = true;
        }
        if (!this.method2935(arg3 ^ 0x1)) {
            if (arg3 != 0) {
                this.field7283 = -45;
            }
            return false;
        }
        this.field7265 = true;
        this.field7252 = arg4;
        this.field7258 = arg0;
        this.field7269.method289(arg3 + 8704, this.field7254);
        this.field7254.method1868(0, true);
        this.field7269.method195(-this.field7252, -124, this.field7256 - this.field7254.method1873(-3498) - this.field7258);
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public final void method2934(int arg0) {
        field7262++;
        if (!this.field7265) {
            return;
        }
        if (this.field7257 != null) {
            int var2 = 16384;
            this.field7269.method295(23709, this.field7257);
            this.field7269.method210(arg0 + 3, this.field7267);
            this.field7257.method1882(arg0 - 1, 0);
            this.field7267.method1868(0, true);
            if (this.field7276) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field7270, this.field7256, 0, 0, this.field7270, this.field7256, var2, 9728);
            this.field7269.method342(this.field7257, -29);
            this.field7269.method191((byte) 74, this.field7267);
        }
        this.field7269.method278((byte) -125);
        this.field7269.method229(0, -69);
        this.field7269.method249(1, arg0 - 2);
        this.field7269.method179();
        int var3 = arg0;
        int var4 = 1;
        class358 var6;
        for (class358 var5 = (class358) this.field7253.method863(-1); var5 != null; var5 = var6) {
            var6 = (class358) this.field7253.method865(-1);
            int var7 = var5.method2222(-19843);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method509(var8, this.field7272, this.field7275[var3], false);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field7269.method281(this.field7267, -21590);
                    this.field7269.method195(0, -64, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7256);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7252, this.field7258);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7252, this.field7258 + this.field7256);
                    OpenGL.glTexCoord2f((float) this.field7270, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7270 + this.field7252, this.field7258 + this.field7256);
                    OpenGL.glTexCoord2f((float) this.field7270, (float) this.field7256);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7270 + this.field7252, this.field7258);
                    OpenGL.glEnd();
                } else {
                    this.field7267.method1868(-(-var4), true);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7256);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field7256);
                    OpenGL.glTexCoord2f((float) this.field7270, (float) this.field7256);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7270, this.field7256);
                    OpenGL.glTexCoord2f((float) this.field7270, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7270, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5.method499(1, var8);
                var3 = var3 + 1 & 0x1;
            }
        }
        this.field7265 = false;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Z")
    private final boolean method2935(int arg0) {
        field7266++;
        if (this.field7281) {
            if (this.field7274 != null) {
                this.field7274.method1696(0);
                this.field7274 = null;
            }
            if (this.field7272 != null) {
                this.field7272.method883(-8820);
                this.field7272 = null;
            }
            if (this.field7257 != null) {
                this.field7274 = new class262(this.field7269, 6402, this.field7270, this.field7256, this.field7269.field606);
            }
            if (this.field7276) {
                this.field7272 = new class176(this.field7269, 34037, 6402, this.field7270, this.field7256);
            } else if (this.field7274 == null) {
                this.field7274 = new class262(this.field7269, 6402, this.field7270, this.field7256);
            }
            this.field7278 = true;
            this.field7282 = true;
            this.field7281 = false;
        }
        if (arg0 != 1) {
            this.method2941((byte) 100, null);
        }
        if (this.field7279) {
            if (this.field7277 != null) {
                this.field7277.method1696(arg0 - 1);
                this.field7277 = null;
            }
            if (this.field7275[0] != null) {
                this.field7275[0].method883(-8820);
                this.field7275[0] = null;
            }
            if (this.field7275[1] != null) {
                this.field7275[1].method883(arg0 ^ 0xFFFFDD8D);
                this.field7275[1] = null;
            }
            if (this.field7257 != null) {
                this.field7277 = new class262(this.field7269, this.field7273, this.field7270, this.field7256, this.field7269.field606);
            }
            this.field7275[0] = new class176(this.field7269, 34037, this.field7273, this.field7270, this.field7256);
            this.field7275[1] = this.field7283 <= 1 ? null : new class176(this.field7269, 34037, this.field7273, this.field7270, this.field7256);
            this.field7279 = false;
            this.field7282 = true;
            this.field7278 = true;
        }
        if (this.field7282) {
            if (this.field7257 == null) {
                this.field7269.method289(arg0 ^ 0x2201, this.field7267);
                this.field7267.method1878((byte) -111, 0);
                this.field7267.method1878((byte) 62, 1);
                this.field7267.method1878((byte) -115, 8);
                this.field7267.method1874(0, arg0, this.field7275[0]);
                if (this.field7283 > 1) {
                    this.field7267.method1874(1, 1, this.field7275[1]);
                }
                if (this.field7276) {
                    this.field7267.method1874(8, arg0, this.field7272);
                } else {
                    this.field7267.method1883((byte) -60, 8, this.field7274);
                }
                this.field7269.method281(this.field7267, arg0 - 21591);
            } else {
                this.field7269.method289(8704, this.field7267);
                this.field7267.method1878((byte) -121, 0);
                this.field7267.method1878((byte) 38, 1);
                this.field7267.method1878((byte) -103, 8);
                this.field7267.method1874(0, 1, this.field7275[0]);
                if (this.field7283 > 1) {
                    this.field7267.method1874(1, arg0, this.field7275[1]);
                }
                if (this.field7276) {
                    this.field7267.method1874(8, 1, this.field7272);
                }
                this.field7269.method281(this.field7267, -21590);
                this.field7269.method289(8704, this.field7257);
                this.field7257.method1878((byte) -114, 0);
                this.field7257.method1878((byte) -120, 8);
                this.field7257.method1883((byte) -56, 0, this.field7277);
                this.field7257.method1883((byte) -69, 8, this.field7274);
                this.field7269.method281(this.field7257, -21590);
            }
            this.field7282 = false;
            this.field7278 = true;
        }
        if (this.field7278) {
            this.field7269.method289(8704, this.field7254);
            this.field7278 = !this.field7254.method1866(-36054);
            this.field7269.method281(this.field7254, -21590);
        }
        return !this.field7278;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLek;)Z")
    public final boolean method2936(byte arg0, class358 arg1) {
        field7251++;
        if (this.field7254 != null) {
            if (arg1.method508(101) || arg1.method502(arg0 + 9)) {
                this.field7253.method866((byte) 10, arg1);
                this.method2937(-32);
                if (this.method2935(1)) {
                    if (this.field7270 != -1 && this.field7256 != -1) {
                        arg1.method501(34842, this.field7256, this.field7270);
                    }
                    arg1.field5200 = true;
                    return true;
                }
            }
            this.method2941((byte) -122, arg1);
        }
        return arg0 == -68 ? false : false;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V")
    private final void method2937(int arg0) {
        field7260++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class358 var5 = (class358) this.field7253.method863(-1); var5 != null; var5 = (class358) this.field7253.method865(-1)) {
            int var9 = var5.method505(0);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method2222(-19843);
            var2 |= var5.method2220(-123);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field7273 != var6) {
            this.field7279 = true;
            this.field7273 = var6;
        }
        if (arg0 >= -8) {
            this.field7278 = true;
        }
        int var7 = this.field7283 <= 2 ? this.field7283 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        this.field7283 = var4;
        if (this.field7276 != var2) {
            this.field7281 = true;
            this.field7276 = var2;
        }
        if (var7 != var8) {
            this.field7282 = this.field7279 = true;
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)Z")
    public final boolean method2938(int arg0) {
        if (arg0 >= -81) {
            this.field7277 = null;
        }
        field7248++;
        return this.field7254 != null;
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
    public final void method2939(int arg0) {
        this.field7254 = this.field7257 = this.field7267 = null;
        this.field7275 = null;
        this.field7272 = null;
        field7280++;
        this.field7274 = null;
        this.field7277 = null;
        if (!this.field7253.method854(33)) {
            for (class42 var2 = this.field7253.method863(arg0 ^ 0xFFFFFFFE); var2 != this.field7253.field1835; var2 = var2.field857) {
                ((class358) var2).method507(false);
            }
        }
        this.field7270 = this.field7256 = arg0;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public static void method2940(int arg0) {
        field7268 = null;
        field7264 = null;
        if (arg0 != 2273) {
            method2940(114);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(BLek;)V")
    public final void method2941(byte arg0, class358 arg1) {
        field7263++;
        if (arg0 >= -38) {
            this.field7270 = -102;
        }
        arg1.field5200 = false;
        arg1.method507(false);
        arg1.method421(22071);
        this.method2937(-15);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public static final void method2942(int arg0, int arg1, int arg2, int arg3, String arg4) {
        field7261++;
        class198 var5 = class539.method3173(arg3, 2, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3020 != null) {
            class361 var6 = new class361();
            var6.field5256 = var5.field3020;
            var6.field5251 = arg4;
            var6.field5253 = arg0;
            var6.field5252 = var5;
            class281.method1805(var6);
        }
        if (class37.field799 != 9 || !client.method1395(var5).method1885(arg0 - 1, -44) || arg1 != 0) {
            return;
        }
        if (arg0 == 1) {
            class228.method1528(true, class119.field1864);
            class221.field3376++;
            class392.method2362(arg2, arg3, 36, var5.field2952);
        }
        if (arg0 == 2) {
            class228.method1528(true, class58.field1045);
            class221.field3386++;
            class392.method2362(arg2, arg3, 36, var5.field2952);
        }
        if (arg0 == 3) {
            class228.method1528(true, class260.field3848);
            class42.field862++;
            class392.method2362(arg2, arg3, arg1 ^ 0x24, var5.field2952);
        }
        if (arg0 == 4) {
            class6.field35++;
            class228.method1528(true, class495.field7171);
            class392.method2362(arg2, arg3, 36, var5.field2952);
        }
        if (arg0 == 5) {
            class164.field2478++;
            class228.method1528(true, class433.field6207);
            class392.method2362(arg2, arg3, 36, var5.field2952);
        }
        if (arg0 == 6) {
            class471.field6829++;
            class228.method1528(true, class251.field3727);
            class392.method2362(arg2, arg3, arg1 ^ 0x24, var5.field2952);
        }
        if (arg0 == 7) {
            class228.method1528(true, class120.field1888);
            class214.field3227++;
            class392.method2362(arg2, arg3, arg1 ^ 0x24, var5.field2952);
        }
        if (arg0 == 8) {
            class228.method1528(true, class514.field7466);
            class359.field5222++;
            class392.method2362(arg2, arg3, 36, var5.field2952);
        }
        if (arg0 == 9) {
            class228.method1528(true, class417.field5922);
            class50.field923++;
            class392.method2362(arg2, arg3, arg1 ^ 0x24, var5.field2952);
        }
        if (arg0 == 10) {
            class162.field2459++;
            class228.method1528(true, class245.field3666);
            class392.method2362(arg2, arg3, 36, var5.field2952);
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lbt;)V")
    public class503(class33 arg0) {
        this.field7269 = arg0;
        if (this.field7269.field758 && this.field7269.field665) {
            this.field7254 = this.field7267 = new class292(this.field7269);
            if (this.field7269.field606 > 1 && this.field7269.field728 && this.field7269.field681) {
                this.field7254 = this.field7257 = new class292(this.field7269);
                return;
            }
        }
    }
}
