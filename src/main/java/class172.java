import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class172 extends class53 {

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "Z")
    public boolean field2851 = false;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
    private int field2852 = 0;

    @OriginalMember(owner = "client!wm", name = "X", descriptor = "Z")
    public boolean field2870 = true;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "Lgl;")
    public class214 field2845;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "Lvf;")
    public class341 field2857;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "Ldi;")
    public class170 field2836;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "J")
    private long field2834;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "Lhm;")
    public class24 field2846;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    private int field2835;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    private int field2838;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    private int field2839;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    private int field2840;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    private int field2841;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    private int field2843;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
    private int field2847;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
    private int field2848;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
    private int field2849;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
    private int field2850;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "I")
    private int field2853;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    private int field2859;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "I")
    private int field2860;

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    private int field2861;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    public int field2863;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "I")
    public int field2864;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "I")
    private int field2865;

    @OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
    public int field2867;

    @OriginalMember(owner = "client!wm", name = "V", descriptor = "I")
    private int field2868;

    @OriginalMember(owner = "client!wm", name = "W", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "[I")
    public static int[] field2862;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "[Ltk;")
    public static class278[] field2842;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V", line = 4)
    public static void method1220(byte arg0) {
        field2842 = null;
        if (arg0 != -79) {
            method1220((byte) -21);
        }
        field2862 = null;
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)Z", line = 25)
    public static final boolean method1221(int arg0, int arg1) {
        if (arg1 != 0) {
            method1220((byte) -112);
        }
        field2854++;
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;ILjava/awt/Color;Z)V", line = 41)
    public static final void method1222(int arg0, String arg1, int arg2, Color arg3, boolean arg4) {
        field2844++;
        try {
            Graphics var5 = class209.field3489.getGraphics();
            if (class201.field3370 == null) {
                class201.field3370 = new Font("Helvetica", 1, 13);
                class346.field5522 = class209.field3489.getFontMetrics(class201.field3370);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class133.field2287, class287.field4696);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class159.field2694 == null) {
                    class159.field2694 = class209.field3489.createImage(304, 34);
                }
                Graphics var6 = class159.field2694.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var6.setFont(class201.field3370);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - class346.field5522.stringWidth(arg1)) / 2, 22);
                var5.drawImage(class159.field2694, class133.field2287 / 2 - 152, class287.field4696 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class133.field2287 / 2 - 152;
                int var9 = class287.field4696 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 - -2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - (arg0 * 3), 30);
                var5.setFont(class201.field3370);
                var5.setColor(Color.white);
                var5.drawString(arg1, var8 + ((304 - class346.field5522.stringWidth(arg1)) / 2), var9 - -22);
            }
            if (class149.field2534 != null) {
                var5.setFont(class201.field3370);
                var5.setColor(Color.white);
                var5.drawString(class149.field2534, class133.field2287 / 2 - class346.field5522.stringWidth(class149.field2534) / 2, class287.field4696 / 2 + -26);
            }
        } catch (Exception var12) {
            class209.field3489.repaint();
        }
        if (arg2 != 12738) {
            method1224(25, 117);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIIIII)V", line = 113)
    public final void method1223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2848 = arg0;
        this.field2861 = arg9;
        this.field2843 = arg2;
        this.field2868 = arg1;
        this.field2859 = arg8;
        this.field2850 = arg6;
        this.field2853 = arg4;
        this.field2849 = arg5;
        field2856++;
        this.field2839 = arg7;
        int var11 = (this.field2839 + this.field2843 + this.field2861) / 3 + this.field2845.field3561;
        int var12 = (this.field2848 + this.field2850 + this.field2853) / 3 + this.field2845.field3557;
        int var13 = (this.field2859 + this.field2849 + this.field2868) / arg3 + this.field2845.field3564;
        if (this.field2863 != var12 || this.field2864 != var11 || this.field2867 != var13) {
            this.field2867 = var13;
            this.field2870 = true;
            this.field2864 = var11;
            this.field2863 = var12;
        }
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(II)V", line = 150)
    public static final void method1224(int arg0, int arg1) {
        field2837++;
        class199 var2 = class173.method1231(false, 4, arg0);
        var2.method1358(arg1 - 1);
        if (arg1 != 0) {
            field2862 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lvf;Lgl;J)V", line = 412)
    public class172(class341 arg0, class214 arg1, long arg2) {
        this.field2845 = arg1;
        this.field2857 = arg0;
        this.field2836 = new class170();
        this.field2834 = arg2;
        this.field2846 = this.field2857.field5400;
        this.field2852 = (int) ((double) this.field2852 + Math.random() * 64.0D);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 179)
    public static final void method1225(String arg0, int arg1) {
        field2869++;
        class220.method1533(arg0, "", 0, "", arg1, arg1 ^ 0x6A9D);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZIBJI)V", line = 187)
    public final void method1226(int arg0, boolean arg1, int arg2, byte arg3, long arg4, int arg5) {
        if (this.field2851) {
            arg1 = false;
        } else if (this.field2846.field590 > class214.field3549) {
            arg1 = false;
        } else if (class214.field3538 > class316.field5146[class214.field3549]) {
            arg1 = false;
        } else if (this.field2850 == this.field2848 && this.field2853 == this.field2850 && this.field2843 == this.field2839 && this.field2861 == this.field2843 && this.field2859 == this.field2849 && this.field2868 == this.field2849) {
            arg1 = false;
        } else if (this.field2846.field601 != -1) {
            int var8 = (int) (arg4 - this.field2834);
            if (this.field2846.field610 || var8 <= this.field2846.field601) {
                var8 %= this.field2846.field601;
            } else {
                arg1 = false;
            }
            if (!this.field2846.field616 && var8 < this.field2846.field638) {
                arg1 = false;
            }
            if (this.field2846.field616 && var8 >= this.field2846.field638) {
                arg1 = false;
            }
        }
        field2858++;
        if (arg1) {
            this.field2852 += (int) ((double) arg0 * ((double) this.field2846.field614 + (double) (this.field2846.field587 - this.field2846.field614) * Math.random()));
            if (this.field2852 > 63) {
                int var9 = this.field2852 >> 6;
                this.field2852 &= 0x3F;
                if (this.field2870) {
                    int var10 = this.field2850 - this.field2848;
                    int var11 = this.field2843 - this.field2839;
                    int var12 = this.field2849 - this.field2859;
                    int var13 = this.field2853 - this.field2848;
                    int var14 = this.field2868 - this.field2859;
                    int var15 = this.field2861 - this.field2839;
                    this.field2847 = var11 * var14 - (var12 * var15);
                    this.field2840 = var10 * var15 - (var11 * var13);
                    this.field2841 = var12 * var13 - (var10 * var14);
                    while (true) {
                        if (this.field2847 <= 32767 && this.field2841 <= 32767 && this.field2840 <= 32767 && this.field2847 >= -32767 && this.field2841 >= -32767 && this.field2840 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field2841 * this.field2841 + this.field2847 * this.field2847 + this.field2840 * this.field2840));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field2840 = this.field2840 * 32767 / var16;
                            this.field2847 = this.field2847 * 32767 / var16;
                            this.field2841 = this.field2841 * 32767 / var16;
                            if (this.field2846.field592 > 0 || this.field2846.field594 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field2840, (double) this.field2847) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field2841, Math.sqrt((double) (this.field2847 * this.field2847 + this.field2840 * this.field2840))) * 2047.0D / 6.283185307179586D);
                                this.field2860 = this.field2846.field592 - this.field2846.field604;
                                this.field2838 = this.field2846.field594 - this.field2846.field598;
                                this.field2865 = this.field2846.field598 + var19 - (this.field2838 / 2);
                                int var20 = var18 - this.field2845.field3571;
                                this.field2835 = this.field2846.field604 + var20 - (this.field2860 / 2);
                            } else if (this.field2845.field3571 != 0) {
                                int var17 = this.field2840 * arg5 + (this.field2847 * arg2) >> 16;
                                this.field2840 = this.field2840 * arg2 - (this.field2847 * arg5) >> 16;
                                this.field2847 = var17;
                            }
                            this.field2870 = false;
                            break;
                        }
                        this.field2840 >>= 0x1;
                        this.field2841 >>= 0x1;
                        this.field2847 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field2846.field592 <= 0 && this.field2846.field594 <= 0) {
                        var22 = this.field2841;
                        var23 = this.field2847;
                        var24 = this.field2840;
                    } else {
                        int var25 = (int) ((double) this.field2860 * Math.random()) + this.field2835;
                        int var26 = var25 & 0x7FF;
                        int var27 = class305.field4957[var26] >> 1;
                        int var28 = class305.field4959[var26] >> 1;
                        int var29 = (int) ((double) this.field2838 * Math.random()) + this.field2865;
                        int var30 = var29 & 0x3FF;
                        int var31 = class305.field4959[var30] >> 1;
                        var23 = var27 * var31 >> 15;
                        var24 = var28 * var31 >> 15;
                        int var32 = class305.field4957[var30] >> 1;
                        var22 = var32 * -1;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var34) * var33 >> 8;
                    int var36 = 255 - var34 - var35;
                    int var37 = this.field2848 * var34 - (-(this.field2853 * var36) - (this.field2850 * var35)) >> 8;
                    int var38 = this.field2861 * var36 + this.field2843 * var35 + this.field2839 * var34 >> 8;
                    int var39 = this.field2868 * var36 + (this.field2859 * var34 + (this.field2849 * var35)) >> 8;
                    if (this.field2845.field3571 != 0) {
                        int var40 = arg5 * var39 + (arg2 * var37) >> 16;
                        var39 = arg2 * var39 - (arg5 * var37) >> 16;
                        var37 = var40;
                    }
                    int var41 = (int) ((double) (this.field2846.field643 - this.field2846.field640) * Math.random()) + this.field2846.field640;
                    int var42 = this.field2846.field607 + ((int) ((double) (this.field2846.field606 - this.field2846.field607) * Math.random()));
                    int var45;
                    if (this.field2846.field589) {
                        double var43 = Math.random();
                        var45 = (int) ((double) this.field2846.field583 * var43 + (double) this.field2846.field625) << 8 | (int) ((double) this.field2846.field581 * var43 + (double) this.field2846.field617) << 16 | (int) ((double) this.field2846.field630 * var43 + (double) this.field2846.field585) | (int) ((double) this.field2846.field639 * var43 + (double) this.field2846.field620) << 24;
                    } else {
                        var45 = (int) ((double) this.field2846.field639 * Math.random() + (double) this.field2846.field620) << 24 | (int) ((double) this.field2846.field585 + Math.random() * (double) this.field2846.field630) | (int) ((double) this.field2846.field617 + (double) this.field2846.field581 * Math.random()) << 16 | (int) ((double) this.field2846.field583 * Math.random() + (double) this.field2846.field625) << 8;
                    }
                    if (class214.field3546 == class214.field3532) {
                        new class118(this, this.field2845.field3557 + var37, this.field2845.field3561 + var38, this.field2845.field3564 + var39, var23, var22, var24, var41, var42, var45);
                    } else {
                        class118 var47 = class214.field3528[class214.field3532];
                        class214.field3532 = class214.field3532 + 1 & 0x3FF;
                        var47.method862(this, this.field2845.field3557 + var37, this.field2845.field3561 - -var38, this.field2845.field3564 + var39, var23, var22, var24, var41, var42, var45);
                    }
                }
            }
        }
        if (arg3 < 89) {
            return;
        }
        this.field2866 = 0;
        for (class118 var48 = (class118) this.field2836.method1205(62); var48 != null; var48 = (class118) this.field2836.method1207(true)) {
            var48.method864(arg4, arg0);
            this.field2866++;
        }
        class214.field3530 += this.field2866;
    }
}
