import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class459 {

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    private int field5716 = 0;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
    private int field5727 = 1;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
    private int field5725 = 1;

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
    private int field5732 = 0;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "Lws;")
    private class333 field5731 = new class333();

    @OriginalMember(owner = "client!mw", name = "w", descriptor = "Z")
    private boolean field5734 = true;

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "Z")
    private boolean field5733 = true;

    @OriginalMember(owner = "client!mw", name = "C", descriptor = "Z")
    private boolean field5740 = false;

    @OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
    private int field5735 = -1;

    @OriginalMember(owner = "client!mw", name = "E", descriptor = "Z")
    private boolean field5742 = true;

    @OriginalMember(owner = "client!mw", name = "A", descriptor = "Z")
    private boolean field5738 = true;

    @OriginalMember(owner = "client!mw", name = "B", descriptor = "[Lco;")
    private class109[] field5739 = new class109[2];

    @OriginalMember(owner = "client!mw", name = "F", descriptor = "I")
    private int field5743 = 0;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "Ljaa;")
    private class576 field5714;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "Lds;")
    private class14 field5729;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "Lds;")
    private class14 field5718;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "Lds;")
    private class14 field5715;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
    public static int field5722 = 0;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!mw", name = "D", descriptor = "Lco;")
    private class109 field5741;

    @OriginalMember(owner = "client!mw", name = "y", descriptor = "Lhc;")
    private class130 field5736;

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "Lhc;")
    private class130 field5737;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "Z")
    private boolean field5723;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILbg;)V")
    public final void method2523(int arg0, class433 arg1) {
        arg1.field5461 = false;
        field5730++;
        arg1.method2385(arg0 ^ 0x1);
        arg1.method1566(-109);
        this.method2525(arg0);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)Z")
    private final boolean method2524(int arg0) {
        field5728++;
        if (this.field5742) {
            if (this.field5737 != null) {
                this.field5737.method841(0);
                this.field5737 = null;
            }
            if (this.field5741 != null) {
                this.field5741.method1097(true);
                this.field5741 = null;
            }
            if (this.field5715 != null) {
                this.field5737 = new class130(this.field5714, 6402, this.field5725, this.field5727, this.field5714.field7560);
            }
            if (this.field5740) {
                this.field5741 = new class109(this.field5714, 34037, 6402, this.field5725, this.field5727);
            } else if (this.field5737 == null) {
                this.field5737 = new class130(this.field5714, 6402, this.field5725, this.field5727);
            }
            this.field5734 = true;
            this.field5733 = true;
            this.field5742 = false;
        }
        if (this.field5738) {
            if (this.field5736 != null) {
                this.field5736.method841(0);
                this.field5736 = null;
            }
            if (this.field5739[0] != null) {
                this.field5739[0].method1097(true);
                this.field5739[0] = null;
            }
            if (this.field5739[1] != null) {
                this.field5739[1].method1097(true);
                this.field5739[1] = null;
            }
            if (this.field5715 != null) {
                this.field5736 = new class130(this.field5714, this.field5735, this.field5725, this.field5727, this.field5714.field7560);
            }
            this.field5739[0] = new class109(this.field5714, 34037, this.field5735, this.field5725, this.field5727);
            this.field5739[1] = this.field5743 <= 1 ? null : new class109(this.field5714, 34037, this.field5735, this.field5725, this.field5727);
            this.field5733 = true;
            this.field5734 = true;
            this.field5738 = false;
        }
        if (this.field5733) {
            if (this.field5715 == null) {
                this.field5714.method3119(this.field5729, -2015);
                this.field5729.method81(0, (byte) -76);
                this.field5729.method81(1, (byte) 118);
                this.field5729.method81(8, (byte) 103);
                this.field5729.method72(-27902, 0, this.field5739[0]);
                if (this.field5743 > 1) {
                    this.field5729.method72(-27902, 1, this.field5739[1]);
                }
                if (this.field5740) {
                    this.field5729.method72(-27902, 8, this.field5741);
                } else {
                    this.field5729.method64(8, 1, this.field5737);
                }
                this.field5714.method3164(-52, this.field5729);
            } else {
                this.field5714.method3119(this.field5729, -2015);
                this.field5729.method81(0, (byte) -126);
                this.field5729.method81(1, (byte) 85);
                this.field5729.method81(8, (byte) 90);
                this.field5729.method72(-27902, 0, this.field5739[0]);
                if (this.field5743 > 1) {
                    this.field5729.method72(-27902, 1, this.field5739[1]);
                }
                if (this.field5740) {
                    this.field5729.method72(-27902, 8, this.field5741);
                }
                this.field5714.method3164(-45, this.field5729);
                this.field5714.method3119(this.field5715, -2015);
                this.field5715.method81(0, (byte) -39);
                this.field5715.method81(8, (byte) -113);
                this.field5715.method64(0, arg0 ^ 0x1, this.field5736);
                this.field5715.method64(8, 1, this.field5737);
                this.field5714.method3164(-113, this.field5715);
            }
            this.field5733 = false;
            this.field5734 = true;
        }
        if (arg0 != 0) {
            this.method2530(-92);
        }
        if (this.field5734) {
            this.field5714.method3119(this.field5718, -2015);
            this.field5734 = !this.field5718.method67(-104);
            this.field5714.method3164(arg0 - 43, this.field5718);
        }
        return !this.field5734;
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
    private final void method2525(int arg0) {
        field5713++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = arg0;
        for (class433 var5 = (class433) this.field5731.method1909(true); var5 != null; var5 = (class433) this.field5731.method1916((byte) 87)) {
            int var9 = var5.method2376(-124);
            var4 += var5.method2377(arg0 ^ 0xFFFFF576);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method2374(-20450);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field5735 != var6) {
            this.field5735 = var6;
            this.field5738 = true;
        }
        int var7 = this.field5743 > 2 ? 2 : this.field5743;
        int var8 = var4 > 2 ? 2 : var4;
        if (var7 != var8) {
            this.field5733 = this.field5738 = true;
        }
        this.field5743 = var4;
        if (this.field5740 != var2) {
            this.field5742 = true;
            this.field5740 = var2;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
    public final void method2526(byte arg0) {
        field5717++;
        if (!this.field5723) {
            return;
        }
        if (this.field5715 != null) {
            this.field5714.method3132(this.field5715, (byte) -44);
            int var2 = 16384;
            this.field5714.method3157(this.field5729, false);
            this.field5715.method74(0, 4);
            this.field5729.method69(-84, 0);
            if (this.field5740) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field5725, this.field5727, 0, 0, this.field5725, this.field5727, var2, 9728);
            this.field5714.method3143(this.field5715, -3);
            this.field5714.method3176(-119, this.field5729);
        }
        this.field5714.method3115((byte) 77);
        this.field5714.method3146(7261, 0);
        this.field5714.method3134(117, 1);
        this.field5714.method410();
        int var3 = 0;
        int var4 = 1;
        class433 var6;
        for (class433 var5 = (class433) this.field5731.method1909(true); var5 != null; var5 = var6) {
            var6 = (class433) this.field5731.method1916((byte) 118);
            int var7 = var5.method2377(-2698);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method2380(false, this.field5741, var8, this.field5739[var3]);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field5714.method3164(-66, this.field5729);
                    this.field5714.method3188(0, 0, 3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5727);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5716, this.field5732);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5716, this.field5732 + this.field5727);
                    OpenGL.glTexCoord2f((float) this.field5725, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5716 + this.field5725, this.field5732 + this.field5727);
                    OpenGL.glTexCoord2f((float) this.field5725, (float) this.field5727);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5716 + this.field5725, this.field5732);
                    OpenGL.glEnd();
                } else {
                    this.field5729.method69(-101, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5727);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field5727);
                    OpenGL.glTexCoord2f((float) this.field5725, (float) this.field5727);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5725, this.field5727);
                    OpenGL.glTexCoord2f((float) this.field5725, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5725, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5.method2382(var8, (byte) 60);
                var3 = var3 + 1 & 0x1;
            }
        }
        if (arg0 <= 57) {
            this.field5736 = null;
        }
        this.field5723 = false;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lbg;B)Z")
    public final boolean method2527(class433 arg0, byte arg1) {
        field5719++;
        int var3 = 74 % ((arg1 + 21) / 36);
        if (this.field5718 != null) {
            if (arg0.method2383(1) || arg0.method2378(true)) {
                this.field5731.method1904(arg0, -58);
                this.method2525(0);
                if (this.method2524(0)) {
                    if (this.field5725 != -1 && this.field5727 != -1) {
                        arg0.method2384(this.field5725, 121, this.field5727);
                    }
                    arg0.field5461 = true;
                    return true;
                }
            }
            this.method2523(0, arg0);
        }
        return false;
    }

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)V")
    public final void method2528(int arg0) {
        this.field5718 = this.field5715 = this.field5729 = null;
        this.field5736 = null;
        this.field5737 = null;
        this.field5741 = null;
        this.field5739 = null;
        field5720++;
        int var2 = 13 / ((arg0 - 68) / 51);
        if (!this.field5731.method1908((byte) -72)) {
            for (class263 var3 = this.field5731.method1909(true); var3 != this.field5731.field4121; var3 = var3.field3320) {
                ((class433) var3).method2385(1);
            }
        }
        this.field5725 = this.field5727 = 1;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIII)Z")
    public final boolean method2529(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5726++;
        if (this.field5718 == null || this.field5731.method1908((byte) -113)) {
            return false;
        } else if (arg2 < 30) {
            return true;
        } else {
            if (this.field5725 != arg0 || this.field5727 != arg3) {
                this.field5727 = arg3;
                this.field5725 = arg0;
                for (class263 var6 = this.field5731.method1909(true); var6 != this.field5731.field4121; var6 = var6.field3320) {
                    ((class433) var6).method2384(this.field5725, 121, this.field5727);
                }
                this.field5738 = true;
                this.field5733 = true;
                this.field5742 = true;
            }
            if (!this.method2524(0)) {
                return false;
            }
            this.field5723 = true;
            this.field5732 = arg4;
            this.field5716 = arg1;
            this.field5714.method3119(this.field5718, -2015);
            this.field5718.method69(-112, 0);
            this.field5714.method3188(-this.field5716, this.field5732 + this.field5727 - this.field5714.field7403, 3);
            return true;
        }
    }

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "(I)Z")
    public final boolean method2530(int arg0) {
        if (arg0 < 43) {
            return true;
        } else {
            field5721++;
            return this.field5718 != null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Ljaa;)V")
    public class459(class576 arg0) {
        this.field5714 = arg0;
        if (this.field5714.field7667 && this.field5714.field7651) {
            this.field5718 = this.field5729 = new class14(this.field5714);
            if (this.field5714.field7560 > 1 && this.field5714.field7686 && this.field5714.field7727) {
                this.field5718 = this.field5715 = new class14(this.field5714);
                return;
            }
        }
    }
}
