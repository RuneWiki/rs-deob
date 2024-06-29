import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class65 {

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    private int field917 = 1;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    private int field921 = 1;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    private int field920 = 0;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
    private int field924 = 0;

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "Ljia;")
    private class645 field934 = new class645();

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "Z")
    private boolean field939 = true;

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "Z")
    private boolean field938 = true;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
    private int field941 = -1;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "Z")
    private boolean field947 = true;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "Z")
    private boolean field943 = false;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
    private int field946 = 0;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "Z")
    private boolean field940 = true;

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "[Lkf;")
    private class268[] field948 = new class268[2];

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "Lhk;")
    private class111 field925;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "Let;")
    private class621 field933;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "Let;")
    private class621 field935;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "Let;")
    private class621 field931;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field926 = 104;

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
    public static int field944 = 0;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "F")
    public static float field932;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "Lkf;")
    private class268 field950;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "Len;")
    public static class339 field916;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "Lfw;")
    private class63 field945;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "Lfw;")
    private class63 field949;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "Z")
    private boolean field929;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(CI)Z")
    public static final boolean method461(char arg0, int arg1) {
        field923++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class762.field10525;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        if (arg1 > -100) {
            field944 = 9;
        }
        return false;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public static void method462(int arg0) {
        field916 = null;
        if (arg0 != 0) {
            field932 = -0.08496721F;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZLrp;)V")
    public final void method463(boolean arg0, class462 arg1) {
        field928++;
        arg1.field6279 = false;
        arg1.method2658(-257);
        arg1.method1207(126);
        if (!arg0) {
            this.field945 = null;
        }
        this.method465(0);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBIII)Z")
    public final boolean method464(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 81) {
            this.method465(-8);
        }
        field936++;
        if (this.field935 == null || this.field934.method3586(0)) {
            return false;
        }
        if (this.field917 != arg0 || this.field921 != arg4) {
            this.field921 = arg4;
            this.field917 = arg0;
            for (class154 var6 = this.field934.method3589((byte) -127); var6 != this.field934.field8920; var6 = var6.field2524) {
                ((class462) var6).method2664(this.field921, this.field917, (byte) -80);
            }
            this.field940 = true;
            this.field939 = true;
            this.field938 = true;
        }
        if (!this.method467(0)) {
            return false;
        }
        this.field920 = arg3;
        this.field929 = true;
        this.field924 = arg2;
        this.field925.method934(false, this.field935);
        this.field935.method3504(true, 0);
        this.field925.method940(65280, -this.field920, this.field921 - (this.field925.field1921 - this.field924));
        return true;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
    private final void method465(int arg0) {
        field922++;
        boolean var2 = false;
        int var3 = arg0;
        int var4 = 0;
        for (class462 var5 = (class462) this.field934.method3589((byte) -128); var5 != null; var5 = (class462) this.field934.method3591(arg0)) {
            int var9 = var5.method2665(0);
            if (var3 < var9) {
                var3 = var9;
            }
            var4 += var5.method2668(5);
            var2 |= var5.method2657(arg0 ^ 0x1);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field941 != var6) {
            this.field938 = true;
            this.field941 = var6;
        }
        int var7 = this.field946 <= 2 ? this.field946 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        if (this.field943 != var2) {
            this.field939 = true;
            this.field943 = var2;
        }
        if (var7 != var8) {
            this.field940 = this.field938 = true;
        }
        this.field946 = var4;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
    public final void method466(byte arg0) {
        field930++;
        if (!this.field929) {
            return;
        }
        if (this.field931 != null) {
            this.field925.method964(this.field931, -1);
            int var2 = 16384;
            this.field925.method949((byte) -110, this.field933);
            this.field931.method3495(0, 0);
            this.field933.method3504(true, 0);
            if (this.field943) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field917, this.field921, 0, 0, this.field917, this.field921, var2, 9728);
            this.field925.method989((byte) -72, this.field931);
            this.field925.method968(this.field933, 3);
        }
        this.field925.method952((byte) 120);
        this.field925.method973(1, 0);
        this.field925.method999(true, 1);
        this.field925.method575();
        int var3 = 93 / ((45 - arg0) / 39);
        int var4 = 0;
        int var5 = 1;
        class462 var7;
        for (class462 var6 = (class462) this.field934.method3589((byte) -128); var6 != null; var6 = var7) {
            var7 = (class462) this.field934.method3591(0);
            int var8 = var6.method2668(5);
            for (int var9 = 0; var9 < var8; var9++) {
                var6.method2666(this.field948[var4], 1, var9, this.field950);
                if (var7 == null && var8 - 1 == var9) {
                    this.field925.method954(1, this.field933);
                    this.field925.method940(65280, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field921);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field920, this.field924);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field920, this.field924 + this.field921);
                    OpenGL.glTexCoord2f((float) this.field917, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field920 + this.field917, this.field924 - -this.field921);
                    OpenGL.glTexCoord2f((float) this.field917, (float) this.field921);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field920 + this.field917, this.field924);
                    OpenGL.glEnd();
                } else {
                    this.field933.method3504(true, var5);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field921);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field921);
                    OpenGL.glTexCoord2f((float) this.field917, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field917, this.field921);
                    OpenGL.glTexCoord2f((float) this.field917, (float) this.field921);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field917, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5 = var5 + 1 & 0x1;
                var6.method2662(-113, var9);
            }
        }
        this.field929 = false;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)Z")
    private final boolean method467(int arg0) {
        if (arg0 != 0) {
            method471((byte) 91, -76, -86);
        }
        if (this.field939) {
            if (this.field945 != null) {
                this.field945.method435(40);
                this.field945 = null;
            }
            if (this.field950 != null) {
                this.field950.method128((byte) 118);
                this.field950 = null;
            }
            if (this.field931 != null) {
                this.field945 = new class63(this.field925, 6402, this.field917, this.field921, this.field925.field1924);
            }
            if (this.field943) {
                this.field950 = new class268(this.field925, 34037, 6402, this.field917, this.field921);
            } else if (this.field945 == null) {
                this.field945 = new class63(this.field925, 6402, this.field917, this.field921);
            }
            this.field947 = true;
            this.field939 = false;
            this.field940 = true;
        }
        field942++;
        if (this.field938) {
            if (this.field949 != null) {
                this.field949.method435(126);
                this.field949 = null;
            }
            if (this.field948[0] != null) {
                this.field948[0].method128((byte) 118);
                this.field948[0] = null;
            }
            if (this.field948[1] != null) {
                this.field948[1].method128((byte) 118);
                this.field948[1] = null;
            }
            if (this.field931 != null) {
                this.field949 = new class63(this.field925, this.field941, this.field917, this.field921, this.field925.field1924);
            }
            this.field948[0] = new class268(this.field925, 34037, this.field941, this.field917, this.field921);
            this.field948[1] = this.field946 <= 1 ? null : new class268(this.field925, 34037, this.field941, this.field917, this.field921);
            this.field940 = true;
            this.field947 = true;
            this.field938 = false;
        }
        if (this.field940) {
            if (this.field931 == null) {
                this.field925.method934(false, this.field933);
                this.field933.method3500((byte) 125, 0);
                this.field933.method3500((byte) 122, 1);
                this.field933.method3500((byte) 126, 8);
                this.field933.method3502(0, -77, this.field948[0]);
                if (this.field946 > 1) {
                    this.field933.method3502(1, arg0 ^ 0xFFFFFF91, this.field948[1]);
                }
                if (this.field943) {
                    this.field933.method3502(8, 19, this.field950);
                } else {
                    this.field933.method3496(arg0 ^ 0xFFFFFF8C, this.field945, 8);
                }
                this.field925.method954(1, this.field933);
            } else {
                this.field925.method934(false, this.field933);
                this.field933.method3500((byte) 123, 0);
                this.field933.method3500((byte) 119, 1);
                this.field933.method3500((byte) 127, 8);
                this.field933.method3502(0, 91, this.field948[0]);
                if (this.field946 > 1) {
                    this.field933.method3502(1, -126, this.field948[1]);
                }
                if (this.field943) {
                    this.field933.method3502(8, -122, this.field950);
                }
                this.field925.method954(1, this.field933);
                this.field925.method934(false, this.field931);
                this.field931.method3500((byte) 122, 0);
                this.field931.method3500((byte) 120, 8);
                this.field931.method3496(arg0 ^ 0xFFFFFF92, this.field949, 0);
                this.field931.method3496(arg0 - 127, this.field945, 8);
                this.field925.method954(1, this.field931);
            }
            this.field940 = false;
            this.field947 = true;
        }
        if (this.field947) {
            this.field925.method934(false, this.field935);
            this.field947 = !this.field935.method3497((byte) 113);
            this.field925.method954(1, this.field935);
        }
        return !this.field947;
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)Z")
    public final boolean method468(int arg0) {
        if (arg0 != 29566) {
            this.method463(true, null);
        }
        field937++;
        return this.field935 != null;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLrp;)Z")
    public final boolean method469(byte arg0, class462 arg1) {
        field919++;
        if (this.field935 != null) {
            if (arg1.method2663((byte) -120) || arg1.method2660(35632)) {
                this.field934.method3594((byte) 105, arg1);
                this.method465(0);
                if (this.method467(0)) {
                    if (this.field917 != -1 && this.field921 != -1) {
                        arg1.method2664(this.field921, this.field917, (byte) -80);
                    }
                    arg1.field6279 = true;
                    return true;
                }
            }
            this.method463(true, arg1);
        }
        if (arg0 != -119) {
            this.field946 = 23;
        }
        return false;
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)V")
    public final void method470(int arg0) {
        this.field935 = this.field931 = this.field933 = null;
        this.field949 = null;
        this.field950 = null;
        this.field945 = null;
        this.field948 = null;
        field927++;
        if (!this.field934.method3586(arg0)) {
            for (class154 var2 = this.field934.method3589((byte) -127); var2 != this.field934.field8920; var2 = var2.field2524) {
                ((class462) var2).method2658(-257);
            }
        }
        this.field917 = this.field921 = 1;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BII)V")
    public static final void method471(byte arg0, int arg1, int arg2) {
        field918++;
        if (arg0 == -91) {
            class281 var3 = class54.method395((byte) -53, (long) arg1 | (long) arg2 << 32, 18);
            var3.method1818((byte) 97);
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lhk;)V")
    public class65(class111 arg0) {
        this.field925 = arg0;
        if (this.field925.field2041 && this.field925.field1989) {
            this.field935 = this.field933 = new class621(this.field925);
            if (this.field925.field1924 > 1 && this.field925.field2061 && this.field925.field1991) {
                this.field935 = this.field931 = new class621(this.field925);
                return;
            }
        }
    }
}
