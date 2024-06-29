import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class216 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    private int field3102 = 1;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    private int field3112 = 0;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    private int field3109 = 0;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    private int field3103 = 1;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lpk;")
    private class133 field3106 = new class133();

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    private int field3124 = -1;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Z")
    private boolean field3119 = true;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "Z")
    private boolean field3121 = true;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    private int field3122 = 0;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Z")
    private boolean field3129 = true;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "[Laf;")
    private class299[] field3128 = new class299[2];

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Z")
    private boolean field3120 = true;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Z")
    private boolean field3127 = false;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Lfd;")
    private class365 field3110;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "Lml;")
    private class264 field3117;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lml;")
    private class264 field3107;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lml;")
    private class264 field3113;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lgk;")
    public static class331 field3108 = new class331("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Z")
    public static boolean field3133 = false;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Lsl;")
    public static class318 field3132 = new class318(63, -1);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "Laf;")
    private class299 field3126;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "Lio;")
    private class301 field3123;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "Lio;")
    private class301 field3130;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Z")
    private boolean field3104;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field3125;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public final void method1474(int arg0) {
        if (arg0 != 26187) {
            this.field3126 = null;
        }
        this.field3126 = null;
        this.field3130 = null;
        this.field3107 = this.field3113 = this.field3117 = null;
        this.field3128 = null;
        field3111++;
        this.field3123 = null;
        if (!this.field3106.method1025((byte) -124)) {
            for (class223 var2 = this.field3106.method1018(71); var2 != this.field3106.field1918; var2 = var2.field3275) {
                ((class91) var2).method813((byte) -71);
            }
        }
        this.field3103 = this.field3102 = 1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILcg;)Z")
    public final boolean method1475(int arg0, class91 arg1) {
        field3114++;
        if (arg0 != 0) {
            return true;
        }
        if (this.field3107 != null) {
            if (arg1.method811((byte) 109) || arg1.method812((byte) 126)) {
                this.field3106.method1015(false, arg1);
                this.method1476(arg0 + 2);
                if (this.method1478((byte) 102)) {
                    if (this.field3103 != -1 && this.field3102 != -1) {
                        arg1.method814(arg0 + 8574, this.field3102, this.field3103);
                    }
                    arg1.field1254 = true;
                    return true;
                }
            }
            this.method1479(arg0 - 104, arg1);
        }
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    private final void method1476(int arg0) {
        field3105++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class91 var5 = (class91) this.field3106.method1018(arg0 ^ 0x68); var5 != null; var5 = (class91) this.field3106.method1022((byte) -112)) {
            int var9 = var5.method806(true);
            var4 += var5.method808(true);
            if (var9 > var3) {
                var3 = var9;
            }
            var2 |= var5.method805(true);
        }
        int var6;
        if (arg0 == var3) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field3124 != var6) {
            this.field3129 = true;
            this.field3124 = var6;
        }
        int var7 = this.field3122 > 2 ? 2 : this.field3122;
        int var8 = var4 > 2 ? 2 : var4;
        if (var2 != this.field3127) {
            this.field3127 = var2;
            this.field3119 = true;
        }
        if (var7 != var8) {
            this.field3120 = this.field3129 = true;
        }
        this.field3122 = var4;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public static void method1477(int arg0) {
        field3125 = null;
        int var1 = 62 % ((27 - arg0) / 52);
        field3132 = null;
        field3108 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Z")
    private final boolean method1478(byte arg0) {
        if (arg0 < 64) {
            this.method1482((byte) 119);
        }
        if (this.field3119) {
            if (this.field3130 != null) {
                this.field3130.method1892(-25097);
                this.field3130 = null;
            }
            if (this.field3126 != null) {
                this.field3126.method2423(-122);
                this.field3126 = null;
            }
            if (this.field3113 != null) {
                this.field3130 = new class301(this.field3110, 6402, this.field3103, this.field3102, this.field3110.field5299);
            }
            if (this.field3127) {
                this.field3126 = new class299(this.field3110, 34037, 6402, this.field3103, this.field3102);
            } else if (this.field3130 == null) {
                this.field3130 = new class301(this.field3110, 6402, this.field3103, this.field3102);
            }
            this.field3120 = true;
            this.field3119 = false;
            this.field3121 = true;
        }
        field3131++;
        if (this.field3129) {
            if (this.field3123 != null) {
                this.field3123.method1892(-25097);
                this.field3123 = null;
            }
            if (this.field3128[0] != null) {
                this.field3128[0].method2423(-100);
                this.field3128[0] = null;
            }
            if (this.field3128[1] != null) {
                this.field3128[1].method2423(-100);
                this.field3128[1] = null;
            }
            if (this.field3113 != null) {
                this.field3123 = new class301(this.field3110, this.field3124, this.field3103, this.field3102, this.field3110.field5299);
            }
            this.field3128[0] = new class299(this.field3110, 34037, this.field3124, this.field3103, this.field3102);
            this.field3128[1] = this.field3122 <= 1 ? null : new class299(this.field3110, 34037, this.field3124, this.field3103, this.field3102);
            this.field3129 = false;
            this.field3121 = true;
            this.field3120 = true;
        }
        if (this.field3120) {
            if (this.field3113 == null) {
                this.field3110.method2205(this.field3117, (byte) -101);
                this.field3117.method1691(0, 80);
                this.field3117.method1691(1, 85);
                this.field3117.method1691(8, -71);
                this.field3117.method1707((byte) 76, this.field3128[0], 0);
                if (this.field3122 > 1) {
                    this.field3117.method1707((byte) 76, this.field3128[1], 1);
                }
                if (this.field3127) {
                    this.field3117.method1707((byte) 76, this.field3126, 8);
                } else {
                    this.field3117.method1695(this.field3130, 8, (byte) -126);
                }
                this.field3110.method2254(this.field3117, -5);
            } else {
                this.field3110.method2205(this.field3117, (byte) -101);
                this.field3117.method1691(0, -94);
                this.field3117.method1691(1, 81);
                this.field3117.method1691(8, -76);
                this.field3117.method1707((byte) 76, this.field3128[0], 0);
                if (this.field3122 > 1) {
                    this.field3117.method1707((byte) 76, this.field3128[1], 1);
                }
                if (this.field3127) {
                    this.field3117.method1707((byte) 76, this.field3126, 8);
                }
                this.field3110.method2254(this.field3117, 112);
                this.field3110.method2205(this.field3113, (byte) -101);
                this.field3113.method1691(0, -106);
                this.field3113.method1691(8, -63);
                this.field3113.method1695(this.field3123, 0, (byte) -87);
                this.field3113.method1695(this.field3130, 8, (byte) -125);
                this.field3110.method2254(this.field3113, -114);
            }
            this.field3121 = true;
            this.field3120 = false;
        }
        if (this.field3121) {
            this.field3110.method2205(this.field3107, (byte) -101);
            this.field3121 = !this.field3107.method1698(-36054);
            this.field3110.method2254(this.field3107, 86);
        }
        return !this.field3121;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(ILcg;)V")
    public final void method1479(int arg0, class91 arg1) {
        if (arg0 > -53) {
            method1477(63);
        }
        field3115++;
        arg1.field1254 = false;
        arg1.method813((byte) -71);
        arg1.method1525((byte) -49);
        this.method1476(2);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)Z")
    public final boolean method1480(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > -68) {
            this.method1481(51);
        }
        field3101++;
        if (this.field3107 == null || this.field3106.method1025((byte) -128)) {
            return false;
        }
        if (this.field3103 != arg1 || this.field3102 != arg4) {
            this.field3102 = arg4;
            this.field3103 = arg1;
            for (class223 var6 = this.field3106.method1018(65); var6 != this.field3106.field1918; var6 = var6.field3275) {
                ((class91) var6).method814(8574, this.field3102, this.field3103);
            }
            this.field3129 = true;
            this.field3120 = true;
            this.field3119 = true;
        }
        if (!this.method1478((byte) 73)) {
            return false;
        }
        this.field3112 = arg0;
        this.field3109 = arg3;
        this.field3104 = true;
        this.field3110.method2205(this.field3107, (byte) -101);
        this.field3107.method1690(82, 0);
        this.field3110.method2214(this.field3102 - this.field3107.method1696((byte) -20) - this.field3109, -this.field3112, 1);
        return true;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)Z")
    public final boolean method1481(int arg0) {
        field3116++;
        if (arg0 == 0) {
            return this.field3107 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
    public final void method1482(byte arg0) {
        field3118++;
        if (!this.field3104) {
            return;
        }
        if (this.field3113 != null) {
            this.field3110.method2232(this.field3113, (byte) -45);
            int var2 = 16384;
            this.field3110.method2239(this.field3117, (byte) 54);
            this.field3113.method1702(0, (byte) 5);
            this.field3117.method1690(arg0 ^ 0xFFFFFFA0, 0);
            if (this.field3127) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field3103, this.field3102, 0, 0, this.field3103, this.field3102, var2, 9728);
            this.field3110.method2218(false, this.field3113);
            this.field3110.method2223((byte) 79, this.field3117);
        }
        this.field3110.method2213(false);
        if (arg0 != -14) {
            this.field3102 = 44;
        }
        this.field3110.method2241(arg0 - 58, 0);
        this.field3110.method2183(arg0 ^ 0xFFFFE1F3, 1);
        this.field3110.method339();
        int var3 = 0;
        int var4 = 1;
        class91 var6;
        for (class91 var5 = (class91) this.field3106.method1018(125); var5 != null; var5 = var6) {
            var6 = (class91) this.field3106.method1022((byte) -112);
            int var7 = var5.method808(true);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method807(var8, (byte) 24, this.field3128[var3], this.field3126);
                if (var6 == null && var7 - 1 == var8) {
                    this.field3110.method2254(this.field3117, arg0 + 29);
                    this.field3110.method2214(0, 0, 1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field3102);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field3112, this.field3109);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field3112, this.field3109 + this.field3102);
                    OpenGL.glTexCoord2f((float) this.field3103, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field3112 + this.field3103, this.field3109 + this.field3102);
                    OpenGL.glTexCoord2f((float) this.field3103, (float) this.field3102);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field3112 + this.field3103, this.field3109);
                    OpenGL.glEnd();
                } else {
                    this.field3117.method1690(82, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field3102);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field3102);
                    OpenGL.glTexCoord2f((float) this.field3103, (float) this.field3102);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field3103, this.field3102);
                    OpenGL.glTexCoord2f((float) this.field3103, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field3103, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
                var5.method803(0, var8);
            }
        }
        this.field3104 = false;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lfd;)V")
    public class216(class365 arg0) {
        this.field3110 = arg0;
        if (this.field3110.field5328 && this.field3110.field5408) {
            this.field3107 = this.field3117 = new class264(this.field3110);
            if (this.field3110.field5299 > 1 && this.field3110.field5386 && this.field3110.field5426) {
                this.field3107 = this.field3113 = new class264(this.field3110);
                return;
            }
        }
    }
}
