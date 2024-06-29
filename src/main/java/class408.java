import jaggl.OpenGL;
import java.awt.Color;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class408 {

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    private int field5654 = 1;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    private int field5658 = 1;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    private int field5666 = 0;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    private int field5671 = 0;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lfha;")
    private class522 field5663 = new class522();

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "Z")
    private boolean field5673 = false;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    private int field5676 = 0;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "Z")
    private boolean field5677 = true;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "Z")
    private boolean field5681 = true;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    private int field5680 = -1;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "[Lfq;")
    private class204[] field5684 = new class204[2];

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "Z")
    private boolean field5683 = true;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "Z")
    private boolean field5675 = true;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Lep;")
    private class371 field5653;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Ltea;")
    private class564 field5665;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Ltea;")
    private class564 field5659;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "Ltea;")
    private class564 field5669;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field5664 = new Hashtable();

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5670 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public static int field5682 = 2;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "Low;")
    public static class747 field5672 = new class747("", 17);

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "Lqk;")
    public static class148 field5685 = new class148(24, -1);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "Lfq;")
    private class204 field5679;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "Llf;")
    private class264 field5674;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "Llf;")
    private class264 field5678;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Z")
    private boolean field5661;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    private final void method2485(int arg0) {
        field5656++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class226 var5 = (class226) this.field5663.method3118((byte) 73); var5 != null; var5 = (class226) this.field5663.method3111(126)) {
            int var9 = var5.method876(1);
            var4 += var5.method1466(3180);
            if (var9 > var3) {
                var3 = var9;
            }
            var2 |= var5.method1467((byte) -90);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field5680 != var6) {
            this.field5683 = true;
            this.field5680 = var6;
        }
        int var7 = this.field5676 > 2 ? 2 : this.field5676;
        if (arg0 < 30) {
            this.field5665 = null;
        }
        int var8 = var4 <= 2 ? var4 : 2;
        this.field5676 = var4;
        if (var7 != var8) {
            this.field5675 = this.field5683 = true;
        }
        if (this.field5673 != var2) {
            this.field5681 = true;
            this.field5673 = var2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lgga;Z)V")
    public final void method2486(class226 arg0, boolean arg1) {
        if (!arg1) {
            this.field5677 = true;
        }
        field5668++;
        arg0.field3158 = false;
        arg0.method881(0);
        arg0.method3065(-17363);
        this.method2485(103);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIZ)Z")
    public final boolean method2487(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5657++;
        if (arg4) {
            this.field5681 = true;
        }
        if (this.field5659 == null || this.field5663.method3121((byte) -114)) {
            return false;
        }
        if (this.field5658 != arg1 || this.field5654 != arg2) {
            this.field5658 = arg1;
            this.field5654 = arg2;
            for (class513 var6 = this.field5663.method3118((byte) 73); var6 != this.field5663.field7324; var6 = var6.field7165) {
                ((class226) var6).method883(this.field5654, this.field5658, 24682);
            }
            this.field5675 = true;
            this.field5683 = true;
            this.field5681 = true;
        }
        if (!this.method2493(92)) {
            return false;
        }
        this.field5671 = arg3;
        this.field5666 = arg0;
        this.field5661 = true;
        this.field5653.method2182(this.field5659, (byte) -120);
        this.field5659.method3375(2, 0);
        this.field5653.method2227(this.field5671 + this.field5654 - this.field5653.field4894, 120, -this.field5666);
        return true;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lgga;I)Z")
    public final boolean method2488(class226 arg0, int arg1) {
        if (arg1 != 2) {
            this.method2493(-17);
        }
        field5660++;
        if (this.field5659 != null) {
            if (arg0.method879(-29164) || arg0.method882(3553)) {
                this.field5663.method3116(29066, arg0);
                this.method2485(arg1 ^ 0x50);
                if (this.method2493(arg1 ^ 0x4E)) {
                    if (this.field5658 != -1 && this.field5654 != -1) {
                        arg0.method883(this.field5654, this.field5658, 24682);
                    }
                    arg0.field3158 = true;
                    return true;
                }
            }
            this.method2486(arg0, true);
        }
        return false;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public final void method2489(int arg0) {
        int var2 = 98 % ((arg0 - 16) / 49);
        field5655++;
        if (!this.field5661) {
            return;
        }
        if (this.field5669 != null) {
            this.field5653.method2152(this.field5669, (byte) -75);
            int var3 = 16384;
            this.field5653.method2183(this.field5665, -23365);
            this.field5669.method3373((byte) 119, 0);
            this.field5665.method3375(2, 0);
            if (this.field5673) {
                var3 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field5658, this.field5654, 0, 0, this.field5658, this.field5654, var3, 9728);
            this.field5653.method2159(this.field5669, 89);
            this.field5653.method2133(this.field5665, (byte) 94);
        }
        this.field5653.method2185((byte) 78);
        this.field5653.method2121(0, 1);
        this.field5653.method2208(1, 6406);
        this.field5653.method2198();
        int var4 = 0;
        int var5 = 1;
        class226 var7;
        for (class226 var6 = (class226) this.field5663.method3118((byte) 73); var6 != null; var6 = var7) {
            var7 = (class226) this.field5663.method3111(118);
            int var8 = var6.method1466(3180);
            for (int var9 = 0; var9 < var8; var9++) {
                var6.method887(this.field5679, var9, this.field5684[var4], (byte) -121);
                if (var7 == null && var8 - 1 == var9) {
                    this.field5653.method2142((byte) -88, this.field5665);
                    this.field5653.method2227(0, 112, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5654);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5666, this.field5671);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5666, this.field5671 + this.field5654);
                    OpenGL.glTexCoord2f((float) this.field5658, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5666 + this.field5658, this.field5671 - -this.field5654);
                    OpenGL.glTexCoord2f((float) this.field5658, (float) this.field5654);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5666 + this.field5658, this.field5671);
                    OpenGL.glEnd();
                } else {
                    this.field5665.method3375(2, -(-var5));
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5654);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field5654);
                    OpenGL.glTexCoord2f((float) this.field5658, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5658, this.field5654);
                    OpenGL.glTexCoord2f((float) this.field5658, (float) this.field5654);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5658, 0);
                    OpenGL.glEnd();
                }
                var5 = var5 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
                var6.method885(false, var9);
            }
        }
        this.field5661 = false;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    public static void method2490(int arg0) {
        field5670 = null;
        field5664 = null;
        field5685 = null;
        field5672 = null;
        if (arg0 != 0) {
            field5670 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
    public final void method2491(int arg0) {
        this.field5659 = this.field5669 = this.field5665 = null;
        this.field5684 = null;
        field5652++;
        this.field5678 = null;
        this.field5674 = null;
        this.field5679 = null;
        if (!this.field5663.method3121((byte) -128)) {
            for (class513 var2 = this.field5663.method3118((byte) 73); var2 != this.field5663.field7324; var2 = var2.field7165) {
                ((class226) var2).method881(0);
            }
        }
        this.field5658 = this.field5654 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)Z")
    public final boolean method2492(int arg0) {
        int var2 = -30 % ((arg0 - 72) / 46);
        field5662++;
        return this.field5659 != null;
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)Z")
    private final boolean method2493(int arg0) {
        if (arg0 < 28) {
            return false;
        }
        if (this.field5681) {
            if (this.field5674 != null) {
                this.field5674.method1629(false);
                this.field5674 = null;
            }
            if (this.field5679 != null) {
                this.field5679.method2411(0);
                this.field5679 = null;
            }
            if (this.field5669 != null) {
                this.field5674 = new class264(this.field5653, 6402, this.field5658, this.field5654, this.field5653.field4940);
            }
            if (this.field5673) {
                this.field5679 = new class204(this.field5653, 34037, 6402, this.field5658, this.field5654);
            } else if (this.field5674 == null) {
                this.field5674 = new class264(this.field5653, 6402, this.field5658, this.field5654);
            }
            this.field5681 = false;
            this.field5675 = true;
            this.field5677 = true;
        }
        field5667++;
        if (this.field5683) {
            if (this.field5678 != null) {
                this.field5678.method1629(false);
                this.field5678 = null;
            }
            if (this.field5684[0] != null) {
                this.field5684[0].method2411(0);
                this.field5684[0] = null;
            }
            if (this.field5684[1] != null) {
                this.field5684[1].method2411(0);
                this.field5684[1] = null;
            }
            if (this.field5669 != null) {
                this.field5678 = new class264(this.field5653, this.field5680, this.field5658, this.field5654, this.field5653.field4940);
            }
            this.field5684[0] = new class204(this.field5653, 34037, this.field5680, this.field5658, this.field5654);
            this.field5684[1] = this.field5676 > 1 ? new class204(this.field5653, 34037, this.field5680, this.field5658, this.field5654) : null;
            this.field5675 = true;
            this.field5677 = true;
            this.field5683 = false;
        }
        if (this.field5675) {
            if (this.field5669 == null) {
                this.field5653.method2182(this.field5665, (byte) -91);
                this.field5665.method3372(0, 36009);
                this.field5665.method3372(1, 36009);
                this.field5665.method3372(8, 36009);
                this.field5665.method3370(-105, this.field5684[0], 0);
                if (this.field5676 > 1) {
                    this.field5665.method3370(-113, this.field5684[1], 1);
                }
                if (this.field5673) {
                    this.field5665.method3370(-115, this.field5679, 8);
                } else {
                    this.field5665.method3378(this.field5674, 8, false);
                }
                this.field5653.method2142((byte) -115, this.field5665);
            } else {
                this.field5653.method2182(this.field5665, (byte) 113);
                this.field5665.method3372(0, 36009);
                this.field5665.method3372(1, 36009);
                this.field5665.method3372(8, 36009);
                this.field5665.method3370(-77, this.field5684[0], 0);
                if (this.field5676 > 1) {
                    this.field5665.method3370(59, this.field5684[1], 1);
                }
                if (this.field5673) {
                    this.field5665.method3370(31, this.field5679, 8);
                }
                this.field5653.method2142((byte) -90, this.field5665);
                this.field5653.method2182(this.field5669, (byte) 52);
                this.field5669.method3372(0, 36009);
                this.field5669.method3372(8, 36009);
                this.field5669.method3378(this.field5678, 0, false);
                this.field5669.method3378(this.field5674, 8, false);
                this.field5653.method2142((byte) -74, this.field5669);
            }
            this.field5675 = false;
            this.field5677 = true;
        }
        if (this.field5677) {
            this.field5653.method2182(this.field5659, (byte) -107);
            this.field5677 = !this.field5659.method3377(96);
            this.field5653.method2142((byte) -102, this.field5659);
        }
        return !this.field5677;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lep;)V")
    public class408(class371 arg0) {
        this.field5653 = arg0;
        if (this.field5653.field5028 && this.field5653.field5001) {
            this.field5659 = this.field5665 = new class564(this.field5653);
            if (this.field5653.field4940 > 1 && this.field5653.field5012 && this.field5653.field5079) {
                this.field5659 = this.field5669 = new class564(this.field5653);
                return;
            }
        }
    }
}
