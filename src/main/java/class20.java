import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class20 {

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    private int field340 = 0;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    private int field351 = 1;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    private int field354 = 0;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    private int field341 = 1;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Ltu;")
    private class7 field348 = new class7();

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Z")
    private boolean field357 = true;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Z")
    private boolean field358 = true;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    private int field356 = 0;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    private int field361 = -1;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "Z")
    private boolean field364 = true;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "Z")
    private boolean field362 = false;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "[Lsr;")
    private class346[] field365 = new class346[2];

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "Z")
    private boolean field366 = true;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lgk;")
    private class463 field339;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Ljh;")
    private class453 field336;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Ljh;")
    private class453 field347;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Ljh;")
    private class453 field344;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[I")
    public static int[] field335 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field345 = -1;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "Lhp;")
    private class288 field359;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "Lhp;")
    private class288 field363;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Lsr;")
    private class346 field360;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Z")
    private boolean field342;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)Z", line = 4)
    public final boolean method127(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field337++;
        if (this.field347 == null || this.field348.method38((byte) 63)) {
            return false;
        }
        if (this.field341 != arg2 || this.field351 != arg4) {
            this.field351 = arg4;
            this.field341 = arg2;
            for (class508 var6 = this.field348.method49(arg3 ^ 0x20); var6 != this.field348.field64; var6 = var6.field7454) {
                ((class126) var6).method794(this.field351, this.field341, (byte) -26);
            }
            this.field357 = true;
            this.field358 = true;
            this.field366 = true;
        }
        if (arg3 != 1) {
            this.field354 = -14;
        }
        if (!this.method130(false)) {
            return false;
        }
        this.field342 = true;
        this.field354 = arg1;
        this.field340 = arg0;
        this.field339.method2747(this.field347, arg3 + 2);
        this.field347.method2683(-91, 0);
        this.field339.method2723(-this.field340, this.field351 + (-this.field347.method2682(false) - this.field354), -29614);
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLfg;)V", line = 52)
    public final void method128(byte arg0, class126 arg1) {
        arg1.field1724 = false;
        field353++;
        arg1.method796(-112);
        arg1.method3021(61);
        this.method135(true);
        if (arg0 <= 67) {
            this.field360 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 71)
    public static void method129(byte arg0) {
        int var1 = -56 % ((arg0 + 61) / 42);
        field335 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)Z", line = 80)
    private final boolean method130(boolean arg0) {
        if (arg0) {
            this.field364 = true;
        }
        field343++;
        if (this.field357) {
            if (this.field359 != null) {
                this.field359.method1748(4325);
                this.field359 = null;
            }
            if (this.field360 != null) {
                this.field360.method219(-23222);
                this.field360 = null;
            }
            if (this.field344 != null) {
                this.field359 = new class288(this.field339, 6402, this.field341, this.field351, this.field339.field6684);
            }
            if (this.field362) {
                this.field360 = new class346(this.field339, 34037, 6402, this.field341, this.field351);
            } else if (this.field359 == null) {
                this.field359 = new class288(this.field339, 6402, this.field341, this.field351);
            }
            this.field357 = false;
            this.field358 = true;
            this.field364 = true;
        }
        if (this.field366) {
            if (this.field363 != null) {
                this.field363.method1748(4325);
                this.field363 = null;
            }
            if (this.field365[0] != null) {
                this.field365[0].method219(-23222);
                this.field365[0] = null;
            }
            if (this.field365[1] != null) {
                this.field365[1].method219(-23222);
                this.field365[1] = null;
            }
            if (this.field344 != null) {
                this.field363 = new class288(this.field339, this.field361, this.field341, this.field351, this.field339.field6684);
            }
            this.field365[0] = new class346(this.field339, 34037, this.field361, this.field341, this.field351);
            this.field365[1] = this.field356 > 1 ? new class346(this.field339, 34037, this.field361, this.field341, this.field351) : null;
            this.field364 = true;
            this.field358 = true;
            this.field366 = false;
        }
        if (this.field358) {
            if (this.field344 == null) {
                this.field339.method2747(this.field336, 3);
                this.field336.method2684(0, 1);
                this.field336.method2684(1, 1);
                this.field336.method2684(8, 1);
                this.field336.method2687((byte) -116, this.field365[0], 0);
                if (this.field356 > 1) {
                    this.field336.method2687((byte) 63, this.field365[1], 1);
                }
                if (this.field362) {
                    this.field336.method2687((byte) -106, this.field360, 8);
                } else {
                    this.field336.method2686(8, this.field359, 620);
                }
                this.field339.method2770(this.field336, arg0);
            } else {
                this.field339.method2747(this.field336, 3);
                this.field336.method2684(0, 1);
                this.field336.method2684(1, 1);
                this.field336.method2684(8, 1);
                this.field336.method2687((byte) -118, this.field365[0], 0);
                if (this.field356 > 1) {
                    this.field336.method2687((byte) 43, this.field365[1], 1);
                }
                if (this.field362) {
                    this.field336.method2687((byte) -113, this.field360, 8);
                }
                this.field339.method2770(this.field336, false);
                this.field339.method2747(this.field344, 3);
                this.field344.method2684(0, 1);
                this.field344.method2684(8, 1);
                this.field344.method2686(0, this.field363, 620);
                this.field344.method2686(8, this.field359, 620);
                this.field339.method2770(this.field344, false);
            }
            this.field364 = true;
            this.field358 = false;
        }
        if (this.field364) {
            this.field339.method2747(this.field347, 3);
            this.field364 = !this.field347.method2693((byte) -115);
            this.field339.method2770(this.field347, false);
        }
        return !this.field364;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lgk;)V", line = 550)
    public class20(class463 arg0) {
        this.field339 = arg0;
        if (this.field339.field6719 && this.field339.field6833) {
            this.field347 = this.field336 = new class453(this.field339);
            if (this.field339.field6684 > 1 && this.field339.field6717 && this.field339.field6825) {
                this.field347 = this.field344 = new class453(this.field339);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lfg;I)Z", line = 224)
    public final boolean method131(class126 arg0, int arg1) {
        field350++;
        if (arg1 != 0) {
            this.field359 = null;
        }
        if (this.field347 != null) {
            if (arg0.method802(-13495) || arg0.method795(0)) {
                this.field348.method42(arg0, 0);
                this.method135(true);
                if (this.method130(false)) {
                    if (this.field341 != -1 && this.field351 != -1) {
                        arg0.method794(this.field351, this.field341, (byte) -26);
                    }
                    arg0.field1724 = true;
                    return true;
                }
            }
            this.method128((byte) 127, arg0);
        }
        return false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Z", line = 259)
    public final boolean method132(int arg0) {
        field355++;
        if (arg0 == 2) {
            return this.field347 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Ljd;", line = 281)
    public static final class408 method133(int arg0, int arg1) {
        field338++;
        class408[] var2 = class303.method1817((byte) 116);
        int var3 = -55 / ((3 - arg0) / 63);
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4].field5468 == arg1) {
                return var2[var4];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 312)
    public final void method134(int arg0) {
        this.field365 = null;
        field349++;
        this.field347 = this.field344 = this.field336 = null;
        this.field363 = null;
        if (arg0 != 13225) {
            return;
        }
        this.field360 = null;
        this.field359 = null;
        if (!this.field348.method38((byte) 63)) {
            for (class508 var2 = this.field348.method49(-116); var2 != this.field348.field64; var2 = var2.field7454) {
                ((class126) var2).method796(64);
            }
        }
        this.field341 = this.field351 = 1;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V", line = 346)
    private final void method135(boolean arg0) {
        field352++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class126 var5 = (class126) this.field348.method49(84); var5 != null; var5 = (class126) this.field348.method46((byte) 90)) {
            int var9 = var5.method799((byte) 123);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method800(13659);
            var2 |= var5.method804((byte) 115);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field361 != var6) {
            this.field366 = true;
            this.field361 = var6;
        }
        int var7 = this.field356 <= 2 ? this.field356 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        this.field356 = var4;
        if (!arg0) {
            return;
        }
        if (var7 != var8) {
            this.field358 = this.field366 = true;
        }
        if (this.field362 != var2) {
            this.field362 = var2;
            this.field357 = true;
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 413)
    public final void method136(int arg0) {
        field346++;
        if (!this.field342) {
            return;
        }
        if (this.field344 != null) {
            int var2 = 16384;
            this.field339.method2724((byte) -1, this.field344);
            this.field339.method2740(this.field336, (byte) -105);
            this.field344.method2688(62, 0);
            this.field336.method2683(-71, 0);
            if (this.field362) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field341, this.field351, 0, 0, this.field341, this.field351, var2, 9728);
            this.field339.method2757(this.field344, -86);
            this.field339.method2722(-4, this.field336);
        }
        this.field339.method2780(12057);
        this.field339.method2760(0, 124);
        if (arg0 > -5) {
            this.field362 = true;
        }
        this.field339.method2739(1, 0);
        this.field339.method865();
        int var3 = 0;
        int var4 = 1;
        class126 var6;
        for (class126 var5 = (class126) this.field348.method49(94); var5 != null; var5 = var6) {
            var6 = (class126) this.field348.method46((byte) 109);
            int var7 = var5.method800(13659);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method792(this.field360, this.field365[var3], 100, var8);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field339.method2770(this.field336, false);
                    this.field339.method2723(0, 0, -29614);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field351);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field340, this.field354);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field340, this.field354 + this.field351);
                    OpenGL.glTexCoord2f((float) this.field341, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field341 + this.field340, this.field354 + this.field351);
                    OpenGL.glTexCoord2f((float) this.field341, (float) this.field351);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field340 + this.field341, this.field354);
                    OpenGL.glEnd();
                } else {
                    this.field336.method2683(-103, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field351);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field351);
                    OpenGL.glTexCoord2f((float) this.field341, (float) this.field351);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field341, this.field351);
                    OpenGL.glTexCoord2f((float) this.field341, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field341, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
                var5.method798(var8, 0);
            }
        }
        this.field342 = false;
    }
}
