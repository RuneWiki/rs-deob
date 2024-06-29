import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class187 {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    private int field2118 = 1;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    private int field2127 = 1;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    private int field2124 = 0;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    private int field2131 = 0;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lgk;")
    private class616 field2122 = new class616();

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Z")
    private boolean field2137 = true;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    private int field2138 = 0;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Z")
    private boolean field2139 = true;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "[Lg;")
    private class555[] field2141 = new class555[2];

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    private int field2143 = -1;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "Z")
    private boolean field2140 = true;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Z")
    private boolean field2135 = false;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "Z")
    private boolean field2142 = true;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lvj;")
    private class422 field2129;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lwt;")
    private class24 field2114;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lwt;")
    private class24 field2116;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lwt;")
    private class24 field2117;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Lbi;")
    private class508 field2134;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Lbi;")
    private class508 field2136;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lg;")
    private class555 field2133;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Z")
    private boolean field2130;

    static {
        new class607("", 76);
        field2132 = 1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 3)
    public final void method1132(boolean arg0) {
        field2123++;
        if (!this.field2130) {
            return;
        }
        if (this.field2117 != null) {
            int var2 = 16384;
            this.field2129.method2434(-517, this.field2117);
            this.field2129.method2413(-1, this.field2114);
            this.field2117.method128(-29721, 0);
            this.field2114.method110(false, 0);
            if (this.field2135) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field2118, this.field2127, 0, 0, this.field2118, this.field2127, var2, 9728);
            this.field2129.method2415(this.field2117, false);
            this.field2129.method2377(this.field2114, -1);
        }
        this.field2129.method2397(125);
        this.field2129.method2386(123, 0);
        this.field2129.method2421(1, 1);
        this.field2129.method1050();
        if (!arg0) {
            this.field2135 = false;
        }
        int var3 = 0;
        int var4 = 1;
        class659 var6;
        for (class659 var5 = (class659) this.field2122.method3434((byte) 2); var5 != null; var5 = var6) {
            var6 = (class659) this.field2122.method3430(true);
            int var7 = var5.method3662(true);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method3658(var8, 8095, this.field2141[var3], this.field2133);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field2129.method2429(-30575, this.field2114);
                    this.field2129.method2441(-13703, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2127);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2124, this.field2131);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2124, this.field2131 + this.field2127);
                    OpenGL.glTexCoord2f((float) this.field2118, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2124 + this.field2118, this.field2131 + this.field2127);
                    OpenGL.glTexCoord2f((float) this.field2118, (float) this.field2127);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2124 + this.field2118, this.field2131);
                    OpenGL.glEnd();
                } else {
                    this.field2114.method110(false, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2127);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field2127);
                    OpenGL.glTexCoord2f((float) this.field2118, (float) this.field2127);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2118, this.field2127);
                    OpenGL.glTexCoord2f((float) this.field2118, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2118, 0);
                    OpenGL.glEnd();
                }
                var5.method3663(var8, 0);
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
            }
        }
        this.field2130 = false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)Z", line = 111)
    public final boolean method1133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2125++;
        if (this.field2116 == null || this.field2122.method3439((byte) 96)) {
            return false;
        } else if (arg0 <= 70) {
            return true;
        } else {
            if (this.field2118 != arg4 || this.field2127 != arg1) {
                this.field2118 = arg4;
                this.field2127 = arg1;
                for (class333 var6 = this.field2122.method3434((byte) 2); var6 != this.field2122.field8677; var6 = var6.field4181) {
                    ((class659) var6).method3661(true, this.field2118, this.field2127);
                }
                this.field2139 = true;
                this.field2137 = true;
                this.field2140 = true;
            }
            if (!this.method1135(-19072)) {
                return false;
            }
            this.field2124 = arg3;
            this.field2131 = arg2;
            this.field2130 = true;
            this.field2129.method2364(this.field2116, (byte) -118);
            this.field2116.method110(false, 0);
            this.field2129.method2441(-13703, this.field2127 + this.field2131 - this.field2129.field5766, -this.field2124);
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 157)
    private final void method1134(int arg0) {
        field2120++;
        if (arg0 != 2) {
            field2132 = -2;
        }
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class659 var5 = (class659) this.field2122.method3434((byte) 2); var5 != null; var5 = (class659) this.field2122.method3430(true)) {
            int var9 = var5.method3657(arg0 ^ 0xFFFFFF92);
            if (var3 < var9) {
                var3 = var9;
            }
            var4 += var5.method3662(true);
            var2 |= var5.method3659((byte) 92);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field2143 != var6) {
            this.field2137 = true;
            this.field2143 = var6;
        }
        int var7 = this.field2138 <= 2 ? this.field2138 : 2;
        int var8 = var4 <= 2 ? var4 : 2;
        this.field2138 = var4;
        if (var7 != var8) {
            this.field2139 = this.field2137 = true;
        }
        if (this.field2135 != var2) {
            this.field2140 = true;
            this.field2135 = var2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)Z", line = 221)
    private final boolean method1135(int arg0) {
        field2115++;
        if (this.field2140) {
            if (this.field2136 != null) {
                this.field2136.method2905((byte) 91);
                this.field2136 = null;
            }
            if (this.field2133 != null) {
                this.field2133.method1834((byte) 124);
                this.field2133 = null;
            }
            if (this.field2117 != null) {
                this.field2136 = new class508(this.field2129, 6402, this.field2118, this.field2127, this.field2129.field5813);
            }
            if (this.field2135) {
                this.field2133 = new class555(this.field2129, 34037, 6402, this.field2118, this.field2127);
            } else if (this.field2136 == null) {
                this.field2136 = new class508(this.field2129, 6402, this.field2118, this.field2127);
            }
            this.field2140 = false;
            this.field2139 = true;
            this.field2142 = true;
        }
        if (this.field2137) {
            if (this.field2134 != null) {
                this.field2134.method2905((byte) -77);
                this.field2134 = null;
            }
            if (this.field2141[0] != null) {
                this.field2141[0].method1834((byte) -79);
                this.field2141[0] = null;
            }
            if (this.field2141[1] != null) {
                this.field2141[1].method1834((byte) -56);
                this.field2141[1] = null;
            }
            if (this.field2117 != null) {
                this.field2134 = new class508(this.field2129, this.field2143, this.field2118, this.field2127, this.field2129.field5813);
            }
            this.field2141[0] = new class555(this.field2129, 34037, this.field2143, this.field2118, this.field2127);
            this.field2141[1] = this.field2138 <= 1 ? null : new class555(this.field2129, 34037, this.field2143, this.field2118, this.field2127);
            this.field2142 = true;
            this.field2137 = false;
            this.field2139 = true;
        }
        if (arg0 != -19072) {
            return false;
        }
        if (this.field2139) {
            if (this.field2117 == null) {
                this.field2129.method2364(this.field2114, (byte) -112);
                this.field2114.method125(0, 1);
                this.field2114.method125(1, arg0 + 19073);
                this.field2114.method125(8, 1);
                this.field2114.method127(0, this.field2141[0], 4);
                if (this.field2138 > 1) {
                    this.field2114.method127(1, this.field2141[1], 4);
                }
                if (this.field2135) {
                    this.field2114.method127(8, this.field2133, 4);
                } else {
                    this.field2114.method113(this.field2136, 8, (byte) -34);
                }
                this.field2129.method2429(arg0 ^ 0x3D11, this.field2114);
            } else {
                this.field2129.method2364(this.field2114, (byte) -114);
                this.field2114.method125(0, 1);
                this.field2114.method125(1, arg0 + 19073);
                this.field2114.method125(8, 1);
                this.field2114.method127(0, this.field2141[0], 4);
                if (this.field2138 > 1) {
                    this.field2114.method127(1, this.field2141[1], 4);
                }
                if (this.field2135) {
                    this.field2114.method127(8, this.field2133, 4);
                }
                this.field2129.method2429(arg0 - 11503, this.field2114);
                this.field2129.method2364(this.field2117, (byte) -100);
                this.field2117.method125(0, 1);
                this.field2117.method125(8, 1);
                this.field2117.method113(this.field2134, 0, (byte) -62);
                this.field2117.method113(this.field2136, 8, (byte) 108);
                this.field2129.method2429(-30575, this.field2117);
            }
            this.field2139 = false;
            this.field2142 = true;
        }
        if (this.field2142) {
            this.field2129.method2364(this.field2116, (byte) -101);
            this.field2142 = !this.field2116.method124((byte) -105);
            this.field2129.method2429(-30575, this.field2116);
        }
        return !this.field2142;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 353)
    public final void method1136(byte arg0) {
        this.field2136 = null;
        this.field2141 = null;
        if (arg0 != -120) {
            this.method1137((byte) 107);
        }
        this.field2116 = this.field2117 = this.field2114 = null;
        this.field2134 = null;
        field2121++;
        this.field2133 = null;
        if (!this.field2122.method3439((byte) -114)) {
            for (class333 var2 = this.field2122.method3434((byte) 2); var2 != this.field2122.field8677; var2 = var2.field4181) {
                ((class659) var2).method3655(7);
            }
        }
        this.field2118 = this.field2127 = 1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Z", line = 388)
    public final boolean method1137(byte arg0) {
        int var2 = 12 / ((46 - arg0) / 41);
        field2126++;
        return this.field2116 != null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Loq;B)Z", line = 400)
    public final boolean method1138(class659 arg0, byte arg1) {
        int var3 = -98 / ((arg1 + 27) / 48);
        field2119++;
        if (this.field2116 != null) {
            if (arg0.method3652(1) || arg0.method3660(61)) {
                this.field2122.method3425(arg0, false);
                this.method1134(2);
                if (this.method1135(-19072)) {
                    if (this.field2118 != -1 && this.field2127 != -1) {
                        arg0.method3661(true, this.field2118, this.field2127);
                    }
                    arg0.field9252 = true;
                    return true;
                }
            }
            this.method1139(-2415, arg0);
        }
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lvj;)V", line = 522)
    public class187(class422 arg0) {
        this.field2129 = arg0;
        if (this.field2129.field5948 && this.field2129.field5919) {
            this.field2116 = this.field2114 = new class24(this.field2129);
            if (this.field2129.field5813 > 1 && this.field2129.field5892 && this.field2129.field5860) {
                this.field2116 = this.field2117 = new class24(this.field2129);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILoq;)V", line = 440)
    public final void method1139(int arg0, class659 arg1) {
        field2128++;
        arg1.field9252 = false;
        arg1.method3655(7);
        if (arg0 != -2415) {
            this.method1137((byte) -49);
        }
        arg1.method1922(113);
        this.method1134(2);
    }
}
