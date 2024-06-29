import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class129 extends class532 {

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    private int field1772 = 0;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    private int field1784 = 0;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    private int field1773 = 0;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "Z")
    private boolean field1791 = false;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    private int field1774 = 0;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    private int field1777;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    private int field1798;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "Lqq;")
    private class651 field1794;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "Lgn;")
    private class691 field1796;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "Z")
    private boolean field1790;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "Z")
    private boolean field1785;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "Z")
    private boolean field1786;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "Z")
    private boolean field1800;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "Leba;")
    public static class550 field1781 = new class550(13, 5);

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "[I")
    public static int[] field1799 = new int[1];

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
    public static int field1801 = 13156520;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "(IIII)V")
    public final void method527(int arg0, int arg1, int arg2, int arg3) {
        field1779++;
        this.field1773 = arg0;
        this.field1784 = arg2;
        this.field1772 = arg3;
        this.field1774 = arg1;
        this.field1791 = this.field1773 != 0 || this.field1774 != 0 || this.field1784 != 0 || this.field1772 != 0;
    }

    @OriginalMember(owner = "client!gm", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method525(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field1797++;
        class149 var11 = this.field1794.method3675(-109);
        class149 var12 = this.field1794.method3682(-54);
        this.field1796.method390(29613, this.field1790 || this.field1785 || (arg9 & 0x1) == 0 ? class695.field9800 : class266.field3443);
        this.field1794.method3640((byte) 3);
        this.field1794.method3613((byte) 97, this.field1796);
        this.field1794.method3627(119, arg8);
        this.field1794.method3676(arg6, (byte) -84);
        this.field1794.method3624(class137.field1869, -126, 1);
        this.field1794.method3666(1, class137.field1869, (byte) -83);
        this.field1794.method3678(-126, arg7);
        if (this.field1791) {
            float var13 = (float) this.method523();
            float var14 = (float) this.method532();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field1774 * var17;
            float var20 = (float) this.field1774 * var18;
            float var21 = (float) this.field1773 * var15;
            float var22 = (float) this.field1773 * var16;
            float var23 = (float) this.field1784 * -var15;
            float var24 = (float) this.field1784 * -var16;
            float var25 = (float) this.field1772 * -var17;
            float var26 = (float) this.field1772 * -var18;
            arg4 = arg4 + var21 + var25;
            arg1 = arg1 + var22 + var20;
            arg3 = arg3 + var24 + var20;
            arg0 = arg0 + var21 + var19;
            arg2 = arg2 + var23 + var19;
            arg5 = arg5 + var22 + var26;
        }
        var11.method874(arg2 - arg0, arg4 - arg0, 0, 0.0F, 0.0F, 1.0F, 0.0F, arg5 - arg1, 0.0F, arg3 - arg1);
        var11.method873(11939, 0.0F, arg1, arg0);
        var12.method866(this.field1796.method843((float) this.field1777, (byte) 58), this.field1796.method841((byte) -40, (float) this.field1798), 59, 1.0F);
        this.field1794.method3616(class213.field2816, false);
        this.field1794.method3685(-66);
        this.field1794.method3649(117);
        this.field1794.method3668(0);
        this.field1794.method3624(class533.field7324, -113, 1);
        this.field1794.method3666(1, class533.field7324, (byte) -83);
    }

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "()I")
    public final int method529() {
        field1795++;
        return this.field1798;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method524(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class596 arg7, int arg8, int arg9) {
        field1780++;
        class149 var11 = this.field1794.method3675(-111);
        class149 var12 = this.field1794.method3682(111);
        class200 var13 = (class200) arg7;
        class691 var14 = var13.field2706;
        this.field1796.method390(29613, this.field1790 || this.field1785 || (arg6 & 0x1) == 0 ? class695.field9800 : class266.field3443);
        this.field1794.method3640((byte) 3);
        this.field1794.method3613((byte) 103, this.field1796);
        this.field1794.method3627(92, 1);
        this.field1794.method3676(1, (byte) -84);
        if (this.field1791) {
            float var15 = (float) this.field1777 / (float) this.method523();
            float var16 = (float) this.field1798 / (float) this.method532();
            var11.method874((arg2 - arg0) * var15, (arg4 - arg0) * var16, 0, 0.0F, 0.0F, 1.0F, 0.0F, (arg5 - arg1) * var16, 0.0F, (arg3 - arg1) * var15);
            var11.method873(11939, 0.0F, ((float) this.field1774 + arg1) * var16, ((float) this.field1773 + arg0) * var15);
        } else {
            var11.method874(arg2 - arg0, -arg0 + arg4, 0, 0.0F, 0.0F, 1.0F, 0.0F, arg5 - arg1, 0.0F, arg3 - arg1);
            var11.method873(11939, 0.0F, arg1, arg0);
        }
        var12.method866(this.field1796.method843((float) this.field1777, (byte) 58), this.field1796.method841((byte) -40, (float) this.field1798), 61, 1.0F);
        this.field1794.method3616(class213.field2816, false);
        this.field1794.method3635(true, 1);
        this.field1794.method3613((byte) 99, var14);
        this.field1794.method3672((byte) 14, class274.field3642, class298.field3941);
        this.field1794.method3624(class533.field7324, -108, 0);
        class149 var17 = this.field1794.method3682(87);
        var17.method344(var11);
        var17.method356(-arg8, -arg9, 0);
        var17.method869(-121, var14.method843(1.0F, (byte) 58), 1.0F, var14.method841((byte) -40, 1.0F));
        this.field1794.method3616(class213.field2816, false);
        this.field1794.method3685(-88);
        this.field1794.method3649(95);
        this.field1794.method3668(0);
        this.field1794.method3624(class630.field8719, -107, 0);
        this.field1794.method3672((byte) 104, class274.field3642, class274.field3642);
        this.field1794.method3613((byte) 94, null);
        this.field1794.method3635(true, 0);
        this.field1794.method3668(0);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static void method758(int arg0) {
        field1781 = null;
        field1799 = null;
        if (arg0 != 1) {
            field1801 = 75;
        }
    }

    @OriginalMember(owner = "client!gm", name = "DA", descriptor = "(IIIIIII)V")
    public final void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1789++;
        class149 var8 = this.field1794.method3675(-127);
        class149 var9 = this.field1794.method3682(96);
        this.field1796.method390(29613, class695.field9800);
        this.field1794.method3640((byte) 3);
        this.field1794.method3613((byte) 126, this.field1796);
        this.field1794.method3627(108, arg6);
        this.field1794.method3676(arg4, (byte) -84);
        this.field1794.method3624(class137.field1869, -109, 1);
        this.field1794.method3666(1, class137.field1869, (byte) -83);
        this.field1794.method3678(-128, arg5);
        boolean var10 = this.field1800 && this.field1774 == 0 && this.field1772 == 0;
        boolean var11 = this.field1786 && this.field1773 == 0 && this.field1784 == 0;
        if (var10 & var11) {
            var9.method866(this.field1796.method843((float) arg2, (byte) 58), this.field1796.method841((byte) -40, (float) arg3), 103, 1.0F);
            var8.method866((float) arg2, (float) arg3, 73, 0.0F);
            var8.method356(arg0, arg1, 0);
            this.field1794.method3616(class213.field2816, false);
            this.field1794.method3685(-66);
            this.field1794.method3649(62);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method532();
            var9.method866(this.field1796.method843((float) arg2, (byte) 58), this.field1796.method841((byte) -40, (float) this.field1798), 99, 1.0F);
            this.field1794.method3616(class213.field2816, false);
            int var14 = this.field1774 + arg1;
            for (int var15 = this.field1798 + var14; var15 <= var12; var15 += var13) {
                var8.method866((float) arg2, (float) this.field1798, 79, 0.0F);
                var8.method356(arg0, var14, 0);
                this.field1794.method3685(-64);
                var14 += var13;
                this.field1794.method3649(99);
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method866(this.field1796.method843((float) arg2, (byte) 58), this.field1796.method841((byte) -40, (float) var16), 113, 1.0F);
                this.field1794.method3616(class213.field2816, false);
                var8.method866((float) arg2, (float) var16, 91, 0.0F);
                var8.method356(arg0, var14, 0);
                this.field1794.method3685(-86);
                this.field1794.method3649(98);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method523();
            var9.method866(this.field1796.method843((float) this.field1777, (byte) 58), this.field1796.method841((byte) -40, (float) arg3), 119, 1.0F);
            this.field1794.method3616(class213.field2816, false);
            int var32 = arg0 + this.field1773;
            int var33 = this.field1777 + var32;
            while (var33 <= var30) {
                var8.method866((float) this.field1777, (float) arg3, 70, 0.0F);
                var8.method356(var32, arg1, 0);
                this.field1794.method3685(-81);
                var32 += var31;
                var33 += var31;
                this.field1794.method3649(98);
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method866(this.field1796.method843((float) var34, (byte) 58), this.field1796.method841((byte) -40, (float) arg3), 121, 1.0F);
                this.field1794.method3616(class213.field2816, false);
                var8.method866((float) var34, (float) arg3, 87, 0.0F);
                var8.method356(var32, arg1, 0);
                this.field1794.method3685(-90);
                this.field1794.method3649(106);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method523();
            int var20 = this.method532();
            int var21 = arg1 + this.field1774;
            for (int var22 = this.field1798 + var21; var22 <= var17; var22 += var20) {
                var9.method866(this.field1796.method843((float) this.field1777, (byte) 58), this.field1796.method841((byte) -40, (float) this.field1798), 78, 1.0F);
                this.field1794.method3616(class213.field2816, false);
                int var27 = this.field1773 + arg0;
                int var28 = this.field1777 + var27;
                while (var28 <= var18) {
                    var8.method866((float) this.field1777, (float) this.field1798, 66, 0.0F);
                    var8.method356(var27, var21, 0);
                    this.field1794.method3685(-88);
                    this.field1794.method3649(125);
                    var28 += var19;
                    var27 += var19;
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method866(this.field1796.method843((float) var29, (byte) 58), this.field1796.method841((byte) -40, (float) this.field1798), 60, 1.0F);
                    this.field1794.method3616(class213.field2816, false);
                    var8.method866((float) var29, (float) this.field1798, 57, 0.0F);
                    var8.method356(var27, var21, 0);
                    this.field1794.method3685(-86);
                    this.field1794.method3649(91);
                }
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method866(this.field1796.method843((float) this.field1777, (byte) 58), this.field1796.method841((byte) -40, (float) var23), 123, 1.0F);
                this.field1794.method3616(class213.field2816, false);
                int var24 = arg0 + this.field1773;
                for (int var25 = this.field1777 + var24; var25 <= var18; var25 += var19) {
                    var8.method866((float) this.field1777, (float) var23, 79, 0.0F);
                    var8.method356(var24, var21, 0);
                    this.field1794.method3685(-74);
                    var24 += var19;
                    this.field1794.method3649(73);
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method866(this.field1796.method843((float) var26, (byte) 58), this.field1796.method841((byte) -40, (float) var23), 108, 1.0F);
                    this.field1794.method3616(class213.field2816, false);
                    var8.method866((float) var26, (float) var23, 93, 0.0F);
                    var8.method356(var24, var21, 0);
                    this.field1794.method3685(-17);
                    this.field1794.method3649(73);
                }
            }
        }
        this.field1794.method3668(0);
        this.field1794.method3624(class533.field7324, -115, 1);
        this.field1794.method3666(1, class533.field7324, (byte) -83);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILua;II)V")
    public final void method219(int arg0, int arg1, class596 arg2, int arg3, int arg4) {
        field1792++;
        class200 var6 = (class200) arg2;
        int var7 = this.field1773 + arg0;
        class691 var8 = var6.field2706;
        int var9 = this.field1774 + arg1;
        this.field1796.method390(29613, class695.field9800);
        this.field1794.method3640((byte) 3);
        this.field1794.method3613((byte) 114, this.field1796);
        this.field1794.method3627(97, 1);
        this.field1794.method3676(1, (byte) -84);
        class149 var10 = this.field1794.method3675(-108);
        var10.method866((float) this.field1777, (float) this.field1798, 80, 0.0F);
        var10.method356(var7, var9, 0);
        this.field1794.method3685(-70);
        class149 var11 = this.field1794.method3682(116);
        var11.method866(this.field1796.method843((float) this.field1777, (byte) 58), this.field1796.method841((byte) -40, (float) this.field1798), 105, 1.0F);
        this.field1794.method3616(class213.field2816, false);
        this.field1794.method3635(true, 1);
        this.field1794.method3613((byte) 125, var8);
        this.field1794.method3672((byte) -90, class274.field3642, class298.field3941);
        this.field1794.method3624(class533.field7324, -120, 0);
        class149 var12 = this.field1794.method3682(103);
        var12.method866(var8.method843((float) this.field1777, (byte) 58), var8.method841((byte) -40, (float) this.field1798), 124, 1.0F);
        var12.method873(11939, 0.0F, var8.method841((byte) -40, (float) (var9 - arg4)), var8.method843((float) (var7 - arg3), (byte) 58));
        this.field1794.method3616(class213.field2816, false);
        this.field1794.method3649(97);
        this.field1794.method3668(0);
        this.field1794.method3624(class630.field8719, -109, 0);
        this.field1794.method3672((byte) 95, class274.field3642, class274.field3642);
        this.field1794.method3613((byte) 113, null);
        this.field1794.method3635(true, 0);
        this.field1794.method3668(0);
    }

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "()I")
    public final int method523() {
        field1788++;
        return this.field1777 + this.field1773 + this.field1784;
    }

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "(IIIII)V")
    public final void method217(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1776++;
        class149 var6 = this.field1794.method3675(26);
        class149 var7 = this.field1794.method3682(-103);
        int var8 = this.field1773 + arg0;
        int var9 = this.field1774 + arg1;
        this.field1796.method390(29613, class695.field9800);
        this.field1794.method3640((byte) 3);
        this.field1794.method3613((byte) 108, this.field1796);
        this.field1794.method3627(89, arg4);
        this.field1794.method3676(arg2, (byte) -84);
        this.field1794.method3624(class137.field1869, -111, 1);
        this.field1794.method3666(1, class137.field1869, (byte) -83);
        this.field1794.method3678(-126, arg3);
        var6.method866((float) this.field1777, (float) this.field1798, 63, 0.0F);
        var6.method356(var8, var9, 0);
        var7.method866(this.field1796.method843((float) this.field1777, (byte) 58), this.field1796.method841((byte) -40, (float) this.field1798), 92, 1.0F);
        this.field1794.method3616(class213.field2816, false);
        this.field1794.method3685(-105);
        this.field1794.method3649(111);
        this.field1794.method3668(0);
        this.field1794.method3624(class533.field7324, -121, 1);
        this.field1794.method3666(1, class533.field7324, (byte) -83);
    }

    @OriginalMember(owner = "client!gm", name = "ca", descriptor = "()I")
    public final int method532() {
        field1782++;
        return this.field1774 + this.field1772 + this.field1798;
    }

    @OriginalMember(owner = "client!gm", name = "da", descriptor = "(IIIIII)V")
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1783++;
        int[] var7 = this.field1794.method1068(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class665.method3789(var7[var8], -16777216);
            }
            this.method759(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "()I")
    public final int method530() {
        field1793++;
        return this.field1777;
    }

    @OriginalMember(owner = "client!gm", name = "xa", descriptor = "(III)V")
    public final void method218(int arg0, int arg1, int arg2) {
        field1787++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIII[III)V")
    private final void method759(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field1775++;
        this.field1796.method851(arg6, arg2, arg1, arg4, arg0, (byte) -122, arg3, arg5);
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lqq;IIZ)V")
    public class129(class651 arg0, int arg1, int arg2, boolean arg3) {
        this.field1777 = arg1;
        this.field1798 = arg2;
        this.field1794 = arg0;
        this.field1796 = arg0.method2004((byte) 64, arg3 ? class480.field6686 : class568.field7733, class404.field5338, arg2, arg1);
        this.field1796.method846(true, (byte) 60, true);
        this.field1790 = arg1 != this.field1796.method848(true);
        this.field1785 = arg2 != this.field1796.method842((byte) 80);
        this.field1786 = !this.field1790 && this.field1796.method849(-128);
        this.field1800 = !this.field1785 && this.field1796.method849(-66);
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lqq;II[III)V")
    public class129(class651 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1777 = arg1;
        this.field1798 = arg2;
        this.field1794 = arg0;
        this.field1796 = arg0.method2044(arg3, arg5, arg4, arg2, false, -219, arg1);
        this.field1796.method846(true, (byte) 67, true);
        this.field1790 = this.field1796.method848(true) != arg1;
        this.field1785 = arg2 != this.field1796.method842((byte) 77);
        this.field1786 = !this.field1790 && this.field1796.method849(-109);
        this.field1800 = !this.field1785 && this.field1796.method849(-116);
    }

    @OriginalMember(owner = "client!gm", name = "YA", descriptor = "(IIIIIIII)V")
    public final void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1778++;
        class149 var9 = this.field1794.method3675(74);
        class149 var10 = this.field1794.method3682(-91);
        this.field1796.method390(29613, this.field1790 || this.field1785 || (arg7 & 0x1) == 0 ? class695.field9800 : class266.field3443);
        this.field1794.method3640((byte) 3);
        this.field1794.method3613((byte) 113, this.field1796);
        this.field1794.method3627(67, arg6);
        this.field1794.method3676(arg4, (byte) -84);
        this.field1794.method3624(class137.field1869, -111, 1);
        this.field1794.method3666(1, class137.field1869, (byte) -83);
        this.field1794.method3678(-126, arg5);
        var10.method866(this.field1796.method843((float) this.field1777, (byte) 58), this.field1796.method841((byte) -40, (float) this.field1798), 58, 1.0F);
        if (this.field1791) {
            arg2 = this.field1777 * arg2 / this.method523();
            arg3 = this.field1798 * arg3 / this.method532();
            arg1 += this.field1774 * arg3 / this.field1798;
            arg0 += this.field1773 * arg2 / this.field1777;
        }
        var9.method866((float) arg2, (float) arg3, 103, 0.0F);
        var9.method356(arg0, arg1, 0);
        this.field1794.method3616(class213.field2816, false);
        this.field1794.method3685(-74);
        this.field1794.method3649(100);
        this.field1794.method3668(0);
        this.field1794.method3624(class533.field7324, -121, 1);
        this.field1794.method3666(1, class533.field7324, (byte) -83);
    }
}
