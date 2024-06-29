import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class505 {

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    private int field7022 = 0;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    private int field7029 = 1;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    private int field7030 = 0;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    private int field7036 = 1;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lbv;")
    private class568 field7025 = new class568();

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "[Lku;")
    private class495[] field7042 = new class495[2];

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Z")
    private boolean field7046 = true;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "Z")
    private boolean field7044 = true;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "Z")
    private boolean field7048 = true;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    private int field7051 = -1;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    private int field7052 = 0;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "Z")
    private boolean field7049 = true;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "Z")
    private boolean field7050 = false;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Luq;")
    private class313 field7024;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "Lwd;")
    private class327 field7040;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Lwd;")
    private class327 field7033;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Lwd;")
    private class327 field7028;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "[I")
    public static int[] field7035 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[S")
    public static short[] field7026 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "Z")
    public static boolean field7032 = false;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field7039 = new String[100];

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lvt;")
    public static class344 field7019 = new class344("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "Lsm;")
    public static class577 field7041;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "Lku;")
    private class495 field7047;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "Ljv;")
    private class584 field7043;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "Ljv;")
    private class584 field7045;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Z")
    private boolean field7020;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[J")
    public static long[] field7021;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public final void method2821(int arg0) {
        this.field7045 = null;
        this.field7042 = null;
        this.field7033 = this.field7028 = this.field7040 = null;
        this.field7043 = null;
        this.field7047 = null;
        field7016++;
        if (arg0 != -30821) {
            this.method2828(12);
        }
        if (!this.field7025.method3179(true)) {
            for (class108 var2 = this.field7025.method3188((byte) -100); var2 != this.field7025.field7933; var2 = var2.field1403) {
                ((class271) var2).method1655(arg0 ^ 0xFFFFA9CA);
            }
        }
        this.field7029 = this.field7036 = 1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public static final void method2822(boolean arg0) {
        field7017++;
        if (arg0) {
            method2825(14);
        }
        for (int var1 = 0; var1 < class551.field7652; var1++) {
            int var2 = class286.field3739[var1];
            class480 var3 = (class480) class131.field1619.method3476((long) var2, (byte) 28);
            if (var3 != null) {
                class585 var4 = var3.field6729;
                class132.method701((byte) 77, var4, var4.field8478.field9094);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIIII)Z")
    public final boolean method2823(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field7023++;
        if (arg0 != -10) {
            return true;
        } else if (this.field7033 == null || this.field7025.method3179(true)) {
            return false;
        } else {
            if (this.field7029 != arg4 || this.field7036 != arg3) {
                this.field7036 = arg3;
                this.field7029 = arg4;
                for (class108 var6 = this.field7025.method3188((byte) -100); var6 != this.field7025.field7933; var6 = var6.field1403) {
                    ((class271) var6).method1660(this.field7029, -45, this.field7036);
                }
                this.field7048 = true;
                this.field7049 = true;
                this.field7044 = true;
            }
            if (!this.method2827(true)) {
                return false;
            }
            this.field7020 = true;
            this.field7022 = arg2;
            this.field7030 = arg1;
            this.field7024.method1918(this.field7033, 122);
            this.field7033.method2016(true, 0);
            this.field7024.method1938(this.field7036 - this.field7033.method2024(-30372) - this.field7022, -this.field7030, -30919);
            return true;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public final void method2824(byte arg0) {
        field7037++;
        if (!this.field7020) {
            return;
        }
        if (this.field7028 != null) {
            this.field7024.method1903(this.field7028, true);
            int var2 = 16384;
            this.field7024.method1957(this.field7040, -46);
            this.field7028.method2021(-47, 0);
            this.field7040.method2016(true, 0);
            if (this.field7050) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field7029, this.field7036, 0, 0, this.field7029, this.field7036, var2, 9728);
            this.field7024.method1968((byte) 109, this.field7028);
            this.field7024.method1937((byte) 77, this.field7040);
        }
        this.field7024.method1898(true);
        this.field7024.method1905(3042, 0);
        this.field7024.method1909(-82, 1);
        if (arg0 <= 51) {
            this.method2829(null, -119);
        }
        this.field7024.method962();
        int var3 = 0;
        int var4 = 1;
        class271 var6;
        for (class271 var5 = (class271) this.field7025.method3188((byte) -100); var5 != null; var5 = var6) {
            var6 = (class271) this.field7025.method3182((byte) -22);
            int var7 = var5.method1659((byte) -126);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1663(0, this.field7042[var3], this.field7047, var8);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field7024.method1917((byte) 116, this.field7040);
                    this.field7024.method1938(0, 0, -30919);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7036);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7030, this.field7022);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7030, this.field7036 + this.field7022);
                    OpenGL.glTexCoord2f((float) this.field7029, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7030 + this.field7029, this.field7036 + this.field7022);
                    OpenGL.glTexCoord2f((float) this.field7029, (float) this.field7036);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7030 + this.field7029, this.field7022);
                    OpenGL.glEnd();
                } else {
                    this.field7040.method2016(true, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7036);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field7036);
                    OpenGL.glTexCoord2f((float) this.field7029, (float) this.field7036);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7029, this.field7036);
                    OpenGL.glTexCoord2f((float) this.field7029, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7029, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
                var5.method1657(var8, 0);
            }
        }
        this.field7020 = false;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method2825(int arg0) {
        field7026 = null;
        field7041 = null;
        field7039 = null;
        field7021 = null;
        field7019 = null;
        field7035 = null;
        if (arg0 != 0) {
            field7039 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILco;)V")
    public final void method2826(int arg0, class271 arg1) {
        arg1.field3448 = false;
        int var3 = 126 / ((arg0 - 66) / 34);
        field7038++;
        arg1.method1655(11857);
        arg1.method589(-8880);
        this.method2828(0);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)Z")
    private final boolean method2827(boolean arg0) {
        field7018++;
        if (this.field7044) {
            if (this.field7043 != null) {
                this.field7043.method3367(-98);
                this.field7043 = null;
            }
            if (this.field7047 != null) {
                this.field7047.method811(1);
                this.field7047 = null;
            }
            if (this.field7028 != null) {
                this.field7043 = new class584(this.field7024, 6402, this.field7029, this.field7036, this.field7024.field4188);
            }
            if (this.field7050) {
                this.field7047 = new class495(this.field7024, 34037, 6402, this.field7029, this.field7036);
            } else if (this.field7043 == null) {
                this.field7043 = new class584(this.field7024, 6402, this.field7029, this.field7036);
            }
            this.field7046 = true;
            this.field7049 = true;
            this.field7044 = false;
        }
        if (this.field7048) {
            if (this.field7045 != null) {
                this.field7045.method3367(-113);
                this.field7045 = null;
            }
            if (this.field7042[0] != null) {
                this.field7042[0].method811(1);
                this.field7042[0] = null;
            }
            if (this.field7042[1] != null) {
                this.field7042[1].method811(1);
                this.field7042[1] = null;
            }
            if (this.field7028 != null) {
                this.field7045 = new class584(this.field7024, this.field7051, this.field7029, this.field7036, this.field7024.field4188);
            }
            this.field7042[0] = new class495(this.field7024, 34037, this.field7051, this.field7029, this.field7036);
            this.field7042[1] = this.field7052 <= 1 ? null : new class495(this.field7024, 34037, this.field7051, this.field7029, this.field7036);
            this.field7046 = true;
            this.field7048 = false;
            this.field7049 = true;
        }
        if (!arg0) {
            this.method2826(-46, null);
        }
        if (this.field7049) {
            if (this.field7028 == null) {
                this.field7024.method1918(this.field7040, 117);
                this.field7040.method2022(false, 0);
                this.field7040.method2022(false, 1);
                this.field7040.method2022(false, 8);
                this.field7040.method2018(this.field7042[0], 0, 0);
                if (this.field7052 > 1) {
                    this.field7040.method2018(this.field7042[1], 0, 1);
                }
                if (this.field7050) {
                    this.field7040.method2018(this.field7047, 0, 8);
                } else {
                    this.field7040.method2017(8, this.field7043, -109);
                }
                this.field7024.method1917((byte) -118, this.field7040);
            } else {
                this.field7024.method1918(this.field7040, 120);
                this.field7040.method2022(!arg0, 0);
                this.field7040.method2022(!arg0, 1);
                this.field7040.method2022(false, 8);
                this.field7040.method2018(this.field7042[0], 0, 0);
                if (this.field7052 > 1) {
                    this.field7040.method2018(this.field7042[1], 0, 1);
                }
                if (this.field7050) {
                    this.field7040.method2018(this.field7047, 0, 8);
                }
                this.field7024.method1917((byte) 66, this.field7040);
                this.field7024.method1918(this.field7028, 117);
                this.field7028.method2022(false, 0);
                this.field7028.method2022(false, 8);
                this.field7028.method2017(0, this.field7045, 97);
                this.field7028.method2017(8, this.field7043, 58);
                this.field7024.method1917((byte) -105, this.field7028);
            }
            this.field7046 = true;
            this.field7049 = false;
        }
        if (this.field7046) {
            this.field7024.method1918(this.field7033, 117);
            this.field7046 = !this.field7033.method2020(-111);
            this.field7024.method1917((byte) 82, this.field7033);
        }
        return !this.field7046;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    private final void method2828(int arg0) {
        field7027++;
        boolean var2 = false;
        int var3 = arg0;
        int var4 = 0;
        for (class271 var5 = (class271) this.field7025.method3188((byte) -100); var5 != null; var5 = (class271) this.field7025.method3182((byte) -68)) {
            int var9 = var5.method1661(-17472);
            var4 += var5.method1659((byte) -126);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method1665(121);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field7051 != var6) {
            this.field7048 = true;
            this.field7051 = var6;
        }
        int var7 = this.field7052 > 2 ? 2 : this.field7052;
        int var8 = var4 > 2 ? 2 : var4;
        if (var7 != var8) {
            this.field7049 = this.field7048 = true;
        }
        if (var2 != this.field7050) {
            this.field7044 = true;
            this.field7050 = var2;
        }
        this.field7052 = var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lco;I)Z")
    public final boolean method2829(class271 arg0, int arg1) {
        field7034++;
        if (this.field7033 != null) {
            if (arg0.method1664(false) || arg0.method1662(arg1 + 16558)) {
                this.field7025.method3181(arg0, true);
                this.method2828(arg1 + 16451);
                if (this.method2827(true)) {
                    if (this.field7029 != -1 && this.field7036 != -1) {
                        arg0.method1660(this.field7029, -68, this.field7036);
                    }
                    arg0.field3448 = true;
                    return true;
                }
            }
            this.method2826(112, arg0);
        }
        if (arg1 != -16451) {
            this.method2830(-16);
        }
        return false;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Z")
    public final boolean method2830(int arg0) {
        field7031++;
        if (arg0 != 0) {
            this.method2828(35);
        }
        return this.field7033 != null;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Luq;)V")
    public class505(class313 arg0) {
        this.field7024 = arg0;
        if (this.field7024.field4336 && this.field7024.field4243) {
            this.field7033 = this.field7040 = new class327(this.field7024);
            if (this.field7024.field4188 > 1 && this.field7024.field4341 && this.field7024.field4288) {
                this.field7033 = this.field7028 = new class327(this.field7024);
                return;
            }
        }
    }

    static {
        new class321("", 73);
        field7041 = new class577();
    }
}
