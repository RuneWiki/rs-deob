import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class5 {

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    private int field40 = 1;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    private int field51 = 0;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    private int field37 = 1;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    private int field53 = 0;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "Ltg;")
    private class605 field48 = new class605();

    @OriginalMember(owner = "client!di", name = "x", descriptor = "Z")
    private boolean field57 = true;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "[Lwo;")
    private class692[] field55 = new class692[2];

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    private int field56 = -1;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "Z")
    private boolean field58 = true;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "Z")
    private boolean field63 = false;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "Z")
    private boolean field60 = true;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    private int field64 = 0;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "Z")
    private boolean field65 = true;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Lrs;")
    private class166 field34;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lju;")
    private class98 field42;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Lju;")
    private class98 field52;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Lju;")
    private class98 field46;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Ltm;")
    public static class334 field35 = new class334(51, -2);

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "Lqca;")
    private class314 field59;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "Lqca;")
    private class314 field62;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "Lwo;")
    private class692 field61;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Z")
    private boolean field47;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 4)
    private final void method19(int arg0) {
        field49++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class171 var5 = (class171) this.field48.method3463((byte) -50); var5 != null; var5 = (class171) this.field48.method3469((byte) 107)) {
            int var9 = var5.method1187((byte) 121);
            if (var3 < var9) {
                var3 = var9;
            }
            var4 += var5.method1354((byte) 119);
            var2 |= var5.method1357(arg0 ^ 0x100);
        }
        if (arg0 != 256) {
            this.method24(-109);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field56 != var6) {
            this.field60 = true;
            this.field56 = var6;
        }
        int var7 = this.field64 > 2 ? 2 : this.field64;
        int var8 = var4 <= 2 ? var4 : 2;
        this.field64 = var4;
        if (var2 != this.field63) {
            this.field63 = var2;
            this.field57 = true;
        }
        if (var7 != var8) {
            this.field58 = this.field60 = true;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V", line = 68)
    public final void method20(int arg0) {
        this.field55 = null;
        this.field52 = this.field46 = this.field42 = null;
        field44++;
        this.field59 = null;
        this.field62 = null;
        this.field61 = null;
        if (!this.field48.method3473(false)) {
            for (class65 var2 = this.field48.method3463((byte) -50); var2 != this.field48.field8547; var2 = var2.field1044) {
                ((class171) var2).method1182((byte) -40);
            }
        }
        this.field40 = this.field37 = arg0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BIILjava/lang/String;)I", line = 97)
    public static final int method21(byte[] arg0, int arg1, int arg2, String arg3) {
        field41++;
        int var4 = arg2;
        int var5 = arg3.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class544.method3192(arg3.charAt(var6), -121);
            int var8 = var6 + 1 < var5 ? class544.method3192(arg3.charAt(var6 + 1), arg1 ^ 0x449034A4) : -1;
            int var9 = (var6 + 2) >= var5 ? -1 : class544.method3192(arg3.charAt(var6 + 2), -121);
            int var10 = var5 > (var6 + 3) ? class544.method3192(arg3.charAt(var6 + 3), -123) : -1;
            arg0[arg2++] = (byte) class112.method903(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class112.method903(class636.method3603(var8, 15) << 4, var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class112.method903(var10, class636.method3603(var9, 3) << 6);
        }
        if (arg1 != -1150301404) {
            method21(null, 48, 25, null);
        }
        return arg2 - var4;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V", line = 147)
    public static void method22(int arg0) {
        field35 = null;
        if (arg0 > -89) {
            field35 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Z", line = 157)
    private final boolean method23(byte arg0) {
        field54++;
        if (this.field57) {
            if (this.field59 != null) {
                this.field59.method2065(-1);
                this.field59 = null;
            }
            if (this.field61 != null) {
                this.field61.method2965((byte) -40);
                this.field61 = null;
            }
            if (this.field46 != null) {
                this.field59 = new class314(this.field34, 6402, this.field40, this.field37, this.field34.field2746);
            }
            if (this.field63) {
                this.field61 = new class692(this.field34, 34037, 6402, this.field40, this.field37);
            } else if (this.field59 == null) {
                this.field59 = new class314(this.field34, 6402, this.field40, this.field37);
            }
            this.field58 = true;
            this.field57 = false;
            this.field65 = true;
        }
        if (this.field60) {
            if (this.field62 != null) {
                this.field62.method2065(-1);
                this.field62 = null;
            }
            if (this.field55[0] != null) {
                this.field55[0].method2965((byte) -40);
                this.field55[0] = null;
            }
            if (this.field55[1] != null) {
                this.field55[1].method2965((byte) -40);
                this.field55[1] = null;
            }
            if (this.field46 != null) {
                this.field62 = new class314(this.field34, this.field56, this.field40, this.field37, this.field34.field2746);
            }
            this.field55[0] = new class692(this.field34, 34037, this.field56, this.field40, this.field37);
            this.field55[1] = this.field64 <= 1 ? null : new class692(this.field34, 34037, this.field56, this.field40, this.field37);
            this.field65 = true;
            this.field58 = true;
            this.field60 = false;
        }
        if (arg0 > -68) {
            return true;
        }
        if (this.field58) {
            if (this.field46 == null) {
                this.field34.method1322(this.field42, (byte) -86);
                this.field42.method813((byte) -88, 0);
                this.field42.method813((byte) -110, 1);
                this.field42.method813((byte) -97, 8);
                this.field42.method814(this.field55[0], true, 0);
                if (this.field64 > 1) {
                    this.field42.method814(this.field55[1], true, 1);
                }
                if (this.field63) {
                    this.field42.method814(this.field61, true, 8);
                } else {
                    this.field42.method805(8, this.field59, 1);
                }
                this.field34.method1293(0, this.field42);
            } else {
                this.field34.method1322(this.field42, (byte) -86);
                this.field42.method813((byte) 54, 0);
                this.field42.method813((byte) 4, 1);
                this.field42.method813((byte) 92, 8);
                this.field42.method814(this.field55[0], true, 0);
                if (this.field64 > 1) {
                    this.field42.method814(this.field55[1], true, 1);
                }
                if (this.field63) {
                    this.field42.method814(this.field61, true, 8);
                }
                this.field34.method1293(0, this.field42);
                this.field34.method1322(this.field46, (byte) -86);
                this.field46.method813((byte) 79, 0);
                this.field46.method813((byte) -100, 8);
                this.field46.method805(0, this.field62, 1);
                this.field46.method805(8, this.field59, 1);
                this.field34.method1293(0, this.field46);
            }
            this.field65 = true;
            this.field58 = false;
        }
        if (this.field65) {
            this.field34.method1322(this.field52, (byte) -86);
            this.field65 = !this.field52.method812((byte) -111);
            this.field34.method1293(0, this.field52);
        }
        return !this.field65;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V", line = 286)
    public final void method24(int arg0) {
        int var2 = -60 / ((-arg0 - 3) / 58);
        field50++;
        if (!this.field47) {
            return;
        }
        if (this.field46 != null) {
            int var3 = 16384;
            this.field34.method1335(6914, this.field46);
            this.field34.method1286((byte) -91, this.field42);
            this.field46.method806(0, 105);
            this.field42.method809(0, -71);
            if (this.field63) {
                var3 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field40, this.field37, 0, 0, this.field40, this.field37, var3, 9728);
            this.field34.method1326(79, this.field46);
            this.field34.method1251((byte) -127, this.field42);
        }
        this.field34.method1299((byte) -89);
        this.field34.method1320(0, false);
        this.field34.method1334(0, 1);
        this.field34.method374();
        int var4 = 0;
        int var5 = 1;
        class171 var7;
        for (class171 var6 = (class171) this.field48.method3463((byte) -50); var6 != null; var6 = var7) {
            var7 = (class171) this.field48.method3469((byte) 107);
            int var8 = var6.method1354((byte) 126);
            for (int var9 = 0; var9 < var8; var9++) {
                var6.method1181(1, var9, this.field55[var4], this.field61);
                if (var7 == null && (var8 - 1) == var9) {
                    this.field34.method1293(0, this.field42);
                    this.field34.method1317(0, 0, (byte) 39);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field37);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field51, this.field53);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field51, this.field53 + this.field37);
                    OpenGL.glTexCoord2f((float) this.field40, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field51 + this.field40, this.field53 + this.field37);
                    OpenGL.glTexCoord2f((float) this.field40, (float) this.field37);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field51 + this.field40, this.field53);
                    OpenGL.glEnd();
                } else {
                    this.field42.method809(var5, -120);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field37);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field37);
                    OpenGL.glTexCoord2f((float) this.field40, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field40, this.field37);
                    OpenGL.glTexCoord2f((float) this.field40, (float) this.field37);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field40, 0);
                    OpenGL.glEnd();
                }
                var6.method1186(1, var9);
                var5 = var5 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field47 = false;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lrs;)V", line = 556)
    public class5(class166 arg0) {
        this.field34 = arg0;
        if (this.field34.field2805 && this.field34.field2824) {
            this.field52 = this.field42 = new class98(this.field34);
            if (this.field34.field2746 > 1 && this.field34.field2825 && this.field34.field2810) {
                this.field52 = this.field46 = new class98(this.field34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILvl;)Z", line = 396)
    public final boolean method25(int arg0, class171 arg1) {
        field36++;
        if (arg0 != 1) {
            return false;
        }
        if (this.field52 != null) {
            if (arg1.method1184(-257) || arg1.method1185((byte) 121)) {
                this.field48.method3472(117, arg1);
                this.method19(256);
                if (this.method23((byte) -100)) {
                    if (this.field40 != -1 && this.field37 != -1) {
                        arg1.method1189(this.field40, this.field37, arg0);
                    }
                    arg1.field2938 = true;
                    return true;
                }
            }
            this.method26(arg1, -111);
        }
        return false;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lvl;I)V", line = 444)
    public final void method26(class171 arg0, int arg1) {
        arg0.field2938 = false;
        field38++;
        int var3 = -22 % ((arg1 + 43) / 57);
        arg0.method1182((byte) -89);
        arg0.method636((byte) 97);
        this.method19(256);
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)Z", line = 460)
    public final boolean method27(int arg0) {
        field43++;
        if (arg0 > -116) {
            method21(null, -120, 46, null);
        }
        return this.field52 != null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIII)Z", line = 474)
    public final boolean method28(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field39++;
        if (this.field52 == null || this.field48.method3473(false)) {
            return false;
        }
        if (arg1 != -7983) {
            this.method25(-69, null);
        }
        if (this.field40 != arg4 || this.field37 != arg0) {
            this.field40 = arg4;
            this.field37 = arg0;
            for (class65 var6 = this.field48.method3463((byte) -50); var6 != this.field48.field8547; var6 = var6.field1044) {
                ((class171) var6).method1189(this.field40, this.field37, 1);
            }
            this.field58 = true;
            this.field60 = true;
            this.field57 = true;
        }
        if (!this.method23((byte) -85)) {
            return false;
        }
        this.field47 = true;
        this.field53 = arg2;
        this.field51 = arg3;
        this.field34.method1322(this.field52, (byte) -86);
        this.field52.method809(0, -66);
        this.field34.method1317(-this.field51, this.field37 + this.field53 - this.field34.field2697, (byte) 39);
        return true;
    }
}
