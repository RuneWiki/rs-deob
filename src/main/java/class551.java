import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class551 {

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    private int field7656 = 0;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    private int field7675 = 0;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    private int field7667 = 1;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    private int field7679 = 1;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Lae;")
    private class40 field7673 = new class40();

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    private int field7683 = 0;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "Z")
    private boolean field7684 = true;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "Z")
    private boolean field7685 = true;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "[Lpm;")
    private class133[] field7687 = new class133[2];

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "Z")
    private boolean field7690 = true;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "Z")
    private boolean field7682 = true;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "Z")
    private boolean field7689 = false;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    private int field7692 = -1;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lqj;")
    private class548 field7657;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Lqk;")
    private class12 field7655;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Lqk;")
    private class12 field7674;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lqk;")
    private class12 field7660;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "Lwp;")
    public static class453 field7665 = new class453(28, 3);

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field7678 = 0;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "Lwp;")
    public static class453 field7672 = new class453(42, 12);

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "Lwp;")
    public static class453 field7681 = new class453(110, 3);

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "Lwp;")
    public static class453 field7688 = new class453(95, -2);

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "Lwea;")
    public static class259 field7693 = new class259(1, 2);

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "Lpm;")
    private class133 field7686;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "Lpca;")
    private class400 field7691;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "Lpca;")
    private class400 field7694;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Z")
    private boolean field7669;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 7)
    public final void method3039(int arg0) {
        this.field7687 = null;
        this.field7686 = null;
        field7654++;
        this.field7691 = null;
        this.field7694 = null;
        this.field7674 = this.field7660 = this.field7655 = null;
        if (!this.field7673.method246(true)) {
            for (class329 var2 = this.field7673.method237(99); var2 != this.field7673.field541; var2 = var2.field4201) {
                ((class319) var2).method1455(35632);
            }
        }
        this.field7667 = this.field7679 = 1;
        if (arg0 != 0) {
            this.method3045((byte) -122);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILqh;)Z", line = 41)
    public final boolean method3040(int arg0, class319 arg1) {
        if (arg0 >= -31) {
            this.field7655 = null;
        }
        field7664++;
        if (this.field7674 != null) {
            if (arg1.method1461(21223) || arg1.method1458(0)) {
                this.field7673.method239(arg1, (byte) 93);
                this.method3045((byte) -47);
                if (this.method3048(1)) {
                    if (this.field7667 != -1 && this.field7679 != -1) {
                        arg1.method1454(this.field7667, this.field7679, 124);
                    }
                    arg1.field4078 = true;
                    return true;
                }
            }
            this.method3041((byte) -44, arg1);
        }
        return false;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLqh;)V", line = 76)
    public final void method3041(byte arg0, class319 arg1) {
        if (arg0 != -44) {
            field7680 = 90;
        }
        field7662++;
        arg1.field4078 = false;
        arg1.method1455(35632);
        arg1.method1871(-114);
        this.method3045((byte) -47);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lqj;)V", line = 905)
    public class551(class548 arg0) {
        this.field7657 = arg0;
        if (this.field7657.field7593 && this.field7657.field7540) {
            this.field7674 = this.field7655 = new class12(this.field7657);
            if (this.field7657.field7446 > 1 && this.field7657.field7542 && this.field7657.field7607) {
                this.field7674 = this.field7660 = new class12(this.field7657);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILqi;Lks;II)V", line = 99)
    public static final void method3042(int arg0, class514 arg1, class30 arg2, int arg3, int arg4) {
        field7661++;
        byte var5 = -1;
        if ((arg3 & 0x20000) != 0) {
            int var6 = class133.field1735;
            int var7 = arg2.method3504(-13829);
            int var8 = arg2.method3514((byte) -18);
            arg1.method3864(var6, var8, var7, arg0 ^ 0x7D);
        }
        if ((arg3 & 0x2) != 0) {
            int var9 = arg2.method3482(true);
            if (var9 == 65535) {
                var9 = -1;
            }
            arg1.field9650 = var9;
        }
        if ((arg3 & 0x100) != 0) {
            arg1.field9667 = arg2.method3500((byte) 120);
            if (arg1.field9667.charAt(0) == '~') {
                arg1.field9667 = arg1.field9667.substring(1);
                class1.method3(arg1.field6990, arg1.field9667, 2, -1, arg1.method2781(false, (byte) -7), 0, arg1.method2777((byte) -126, true));
            } else if (class376.field4748 == arg1) {
                class1.method3(arg1.field6990, arg1.field9667, 2, ~arg0, arg1.method2781(false, (byte) -7), 0, arg1.method2777((byte) -126, true));
            }
            arg1.field9674 = 0;
            arg1.field9738 = 0;
            arg1.field9655 = 150;
        }
        if ((arg3 & 0x1000) != 0) {
            int var10 = arg2.method3470(13111);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = arg2.method3486(-117);
            int var12 = arg2.method3501(-9268);
            arg1.method3865(var11, var10, (byte) 20, var12, true);
        }
        if ((arg3 & 0x8) != 0) {
            int var13 = arg2.method3498(255);
            byte[] var14 = new byte[var13];
            class630 var15 = new class630(var14);
            arg2.method3471(var14, ~arg0, var13, 0);
            class476.field6042[arg4] = var15;
            arg1.method2783(~arg0, var15);
        }
        if ((arg3 & 0x2000) != arg0) {
            arg1.field6985 = arg2.method3514((byte) -18) == 1;
        }
        if ((arg3 & 0x10) != 0) {
            int var16 = arg2.method3504(-13829);
            int var17 = arg2.method3514((byte) -18);
            arg1.method3864(class133.field1735, var17, var16, 124);
            arg1.field9735 = class133.field1735 + 300;
            arg1.field9695 = arg2.method3501(-9268);
        }
        if ((arg3 & 0x8000) != 0) {
            int var18 = arg2.method3514((byte) -18);
            int[] var19 = new int[var18];
            int[] var20 = new int[var18];
            int[] var21 = new int[var18];
            for (int var22 = 0; var22 < var18; var22++) {
                int var23 = arg2.method3482(true);
                if (var23 == 65535) {
                    var23 = -1;
                }
                var19[var22] = var23;
                var20[var22] = arg2.method3501(-9268);
                var21[var22] = arg2.method3482(true);
            }
            class147.method851(var19, 37, var21, arg1, var20);
        }
        if ((arg3 & 0x200) != 0) {
            arg1.field9651 = arg2.method3495(false);
            arg1.field9722 = arg2.method3495(false);
            arg1.field9715 = arg2.method3495(false);
            arg1.field9694 = arg2.method3495(false);
            arg1.field9740 = arg2.method3467((byte) -80) + class133.field1735;
            arg1.field9665 = arg2.method3470(13111) + class133.field1735;
            arg1.field9685 = arg2.method3514((byte) -18);
            arg1.field9753 = 0;
            if (arg1.field6978) {
                arg1.field9756 = 0;
                arg1.field9651 += arg1.field6993;
                arg1.field9722 += arg1.field7000;
                arg1.field9715 += arg1.field6993;
                arg1.field9694 += arg1.field7000;
            } else {
                arg1.field9756 = 1;
                arg1.field9694 += arg1.field9754[0];
                arg1.field9722 += arg1.field9754[0];
                arg1.field9715 += arg1.field9758[0];
                arg1.field9651 += arg1.field9758[0];
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg1.field6986 = arg2.method3519((byte) 111);
            if (arg1.field9756 == 0) {
                arg1.method3869(false, arg1.field6986);
                arg1.field6986 = -1;
            }
        }
        if ((arg3 & 0x10000) != 0) {
            arg1.field9686 = arg2.method3520(16436);
            arg1.field9703 = arg2.method3520(16436);
            arg1.field9710 = arg2.method3480(-20933);
            arg1.field9714 = (byte) arg2.method3501(-9268);
            arg1.field9742 = class133.field1735 + arg2.method3467((byte) -80);
            arg1.field9693 = class133.field1735 + arg2.method3467((byte) -80);
        }
        if ((arg3 & 0x4000) != 0) {
            int var24 = arg2.method3467((byte) -80);
            arg1.field9720 = arg2.method3514((byte) -18);
            arg1.field9670 = arg2.method3501(-9268);
            arg1.field9717 = var24 & 0x7FFF;
            arg1.field9675 = (var24 & 0x8000) != 0;
            arg1.field9663 = class133.field1735 + arg1.field9717 + arg1.field9720;
        }
        if ((arg3 & 0x20) != 0) {
            int[] var25 = new int[4];
            for (int var26 = 0; var26 < 4; var26++) {
                var25[var26] = arg2.method3467((byte) -80);
                if (var25[var26] == 65535) {
                    var25[var26] = -1;
                }
            }
            int var27 = arg2.method3514((byte) -18);
            class9.method69(var27, var25, arg0 - 102, arg1);
        }
        if ((arg3 & 0x80) != 0) {
            class492.field6494[arg4] = arg2.method3495(false);
        }
        if ((arg3 & 0x1) != 0) {
            int var28 = arg2.method3482(true);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = arg2.method3486(arg0 ^ 0xFFFFFF92);
            int var30 = arg2.method3498(255);
            arg1.method3865(var29, var28, (byte) 92, var30, false);
        }
        if ((arg3 & 0x800) != 0) {
            var5 = arg2.method3495(false);
        }
        if (!arg1.field6978) {
            return;
        }
        if (var5 == 127) {
            arg1.method2786(-3377, arg1.field6993, arg1.field7000);
            return;
        }
        byte var31;
        if (var5 == -1) {
            var31 = class492.field6494[arg4];
        } else {
            var31 = var5;
        }
        arg1.method2776(var31, arg1.field7000, arg0 - 1157357879, arg1.field6993);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 366)
    public static void method3043(byte arg0) {
        field7681 = null;
        field7665 = null;
        field7672 = null;
        field7693 = null;
        if (arg0 == -16) {
            field7688 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)I", line = 383)
    public static final int method3044(int arg0, boolean arg1) {
        field7668++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1) {
            return -13;
        } else {
            int var3 = arg0 * 6 - 61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V", line = 401)
    private final void method3045(byte arg0) {
        field7659++;
        boolean var2 = false;
        if (arg0 != -47) {
            return;
        }
        int var3 = 0;
        int var4 = 0;
        for (class319 var5 = (class319) this.field7673.method237(127); var5 != null; var5 = (class319) this.field7673.method245((byte) 80)) {
            int var9 = var5.method1453(arg0 ^ 0xFFFFFFD0);
            var4 += var5.method1832(1);
            if (var9 > var3) {
                var3 = var9;
            }
            var2 |= var5.method1834((byte) 33);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field7692 != var6) {
            this.field7685 = true;
            this.field7692 = var6;
        }
        int var7 = this.field7683 > 2 ? 2 : this.field7683;
        int var8 = var4 <= 2 ? var4 : 2;
        this.field7683 = var4;
        if (var7 != var8) {
            this.field7684 = this.field7685 = true;
        }
        if (this.field7689 != var2) {
            this.field7689 = var2;
            this.field7690 = true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V", line = 463)
    public final void method3046(byte arg0) {
        field7666++;
        if (!this.field7669) {
            return;
        }
        if (this.field7660 != null) {
            this.field7657.method2986(this.field7660, -121);
            int var2 = 16384;
            this.field7657.method2952(this.field7655, (byte) 101);
            this.field7660.method100((byte) 124, 0);
            this.field7655.method95(0, true);
            if (this.field7689) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field7667, this.field7679, 0, 0, this.field7667, this.field7679, var2, 9728);
            this.field7657.method3021(this.field7660, (byte) -124);
            this.field7657.method2951(this.field7655, (byte) -20);
        }
        this.field7657.method3022((byte) 3);
        this.field7657.method3017((byte) 29, 0);
        this.field7657.method3005(false, 1);
        if (arg0 != -38) {
            this.method3048(92);
        }
        this.field7657.method1017();
        int var3 = 0;
        int var4 = 1;
        class319 var6;
        for (class319 var5 = (class319) this.field7673.method237(102); var5 != null; var5 = var6) {
            var6 = (class319) this.field7673.method245((byte) 73);
            int var7 = var5.method1832(1);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1462(this.field7687[var3], false, var8, this.field7686);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field7657.method2981(-118, this.field7655);
                    this.field7657.method3001((byte) 125, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7679);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7675, this.field7656);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7675, this.field7656 + this.field7679);
                    OpenGL.glTexCoord2f((float) this.field7667, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7675 + this.field7667, this.field7679 + this.field7656);
                    OpenGL.glTexCoord2f((float) this.field7667, (float) this.field7679);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7675 + this.field7667, this.field7656);
                    OpenGL.glEnd();
                } else {
                    this.field7655.method95(var4, true);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field7679);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field7679);
                    OpenGL.glTexCoord2f((float) this.field7667, (float) this.field7679);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field7667, this.field7679);
                    OpenGL.glTexCoord2f((float) this.field7667, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field7667, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var5.method1459(0, var8);
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field7669 = false;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)Z", line = 577)
    public final boolean method3047(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -75 % ((arg0 - 25) / 42);
        field7677++;
        if (this.field7674 == null || this.field7673.method246(true)) {
            return false;
        }
        if (this.field7667 != arg3 || this.field7679 != arg2) {
            this.field7667 = arg3;
            this.field7679 = arg2;
            for (class329 var7 = this.field7673.method237(124); var7 != this.field7673.field541; var7 = var7.field4201) {
                ((class319) var7).method1454(this.field7667, this.field7679, 124);
            }
            this.field7690 = true;
            this.field7684 = true;
            this.field7685 = true;
        }
        if (!this.method3048(1)) {
            return false;
        }
        this.field7656 = arg1;
        this.field7675 = arg4;
        this.field7669 = true;
        this.field7657.method3026(255, this.field7674);
        this.field7674.method95(0, true);
        this.field7657.method3001((byte) 124, this.field7656 + this.field7679 - this.field7657.field7320, -this.field7675);
        return true;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z", line = 622)
    private final boolean method3048(int arg0) {
        field7663++;
        if (this.field7690) {
            if (this.field7694 != null) {
                this.field7694.method2133((byte) 127);
                this.field7694 = null;
            }
            if (this.field7686 != null) {
                this.field7686.method3392((byte) -30);
                this.field7686 = null;
            }
            if (this.field7660 != null) {
                this.field7694 = new class400(this.field7657, 6402, this.field7667, this.field7679, this.field7657.field7446);
            }
            if (this.field7689) {
                this.field7686 = new class133(this.field7657, 34037, 6402, this.field7667, this.field7679);
            } else if (this.field7694 == null) {
                this.field7694 = new class400(this.field7657, 6402, this.field7667, this.field7679);
            }
            this.field7690 = false;
            this.field7682 = true;
            this.field7684 = true;
        }
        if (this.field7685) {
            if (this.field7691 != null) {
                this.field7691.method2133((byte) 125);
                this.field7691 = null;
            }
            if (this.field7687[0] != null) {
                this.field7687[0].method3392((byte) -29);
                this.field7687[0] = null;
            }
            if (this.field7687[1] != null) {
                this.field7687[1].method3392((byte) -91);
                this.field7687[1] = null;
            }
            if (this.field7660 != null) {
                this.field7691 = new class400(this.field7657, this.field7692, this.field7667, this.field7679, this.field7657.field7446);
            }
            this.field7687[0] = new class133(this.field7657, 34037, this.field7692, this.field7667, this.field7679);
            this.field7687[1] = this.field7683 <= 1 ? null : new class133(this.field7657, 34037, this.field7692, this.field7667, this.field7679);
            this.field7682 = true;
            this.field7684 = true;
            this.field7685 = false;
        }
        if (this.field7684) {
            if (this.field7660 == null) {
                this.field7657.method3026(arg0 + 254, this.field7655);
                this.field7655.method89(0, 1);
                this.field7655.method89(1, 1);
                this.field7655.method89(8, 1);
                this.field7655.method103(this.field7687[0], (byte) 1, 0);
                if (this.field7683 > 1) {
                    this.field7655.method103(this.field7687[1], (byte) 1, 1);
                }
                if (this.field7689) {
                    this.field7655.method103(this.field7686, (byte) 1, 8);
                } else {
                    this.field7655.method99(8, this.field7694, -2693);
                }
                this.field7657.method2981(-107, this.field7655);
            } else {
                this.field7657.method3026(255, this.field7655);
                this.field7655.method89(0, 1);
                this.field7655.method89(1, arg0);
                this.field7655.method89(8, 1);
                this.field7655.method103(this.field7687[0], (byte) 1, 0);
                if (this.field7683 > 1) {
                    this.field7655.method103(this.field7687[1], (byte) 1, 1);
                }
                if (this.field7689) {
                    this.field7655.method103(this.field7686, (byte) 1, 8);
                }
                this.field7657.method2981(-109, this.field7655);
                this.field7657.method3026(255, this.field7660);
                this.field7660.method89(0, 1);
                this.field7660.method89(8, 1);
                this.field7660.method99(0, this.field7691, -2693);
                this.field7660.method99(8, this.field7694, arg0 ^ 0xFFFFF57A);
                this.field7657.method2981(arg0 ^ 0x3D, this.field7660);
            }
            this.field7682 = true;
            this.field7684 = false;
        }
        if (this.field7682) {
            this.field7657.method3026(255, this.field7674);
            this.field7682 = !this.field7674.method96(false);
            this.field7657.method2981(-87, this.field7674);
        }
        if (arg0 == 1) {
            return !this.field7682;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)Z", line = 753)
    public final boolean method3049(int arg0) {
        field7658++;
        int var2 = -76 / ((-arg0 - 35) / 51);
        return this.field7674 != null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;)V", line = 763)
    public static final void method3050(int arg0, String arg1) {
        field7676++;
        if (arg1 == null || arg0 != 1) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class158.method900(arg1, true);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class238.field2980; var3++) {
            String var4 = class680.field9564[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class158.method900(var4, true);
            if (var5 != null && var5.equals(var2)) {
                class238.field2980--;
                for (int var6 = var3; var6 < class238.field2980; var6++) {
                    class680.field9564[var6] = class680.field9564[var6 + 1];
                    class280.field3509[var6] = class280.field3509[var6 + 1];
                    class215.field2669[var6] = class215.field2669[var6 + 1];
                    class465.field5927[var6] = class465.field5927[var6 + 1];
                    class670.field9442[var6] = class670.field9442[var6 + 1];
                }
                class19.field283++;
                class95.field1312 = class450.field5767;
                class704 var7 = class314.method1820(class117.field1517, class400.field5014, (byte) -117);
                var7.field9929.method3509(class109.method611(arg1, (byte) 2), (byte) -120);
                var7.field9929.method3489(arg1, -112);
                class122.method654(var7, (byte) -36);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z", line = 842)
    public static final boolean method3051(int arg0, int arg1, int arg2) {
        if (arg0 != 33) {
            field7693 = null;
        }
        field7671++;
        return (arg1 & 0x21) != 0;
    }
}
