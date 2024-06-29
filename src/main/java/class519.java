import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class519 {

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    private int field7297 = 0;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    private int field7295 = 0;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    private int field7303 = 1;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    private int field7306 = 1;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Ldm;")
    private class46 field7287 = new class46();

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Z")
    private boolean field7309 = true;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "Z")
    private boolean field7307 = true;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "Z")
    private boolean field7315 = true;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "Z")
    private boolean field7313 = true;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    private int field7312 = -1;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    private int field7318 = 0;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "Z")
    private boolean field7319 = false;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "[Lob;")
    private class629[] field7311 = new class629[2];

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Lgi;")
    private class583 field7300;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Laea;")
    private class45 field7302;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Laea;")
    private class45 field7286;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Laea;")
    private class45 field7294;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
    public static int[] field7293 = new int[4096];

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Lej;")
    public static class104 field7305 = new class104("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field7316 = 0;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "Ldk;")
    public static class435 field7310 = new class435(1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "Lfda;")
    private class267 field7314;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "Lfda;")
    private class267 field7317;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Lob;")
    private class629 field7308;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Z")
    private boolean field7298;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public final void method2989(byte arg0) {
        if (arg0 >= -83) {
            return;
        }
        field7290++;
        if (!this.field7298) {
            return;
        }
        if (this.field7294 != null) {
            int var2 = 16384;
            this.field7300.method3388(this.field7294, (byte) 76);
            this.field7300.method3382(111, this.field7302);
            this.field7294.method444(0, 60);
            this.field7302.method453(94, 0);
            if (this.field7319) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field7306, this.field7303, 0, 0, this.field7306, this.field7303, var2, 9728);
            this.field7300.method3410((byte) 62, this.field7294);
            this.field7300.method3355(this.field7302, 3);
        }
        this.field7300.method3386(16654);
        this.field7300.method3348(0, (byte) 108);
        this.field7300.method3396((byte) 107, 1);
        this.field7300.method1269();
        int var3 = 0;
        int var4 = 1;
        class165 var6;
        for (class165 var5 = (class165) this.field7287.method456((byte) -108); var5 != null; var5 = var6) {
            var6 = (class165) this.field7287.method460((byte) 63);
            int var7 = var5.method1060((byte) 106);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method693(this.field7311[var3], var8, 12096, this.field7308);
                if (var6 == null && var7 - 1 == var8) {
                    this.field7300.method3395(this.field7302, 14032);
                    this.field7300.method3328(0, (byte) -106, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7303);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7297, this.field7295);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7297, this.field7303 + this.field7295);
                    OpenGL.glTexCoord2f((float) this.field7306, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7306 + this.field7297, this.field7295 - -this.field7303);
                    OpenGL.glTexCoord2f((float) this.field7306, (float) this.field7303);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7306 + this.field7297, this.field7295);
                    OpenGL.glEnd();
                } else {
                    this.field7302.method453(72, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7303);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field7303);
                    OpenGL.glTexCoord2f((float) this.field7306, (float) this.field7303);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7306, this.field7303);
                    OpenGL.glTexCoord2f((float) this.field7306, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7306, 0);
                    OpenGL.glEnd();
                }
                var5.method698(var8, 0);
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field7298 = false;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Z")
    public final boolean method2990(int arg0) {
        field7285++;
        if (arg0 == 0) {
            return this.field7286 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)Z")
    public final boolean method2991(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7288++;
        if (this.field7286 == null || this.field7287.method466((byte) 87)) {
            return false;
        }
        if (this.field7306 != arg0 || this.field7303 != arg4) {
            this.field7303 = arg4;
            this.field7306 = arg0;
            for (class176 var6 = this.field7287.method456((byte) -111); var6 != this.field7287.field892; var6 = var6.field2516) {
                ((class165) var6).method702(this.field7306, -257, this.field7303);
            }
            this.field7307 = true;
            this.field7309 = true;
            this.field7315 = true;
        }
        if (this.method2993(true)) {
            this.field7298 = true;
            this.field7297 = arg2;
            this.field7295 = arg3;
            this.field7300.method3350(-2438, this.field7286);
            this.field7286.method453(arg1 - 6353, 0);
            this.field7300.method3328(-this.field7297, (byte) 25, this.field7303 - this.field7286.method450((byte) 63) - this.field7295);
            return true;
        } else if (arg1 == 6408) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lpq;I)Z")
    public final boolean method2992(class165 arg0, int arg1) {
        field7292++;
        if (arg1 != -2) {
            this.field7294 = null;
        }
        if (this.field7286 != null) {
            if (arg0.method704((byte) -73) || arg0.method700(256)) {
                this.field7287.method463(arg0, -110);
                this.method2997(68);
                if (this.method2993(true)) {
                    if (this.field7306 != -1 && this.field7303 != -1) {
                        arg0.method702(this.field7306, -257, this.field7303);
                    }
                    arg0.field2379 = true;
                    return true;
                }
            }
            this.method2996(arg0, 93);
        }
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)Z")
    private final boolean method2993(boolean arg0) {
        field7301++;
        if (this.field7307) {
            if (this.field7317 != null) {
                this.field7317.method1748(-116);
                this.field7317 = null;
            }
            if (this.field7308 != null) {
                this.field7308.method2506((byte) 113);
                this.field7308 = null;
            }
            if (this.field7294 != null) {
                this.field7317 = new class267(this.field7300, 6402, this.field7306, this.field7303, this.field7300.field8194);
            }
            if (this.field7319) {
                this.field7308 = new class629(this.field7300, 34037, 6402, this.field7306, this.field7303);
            } else if (this.field7317 == null) {
                this.field7317 = new class267(this.field7300, 6402, this.field7306, this.field7303);
            }
            this.field7307 = false;
            this.field7315 = true;
            this.field7313 = true;
        }
        if (this.field7309) {
            if (this.field7314 != null) {
                this.field7314.method1748(-116);
                this.field7314 = null;
            }
            if (this.field7311[0] != null) {
                this.field7311[0].method2506((byte) 118);
                this.field7311[0] = null;
            }
            if (this.field7311[1] != null) {
                this.field7311[1].method2506((byte) 72);
                this.field7311[1] = null;
            }
            if (this.field7294 != null) {
                this.field7314 = new class267(this.field7300, this.field7312, this.field7306, this.field7303, this.field7300.field8194);
            }
            this.field7311[0] = new class629(this.field7300, 34037, this.field7312, this.field7306, this.field7303);
            this.field7311[1] = this.field7318 <= 1 ? null : new class629(this.field7300, 34037, this.field7312, this.field7306, this.field7303);
            this.field7313 = true;
            this.field7315 = true;
            this.field7309 = false;
        }
        if (!arg0) {
            return false;
        }
        if (this.field7315) {
            if (this.field7294 == null) {
                this.field7300.method3350(-2438, this.field7302);
                this.field7302.method452((byte) 62, 0);
                this.field7302.method452((byte) -39, 1);
                this.field7302.method452((byte) 84, 8);
                this.field7302.method435(0, this.field7311[0], 0);
                if (this.field7318 > 1) {
                    this.field7302.method435(0, this.field7311[1], 1);
                }
                if (this.field7319) {
                    this.field7302.method435(0, this.field7308, 8);
                } else {
                    this.field7302.method449(this.field7317, 24029, 8);
                }
                this.field7300.method3395(this.field7302, 14032);
            } else {
                this.field7300.method3350(-2438, this.field7302);
                this.field7302.method452((byte) 67, 0);
                this.field7302.method452((byte) 112, 1);
                this.field7302.method452((byte) 115, 8);
                this.field7302.method435(0, this.field7311[0], 0);
                if (this.field7318 > 1) {
                    this.field7302.method435(0, this.field7311[1], 1);
                }
                if (this.field7319) {
                    this.field7302.method435(0, this.field7308, 8);
                }
                this.field7300.method3395(this.field7302, 14032);
                this.field7300.method3350(-2438, this.field7294);
                this.field7294.method452((byte) -114, 0);
                this.field7294.method452((byte) 93, 8);
                this.field7294.method449(this.field7314, 24029, 0);
                this.field7294.method449(this.field7317, 24029, 8);
                this.field7300.method3395(this.field7294, 14032);
            }
            this.field7315 = false;
            this.field7313 = true;
        }
        if (this.field7313) {
            this.field7300.method3350(-2438, this.field7286);
            this.field7313 = !this.field7286.method448(-75);
            this.field7300.method3395(this.field7286, 14032);
        }
        return !this.field7313;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lqa;IIIIIZ)Lr;")
    public static final class157 method2994(class207 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field7289++;
        long var7 = (long) arg4;
        class157 var9 = (class157) class529.field7414.method3252(var7, (byte) -104);
        short var10 = 2055;
        if (var9 == null) {
            class317 var11 = class428.method2544(-96, 0, arg4, class566.field7830);
            if (var11 == null) {
                return null;
            }
            if (var11.field4281 < 13) {
                var11.method1971(0, 2);
            }
            var9 = arg0.method1293(var11, var10, class71.field1182, 64, 768);
            class529.field7414.method3243(var9, var7, 89);
        }
        class157 var12 = var9.method163((byte) 2, var10, arg6);
        if (arg1 != 0) {
            var12.method140(arg1);
        }
        if (arg3 != 0) {
            var12.method155(arg3);
        }
        if (arg2 != 0) {
            var12.method141(arg2);
        }
        if (arg5 != 0) {
            var12.method152(0, arg5, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static void method2995(int arg0) {
        field7310 = null;
        field7305 = null;
        field7293 = null;
        if (arg0 != -3) {
            method2995(43);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Lpq;I)V")
    public final void method2996(class165 arg0, int arg1) {
        field7291++;
        arg0.field2379 = false;
        arg0.method696(27659);
        if (arg1 <= 17) {
            this.field7287 = null;
        }
        arg0.method1117(0);
        this.method2997(97);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
    private final void method2997(int arg0) {
        field7299++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (arg0 < 34) {
            this.field7317 = null;
        }
        for (class165 var5 = (class165) this.field7287.method456((byte) -56); var5 != null; var5 = (class165) this.field7287.method460((byte) -99)) {
            int var9 = var5.method694(-128);
            var4 += var5.method1060((byte) 115);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method1062(true);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field7312 != var6) {
            this.field7312 = var6;
            this.field7309 = true;
        }
        int var7 = this.field7318 > 2 ? 2 : this.field7318;
        int var8 = var4 <= 2 ? var4 : 2;
        if (this.field7319 != var2) {
            this.field7307 = true;
            this.field7319 = var2;
        }
        this.field7318 = var4;
        if (var7 != var8) {
            this.field7315 = this.field7309 = true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public final void method2998(byte arg0) {
        this.field7308 = null;
        this.field7286 = this.field7294 = this.field7302 = null;
        field7296++;
        this.field7311 = null;
        this.field7314 = null;
        this.field7317 = null;
        if (!this.field7287.method466((byte) 87)) {
            for (class176 var2 = this.field7287.method456((byte) -81); var2 != this.field7287.field892; var2 = var2.field2516) {
                ((class165) var2).method696(27659);
            }
        }
        this.field7306 = this.field7303 = 1;
        if (arg0 >= -53) {
            this.field7287 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lgi;)V")
    public class519(class583 arg0) {
        this.field7300 = arg0;
        if (this.field7300.field8306 && this.field7300.field8253) {
            this.field7286 = this.field7302 = new class45(this.field7300);
            if (this.field7300.field8194 > 1 && this.field7300.field8233 && this.field7300.field8325) {
                this.field7286 = this.field7294 = new class45(this.field7300);
                return;
            }
        }
    }
}
