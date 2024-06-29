import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class412 {

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    private int field5806 = 0;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    private int field5799 = 0;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    private int field5809 = 1;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    private int field5810 = 1;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Lkba;")
    private class108 field5805 = new class108();

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "Z")
    private boolean field5826 = true;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    private int field5828 = -1;

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "Z")
    private boolean field5831 = true;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "Z")
    private boolean field5829 = true;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "[Laaa;")
    private class616[] field5832 = new class616[2];

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "Z")
    private boolean field5835 = true;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "Z")
    private boolean field5830 = false;

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
    private int field5833 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lac;")
    private class541 field5802;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Lrr;")
    private class365 field5804;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "Lrr;")
    private class365 field5801;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "Lrr;")
    private class365 field5813;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Lea;")
    public static class547 field5808 = new class547(63, 7);

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "Lea;")
    public static class547 field5818 = new class547(90, 10);

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "Llga;")
    public static class712 field5823 = new class712(55, 7);

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "D")
    public static double field5822;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "Lis;")
    private class503 field5825;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "Lis;")
    private class503 field5834;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "Laaa;")
    private class616 field5827;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rm", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field5836;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "Z")
    private boolean field5819;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Z")
    private final boolean method2368(int arg0) {
        field5815++;
        if (this.field5829) {
            if (this.field5825 != null) {
                this.field5825.method2804(arg0 ^ 0x5042);
                this.field5825 = null;
            }
            if (this.field5827 != null) {
                this.field5827.method1261(true);
                this.field5827 = null;
            }
            if (this.field5813 != null) {
                this.field5825 = new class503(this.field5802, 6402, this.field5810, this.field5809, this.field5802.field7521);
            }
            if (this.field5830) {
                this.field5827 = new class616(this.field5802, 34037, 6402, this.field5810, this.field5809);
            } else if (this.field5825 == null) {
                this.field5825 = new class503(this.field5802, 6402, this.field5810, this.field5809);
            }
            this.field5829 = false;
            this.field5826 = true;
            this.field5835 = true;
        }
        if (this.field5831) {
            if (this.field5834 != null) {
                this.field5834.method2804(0);
                this.field5834 = null;
            }
            if (this.field5832[0] != null) {
                this.field5832[0].method1261(true);
                this.field5832[0] = null;
            }
            if (this.field5832[1] != null) {
                this.field5832[1].method1261(true);
                this.field5832[1] = null;
            }
            if (this.field5813 != null) {
                this.field5834 = new class503(this.field5802, this.field5828, this.field5810, this.field5809, this.field5802.field7521);
            }
            this.field5832[0] = new class616(this.field5802, 34037, this.field5828, this.field5810, this.field5809);
            this.field5832[1] = this.field5833 <= 1 ? null : new class616(this.field5802, 34037, this.field5828, this.field5810, this.field5809);
            this.field5835 = true;
            this.field5831 = false;
            this.field5826 = true;
        }
        if (this.field5826) {
            if (this.field5813 == null) {
                this.field5802.method3041(true, this.field5804);
                this.field5804.method2094(0, true);
                this.field5804.method2094(1, true);
                this.field5804.method2094(8, true);
                this.field5804.method2084(0, this.field5832[0], 119);
                if (this.field5833 > 1) {
                    this.field5804.method2084(1, this.field5832[1], arg0 - 20431);
                }
                if (this.field5830) {
                    this.field5804.method2084(8, this.field5827, arg0 ^ 0x503B);
                } else {
                    this.field5804.method2100((byte) 115, 8, this.field5825);
                }
                this.field5802.method3050(this.field5804, -1);
            } else {
                this.field5802.method3041(true, this.field5804);
                this.field5804.method2094(0, true);
                this.field5804.method2094(1, true);
                this.field5804.method2094(8, true);
                this.field5804.method2084(0, this.field5832[0], arg0 ^ 0x5034);
                if (this.field5833 > 1) {
                    this.field5804.method2084(1, this.field5832[1], 127);
                }
                if (this.field5830) {
                    this.field5804.method2084(8, this.field5827, 113);
                }
                this.field5802.method3050(this.field5804, -1);
                this.field5802.method3041(true, this.field5813);
                this.field5813.method2094(0, true);
                this.field5813.method2094(8, true);
                this.field5813.method2100((byte) 78, 0, this.field5834);
                this.field5813.method2100((byte) 66, 8, this.field5825);
                this.field5802.method3050(this.field5813, -1);
            }
            this.field5835 = true;
            this.field5826 = false;
        }
        if (this.field5835) {
            this.field5802.method3041(true, this.field5801);
            this.field5835 = !this.field5801.method2097((byte) 74);
            this.field5802.method3050(this.field5801, -1);
        }
        if (arg0 == 20546) {
            return !this.field5835;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V")
    private final void method2369(int arg0) {
        field5821++;
        if (arg0 != 6408) {
            this.field5810 = 125;
        }
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class543 var5 = (class543) this.field5805.method724(32); var5 != null; var5 = (class543) this.field5805.method723(118)) {
            int var9 = var5.method3078(false);
            var4 += var5.method3082(arg0 - 6408);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method3080(-11);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field5828 != var6) {
            this.field5828 = var6;
            this.field5831 = true;
        }
        int var7 = this.field5833 > 2 ? 2 : this.field5833;
        int var8 = var4 > 2 ? 2 : var4;
        this.field5833 = var4;
        if (var2 != this.field5830) {
            this.field5830 = var2;
            this.field5829 = true;
        }
        if (var7 != var8) {
            this.field5826 = this.field5831 = true;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Llb;I)V")
    public final void method2370(class543 arg0, int arg1) {
        field5816++;
        arg0.field7691 = false;
        arg0.method3083((byte) -49);
        if (arg1 != -17722) {
            this.method2368(-66);
        }
        arg0.method315(59);
        this.method2369(arg1 + 24130);
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
    public final void method2371(int arg0) {
        field5812++;
        if (!this.field5819) {
            return;
        }
        if (this.field5813 != null) {
            this.field5802.method3012(0, this.field5813);
            int var2 = 16384;
            this.field5802.method2978(this.field5804, 0);
            this.field5813.method2089(-63, 0);
            this.field5804.method2098(0, 0);
            if (this.field5830) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field5810, this.field5809, 0, 0, this.field5810, this.field5809, var2, 9728);
            this.field5802.method2975(this.field5813, 19);
            this.field5802.method3023(122, this.field5804);
        }
        this.field5802.method2972((byte) -99);
        if (arg0 >= -114) {
            return;
        }
        this.field5802.method3013((byte) -99, 0);
        this.field5802.method3039(260, 1);
        this.field5802.method406();
        int var3 = 0;
        int var4 = 1;
        class543 var6;
        for (class543 var5 = (class543) this.field5805.method724(32); var5 != null; var5 = var6) {
            var6 = (class543) this.field5805.method723(127);
            int var7 = var5.method3082(0);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method3081(this.field5827, var8, (byte) -64, this.field5832[var3]);
                if (var6 == null && var7 - 1 == var8) {
                    this.field5802.method3050(this.field5804, -1);
                    this.field5802.method3031(0, 78, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5809);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5806, this.field5799);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5806, this.field5809 + this.field5799);
                    OpenGL.glTexCoord2f((float) this.field5810, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5810 + this.field5806, this.field5809 + this.field5799);
                    OpenGL.glTexCoord2f((float) this.field5810, (float) this.field5809);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5810 + this.field5806, this.field5799);
                    OpenGL.glEnd();
                } else {
                    this.field5804.method2098(0, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5809);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field5809);
                    OpenGL.glTexCoord2f((float) this.field5810, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5810, this.field5809);
                    OpenGL.glTexCoord2f((float) this.field5810, (float) this.field5809);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5810, 0);
                    OpenGL.glEnd();
                }
                var5.method3076(var8, (byte) 115);
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field5819 = false;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([Lgg;II)V")
    public static final void method2372(class176[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class176 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field2169;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field2169 < (var7 & 0x1) + var6) {
                class176 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2372(arg0, arg1, var4 - 1);
        method2372(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Llb;I)Z")
    public final boolean method2373(class543 arg0, int arg1) {
        field5811++;
        if (this.field5801 != null) {
            if (arg0.method3077(72) || arg0.method3073((byte) 81)) {
                this.field5805.method725(arg0, -20911);
                this.method2369(6408);
                if (this.method2368(20546)) {
                    if (this.field5810 != -1 && this.field5809 != -1) {
                        arg0.method3074(this.field5809, this.field5810, false);
                    }
                    arg0.field7691 = true;
                    return true;
                }
            }
            this.method2370(arg0, -17722);
        }
        int var3 = 79 % ((46 - arg1) / 52);
        return false;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIII)Z")
    public final boolean method2374(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            return false;
        }
        field5807++;
        if (this.field5801 == null || this.field5805.method726(-128)) {
            return false;
        }
        if (this.field5810 != arg0 || this.field5809 != arg2) {
            this.field5810 = arg0;
            this.field5809 = arg2;
            for (class55 var6 = this.field5805.method724(32); var6 != this.field5805.field1438; var6 = var6.field564) {
                ((class543) var6).method3074(this.field5809, this.field5810, false);
            }
            this.field5829 = true;
            this.field5826 = true;
            this.field5831 = true;
        }
        if (!this.method2368(20546)) {
            return false;
        }
        this.field5819 = true;
        this.field5806 = arg3;
        this.field5799 = arg1;
        this.field5802.method3041(true, this.field5801);
        this.field5801.method2098(0, 0);
        this.field5802.method3031(this.field5799 + this.field5809 - this.field5802.field7410, 61, -this.field5806);
        return true;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public final void method2375(byte arg0) {
        if (arg0 >= -116) {
            method2381(21);
        }
        this.field5801 = this.field5813 = this.field5804 = null;
        this.field5825 = null;
        this.field5834 = null;
        this.field5827 = null;
        field5814++;
        this.field5832 = null;
        if (!this.field5805.method726(-128)) {
            for (class55 var2 = this.field5805.method724(32); var2 != this.field5805.field1438; var2 = var2.field564) {
                ((class543) var2).method3083((byte) -93);
            }
        }
        this.field5810 = this.field5809 = 1;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;I)V")
    public static final void method2376(int arg0, Color arg1, Color arg2, Color arg3, String arg4, int arg5) {
        field5803++;
        try {
            Graphics var6 = class725.field10121.getGraphics();
            if (class3.field31 == null) {
                class3.field31 = new Font("Helvetica", 1, 13);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class165.field2066 == null) {
                    class165.field2066 = class725.field10121.createImage(class546.field7710, class512.field6932);
                }
                Graphics var7 = class165.field2066.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class546.field7710, class512.field6932);
                int var8 = class546.field7710 / 2 - 152;
                int var9 = class512.field6932 / 2 - 18;
                var7.setColor(arg1);
                if (arg5 == 90) {
                    var7.drawRect(var8, var9, 303, 33);
                    var7.setColor(arg2);
                    var7.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                    var7.fillRect(var8 + (arg0 * 3) + 2, var9 + 2, 300 - (arg0 * 3), 30);
                    var7.setFont(class3.field31);
                    var7.setColor(arg3);
                    var7.drawString(arg4, var8 + ((304 - (arg4.length() * 6)) / 2), var9 - -22);
                    if (class21.field148 != null) {
                        var7.setFont(class3.field31);
                        var7.setColor(arg3);
                        var7.drawString(class21.field148, class546.field7710 / 2 - class21.field148.length() * 6 / 2, class512.field6932 / 2 - 26);
                    }
                    var6.drawImage(class165.field2066, 0, 0, null);
                }
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class546.field7710, class512.field6932);
                int var10 = class546.field7710 / 2 - 152;
                int var11 = class512.field6932 / 2 - 18;
                var6.setColor(arg1);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg2);
                var6.fillRect(var10 + 2, var11 + 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg0 * 3 + var10 + 2, var11 + 2, 300 - (arg0 * 3), 30);
                var6.setFont(class3.field31);
                var6.setColor(arg3);
                if (class21.field148 != null) {
                    var6.setFont(class3.field31);
                    var6.setColor(arg3);
                    var6.drawString(class21.field148, class546.field7710 / 2 - (class21.field148.length() * 6 / 2), class512.field6932 / 2 + -26);
                }
                var6.drawString(arg4, var10 + ((304 - (arg4.length() * 6)) / 2), var11 - -22);
            }
        } catch (Exception var13) {
            class725.field10121.repaint();
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljha;IZLjha;ZII)I")
    public static final int method2377(class695 arg0, int arg1, boolean arg2, class695 arg3, boolean arg4, int arg5, int arg6) {
        field5824++;
        int var7 = class321.method1917(arg5, arg0, arg2, arg1 - 18, arg3);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            if (arg1 != 17) {
                method2379(4, 118, -28, 12, null, null);
            }
            int var8 = class321.method1917(arg6, arg0, arg4, -1, arg3);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)Z")
    public final boolean method2378(boolean arg0) {
        if (!arg0) {
            this.method2371(26);
        }
        field5820++;
        return this.field5801 != null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIILka;Loia;)V")
    public static final void method2379(int arg0, int arg1, int arg2, int arg3, class472 arg4, class90 arg5) {
        if (arg2 != 18) {
            method2379(-82, 96, 36, 122, null, null);
        }
        field5817++;
        if (arg4 != null) {
            arg5.method640(arg1, arg2 - 7427, arg4.method203(), arg4.method245(), arg4.method234(), arg4.method205(), arg3, arg4.method209(), arg4.method246(), arg4.method224(), arg0);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method2380(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5800++;
        if (!arg2) {
            method2376(-3, null, null, null, null, -95);
        }
        if (arg3 < 0 || arg4 < 0 || class272.field3589 - 1 <= arg3 || class3.field26 - 1 <= arg4) {
            return;
        }
        if (class77.field947 == null) {
            return;
        }
        if (arg7 != 0) {
            if (arg7 != 1) {
                if (arg7 == 2) {
                    class722 var9 = (class722) class300.method1797(arg5, arg3, arg4, field5836 == null ? (field5836 = method2382("rl")) : field5836);
                    if (var9 == null) {
                        return;
                    }
                    if (arg0 == 11) {
                        arg0 = 10;
                    }
                    if (var9 instanceof class536) {
                        ((class536) var9).field7272.method267(arg6, -102);
                        return;
                    }
                    class445.method2495(var9.method680(30472), arg4, arg7, arg1, arg5, -2, arg3, arg6, arg0);
                } else if (arg7 == 3) {
                    class722 var8 = (class722) class531.method2936(arg5, arg3, arg4);
                    if (var8 != null) {
                        if (!(var8 instanceof class98)) {
                            class445.method2495(var8.method680(30472), arg4, arg7, arg1, arg5, -2, arg3, arg6, arg0);
                            return;
                        }
                        ((class98) var8).field1300.method267(arg6, -53);
                        return;
                    }
                }
                return;
            }
            class722 var10 = (class722) class278.method1659(arg5, arg3, arg4);
            if (var10 == null) {
                return;
            }
            if (!(var10 instanceof class312)) {
                int var11 = var10.method680(30472);
                if (arg0 != 4 && arg0 != 5) {
                    if (arg0 != 6) {
                        if (arg0 == 7) {
                            class445.method2495(var11, arg4, arg7, (arg1 + 2 & 0x3) + 4, arg5, -2, arg3, arg6, 4);
                        } else if (arg0 == 8) {
                            class445.method2495(var11, arg4, arg7, arg1 + 4, arg5, -2, arg3, arg6, 4);
                            class445.method2495(var11, arg4, arg7, (arg1 + 2 & 0x3) + 4, arg5, -2, arg3, arg6, 4);
                            return;
                        }
                        return;
                    }
                    class445.method2495(var11, arg4, arg7, arg1 + 4, arg5, -2, arg3, arg6, 4);
                    return;
                }
                class445.method2495(var11, arg4, arg7, arg1, arg5, -2, arg3, arg6, 4);
                return;
            }
            ((class312) var10).field4214.method267(arg6, -86);
            return;
        }
        class722 var12 = (class722) class537.method2958(arg5, arg3, arg4);
        class722 var13 = (class722) class747.method4166(arg5, arg3, arg4);
        if (var12 != null && arg0 != 2) {
            if (var12 instanceof class534) {
                ((class534) var12).field7251.method267(arg6, -76);
            } else {
                class445.method2495(var12.method680(30472), arg4, arg7, arg1, arg5, -2, arg3, arg6, arg0);
            }
        }
        if (var13 == null) {
            return;
        }
        if (!(var13 instanceof class534)) {
            class445.method2495(var13.method680(30472), arg4, arg7, arg1, arg5, -2, arg3, arg6, arg0);
            return;
        }
        ((class534) var13).field7251.method267(arg6, -42);
        return;
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)V")
    public static void method2381(int arg0) {
        if (arg0 != 13) {
            method2376(-42, null, null, null, null, 60);
        }
        field5808 = null;
        field5823 = null;
        field5818 = null;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lac;)V")
    public class412(class541 arg0) {
        this.field5802 = arg0;
        if (this.field5802.field7671 && this.field5802.field7589) {
            this.field5801 = this.field5804 = new class365(this.field5802);
            if (this.field5802.field7521 > 1 && this.field5802.field7586 && this.field5802.field7635) {
                this.field5801 = this.field5813 = new class365(this.field5802);
                return;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2382(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
