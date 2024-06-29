import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class43 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    private int field624 = 0;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    private int field636 = 1;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    private int field638 = 0;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    private int field627 = 1;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Ldc;")
    private class302 field626 = new class302();

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Z")
    private boolean field648 = false;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Z")
    private boolean field647 = true;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    private int field650 = -1;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "Z")
    private boolean field653 = true;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[Laaa;")
    private class227[] field657 = new class227[2];

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Z")
    private boolean field656 = true;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    private int field651 = 0;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Z")
    private boolean field655 = true;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Luca;")
    private class287 field634;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lffa;")
    private class559 field635;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lffa;")
    private class559 field623;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lffa;")
    private class559 field643;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field622 = -2;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field641 = 0;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lqg;")
    public static class271 field644 = new class271("LIVE", 0);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Laaa;")
    private class227 field654;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Ldh;")
    private class267 field649;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "Ldh;")
    private class267 field652;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lmv;")
    public static class295 field625;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Z")
    private boolean field632;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lff;Z)V", line = 6)
    public final void method242(class276 arg0, boolean arg1) {
        arg0.field3598 = false;
        field645++;
        arg0.method1645(arg1);
        arg0.method2360((byte) 66);
        this.method250((byte) 109);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 17)
    public static void method243(int arg0) {
        if (arg0 != 0) {
            method243(51);
        }
        field625 = null;
        field644 = null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Luca;)V", line = 600)
    public class43(class287 arg0) {
        this.field634 = arg0;
        if (this.field634.field4062 && this.field634.field4132) {
            this.field623 = this.field635 = new class559(this.field634);
            if (this.field634.field4006 > 1 && this.field634.field4098 && this.field634.field4138) {
                this.field623 = this.field643 = new class559(this.field634);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([[[Lms;Z)V", line = 35)
    public static final void method244(class44[][][] arg0, boolean arg1) {
        int var2 = 0;
        if (!arg1) {
            field646 = 126;
        }
        while (arg0.length > var2) {
            class44[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class44 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field672 instanceof class83) {
                            ((class83) var6.field672).method276(113);
                        }
                        if (var6.field669 instanceof class83) {
                            ((class83) var6.field669).method276(121);
                        }
                        if (var6.field675 instanceof class83) {
                            ((class83) var6.field675).method276(97);
                        }
                        if (var6.field668 instanceof class83) {
                            ((class83) var6.field668).method276(76);
                        }
                        if (var6.field670 instanceof class83) {
                            ((class83) var6.field670).method276(69);
                        }
                        for (class361 var7 = var6.field667; var7 != null; var7 = var7.field5299) {
                            class293 var8 = var7.field5301;
                            if (var8 instanceof class83) {
                                ((class83) var8).method276(106);
                            }
                        }
                    }
                }
            }
            var2++;
        }
        field639++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Z", line = 108)
    private final boolean method245(boolean arg0) {
        if (this.field647) {
            if (this.field652 != null) {
                this.field652.method1599(36161);
                this.field652 = null;
            }
            if (this.field654 != null) {
                this.field654.method2922(0);
                this.field654 = null;
            }
            if (this.field643 != null) {
                this.field652 = new class267(this.field634, 6402, this.field636, this.field627, this.field634.field4006);
            }
            if (this.field648) {
                this.field654 = new class227(this.field634, 34037, 6402, this.field636, this.field627);
            } else if (this.field652 == null) {
                this.field652 = new class267(this.field634, 6402, this.field636, this.field627);
            }
            this.field647 = false;
            this.field653 = true;
            this.field656 = true;
        }
        field633++;
        if (this.field655) {
            if (this.field649 != null) {
                this.field649.method1599(36161);
                this.field649 = null;
            }
            if (this.field657[0] != null) {
                this.field657[0].method2922(0);
                this.field657[0] = null;
            }
            if (this.field657[1] != null) {
                this.field657[1].method2922(0);
                this.field657[1] = null;
            }
            if (this.field643 != null) {
                this.field649 = new class267(this.field634, this.field650, this.field636, this.field627, this.field634.field4006);
            }
            this.field657[0] = new class227(this.field634, 34037, this.field650, this.field636, this.field627);
            this.field657[1] = this.field651 <= 1 ? null : new class227(this.field634, 34037, this.field650, this.field636, this.field627);
            this.field655 = false;
            this.field656 = true;
            this.field653 = true;
        }
        if (this.field653) {
            if (this.field643 == null) {
                this.field634.method1740(this.field635, (byte) 115);
                this.field635.method3244(0, 36009);
                this.field635.method3244(1, 36009);
                this.field635.method3244(8, 36009);
                this.field635.method3235(-88, this.field657[0], 0);
                if (this.field651 > 1) {
                    this.field635.method3235(103, this.field657[1], 1);
                }
                if (this.field648) {
                    this.field635.method3235(67, this.field654, 8);
                } else {
                    this.field635.method3239(this.field652, 8, false);
                }
                this.field634.method1695(this.field635, 255);
            } else {
                this.field634.method1740(this.field635, (byte) 124);
                this.field635.method3244(0, 36009);
                this.field635.method3244(1, 36009);
                this.field635.method3244(8, 36009);
                this.field635.method3235(52, this.field657[0], 0);
                if (this.field651 > 1) {
                    this.field635.method3235(78, this.field657[1], 1);
                }
                if (this.field648) {
                    this.field635.method3235(-124, this.field654, 8);
                }
                this.field634.method1695(this.field635, 255);
                this.field634.method1740(this.field643, (byte) 116);
                this.field643.method3244(0, 36009);
                this.field643.method3244(8, 36009);
                this.field643.method3239(this.field649, 0, false);
                this.field643.method3239(this.field652, 8, !arg0);
                this.field634.method1695(this.field643, 255);
            }
            this.field653 = false;
            this.field656 = true;
        }
        if (this.field656) {
            this.field634.method1740(this.field623, (byte) 119);
            this.field656 = !this.field623.method3238(123);
            this.field634.method1695(this.field623, 255);
        }
        if (arg0) {
            return !this.field656;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILff;)Z", line = 243)
    public final boolean method246(int arg0, class276 arg1) {
        if (arg0 < 113) {
            this.field647 = true;
        }
        field631++;
        if (this.field623 != null) {
            if (arg1.method1636(-76) || arg1.method1643((byte) 59)) {
                this.field626.method1909(arg1, (byte) -81);
                this.method250((byte) 118);
                if (this.method245(true)) {
                    if (this.field636 != -1 && this.field627 != -1) {
                        arg1.method1639((byte) 46, this.field636, this.field627);
                    }
                    arg1.field3598 = true;
                    return true;
                }
            }
            this.method242(arg1, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 281)
    public final void method247(int arg0) {
        this.field652 = null;
        this.field623 = this.field643 = this.field635 = null;
        this.field649 = null;
        this.field657 = null;
        this.field654 = null;
        if (arg0 > -60) {
            return;
        }
        field637++;
        if (!this.field626.method1903(-64)) {
            for (class381 var2 = this.field626.method1904(false); var2 != this.field626.field4475; var2 = var2.field5737) {
                ((class276) var2).method1645(false);
            }
        }
        this.field636 = this.field627 = 1;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)Z", line = 321)
    public final boolean method248(int arg0) {
        if (arg0 != 1) {
            this.method242(null, false);
        }
        field628++;
        return this.field623 != null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBI)Z", line = 337)
    public final boolean method249(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field629++;
        if (this.field623 == null || this.field626.method1903(-78)) {
            return false;
        }
        int var6 = 58 % ((arg3 - 39) / 60);
        if (this.field636 != arg2 || this.field627 != arg1) {
            this.field627 = arg1;
            this.field636 = arg2;
            for (class381 var7 = this.field626.method1904(false); var7 != this.field626.field4475; var7 = var7.field5737) {
                ((class276) var7).method1639((byte) 79, this.field636, this.field627);
            }
            this.field653 = true;
            this.field647 = true;
            this.field655 = true;
        }
        if (!this.method245(true)) {
            return false;
        }
        this.field638 = arg0;
        this.field624 = arg4;
        this.field632 = true;
        this.field634.method1740(this.field623, (byte) 121);
        this.field623.method3245(0, 65);
        this.field634.method1764(-this.field624, (byte) -45, this.field638 + this.field627 - this.field634.field3959);
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 383)
    private final void method250(byte arg0) {
        field640++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class276 var5 = (class276) this.field626.method1904(false); var5 != null; var5 = (class276) this.field626.method1901(105)) {
            int var9 = var5.method1642(1);
            var4 += var5.method1634((byte) 121);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method1640((byte) 62);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field650 != var6) {
            this.field655 = true;
            this.field650 = var6;
        }
        if (arg0 < 108) {
            return;
        }
        int var7 = this.field651 <= 2 ? this.field651 : 2;
        int var8 = var4 <= 2 ? var4 : 2;
        if (var7 != var8) {
            this.field653 = this.field655 = true;
        }
        if (var2 != this.field648) {
            this.field647 = true;
            this.field648 = var2;
        }
        this.field651 = var4;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 452)
    public final void method251(boolean arg0) {
        if (!arg0) {
            return;
        }
        field642++;
        if (!this.field632) {
            return;
        }
        if (this.field643 != null) {
            int var2 = 16384;
            this.field634.method1725(false, this.field643);
            this.field634.method1700(this.field635, 70);
            this.field643.method3246(-3, 0);
            this.field635.method3245(0, -94);
            if (this.field648) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field636, this.field627, 0, 0, this.field636, this.field627, var2, 9728);
            this.field634.method1699(this.field643, 3);
            this.field634.method1692(-1, this.field635);
        }
        this.field634.method1748(2);
        this.field634.method1721(101, 0);
        this.field634.method1751(1, 21575);
        this.field634.method699();
        int var3 = 0;
        int var4 = 1;
        class276 var6;
        for (class276 var5 = (class276) this.field626.method1904(!arg0); var5 != null; var5 = var6) {
            var6 = (class276) this.field626.method1901(111);
            int var7 = var5.method1634((byte) 127);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1646(this.field654, this.field657[var3], var8, -26006);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field634.method1695(this.field635, 255);
                    this.field634.method1764(0, (byte) -45, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field627);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field624, this.field638);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field624, this.field638 + this.field627);
                    OpenGL.glTexCoord2f((float) this.field636, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field636 + this.field624, this.field638 + this.field627);
                    OpenGL.glTexCoord2f((float) this.field636, (float) this.field627);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field624 + this.field636, this.field638);
                    OpenGL.glEnd();
                } else {
                    this.field635.method3245(-(-var4), -106);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field627);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field627);
                    OpenGL.glTexCoord2f((float) this.field636, (float) this.field627);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field636, this.field627);
                    OpenGL.glTexCoord2f((float) this.field636, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field636, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var5.method1638((byte) -114, var8);
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field632 = false;
    }
}
