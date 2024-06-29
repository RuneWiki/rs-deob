import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class32 {

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    private int field332 = 1;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    private int field338 = 0;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    private int field323 = 0;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    private int field342 = 1;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "Lrk;")
    private class419 field345 = new class419();

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "[Lot;")
    private class210[] field348 = new class210[2];

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    private int field352 = -1;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "Z")
    private boolean field351 = true;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "Z")
    private boolean field355 = false;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "Z")
    private boolean field356 = true;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "Z")
    private boolean field349 = true;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    private int field358 = 0;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "Z")
    private boolean field354 = true;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Los;")
    private class468 field326;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lvb;")
    private class292 field331;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "Lvb;")
    private class292 field340;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Lvb;")
    private class292 field336;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Lha;")
    public static class116 field329;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "Lot;")
    private class210 field357;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "Lkh;")
    private class480 field350;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "Lkh;")
    private class480 field353;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "Z")
    private boolean field347;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "[[[Lsk;")
    public static class415[][][] field330;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public final void method142(boolean arg0) {
        field334++;
        if (!this.field347) {
            return;
        }
        if (this.field336 != null) {
            int var2 = 16384;
            this.field326.method2785(arg0, this.field336);
            this.field326.method2793((byte) -3, this.field331);
            this.field336.method1816(0, 37);
            this.field331.method1804((byte) -9, 0);
            if (this.field355) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field342, this.field332, 0, 0, this.field342, this.field332, var2, 9728);
            this.field326.method2798(this.field336, 0);
            this.field326.method2775(this.field331, (byte) -9);
        }
        this.field326.method2814(false);
        this.field326.method2796((byte) -80, 0);
        this.field326.method2791(1, (byte) -94);
        if (!arg0) {
            return;
        }
        this.field326.method985();
        int var3 = 0;
        int var4 = 1;
        class511 var6;
        for (class511 var5 = (class511) this.field345.method2496((byte) 22); var5 != null; var5 = var6) {
            var6 = (class511) this.field345.method2494(38);
            int var7 = var5.method3048(32);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method580(var8, this.field357, this.field348[var3], -78);
                if (var6 == null && var7 - 1 == var8) {
                    this.field326.method2788((byte) -118, this.field331);
                    this.field326.method2850(0, -169876144, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field332);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field323, this.field338);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field323, this.field338 + this.field332);
                    OpenGL.glTexCoord2f((float) this.field342, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field342 + this.field323, this.field338 - -this.field332);
                    OpenGL.glTexCoord2f((float) this.field342, (float) this.field332);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field342 + this.field323, this.field338);
                    OpenGL.glEnd();
                } else {
                    this.field331.method1804((byte) 101, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field332);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field332);
                    OpenGL.glTexCoord2f((float) this.field342, (float) this.field332);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field342, this.field332);
                    OpenGL.glTexCoord2f((float) this.field342, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field342, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
                var5.method586(var8, 120);
            }
        }
        this.field347 = false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lhq;B)V")
    public final void method143(class511 arg0, byte arg1) {
        arg0.field7588 = false;
        field344++;
        arg0.method585((byte) -33);
        arg0.method2997(1);
        int var3 = 103 % ((arg1 - 37) / 37);
        this.method148(0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public final void method144(int arg0) {
        this.field348 = null;
        field335++;
        this.field353 = null;
        this.field357 = null;
        this.field350 = null;
        this.field340 = this.field336 = this.field331 = null;
        if (!this.field345.method2488((byte) 115)) {
            for (class496 var2 = this.field345.method2496((byte) -128); var2 != this.field345.field6029; var2 = var2.field7469) {
                ((class511) var2).method585((byte) -126);
            }
        }
        if (arg0 >= -50) {
            this.method150(-82);
        }
        this.field342 = this.field332 = 1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static void method145(byte arg0) {
        field330 = null;
        field329 = null;
        if (arg0 != -29) {
            field322 = -89;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static final void method146(int arg0) {
        field337++;
        if (class620.field9045 != null) {
            return;
        }
        class620.field9045 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        if (arg0 != 11894) {
            return;
        }
        while (var3 < 65536) {
            double var4 = (double) ((var3 & 0xFD49) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3D9) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var33 << 8) + (var32 << 16) + var34;
            class620.field9045[var3] = var35;
            var3++;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lhq;Z)Z")
    public final boolean method147(class511 arg0, boolean arg1) {
        field339++;
        if (arg1) {
            return true;
        }
        if (this.field340 != null) {
            if (arg0.method576(0) || arg0.method582(-21906)) {
                this.field345.method2492(arg0, (byte) -125);
                this.method148(0);
                if (this.method152((byte) -108)) {
                    if (this.field342 != -1 && this.field332 != -1) {
                        arg0.method587(110, this.field332, this.field342);
                    }
                    arg0.field7588 = true;
                    return true;
                }
            }
            this.method143(arg0, (byte) -70);
        }
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    private final void method148(int arg0) {
        field325++;
        boolean var2 = false;
        int var3 = arg0;
        int var4 = 0;
        for (class511 var5 = (class511) this.field345.method2496((byte) -102); var5 != null; var5 = (class511) this.field345.method2494(49)) {
            int var9 = var5.method583(1);
            var4 += var5.method3048(32);
            if (var9 > var3) {
                var3 = var9;
            }
            var2 |= var5.method3052((byte) -88);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field352 != var6) {
            this.field352 = var6;
            this.field349 = true;
        }
        int var7 = this.field358 > 2 ? 2 : this.field358;
        int var8 = var4 <= 2 ? var4 : 2;
        if (this.field355 != var2) {
            this.field355 = var2;
            this.field354 = true;
        }
        if (var7 != var8) {
            this.field351 = this.field349 = true;
        }
        this.field358 = var4;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)Z")
    public final boolean method149(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field333++;
        if (this.field340 == null || this.field345.method2488((byte) 107)) {
            return false;
        }
        if (this.field342 != arg1 || this.field332 != arg4) {
            this.field332 = arg4;
            this.field342 = arg1;
            for (class496 var6 = this.field345.method2496((byte) -115); var6 != this.field345.field6029; var6 = var6.field7469) {
                ((class511) var6).method587(106, this.field332, this.field342);
            }
            this.field349 = true;
            this.field351 = true;
            this.field354 = true;
        }
        if (!this.method152((byte) -120)) {
            if (arg2 < 53) {
                this.field354 = true;
            }
            return false;
        }
        this.field347 = true;
        this.field323 = arg0;
        this.field338 = arg3;
        this.field326.method2789(0, this.field340);
        this.field340.method1804((byte) -28, 0);
        this.field326.method2850(this.field332 - this.field340.method1809(32092) - this.field338, -169876144, -this.field323);
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)Z")
    public final boolean method150(int arg0) {
        field346++;
        if (arg0 != 34836) {
            field343 = 28;
        }
        return this.field340 != null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[ILos;BZ)Lgg;")
    public static final class273 method151(int arg0, int arg1, int[] arg2, class468 arg3, byte arg4, boolean arg5) {
        if (arg4 != 55) {
            field343 = -18;
        }
        field324++;
        if (!arg3.field7022 && (!class154.method899(arg0, 69) || !class154.method899(arg1, 80))) {
            return arg3.field7095 ? new class273(arg3, 34037, arg0, arg1, arg5, arg2) : new class273(arg3, arg0, arg1, class479.method2908((byte) -99, arg0), class479.method2908((byte) -99, arg1), arg2);
        } else {
            return new class273(arg3, 3553, arg0, arg1, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)Z")
    private final boolean method152(byte arg0) {
        if (arg0 > -102) {
            return false;
        }
        if (this.field354) {
            if (this.field353 != null) {
                this.field353.method2911((byte) 107);
                this.field353 = null;
            }
            if (this.field357 != null) {
                this.field357.method3175(7);
                this.field357 = null;
            }
            if (this.field336 != null) {
                this.field353 = new class480(this.field326, 6402, this.field342, this.field332, this.field326.field6949);
            }
            if (this.field355) {
                this.field357 = new class210(this.field326, 34037, 6402, this.field342, this.field332);
            } else if (this.field353 == null) {
                this.field353 = new class480(this.field326, 6402, this.field342, this.field332);
            }
            this.field351 = true;
            this.field354 = false;
            this.field356 = true;
        }
        field341++;
        if (this.field349) {
            if (this.field350 != null) {
                this.field350.method2911((byte) 91);
                this.field350 = null;
            }
            if (this.field348[0] != null) {
                this.field348[0].method3175(9);
                this.field348[0] = null;
            }
            if (this.field348[1] != null) {
                this.field348[1].method3175(-125);
                this.field348[1] = null;
            }
            if (this.field336 != null) {
                this.field350 = new class480(this.field326, this.field352, this.field342, this.field332, this.field326.field6949);
            }
            this.field348[0] = new class210(this.field326, 34037, this.field352, this.field342, this.field332);
            this.field348[1] = this.field358 <= 1 ? null : new class210(this.field326, 34037, this.field352, this.field342, this.field332);
            this.field351 = true;
            this.field349 = false;
            this.field356 = true;
        }
        if (this.field351) {
            if (this.field336 == null) {
                this.field326.method2789(0, this.field331);
                this.field331.method1811(-114, 0);
                this.field331.method1811(-115, 1);
                this.field331.method1811(-112, 8);
                this.field331.method1818(this.field348[0], 0, (byte) -73);
                if (this.field358 > 1) {
                    this.field331.method1818(this.field348[1], 1, (byte) -117);
                }
                if (this.field355) {
                    this.field331.method1818(this.field357, 8, (byte) -123);
                } else {
                    this.field331.method1817(this.field353, 8, -68);
                }
                this.field326.method2788((byte) -118, this.field331);
            } else {
                this.field326.method2789(0, this.field331);
                this.field331.method1811(-120, 0);
                this.field331.method1811(-118, 1);
                this.field331.method1811(-123, 8);
                this.field331.method1818(this.field348[0], 0, (byte) -128);
                if (this.field358 > 1) {
                    this.field331.method1818(this.field348[1], 1, (byte) -107);
                }
                if (this.field355) {
                    this.field331.method1818(this.field357, 8, (byte) -38);
                }
                this.field326.method2788((byte) -118, this.field331);
                this.field326.method2789(0, this.field336);
                this.field336.method1811(-123, 0);
                this.field336.method1811(-121, 8);
                this.field336.method1817(this.field350, 0, -56);
                this.field336.method1817(this.field353, 8, -20);
                this.field326.method2788((byte) -118, this.field336);
            }
            this.field356 = true;
            this.field351 = false;
        }
        if (this.field356) {
            this.field326.method2789(0, this.field340);
            this.field356 = !this.field340.method1814(false);
            this.field326.method2788((byte) -118, this.field340);
        }
        return !this.field356;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Los;)V")
    public class32(class468 arg0) {
        this.field326 = arg0;
        if (this.field326.field6993 && this.field326.field7095) {
            this.field340 = this.field331 = new class292(this.field326);
            if (this.field326.field6949 > 1 && this.field326.field7102 && this.field326.field7087) {
                this.field340 = this.field336 = new class292(this.field326);
                return;
            }
        }
    }
}
