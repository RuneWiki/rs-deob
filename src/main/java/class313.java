import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class class313 extends class692 {

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "Lcf;")
    public static class561 field4914 = new class561();

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "I")
    public static int field4922 = -1;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    public static int field4923 = 0;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "F")
    public static float field4924 = 1.0F;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIILr;ZILpn;)V", line = 5)
    public final void method415(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, int arg5, class692 arg6) {
        if (arg2 != 1) {
            this.method415(-13, 122, -93, (class167) null, false, 1, (class692) null);
        }
        ++field4918;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "(I)Z", line = 19)
    public final boolean method1472(int arg0) {
        ++field4919;
        if (arg0 >= -97) {
            return true;
        } else {
            class531 var2 = class203.method1574(super.field9695, super.field9696 >> class439.field6699, super.field9705 >> class439.field6699);
            return var2 != null && var2.field7739.field6877 ? class607.method3536(super.field9705 >> class439.field6699, var2.field7739.method393(0) - -this.method393(0), super.field9696 >> class439.field6699, 0, super.field9695) : class640.method3715(73, super.field9696 >> class439.field6699, super.field9705 >> class439.field6699, super.field9695);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V", line = 36)
    public static void method2138(byte arg0) {
        field4914 = null;
        if (arg0 != -117) {
            field4924 = 0.541628F;
        }
    }

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "(B)V", line = 46)
    public final void method404(byte arg0) {
        ++field4920;
        if (arg0 > -40) {
            field4922 = 123;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIILnc;IIBIIII)Z", line = 58)
    public static final boolean method2139(int arg0, int arg1, int arg2, class23 arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field4921;
        int var11 = arg7;
        int var12 = arg5;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg7;
        int var16 = arg5 - var14;
        if (arg6 <= 13) {
            field4923 = -23;
        }
        class412.field6325[var13][var14] = 99;
        class314.field4937[var13][var14] = 0;
        byte var17 = 0;
        class343.field5540[var17] = arg7;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class100.field1650[var10001] = arg5;
        int[][] var19 = arg3.field351;
        while (~var26 != ~var18) {
            var12 = class100.field1650[var18];
            var11 = class343.field5540[var18];
            int var20 = -var16 + var12;
            int var21 = -var15 + var11;
            var18 = 4095 & var18 - -1;
            int var22 = -arg3.field361 + var11;
            int var23 = -arg3.field367 + var12;
            if (arg0 != -4) {
                if (~arg0 != 2) {
                    if (~arg0 != 1) {
                        if (arg0 != -1) {
                            if (arg0 != 0 && arg0 != 1 && arg0 != 2 && ~arg0 != -4 && ~arg0 != -10) {
                                if (arg3.method391(2, arg4, arg9, arg10, 12440, var12, arg0, var11)) {
                                    class614.field8730 = var12;
                                    class408.field6295 = var11;
                                    return true;
                                }
                            } else if (arg3.method385(arg4, var12, arg9, arg0, 62, arg10, 2, var11)) {
                                class408.field6295 = var11;
                                class614.field8730 = var12;
                                return true;
                            }
                        } else if (arg3.method384(arg1, var11, var12, arg8, 2, (byte) -110, arg2, arg10, arg4)) {
                            class614.field8730 = var12;
                            class408.field6295 = var11;
                            return true;
                        }
                    } else if (arg3.method380(arg2, var11, var12, arg10, arg4, -1, arg8, 2, 2, arg1)) {
                        class408.field6295 = var11;
                        class614.field8730 = var12;
                        return true;
                    }
                } else if (class580.method3403(var12, -114, arg2, 2, arg4, arg1, var11, 2, arg10)) {
                    class614.field8730 = var12;
                    class408.field6295 = var11;
                    return true;
                }
            } else if (~arg10 == ~var11 && arg4 == var12) {
                class408.field6295 = var11;
                class614.field8730 = var12;
                return true;
            }
            int var25 = class314.field4937[var21][var20] + 1;
            if (var21 > 0 && class412.field6325[var21 + -1][var20] == 0 && ~(1134821376 & var19[var22 + -1][var23]) == -1 && ~(var19[var22 + -1][var23 + 1] & 1310982144) == -1) {
                class343.field5540[var26] = var11 + -1;
                class100.field1650[var26] = var12;
                var26 = var26 + 1 & 4095;
                class412.field6325[var21 + -1][var20] = 2;
                class314.field4937[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class412.field6325[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 1625554944) == 0 && (var19[var22 - -2][var23 - -1] & 2015625216) == 0) {
                class343.field5540[var26] = var11 - -1;
                class100.field1650[var26] = var12;
                var26 = var26 - -1 & 4095;
                class412.field6325[var21 + 1][var20] = 8;
                class314.field4937[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class412.field6325[var21][var20 + -1] == 0 && (1134821376 & var19[var22][var23 + -1]) == 0 && ~(1625554944 & var19[var22 + 1][var23 - 1]) == -1) {
                class343.field5540[var26] = var11;
                class100.field1650[var26] = var12 + -1;
                class412.field6325[var21][var20 + -1] = 1;
                var26 = var26 + 1 & 4095;
                class314.field4937[var21][var20 + -1] = var25;
            }
            if (var20 < 126 && class412.field6325[var21][var20 + 1] == 0 && ~(1310982144 & var19[var22][var23 + 2]) == -1 && ~(var19[var22 + 1][var23 + 2] & 2015625216) == -1) {
                class343.field5540[var26] = var11;
                class100.field1650[var26] = var12 + 1;
                class412.field6325[var21][var20 + 1] = 4;
                var26 = 4095 & var26 + 1;
                class314.field4937[var21][var20 - -1] = var25;
            }
            if (~var21 < -1 && var20 > 0 && ~class412.field6325[var21 + -1][var20 + -1] == -1 && (1336147968 & var19[var22 + -1][var23]) == 0 && (1134821376 & var19[var22 + -1][var23 + -1]) == 0 && (var19[var22][var23 - 1] & 1675886592) == 0) {
                class343.field5540[var26] = var11 + -1;
                class100.field1650[var26] = var12 + -1;
                var26 = var26 + 1 & 4095;
                class412.field6325[var21 + -1][var20 + -1] = 3;
                class314.field4937[var21 + -1][var20 - 1] = var25;
            }
            if (~var21 > -127 && ~var20 < -1 && class412.field6325[var21 + 1][var20 + -1] == 0 && ~(1675886592 & var19[var22 - -1][var23 + -1]) == -1 && ~(1625554944 & var19[var22 + 2][var23 - 1]) == -1 && ~(var19[var22 + 2][var23] & 2028208128) == -1) {
                class343.field5540[var26] = var11 + 1;
                class100.field1650[var26] = var12 + -1;
                var26 = var26 + 1 & 4095;
                class412.field6325[var21 - -1][var20 - 1] = 9;
                class314.field4937[var21 - -1][var20 + -1] = var25;
            }
            if (~var21 < -1 && var20 < 126 && class412.field6325[var21 + -1][var20 + 1] == 0 && ~(1336147968 & var19[var22 + -1][var23 + 1]) == -1 && ~(var19[var22 + -1][var23 + 2] & 1310982144) == -1 && ~(2116288512 & var19[var22][var23 + 2]) == -1) {
                class343.field5540[var26] = var11 + -1;
                class100.field1650[var26] = var12 + 1;
                class412.field6325[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 4095;
                class314.field4937[var21 + -1][var20 + 1] = var25;
            }
            if (var21 < 126 && ~var20 > -127 && class412.field6325[var21 + 1][var20 - -1] == 0 && ~(var19[var22 + 1][var23 - -2] & 2116288512) == -1 && (var19[var22 + 2][var23 + 2] & 2015625216) == 0 && (var19[var22 + 2][var23 + 1] & 2028208128) == 0) {
                class343.field5540[var26] = var11 + 1;
                class100.field1650[var26] = var12 + 1;
                class412.field6325[var21 + 1][var20 + 1] = 12;
                var26 = 4095 & var26 + 1;
                class314.field4937[var21 + 1][var20 + 1] = var25;
            }
        }
        class614.field8730 = var12;
        class408.field6295 = var11;
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)Z", line = 409)
    public final boolean method1474(int arg0) {
        ++field4917;
        if (arg0 != -1) {
            field4914 = null;
        }
        return class37.field509[(super.field9696 >> class439.field6699) + -class325.field5056 - -class443.field6744][(super.field9705 >> class439.field6699) + -class542.field7902 + class443.field6744];
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(IIIII)V", line = 419)
    public class313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field9703 = (byte) arg4;
        super.field9701 = arg1;
        super.field9696 = arg0;
        super.field9695 = (byte) arg3;
        super.field9705 = arg2;
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(B)Z", line = 436)
    public final boolean method398(byte arg0) {
        if (arg0 > -92) {
            this.method1473((byte) -80, (class674[]) null);
        }
        ++field4915;
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B[Lcp;)I", line = 451)
    public final int method1473(byte arg0, class674[] arg1) {
        ++field4916;
        return arg0 > -43 ? -32 : this.method3918(arg1, (byte) 101, super.field9705 >> class439.field6699, super.field9696 >> class439.field6699);
    }
}
