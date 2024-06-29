import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class598 {

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    private int field8238 = 1;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    private int field8234 = 1;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    private int field8241 = 0;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    private int field8222 = 0;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lwo;")
    private class445 field8224 = new class445();

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    private int field8245 = -1;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Z")
    private boolean field8243 = true;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    private int field8244 = 0;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "Z")
    private boolean field8253 = true;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "[Ldga;")
    private class441[] field8246 = new class441[2];

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "Z")
    private boolean field8247 = false;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "Z")
    private boolean field8249 = true;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "Z")
    private boolean field8250 = true;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Lag;")
    private class469 field8229;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Liu;")
    private class560 field8235;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Liu;")
    private class560 field8225;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Liu;")
    private class560 field8236;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "S")
    public static short field8226 = 205;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Lwo;")
    public static class445 field8232 = new class445();

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field8237;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "Ldga;")
    private class441 field8252;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "Lmea;")
    private class72 field8248;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "Lmea;")
    private class72 field8251;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Z")
    private boolean field8230;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 3)
    public final void method3310(int arg0) {
        this.field8225 = this.field8236 = this.field8235 = null;
        this.field8246 = null;
        this.field8252 = null;
        this.field8248 = null;
        field8240++;
        this.field8251 = null;
        if (!this.field8224.method2499((byte) 110)) {
            for (class45 var2 = this.field8224.method2506(68); var2 != this.field8224.field5887; var2 = var2.field548) {
                ((class619) var2).method2778((byte) 127);
            }
        }
        if (arg0 == -27838) {
            this.field8234 = this.field8238 = 1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLlga;)Z", line = 34)
    public final boolean method3311(byte arg0, class619 arg1) {
        field8228++;
        if (this.field8225 != null) {
            if (arg1.method2781(0) || arg1.method2774((byte) -53)) {
                this.field8224.method2507(arg1, (byte) -123);
                this.method3317(-1);
                if (this.method3312((byte) -109)) {
                    if (this.field8234 != -1 && this.field8238 != -1) {
                        arg1.method2779(this.field8234, -108, this.field8238);
                    }
                    arg1.field8599 = true;
                    return true;
                }
            }
            this.method3315(0, arg1);
        }
        int var3 = 102 % ((arg0 - 32) / 36);
        return false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Z", line = 68)
    private final boolean method3312(byte arg0) {
        if (this.field8243) {
            if (this.field8248 != null) {
                this.field8248.method394(-74);
                this.field8248 = null;
            }
            if (this.field8252 != null) {
                this.field8252.method1581(-108);
                this.field8252 = null;
            }
            if (this.field8236 != null) {
                this.field8248 = new class72(this.field8229, 6402, this.field8234, this.field8238, this.field8229.field6386);
            }
            if (this.field8247) {
                this.field8252 = new class441(this.field8229, 34037, 6402, this.field8234, this.field8238);
            } else if (this.field8248 == null) {
                this.field8248 = new class72(this.field8229, 6402, this.field8234, this.field8238);
            }
            this.field8253 = true;
            this.field8243 = false;
            this.field8250 = true;
        }
        field8221++;
        if (this.field8249) {
            if (this.field8251 != null) {
                this.field8251.method394(-47);
                this.field8251 = null;
            }
            if (this.field8246[0] != null) {
                this.field8246[0].method1581(-109);
                this.field8246[0] = null;
            }
            if (this.field8246[1] != null) {
                this.field8246[1].method1581(-127);
                this.field8246[1] = null;
            }
            if (this.field8236 != null) {
                this.field8251 = new class72(this.field8229, this.field8245, this.field8234, this.field8238, this.field8229.field6386);
            }
            this.field8246[0] = new class441(this.field8229, 34037, this.field8245, this.field8234, this.field8238);
            this.field8246[1] = this.field8244 > 1 ? new class441(this.field8229, 34037, this.field8245, this.field8234, this.field8238) : null;
            this.field8253 = true;
            this.field8250 = true;
            this.field8249 = false;
        }
        if (this.field8253) {
            if (this.field8236 == null) {
                this.field8229.method2673(this.field8235, 128);
                this.field8235.method3105((byte) 107, 0);
                this.field8235.method3105((byte) 107, 1);
                this.field8235.method3105((byte) 107, 8);
                this.field8235.method3111((byte) -90, this.field8246[0], 0);
                if (this.field8244 > 1) {
                    this.field8235.method3111((byte) -124, this.field8246[1], 1);
                }
                if (this.field8247) {
                    this.field8235.method3111((byte) -124, this.field8252, 8);
                } else {
                    this.field8235.method3112(1, this.field8248, 8);
                }
                this.field8229.method2621((byte) -38, this.field8235);
            } else {
                this.field8229.method2673(this.field8235, 128);
                this.field8235.method3105((byte) 107, 0);
                this.field8235.method3105((byte) 107, 1);
                this.field8235.method3105((byte) 107, 8);
                this.field8235.method3111((byte) -95, this.field8246[0], 0);
                if (this.field8244 > 1) {
                    this.field8235.method3111((byte) -84, this.field8246[1], 1);
                }
                if (this.field8247) {
                    this.field8235.method3111((byte) -111, this.field8252, 8);
                }
                this.field8229.method2621((byte) 121, this.field8235);
                this.field8229.method2673(this.field8236, 128);
                this.field8236.method3105((byte) 107, 0);
                this.field8236.method3105((byte) 107, 8);
                this.field8236.method3112(arg0 ^ 0xFFFFFF92, this.field8251, 0);
                this.field8236.method3112(1, this.field8248, 8);
                this.field8229.method2621((byte) -116, this.field8236);
            }
            this.field8253 = false;
            this.field8250 = true;
        }
        if (arg0 != -109) {
            this.method3312((byte) 59);
        }
        if (this.field8250) {
            this.field8229.method2673(this.field8225, 128);
            this.field8250 = !this.field8225.method3113((byte) 123);
            this.field8229.method2621((byte) 76, this.field8225);
        }
        return !this.field8250;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)Z", line = 198)
    public final boolean method3313(byte arg0) {
        if (arg0 <= 23) {
            this.field8234 = 127;
        }
        field8223++;
        return this.field8225 != null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)Z", line = 209)
    public final boolean method3314(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8242++;
        if (arg2 >= -106) {
            this.field8236 = null;
        }
        if (this.field8225 == null || this.field8224.method2499((byte) 123)) {
            return false;
        }
        if (this.field8234 != arg3 || this.field8238 != arg4) {
            this.field8238 = arg4;
            this.field8234 = arg3;
            for (class45 var6 = this.field8224.method2506(68); var6 != this.field8224.field5887; var6 = var6.field548) {
                ((class619) var6).method2779(this.field8234, -116, this.field8238);
            }
            this.field8249 = true;
            this.field8243 = true;
            this.field8253 = true;
        }
        if (!this.method3312((byte) -109)) {
            return false;
        }
        this.field8230 = true;
        this.field8222 = arg0;
        this.field8241 = arg1;
        this.field8229.method2673(this.field8225, 128);
        this.field8225.method3107(18457, 0);
        this.field8229.method2671(this.field8238 + this.field8222 - this.field8229.field6337, -this.field8241, 9114);
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILlga;)V", line = 264)
    public final void method3315(int arg0, class619 arg1) {
        if (arg0 != 0) {
            this.method3315(31, null);
        }
        field8239++;
        arg1.field8599 = false;
        arg1.method2778((byte) 127);
        arg1.method242(true);
        this.method3317(-1);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V", line = 285)
    public static void method3316(byte arg0) {
        field8232 = null;
        if (arg0 <= 32) {
            field8231 = -84;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lag;)V", line = 538)
    public class598(class469 arg0) {
        this.field8229 = arg0;
        if (this.field8229.field6507 && this.field8229.field6459) {
            this.field8225 = this.field8235 = new class560(this.field8229);
            if (this.field8229.field6386 > 1 && this.field8229.field6457 && this.field8229.field6506) {
                this.field8225 = this.field8236 = new class560(this.field8229);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 302)
    private final void method3317(int arg0) {
        field8233++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        class619 var5 = (class619) this.field8224.method2506(68);
        if (arg0 != -1) {
            field8226 = 32;
        }
        while (var5 != null) {
            int var9 = var5.method2773(arg0 + 1);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method3422(1);
            var2 |= var5.method3424((byte) 99);
            var5 = (class619) this.field8224.method2505(-120);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field8245 != var6) {
            this.field8249 = true;
            this.field8245 = var6;
        }
        int var7 = this.field8244 > 2 ? 2 : this.field8244;
        int var8 = var4 <= 2 ? var4 : 2;
        this.field8244 = var4;
        if (var2 != this.field8247) {
            this.field8247 = var2;
            this.field8243 = true;
        }
        if (var7 != var8) {
            this.field8253 = this.field8249 = true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 378)
    public final void method3318(int arg0) {
        field8237++;
        if (!this.field8230) {
            return;
        }
        if (this.field8236 != null) {
            this.field8229.method2695(this.field8236, 78);
            int var2 = 16384;
            this.field8229.method2676(this.field8235, -22317);
            this.field8236.method3110(-1, 0);
            this.field8235.method3107(18457, 0);
            if (this.field8247) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field8234, this.field8238, 0, 0, this.field8234, this.field8238, var2, 9728);
            this.field8229.method2645(31285, this.field8236);
            this.field8229.method2623((byte) 60, this.field8235);
        }
        this.field8229.method2629((byte) -113);
        this.field8229.method2644(0, (byte) 79);
        this.field8229.method2650((byte) -66, 1);
        this.field8229.method1044();
        int var3 = 0;
        int var4 = 1;
        class619 var5 = (class619) this.field8224.method2506(68);
        if (arg0 <= 61) {
            this.method3312((byte) 51);
        }
        while (var5 != null) {
            class619 var6 = (class619) this.field8224.method2505(-123);
            int var7 = var5.method3422(1);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method2782(this.field8252, 29698, var8, this.field8246[var3]);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field8229.method2621((byte) 91, this.field8235);
                    this.field8229.method2671(0, 0, 9114);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field8238);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field8241, this.field8222);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field8241, this.field8222 + this.field8238);
                    OpenGL.glTexCoord2f((float) this.field8234, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field8241 + this.field8234, this.field8238 + this.field8222);
                    OpenGL.glTexCoord2f((float) this.field8234, (float) this.field8238);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field8241 + this.field8234, this.field8222);
                    OpenGL.glEnd();
                } else {
                    this.field8235.method3107(18457, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field8238);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field8238);
                    OpenGL.glTexCoord2f((float) this.field8234, (float) this.field8238);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field8234, this.field8238);
                    OpenGL.glTexCoord2f((float) this.field8234, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field8234, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5.method2772(-116, var8);
                var3 = var3 + 1 & 0x1;
            }
            var5 = var6;
        }
        this.field8230 = false;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)V", line = 483)
    public static final void method3319(byte arg0) {
        class21.method131(128);
        field8227++;
        class328.method1911(22050, class602.field8408.field4339, 2, (byte) -109);
        class546.field7467 = class685.method3879(0, class583.field7996, class312.field4206, 22050, -1024);
        class546.field7467.method3086(class335.field4536, 50);
        if (arg0 == -78) {
            class62.field781 = class685.method3879(1, class583.field7996, class312.field4206, 2048, -1024);
            class62.field781.method3086(class126.field1759, 50);
        }
    }
}
