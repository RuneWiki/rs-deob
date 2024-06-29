import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class345 extends class468 {

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    private int field4729 = 0;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    private int field4732 = 0;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "Z")
    private boolean field4736 = false;

    @OriginalMember(owner = "client!wu", name = "D", descriptor = "I")
    private int field4751 = 0;

    @OriginalMember(owner = "client!wu", name = "C", descriptor = "I")
    private int field4750 = 0;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
    private int field4738;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "Lej;")
    private class111 field4730;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    private int field4728;

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "Lak;")
    private class324 field4745;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "Z")
    private boolean field4726;

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "Z")
    private boolean field4747;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "Z")
    private boolean field4739;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "Z")
    private boolean field4744;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "[I")
    public static int[] field4723 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "Lcp;")
    public static class679 field4737 = new class679();

    @OriginalMember(owner = "client!wu", name = "F", descriptor = "I")
    public static int field4753 = -1;

    @OriginalMember(owner = "client!wu", name = "G", descriptor = "[I")
    public static int[] field4754 = new int[14];

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!wu", name = "B", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!wu", name = "E", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!wu", name = "GA", descriptor = "(IIIIII)V", line = 16)
    public final void method273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4743++;
        int[] var7 = this.field4730.method106(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class220.method1393(var7[var8], -16777216);
            }
            this.method2073(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 40)
    public final void method1026(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class217 arg6, int arg7, int arg8) {
        field4735++;
        class74 var10 = this.field4730.method857(1558);
        class74 var11 = this.field4730.method879(0);
        class376 var12 = (class376) arg6;
        class324 var13 = var12.field5067;
        this.field4745.method166(class708.field9922, 7651);
        this.field4730.method852((byte) -88);
        this.field4730.method897(this.field4745, true);
        this.field4730.method902(true, 1);
        this.field4730.method858(1, 25681);
        if (this.field4736) {
            float var14 = (float) this.field4728 / (float) this.method1025();
            float var15 = (float) this.field4738 / (float) this.method1030();
            var10.method577((arg4 - arg0) * var15, 0.0F, true, 0.0F, (arg5 - arg1) * var15, 0.0F, 0.0F, 1.0F, (arg3 - arg1) * var14, (arg2 - arg0) * var14);
            var10.method568(0.0F, ((float) this.field4732 + arg0) * var14, 116, ((float) this.field4751 + arg1) * var15);
        } else {
            var10.method577(arg4 - arg0, 0.0F, true, 0.0F, arg5 - arg1, 0.0F, 0.0F, 1.0F, arg3 - arg1, arg2 - arg0);
            var10.method568(0.0F, arg0, 60, arg1);
        }
        var11.method585(1.0F, this.field4745.method940((float) this.field4738, false), this.field4745.method948(22051, (float) this.field4728), (byte) 27);
        this.field4730.method866(5758, class19.field313);
        this.field4730.method845(1, -58);
        this.field4730.method897(var13, true);
        this.field4730.method909(class586.field7773, 114, class521.field6963);
        this.field4730.method859((byte) 29, class291.field4117, 0);
        class74 var16 = this.field4730.method879(0);
        var16.method560(var10);
        var16.method571(-arg7, -arg8, 0);
        var16.method556((byte) 9, 1.0F, var13.method948(22051, 1.0F), var13.method940(1.0F, false));
        this.field4730.method866(5758, class19.field313);
        this.field4730.method848(-362227984);
        this.field4730.method864(false);
        this.field4730.method842(123);
        this.field4730.method859((byte) 29, class350.field4792, 0);
        this.field4730.method909(class521.field6963, -38, class521.field6963);
        this.field4730.method897(null, true);
        this.field4730.method845(0, 105);
        this.field4730.method842(-106);
    }

    @OriginalMember(owner = "client!wu", name = "EA", descriptor = "(IIII)V", line = 95)
    public final void method1029(int arg0, int arg1, int arg2, int arg3) {
        this.field4750 = arg3;
        this.field4751 = arg1;
        field4722++;
        this.field4729 = arg2;
        this.field4732 = arg0;
        this.field4736 = this.field4732 != 0 || this.field4751 != 0 || this.field4729 != 0 || this.field4750 != 0;
    }

    @OriginalMember(owner = "client!wu", name = "ba", descriptor = "(IIIIIII)V", line = 107)
    public final void method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4725++;
        class74 var8 = this.field4730.method857(1558);
        class74 var9 = this.field4730.method879(0);
        this.field4745.method166(class175.field2696, 7651);
        this.field4730.method852((byte) -88);
        this.field4730.method897(this.field4745, true);
        this.field4730.method902(true, arg6);
        this.field4730.method858(arg4, 25681);
        this.field4730.method859((byte) 29, class149.field2382, 1);
        this.field4730.method828(48, class149.field2382, 1);
        this.field4730.method865(arg5, -80);
        boolean var10 = this.field4744 && this.field4751 == 0 && this.field4750 == 0;
        boolean var11 = this.field4739 && this.field4732 == 0 && this.field4729 == 0;
        if ((var10 & var11)) {
            var9.method585(1.0F, this.field4745.method940((float) arg3, false), this.field4745.method948(22051, (float) arg2), (byte) 113);
            var8.method585(0.0F, (float) arg3, (float) arg2, (byte) 109);
            var8.method571(arg0, arg1, 0);
            this.field4730.method866(5758, class19.field313);
            this.field4730.method848(-362227984);
            this.field4730.method864(false);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method1030();
            var9.method585(1.0F, this.field4745.method940((float) this.field4738, false), this.field4745.method948(22051, (float) arg2), (byte) 123);
            this.field4730.method866(5758, class19.field313);
            int var14 = this.field4751 + arg1;
            int var15 = this.field4738 + var14;
            while (var15 <= var12) {
                var8.method585(0.0F, (float) this.field4738, (float) arg2, (byte) 50);
                var8.method571(arg0, var14, 0);
                this.field4730.method848(-362227984);
                var14 += var13;
                var15 += var13;
                this.field4730.method864(false);
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method585(1.0F, this.field4745.method940((float) var16, false), this.field4745.method948(22051, (float) arg2), (byte) 34);
                this.field4730.method866(5758, class19.field313);
                var8.method585(0.0F, (float) var16, (float) arg2, (byte) 23);
                var8.method571(arg0, var14, 0);
                this.field4730.method848(-362227984);
                this.field4730.method864(false);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method1025();
            var9.method585(1.0F, this.field4745.method940((float) arg3, false), this.field4745.method948(22051, (float) this.field4728), (byte) 45);
            this.field4730.method866(5758, class19.field313);
            int var32 = this.field4732 + arg0;
            for (int var33 = this.field4728 + var32; var33 <= var30; var33 += var31) {
                var8.method585(0.0F, (float) arg3, (float) this.field4728, (byte) 99);
                var8.method571(var32, arg1, 0);
                this.field4730.method848(-362227984);
                this.field4730.method864(false);
                var32 += var31;
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method585(1.0F, this.field4745.method940((float) arg3, false), this.field4745.method948(22051, (float) var34), (byte) 25);
                this.field4730.method866(5758, class19.field313);
                var8.method585(0.0F, (float) arg3, (float) var34, (byte) 122);
                var8.method571(var32, arg1, 0);
                this.field4730.method848(-362227984);
                this.field4730.method864(false);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method1025();
            int var20 = this.method1030();
            int var21 = arg1 + this.field4751;
            int var22 = this.field4738 + var21;
            while (var17 >= var22) {
                var9.method585(1.0F, this.field4745.method940((float) this.field4738, false), this.field4745.method948(22051, (float) this.field4728), (byte) 54);
                this.field4730.method866(5758, class19.field313);
                int var27 = arg0 + this.field4732;
                for (int var28 = this.field4728 + var27; var28 <= var18; var28 += var19) {
                    var8.method585(0.0F, (float) this.field4738, (float) this.field4728, (byte) 84);
                    var8.method571(var27, var21, 0);
                    this.field4730.method848(-362227984);
                    var27 += var19;
                    this.field4730.method864(false);
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method585(1.0F, this.field4745.method940((float) this.field4738, false), this.field4745.method948(22051, (float) var29), (byte) 125);
                    this.field4730.method866(5758, class19.field313);
                    var8.method585(0.0F, (float) this.field4738, (float) var29, (byte) 76);
                    var8.method571(var27, var21, 0);
                    this.field4730.method848(-362227984);
                    this.field4730.method864(false);
                }
                var22 += var20;
                var21 += var20;
            }
            if (var17 > var21) {
                int var23 = var17 - var21;
                var9.method585(1.0F, this.field4745.method940((float) var23, false), this.field4745.method948(22051, (float) this.field4728), (byte) 72);
                this.field4730.method866(5758, class19.field313);
                int var24 = this.field4732 + arg0;
                int var25 = this.field4728 + var24;
                while (var18 >= var25) {
                    var8.method585(0.0F, (float) var23, (float) this.field4728, (byte) 118);
                    var8.method571(var24, var21, 0);
                    this.field4730.method848(-362227984);
                    var24 += var19;
                    var25 += var19;
                    this.field4730.method864(false);
                }
                if (var18 > var24) {
                    int var26 = var18 - var24;
                    var9.method585(1.0F, this.field4745.method940((float) var23, false), this.field4745.method948(22051, (float) var26), (byte) 88);
                    this.field4730.method866(5758, class19.field313);
                    var8.method585(0.0F, (float) var23, (float) var26, (byte) 37);
                    var8.method571(var24, var21, 0);
                    this.field4730.method848(-362227984);
                    this.field4730.method864(false);
                }
            }
        }
        this.field4730.method842(-123);
        this.field4730.method859((byte) 29, class291.field4117, 1);
        this.field4730.method828(81, class291.field4117, 1);
    }

    @OriginalMember(owner = "client!wu", name = "KA", descriptor = "(IIIIIII)V", line = 316)
    public final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4748++;
        class74 var8 = this.field4730.method857(1558);
        class74 var9 = this.field4730.method879(0);
        this.field4745.method166(this.field4726 || this.field4747 ? class175.field2696 : class708.field9922, 7651);
        this.field4730.method852((byte) -88);
        this.field4730.method897(this.field4745, true);
        this.field4730.method902(true, arg6);
        this.field4730.method858(arg4, 25681);
        this.field4730.method859((byte) 29, class149.field2382, 1);
        this.field4730.method828(44, class149.field2382, 1);
        this.field4730.method865(arg5, -115);
        var9.method585(1.0F, this.field4745.method940((float) this.field4738, false), this.field4745.method948(22051, (float) this.field4728), (byte) 107);
        if (this.field4736) {
            arg2 = this.field4728 * arg2 / this.method1025();
            arg3 = this.field4738 * arg3 / this.method1030();
            arg0 += this.field4732 * arg2 / this.field4728;
            arg1 += this.field4751 * arg3 / this.field4738;
        }
        var8.method585(0.0F, (float) arg3, (float) arg2, (byte) 26);
        var8.method571(arg0, arg1, 0);
        this.field4730.method866(5758, class19.field313);
        this.field4730.method848(-362227984);
        this.field4730.method864(false);
        this.field4730.method842(-109);
        this.field4730.method859((byte) 29, class291.field4117, 1);
        this.field4730.method828(47, class291.field4117, 1);
    }

    @OriginalMember(owner = "client!wu", name = "I", descriptor = "(IIIII)V", line = 352)
    public final void method271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4746++;
        class74 var6 = this.field4730.method857(1558);
        class74 var7 = this.field4730.method879(0);
        int var8 = this.field4751 + arg1;
        int var9 = this.field4732 + arg0;
        this.field4745.method166(class175.field2696, 7651);
        this.field4730.method852((byte) -88);
        this.field4730.method897(this.field4745, true);
        this.field4730.method902(true, arg4);
        this.field4730.method858(arg2, 25681);
        this.field4730.method859((byte) 29, class149.field2382, 1);
        this.field4730.method828(29, class149.field2382, 1);
        this.field4730.method865(arg3, -113);
        var6.method585(0.0F, (float) this.field4738, (float) this.field4728, (byte) 74);
        var6.method571(var9, var8, 0);
        var7.method585(1.0F, this.field4745.method940((float) this.field4738, false), this.field4745.method948(22051, (float) this.field4728), (byte) 123);
        this.field4730.method866(5758, class19.field313);
        this.field4730.method848(-362227984);
        this.field4730.method864(false);
        this.field4730.method842(32);
        this.field4730.method859((byte) 29, class291.field4117, 1);
        this.field4730.method828(116, class291.field4117, 1);
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lej;IIZ)V", line = 640)
    public class345(class111 arg0, int arg1, int arg2, boolean arg3) {
        this.field4738 = arg2;
        this.field4730 = arg0;
        this.field4728 = arg1;
        this.field4745 = arg0.method46(class294.field4160, arg1, 0, arg3 ? class5.field100 : class88.field1335, arg2);
        this.field4726 = arg1 != this.field4745.method944(true);
        this.field4747 = this.field4745.method939((byte) -50) != arg2;
        this.field4739 = !this.field4726 && this.field4745.method946((byte) -58);
        this.field4744 = !this.field4747 && this.field4745.method946((byte) -117);
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lej;II[III)V", line = 654)
    public class345(class111 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4728 = arg1;
        this.field4738 = arg2;
        this.field4730 = arg0;
        this.field4745 = arg0.method37((byte) -107, arg2, false, arg4, arg3, arg5, arg1);
        this.field4726 = this.field4745.method944(true) != arg1;
        this.field4747 = this.field4745.method939((byte) -8) != arg2;
        this.field4739 = !this.field4726 && this.field4745.method946((byte) 117);
        this.field4744 = !this.field4747 && this.field4745.method946((byte) 21);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIII[III)V", line = 387)
    private final void method2073(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field4734++;
        this.field4745.method941(arg0, arg3, arg2, arg6, arg1, arg5, -110, arg4);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "()I", line = 400)
    public final int method1030() {
        field4724++;
        return this.field4751 + this.field4738 + this.field4750;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "()I", line = 415)
    public final int method1028() {
        field4749++;
        return this.field4738;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILvf;ZZ)V", line = 423)
    public static final void method2074(int arg0, class140 arg1, boolean arg2, boolean arg3) {
        field4742++;
        int var4 = arg1.field2256;
        int var5 = (int) arg1.field6724;
        arg1.method2797(arg0 + 49);
        if (arg3) {
            class150.method1070(0, var4);
        }
        class111.method907(var4, 0);
        class625 var6 = class153.method1078(65535, var5);
        if (var6 != null) {
            class463.method2624(false, var6);
        }
        class568.method3125(false);
        if (!arg2 && class251.field3463 != -1) {
            class294.method1810(-69, 1, class251.field3463);
        }
        class53 var7 = new class53(class264.field3667);
        if (arg0 != 1) {
            method2075((byte) -62);
        }
        for (class140 var8 = (class140) var7.method357(-1337); var8 != null; var8 = (class140) var7.method358(-1)) {
            if (!var8.method2798(-1)) {
                var8 = (class140) var7.method357(arg0 ^ 0xFFFFFAC6);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field2253 == 3) {
                int var9 = (int) var8.field6724;
                if ((var9 >>> 16) == var4) {
                    method2074(arg0, var8, arg2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V", line = 483)
    public static void method2075(byte arg0) {
        field4737 = null;
        field4723 = null;
        field4754 = null;
        if (arg0 > -26) {
            field4753 = -3;
        }
    }

    @OriginalMember(owner = "client!wu", name = "sa", descriptor = "(FFFFFFIII)V", line = 496)
    public final void method1036(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field4740++;
        class74 var10 = this.field4730.method857(1558);
        class74 var11 = this.field4730.method879(0);
        this.field4745.method166(this.field4726 || this.field4747 ? class175.field2696 : class708.field9922, 7651);
        this.field4730.method852((byte) -88);
        this.field4730.method897(this.field4745, true);
        this.field4730.method902(true, arg8);
        this.field4730.method858(arg6, 25681);
        this.field4730.method859((byte) 29, class149.field2382, 1);
        this.field4730.method828(42, class149.field2382, 1);
        this.field4730.method865(arg7, -50);
        if (this.field4736) {
            float var12 = (float) this.method1025();
            float var13 = (float) this.method1030();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field4751 * var16;
            float var19 = (float) this.field4751 * var17;
            float var20 = (float) this.field4732 * var14;
            float var21 = (float) this.field4732 * var15;
            float var22 = (float) this.field4729 * -var14;
            float var23 = (float) this.field4729 * -var15;
            float var24 = (float) this.field4750 * -var16;
            arg4 = arg4 + var20 + var24;
            arg3 = arg3 + var23 + var19;
            arg0 = arg0 + var20 + var18;
            float var25 = (float) this.field4750 * -var17;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            arg5 = arg5 + var21 + var25;
        }
        var10.method577(arg4 - arg0, 0.0F, true, 0.0F, arg5 - arg1, 0.0F, 0.0F, 1.0F, arg3 - arg1, arg2 - arg0);
        var10.method568(0.0F, arg0, 44, arg1);
        var11.method585(1.0F, this.field4745.method940((float) this.field4738, false), this.field4745.method948(22051, (float) this.field4728), (byte) 110);
        this.field4730.method866(5758, class19.field313);
        this.field4730.method848(-362227984);
        this.field4730.method864(false);
        this.field4730.method842(-95);
        this.field4730.method859((byte) 29, class291.field4117, 1);
        this.field4730.method828(40, class291.field4117, 1);
    }

    @OriginalMember(owner = "client!wu", name = "AA", descriptor = "()I", line = 563)
    public final int method1025() {
        field4733++;
        return this.field4728 + this.field4732 + this.field4729;
    }

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "(III)V", line = 572)
    public final void method272(int arg0, int arg1, int arg2) {
        field4741++;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IILfa;II)V", line = 584)
    public final void method276(int arg0, int arg1, class217 arg2, int arg3, int arg4) {
        field4727++;
        class376 var6 = (class376) arg2;
        int var7 = this.field4732 + arg0;
        class324 var8 = var6.field5067;
        int var9 = this.field4751 + arg1;
        this.field4745.method166(class175.field2696, 7651);
        this.field4730.method852((byte) -88);
        this.field4730.method897(this.field4745, true);
        this.field4730.method902(true, 1);
        this.field4730.method858(1, 25681);
        class74 var10 = this.field4730.method857(1558);
        var10.method585(0.0F, (float) this.field4738, (float) this.field4728, (byte) 27);
        var10.method571(var7, var9, 0);
        this.field4730.method848(-362227984);
        class74 var11 = this.field4730.method879(0);
        var11.method585(1.0F, this.field4745.method940((float) this.field4738, false), this.field4745.method948(22051, (float) this.field4728), (byte) 89);
        this.field4730.method866(5758, class19.field313);
        this.field4730.method845(1, -79);
        this.field4730.method897(var8, true);
        this.field4730.method909(class586.field7773, -117, class521.field6963);
        this.field4730.method859((byte) 29, class291.field4117, 0);
        class74 var12 = this.field4730.method879(0);
        var12.method585(1.0F, var8.method940((float) this.field4738, false), var8.method948(22051, (float) this.field4728), (byte) 64);
        var12.method568(0.0F, var8.method948(22051, (float) (var7 - arg3)), 112, var8.method940((float) (var9 - arg4), false));
        this.field4730.method866(5758, class19.field313);
        this.field4730.method864(false);
        this.field4730.method842(29);
        this.field4730.method859((byte) 29, class350.field4792, 0);
        this.field4730.method909(class521.field6963, -125, class521.field6963);
        this.field4730.method897(null, true);
        this.field4730.method845(0, -107);
        this.field4730.method842(-99);
    }

    @OriginalMember(owner = "client!wu", name = "QA", descriptor = "()I", line = 630)
    public final int method1035() {
        field4731++;
        return this.field4728;
    }
}
