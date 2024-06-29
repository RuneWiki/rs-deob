import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class281 extends class681 {

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "Z")
    private boolean field3842 = false;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field3845 = new String[100];

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "Llga;")
    public static class663 field3840 = new class663(4);

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "Lrg;")
    public static class596 field3847 = new class596(9, 7);

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "[[[I")
    public static int[][][] field3846;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIB)V", line = 13)
    public final void method742(int arg0, int arg1, byte arg2) {
        int var4 = -108 % ((-38 - arg2) / 35);
        ++field3838;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIIBII)V", line = 22)
    public static final void method1728(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++field3841;
        if (arg5 > -113) {
            method1728(46, -35, 84, 10, 108, (byte) 56, -108, 4);
        }
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg4 - arg0;
        int var12 = -arg0 + arg1;
        int var13 = arg4 * arg4;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = var16 - (var22 + -1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        int var36 = (arg1 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class344.field4599[arg3];
        class470.method2660(-arg4 + arg6, -var11 + arg6, var39, (byte) 11, arg7);
        class470.method2660(arg6 - var11, arg6 + var11, var39, (byte) 11, arg2);
        class470.method2660(arg6 + var11, arg4 + arg6, var39, (byte) 11, arg7);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (~var23 > -1) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    ++var8;
                    var35 += var28;
                }
            }
            if (var40) {
                if (~var25 > -1) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        var33 += var30;
                        ++var10;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    ++var10;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                ++var8;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            --var9;
            var32 -= var27;
            var36 -= var27;
            int var41 = -var9 + arg3;
            int var42 = arg3 - -var9;
            int var43 = arg6 + var8;
            int var44 = arg6 - var8;
            if (var40) {
                int var45 = arg6 - -var10;
                int var46 = -var10 + arg6;
                class470.method2660(var44, var46, class344.field4599[var41], (byte) 11, arg7);
                class470.method2660(var46, var45, class344.field4599[var41], (byte) 11, arg2);
                class470.method2660(var45, var43, class344.field4599[var41], (byte) 11, arg7);
                class470.method2660(var44, var46, class344.field4599[var42], (byte) 11, arg7);
                class470.method2660(var46, var45, class344.field4599[var42], (byte) 11, arg2);
                class470.method2660(var45, var43, class344.field4599[var42], (byte) 11, arg7);
            } else {
                class470.method2660(var44, var43, class344.field4599[var41], (byte) 11, arg7);
                class470.method2660(var44, var43, class344.field4599[var42], (byte) 11, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)V", line = 191)
    public static void method1729(int arg0) {
        field3840 = null;
        if (arg0 <= 113) {
            method1728(-87, -71, -88, -59, -125, (byte) 110, -71, -100);
        }
        field3847 = null;
        field3845 = null;
        field3846 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZI)V", line = 204)
    public final void method739(boolean arg0, int arg1) {
        ++field3844;
        super.field9721.method2199(class334.field4505, 9797, class276.field3814);
        if (arg1 != 7) {
            method1728(-110, -119, 126, 31, 51, (byte) -96, 106, -23);
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lnv;)V", line = 215)
    public class281(class382 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILrga;I)V", line = 219)
    public final void method744(int arg0, class218 arg1, int arg2) {
        super.field9721.method2241(arg1, (byte) 44);
        if (arg2 != -3) {
            field3847 = null;
        }
        ++field3839;
        super.field9721.method2246(arg0, 26770);
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(ZI)V", line = 236)
    public final void method741(boolean arg0, int arg1) {
        if (arg1 != 3) {
            field3846 = null;
        }
        ++field3843;
        class388 var3 = super.field9721.method2197((byte) -60);
        if (var3 != null && arg0) {
            super.field9721.method2201((byte) 14, 1);
            super.field9721.method2241(var3, (byte) 44);
            super.field9721.method1042(false, class563.field7604);
            super.field9721.method2201((byte) 121, 1);
            super.field9721.method2199(class127.field1821, 9797, class276.field3814);
            super.field9721.method1052(false, 2, true, class78.field1179, arg1 ^ 113);
            super.field9721.method2223(0, class227.field3159, (byte) -11);
            class274 var4 = super.field9721.method2235(2);
            var4.method1717(super.field9721.method2261(1024), (byte) 30);
            super.field9721.method2227(class467.field6424, (byte) -124);
            super.field9721.method2201((byte) -92, 0);
            this.field3842 = true;
        } else {
            super.field9721.method2223(0, class227.field3159, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V", line = 270)
    public final void method740(int arg0) {
        ++field3835;
        if (!this.field3842) {
            super.field9721.method2223(0, class262.field3553, (byte) -14);
        } else {
            super.field9721.method2201((byte) 127, 1);
            super.field9721.method1042(false, class564.field7621);
            super.field9721.method2199(class334.field4505, 9797, class334.field4505);
            super.field9721.method2264(9, class452.field6221, 2);
            super.field9721.method2223(0, class262.field3553, (byte) -48);
            super.field9721.method2234(-86);
            super.field9721.method2241((class218) null, (byte) 44);
            super.field9721.method2201((byte) -119, 0);
            this.field3842 = false;
        }
        super.field9721.method2199(class334.field4505, arg0 ^ -9800, class334.field4505);
        if (arg0 != -3) {
            field3840 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)Z", line = 297)
    public final boolean method751(boolean arg0) {
        ++field3837;
        if (!arg0) {
            this.field3842 = false;
        }
        return true;
    }
}
