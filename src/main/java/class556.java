import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class556 {

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    private int field7793 = 1;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    private int field7794 = 1;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    private int field7780 = 0;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    private int field7795 = 0;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lnt;")
    private class220 field7779 = new class220();

    @OriginalMember(owner = "client!si", name = "y", descriptor = "Z")
    private boolean field7802 = false;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "Z")
    private boolean field7805 = true;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "Z")
    private boolean field7806 = true;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "[Lme;")
    private class192[] field7801 = new class192[2];

    @OriginalMember(owner = "client!si", name = "z", descriptor = "Z")
    private boolean field7803 = true;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    private int field7810 = -1;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "Z")
    private boolean field7804 = true;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    private int field7811 = 0;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "Loea;")
    private class594 field7799;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lij;")
    private class419 field7783;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "Lij;")
    private class419 field7798;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Lij;")
    private class419 field7788;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Ljha;")
    public static class692 field7784 = new class692();

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "Lme;")
    private class192 field7808;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "Lnh;")
    private class744 field7807;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "Lnh;")
    private class744 field7809;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Z")
    private boolean field7781;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIZI)Z")
    public final boolean method3251(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field7786++;
        if (this.field7798 == null || this.field7779.method1528(65)) {
            return false;
        }
        if (this.field7794 != arg2 || this.field7793 != arg0) {
            this.field7793 = arg0;
            this.field7794 = arg2;
            for (class626 var6 = this.field7779.method1522(arg3); var6 != this.field7779.field3131; var6 = var6.field8990) {
                ((class194) var6).method1359((byte) 106, this.field7794, this.field7793);
            }
            this.field7803 = true;
            this.field7804 = true;
            this.field7805 = true;
        }
        if (!this.method3253(arg3)) {
            return false;
        }
        this.field7781 = true;
        this.field7795 = arg4;
        this.field7780 = arg1;
        this.field7799.method3446(this.field7798, (byte) 46);
        this.field7798.method2569(0, (byte) -106);
        this.field7799.method3466(1, this.field7780 + this.field7793 - this.field7799.field8520, -this.field7795);
        return true;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)I")
    public static final int method3252(int arg0, byte arg1) {
        int var2 = 19 / ((-arg1 - 38) / 50);
        field7789++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Z")
    private final boolean method3253(boolean arg0) {
        field7791++;
        if (this.field7803) {
            if (this.field7809 != null) {
                this.field7809.method4145(0);
                this.field7809 = null;
            }
            if (this.field7808 != null) {
                this.field7808.method821((byte) 59);
                this.field7808 = null;
            }
            if (this.field7788 != null) {
                this.field7809 = new class744(this.field7799, 6402, this.field7794, this.field7793, this.field7799.field8538);
            }
            if (this.field7802) {
                this.field7808 = new class192(this.field7799, 34037, 6402, this.field7794, this.field7793);
            } else if (this.field7809 == null) {
                this.field7809 = new class744(this.field7799, 6402, this.field7794, this.field7793);
            }
            this.field7803 = false;
            this.field7805 = true;
            this.field7806 = true;
        }
        if (!arg0) {
            return false;
        }
        if (this.field7804) {
            if (this.field7807 != null) {
                this.field7807.method4145(0);
                this.field7807 = null;
            }
            if (this.field7801[0] != null) {
                this.field7801[0].method821((byte) -113);
                this.field7801[0] = null;
            }
            if (this.field7801[1] != null) {
                this.field7801[1].method821((byte) -111);
                this.field7801[1] = null;
            }
            if (this.field7788 != null) {
                this.field7807 = new class744(this.field7799, this.field7810, this.field7794, this.field7793, this.field7799.field8538);
            }
            this.field7801[0] = new class192(this.field7799, 34037, this.field7810, this.field7794, this.field7793);
            this.field7801[1] = this.field7811 > 1 ? new class192(this.field7799, 34037, this.field7810, this.field7794, this.field7793) : null;
            this.field7804 = false;
            this.field7805 = true;
            this.field7806 = true;
        }
        if (this.field7805) {
            if (this.field7788 == null) {
                this.field7799.method3446(this.field7783, (byte) 117);
                this.field7783.method2555(0, (byte) 72);
                this.field7783.method2555(1, (byte) 113);
                this.field7783.method2555(8, (byte) 117);
                this.field7783.method2556(this.field7801[0], true, 0);
                if (this.field7811 > 1) {
                    this.field7783.method2556(this.field7801[1], true, 1);
                }
                if (this.field7802) {
                    this.field7783.method2556(this.field7808, arg0, 8);
                } else {
                    this.field7783.method2567(8, -1, this.field7809);
                }
                this.field7799.method3442((byte) -113, this.field7783);
            } else {
                this.field7799.method3446(this.field7783, (byte) 32);
                this.field7783.method2555(0, (byte) 79);
                this.field7783.method2555(1, (byte) 78);
                this.field7783.method2555(8, (byte) 121);
                this.field7783.method2556(this.field7801[0], true, 0);
                if (this.field7811 > 1) {
                    this.field7783.method2556(this.field7801[1], arg0, 1);
                }
                if (this.field7802) {
                    this.field7783.method2556(this.field7808, true, 8);
                }
                this.field7799.method3442((byte) -118, this.field7783);
                this.field7799.method3446(this.field7788, (byte) 107);
                this.field7788.method2555(0, (byte) 109);
                this.field7788.method2555(8, (byte) 75);
                this.field7788.method2567(0, -1, this.field7807);
                this.field7788.method2567(8, -1, this.field7809);
                this.field7799.method3442((byte) -71, this.field7788);
            }
            this.field7805 = false;
            this.field7806 = true;
        }
        if (this.field7806) {
            this.field7799.method3446(this.field7798, (byte) 125);
            this.field7806 = !this.field7798.method2557(109);
            this.field7799.method3442((byte) -102, this.field7798);
        }
        return !this.field7806;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ltj;I)V")
    public final void method3254(class194 arg0, int arg1) {
        arg0.field2785 = false;
        field7792++;
        arg0.method1363((byte) 120);
        if (arg1 > -22) {
            this.method3254(null, -59);
        }
        arg0.method3617(1);
        this.method3256((byte) 49);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Z")
    public final boolean method3255(byte arg0) {
        if (arg0 != 23) {
            this.field7780 = -73;
        }
        field7796++;
        return this.field7798 != null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
    private final void method3256(byte arg0) {
        field7785++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (arg0 != 49) {
            return;
        }
        for (class194 var5 = (class194) this.field7779.method1522(true); var5 != null; var5 = (class194) this.field7779.method1527((byte) 91)) {
            int var9 = var5.method1364((byte) -116);
            if (var3 < var9) {
                var3 = var9;
            }
            var4 += var5.method1357(arg0 ^ 0x34);
            var2 |= var5.method1355(124);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field7810 != var6) {
            this.field7804 = true;
            this.field7810 = var6;
        }
        int var7 = this.field7811 <= 2 ? this.field7811 : 2;
        int var8 = var4 <= 2 ? var4 : 2;
        if (var2 != this.field7802) {
            this.field7802 = var2;
            this.field7803 = true;
        }
        this.field7811 = var4;
        if (var7 != var8) {
            this.field7805 = this.field7804 = true;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
    public final void method3257(boolean arg0) {
        field7787++;
        this.field7798 = this.field7788 = this.field7783 = null;
        this.field7808 = null;
        this.field7801 = null;
        this.field7807 = null;
        this.field7809 = null;
        if (!this.field7779.method1528(65)) {
            for (class626 var2 = this.field7779.method1522(!arg0); var2 != this.field7779.field3131; var2 = var2.field8990) {
                ((class194) var2).method1363((byte) 106);
            }
        }
        if (arg0) {
            this.field7799 = null;
        }
        this.field7794 = this.field7793 = 1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLtj;)Z")
    public final boolean method3258(byte arg0, class194 arg1) {
        field7790++;
        if (this.field7798 != null) {
            if (arg1.method1362(true) || arg1.method1365(8023)) {
                this.field7779.method1526(arg1, arg0 ^ 0x71);
                this.method3256((byte) 49);
                if (this.method3253(true)) {
                    if (this.field7794 != -1 && this.field7793 != -1) {
                        arg1.method1359((byte) 106, this.field7794, this.field7793);
                    }
                    arg1.field2785 = true;
                    return true;
                }
            }
            this.method3254(arg1, -81);
        }
        if (arg0 != 5) {
            this.field7793 = -106;
        }
        return false;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public final void method3259(int arg0) {
        field7782++;
        if (!this.field7781) {
            return;
        }
        if (this.field7788 != null) {
            int var2 = 16384;
            this.field7799.method3481(this.field7788, arg0 ^ 0xFFFF77EB);
            this.field7799.method3405(this.field7783, false);
            this.field7788.method2554((byte) 105, 0);
            this.field7783.method2569(0, (byte) -120);
            if (this.field7802) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field7794, this.field7793, 0, 0, this.field7794, this.field7793, var2, 9728);
            this.field7799.method3440(this.field7788, -77);
            this.field7799.method3419(24178, this.field7783);
        }
        this.field7799.method3455(94);
        this.field7799.method3454(0, 116);
        this.field7799.method3417(1, 0);
        this.field7799.method601();
        int var3 = 0;
        int var4 = 1;
        if (arg0 != 34836) {
            this.method3256((byte) 40);
        }
        class194 var6;
        for (class194 var5 = (class194) this.field7779.method1522(true); var5 != null; var5 = var6) {
            var6 = (class194) this.field7779.method1527((byte) 59);
            int var7 = var5.method1357(5);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1358((byte) 60, var8, this.field7808, this.field7801[var3]);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field7799.method3442((byte) -75, this.field7783);
                    this.field7799.method3466(arg0 ^ 0x8815, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7793);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7795, this.field7780);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7795, this.field7793 + this.field7780);
                    OpenGL.glTexCoord2f((float) this.field7794, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7795 + this.field7794, this.field7793 + this.field7780);
                    OpenGL.glTexCoord2f((float) this.field7794, (float) this.field7793);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7795 + this.field7794, this.field7780);
                    OpenGL.glEnd();
                } else {
                    this.field7783.method2569(var4, (byte) -55);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7793);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field7793);
                    OpenGL.glTexCoord2f((float) this.field7794, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7794, this.field7793);
                    OpenGL.glTexCoord2f((float) this.field7794, (float) this.field7793);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7794, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var5.method1356(var8, (byte) -55);
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field7781 = false;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public static void method3260(int arg0) {
        if (arg0 != 0) {
            method3260(61);
        }
        field7784 = null;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Loea;)V")
    public class556(class594 arg0) {
        this.field7799 = arg0;
        if (this.field7799.field8624 && this.field7799.field8587) {
            this.field7798 = this.field7783 = new class419(this.field7799);
            if (this.field7799.field8538 > 1 && this.field7799.field8660 && this.field7799.field8645) {
                this.field7798 = this.field7788 = new class419(this.field7799);
                return;
            }
        }
    }
}
