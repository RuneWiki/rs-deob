import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class599 extends class133 {

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    private int field7854 = 0;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    private int field7861 = 0;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    private int field7863 = 0;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    private int field7860 = 0;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Z")
    private boolean field7870 = false;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    private int field7866;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "Lrv;")
    private class111 field7877;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    private int field7871;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Ltr;")
    private class297 field7856;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Z")
    private boolean field7865;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Z")
    private boolean field7868;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Z")
    private boolean field7858;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "Z")
    private boolean field7875;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lht;")
    public static class582 field7851 = new class582(9, 7);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([I)V", line = 5)
    public final void method1046(int[] arg0) {
        arg0[3] = this.field7863;
        arg0[0] = this.field7861;
        field7873++;
        arg0[1] = this.field7854;
        arg0[2] = this.field7860;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "()I", line = 16)
    public final int method1048() {
        field7872++;
        return this.field7871 + this.field7854 + this.field7863;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIIIIII)V", line = 24)
    public final void method1047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7850++;
        class615 var8 = this.field7877.method846(-24720);
        class615 var9 = this.field7877.method916(0);
        this.field7856.method340(-9495, class94.field1141);
        this.field7877.method925(true);
        this.field7877.method823(this.field7856, -8423);
        this.field7877.method836(-129, arg6);
        this.field7877.method887((byte) 123, arg4);
        this.field7877.method840(1, -118, class362.field5101);
        this.field7877.method845(class362.field5101, (byte) 117, 1);
        this.field7877.method870(arg5, false);
        boolean var10 = this.field7875 && this.field7854 == 0 && this.field7863 == 0;
        boolean var11 = this.field7858 && this.field7861 == 0 && this.field7860 == 0;
        if ((var10 & var11)) {
            var9.method3366(this.field7856.method597((float) arg3, -108), this.field7856.method591(-2092, (float) arg2), 1.0F, (byte) -49);
            var8.method3366((float) arg3, (float) arg2, 0.0F, (byte) -49);
            var8.method1730(arg0, arg1, 0);
            this.field7877.method878(3, class91.field1105);
            this.field7877.method842(92);
            this.field7877.method880(-119);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method1048();
            var9.method3366(this.field7856.method597((float) this.field7871, -122), this.field7856.method591(-2092, (float) arg2), 1.0F, (byte) -49);
            this.field7877.method878(3, class91.field1105);
            int var14 = this.field7854 + arg1;
            int var15 = this.field7871 + var14;
            while (var15 <= var12) {
                var8.method3366((float) this.field7871, (float) arg2, 0.0F, (byte) -49);
                var8.method1730(arg0, var14, 0);
                this.field7877.method842(81);
                var15 += var13;
                this.field7877.method880(-118);
                var14 += var13;
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method3366(this.field7856.method597((float) var16, -70), this.field7856.method591(-2092, (float) arg2), 1.0F, (byte) -49);
                this.field7877.method878(3, class91.field1105);
                var8.method3366((float) var16, (float) arg2, 0.0F, (byte) -49);
                var8.method1730(arg0, var14, 0);
                this.field7877.method842(105);
                this.field7877.method880(-123);
            }
        } else if (var10) {
            int var17 = arg0 + arg2;
            int var18 = this.method1036();
            var9.method3366(this.field7856.method597((float) arg3, -85), this.field7856.method591(-2092, (float) this.field7866), 1.0F, (byte) -49);
            this.field7877.method878(3, class91.field1105);
            int var19 = this.field7861 + arg0;
            int var20 = this.field7866 + var19;
            while (var20 <= var17) {
                var8.method3366((float) arg3, (float) this.field7866, 0.0F, (byte) -49);
                var8.method1730(var19, arg1, 0);
                this.field7877.method842(40);
                var19 += var18;
                var20 += var18;
                this.field7877.method880(-17);
            }
            if (var19 < var17) {
                int var21 = var17 - var19;
                var9.method3366(this.field7856.method597((float) arg3, -76), this.field7856.method591(-2092, (float) var21), 1.0F, (byte) -49);
                this.field7877.method878(3, class91.field1105);
                var8.method3366((float) arg3, (float) var21, 0.0F, (byte) -49);
                var8.method1730(var19, arg1, 0);
                this.field7877.method842(53);
                this.field7877.method880(-119);
            }
        } else {
            int var22 = arg1 + arg3;
            int var23 = arg0 + arg2;
            int var24 = this.method1036();
            int var25 = this.method1048();
            int var26 = this.field7854 + arg1;
            int var27 = this.field7871 + var26;
            while (var27 <= var22) {
                var9.method3366(this.field7856.method597((float) this.field7871, 117), this.field7856.method591(-2092, (float) this.field7866), 1.0F, (byte) -49);
                this.field7877.method878(3, class91.field1105);
                int var32 = this.field7861 + arg0;
                int var33 = this.field7866 + var32;
                while (var33 <= var23) {
                    var8.method3366((float) this.field7871, (float) this.field7866, 0.0F, (byte) -49);
                    var8.method1730(var32, var26, 0);
                    this.field7877.method842(72);
                    var32 += var24;
                    var33 += var24;
                    this.field7877.method880(-21);
                }
                if (var23 > var32) {
                    int var34 = var23 - var32;
                    var9.method3366(this.field7856.method597((float) this.field7871, 79), this.field7856.method591(-2092, (float) var34), 1.0F, (byte) -49);
                    this.field7877.method878(3, class91.field1105);
                    var8.method3366((float) this.field7871, (float) var34, 0.0F, (byte) -49);
                    var8.method1730(var32, var26, 0);
                    this.field7877.method842(117);
                    this.field7877.method880(-125);
                }
                var27 += var25;
                var26 += var25;
            }
            if (var26 < var22) {
                int var28 = var22 - var26;
                var9.method3366(this.field7856.method597((float) var28, 102), this.field7856.method591(-2092, (float) this.field7866), 1.0F, (byte) -49);
                this.field7877.method878(3, class91.field1105);
                int var29 = this.field7861 + arg0;
                int var30 = var29 + this.field7866;
                while (var30 <= var23) {
                    var8.method3366((float) var28, (float) this.field7866, 0.0F, (byte) -49);
                    var8.method1730(var29, var26, 0);
                    this.field7877.method842(62);
                    this.field7877.method880(-116);
                    var30 += var24;
                    var29 += var24;
                }
                if (var29 < var23) {
                    int var31 = var23 - var29;
                    var9.method3366(this.field7856.method597((float) var28, 66), this.field7856.method591(-2092, (float) var31), 1.0F, (byte) -49);
                    this.field7877.method878(3, class91.field1105);
                    var8.method3366((float) var28, (float) var31, 0.0F, (byte) -49);
                    var8.method1730(var29, var26, 0);
                    this.field7877.method842(113);
                    this.field7877.method880(6);
                }
            }
        }
        this.field7877.method819(-106);
        this.field7877.method840(1, -89, class227.field3230);
        this.field7877.method845(class227.field3230, (byte) 93, 1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V", line = 231)
    public final void method1044(int arg0, int arg1, int arg2) {
        field7867++;
        int[] var4 = this.field7877.method473(arg0, arg1, this.field7866, this.field7871);
        int[] var5 = new int[this.field7871 * this.field7866];
        this.field7856.method594(0, this.field7871, var5, 0, 0, 12679, this.field7866);
        if (arg2 == 0) {
            for (int var6 = 0; var6 < this.field7871; var6++) {
                int var7 = this.field7866 * var6;
                for (int var8 = 0; var8 < this.field7866; var8++) {
                    var5[var7 + var8] = class446.method2556(class48.method346(var5[var7 + var8], 16777215), class48.method346(var4[var7 + var8], 1711210496) << 8);
                }
            }
        } else if (arg2 == 1) {
            for (int var9 = 0; var9 < this.field7871; var9++) {
                int var10 = this.field7866 * var9;
                for (int var11 = 0; var11 < this.field7866; var11++) {
                    var5[var10 + var11] = class446.method2556(class48.method346(var5[var10 + var11], 16777215), class48.method346(-16762621, var4[var10 + var11] << 16));
                }
            }
        } else if (arg2 == 2) {
            for (int var15 = 0; var15 < this.field7871; var15++) {
                int var16 = this.field7866 * var15;
                for (int var17 = 0; var17 < this.field7866; var17++) {
                    var5[var16 + var17] = class446.method2556(class48.method346(var4[var16 + var17], -958299649) << 24, class48.method346(16777215, var5[var16 + var17]));
                }
            }
        } else if (arg2 == 3) {
            for (int var12 = 0; var12 < this.field7871; var12++) {
                int var13 = this.field7866 * var12;
                for (int var14 = 0; var14 < this.field7866; var14++) {
                    var5[var13 + var14] = class446.method2556(class48.method346(var5[var13 + var14], 16777215), var4[var13 + var14] == 0 ? 0 : -16777216);
                }
            }
        }
        this.method3263(0, 0, this.field7866, this.field7871, var5, 0, this.field7866);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILaa;II)V", line = 344)
    public final void method1031(int arg0, int arg1, class490 arg2, int arg3, int arg4) {
        field7874++;
        class431 var6 = (class431) arg2;
        int var7 = this.field7861 + arg0;
        class297 var8 = var6.field5937;
        int var9 = this.field7854 + arg1;
        this.field7856.method340(-9495, class94.field1141);
        this.field7877.method925(true);
        this.field7877.method823(this.field7856, -8423);
        this.field7877.method836(-129, 1);
        this.field7877.method887((byte) 124, 1);
        class615 var10 = this.field7877.method846(-24720);
        var10.method3366((float) this.field7871, (float) this.field7866, 0.0F, (byte) -49);
        var10.method1730(var7, var9, 0);
        this.field7877.method842(68);
        class615 var11 = this.field7877.method916(0);
        var11.method3366(this.field7856.method597((float) this.field7871, 62), this.field7856.method591(-2092, (float) this.field7866), 1.0F, (byte) -49);
        this.field7877.method878(3, class91.field1105);
        this.field7877.method934(1, (byte) -65);
        this.field7877.method823(var8, -8423);
        this.field7877.method849((byte) 58, class312.field4469, class99.field1265);
        this.field7877.method840(0, -67, class227.field3230);
        class615 var12 = this.field7877.method916(0);
        var12.method3366(var8.method597((float) this.field7871, -75), var8.method591(-2092, (float) this.field7866), 1.0F, (byte) -49);
        var12.method3353(var8.method591(-2092, (float) (var7 - arg3)), 0.0F, var8.method597((float) (var9 - arg4), -77), 13);
        this.field7877.method878(3, class91.field1105);
        this.field7877.method880(-128);
        this.field7877.method819(-104);
        this.field7877.method840(0, -94, class454.field6199);
        this.field7877.method849((byte) 60, class312.field4469, class312.field4469);
        this.field7877.method823(null, -8423);
        this.field7877.method934(0, (byte) -65);
        this.field7877.method819(-119);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()I", line = 391)
    public final int method1036() {
        field7878++;
        return this.field7861 + this.field7860 + this.field7866;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V", line = 399)
    public final void method1045(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7855++;
        class615 var6 = this.field7877.method846(-24720);
        class615 var7 = this.field7877.method916(0);
        int var8 = this.field7854 + arg1;
        int var9 = this.field7861 + arg0;
        this.field7856.method340(-9495, class94.field1141);
        this.field7877.method925(true);
        this.field7877.method823(this.field7856, -8423);
        this.field7877.method836(-129, arg4);
        this.field7877.method887((byte) 123, arg2);
        this.field7877.method840(1, 40, class362.field5101);
        this.field7877.method845(class362.field5101, (byte) 117, 1);
        this.field7877.method870(arg3, false);
        var6.method3366((float) this.field7871, (float) this.field7866, 0.0F, (byte) -49);
        var6.method1730(var9, var8, 0);
        var7.method3366(this.field7856.method597((float) this.field7871, 79), this.field7856.method591(-2092, (float) this.field7866), 1.0F, (byte) -49);
        this.field7877.method878(3, class91.field1105);
        this.field7877.method842(65);
        this.field7877.method880(46);
        this.field7877.method819(-88);
        this.field7877.method840(1, 38, class227.field3230);
        this.field7877.method845(class227.field3230, (byte) 121, 1);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "()I", line = 432)
    public final int method1043() {
        field7852++;
        return this.field7871;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V", line = 440)
    public final void method1051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7862++;
        int[] var7 = this.field7877.method473(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class446.method2556(var7[var8], -16777216);
            }
            this.method3263(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)V", line = 464)
    public final void method1032(int arg0, int arg1, int arg2, int arg3) {
        this.field7854 = arg1;
        this.field7861 = arg0;
        field7857++;
        this.field7860 = arg2;
        this.field7863 = arg3;
        this.field7870 = this.field7861 != 0 || this.field7854 != 0 || this.field7860 != 0 || this.field7863 != 0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 477)
    public final void method1041(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class490 arg7, int arg8, int arg9) {
        field7853++;
        class615 var11 = this.field7877.method846(-24720);
        class615 var12 = this.field7877.method916(0);
        class431 var13 = (class431) arg7;
        class297 var14 = var13.field5937;
        this.field7856.method340(-9495, this.field7865 || this.field7868 || (arg6 & 0x1) == 0 ? class94.field1141 : class475.field6514);
        this.field7877.method925(true);
        this.field7877.method823(this.field7856, -8423);
        this.field7877.method836(-129, 1);
        this.field7877.method887((byte) 112, 1);
        if (this.field7870) {
            float var15 = (float) this.field7866 / (float) this.method1036();
            float var16 = (float) this.field7871 / (float) this.method1048();
            var11.method3359((arg2 - arg0) * var15, (arg3 - arg1) * var15, 1.0F, 0.0F, -126, (arg4 - arg0) * var16, 0.0F, (arg5 - arg1) * var16, 0.0F, 0.0F);
            var11.method3353(((float) this.field7861 + arg0) * var15, 0.0F, ((float) this.field7854 + arg1) * var16, 13);
        } else {
            var11.method3359(arg2 - arg0, -arg1 + arg3, 1.0F, 0.0F, 22, arg4 - arg0, 0.0F, arg5 - arg1, 0.0F, 0.0F);
            var11.method3353(arg0, 0.0F, arg1, 13);
        }
        var12.method3366(this.field7856.method597((float) this.field7871, -118), this.field7856.method591(-2092, (float) this.field7866), 1.0F, (byte) -49);
        this.field7877.method878(3, class91.field1105);
        this.field7877.method934(1, (byte) -65);
        this.field7877.method823(var14, -8423);
        this.field7877.method849((byte) 59, class312.field4469, class99.field1265);
        this.field7877.method840(0, -88, class227.field3230);
        class615 var17 = this.field7877.method916(0);
        var17.method1712(var11);
        var17.method1730(-arg8, -arg9, 0);
        var17.method3348(var14.method591(-2092, 1.0F), (byte) -121, var14.method597(1.0F, 35), 1.0F);
        this.field7877.method878(3, class91.field1105);
        this.field7877.method842(118);
        this.field7877.method880(58);
        this.field7877.method819(-108);
        this.field7877.method840(0, -99, class454.field6199);
        this.field7877.method849((byte) 96, class312.field4469, class312.field4469);
        this.field7877.method823(null, -8423);
        this.field7877.method934(0, (byte) -65);
        this.field7877.method819(-119);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lrv;IIZ)V", line = 695)
    public class599(class111 arg0, int arg1, int arg2, boolean arg3) {
        this.field7866 = arg1;
        this.field7877 = arg0;
        this.field7871 = arg2;
        this.field7856 = arg0.method861(arg2, arg3 ? class315.field4498 : class282.field3991, -121, arg1, class408.field5668);
        this.field7856.method595(1645, true, true);
        this.field7865 = this.field7856.method592((byte) -32) != arg1;
        this.field7868 = this.field7856.method598((byte) 111) != arg2;
        this.field7858 = !this.field7865 && this.field7856.method599((byte) 110);
        this.field7875 = !this.field7868 && this.field7856.method599((byte) 101);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lrv;II[III)V", line = 710)
    public class599(class111 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field7877 = arg0;
        this.field7866 = arg1;
        this.field7871 = arg2;
        this.field7856 = arg0.method850(arg4, arg3, arg1, false, arg5, arg2, -86);
        this.field7856.method595(1645, true, true);
        this.field7865 = this.field7856.method592((byte) -118) != arg1;
        this.field7868 = arg2 != this.field7856.method598((byte) 111);
        this.field7858 = !this.field7865 && this.field7856.method599((byte) -116);
        this.field7875 = !this.field7868 && this.field7856.method599((byte) 124);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIII)V", line = 541)
    public final void method1050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7869++;
        class615 var9 = this.field7877.method846(-24720);
        class615 var10 = this.field7877.method916(0);
        this.field7856.method340(-9495, this.field7865 || this.field7868 || (arg7 & 0x1) == 0 ? class94.field1141 : class475.field6514);
        this.field7877.method925(true);
        this.field7877.method823(this.field7856, -8423);
        this.field7877.method836(-129, arg6);
        this.field7877.method887((byte) 123, arg4);
        this.field7877.method840(1, 23, class362.field5101);
        this.field7877.method845(class362.field5101, (byte) 115, 1);
        this.field7877.method870(arg5, false);
        var10.method3366(this.field7856.method597((float) this.field7871, 85), this.field7856.method591(-2092, (float) this.field7866), 1.0F, (byte) -49);
        if (this.field7870) {
            arg2 = this.field7866 * arg2 / this.method1036();
            arg3 = this.field7871 * arg3 / this.method1048();
            arg0 += this.field7861 * arg2 / this.field7866;
            arg1 += this.field7854 * arg3 / this.field7871;
        }
        var9.method3366((float) arg3, (float) arg2, 0.0F, (byte) -49);
        var9.method1730(arg0, arg1, 0);
        this.field7877.method878(3, class91.field1105);
        this.field7877.method842(104);
        this.field7877.method880(-118);
        this.field7877.method819(-102);
        this.field7877.method840(1, 72, class227.field3230);
        this.field7877.method845(class227.field3230, (byte) 91, 1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 577)
    public static void method3262(int arg0) {
        field7851 = null;
        if (arg0 != -4) {
            method3262(88);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()I", line = 592)
    public final int method1042() {
        field7876++;
        return this.field7866;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII[III)V", line = 610)
    private final void method3263(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field7856.method596(arg1, arg6, arg0, arg5, arg2, arg4, arg3, (byte) 89);
        field7859++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(FFFFFFIIII)V", line = 622)
    public final void method1034(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field7864++;
        class615 var11 = this.field7877.method846(-24720);
        class615 var12 = this.field7877.method916(0);
        this.field7856.method340(-9495, this.field7865 || this.field7868 || ~(arg9 & 0x1) == -1 ? class94.field1141 : class475.field6514);
        this.field7877.method925(true);
        this.field7877.method823(this.field7856, -8423);
        this.field7877.method836(-129, arg8);
        this.field7877.method887((byte) 104, arg6);
        this.field7877.method840(1, 83, class362.field5101);
        this.field7877.method845(class362.field5101, (byte) 84, 1);
        this.field7877.method870(arg7, false);
        if (this.field7870) {
            float var13 = (float) this.method1036();
            float var14 = (float) this.method1048();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field7854 * var17;
            float var20 = (float) this.field7854 * var18;
            float var21 = (float) this.field7861 * var15;
            float var22 = (float) this.field7861 * var16;
            float var23 = (float) this.field7860 * -var15;
            float var24 = (float) this.field7860 * -var16;
            float var25 = (float) this.field7863 * -var17;
            arg3 = arg3 + var24 + var20;
            arg2 = arg2 + var23 + var19;
            arg0 = arg0 + var21 + var19;
            float var26 = (float) this.field7863 * -var18;
            arg4 = arg4 + var21 + var25;
            arg1 = arg1 + var22 + var20;
            arg5 = arg5 + var22 + var26;
        }
        var11.method3359(arg2 - arg0, -arg1 + arg3, 1.0F, 0.0F, -124, arg4 - arg0, 0.0F, arg5 - arg1, 0.0F, 0.0F);
        var11.method3353(arg0, 0.0F, arg1, 13);
        var12.method3366(this.field7856.method597((float) this.field7871, 123), this.field7856.method591(-2092, (float) this.field7866), 1.0F, (byte) -49);
        this.field7877.method878(3, class91.field1105);
        this.field7877.method842(122);
        this.field7877.method880(-127);
        this.field7877.method819(-110);
        this.field7877.method840(1, -51, class227.field3230);
        this.field7877.method845(class227.field3230, (byte) 108, 1);
    }
}
