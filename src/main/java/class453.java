import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class453 {

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    private int field6720 = 1;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
    private int field6730 = 0;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
    private int field6737 = 0;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
    private int field6734 = 1;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "Lmf;")
    private class291 field6736 = new class291();

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "Z")
    private boolean field6740 = true;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
    private int field6741 = 0;

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "Z")
    private boolean field6748 = true;

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
    private int field6749 = -1;

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "Z")
    private boolean field6745 = true;

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "Z")
    private boolean field6747 = false;

    @OriginalMember(owner = "client!sp", name = "C", descriptor = "[Lsq;")
    private class120[] field6744 = new class120[2];

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "Z")
    private boolean field6750 = true;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "Lda;")
    private class44 field6721;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "Lvn;")
    private class206 field6723;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "Lvn;")
    private class206 field6732;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "Lvn;")
    private class206 field6725;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "[C")
    public static char[] field6735 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "[I")
    public static int[] field6729 = new int[14];

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "Z")
    public static boolean field6733 = false;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "Lsq;")
    private class120 field6746;

    @OriginalMember(owner = "client!sp", name = "A", descriptor = "Lwa;")
    private class438 field6742;

    @OriginalMember(owner = "client!sp", name = "B", descriptor = "Lwa;")
    private class438 field6743;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "Lqr;")
    public static class48 field6727;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "Z")
    private boolean field6718;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lsu;B)Z", line = 4)
    public final boolean method2702(class142 arg0, byte arg1) {
        field6716++;
        if (this.field6732 != null) {
            if (arg0.method1053(-26280) || arg0.method1057(0)) {
                this.field6736.method1885(false, arg0);
                this.method2708(arg1 - 11);
                if (this.method2703(true)) {
                    if (this.field6734 != -1 && this.field6720 != -1) {
                        arg0.method1064(this.field6734, (byte) 75, this.field6720);
                    }
                    arg0.field2344 = true;
                    return true;
                }
            }
            this.method2710(arg0, 34842);
        }
        return arg1 != 11;
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lda;)V", line = 538)
    public class453(class44 arg0) {
        this.field6721 = arg0;
        if (this.field6721.field920 && this.field6721.field898) {
            this.field6732 = this.field6723 = new class206(this.field6721);
            if (this.field6721.field796 > 1 && this.field6721.field836 && this.field6721.field850) {
                this.field6732 = this.field6725 = new class206(this.field6721);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)Z", line = 51)
    private final boolean method2703(boolean arg0) {
        if (this.field6745) {
            if (this.field6743 != null) {
                this.field6743.method2615(38);
                this.field6743 = null;
            }
            if (this.field6746 != null) {
                this.field6746.method2341((byte) -124);
                this.field6746 = null;
            }
            if (this.field6725 != null) {
                this.field6743 = new class438(this.field6721, 6402, this.field6734, this.field6720, this.field6721.field796);
            }
            if (this.field6747) {
                this.field6746 = new class120(this.field6721, 34037, 6402, this.field6734, this.field6720);
            } else if (this.field6743 == null) {
                this.field6743 = new class438(this.field6721, 6402, this.field6734, this.field6720);
            }
            this.field6745 = false;
            this.field6750 = true;
            this.field6740 = true;
        }
        field6726++;
        if (this.field6748) {
            if (this.field6742 != null) {
                this.field6742.method2615(113);
                this.field6742 = null;
            }
            if (this.field6744[0] != null) {
                this.field6744[0].method2341((byte) -91);
                this.field6744[0] = null;
            }
            if (this.field6744[1] != null) {
                this.field6744[1].method2341((byte) -52);
                this.field6744[1] = null;
            }
            if (this.field6725 != null) {
                this.field6742 = new class438(this.field6721, this.field6749, this.field6734, this.field6720, this.field6721.field796);
            }
            this.field6744[0] = new class120(this.field6721, 34037, this.field6749, this.field6734, this.field6720);
            this.field6744[1] = this.field6741 > 1 ? new class120(this.field6721, 34037, this.field6749, this.field6734, this.field6720) : null;
            this.field6748 = false;
            this.field6740 = true;
            this.field6750 = true;
        }
        if (!arg0) {
            this.method2706(35, 96, false, -34, -17);
        }
        if (this.field6750) {
            if (this.field6725 == null) {
                this.field6721.method434(10902, this.field6723);
                this.field6723.method1409(0, -119);
                this.field6723.method1409(1, -52);
                this.field6723.method1409(8, -52);
                this.field6723.method1406(0, 0, this.field6744[0]);
                if (this.field6741 > 1) {
                    this.field6723.method1406(1, 0, this.field6744[1]);
                }
                if (this.field6747) {
                    this.field6723.method1406(8, 0, this.field6746);
                } else {
                    this.field6723.method1407(8, 0, this.field6743);
                }
                this.field6721.method354(this.field6723, true);
            } else {
                this.field6721.method434(10902, this.field6723);
                this.field6723.method1409(0, -55);
                this.field6723.method1409(1, -111);
                this.field6723.method1409(8, -54);
                this.field6723.method1406(0, 0, this.field6744[0]);
                if (this.field6741 > 1) {
                    this.field6723.method1406(1, 0, this.field6744[1]);
                }
                if (this.field6747) {
                    this.field6723.method1406(8, 0, this.field6746);
                }
                this.field6721.method354(this.field6723, true);
                this.field6721.method434(10902, this.field6725);
                this.field6725.method1409(0, -61);
                this.field6725.method1409(8, -46);
                this.field6725.method1407(0, 0, this.field6742);
                this.field6725.method1407(8, 0, this.field6743);
                this.field6721.method354(this.field6725, true);
            }
            this.field6740 = true;
            this.field6750 = false;
        }
        if (this.field6740) {
            this.field6721.method434(10902, this.field6732);
            this.field6740 = !this.field6732.method1413(!arg0);
            this.field6721.method354(this.field6732, true);
        }
        return !this.field6740;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 180)
    public final void method2704(int arg0) {
        field6719++;
        this.field6743 = null;
        this.field6742 = null;
        if (arg0 <= 56) {
            this.method2703(false);
        }
        this.field6744 = null;
        this.field6746 = null;
        this.field6732 = this.field6725 = this.field6723 = null;
        if (!this.field6736.method1889((byte) -118)) {
            for (class261 var2 = this.field6736.method1892(120); var2 != this.field6736.field4458; var2 = var2.field3972) {
                ((class142) var2).method1061(0);
            }
        }
        this.field6734 = this.field6720 = 1;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Llb;Z)Z", line = 210)
    public static final boolean method2705(class383 arg0, boolean arg1) {
        if (arg1) {
            field6722++;
            return class428.field6410 == arg0 || class436.field6492 == arg0 || class515.field7472 == arg0 || class38.field557 == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIZII)Z", line = 226)
    public final boolean method2706(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field6724++;
        if (this.field6732 == null || this.field6736.method1889((byte) -117)) {
            return false;
        }
        if (this.field6734 != arg1 || this.field6720 != arg3) {
            this.field6720 = arg3;
            this.field6734 = arg1;
            for (class261 var6 = this.field6736.method1892(86); var6 != this.field6736.field4458; var6 = var6.field3972) {
                ((class142) var6).method1064(this.field6734, (byte) 70, this.field6720);
            }
            this.field6748 = true;
            this.field6745 = true;
            this.field6750 = true;
        }
        if (arg2) {
            method2711((byte) 90);
        }
        if (!this.method2703(true)) {
            return false;
        }
        this.field6730 = arg4;
        this.field6737 = arg0;
        this.field6718 = true;
        this.field6721.method434(10902, this.field6732);
        this.field6732.method1408(-1, 0);
        this.field6721.method276(-this.field6737, -1, this.field6720 - this.field6732.method1415(-84) - this.field6730);
        return true;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V", line = 272)
    public final void method2707(int arg0) {
        if (arg0 != 13852) {
            this.method2706(54, -70, false, -71, -118);
        }
        field6738++;
        if (!this.field6718) {
            return;
        }
        if (this.field6725 != null) {
            int var2 = 16384;
            this.field6721.method410(false, this.field6725);
            this.field6721.method401(this.field6723, -10504);
            this.field6725.method1416(-1, 0);
            this.field6723.method1408(-1, 0);
            if (this.field6747) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field6734, this.field6720, 0, 0, this.field6734, this.field6720, var2, 9728);
            this.field6721.method416(-21, this.field6725);
            this.field6721.method295(-121, this.field6723);
        }
        this.field6721.method315((byte) -37);
        this.field6721.method340((byte) -116, 0);
        this.field6721.method288((byte) -114, 1);
        this.field6721.method321();
        int var3 = 0;
        int var4 = 1;
        class142 var6;
        for (class142 var5 = (class142) this.field6736.method1892(112); var5 != null; var5 = var6) {
            var6 = (class142) this.field6736.method1893((byte) -2);
            int var7 = var5.method1058(arg0 ^ 0xFFFFFA6F);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1055(this.field6746, this.field6744[var3], var8, (byte) 4);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field6721.method354(this.field6723, true);
                    this.field6721.method276(0, -1, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6720);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6737, this.field6730);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6737, this.field6730 + this.field6720);
                    OpenGL.glTexCoord2f((float) this.field6734, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6737 + this.field6734, this.field6730 + this.field6720);
                    OpenGL.glTexCoord2f((float) this.field6734, (float) this.field6720);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6737 + this.field6734, this.field6730);
                    OpenGL.glEnd();
                } else {
                    this.field6723.method1408(-1, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6720);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field6720);
                    OpenGL.glTexCoord2f((float) this.field6734, (float) this.field6720);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6734, this.field6720);
                    OpenGL.glTexCoord2f((float) this.field6734, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6734, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
                var5.method1060(var8, true);
            }
        }
        this.field6718 = false;
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V", line = 376)
    private final void method2708(int arg0) {
        field6739++;
        boolean var2 = false;
        int var3 = arg0;
        int var4 = 0;
        for (class142 var5 = (class142) this.field6736.method1892(116); var5 != null; var5 = (class142) this.field6736.method1893((byte) -2)) {
            int var9 = var5.method1056(0);
            if (var3 < var9) {
                var3 = var9;
            }
            var4 += var5.method1058(-13197);
            var2 |= var5.method1059((byte) 58);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field6749 != var6) {
            this.field6748 = true;
            this.field6749 = var6;
        }
        int var7 = this.field6741 <= 2 ? this.field6741 : 2;
        int var8 = var4 <= 2 ? var4 : 2;
        if (var7 != var8) {
            this.field6750 = this.field6748 = true;
        }
        if (this.field6747 != var2) {
            this.field6747 = var2;
            this.field6745 = true;
        }
        this.field6741 = var4;
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)Z", line = 440)
    public final boolean method2709(int arg0) {
        field6731++;
        int var2 = -5 / ((-arg0 - 57) / 48);
        return this.field6732 != null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lsu;I)V", line = 450)
    public final void method2710(class142 arg0, int arg1) {
        arg0.field2344 = false;
        if (arg1 != 34842) {
            method2705(null, true);
        }
        field6717++;
        arg0.method1061(0);
        arg0.method1676(true);
        this.method2708(0);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V", line = 469)
    public static void method2711(byte arg0) {
        field6735 = null;
        field6729 = null;
        field6727 = null;
        if (arg0 > -117) {
            field6733 = true;
        }
    }
}
