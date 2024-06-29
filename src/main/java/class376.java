import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class376 extends class397 {

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    private int field5610 = 0;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    private int field5615 = 2048;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    private int field5614 = 2048;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    private int field5611 = 12288;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    private int field5612 = 0;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    private int field5616 = 4096;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    private int field5617 = 8192;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "[I")
    public static int[] field5613 = new int[4];

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lhe;I)V")
    public static final void method2278(class239 arg0, int arg1) {
        class449.field6550 = arg0;
        ++field5619;
        int var2 = -100 % ((-65 - arg1) / 36);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI[Lts;IB)V")
    public static final void method2279(int arg0, boolean arg1, int arg2, class356[] arg3, int arg4, byte arg5) {
        ++field5621;
        int var6 = 19 / ((arg5 - 61) / 57);
        for (int var7 = 0; ~var7 > ~arg3.length; ++var7) {
            class356 var8 = arg3[var7];
            if (var8 != null && ~var8.field5160 == ~arg4) {
                class210.method1297((byte) 104, arg1, arg2, var8, arg0);
                class139.method872(arg0, var8, (byte) 83, arg2);
                if (var8.field5219 > -var8.field5168 + var8.field5147) {
                    var8.field5219 = var8.field5147 - var8.field5168;
                }
                if (var8.field5219 < 0) {
                    var8.field5219 = 0;
                }
                if (~(-var8.field5169 + var8.field5235) > ~var8.field5144) {
                    var8.field5144 = -var8.field5169 + var8.field5235;
                }
                if (~var8.field5144 > -1) {
                    var8.field5144 = 0;
                }
                if (var8.field5170 == 0) {
                    class53.method393(arg1, var8, (byte) -81);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(B)V")
    public static void method2280(byte arg0) {
        field5613 = null;
        if (arg0 != 90) {
            field5626 = -2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class376() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI)Z")
    private final boolean method2281(int arg0, boolean arg1, int arg2) {
        ++field5622;
        int var4 = (arg0 - arg2) * this.field5611 >> 12;
        if (arg1) {
            this.method2281(26, true, 5);
        }
        int var5 = class150.field1944[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field5611;
        int var7 = (var6 << 12) / this.field5617;
        int var8 = this.field5616 * var7 >> 12;
        return ~var8 < ~(arg0 + arg2) && -var8 < arg0 + arg2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        class270.method1651((byte) -8);
        if (arg0 != 255) {
            this.method24(113);
        }
        ++field5623;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg1 == 80) {
            ++field5624;
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (arg0 != 4) {
                                if (~arg0 != -6) {
                                    if (~arg0 == -7) {
                                        this.field5617 = arg2.method993((byte) -86);
                                    }
                                } else {
                                    this.field5616 = arg2.method993((byte) -47);
                                }
                            } else {
                                this.field5611 = arg2.method993((byte) -48);
                            }
                        } else {
                            this.field5615 = arg2.method993((byte) -39);
                        }
                    } else {
                        this.field5612 = arg2.method993((byte) -97);
                    }
                } else {
                    this.field5610 = arg2.method993((byte) -44);
                }
            } else {
                this.field5614 = arg2.method993((byte) -57);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIZ)Z")
    private final boolean method2282(int arg0, int arg1, boolean arg2) {
        ++field5609;
        int var4 = (arg1 - -arg0) * this.field5611 >> 12;
        if (arg2) {
            this.field5615 = 94;
        }
        int var5 = class150.field1944[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field5611;
        int var7 = (var6 << 12) / this.field5617;
        int var8 = this.field5616 * var7 >> 12;
        return arg1 - arg0 < var8 && -var8 < arg1 - arg0;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)Z")
    public static final boolean method2283(int arg0, int arg1) {
        ++field5620;
        if (arg0 != 4829) {
            return true;
        } else {
            return ~arg1 == -1 || ~arg1 == -2 || arg1 == 2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lis;Lhg;)V")
    public static final void method2284(class330 arg0, class468 arg1) {
        if (arg1.field6768) {
            short var2 = arg1.field6759;
            short var3 = arg1.field6776;
            byte var4 = arg1.field6765;
            byte var5 = arg1.field6773;
            int var6 = (var2 << class41.field628) + class170.field2281;
            int var7 = (var3 << class41.field628) + class170.field2281;
            class468[][] var8 = class358.field5312[var4];
            float var9;
            if (class311.field4527 == class178.field2562) {
                class473.field6834.method826(class459.field6685[0].method855(var6, var7), class339.method2060(var2, var3), class1.method1(var2, var3), class506.method3041(var2, var3));
                var9 = 251.5F;
            } else {
                var9 = 201.5F - (float) (var5 + 1) * 50.0F;
            }
            class473.field6834.method821(3000.0F, var9 * 1.5F);
            if (arg1.field6757) {
                if (class358.field5311) {
                    if (var4 > 0) {
                        class468 var10 = class358.field5312[var4 - 1][var2][var3];
                        if (var10 != null && var10.field6768) {
                            return;
                        }
                    }
                    if (var2 <= class463.field6724 && var2 > class480.field6935) {
                        class468 var11 = var8[var2 - 1][var3];
                        if (var11 != null && var11.field6768 && (var11.field6757 || (arg1.field6767 & 1) == 0)) {
                            return;
                        }
                    }
                    if (var2 >= class463.field6724 && var2 < class30.field499 - 1) {
                        class468 var12 = var8[var2 + 1][var3];
                        if (var12 != null && var12.field6768 && (var12.field6757 || (arg1.field6767 & 4) == 0)) {
                            return;
                        }
                    }
                    if (var3 <= class284.field4053 && var3 > class120.field1556) {
                        class468 var13 = var8[var2][var3 - 1];
                        if (var13 != null && var13.field6768 && (var13.field6757 || (arg1.field6767 & 8) == 0)) {
                            return;
                        }
                    }
                    if (var3 >= class284.field4053 && var3 < class148.field1924 - 1) {
                        class468 var14 = var8[var2][var3 + 1];
                        if (var14 != null && var14.field6768 && (var14.field6757 || (arg1.field6767 & 2) == 0)) {
                            return;
                        }
                    }
                } else {
                    class358.field5311 = true;
                }
                arg1.field6757 = false;
                if (arg1.field6779 != null) {
                    class468 var15 = arg1.field6779;
                    class473.field6834.method821(3000.0F, (201.5F - (float) (var15.field6773 + 1) * 50.0F) * 1.5F);
                    if (!class76.method505(var15.field6773, var2, var3)) {
                        class311.field4527[var15.field6773].method851(var2, var3);
                    }
                    class403 var16 = var15.field6778;
                    if (var16 != null) {
                        if (class49.field753) {
                            if ((var16.field5933 & arg1.field6774) != 0) {
                                class398.method2380(arg0, var16.field5933, var5, var2, var3);
                            } else {
                                class13.method100(arg0, var4, var2, var3);
                            }
                            class473.field6834.method766(arg0.field4795, arg0.field4791);
                        }
                        var16.method364(class473.field6834, false);
                    }
                    for (class323 var17 = var15.field6769; var17 != null; var17 = var17.field4727) {
                        class210 var18 = var17.field4726;
                        if (var18 != null) {
                            if (class49.field753) {
                                class13.method100(arg0, var4, var2, var3);
                                class473.field6834.method766(arg0.field4795, arg0.field4791);
                            }
                            var18.method364(class473.field6834, false);
                        }
                    }
                    class473.field6834.method821(3000.0F, var9 * 1.5F);
                }
                boolean var19 = !class76.method505(var5, var2, var3);
                if (var19) {
                    class311.field4527[var5].method851(var2, var3);
                    class79 var20 = arg1.field6761;
                    if (var20 != null && var20.field1105) {
                        if (var20.field1110) {
                            class473.field6834.method821(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                        }
                        if (class49.field753) {
                            class13.method100(arg0, var4, var2, var3);
                            class473.field6834.method766(arg0.field4795, arg0.field4791);
                        }
                        class408 var21 = var20.method364(class473.field6834, false);
                        if (var21 != null) {
                            var21.field5985 = var20;
                            var21.field5981 = var4;
                            var21.field5979 = var2;
                            var21.field5980 = var3;
                            class253.field3653.method250((byte) -72, var21);
                        }
                        if (var20.field1110) {
                            class473.field6834.method821(3000.0F, var9 * 1.5F);
                        }
                    }
                }
                int var22 = 0;
                int var23 = 0;
                class403 var24 = arg1.field6778;
                class455 var25 = arg1.field6772;
                if (var24 != null || var25 != null) {
                    if (class463.field6724 == var2) {
                        ++var22;
                    } else if (class463.field6724 < var2) {
                        var22 += 2;
                    }
                    if (class284.field4053 == var3) {
                        var22 += 3;
                    } else if (class284.field4053 > var3) {
                        var22 += 6;
                    }
                    var23 = class384.field5712[var22];
                    arg1.field6774 = class19.field276[var22];
                }
                if (var24 != null) {
                    if ((var24.field5933 & class455.field6638[var22]) != 0) {
                        if (var24.field5933 == 16) {
                            arg1.field6775 = 3;
                            arg1.field6758 = class70.field1030[var22];
                            arg1.field6771 = (byte) (3 - arg1.field6758);
                        } else if (var24.field5933 == 32) {
                            arg1.field6775 = 6;
                            arg1.field6758 = class338.field4929[var22];
                            arg1.field6771 = (byte) (6 - arg1.field6758);
                        } else if (var24.field5933 == 64) {
                            arg1.field6775 = 12;
                            arg1.field6758 = class1.field7[var22];
                            arg1.field6771 = (byte) (12 - arg1.field6758);
                        } else {
                            arg1.field6775 = 9;
                            arg1.field6758 = class232.field3233[var22];
                            arg1.field6771 = (byte) (9 - arg1.field6758);
                        }
                    } else {
                        arg1.field6775 = 0;
                    }
                    if ((var24.field5933 & var23) != 0 && !class340.method2062(var5, var2, var3, var24.field5933)) {
                        if (class49.field753) {
                            class13.method100(arg0, var4, var2, var3);
                            class473.field6834.method766(arg0.field4795, arg0.field4791);
                        }
                        class408 var26 = var24.method364(class473.field6834, false);
                        if (var26 != null) {
                            var26.field5985 = var24;
                            var26.field5981 = var4;
                            var26.field5979 = var2;
                            var26.field5980 = var3;
                            class253.field3653.method250((byte) -72, var26);
                        }
                    }
                    class403 var27 = arg1.field6766;
                    if (var27 != null && (var27.field5933 & var23) != 0 && !class340.method2062(var5, var2, var3, var27.field5933)) {
                        if (class49.field753) {
                            class13.method100(arg0, var4, var2, var3);
                            class473.field6834.method766(arg0.field4795, arg0.field4791);
                        }
                        class408 var28 = var27.method364(class473.field6834, false);
                        if (var28 != null) {
                            var28.field5985 = var27;
                            var28.field5981 = var4;
                            var28.field5979 = var2;
                            var28.field5980 = var3;
                            class253.field3653.method250((byte) -72, var28);
                        }
                    }
                }
                if (var25 != null && !class138.method869(var5, var2, var3, var25.method370((byte) -53))) {
                    class455 var29 = arg1.field6777;
                    class473.field6834.method821(3000.0F, (var9 - 0.5F) * 1.5F);
                    if ((var25.field6626 & var23) != 0) {
                        if (class49.field753) {
                            class13.method100(arg0, var4, var2, var3);
                            class473.field6834.method766(arg0.field4795, arg0.field4791);
                        }
                        class408 var30 = var25.method364(class473.field6834, false);
                        if (var30 != null) {
                            var30.field5985 = var25;
                            var30.field5981 = var4;
                            var30.field5979 = var2;
                            var30.field5980 = var3;
                            class253.field3653.method250((byte) -72, var30);
                        }
                    } else if (var25.field6626 == 256) {
                        int var31 = var25.field6633 - class67.field1003;
                        int var32 = var25.field6625 - class95.field1278;
                        int var33 = var25.field6629;
                        int var34;
                        if (var33 != 1 && var33 != 2) {
                            var34 = var31;
                        } else {
                            var34 = -var31;
                        }
                        int var35;
                        if (var33 != 2 && var33 != 3) {
                            var35 = var32;
                        } else {
                            var35 = -var32;
                        }
                        if (class49.field753) {
                            class13.method100(arg0, var4, var2, var3);
                            class473.field6834.method766(arg0.field4795, arg0.field4791);
                        }
                        if (var35 < var34) {
                            class408 var36 = var25.method364(class473.field6834, false);
                            if (var36 != null) {
                                var36.field5985 = var25;
                                var36.field5981 = var4;
                                var36.field5979 = var2;
                                var36.field5980 = var3;
                                class253.field3653.method250((byte) -72, var36);
                            }
                        } else if (var29 != null) {
                            class408 var37 = var29.method364(class473.field6834, false);
                            if (var37 != null) {
                                var37.field5985 = var29;
                                var37.field5981 = var4;
                                var37.field5979 = var2;
                                var37.field5980 = var3;
                                class253.field3653.method250((byte) -72, var37);
                            }
                        }
                    }
                    class473.field6834.method821(3000.0F, var9 * 1.5F);
                }
                if (var19) {
                    class79 var38 = arg1.field6761;
                    if (var38 != null && !var38.field1105) {
                        if (var38.field1110) {
                            class473.field6834.method821(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                        }
                        if (class49.field753) {
                            class13.method100(arg0, var4, var2, var3);
                            class473.field6834.method766(arg0.field4795, arg0.field4791);
                        }
                        class408 var39 = var38.method364(class473.field6834, false);
                        if (var39 != null) {
                            var39.field5985 = var38;
                            var39.field5981 = var4;
                            var39.field5979 = var2;
                            var39.field5980 = var3;
                            class253.field3653.method250((byte) -72, var39);
                        }
                        if (var38.field1110) {
                            class473.field6834.method821(3000.0F, var9 * 1.5F);
                        }
                    }
                    class296 var40 = arg1.field6770;
                    if (var40 != null && !var40.field4322) {
                        if (class49.field753) {
                            class13.method100(arg0, var4, var2, var3);
                            class473.field6834.method766(arg0.field4795, arg0.field4791);
                        }
                        class408 var41 = var40.method364(class473.field6834, false);
                        if (var41 != null) {
                            var41.field5985 = var40;
                            var41.field5981 = var4;
                            var41.field5979 = var2;
                            var41.field5980 = var3;
                            class253.field3653.method250((byte) -72, var41);
                        }
                    }
                }
                byte var42 = arg1.field6767;
                if (var42 != 0) {
                    if (var2 < class463.field6724 && (var42 & 4) != 0) {
                        class468 var43 = var8[var2 + 1][var3];
                        if (var43 != null && var43.field6768) {
                            class248.field3564.method155((byte) 108, var43);
                        }
                    }
                    if (var3 < class284.field4053 && (var42 & 2) != 0) {
                        class468 var44 = var8[var2][var3 + 1];
                        if (var44 != null && var44.field6768) {
                            class248.field3564.method155((byte) 108, var44);
                        }
                    }
                    if (var2 > class463.field6724 && (var42 & 1) != 0) {
                        class468 var45 = var8[var2 - 1][var3];
                        if (var45 != null && var45.field6768) {
                            class248.field3564.method155((byte) 108, var45);
                        }
                    }
                    if (var3 > class284.field4053 && (var42 & 8) != 0) {
                        class468 var46 = var8[var2][var3 - 1];
                        if (var46 != null && var46.field6768) {
                            class248.field3564.method155((byte) 108, var46);
                        }
                    }
                }
            }
            if (arg1.field6775 != 0) {
                boolean var47 = true;
                for (class323 var48 = arg1.field6769; var48 != null; var48 = var48.field4727) {
                    if (class130.field1655 != var48.field4726.field2971 && (var48.field4730 & arg1.field6775) == arg1.field6758) {
                        var47 = false;
                        break;
                    }
                }
                if (var47) {
                    class403 var49 = arg1.field6778;
                    if (!class340.method2062(var5, var2, var3, var49.field5933)) {
                        if (class49.field753) {
                            label682: {
                                if (var49.field5933 >= 16) {
                                    int var50 = var2 - class463.field6724;
                                    int var51 = var3 - class284.field4053;
                                    if (var49.field5933 == 16) {
                                        int var52 = var50 - class170.field2281;
                                        int var53 = class170.field2281 + var51;
                                        if (var53 < var52 && var2 > 0 && var3 <= class98.field1339) {
                                            class13.method100(arg0, var4, var2 - 1, var3 + 1);
                                            break label682;
                                        }
                                    } else if (var49.field5933 == 32) {
                                        int var54 = class170.field2281 + var50;
                                        int var55 = class170.field2281 + var51;
                                        if (var55 < -var54 && var2 < class282.field4031 && var3 < class98.field1339) {
                                            class13.method100(arg0, var4, var2 + 1, var3 + 1);
                                            break label682;
                                        }
                                    } else if (var49.field5933 == 64) {
                                        int var56 = class170.field2281 + var50;
                                        int var57 = var51 - class170.field2281;
                                        if (var57 > var56 && var2 < class282.field4031 && var3 > 0) {
                                            class13.method100(arg0, var4, var2 + 1, var3 - 1);
                                            break label682;
                                        }
                                    } else if (var49.field5933 == 128) {
                                        int var58 = var50 - class170.field2281;
                                        int var59 = var51 - class170.field2281;
                                        if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                            class13.method100(arg0, var4, var2 - 1, var3 - 1);
                                            break label682;
                                        }
                                    }
                                }
                                class13.method100(arg0, var4, var2, var3);
                            }
                            class473.field6834.method766(arg0.field4795, arg0.field4791);
                        }
                        class408 var60 = var49.method364(class473.field6834, false);
                        if (var60 != null) {
                            var60.field5985 = var49;
                            var60.field5981 = var4;
                            var60.field5979 = var2;
                            var60.field5980 = var3;
                            class253.field3653.method250((byte) -72, var60);
                        }
                    }
                    arg1.field6775 = 0;
                }
            }
            if (arg1.field6756) {
                try {
                    arg1.field6756 = false;
                    int var61 = 0;
                    label625: for (class323 var62 = arg1.field6769; var62 != null; var62 = var62.field4727) {
                        class210 var63 = var62.field4726;
                        if (class130.field1655 != var63.field2971) {
                            for (int var64 = var63.field2972; var64 <= var63.field2962; ++var64) {
                                for (int var65 = var63.field2975; var65 <= var63.field2957; ++var65) {
                                    class468 var66 = var8[var64][var65];
                                    if (var66.field6757) {
                                        arg1.field6756 = true;
                                        continue label625;
                                    }
                                    if (var66.field6775 != 0) {
                                        int var67 = 0;
                                        if (var64 > var63.field2972) {
                                            ++var67;
                                        }
                                        if (var64 < var63.field2962) {
                                            var67 += 4;
                                        }
                                        if (var65 > var63.field2975) {
                                            var67 += 8;
                                        }
                                        if (var65 < var63.field2957) {
                                            var67 += 2;
                                        }
                                        if ((var67 & var66.field6775) == arg1.field6771) {
                                            arg1.field6756 = true;
                                            continue label625;
                                        }
                                    }
                                }
                            }
                            int var68 = class463.field6724 - var63.field2972;
                            int var69 = var63.field2962 - class463.field6724;
                            if (var69 > var68) {
                                var68 = var69;
                            }
                            int var70 = class284.field4053 - var63.field2975;
                            int var71 = var63.field2957 - class284.field4053;
                            if (var71 > var70) {
                                var70 = var71;
                            }
                            arg0.field4793[var61] = var63;
                            arg0.field4789[var61++] = var68 + var70;
                        }
                    }
                    while (var61 > 0) {
                        int var72 = -50;
                        int var73 = -1;
                        for (int var74 = 0; var74 < var61; ++var74) {
                            class210 var75 = arg0.field4793[var74];
                            if (class130.field1655 != var75.field2971) {
                                int var76 = arg0.field4789[var74];
                                if (var76 > var72) {
                                    var72 = var76;
                                    var73 = var74;
                                } else if (var72 == var76) {
                                    int var77 = var75.field2959 - class67.field1003;
                                    int var78 = var75.field2966 - class95.field1278;
                                    int var79 = arg0.field4793[var73].field2959 - class67.field1003;
                                    int var80 = arg0.field4793[var73].field2966 - class95.field1278;
                                    if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                        var73 = var74;
                                    }
                                }
                            }
                        }
                        if (var73 == -1) {
                            break;
                        }
                        class210 var81 = arg0.field4793[var73];
                        var81.field2971 = class130.field1655;
                        if (!class263.method1624(var5, var81.field2972, var81.field2962, var81.field2975, var81.field2957, var81.method724((byte) -80))) {
                            if (class49.field753) {
                                if (var81.field2974 != 0) {
                                    class13.method100(arg0, var4, var2, var3);
                                    int var82 = var2 - class463.field6724;
                                    int var83 = var3 - class284.field4053;
                                    if (var81.field2974 == 2) {
                                        if (var83 > -var82) {
                                            class311.method1865(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                        } else {
                                            class311.method1865(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                        }
                                    } else if (var83 > var82) {
                                        class311.method1865(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                    } else {
                                        class311.method1865(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                    }
                                } else {
                                    class424.method2531(arg0, var4, var81.field2972, var81.field2975, var81.field2962, var81.field2957);
                                }
                                class473.field6834.method766(arg0.field4795, arg0.field4791);
                            }
                            class408 var84 = var81.method364(class473.field6834, false);
                            if (var84 != null) {
                                var84.field5985 = var81;
                                var84.field5981 = var4;
                                var84.field5979 = var81.field2972;
                                var84.field5980 = var81.field2975;
                                class253.field3653.method250((byte) -72, var84);
                            }
                        }
                        for (int var85 = var81.field2972; var85 <= var81.field2962; ++var85) {
                            for (int var86 = var81.field2975; var86 <= var81.field2957; ++var86) {
                                class468 var87 = var8[var85][var86];
                                if (var87.field6775 != 0) {
                                    class248.field3564.method155((byte) 108, var87);
                                } else if ((var2 != var85 || var3 != var86) && var87.field6768) {
                                    class248.field3564.method155((byte) 108, var87);
                                }
                            }
                        }
                    }
                    if (arg1.field6756) {
                        return;
                    }
                } catch (Exception var122) {
                    arg1.field6756 = false;
                }
            }
            if (arg1.field6764 != null && (byte) (class192.field2728 & 255) == arg1.field6760) {
                class191 var88 = arg1.field6764;
                int var89 = class311.field4527[var4].method848(var2, var3);
                int var90;
                if (var4 < class399.field5881 - 1) {
                    var90 = class311.field4527[var4].method848(var2, var3) - class311.field4527[var4 + 1].method848(var2, var3);
                } else {
                    var90 = 8 << class41.field628;
                }
                class145.field1887.method273(var6, var89, var7, arg0.field4788);
                int var91 = arg0.field4788[2];
                class145.field1887.method273(var6, var89 - var90, var7, arg0.field4788);
                int var92 = arg0.field4788[2];
                int var93 = var91;
                int var94 = var92;
                if (var91 > var92) {
                    var93 = var92;
                    var94 = var91;
                }
                int var95 = var93 - class218.field3066;
                int var96 = class218.field3066 + var94;
                var88.field2711 = var95;
                var88.field2710 = var96;
                var88.field2709 = true;
                class473.field6834.method800(var88);
            }
            if (arg1.field6768) {
                if (arg1.field6775 != 0) {
                    return;
                }
                if (var2 <= class463.field6724 && var2 > class480.field6935) {
                    class468 var97 = var8[var2 - 1][var3];
                    if (var97 != null && var97.field6768) {
                        return;
                    }
                }
                if (var2 >= class463.field6724 && var2 < class30.field499 - 1) {
                    class468 var98 = var8[var2 + 1][var3];
                    if (var98 != null && var98.field6768) {
                        return;
                    }
                }
                if (var3 <= class284.field4053 && var3 > class120.field1556) {
                    class468 var99 = var8[var2][var3 - 1];
                    if (var99 != null && var99.field6768) {
                        return;
                    }
                }
                if (var3 >= class284.field4053 && var3 < class148.field1924 - 1) {
                    class468 var100 = var8[var2][var3 + 1];
                    if (var100 != null && var100.field6768) {
                        return;
                    }
                }
                arg1.field6768 = false;
                --class444.field6481;
                class296 var101 = arg1.field6770;
                if (var101 != null && var101.field4322) {
                    if (class49.field753) {
                        class13.method100(arg0, var4, var2, var3);
                        class473.field6834.method766(arg0.field4795, arg0.field4791);
                    }
                    class408 var102 = var101.method364(class473.field6834, false);
                    if (var102 != null) {
                        var102.field5985 = var101;
                        var102.field5981 = var4;
                        var102.field5979 = var2;
                        var102.field5980 = var3;
                        class253.field3653.method250((byte) -72, var102);
                    }
                }
                if (arg1.field6774 != 0) {
                    class455 var103 = arg1.field6772;
                    if (var103 != null && !class138.method869(var5, var2, var3, var103.method370((byte) -38))) {
                        if ((var103.field6626 & arg1.field6774) != 0) {
                            if (class49.field753) {
                                class13.method100(arg0, var4, var2, var3);
                                class473.field6834.method766(arg0.field4795, arg0.field4791);
                            }
                            class408 var104 = var103.method364(class473.field6834, false);
                            if (var104 != null) {
                                var104.field5985 = var103;
                                var104.field5981 = var4;
                                var104.field5979 = var2;
                                var104.field5980 = var3;
                                class253.field3653.method250((byte) -72, var104);
                            }
                        } else if (var103.field6626 == 256) {
                            int var105 = var103.field6633 - class67.field1003;
                            int var106 = var103.field6625 - class95.field1278;
                            int var107 = var103.field6629;
                            int var108;
                            if (var107 != 1 && var107 != 2) {
                                var108 = var105;
                            } else {
                                var108 = -var105;
                            }
                            int var109;
                            if (var107 != 2 && var107 != 3) {
                                var109 = var106;
                            } else {
                                var109 = -var106;
                            }
                            if (class49.field753) {
                                class13.method100(arg0, var4, var2, var3);
                                class473.field6834.method766(arg0.field4795, arg0.field4791);
                            }
                            class455 var110 = arg1.field6777;
                            if (var109 > var108) {
                                class408 var111 = var103.method364(class473.field6834, false);
                                if (var111 != null) {
                                    var111.field5985 = var103;
                                    var111.field5981 = var4;
                                    var111.field5979 = var2;
                                    var111.field5980 = var3;
                                    class253.field3653.method250((byte) -72, var111);
                                }
                            } else if (var110 != null) {
                                class408 var112 = var110.method364(class473.field6834, false);
                                if (var112 != null) {
                                    var112.field5985 = var110;
                                    var112.field5981 = var4;
                                    var112.field5979 = var2;
                                    var112.field5980 = var3;
                                    class253.field3653.method250((byte) -72, var112);
                                }
                            }
                        }
                    }
                    class403 var113 = arg1.field6778;
                    class403 var114 = arg1.field6766;
                    if (var114 != null && (var114.field5933 & arg1.field6774) != 0 && !class340.method2062(var5, var2, var3, var114.field5933)) {
                        if (class49.field753) {
                            class398.method2380(arg0, var114.field5933, var4, var2, var3);
                            class473.field6834.method766(arg0.field4795, arg0.field4791);
                        }
                        class408 var115 = var114.method364(class473.field6834, false);
                        if (var115 != null) {
                            var115.field5985 = var114;
                            var115.field5981 = var4;
                            var115.field5979 = var2;
                            var115.field5980 = var3;
                            class253.field3653.method250((byte) -72, var115);
                        }
                    }
                    if (var113 != null && (var113.field5933 & arg1.field6774) != 0 && !class340.method2062(var5, var2, var3, var113.field5933)) {
                        if (class49.field753) {
                            class398.method2380(arg0, var113.field5933, var4, var2, var3);
                            class473.field6834.method766(arg0.field4795, arg0.field4791);
                        }
                        class408 var116 = var113.method364(class473.field6834, false);
                        if (var116 != null) {
                            var116.field5985 = var113;
                            var116.field5981 = var4;
                            var116.field5979 = var2;
                            var116.field5980 = var3;
                            class253.field3653.method250((byte) -72, var116);
                        }
                    }
                }
                if (var4 < class399.field5881 - 1) {
                    class468 var117 = class358.field5312[var4 + 1][var2][var3];
                    if (var117 != null && var117.field6768) {
                        class248.field3564.method149((byte) 103, var117);
                    }
                }
                if (var2 < class463.field6724) {
                    class468 var118 = var8[var2 + 1][var3];
                    if (var118 != null && var118.field6768) {
                        class248.field3564.method155((byte) 108, var118);
                    }
                }
                if (var3 < class284.field4053) {
                    class468 var119 = var8[var2][var3 + 1];
                    if (var119 != null && var119.field6768) {
                        class248.field3564.method155((byte) 108, var119);
                    }
                }
                if (var2 > class463.field6724) {
                    class468 var120 = var8[var2 - 1][var3];
                    if (var120 != null && var120.field6768) {
                        class248.field3564.method155((byte) 108, var120);
                    }
                }
                if (var3 > class284.field4053) {
                    class468 var121 = var8[var2][var3 - 1];
                    if (var121 != null && var121.field6768) {
                        class248.field3564.method155((byte) 108, var121);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field5618;
        if (arg0 != -780833076) {
            this.field5614 = -69;
        }
        int[] var3 = super.field5854.method465(arg1, 96);
        if (super.field5854.field991) {
            int var4 = class447.field6523[arg1] - 2048;
            for (int var5 = 0; ~class164.field2152 < ~var5; ++var5) {
                int var6 = class228.field3210[var5] + -2048;
                int var7 = this.field5614 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                int var10 = var4 - -this.field5610;
                int var11 = var10 >= -2048 ? var10 : var10 - -4096;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = this.field5612 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = this.field5615 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = !this.method2281(var12, false, var9) && !this.method2282(var15, var18, false) ? 0 : 4096;
            }
        }
        return var3;
    }

    static {
        new class194("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field5625 = 0;
    }
}
