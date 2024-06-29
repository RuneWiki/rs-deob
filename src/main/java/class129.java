import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class129 extends class26 {

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "F")
    public float field1645;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "Z")
    public boolean field1642;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "F")
    public float field1647;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "[[B")
    public static byte[][] field1644 = new byte[250][];

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "Lvo;")
    public static class31 field1649;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method715(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1646;
        if (arg0 == -43) {
            int var8 = 0;
            int var9 = arg7;
            int var10 = 0;
            int var11 = arg5 - arg1;
            int var12 = arg7 - arg1;
            int var13 = arg5 * arg5;
            int var14 = arg7 * arg7;
            int var15 = var11 * var11;
            int var16 = var12 * var12;
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = arg7 << 1;
            int var22 = var12 << 1;
            int var23 = (-var21 + 1) * var13 + var17;
            int var24 = -((var21 + -1) * var18) + var14;
            int var25 = (-var22 + 1) * var15 + var19;
            int var26 = -((var22 + -1) * var20) + var16;
            int var27 = var13 << 2;
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            int var31 = var17 * 3;
            int var32 = (var21 + -3) * var18;
            int var33 = var19 * 3;
            int var34 = (var22 + -3) * var20;
            int var35 = var28;
            int var36 = (arg7 + -1) * var27;
            int var37 = var30;
            int var38 = (var12 - 1) * var29;
            int[] var39 = class41.field629[arg6];
            class238.method1440(var39, arg4, -var11 + arg2, -arg5 + arg2, arg0 + -14683);
            class238.method1440(var39, arg3, arg2 + var11, -var11 + arg2, -14726);
            class238.method1440(var39, arg4, arg2 + arg5, arg2 + var11, -14726);
            while (~var9 < -1) {
                boolean var40 = var9 <= var12;
                if (var40) {
                    if (var25 < 0) {
                        while (~var25 > -1) {
                            var25 += var33;
                            var26 += var37;
                            var33 += var30;
                            var37 += var30;
                            ++var10;
                        }
                    }
                    if (~var26 > -1) {
                        var25 += var33;
                        var26 += var37;
                        ++var10;
                        var33 += var30;
                        var37 += var30;
                    }
                    var25 += -var38;
                    var26 += -var34;
                    var38 -= var29;
                    var34 -= var29;
                }
                if (~var23 > -1) {
                    while (~var23 > -1) {
                        var24 += var35;
                        var23 += var31;
                        var31 += var28;
                        ++var8;
                        var35 += var28;
                    }
                }
                if (~var24 > -1) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
                    ++var8;
                }
                var24 += -var32;
                var23 += -var36;
                var32 -= var27;
                --var9;
                var36 -= var27;
                int var41 = -var9 + arg6;
                int var42 = arg6 + var9;
                int var43 = arg2 - -var8;
                int var44 = arg2 - var8;
                if (var40) {
                    int var45 = arg2 - -var10;
                    int var46 = -var10 + arg2;
                    class238.method1440(class41.field629[var41], arg4, var46, var44, arg0 + -14683);
                    class238.method1440(class41.field629[var41], arg3, var45, var46, arg0 + -14683);
                    class238.method1440(class41.field629[var41], arg4, var43, var45, -14726);
                    class238.method1440(class41.field629[var42], arg4, var46, var44, -14726);
                    class238.method1440(class41.field629[var42], arg3, var45, var46, arg0 ^ 14767);
                    class238.method1440(class41.field629[var42], arg4, var43, var45, -14726);
                } else {
                    class238.method1440(class41.field629[var41], arg4, var43, var44, arg0 + -14683);
                    class238.method1440(class41.field629[var42], arg4, var43, var44, arg0 ^ 14767);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
    public static void method716(int arg0) {
        if (arg0 == -3993) {
            field1649 = null;
            field1644 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lrl;IIIII[BI)V")
    public class129(class487 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1641 = arg2;
        this.field1643 = arg3;
        this.method227(true, arg3, -3608, 0, arg2, 0, 0, arg7, arg6, 0);
        this.field1645 = (float) arg2 / (float) arg4;
        this.field1642 = false;
        this.field1647 = (float) arg3 / (float) arg5;
        this.method228(false, false, 0);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lrl;IIIIIZ)V")
    public class129(class487 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field1643 = arg5;
        if (super.field3116 != 34037) {
            this.field1642 = true;
            this.field1645 = this.field1647 = 1.0F;
        } else {
            this.field1647 = (float) arg5;
            this.field1645 = (float) arg4;
            this.field1642 = false;
        }
        this.field1641 = arg4;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lrl;IIII[I)V")
    public class129(class487 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field1641 = arg1;
        this.field1643 = arg2;
        this.method229(true, 0, 0, 121, arg1, 0, arg5, arg2, 0);
        this.field1645 = (float) arg1 / (float) arg3;
        this.field1647 = (float) arg2 / (float) arg4;
        this.field1642 = false;
        this.method228(false, false, 0);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lrl;IIIZ[I)V")
    public class129(class487 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field1643 = arg3;
        if (super.field3116 != 34037) {
            this.field1645 = this.field1647 = 1.0F;
            this.field1642 = true;
        } else {
            this.field1645 = (float) arg2;
            this.field1642 = false;
            this.field1647 = (float) arg3;
        }
        this.field1641 = arg2;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lrl;IIIIZ[BI)V")
    public class129(class487 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field1641 = arg3;
        this.field1643 = arg4;
        if (super.field3116 == 34037) {
            this.field1642 = false;
            this.field1647 = (float) arg4;
            this.field1645 = (float) arg3;
        } else {
            this.field1642 = true;
            this.field1645 = this.field1647 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Leq;ILhe;)V")
    public static final void method717(class134 arg0, int arg1, class239 arg2) {
        ++field1650;
        class328[] var3 = class328.method1976(arg2, class397.field5844, 0);
        class149.field1929 = new class307[var3.length];
        for (int var4 = 0; ~var3.length < ~var4; ++var4) {
            class149.field1929[var4] = arg0.method804(var3[var4], true);
        }
        class328[] var5 = class328.method1976(arg2, class432.field6349, 0);
        class383.field5697 = new class307[var5.length];
        for (int var6 = 0; ~var6 > ~var5.length; ++var6) {
            class383.field5697[var6] = arg0.method804(var5[var6], true);
        }
        class328[] var7 = class328.method1976(arg2, class283.field4039, 0);
        class17.field244 = new class307[var7.length];
        for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
            class17.field244[var8] = arg0.method804(var7[var8], true);
        }
        class328[] var9 = class328.method1976(arg2, class15.field227, 0);
        class485.field7021 = new class307[var9.length];
        for (int var10 = 0; ~var10 > ~var9.length; ++var10) {
            class485.field7021[var10] = arg0.method804(var9[var10], true);
        }
        class328[] var11 = class328.method1976(arg2, class221.field3115, 0);
        class122.field1593 = new class307[var11.length];
        for (int var12 = 0; ~var11.length < ~var12; ++var12) {
            class122.field1593[var12] = arg0.method804(var11[var12], true);
        }
        class328[] var13 = class328.method1976(arg2, class75.field1071, 0);
        class150.field1943 = new class307[var13.length];
        for (int var14 = 0; var14 < var13.length; ++var14) {
            class150.field1943[var14] = arg0.method804(var13[var14], true);
        }
        class328[] var15 = class328.method1976(arg2, class480.field6931, 0);
        class69.field1018 = new class307[var15.length];
        for (int var16 = 0; ~var16 > ~var15.length; ++var16) {
            class69.field1018[var16] = arg0.method804(var15[var16], true);
        }
        class328[] var17 = class328.method1976(arg2, class272.field3847, 0);
        class77.field1090 = new class307[var17.length];
        for (int var18 = 0; var18 < var17.length; ++var18) {
            class77.field1090[var18] = arg0.method804(var17[var18], true);
        }
        class328[] var19 = class328.method1976(arg2, class267.field3770, 0);
        class347.field5011 = new class307[var19.length];
        for (int var20 = 0; var19.length > var20; ++var20) {
            class347.field5011[var20] = arg0.method804(var19[var20], true);
        }
        class328[] var21 = class328.method1976(arg2, class336.field4873, 0);
        if (arg1 != 1623) {
            method715((byte) 2, -72, 21, -61, -84, -109, -65, -111);
        }
        class168.field2220 = new class307[var21.length];
        for (int var22 = 0; ~var22 > ~var21.length; ++var22) {
            class168.field2220[var22] = arg0.method804(var21[var22], true);
        }
        class328[] var23 = class328.method1976(arg2, class169.field2231, 0);
        class480.field6934 = new class307[var23.length];
        for (int var24 = 0; var23.length > var24; ++var24) {
            class480.field6934[var24] = arg0.method804(var23[var24], true);
        }
        class328[] var25 = class328.method1976(arg2, class141.field1848, 0);
        class106.field1421 = new class307[var25.length];
        for (int var26 = 0; var26 < var25.length; ++var26) {
            class106.field1421[var26] = arg0.method804(var25[var26], true);
        }
        class190.field2703 = arg0.method804(class328.method1978(arg2, class386.field5721, 0), true);
        class7.field117 = arg0.method804(class328.method1978(arg2, class478.field6879, 0), true);
        class328[] var27 = class328.method1976(arg2, class463.field6726, 0);
        class276.field3952 = new class307[var27.length];
        for (int var28 = 0; var27.length > var28; ++var28) {
            class276.field3952[var28] = arg0.method804(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lrl;IIIIIIZ)V")
    public class129(class487 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field1642 = false;
        this.field1645 = (float) arg3 / (float) arg5;
        this.field1641 = arg3;
        this.field1647 = (float) arg4 / (float) arg6;
        this.field1643 = arg4;
        this.method228(false, false, 0);
    }
}
