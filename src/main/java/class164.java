import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class164 {

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    private int field2498 = 0;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    private int field2497 = 0;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    private int field2499 = 1;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    private int field2511 = 1;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Lmg;")
    private class530 field2513 = new class530();

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "Z")
    private boolean field2521 = true;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "[Lbd;")
    private class142[] field2518 = new class142[2];

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    private int field2516 = -1;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "Z")
    private boolean field2519 = true;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "Z")
    private boolean field2520 = false;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "Z")
    private boolean field2517 = true;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    private int field2524 = 0;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "Z")
    private boolean field2523 = true;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Lpg;")
    private class333 field2505;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Leb;")
    private class60 field2496;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Leb;")
    private class60 field2500;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Leb;")
    private class60 field2503;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[I")
    public static int[] field2495 = new int[5];

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "Lbd;")
    private class142 field2522;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Lrc;")
    private class22 field2514;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Lrc;")
    private class22 field2515;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Z")
    private boolean field2510;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLft;)Z", line = 5)
    public final boolean method1144(boolean arg0, class426 arg1) {
        field2502++;
        if (this.field2500 != null) {
            if (arg1.method627(1) || arg1.method630((byte) -47)) {
                this.field2513.method3139(0, arg1);
                this.method1152((byte) 67);
                if (this.method1149(false)) {
                    if (this.field2499 != -1 && this.field2511 != -1) {
                        arg1.method622(true, this.field2499, this.field2511);
                    }
                    arg1.field6199 = true;
                    return true;
                }
            }
            this.method1151(arg1, (byte) -110);
        }
        if (arg0) {
            this.field2510 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)Z", line = 41)
    public final boolean method1145(boolean arg0) {
        field2507++;
        if (arg0) {
            this.field2503 = null;
        }
        return this.field2500 != null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)Z", line = 54)
    public final boolean method1146(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2506++;
        if (this.field2500 == null || this.field2513.method3135(arg2 ^ 0xFFFFB5A7)) {
            return false;
        }
        if (arg2 != 0) {
            this.field2513 = null;
        }
        if (this.field2499 != arg3 || this.field2511 != arg1) {
            this.field2511 = arg1;
            this.field2499 = arg3;
            for (class476 var6 = this.field2513.method3137(0); var6 != this.field2513.field7789; var6 = var6.field6884) {
                ((class426) var6).method622(true, this.field2499, this.field2511);
            }
            this.field2523 = true;
            this.field2517 = true;
            this.field2521 = true;
        }
        if (!this.method1149(false)) {
            return false;
        }
        this.field2498 = arg0;
        this.field2510 = true;
        this.field2497 = arg4;
        this.field2505.method2001(this.field2500, 67);
        this.field2500.method388(-127, 0);
        this.field2505.method2017(768, -this.field2498, this.field2511 + (-this.field2500.method392(-117) - this.field2497));
        return true;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 101)
    public static void method1147(byte arg0) {
        if (arg0 > -15) {
            method1147((byte) 102);
        }
        field2495 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 115)
    public final void method1148(int arg0) {
        field2509++;
        if (!this.field2510) {
            return;
        }
        if (this.field2503 != null) {
            this.field2505.method2009(this.field2503, (byte) 64);
            int var2 = 16384;
            this.field2505.method2034((byte) 74, this.field2496);
            this.field2503.method386(0, -29199);
            this.field2496.method388(-122, 0);
            if (this.field2520) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field2499, this.field2511, 0, 0, this.field2499, this.field2511, var2, 9728);
            this.field2505.method2012(arg0 ^ 0x2, this.field2503);
            this.field2505.method1972(this.field2496, arg0 + 16392);
        }
        this.field2505.method2032(false);
        this.field2505.method2033(0, arg0 - 1740);
        if (arg0 != -3) {
            this.method1146(90, -71, 87, 96, 72);
        }
        this.field2505.method1966(-1, 1);
        this.field2505.method477();
        int var3 = 0;
        int var4 = 1;
        class426 var6;
        for (class426 var5 = (class426) this.field2513.method3137(arg0 + 3); var5 != null; var5 = var6) {
            var6 = (class426) this.field2513.method3132(0);
            int var7 = var5.method2544(9);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method624(var8, this.field2518[var3], -128, this.field2522);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field2505.method1970(this.field2496, true);
                    this.field2505.method2017(768, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2511);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2498, this.field2497);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2498, this.field2511 + this.field2497);
                    OpenGL.glTexCoord2f((float) this.field2499, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2499 + this.field2498, this.field2511 + this.field2497);
                    OpenGL.glTexCoord2f((float) this.field2499, (float) this.field2511);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2499 + this.field2498, this.field2497);
                    OpenGL.glEnd();
                } else {
                    this.field2496.method388(-124, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2511);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field2511);
                    OpenGL.glTexCoord2f((float) this.field2499, (float) this.field2511);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2499, this.field2511);
                    OpenGL.glTexCoord2f((float) this.field2499, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2499, 0);
                    OpenGL.glEnd();
                }
                var5.method625(var8, (byte) -103);
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
            }
        }
        this.field2510 = false;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)Z", line = 224)
    private final boolean method1149(boolean arg0) {
        if (arg0) {
            this.method1151(null, (byte) 60);
        }
        if (this.field2517) {
            if (this.field2514 != null) {
                this.field2514.method140(-126);
                this.field2514 = null;
            }
            if (this.field2522 != null) {
                this.field2522.method923(-31252);
                this.field2522 = null;
            }
            if (this.field2503 != null) {
                this.field2514 = new class22(this.field2505, 6402, this.field2499, this.field2511, this.field2505.field4719);
            }
            if (this.field2520) {
                this.field2522 = new class142(this.field2505, 34037, 6402, this.field2499, this.field2511);
            } else if (this.field2514 == null) {
                this.field2514 = new class22(this.field2505, 6402, this.field2499, this.field2511);
            }
            this.field2519 = true;
            this.field2523 = true;
            this.field2517 = false;
        }
        field2508++;
        if (this.field2521) {
            if (this.field2515 != null) {
                this.field2515.method140(17);
                this.field2515 = null;
            }
            if (this.field2518[0] != null) {
                this.field2518[0].method923(-31252);
                this.field2518[0] = null;
            }
            if (this.field2518[1] != null) {
                this.field2518[1].method923(-31252);
                this.field2518[1] = null;
            }
            if (this.field2503 != null) {
                this.field2515 = new class22(this.field2505, this.field2516, this.field2499, this.field2511, this.field2505.field4719);
            }
            this.field2518[0] = new class142(this.field2505, 34037, this.field2516, this.field2499, this.field2511);
            this.field2518[1] = this.field2524 <= 1 ? null : new class142(this.field2505, 34037, this.field2516, this.field2499, this.field2511);
            this.field2519 = true;
            this.field2521 = false;
            this.field2523 = true;
        }
        if (this.field2523) {
            if (this.field2503 == null) {
                this.field2505.method2001(this.field2496, 111);
                this.field2496.method397(0, (byte) -81);
                this.field2496.method397(1, (byte) -81);
                this.field2496.method397(8, (byte) -81);
                this.field2496.method405(-88, 0, this.field2518[0]);
                if (this.field2524 > 1) {
                    this.field2496.method405(-87, 1, this.field2518[1]);
                }
                if (this.field2520) {
                    this.field2496.method405(-105, 8, this.field2522);
                } else {
                    this.field2496.method387(this.field2514, (byte) 118, 8);
                }
                this.field2505.method1970(this.field2496, true);
            } else {
                this.field2505.method2001(this.field2496, 121);
                this.field2496.method397(0, (byte) -81);
                this.field2496.method397(1, (byte) -81);
                this.field2496.method397(8, (byte) -81);
                this.field2496.method405(-76, 0, this.field2518[0]);
                if (this.field2524 > 1) {
                    this.field2496.method405(-118, 1, this.field2518[1]);
                }
                if (this.field2520) {
                    this.field2496.method405(-89, 8, this.field2522);
                }
                this.field2505.method1970(this.field2496, !arg0);
                this.field2505.method2001(this.field2503, 69);
                this.field2503.method397(0, (byte) -81);
                this.field2503.method397(8, (byte) -81);
                this.field2503.method387(this.field2515, (byte) 122, 0);
                this.field2503.method387(this.field2514, (byte) 113, 8);
                this.field2505.method1970(this.field2503, true);
            }
            this.field2519 = true;
            this.field2523 = false;
        }
        if (this.field2519) {
            this.field2505.method2001(this.field2500, 66);
            this.field2519 = !this.field2500.method401(-1);
            this.field2505.method1970(this.field2500, true);
        }
        return !this.field2519;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lat;I)Z", line = 353)
    public static final boolean method1150(class444 arg0, int arg1) {
        if (arg1 != 0) {
            method1147((byte) 62);
        }
        field2493++;
        if (class475.field6878 == arg0.field6384) {
            class492.field7133 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lft;B)V", line = 374)
    public final void method1151(class426 arg0, byte arg1) {
        if (arg1 > -71) {
            this.method1146(-56, 27, -37, 19, 106);
        }
        arg0.field6199 = false;
        field2501++;
        arg0.method621(1);
        arg0.method2791((byte) 112);
        this.method1152((byte) 1);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lpg;)V", line = 538)
    public class164(class333 arg0) {
        this.field2505 = arg0;
        if (this.field2505.field4773 && this.field2505.field4803) {
            this.field2500 = this.field2496 = new class60(this.field2505);
            if (this.field2505.field4719 > 1 && this.field2505.field4775 && this.field2505.field4815) {
                this.field2500 = this.field2503 = new class60(this.field2505);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V", line = 403)
    private final void method1152(byte arg0) {
        field2512++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = -10 / ((-arg0 - 51) / 40);
        int var5 = 0;
        for (class426 var6 = (class426) this.field2513.method3137(0); var6 != null; var6 = (class426) this.field2513.method3132(0)) {
            int var10 = var6.method626((byte) -2);
            if (var10 > var3) {
                var3 = var10;
            }
            var5 += var6.method2544(9);
            var2 |= var6.method2543((byte) -126);
        }
        int var7;
        if (var3 == 2) {
            var7 = 34836;
        } else if (var3 == 1) {
            var7 = 34842;
        } else {
            var7 = 6408;
        }
        if (this.field2516 != var7) {
            this.field2516 = var7;
            this.field2521 = true;
        }
        int var8 = this.field2524 > 2 ? 2 : this.field2524;
        int var9 = var5 <= 2 ? var5 : 2;
        if (this.field2520 != var2) {
            this.field2520 = var2;
            this.field2517 = true;
        }
        if (var8 != var9) {
            this.field2523 = this.field2521 = true;
        }
        this.field2524 = var5;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 470)
    public final void method1153(int arg0) {
        this.field2518 = null;
        this.field2500 = this.field2503 = this.field2496 = null;
        this.field2515 = null;
        field2494++;
        this.field2514 = null;
        if (arg0 > -16) {
            method1150(null, 111);
        }
        this.field2522 = null;
        if (!this.field2513.method3135(-19033)) {
            for (class476 var2 = this.field2513.method3137(0); var2 != this.field2513.field7789; var2 = var2.field6884) {
                ((class426) var2).method621(1);
            }
        }
        this.field2499 = this.field2511 = 1;
    }
}
