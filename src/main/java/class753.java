import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class753 {

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    private int field10471 = 1;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    private int field10472 = 0;

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
    private int field10477 = 0;

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
    private int field10484 = 1;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "Lbg;")
    private class464 field10468 = new class464();

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
    private int field10489 = 0;

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "[Lmfa;")
    private class615[] field10491 = new class615[2];

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "Z")
    private boolean field10490 = true;

    @OriginalMember(owner = "client!sw", name = "v", descriptor = "Z")
    private boolean field10488 = true;

    @OriginalMember(owner = "client!sw", name = "A", descriptor = "Z")
    private boolean field10493 = true;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "I")
    private int field10492 = -1;

    @OriginalMember(owner = "client!sw", name = "C", descriptor = "Z")
    private boolean field10495 = false;

    @OriginalMember(owner = "client!sw", name = "E", descriptor = "Z")
    private boolean field10497 = true;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "Leea;")
    private class131 field10483;

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "Lgia;")
    private class269 field10473;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "Lgia;")
    private class269 field10467;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "Lgia;")
    private class269 field10480;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field10469;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
    public static int field10470;

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "I")
    public static int field10476;

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
    public static int field10478;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
    public static int field10479;

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
    public static int field10481;

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
    public static int field10482;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
    public static int field10485;

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "Lnha;")
    private class321 field10487;

    @OriginalMember(owner = "client!sw", name = "D", descriptor = "Lnha;")
    private class321 field10496;

    @OriginalMember(owner = "client!sw", name = "B", descriptor = "Lmfa;")
    private class615 field10494;

    @OriginalMember(owner = "client!sw", name = "i", descriptor = "Z")
    private boolean field10475;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lou;I)Z")
    public final boolean method4188(class604 arg0, int arg1) {
        field10485++;
        if (this.field10467 != null) {
            if (arg0.method811(67) || arg0.method818((byte) -22)) {
                this.field10468.method2770((byte) -13, arg0);
                this.method4194(0);
                if (this.method4196((byte) 57)) {
                    if (this.field10471 != -1 && this.field10484 != -1) {
                        arg0.method817(this.field10471, this.field10484, arg1 ^ 0x2CB1);
                    }
                    arg0.field8487 = true;
                    return true;
                }
            }
            this.method4190(31218, arg0);
        }
        return arg1 == 0 ? false : false;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z")
    public final boolean method4189(int arg0) {
        field10470++;
        int var2 = 36 / ((-arg0 - 42) / 62);
        return this.field10467 != null;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ILou;)V")
    public final void method4190(int arg0, class604 arg1) {
        arg1.field8487 = false;
        field10481++;
        arg1.method815(-16008);
        arg1.method1185(-76);
        this.method4194(0);
        if (arg0 != 31218) {
            this.method4189(-7);
        }
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)V")
    public final void method4191(int arg0) {
        this.field10491 = null;
        this.field10494 = null;
        field10482++;
        this.field10487 = null;
        this.field10467 = this.field10480 = this.field10473 = null;
        this.field10496 = null;
        if (!this.field10468.method2757((byte) 27)) {
            for (class189 var2 = this.field10468.method2765(-12261); var2 != this.field10468.field6565; var2 = var2.field2543) {
                ((class604) var2).method815(-16008);
            }
        }
        this.field10471 = this.field10484 = arg0;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIB)Z")
    public static final boolean method4192(int arg0, int arg1, byte arg2) {
        field10476++;
        if (arg2 == 68) {
            return class243.method1550(arg2 ^ 0x4C, arg1, arg0) || class562.method3236(arg0, arg1, -87);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)V")
    public final void method4193(boolean arg0) {
        field10479++;
        if (!this.field10475) {
            return;
        }
        if (this.field10480 != null) {
            int var2 = 16384;
            this.field10483.method904(0, this.field10480);
            this.field10483.method951(this.field10473, 1);
            this.field10480.method1755(0, -1);
            this.field10473.method1759(0, 87);
            if (this.field10495) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field10471, this.field10484, 0, 0, this.field10471, this.field10484, var2, 9728);
            this.field10483.method918(this.field10480, (byte) 2);
            this.field10483.method911(-30670, this.field10473);
        }
        this.field10483.method875(2);
        this.field10483.method914(1, 0);
        this.field10483.method891(1, (byte) 17);
        this.field10483.method424();
        int var3 = 0;
        int var4 = 1;
        class604 var6;
        for (class604 var5 = (class604) this.field10468.method2765(-12261); var5 != null; var5 = var6) {
            var6 = (class604) this.field10468.method2759(-15361);
            int var7 = var5.method3392(-4867);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method807(this.field10491[var3], this.field10494, var8, (byte) 112);
                if (var6 == null && var7 - 1 == var8) {
                    this.field10483.method913(this.field10473, (byte) -127);
                    this.field10483.method956(0, 0, 8448);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field10484);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field10472, this.field10477);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field10472, this.field10484 + this.field10477);
                    OpenGL.glTexCoord2f((float) this.field10471, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field10472 + this.field10471, this.field10484 + this.field10477);
                    OpenGL.glTexCoord2f((float) this.field10471, (float) this.field10484);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field10472 + this.field10471, this.field10477);
                    OpenGL.glEnd();
                } else {
                    this.field10473.method1759(var4, 59);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field10484);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field10484);
                    OpenGL.glTexCoord2f((float) this.field10471, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field10471, this.field10484);
                    OpenGL.glTexCoord2f((float) this.field10471, (float) this.field10484);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field10471, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
                var5.method816(0, var8);
            }
        }
        this.field10475 = arg0;
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)V")
    private final void method4194(int arg0) {
        field10474++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = arg0;
        for (class604 var5 = (class604) this.field10468.method2765(-12261); var5 != null; var5 = (class604) this.field10468.method2759(-15361)) {
            int var9 = var5.method813((byte) 48);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method3392(-4867);
            var2 |= var5.method3390(arg0 ^ 0x2);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field10492 != var6) {
            this.field10493 = true;
            this.field10492 = var6;
        }
        int var7 = this.field10489 <= 2 ? this.field10489 : 2;
        int var8 = var4 <= 2 ? var4 : 2;
        if (var7 != var8) {
            this.field10488 = this.field10493 = true;
        }
        this.field10489 = var4;
        if (this.field10495 != var2) {
            this.field10495 = var2;
            this.field10490 = true;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIII)Z")
    public final boolean method4195(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10469++;
        if (this.field10467 == null || this.field10468.method2757((byte) 27)) {
            return false;
        }
        if (this.field10471 != arg1 || this.field10484 != arg2) {
            this.field10484 = arg2;
            this.field10471 = arg1;
            for (class189 var6 = this.field10468.method2765(-12261); var6 != this.field10468.field6565; var6 = var6.field2543) {
                ((class604) var6).method817(this.field10471, this.field10484, 11441);
            }
            this.field10490 = true;
            this.field10493 = true;
            this.field10488 = true;
        }
        if (!this.method4196((byte) 57)) {
            return arg4 > -95;
        }
        this.field10477 = arg0;
        this.field10475 = true;
        this.field10472 = arg3;
        this.field10483.method877((byte) -77, this.field10467);
        this.field10467.method1759(0, -87);
        this.field10483.method956(-this.field10472, this.field10484 + this.field10477 - this.field10483.field1658, 8448);
        return true;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)Z")
    private final boolean method4196(byte arg0) {
        field10486++;
        if (this.field10490) {
            if (this.field10487 != null) {
                this.field10487.method2071((byte) 97);
                this.field10487 = null;
            }
            if (this.field10494 != null) {
                this.field10494.method1286(true);
                this.field10494 = null;
            }
            if (this.field10480 != null) {
                this.field10487 = new class321(this.field10483, 6402, this.field10471, this.field10484, this.field10483.field1782);
            }
            if (this.field10495) {
                this.field10494 = new class615(this.field10483, 34037, 6402, this.field10471, this.field10484);
            } else if (this.field10487 == null) {
                this.field10487 = new class321(this.field10483, 6402, this.field10471, this.field10484);
            }
            this.field10490 = false;
            this.field10488 = true;
            this.field10497 = true;
        }
        if (this.field10493) {
            if (this.field10496 != null) {
                this.field10496.method2071((byte) 81);
                this.field10496 = null;
            }
            if (this.field10491[0] != null) {
                this.field10491[0].method1286(true);
                this.field10491[0] = null;
            }
            if (this.field10491[1] != null) {
                this.field10491[1].method1286(true);
                this.field10491[1] = null;
            }
            if (this.field10480 != null) {
                this.field10496 = new class321(this.field10483, this.field10492, this.field10471, this.field10484, this.field10483.field1782);
            }
            this.field10491[0] = new class615(this.field10483, 34037, this.field10492, this.field10471, this.field10484);
            this.field10491[1] = this.field10489 > 1 ? new class615(this.field10483, 34037, this.field10492, this.field10471, this.field10484) : null;
            this.field10488 = true;
            this.field10493 = false;
            this.field10497 = true;
        }
        if (this.field10488) {
            if (this.field10480 == null) {
                this.field10483.method877((byte) -122, this.field10473);
                this.field10473.method1761(1, 0);
                this.field10473.method1761(1, 1);
                this.field10473.method1761(arg0 ^ 0x38, 8);
                this.field10473.method1765(0, arg0 ^ 0x39, this.field10491[0]);
                if (this.field10489 > 1) {
                    this.field10473.method1765(1, 0, this.field10491[1]);
                }
                if (this.field10495) {
                    this.field10473.method1765(8, 0, this.field10494);
                } else {
                    this.field10473.method1762(8, 1, this.field10487);
                }
                this.field10483.method913(this.field10473, (byte) -128);
            } else {
                this.field10483.method877((byte) -58, this.field10473);
                this.field10473.method1761(1, 0);
                this.field10473.method1761(arg0 - 56, 1);
                this.field10473.method1761(1, 8);
                this.field10473.method1765(0, arg0 - 57, this.field10491[0]);
                if (this.field10489 > 1) {
                    this.field10473.method1765(1, arg0 ^ 0x39, this.field10491[1]);
                }
                if (this.field10495) {
                    this.field10473.method1765(8, 0, this.field10494);
                }
                this.field10483.method913(this.field10473, (byte) -128);
                this.field10483.method877((byte) -81, this.field10480);
                this.field10480.method1761(arg0 ^ 0x38, 0);
                this.field10480.method1761(arg0 - 56, 8);
                this.field10480.method1762(0, 1, this.field10496);
                this.field10480.method1762(8, arg0 - 56, this.field10487);
                this.field10483.method913(this.field10480, (byte) -128);
            }
            this.field10488 = false;
            this.field10497 = true;
        }
        if (this.field10497) {
            this.field10483.method877((byte) -125, this.field10467);
            this.field10497 = !this.field10467.method1749((byte) -116);
            this.field10483.method913(this.field10467, (byte) -127);
        }
        if (arg0 != 57) {
            this.method4196((byte) 65);
        }
        return !this.field10497;
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Leea;)V")
    public class753(class131 arg0) {
        this.field10483 = arg0;
        if (this.field10483.field1858 && this.field10483.field1906) {
            this.field10467 = this.field10473 = new class269(this.field10483);
            if (this.field10483.field1782 > 1 && this.field10483.field1874 && this.field10483.field1909) {
                this.field10467 = this.field10480 = new class269(this.field10483);
                return;
            }
        }
    }
}
