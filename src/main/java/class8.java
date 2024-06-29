import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    private int field94 = 0;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    private int field96 = 1;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    private int field107 = 0;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    private int field109 = 1;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "Lft;")
    private class4 field104 = new class4();

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    private int field112 = 0;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    private int field111 = -1;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "Z")
    private boolean field114 = true;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "Z")
    private boolean field113 = true;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "[Lsg;")
    private class262[] field118 = new class262[2];

    @OriginalMember(owner = "client!to", name = "E", descriptor = "Z")
    private boolean field120 = false;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "Z")
    private boolean field121 = true;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "Z")
    private boolean field116 = true;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Lbl;")
    private class442 field93;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Lmg;")
    private class96 field95;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "Lmg;")
    private class96 field110;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "Lmg;")
    private class96 field106;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "Lqi;")
    public static class382 field98 = new class382("WTWIP", 3);

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "Lkd;")
    private class177 field115;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "Lkd;")
    private class177 field117;

    @OriginalMember(owner = "client!to", name = "D", descriptor = "Lsg;")
    private class262 field119;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "Z")
    private boolean field101;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
    public static void method41(byte arg0) {
        if (arg0 < -112) {
            field98 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    private final void method42(int arg0) {
        field100++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (arg0 >= -45) {
            this.field117 = null;
        }
        for (class91 var5 = (class91) this.field104.method8((byte) -98); var5 != null; var5 = (class91) this.field104.method17((byte) -102)) {
            int var9 = var5.method678((byte) -96);
            var4 += var5.method681((byte) -120);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method682((byte) 46);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field111 != var6) {
            this.field121 = true;
            this.field111 = var6;
        }
        int var7 = this.field112 <= 2 ? this.field112 : 2;
        int var8 = var4 <= 2 ? var4 : 2;
        this.field112 = var4;
        if (this.field120 != var2) {
            this.field120 = var2;
            this.field114 = true;
        }
        if (var7 != var8) {
            this.field116 = this.field121 = true;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLmr;)V")
    public final void method43(byte arg0, class91 arg1) {
        field92++;
        arg1.field1636 = false;
        arg1.method679(25);
        arg1.method1121(false);
        if (arg0 <= -30) {
            this.method42(-78);
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)Z")
    public final boolean method44(byte arg0) {
        field97++;
        if (arg0 < 90) {
            return true;
        } else {
            return this.field110 != null;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public final void method45(int arg0) {
        this.field119 = null;
        field103++;
        this.field117 = null;
        this.field115 = null;
        this.field110 = this.field106 = this.field95 = null;
        this.field118 = null;
        if (!this.field104.method14(0)) {
            for (class179 var2 = this.field104.method8((byte) -98); var2 != this.field104.field45; var2 = var2.field2799) {
                ((class91) var2).method679(64);
            }
        }
        this.field109 = this.field96 = arg0;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
    public static final void method46(int arg0) {
        field102++;
        if (arg0 != 0) {
            field98 = null;
        }
        class288 var1 = class475.field7250;
        synchronized (class475.field7250) {
            class475.field7250.method1749((byte) -6);
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
    public final void method47(int arg0) {
        field105++;
        if (!this.field101) {
            return;
        }
        if (this.field106 != null) {
            int var2 = 16384;
            this.field93.method2595(true, this.field106);
            this.field93.method2596(this.field95, -4);
            this.field106.method717(0, arg0 ^ 0x100A);
            this.field95.method715(0, arg0 + 4144);
            if (this.field120) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field109, this.field96, 0, 0, this.field109, this.field96, var2, 9728);
            this.field93.method2619(this.field106, 25087);
            this.field93.method2592(this.field95, 37);
        }
        if (arg0 != -4223) {
            this.field95 = null;
        }
        this.field93.method2580((byte) 77);
        this.field93.method2640(27575, 0);
        this.field93.method2610(0, 1);
        this.field93.method1966();
        int var3 = 0;
        int var4 = 1;
        class91 var6;
        for (class91 var5 = (class91) this.field104.method8((byte) -98); var5 != null; var5 = var6) {
            var6 = (class91) this.field104.method17((byte) -128);
            int var7 = var5.method681((byte) -120);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method677((byte) 22, this.field118[var3], var8, this.field119);
                if (var6 == null && var7 - 1 == var8) {
                    this.field93.method2591((byte) 51, this.field95);
                    this.field93.method2638((byte) 92, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field96);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field107, this.field94);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field107, this.field94 + this.field96);
                    OpenGL.glTexCoord2f((float) this.field109, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field107 + this.field109, this.field96 + this.field94);
                    OpenGL.glTexCoord2f((float) this.field109, (float) this.field96);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field107 + this.field109, this.field94);
                    OpenGL.glEnd();
                } else {
                    this.field95.method715(var4, arg0 ^ 0xFFFFEFF2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field96);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field96);
                    OpenGL.glTexCoord2f((float) this.field109, (float) this.field96);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field109, this.field96);
                    OpenGL.glTexCoord2f((float) this.field109, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field109, 0);
                    OpenGL.glEnd();
                }
                var5.method688(var8, false);
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field101 = false;
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(I)Z")
    private final boolean method48(int arg0) {
        field99++;
        if (this.field114) {
            if (this.field115 != null) {
                this.field115.method1116(0);
                this.field115 = null;
            }
            if (this.field119 != null) {
                this.field119.method1214(-93);
                this.field119 = null;
            }
            if (this.field106 != null) {
                this.field115 = new class177(this.field93, 6402, this.field109, this.field96, this.field93.field6665);
            }
            if (this.field120) {
                this.field119 = new class262(this.field93, 34037, 6402, this.field109, this.field96);
            } else if (this.field115 == null) {
                this.field115 = new class177(this.field93, 6402, this.field109, this.field96);
            }
            this.field113 = true;
            this.field114 = false;
            this.field116 = true;
        }
        if (this.field121) {
            if (this.field117 != null) {
                this.field117.method1116(arg0 ^ 0x5720);
                this.field117 = null;
            }
            if (this.field118[0] != null) {
                this.field118[0].method1214(88);
                this.field118[0] = null;
            }
            if (this.field118[1] != null) {
                this.field118[1].method1214(-72);
                this.field118[1] = null;
            }
            if (this.field106 != null) {
                this.field117 = new class177(this.field93, this.field111, this.field109, this.field96, this.field93.field6665);
            }
            this.field118[0] = new class262(this.field93, 34037, this.field111, this.field109, this.field96);
            this.field118[1] = this.field112 <= 1 ? null : new class262(this.field93, 34037, this.field111, this.field109, this.field96);
            this.field116 = true;
            this.field121 = false;
            this.field113 = true;
        }
        if (this.field116) {
            if (this.field106 == null) {
                this.field93.method2612(-114, this.field95);
                this.field95.method728(false, 0);
                this.field95.method728(false, 1);
                this.field95.method728(false, 8);
                this.field95.method724(4, 0, this.field118[0]);
                if (this.field112 > 1) {
                    this.field95.method724(4, 1, this.field118[1]);
                }
                if (this.field120) {
                    this.field95.method724(4, 8, this.field119);
                } else {
                    this.field95.method727(this.field115, 8, false);
                }
                this.field93.method2591((byte) 51, this.field95);
            } else {
                this.field93.method2612(arg0 ^ 0xFFFFA8A5, this.field95);
                this.field95.method728(false, 0);
                this.field95.method728(false, 1);
                this.field95.method728(false, 8);
                this.field95.method724(4, 0, this.field118[0]);
                if (this.field112 > 1) {
                    this.field95.method724(4, 1, this.field118[1]);
                }
                if (this.field120) {
                    this.field95.method724(4, 8, this.field119);
                }
                this.field93.method2591((byte) 51, this.field95);
                this.field93.method2612(-117, this.field106);
                this.field106.method728(false, 0);
                this.field106.method728(false, 8);
                this.field106.method727(this.field117, 0, false);
                this.field106.method727(this.field115, 8, false);
                this.field93.method2591((byte) 51, this.field106);
            }
            this.field113 = true;
            this.field116 = false;
        }
        if (this.field113) {
            this.field93.method2612(arg0 - 22398, this.field110);
            this.field113 = !this.field110.method719(-1);
            this.field93.method2591((byte) 51, this.field110);
        }
        if (arg0 != 22304) {
            this.method49(false, 60, -54, 61, 96);
        }
        return !this.field113;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZIIII)Z")
    public final boolean method49(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            field98 = null;
        }
        field108++;
        if (this.field110 == null || this.field104.method14(0)) {
            return false;
        }
        if (this.field109 != arg1 || this.field96 != arg4) {
            this.field109 = arg1;
            this.field96 = arg4;
            for (class179 var6 = this.field104.method8((byte) -98); var6 != this.field104.field45; var6 = var6.field2799) {
                ((class91) var6).method685(this.field109, 5865, this.field96);
            }
            this.field116 = true;
            this.field121 = true;
            this.field114 = true;
        }
        if (!this.method48(22304)) {
            return false;
        }
        this.field94 = arg3;
        this.field101 = true;
        this.field107 = arg2;
        this.field93.method2612(-46, this.field110);
        this.field110.method715(0, 107);
        this.field93.method2638((byte) 78, -this.field107, this.field96 - (this.field110.method718(-19567) + this.field94));
        return true;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lmr;I)Z")
    public final boolean method50(class91 arg0, int arg1) {
        if (arg1 > -107) {
            this.method44((byte) -104);
        }
        field91++;
        if (this.field110 != null) {
            if (arg0.method687(15623) || arg0.method686((byte) 70)) {
                this.field104.method4(1, arg0);
                this.method42(-109);
                if (this.method48(22304)) {
                    if (this.field109 != -1 && this.field96 != -1) {
                        arg0.method685(this.field109, 5865, this.field96);
                    }
                    arg0.field1636 = true;
                    return true;
                }
            }
            this.method43((byte) -32, arg0);
        }
        return false;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lbl;)V")
    public class8(class442 arg0) {
        this.field93 = arg0;
        if (this.field93.field6802 && this.field93.field6713) {
            this.field110 = this.field95 = new class96(this.field93);
            if (this.field93.field6665 > 1 && this.field93.field6732 && this.field93.field6751) {
                this.field110 = this.field106 = new class96(this.field93);
                return;
            }
        }
    }
}
