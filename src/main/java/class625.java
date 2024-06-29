import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class625 {

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    private int field9021 = 0;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    private int field9016 = 1;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    private int field9028 = 1;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    private int field9024 = 0;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "Leea;")
    private class114 field9022 = new class114();

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "[Lcs;")
    private class289[] field9033 = new class289[2];

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "Z")
    private boolean field9035 = false;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "Z")
    private boolean field9034 = true;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "Z")
    private boolean field9037 = true;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "Z")
    private boolean field9040 = true;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "Z")
    private boolean field9038 = true;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    private int field9041 = -1;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    private int field9044 = 0;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "Lad;")
    private class362 field9019;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "Ljaa;")
    private class535 field9026;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Ljaa;")
    private class535 field9013;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "Ljaa;")
    private class535 field9030;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "Lea;")
    public static class474 field9029 = new class474("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "[Z")
    public static boolean[] field9032 = new boolean[8];

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "Lcs;")
    private class289 field9039;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "Lpg;")
    private class635 field9036;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "Lpg;")
    private class635 field9042;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Z")
    private boolean field9014;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public final void method3579(int arg0) {
        this.field9013 = this.field9030 = this.field9026 = null;
        this.field9036 = null;
        field9018++;
        this.field9033 = null;
        this.field9039 = null;
        this.field9042 = null;
        if (!this.field9022.method715(true)) {
            for (class324 var2 = this.field9022.method719(false); var2 != this.field9022.field1413; var2 = var2.field4681) {
                ((class141) var2).method845((byte) 114);
            }
        }
        this.field9028 = this.field9016 = arg0;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Laq;B)V")
    public final void method3580(class141 arg0, byte arg1) {
        field9023++;
        arg0.field1733 = false;
        arg0.method845((byte) -69);
        if (arg1 != -99) {
            this.method3585(false);
        }
        arg0.method2108(true);
        this.method3585(false);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
    public static void method3581(byte arg0) {
        field9029 = null;
        if (arg0 != 1) {
            field9043 = -50;
        }
        field9032 = null;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)I")
    public static final int method3582(int arg0) {
        field9031++;
        if (arg0 <= 2) {
            method3581((byte) -62);
        }
        return 2;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIZ)Z")
    public final boolean method3583(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field9012++;
        if (this.field9013 == null || this.field9022.method715(arg4)) {
            return false;
        }
        if (this.field9028 != arg1 || this.field9016 != arg2) {
            this.field9028 = arg1;
            this.field9016 = arg2;
            for (class324 var6 = this.field9022.method719(false); var6 != this.field9022.field1413; var6 = var6.field4681) {
                ((class141) var6).method856((byte) -109, this.field9016, this.field9028);
            }
            this.field9040 = true;
            this.field9037 = true;
            this.field9038 = true;
        }
        if (!arg4) {
            field9032 = null;
        }
        if (!this.method3584((byte) 111)) {
            return false;
        }
        this.field9024 = arg0;
        this.field9021 = arg3;
        this.field9014 = true;
        this.field9019.method2266(this.field9013, true);
        this.field9013.method3124(0, (byte) -63);
        this.field9019.method2259((byte) -86, this.field9016 + this.field9024 - this.field9019.field5219, -this.field9021);
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)Z")
    private final boolean method3584(byte arg0) {
        if (this.field9037) {
            if (this.field9042 != null) {
                this.field9042.method3626((byte) -114);
                this.field9042 = null;
            }
            if (this.field9039 != null) {
                this.field9039.method3023(false);
                this.field9039 = null;
            }
            if (this.field9030 != null) {
                this.field9042 = new class635(this.field9019, 6402, this.field9028, this.field9016, this.field9019.field5331);
            }
            if (this.field9035) {
                this.field9039 = new class289(this.field9019, 34037, 6402, this.field9028, this.field9016);
            } else if (this.field9042 == null) {
                this.field9042 = new class635(this.field9019, 6402, this.field9028, this.field9016);
            }
            this.field9034 = true;
            this.field9040 = true;
            this.field9037 = false;
        }
        field9017++;
        if (arg0 <= 61) {
            return true;
        }
        if (this.field9038) {
            if (this.field9036 != null) {
                this.field9036.method3626((byte) -114);
                this.field9036 = null;
            }
            if (this.field9033[0] != null) {
                this.field9033[0].method3023(false);
                this.field9033[0] = null;
            }
            if (this.field9033[1] != null) {
                this.field9033[1].method3023(false);
                this.field9033[1] = null;
            }
            if (this.field9030 != null) {
                this.field9036 = new class635(this.field9019, this.field9041, this.field9028, this.field9016, this.field9019.field5331);
            }
            this.field9033[0] = new class289(this.field9019, 34037, this.field9041, this.field9028, this.field9016);
            this.field9033[1] = this.field9044 <= 1 ? null : new class289(this.field9019, 34037, this.field9041, this.field9028, this.field9016);
            this.field9034 = true;
            this.field9038 = false;
            this.field9040 = true;
        }
        if (this.field9040) {
            if (this.field9030 == null) {
                this.field9019.method2266(this.field9026, true);
                this.field9026.method3127(0, 0);
                this.field9026.method3127(1, 0);
                this.field9026.method3127(8, 0);
                this.field9026.method3128(0, this.field9033[0], (byte) 88);
                if (this.field9044 > 1) {
                    this.field9026.method3128(1, this.field9033[1], (byte) -127);
                }
                if (this.field9035) {
                    this.field9026.method3128(8, this.field9039, (byte) -107);
                } else {
                    this.field9026.method3123(102, 8, this.field9042);
                }
                this.field9019.method2261(false, this.field9026);
            } else {
                this.field9019.method2266(this.field9026, true);
                this.field9026.method3127(0, 0);
                this.field9026.method3127(1, 0);
                this.field9026.method3127(8, 0);
                this.field9026.method3128(0, this.field9033[0], (byte) -114);
                if (this.field9044 > 1) {
                    this.field9026.method3128(1, this.field9033[1], (byte) 83);
                }
                if (this.field9035) {
                    this.field9026.method3128(8, this.field9039, (byte) -120);
                }
                this.field9019.method2261(false, this.field9026);
                this.field9019.method2266(this.field9030, true);
                this.field9030.method3127(0, 0);
                this.field9030.method3127(8, 0);
                this.field9030.method3123(117, 0, this.field9036);
                this.field9030.method3123(109, 8, this.field9042);
                this.field9019.method2261(false, this.field9030);
            }
            this.field9040 = false;
            this.field9034 = true;
        }
        if (this.field9034) {
            this.field9019.method2266(this.field9013, true);
            this.field9034 = !this.field9013.method3126((byte) -86);
            this.field9019.method2261(false, this.field9013);
        }
        return !this.field9034;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
    private final void method3585(boolean arg0) {
        field9020++;
        boolean var2 = arg0;
        int var3 = 0;
        int var4 = 0;
        for (class141 var5 = (class141) this.field9022.method719(arg0); var5 != null; var5 = (class141) this.field9022.method716(14)) {
            int var9 = var5.method854((byte) 110);
            if (var3 < var9) {
                var3 = var9;
            }
            var4 += var5.method852(0);
            var2 |= var5.method857(arg0);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field9041 != var6) {
            this.field9041 = var6;
            this.field9038 = true;
        }
        int var7 = this.field9044 > 2 ? 2 : this.field9044;
        int var8 = var4 > 2 ? 2 : var4;
        if (var2 != this.field9035) {
            this.field9037 = true;
            this.field9035 = var2;
        }
        if (var7 != var8) {
            this.field9040 = this.field9038 = true;
        }
        this.field9044 = var4;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V")
    public final void method3586(byte arg0) {
        field9027++;
        if (!this.field9014) {
            return;
        }
        if (this.field9030 != null) {
            this.field9019.method2330(8705, this.field9030);
            int var2 = 16384;
            this.field9019.method2331(this.field9026, arg0 + 14514);
            this.field9030.method3129(0, -1);
            this.field9026.method3124(0, (byte) -63);
            if (this.field9035) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field9028, this.field9016, 0, 0, this.field9028, this.field9016, var2, 9728);
            this.field9019.method2332(this.field9030, (byte) -63);
            this.field9019.method2303(true, this.field9026);
        }
        this.field9019.method2323(true);
        this.field9019.method2327(0, (byte) -122);
        this.field9019.method2288(1, arg0 + 7633);
        this.field9019.method404();
        int var3 = 0;
        int var4 = 1;
        class141 var6;
        for (class141 var5 = (class141) this.field9022.method719(false); var5 != null; var5 = var6) {
            var6 = (class141) this.field9022.method716(14);
            int var7 = var5.method852(0);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method855(false, var8, this.field9033[var3], this.field9039);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field9019.method2261(false, this.field9026);
                    this.field9019.method2259((byte) -60, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field9016);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field9021, this.field9024);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field9021, this.field9024 + this.field9016);
                    OpenGL.glTexCoord2f((float) this.field9028, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field9028 + this.field9021, this.field9024 + this.field9016);
                    OpenGL.glTexCoord2f((float) this.field9028, (float) this.field9016);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field9028 + this.field9021, this.field9024);
                    OpenGL.glEnd();
                } else {
                    this.field9026.method3124(var4, (byte) -63);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field9016);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field9016);
                    OpenGL.glTexCoord2f((float) this.field9028, (float) this.field9016);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field9028, this.field9016);
                    OpenGL.glTexCoord2f((float) this.field9028, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field9028, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
                var5.method846(true, var8);
            }
        }
        this.field9014 = false;
        if (arg0 != 48) {
            this.field9024 = -111;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BJ)V")
    public static final void method3587(byte arg0, long arg1) {
        try {
            if (arg0 != -64) {
                return;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field9015++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILaq;)Z")
    public final boolean method3588(int arg0, class141 arg1) {
        field9025++;
        if (this.field9013 != null) {
            if (arg1.method847(true) || arg1.method848(-68)) {
                this.field9022.method706(arg1, true);
                this.method3585(false);
                if (this.method3584((byte) 120)) {
                    if (this.field9028 != -1 && this.field9016 != -1) {
                        arg1.method856((byte) -93, this.field9016, this.field9028);
                    }
                    arg1.field1733 = true;
                    return true;
                }
            }
            this.method3580(arg1, (byte) -99);
        }
        return arg0 >= -21;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)Z")
    public final boolean method3589(int arg0) {
        if (arg0 != 19532) {
            this.field9035 = false;
        }
        field9011++;
        return this.field9013 != null;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lad;)V")
    public class625(class362 arg0) {
        this.field9019 = arg0;
        if (this.field9019.field5481 && this.field9019.field5473) {
            this.field9013 = this.field9026 = new class535(this.field9019);
            if (this.field9019.field5331 > 1 && this.field9019.field5425 && this.field9019.field5375) {
                this.field9013 = this.field9030 = new class535(this.field9019);
                return;
            }
        }
    }

    static {
        new class474("clan_chat", "clanchat", "conversation_clan", "clan_chat");
    }
}
