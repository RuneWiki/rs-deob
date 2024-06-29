import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class213 {

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    private int field3131 = 1;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    private int field3127 = 0;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    private int field3143 = 1;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    private int field3146 = 0;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lbu;")
    private class19 field3128 = new class19();

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    private int field3147 = 0;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "Z")
    private boolean field3151 = false;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "Z")
    private boolean field3150 = true;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "Z")
    private boolean field3156 = true;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    private int field3153 = -1;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "Z")
    private boolean field3148 = true;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "[Lea;")
    private class468[] field3157 = new class468[2];

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Z")
    private boolean field3149 = true;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lte;")
    private class527 field3125;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lne;")
    private class266 field3126;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lne;")
    private class266 field3140;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lne;")
    private class266 field3132;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[I")
    public static int[] field3137 = new int[6];

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "Lea;")
    private class468 field3155;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "Lhk;")
    private class86 field3152;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "Lhk;")
    private class86 field3154;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "Z")
    private boolean field3145;

    static {
        new class572("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 3)
    public final void method1397(byte arg0) {
        this.field3140 = this.field3132 = this.field3126 = null;
        this.field3155 = null;
        if (arg0 < 94) {
            this.method1406((byte) 106);
        }
        this.field3157 = null;
        this.field3152 = null;
        field3136++;
        this.field3154 = null;
        if (!this.field3128.method119(true)) {
            for (class417 var2 = this.field3128.method124((byte) 42); var2 != this.field3128.field179; var2 = var2.field5645) {
                ((class358) var2).method2165((byte) 2);
            }
        }
        this.field3143 = this.field3131 = 1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 36)
    public final void method1398(int arg0) {
        field3133++;
        if (!this.field3145) {
            return;
        }
        if (this.field3132 != null) {
            this.field3125.method3116((byte) -61, this.field3132);
            int var2 = 16384;
            this.field3125.method3127(this.field3126, 110);
            this.field3132.method1682(0, 36069);
            this.field3126.method1671(-1, 0);
            if (this.field3151) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field3143, this.field3131, 0, 0, this.field3143, this.field3131, var2, 9728);
            this.field3125.method3124(-101, this.field3132);
            this.field3125.method3147(this.field3126, (byte) 106);
        }
        this.field3125.method3159((byte) 91);
        this.field3125.method3105(0, 2);
        if (arg0 < 69) {
            return;
        }
        this.field3125.method3121(-27745, 1);
        this.field3125.method479();
        int var3 = 0;
        int var4 = 1;
        class358 var6;
        for (class358 var5 = (class358) this.field3128.method124((byte) 42); var5 != null; var5 = var6) {
            var6 = (class358) this.field3128.method120(-93);
            int var7 = var5.method2164(false);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method2158(var8, 86, this.field3157[var3], this.field3155);
                if (var6 == null && var7 - 1 == var8) {
                    this.field3125.method3158(255, this.field3126);
                    this.field3125.method3133(0, 105, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field3131);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field3146, this.field3127);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field3146, this.field3131 + this.field3127);
                    OpenGL.glTexCoord2f((float) this.field3143, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field3146 + this.field3143, this.field3131 + this.field3127);
                    OpenGL.glTexCoord2f((float) this.field3143, (float) this.field3131);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field3146 + this.field3143, this.field3127);
                    OpenGL.glEnd();
                } else {
                    this.field3126.method1671(-1, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field3131);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field3131);
                    OpenGL.glTexCoord2f((float) this.field3143, (float) this.field3131);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field3143, this.field3131);
                    OpenGL.glTexCoord2f((float) this.field3143, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field3143, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var5.method2160(119, var8);
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field3145 = false;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLep;)V", line = 141)
    public final void method1399(boolean arg0, class358 arg1) {
        field3138++;
        if (arg0) {
            arg1.field4875 = false;
            arg1.method2165((byte) 2);
            arg1.method2457(-8422);
            this.method1403(2);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lep;B)Z", line = 160)
    public final boolean method1400(class358 arg0, byte arg1) {
        field3142++;
        if (arg1 != -52) {
            this.method1403(113);
        }
        if (this.field3140 != null) {
            if (arg0.method2156(arg1 ^ 0xFFFFFFAF) || arg0.method2167((byte) 38)) {
                this.field3128.method131(arg0, arg1 ^ 0xFFFFFFCC);
                this.method1403(2);
                if (this.method1407((byte) -86)) {
                    if (this.field3143 != -1 && this.field3131 != -1) {
                        arg0.method2155(this.field3131, true, this.field3143);
                    }
                    arg0.field4875 = true;
                    return true;
                }
            }
            this.method1399(true, arg0);
        }
        return false;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)Z", line = 196)
    public final boolean method1401(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3144++;
        if (this.field3140 == null || this.field3128.method119(true)) {
            return false;
        }
        if (this.field3143 != arg2 || this.field3131 != arg4) {
            this.field3143 = arg2;
            this.field3131 = arg4;
            for (class417 var6 = this.field3128.method124((byte) 42); var6 != this.field3128.field179; var6 = var6.field5645) {
                ((class358) var6).method2155(this.field3131, true, this.field3143);
            }
            this.field3156 = true;
            this.field3150 = true;
            this.field3149 = true;
        }
        if (!this.method1407((byte) -86)) {
            int var7 = -49 / ((arg1 + 63) / 57);
            return false;
        }
        this.field3146 = arg3;
        this.field3127 = arg0;
        this.field3145 = true;
        this.field3125.method3149(1, this.field3140);
        this.field3140.method1671(-1, 0);
        this.field3125.method3133(this.field3131 - this.field3140.method1679(true) - this.field3127, 115, -this.field3146);
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIZ)Lbq;", line = 242)
    public static final class243 method1402(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3134++;
        class243 var5 = new class243();
        var5.field3471 = arg3;
        var5.field3469 = arg2;
        class385.field5297.method2797(-4234, var5, (long) arg0);
        if (arg1 != -4867) {
            field3137 = null;
        }
        class493.method2949(0, arg3);
        class162 var6 = class153.method1117(arg0, arg1 ^ 0x66DB);
        if (var6 != null) {
            class403.method2371(var6, (byte) -62);
        }
        if (class230.field3374 != null) {
            class403.method2371(class230.field3374, (byte) -62);
            class230.field3374 = null;
        }
        class391.method2328(20000000);
        if (var6 != null) {
            class100.method761(var6, arg1 ^ 0x1363, !arg4);
        }
        if (!arg4) {
            class98.method746(arg3);
        }
        if (!arg4 && class340.field4708 != -1) {
            class541.method3291(3, 1, class340.field4708);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 288)
    private final void method1403(int arg0) {
        if (arg0 != 2) {
            return;
        }
        field3141++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class358 var5 = (class358) this.field3128.method124((byte) 42); var5 != null; var5 = (class358) this.field3128.method120(-84)) {
            int var9 = var5.method2163((byte) 85);
            if (var3 < var9) {
                var3 = var9;
            }
            var4 += var5.method2164(false);
            var2 |= var5.method2161(93);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field3153 != var6) {
            this.field3153 = var6;
            this.field3149 = true;
        }
        int var7 = this.field3147 <= 2 ? this.field3147 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        if (var7 != var8) {
            this.field3156 = this.field3149 = true;
        }
        this.field3147 = var4;
        if (this.field3151 != var2) {
            this.field3150 = true;
            this.field3151 = var2;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lte;)V", line = 599)
    public class213(class527 arg0) {
        this.field3125 = arg0;
        if (this.field3125.field7856 && this.field3125.field7814) {
            this.field3140 = this.field3126 = new class266(this.field3125);
            if (this.field3125.field7735 > 1 && this.field3125.field7782 && this.field3125.field7808) {
                this.field3140 = this.field3132 = new class266(this.field3125);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V", line = 355)
    public static void method1404(byte arg0) {
        field3137 = null;
        if (arg0 != 102) {
            method1408(-47, 17, -10);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IJ)V", line = 373)
    public static final void method1405(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 != 0) {
                method1404((byte) -105);
            }
        } catch (InterruptedException var3) {
        }
        field3124++;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)Z", line = 390)
    public final boolean method1406(byte arg0) {
        if (arg0 != 43) {
            this.field3157 = null;
        }
        field3129++;
        return this.field3140 != null;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)Z", line = 401)
    private final boolean method1407(byte arg0) {
        field3135++;
        if (arg0 != -86) {
            this.field3152 = null;
        }
        if (this.field3150) {
            if (this.field3154 != null) {
                this.field3154.method640(-114);
                this.field3154 = null;
            }
            if (this.field3155 != null) {
                this.field3155.method1462((byte) 115);
                this.field3155 = null;
            }
            if (this.field3132 != null) {
                this.field3154 = new class86(this.field3125, 6402, this.field3143, this.field3131, this.field3125.field7735);
            }
            if (this.field3151) {
                this.field3155 = new class468(this.field3125, 34037, 6402, this.field3143, this.field3131);
            } else if (this.field3154 == null) {
                this.field3154 = new class86(this.field3125, 6402, this.field3143, this.field3131);
            }
            this.field3148 = true;
            this.field3150 = false;
            this.field3156 = true;
        }
        if (this.field3149) {
            if (this.field3152 != null) {
                this.field3152.method640(-124);
                this.field3152 = null;
            }
            if (this.field3157[0] != null) {
                this.field3157[0].method1462((byte) -118);
                this.field3157[0] = null;
            }
            if (this.field3157[1] != null) {
                this.field3157[1].method1462((byte) 119);
                this.field3157[1] = null;
            }
            if (this.field3132 != null) {
                this.field3152 = new class86(this.field3125, this.field3153, this.field3143, this.field3131, this.field3125.field7735);
            }
            this.field3157[0] = new class468(this.field3125, 34037, this.field3153, this.field3143, this.field3131);
            this.field3157[1] = this.field3147 <= 1 ? null : new class468(this.field3125, 34037, this.field3153, this.field3143, this.field3131);
            this.field3148 = true;
            this.field3149 = false;
            this.field3156 = true;
        }
        if (this.field3156) {
            if (this.field3132 == null) {
                this.field3125.method3149(1, this.field3126);
                this.field3126.method1678(0, true);
                this.field3126.method1678(1, true);
                this.field3126.method1678(8, true);
                this.field3126.method1689(true, this.field3157[0], 0);
                if (this.field3147 > 1) {
                    this.field3126.method1689(true, this.field3157[1], 1);
                }
                if (this.field3151) {
                    this.field3126.method1689(true, this.field3155, 8);
                } else {
                    this.field3126.method1672((byte) -125, 8, this.field3154);
                }
                this.field3125.method3158(255, this.field3126);
            } else {
                this.field3125.method3149(1, this.field3126);
                this.field3126.method1678(0, true);
                this.field3126.method1678(1, true);
                this.field3126.method1678(8, true);
                this.field3126.method1689(true, this.field3157[0], 0);
                if (this.field3147 > 1) {
                    this.field3126.method1689(true, this.field3157[1], 1);
                }
                if (this.field3151) {
                    this.field3126.method1689(true, this.field3155, 8);
                }
                this.field3125.method3158(255, this.field3126);
                this.field3125.method3149(1, this.field3132);
                this.field3132.method1678(0, true);
                this.field3132.method1678(8, true);
                this.field3132.method1672((byte) -125, 0, this.field3152);
                this.field3132.method1672((byte) -125, 8, this.field3154);
                this.field3125.method3158(255, this.field3132);
            }
            this.field3148 = true;
            this.field3156 = false;
        }
        if (this.field3148) {
            this.field3125.method3149(1, this.field3140);
            this.field3148 = !this.field3140.method1677((byte) 81);
            this.field3125.method3158(255, this.field3140);
        }
        return !this.field3148;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I", line = 542)
    public static final int method1408(int arg0, int arg1, int arg2) {
        field3130++;
        if (arg0 == 1 || arg0 == 3) {
            return class232.field3382[arg2 & 0x3];
        } else {
            int var3 = -61 / ((-arg1 - 61) / 36);
            return class255.field3676[arg2 & 0x3];
        }
    }
}
