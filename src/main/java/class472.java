import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class472 {

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    private int field6455 = 0;

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "I")
    private int field6462 = 1;

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "I")
    private int field6458 = 1;

    @OriginalMember(owner = "client!vaa", name = "w", descriptor = "I")
    private int field6474 = 0;

    @OriginalMember(owner = "client!vaa", name = "v", descriptor = "Lro;")
    private class2 field6473 = new class2();

    @OriginalMember(owner = "client!vaa", name = "y", descriptor = "Z")
    private boolean field6476 = true;

    @OriginalMember(owner = "client!vaa", name = "B", descriptor = "Z")
    private boolean field6479 = true;

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "I")
    private int field6477 = 0;

    @OriginalMember(owner = "client!vaa", name = "E", descriptor = "I")
    private int field6482 = -1;

    @OriginalMember(owner = "client!vaa", name = "F", descriptor = "Z")
    private boolean field6483 = true;

    @OriginalMember(owner = "client!vaa", name = "G", descriptor = "Z")
    private boolean field6484 = false;

    @OriginalMember(owner = "client!vaa", name = "A", descriptor = "Z")
    private boolean field6478 = true;

    @OriginalMember(owner = "client!vaa", name = "H", descriptor = "[Lsia;")
    private class737[] field6485 = new class737[2];

    @OriginalMember(owner = "client!vaa", name = "n", descriptor = "Lrda;")
    private class663 field6465;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "Lnh;")
    private class749 field6457;

    @OriginalMember(owner = "client!vaa", name = "q", descriptor = "Lnh;")
    private class749 field6468;

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "Lnh;")
    private class749 field6459;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "[C")
    public static char[] field6452 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!vaa", name = "r", descriptor = "Lqr;")
    public static class65 field6469 = new class65(8);

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!vaa", name = "l", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!vaa", name = "m", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!vaa", name = "p", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!vaa", name = "t", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!vaa", name = "u", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!vaa", name = "x", descriptor = "Lfha;")
    public static class383 field6475;

    @OriginalMember(owner = "client!vaa", name = "C", descriptor = "Ldw;")
    private class719 field6480;

    @OriginalMember(owner = "client!vaa", name = "D", descriptor = "Ldw;")
    private class719 field6481;

    @OriginalMember(owner = "client!vaa", name = "I", descriptor = "Lsia;")
    private class737 field6486;

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "Z")
    private boolean field6460;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "[Lqo;")
    public static class21[] field6456;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "([J[Ljava/lang/Object;Z)V", line = 5)
    public static final void method2655(long[] arg0, Object[] arg1, boolean arg2) {
        class490.method2777(arg1, 0, arg0, arg0.length - 1, (byte) -115);
        if (arg2) {
            field6475 = null;
        }
        field6471++;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIII)Z", line = 18)
    public final boolean method2656(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6467++;
        if (arg3 != 26185) {
            this.method2662(true);
        }
        if (this.field6468 == null || this.field6473.method17(false)) {
            return false;
        }
        if (this.field6458 != arg4 || this.field6462 != arg0) {
            this.field6458 = arg4;
            this.field6462 = arg0;
            for (class656 var6 = this.field6473.method21(2); var6 != this.field6473.field24; var6 = var6.field8677) {
                ((class156) var6).method714(this.field6462, this.field6458, 2048);
            }
            this.field6483 = true;
            this.field6476 = true;
            this.field6478 = true;
        }
        if (!this.method2657((byte) -114)) {
            return false;
        }
        this.field6460 = true;
        this.field6474 = arg2;
        this.field6455 = arg1;
        this.field6465.method3623(this.field6468, arg3 - 26185);
        this.field6468.method4201(0, false);
        this.field6465.method3600((byte) -32, -this.field6455, this.field6462 + this.field6474 - this.field6465.field8746);
        return true;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)Z", line = 67)
    private final boolean method2657(byte arg0) {
        field6453++;
        if (this.field6483) {
            if (this.field6481 != null) {
                this.field6481.method4031(arg0 ^ 0xFFFFFFCE);
                this.field6481 = null;
            }
            if (this.field6486 != null) {
                this.field6486.method2618(125);
                this.field6486 = null;
            }
            if (this.field6459 != null) {
                this.field6481 = new class719(this.field6465, 6402, this.field6458, this.field6462, this.field6465.field8926);
            }
            if (this.field6484) {
                this.field6486 = new class737(this.field6465, 34037, 6402, this.field6458, this.field6462);
            } else if (this.field6481 == null) {
                this.field6481 = new class719(this.field6465, 6402, this.field6458, this.field6462);
            }
            this.field6483 = false;
            this.field6479 = true;
            this.field6476 = true;
        }
        if (this.field6478) {
            if (this.field6480 != null) {
                this.field6480.method4031(arg0 + 225);
                this.field6480 = null;
            }
            if (this.field6485[0] != null) {
                this.field6485[0].method2618(106);
                this.field6485[0] = null;
            }
            if (this.field6485[1] != null) {
                this.field6485[1].method2618(97);
                this.field6485[1] = null;
            }
            if (this.field6459 != null) {
                this.field6480 = new class719(this.field6465, this.field6482, this.field6458, this.field6462, this.field6465.field8926);
            }
            this.field6485[0] = new class737(this.field6465, 34037, this.field6482, this.field6458, this.field6462);
            this.field6485[1] = this.field6477 > 1 ? new class737(this.field6465, 34037, this.field6482, this.field6458, this.field6462) : null;
            this.field6478 = false;
            this.field6476 = true;
            this.field6479 = true;
        }
        if (arg0 != -114) {
            this.field6462 = 123;
        }
        if (this.field6476) {
            if (this.field6459 == null) {
                this.field6465.method3623(this.field6457, arg0 + 114);
                this.field6457.method4200(1, 0);
                this.field6457.method4200(1, 1);
                this.field6457.method4200(1, 8);
                this.field6457.method4195(-22433, 0, this.field6485[0]);
                if (this.field6477 > 1) {
                    this.field6457.method4195(-22433, 1, this.field6485[1]);
                }
                if (this.field6484) {
                    this.field6457.method4195(-22433, 8, this.field6486);
                } else {
                    this.field6457.method4194(this.field6481, 15061, 8);
                }
                this.field6465.method3637(this.field6457, -111);
            } else {
                this.field6465.method3623(this.field6457, arg0 ^ 0xFFFFFF8E);
                this.field6457.method4200(1, 0);
                this.field6457.method4200(1, 1);
                this.field6457.method4200(arg0 + 115, 8);
                this.field6457.method4195(-22433, 0, this.field6485[0]);
                if (this.field6477 > 1) {
                    this.field6457.method4195(-22433, 1, this.field6485[1]);
                }
                if (this.field6484) {
                    this.field6457.method4195(-22433, 8, this.field6486);
                }
                this.field6465.method3637(this.field6457, -106);
                this.field6465.method3623(this.field6459, 0);
                this.field6459.method4200(1, 0);
                this.field6459.method4200(1, 8);
                this.field6459.method4194(this.field6480, 15061, 0);
                this.field6459.method4194(this.field6481, 15061, 8);
                this.field6465.method3637(this.field6459, 21);
            }
            this.field6479 = true;
            this.field6476 = false;
        }
        if (this.field6479) {
            this.field6465.method3623(this.field6468, 0);
            this.field6479 = !this.field6468.method4187(arg0 ^ 0xFFFFFFDC);
            this.field6465.method3637(this.field6468, -123);
        }
        return !this.field6479;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 197)
    public final void method2658(int arg0) {
        field6464++;
        if (!this.field6460) {
            return;
        }
        if (this.field6459 != null) {
            this.field6465.method3633(20133, this.field6459);
            int var2 = 16384;
            this.field6465.method3615(this.field6457, 14908);
            this.field6459.method4192(0, 39);
            this.field6457.method4201(0, false);
            if (this.field6484) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field6458, this.field6462, 0, 0, this.field6458, this.field6462, var2, 9728);
            this.field6465.method3610(this.field6459, -90);
            this.field6465.method3656(this.field6457, 125);
        }
        this.field6465.method3614(118);
        this.field6465.method3635(0, 0);
        this.field6465.method3631((byte) 125, 1);
        this.field6465.method435();
        if (arg0 > -8) {
            this.field6460 = false;
        }
        int var3 = 0;
        int var4 = 1;
        class156 var6;
        for (class156 var5 = (class156) this.field6473.method21(2); var5 != null; var5 = var6) {
            var6 = (class156) this.field6473.method9(-128);
            int var7 = var5.method1136(-11);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method709(this.field6485[var3], this.field6486, -12103, var8);
                if (var6 == null && var7 - 1 == var8) {
                    this.field6465.method3637(this.field6457, -104);
                    this.field6465.method3600((byte) -32, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6462);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6455, this.field6474);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6455, this.field6474 + this.field6462);
                    OpenGL.glTexCoord2f((float) this.field6458, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6458 + this.field6455, this.field6474 + this.field6462);
                    OpenGL.glTexCoord2f((float) this.field6458, (float) this.field6462);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6458 + this.field6455, this.field6474);
                    OpenGL.glEnd();
                } else {
                    this.field6457.method4201(var4, false);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6462);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field6462);
                    OpenGL.glTexCoord2f((float) this.field6458, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6458, this.field6462);
                    OpenGL.glTexCoord2f((float) this.field6458, (float) this.field6462);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6458, 0);
                    OpenGL.glEnd();
                }
                var5.method715(var8, true);
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field6460 = false;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IBI)Z", line = 301)
    public static final boolean method2659(int arg0, byte arg1, int arg2) {
        field6470++;
        if (arg1 != -111) {
            method2659(-39, (byte) 42, -2);
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        class100 var3 = class462.field6333.method2008((byte) -59, arg2);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method739((byte) 85, arg0);
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V", line = 324)
    public static void method2660(int arg0) {
        field6452 = null;
        field6475 = null;
        if (arg0 == 209) {
            field6469 = null;
            field6456 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)Z", line = 340)
    public final boolean method2661(byte arg0) {
        if (arg0 != -127) {
            this.method2663(false, null);
        }
        field6466++;
        return this.field6468 != null;
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lrda;)V", line = 557)
    public class472(class663 arg0) {
        this.field6465 = arg0;
        if (this.field6465.field8985 && this.field6465.field8986) {
            this.field6468 = this.field6457 = new class749(this.field6465);
            if (this.field6465.field8926 > 1 && this.field6465.field9001 && this.field6465.field9064) {
                this.field6468 = this.field6459 = new class749(this.field6465);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)V", line = 360)
    private final void method2662(boolean arg0) {
        field6472++;
        boolean var2 = arg0;
        int var3 = 0;
        int var4 = 0;
        for (class156 var5 = (class156) this.field6473.method21(2); var5 != null; var5 = (class156) this.field6473.method9(-128)) {
            int var9 = var5.method712((byte) 30);
            if (var3 < var9) {
                var3 = var9;
            }
            var4 += var5.method1136(127);
            var2 |= var5.method1132(0);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field6482 != var6) {
            this.field6482 = var6;
            this.field6478 = true;
        }
        int var7 = this.field6477 > 2 ? 2 : this.field6477;
        int var8 = var4 > 2 ? 2 : var4;
        if (var7 != var8) {
            this.field6476 = this.field6478 = true;
        }
        this.field6477 = var4;
        if (this.field6484 != var2) {
            this.field6483 = true;
            this.field6484 = var2;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZLfaa;)V", line = 425)
    public final void method2663(boolean arg0, class156 arg1) {
        arg1.field2379 = false;
        field6463++;
        arg1.method717(false);
        arg1.method3564(arg0);
        this.method2662(false);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLfaa;)Z", line = 438)
    public final boolean method2664(byte arg0, class156 arg1) {
        field6461++;
        if (this.field6468 != null) {
            if (arg1.method711(true) || arg1.method713(1)) {
                this.field6473.method11(arg1, -127);
                this.method2662(false);
                if (this.method2657((byte) -114)) {
                    if (this.field6458 != -1 && this.field6462 != -1) {
                        arg1.method714(this.field6462, this.field6458, 2048);
                    }
                    arg1.field2379 = true;
                    return true;
                }
            }
            this.method2663(true, arg1);
        }
        return arg0 <= 64 ? false : false;
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V", line = 479)
    public final void method2665(int arg0) {
        this.field6480 = null;
        this.field6481 = null;
        this.field6485 = null;
        this.field6468 = this.field6459 = this.field6457 = null;
        field6454++;
        this.field6486 = null;
        if (!this.field6473.method17(false)) {
            for (class656 var2 = this.field6473.method21(2); var2 != this.field6473.field24; var2 = var2.field8677) {
                ((class156) var2).method717(false);
            }
        }
        if (arg0 != 235) {
            this.method2664((byte) 74, null);
        }
        this.field6458 = this.field6462 = 1;
    }
}
